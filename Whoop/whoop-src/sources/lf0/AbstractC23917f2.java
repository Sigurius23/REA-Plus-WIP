package lf0;

import a01.AbstractC0087g;
import a01.C0088h;
import a01.EnumC0093m;
import android.content.res.Resources;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b30.C2561k6;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gz0.EnumC16313m0;
import hy0.AbstractC17755i2;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.factory.file.internal.C19683b;
import j21.C21245d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jp1.C21851c;
import js2.C21927e;
import jt1.C21937b;
import kl2.C22571f;
import l72.C23401h;
import l80.C23434k;
import l83.C23454a0;
import lc0.C23825g;
import ld0.C23846e;
import ld0.C23847f;
import ld0.C23848g;
import ld0.C23852k;
import ld0.C23853l;
import ld0.C23859r;
import ld0.EnumC23849h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import ma0.AbstractC25369c;
import ma0.AbstractC25370d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p098dt.AbstractC12350b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39147y;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: lf0.f2 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a)\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u001e²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0017\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\u00188\n@\nX\u008a\u008e\u0002²\u0006\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lld0/r;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "q", "(Lld0/r;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "title", "subtitle", "K", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Lld0/f;", "entryPoint", "Lkotlin/Function0;", "onClick", "n", "(Lld0/f;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "", "showBottomSheet", "searchQuery", "Lld0/h;", "selectedSortOption", "", "La01/m;", "filterableStatusTypes", "selectedStatusFilters", "advanced-labs_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC23917f2 {

    /* JADX INFO: renamed from: lf0.f2$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            String strM238l = ((C0088h) t14).getTitle();
            Locale locale = Locale.ROOT;
            String upperCase = strM238l.toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            String upperCase2 = ((C0088h) t15).getTitle().toUpperCase(locale);
            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
            return AbstractC30060g.m92127q(upperCase, upperCase2);
        }
    }

    /* JADX INFO: renamed from: lf0.f2$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f94551a;

        static {
            int[] iArr = new int[EnumC23849h.values().length];
            try {
                iArr[EnumC23849h.STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23849h.ALPHABETICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94551a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m70309A(InterfaceC28601c1 interfaceC28601c1) {
        m70314F(interfaceC28601c1, false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m70310B(InterfaceC28601c1 interfaceC28601c1, EnumC0093m statusType) {
        AbstractC22676k.m65750j(statusType, "statusType");
        m70342v(interfaceC28601c1, m70341u(interfaceC28601c1).contains(statusType) ? AbstractC12350b.m34604y(statusType, m70341u(interfaceC28601c1)) : AbstractC12350b.m34555D(statusType, m70341u(interfaceC28601c1)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m70311C(InterfaceC28601c1 interfaceC28601c1, EnumC23849h sortOptionType) {
        AbstractC22676k.m65750j(sortOptionType, "sortOptionType");
        m70318J(interfaceC28601c1, sortOptionType);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final boolean m70312D(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m70313E(C23859r c23859r, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m70337q(c23859r, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m70314F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: G */
    private static final String m70315G(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m70316H(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: I */
    private static final EnumC23849h m70317I(InterfaceC28601c1 interfaceC28601c1) {
        return (EnumC23849h) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: J */
    private static final void m70318J(InterfaceC28601c1 interfaceC28601c1, EnumC23849h enumC23849h) {
        interfaceC28601c1.setValue(enumC23849h);
    }

    /* JADX INFO: renamed from: K */
    private static final void m70319K(Modifier modifier, String str, String str2, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(816950101);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(str2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            float f13 = 8;
            float f14 = ((float) 1.5d) * f13;
            float f15 = f13 * ((float) 0.5d);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(modifier4, "SearchableBiomarkerListHeader_" + str)), f15, 0.0f, f15, f14, 2);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q2, 48);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            C2886a c2886aM8418P = c38072d.m121952e(c28655q2, i17).getT3();
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(str, layoutWeightElement, c38072d.m121949b(c28655q2, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q2, (i15 >> 3) & 14, i18, 196600);
            AbstractC30795n.m94707h(str2, AbstractC1102d.m3428y(c2314t, null, false, 3), c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, ((i15 >> 6) & 14) | 48, i18, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2561k6(modifier3, str, str2, i13, i14, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m70320L(Modifier modifier, String str, String str2, int i13, int i14, Composer composer, int i15) {
        m70319K(modifier, str, str2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m70334n(C23847f c23847f, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-895162356);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c23847f) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC31926e.m99375j(AbstractC1136a.m3599a(AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, 2 * 8, 7), "BottomSheetEntryPoint"), null, 0L, null, null, null, 0.0f, AbstractC37817c.m121344e(1342933628, c28655q, new C21245d(14, interfaceC4339a, c23847f)), c28655q, 12582918, 126);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22571f(c23847f, interfaceC4339a, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m70335o(InterfaceC4339a interfaceC4339a, C23847f c23847f, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3362g = AbstractC1092a.m3362g(c2314t, false, null, null, interfaceC4339a, 15);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
            String strM70073b = c23847f.getTitle();
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            C2886a c2886aM8438s = c38072d.m121952e(c28655q, i14).getH5();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f13 = 2 * 8;
            AbstractC30795n.m94707h(strM70073b, AbstractC1099a.m3394p(f13, new LayoutWeightElement(1.0f, true)), jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8438s, null, c28655q, 0, C2886a.f11498d << 18, 196600);
            EnumC16313m0 enumC16313m0M70072a = c23847f.getRightIcon();
            if (enumC16313m0M70072a == null) {
                c28655q.m87150e0(1552154059);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1552154060);
                float f14 = 4;
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(enumC16313m0M70072a.toWhoopIcon(), c28655q, 0), null, AbstractC1102d.m3419p(f14 * f14, AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, f13, 0.0f, 11)), c38072d.m121949b(c28655q, i14).getWhite70(), c28655q, 432, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m70336p(C23847f c23847f, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m70334n(c23847f, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x0220 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0226  */
    /* JADX WARN: Code duplicated, block: B:113:0x023b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0260  */
    /* JADX WARN: Code duplicated, block: B:116:0x0262  */
    /* JADX WARN: Code duplicated, block: B:119:0x0273  */
    /* JADX WARN: Code duplicated, block: B:121:0x0277  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:135:0x0302  */
    /* JADX WARN: Code duplicated, block: B:136:0x0304  */
    /* JADX WARN: Code duplicated, block: B:139:0x030b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x030d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0321  */
    /* JADX WARN: Code duplicated, block: B:146:0x0385  */
    /* JADX WARN: Code duplicated, block: B:147:0x0393  */
    /* JADX WARN: Code duplicated, block: B:149:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:159:0x03ed A[LOOP:0: B:157:0x03e7->B:159:0x03ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:162:0x0414  */
    /* JADX WARN: Code duplicated, block: B:164:0x0424  */
    /* JADX WARN: Code duplicated, block: B:168:0x045c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0464  */
    /* JADX WARN: Code duplicated, block: B:172:0x047c  */
    /* JADX WARN: Code duplicated, block: B:173:0x048c  */
    /* JADX WARN: Code duplicated, block: B:179:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:181:0x04be  */
    /* JADX WARN: Code duplicated, block: B:184:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:186:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:192:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x050c  */
    /* JADX WARN: Code duplicated, block: B:199:0x056b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0573  */
    /* JADX WARN: Code duplicated, block: B:203:0x0589  */
    /* JADX WARN: Code duplicated, block: B:204:0x0597  */
    /* JADX WARN: Code duplicated, block: B:210:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:211:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:218:0x0631  */
    /* JADX WARN: Code duplicated, block: B:220:0x063d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0647  */
    /* JADX WARN: Code duplicated, block: B:223:0x065b  */
    /* JADX WARN: Code duplicated, block: B:226:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:227:0x0674  */
    /* JADX WARN: Code duplicated, block: B:230:0x0687  */
    /* JADX WARN: Code duplicated, block: B:233:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:235:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:238:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:242:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:262:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:75:0x011c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:82:0x016e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0199  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static final void m70337q(C23859r viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Function1 function2;
        int i16;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28655q c28655q;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        Object obj;
        Function1 function4;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        Object objM87133R2;
        InterfaceC28601c1 interfaceC28601c2;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c3;
        Object objM87133R4;
        InterfaceC28670t2 interfaceC28670t2;
        boolean zM87153g;
        Object objM87133R5;
        InterfaceC28601c1 interfaceC28601c4;
        boolean zM87153g2;
        ArrayList arrayList;
        Iterator it;
        Object next;
        String upperCase;
        String upperCase2;
        InterfaceC28601c1 interfaceC28601c5;
        Object obj2;
        Object obj3;
        boolean zM87153g3;
        LinkedHashMap linkedHashMap;
        int iM73988W;
        Iterator it3;
        InterfaceC28601c1 interfaceC28601c6;
        C23846e c23846e;
        ArrayList arrayList2;
        C23846e c23846e2;
        Object obj4;
        Map map;
        boolean zM87153g4;
        C25271y c25271y;
        ArrayList arrayList3;
        Iterator it4;
        C25271y c25271y2;
        Object next2;
        C23846e c23846e3;
        boolean zIsEmpty;
        boolean z13;
        Object obj5;
        List list;
        int iHashCode;
        InterfaceC4339a interfaceC4339a;
        C0209i c0209i;
        int i17;
        boolean z14;
        Object objM87133R6;
        Object objM87133R7;
        C25271y c25271y3;
        InterfaceC28601c1 interfaceC28601c7;
        Function1 function5;
        InterfaceC28601c1 interfaceC28601c8;
        C2314t c2314t2;
        boolean z15;
        float f13;
        C28655q c28655q2;
        C23848g c23848gM70106c;
        Object objM87133R8;
        Object obj6;
        InterfaceC28601c1 interfaceC28601c9;
        int i18;
        Function1 function6;
        float f14;
        C2314t c2314t3;
        C25271y c25271y4;
        int i19;
        Iterator it5;
        int i24;
        C28655q c28655q3;
        Modifier modifier5;
        Object obj7;
        InterfaceC28601c1 interfaceC28601c10;
        boolean z16;
        Object next3;
        int i25;
        C23846e c23846e4;
        List list2;
        boolean z17;
        boolean zM87153g5;
        Object objM87133R9;
        float f15;
        Function1 function7;
        C2314t c2314t4;
        int i26;
        int i27;
        Object obj8;
        InterfaceC28601c1 interfaceC28601c11;
        int i28;
        C28655q c28655q4;
        C28655q c28655q5;
        C23848g c23848gM70106c2;
        Object objM87133R10;
        boolean zM87153g6;
        Object objM87133R11;
        Object objM87133R12;
        C28655q c28655q6;
        ArrayList arrayList4;
        Iterator it6;
        List listM74152u1;
        String strM70104a;
        int i29;
        int i34;
        int i35;
        float f16;
        C2314t c2314t5;
        boolean z18;
        String strM70108f;
        Object objM87133R13;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q7 = (C28655q) composer;
        c28655q7.m87154g0(905144864);
        int i36 = (i13 & 6) == 0 ? (c28655q7.m87157i(viewState) ? 4 : 2) | i13 : i13;
        int i37 = i14 & 2;
        if (i37 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i36 |= c28655q7.m87153g(modifier2) ? 32 : 16;
            }
            i15 = i14 & 4;
            if (i15 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q7.m87157i(function2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i36 |= i16;
                }
                if ((i36 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q7.m87135U(i36 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i37 != 0) {
                        modifier4 = c2314t;
                    } else {
                        modifier4 = modifier2;
                    }
                    obj = C28635l.f115821a;
                    if (i15 != 0) {
                        objM87133R13 = c28655q7.m87133R();
                        if (objM87133R13 == obj) {
                            objM87133R13 = new C23825g(17);
                            c28655q7.m87172p0(objM87133R13);
                        }
                        function4 = (Function1) objM87133R13;
                    } else {
                        function4 = function2;
                    }
                    objM87133R = c28655q7.m87133R();
                    if (objM87133R == obj) {
                        objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                        c28655q7.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    objM87133R2 = c28655q7.m87133R();
                    if (objM87133R2 == obj) {
                        strM70108f = viewState.getSearchQuery();
                        if (strM70108f == null) {
                            strM70108f = "";
                        }
                        objM87133R2 = AbstractC28683x.m87272z(strM70108f);
                        c28655q7.m87172p0(objM87133R2);
                    }
                    interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                    objM87133R3 = c28655q7.m87133R();
                    if (objM87133R3 == obj) {
                        objM87133R3 = AbstractC28683x.m87272z(EnumC23849h.STATUS);
                        c28655q7.m87172p0(objM87133R3);
                    }
                    interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                    objM87133R4 = c28655q7.m87133R();
                    if (objM87133R4 == obj) {
                        objM87133R4 = AbstractC28683x.m87264r(new C19683b(viewState, 27));
                        c28655q7.m87172p0(objM87133R4);
                    }
                    interfaceC28670t2 = (InterfaceC28670t2) objM87133R4;
                    zM87153g = c28655q7.m87153g(m70340t(interfaceC28670t2));
                    objM87133R5 = c28655q7.m87133R();
                    if (zM87153g || objM87133R5 == obj) {
                        objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                        c28655q7.m87172p0(objM87133R5);
                    }
                    interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                    zM87153g2 = c28655q7.m87153g(m70315G(interfaceC28601c2)) | c28655q7.m87153g(viewState.m70105b());
                    Object objM87133R14 = c28655q7.m87133R();
                    if (!zM87153g2 || objM87133R14 == obj) {
                        if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                            arrayList = viewState.m70105b();
                        } else {
                            List<C0088h> listM70105b = viewState.m70105b();
                            arrayList = new ArrayList();
                            it = listM70105b.iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                String strM238l = ((C0088h) next).getTitle();
                                Locale locale = Locale.ROOT;
                                upperCase = strM238l.toUpperCase(locale);
                                Iterator it7 = it;
                                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                                InterfaceC28601c1 interfaceC28601c12 = interfaceC28601c1;
                                upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale);
                                AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                                if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                    arrayList.add(next);
                                }
                                it = it7;
                                interfaceC28601c1 = interfaceC28601c12;
                            }
                        }
                        interfaceC28601c5 = interfaceC28601c1;
                        c28655q7.m87172p0(arrayList);
                        obj2 = arrayList;
                    } else {
                        interfaceC28601c5 = interfaceC28601c1;
                        obj2 = objM87133R14;
                    }
                    obj3 = (List) obj2;
                    zM87153g3 = c28655q7.m87153g(viewState.m70109g()) | c28655q7.m87153g(obj3);
                    Object objM87133R15 = c28655q7.m87133R();
                    if (!zM87153g3 || objM87133R15 == obj) {
                        List<C23846e> listM70109g = viewState.m70109g();
                        iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g, 10));
                        if (iM73988W < 16) {
                            iM73988W = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM73988W);
                        it3 = listM70109g.iterator();
                        while (it3.hasNext()) {
                            Object next4 = it3.next();
                            c23846e = (C23846e) next4;
                            Iterator it8 = it3;
                            arrayList2 = new ArrayList();
                            for (Object obj9 : (Iterable) obj3) {
                                Object obj10 = obj3;
                                c23846e2 = c23846e;
                                InterfaceC28601c1 interfaceC28601c13 = interfaceC28601c3;
                                if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                                    arrayList2.add(obj9);
                                }
                                obj3 = obj10;
                                c23846e = c23846e2;
                                interfaceC28601c3 = interfaceC28601c13;
                            }
                            linkedHashMap.put(next4, arrayList2);
                            it3 = it8;
                        }
                        interfaceC28601c6 = interfaceC28601c3;
                        c28655q7.m87172p0(linkedHashMap);
                        obj4 = linkedHashMap;
                    } else {
                        interfaceC28601c6 = interfaceC28601c3;
                        obj4 = objM87133R15;
                    }
                    map = (Map) obj4;
                    zM87153g4 = c28655q7.m87153g(m70341u(interfaceC28601c4)) | c28655q7.m87153g(map);
                    Object objM87133R16 = c28655q7.m87133R();
                    c25271y = C25271y.f99162w;
                    if (!zM87153g4 || objM87133R16 == obj) {
                        List<C23846e> listM70109g2 = viewState.m70109g();
                        arrayList3 = new ArrayList();
                        it4 = listM70109g2.iterator();
                        while (it4.hasNext()) {
                            next2 = it4.next();
                            c23846e3 = (C23846e) next2;
                            zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                            z13 = !zIsEmpty;
                            Iterator it9 = it4;
                            C25271y c25271y5 = c25271y;
                            if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                                if (zIsEmpty && m70341u(interfaceC28601c4).contains(c23846e3.getType())) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                            }
                            if (z13) {
                                arrayList3.add(next2);
                            }
                            it4 = it9;
                            c25271y = c25271y5;
                        }
                        c25271y2 = c25271y;
                        c28655q7.m87172p0(arrayList3);
                        obj5 = arrayList3;
                    } else {
                        c25271y2 = c25271y;
                        obj5 = objM87133R16;
                    }
                    list = (List) obj5;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
                    iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q7.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q7, modifier4);
                    InterfaceC0221l.f734a.getClass();
                    interfaceC4339a = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(interfaceC4339a);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m);
                    c0209i = C0217k.f732j;
                    if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N);
                    TextResource textResourceM21278l = AbstractC8693b.m21278l(m70315G(interfaceC28601c2));
                    TextResource textResourceM21278l2 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                    float f17 = 8;
                    Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f17, 7);
                    i17 = i36 & 896;
                    if (i17 == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objM87133R6 = c28655q7.m87133R();
                    if (z14 || objM87133R6 == obj) {
                        objM87133R6 = new C23434k(function4, 9);
                        c28655q7.m87172p0(objM87133R6);
                    }
                    Function1 function8 = (Function1) objM87133R6;
                    objM87133R7 = c28655q7.m87133R();
                    if (objM87133R7 == obj) {
                        objM87133R7 = new C21927e(7, interfaceC28601c2);
                        c28655q7.m87172p0(objM87133R7);
                    }
                    int i38 = TextResource.$stable;
                    c25271y3 = c25271y2;
                    interfaceC28601c7 = interfaceC28601c6;
                    function5 = function4;
                    interfaceC28601c8 = interfaceC28601c5;
                    c2314t2 = c2314t;
                    z15 = false;
                    f13 = f17;
                    AbstractC17795v0.m51127j(modifierM3398t, textResourceM21278l, textResourceM21278l2, null, 0L, 0, false, null, 0L, false, null, false, true, function8, (Function1) objM87133R7, c28655q7, (i38 << 6) | (i38 << 3) | 6, 24960, 4088);
                    c28655q2 = c28655q7;
                    c23848gM70106c = viewState.getBottomSheet();
                    if (c23848gM70106c == null) {
                        c28655q2.m87150e0(-1286731078);
                        c28655q2.m87173q(false);
                        interfaceC28601c9 = interfaceC28601c8;
                        obj6 = obj;
                    } else {
                        c28655q2.m87150e0(-1286731077);
                        C23847f c23847fM70074a = c23848gM70106c.getEntryPoint();
                        objM87133R8 = c28655q2.m87133R();
                        obj6 = obj;
                        if (objM87133R8 == obj6) {
                            interfaceC28601c9 = interfaceC28601c8;
                            objM87133R8 = new C21937b(16, interfaceC28601c9);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            interfaceC28601c9 = interfaceC28601c8;
                        }
                        m70334n(c23847fM70074a, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                        c28655q2.m87173q(false);
                    }
                    i18 = b.f94551a[m70317I(interfaceC28601c7).ordinal()];
                    if (i18 != 1) {
                        function6 = function5;
                        f14 = f13;
                        c2314t3 = c2314t2;
                        c25271y4 = c25271y3;
                        i19 = 3;
                        c28655q2.m87150e0(-1286376158);
                        it5 = list.iterator();
                        i24 = 0;
                        c28655q3 = c28655q2;
                        while (it5.hasNext()) {
                            next3 = it5.next();
                            i25 = i24 + 1;
                            if (i24 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            c23846e4 = (C23846e) next3;
                            list2 = (List) map.getOrDefault(c23846e4, c25271y4);
                            int size = list2.size();
                            if (i17 == 256) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zM87153g5 = z17 | c28655q3.m87153g(c23846e4);
                            objM87133R9 = c28655q3.m87133R();
                            if (zM87153g5 || objM87133R9 == obj6) {
                                objM87133R9 = new C21851c(26, function6, c23846e4);
                                c28655q3.m87172p0(objM87133R9);
                            }
                            Iterator it10 = it5;
                            Modifier modifier6 = modifier4;
                            C25271y c25271y6 = c25271y4;
                            f15 = f14;
                            function7 = function6;
                            c2314t4 = c2314t3;
                            m70319K(AbstractC1131a.m3500d(c2314t3, (Function1) objM87133R9), c23846e4.getText(), ((Resources) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size, Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1)), c28655q3, 0, 0);
                            c28655q3.m87150e0(1205463656);
                            i26 = 0;
                            for (Object obj11 : list2) {
                                i28 = i26 + 1;
                                if (i26 >= 0) {
                                    AbstractC37056f.m118977d0();
                                    throw null;
                                }
                                AbstractC0087g.m220g(null, (C0088h) obj11, function7, c28655q3, (C0088h.f270q << 3) | i17, 1);
                                if (i26 < AbstractC37056f.m118951C(list2)) {
                                    c28655q3.m87150e0(193273050);
                                    AbstractC25012a.m73388u((float) 1.5d, f15, c2314t4, c28655q3, false);
                                } else {
                                    c28655q3.m87150e0(193373955);
                                    c28655q3.m87173q(false);
                                }
                                i26 = i28;
                            }
                            c28655q3.m87173q(false);
                            if (i24 < AbstractC37056f.m118951C(list)) {
                                c28655q3.m87150e0(1082626293);
                                int i39 = i19;
                                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t4, 0.0f, i39 * f15, 1);
                                C28655q c28655q8 = c28655q3;
                                i27 = i39;
                                obj8 = obj6;
                                interfaceC28601c11 = interfaceC28601c9;
                                AbstractC17755i2.m50938j(modifierM3396r, null, null, null, null, 0L, 0L, null, c28655q8, 6, 254);
                                c28655q3 = c28655q8;
                                c28655q3.m87173q(false);
                            } else {
                                i27 = i19;
                                obj8 = obj6;
                                interfaceC28601c11 = interfaceC28601c9;
                                c28655q3.m87150e0(1082734886);
                                c28655q3.m87173q(false);
                            }
                            obj6 = obj8;
                            c2314t3 = c2314t4;
                            interfaceC28601c9 = interfaceC28601c11;
                            i24 = i25;
                            i17 = i17;
                            i19 = i27;
                            it5 = it10;
                            modifier4 = modifier6;
                            c25271y4 = c25271y6;
                            function6 = function7;
                            f14 = f15;
                            c28655q3 = c28655q3;
                        }
                        modifier5 = modifier4;
                        function5 = function6;
                        obj7 = obj6;
                        interfaceC28601c10 = interfaceC28601c9;
                        z16 = false;
                        c28655q3.m87173q(false);
                        c28655q4 = c28655q3;
                    } else {
                        if (i18 == 2) {
                            throw AbstractC11895b.m32003v(1205428753, c28655q2, false);
                        }
                        c28655q2.m87150e0(-1284601222);
                        arrayList4 = new ArrayList();
                        it6 = list.iterator();
                        while (it6.hasNext()) {
                            AbstractC25265s.m74141p0(arrayList4, (List) map.getOrDefault((C23846e) it6.next(), c25271y3));
                        }
                        listM74152u1 = AbstractC25265s.m74152u1(arrayList4, new a());
                        int size2 = listM74152u1.size();
                        strM70104a = viewState.getAllBiomarkersTitle();
                        if (strM70104a == null) {
                            c28655q2.m87150e0(1205502295);
                            strM70104a = AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99432a);
                        } else {
                            c28655q2.m87150e0(1205501303);
                        }
                        c28655q2.m87173q(false);
                        m70319K(null, strM70104a, ((Resources) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size2, Arrays.copyOf(new Object[]{Integer.valueOf(size2)}, 1)), c28655q2, 0, 1);
                        i29 = 0;
                        for (Object obj12 : listM74152u1) {
                            i34 = i29 + 1;
                            if (i29 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            i35 = i29;
                            Function1 function9 = function5;
                            AbstractC0087g.m220g(null, (C0088h) obj12, function9, c28655q2, (C0088h.f270q << 3) | i17, 1);
                            if (i35 < AbstractC37056f.m118951C(listM74152u1)) {
                                c28655q2.m87150e0(1201665868);
                                f16 = f13;
                                c2314t5 = c2314t2;
                                z18 = false;
                                AbstractC25012a.m73388u((float) 1.5d, f16, c2314t5, c28655q2, false);
                            } else {
                                f16 = f13;
                                c2314t5 = c2314t2;
                                z18 = false;
                                c28655q2.m87150e0(1201759085);
                                c28655q2.m87173q(false);
                            }
                            function5 = function9;
                            f13 = f16;
                            c2314t2 = c2314t5;
                            z15 = z18;
                            i29 = i34;
                        }
                        z16 = z15;
                        c28655q2.m87173q(z16);
                        modifier5 = modifier4;
                        obj7 = obj6;
                        interfaceC28601c10 = interfaceC28601c9;
                        c28655q4 = c28655q2;
                    }
                    c28655q4.m87173q(true);
                    if (m70312D(interfaceC28601c10)) {
                        c28655q4.m87150e0(-2033941146);
                        c23848gM70106c2 = viewState.getBottomSheet();
                        if (c23848gM70106c2 == null) {
                            c28655q4.m87150e0(1372333915);
                            c28655q4.m87173q(z16);
                            c28655q6 = c28655q4;
                        } else {
                            c28655q4.m87150e0(1372333916);
                            Set<EnumC0093m> setM70341u = m70341u(interfaceC28601c4);
                            EnumC23849h enumC23849hM70317I = m70317I(interfaceC28601c7);
                            objM87133R10 = c28655q4.m87133R();
                            if (objM87133R10 == obj7) {
                                objM87133R10 = new C21937b(17, interfaceC28601c10);
                                c28655q4.m87172p0(objM87133R10);
                            }
                            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R10;
                            zM87153g6 = c28655q4.m87153g(interfaceC28601c4);
                            objM87133R11 = c28655q4.m87133R();
                            if (zM87153g6 || objM87133R11 == obj7) {
                                objM87133R11 = new C21927e(8, interfaceC28601c4);
                                c28655q4.m87172p0(objM87133R11);
                            }
                            Function1 function10 = (Function1) objM87133R11;
                            objM87133R12 = c28655q4.m87133R();
                            if (objM87133R12 == obj7) {
                                objM87133R12 = new C21927e(9, interfaceC28601c7);
                                c28655q4.m87172p0(objM87133R12);
                            }
                            C28655q c28655q9 = c28655q4;
                            AbstractC23901b2.m70250i(c23848gM70106c2, setM70341u, enumC23849hM70317I, null, interfaceC4339a2, function10, (Function1) objM87133R12, c28655q9, 1597440, 8);
                            C28655q c28655q10 = c28655q9;
                            z16 = false;
                            c28655q10.m87173q(false);
                            c28655q6 = c28655q10;
                        }
                        c28655q6.m87173q(z16);
                        c28655q5 = c28655q6;
                    } else {
                        c28655q4.m87150e0(1373114434);
                        c28655q4.m87173q(z16);
                        c28655q5 = c28655q4;
                    }
                    modifier3 = modifier5;
                    function3 = function5;
                    c28655q = c28655q5;
                } else {
                    c28655q7.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                    c28655q = c28655q7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C23401h(i13, i14, 19, (Object) viewState, (Object) modifier3, function3);
                }
            }
            i36 |= 384;
            function2 = function1;
            if ((i36 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i36 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                obj = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R13 = c28655q7.m87133R();
                    if (objM87133R13 == obj) {
                        objM87133R13 = new C23825g(17);
                        c28655q7.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q7.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q7.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q7.m87133R();
                if (objM87133R2 == obj) {
                    strM70108f = viewState.getSearchQuery();
                    if (strM70108f == null) {
                        strM70108f = "";
                    }
                    objM87133R2 = AbstractC28683x.m87272z(strM70108f);
                    c28655q7.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q7.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC23849h.STATUS);
                    c28655q7.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q7.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = AbstractC28683x.m87264r(new C19683b(viewState, 27));
                    c28655q7.m87172p0(objM87133R4);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R4;
                zM87153g = c28655q7.m87153g(m70340t(interfaceC28670t2));
                objM87133R5 = c28655q7.m87133R();
                if (zM87153g) {
                    objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                    c28655q7.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                    c28655q7.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                zM87153g2 = c28655q7.m87153g(m70315G(interfaceC28601c2)) | c28655q7.m87153g(viewState.m70105b());
                Object objM87133R17 = c28655q7.m87133R();
                if (zM87153g2) {
                    if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                        arrayList = viewState.m70105b();
                    } else {
                        List<C0088h> listM70105b2 = viewState.m70105b();
                        arrayList = new ArrayList();
                        it = listM70105b2.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            String strM238l2 = ((C0088h) next).getTitle();
                            Locale locale2 = Locale.ROOT;
                            upperCase = strM238l2.toUpperCase(locale2);
                            Iterator it11 = it;
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            InterfaceC28601c1 interfaceC28601c14 = interfaceC28601c1;
                            upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale2);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(next);
                            }
                            it = it11;
                            interfaceC28601c1 = interfaceC28601c14;
                        }
                    }
                    interfaceC28601c5 = interfaceC28601c1;
                    c28655q7.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                        arrayList = viewState.m70105b();
                    } else {
                        List<C0088h> listM70105b3 = viewState.m70105b();
                        arrayList = new ArrayList();
                        it = listM70105b3.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            String strM238l3 = ((C0088h) next).getTitle();
                            Locale locale3 = Locale.ROOT;
                            upperCase = strM238l3.toUpperCase(locale3);
                            Iterator it12 = it;
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            InterfaceC28601c1 interfaceC28601c15 = interfaceC28601c1;
                            upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale3);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(next);
                            }
                            it = it12;
                            interfaceC28601c1 = interfaceC28601c15;
                        }
                    }
                    interfaceC28601c5 = interfaceC28601c1;
                    c28655q7.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                obj3 = (List) obj2;
                zM87153g3 = c28655q7.m87153g(viewState.m70109g()) | c28655q7.m87153g(obj3);
                Object objM87133R18 = c28655q7.m87133R();
                if (zM87153g3) {
                    List<C23846e> listM70109g3 = viewState.m70109g();
                    iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g3, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM73988W);
                    it3 = listM70109g3.iterator();
                    while (it3.hasNext()) {
                        Object next5 = it3.next();
                        c23846e = (C23846e) next5;
                        Iterator it13 = it3;
                        arrayList2 = new ArrayList();
                        while (r14.hasNext()) {
                            Object obj13 = obj3;
                            c23846e2 = c23846e;
                            InterfaceC28601c1 interfaceC28601c16 = interfaceC28601c3;
                            if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                                arrayList2.add(obj9);
                            }
                            obj3 = obj13;
                            c23846e = c23846e2;
                            interfaceC28601c3 = interfaceC28601c16;
                        }
                        linkedHashMap.put(next5, arrayList2);
                        it3 = it13;
                    }
                    interfaceC28601c6 = interfaceC28601c3;
                    c28655q7.m87172p0(linkedHashMap);
                    obj4 = linkedHashMap;
                } else {
                    List<C23846e> listM70109g4 = viewState.m70109g();
                    iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g4, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM73988W);
                    it3 = listM70109g4.iterator();
                    while (it3.hasNext()) {
                        Object next6 = it3.next();
                        c23846e = (C23846e) next6;
                        Iterator it14 = it3;
                        arrayList2 = new ArrayList();
                        while (r14.hasNext()) {
                            Object obj14 = obj3;
                            c23846e2 = c23846e;
                            InterfaceC28601c1 interfaceC28601c17 = interfaceC28601c3;
                            if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                                arrayList2.add(obj9);
                            }
                            obj3 = obj14;
                            c23846e = c23846e2;
                            interfaceC28601c3 = interfaceC28601c17;
                        }
                        linkedHashMap.put(next6, arrayList2);
                        it3 = it14;
                    }
                    interfaceC28601c6 = interfaceC28601c3;
                    c28655q7.m87172p0(linkedHashMap);
                    obj4 = linkedHashMap;
                }
                map = (Map) obj4;
                zM87153g4 = c28655q7.m87153g(m70341u(interfaceC28601c4)) | c28655q7.m87153g(map);
                Object objM87133R19 = c28655q7.m87133R();
                c25271y = C25271y.f99162w;
                if (zM87153g4) {
                    List<C23846e> listM70109g5 = viewState.m70109g();
                    arrayList3 = new ArrayList();
                    it4 = listM70109g5.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        c23846e3 = (C23846e) next2;
                        zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                        z13 = !zIsEmpty;
                        Iterator it15 = it4;
                        C25271y c25271y7 = c25271y;
                        if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                            if (zIsEmpty) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            arrayList3.add(next2);
                        }
                        it4 = it15;
                        c25271y = c25271y7;
                    }
                    c25271y2 = c25271y;
                    c28655q7.m87172p0(arrayList3);
                    obj5 = arrayList3;
                } else {
                    List<C23846e> listM70109g6 = viewState.m70109g();
                    arrayList3 = new ArrayList();
                    it4 = listM70109g6.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        c23846e3 = (C23846e) next2;
                        zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                        z13 = !zIsEmpty;
                        Iterator it16 = it4;
                        C25271y c25271y8 = c25271y;
                        if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                            if (zIsEmpty) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            arrayList3.add(next2);
                        }
                        it4 = it16;
                        c25271y = c25271y8;
                    }
                    c25271y2 = c25271y;
                    c28655q7.m87172p0(arrayList3);
                    obj5 = arrayList3;
                }
                list = (List) obj5;
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q7.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q7, modifier4);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m2);
                c0209i = C0217k.f732j;
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N2);
                TextResource textResourceM21278l3 = AbstractC8693b.m21278l(m70315G(interfaceC28601c2));
                TextResource textResourceM21278l4 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                float f18 = 8;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f18, 7);
                i17 = i36 & 896;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R6 = c28655q7.m87133R();
                if (z14) {
                    objM87133R6 = new C23434k(function4, 9);
                    c28655q7.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C23434k(function4, 9);
                    c28655q7.m87172p0(objM87133R6);
                }
                Function1 function11 = (Function1) objM87133R6;
                objM87133R7 = c28655q7.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = new C21927e(7, interfaceC28601c2);
                    c28655q7.m87172p0(objM87133R7);
                }
                int i310 = TextResource.$stable;
                c25271y3 = c25271y2;
                interfaceC28601c7 = interfaceC28601c6;
                function5 = function4;
                interfaceC28601c8 = interfaceC28601c5;
                c2314t2 = c2314t;
                z15 = false;
                f13 = f18;
                AbstractC17795v0.m51127j(modifierM3398t2, textResourceM21278l3, textResourceM21278l4, null, 0L, 0, false, null, 0L, false, null, false, true, function11, (Function1) objM87133R7, c28655q7, (i310 << 6) | (i310 << 3) | 6, 24960, 4088);
                c28655q2 = c28655q7;
                c23848gM70106c = viewState.getBottomSheet();
                if (c23848gM70106c == null) {
                    c28655q2.m87150e0(-1286731078);
                    c28655q2.m87173q(false);
                    interfaceC28601c9 = interfaceC28601c8;
                    obj6 = obj;
                } else {
                    c28655q2.m87150e0(-1286731077);
                    C23847f c23847fM70074a2 = c23848gM70106c.getEntryPoint();
                    objM87133R8 = c28655q2.m87133R();
                    obj6 = obj;
                    if (objM87133R8 == obj6) {
                        interfaceC28601c9 = interfaceC28601c8;
                        objM87133R8 = new C21937b(16, interfaceC28601c9);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c9 = interfaceC28601c8;
                    }
                    m70334n(c23847fM70074a2, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                    c28655q2.m87173q(false);
                }
                i18 = b.f94551a[m70317I(interfaceC28601c7).ordinal()];
                if (i18 != 1) {
                    function6 = function5;
                    f14 = f13;
                    c2314t3 = c2314t2;
                    c25271y4 = c25271y3;
                    i19 = 3;
                    c28655q2.m87150e0(-1286376158);
                    it5 = list.iterator();
                    i24 = 0;
                    c28655q3 = c28655q2;
                    while (it5.hasNext()) {
                        next3 = it5.next();
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c23846e4 = (C23846e) next3;
                        list2 = (List) map.getOrDefault(c23846e4, c25271y4);
                        int size3 = list2.size();
                        if (i17 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g5 = z17 | c28655q3.m87153g(c23846e4);
                        objM87133R9 = c28655q3.m87133R();
                        if (zM87153g5) {
                            objM87133R9 = new C21851c(26, function6, c23846e4);
                            c28655q3.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C21851c(26, function6, c23846e4);
                            c28655q3.m87172p0(objM87133R9);
                        }
                        Iterator it17 = it5;
                        Modifier modifier7 = modifier4;
                        C25271y c25271y9 = c25271y4;
                        f15 = f14;
                        function7 = function6;
                        c2314t4 = c2314t3;
                        m70319K(AbstractC1131a.m3500d(c2314t3, (Function1) objM87133R9), c23846e4.getText(), ((Resources) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size3, Arrays.copyOf(new Object[]{Integer.valueOf(size3)}, 1)), c28655q3, 0, 0);
                        c28655q3.m87150e0(1205463656);
                        i26 = 0;
                        while (r3.hasNext()) {
                            i28 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC0087g.m220g(null, (C0088h) obj11, function7, c28655q3, (C0088h.f270q << 3) | i17, 1);
                            if (i26 < AbstractC37056f.m118951C(list2)) {
                                c28655q3.m87150e0(193273050);
                                AbstractC25012a.m73388u((float) 1.5d, f15, c2314t4, c28655q3, false);
                            } else {
                                c28655q3.m87150e0(193373955);
                                c28655q3.m87173q(false);
                            }
                            i26 = i28;
                        }
                        c28655q3.m87173q(false);
                        if (i24 < AbstractC37056f.m118951C(list)) {
                            c28655q3.m87150e0(1082626293);
                            int i311 = i19;
                            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t4, 0.0f, i311 * f15, 1);
                            C28655q c28655q11 = c28655q3;
                            i27 = i311;
                            obj8 = obj6;
                            interfaceC28601c11 = interfaceC28601c9;
                            AbstractC17755i2.m50938j(modifierM3396r2, null, null, null, null, 0L, 0L, null, c28655q11, 6, 254);
                            c28655q3 = c28655q11;
                            c28655q3.m87173q(false);
                        } else {
                            i27 = i19;
                            obj8 = obj6;
                            interfaceC28601c11 = interfaceC28601c9;
                            c28655q3.m87150e0(1082734886);
                            c28655q3.m87173q(false);
                        }
                        obj6 = obj8;
                        c2314t3 = c2314t4;
                        interfaceC28601c9 = interfaceC28601c11;
                        i24 = i25;
                        i17 = i17;
                        i19 = i27;
                        it5 = it17;
                        modifier4 = modifier7;
                        c25271y4 = c25271y9;
                        function6 = function7;
                        f14 = f15;
                        c28655q3 = c28655q3;
                    }
                    modifier5 = modifier4;
                    function5 = function6;
                    obj7 = obj6;
                    interfaceC28601c10 = interfaceC28601c9;
                    z16 = false;
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                } else {
                    if (i18 == 2) {
                        throw AbstractC11895b.m32003v(1205428753, c28655q2, false);
                    }
                    c28655q2.m87150e0(-1284601222);
                    arrayList4 = new ArrayList();
                    it6 = list.iterator();
                    while (it6.hasNext()) {
                        AbstractC25265s.m74141p0(arrayList4, (List) map.getOrDefault((C23846e) it6.next(), c25271y3));
                    }
                    listM74152u1 = AbstractC25265s.m74152u1(arrayList4, new a());
                    int size4 = listM74152u1.size();
                    strM70104a = viewState.getAllBiomarkersTitle();
                    if (strM70104a == null) {
                        c28655q2.m87150e0(1205502295);
                        strM70104a = AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99432a);
                    } else {
                        c28655q2.m87150e0(1205501303);
                    }
                    c28655q2.m87173q(false);
                    m70319K(null, strM70104a, ((Resources) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size4, Arrays.copyOf(new Object[]{Integer.valueOf(size4)}, 1)), c28655q2, 0, 1);
                    i29 = 0;
                    while (r15.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        i35 = i29;
                        Function1 function12 = function5;
                        AbstractC0087g.m220g(null, (C0088h) obj12, function12, c28655q2, (C0088h.f270q << 3) | i17, 1);
                        if (i35 < AbstractC37056f.m118951C(listM74152u1)) {
                            c28655q2.m87150e0(1201665868);
                            f16 = f13;
                            c2314t5 = c2314t2;
                            z18 = false;
                            AbstractC25012a.m73388u((float) 1.5d, f16, c2314t5, c28655q2, false);
                        } else {
                            f16 = f13;
                            c2314t5 = c2314t2;
                            z18 = false;
                            c28655q2.m87150e0(1201759085);
                            c28655q2.m87173q(false);
                        }
                        function5 = function12;
                        f13 = f16;
                        c2314t2 = c2314t5;
                        z15 = z18;
                        i29 = i34;
                    }
                    z16 = z15;
                    c28655q2.m87173q(z16);
                    modifier5 = modifier4;
                    obj7 = obj6;
                    interfaceC28601c10 = interfaceC28601c9;
                    c28655q4 = c28655q2;
                }
                c28655q4.m87173q(true);
                if (m70312D(interfaceC28601c10)) {
                    c28655q4.m87150e0(-2033941146);
                    c23848gM70106c2 = viewState.getBottomSheet();
                    if (c23848gM70106c2 == null) {
                        c28655q4.m87150e0(1372333915);
                        c28655q4.m87173q(z16);
                        c28655q6 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1372333916);
                        Set<EnumC0093m> setM70341u2 = m70341u(interfaceC28601c4);
                        EnumC23849h enumC23849hM70317I2 = m70317I(interfaceC28601c7);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj7) {
                            objM87133R10 = new C21937b(17, interfaceC28601c10);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R10;
                        zM87153g6 = c28655q4.m87153g(interfaceC28601c4);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g6) {
                            objM87133R11 = new C21927e(8, interfaceC28601c4);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C21927e(8, interfaceC28601c4);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Function1 function13 = (Function1) objM87133R11;
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj7) {
                            objM87133R12 = new C21927e(9, interfaceC28601c7);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        C28655q c28655q12 = c28655q4;
                        AbstractC23901b2.m70250i(c23848gM70106c2, setM70341u2, enumC23849hM70317I2, null, interfaceC4339a3, function13, (Function1) objM87133R12, c28655q12, 1597440, 8);
                        C28655q c28655q13 = c28655q12;
                        z16 = false;
                        c28655q13.m87173q(false);
                        c28655q6 = c28655q13;
                    }
                    c28655q6.m87173q(z16);
                    c28655q5 = c28655q6;
                } else {
                    c28655q4.m87150e0(1373114434);
                    c28655q4.m87173q(z16);
                    c28655q5 = c28655q4;
                }
                modifier3 = modifier5;
                function3 = function5;
                c28655q = c28655q5;
            } else {
                c28655q7.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 19, (Object) viewState, (Object) modifier3, function3);
            }
        }
        i36 |= 48;
        modifier2 = modifier;
        i15 = i14 & 4;
        if (i15 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q7.m87157i(function2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i36 |= i16;
            }
            if ((i36 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q7.m87135U(i36 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i37 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                obj = C28635l.f115821a;
                if (i15 != 0) {
                    objM87133R13 = c28655q7.m87133R();
                    if (objM87133R13 == obj) {
                        objM87133R13 = new C23825g(17);
                        c28655q7.m87172p0(objM87133R13);
                    }
                    function4 = (Function1) objM87133R13;
                } else {
                    function4 = function2;
                }
                objM87133R = c28655q7.m87133R();
                if (objM87133R == obj) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q7.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                objM87133R2 = c28655q7.m87133R();
                if (objM87133R2 == obj) {
                    strM70108f = viewState.getSearchQuery();
                    if (strM70108f == null) {
                        strM70108f = "";
                    }
                    objM87133R2 = AbstractC28683x.m87272z(strM70108f);
                    c28655q7.m87172p0(objM87133R2);
                }
                interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                objM87133R3 = c28655q7.m87133R();
                if (objM87133R3 == obj) {
                    objM87133R3 = AbstractC28683x.m87272z(EnumC23849h.STATUS);
                    c28655q7.m87172p0(objM87133R3);
                }
                interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
                objM87133R4 = c28655q7.m87133R();
                if (objM87133R4 == obj) {
                    objM87133R4 = AbstractC28683x.m87264r(new C19683b(viewState, 27));
                    c28655q7.m87172p0(objM87133R4);
                }
                interfaceC28670t2 = (InterfaceC28670t2) objM87133R4;
                zM87153g = c28655q7.m87153g(m70340t(interfaceC28670t2));
                objM87133R5 = c28655q7.m87133R();
                if (zM87153g) {
                    objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                    c28655q7.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                    c28655q7.m87172p0(objM87133R5);
                }
                interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
                zM87153g2 = c28655q7.m87153g(m70315G(interfaceC28601c2)) | c28655q7.m87153g(viewState.m70105b());
                Object objM87133R110 = c28655q7.m87133R();
                if (zM87153g2) {
                    if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                        arrayList = viewState.m70105b();
                    } else {
                        List<C0088h> listM70105b4 = viewState.m70105b();
                        arrayList = new ArrayList();
                        it = listM70105b4.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            String strM238l4 = ((C0088h) next).getTitle();
                            Locale locale4 = Locale.ROOT;
                            upperCase = strM238l4.toUpperCase(locale4);
                            Iterator it18 = it;
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            InterfaceC28601c1 interfaceC28601c18 = interfaceC28601c1;
                            upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale4);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(next);
                            }
                            it = it18;
                            interfaceC28601c1 = interfaceC28601c18;
                        }
                    }
                    interfaceC28601c5 = interfaceC28601c1;
                    c28655q7.m87172p0(arrayList);
                    obj2 = arrayList;
                } else {
                    if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                        arrayList = viewState.m70105b();
                    } else {
                        List<C0088h> listM70105b5 = viewState.m70105b();
                        arrayList = new ArrayList();
                        it = listM70105b5.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            String strM238l5 = ((C0088h) next).getTitle();
                            Locale locale5 = Locale.ROOT;
                            upperCase = strM238l5.toUpperCase(locale5);
                            Iterator it19 = it;
                            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                            InterfaceC28601c1 interfaceC28601c19 = interfaceC28601c1;
                            upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale5);
                            AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                            if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                                arrayList.add(next);
                            }
                            it = it19;
                            interfaceC28601c1 = interfaceC28601c19;
                        }
                    }
                    interfaceC28601c5 = interfaceC28601c1;
                    c28655q7.m87172p0(arrayList);
                    obj2 = arrayList;
                }
                obj3 = (List) obj2;
                zM87153g3 = c28655q7.m87153g(viewState.m70109g()) | c28655q7.m87153g(obj3);
                Object objM87133R111 = c28655q7.m87133R();
                if (zM87153g3) {
                    List<C23846e> listM70109g7 = viewState.m70109g();
                    iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g7, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM73988W);
                    it3 = listM70109g7.iterator();
                    while (it3.hasNext()) {
                        Object next7 = it3.next();
                        c23846e = (C23846e) next7;
                        Iterator it110 = it3;
                        arrayList2 = new ArrayList();
                        while (r14.hasNext()) {
                            Object obj15 = obj3;
                            c23846e2 = c23846e;
                            InterfaceC28601c1 interfaceC28601c110 = interfaceC28601c3;
                            if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                                arrayList2.add(obj9);
                            }
                            obj3 = obj15;
                            c23846e = c23846e2;
                            interfaceC28601c3 = interfaceC28601c110;
                        }
                        linkedHashMap.put(next7, arrayList2);
                        it3 = it110;
                    }
                    interfaceC28601c6 = interfaceC28601c3;
                    c28655q7.m87172p0(linkedHashMap);
                    obj4 = linkedHashMap;
                } else {
                    List<C23846e> listM70109g8 = viewState.m70109g();
                    iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g8, 10));
                    if (iM73988W < 16) {
                        iM73988W = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM73988W);
                    it3 = listM70109g8.iterator();
                    while (it3.hasNext()) {
                        Object next8 = it3.next();
                        c23846e = (C23846e) next8;
                        Iterator it111 = it3;
                        arrayList2 = new ArrayList();
                        while (r14.hasNext()) {
                            Object obj16 = obj3;
                            c23846e2 = c23846e;
                            InterfaceC28601c1 interfaceC28601c111 = interfaceC28601c3;
                            if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                                arrayList2.add(obj9);
                            }
                            obj3 = obj16;
                            c23846e = c23846e2;
                            interfaceC28601c3 = interfaceC28601c111;
                        }
                        linkedHashMap.put(next8, arrayList2);
                        it3 = it111;
                    }
                    interfaceC28601c6 = interfaceC28601c3;
                    c28655q7.m87172p0(linkedHashMap);
                    obj4 = linkedHashMap;
                }
                map = (Map) obj4;
                zM87153g4 = c28655q7.m87153g(m70341u(interfaceC28601c4)) | c28655q7.m87153g(map);
                Object objM87133R112 = c28655q7.m87133R();
                c25271y = C25271y.f99162w;
                if (zM87153g4) {
                    List<C23846e> listM70109g9 = viewState.m70109g();
                    arrayList3 = new ArrayList();
                    it4 = listM70109g9.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        c23846e3 = (C23846e) next2;
                        zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                        z13 = !zIsEmpty;
                        Iterator it112 = it4;
                        C25271y c25271y10 = c25271y;
                        if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                            if (zIsEmpty) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            arrayList3.add(next2);
                        }
                        it4 = it112;
                        c25271y = c25271y10;
                    }
                    c25271y2 = c25271y;
                    c28655q7.m87172p0(arrayList3);
                    obj5 = arrayList3;
                } else {
                    List<C23846e> listM70109g10 = viewState.m70109g();
                    arrayList3 = new ArrayList();
                    it4 = listM70109g10.iterator();
                    while (it4.hasNext()) {
                        next2 = it4.next();
                        c23846e3 = (C23846e) next2;
                        zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                        z13 = !zIsEmpty;
                        Iterator it113 = it4;
                        C25271y c25271y11 = c25271y;
                        if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                            if (zIsEmpty) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            arrayList3.add(next2);
                        }
                        it4 = it113;
                        c25271y = c25271y11;
                    }
                    c25271y2 = c25271y;
                    c28655q7.m87172p0(arrayList3);
                    obj5 = arrayList3;
                }
                list = (List) obj5;
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
                iHashCode = Long.hashCode(c28655q7.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, modifier4);
                InterfaceC0221l.f734a.getClass();
                interfaceC4339a = C0217k.f724b;
                c28655q7.m87158i0();
                if (c28655q7.f115903S) {
                    c28655q7.m87163l(interfaceC4339a);
                } else {
                    c28655q7.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m3);
                c0209i = C0217k.f732j;
                if (c28655q7.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N3);
                TextResource textResourceM21278l5 = AbstractC8693b.m21278l(m70315G(interfaceC28601c2));
                TextResource textResourceM21278l6 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
                float f19 = 8;
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f19, 7);
                i17 = i36 & 896;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objM87133R6 = c28655q7.m87133R();
                if (z14) {
                    objM87133R6 = new C23434k(function4, 9);
                    c28655q7.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new C23434k(function4, 9);
                    c28655q7.m87172p0(objM87133R6);
                }
                Function1 function14 = (Function1) objM87133R6;
                objM87133R7 = c28655q7.m87133R();
                if (objM87133R7 == obj) {
                    objM87133R7 = new C21927e(7, interfaceC28601c2);
                    c28655q7.m87172p0(objM87133R7);
                }
                int i312 = TextResource.$stable;
                c25271y3 = c25271y2;
                interfaceC28601c7 = interfaceC28601c6;
                function5 = function4;
                interfaceC28601c8 = interfaceC28601c5;
                c2314t2 = c2314t;
                z15 = false;
                f13 = f19;
                AbstractC17795v0.m51127j(modifierM3398t3, textResourceM21278l5, textResourceM21278l6, null, 0L, 0, false, null, 0L, false, null, false, true, function14, (Function1) objM87133R7, c28655q7, (i312 << 6) | (i312 << 3) | 6, 24960, 4088);
                c28655q2 = c28655q7;
                c23848gM70106c = viewState.getBottomSheet();
                if (c23848gM70106c == null) {
                    c28655q2.m87150e0(-1286731078);
                    c28655q2.m87173q(false);
                    interfaceC28601c9 = interfaceC28601c8;
                    obj6 = obj;
                } else {
                    c28655q2.m87150e0(-1286731077);
                    C23847f c23847fM70074a3 = c23848gM70106c.getEntryPoint();
                    objM87133R8 = c28655q2.m87133R();
                    obj6 = obj;
                    if (objM87133R8 == obj6) {
                        interfaceC28601c9 = interfaceC28601c8;
                        objM87133R8 = new C21937b(16, interfaceC28601c9);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        interfaceC28601c9 = interfaceC28601c8;
                    }
                    m70334n(c23847fM70074a3, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                    c28655q2.m87173q(false);
                }
                i18 = b.f94551a[m70317I(interfaceC28601c7).ordinal()];
                if (i18 != 1) {
                    function6 = function5;
                    f14 = f13;
                    c2314t3 = c2314t2;
                    c25271y4 = c25271y3;
                    i19 = 3;
                    c28655q2.m87150e0(-1286376158);
                    it5 = list.iterator();
                    i24 = 0;
                    c28655q3 = c28655q2;
                    while (it5.hasNext()) {
                        next3 = it5.next();
                        i25 = i24 + 1;
                        if (i24 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        c23846e4 = (C23846e) next3;
                        list2 = (List) map.getOrDefault(c23846e4, c25271y4);
                        int size5 = list2.size();
                        if (i17 == 256) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g5 = z17 | c28655q3.m87153g(c23846e4);
                        objM87133R9 = c28655q3.m87133R();
                        if (zM87153g5) {
                            objM87133R9 = new C21851c(26, function6, c23846e4);
                            c28655q3.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C21851c(26, function6, c23846e4);
                            c28655q3.m87172p0(objM87133R9);
                        }
                        Iterator it114 = it5;
                        Modifier modifier8 = modifier4;
                        C25271y c25271y12 = c25271y4;
                        f15 = f14;
                        function7 = function6;
                        c2314t4 = c2314t3;
                        m70319K(AbstractC1131a.m3500d(c2314t3, (Function1) objM87133R9), c23846e4.getText(), ((Resources) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size5, Arrays.copyOf(new Object[]{Integer.valueOf(size5)}, 1)), c28655q3, 0, 0);
                        c28655q3.m87150e0(1205463656);
                        i26 = 0;
                        while (r3.hasNext()) {
                            i28 = i26 + 1;
                            if (i26 >= 0) {
                                AbstractC37056f.m118977d0();
                                throw null;
                            }
                            AbstractC0087g.m220g(null, (C0088h) obj11, function7, c28655q3, (C0088h.f270q << 3) | i17, 1);
                            if (i26 < AbstractC37056f.m118951C(list2)) {
                                c28655q3.m87150e0(193273050);
                                AbstractC25012a.m73388u((float) 1.5d, f15, c2314t4, c28655q3, false);
                            } else {
                                c28655q3.m87150e0(193373955);
                                c28655q3.m87173q(false);
                            }
                            i26 = i28;
                        }
                        c28655q3.m87173q(false);
                        if (i24 < AbstractC37056f.m118951C(list)) {
                            c28655q3.m87150e0(1082626293);
                            int i313 = i19;
                            Modifier modifierM3396r3 = AbstractC1099a.m3396r(c2314t4, 0.0f, i313 * f15, 1);
                            C28655q c28655q14 = c28655q3;
                            i27 = i313;
                            obj8 = obj6;
                            interfaceC28601c11 = interfaceC28601c9;
                            AbstractC17755i2.m50938j(modifierM3396r3, null, null, null, null, 0L, 0L, null, c28655q14, 6, 254);
                            c28655q3 = c28655q14;
                            c28655q3.m87173q(false);
                        } else {
                            i27 = i19;
                            obj8 = obj6;
                            interfaceC28601c11 = interfaceC28601c9;
                            c28655q3.m87150e0(1082734886);
                            c28655q3.m87173q(false);
                        }
                        obj6 = obj8;
                        c2314t3 = c2314t4;
                        interfaceC28601c9 = interfaceC28601c11;
                        i24 = i25;
                        i17 = i17;
                        i19 = i27;
                        it5 = it114;
                        modifier4 = modifier8;
                        c25271y4 = c25271y12;
                        function6 = function7;
                        f14 = f15;
                        c28655q3 = c28655q3;
                    }
                    modifier5 = modifier4;
                    function5 = function6;
                    obj7 = obj6;
                    interfaceC28601c10 = interfaceC28601c9;
                    z16 = false;
                    c28655q3.m87173q(false);
                    c28655q4 = c28655q3;
                } else {
                    if (i18 == 2) {
                        throw AbstractC11895b.m32003v(1205428753, c28655q2, false);
                    }
                    c28655q2.m87150e0(-1284601222);
                    arrayList4 = new ArrayList();
                    it6 = list.iterator();
                    while (it6.hasNext()) {
                        AbstractC25265s.m74141p0(arrayList4, (List) map.getOrDefault((C23846e) it6.next(), c25271y3));
                    }
                    listM74152u1 = AbstractC25265s.m74152u1(arrayList4, new a());
                    int size6 = listM74152u1.size();
                    strM70104a = viewState.getAllBiomarkersTitle();
                    if (strM70104a == null) {
                        c28655q2.m87150e0(1205502295);
                        strM70104a = AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99432a);
                    } else {
                        c28655q2.m87150e0(1205501303);
                    }
                    c28655q2.m87173q(false);
                    m70319K(null, strM70104a, ((Resources) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size6, Arrays.copyOf(new Object[]{Integer.valueOf(size6)}, 1)), c28655q2, 0, 1);
                    i29 = 0;
                    while (r15.hasNext()) {
                        i34 = i29 + 1;
                        if (i29 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        i35 = i29;
                        Function1 function15 = function5;
                        AbstractC0087g.m220g(null, (C0088h) obj12, function15, c28655q2, (C0088h.f270q << 3) | i17, 1);
                        if (i35 < AbstractC37056f.m118951C(listM74152u1)) {
                            c28655q2.m87150e0(1201665868);
                            f16 = f13;
                            c2314t5 = c2314t2;
                            z18 = false;
                            AbstractC25012a.m73388u((float) 1.5d, f16, c2314t5, c28655q2, false);
                        } else {
                            f16 = f13;
                            c2314t5 = c2314t2;
                            z18 = false;
                            c28655q2.m87150e0(1201759085);
                            c28655q2.m87173q(false);
                        }
                        function5 = function15;
                        f13 = f16;
                        c2314t2 = c2314t5;
                        z15 = z18;
                        i29 = i34;
                    }
                    z16 = z15;
                    c28655q2.m87173q(z16);
                    modifier5 = modifier4;
                    obj7 = obj6;
                    interfaceC28601c10 = interfaceC28601c9;
                    c28655q4 = c28655q2;
                }
                c28655q4.m87173q(true);
                if (m70312D(interfaceC28601c10)) {
                    c28655q4.m87150e0(-2033941146);
                    c23848gM70106c2 = viewState.getBottomSheet();
                    if (c23848gM70106c2 == null) {
                        c28655q4.m87150e0(1372333915);
                        c28655q4.m87173q(z16);
                        c28655q6 = c28655q4;
                    } else {
                        c28655q4.m87150e0(1372333916);
                        Set<EnumC0093m> setM70341u3 = m70341u(interfaceC28601c4);
                        EnumC23849h enumC23849hM70317I3 = m70317I(interfaceC28601c7);
                        objM87133R10 = c28655q4.m87133R();
                        if (objM87133R10 == obj7) {
                            objM87133R10 = new C21937b(17, interfaceC28601c10);
                            c28655q4.m87172p0(objM87133R10);
                        }
                        InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R10;
                        zM87153g6 = c28655q4.m87153g(interfaceC28601c4);
                        objM87133R11 = c28655q4.m87133R();
                        if (zM87153g6) {
                            objM87133R11 = new C21927e(8, interfaceC28601c4);
                            c28655q4.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C21927e(8, interfaceC28601c4);
                            c28655q4.m87172p0(objM87133R11);
                        }
                        Function1 function16 = (Function1) objM87133R11;
                        objM87133R12 = c28655q4.m87133R();
                        if (objM87133R12 == obj7) {
                            objM87133R12 = new C21927e(9, interfaceC28601c7);
                            c28655q4.m87172p0(objM87133R12);
                        }
                        C28655q c28655q15 = c28655q4;
                        AbstractC23901b2.m70250i(c23848gM70106c2, setM70341u3, enumC23849hM70317I3, null, interfaceC4339a4, function16, (Function1) objM87133R12, c28655q15, 1597440, 8);
                        C28655q c28655q16 = c28655q15;
                        z16 = false;
                        c28655q16.m87173q(false);
                        c28655q6 = c28655q16;
                    }
                    c28655q6.m87173q(z16);
                    c28655q5 = c28655q6;
                } else {
                    c28655q4.m87150e0(1373114434);
                    c28655q4.m87173q(z16);
                    c28655q5 = c28655q4;
                }
                modifier3 = modifier5;
                function3 = function5;
                c28655q = c28655q5;
            } else {
                c28655q7.m87138X();
                modifier3 = modifier2;
                function3 = function2;
                c28655q = c28655q7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 19, (Object) viewState, (Object) modifier3, function3);
            }
        }
        i36 |= 384;
        function2 = function1;
        if ((i36 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q7.m87135U(i36 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i37 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            obj = C28635l.f115821a;
            if (i15 != 0) {
                objM87133R13 = c28655q7.m87133R();
                if (objM87133R13 == obj) {
                    objM87133R13 = new C23825g(17);
                    c28655q7.m87172p0(objM87133R13);
                }
                function4 = (Function1) objM87133R13;
            } else {
                function4 = function2;
            }
            objM87133R = c28655q7.m87133R();
            if (objM87133R == obj) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q7.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            objM87133R2 = c28655q7.m87133R();
            if (objM87133R2 == obj) {
                strM70108f = viewState.getSearchQuery();
                if (strM70108f == null) {
                    strM70108f = "";
                }
                objM87133R2 = AbstractC28683x.m87272z(strM70108f);
                c28655q7.m87172p0(objM87133R2);
            }
            interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
            objM87133R3 = c28655q7.m87133R();
            if (objM87133R3 == obj) {
                objM87133R3 = AbstractC28683x.m87272z(EnumC23849h.STATUS);
                c28655q7.m87172p0(objM87133R3);
            }
            interfaceC28601c3 = (InterfaceC28601c1) objM87133R3;
            objM87133R4 = c28655q7.m87133R();
            if (objM87133R4 == obj) {
                objM87133R4 = AbstractC28683x.m87264r(new C19683b(viewState, 27));
                c28655q7.m87172p0(objM87133R4);
            }
            interfaceC28670t2 = (InterfaceC28670t2) objM87133R4;
            zM87153g = c28655q7.m87153g(m70340t(interfaceC28670t2));
            objM87133R5 = c28655q7.m87133R();
            if (zM87153g) {
                objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                c28655q7.m87172p0(objM87133R5);
            } else {
                objM87133R5 = AbstractC28683x.m87272z(m70340t(interfaceC28670t2));
                c28655q7.m87172p0(objM87133R5);
            }
            interfaceC28601c4 = (InterfaceC28601c1) objM87133R5;
            zM87153g2 = c28655q7.m87153g(m70315G(interfaceC28601c2)) | c28655q7.m87153g(viewState.m70105b());
            Object objM87133R113 = c28655q7.m87133R();
            if (zM87153g2) {
                if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                    arrayList = viewState.m70105b();
                } else {
                    List<C0088h> listM70105b6 = viewState.m70105b();
                    arrayList = new ArrayList();
                    it = listM70105b6.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        String strM238l6 = ((C0088h) next).getTitle();
                        Locale locale6 = Locale.ROOT;
                        upperCase = strM238l6.toUpperCase(locale6);
                        Iterator it115 = it;
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        InterfaceC28601c1 interfaceC28601c112 = interfaceC28601c1;
                        upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale6);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                            arrayList.add(next);
                        }
                        it = it115;
                        interfaceC28601c1 = interfaceC28601c112;
                    }
                }
                interfaceC28601c5 = interfaceC28601c1;
                c28655q7.m87172p0(arrayList);
                obj2 = arrayList;
            } else {
                if (AbstractC39414r.m125890i0(m70315G(interfaceC28601c2))) {
                    arrayList = viewState.m70105b();
                } else {
                    List<C0088h> listM70105b7 = viewState.m70105b();
                    arrayList = new ArrayList();
                    it = listM70105b7.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        String strM238l7 = ((C0088h) next).getTitle();
                        Locale locale7 = Locale.ROOT;
                        upperCase = strM238l7.toUpperCase(locale7);
                        Iterator it116 = it;
                        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                        InterfaceC28601c1 interfaceC28601c113 = interfaceC28601c1;
                        upperCase2 = m70315G(interfaceC28601c2).toUpperCase(locale7);
                        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
                        if (AbstractC39414r.m125876U(upperCase, AbstractC39414r.m125869O0(upperCase2).toString(), false)) {
                            arrayList.add(next);
                        }
                        it = it116;
                        interfaceC28601c1 = interfaceC28601c113;
                    }
                }
                interfaceC28601c5 = interfaceC28601c1;
                c28655q7.m87172p0(arrayList);
                obj2 = arrayList;
            }
            obj3 = (List) obj2;
            zM87153g3 = c28655q7.m87153g(viewState.m70109g()) | c28655q7.m87153g(obj3);
            Object objM87133R114 = c28655q7.m87133R();
            if (zM87153g3) {
                List<C23846e> listM70109g11 = viewState.m70109g();
                iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g11, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                linkedHashMap = new LinkedHashMap(iM73988W);
                it3 = listM70109g11.iterator();
                while (it3.hasNext()) {
                    Object next9 = it3.next();
                    c23846e = (C23846e) next9;
                    Iterator it117 = it3;
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        Object obj17 = obj3;
                        c23846e2 = c23846e;
                        InterfaceC28601c1 interfaceC28601c114 = interfaceC28601c3;
                        if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                            arrayList2.add(obj9);
                        }
                        obj3 = obj17;
                        c23846e = c23846e2;
                        interfaceC28601c3 = interfaceC28601c114;
                    }
                    linkedHashMap.put(next9, arrayList2);
                    it3 = it117;
                }
                interfaceC28601c6 = interfaceC28601c3;
                c28655q7.m87172p0(linkedHashMap);
                obj4 = linkedHashMap;
            } else {
                List<C23846e> listM70109g12 = viewState.m70109g();
                iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(listM70109g12, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                linkedHashMap = new LinkedHashMap(iM73988W);
                it3 = listM70109g12.iterator();
                while (it3.hasNext()) {
                    Object next10 = it3.next();
                    c23846e = (C23846e) next10;
                    Iterator it118 = it3;
                    arrayList2 = new ArrayList();
                    while (r14.hasNext()) {
                        Object obj18 = obj3;
                        c23846e2 = c23846e;
                        InterfaceC28601c1 interfaceC28601c115 = interfaceC28601c3;
                        if (((C0088h) obj9).getStatusType() == c23846e2.getType()) {
                            arrayList2.add(obj9);
                        }
                        obj3 = obj18;
                        c23846e = c23846e2;
                        interfaceC28601c3 = interfaceC28601c115;
                    }
                    linkedHashMap.put(next10, arrayList2);
                    it3 = it118;
                }
                interfaceC28601c6 = interfaceC28601c3;
                c28655q7.m87172p0(linkedHashMap);
                obj4 = linkedHashMap;
            }
            map = (Map) obj4;
            zM87153g4 = c28655q7.m87153g(m70341u(interfaceC28601c4)) | c28655q7.m87153g(map);
            Object objM87133R115 = c28655q7.m87133R();
            c25271y = C25271y.f99162w;
            if (zM87153g4) {
                List<C23846e> listM70109g13 = viewState.m70109g();
                arrayList3 = new ArrayList();
                it4 = listM70109g13.iterator();
                while (it4.hasNext()) {
                    next2 = it4.next();
                    c23846e3 = (C23846e) next2;
                    zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                    z13 = !zIsEmpty;
                    Iterator it119 = it4;
                    C25271y c25271y13 = c25271y;
                    if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                        if (zIsEmpty) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        arrayList3.add(next2);
                    }
                    it4 = it119;
                    c25271y = c25271y13;
                }
                c25271y2 = c25271y;
                c28655q7.m87172p0(arrayList3);
                obj5 = arrayList3;
            } else {
                List<C23846e> listM70109g14 = viewState.m70109g();
                arrayList3 = new ArrayList();
                it4 = listM70109g14.iterator();
                while (it4.hasNext()) {
                    next2 = it4.next();
                    c23846e3 = (C23846e) next2;
                    zIsEmpty = ((Collection) map.getOrDefault(c23846e3, c25271y)).isEmpty();
                    z13 = !zIsEmpty;
                    Iterator it1110 = it4;
                    C25271y c25271y14 = c25271y;
                    if (m70340t(interfaceC28670t2).contains(c23846e3.getType())) {
                        if (zIsEmpty) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                    }
                    if (z13) {
                        arrayList3.add(next2);
                    }
                    it4 = it1110;
                    c25271y = c25271y14;
                }
                c25271y2 = c25271y;
                c28655q7.m87172p0(arrayList3);
                obj5 = arrayList3;
            }
            list = (List) obj5;
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q7, 0);
            iHashCode = Long.hashCode(c28655q7.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q7.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q7, modifier4);
            InterfaceC0221l.f734a.getClass();
            interfaceC4339a = C0217k.f724b;
            c28655q7.m87158i0();
            if (c28655q7.f115903S) {
                c28655q7.m87163l(interfaceC4339a);
            } else {
                c28655q7.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.f729g, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q7.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N4);
            TextResource textResourceM21278l7 = AbstractC8693b.m21278l(m70315G(interfaceC28601c2));
            TextResource textResourceM21278l8 = AbstractC8693b.m21278l(viewState.getSearchPlaceholder());
            float f110 = 8;
            Modifier modifierM3398t4 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 2 * f110, 7);
            i17 = i36 & 896;
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objM87133R6 = c28655q7.m87133R();
            if (z14) {
                objM87133R6 = new C23434k(function4, 9);
                c28655q7.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new C23434k(function4, 9);
                c28655q7.m87172p0(objM87133R6);
            }
            Function1 function17 = (Function1) objM87133R6;
            objM87133R7 = c28655q7.m87133R();
            if (objM87133R7 == obj) {
                objM87133R7 = new C21927e(7, interfaceC28601c2);
                c28655q7.m87172p0(objM87133R7);
            }
            int i314 = TextResource.$stable;
            c25271y3 = c25271y2;
            interfaceC28601c7 = interfaceC28601c6;
            function5 = function4;
            interfaceC28601c8 = interfaceC28601c5;
            c2314t2 = c2314t;
            z15 = false;
            f13 = f110;
            AbstractC17795v0.m51127j(modifierM3398t4, textResourceM21278l7, textResourceM21278l8, null, 0L, 0, false, null, 0L, false, null, false, true, function17, (Function1) objM87133R7, c28655q7, (i314 << 6) | (i314 << 3) | 6, 24960, 4088);
            c28655q2 = c28655q7;
            c23848gM70106c = viewState.getBottomSheet();
            if (c23848gM70106c == null) {
                c28655q2.m87150e0(-1286731078);
                c28655q2.m87173q(false);
                interfaceC28601c9 = interfaceC28601c8;
                obj6 = obj;
            } else {
                c28655q2.m87150e0(-1286731077);
                C23847f c23847fM70074a4 = c23848gM70106c.getEntryPoint();
                objM87133R8 = c28655q2.m87133R();
                obj6 = obj;
                if (objM87133R8 == obj6) {
                    interfaceC28601c9 = interfaceC28601c8;
                    objM87133R8 = new C21937b(16, interfaceC28601c9);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    interfaceC28601c9 = interfaceC28601c8;
                }
                m70334n(c23847fM70074a4, (InterfaceC4339a) objM87133R8, c28655q2, 48);
                c28655q2.m87173q(false);
            }
            i18 = b.f94551a[m70317I(interfaceC28601c7).ordinal()];
            if (i18 != 1) {
                function6 = function5;
                f14 = f13;
                c2314t3 = c2314t2;
                c25271y4 = c25271y3;
                i19 = 3;
                c28655q2.m87150e0(-1286376158);
                it5 = list.iterator();
                i24 = 0;
                c28655q3 = c28655q2;
                while (it5.hasNext()) {
                    next3 = it5.next();
                    i25 = i24 + 1;
                    if (i24 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    c23846e4 = (C23846e) next3;
                    list2 = (List) map.getOrDefault(c23846e4, c25271y4);
                    int size7 = list2.size();
                    if (i17 == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g5 = z17 | c28655q3.m87153g(c23846e4);
                    objM87133R9 = c28655q3.m87133R();
                    if (zM87153g5) {
                        objM87133R9 = new C21851c(26, function6, c23846e4);
                        c28655q3.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C21851c(26, function6, c23846e4);
                        c28655q3.m87172p0(objM87133R9);
                    }
                    Iterator it1111 = it5;
                    Modifier modifier9 = modifier4;
                    C25271y c25271y15 = c25271y4;
                    f15 = f14;
                    function7 = function6;
                    c2314t4 = c2314t3;
                    m70319K(AbstractC1131a.m3500d(c2314t3, (Function1) objM87133R9), c23846e4.getText(), ((Resources) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size7, Arrays.copyOf(new Object[]{Integer.valueOf(size7)}, 1)), c28655q3, 0, 0);
                    c28655q3.m87150e0(1205463656);
                    i26 = 0;
                    while (r3.hasNext()) {
                        i28 = i26 + 1;
                        if (i26 >= 0) {
                            AbstractC37056f.m118977d0();
                            throw null;
                        }
                        AbstractC0087g.m220g(null, (C0088h) obj11, function7, c28655q3, (C0088h.f270q << 3) | i17, 1);
                        if (i26 < AbstractC37056f.m118951C(list2)) {
                            c28655q3.m87150e0(193273050);
                            AbstractC25012a.m73388u((float) 1.5d, f15, c2314t4, c28655q3, false);
                        } else {
                            c28655q3.m87150e0(193373955);
                            c28655q3.m87173q(false);
                        }
                        i26 = i28;
                    }
                    c28655q3.m87173q(false);
                    if (i24 < AbstractC37056f.m118951C(list)) {
                        c28655q3.m87150e0(1082626293);
                        int i315 = i19;
                        Modifier modifierM3396r4 = AbstractC1099a.m3396r(c2314t4, 0.0f, i315 * f15, 1);
                        C28655q c28655q17 = c28655q3;
                        i27 = i315;
                        obj8 = obj6;
                        interfaceC28601c11 = interfaceC28601c9;
                        AbstractC17755i2.m50938j(modifierM3396r4, null, null, null, null, 0L, 0L, null, c28655q17, 6, 254);
                        c28655q3 = c28655q17;
                        c28655q3.m87173q(false);
                    } else {
                        i27 = i19;
                        obj8 = obj6;
                        interfaceC28601c11 = interfaceC28601c9;
                        c28655q3.m87150e0(1082734886);
                        c28655q3.m87173q(false);
                    }
                    obj6 = obj8;
                    c2314t3 = c2314t4;
                    interfaceC28601c9 = interfaceC28601c11;
                    i24 = i25;
                    i17 = i17;
                    i19 = i27;
                    it5 = it1111;
                    modifier4 = modifier9;
                    c25271y4 = c25271y15;
                    function6 = function7;
                    f14 = f15;
                    c28655q3 = c28655q3;
                }
                modifier5 = modifier4;
                function5 = function6;
                obj7 = obj6;
                interfaceC28601c10 = interfaceC28601c9;
                z16 = false;
                c28655q3.m87173q(false);
                c28655q4 = c28655q3;
            } else {
                if (i18 == 2) {
                    throw AbstractC11895b.m32003v(1205428753, c28655q2, false);
                }
                c28655q2.m87150e0(-1284601222);
                arrayList4 = new ArrayList();
                it6 = list.iterator();
                while (it6.hasNext()) {
                    AbstractC25265s.m74141p0(arrayList4, (List) map.getOrDefault((C23846e) it6.next(), c25271y3));
                }
                listM74152u1 = AbstractC25265s.m74152u1(arrayList4, new a());
                int size8 = listM74152u1.size();
                strM70104a = viewState.getAllBiomarkersTitle();
                if (strM70104a == null) {
                    c28655q2.m87150e0(1205502295);
                    strM70104a = AbstractC30060g.m92103Y(c28655q2, AbstractC25370d.f99432a);
                } else {
                    c28655q2.m87150e0(1205501303);
                }
                c28655q2.m87173q(false);
                m70319K(null, strM70104a, ((Resources) c28655q2.m87161k(AndroidCompositionLocals_androidKt.f4977c)).getQuantityString(AbstractC25369c.f99431a, size8, Arrays.copyOf(new Object[]{Integer.valueOf(size8)}, 1)), c28655q2, 0, 1);
                i29 = 0;
                while (r15.hasNext()) {
                    i34 = i29 + 1;
                    if (i29 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    i35 = i29;
                    Function1 function18 = function5;
                    AbstractC0087g.m220g(null, (C0088h) obj12, function18, c28655q2, (C0088h.f270q << 3) | i17, 1);
                    if (i35 < AbstractC37056f.m118951C(listM74152u1)) {
                        c28655q2.m87150e0(1201665868);
                        f16 = f13;
                        c2314t5 = c2314t2;
                        z18 = false;
                        AbstractC25012a.m73388u((float) 1.5d, f16, c2314t5, c28655q2, false);
                    } else {
                        f16 = f13;
                        c2314t5 = c2314t2;
                        z18 = false;
                        c28655q2.m87150e0(1201759085);
                        c28655q2.m87173q(false);
                    }
                    function5 = function18;
                    f13 = f16;
                    c2314t2 = c2314t5;
                    z15 = z18;
                    i29 = i34;
                }
                z16 = z15;
                c28655q2.m87173q(z16);
                modifier5 = modifier4;
                obj7 = obj6;
                interfaceC28601c10 = interfaceC28601c9;
                c28655q4 = c28655q2;
            }
            c28655q4.m87173q(true);
            if (m70312D(interfaceC28601c10)) {
                c28655q4.m87150e0(-2033941146);
                c23848gM70106c2 = viewState.getBottomSheet();
                if (c23848gM70106c2 == null) {
                    c28655q4.m87150e0(1372333915);
                    c28655q4.m87173q(z16);
                    c28655q6 = c28655q4;
                } else {
                    c28655q4.m87150e0(1372333916);
                    Set<EnumC0093m> setM70341u4 = m70341u(interfaceC28601c4);
                    EnumC23849h enumC23849hM70317I4 = m70317I(interfaceC28601c7);
                    objM87133R10 = c28655q4.m87133R();
                    if (objM87133R10 == obj7) {
                        objM87133R10 = new C21937b(17, interfaceC28601c10);
                        c28655q4.m87172p0(objM87133R10);
                    }
                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R10;
                    zM87153g6 = c28655q4.m87153g(interfaceC28601c4);
                    objM87133R11 = c28655q4.m87133R();
                    if (zM87153g6) {
                        objM87133R11 = new C21927e(8, interfaceC28601c4);
                        c28655q4.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C21927e(8, interfaceC28601c4);
                        c28655q4.m87172p0(objM87133R11);
                    }
                    Function1 function19 = (Function1) objM87133R11;
                    objM87133R12 = c28655q4.m87133R();
                    if (objM87133R12 == obj7) {
                        objM87133R12 = new C21927e(9, interfaceC28601c7);
                        c28655q4.m87172p0(objM87133R12);
                    }
                    C28655q c28655q18 = c28655q4;
                    AbstractC23901b2.m70250i(c23848gM70106c2, setM70341u4, enumC23849hM70317I4, null, interfaceC4339a5, function19, (Function1) objM87133R12, c28655q18, 1597440, 8);
                    C28655q c28655q19 = c28655q18;
                    z16 = false;
                    c28655q19.m87173q(false);
                    c28655q6 = c28655q19;
                }
                c28655q6.m87173q(z16);
                c28655q5 = c28655q6;
            } else {
                c28655q4.m87150e0(1373114434);
                c28655q4.m87173q(z16);
                c28655q5 = c28655q4;
            }
            modifier3 = modifier5;
            function3 = function5;
            c28655q = c28655q5;
        } else {
            c28655q7.m87138X();
            modifier3 = modifier2;
            function3 = function2;
            c28655q = c28655q7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 19, (Object) viewState, (Object) modifier3, function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m70338r(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final Set m70339s(C23859r c23859r) {
        C23853l c23853lM70076c;
        C23848g c23848gM70106c = c23859r.getBottomSheet();
        List<C23852k> listM70084a = (c23848gM70106c == null || (c23853lM70076c = c23848gM70106c.getStatusFilters()) == null) ? null : c23853lM70076c.m70084a();
        if (listM70084a == null) {
            return C25235a0.f99113w;
        }
        List<C23852k> list = listM70084a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C23852k) it.next()).getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String());
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    /* JADX INFO: renamed from: t */
    private static final Set<EnumC0093m> m70340t(InterfaceC28670t2 interfaceC28670t2) {
        return (Set) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: u */
    private static final Set<EnumC0093m> m70341u(InterfaceC28601c1 interfaceC28601c1) {
        return (Set) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final void m70342v(InterfaceC28601c1 interfaceC28601c1, Set<? extends EnumC0093m> set) {
        interfaceC28601c1.setValue(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m70343w(Function1 function1, boolean z4) {
        if (z4) {
            function1.invoke(C23909d2.f94542a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m70344x(InterfaceC28601c1 interfaceC28601c1, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17801x0.a) {
            m70316H(interfaceC28601c1, "");
        } else if (event instanceof AbstractC17801x0.c) {
            m70316H(interfaceC28601c1, ((AbstractC17801x0.c) event).getNewText());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m70345y(InterfaceC28601c1 interfaceC28601c1) {
        m70314F(interfaceC28601c1, true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m70346z(Function1 function1, C23846e c23846e, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new C23905c2(c23846e.getType(), (int) Float.intBitsToFloat((int) (it.mo3523Z(0L) & 4294967295L))));
        return C23454a0.f92919a;
    }
}
