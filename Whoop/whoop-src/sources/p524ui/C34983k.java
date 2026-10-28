package p524ui;

import android.graphics.Matrix;
import c93.InterfaceC4339a;
import e93.AbstractC12889b;
import java.util.HashSet;
import java.util.Map;
import l83.C23454a0;
import p181h2.C16620e;
import p208i2.AbstractC17876d;
import p208i2.InterfaceC17915v;
import p249jc.AbstractC21598x;
import p270k2.InterfaceC22131e;
import p390p1.InterfaceC28601c1;
import p426qi.C30387i;
import p426qi.C30402w;
import p426qi.EnumC30371a;
import p426qi.EnumC30384g0;
import p426qi.EnumC30403x;
import p477s2.AbstractC32076h;
import p635y2.AbstractC39122p1;
import p635y2.InterfaceC39105k;
import p636y3.EnumC39181m;
import p682zi.C40653c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: ui.k */
/* JADX INFO: loaded from: classes.dex */
public final class C34983k extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Map f148029E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C34998z f148030F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4339a f148031G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC28601c1 f148032H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C30387i f148033w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39105k f148034x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Matrix f148035y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C30402w f148036z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34983k(C30387i c30387i, InterfaceC39105k interfaceC39105k, Matrix matrix, C30402w c30402w, Map map, C34998z c34998z, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1) {
        super(1);
        this.f148033w = c30387i;
        this.f148034x = interfaceC39105k;
        this.f148035y = matrix;
        this.f148036z = c30402w;
        this.f148029E = map;
        this.f148030F = c34998z;
        this.f148031G = interfaceC4339a;
        this.f148032H = interfaceC28601c1;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC22131e Canvas = (InterfaceC22131e) obj;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC17915v interfaceC17915vM716w = Canvas.mo744t0().m716w();
        C30387i c30387i = this.f148033w;
        long jM60672b = AbstractC21598x.m60672b(c30387i.f124691k.width(), c30387i.f124691k.height());
        long jM113228a = AbstractC35744b.m113228a(AbstractC12889b.m36258X(C16620e.m47213e(Canvas.mo731d())), AbstractC12889b.m36258X(C16620e.m47211c(Canvas.mo731d())));
        long jMo124615a = this.f148034x.mo124615a(jM60672b, Canvas.mo731d());
        float fM47213e = C16620e.m47213e(jM60672b);
        int i13 = AbstractC39122p1.f168258a;
        int i14 = (int) (jMo124615a >> 32);
        int i15 = (int) (jMo124615a & 4294967295L);
        long jM113228a2 = AbstractC35744b.m113228a((int) (Float.intBitsToFloat(i14) * fM47213e), (int) (Float.intBitsToFloat(i15) * C16620e.m47211c(jM60672b)));
        float f13 = 1;
        long jRound = (((long) Math.round(((Canvas.getLayoutDirection() == EnumC39181m.f168423w ? 0.0f : (-1) * 0.0f) + f13) * ((((int) (jM113228a >> 32)) - ((int) (jM113228a2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((f13 + 0.0f) * ((((int) (jM113228a & 4294967295L)) - ((int) (jM113228a2 & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.f148035y;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i14), Float.intBitsToFloat(i15));
        C30402w c30402w = this.f148036z;
        boolean zRemove = ((HashSet) c30402w.f124738L.f2818x).remove(EnumC30403x.f124773w);
        if (c30402w.f124769w != null && zRemove) {
            c30402w.m92877c();
        }
        c30402w.f124748V = EnumC30384g0.f124675w;
        c30402w.m92879e();
        c30402w.f124764l0 = EnumC30371a.f124606w;
        c30402w.m92889p(c30387i);
        Map map = c30402w.f124736J;
        Map map2 = this.f148029E;
        if (map2 != map) {
            c30402w.f124736J = map2;
            c30402w.invalidateSelf();
        }
        InterfaceC28601c1 interfaceC28601c1 = this.f148032H;
        C34998z c34998z = (C34998z) interfaceC28601c1.getValue();
        C34998z c34998z2 = this.f148030F;
        if (c34998z2 != c34998z) {
            C34998z c34998z3 = (C34998z) interfaceC28601c1.getValue();
            if (c34998z3 != null) {
                for (C34970a0 c34970a0 : c34998z3.f148054a) {
                    c30402w.m92875a(c34970a0.m110465b(), c34970a0.m110466c(), null);
                }
                for (C34970a0 c34970a1 : c34998z3.f148055b) {
                    c30402w.m92875a(c34970a1.m110465b(), c34970a1.m110466c(), null);
                }
                for (C34970a0 c34970a2 : c34998z3.f148056c) {
                    c30402w.m92875a(c34970a2.m110465b(), c34970a2.m110466c(), null);
                }
                for (C34970a0 c34970a3 : c34998z3.f148057d) {
                    c30402w.m92875a(c34970a3.m110465b(), c34970a3.m110466c(), null);
                }
                for (C34970a0 c34970a4 : c34998z3.f148058e) {
                    c30402w.m92875a(c34970a4.m110465b(), c34970a4.m110466c(), null);
                }
                for (C34970a0 c34970a5 : c34998z3.f148059f) {
                    c30402w.m92875a(c34970a5.m110465b(), c34970a5.m110466c(), null);
                }
                for (C34970a0 c34970a6 : c34998z3.f148060g) {
                    c30402w.m92875a(c34970a6.m110465b(), c34970a6.m110466c(), null);
                }
                for (C34970a0 c34970a7 : c34998z3.f148061h) {
                    c30402w.m92875a(c34970a7.m110465b(), c34970a7.m110466c(), null);
                }
                for (C34970a0 c34970a8 : c34998z3.f148062i) {
                    c30402w.m92875a(c34970a8.m110465b(), c34970a8.m110466c(), null);
                }
            }
            if (c34998z2 != null) {
                for (C34970a0 c34970a9 : c34998z2.f148054a) {
                    c30402w.m92875a(c34970a9.m110465b(), c34970a9.m110466c(), AbstractC32076h.m99773f(c34970a9.m110464a()));
                }
                for (C34970a0 c34970a10 : c34998z2.f148055b) {
                    c30402w.m92875a(c34970a10.m110465b(), c34970a10.m110466c(), AbstractC32076h.m99773f(c34970a10.m110464a()));
                }
                for (C34970a0 c34970a11 : c34998z2.f148056c) {
                    c30402w.m92875a(c34970a11.m110465b(), c34970a11.m110466c(), AbstractC32076h.m99773f(c34970a11.m110464a()));
                }
                for (C34970a0 c34970a12 : c34998z2.f148057d) {
                    c30402w.m92875a(c34970a12.m110465b(), c34970a12.m110466c(), AbstractC32076h.m99773f(c34970a12.m110464a()));
                }
                for (C34970a0 c34970a13 : c34998z2.f148058e) {
                    c30402w.m92875a(c34970a13.m110465b(), c34970a13.m110466c(), AbstractC32076h.m99773f(c34970a13.m110464a()));
                }
                for (C34970a0 c34970a14 : c34998z2.f148059f) {
                    c30402w.m92875a(c34970a14.m110465b(), c34970a14.m110466c(), AbstractC32076h.m99773f(c34970a14.m110464a()));
                }
                for (C34970a0 c34970a15 : c34998z2.f148060g) {
                    c30402w.m92875a(c34970a15.m110465b(), c34970a15.m110466c(), AbstractC32076h.m99773f(c34970a15.m110464a()));
                }
                for (C34970a0 c34970a16 : c34998z2.f148061h) {
                    c30402w.m92875a(c34970a16.m110465b(), c34970a16.m110466c(), AbstractC32076h.m99773f(c34970a16.m110464a()));
                }
                for (C34970a0 c34970a17 : c34998z2.f148062i) {
                    c30402w.m92875a(c34970a17.m110465b(), c34970a17.m110466c(), AbstractC32076h.m99773f(c34970a17.m110464a()));
                }
            }
            interfaceC28601c1.setValue(c34998z2);
        }
        if (c30402w.f124744R) {
            c30402w.f124744R = false;
            C40653c c40653c = c30402w.f124741O;
            if (c40653c != null) {
                c40653c.mo131934o(false);
            }
        }
        c30402w.f124745S = false;
        c30402w.f124739M = false;
        if (true != c30402w.f124740N) {
            c30402w.f124740N = true;
            C40653c c40653c2 = c30402w.f124741O;
            if (c40653c2 != null) {
                c40653c2.f175497L = true;
            }
            c30402w.invalidateSelf();
        }
        c30402w.m92896w(((Number) this.f148031G.invoke()).floatValue());
        c30402w.setBounds(0, 0, c30387i.f124691k.width(), c30387i.f124691k.height());
        c30402w.m92880g(AbstractC17876d.m51433a(interfaceC17915vM716w), matrix);
        return C23454a0.f92919a;
    }
}
