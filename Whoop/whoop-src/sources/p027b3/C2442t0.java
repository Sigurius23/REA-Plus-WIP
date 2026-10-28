package p027b3;

import android.content.Context;
import android.graphics.Rect;
import android.view.Choreographer;
import androidx.compose.p018ui.layout.AbstractC1133c;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.EnumC1635w;
import androidx.lifecycle.InterfaceC1585g0;
import c93.InterfaceC4351m;
import gb.C15648i;
import gb.C15663x;
import i63.C18175n;
import i63.C18176o;
import i63.InterfaceC18174m;
import j63.AbstractC21387d;
import l83.C23454a0;
import p002a0.C0047q0;
import p002a0.C0057v0;
import p005a3.AbstractC0262w0;
import p005a3.C0253t0;
import p026b2.C2312r;
import p040c0.C3756l0;
import p114eb.C12991u0;
import p208i2.C17872b1;
import p208i2.C17905q;
import p222ij.AbstractC18583i;
import p222ij.C18579e;
import p222ij.C18580f;
import p222ij.C18581g;
import p222ij.C18582h;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p459rf.C31345p;
import p557vo.AbstractC36220b;
import p602x1.C37816b;
import p635y2.AbstractC39101i1;
import p635y2.AbstractC39104j1;
import p635y2.C39082c2;
import p635y2.C39086d2;
import p635y2.C39119o1;
import p635y2.C39120p;
import p635y2.InterfaceC39078b2;
import p635y2.InterfaceC39147y;
import p635y2.RunnableC39123q;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import r80.AbstractC31061c;
import z53.C40110b;

/* JADX INFO: renamed from: b3.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2442t0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9544w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9545x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2442t0(int i13, Object obj, Object obj2) {
        super(1);
        this.f9544w = i13;
        this.f9545x = obj;
        this.f9546y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9544w) {
            case 0:
                Context context = (Context) this.f9545x;
                Context applicationContext = context.getApplicationContext();
                ComponentCallbacks2C2447u0 componentCallbacks2C2447u0 = (ComponentCallbacks2C2447u0) this.f9546y;
                applicationContext.registerComponentCallbacks(componentCallbacks2C2447u0);
                return new C2437s0(0, context, componentCallbacks2C2447u0);
            case 1:
                Context context2 = (Context) this.f9545x;
                Context applicationContext2 = context2.getApplicationContext();
                ComponentCallbacks2C2452v0 componentCallbacks2C2452v0 = (ComponentCallbacks2C2452v0) this.f9546y;
                applicationContext2.registerComponentCallbacks(componentCallbacks2C2452v0);
                return new C2437s0(1, context2, componentCallbacks2C2452v0);
            case 2:
                C2353b1 c2353b1 = (C2353b1) this.f9545x;
                ChoreographerFrameCallbackC2358c1 choreographerFrameCallbackC2358c1 = (ChoreographerFrameCallbackC2358c1) this.f9546y;
                synchronized (c2353b1.f9304y) {
                    c2353b1.f9296E.remove(choreographerFrameCallbackC2358c1);
                }
                return C23454a0.f92919a;
            case 3:
                ((Choreographer) ((C2363d1) this.f9545x).f9328x).removeFrameCallback((ChoreographerFrameCallbackC2358c1) this.f9546y);
                return C23454a0.f92919a;
            case 4:
                C2416o c2416o = (C2416o) obj;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f9546y;
                C2460w3 c2460w3 = (C2460w3) this.f9545x;
                if (!c2460w3.f9606y) {
                    AbstractC1638x lifecycle = c2416o.f9472a.getLifecycle();
                    c2460w3.f9603E = interfaceC4351m;
                    if (c2460w3.f9607z == null) {
                        c2460w3.f9607z = lifecycle;
                        lifecycle.mo4986a(c2460w3);
                    } else if (lifecycle.getCurrentState().compareTo(EnumC1635w.f6327y) >= 0) {
                        c2460w3.f9605x.m87206A(new C37816b(new C2455v3(c2460w3, interfaceC4351m, 1), true, 1330788943));
                    }
                }
                return C23454a0.f92919a;
            case 5:
                ((AbstractC39101i1) obj).m124632f((AbstractC39104j1) this.f9545x, 0, 0, ((C3756l0) this.f9546y).f15351c.m87022x());
                return C23454a0.f92919a;
            case 6:
                ((C12991u0) this.f9545x).m36502O((InterfaceC1585g0) this.f9546y);
                return new C15663x();
            case 7:
                return new C2437s0(5, (InterfaceC28670t2) this.f9545x, (C15648i) this.f9546y);
            case 8:
                AbstractC39101i1.m124627s((AbstractC39101i1) obj, (AbstractC39104j1) this.f9545x, 0, 0, ((C17905q) this.f9546y).f69606O, 4);
                return C23454a0.f92919a;
            case 9:
                AbstractC39101i1.m124627s((AbstractC39101i1) obj, (AbstractC39104j1) this.f9545x, 0, 0, ((C17872b1) this.f9546y).f69555f0, 4);
                return C23454a0.f92919a;
            case 10:
                AbstractC18583i result = (AbstractC18583i) obj;
                String str = (String) this.f9546y;
                C18580f c18580f = (C18580f) this.f9545x;
                AbstractC22676k.m65750j(result, "result");
                if (result instanceof C18582h) {
                    c18580f.f72589c.m53801a(AbstractC31061c.m95633i(')', "onNativeMessage(", c18580f.m53798a(str, ((C18582h) result).f72593a, null)), C18579e.f72588w);
                } else if (result instanceof C18581g) {
                    c18580f.m53799b(str, ((C18581g) result).m53800a());
                }
                return C23454a0.f92919a;
            case 11:
                C40110b c40110b = (C40110b) obj;
                AbstractC22676k.m65750j(c40110b, "$this$null");
                ((Function1) this.f9545x).invoke(c40110b);
                ((C31345p) this.f9546y).invoke(c40110b);
                return C23454a0.f92919a;
            case 12:
                AbstractC22676k.m65750j(obj, "$this$null");
                Function1 function1 = (Function1) this.f9545x;
                if (function1 != null) {
                    function1.invoke(obj);
                }
                ((Function1) this.f9546y).invoke(obj);
                return C23454a0.f92919a;
            case 13:
                C0253t0 c0253t0 = (C0253t0) obj;
                C39119o1 c39119o1 = (C39119o1) this.f9545x;
                if (c39119o1.f168249O.f168262H.m87024x() > 0) {
                    c0253t0.f866w = true;
                    AbstractC0262w0 abstractC0262w0 = c0253t0.f869z;
                    InterfaceC39147y interfaceC39147yMo786L0 = abstractC0262w0.mo786L0();
                    if (C39178j.m124792b(c0253t0.f867x, 9223372034707292159L)) {
                        c0253t0.f867x = AbstractC36220b.m115291C(interfaceC39147yMo786L0.mo3516S(0L));
                        c0253t0.f868y = interfaceC39147yMo786L0.mo3541n();
                    }
                    abstractC0262w0.mo788N0().m643t().m754b();
                    long jMo3541n = interfaceC39147yMo786L0.mo3541n();
                    C0057v0 c0057v0 = ((RunnableC39123q) this.f9546y).f168261G;
                    int i13 = (int) (jMo3541n >> 32);
                    int i14 = (int) (jMo3541n & 4294967295L);
                    for (InterfaceC39078b2 interfaceC39078b2 : AbstractC1133c.f4851b) {
                        Object objM129g = c0057v0.m129g(interfaceC39078b2);
                        AbstractC22676k.m65747g(objM129g);
                        C39086d2 c39086d2 = (C39086d2) objM129g;
                        C39082c2 c39082c2 = (C39082c2) interfaceC39078b2;
                        AbstractC1133c.m3504a(c0253t0, c39082c2.f168138c, c39086d2.f168151h, i13, i14);
                        if (((Boolean) c39086d2.f168145b.getValue()).booleanValue()) {
                            AbstractC1133c.m3504a(c0253t0, c39086d2.f168149f, c39086d2.f168153j, i13, i14);
                            AbstractC1133c.m3504a(c0253t0, c39086d2.f168150g, c39086d2.f168154k, i13, i14);
                        }
                        AbstractC1133c.m3504a(c0253t0, c39082c2.f168139d, c39086d2.f168152i, i13, i14);
                    }
                    if (c39119o1.f168249O.f168263I.m105h()) {
                        C0047q0 c0047q0 = c39119o1.f168249O.f168263I;
                        Object[] objArr = c0047q0.f136a;
                        int i15 = c0047q0.f137b;
                        for (int i16 = 0; i16 < i15; i16++) {
                            InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) objArr[i16];
                            C39120p c39120p = (C39120p) c39119o1.f168249O.f168264J.get(i16);
                            Rect rect = (Rect) interfaceC28601c1.getValue();
                            c0253t0.m771a(c39120p.m124649b(), rect.left);
                            c0253t0.m771a(c39120p.m124651d(), rect.top);
                            c0253t0.m771a(c39120p.m124650c(), rect.right);
                            c0253t0.m771a(c39120p.m124648a(), rect.bottom);
                        }
                    }
                }
                return C23454a0.f92919a;
            default:
                C18175n buildHeaders = (C18175n) obj;
                AbstractC22676k.m65750j(buildHeaders, "$this$buildHeaders");
                int i17 = 8;
                ((C18176o) this.f9545x).mo52166c(new C2312r(buildHeaders, i17));
                InterfaceC18174m stringValues = ((AbstractC21387d) this.f9546y).mo60029c();
                AbstractC22676k.m65750j(stringValues, "stringValues");
                stringValues.mo52166c(new C2312r(buildHeaders, i17));
                return C23454a0.f92919a;
        }
    }
}
