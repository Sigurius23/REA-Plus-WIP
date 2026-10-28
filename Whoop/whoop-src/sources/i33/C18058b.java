package i33;

import org.webrtc.RtpTransceiver;
import p715kotlin.jvm.internal.AbstractC22676k;
import stream.video.sfu.models.PublishOption;

/* JADX INFO: renamed from: i33.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C18058b {

    /* JADX INFO: renamed from: a */
    public final PublishOption f70143a;

    /* JADX INFO: renamed from: b */
    public final RtpTransceiver f70144b;

    public C18058b(RtpTransceiver rtpTransceiver, PublishOption publishOption) {
        this.f70143a = publishOption;
        this.f70144b = rtpTransceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18058b)) {
            return false;
        }
        C18058b c18058b = (C18058b) obj;
        return AbstractC22676k.m65745e(this.f70143a, c18058b.f70143a) && AbstractC22676k.m65745e(this.f70144b, c18058b.f70144b);
    }

    public final int hashCode() {
        return this.f70144b.hashCode() + (this.f70143a.hashCode() * 31);
    }

    public final String toString() {
        return "TransceiverId(publishOption=" + this.f70143a + ", transceiver=" + this.f70144b + ")";
    }
}
