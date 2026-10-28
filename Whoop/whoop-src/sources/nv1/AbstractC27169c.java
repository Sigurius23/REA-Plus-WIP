package nv1;

import am2.C1012d;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aq1.C1909c;
import b91.AbstractC2890e;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.memberdataexport.models.MemberDataExportModel;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import jp1.C21859k;
import l83.C23454a0;
import l83.C23465k;
import mx1.C26003i;
import no.nordicsemi.android.dfu.DfuBaseService;
import no0.C26960m0;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.AbstractC27282u;
import ny0.C27270o;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import v63.AbstractC35745c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: nv1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001am\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a_\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\r2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a+\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/memberdataexport/models/MemberDataExportModel;", "stateModel", "Lkotlin/Function0;", "Ll83/a0;", "backPressHandler", "Lkotlin/Function1;", "", "webLinkClickHandler", "deepLinkClickHandler", "Lkotlin/Function3;", "submitButtonClickHandler", "s", "(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;", "l", "(Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lnv1/h;", "unavailableBodyArgs", "u", "(Lnv1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "member-data-export_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27169c {
    /* JADX WARN: Code duplicated, block: B:105:0x047e  */
    /* JADX WARN: Code duplicated, block: B:108:0x050d  */
    /* JADX WARN: Code duplicated, block: B:109:0x050f  */
    /* JADX WARN: Code duplicated, block: B:113:0x051d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0542  */
    /* JADX WARN: Code duplicated, block: B:117:0x0544  */
    /* JADX WARN: Code duplicated, block: B:119:0x0547  */
    /* JADX WARN: Code duplicated, block: B:122:0x0585  */
    /* JADX WARN: Code duplicated, block: B:123:0x0588  */
    /* JADX WARN: Code duplicated, block: B:129:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0212  */
    /* JADX WARN: Code duplicated, block: B:54:0x0216  */
    /* JADX WARN: Code duplicated, block: B:59:0x0231  */
    /* JADX WARN: Code duplicated, block: B:62:0x023f  */
    /* JADX WARN: Code duplicated, block: B:65:0x024d  */
    /* JADX WARN: Code duplicated, block: B:66:0x024f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0261  */
    /* JADX WARN: Code duplicated, block: B:75:0x0325  */
    /* JADX WARN: Code duplicated, block: B:76:0x0327  */
    /* JADX WARN: Code duplicated, block: B:80:0x0335  */
    /* JADX WARN: Code duplicated, block: B:83:0x0421  */
    /* JADX WARN: Code duplicated, block: B:85:0x0429  */
    /* JADX WARN: Code duplicated, block: B:90:0x0447  */
    /* JADX WARN: Code duplicated, block: B:95:0x045a  */
    /* JADX WARN: Code duplicated, block: B:98:0x046a  */
    /* JADX WARN: Code duplicated, block: B:99:0x046c  */
    /* JADX INFO: renamed from: l */
    public static final void m81699l(final MemberDataExportModel.AvailableMemberDataExportModel stateModel, final Function1 webLinkClickHandler, Function1 function1, Function3 submitButtonClickHandler, Composer composer, int i13) {
        int i14;
        final Function1 function2;
        C0209i c0209i;
        int i15;
        int iHashCode;
        Object objM87133R;
        C28676v0 c28676v0;
        int i16;
        boolean z4;
        boolean zM87157i;
        Object objM87133R2;
        boolean z13;
        boolean zM87157i2;
        Object objM87133R3;
        int iHashCode2;
        Object objM87133R4;
        int i17;
        boolean z14;
        boolean zM87157i3;
        Object objM87133R5;
        final Function1 function3;
        boolean z15;
        boolean zM87157i4;
        Object objM87133R6;
        boolean z16;
        boolean z17;
        boolean zM87157i5;
        Object objM87133R7;
        final Function1 deepLinkClickHandler = function1;
        AbstractC22676k.m65750j(stateModel, "stateModel");
        AbstractC22676k.m65750j(webLinkClickHandler, "webLinkClickHandler");
        AbstractC22676k.m65750j(deepLinkClickHandler, "deepLinkClickHandler");
        AbstractC22676k.m65750j(submitButtonClickHandler, "submitButtonClickHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(115361959);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(stateModel) : c28655q.m87157i(stateModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(webLinkClickHandler) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(deepLinkClickHandler) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(submitButtonClickHandler) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, i18).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i18), 0L, AbstractC35745c.m113246h(14), null, null, 0L, 0, AbstractC35745c.m113246h(18), null, null, 16646141), null, 2, null);
            TextResource submissionLoadingTextDisplay = stateModel.getSubmissionLoadingTextDisplay();
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(submissionLoadingTextDisplay, c28655q, i19);
            String strM21274h2 = AbstractC8693b.m21274h(stateModel.getSubmissionSuccessTextDisplay(), c28655q, i19);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
            float f13 = 8;
            float f14 = 5 * f13;
            float f15 = 6 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(modifierM92116f0, ((float) 2.5d) * f13, 0.0f, 2), 0.0f, f14, 0.0f, f15, 5);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S) {
                c0209i = c0209i2;
            } else {
                c0209i = c0209i2;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
                String strM21274h3 = AbstractC8693b.m21274h(stateModel.getBodyDisplay(), c28655q, i19);
                long jM125382b1 = c38072d.m121949b(c28655q, i18).getWhite50();
                int i24 = C2886a.f11498d;
                int i25 = i24 << 18;
                C0209i c0209i6 = c0209i;
                i15 = i14;
                AbstractC30795n.m94707h(strM21274h3, null, jM125382b1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q, 0, i25, 196602);
                float f16 = 1 * f13;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13);
                C2306l c2306l = C2299e.f9108K;
                C22949e c22949e = AbstractC22977m.f90650a;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                objM87133R = c28655q.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
                i16 = i15 & 112;
                if (i16 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM87157i = c28655q.m87157i(stateModel) | z4;
                objM87133R2 = c28655q.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    final int i26 = 0;
                    objM87133R2 = new InterfaceC4339a() { // from class: nv1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i26) {
                                case 0:
                                    return AbstractC27169c.m81700m(webLinkClickHandler, stateModel);
                                case 1:
                                    return AbstractC27169c.m81701n(webLinkClickHandler, stateModel);
                                case 2:
                                    return AbstractC27169c.m81702o(webLinkClickHandler, stateModel);
                                default:
                                    return AbstractC27169c.m81703p(webLinkClickHandler, stateModel);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R2);
                }
                function2 = webLinkClickHandler;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(stateModel.getLearnMoreTextDisplay(), c28655q, i19), AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getBtS(), null, c28655q, 0, i25, 196600);
                float f17 = 4;
                float f18 = 12 * f17;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f18, c2314t);
                AbstractC27274q.c cVar = AbstractC27274q.c.f109140f;
                C27270o c27270o = new C27270o(cVar, AbstractC18489d0.m53359E(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
                if (i16 == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zM87157i2 = c28655q.m87157i(stateModel) | z13;
                objM87133R3 = c28655q.m87133R();
                if (zM87157i2 || objM87133R3 == c28676v0) {
                    final int i27 = 1;
                    objM87133R3 = new InterfaceC4339a() { // from class: nv1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i27) {
                                case 0:
                                    return AbstractC27169c.m81700m(function2, stateModel);
                                case 1:
                                    return AbstractC27169c.m81701n(function2, stateModel);
                                case 2:
                                    return AbstractC27169c.m81702o(function2, stateModel);
                                default:
                                    return AbstractC27169c.m81703p(function2, stateModel);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R3);
                }
                int i28 = C27270o.f109105k | 432;
                AbstractC27242b1.m82092d(c27270o, "", modifierM3419p, null, (InterfaceC4339a) objM87133R3, c28655q, i28, 8);
                c28655q.m87173q(true);
                AbstractC30795n.m94704e(AbstractC37056f.m118959K(new C23465k(AbstractC8693b.m21274h(stateModel.getConfirmationTextDisplay(), c28655q, i19), AbstractC2890e.m8451f(c2886aM8397c.getStyle(), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 0)), new C23465k(AbstractC11266d.m30461o(" ", AbstractC8693b.m21275i(stateModel.getRecipientEmailDisplay(), c28655q, 0)), AbstractC2890e.m8451f(c2886aM8397c.getStyle(), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0))), AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8397c, c28655q, 48, i24 << 21, 131068);
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, f16, 0.0f, 0.0f, 13);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22949e, c2306l, c28655q, 48);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = AbstractC11266d.m30453g(c28655q);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R4;
                i17 = i15 & 896;
                if (i17 == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zM87157i3 = c28655q.m87157i(stateModel) | z14;
                objM87133R5 = c28655q.m87133R();
                if (!zM87157i3 || objM87133R5 == c28676v0) {
                    final int i29 = 2;
                    function3 = function1;
                    objM87133R5 = new InterfaceC4339a() { // from class: nv1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i29) {
                                case 0:
                                    return AbstractC27169c.m81700m(function3, stateModel);
                                case 1:
                                    return AbstractC27169c.m81701n(function3, stateModel);
                                case 2:
                                    return AbstractC27169c.m81702o(function3, stateModel);
                                default:
                                    return AbstractC27169c.m81703p(function3, stateModel);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R5);
                } else {
                    function3 = function1;
                }
                deepLinkClickHandler = function3;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(stateModel.getUpdateAccountTextDisplay(), c28655q, i19), AbstractC1092a.m3360e(c2314t, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R5, 28), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getBtS(), null, c28655q, 0, i25, 196600);
                Modifier modifierM3419p2 = AbstractC1102d.m3419p(f18, c2314t);
                C27270o c27270o2 = new C27270o(cVar, AbstractC18489d0.m53359E(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
                if (i17 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zM87157i4 = c28655q.m87157i(stateModel) | z15;
                objM87133R6 = c28655q.m87133R();
                if (zM87157i4 || objM87133R6 == c28676v0) {
                    final int i34 = 3;
                    objM87133R6 = new InterfaceC4339a() { // from class: nv1.b
                        @Override // c93.InterfaceC4339a
                        public final Object invoke() {
                            switch (i34) {
                                case 0:
                                    return AbstractC27169c.m81700m(deepLinkClickHandler, stateModel);
                                case 1:
                                    return AbstractC27169c.m81701n(deepLinkClickHandler, stateModel);
                                case 2:
                                    return AbstractC27169c.m81702o(deepLinkClickHandler, stateModel);
                                default:
                                    return AbstractC27169c.m81703p(deepLinkClickHandler, stateModel);
                            }
                        }
                    };
                    c28655q.m87172p0(objM87133R6);
                }
                AbstractC27242b1.m82092d(c27270o2, "", modifierM3419p2, null, (InterfaceC4339a) objM87133R6, c28655q, i28, 8);
                c28655q.m87173q(true);
                if (1.0f > 0.0d) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (!z16) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
                Modifier modifierM3398t4 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, 0.0f, f17 * f13, 5);
                EnumC27284v enumC27284v = EnumC27284v.TextMedium;
                String strM21274h4 = AbstractC8693b.m21274h(stateModel.getSubmitButtonTextDisplay(), c28655q, i19);
                long jM125400j = c38072d.m121949b(c28655q, i18).getAccentPositiveTrend();
                if ((i15 & 7168) == 2048) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87157i5 = z17 | c28655q.m87157i(stateModel) | c28655q.m87153g(strM21274h) | c28655q.m87153g(strM21274h2);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i5 || objM87133R7 == c28676v0) {
                    C1012d c1012d = new C1012d(submitButtonClickHandler, stateModel, strM21274h, strM21274h2, 29);
                    c28655q.m87172p0(c1012d);
                    objM87133R7 = c1012d;
                }
                AbstractC27282u.m82292h(modifierM3398t4, enumC27284v, strM21274h4, true, jM125400j, null, false, (InterfaceC4339a) objM87133R7, c28655q, 3120, 96);
                c28655q = c28655q;
                c28655q.m87173q(true);
            }
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N);
            String strM21274h5 = AbstractC8693b.m21274h(stateModel.getBodyDisplay(), c28655q, i19);
            long jM125382b2 = c38072d.m121949b(c28655q, i18).getWhite50();
            int i210 = C2886a.f11498d;
            int i211 = i210 << 18;
            C0209i c0209i8 = c0209i;
            i15 = i14;
            AbstractC30795n.m94707h(strM21274h5, null, jM125382b2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q, 0, i211, 196602);
            float f19 = 1 * f13;
            Modifier modifierM3398t5 = AbstractC1099a.m3398t(c2314t, 0.0f, f19, 0.0f, 0.0f, 13);
            C2306l c2306l2 = C2299e.f9108K;
            C22949e c22949e2 = AbstractC22977m.f90650a;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t5);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            objM87133R = c28655q.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R;
            i16 = i15 & 112;
            if (i16 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM87157i = c28655q.m87157i(stateModel) | z4;
            objM87133R2 = c28655q.m87133R();
            if (zM87157i) {
                final int i212 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i212) {
                            case 0:
                                return AbstractC27169c.m81700m(webLinkClickHandler, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(webLinkClickHandler, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(webLinkClickHandler, stateModel);
                            default:
                                return AbstractC27169c.m81703p(webLinkClickHandler, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            } else {
                final int i213 = 0;
                objM87133R2 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i213) {
                            case 0:
                                return AbstractC27169c.m81700m(webLinkClickHandler, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(webLinkClickHandler, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(webLinkClickHandler, stateModel);
                            default:
                                return AbstractC27169c.m81703p(webLinkClickHandler, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            function2 = webLinkClickHandler;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(stateModel.getLearnMoreTextDisplay(), c28655q, i19), AbstractC1092a.m3360e(c2314t, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R2, 28), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getBtS(), null, c28655q, 0, i211, 196600);
            float f110 = 4;
            float f111 = 12 * f110;
            Modifier modifierM3419p3 = AbstractC1102d.m3419p(f111, c2314t);
            AbstractC27274q.c cVar2 = AbstractC27274q.c.f109140f;
            C27270o c27270o3 = new C27270o(cVar2, AbstractC18489d0.m53359E(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
            if (i16 == 32) {
                z13 = true;
            } else {
                z13 = false;
            }
            zM87157i2 = c28655q.m87157i(stateModel) | z13;
            objM87133R3 = c28655q.m87133R();
            if (zM87157i2) {
                final int i214 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i214) {
                            case 0:
                                return AbstractC27169c.m81700m(function2, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(function2, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(function2, stateModel);
                            default:
                                return AbstractC27169c.m81703p(function2, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            } else {
                final int i215 = 1;
                objM87133R3 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i215) {
                            case 0:
                                return AbstractC27169c.m81700m(function2, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(function2, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(function2, stateModel);
                            default:
                                return AbstractC27169c.m81703p(function2, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            int i216 = C27270o.f109105k | 432;
            AbstractC27242b1.m82092d(c27270o3, "", modifierM3419p3, null, (InterfaceC4339a) objM87133R3, c28655q, i216, 8);
            c28655q.m87173q(true);
            AbstractC30795n.m94704e(AbstractC37056f.m118959K(new C23465k(AbstractC8693b.m21274h(stateModel.getConfirmationTextDisplay(), c28655q, i19), AbstractC2890e.m8451f(c2886aM8397c.getStyle(), c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 0)), new C23465k(AbstractC11266d.m30461o(" ", AbstractC8693b.m21275i(stateModel.getRecipientEmailDisplay(), c28655q, 0)), AbstractC2890e.m8451f(c2886aM8397c.getStyle(), c38072d.m121949b(c28655q, i18).getBrandWhite(), c28655q, 0))), AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c2886aM8397c, c28655q, 48, i210 << 21, 131068);
            Modifier modifierM3398t6 = AbstractC1099a.m3398t(c2314t, 0.0f, f19, 0.0f, 0.0f, 13);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(c22949e2, c2306l2, c28655q, 48);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i8, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            objM87133R4 = c28655q.m87133R();
            if (objM87133R4 == c28676v0) {
                objM87133R4 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R4;
            i17 = i15 & 896;
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            zM87157i3 = c28655q.m87157i(stateModel) | z14;
            objM87133R5 = c28655q.m87133R();
            if (zM87157i3) {
                final int i217 = 2;
                function3 = function1;
                objM87133R5 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i217) {
                            case 0:
                                return AbstractC27169c.m81700m(function3, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(function3, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(function3, stateModel);
                            default:
                                return AbstractC27169c.m81703p(function3, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            } else {
                final int i218 = 2;
                function3 = function1;
                objM87133R5 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i218) {
                            case 0:
                                return AbstractC27169c.m81700m(function3, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(function3, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(function3, stateModel);
                            default:
                                return AbstractC27169c.m81703p(function3, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            deepLinkClickHandler = function3;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(stateModel.getUpdateAccountTextDisplay(), c28655q, i19), AbstractC1092a.m3360e(c2314t, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R5, 28), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getBtS(), null, c28655q, 0, i211, 196600);
            Modifier modifierM3419p4 = AbstractC1102d.m3419p(f111, c2314t);
            C27270o c27270o4 = new C27270o(cVar2, AbstractC18489d0.m53359E(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
            if (i17 == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            zM87157i4 = c28655q.m87157i(stateModel) | z15;
            objM87133R6 = c28655q.m87133R();
            if (zM87157i4) {
                final int i35 = 3;
                objM87133R6 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i35) {
                            case 0:
                                return AbstractC27169c.m81700m(deepLinkClickHandler, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(deepLinkClickHandler, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(deepLinkClickHandler, stateModel);
                            default:
                                return AbstractC27169c.m81703p(deepLinkClickHandler, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            } else {
                final int i36 = 3;
                objM87133R6 = new InterfaceC4339a() { // from class: nv1.b
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i36) {
                            case 0:
                                return AbstractC27169c.m81700m(deepLinkClickHandler, stateModel);
                            case 1:
                                return AbstractC27169c.m81701n(deepLinkClickHandler, stateModel);
                            case 2:
                                return AbstractC27169c.m81702o(deepLinkClickHandler, stateModel);
                            default:
                                return AbstractC27169c.m81703p(deepLinkClickHandler, stateModel);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC27242b1.m82092d(c27270o4, "", modifierM3419p4, null, (InterfaceC4339a) objM87133R6, c28655q, i216, 8);
            c28655q.m87173q(true);
            if (1.0f > 0.0d) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (!z16) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            Modifier modifierM3398t7 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, f15, 0.0f, f110 * f13, 5);
            EnumC27284v enumC27284v2 = EnumC27284v.TextMedium;
            String strM21274h6 = AbstractC8693b.m21274h(stateModel.getSubmitButtonTextDisplay(), c28655q, i19);
            long jM125400j2 = c38072d.m121949b(c28655q, i18).getAccentPositiveTrend();
            if ((i15 & 7168) == 2048) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87157i5 = z17 | c28655q.m87157i(stateModel) | c28655q.m87153g(strM21274h) | c28655q.m87153g(strM21274h2);
            objM87133R7 = c28655q.m87133R();
            if (zM87157i5) {
                C1012d c1012d2 = new C1012d(submitButtonClickHandler, stateModel, strM21274h, strM21274h2, 29);
                c28655q.m87172p0(c1012d2);
                objM87133R7 = c1012d2;
            } else {
                C1012d c1012d3 = new C1012d(submitButtonClickHandler, stateModel, strM21274h, strM21274h2, 29);
                c28655q.m87172p0(c1012d3);
                objM87133R7 = c1012d3;
            }
            AbstractC27282u.m82292h(modifierM3398t7, enumC27284v2, strM21274h6, true, jM125400j2, null, false, (InterfaceC4339a) objM87133R7, c28655q, 3120, 96);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            function2 = webLinkClickHandler;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26960m0(stateModel, function2, deepLinkClickHandler, submitButtonClickHandler, i13, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m81700m(Function1 function1, MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel) {
        function1.invoke(availableMemberDataExportModel.getLearnMoreLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m81701n(Function1 function1, MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel) {
        function1.invoke(availableMemberDataExportModel.getLearnMoreLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m81702o(Function1 function1, MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel) {
        function1.invoke(availableMemberDataExportModel.getUpdateAccountLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m81703p(Function1 function1, MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel) {
        function1.invoke(availableMemberDataExportModel.getUpdateAccountLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m81704q(Function3 function3, MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel, String str, String str2) {
        function3.invoke(availableMemberDataExportModel.getRecipientEmailDisplay(), str, str2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m81705r(MemberDataExportModel.AvailableMemberDataExportModel availableMemberDataExportModel, Function1 function1, Function1 function2, Function3 function3, int i13, Composer composer, int i14) {
        m81699l(availableMemberDataExportModel, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s */
    public static final void m81706s(MemberDataExportModel stateModel, InterfaceC4339a backPressHandler, Function1 webLinkClickHandler, Function1 deepLinkClickHandler, Function3 submitButtonClickHandler, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C28655q c28655q;
        AbstractC22676k.m65750j(stateModel, "stateModel");
        AbstractC22676k.m65750j(backPressHandler, "backPressHandler");
        AbstractC22676k.m65750j(webLinkClickHandler, "webLinkClickHandler");
        AbstractC22676k.m65750j(deepLinkClickHandler, "deepLinkClickHandler");
        AbstractC22676k.m65750j(submitButtonClickHandler, "submitButtonClickHandler");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(122790998);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q2.m87153g(stateModel) : c28655q2.m87157i(stateModel) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(backPressHandler) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(webLinkClickHandler) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87157i(deepLinkClickHandler) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87157i(submitButtonClickHandler) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC15673b0.m44008S(c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66724m);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            c28655q = c28655q2;
            AbstractC6719b.m20143d(null, new AbstractC6721d.a(stateModel.getScreenTitleDisplay(), null, AbstractC38963t7.m124375e(C38072d.f163053a), "LeftBackNavIcon", null, null, null, null, false, null, null, null, null, null, null, null, 65522, null), null, backPressHandler, null, null, c28655q, (AbstractC6721d.a.f25641r << 3) | ((i15 << 6) & 7168), 53);
            if (stateModel instanceof MemberDataExportModel.AvailableMemberDataExportModel) {
                c28655q.m87150e0(21202053);
                int i16 = i15 >> 3;
                function1 = webLinkClickHandler;
                m81699l((MemberDataExportModel.AvailableMemberDataExportModel) stateModel, function1, deepLinkClickHandler, submitButtonClickHandler, c28655q, TextResource.$stable | (i15 & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168));
                c28655q.m87173q(false);
            } else {
                function1 = webLinkClickHandler;
                if (stateModel instanceof MemberDataExportModel.UnavailableMemberDataExportModel) {
                    c28655q.m87150e0(21403832);
                    MemberDataExportModel.UnavailableMemberDataExportModel unavailableMemberDataExportModel = (MemberDataExportModel.UnavailableMemberDataExportModel) stateModel;
                    TextResource screenTitleDisplay = unavailableMemberDataExportModel.getScreenTitleDisplay();
                    int i17 = TextResource.$stable;
                    m81708u(new C27174h(AbstractC8693b.m21274h(screenTitleDisplay, c28655q, i17), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getHeadlineDisplay(), c28655q, i17), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getBodyDisplay(), c28655q, i17), AbstractC8693b.m21274h(unavailableMemberDataExportModel.getHelpLinkTextDisplay(), c28655q, i17), AbstractC8693b.m21275i(unavailableMemberDataExportModel.getHelpLink(), c28655q, 0)), function1, c28655q, (i15 >> 3) & 112);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(21972744);
                    c28655q.m87173q(false);
                }
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            function1 = webLinkClickHandler;
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1909c((Object) stateModel, (Object) backPressHandler, (Object) function1, (Object) deepLinkClickHandler, (Object) submitButtonClickHandler, i13, 25);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m81707t(MemberDataExportModel memberDataExportModel, InterfaceC4339a interfaceC4339a, Function1 function1, Function1 function2, Function3 function3, int i13, Composer composer, int i14) {
        m81706s(memberDataExportModel, interfaceC4339a, function1, function2, function3, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    public static final void m81708u(C27174h unavailableBodyArgs, Function1 webLinkClickHandler, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(unavailableBodyArgs, "unavailableBodyArgs");
        AbstractC22676k.m65750j(webLinkClickHandler, "webLinkClickHandler");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1139413237);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(unavailableBodyArgs) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(webLinkClickHandler) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8397c = C2886a.m8397c(c38072d.m121952e(c28655q, i15).getB2(), C23285v0.m67364b(AbstractC18489d0.m53377r(c38072d, c28655q, i15), 0L, AbstractC35745c.m113246h(14), null, null, 0L, 0, AbstractC35745c.m113246h(18), null, null, 16646141), null, 2, null);
            float f13 = 8;
            float f14 = 2;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), ((float) 2.5d) * f13, 0.0f, 2), 0.0f, 1 * f13, 0.0f, f14 * f13, 5);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            AbstractC31926e.m99375j(null, null, 0L, AbstractC33253j.m105489e(f14 * 4), null, null, 0.0f, AbstractC37817c.m121344e(239544847, c28655q, new C21859k(unavailableBodyArgs, c2886aM8397c, webLinkClickHandler, 11)), c28655q, 12582912, 119);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26003i(unavailableBodyArgs, webLinkClickHandler, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m81709v(C27174h c27174h, C2886a c2886a, Function1 function1, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 8;
            float f14 = 2 * f13;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f14, AbstractC1102d.m3409f(1.0f, c2314t));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            String strM21275i = AbstractC8693b.m21275i(c27174h.getHeadline(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i14).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i14).getT3();
            int i15 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21275i, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i15, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c27174h.getBody(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i14).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886a, null, c28655q, 48, i15, 196600);
            float f15 = 4;
            AbstractC11266d.m30469w(f13, f15, c2314t, c28655q);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(c27174h);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87153g || objM87133R2 == c28676v0) {
                objM87133R2 = new C27167a(function1, c27174h, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC30795n.m94707h(AbstractC8693b.m21275i(c27174h.getHelpText(), c28655q, 0), AbstractC1092a.m3360e(c2314t, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R2, 28), c38072d.m121949b(c28655q, i14).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i14).getBtS(), null, c28655q, 0, i15, 196600);
            Modifier modifierM3419p = AbstractC1102d.m3419p(12 * f15, c2314t);
            C27270o c27270o = new C27270o(AbstractC27274q.c.f109140f, AbstractC18489d0.m53359E(c38072d), null, null, null, false, false, false, 0.0f, false, 1020, null);
            boolean zM87153g2 = c28655q.m87153g(function1) | c28655q.m87153g(c27174h);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C27167a(function1, c27174h, 0);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC27242b1.m82092d(c27270o, "", modifierM3419p, null, (InterfaceC4339a) objM87133R3, c28655q, C27270o.f109105k | 432, 8);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m81710w(Function1 function1, C27174h c27174h) {
        function1.invoke(c27174h.getHelpLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m81711x(Function1 function1, C27174h c27174h) {
        function1.invoke(c27174h.getHelpLink());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m81712y(C27174h c27174h, Function1 function1, int i13, Composer composer, int i14) {
        m81708u(c27174h, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
