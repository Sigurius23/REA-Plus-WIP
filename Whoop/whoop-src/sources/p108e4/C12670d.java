package p108e4;

import f93.AbstractC14290b;
import j93.InterfaceC21493z;
import p210i4.C18063e;
import p210i4.C18065g;

/* JADX INFO: renamed from: e4.d */
/* JADX INFO: loaded from: classes.dex */
public final class C12670d extends AbstractC14290b {

    /* JADX INFO: renamed from: w */
    public final String f43321w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12671e f43322x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12670d(C12671e c12671e, float f13, String str) {
        super(Float.valueOf(f13));
        this.f43322x = c12671e;
        this.f43321w = str;
    }

    @Override // f93.AbstractC14290b
    public final void afterChange(InterfaceC21493z interfaceC21493z, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        float fFloatValue = ((Number) obj2).floatValue();
        if (Float.isNaN(fFloatValue)) {
            return;
        }
        C18065g c18065g = this.f43322x.f43325b;
        String name = this.f43321w;
        if (name == null) {
            name = interfaceC21493z.getName();
        }
        c18065g.m51891B(name, new C18063e(fFloatValue));
    }
}
