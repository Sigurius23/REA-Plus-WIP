package p163g1;

import c93.InterfaceC4339a;
import d42.C11699o;
import iy0.C21026a;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p209i3.AbstractC18039u;
import p209i3.AbstractC18041w;
import p209i3.C18043y;
import p209i3.InterfaceC18044z;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.g2 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15015g2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56182w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f56183x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f56184y;

    public /* synthetic */ C15015g2(int i13, String str, InterfaceC4339a interfaceC4339a) {
        this.f56182w = i13;
        this.f56183x = str;
        this.f56184y = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56182w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC4339a interfaceC4339a = this.f56184y;
        String str = this.f56183x;
        InterfaceC18044z interfaceC18044z = (InterfaceC18044z) obj;
        switch (i13) {
            case 0:
                AbstractC18041w.m51806e(str, interfaceC18044z);
                AbstractC18041w.m51804c(interfaceC18044z, new C11699o(interfaceC4339a, 26));
                break;
            case 1:
                AbstractC18041w.m51806e(str, interfaceC18044z);
                AbstractC18041w.m51804c(interfaceC18044z, new C11699o(interfaceC4339a, 27));
                break;
            default:
                InterfaceC21493z[] interfaceC21493zArr = AbstractC18041w.f70062a;
                C18043y c18043y = AbstractC18039u.f70052s;
                InterfaceC21493z interfaceC21493z = AbstractC18041w.f70062a[10];
                c18043y.m51817a(interfaceC18044z, Float.valueOf(1.0f));
                AbstractC18041w.m51806e(str, interfaceC18044z);
                AbstractC18041w.m51804c(interfaceC18044z, new C21026a(interfaceC4339a, 22));
                break;
        }
        return c23454a0;
    }
}
