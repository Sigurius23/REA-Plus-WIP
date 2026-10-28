package j43;

import io.getstream.video.android.model.StreamCallId;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: j43.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C21325i {

    /* JADX INFO: renamed from: a */
    public final StreamCallId f81540a;

    /* JADX INFO: renamed from: b */
    public final String f81541b;

    /* JADX INFO: renamed from: c */
    public final String f81542c;

    /* JADX INFO: renamed from: d */
    public final C21319c f81543d;

    public C21325i(StreamCallId callId, String str, String str2, C21319c c21319c) {
        AbstractC22676k.m65750j(callId, "callId");
        this.f81540a = callId;
        this.f81541b = str;
        this.f81542c = str2;
        this.f81543d = c21319c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21325i)) {
            return false;
        }
        C21325i c21325i = (C21325i) obj;
        return AbstractC22676k.m65745e(this.f81540a, c21325i.f81540a) && AbstractC22676k.m65745e(this.f81541b, c21325i.f81541b) && AbstractC22676k.m65745e(this.f81542c, c21325i.f81542c) && AbstractC22676k.m65745e(this.f81543d, c21325i.f81543d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f81540a.hashCode() * 31, 31, this.f81541b);
        String str = this.f81542c;
        return this.f81543d.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "StartServiceParam(callId=" + this.f81540a + ", trigger=" + this.f81541b + ", callDisplayName=" + this.f81542c + ", callServiceConfiguration=" + this.f81543d + ")";
    }
}
