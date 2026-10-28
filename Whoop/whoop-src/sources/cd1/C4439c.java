package cd1;

import bc3.InterfaceC2994c0;
import bf0.C3196h;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p163g1.C14947a0;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p209i3.AbstractC18029k;
import p209i3.AbstractC18041w;
import p209i3.C18017a;
import p209i3.C18030l;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;
import p748zc1.EnumC40298d0;

/* JADX INFO: renamed from: cd1.c */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4439c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17917w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15199y3 f17918x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f17919y;

    public /* synthetic */ C4439c(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        this.f17919y = interfaceC2994c0;
        this.f17918x = c15199y3;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f17917w;
        InterfaceC2994c0 interfaceC2994c0 = this.f17919y;
        C15199y3 c15199y3 = this.f17918x;
        switch (i13) {
            case 0:
                return AtomicGalleryFragment.m21124N0(interfaceC2994c0, c15199y3, (EnumC40298d0) obj);
            default:
                C14947a0 c14947a0 = c15199y3.f57060b;
                InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
                if (c15199y3.m43224e()) {
                    C3196h c3196h = new C3196h(c15199y3, interfaceC2994c0, 9);
                    InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                    C18030l c18030l = (C18030l) interfaceC18044z;
                    c18030l.m51772e(AbstractC18029k.f69974u, new C18017a(null, c3196h));
                    Object value = c14947a0.f55770g.getValue();
                    EnumC15209z3 enumC15209z3 = EnumC15209z3.f57108y;
                    if (value == enumC15209z3) {
                        c18030l.m51772e(AbstractC18029k.f69972s, new C18017a(null, new C3196h(c15199y3, interfaceC2994c0, 6)));
                    } else if (c14947a0.m43070e().f56384a.containsKey(enumC15209z3)) {
                        c18030l.m51772e(AbstractC18029k.f69973t, new C18017a(null, new C3196h(c15199y3, interfaceC2994c0, 7)));
                    }
                }
                return C23454a0.f92919a;
        }
    }

    public /* synthetic */ C4439c(C15199y3 c15199y3, InterfaceC2994c0 interfaceC2994c0) {
        this.f17918x = c15199y3;
        this.f17919y = interfaceC2994c0;
    }
}
