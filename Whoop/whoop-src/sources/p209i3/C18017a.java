package p209i3;

import l83.InterfaceC23459e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C18017a {

    /* JADX INFO: renamed from: a */
    public final String f69928a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC23459e f69929b;

    public C18017a(String str, InterfaceC23459e interfaceC23459e) {
        this.f69928a = str;
        this.f69929b = interfaceC23459e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18017a)) {
            return false;
        }
        C18017a c18017a = (C18017a) obj;
        return AbstractC22676k.m65745e(this.f69928a, c18017a.f69928a) && AbstractC22676k.m65745e(this.f69929b, c18017a.f69929b);
    }

    public final int hashCode() {
        String str = this.f69928a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        InterfaceC23459e interfaceC23459e = this.f69929b;
        return iHashCode + (interfaceC23459e != null ? interfaceC23459e.hashCode() : 0);
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f69928a + ", action=" + this.f69929b + ')';
    }
}
