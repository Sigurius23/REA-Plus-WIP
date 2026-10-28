package g43;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g43.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C15477n {

    /* JADX INFO: renamed from: a */
    public final C15476m f58132a;

    /* JADX INFO: renamed from: b */
    public final C15476m f58133b;

    /* JADX INFO: renamed from: c */
    public final C15476m f58134c;

    /* JADX INFO: renamed from: d */
    public final C15476m f58135d;

    /* JADX INFO: renamed from: e */
    public final C15476m f58136e;

    /* JADX INFO: renamed from: f */
    public final C15476m f58137f;

    public C15477n(C15476m c15476m, C15476m c15476m2, C15476m c15476m3, C15476m c15476m4, C15476m c15476m5, C15476m c15476m6) {
        this.f58132a = c15476m;
        this.f58133b = c15476m2;
        this.f58134c = c15476m3;
        this.f58135d = c15476m4;
        this.f58136e = c15476m5;
        this.f58137f = c15476m6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15477n)) {
            return false;
        }
        C15477n c15477n = (C15477n) obj;
        return AbstractC22676k.m65745e(this.f58132a, c15477n.f58132a) && AbstractC22676k.m65745e(this.f58133b, c15477n.f58133b) && AbstractC22676k.m65745e(this.f58134c, c15477n.f58134c) && AbstractC22676k.m65745e(this.f58135d, c15477n.f58135d) && AbstractC22676k.m65745e(this.f58136e, c15477n.f58136e) && AbstractC22676k.m65745e(this.f58137f, c15477n.f58137f);
    }

    public final int hashCode() {
        return this.f58137f.hashCode() + ((this.f58136e.hashCode() + ((this.f58135d.hashCode() + ((this.f58134c.hashCode() + ((this.f58133b.hashCode() + (this.f58132a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StreamNotificationChannels(incomingCallChannel=" + this.f58132a + ", ongoingCallChannel=" + this.f58133b + ", outgoingCallChannel=" + this.f58134c + ", missedCallChannel=" + this.f58135d + ", missedCallLowImportanceChannel=" + this.f58136e + ", incomingCallLowImportanceChannel=" + this.f58137f + ")";
    }
}
