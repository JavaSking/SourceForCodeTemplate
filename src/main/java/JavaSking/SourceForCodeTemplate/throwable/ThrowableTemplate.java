package JavaSking.SourceForCodeTemplate.throwable;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * 异常模板代码。
 * 
 * @author JavaSking 2017年1月28日
 */
public class ThrowableTemplate {

	/**
	 * 获取异常堆栈信息。
	 * 
	 * @param t
	 *          异常。
	 * @return 异常堆栈信息。
	 */
	public static String exceptionTrace(Throwable t) {

		StringWriter stringWriter = new StringWriter();
		PrintWriter writer = new PrintWriter(stringWriter);
		t.printStackTrace(writer);
		return stringWriter.toString();
	}

}
