package p391p2;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import e93.AbstractC12889b;
import org.xmlpull.v1.XmlPullParser;
import p014aj.C0929d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C28737a {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f116313a;

    /* JADX INFO: renamed from: b */
    public int f116314b = 0;

    /* JADX INFO: renamed from: c */
    public final C0929d f116315c;

    public C28737a(XmlResourceParser xmlResourceParser) {
        this.f116313a = xmlResourceParser;
        C0929d c0929d = new C0929d();
        c0929d.f3422w = new float[64];
        this.f116315c = c0929d;
    }

    /* JADX INFO: renamed from: a */
    public final float m87480a(TypedArray typedArray, String str, int i13, float f13) {
        if (AbstractC12889b.m36246L(this.f116313a, str)) {
            f13 = typedArray.getFloat(i13, f13);
        }
        m87481b(typedArray.getChangingConfigurations());
        return f13;
    }

    /* JADX INFO: renamed from: b */
    public final void m87481b(int i13) {
        this.f116314b = i13 | this.f116314b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28737a)) {
            return false;
        }
        C28737a c28737a = (C28737a) obj;
        return AbstractC22676k.m65745e(this.f116313a, c28737a.f116313a) && this.f116314b == c28737a.f116314b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f116314b) + (this.f116313a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb4.append(this.f116313a);
        sb4.append(", config=");
        return AbstractC11895b.m31999r(sb4, this.f116314b, ')');
    }
}
