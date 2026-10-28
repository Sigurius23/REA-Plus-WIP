package c43;

import org.webrtc.AudioTrack;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4185a extends AbstractC4191g {

    /* JADX INFO: renamed from: a */
    public final String f17022a;

    /* JADX INFO: renamed from: b */
    public final AudioTrack f17023b;

    public C4185a(String streamId, AudioTrack audioTrack) {
        AbstractC22676k.m65750j(streamId, "streamId");
        this.f17022a = streamId;
        this.f17023b = audioTrack;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4185a)) {
            return false;
        }
        C4185a c4185a = (C4185a) obj;
        return AbstractC22676k.m65745e(this.f17022a, c4185a.f17022a) && AbstractC22676k.m65745e(this.f17023b, c4185a.f17023b);
    }

    public final int hashCode() {
        return this.f17023b.hashCode() + (this.f17022a.hashCode() * 31);
    }

    public final String toString() {
        return "AudioTrack(streamId=" + this.f17022a + ", audio=" + this.f17023b + ")";
    }
}
