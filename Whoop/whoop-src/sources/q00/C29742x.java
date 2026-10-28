package q00;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import se.AbstractC32417h;
import y00.AbstractC38794c0;

/* JADX INFO: renamed from: q00.x */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C29742x implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4339a f121641E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f121642F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f121643G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121644w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f121645x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f121646y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f121647z;

    public /* synthetic */ C29742x(String str, String str2, float f13, boolean z4, InterfaceC4339a interfaceC4339a, int i13) {
        this.f121646y = str;
        this.f121643G = str2;
        this.f121647z = f13;
        this.f121645x = z4;
        this.f121641E = interfaceC4339a;
        this.f121642F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f121644w) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC32417h.m101198g(this.f121646y, (String) this.f121643G, this.f121647z, this.f121645x, this.f121641E, (Composer) obj, AbstractC28683x.m87244L(this.f121642F | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                AbstractC32417h.m101197f((AbstractC38794c0) this.f121643G, this.f121645x, this.f121646y, this.f121647z, this.f121641E, (Composer) obj, AbstractC28683x.m87244L(this.f121642F | 1));
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C29742x(AbstractC38794c0 abstractC38794c0, boolean z4, String str, float f13, InterfaceC4339a interfaceC4339a, int i13) {
        this.f121643G = abstractC38794c0;
        this.f121645x = z4;
        this.f121646y = str;
        this.f121647z = f13;
        this.f121641E = interfaceC4339a;
        this.f121642F = i13;
    }
}
