package firstpackage;

public class FormatProps {
	public final Integer fieldLenght;
	public final String importFormat;
	public final String exportFormat;
	public final String replaceAllRegEx;

	public FormatProps(Integer fieldLenght, String importFormat, String exportFormat) {
		this.fieldLenght = fieldLenght;
		this.importFormat = importFormat;
		this.exportFormat = exportFormat;
		this.replaceAllRegEx = null;
	}

	public FormatProps(Integer fieldLenght, String importFormat, String exportFormat, String replaceAllRegEx) {
		this.fieldLenght = fieldLenght;
		this.importFormat = importFormat;
		this.exportFormat = exportFormat;
		this.replaceAllRegEx = replaceAllRegEx;
	}

	public boolean isLeftPaddingRequired() {
		if (exportFormat.indexOf("[L]") != -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDateField() {
		if (exportFormat.indexOf("[D]") != -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDecimalField() {
		if (exportFormat.indexOf("[F:") != -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNumberField() {
		if (exportFormat.indexOf("[N]") != -1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * When field value is blank, output will be blank in export file. Instead of
	 * defaulting to 0 if integer, 0.00 if decimal.
	 * 
	 * @return
	 */
	public boolean isExportBlankIfEmpty() {
		if (exportFormat.indexOf("[BIE]") != -1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns the padding character to use. Eg: if exportFormat is "[PAD_CHAR:0]",
	 * then the padding character returned will be '0'
	 * 
	 * @return
	 */
	public char getPaddingCharacter() {
		char padChar = ' ';
		if (exportFormat.indexOf("[PAD_CHAR") == -1)
			return padChar;

		String prop = sliceProperty("[PAD_CHAR", this.exportFormat);
		String propValue = slicePropertyValue(prop);
		if (propValue == null || propValue.trim().length() == 0)
			return padChar;
		padChar = propValue.charAt(0);
		return padChar;
	}

	/**
	 * Returns a property string from the given raw string. Eg: if raw =
	 * "[BIE][PAD_CHAR:0][F:5.2]" and propName="[PAD_CHAR" then returns
	 * "[PAD_CHAR:0]"
	 * 
	 * @param raw
	 * @return
	 */
	private static String sliceProperty(String propName, String raw) {
		if (raw == null || raw.trim().length() == 0)
			return "";
		if (propName == null || propName.trim().length() == 0)
			return "";
		if (raw.length() < propName.length())
			return "";

		raw = raw.trim();
		propName = propName.trim();

		int beginIndex = raw.indexOf(propName);
		if (beginIndex == -1)
			return "";

		int endIndex = raw.indexOf("]", beginIndex + propName.length());
		if (endIndex == -1) {
			// Invalid format !!
			return "";
		}
		return raw.substring(beginIndex, endIndex + 1);
	}

	/**
	 * Returns property value extracted from property. Eg: if
	 * property="[PAD_CHAR:0]" returns "0"
	 * 
	 */
	private static String slicePropertyValue(String property) {
		if (property == null || property.trim().length() == 0)
			return "";
		String[] el = property.trim().replaceAll("\\[", "").replaceAll("\\]", "").split(":");
		if (el.length == 2) {
			return el[1];
		}
		return "";
	}
}
