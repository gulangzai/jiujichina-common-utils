package com.lanbao.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 閺冦儲婀￠弮鍫曟？瀹搞儱鍙跨猾锟�<br>
 * 閹绘劒绶垫稉锟芥禍娑樼埗閻€劎娈戦弮銉︽埂閺冨爼妫块幙宥勭稊閺傝纭堕敍灞惧閺堝鏌熷▔鏇㈠厴娑撴椽娼ら幀渚婄礉娑撳秶鏁ょ�圭偘绶ラ崠鏍嚉缁宓嗛崣顖欏▏閻€劊锟斤拷<br>
 * <br>
 * 娑撳璐熼弮銉︽埂閺嶇厧绱￠惃鍕暆閸楁洘寮挎潻鎷岊嚊閹懓顕崣鍌滄箙java API娑撶挷ava.text.SimpleDateFormat<br>
 * The following pattern letters are defined (all other characters from
 * <code>'A'</code> to <code>'Z'</code> and from <code>'a'</code> to
 * <code>'z'</code> are reserved): <blockquote>
 * <table border=0 cellspacing=3 cellpadding=0>
 * <tr bgcolor="#ccccff">
 * <th align=left>Letter
 * <th align=left>Date or Time Component
 * <th align=left>Presentation
 * <th align=left>Examples
 * <tr>
 * <td><code>G</code>
 * <td>Era designator
 * <td><a href="#text">Text</a>
 * <td><code>AD</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>y</code>
 * <td>Year
 * <td><a href="#year">Year</a>
 * <td><code>1996</code>; <code>96</code>
 * <tr>
 * <td><code>M</code>
 * <td>Month in year
 * <td><a href="#month">Month</a>
 * <td><code>July</code>; <code>Jul</code>; <code>07</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>w</code>
 * <td>Week in year
 * <td><a href="#number">Number</a>
 * <td><code>27</code>
 * <tr>
 * <td><code>W</code>
 * <td>Week in month
 * <td><a href="#number">Number</a>
 * <td><code>2</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>D</code>
 * <td>Day in year
 * <td><a href="#number">Number</a>
 * <td><code>189</code>
 * <tr>
 * <td><code>d</code>
 * <td>Day in month
 * <td><a href="#number">Number</a>
 * <td><code>10</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>F</code>
 * <td>Day of week in month
 * <td><a href="#number">Number</a>
 * <td><code>2</code>
 * <tr>
 * <td><code>E</code>
 * <td>Day in week
 * <td><a href="#text">Text</a>
 * <td><code>Tuesday</code>; <code>Tue</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>a</code>
 * <td>Am/pm marker
 * <td><a href="#text">Text</a>
 * <td><code>PM</code>
 * <tr>
 * <td><code>H</code>
 * <td>Hour in day (0-23)
 * <td><a href="#number">Number</a>
 * <td><code>0</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>k</code>
 * <td>Hour in day (1-24)
 * <td><a href="#number">Number</a>
 * <td><code>24</code>
 * <tr>
 * <td><code>K</code>
 * <td>Hour in am/pm (0-11)
 * <td><a href="#number">Number</a>
 * <td><code>0</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>h</code>
 * <td>Hour in am/pm (1-12)
 * <td><a href="#number">Number</a>
 * <td><code>12</code>
 * <tr>
 * <td><code>m</code>
 * <td>Minute in hour
 * <td><a href="#number">Number</a>
 * <td><code>30</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>s</code>
 * <td>Second in minute
 * <td><a href="#number">Number</a>
 * <td><code>55</code>
 * <tr>
 * <td><code>S</code>
 * <td>Millisecond
 * <td><a href="#number">Number</a>
 * <td><code>978</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>z</code>
 * <td>Time zone
 * <td><a href="#timezone">General time zone</a>
 * <td><code>Pacific Standard Time</code>; <code>PST</code>;
 * <code>GMT-08:00</code>
 * <tr>
 * <td><code>Z</code>
 * <td>Time zone
 * <td><a href="#rfc822timezone">RFC 822 time zone</a>
 * <td><code>-0800</code>
 * </table>
 * </blockquote> <h4>Examples</h4>
 * 
 * The following examples show how date and time patterns are interpreted in the
 * U.S. locale. The given date and time are 2001-07-04 12:08:56 local time in
 * the U.S. Pacific Time time zone. <blockquote>
 * <table border=0 cellspacing=3 cellpadding=0>
 * <tr bgcolor="#ccccff">
 * <th align=left>Date and Time Pattern
 * <th align=left>Result
 * <tr>
 * <td><code>"yyyy.MM.dd G 'at' HH:mm:ss z"</code>
 * <td><code>2001.07.04 AD at 12:08:56 PDT</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>"EEE, MMM d, ''yy"</code>
 * <td><code>Wed, Jul 4, '01</code>
 * <tr>
 * <td><code>"h:mm a"</code>
 * <td><code>12:08 PM</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>"hh 'o''clock' a, zzzz"</code>
 * <td><code>12 o'clock PM, Pacific Daylight Time</code>
 * <tr>
 * <td><code>"K:mm a, z"</code>
 * <td><code>0:08 PM, PDT</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>"yyyyy.MMMMM.dd GGG hh:mm aaa"</code>
 * <td><code>02001.July.04 AD 12:08 PM</code>
 * <tr>
 * <td><code>"EEE, d MMM yyyy HH:mm:ss Z"</code>
 * <td><code>Wed, 4 Jul 2001 12:08:56 -0700</code>
 * <tr bgcolor="#eeeeff">
 * <td><code>"yyMMddHHmmssZ"</code>
 * <td><code>010704120856-0700</code>
 * </table>
 * </blockquote>
 */

public class DateTimeUtil {

	/**
	 * 缂傝櫣娓烽惃鍕）閺堢喐妯夌粈鐑樼壐瀵骏绱� yyyy-MM-dd
	 */
	public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * 缂傝櫣娓烽惃鍕）閺堢喐妞傞梻瀛樻▔缁�鐑樼壐瀵骏绱皔yyy-MM-dd HH:mm:ss
	 */
	public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 缁変焦婀侀弸鍕拷鐘虫煙濞夋洩绱濈粋浣诡剾鐎电顕氱猾鏄忕箻鐞涘苯鐤勬笟瀣
	 */
	private DateTimeUtil() {
	}

	/**
	 * 瀵版鍩岀化鑽ょ埠瑜版挸澧犻弮銉︽埂閺冨爼妫�
	 * 
	 * @return 瑜版挸澧犻弮銉︽埂閺冨爼妫�
	 */
	public static Date getNow() {
		return Calendar.getInstance().getTime();
	}

	/**
	 * 瀵版鍩岄悽銊у繁閻焦鏌熷蹇旂壐瀵繐瀵查惃鍕秼閸撳秵妫╅張锟�
	 * 
	 * @return 瑜版挸澧犻弮銉︽埂
	 */
	public static String getDate() {
		return getDateTime(DEFAULT_DATE_FORMAT);
	}

	/**
	 * 瀵版鍩岄悽銊у繁閻焦鏌熷蹇旂壐瀵繐瀵查惃鍕秼閸撳秵妫╅張鐔峰挤閺冨爼妫�
	 * 
	 * @return 瑜版挸澧犻弮銉︽埂閸欏﹥妞傞梻锟�
	 */
	public static String getDateTime() {
		return getDateTime(DEFAULT_DATETIME_FORMAT);
	}

	/**
	 * 瀵版鍩岀化鑽ょ埠瑜版挸澧犻弮銉︽埂閸欏﹥妞傞梻杈剧礉楠炲墎鏁ら幐鍥х暰閻ㄥ嫭鏌熷蹇旂壐瀵繐瀵�
	 * 
	 * @param pattern
	 *            閺勫墽銇氶弽鐓庣础
	 * @return 瑜版挸澧犻弮銉︽埂閸欏﹥妞傞梻锟�
	 */
	public static String getDateTime(String pattern) {
		Date datetime = Calendar.getInstance().getTime();
		return getDateTime(datetime, pattern);
	}

	/**
	 * 瀵版鍩岄悽銊﹀瘹鐎规碍鏌熷蹇旂壐瀵繐瀵查惃鍕）閺堬拷
	 * 
	 * @param date
	 *            闂囷拷鐟曚浇绻樼悰灞剧壐瀵繐瀵查惃鍕）閺堬拷
	 * @param pattern
	 *            閺勫墽銇氶弽鐓庣础
	 * @return 閺冦儲婀￠弮鍫曟？鐎涙顑佹稉锟�
	 */
	public static String getDateTime(Date date, String pattern) {
		if (null == pattern || "".equals(pattern)) {
			pattern = DEFAULT_DATETIME_FORMAT;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		return dateFormat.format(date);
	}

	/**
	 * 瀵版鍩岃ぐ鎾冲楠炵繝鍞�
	 * 
	 * @return 瑜版挸澧犻獮缈犲敜
	 */
	public static int getCurrentYear() {
		return Calendar.getInstance().get(Calendar.YEAR);
	}

	/**
	 * 瀵版鍩岃ぐ鎾冲閺堝牅鍞�
	 * 
	 * @return 瑜版挸澧犻張鍫滃敜
	 */
	public static int getCurrentMonth() {
		// 閻⑩暎et瀵版鍩岄惃鍕箑娴犺姤鏆熷В鏂跨杽闂勫懐娈戠亸锟�1閿涘矂娓剁憰浣稿娑擄拷
		return Calendar.getInstance().get(Calendar.MONTH) + 1;
	}

	/**
	 * 瀵版鍩岃ぐ鎾冲閺冿拷
	 * 
	 * @return 瑜版挸澧犻弮锟�
	 */
	public static int getCurrentDay() {
		return Calendar.getInstance().get(Calendar.DATE);
	}

	/**
	 * 閸欐牕绶辫ぐ鎾冲閺冦儲婀℃禒銉ユ倵閼汇儱鍏辨径鈺冩畱閺冦儲婀￠妴鍌氼洤閺嬫粏顩﹀妤�鍩屾禒銉ュ閻ㄥ嫭妫╅張鐕傜礉閸欏倹鏆熼悽銊ㄧ閺佽埇锟斤拷 娓氬顩х憰浣哥繁閸掗绗傞弰鐔告埂閸氬奔绔存径鈺冩畱閺冦儲婀￠敍灞藉棘閺佹澘鍨稉锟�-7
	 * 
	 * @param days
	 *            婢х偛濮為惃鍕）閺堢喐鏆�
	 * @return 婢х偛濮炴禒銉ユ倵閻ㄥ嫭妫╅張锟�
	 */
	public static Date addDays(int days) {
		return add(getNow(), days, Calendar.DATE);
	}

	/**
	 * 閸欐牕绶遍幐鍥х暰閺冦儲婀℃禒銉ユ倵閼汇儱鍏辨径鈺冩畱閺冦儲婀￠妴鍌氼洤閺嬫粏顩﹀妤�鍩屾禒銉ュ閻ㄥ嫭妫╅張鐕傜礉閸欏倹鏆熼悽銊ㄧ閺佽埇锟斤拷
	 * 
	 * @param date
	 *            閸╁搫鍣弮銉︽埂
	 * @param days
	 *            婢х偛濮為惃鍕）閺堢喐鏆�
	 * @return 婢х偛濮炴禒銉ユ倵閻ㄥ嫭妫╅張锟�
	 */
	public static Date addDays(Date date, int days) {
		return add(date, days, Calendar.DATE);
	}

	/**
	 * 閸欐牕绶辫ぐ鎾冲閺冦儲婀℃禒銉ユ倵閺屾劖婀�閻ㄥ嫭妫╅張鐔达拷鍌氼洤閺嬫粏顩﹀妤�鍩屾禒銉ュ閺堝牅鍞ら惃鍕）閺堢噦绱濋崣鍌涙殶閻€劏绀嬮弫鑸拷锟�
	 * 
	 * @param months
	 *            婢х偛濮為惃鍕箑娴犺姤鏆�
	 * @return 婢х偛濮炴禒銉ユ倵閻ㄥ嫭妫╅張锟�
	 */
	public static Date addMonths(int months) {
		return add(getNow(), months, Calendar.MONTH);
	}

	/**
	 * 閸欐牕绶遍幐鍥х暰閺冦儲婀℃禒銉ユ倵閺屾劖婀�閻ㄥ嫭妫╅張鐔达拷鍌氼洤閺嬫粏顩﹀妤�鍩屾禒銉ュ閺堝牅鍞ら惃鍕）閺堢噦绱濋崣鍌涙殶閻€劏绀嬮弫鑸拷锟� 濞夈劍鍓伴敍灞藉讲閼虫垝绗夐弰顖氭倱娑擄拷閺冦儱鐡欓敍灞肩伐婵★拷2003-1-31閸旂姳绗傛稉锟芥稉顏呮箑閺勶拷2003-2-28
	 * 
	 * @param date
	 *            閸╁搫鍣弮銉︽埂
	 * @param months
	 *            婢х偛濮為惃鍕箑娴犺姤鏆�
	 * @return 婢х偛濮炴禒銉ユ倵閻ㄥ嫭妫╅張锟�
	 */
	public static Date addMonths(Date date, int months) {
		return add(date, months, Calendar.MONTH);
	}

	/**
	 * 閸愬懘鍎撮弬瑙勭《閵嗗倷璐熼幐鍥х暰閺冦儲婀℃晶鐐插閻╃绨查惃鍕亯閺佺増鍨ㄩ張鍫熸殶
	 * 
	 * @param date
	 *            閸╁搫鍣弮銉︽埂
	 * @param amount
	 *            婢х偛濮為惃鍕殶闁诧拷
	 * @param field
	 *            婢х偛濮為惃鍕礋娴ｅ稄绱濋獮杈剧礉閺堝牊鍨ㄩ懓鍛）
	 * @return 婢х偛濮炴禒銉ユ倵閻ㄥ嫭妫╅張锟�
	 */
	private static Date add(Date date, int amount, int field) {
		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);
		calendar.add(field, amount);

		return calendar.getTime();
	}

	/**
	 * 鐠侊紕鐣绘稉銈勯嚋閺冦儲婀￠惄绋挎▕婢垛晜鏆熼妴锟� 閻€劎顑囨稉锟芥稉顏呮）閺堢喎鍣洪崢鑽ゎ儑娴滃奔閲滈妴鍌氼洤閺嬫粌澧犳稉锟芥稉顏呮）閺堢喎鐨禍搴℃倵娑擄拷娑擃亝妫╅張鐕傜礉閸掓瑨绻戦崶鐐剁閺侊拷
	 * 
	 * @param one
	 *            缁楊兛绔存稉顏呮）閺堢喐鏆熼敍灞肩稊娑撳搫鐔�閸戯拷
	 * @param two
	 *            缁楊兛绨╂稉顏呮）閺堢喐鏆熼敍灞肩稊娑撶儤鐦潏锟�
	 * @return 娑撱倓閲滈弮銉︽埂閻╃妯婃径鈺傛殶
	 */
	public static long diffDays(Date one, Date two) {
		return (one.getTime() - two.getTime()) / (24 * 60 * 60 * 1000);
	}

	/**
	 * 鐠侊紕鐣绘稉銈勯嚋閺冦儲婀￠惄绋挎▕閺堝牅鍞ら弫锟� 婵″倹鐏夐崜宥勭娑擃亝妫╅張鐔风毈娴滃骸鎮楁稉锟芥稉顏呮）閺堢噦绱濋崚娆掔箲閸ョ偠绀嬮弫锟�
	 * 
	 * @param one
	 *            缁楊兛绔存稉顏呮）閺堢喐鏆熼敍灞肩稊娑撳搫鐔�閸戯拷
	 * @param two
	 *            缁楊兛绨╂稉顏呮）閺堢喐鏆熼敍灞肩稊娑撶儤鐦潏锟�
	 * @return 娑撱倓閲滈弮銉︽埂閻╃妯婇張鍫滃敜閺侊拷
	 */
	public static int diffMonths(Date one, Date two) {

		Calendar calendar = Calendar.getInstance();

		// 瀵版鍩岀粭顑跨娑擃亝妫╅張鐔烘畱楠炴潙鍨庨崪灞炬箑娴犺姤鏆�
		calendar.setTime(one);
		int yearOne = calendar.get(Calendar.YEAR);
		int monthOne = calendar.get(Calendar.MONDAY);

		// 瀵版鍩岀粭顑跨癌娑擃亝妫╅張鐔烘畱楠炵繝鍞ら崪灞炬箑娴狅拷
		calendar.setTime(two);
		int yearTwo = calendar.get(Calendar.YEAR);
		int monthTwo = calendar.get(Calendar.MONDAY);

		return (yearOne - yearTwo) * 12 + (monthOne - monthTwo);
	}

	/**
	 * 鐏忓棔绔存稉顏勭摟缁楋缚瑕嗛悽銊х舶鐎规氨娈戦弽鐓庣础鏉烆剚宕叉稉鐑樻）閺堢喓琚崹瀣拷锟�<br>
	 * 濞夈劍鍓伴敍姘洤閺嬫粏绻戦崶鐎梪ll閿涘苯鍨悰銊с仛鐟欙絾鐎芥径杈Е
	 * 
	 * @param datestr
	 *            闂囷拷鐟曚浇袙閺嬫劗娈戦弮銉︽埂鐎涙顑佹稉锟�
	 * @param pattern
	 *            閺冦儲婀＄�涙顑佹稉鑼畱閺嶇厧绱￠敍宀勭帛鐠併倓璐熼垾娓瑈yy-MM-dd閳ユ繄娈戣ぐ銏犵础
	 * @return 鐟欙絾鐎介崥搴ｆ畱閺冦儲婀�
	 */
	public static Date parse(String datestr, String pattern) {
		Date date = null;

		if (null == pattern || "".equals(pattern)) {
			pattern = DEFAULT_DATE_FORMAT;
		}

		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
			date = dateFormat.parse(datestr);
		} catch (ParseException e) {
			//
		} catch (Exception e) {
			//
		}

		return date;
	}

	/**
	 * 鏉╂柨娲栭張顒佹箑閻ㄥ嫭娓堕崥搴濈婢讹拷
	 * 
	 * @return 閺堫剚婀�閺堬拷閸氬簼绔存径鈺冩畱閺冦儲婀�
	 */
	public static Date getMonthLastDay() {
		return getMonthLastDay(getNow());
	}

	/**
	 * 鏉╂柨娲栫紒娆忕暰閺冦儲婀℃稉顓犳畱閺堝牅鍞ゆ稉顓犳畱閺堬拷閸氬簼绔存径锟�
	 * 
	 * @param date
	 *            閸╁搫鍣弮銉︽埂
	 * @return 鐠囥儲婀�閺堬拷閸氬簼绔存径鈺冩畱閺冦儲婀�
	 */
	public static Date getMonthLastDay(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		// 鐏忓棙妫╅張鐔活啎缂冾喕璐熸稉瀣╃閺堝牏顑囨稉锟芥径锟�
		calendar.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH) + 1, 1);

		// 閸戝繐骞�1婢垛晪绱濆妤�鍩岄惃鍕祮閺堫剚婀�閻ㄥ嫭娓堕崥搴濈婢讹拷
		calendar.add(Calendar.DATE, -1);

		return calendar.getTime();
	}
 
}
