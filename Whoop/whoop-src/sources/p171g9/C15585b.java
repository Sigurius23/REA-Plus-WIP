package p171g9;

import android.view.accessibility.AccessibilityNodeInfo;
import ce3.C4497a0;
import p482s7.AbstractC32237a;
import p516u8.C34626x;

/* JADX INFO: renamed from: g9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C15585b {

    /* JADX INFO: renamed from: a */
    public final Object f58535a;

    public C15585b() {
        this.f58535a = new Object();
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC15584a m43880a(AbstractC32237a abstractC32237a) {
        C4497a0 c4497a0 = new C4497a0(3);
        abstractC32237a.getClass();
        new C15594k(null, c4497a0);
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public static C15585b m43881c(int i13, int i14, int i15, boolean z4) {
        return new C15585b(AccessibilityNodeInfo.CollectionInfo.obtain(i13, i14, z4, i15));
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC15591h m43882b(C34626x c34626x) {
        c34626x.f145867b.getClass();
        c34626x.f145867b.getClass();
        return InterfaceC15591h.f58541a;
    }

    public C15585b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
        this.f58535a = collectionInfo;
    }
}
