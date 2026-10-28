package io.getstream.chat.android.client.parser2.adapters.internal;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import com.mapbox.common.HttpHeaders;
import f93.InterfaceC14291c;
import io.getstream.chat.android.client.utils.ThreadLocalDelegateKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import j93.InterfaceC21493z;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicInteger;
import l83.InterfaceC23462h;
import p002a0.C0005a0;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import sc3.AbstractC32398l;

/* JADX INFO: loaded from: classes5.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u000eJ\u0015\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001a\u0010(\u001a\u00020\u00028\u0000X\u0080D¢\u0006\f\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*R'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00102¨\u00065"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter;", "", "", "src", "", "cacheEnabled", "<init>", "(Ljava/lang/String;Z)V", "Ll83/a0;", "logCacheHitStats", "()V", "rawValue", "Ljava/util/Date;", "parseInternal", "(Ljava/lang/String;)Ljava/util/Date;", "fetchFromCache", HttpHeaders.DATE, "saveToCache", "(Ljava/lang/String;Ljava/util/Date;)V", "parse$stream_chat_android_client_release", "parse", "format", "(Ljava/util/Date;)Ljava/lang/String;", "Ljava/lang/String;", "Z", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Ljava/text/SimpleDateFormat;", "dateFormat$delegate", "Lf93/c;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormat", "dateFormatWithoutNanoseconds$delegate", "getDateFormatWithoutNanoseconds", "dateFormatWithoutNanoseconds", "datePattern", "getDatePattern$stream_chat_android_client_release", "()Ljava/lang/String;", "La0/a0;", "cache$delegate", "getCache", "()La0/a0;", "cache", "Ljava/util/concurrent/atomic/AtomicInteger;", "cacheHit", "Ljava/util/concurrent/atomic/AtomicInteger;", "allRequests", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamDateFormatter {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    private static final Companion Companion;

    @Deprecated
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

    @Deprecated
    public static final String DATE_FORMAT_WITHOUT_NANOSECONDS = "yyyy-MM-dd'T'HH:mm:ss'Z'";

    @Deprecated
    public static final boolean STATS = false;
    private final AtomicInteger allRequests;

    /* JADX INFO: renamed from: cache$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h cache;
    private final boolean cacheEnabled;
    private final AtomicInteger cacheHit;

    /* JADX INFO: renamed from: dateFormat$delegate, reason: from kotlin metadata */
    private final InterfaceC14291c dateFormat;

    /* JADX INFO: renamed from: dateFormatWithoutNanoseconds$delegate, reason: from kotlin metadata */
    private final InterfaceC14291c dateFormatWithoutNanoseconds;
    private final String datePattern;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final String src;

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/adapters/internal/StreamDateFormatter$Companion;", "", "<init>", "()V", "STATS", "", "DATE_FORMAT", "", "DATE_FORMAT_WITHOUT_NANOSECONDS", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        C22693x c22693x = new C22693x(StreamDateFormatter.class, "dateFormat", "getDateFormat()Ljava/text/SimpleDateFormat;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.property1(c22693x), AbstractC31061c.m95632h(StreamDateFormatter.class, "dateFormatWithoutNanoseconds", "getDateFormatWithoutNanoseconds()Ljava/text/SimpleDateFormat;", 0, c22673i0)};
        Companion = new Companion();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamDateFormatter() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0005a0 cache_delegate$lambda$4() {
        return new C0005a0(300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat dateFormatWithoutNanoseconds_delegate$lambda$3() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT_WITHOUT_NANOSECONDS, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat dateFormat_delegate$lambda$1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private final Date fetchFromCache(String rawValue) {
        if (this.cacheEnabled) {
            return (Date) getCache().m2c(rawValue);
        }
        return null;
    }

    private final C0005a0 getCache() {
        return (C0005a0) this.cache.getValue();
    }

    private final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) this.dateFormat.getValue(this, $$delegatedProperties[0]);
    }

    private final SimpleDateFormat getDateFormatWithoutNanoseconds() {
        return (SimpleDateFormat) this.dateFormatWithoutNanoseconds.getValue(this, $$delegatedProperties[1]);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void logCacheHitStats() {
        this.allRequests.get();
        this.cacheHit.get();
    }

    private final Date parseInternal(String rawValue) {
        this.allRequests.incrementAndGet();
        Date dateFetchFromCache = fetchFromCache(rawValue);
        if (dateFetchFromCache != null) {
            this.cacheHit.incrementAndGet();
            return dateFetchFromCache;
        }
        Date dateFrom = null;
        if (rawValue.length() != 0) {
            try {
                try {
                    dateFrom = Date.from(AbstractC32398l.m100976i(rawValue).toInstant());
                } catch (Throwable unused) {
                    dateFrom = getDateFormatWithoutNanoseconds().parse(rawValue);
                }
            } catch (Throwable unused2) {
            }
        }
        saveToCache(rawValue, dateFrom);
        return dateFrom;
    }

    private final void saveToCache(String rawValue, Date date) {
        if (this.cacheEnabled && date != null) {
            getCache().m3d(rawValue, date);
        }
    }

    public final String format(Date date) {
        AbstractC22676k.m65750j(date, "date");
        return AbstractC32398l.m100974g(date.toInstant().atOffset(ZoneOffset.UTC));
    }

    /* JADX INFO: renamed from: getDatePattern$stream_chat_android_client_release, reason: from getter */
    public final String getDatePattern() {
        return this.datePattern;
    }

    public final Date parse$stream_chat_android_client_release(String rawValue) {
        AbstractC22676k.m65750j(rawValue, "rawValue");
        logCacheHitStats();
        return parseInternal(rawValue);
    }

    public StreamDateFormatter(String str, boolean z4) {
        this.src = str;
        this.cacheEnabled = z4;
        this.logger = AbstractC1772c1.m5382S(this, "StreamDateFormatter");
        this.dateFormat = ThreadLocalDelegateKt.threadLocal(new C18681l0(7));
        this.dateFormatWithoutNanoseconds = ThreadLocalDelegateKt.threadLocal(new C18681l0(8));
        this.datePattern = DATE_FORMAT;
        this.cache = AbstractC30060g.m92088H(new C18681l0(9));
        this.cacheHit = new AtomicInteger();
        this.allRequests = new AtomicInteger();
    }

    public /* synthetic */ StreamDateFormatter(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z4);
    }
}
