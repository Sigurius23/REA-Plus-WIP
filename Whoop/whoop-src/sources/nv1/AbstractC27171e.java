package nv1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import gb1.AbstractC15673b0;
import l72.C23407n;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: nv1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a9\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "stateModel", "Lkotlin/Function0;", "Ll83/a0;", "onToolbarLeftClick", "Lkotlin/Function1;", "", "webLinkClickHandler", "b", "(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "member-data-export_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27171e {
    /* JADX INFO: renamed from: b */
    public static final void m81719b(MemberDataExportModel stateModel, InterfaceC4339a onToolbarLeftClick, Function1 webLinkClickHandler, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(stateModel, "stateModel");
        AbstractC22676k.m65750j(onToolbarLeftClick, "onToolbarLeftClick");
        AbstractC22676k.m65750j(webLinkClickHandler, "webLinkClickHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2078434086);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(stateModel) : c28655q.m87157i(stateModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onToolbarLeftClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(webLinkClickHandler) ? 256 : 128;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM44008S = AbstractC15673b0.m44008S(c2314t);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44008S);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1102d.m3407d(1.0f, c2314t), c2307m, false, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3428y);
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
            if (stateModel instanceof MemberDataExportModel.SubmissionComplete) {
                c28655q.m87150e0(1681612428);
                MemberDataExportModel.SubmissionComplete submissionComplete = (MemberDataExportModel.SubmissionComplete) stateModel;
                AbstractC6719b.m20143d(null, new AbstractC6721d.a(submissionComplete.getScreenTitleDisplay(), null, AbstractC13673n.m38561h(C38072d.f163053a), "LeftBackNavIcon", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, onToolbarLeftClick, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
                TextResource screenTitleDisplay = submissionComplete.getScreenTitleDisplay();
                int i16 = TextResource.$stable;
                AbstractC27169c.m81708u(new C27174h(AbstractC8693b.m21274h(screenTitleDisplay, c28655q, i16), AbstractC8693b.m21274h(submissionComplete.getHeadlineDisplay(), c28655q, i16), AbstractC8693b.m21274h(submissionComplete.getBodyDisplay(), c28655q, i16), AbstractC8693b.m21274h(submissionComplete.getHelpLinkTextDisplay(), c28655q, i16), AbstractC8693b.m21275i(submissionComplete.getHelpLink(), c28655q, 0)), webLinkClickHandler, c28655q, (i15 >> 3) & 112);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1682619556);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(stateModel, onToolbarLeftClick, webLinkClickHandler, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m81720c(MemberDataExportModel memberDataExportModel, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, Composer composer, int i14) {
        m81719b(memberDataExportModel, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
