package kw1;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import bb2.C2931g;
import bf0.C3195g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.domain.models.OrderOption;
import com.whoop.membership.extensions.domain.models.ProgressContent;
import com.whoop.payments.domain.models.Card;
import gy0.AbstractC16277f;
import hy0.AbstractC17755i2;
import iw1.AbstractC20995a;
import iw1.InterfaceC20996b;
import iy0.C21026a;
import iz0.AbstractC21048g;
import iz0.C21042a;
import iz0.C21054m;
import j11.C21214q;
import j21.C21245d;
import java.util.ArrayList;
import java.util.Map;
import jp1.C21859k;
import jp1.C21862n;
import kf0.C22437l;
import km2.C22594e;
import ku2.C22837a;
import l83.C23454a0;
import lw1.AbstractC24767c;
import lw1.AbstractC24768d;
import lw1.AbstractC24769e;
import lw1.AbstractC24770f;
import lw1.C24774j;
import lw1.C24775k;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p22.AbstractC28755a;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p392p3.C28780r;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q22.C29855e;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: kw1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aE\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u001a\b\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a?\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!²\u0006\u000e\u0010 \u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Liw1/b;", "viewState", "Lq22/e;", "formValidator", "Lkotlin/Function1;", "Liw1/a;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackNavigation", "v", "(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "Liw1/b$c;", "onBackButtonClicked", "", "onApplyPromoCodeClicked", "onPlaceOrderButtonClicked", "Lkotlin/Function2;", "", "Lcom/whoop/membership/extensions/domain/models/OrderOption;", "onUpdateOrderOption", "Lcom/whoop/payments/domain/models/Card;", "onCardUpdated", "K", "(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "buttonText", "", "buttonEnabled", "securityText", "disclaimerText", "G", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "canSubmit", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22853d {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m66288A(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m66289B(InterfaceC20996b interfaceC20996b, Function1 function1, String str) {
        String path;
        InterfaceC20996b.c cVar = (InterfaceC20996b.c) interfaceC20996b;
        CheckoutPayload checkoutPayloadMo58508b = cVar.getPayloadV2();
        if (checkoutPayloadMo58508b != null && (path = cVar.getPath()) != null) {
            CheckoutPayload checkoutPayloadCopy$default = CheckoutPayload.copy$default(checkoutPayloadMo58508b, null, str, null, 5, null);
            if (checkoutPayloadCopy$default != null) {
                checkoutPayloadMo58508b = checkoutPayloadCopy$default;
            }
            function1.invoke(new AbstractC20995a.e(checkoutPayloadMo58508b, path, str));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m66290C(InterfaceC20996b interfaceC20996b, Function1 function1) {
        InterfaceC20996b.c cVar = (InterfaceC20996b.c) interfaceC20996b;
        CheckoutPayload checkoutPayloadMo58508b = cVar.getPayloadV2();
        if (checkoutPayloadMo58508b != null) {
            String strM72613f = null;
            C24774j c24774jM58517j = cVar.getPaymentOptions();
            C24775k c24775kM58518k = cVar.getPromoCodeViewState();
            if (c24775kM58518k != null) {
                strM72613f = c24775kM58518k.getPromoCode();
            }
            function1.invoke(new AbstractC20995a.d(checkoutPayloadMo58508b, c24774jM58517j, strM72613f, cVar.m58511c(), cVar.getNextStepPrefetchContent()));
        } else {
            Map<String, String> mapM58516i = cVar.m58516i();
            if (mapM58516i != null) {
                String str = mapM58516i.get("sku");
                if (str == null) {
                    str = "";
                }
                CheckoutPayload checkoutPayload = new CheckoutPayload(str, mapM58516i.get("promo_code"), mapM58516i.get("new_tier"));
                C24774j c24774jM58517j2 = cVar.getPaymentOptions();
                C24775k c24775kM58518k2 = cVar.getPromoCodeViewState();
                function1.invoke(new AbstractC20995a.d(checkoutPayload, c24774jM58517j2, c24775kM58518k2 != null ? c24775kM58518k2.getPromoCode() : null, cVar.m58511c(), cVar.getNextStepPrefetchContent()));
            }
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m66291D(InterfaceC20996b interfaceC20996b, Function1 function1, int i13, OrderOption optionUpdated) {
        AbstractC22676k.m65750j(optionUpdated, "optionUpdated");
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(((InterfaceC20996b.c) interfaceC20996b).m58511c());
        arrayListM74097F1.set(i13, optionUpdated);
        function1.invoke(new AbstractC20995a.g(arrayListM74097F1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m66292E(Function1 function1, Card it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20995a.f(it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m66293F(InterfaceC20996b interfaceC20996b, C29855e c29855e, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m66330v(interfaceC20996b, c29855e, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0137  */
    /* JADX WARN: Code duplicated, block: B:73:0x0158  */
    /* JADX WARN: Code duplicated, block: B:75:0x029d  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: G */
    private static final void m66294G(String str, boolean z4, String str2, String str3, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        String str4;
        String str5;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        boolean z14;
        Object objM87133R;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1211114991);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            str4 = str2;
            i15 |= c28655q.m87153g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i13 & 3072) == 0) {
            str5 = str3;
            i15 |= c28655q.m87153g(str5) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            str5 = str3;
        }
        int i16 = i14 & 16;
        if (i16 == 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 16384 : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q.m87135U(i15 & 1, z13)) {
                c28676v0 = C28635l.f115821a;
                if (i16 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C22837a(19);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                }
                float f13 = 8;
                float f14 = 4 * f13;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t, 2 * f13, f14));
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                if ((i15 & 57344) == 16384) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z14 || objM87133R == c28676v0) {
                    objM87133R = new C21026a(interfaceC4339a3, 12);
                    c28655q.m87172p0(objM87133R);
                }
                int i17 = i15 << 6;
                int i18 = i15;
                AbstractC27282u.m82292h(modifierM3409f, enumC27284v, str, z4, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, (i17 & 896) | 54 | (i17 & 7168), 112);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC28755a.f116472g, c28655q, 0), null, null, C17919x.f69637n, c28655q, 3120, 4);
                C38072d c38072d = C38072d.f163053a;
                int i19 = C38072d.f163054b;
                AbstractC30795n.m94707h(str4, null, c38072d.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB3(), null, c28655q, (i18 >> 6) & 14, C2886a.f11498d << 18, 196602);
                c28655q.m87173q(true);
                Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13));
                C23285v0 c23285v0M67364b = C23285v0.m67364b(c38072d.m121952e(c28655q, i19).getFormLabel().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
                long jM125430y = c38072d.m121949b(c28655q, i19).getBrandWhite();
                long jM125403k0 = c38072d.m121949b(c28655q, i19).getStrain();
                long jM125371X = c38072d.m121949b(c28655q, i19).getRecovery();
                long jM125430y2 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                C21042a c21042a = new C21042a(c38072d.m121952e(c28655q, i19).getT1(), c38072d.m121952e(c28655q, i19).getT2(), c38072d.m121952e(c28655q, i19).getT3(), c38072d.m121952e(c28655q, i19).getT4());
                long jM125430y3 = c38072d.m121949b(c28655q, i19).getBrandWhite();
                float f15 = 0 * f13;
                AbstractC21048g.m58807M(str5, modifierM3409f3, false, new C21054m(c23285v0M67364b, jM125430y, jM125403k0, jM125371X, C28780r.f116542I, jM125430y2, 1, c38072d.m121949b(c28655q, i19).getBrandWhite(), c21042a, jM125430y3, f15, f15, false, false, f15, null), null, 0, 0, 0, false, c28655q, ((i18 >> 9) & 14) | 48 | (C21054m.f79836p << 9), 500);
                c28655q = c28655q;
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3195g(str, z4, str2, str3, interfaceC4339a3, i13, i14, 23);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 9363) != 9362) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q.m87135U(i15 & 1, z13)) {
            c28676v0 = C28635l.f115821a;
            if (i16 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C22837a(19);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a3 = interfaceC4339a2;
            }
            float f16 = 8;
            float f17 = 4 * f16;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3395q(c2314t2, 2 * f16, f17));
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            if ((i15 & 57344) == 16384) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z14) {
                objM87133R = new C21026a(interfaceC4339a3, 12);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C21026a(interfaceC4339a3, 12);
                c28655q.m87172p0(objM87133R);
            }
            int i110 = i15 << 6;
            int i111 = i15;
            AbstractC27282u.m82292h(modifierM3409f4, enumC27284v2, str, z4, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, (i110 & 896) | 54 | (i110 & 7168), 112);
            Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(AbstractC28755a.f116472g, c28655q, 0), null, null, C17919x.f69637n, c28655q, 3120, 4);
            C38072d c38072d2 = C38072d.f163053a;
            int i112 = C38072d.f163054b;
            AbstractC30795n.m94707h(str4, null, c38072d2.m121949b(c28655q, i112).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i112).getB3(), null, c28655q, (i111 >> 6) & 14, C2886a.f11498d << 18, 196602);
            c28655q.m87173q(true);
            Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(c2314t2, 0.0f, f17, 0.0f, 0.0f, 13));
            C23285v0 c23285v0M67364b2 = C23285v0.m67364b(c38072d2.m121952e(c28655q, i112).getFormLabel().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447);
            long jM125430y4 = c38072d2.m121949b(c28655q, i112).getBrandWhite();
            long jM125403k1 = c38072d2.m121949b(c28655q, i112).getStrain();
            long jM125371X2 = c38072d2.m121949b(c28655q, i112).getRecovery();
            long jM125430y5 = c38072d2.m121949b(c28655q, i112).getBrandWhite();
            C21042a c21042a2 = new C21042a(c38072d2.m121952e(c28655q, i112).getT1(), c38072d2.m121952e(c28655q, i112).getT2(), c38072d2.m121952e(c28655q, i112).getT3(), c38072d2.m121952e(c28655q, i112).getT4());
            long jM125430y6 = c38072d2.m121949b(c28655q, i112).getBrandWhite();
            float f18 = 0 * f16;
            AbstractC21048g.m58807M(str5, modifierM3409f6, false, new C21054m(c23285v0M67364b2, jM125430y4, jM125403k1, jM125371X2, C28780r.f116542I, jM125430y5, 1, c38072d2.m121949b(c28655q, i112).getBrandWhite(), c21042a2, jM125430y6, f18, f18, false, false, f18, null), null, 0, 0, 0, false, c28655q, ((i111 >> 9) & 14) | 48 | (C21054m.f79836p << 9), 500);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3195g(str, z4, str2, str3, interfaceC4339a3, i13, i14, 23);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m66295H() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m66296I(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m66297J(String str, boolean z4, String str2, String str3, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m66294G(str, z4, str2, str3, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132  */
    /* JADX WARN: Code duplicated, block: B:105:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x015c  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:128:0x0264  */
    /* JADX WARN: Code duplicated, block: B:129:0x0268  */
    /* JADX WARN: Code duplicated, block: B:132:0x0275  */
    /* JADX WARN: Code duplicated, block: B:134:0x0283  */
    /* JADX WARN: Code duplicated, block: B:137:0x029b  */
    /* JADX WARN: Code duplicated, block: B:138:0x029d  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:146:0x032e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0336  */
    /* JADX WARN: Code duplicated, block: B:150:0x0347  */
    /* JADX WARN: Code duplicated, block: B:151:0x0349  */
    /* JADX WARN: Code duplicated, block: B:154:0x0356 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0358  */
    /* JADX WARN: Code duplicated, block: B:160:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:163:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:166:0x0377 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    /* JADX INFO: renamed from: K */
    private static final void m66298K(C29855e c29855e, InterfaceC20996b.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4351m interfaceC4351m, Function1 function2, Composer composer, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        InterfaceC4339a interfaceC4339a3;
        int i18;
        int i19;
        InterfaceC4351m interfaceC4351m2;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z4;
        InterfaceC20996b.c cVar2;
        InterfaceC4339a interfaceC4339a4;
        Function1 function3;
        Function1 function4;
        C28655q c28655q;
        InterfaceC4339a interfaceC4339a5;
        InterfaceC4351m interfaceC4351m3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a6;
        Function1 function5;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4351m interfaceC4351m4;
        Function1 function6;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C2314t c2314t;
        float f13;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC4351m interfaceC4351m5;
        C2305k c2305k2;
        int iHashCode2;
        boolean z13;
        boolean z14;
        Object objM87133R2;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1689730766);
        int i37 = (i13 & 6) == 0 ? ((i13 & 8) == 0 ? c28655q2.m87153g(c29855e) : c28655q2.m87157i(c29855e) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i37 |= c28655q2.m87157i(cVar) ? 32 : 16;
        }
        int i38 = i14 & 4;
        if (i38 == 0) {
            if ((i13 & 384) == 0) {
                i37 |= c28655q2.m87157i(interfaceC4339a) ? 256 : 128;
            }
            i15 = i14 & 8;
            if (i15 != 0) {
                if ((i13 & 3072) == 0) {
                    if (c28655q2.m87157i(function1)) {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i37 |= i16;
                }
                i17 = i14 & 16;
                if (i17 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a3 = interfaceC4339a2;
                        if (c28655q2.m87157i(interfaceC4339a3)) {
                            i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i18 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i37 |= i18;
                    }
                    i19 = i14 & 32;
                    if (i19 != 0) {
                        if ((196608 & i13) == 0) {
                            interfaceC4351m2 = interfaceC4351m;
                            if (c28655q2.m87157i(interfaceC4351m2)) {
                                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                            }
                            i37 |= i24;
                        }
                        i25 = i14 & 64;
                        if (i25 != 0) {
                            i37 |= 1572864;
                        } else if ((i13 & 1572864) == 0) {
                            if (c28655q2.m87157i(function2)) {
                                i26 = 1048576;
                            } else {
                                i26 = 524288;
                            }
                            i37 |= i26;
                        }
                        i27 = i37;
                        if ((i27 & 599187) != 599186) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (c28655q2.m87135U(i27 & 1, z4)) {
                            c28676v0 = C28635l.f115821a;
                            if (i38 != 0) {
                                objM87133R8 = c28655q2.m87133R();
                                if (objM87133R8 == c28676v0) {
                                    objM87133R8 = new C22837a(17);
                                    c28655q2.m87172p0(objM87133R8);
                                }
                                interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                            } else {
                                interfaceC4339a6 = interfaceC4339a;
                            }
                            if (i15 != 0) {
                                objM87133R7 = c28655q2.m87133R();
                                if (objM87133R7 == c28676v0) {
                                    objM87133R7 = new C22594e(12);
                                    c28655q2.m87172p0(objM87133R7);
                                }
                                function5 = (Function1) objM87133R7;
                            } else {
                                function5 = function1;
                            }
                            if (i17 != 0) {
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C22837a(18);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                            } else {
                                interfaceC4339a7 = interfaceC4339a3;
                            }
                            if (i19 != 0) {
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C22437l(2);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                            } else {
                                interfaceC4351m4 = interfaceC4351m2;
                            }
                            if (i25 != 0) {
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C22594e(13);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                function6 = (Function1) objM87133R4;
                            } else {
                                function6 = function2;
                            }
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            c2314t = C2314t.f9131w;
                            Modifier modifierM66723l = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                            C38072d c38072d = C38072d.f163053a;
                            f13 = 8;
                            Modifier modifierM3394p = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l, c38072d.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                            C22957g c22957g = AbstractC22977m.f90652c;
                            c2305k = C2299e.f9110M;
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                            iHashCode = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3394p);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            C0209i c0209i2 = C0217k.f729g;
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                            C0209i c0209i3 = C0217k.f728f;
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            interfaceC4351m5 = interfaceC4351m4;
                            if (c28655q2.f115903S) {
                                c2305k2 = c2305k;
                            } else {
                                c2305k2 = c2305k;
                                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                                }
                                C0209i c0209i4 = C0217k.f726d;
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                                InterfaceC4339a interfaceC4339a8 = interfaceC4339a6;
                                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q2, 0);
                                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM92116f0);
                                c28655q2.m87158i0();
                                if (c28655q2.f115903S) {
                                    c28655q2.m87163l(c0213j);
                                } else {
                                    c28655q2.m87178s0();
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a2);
                                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                                }
                                AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                                C24774j c24774jM58517j = cVar.getPaymentOptions();
                                cVar2 = cVar;
                                boolean zM87157i = c28655q2.m87157i(cVar2);
                                if ((i27 & 3670016) == 1048576) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                z14 = zM87157i | z13;
                                objM87133R2 = c28655q2.m87133R();
                                if (z14 || objM87133R2 == c28676v0) {
                                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                Function1 function7 = function6;
                                AbstractC24769e.m72542h(c2314t, c24774jM58517j, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                                i28 = 1;
                                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                                float f14 = ((float) 1.5d) * f13;
                                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                                c28655q2.m87150e0(-1951997549);
                                i29 = 0;
                                for (Object obj : cVar2.m58511c()) {
                                    i34 = i29 + 1;
                                    if (i29 >= 0) {
                                        AbstractC37056f.m118977d0();
                                        throw null;
                                    }
                                    OrderOption orderOption = (OrderOption) obj;
                                    Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                    if ((i27 & 458752) == 131072) {
                                        i35 = i28;
                                    } else {
                                        i35 = 0;
                                    }
                                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                    objM87133R3 = c28655q2.m87133R();
                                    if (i36 == 0 || objM87133R3 == c28676v0) {
                                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                        c28655q2.m87172p0(objM87133R3);
                                    }
                                    AbstractC24768d.m72529d(modifierM3396r, orderOption, (Function1) objM87133R3, c28655q2, 6, 0);
                                    i29 = i34;
                                    i28 = 1;
                                }
                                c28655q2.m87173q(false);
                                Function1 function8 = function5;
                                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function8, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                                InterfaceC4339a interfaceC4339a9 = interfaceC4339a7;
                                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a9, c28655q2, i27 & 57344, 0);
                                c28655q2.m87173q(true);
                                c28655q2.m87173q(true);
                                interfaceC4339a5 = interfaceC4339a9;
                                c28655q = c28655q2;
                                interfaceC4351m3 = interfaceC4351m5;
                                function3 = function8;
                                interfaceC4339a4 = interfaceC4339a8;
                                function4 = function7;
                            }
                            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                            C0209i c0209i5 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                            InterfaceC4339a interfaceC4339a10 = interfaceC4339a6;
                            Modifier modifierM92116f1 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k2, c28655q2, 0);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a3);
                            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m3);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N3);
                            C24774j c24774jM58517j2 = cVar.getPaymentOptions();
                            cVar2 = cVar;
                            boolean zM87157i2 = c28655q2.m87157i(cVar2);
                            if ((i27 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i2 | z13;
                            objM87133R2 = c28655q2.m87133R();
                            if (z14) {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Function1 function9 = function6;
                            AbstractC24769e.m72542h(c2314t, c24774jM58517j2, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                            i28 = 1;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                            float f15 = ((float) 1.5d) * f13;
                            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f15, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                            c28655q2.m87150e0(-1951997549);
                            i29 = 0;
                            while (r0.hasNext()) {
                                i34 = i29 + 1;
                                if (i29 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                OrderOption orderOption2 = (OrderOption) obj;
                                Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                if ((i27 & 458752) == 131072) {
                                    i35 = i28;
                                } else {
                                    i35 = 0;
                                }
                                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                objM87133R3 = c28655q2.m87133R();
                                if (i36 == 0) {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                AbstractC24768d.m72529d(modifierM3396r2, orderOption2, (Function1) objM87133R3, c28655q2, 6, 0);
                                i29 = i34;
                                i28 = 1;
                            }
                            c28655q2.m87173q(false);
                            Function1 function10 = function5;
                            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function10, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                            InterfaceC4339a interfaceC4339a11 = interfaceC4339a7;
                            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11, c28655q2, i27 & 57344, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a11;
                            c28655q = c28655q2;
                            interfaceC4351m3 = interfaceC4351m5;
                            function3 = function10;
                            interfaceC4339a4 = interfaceC4339a10;
                            function4 = function9;
                        } else {
                            cVar2 = cVar;
                            c28655q2.m87138X();
                            interfaceC4339a4 = interfaceC4339a;
                            function3 = function1;
                            function4 = function2;
                            c28655q = c28655q2;
                            interfaceC4339a5 = interfaceC4339a3;
                            interfaceC4351m3 = interfaceC4351m2;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                        }
                    }
                    i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4351m2 = interfaceC4351m;
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i37 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i37 |= i26;
                    }
                    i27 = i37;
                    if ((i27 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i27 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i38 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C22837a(17);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i15 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C22594e(12);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function5 = (Function1) objM87133R7;
                        } else {
                            function5 = function1;
                        }
                        if (i17 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22837a(18);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i19 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22437l(2);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i25 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22594e(13);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function2;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l2 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                        C38072d c38072d2 = C38072d.f163053a;
                        f13 = 8;
                        Modifier modifierM3394p2 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l2, c38072d2.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        C22957g c22957g2 = AbstractC22977m.f90652c;
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g2, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, modifierM3394p2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i6 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a4);
                        C0209i c0209i7 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m4);
                        c0209i = C0217k.f732j;
                        interfaceC4351m5 = interfaceC4351m4;
                        if (c28655q2.f115903S) {
                            c2305k2 = c2305k;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i8 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N4);
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                            InterfaceC4339a interfaceC4339a12 = interfaceC4339a6;
                            Modifier modifierM92116f2 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
                            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, modifierM92116f2);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a5);
                            AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m5);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i8, modifierM118962N5);
                            C24774j c24774jM58517j3 = cVar.getPaymentOptions();
                            cVar2 = cVar;
                            boolean zM87157i3 = c28655q2.m87157i(cVar2);
                            if ((i27 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i3 | z13;
                            objM87133R2 = c28655q2.m87133R();
                            if (z14) {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Function1 function11 = function6;
                            AbstractC24769e.m72542h(c2314t, c24774jM58517j3, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                            i28 = 1;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                            float f16 = ((float) 1.5d) * f13;
                            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                            c28655q2.m87150e0(-1951997549);
                            i29 = 0;
                            while (r0.hasNext()) {
                                i34 = i29 + 1;
                                if (i29 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                OrderOption orderOption3 = (OrderOption) obj;
                                Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                if ((i27 & 458752) == 131072) {
                                    i35 = i28;
                                } else {
                                    i35 = 0;
                                }
                                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                objM87133R3 = c28655q2.m87133R();
                                if (i36 == 0) {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                AbstractC24768d.m72529d(modifierM3396r3, orderOption3, (Function1) objM87133R3, c28655q2, 6, 0);
                                i29 = i34;
                                i28 = 1;
                            }
                            c28655q2.m87173q(false);
                            Function1 function12 = function5;
                            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function12, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                            InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a13, c28655q2, i27 & 57344, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a13;
                            c28655q = c28655q2;
                            interfaceC4351m3 = interfaceC4351m5;
                            function3 = function12;
                            interfaceC4339a4 = interfaceC4339a12;
                            function4 = function11;
                        } else {
                            c2305k2 = c2305k;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i9 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N4);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d2), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a14 = interfaceC4339a6;
                        Modifier modifierM92116f3 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g2, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
                        Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, modifierM92116f3);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i6, c23010xM66775a6);
                        AbstractC28683x.m87239G(c28655q2, c0209i7, interfaceC28653p1M87165m6);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i9, modifierM118962N6);
                        C24774j c24774jM58517j4 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i4 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i4 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function13 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j4, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f17 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f17, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption4 = (OrderOption) obj;
                            Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r4, orderOption4, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function14 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f17, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function14, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a15 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a15, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a15;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function14;
                        interfaceC4339a4 = interfaceC4339a14;
                        function4 = function13;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        interfaceC4339a4 = interfaceC4339a;
                        function3 = function1;
                        function4 = function2;
                        c28655q = c28655q2;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                    }
                }
                i37 |= 24576;
                interfaceC4339a3 = interfaceC4339a2;
                i19 = i14 & 32;
                if (i19 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q2.m87157i(interfaceC4351m2)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i37 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i37 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i37 |= i26;
                    }
                    i27 = i37;
                    if ((i27 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i27 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i38 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C22837a(17);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i15 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C22594e(12);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function5 = (Function1) objM87133R7;
                        } else {
                            function5 = function1;
                        }
                        if (i17 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22837a(18);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i19 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22437l(2);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i25 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22594e(13);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function2;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l3 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                        C38072d c38072d3 = C38072d.f163053a;
                        f13 = 8;
                        Modifier modifierM3394p3 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l3, c38072d3.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        C22957g c22957g3 = AbstractC22977m.f90652c;
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g3, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q2.m87165m();
                        Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q2, modifierM3394p3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i10 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a7);
                        C0209i c0209i11 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m7);
                        c0209i = C0217k.f732j;
                        interfaceC4351m5 = interfaceC4351m4;
                        if (c28655q2.f115903S) {
                            c2305k2 = c2305k;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i12 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N7);
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d3), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                            InterfaceC4339a interfaceC4339a16 = interfaceC4339a6;
                            Modifier modifierM92116f4 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                            C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g3, c2305k2, c28655q2, 0);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q2.m87165m();
                            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q2, modifierM92116f4);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a8);
                            AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m8);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N8);
                            C24774j c24774jM58517j5 = cVar.getPaymentOptions();
                            cVar2 = cVar;
                            boolean zM87157i5 = c28655q2.m87157i(cVar2);
                            if ((i27 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i5 | z13;
                            objM87133R2 = c28655q2.m87133R();
                            if (z14) {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Function1 function15 = function6;
                            AbstractC24769e.m72542h(c2314t, c24774jM58517j5, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                            i28 = 1;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                            float f18 = ((float) 1.5d) * f13;
                            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f18, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                            c28655q2.m87150e0(-1951997549);
                            i29 = 0;
                            while (r0.hasNext()) {
                                i34 = i29 + 1;
                                if (i29 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                OrderOption orderOption5 = (OrderOption) obj;
                                Modifier modifierM3396r5 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                if ((i27 & 458752) == 131072) {
                                    i35 = i28;
                                } else {
                                    i35 = 0;
                                }
                                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                objM87133R3 = c28655q2.m87133R();
                                if (i36 == 0) {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                AbstractC24768d.m72529d(modifierM3396r5, orderOption5, (Function1) objM87133R3, c28655q2, 6, 0);
                                i29 = i34;
                                i28 = 1;
                            }
                            c28655q2.m87173q(false);
                            Function1 function16 = function5;
                            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f18, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function16, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                            InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
                            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a17, c28655q2, i27 & 57344, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a17;
                            c28655q = c28655q2;
                            interfaceC4351m3 = interfaceC4351m5;
                            function3 = function16;
                            interfaceC4339a4 = interfaceC4339a16;
                            function4 = function15;
                        } else {
                            c2305k2 = c2305k;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i13 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N7);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d3), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a18 = interfaceC4339a6;
                        Modifier modifierM92116f5 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22957g3, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q2.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q2, modifierM92116f5);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i10, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q2, c0209i11, interfaceC28653p1M87165m9);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i13, modifierM118962N9);
                        C24774j c24774jM58517j6 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i6 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i6 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function17 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j6, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f19 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f19, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption6 = (OrderOption) obj;
                            Modifier modifierM3396r6 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r6, orderOption6, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function18 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f19, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function18, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a19 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a19, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a19;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function18;
                        interfaceC4339a4 = interfaceC4339a18;
                        function4 = function17;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        interfaceC4339a4 = interfaceC4339a;
                        function3 = function1;
                        function4 = function2;
                        c28655q = c28655q2;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                    }
                }
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4351m2 = interfaceC4351m;
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l4 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d4 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p4 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l4, c38072d4.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g4 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g4, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q2.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q2, modifierM3394p4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i14 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a10);
                    C0209i c0209i15 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i16 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N10);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d4), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a110 = interfaceC4339a6;
                        Modifier modifierM92116f6 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g4, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q2.m87165m();
                        Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q2, modifierM92116f6);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a11);
                        AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m11);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i16, modifierM118962N11);
                        C24774j c24774jM58517j7 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i7 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i7 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function19 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j7, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f110 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f110, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption7 = (OrderOption) obj;
                            Modifier modifierM3396r7 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r7, orderOption7, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function110 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f110, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a111 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a111;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function110;
                        interfaceC4339a4 = interfaceC4339a110;
                        function4 = function19;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i17 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N10);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d4), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a112 = interfaceC4339a6;
                    Modifier modifierM92116f7 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22957g4, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q2.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q2, modifierM92116f7);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i14, c23010xM66775a12);
                    AbstractC28683x.m87239G(c28655q2, c0209i15, interfaceC28653p1M87165m12);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i17, modifierM118962N12);
                    C24774j c24774jM58517j8 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i8 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i8 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function111 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j8, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f111 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f111, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption8 = (OrderOption) obj;
                        Modifier modifierM3396r8 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r8, orderOption8, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function112 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f111, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function112, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a113 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a113, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a113;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function112;
                    interfaceC4339a4 = interfaceC4339a112;
                    function4 = function111;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= 3072;
            i17 = i14 & 16;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a3 = interfaceC4339a2;
                    if (c28655q2.m87157i(interfaceC4339a3)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i37 |= i18;
                }
                i19 = i14 & 32;
                if (i19 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q2.m87157i(interfaceC4351m2)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i37 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i37 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i37 |= i26;
                    }
                    i27 = i37;
                    if ((i27 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i27 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i38 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C22837a(17);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i15 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C22594e(12);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function5 = (Function1) objM87133R7;
                        } else {
                            function5 = function1;
                        }
                        if (i17 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22837a(18);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i19 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22437l(2);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i25 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22594e(13);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function2;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l5 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                        C38072d c38072d5 = C38072d.f163053a;
                        f13 = 8;
                        Modifier modifierM3394p5 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l5, c38072d5.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        C22957g c22957g5 = AbstractC22977m.f90652c;
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a13 = AbstractC23007w.m66775a(c22957g5, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q2.m87165m();
                        Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q2, modifierM3394p5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i18 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a13);
                        C0209i c0209i19 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m13);
                        c0209i = C0217k.f732j;
                        interfaceC4351m5 = interfaceC4351m4;
                        if (c28655q2.f115903S) {
                            c2305k2 = c2305k;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i110 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N13);
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d5), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                            InterfaceC4339a interfaceC4339a114 = interfaceC4339a6;
                            Modifier modifierM92116f8 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                            C23010x c23010xM66775a14 = AbstractC23007w.m66775a(c22957g5, c2305k2, c28655q2, 0);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q2.m87165m();
                            Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q2, modifierM92116f8);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a14);
                            AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m14);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i110, modifierM118962N14);
                            C24774j c24774jM58517j9 = cVar.getPaymentOptions();
                            cVar2 = cVar;
                            boolean zM87157i9 = c28655q2.m87157i(cVar2);
                            if ((i27 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i9 | z13;
                            objM87133R2 = c28655q2.m87133R();
                            if (z14) {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Function1 function113 = function6;
                            AbstractC24769e.m72542h(c2314t, c24774jM58517j9, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                            i28 = 1;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                            float f112 = ((float) 1.5d) * f13;
                            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f112, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                            c28655q2.m87150e0(-1951997549);
                            i29 = 0;
                            while (r0.hasNext()) {
                                i34 = i29 + 1;
                                if (i29 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                OrderOption orderOption9 = (OrderOption) obj;
                                Modifier modifierM3396r9 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                if ((i27 & 458752) == 131072) {
                                    i35 = i28;
                                } else {
                                    i35 = 0;
                                }
                                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                objM87133R3 = c28655q2.m87133R();
                                if (i36 == 0) {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                AbstractC24768d.m72529d(modifierM3396r9, orderOption9, (Function1) objM87133R3, c28655q2, 6, 0);
                                i29 = i34;
                                i28 = 1;
                            }
                            c28655q2.m87173q(false);
                            Function1 function114 = function5;
                            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f112, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function114, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                            InterfaceC4339a interfaceC4339a115 = interfaceC4339a7;
                            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a115, c28655q2, i27 & 57344, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a115;
                            c28655q = c28655q2;
                            interfaceC4351m3 = interfaceC4351m5;
                            function3 = function114;
                            interfaceC4339a4 = interfaceC4339a114;
                            function4 = function113;
                        } else {
                            c2305k2 = c2305k;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i111 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N13);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d5), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a116 = interfaceC4339a6;
                        Modifier modifierM92116f9 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a15 = AbstractC23007w.m66775a(c22957g5, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q2.m87165m();
                        Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q2, modifierM92116f9);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i18, c23010xM66775a15);
                        AbstractC28683x.m87239G(c28655q2, c0209i19, interfaceC28653p1M87165m15);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111, modifierM118962N15);
                        C24774j c24774jM58517j10 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i10 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i10 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function115 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j10, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f113 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f113, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption10 = (OrderOption) obj;
                            Modifier modifierM3396r10 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r10, orderOption10, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function116 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f113, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function116, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a117 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a117, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a117;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function116;
                        interfaceC4339a4 = interfaceC4339a116;
                        function4 = function115;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        interfaceC4339a4 = interfaceC4339a;
                        function3 = function1;
                        function4 = function2;
                        c28655q = c28655q2;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                    }
                }
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4351m2 = interfaceC4351m;
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l6 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d6 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p6 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l6, c38072d6.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g6 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a16 = AbstractC23007w.m66775a(c22957g6, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q2.m87165m();
                    Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q2, modifierM3394p6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a16);
                    C0209i c0209i113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m16);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N16);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a118 = interfaceC4339a6;
                        Modifier modifierM92116f10 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a17 = AbstractC23007w.m66775a(c22957g6, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m17 = c28655q2.m87165m();
                        Modifier modifierM118962N17 = AbstractC37056f.m118962N(c28655q2, modifierM92116f10);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a17);
                        AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m17);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i114, modifierM118962N17);
                        C24774j c24774jM58517j11 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i11 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i11 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function117 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j11, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f114 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f114, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption11 = (OrderOption) obj;
                            Modifier modifierM3396r11 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r11, orderOption11, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function118 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f114, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function118, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a119 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a119, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a119;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function118;
                        interfaceC4339a4 = interfaceC4339a118;
                        function4 = function117;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N16);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d6), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a1110 = interfaceC4339a6;
                    Modifier modifierM92116f11 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a18 = AbstractC23007w.m66775a(c22957g6, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m18 = c28655q2.m87165m();
                    Modifier modifierM118962N18 = AbstractC37056f.m118962N(c28655q2, modifierM92116f11);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i112, c23010xM66775a18);
                    AbstractC28683x.m87239G(c28655q2, c0209i113, interfaceC28653p1M87165m18);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i115, modifierM118962N18);
                    C24774j c24774jM58517j12 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i12 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i12 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function119 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j12, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f115 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f115, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption12 = (OrderOption) obj;
                        Modifier modifierM3396r12 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r12, orderOption12, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function1110 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f115, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a1111 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a1111;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function1110;
                    interfaceC4339a4 = interfaceC4339a1110;
                    function4 = function119;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= 24576;
            interfaceC4339a3 = interfaceC4339a2;
            i19 = i14 & 32;
            if (i19 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q2.m87157i(interfaceC4351m2)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i37 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l7 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d7 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p7 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l7, c38072d7.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g7 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a19 = AbstractC23007w.m66775a(c22957g7, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m19 = c28655q2.m87165m();
                    Modifier modifierM118962N19 = AbstractC37056f.m118962N(c28655q2, modifierM3394p7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i116 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a19);
                    C0209i c0209i117 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m19);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i118 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N19);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d7), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a1112 = interfaceC4339a6;
                        Modifier modifierM92116f12 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a110 = AbstractC23007w.m66775a(c22957g7, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m110 = c28655q2.m87165m();
                        Modifier modifierM118962N110 = AbstractC37056f.m118962N(c28655q2, modifierM92116f12);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a110);
                        AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m110);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i118, modifierM118962N110);
                        C24774j c24774jM58517j13 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i13 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i13 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function1111 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j13, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f116 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f116, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption13 = (OrderOption) obj;
                            Modifier modifierM3396r13 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r13, orderOption13, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function1112 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f116, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1112, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a1113 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1113, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a1113;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function1112;
                        interfaceC4339a4 = interfaceC4339a1112;
                        function4 = function1111;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i119 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N19);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d7), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a1114 = interfaceC4339a6;
                    Modifier modifierM92116f13 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a111 = AbstractC23007w.m66775a(c22957g7, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m111 = c28655q2.m87165m();
                    Modifier modifierM118962N111 = AbstractC37056f.m118962N(c28655q2, modifierM92116f13);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i116, c23010xM66775a111);
                    AbstractC28683x.m87239G(c28655q2, c0209i117, interfaceC28653p1M87165m111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i119, modifierM118962N111);
                    C24774j c24774jM58517j14 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i14 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i14 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function1113 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j14, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f117 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f117, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption14 = (OrderOption) obj;
                        Modifier modifierM3396r14 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r14, orderOption14, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function1114 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f117, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1114, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a1115 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1115, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a1115;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function1114;
                    interfaceC4339a4 = interfaceC4339a1114;
                    function4 = function1113;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4351m2 = interfaceC4351m;
            i25 = i14 & 64;
            if (i25 != 0) {
                i37 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i37 |= i26;
            }
            i27 = i37;
            if ((i27 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i38 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(17);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(12);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22837a(18);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22437l(2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(13);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l8 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                C38072d c38072d8 = C38072d.f163053a;
                f13 = 8;
                Modifier modifierM3394p8 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l8, c38072d8.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                C22957g c22957g8 = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a112 = AbstractC23007w.m66775a(c22957g8, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m112 = c28655q2.m87165m();
                Modifier modifierM118962N112 = AbstractC37056f.m118962N(c28655q2, modifierM3394p8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i1110 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a112);
                C0209i c0209i1111 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m112);
                c0209i = C0217k.f732j;
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q2.f115903S) {
                    c2305k2 = c2305k;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1112 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N112);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d8), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a1116 = interfaceC4339a6;
                    Modifier modifierM92116f14 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a113 = AbstractC23007w.m66775a(c22957g8, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m113 = c28655q2.m87165m();
                    Modifier modifierM118962N113 = AbstractC37056f.m118962N(c28655q2, modifierM92116f14);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a113);
                    AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1112, modifierM118962N113);
                    C24774j c24774jM58517j15 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i15 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i15 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function1115 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j15, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f118 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f118, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption15 = (OrderOption) obj;
                        Modifier modifierM3396r15 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r15, orderOption15, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function1116 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f118, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1116, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a1117 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1117, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a1117;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function1116;
                    interfaceC4339a4 = interfaceC4339a1116;
                    function4 = function1115;
                } else {
                    c2305k2 = c2305k;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i1113 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N112);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d8), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                InterfaceC4339a interfaceC4339a1118 = interfaceC4339a6;
                Modifier modifierM92116f15 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a114 = AbstractC23007w.m66775a(c22957g8, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m114 = c28655q2.m87165m();
                Modifier modifierM118962N114 = AbstractC37056f.m118962N(c28655q2, modifierM92116f15);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1110, c23010xM66775a114);
                AbstractC28683x.m87239G(c28655q2, c0209i1111, interfaceC28653p1M87165m114);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1113, modifierM118962N114);
                C24774j c24774jM58517j16 = cVar.getPaymentOptions();
                cVar2 = cVar;
                boolean zM87157i16 = c28655q2.m87157i(cVar2);
                if ((i27 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i16 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function1117 = function6;
                AbstractC24769e.m72542h(c2314t, c24774jM58517j16, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                i28 = 1;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                float f119 = ((float) 1.5d) * f13;
                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f119, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                c28655q2.m87150e0(-1951997549);
                i29 = 0;
                while (r0.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    OrderOption orderOption16 = (OrderOption) obj;
                    Modifier modifierM3396r16 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                    if ((i27 & 458752) == 131072) {
                        i35 = i28;
                    } else {
                        i35 = 0;
                    }
                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                    objM87133R3 = c28655q2.m87133R();
                    if (i36 == 0) {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC24768d.m72529d(modifierM3396r16, orderOption16, (Function1) objM87133R3, c28655q2, 6, 0);
                    i29 = i34;
                    i28 = 1;
                }
                c28655q2.m87173q(false);
                Function1 function1118 = function5;
                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f119, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1118, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                InterfaceC4339a interfaceC4339a1119 = interfaceC4339a7;
                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1119, c28655q2, i27 & 57344, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                interfaceC4339a5 = interfaceC4339a1119;
                c28655q = c28655q2;
                interfaceC4351m3 = interfaceC4351m5;
                function3 = function1118;
                interfaceC4339a4 = interfaceC4339a1118;
                function4 = function1117;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                function3 = function1;
                function4 = function2;
                c28655q = c28655q2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
            }
        }
        i37 |= 384;
        i15 = i14 & 8;
        if (i15 != 0) {
            if ((i13 & 3072) == 0) {
                if (c28655q2.m87157i(function1)) {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i16 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i37 |= i16;
            }
            i17 = i14 & 16;
            if (i17 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a3 = interfaceC4339a2;
                    if (c28655q2.m87157i(interfaceC4339a3)) {
                        i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i18 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i37 |= i18;
                }
                i19 = i14 & 32;
                if (i19 != 0) {
                    if ((196608 & i13) == 0) {
                        interfaceC4351m2 = interfaceC4351m;
                        if (c28655q2.m87157i(interfaceC4351m2)) {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i37 |= i24;
                    }
                    i25 = i14 & 64;
                    if (i25 != 0) {
                        i37 |= 1572864;
                    } else if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function2)) {
                            i26 = 1048576;
                        } else {
                            i26 = 524288;
                        }
                        i37 |= i26;
                    }
                    i27 = i37;
                    if ((i27 & 599187) != 599186) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c28655q2.m87135U(i27 & 1, z4)) {
                        c28676v0 = C28635l.f115821a;
                        if (i38 != 0) {
                            objM87133R8 = c28655q2.m87133R();
                            if (objM87133R8 == c28676v0) {
                                objM87133R8 = new C22837a(17);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                        } else {
                            interfaceC4339a6 = interfaceC4339a;
                        }
                        if (i15 != 0) {
                            objM87133R7 = c28655q2.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C22594e(12);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            function5 = (Function1) objM87133R7;
                        } else {
                            function5 = function1;
                        }
                        if (i17 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C22837a(18);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i19 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C22437l(2);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                        } else {
                            interfaceC4351m4 = interfaceC4351m2;
                        }
                        if (i25 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C22594e(13);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function6 = (Function1) objM87133R4;
                        } else {
                            function6 = function2;
                        }
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c2314t = C2314t.f9131w;
                        Modifier modifierM66723l9 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                        C38072d c38072d9 = C38072d.f163053a;
                        f13 = 8;
                        Modifier modifierM3394p9 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l9, c38072d9.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                        C22957g c22957g9 = AbstractC22977m.f90652c;
                        c2305k = C2299e.f9110M;
                        C23010x c23010xM66775a115 = AbstractC23007w.m66775a(c22957g9, c2305k, c28655q2, 0);
                        iHashCode = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m115 = c28655q2.m87165m();
                        Modifier modifierM118962N115 = AbstractC37056f.m118962N(c28655q2, modifierM3394p9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        C0209i c0209i1114 = C0217k.f729g;
                        AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM66775a115);
                        C0209i c0209i1115 = C0217k.f728f;
                        AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m115);
                        c0209i = C0217k.f732j;
                        interfaceC4351m5 = interfaceC4351m4;
                        if (c28655q2.f115903S) {
                            c2305k2 = c2305k;
                            if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                            }
                            C0209i c0209i1116 = C0217k.f726d;
                            AbstractC28683x.m87239G(c28655q2, c0209i1116, modifierM118962N115);
                            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d9), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                            InterfaceC4339a interfaceC4339a11110 = interfaceC4339a6;
                            Modifier modifierM92116f16 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                            C23010x c23010xM66775a116 = AbstractC23007w.m66775a(c22957g9, c2305k2, c28655q2, 0);
                            iHashCode2 = Long.hashCode(c28655q2.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m116 = c28655q2.m87165m();
                            Modifier modifierM118962N116 = AbstractC37056f.m118962N(c28655q2, modifierM92116f16);
                            c28655q2.m87158i0();
                            if (c28655q2.f115903S) {
                                c28655q2.m87163l(c0213j);
                            } else {
                                c28655q2.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM66775a116);
                            AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m116);
                            if (c28655q2.f115903S) {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            } else {
                                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q2, c0209i1116, modifierM118962N116);
                            C24774j c24774jM58517j17 = cVar.getPaymentOptions();
                            cVar2 = cVar;
                            boolean zM87157i17 = c28655q2.m87157i(cVar2);
                            if ((i27 & 3670016) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z14 = zM87157i17 | z13;
                            objM87133R2 = c28655q2.m87133R();
                            if (z14) {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            } else {
                                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            Function1 function1119 = function6;
                            AbstractC24769e.m72542h(c2314t, c24774jM58517j17, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                            i28 = 1;
                            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                            float f1110 = ((float) 1.5d) * f13;
                            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1110, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                            c28655q2.m87150e0(-1951997549);
                            i29 = 0;
                            while (r0.hasNext()) {
                                i34 = i29 + 1;
                                if (i29 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                OrderOption orderOption17 = (OrderOption) obj;
                                Modifier modifierM3396r17 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                                if ((i27 & 458752) == 131072) {
                                    i35 = i28;
                                } else {
                                    i35 = 0;
                                }
                                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                                objM87133R3 = c28655q2.m87133R();
                                if (i36 == 0) {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                } else {
                                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                AbstractC24768d.m72529d(modifierM3396r17, orderOption17, (Function1) objM87133R3, c28655q2, 6, 0);
                                i29 = i34;
                                i28 = 1;
                            }
                            c28655q2.m87173q(false);
                            Function1 function11110 = function5;
                            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1110, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                            InterfaceC4339a interfaceC4339a11111 = interfaceC4339a7;
                            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11111, c28655q2, i27 & 57344, 0);
                            c28655q2.m87173q(true);
                            c28655q2.m87173q(true);
                            interfaceC4339a5 = interfaceC4339a11111;
                            c28655q = c28655q2;
                            interfaceC4351m3 = interfaceC4351m5;
                            function3 = function11110;
                            interfaceC4339a4 = interfaceC4339a11110;
                            function4 = function1119;
                        } else {
                            c2305k2 = c2305k;
                        }
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                        C0209i c0209i1117 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N115);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d9), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a11112 = interfaceC4339a6;
                        Modifier modifierM92116f17 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a117 = AbstractC23007w.m66775a(c22957g9, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m117 = c28655q2.m87165m();
                        Modifier modifierM118962N117 = AbstractC37056f.m118962N(c28655q2, modifierM92116f17);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1114, c23010xM66775a117);
                        AbstractC28683x.m87239G(c28655q2, c0209i1115, interfaceC28653p1M87165m117);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1117, modifierM118962N117);
                        C24774j c24774jM58517j18 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i18 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i18 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function11111 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j18, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f1111 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1111, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption18 = (OrderOption) obj;
                            Modifier modifierM3396r18 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r18, orderOption18, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function11112 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1111, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11112, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a11113 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11113, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a11113;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function11112;
                        interfaceC4339a4 = interfaceC4339a11112;
                        function4 = function11111;
                    } else {
                        cVar2 = cVar;
                        c28655q2.m87138X();
                        interfaceC4339a4 = interfaceC4339a;
                        function3 = function1;
                        function4 = function2;
                        c28655q = c28655q2;
                        interfaceC4339a5 = interfaceC4339a3;
                        interfaceC4351m3 = interfaceC4351m2;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                    }
                }
                i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4351m2 = interfaceC4351m;
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l10 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d10 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p10 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l10, c38072d10.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g10 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a118 = AbstractC23007w.m66775a(c22957g10, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m118 = c28655q2.m87165m();
                    Modifier modifierM118962N118 = AbstractC37056f.m118962N(c28655q2, modifierM3394p10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i1118 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a118);
                    C0209i c0209i1119 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m118);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11110 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N118);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d10), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a11114 = interfaceC4339a6;
                        Modifier modifierM92116f18 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a119 = AbstractC23007w.m66775a(c22957g10, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m119 = c28655q2.m87165m();
                        Modifier modifierM118962N119 = AbstractC37056f.m118962N(c28655q2, modifierM92116f18);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a119);
                        AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m119);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11110, modifierM118962N119);
                        C24774j c24774jM58517j19 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i19 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i19 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function11113 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j19, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f1112 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1112, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption19 = (OrderOption) obj;
                            Modifier modifierM3396r19 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r19, orderOption19, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function11114 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1112, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11114, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a11115 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11115, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a11115;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function11114;
                        interfaceC4339a4 = interfaceC4339a11114;
                        function4 = function11113;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i11111 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11111, modifierM118962N118);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d10), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a11116 = interfaceC4339a6;
                    Modifier modifierM92116f19 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a1110 = AbstractC23007w.m66775a(c22957g10, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1110 = c28655q2.m87165m();
                    Modifier modifierM118962N1110 = AbstractC37056f.m118962N(c28655q2, modifierM92116f19);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1118, c23010xM66775a1110);
                    AbstractC28683x.m87239G(c28655q2, c0209i1119, interfaceC28653p1M87165m1110);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11111, modifierM118962N1110);
                    C24774j c24774jM58517j110 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i110 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i110 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function11115 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j110, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f1113 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1113, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption110 = (OrderOption) obj;
                        Modifier modifierM3396r110 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r110, orderOption110, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function11116 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1113, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11116, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a11117 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11117, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a11117;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function11116;
                    interfaceC4339a4 = interfaceC4339a11116;
                    function4 = function11115;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= 24576;
            interfaceC4339a3 = interfaceC4339a2;
            i19 = i14 & 32;
            if (i19 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q2.m87157i(interfaceC4351m2)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i37 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l11 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d11 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p11 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l11, c38072d11.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g11 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a1111 = AbstractC23007w.m66775a(c22957g11, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1111 = c28655q2.m87165m();
                    Modifier modifierM118962N1111 = AbstractC37056f.m118962N(c28655q2, modifierM3394p11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i11112 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM66775a1111);
                    C0209i c0209i11113 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m1111);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i11114 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i11114, modifierM118962N1111);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d11), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a11118 = interfaceC4339a6;
                        Modifier modifierM92116f110 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a1112 = AbstractC23007w.m66775a(c22957g11, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1112 = c28655q2.m87165m();
                        Modifier modifierM118962N1112 = AbstractC37056f.m118962N(c28655q2, modifierM92116f110);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM66775a1112);
                        AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m1112);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i11114, modifierM118962N1112);
                        C24774j c24774jM58517j111 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i111 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i111 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function11117 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j111, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f1114 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1114, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption111 = (OrderOption) obj;
                            Modifier modifierM3396r111 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r111, orderOption111, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function11118 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1114, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11118, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a11119 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11119, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a11119;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function11118;
                        interfaceC4339a4 = interfaceC4339a11118;
                        function4 = function11117;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i11115 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11115, modifierM118962N1111);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d11), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a111110 = interfaceC4339a6;
                    Modifier modifierM92116f111 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a1113 = AbstractC23007w.m66775a(c22957g11, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1113 = c28655q2.m87165m();
                    Modifier modifierM118962N1113 = AbstractC37056f.m118962N(c28655q2, modifierM92116f111);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11112, c23010xM66775a1113);
                    AbstractC28683x.m87239G(c28655q2, c0209i11113, interfaceC28653p1M87165m1113);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11115, modifierM118962N1113);
                    C24774j c24774jM58517j112 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i112 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i112 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function11119 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j112, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f1115 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1115, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption112 = (OrderOption) obj;
                        Modifier modifierM3396r112 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r112, orderOption112, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function111110 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1115, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function111110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a111111 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111111, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a111111;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function111110;
                    interfaceC4339a4 = interfaceC4339a111110;
                    function4 = function11119;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4351m2 = interfaceC4351m;
            i25 = i14 & 64;
            if (i25 != 0) {
                i37 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i37 |= i26;
            }
            i27 = i37;
            if ((i27 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i38 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(17);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(12);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22837a(18);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22437l(2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(13);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l12 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                C38072d c38072d12 = C38072d.f163053a;
                f13 = 8;
                Modifier modifierM3394p12 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l12, c38072d12.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                C22957g c22957g12 = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a1114 = AbstractC23007w.m66775a(c22957g12, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1114 = c28655q2.m87165m();
                Modifier modifierM118962N1114 = AbstractC37056f.m118962N(c28655q2, modifierM3394p12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i11116 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM66775a1114);
                C0209i c0209i11117 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m1114);
                c0209i = C0217k.f732j;
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q2.f115903S) {
                    c2305k2 = c2305k;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i11118 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i11118, modifierM118962N1114);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d12), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a111112 = interfaceC4339a6;
                    Modifier modifierM92116f112 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a1115 = AbstractC23007w.m66775a(c22957g12, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1115 = c28655q2.m87165m();
                    Modifier modifierM118962N1115 = AbstractC37056f.m118962N(c28655q2, modifierM92116f112);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM66775a1115);
                    AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m1115);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i11118, modifierM118962N1115);
                    C24774j c24774jM58517j113 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i113 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i113 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function111111 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j113, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f1116 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1116, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption113 = (OrderOption) obj;
                        Modifier modifierM3396r113 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r113, orderOption113, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function111112 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1116, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function111112, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a111113 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111113, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a111113;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function111112;
                    interfaceC4339a4 = interfaceC4339a111112;
                    function4 = function111111;
                } else {
                    c2305k2 = c2305k;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i11119 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N1114);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d12), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                InterfaceC4339a interfaceC4339a111114 = interfaceC4339a6;
                Modifier modifierM92116f113 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a1116 = AbstractC23007w.m66775a(c22957g12, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m1116 = c28655q2.m87165m();
                Modifier modifierM118962N1116 = AbstractC37056f.m118962N(c28655q2, modifierM92116f113);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11116, c23010xM66775a1116);
                AbstractC28683x.m87239G(c28655q2, c0209i11117, interfaceC28653p1M87165m1116);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i11119, modifierM118962N1116);
                C24774j c24774jM58517j114 = cVar.getPaymentOptions();
                cVar2 = cVar;
                boolean zM87157i114 = c28655q2.m87157i(cVar2);
                if ((i27 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i114 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function111113 = function6;
                AbstractC24769e.m72542h(c2314t, c24774jM58517j114, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                i28 = 1;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                float f1117 = ((float) 1.5d) * f13;
                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1117, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                c28655q2.m87150e0(-1951997549);
                i29 = 0;
                while (r0.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    OrderOption orderOption114 = (OrderOption) obj;
                    Modifier modifierM3396r114 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                    if ((i27 & 458752) == 131072) {
                        i35 = i28;
                    } else {
                        i35 = 0;
                    }
                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                    objM87133R3 = c28655q2.m87133R();
                    if (i36 == 0) {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC24768d.m72529d(modifierM3396r114, orderOption114, (Function1) objM87133R3, c28655q2, 6, 0);
                    i29 = i34;
                    i28 = 1;
                }
                c28655q2.m87173q(false);
                Function1 function111114 = function5;
                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1117, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function111114, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                InterfaceC4339a interfaceC4339a111115 = interfaceC4339a7;
                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111115, c28655q2, i27 & 57344, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                interfaceC4339a5 = interfaceC4339a111115;
                c28655q = c28655q2;
                interfaceC4351m3 = interfaceC4351m5;
                function3 = function111114;
                interfaceC4339a4 = interfaceC4339a111114;
                function4 = function111113;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                function3 = function1;
                function4 = function2;
                c28655q = c28655q2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
            }
        }
        i37 |= 3072;
        i17 = i14 & 16;
        if (i17 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a3 = interfaceC4339a2;
                if (c28655q2.m87157i(interfaceC4339a3)) {
                    i18 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i18 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i37 |= i18;
            }
            i19 = i14 & 32;
            if (i19 != 0) {
                if ((196608 & i13) == 0) {
                    interfaceC4351m2 = interfaceC4351m;
                    if (c28655q2.m87157i(interfaceC4351m2)) {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i37 |= i24;
                }
                i25 = i14 & 64;
                if (i25 != 0) {
                    i37 |= 1572864;
                } else if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function2)) {
                        i26 = 1048576;
                    } else {
                        i26 = 524288;
                    }
                    i37 |= i26;
                }
                i27 = i37;
                if ((i27 & 599187) != 599186) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q2.m87135U(i27 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i38 != 0) {
                        objM87133R8 = c28655q2.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(17);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a6 = interfaceC4339a;
                    }
                    if (i15 != 0) {
                        objM87133R7 = c28655q2.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C22594e(12);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        function5 = (Function1) objM87133R7;
                    } else {
                        function5 = function1;
                    }
                    if (i17 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C22837a(18);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i19 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C22437l(2);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                    } else {
                        interfaceC4351m4 = interfaceC4351m2;
                    }
                    if (i25 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C22594e(13);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function6 = (Function1) objM87133R4;
                    } else {
                        function6 = function2;
                    }
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c2314t = C2314t.f9131w;
                    Modifier modifierM66723l13 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                    C38072d c38072d13 = C38072d.f163053a;
                    f13 = 8;
                    Modifier modifierM3394p13 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l13, c38072d13.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                    C22957g c22957g13 = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a1117 = AbstractC23007w.m66775a(c22957g13, c2305k, c28655q2, 0);
                    iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1117 = c28655q2.m87165m();
                    Modifier modifierM118962N1117 = AbstractC37056f.m118962N(c28655q2, modifierM3394p13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i111110 = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM66775a1117);
                    C0209i c0209i111111 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m1117);
                    c0209i = C0217k.f732j;
                    interfaceC4351m5 = interfaceC4351m4;
                    if (c28655q2.f115903S) {
                        c2305k2 = c2305k;
                        if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        }
                        C0209i c0209i111112 = C0217k.f726d;
                        AbstractC28683x.m87239G(c28655q2, c0209i111112, modifierM118962N1117);
                        AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d13), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                        InterfaceC4339a interfaceC4339a111116 = interfaceC4339a6;
                        Modifier modifierM92116f114 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                        C23010x c23010xM66775a1118 = AbstractC23007w.m66775a(c22957g13, c2305k2, c28655q2, 0);
                        iHashCode2 = Long.hashCode(c28655q2.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m1118 = c28655q2.m87165m();
                        Modifier modifierM118962N1118 = AbstractC37056f.m118962N(c28655q2, modifierM92116f114);
                        c28655q2.m87158i0();
                        if (c28655q2.f115903S) {
                            c28655q2.m87163l(c0213j);
                        } else {
                            c28655q2.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM66775a1118);
                        AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m1118);
                        if (c28655q2.f115903S) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q2, c0209i111112, modifierM118962N1118);
                        C24774j c24774jM58517j115 = cVar.getPaymentOptions();
                        cVar2 = cVar;
                        boolean zM87157i115 = c28655q2.m87157i(cVar2);
                        if ((i27 & 3670016) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zM87157i115 | z13;
                        objM87133R2 = c28655q2.m87133R();
                        if (z14) {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        Function1 function111115 = function6;
                        AbstractC24769e.m72542h(c2314t, c24774jM58517j115, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                        i28 = 1;
                        AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                        float f1118 = ((float) 1.5d) * f13;
                        AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1118, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                        c28655q2.m87150e0(-1951997549);
                        i29 = 0;
                        while (r0.hasNext()) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            OrderOption orderOption115 = (OrderOption) obj;
                            Modifier modifierM3396r115 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                            if ((i27 & 458752) == 131072) {
                                i35 = i28;
                            } else {
                                i35 = 0;
                            }
                            i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                            objM87133R3 = c28655q2.m87133R();
                            if (i36 == 0) {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            } else {
                                objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            AbstractC24768d.m72529d(modifierM3396r115, orderOption115, (Function1) objM87133R3, c28655q2, 6, 0);
                            i29 = i34;
                            i28 = 1;
                        }
                        c28655q2.m87173q(false);
                        Function1 function111116 = function5;
                        AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1118, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function111116, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                        InterfaceC4339a interfaceC4339a111117 = interfaceC4339a7;
                        m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111117, c28655q2, i27 & 57344, 0);
                        c28655q2.m87173q(true);
                        c28655q2.m87173q(true);
                        interfaceC4339a5 = interfaceC4339a111117;
                        c28655q = c28655q2;
                        interfaceC4351m3 = interfaceC4351m5;
                        function3 = function111116;
                        interfaceC4339a4 = interfaceC4339a111116;
                        function4 = function111115;
                    } else {
                        c2305k2 = c2305k;
                    }
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    C0209i c0209i111113 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i111113, modifierM118962N1117);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d13), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a111118 = interfaceC4339a6;
                    Modifier modifierM92116f115 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a1119 = AbstractC23007w.m66775a(c22957g13, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m1119 = c28655q2.m87165m();
                    Modifier modifierM118962N1119 = AbstractC37056f.m118962N(c28655q2, modifierM92116f115);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111110, c23010xM66775a1119);
                    AbstractC28683x.m87239G(c28655q2, c0209i111111, interfaceC28653p1M87165m1119);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111113, modifierM118962N1119);
                    C24774j c24774jM58517j116 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i116 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i116 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function111117 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j116, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f1119 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f1119, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption116 = (OrderOption) obj;
                        Modifier modifierM3396r116 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r116, orderOption116, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function111118 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f1119, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function111118, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a111119 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a111119, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a111119;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function111118;
                    interfaceC4339a4 = interfaceC4339a111118;
                    function4 = function111117;
                } else {
                    cVar2 = cVar;
                    c28655q2.m87138X();
                    interfaceC4339a4 = interfaceC4339a;
                    function3 = function1;
                    function4 = function2;
                    c28655q = c28655q2;
                    interfaceC4339a5 = interfaceC4339a3;
                    interfaceC4351m3 = interfaceC4351m2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
                }
            }
            i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4351m2 = interfaceC4351m;
            i25 = i14 & 64;
            if (i25 != 0) {
                i37 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i37 |= i26;
            }
            i27 = i37;
            if ((i27 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i38 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(17);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(12);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22837a(18);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22437l(2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(13);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l14 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                C38072d c38072d14 = C38072d.f163053a;
                f13 = 8;
                Modifier modifierM3394p14 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l14, c38072d14.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                C22957g c22957g14 = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a11110 = AbstractC23007w.m66775a(c22957g14, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11110 = c28655q2.m87165m();
                Modifier modifierM118962N11110 = AbstractC37056f.m118962N(c28655q2, modifierM3394p14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i111114 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM66775a11110);
                C0209i c0209i111115 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m11110);
                c0209i = C0217k.f732j;
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q2.f115903S) {
                    c2305k2 = c2305k;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i111116 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i111116, modifierM118962N11110);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d14), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a1111110 = interfaceC4339a6;
                    Modifier modifierM92116f116 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a11111 = AbstractC23007w.m66775a(c22957g14, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11111 = c28655q2.m87165m();
                    Modifier modifierM118962N11111 = AbstractC37056f.m118962N(c28655q2, modifierM92116f116);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM66775a11111);
                    AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m11111);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111116, modifierM118962N11111);
                    C24774j c24774jM58517j117 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i117 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i117 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function111119 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j117, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f11110 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11110, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption117 = (OrderOption) obj;
                        Modifier modifierM3396r117 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r117, orderOption117, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function1111110 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11110, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1111110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a1111111 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111111, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a1111111;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function1111110;
                    interfaceC4339a4 = interfaceC4339a1111110;
                    function4 = function111119;
                } else {
                    c2305k2 = c2305k;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i111117 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i111117, modifierM118962N11110);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d14), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                InterfaceC4339a interfaceC4339a1111112 = interfaceC4339a6;
                Modifier modifierM92116f117 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a11112 = AbstractC23007w.m66775a(c22957g14, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11112 = c28655q2.m87165m();
                Modifier modifierM118962N11112 = AbstractC37056f.m118962N(c28655q2, modifierM92116f117);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111114, c23010xM66775a11112);
                AbstractC28683x.m87239G(c28655q2, c0209i111115, interfaceC28653p1M87165m11112);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111117, modifierM118962N11112);
                C24774j c24774jM58517j118 = cVar.getPaymentOptions();
                cVar2 = cVar;
                boolean zM87157i118 = c28655q2.m87157i(cVar2);
                if ((i27 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i118 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function1111111 = function6;
                AbstractC24769e.m72542h(c2314t, c24774jM58517j118, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                i28 = 1;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                float f11111 = ((float) 1.5d) * f13;
                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11111, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                c28655q2.m87150e0(-1951997549);
                i29 = 0;
                while (r0.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    OrderOption orderOption118 = (OrderOption) obj;
                    Modifier modifierM3396r118 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                    if ((i27 & 458752) == 131072) {
                        i35 = i28;
                    } else {
                        i35 = 0;
                    }
                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                    objM87133R3 = c28655q2.m87133R();
                    if (i36 == 0) {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC24768d.m72529d(modifierM3396r118, orderOption118, (Function1) objM87133R3, c28655q2, 6, 0);
                    i29 = i34;
                    i28 = 1;
                }
                c28655q2.m87173q(false);
                Function1 function1111112 = function5;
                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11111, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1111112, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                InterfaceC4339a interfaceC4339a1111113 = interfaceC4339a7;
                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111113, c28655q2, i27 & 57344, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                interfaceC4339a5 = interfaceC4339a1111113;
                c28655q = c28655q2;
                interfaceC4351m3 = interfaceC4351m5;
                function3 = function1111112;
                interfaceC4339a4 = interfaceC4339a1111112;
                function4 = function1111111;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                function3 = function1;
                function4 = function2;
                c28655q = c28655q2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
            }
        }
        i37 |= 24576;
        interfaceC4339a3 = interfaceC4339a2;
        i19 = i14 & 32;
        if (i19 != 0) {
            if ((196608 & i13) == 0) {
                interfaceC4351m2 = interfaceC4351m;
                if (c28655q2.m87157i(interfaceC4351m2)) {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i24 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i37 |= i24;
            }
            i25 = i14 & 64;
            if (i25 != 0) {
                i37 |= 1572864;
            } else if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function2)) {
                    i26 = 1048576;
                } else {
                    i26 = 524288;
                }
                i37 |= i26;
            }
            i27 = i37;
            if ((i27 & 599187) != 599186) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q2.m87135U(i27 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i38 != 0) {
                    objM87133R8 = c28655q2.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(17);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a6 = interfaceC4339a;
                }
                if (i15 != 0) {
                    objM87133R7 = c28655q2.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C22594e(12);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    function5 = (Function1) objM87133R7;
                } else {
                    function5 = function1;
                }
                if (i17 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C22837a(18);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i19 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C22437l(2);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
                } else {
                    interfaceC4351m4 = interfaceC4351m2;
                }
                if (i25 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C22594e(13);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function6 = (Function1) objM87133R4;
                } else {
                    function6 = function2;
                }
                objM87133R = c28655q2.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q2.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c2314t = C2314t.f9131w;
                Modifier modifierM66723l15 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
                C38072d c38072d15 = C38072d.f163053a;
                f13 = 8;
                Modifier modifierM3394p15 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l15, c38072d15.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
                C22957g c22957g15 = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a11113 = AbstractC23007w.m66775a(c22957g15, c2305k, c28655q2, 0);
                iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11113 = c28655q2.m87165m();
                Modifier modifierM118962N11113 = AbstractC37056f.m118962N(c28655q2, modifierM3394p15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i111118 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM66775a11113);
                C0209i c0209i111119 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11113);
                c0209i = C0217k.f732j;
                interfaceC4351m5 = interfaceC4351m4;
                if (c28655q2.f115903S) {
                    c2305k2 = c2305k;
                    if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    }
                    C0209i c0209i1111110 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i1111110, modifierM118962N11113);
                    AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d15), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                    InterfaceC4339a interfaceC4339a1111114 = interfaceC4339a6;
                    Modifier modifierM92116f118 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                    C23010x c23010xM66775a11114 = AbstractC23007w.m66775a(c22957g15, c2305k2, c28655q2, 0);
                    iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11114 = c28655q2.m87165m();
                    Modifier modifierM118962N11114 = AbstractC37056f.m118962N(c28655q2, modifierM92116f118);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM66775a11114);
                    AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11114);
                    if (c28655q2.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i1111110, modifierM118962N11114);
                    C24774j c24774jM58517j119 = cVar.getPaymentOptions();
                    cVar2 = cVar;
                    boolean zM87157i119 = c28655q2.m87157i(cVar2);
                    if ((i27 & 3670016) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zM87157i119 | z13;
                    objM87133R2 = c28655q2.m87133R();
                    if (z14) {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Function1 function1111113 = function6;
                    AbstractC24769e.m72542h(c2314t, c24774jM58517j119, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                    i28 = 1;
                    AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                    float f11112 = ((float) 1.5d) * f13;
                    AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11112, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                    c28655q2.m87150e0(-1951997549);
                    i29 = 0;
                    while (r0.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        OrderOption orderOption119 = (OrderOption) obj;
                        Modifier modifierM3396r119 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                        if ((i27 & 458752) == 131072) {
                            i35 = i28;
                        } else {
                            i35 = 0;
                        }
                        i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                        objM87133R3 = c28655q2.m87133R();
                        if (i36 == 0) {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        AbstractC24768d.m72529d(modifierM3396r119, orderOption119, (Function1) objM87133R3, c28655q2, 6, 0);
                        i29 = i34;
                        i28 = 1;
                    }
                    c28655q2.m87173q(false);
                    Function1 function1111114 = function5;
                    AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11112, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1111114, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                    InterfaceC4339a interfaceC4339a1111115 = interfaceC4339a7;
                    m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111115, c28655q2, i27 & 57344, 0);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                    interfaceC4339a5 = interfaceC4339a1111115;
                    c28655q = c28655q2;
                    interfaceC4351m3 = interfaceC4351m5;
                    function3 = function1111114;
                    interfaceC4339a4 = interfaceC4339a1111114;
                    function4 = function1111113;
                } else {
                    c2305k2 = c2305k;
                }
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                C0209i c0209i1111111 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1111111, modifierM118962N11113);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d15), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                InterfaceC4339a interfaceC4339a1111116 = interfaceC4339a6;
                Modifier modifierM92116f119 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a11115 = AbstractC23007w.m66775a(c22957g15, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11115 = c28655q2.m87165m();
                Modifier modifierM118962N11115 = AbstractC37056f.m118962N(c28655q2, modifierM92116f119);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i111118, c23010xM66775a11115);
                AbstractC28683x.m87239G(c28655q2, c0209i111119, interfaceC28653p1M87165m11115);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111111, modifierM118962N11115);
                C24774j c24774jM58517j1110 = cVar.getPaymentOptions();
                cVar2 = cVar;
                boolean zM87157i1110 = c28655q2.m87157i(cVar2);
                if ((i27 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i1110 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function1111115 = function6;
                AbstractC24769e.m72542h(c2314t, c24774jM58517j1110, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                i28 = 1;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                float f11113 = ((float) 1.5d) * f13;
                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11113, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                c28655q2.m87150e0(-1951997549);
                i29 = 0;
                while (r0.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    OrderOption orderOption1110 = (OrderOption) obj;
                    Modifier modifierM3396r1110 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                    if ((i27 & 458752) == 131072) {
                        i35 = i28;
                    } else {
                        i35 = 0;
                    }
                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                    objM87133R3 = c28655q2.m87133R();
                    if (i36 == 0) {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC24768d.m72529d(modifierM3396r1110, orderOption1110, (Function1) objM87133R3, c28655q2, 6, 0);
                    i29 = i34;
                    i28 = 1;
                }
                c28655q2.m87173q(false);
                Function1 function1111116 = function5;
                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11113, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1111116, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                InterfaceC4339a interfaceC4339a1111117 = interfaceC4339a7;
                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111117, c28655q2, i27 & 57344, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                interfaceC4339a5 = interfaceC4339a1111117;
                c28655q = c28655q2;
                interfaceC4351m3 = interfaceC4351m5;
                function3 = function1111116;
                interfaceC4339a4 = interfaceC4339a1111116;
                function4 = function1111115;
            } else {
                cVar2 = cVar;
                c28655q2.m87138X();
                interfaceC4339a4 = interfaceC4339a;
                function3 = function1;
                function4 = function2;
                c28655q = c28655q2;
                interfaceC4339a5 = interfaceC4339a3;
                interfaceC4351m3 = interfaceC4351m2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
            }
        }
        i37 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4351m2 = interfaceC4351m;
        i25 = i14 & 64;
        if (i25 != 0) {
            i37 |= 1572864;
        } else if ((i13 & 1572864) == 0) {
            if (c28655q2.m87157i(function2)) {
                i26 = 1048576;
            } else {
                i26 = 524288;
            }
            i37 |= i26;
        }
        i27 = i37;
        if ((i27 & 599187) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q2.m87135U(i27 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i38 != 0) {
                objM87133R8 = c28655q2.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C22837a(17);
                    c28655q2.m87172p0(objM87133R8);
                }
                interfaceC4339a6 = (InterfaceC4339a) objM87133R8;
            } else {
                interfaceC4339a6 = interfaceC4339a;
            }
            if (i15 != 0) {
                objM87133R7 = c28655q2.m87133R();
                if (objM87133R7 == c28676v0) {
                    objM87133R7 = new C22594e(12);
                    c28655q2.m87172p0(objM87133R7);
                }
                function5 = (Function1) objM87133R7;
            } else {
                function5 = function1;
            }
            if (i17 != 0) {
                objM87133R6 = c28655q2.m87133R();
                if (objM87133R6 == c28676v0) {
                    objM87133R6 = new C22837a(18);
                    c28655q2.m87172p0(objM87133R6);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R6;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i19 != 0) {
                objM87133R5 = c28655q2.m87133R();
                if (objM87133R5 == c28676v0) {
                    objM87133R5 = new C22437l(2);
                    c28655q2.m87172p0(objM87133R5);
                }
                interfaceC4351m4 = (InterfaceC4351m) objM87133R5;
            } else {
                interfaceC4351m4 = interfaceC4351m2;
            }
            if (i25 != 0) {
                objM87133R4 = c28655q2.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C22594e(13);
                    c28655q2.m87172p0(objM87133R4);
                }
                function6 = (Function1) objM87133R4;
            } else {
                function6 = function2;
            }
            objM87133R = c28655q2.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c2314t = C2314t.f9131w;
            Modifier modifierM66723l16 = AbstractC22953f.m66723l(AbstractC1102d.m3409f(1.0f, c2314t));
            C38072d c38072d16 = C38072d.f163053a;
            f13 = 8;
            Modifier modifierM3394p16 = AbstractC1099a.m3394p(2 * f13, AbstractC1092a.m3358c(modifierM66723l16, c38072d16.m121949b(c28655q2, C38072d.f163054b).getBackgroundDarkStd(), AbstractC17918w0.f69621a));
            C22957g c22957g16 = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a11116 = AbstractC23007w.m66775a(c22957g16, c2305k, c28655q2, 0);
            iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11116 = c28655q2.m87165m();
            Modifier modifierM118962N11116 = AbstractC37056f.m118962N(c28655q2, modifierM3394p16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i1111112 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM66775a11116);
            C0209i c0209i1111113 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m11116);
            c0209i = C0217k.f732j;
            interfaceC4351m5 = interfaceC4351m4;
            if (c28655q2.f115903S) {
                c2305k2 = c2305k;
                if (!AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                }
                C0209i c0209i1111114 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i1111114, modifierM118962N11116);
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d16), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
                InterfaceC4339a interfaceC4339a1111118 = interfaceC4339a6;
                Modifier modifierM92116f1110 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
                C23010x c23010xM66775a11117 = AbstractC23007w.m66775a(c22957g16, c2305k2, c28655q2, 0);
                iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m11117 = c28655q2.m87165m();
                Modifier modifierM118962N11117 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1110);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM66775a11117);
                AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m11117);
                if (c28655q2.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, c0209i1111114, modifierM118962N11117);
                C24774j c24774jM58517j1111 = cVar.getPaymentOptions();
                cVar2 = cVar;
                boolean zM87157i1111 = c28655q2.m87157i(cVar2);
                if ((i27 & 3670016) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zM87157i1111 | z13;
                objM87133R2 = c28655q2.m87133R();
                if (z14) {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                    c28655q2.m87172p0(objM87133R2);
                }
                Function1 function1111117 = function6;
                AbstractC24769e.m72542h(c2314t, c24774jM58517j1111, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
                i28 = 1;
                AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
                float f11114 = ((float) 1.5d) * f13;
                AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11114, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
                c28655q2.m87150e0(-1951997549);
                i29 = 0;
                while (r0.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    OrderOption orderOption1111 = (OrderOption) obj;
                    Modifier modifierM3396r1111 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                    if ((i27 & 458752) == 131072) {
                        i35 = i28;
                    } else {
                        i35 = 0;
                    }
                    i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                    objM87133R3 = c28655q2.m87133R();
                    if (i36 == 0) {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    AbstractC24768d.m72529d(modifierM3396r1111, orderOption1111, (Function1) objM87133R3, c28655q2, 6, 0);
                    i29 = i34;
                    i28 = 1;
                }
                c28655q2.m87173q(false);
                Function1 function1111118 = function5;
                AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11114, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function1111118, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
                InterfaceC4339a interfaceC4339a1111119 = interfaceC4339a7;
                m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a1111119, c28655q2, i27 & 57344, 0);
                c28655q2.m87173q(true);
                c28655q2.m87173q(true);
                interfaceC4339a5 = interfaceC4339a1111119;
                c28655q = c28655q2;
                interfaceC4351m3 = interfaceC4351m5;
                function3 = function1111118;
                interfaceC4339a4 = interfaceC4339a1111118;
                function4 = function1111117;
            } else {
                c2305k2 = c2305k;
            }
            AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            C0209i c0209i1111115 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i1111115, modifierM118962N11116);
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(AbstractC8693b.m21278l(cVar.getTitle()), null, AbstractC13673n.m38561h(c38072d16), AbstractC30060g.m92103Y(c28655q2, AbstractC16277f.f62253K), null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, interfaceC4339a6, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | ((i27 << 3) & 7168), 53);
            InterfaceC4339a interfaceC4339a11111110 = interfaceC4339a6;
            Modifier modifierM92116f1111 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q2, 1), 14);
            C23010x c23010xM66775a11118 = AbstractC23007w.m66775a(c22957g16, c2305k2, c28655q2, 0);
            iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11118 = c28655q2.m87165m();
            Modifier modifierM118962N11118 = AbstractC37056f.m118962N(c28655q2, modifierM92116f1111);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111112, c23010xM66775a11118);
            AbstractC28683x.m87239G(c28655q2, c0209i1111113, interfaceC28653p1M87165m11118);
            if (c28655q2.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i1111115, modifierM118962N11118);
            C24774j c24774jM58517j1112 = cVar.getPaymentOptions();
            cVar2 = cVar;
            boolean zM87157i1112 = c28655q2.m87157i(cVar2);
            if ((i27 & 3670016) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zM87157i1112 | z13;
            objM87133R2 = c28655q2.m87133R();
            if (z14) {
                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                c28655q2.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new C21859k((Object) cVar2, function6, (Object) interfaceC28601c1, 3);
                c28655q2.m87172p0(objM87133R2);
            }
            Function1 function1111119 = function6;
            AbstractC24769e.m72542h(c2314t, c24774jM58517j1112, c29855e, false, (InterfaceC4351m) objM87133R2, null, c28655q2, (C29855e.f122028d << 6) | 6 | ((i27 << 6) & 896), 40);
            i28 = 1;
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, 4 * f13, 1), null, null, null, null, 0L, 0L, null, c28655q2, 6, 254);
            float f11115 = ((float) 1.5d) * f13;
            AbstractC24767c.m72520d(AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f11115, 7), cVar2.getOrderDetails(), c28655q2, 6, 0);
            c28655q2.m87150e0(-1951997549);
            i29 = 0;
            while (r0.hasNext()) {
                i34 = i29 + 1;
                if (i29 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                OrderOption orderOption1112 = (OrderOption) obj;
                Modifier modifierM3396r1112 = AbstractC1099a.m3396r(c2314t, 0.0f, i28 * f13, i28);
                if ((i27 & 458752) == 131072) {
                    i35 = i28;
                } else {
                    i35 = 0;
                }
                i36 = i35 | (c28655q2.m87149e(i29) ? 1 : 0);
                objM87133R3 = c28655q2.m87133R();
                if (i36 == 0) {
                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C22850a(interfaceC4351m5, i29, 0);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC24768d.m72529d(modifierM3396r1112, orderOption1112, (Function1) objM87133R3, c28655q2, 6, 0);
                i29 = i34;
                i28 = 1;
            }
            c28655q2.m87173q(false);
            Function1 function11111110 = function5;
            AbstractC24770f.m72559g(AbstractC1099a.m3398t(c2314t, 0.0f, f11115, 0.0f, 0.0f, 13), cVar2.getPromoCodeViewState(), function11111110, c28655q2, (TextResource.$stable << 3) | 6 | ((i27 >> 3) & 896), 0);
            InterfaceC4339a interfaceC4339a11111111 = interfaceC4339a7;
            m66294G(cVar2.getCheckoutCtaTitle(), m66304Q(interfaceC28601c1), cVar2.getSecurityFooter(), cVar2.getDisclaimerFooterMarkdown(), interfaceC4339a11111111, c28655q2, i27 & 57344, 0);
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            interfaceC4339a5 = interfaceC4339a11111111;
            c28655q = c28655q2;
            interfaceC4351m3 = interfaceC4351m5;
            function3 = function11111110;
            interfaceC4339a4 = interfaceC4339a11111110;
            function4 = function1111119;
        } else {
            cVar2 = cVar;
            c28655q2.m87138X();
            interfaceC4339a4 = interfaceC4339a;
            function3 = function1;
            function4 = function2;
            c28655q = c28655q2;
            interfaceC4339a5 = interfaceC4339a3;
            interfaceC4351m3 = interfaceC4351m2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2931g(c29855e, cVar2, interfaceC4339a4, function3, interfaceC4339a5, interfaceC4351m3, function4, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m66299L() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m66300M(String str) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m66301N() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m66302O(int i13, OrderOption orderOption) {
        AbstractC22676k.m65750j(orderOption, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m66303P(Card card) {
        AbstractC22676k.m65750j(card, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final boolean m66304Q(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: R */
    private static final void m66305R(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m66306S(InterfaceC20996b.c cVar, Function1 function1, InterfaceC28601c1 interfaceC28601c1, boolean z4, Card newCard) {
        AbstractC22676k.m65750j(newCard, "newCard");
        if (!newCard.equals(cVar.getPaymentOptions().getCard()) || z4 != m66304Q(interfaceC28601c1)) {
            m66305R(interfaceC28601c1, z4);
            function1.invoke(newCard);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m66307T(InterfaceC4351m interfaceC4351m, int i13, OrderOption it) {
        AbstractC22676k.m65750j(it, "it");
        interfaceC4351m.invoke(Integer.valueOf(i13), it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m66308U(C29855e c29855e, InterfaceC20996b.c cVar, InterfaceC4339a interfaceC4339a, Function1 function1, InterfaceC4339a interfaceC4339a2, InterfaceC4351m interfaceC4351m, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m66298K(c29855e, cVar, interfaceC4339a, function1, interfaceC4339a2, interfaceC4351m, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0140 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x0158  */
    /* JADX WARN: Code duplicated, block: B:109:0x0165  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:113:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0170  */
    /* JADX WARN: Code duplicated, block: B:117:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x018d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:127:0x0195  */
    /* JADX WARN: Code duplicated, block: B:130:0x019f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01da  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:159:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:163:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:164:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:167:0x0208  */
    /* JADX WARN: Code duplicated, block: B:168:0x020a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0211 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0213  */
    /* JADX WARN: Code duplicated, block: B:175:0x023e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0247  */
    /* JADX WARN: Code duplicated, block: B:180:0x0252  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x010e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:0x0123  */
    /* JADX WARN: Code duplicated, block: B:90:0x0125  */
    /* JADX WARN: Code duplicated, block: B:93:0x012a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    /* JADX INFO: renamed from: v */
    public static final void m66330v(InterfaceC20996b viewState, C29855e formValidator, Function1 function1, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        Function1 function3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function4;
        InterfaceC4339a interfaceC4339a4;
        boolean z13;
        Object objM87133R;
        int i18;
        boolean z14;
        int i19;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objM87133R3;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objM87133R4;
        boolean z27;
        Object objM87133R5;
        boolean z28;
        boolean z29;
        boolean z34;
        Object objM87133R6;
        boolean z35;
        boolean z36;
        boolean z37;
        Object objM87133R7;
        Object objM87133R8;
        Object objM87133R9;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(formValidator, "formValidator");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1605973766);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(formValidator) : c28655q.m87157i(formValidator) ? 32 : 16;
        }
        int i24 = i14 & 4;
        if (i24 == 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                i15 |= c28655q.m87157i(function2) ? 256 : 128;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 3072) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q.m87157i(interfaceC4339a2)) {
                        i17 = 2048;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i17;
                }
                if ((i15 & 1171) != 1170) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c28676v0 = C28635l.f115821a;
                    if (i24 != 0) {
                        objM87133R9 = c28655q.m87133R();
                        if (objM87133R9 == c28676v0) {
                            objM87133R9 = new C22594e(11);
                            c28655q.m87172p0(objM87133R9);
                        }
                        function4 = (Function1) objM87133R9;
                    } else {
                        function4 = function2;
                    }
                    if (i16 != 0) {
                        objM87133R8 = c28655q.m87133R();
                        if (objM87133R8 == c28676v0) {
                            objM87133R8 = new C22837a(20);
                            c28655q.m87172p0(objM87133R8);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                    } else {
                        interfaceC4339a4 = interfaceC4339a2;
                    }
                    if (viewState instanceof InterfaceC20996b.a) {
                        c28655q.m87150e0(-1447520439);
                        ProgressContent progressContentM58509e = ((InterfaceC20996b.a) viewState).getContent();
                        if ((i15 & 896) == 256) {
                            z35 = true;
                        } else {
                            z35 = false;
                        }
                        if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                            z36 = true;
                        } else {
                            z36 = false;
                        }
                        z37 = z35 | z36;
                        objM87133R7 = c28655q.m87133R();
                        if (z37 || objM87133R7 == c28676v0) {
                            objM87133R7 = new C22851b(function4, viewState, 0);
                            c28655q.m87172p0(objM87133R7);
                        }
                        AbstractC22862m.m66395e(progressContentM58509e, (Function1) objM87133R7, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof InterfaceC20996b.b) {
                            c28655q.m87150e0(-1447513173);
                            ProgressContent progressContentM58510e = ((InterfaceC20996b.b) viewState).getContent();
                            if ((i15 & 896) == 256) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            if ((i15 & 14) != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = z28 | z29;
                            objM87133R6 = c28655q.m87133R();
                            if (z34 || objM87133R6 == c28676v0) {
                                objM87133R6 = new C22851b(function4, viewState, 1);
                                c28655q.m87172p0(objM87133R6);
                            }
                            AbstractC22863n.m66404e(progressContentM58510e, (Function1) objM87133R6, c28655q, 0, 0);
                            c28655q.m87173q(false);
                        } else {
                            if (viewState instanceof InterfaceC20996b.c) {
                                throw AbstractC11895b.m32003v(-1447520250, c28655q, false);
                            }
                            c28655q.m87150e0(-1447504043);
                            InterfaceC20996b.c cVar = (InterfaceC20996b.c) viewState;
                            if ((i15 & 7168) == 2048) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objM87133R = c28655q.m87133R();
                            if (z13 || objM87133R == c28676v0) {
                                objM87133R = new C21026a(interfaceC4339a4, 13);
                                c28655q.m87172p0(objM87133R);
                            }
                            InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                            i18 = i15 & 14;
                            if (i18 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            i19 = i15 & 896;
                            if (i19 == 256) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objM87133R2 = c28655q.m87133R();
                            if (z16 || objM87133R2 == c28676v0) {
                                objM87133R2 = new C22851b(viewState, function4);
                                c28655q.m87172p0(objM87133R2);
                            }
                            Function1 function5 = (Function1) objM87133R2;
                            if (i18 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            if (i19 == 256) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            z19 = z17 | z18;
                            objM87133R3 = c28655q.m87133R();
                            if (z19 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C21214q(viewState, function4, 26);
                                c28655q.m87172p0(objM87133R3);
                            }
                            InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R3;
                            if (i18 != 4 || ((i15 & 8) != 0 && c28655q.m87157i(viewState))) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            if (i19 == 256) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            z26 = z24 | z25;
                            objM87133R4 = c28655q.m87133R();
                            if (z26 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C21245d(7, viewState, function4);
                                c28655q.m87172p0(objM87133R4);
                            }
                            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R4;
                            if (i19 == 256) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            objM87133R5 = c28655q.m87133R();
                            if (z27 || objM87133R5 == c28676v0) {
                                objM87133R5 = new C21862n(function4, 19);
                                c28655q.m87172p0(objM87133R5);
                            }
                            m66298K(formValidator, cVar, interfaceC4339a5, function5, interfaceC4339a6, interfaceC4351m, (Function1) objM87133R5, c28655q, ((i15 << 3) & 112) | C29855e.f122028d | ((i15 >> 3) & 14), 0);
                            c28655q.m87173q(false);
                        }
                        interfaceC4339a3 = interfaceC4339a4;
                        function3 = function4;
                    }
                    interfaceC4339a3 = interfaceC4339a4;
                    function3 = function4;
                } else {
                    c28655q.m87138X();
                    function3 = function2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) formValidator, (Object) function3, (Object) interfaceC4339a3, i13, i14, 0);
                }
            }
            i15 |= 3072;
            interfaceC4339a2 = interfaceC4339a;
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C22594e(11);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(20);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof InterfaceC20996b.a) {
                    c28655q.m87150e0(-1447520439);
                    ProgressContent progressContentM58509e2 = ((InterfaceC20996b.a) viewState).getContent();
                    if ((i15 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z36 = true;
                    } else {
                        z36 = true;
                    }
                    z37 = z35 | z36;
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C22851b(function4, viewState, 0);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C22851b(function4, viewState, 0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC22862m.m66395e(progressContentM58509e2, (Function1) objM87133R7, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof InterfaceC20996b.b) {
                        c28655q.m87150e0(-1447513173);
                        ProgressContent progressContentM58510e2 = ((InterfaceC20996b.b) viewState).getContent();
                        if ((i15 & 896) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if ((i15 & 14) != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        z34 = z28 | z29;
                        objM87133R6 = c28655q.m87133R();
                        if (z34) {
                            objM87133R6 = new C22851b(function4, viewState, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C22851b(function4, viewState, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC22863n.m66404e(progressContentM58510e2, (Function1) objM87133R6, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof InterfaceC20996b.c) {
                            throw AbstractC11895b.m32003v(-1447520250, c28655q, false);
                        }
                        c28655q.m87150e0(-1447504043);
                        InterfaceC20996b.c cVar2 = (InterfaceC20996b.c) viewState;
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21026a(interfaceC4339a4, 13);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21026a(interfaceC4339a4, 13);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                        i18 = i15 & 14;
                        if (i18 != 4) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        i19 = i15 & 896;
                        if (i19 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C22851b(viewState, function4);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C22851b(viewState, function4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function6 = (Function1) objM87133R2;
                        if (i18 != 4) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (i19 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C21214q(viewState, function4, 26);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21214q(viewState, function4, 26);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R3;
                        if (i18 != 4) {
                            z24 = true;
                        } else {
                            z24 = true;
                        }
                        if (i19 == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z24 | z25;
                        objM87133R4 = c28655q.m87133R();
                        if (z26) {
                            objM87133R4 = new C21245d(7, viewState, function4);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C21245d(7, viewState, function4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R4;
                        if (i19 == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z27) {
                            objM87133R5 = new C21862n(function4, 19);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C21862n(function4, 19);
                            c28655q.m87172p0(objM87133R5);
                        }
                        m66298K(formValidator, cVar2, interfaceC4339a7, function6, interfaceC4339a8, interfaceC4351m2, (Function1) objM87133R5, c28655q, ((i15 << 3) & 112) | C29855e.f122028d | ((i15 >> 3) & 14), 0);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a3 = interfaceC4339a4;
                    function3 = function4;
                }
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) formValidator, (Object) function3, (Object) interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 384;
        function2 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 3072) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q.m87157i(interfaceC4339a2)) {
                    i17 = 2048;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i17;
            }
            if ((i15 & 1171) != 1170) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c28676v0 = C28635l.f115821a;
                if (i24 != 0) {
                    objM87133R9 = c28655q.m87133R();
                    if (objM87133R9 == c28676v0) {
                        objM87133R9 = new C22594e(11);
                        c28655q.m87172p0(objM87133R9);
                    }
                    function4 = (Function1) objM87133R9;
                } else {
                    function4 = function2;
                }
                if (i16 != 0) {
                    objM87133R8 = c28655q.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = new C22837a(20);
                        c28655q.m87172p0(objM87133R8);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                if (viewState instanceof InterfaceC20996b.a) {
                    c28655q.m87150e0(-1447520439);
                    ProgressContent progressContentM58509e3 = ((InterfaceC20996b.a) viewState).getContent();
                    if ((i15 & 896) == 256) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z36 = true;
                    } else {
                        z36 = true;
                    }
                    z37 = z35 | z36;
                    objM87133R7 = c28655q.m87133R();
                    if (z37) {
                        objM87133R7 = new C22851b(function4, viewState, 0);
                        c28655q.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C22851b(function4, viewState, 0);
                        c28655q.m87172p0(objM87133R7);
                    }
                    AbstractC22862m.m66395e(progressContentM58509e3, (Function1) objM87133R7, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof InterfaceC20996b.b) {
                        c28655q.m87150e0(-1447513173);
                        ProgressContent progressContentM58510e3 = ((InterfaceC20996b.b) viewState).getContent();
                        if ((i15 & 896) == 256) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        if ((i15 & 14) != 4) {
                            z29 = true;
                        } else {
                            z29 = true;
                        }
                        z34 = z28 | z29;
                        objM87133R6 = c28655q.m87133R();
                        if (z34) {
                            objM87133R6 = new C22851b(function4, viewState, 1);
                            c28655q.m87172p0(objM87133R6);
                        } else {
                            objM87133R6 = new C22851b(function4, viewState, 1);
                            c28655q.m87172p0(objM87133R6);
                        }
                        AbstractC22863n.m66404e(progressContentM58510e3, (Function1) objM87133R6, c28655q, 0, 0);
                        c28655q.m87173q(false);
                    } else {
                        if (viewState instanceof InterfaceC20996b.c) {
                            throw AbstractC11895b.m32003v(-1447520250, c28655q, false);
                        }
                        c28655q.m87150e0(-1447504043);
                        InterfaceC20996b.c cVar3 = (InterfaceC20996b.c) viewState;
                        if ((i15 & 7168) == 2048) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objM87133R = c28655q.m87133R();
                        if (z13) {
                            objM87133R = new C21026a(interfaceC4339a4, 13);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            objM87133R = new C21026a(interfaceC4339a4, 13);
                            c28655q.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R;
                        i18 = i15 & 14;
                        if (i18 != 4) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        i19 = i15 & 896;
                        if (i19 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objM87133R2 = c28655q.m87133R();
                        if (z16) {
                            objM87133R2 = new C22851b(viewState, function4);
                            c28655q.m87172p0(objM87133R2);
                        } else {
                            objM87133R2 = new C22851b(viewState, function4);
                            c28655q.m87172p0(objM87133R2);
                        }
                        Function1 function7 = (Function1) objM87133R2;
                        if (i18 != 4) {
                            z17 = true;
                        } else {
                            z17 = true;
                        }
                        if (i19 == 256) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = z17 | z18;
                        objM87133R3 = c28655q.m87133R();
                        if (z19) {
                            objM87133R3 = new C21214q(viewState, function4, 26);
                            c28655q.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C21214q(viewState, function4, 26);
                            c28655q.m87172p0(objM87133R3);
                        }
                        InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R3;
                        if (i18 != 4) {
                            z24 = true;
                        } else {
                            z24 = true;
                        }
                        if (i19 == 256) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        z26 = z24 | z25;
                        objM87133R4 = c28655q.m87133R();
                        if (z26) {
                            objM87133R4 = new C21245d(7, viewState, function4);
                            c28655q.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C21245d(7, viewState, function4);
                            c28655q.m87172p0(objM87133R4);
                        }
                        InterfaceC4351m interfaceC4351m3 = (InterfaceC4351m) objM87133R4;
                        if (i19 == 256) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        objM87133R5 = c28655q.m87133R();
                        if (z27) {
                            objM87133R5 = new C21862n(function4, 19);
                            c28655q.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C21862n(function4, 19);
                            c28655q.m87172p0(objM87133R5);
                        }
                        m66298K(formValidator, cVar3, interfaceC4339a9, function7, interfaceC4339a10, interfaceC4351m3, (Function1) objM87133R5, c28655q, ((i15 << 3) & 112) | C29855e.f122028d | ((i15 >> 3) & 14), 0);
                        c28655q.m87173q(false);
                    }
                    interfaceC4339a3 = interfaceC4339a4;
                    function3 = function4;
                }
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            } else {
                c28655q.m87138X();
                function3 = function2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) formValidator, (Object) function3, (Object) interfaceC4339a3, i13, i14, 0);
            }
        }
        i15 |= 3072;
        interfaceC4339a2 = interfaceC4339a;
        if ((i15 & 1171) != 1170) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c28676v0 = C28635l.f115821a;
            if (i24 != 0) {
                objM87133R9 = c28655q.m87133R();
                if (objM87133R9 == c28676v0) {
                    objM87133R9 = new C22594e(11);
                    c28655q.m87172p0(objM87133R9);
                }
                function4 = (Function1) objM87133R9;
            } else {
                function4 = function2;
            }
            if (i16 != 0) {
                objM87133R8 = c28655q.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = new C22837a(20);
                    c28655q.m87172p0(objM87133R8);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R8;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            if (viewState instanceof InterfaceC20996b.a) {
                c28655q.m87150e0(-1447520439);
                ProgressContent progressContentM58509e4 = ((InterfaceC20996b.a) viewState).getContent();
                if ((i15 & 896) == 256) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                if ((i15 & 14) != 4) {
                    z36 = true;
                } else {
                    z36 = true;
                }
                z37 = z35 | z36;
                objM87133R7 = c28655q.m87133R();
                if (z37) {
                    objM87133R7 = new C22851b(function4, viewState, 0);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C22851b(function4, viewState, 0);
                    c28655q.m87172p0(objM87133R7);
                }
                AbstractC22862m.m66395e(progressContentM58509e4, (Function1) objM87133R7, c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                if (viewState instanceof InterfaceC20996b.b) {
                    c28655q.m87150e0(-1447513173);
                    ProgressContent progressContentM58510e4 = ((InterfaceC20996b.b) viewState).getContent();
                    if ((i15 & 896) == 256) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    if ((i15 & 14) != 4) {
                        z29 = true;
                    } else {
                        z29 = true;
                    }
                    z34 = z28 | z29;
                    objM87133R6 = c28655q.m87133R();
                    if (z34) {
                        objM87133R6 = new C22851b(function4, viewState, 1);
                        c28655q.m87172p0(objM87133R6);
                    } else {
                        objM87133R6 = new C22851b(function4, viewState, 1);
                        c28655q.m87172p0(objM87133R6);
                    }
                    AbstractC22863n.m66404e(progressContentM58510e4, (Function1) objM87133R6, c28655q, 0, 0);
                    c28655q.m87173q(false);
                } else {
                    if (viewState instanceof InterfaceC20996b.c) {
                        throw AbstractC11895b.m32003v(-1447520250, c28655q, false);
                    }
                    c28655q.m87150e0(-1447504043);
                    InterfaceC20996b.c cVar4 = (InterfaceC20996b.c) viewState;
                    if ((i15 & 7168) == 2048) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objM87133R = c28655q.m87133R();
                    if (z13) {
                        objM87133R = new C21026a(interfaceC4339a4, 13);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        objM87133R = new C21026a(interfaceC4339a4, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R;
                    i18 = i15 & 14;
                    if (i18 != 4) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i19 = i15 & 896;
                    if (i19 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C22851b(viewState, function4);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C22851b(viewState, function4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    Function1 function8 = (Function1) objM87133R2;
                    if (i18 != 4) {
                        z17 = true;
                    } else {
                        z17 = true;
                    }
                    if (i19 == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z17 | z18;
                    objM87133R3 = c28655q.m87133R();
                    if (z19) {
                        objM87133R3 = new C21214q(viewState, function4, 26);
                        c28655q.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C21214q(viewState, function4, 26);
                        c28655q.m87172p0(objM87133R3);
                    }
                    InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R3;
                    if (i18 != 4) {
                        z24 = true;
                    } else {
                        z24 = true;
                    }
                    if (i19 == 256) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = z24 | z25;
                    objM87133R4 = c28655q.m87133R();
                    if (z26) {
                        objM87133R4 = new C21245d(7, viewState, function4);
                        c28655q.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C21245d(7, viewState, function4);
                        c28655q.m87172p0(objM87133R4);
                    }
                    InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R4;
                    if (i19 == 256) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    objM87133R5 = c28655q.m87133R();
                    if (z27) {
                        objM87133R5 = new C21862n(function4, 19);
                        c28655q.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C21862n(function4, 19);
                        c28655q.m87172p0(objM87133R5);
                    }
                    m66298K(formValidator, cVar4, interfaceC4339a11, function8, interfaceC4339a12, interfaceC4351m4, (Function1) objM87133R5, c28655q, ((i15 << 3) & 112) | C29855e.f122028d | ((i15 >> 3) & 14), 0);
                    c28655q.m87173q(false);
                }
                interfaceC4339a3 = interfaceC4339a4;
                function3 = function4;
            }
            interfaceC4339a3 = interfaceC4339a4;
            function3 = function4;
        } else {
            c28655q.m87138X();
            function3 = function2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22852c((Object) viewState, (Object) formValidator, (Object) function3, (Object) interfaceC4339a3, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m66331w(AbstractC20995a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m66332x() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m66333y(Function1 function1, InterfaceC20996b interfaceC20996b, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20995a.a(interfaceC20996b, it));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m66334z(Function1 function1, InterfaceC20996b interfaceC20996b, CtaAction it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC20995a.a(interfaceC20996b, it));
        return C23454a0.f92919a;
    }
}
