package nv1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k71.C22252i;
import l72.C23407n;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: nv1.g */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "stateModel", "", "submissionSuccessTextDisplay", "Lkotlin/Function1;", "Lnv1/h;", "Ll83/a0;", "dismissSuccessPageHandler", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;", "submittingMemberDataExportModel", "j", "(Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;", "unavailableMemberDataExportModel", "e", "(Ljava/lang/String;Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "member-data-export_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27173g {
    /* JADX INFO: renamed from: e */
    public static final void m81728e(String submissionSuccessTextDisplay, MemberDataExportModel.UnavailableMemberDataExportModel unavailableMemberDataExportModel, Function1 dismissSuccessPageHandler, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
        AbstractC22676k.m65750j(unavailableMemberDataExportModel, "unavailableMemberDataExportModel");
        AbstractC22676k.m65750j(dismissSuccessPageHandler, "dismissSuccessPageHandler");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(235539481);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(submissionSuccessTextDisplay) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(unavailableMemberDataExportModel) : c28655q2.m87157i(unavailableMemberDataExportModel) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(dismissSuccessPageHandler) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            TextResource screenTitleDisplay = unavailableMemberDataExportModel.getScreenTitleDisplay();
            int i15 = TextResource.$stable;
            C27174h c27174h = new C27174h(AbstractC8693b.m21274h(screenTitleDisplay, c28655q2, i15), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getHeadlineDisplay(), c28655q2, i15), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getBodyDisplay(), c28655q2, i15), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getHelpLinkTextDisplay(), c28655q2, i15), AbstractC8693b.m21275i(unavailableMemberDataExportModel.getHelpLink(), c28655q2, 0));
            TextResource textResourceM21278l = AbstractC8693b.m21278l(submissionSuccessTextDisplay);
            boolean zM87153g = c28655q2.m87153g(c27174h) | ((i14 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C27167a(dismissSuccessPageHandler, c27174h, 2);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC33199m0.m105214F(new AbstractC33208p0.h(textResourceM21278l, 0L, (InterfaceC4339a) objM87133R, 2, null), AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.h.f138482h | (i15 << 3), 0, 4092);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(submissionSuccessTextDisplay, unavailableMemberDataExportModel, dismissSuccessPageHandler, i13, 26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m81729f(Function1 function1, C27174h c27174h) {
        function1.invoke(c27174h);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m81730g(String str, MemberDataExportModel.UnavailableMemberDataExportModel unavailableMemberDataExportModel, Function1 function1, int i13, Composer composer, int i14) {
        m81728e(str, unavailableMemberDataExportModel, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    public static final void m81731h(MemberDataExportModel stateModel, String submissionSuccessTextDisplay, Function1 dismissSuccessPageHandler, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(stateModel, "stateModel");
        AbstractC22676k.m65750j(submissionSuccessTextDisplay, "submissionSuccessTextDisplay");
        AbstractC22676k.m65750j(dismissSuccessPageHandler, "dismissSuccessPageHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-612841659);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(stateModel) : c28655q.m87157i(stateModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(submissionSuccessTextDisplay) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(dismissSuccessPageHandler) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            Modifier modifierM3428y = AbstractC1102d.m3428y(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), C2299e.f9102E, false, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3428y);
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
            if (stateModel instanceof MemberDataExportModel.SubmittingMemberDataExportModel) {
                c28655q.m87150e0(-1160442546);
                m81733j((MemberDataExportModel.SubmittingMemberDataExportModel) stateModel, c28655q, (i14 & 14) | TextResource.$stable);
                c28655q.m87173q(false);
            } else if (stateModel instanceof MemberDataExportModel.UnavailableMemberDataExportModel) {
                c28655q.m87150e0(-1160273968);
                m81728e(submissionSuccessTextDisplay, (MemberDataExportModel.UnavailableMemberDataExportModel) stateModel, dismissSuccessPageHandler, c28655q, (i14 & 896) | ((i14 >> 3) & 14) | (TextResource.$stable << 3) | ((i14 << 3) & 112));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1160159609);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23407n(stateModel, submissionSuccessTextDisplay, dismissSuccessPageHandler, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m81732i(MemberDataExportModel memberDataExportModel, String str, Function1 function1, int i13, Composer composer, int i14) {
        m81731h(memberDataExportModel, str, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j */
    public static final void m81733j(MemberDataExportModel.SubmittingMemberDataExportModel submittingMemberDataExportModel, Composer composer, int i13) {
        AbstractC22676k.m65750j(submittingMemberDataExportModel, "submittingMemberDataExportModel");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-128644208);
        int i14 = i13 & 1;
        if (c28655q.m87135U(i14, i14 != 0)) {
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C22252i(submittingMemberDataExportModel, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m81734k(MemberDataExportModel.SubmittingMemberDataExportModel submittingMemberDataExportModel, int i13, Composer composer, int i14) {
        m81733j(submittingMemberDataExportModel, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
