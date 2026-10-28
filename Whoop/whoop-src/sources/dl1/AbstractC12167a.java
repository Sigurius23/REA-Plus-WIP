package dl1;

import al1.AbstractC0983d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b30.C2633u2;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import tk1.AbstractC33882a;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: dl1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u008b\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lal1/d;", "viewState", "Lkotlin/Function2;", "Lxk1/c;", "", "Ll83/a0;", "onClickCommonQuestionCard", "Lkotlin/Function0;", "onClickBackButton", "Lkotlin/Function1;", "Lcom/whoop/navigation/AiAction;", "onClickOpenInAppSupport", "", "onClickBrowseAll", "onTryAgainClicked", "", "onCallTileClicked", "b", "(Lal1/d;Lc93/m;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "help-center_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12167a {
    /* JADX INFO: renamed from: b */
    public static final void m33649b(AbstractC0983d viewState, InterfaceC4351m onClickCommonQuestionCard, InterfaceC4339a onClickBackButton, Function1 onClickOpenInAppSupport, Function1 onClickBrowseAll, InterfaceC4339a onTryAgainClicked, Function1 onCallTileClicked, Composer composer, int i13) {
        int i14;
        C2307m c2307m = C2299e.f9114w;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onClickCommonQuestionCard, "onClickCommonQuestionCard");
        AbstractC22676k.m65750j(onClickBackButton, "onClickBackButton");
        AbstractC22676k.m65750j(onClickOpenInAppSupport, "onClickOpenInAppSupport");
        AbstractC22676k.m65750j(onClickBrowseAll, "onClickBrowseAll");
        AbstractC22676k.m65750j(onTryAgainClicked, "onTryAgainClicked");
        AbstractC22676k.m65750j(onCallTileClicked, "onCallTileClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-94224126);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onClickCommonQuestionCard) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onClickBackButton) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onClickOpenInAppSupport) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87157i(onClickBrowseAll) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87157i(onTryAgainClicked) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87157i(onCallTileClicked) ? 1048576 : 524288;
        }
        if (!c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            c28655q.m87138X();
        } else if (viewState instanceof AbstractC0983d.c) {
            c28655q.m87150e0(1878080392);
            AbstractC12170d.m33673w(((AbstractC0983d.c) viewState).getData(), onClickCommonQuestionCard, onClickBackButton, onClickOpenInAppSupport, onClickBrowseAll, onCallTileClicked, c28655q, ((i14 >> 3) & 458752) | (65520 & i14));
            c28655q.m87173q(false);
        } else {
            boolean z4 = viewState instanceof AbstractC0983d.b;
            C2314t c2314t = C2314t.f9131w;
            if (z4) {
                c28655q.m87150e0(1878519538);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                if (!(viewState instanceof AbstractC0983d.a)) {
                    throw AbstractC11895b.m32003v(-355059957, c28655q, false);
                }
                c28655q.m87150e0(1878710932);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                C0209i c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i2);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                AbstractC33199m0.m105214F(new AbstractC33208p0.b(new TextResource.C8688b(AbstractC33882a.f141956b, null, 2, null), false, null, 6, null), AbstractC8693b.m21267a(), onTryAgainClicked, new TextResource.C8688b(AbstractC33882a.f141955a, null, 2, null), onTryAgainClicked, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.b.f138467h | (TextResource.$stable << 3) | ((i14 >> 9) & 896) | (TextResource.C8688b.f25889c << 9) | (57344 & (i14 >> 3)), 0, 4064);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2633u2(viewState, onClickCommonQuestionCard, onClickBackButton, onClickOpenInAppSupport, onClickBrowseAll, onTryAgainClicked, onCallTileClicked, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m33650c(AbstractC0983d abstractC0983d, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a2, Function1 function3, int i13, Composer composer, int i14) {
        m33649b(abstractC0983d, interfaceC4351m, interfaceC4339a, function1, function2, interfaceC4339a2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
