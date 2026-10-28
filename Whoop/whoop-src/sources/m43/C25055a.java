package m43;

import io.getstream.video.android.model.StreamCallId;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import t23.C33366b4;

/* JADX INFO: renamed from: m43.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C25055a {

    /* JADX INFO: renamed from: a */
    public final C33366b4 f98180a;

    /* JADX INFO: renamed from: b */
    public final StreamCallId f98181b;

    /* JADX INFO: renamed from: c */
    public final String f98182c;

    /* JADX INFO: renamed from: d */
    public final String f98183d;

    public C25055a(C33366b4 c33366b4, StreamCallId streamCallId, String str, String str2) {
        this.f98180a = c33366b4;
        this.f98181b = streamCallId;
        this.f98182c = str;
        this.f98183d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25055a)) {
            return false;
        }
        C25055a c25055a = (C25055a) obj;
        return AbstractC22676k.m65745e(this.f98180a, c25055a.f98180a) && AbstractC22676k.m65745e(this.f98181b, c25055a.f98181b) && AbstractC22676k.m65745e(this.f98182c, c25055a.f98182c) && AbstractC22676k.m65745e(this.f98183d, c25055a.f98183d);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.f98181b.hashCode() + (this.f98180a.hashCode() * 31)) * 31, 31, this.f98182c);
        String str = this.f98183d;
        return iM30450d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CallIntentParams(streamVideo=");
        sb4.append(this.f98180a);
        sb4.append(", callId=");
        sb4.append(this.f98181b);
        sb4.append(", trigger=");
        return AbstractC11266d.m30464r(sb4, this.f98182c, ", displayName=", this.f98183d, ")");
    }
}
