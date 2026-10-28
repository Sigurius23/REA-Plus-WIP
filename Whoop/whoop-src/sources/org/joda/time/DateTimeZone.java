package org.joda.time;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import nh3.AbstractC26725a;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.chrono.BaseChronology;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;
import org.joda.time.format.FormatUtils;
import org.joda.time.p378tz.DefaultNameProvider;
import org.joda.time.p378tz.FixedDateTimeZone;
import org.joda.time.p378tz.NameProvider;
import org.joda.time.p378tz.Provider;
import org.joda.time.p378tz.UTCProvider;
import org.joda.time.p378tz.ZoneInfoProvider;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DateTimeZone implements Serializable {
    public static final String DEFAULT_TZ_DATA_PATH = "org/joda/time/tz/data";
    private static final int MAX_MILLIS = 86399999;
    private static final long serialVersionUID = 5546345482340108586L;
    private final String iID;
    public static final DateTimeZone UTC = UTCDateTimeZone.INSTANCE;
    private static final AtomicReference<Provider> cProvider = new AtomicReference<>();
    private static final AtomicReference<NameProvider> cNameProvider = new AtomicReference<>();
    private static final AtomicReference<DateTimeZone> cDefault = new AtomicReference<>();

    public static final class LazyInit {
        static final Map<String, String> CONVERSION_MAP = buildMap();
        static final DateTimeFormatter OFFSET_FORMATTER = buildFormatter();

        private static DateTimeFormatter buildFormatter() {
            return new DateTimeFormatterBuilder().appendTimeZoneOffset(null, true, 2, 4).toFormatter().withChronology(new BaseChronology() { // from class: org.joda.time.DateTimeZone.LazyInit.1
                private static final long serialVersionUID = -3128740902654445468L;

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public DateTimeZone getZone() {
                    return null;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public String toString() {
                    return C282261.class.getName();
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withUTC() {
                    return this;
                }

                @Override // org.joda.time.chrono.BaseChronology, org.joda.time.Chronology
                public Chronology withZone(DateTimeZone dateTimeZone) {
                    return this;
                }
            });
        }

        private static Map<String, String> buildMap() {
            HashMap map = new HashMap();
            map.put("GMT", "UTC");
            map.put("WET", "WET");
            map.put("CET", "CET");
            map.put("MET", "CET");
            map.put("ECT", "CET");
            map.put("EET", "EET");
            map.put("MIT", "Pacific/Apia");
            map.put("HST", "Pacific/Honolulu");
            map.put("AST", "America/Anchorage");
            map.put("PST", "America/Los_Angeles");
            map.put("MST", "America/Denver");
            map.put("PNT", "America/Phoenix");
            map.put("CST", "America/Chicago");
            map.put("EST", "America/New_York");
            map.put("IET", "America/Indiana/Indianapolis");
            map.put("PRT", "America/Puerto_Rico");
            map.put("CNT", "America/St_Johns");
            map.put("AGT", "America/Argentina/Buenos_Aires");
            map.put("BET", "America/Sao_Paulo");
            map.put("ART", "Africa/Cairo");
            map.put("CAT", "Africa/Harare");
            map.put("EAT", "Africa/Addis_Ababa");
            map.put("NET", "Asia/Yerevan");
            map.put("PLT", "Asia/Karachi");
            map.put("IST", "Asia/Kolkata");
            map.put("BST", "Asia/Dhaka");
            map.put("VST", "Asia/Ho_Chi_Minh");
            map.put("CTT", "Asia/Shanghai");
            map.put("JST", "Asia/Tokyo");
            map.put("ACT", "Australia/Darwin");
            map.put("AET", "Australia/Sydney");
            map.put("SST", "Pacific/Guadalcanal");
            map.put("NST", "Pacific/Auckland");
            return Collections.unmodifiableMap(map);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Stub implements Serializable {
        private static final long serialVersionUID = -6471952376487863581L;
        private transient String iID;

        public Stub(String str) {
            this.iID = str;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            this.iID = objectInputStream.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return DateTimeZone.forID(this.iID);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.iID);
        }
    }

    public DateTimeZone(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        this.iID = str;
    }

    private static String convertToAsciiNumber(String str) {
        StringBuilder sb4 = new StringBuilder(str);
        for (int i13 = 0; i13 < sb4.length(); i13++) {
            int iDigit = Character.digit(sb4.charAt(i13), 10);
            if (iDigit >= 0) {
                sb4.setCharAt(i13, (char) (iDigit + 48));
            }
        }
        return sb4.toString();
    }

    private static DateTimeZone fixedOffsetZone(String str, int i13) {
        return i13 == 0 ? UTC : new FixedDateTimeZone(str, null, i13, i13);
    }

    @FromString
    public static DateTimeZone forID(String str) {
        String strSubstring;
        if (str == null) {
            return getDefault();
        }
        if (str.equals("UTC")) {
            return UTC;
        }
        DateTimeZone zone = getProvider().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.equals("UT") || str.equals("GMT") || str.equals("Z")) {
            return UTC;
        }
        if (str.startsWith("UTC+") || str.startsWith("UTC-") || str.startsWith("GMT+") || str.startsWith("GMT-")) {
            strSubstring = str.substring(3);
        } else {
            strSubstring = (str.startsWith("UT+") || str.startsWith("UT-")) ? str.substring(2) : str;
        }
        if (!strSubstring.startsWith("+") && !strSubstring.startsWith("-")) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("The datetime zone id '", str, "' is not recognised"));
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static DateTimeZone forOffsetHours(int i13) throws IllegalArgumentException {
        return forOffsetHoursMinutes(i13, 0);
    }

    public static DateTimeZone forOffsetHoursMinutes(int i13, int i14) throws IllegalArgumentException {
        if (i13 == 0 && i14 == 0) {
            return UTC;
        }
        if (i13 < -23 || i13 > 23) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Hours out of range: "));
        }
        if (i14 < -59 || i14 > 59) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Minutes out of range: "));
        }
        if (i13 > 0 && i14 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Positive hours must not have negative minutes: "));
        }
        int i15 = i13 * 60;
        try {
            return forOffsetMillis(FieldUtils.safeMultiply(i15 < 0 ? i15 - Math.abs(i14) : i15 + i14, DateTimeConstants.MILLIS_PER_MINUTE));
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Offset is too large");
        }
    }

    public static DateTimeZone forOffsetMillis(int i13) {
        if (i13 < -86399999 || i13 > MAX_MILLIS) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Millis out of range: "));
        }
        return fixedOffsetZone(printOffset(i13), i13);
    }

    public static DateTimeZone forTimeZone(TimeZone timeZone) {
        char cCharAt;
        if (timeZone == null) {
            return getDefault();
        }
        String id4 = timeZone.getID();
        if (id4 == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id4.equals("UTC")) {
            return UTC;
        }
        String convertedId = getConvertedId(id4);
        Provider provider = getProvider();
        DateTimeZone zone = convertedId != null ? provider.getZone(convertedId) : null;
        if (zone == null) {
            zone = provider.getZone(id4);
        }
        if (zone != null) {
            return zone;
        }
        if (convertedId != null || (!id4.startsWith("GMT+") && !id4.startsWith("GMT-"))) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("The datetime zone id '", id4, "' is not recognised"));
        }
        String strSubstring = id4.substring(3);
        if (strSubstring.length() > 2 && (cCharAt = strSubstring.charAt(1)) > '9' && Character.isDigit(cCharAt)) {
            strSubstring = convertToAsciiNumber(strSubstring);
        }
        int offset = parseOffset(strSubstring);
        return ((long) offset) == 0 ? UTC : fixedOffsetZone(printOffset(offset), offset);
    }

    public static Set<String> getAvailableIDs() {
        return getProvider().getAvailableIDs();
    }

    private static String getConvertedId(String str) {
        return LazyInit.CONVERSION_MAP.get(str);
    }

    public static DateTimeZone getDefault() {
        DateTimeZone dateTimeZoneForTimeZone = cDefault.get();
        if (dateTimeZoneForTimeZone != null) {
            return dateTimeZoneForTimeZone;
        }
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Timezone");
            if (property != null) {
                dateTimeZoneForTimeZone = forID(property);
            }
        } catch (RuntimeException unused) {
        }
        if (dateTimeZoneForTimeZone == null) {
            try {
                dateTimeZoneForTimeZone = forTimeZone(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (dateTimeZoneForTimeZone == null) {
            dateTimeZoneForTimeZone = UTC;
        }
        DateTimeZone dateTimeZone = dateTimeZoneForTimeZone;
        AtomicReference<DateTimeZone> atomicReference = cDefault;
        while (!atomicReference.compareAndSet(null, dateTimeZone)) {
            if (atomicReference.get() != null) {
                return cDefault.get();
            }
        }
        return dateTimeZone;
    }

    private static NameProvider getDefaultNameProvider() {
        NameProvider nameProvider = null;
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (!NameProvider.class.isAssignableFrom(cls)) {
                        throw new IllegalArgumentException("System property referred to class that does not implement " + NameProvider.class);
                    }
                    nameProvider = (NameProvider) cls.asSubclass(NameProvider.class).getConstructor(null).newInstance(null);
                } catch (Exception e5) {
                    throw new RuntimeException(e5);
                }
            }
        } catch (SecurityException unused) {
        }
        return nameProvider == null ? new DefaultNameProvider() : nameProvider;
    }

    private static Provider getDefaultProvider() {
        try {
            String property = System.getProperty("org.joda.time.DateTimeZone.Provider");
            if (property != null) {
                try {
                    Class<?> cls = Class.forName(property, false, DateTimeZone.class.getClassLoader());
                    if (Provider.class.isAssignableFrom(cls)) {
                        return validateProvider((Provider) cls.asSubclass(Provider.class).getConstructor(null).newInstance(null));
                    }
                    throw new IllegalArgumentException("System property referred to class that does not implement " + Provider.class);
                } catch (Exception e5) {
                    throw new RuntimeException(e5);
                }
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("org.joda.time.DateTimeZone.Folder");
            if (property2 != null) {
                try {
                    return validateProvider(new ZoneInfoProvider(new File(property2)));
                } catch (Exception e13) {
                    throw new RuntimeException(e13);
                }
            }
        } catch (SecurityException unused2) {
        }
        try {
            return validateProvider(new ZoneInfoProvider(DEFAULT_TZ_DATA_PATH));
        } catch (Exception e14) {
            e14.printStackTrace();
            return new UTCProvider();
        }
    }

    public static NameProvider getNameProvider() {
        AtomicReference<NameProvider> atomicReference = cNameProvider;
        NameProvider defaultNameProvider = atomicReference.get();
        if (defaultNameProvider == null) {
            defaultNameProvider = getDefaultNameProvider();
            if (!AbstractC26725a.m79516t(atomicReference, defaultNameProvider)) {
                return atomicReference.get();
            }
        }
        return defaultNameProvider;
    }

    public static Provider getProvider() {
        AtomicReference<Provider> atomicReference = cProvider;
        Provider provider = atomicReference.get();
        if (provider != null) {
            return provider;
        }
        Provider defaultProvider = getDefaultProvider();
        while (!atomicReference.compareAndSet(null, defaultProvider)) {
            if (atomicReference.get() != null) {
                return cProvider.get();
            }
        }
        return defaultProvider;
    }

    private static int parseOffset(String str) {
        return -((int) LazyInit.OFFSET_FORMATTER.parseMillis(str));
    }

    private static String printOffset(int i13) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i13 >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i13 = -i13;
        }
        int i14 = i13 / DateTimeConstants.MILLIS_PER_HOUR;
        FormatUtils.appendPaddedInteger(stringBuffer, i14, 2);
        int i15 = i13 - (i14 * DateTimeConstants.MILLIS_PER_HOUR);
        int i16 = i15 / DateTimeConstants.MILLIS_PER_MINUTE;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i16, 2);
        int i17 = i15 - (i16 * DateTimeConstants.MILLIS_PER_MINUTE);
        if (i17 == 0) {
            return stringBuffer.toString();
        }
        int i18 = i17 / 1000;
        stringBuffer.append(':');
        FormatUtils.appendPaddedInteger(stringBuffer, i18, 2);
        int i19 = i17 - (i18 * 1000);
        if (i19 == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        FormatUtils.appendPaddedInteger(stringBuffer, i19, 3);
        return stringBuffer.toString();
    }

    public static void setDefault(DateTimeZone dateTimeZone) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setDefault"));
        }
        if (dateTimeZone == null) {
            throw new IllegalArgumentException("The datetime zone must not be null");
        }
        cDefault.set(dateTimeZone);
    }

    public static void setNameProvider(NameProvider nameProvider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setNameProvider"));
        }
        if (nameProvider == null) {
            nameProvider = getDefaultNameProvider();
        }
        cNameProvider.set(nameProvider);
    }

    public static void setProvider(Provider provider) throws SecurityException {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new JodaTimePermission("DateTimeZone.setProvider"));
        }
        if (provider == null) {
            provider = getDefaultProvider();
        } else {
            validateProvider(provider);
        }
        cProvider.set(provider);
    }

    private static Provider validateProvider(Provider provider) {
        Set<String> availableIDs = provider.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!availableIDs.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (UTC.equals(provider.getZone("UTC"))) {
            return provider;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }

    public long adjustOffset(long j7, boolean z4) {
        long j13 = j7 - 10800000;
        long offset = getOffset(j13);
        long offset2 = getOffset(10800000 + j7);
        if (offset <= offset2) {
            return j7;
        }
        long j14 = offset - offset2;
        long jNextTransition = nextTransition(j13);
        long j15 = jNextTransition - j14;
        long j16 = jNextTransition + j14;
        if (j7 < j15 || j7 >= j16) {
            return j7;
        }
        if (j7 - j15 >= j14) {
            return z4 ? j7 : j7 - j14;
        }
        return z4 ? j7 + j14 : j7;
    }

    public long convertLocalToUTC(long j7, boolean z4, long j13) {
        int offset = getOffset(j13);
        long j14 = j7 - ((long) offset);
        return getOffset(j14) == offset ? j14 : convertLocalToUTC(j7, z4);
    }

    public long convertUTCToLocal(long j7) {
        long offset = getOffset(j7);
        long j13 = j7 + offset;
        if ((j7 ^ j13) >= 0 || (j7 ^ offset) < 0) {
            return j13;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    public abstract boolean equals(Object obj);

    @ToString
    public final String getID() {
        return this.iID;
    }

    public long getMillisKeepLocal(DateTimeZone dateTimeZone, long j7) {
        if (dateTimeZone == null) {
            dateTimeZone = getDefault();
        }
        DateTimeZone dateTimeZone2 = dateTimeZone;
        return dateTimeZone2 == this ? j7 : dateTimeZone2.convertLocalToUTC(convertUTCToLocal(j7), false, j7);
    }

    public final String getName(long j7) {
        return getName(j7, null);
    }

    public abstract String getNameKey(long j7);

    public abstract int getOffset(long j7);

    public final int getOffset(ReadableInstant readableInstant) {
        return readableInstant == null ? getOffset(DateTimeUtils.currentTimeMillis()) : getOffset(readableInstant.getMillis());
    }

    public int getOffsetFromLocal(long j7) {
        int offset = getOffset(j7);
        long j13 = j7 - ((long) offset);
        int offset2 = getOffset(j13);
        if (offset != offset2) {
            if (offset - offset2 < 0) {
                long jNextTransition = nextTransition(j13);
                if (jNextTransition == j13) {
                    jNextTransition = Long.MAX_VALUE;
                }
                long j14 = j7 - ((long) offset2);
                long jNextTransition2 = nextTransition(j14);
                if (jNextTransition != (jNextTransition2 != j14 ? jNextTransition2 : Long.MAX_VALUE)) {
                    return offset;
                }
            }
        } else if (offset >= 0) {
            long jPreviousTransition = previousTransition(j13);
            if (jPreviousTransition < j13) {
                int offset3 = getOffset(jPreviousTransition);
                if (j13 - jPreviousTransition <= offset3 - offset) {
                    return offset3;
                }
            }
        }
        return offset2;
    }

    public final String getShortName(long j7) {
        return getShortName(j7, null);
    }

    public abstract int getStandardOffset(long j7);

    public int hashCode() {
        return getID().hashCode() + 57;
    }

    public abstract boolean isFixed();

    public boolean isLocalDateTimeGap(LocalDateTime localDateTime) {
        if (isFixed()) {
            return false;
        }
        try {
            localDateTime.toDateTime(this);
            return false;
        } catch (IllegalInstantException unused) {
            return true;
        }
    }

    public boolean isStandardOffset(long j7) {
        return getOffset(j7) == getStandardOffset(j7);
    }

    public abstract long nextTransition(long j7);

    public abstract long previousTransition(long j7);

    public String toString() {
        return getID();
    }

    public TimeZone toTimeZone() {
        return TimeZone.getTimeZone(this.iID);
    }

    public Object writeReplace() throws ObjectStreamException {
        return new Stub(this.iID);
    }

    public String getName(long j7, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j7);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String name = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getName(locale, this.iID, nameKey, isStandardOffset(j7)) : nameProvider.getName(locale, this.iID, nameKey);
        return name != null ? name : printOffset(getOffset(j7));
    }

    public String getShortName(long j7, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String nameKey = getNameKey(j7);
        if (nameKey == null) {
            return this.iID;
        }
        NameProvider nameProvider = getNameProvider();
        String shortName = nameProvider instanceof DefaultNameProvider ? ((DefaultNameProvider) nameProvider).getShortName(locale, this.iID, nameKey, isStandardOffset(j7)) : nameProvider.getShortName(locale, this.iID, nameKey);
        return shortName != null ? shortName : printOffset(getOffset(j7));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public long convertLocalToUTC(long j7, boolean z4) {
        int offset = getOffset(j7);
        long j13 = j7 - ((long) offset);
        int offset2 = getOffset(j13);
        if (offset == offset2 || (!z4 && offset >= 0)) {
            offset = offset2;
        } else {
            long jNextTransition = nextTransition(j13);
            if (jNextTransition == j13) {
                jNextTransition = Long.MAX_VALUE;
            }
            long j14 = j7 - ((long) offset2);
            long jNextTransition2 = nextTransition(j14);
            if (jNextTransition == (jNextTransition2 != j14 ? jNextTransition2 : Long.MAX_VALUE)) {
                offset = offset2;
            } else if (z4) {
                throw new IllegalInstantException(j7, getID());
            }
        }
        long j15 = offset;
        long j16 = j7 - j15;
        if ((j7 ^ j16) >= 0 || (j7 ^ j15) >= 0) {
            return j16;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }
}
