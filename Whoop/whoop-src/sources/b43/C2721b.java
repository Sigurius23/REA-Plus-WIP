package b43;

import b23.EnumC2341g;
import org.webrtc.Logging;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2721b {

    /* JADX INFO: renamed from: a */
    public final EnumC2341g f10730a;

    /* JADX INFO: renamed from: b */
    public final EnumC2720a f10731b;

    /* JADX INFO: renamed from: c */
    public final Logging.Severity f10732c;

    public C2721b(int i13) {
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        EnumC2720a httpLoggingLevel = EnumC2720a.BASIC;
        Logging.Severity webRtcLoggingLevel = Logging.Severity.LS_NONE;
        AbstractC22676k.m65750j(httpLoggingLevel, "httpLoggingLevel");
        AbstractC22676k.m65750j(webRtcLoggingLevel, "webRtcLoggingLevel");
        this.f10730a = enumC2341g;
        this.f10731b = httpLoggingLevel;
        this.f10732c = webRtcLoggingLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2721b)) {
            return false;
        }
        C2721b c2721b = (C2721b) obj;
        return this.f10730a == c2721b.f10730a && this.f10731b == c2721b.f10731b && this.f10732c == c2721b.f10732c;
    }

    public final int hashCode() {
        return this.f10732c.hashCode() + ((this.f10731b.hashCode() + (this.f10730a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoggingLevel(priority=" + this.f10730a + ", httpLoggingLevel=" + this.f10731b + ", webRtcLoggingLevel=" + this.f10732c + ")";
    }
}
