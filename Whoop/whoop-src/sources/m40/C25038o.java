package m40;

import androidx.compose.animation.AbstractC1089a;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b30.C2656x4;
import c93.InterfaceC4351m;
import com.stripe.android.uicore.image.StripeImageState$Success;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p027b3.AbstractC2399k2;
import p208i2.AbstractC17921y;
import p291l0.InterfaceC23004v;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39105k;
import p636y3.C39169a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m40.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C25038o implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function3 f98088E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Function3 f98089F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Modifier f98090G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC2302h f98091H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC39105k f98092I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ AbstractC17921y f98093J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ String f98094w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25046w f98095x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f98096y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC26165a f98097z;

    public C25038o(String str, C25046w c25046w, boolean z4, AbstractC26165a abstractC26165a, Function3 function3, Function3 function4, Modifier modifier, InterfaceC2302h interfaceC2302h, InterfaceC39105k interfaceC39105k, AbstractC17921y abstractC17921y) {
        this.f98094w = str;
        this.f98095x = c25046w;
        this.f98096y = z4;
        this.f98097z = abstractC26165a;
        this.f98088E = function3;
        this.f98089F = function4;
        this.f98090G = modifier;
        this.f98091H = interfaceC2302h;
        this.f98092I = interfaceC39105k;
        this.f98093J = abstractC17921y;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28655q c28655q;
        boolean zBooleanValue;
        long j7;
        int i13;
        int iM124765i;
        int iM124764h;
        int i14;
        Object objM87133R;
        C28676v0 c28676v0;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z4;
        boolean zM87155h;
        Object objM87133R2;
        boolean zM87153g;
        Object objM87133R3;
        AbstractC26165a abstractC26165a;
        InterfaceC23004v BoxWithConstraints = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28655q = (C28655q) composer;
                zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
                j7 = ((C1101c) BoxWithConstraints).f4585b;
                i13 = (int) 0;
                if (C39169a.m124765i(j7) > i13 || C39169a.m124765i(j7) >= ((int) Float.POSITIVE_INFINITY)) {
                    iM124765i = -1;
                } else {
                    iM124765i = C39169a.m124765i(j7);
                }
                if (C39169a.m124764h(j7) > i13 || C39169a.m124764h(j7) >= ((int) Float.POSITIVE_INFINITY)) {
                    iM124764h = -1;
                } else {
                    iM124764h = C39169a.m124764h(j7);
                }
                if (iM124765i == -1) {
                    i14 = iM124764h;
                } else {
                    i14 = iM124765i;
                }
                if (iM124764h == -1) {
                    iM124764h = i14;
                }
                c28655q.m87150e0(-406660964);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    if (zBooleanValue || (abstractC26165a = this.f98097z) == null) {
                        objM87133R = AbstractC28683x.m87272z(C25047x.f98138b);
                    } else {
                        objM87133R = AbstractC28683x.m87272z(new StripeImageState$Success(abstractC26165a));
                    }
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c28655q.m87173q(false);
                c28655q.m87150e0(-406646816);
                if (!zBooleanValue) {
                    c28655q.m87150e0(-406645276);
                    boolean zM87157i = c28655q.m87157i(this.f98095x);
                    String str = this.f98094w;
                    zM87153g = zM87157i | c28655q.m87153g(str) | c28655q.m87149e(i14) | c28655q.m87149e(iM124764h);
                    objM87133R3 = c28655q.m87133R();
                    if (zM87153g || objM87133R3 == c28676v0) {
                        C25036m c25036m = new C25036m(this.f98095x, this.f98094w, i14, iM124764h, interfaceC28601c1, null);
                        c28655q.m87172p0(c25036m);
                        objM87133R3 = c25036m;
                    }
                    c28655q.m87173q(false);
                    AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, str);
                }
                c28655q.m87173q(false);
                Object value = interfaceC28601c1.getValue();
                c28655q.m87150e0(-406627749);
                z4 = this.f98096y;
                zM87155h = c28655q.m87155h(z4);
                objM87133R2 = c28655q.m87133R();
                if (zM87155h || objM87133R2 == c28676v0) {
                    objM87133R2 = new C2656x4(z4, 8);
                    c28655q.m87172p0(objM87133R2);
                }
                c28655q.m87173q(false);
                AbstractC1089a.m3344b(value, null, null, null, "loading_image_animation", (Function1) objM87133R2, AbstractC37817c.m121344e(-333910497, c28655q, new C25037n(this.f98088E, BoxWithConstraints, this.f98089F, this.f98090G, this.f98091H, this.f98092I, this.f98093J)), c28655q, 1597440, 14);
            }
        } else {
            c28655q = (C28655q) composer;
            zBooleanValue = ((Boolean) c28655q.m87161k(AbstractC2399k2.f9451a)).booleanValue();
            j7 = ((C1101c) BoxWithConstraints).f4585b;
            i13 = (int) 0;
            if (C39169a.m124765i(j7) > i13) {
                iM124765i = -1;
            } else {
                iM124765i = -1;
            }
            if (C39169a.m124764h(j7) > i13) {
                iM124764h = -1;
            } else {
                iM124764h = -1;
            }
            if (iM124765i == -1) {
                i14 = iM124764h;
            } else {
                i14 = iM124765i;
            }
            if (iM124764h == -1) {
                iM124764h = i14;
            }
            c28655q.m87150e0(-406660964);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                if (zBooleanValue) {
                    objM87133R = AbstractC28683x.m87272z(C25047x.f98138b);
                } else {
                    objM87133R = AbstractC28683x.m87272z(C25047x.f98138b);
                }
                c28655q.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c28655q.m87173q(false);
            c28655q.m87150e0(-406646816);
            if (!zBooleanValue) {
                c28655q.m87150e0(-406645276);
                boolean zM87157i2 = c28655q.m87157i(this.f98095x);
                String str2 = this.f98094w;
                zM87153g = zM87157i2 | c28655q.m87153g(str2) | c28655q.m87149e(i14) | c28655q.m87149e(iM124764h);
                objM87133R3 = c28655q.m87133R();
                if (zM87153g) {
                    C25036m c25036m2 = new C25036m(this.f98095x, this.f98094w, i14, iM124764h, interfaceC28601c1, null);
                    c28655q.m87172p0(c25036m2);
                    objM87133R3 = c25036m2;
                } else {
                    C25036m c25036m3 = new C25036m(this.f98095x, this.f98094w, i14, iM124764h, interfaceC28601c1, null);
                    c28655q.m87172p0(c25036m3);
                    objM87133R3 = c25036m3;
                }
                c28655q.m87173q(false);
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, str2);
            }
            c28655q.m87173q(false);
            Object value2 = interfaceC28601c1.getValue();
            c28655q.m87150e0(-406627749);
            z4 = this.f98096y;
            zM87155h = c28655q.m87155h(z4);
            objM87133R2 = c28655q.m87133R();
            if (zM87155h) {
                objM87133R2 = new C2656x4(z4, 8);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C2656x4(z4, 8);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC1089a.m3344b(value2, null, null, null, "loading_image_animation", (Function1) objM87133R2, AbstractC37817c.m121344e(-333910497, c28655q, new C25037n(this.f98088E, BoxWithConstraints, this.f98089F, this.f98090G, this.f98091H, this.f98092I, this.f98093J)), c28655q, 1597440, 14);
        }
        return C23454a0.f92919a;
    }
}
