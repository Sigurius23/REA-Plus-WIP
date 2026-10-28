package dl1;

import a41.C0372h;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2665z;
import b91.C2886a;
import be1.C3172f;
import c41.C4048j0;
import c41.C4092p2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import d30.C11546l;
import d62.C11736b;
import gb1.AbstractC15673b0;
import gy0.AbstractC16277f;
import gz0.AbstractC16319p0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import or2.AbstractC28188o1;
import org.xmlpull.v1.XmlPullParserException;
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
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;
import xk1.C38428b;
import xk1.C38429c;
import xk1.C38431e;

/* JADX INFO: renamed from: dl1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u001a}\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a+\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\tH\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lxk1/e;", "data", "Lkotlin/Function2;", "Lxk1/c;", "", "Ll83/a0;", "onClickCommonQuestionCard", "Lkotlin/Function0;", "onClickBackButton", "Lkotlin/Function1;", "Lcom/whoop/navigation/AiAction;", "onClickOpenInAppSupport", "", "onClickBrowseAll", "", "onCallTileClicked", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lxk1/e;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lxk1/b;", "callSection", "p", "(Lxk1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "card", "index", "s", "(Lxk1/c;ILc93/m;Landroidx/compose/runtime/Composer;I)V", "title", "articleUrl", "l", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12170d {
    /* JADX INFO: renamed from: l */
    public static final void m33662l(String title, String articleUrl, Function1 onClickBrowseAll, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(articleUrl, "articleUrl");
        AbstractC22676k.m65750j(onClickBrowseAll, "onClickBrowseAll");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1692080571);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(title) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(articleUrl) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onClickBrowseAll) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C4048j0(onClickBrowseAll, articleUrl, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, AbstractC33253j.m105489e(1 * 4), null, null, 0.0f, AbstractC37817c.m121344e(-977399765, c28655q, new C2665z(title, 3, (byte) 0)), c28655q, 12582912, 118);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12169c(onClickBrowseAll, i13, 0, title, articleUrl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m33663m(Function1 function1, String str) {
        function1.invoke(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m33664n(String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), 0.0f, f13, 1);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f13, 0.0f, 0.0f, 0.0f, 14);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC30795n.m94707h(str, modifierM3398t, c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getB1(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC11895b.m32006y(1.0f, true, c28655q);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getForwardArrow(), c28655q, 6), null, AbstractC1099a.m3396r(c2314t, f13, 0.0f, 2), c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m33665o(String str, String str2, Function1 function1, int i13, Composer composer, int i14) {
        m33662l(str, str2, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: p */
    private static final void m33666p(C38428b c38428b, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1551010711);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c38428b) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
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
            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "HelpCenterCallSectionButton");
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            String strM123109b = c38428b.getButtonTitle();
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(c38428b);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C11546l(8, function1, c38428b);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3599a, enumC27284v, strM123109b, false, 0L, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 120);
            String strM123110c = c38428b.getCaption();
            if (strM123110c == null) {
                c28655q.m87150e0(1542381271);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1542381272);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3409f(1.0f, c2314t), "HelpCenterCallSectionCaption");
                C38072d c38072d = C38072d.f163053a;
                int i15 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM123110c, modifierM3599a2, AbstractC13673n.m38559f(c38072d, c28655q, i15, 0.7f), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB3(), null, c28655q, 48, C2886a.f11498d << 18, 196088);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(c38428b, function1, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m33667q(Function1 function1, C38428b c38428b) {
        function1.invoke(c38428b.getAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m33668r(C38428b c38428b, Function1 function1, int i13, Composer composer, int i14) {
        m33666p(c38428b, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m33669s(C38429c card, int i13, InterfaceC4351m onClickCommonQuestionCard, Composer composer, int i14) {
        int i15;
        AbstractC22676k.m65750j(card, "card");
        AbstractC22676k.m65750j(onClickCommonQuestionCard, "onClickCommonQuestionCard");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1286578794);
        if ((i14 & 6) == 0) {
            i15 = (c28655q.m87153g(card) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q.m87149e(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q.m87157i(onClickCommonQuestionCard) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            boolean z4 = ((i15 & 896) == 256) | ((i15 & 14) == 4) | ((i15 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C0372h(onClickCommonQuestionCard, card, i13, 2);
                c28655q.m87172p0(objM87133R);
            }
            C2314t c2314t = C2314t.f9131w;
            float f13 = 4;
            AbstractC31926e.m99375j(AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15), null, 0L, AbstractC33253j.m105489e(1 * f13), null, null, 0.0f, AbstractC37817c.m121344e(147542022, c28655q, new C4726a(card, 23)), c28655q, 12582912, 118);
            AbstractC11266d.m30469w(f13, f13, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(card, i13, onClickCommonQuestionCard, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m33670t(InterfaceC4351m interfaceC4351m, C38429c c38429c, int i13) {
        interfaceC4351m.invoke(c38429c, Integer.valueOf(i13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m33671u(C38429c c38429c, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3407d);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3419p = AbstractC1102d.m3419p(6 * 4, AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14));
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c38429c.getLeftIcon(), c28655q, 6);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3419p, c38072d.m121949b(c28655q, i14).getBrandWhite(), c28655q, 432, 0);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, 1 * f13, 1);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM31988g);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, 0.0f, 14);
            float f15 = f14;
            String strM123115e = c38429c.getTitle();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i14).getB1();
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM123115e, modifierM3398t, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i15, 196600);
            C28655q c28655q2 = c28655q;
            if (AbstractC28188o1.m85314d(c38429c.getSubTitle())) {
                c28655q2.m87150e0(-783611052);
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, f15, 0.0f, 0.0f, 0.0f, 14);
                f15 = f15;
                AbstractC30795n.m94707h(c38429c.getSubTitle(), modifierM3398t2, AbstractC13673n.m38559f(c38072d, c28655q2, i14, 0.7f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i14).getB3(), null, c28655q2, 48, i15, 196600);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-783314506);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38429c.getRightIcon(), c28655q2, 6), null, AbstractC1099a.m3395q(c2314t, f15, 3 * f13), c38072d.m121949b(c28655q2, i14).getBrandWhite(), c28655q2, 432, 0);
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m33672v(C38429c c38429c, int i13, InterfaceC4351m interfaceC4351m, int i14, Composer composer, int i15) {
        m33669s(c38429c, i13, interfaceC4351m, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x0316  */
    /* JADX WARN: Code duplicated, block: B:107:0x032f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0337  */
    /* JADX WARN: Code duplicated, block: B:110:0x0359  */
    /* JADX WARN: Code duplicated, block: B:114:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x03dd A[LOOP:0: B:112:0x03cf->B:116:0x03dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:126:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0176  */
    /* JADX WARN: Code duplicated, block: B:71:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0222  */
    /* JADX WARN: Code duplicated, block: B:85:0x0255  */
    /* JADX WARN: Code duplicated, block: B:86:0x0259  */
    /* JADX WARN: Code duplicated, block: B:91:0x0274  */
    /* JADX WARN: Code duplicated, block: B:94:0x02da  */
    /* JADX WARN: Code duplicated, block: B:95:0x02dc  */
    /* JADX INFO: renamed from: w */
    public static final void m33673w(final C38431e data, InterfaceC4351m onClickCommonQuestionCard, InterfaceC4339a onClickBackButton, final Function1 onClickOpenInAppSupport, Function1 onClickBrowseAll, Function1 onCallTileClicked, Composer composer, int i13) {
        InterfaceC4351m interfaceC4351m;
        Function1 function1;
        final Function1 function2;
        C0209i c0209i;
        int i14;
        boolean z4;
        boolean zM87157i;
        Object objM87133R;
        int i15;
        int i16;
        int iHashCode;
        C0213j c0213j;
        int iHashCode2;
        boolean z13;
        boolean zM87157i2;
        Object objM87133R2;
        int i17;
        int i18;
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(onClickCommonQuestionCard, "onClickCommonQuestionCard");
        AbstractC22676k.m65750j(onClickBackButton, "onClickBackButton");
        AbstractC22676k.m65750j(onClickOpenInAppSupport, "onClickOpenInAppSupport");
        AbstractC22676k.m65750j(onClickBrowseAll, "onClickBrowseAll");
        AbstractC22676k.m65750j(onCallTileClicked, "onCallTileClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1764324745);
        int i19 = (i13 & 6) == 0 ? (c28655q.m87157i(data) ? 4 : 2) | i13 : i13;
        if ((i13 & 48) == 0) {
            i19 |= c28655q.m87157i(onClickCommonQuestionCard) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i19 |= c28655q.m87157i(onClickBackButton) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i19 |= c28655q.m87157i(onClickOpenInAppSupport) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i19 |= c28655q.m87157i(onClickBrowseAll) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i19 |= c28655q.m87157i(onCallTileClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q.m87135U(i19 & 1, (74899 & i19) != 74898)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t)), AbstractC30060g.m92099U(0, c28655q, 1), 14));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i = c0209i3;
            } else {
                c0209i = c0209i3;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "HelpCenterToolbar");
                AbstractC6721d.a aVar = new AbstractC6721d.a(AbstractC8693b.m21278l(data.getHeader()), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, "", null, null, true, null, null, null, null, null, null, null, 65218, null);
                i14 = i19 & 7168;
                if (i14 == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87157i = z4 | c28655q.m87157i(data);
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v0 = C28635l.f115821a;
                if (zM87157i || objM87133R == c28676v0) {
                    final int i24 = 0;
                    objM87133R = new InterfaceC4339a() { // from class: dl1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return AbstractC12170d.m33674x(onClickOpenInAppSupport, data);
                                default:
                                    return AbstractC12170d.m33675y(onClickOpenInAppSupport, data);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R);
                }
                i15 = i19 << 3;
                i16 = i19;
                C0209i c0209i6 = c0209i;
                AbstractC6719b.m20143d(modifierM3599a, aVar, null, onClickBackButton, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | (i15 & 7168), 36);
                float f13 = 2 * 8;
                Modifier modifierM3394p = AbstractC1099a.m3394p(f13, c2314t);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3394p);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j = c0213j2;
                    c28655q.m87163l(c0213j);
                } else {
                    c0213j = c0213j2;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                float f14 = 4;
                float f15 = f14 * f14;
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a3);
                AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(c2314t, "HelpCenterPageTitle");
                String strM123124g = data.getPageTitle();
                C38072d c38072d = C38072d.f163053a;
                int i25 = C38072d.f163054b;
                C2886a c2886aM8416N = c38072d.m121952e(c28655q, i25).getT1();
                long jM125430y = c38072d.m121949b(c28655q, i25).getBrandWhite();
                int i26 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM123124g, modifierM3599a2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 48, i26, 196600);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM123126b = data.getNeedMoreHelpSection().getMessageUsButtonTitle();
                if (i14 == 2048) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i2 = z13 | c28655q.m87157i(data);
                objM87133R2 = c28655q.m87133R();
                if (!zM87157i2 || objM87133R2 == c28676v0) {
                    final int i27 = 1;
                    function2 = onClickOpenInAppSupport;
                    objM87133R2 = new InterfaceC4339a() { // from class: dl1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    return AbstractC12170d.m33674x(function2, data);
                                default:
                                    return AbstractC12170d.m33675y(function2, data);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = onClickOpenInAppSupport;
                }
                AbstractC27282u.m82292h(modifierM3407d, enumC27284v, strM123126b, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
                if (data.getCallSection() != null) {
                    c28655q.m87150e0(-1456367784);
                    m33666p(data.getCallSection(), onCallTileClicked, c28655q, (i16 >> 12) & 112);
                    c28655q.m87173q(false);
                } else if (data.getCallTile() != null) {
                    c28655q.m87150e0(-1456361248);
                    AbstractC25303l.m74291r(data.getCallTile(), null, null, onCallTileClicked, c28655q, C4092p2.f16593v | ((i16 >> 6) & 7168), 6);
                    c28655q = c28655q;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2097589161);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                AbstractC11266d.m30469w((float) 7.5d, f14, c2314t, c28655q);
                AbstractC30795n.m94707h(data.getCommonQuestionsSection().getCommonQuestionsTitle(), AbstractC1136a.m3599a(c2314t, "HelpCenterCommonQuestionsTitle"), AbstractC13673n.m38559f(c38072d, c28655q, i25, 0.5f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getSh4(), null, c28655q, 48, i26, 196600);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 4.5d) * f14, c2314t));
                c28655q.m87150e0(-1470029228);
                i17 = 0;
                for (Object obj : data.getCommonQuestionsSection().m123116a()) {
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    m33669s((C38429c) obj, i17, onClickCommonQuestionCard, c28655q, i15 & 896);
                    i17 = i18;
                }
                interfaceC4351m = onClickCommonQuestionCard;
                c28655q.m87173q(false);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f14, c2314t));
                String strM123106b = data.getBrowseAllSection().getSectionTitle();
                C38072d c38072d2 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                AbstractC30795n.m94707h(strM123106b, null, c38072d2.m121949b(c28655q, i28).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i28).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f15, c2314t));
                function1 = onClickBrowseAll;
                m33662l(data.getBrowseAllSection().getTitle(), data.getBrowseAllSection().getArticleUrl(), function1, c28655q, (i16 >> 6) & 896);
                AbstractC25012a.m73388u(11, f14, c2314t, c28655q, true);
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3407d(1.0f, c2314t), "HelpCenterToolbar");
            AbstractC6721d.a aVar2 = new AbstractC6721d.a(AbstractC8693b.m21278l(data.getHeader()), null, Integer.valueOf(AbstractC16319p0.m46430a().getAction().getCross()), AbstractC30060g.m92103Y(c28655q, AbstractC16277f.f62253K), null, "", null, null, true, null, null, null, null, null, null, null, 65218, null);
            i14 = i19 & 7168;
            if (i14 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87157i = z4 | c28655q.m87157i(data);
            objM87133R = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i) {
                final int i29 = 0;
                objM87133R = new InterfaceC4339a() { // from class: dl1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i29) {
                            case 0:
                                return AbstractC12170d.m33674x(onClickOpenInAppSupport, data);
                            default:
                                return AbstractC12170d.m33675y(onClickOpenInAppSupport, data);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            } else {
                final int i210 = 0;
                objM87133R = new InterfaceC4339a() { // from class: dl1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i210) {
                            case 0:
                                return AbstractC12170d.m33674x(onClickOpenInAppSupport, data);
                            default:
                                return AbstractC12170d.m33675y(onClickOpenInAppSupport, data);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R);
            }
            i15 = i19 << 3;
            i16 = i19;
            C0209i c0209i8 = c0209i;
            AbstractC6719b.m20143d(modifierM3599a3, aVar2, null, onClickBackButton, (InterfaceC4339a) objM87133R, null, c28655q, (AbstractC6721d.a.f25641r << 3) | 6 | (i15 & 7168), 36);
            float f16 = 2 * 8;
            Modifier modifierM3394p2 = AbstractC1099a.m3394p(f16, c2314t);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3394p2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            float f17 = 4;
            float f18 = f17 * f17;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f16), c2305k, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            Modifier modifierM3599a4 = AbstractC1136a.m3599a(c2314t, "HelpCenterPageTitle");
            String strM123124g2 = data.getPageTitle();
            C38072d c38072d3 = C38072d.f163053a;
            int i211 = C38072d.f163054b;
            C2886a c2886aM8416N2 = c38072d3.m121952e(c28655q, i211).getT1();
            long jM125430y2 = c38072d3.m121949b(c28655q, i211).getBrandWhite();
            int i212 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM123124g2, modifierM3599a4, jM125430y2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N2, null, c28655q, 48, i212, 196600);
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t);
            EnumC27284v enumC27284v2 = EnumC27284v.TextLarge;
            String strM123126b2 = data.getNeedMoreHelpSection().getMessageUsButtonTitle();
            if (i14 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i2 = z13 | c28655q.m87157i(data);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                final int i213 = 1;
                function2 = onClickOpenInAppSupport;
                objM87133R2 = new InterfaceC4339a() { // from class: dl1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                return AbstractC12170d.m33674x(function2, data);
                            default:
                                return AbstractC12170d.m33675y(function2, data);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i214 = 1;
                function2 = onClickOpenInAppSupport;
                objM87133R2 = new InterfaceC4339a() { // from class: dl1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i214) {
                            case 0:
                                return AbstractC12170d.m33674x(function2, data);
                            default:
                                return AbstractC12170d.m33675y(function2, data);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC27282u.m82292h(modifierM3407d2, enumC27284v2, strM123126b2, false, 0L, null, false, (InterfaceC4339a) objM87133R2, c28655q, 54, 120);
            if (data.getCallSection() != null) {
                c28655q.m87150e0(-1456367784);
                m33666p(data.getCallSection(), onCallTileClicked, c28655q, (i16 >> 12) & 112);
                c28655q.m87173q(false);
            } else if (data.getCallTile() != null) {
                c28655q.m87150e0(-1456361248);
                AbstractC25303l.m74291r(data.getCallTile(), null, null, onCallTileClicked, c28655q, C4092p2.f16593v | ((i16 >> 6) & 7168), 6);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2097589161);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            AbstractC11266d.m30469w((float) 7.5d, f17, c2314t, c28655q);
            AbstractC30795n.m94707h(data.getCommonQuestionsSection().getCommonQuestionsTitle(), AbstractC1136a.m3599a(c2314t, "HelpCenterCommonQuestionsTitle"), AbstractC13673n.m38559f(c38072d3, c28655q, i211, 0.5f), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d3.m121952e(c28655q, i211).getSh4(), null, c28655q, 48, i212, 196600);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(((float) 4.5d) * f17, c2314t));
            c28655q.m87150e0(-1470029228);
            i17 = 0;
            while (r2.hasNext()) {
                i18 = i17 + 1;
                if (i17 >= 0) {
                    AbstractC37056f.m118977d0();
                    throw null;
                }
                m33669s((C38429c) obj, i17, onClickCommonQuestionCard, c28655q, i15 & 896);
                i17 = i18;
            }
            interfaceC4351m = onClickCommonQuestionCard;
            c28655q.m87173q(false);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(3 * f17, c2314t));
            String strM123106b2 = data.getBrowseAllSection().getSectionTitle();
            C38072d c38072d4 = C38072d.f163053a;
            int i215 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM123106b2, null, c38072d4.m121949b(c28655q, i215).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d4.m121952e(c28655q, i215).getB1(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f18, c2314t));
            function1 = onClickBrowseAll;
            m33662l(data.getBrowseAllSection().getTitle(), data.getBrowseAllSection().getArticleUrl(), function1, c28655q, (i16 >> 6) & 896);
            AbstractC25012a.m73388u(11, f17, c2314t, c28655q, true);
            c28655q.m87173q(true);
        } else {
            interfaceC4351m = onClickCommonQuestionCard;
            function1 = onClickBrowseAll;
            function2 = onClickOpenInAppSupport;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3172f((Object) data, (Object) interfaceC4351m, (Object) onClickBackButton, (Object) function2, (Object) function1, (Object) onCallTileClicked, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m33674x(Function1 function1, C38431e c38431e) {
        function1.invoke(c38431e.getNeedMoreHelpSection().getAiAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m33675y(Function1 function1, C38431e c38431e) {
        function1.invoke(c38431e.getNeedMoreHelpSection().getAiAction());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m33676z(C38431e c38431e, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function1 function3, int i13, Composer composer, int i14) {
        m33673w(c38431e, interfaceC4351m, interfaceC4339a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
