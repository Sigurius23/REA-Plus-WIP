package lw1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.membership.extensions.domain.models.NativeOrderDetails;
import com.whoop.membership.extensions.domain.models.NativeOrderDetailsItem;
import com.whoop.membership.extensions.domain.models.NativeOrderLineItem;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Iterator;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24671c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: lw1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;", "details", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;", "item", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/membership/extensions/domain/models/NativeOrderLineItem;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;", "f", "(Lcom/whoop/membership/extensions/domain/models/NativeOrderDetailsItem;Landroidx/compose/runtime/Composer;I)V", "membership_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24767c {
    /* JADX INFO: renamed from: d */
    public static final void m72520d(Modifier modifier, NativeOrderDetails details, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(details, "details");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1963222301);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(details) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifier4);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f14, 7);
            String title = details.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(title, modifierM3398t, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d.m121952e(c28655q, i17).getH3(), C23285v0.m67364b(c38072d.m121952e(c28655q, i17).getH3().getStyle(), 0L, 0L, null, null, 0L, 3, 0L, null, null, 16744447), null, 2, null), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87150e0(-1154646120);
            Iterator<T> it = details.getLineItems().iterator();
            while (it.hasNext()) {
                m72524h((NativeOrderLineItem) it.next(), c28655q, 0);
            }
            c28655q.m87173q(false);
            AbstractC17755i2.m50938j(AbstractC1099a.m3396r(c2314t, 0.0f, f14, 1), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
            NativeOrderDetailsItem subtotal = details.getSubtotal();
            if (subtotal == null) {
                c28655q.m87150e0(-1434104514);
            } else {
                c28655q.m87150e0(-1434104513);
                m72522f(subtotal, c28655q, 0);
            }
            c28655q.m87173q(false);
            NativeOrderDetailsItem tax = details.getTax();
            if (tax == null) {
                c28655q.m87150e0(-1434054914);
            } else {
                c28655q.m87150e0(-1434054913);
                m72522f(tax, c28655q, 0);
            }
            c28655q.m87173q(false);
            NativeOrderDetailsItem discount = details.getDiscount();
            if (discount == null) {
                c28655q.m87150e0(-1434000354);
            } else {
                c28655q.m87150e0(-1434000353);
                m72522f(discount, c28655q, 0);
            }
            c28655q.m87173q(false);
            NativeOrderDetailsItem trialDepositRefund = details.getTrialDepositRefund();
            if (trialDepositRefund == null) {
                c28655q.m87150e0(-1433935874);
            } else {
                c28655q.m87150e0(-1433935873);
                m72522f(trialDepositRefund, c28655q, 0);
            }
            c28655q.m87173q(false);
            NativeOrderDetailsItem total = details.getTotal();
            if (total == null) {
                c28655q.m87150e0(-1433884290);
            } else {
                c28655q.m87150e0(-1433884289);
                m72522f(total, c28655q, 0);
            }
            c28655q.m87173q(false);
            AbstractC17755i2.m50938j(AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f13, 0.0f, 0.0f, 13), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24671c(modifier3, details, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m72521e(Modifier modifier, NativeOrderDetails nativeOrderDetails, int i13, int i14, Composer composer, int i15) {
        m72520d(modifier, nativeOrderDetails, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    private static final void m72522f(NativeOrderDetailsItem nativeOrderDetailsItem, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(891965658);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(nativeOrderDetailsItem) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, 1 * 8, 7);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9107J, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String label = nativeOrderDetailsItem.getLabel();
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a formLabelMedium = c38072d.m121952e(c28655q, i15).getFormLabelMedium();
            long greyL3 = c38072d.m121949b(c28655q, i15).getGreyL3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(label, c2314t, greyL3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, formLabelMedium, null, c28655q, 48, i16, 196600);
            AbstractC30795n.m94707h(nativeOrderDetailsItem.getAmount(), c2314t, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getFormLabelMedium(), null, c28655q, 48, i16, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24766b(nativeOrderDetailsItem, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m72523g(NativeOrderDetailsItem nativeOrderDetailsItem, int i13, Composer composer, int i14) {
        m72522f(nativeOrderDetailsItem, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private static final void m72524h(NativeOrderLineItem nativeOrderLineItem, Composer composer, int i13) {
        int i14;
        EnumC16313m0 enumC16313m0;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-683098554);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(nativeOrderLineItem) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String name = nativeOrderLineItem.getIcon().getName();
            EnumC16313m0[] enumC16313m0ArrValues = EnumC16313m0.values();
            int length = enumC16313m0ArrValues.length;
            int i15 = 0;
            while (true) {
                if (i15 >= length) {
                    enumC16313m0 = null;
                    break;
                }
                enumC16313m0 = enumC16313m0ArrValues[i15];
                if (AbstractC22676k.m65745e(enumC16313m0.name(), name)) {
                    break;
                } else {
                    i15++;
                }
            }
            Integer numValueOf = enumC16313m0 != null ? Integer.valueOf(enumC16313m0.toWhoopIcon()) : null;
            if (numValueOf == null) {
                c28655q.m87150e0(1272170958);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1272170959);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(numValueOf.intValue(), c28655q, 6), null, AbstractC1102d.m3419p(((float) 7.5d) * 4, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, ((float) 2.5d) * 8, 0.0f, 11)), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            C0209i c0209i2 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            String title = nativeOrderLineItem.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a formLabelMedium = c38072d.m121952e(c28655q, i16).getFormLabelMedium();
            long greyL3 = c38072d.m121949b(c28655q, i16).getGreyL3();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(title, c2314t, greyL3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, formLabelMedium, null, c28655q, 48, i17, 196600);
            AbstractC30795n.m94707h(nativeOrderLineItem.getSubtitle(), c2314t, c38072d.m121949b(c28655q, i16).getGreyL3(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getFormLabelMedium(), null, c28655q, 48, i17, 196600);
            c28655q.m87173q(true);
            AbstractC30795n.m94707h(nativeOrderLineItem.getAmount(), c2314t, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getFormLabelMedium(), null, c28655q, 48, i17, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24766b(nativeOrderLineItem, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72525i(NativeOrderLineItem nativeOrderLineItem, int i13, Composer composer, int i14) {
        m72524h(nativeOrderLineItem, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
