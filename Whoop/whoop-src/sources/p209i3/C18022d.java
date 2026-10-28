package p209i3;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C18022d {

    /* JADX INFO: renamed from: a */
    public final String f69938a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4339a f69939b;

    public C18022d(String str, InterfaceC4339a interfaceC4339a) {
        this.f69938a = str;
        this.f69939b = interfaceC4339a;
    }

    /* JADX INFO: renamed from: a */
    public final String m51768a() {
        return this.f69938a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18022d)) {
            return false;
        }
        C18022d c18022d = (C18022d) obj;
        return AbstractC22676k.m65745e(this.f69938a, c18022d.f69938a) && this.f69939b == c18022d.f69939b;
    }

    public final int hashCode() {
        return this.f69939b.hashCode() + (this.f69938a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomAccessibilityAction(label=" + this.f69938a + ", action=" + this.f69939b + ')';
    }
}
