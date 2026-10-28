package ge3;

import com.squareup.wire.AbstractC5583n;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C15748d extends Handler {

    /* JADX INFO: renamed from: a */
    public static final C15748d f59411a = new C15748d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        AbstractC22676k.m65750j(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = AbstractC15747c.f59409a;
        String loggerName = record.getLoggerName();
        AbstractC22676k.m65749i(loggerName, "getLoggerName(...)");
        int iM16783i = AbstractC5583n.m16783i(record);
        String message = record.getMessage();
        AbstractC22676k.m65749i(message, "getMessage(...)");
        AbstractC15747c.m44417a(iM16783i, loggerName, message, record.getThrown());
    }
}
