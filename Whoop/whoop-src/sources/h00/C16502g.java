package h00;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import h40.C16845k;
import l83.C23454a0;
import p114eb.C12991u0;
import p133f1.C13921a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p507tx.AbstractC34235f;
import p599wz.AbstractC37713e1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: h00.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C16502g implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f63426E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4351m f63427F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Function1 f63428G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC4339a f63429H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC4339a f63430I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Function1 f63431J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ InterfaceC4339a f63432K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ InterfaceC4339a f63433L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ AbstractC37713e1 f63434M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ InterfaceC28601c1 f63435N;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Modifier f63436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f63437x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16508j f63438y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C16845k f63439z;

    public C16502g(Modifier modifier, C12991u0 c12991u0, C16508j c16508j, C16845k c16845k, Function1 function1, InterfaceC4351m interfaceC4351m, Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, Function1 function3, InterfaceC4339a interfaceC4339a3, InterfaceC4339a interfaceC4339a4, AbstractC37713e1 abstractC37713e1, InterfaceC28601c1 interfaceC28601c1) {
        this.f63436w = modifier;
        this.f63437x = c12991u0;
        this.f63438y = c16508j;
        this.f63439z = c16845k;
        this.f63426E = function1;
        this.f63427F = interfaceC4351m;
        this.f63428G = function2;
        this.f63429H = interfaceC4339a;
        this.f63430I = interfaceC4339a2;
        this.f63431J = function3;
        this.f63432K = interfaceC4339a3;
        this.f63433L = interfaceC4339a4;
        this.f63434M = abstractC37713e1;
        this.f63435N = interfaceC28601c1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x005f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q;
        Object objM87133R;
        C28676v0 c28676v0;
        C16845k c16845k;
        boolean zM87157i;
        Object objM87133R2;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                interfaceC28601c1 = this.f63435N;
                Function3 function3 = (Function3) interfaceC28601c1.getValue();
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-645239907);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = new C13921a0(15, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function1 = (Function1) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87150e0(-645235667);
                c16845k = this.f63439z;
                zM87157i = c28655q.m87157i(c16845k);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    objM87133R2 = new C16500f(c16845k, null, 0);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC34235f.m108221g(this.f63436w, this.f63437x, this.f63438y, function3, function1, (Function1) objM87133R2, this.f63426E, this.f63427F, this.f63428G, this.f63429H, this.f63430I, this.f63431J, this.f63432K, this.f63433L, this.f63434M, c28655q, 24576);
            }
        } else {
            interfaceC28601c1 = this.f63435N;
            Function3 function4 = (Function3) interfaceC28601c1.getValue();
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-645239907);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13921a0(15, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function2 = (Function1) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(-645235667);
            c16845k = this.f63439z;
            zM87157i = c28655q.m87157i(c16845k);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                objM87133R2 = new C16500f(c16845k, null, 0);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C16500f(c16845k, null, 0);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC34235f.m108221g(this.f63436w, this.f63437x, this.f63438y, function4, function2, (Function1) objM87133R2, this.f63426E, this.f63427F, this.f63428G, this.f63429H, this.f63430I, this.f63431J, this.f63432K, this.f63433L, this.f63434M, c28655q, 24576);
        }
        return C23454a0.f92919a;
    }
}
