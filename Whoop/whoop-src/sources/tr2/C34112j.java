package tr2;

import androidx.core.app.NotificationCompat;
import com.whoop.domain.model.event.LoggableEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.time.Clock;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: tr2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Ltr2/j;", "", "Ljava/time/Clock;", "clock", "Ljava/time/format/DateTimeFormatter;", "formatter", "<init>", "(Ljava/time/Clock;Ljava/time/format/DateTimeFormatter;)V", "Lcom/whoop/domain/model/event/LoggableEvent;", NotificationCompat.CATEGORY_EVENT, "", "a", "(Lcom/whoop/domain/model/event/LoggableEvent;)Ljava/lang/String;", "Ljava/time/Clock;", "b", "Ljava/time/format/DateTimeFormatter;", "c", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34112j {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final DateTimeFormatter formatter;

    /* JADX INFO: renamed from: tr2.j$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ltr2/j$a;", "", "<init>", "()V", "", "throwable", "", "b", "(Ljava/lang/Throwable;)Ljava/lang/String;", "MAIN_THREAD_NAME", "Ljava/lang/String;", "logging_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final String m107843b(Throwable throwable) throws IOException {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            try {
                throwable.printStackTrace(printWriter);
                String string = stringWriter.toString();
                AbstractC22676k.m65749i(string, "toString(...)");
                printWriter.close();
                return string;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC35854l.m113829i(printWriter, th3);
                    throw th4;
                }
            }
        }

        private Companion() {
        }
    }

    public C34112j(Clock clock, DateTimeFormatter formatter) {
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(formatter, "formatter");
        this.clock = clock;
        this.formatter = formatter;
    }

    /* JADX INFO: renamed from: a */
    public final String m107841a(LoggableEvent event) {
        AbstractC22676k.m65750j(event, "event");
        StringBuilder sb4 = new StringBuilder();
        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(event.timestamp).atZone(this.clock.getZone());
        Thread threadCurrentThread = Thread.currentThread();
        sb4.append(this.formatter.format(zonedDateTimeAtZone) + " ");
        StringBuilder sbM32000s = AbstractC11895b.m32000s("(thread ", threadCurrentThread.getName(), threadCurrentThread.getId(), " ");
        sbM32000s.append(") ");
        sb4.append(sbM32000s.toString());
        sb4.append(AbstractC34111i.m107840a(event.level) + " | ");
        String str = event.messageTag;
        if (str != null) {
            sb4.append(str.concat(": "));
        }
        sb4.append(event.message);
        Throwable th3 = event.throwable;
        if (th3 != null) {
            try {
                sb4.append("\n" + INSTANCE.m107843b(th3));
            } catch (Throwable unused) {
                System.err.println("Failed to log stack trace");
            }
        }
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }
}
