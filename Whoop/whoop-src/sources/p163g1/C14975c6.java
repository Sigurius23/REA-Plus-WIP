package p163g1;

import android.view.KeyEvent;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import i93.InterfaceC18280f;
import p390p1.InterfaceC28601c1;
import p477s2.AbstractC32070b;
import p477s2.AbstractC32073e;
import p477s2.AbstractC32076h;
import p477s2.C32071c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: g1.c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14975c6 implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ float f55953E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f55954F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC28601c1 f55955G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f55956w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC18280f f55957x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f55958y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28601c1 f55959z;

    public C14975c6(boolean z4, InterfaceC18280f interfaceC18280f, int i13, InterfaceC28601c1 interfaceC28601c1, float f13, boolean z13, InterfaceC28601c1 interfaceC28601c2) {
        this.f55956w = z4;
        this.f55957x = interfaceC18280f;
        this.f55958y = i13;
        this.f55959z = interfaceC28601c1;
        this.f55953E = f13;
        this.f55954F = z13;
        this.f55955G = interfaceC28601c2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((C32071c) obj).f133019a;
        if (!this.f55956w) {
            return Boolean.FALSE;
        }
        int iM99720L = AbstractC32073e.m99720L(keyEvent);
        boolean z4 = false;
        if (iM99720L == 2) {
            InterfaceC18280f interfaceC18280f = this.f55957x;
            float fAbs = Math.abs(((Number) interfaceC18280f.mo52651d()).floatValue() - ((Number) interfaceC18280f.getStart()).floatValue());
            int i13 = this.f55958y;
            int i14 = i13 > 0 ? i13 + 1 : 100;
            float f13 = fAbs / i14;
            long jM99769b = AbstractC32076h.m99769b(keyEvent.getKeyCode());
            boolean zM99689a = AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133004d);
            float f14 = this.f55953E;
            InterfaceC28601c1 interfaceC28601c1 = this.f55959z;
            if (zM99689a) {
                ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf(f14 + f13), interfaceC18280f));
            } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133005e)) {
                ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf(f14 - f13), interfaceC18280f));
            } else {
                boolean zM99689a2 = AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133007g);
                boolean z13 = this.f55954F;
                if (zM99689a2) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf(((z13 ? -1 : 1) * f13) + f14), interfaceC18280f));
                } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133006f)) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf(f14 - ((z13 ? -1 : 1) * f13)), interfaceC18280f));
                } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133013m)) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(interfaceC18280f.getStart());
                } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133014n)) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(interfaceC18280f.mo52651d());
                } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133015o)) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf(f14 - (AbstractC12889b.m36284n(i14 / 10, 1, 10) * f13)), interfaceC18280f));
                } else if (AbstractC32070b.m99689a(jM99769b, AbstractC32070b.f133016p)) {
                    ((Function1) interfaceC28601c1.getValue()).invoke(AbstractC12889b.m36288r(Float.valueOf((AbstractC12889b.m36284n(i14 / 10, 1, 10) * f13) + f14), interfaceC18280f));
                }
            }
            z4 = true;
        } else if (iM99720L == 1) {
            long jM99769b2 = AbstractC32076h.m99769b(keyEvent.getKeyCode());
            if (AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133004d) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133005e) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133007g) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133006f) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133013m) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133014n) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133015o) || AbstractC32070b.m99689a(jM99769b2, AbstractC32070b.f133016p)) {
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f55955G.getValue();
                if (interfaceC4339a != null) {
                    interfaceC4339a.invoke();
                }
                z4 = true;
            }
        }
        return Boolean.valueOf(z4);
    }
}
