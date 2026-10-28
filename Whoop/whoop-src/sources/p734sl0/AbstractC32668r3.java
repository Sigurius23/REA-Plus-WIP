package p734sl0;

import a81.C0563n;
import androidx.compose.animation.AbstractC1091c;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import c31.C3922f;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import gb1.AbstractC15673b0;
import h51.C16934f;
import ih0.C18508r;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.C25271y;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26801c;
import nl0.C26804f;
import nl0.C26808j;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22949e;
import p291l0.C22971k;
import p291l0.C22976l1;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC23013y;
import p329n0.AbstractC26071x;
import p329n0.C26053f;
import p329n0.C26068u;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;

/* JADX INFO: renamed from: sl0.r3 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0083\u0001\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Ll0/y;", "Lnl0/f;", "viewState", "Lkotlin/Function2;", "", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "Ll83/a0;", "onFeedbackClicked", "Lkotlin/Function1;", "Lnl0/d;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "onImageTileClicked", "", "isWceLoading", "m", "(Ll0/y;Lnl0/f;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32668r3 {

    /* JADX INFO: renamed from: sl0.r3$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ FeatureFlagChecker f135523w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26801c f135524x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC2464x2 f135525y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4351m f135526z;

        public a(FeatureFlagChecker featureFlagChecker, C26801c c26801c, InterfaceC2464x2 interfaceC2464x2, InterfaceC4351m interfaceC4351m) {
            this.f135523w = featureFlagChecker;
            this.f135524x = c26801c;
            this.f135525y = interfaceC2464x2;
            this.f135526z = interfaceC4351m;
        }

        /* JADX INFO: renamed from: a */
        public final void m102276a(AiFeedbackType aiFeedbackType) {
            AiMessageFeedback feedback = (!this.f135523w.isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_FEEDBACK_V3) || aiFeedbackType == null) ? this.f135524x.getFeedback() : new AiMessageFeedback(aiFeedbackType.getValue(), "", C25271y.f99162w);
            InterfaceC2464x2 interfaceC2464x2 = this.f135525y;
            if (interfaceC2464x2 != null) {
                ((C2463x1) interfaceC2464x2).m7442a();
            }
            this.f135526z.invoke(this.f135524x.getId(), feedback);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m102276a((AiFeedbackType) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.r3$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f135527w = new b();

        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(C26801c c26801c) {
            return null;
        }
    }

    /* JADX INFO: renamed from: sl0.r3$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ Function1 f135528w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List f135529x;

        public c(Function1 function1, List list) {
            this.f135528w = function1;
            this.f135529x = list;
        }

        /* JADX INFO: renamed from: a */
        public final Object m102278a(int i13) {
            return this.f135528w.invoke(this.f135529x.get(i13));
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m102278a(((Number) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: sl0.r3$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC4352n {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ Function1 f135530E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Function1 f135531F;

        /* JADX INFO: renamed from: w */
        final /* synthetic */ List f135532w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26804f f135533x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureFlagChecker f135534y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4351m f135535z;

        public d(List list, C26804f c26804f, FeatureFlagChecker featureFlagChecker, InterfaceC4351m interfaceC4351m, Function1 function1, Function1 function2) {
            this.f135532w = list;
            this.f135533x = c26804f;
            this.f135534y = featureFlagChecker;
            this.f135535z = interfaceC4351m;
            this.f135530E = function1;
            this.f135531F = function2;
        }

        /* JADX INFO: renamed from: a */
        public final void m102279a(InterfaceC1103a interfaceC1103a, int i13, Composer composer, int i14) {
            int i15;
            if ((i14 & 6) == 0) {
                i15 = i14 | (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2);
            } else {
                i15 = i14;
            }
            if ((i14 & 48) == 0) {
                i15 |= ((C28655q) composer).m87149e(i13) ? 32 : 16;
            }
            C28655q c28655q = (C28655q) composer;
            if (!c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
                c28655q.m87138X();
                return;
            }
            C26801c c26801c = (C26801c) this.f135532w.get(i13);
            c28655q.m87150e0(-1022880126);
            if (c26801c.getRole() == EnumC26800b.USER) {
                c28655q.m87150e0(-1022897673);
                AbstractC32623i3.m101872f(c26801c.getContent(), c26801c.m79890f(), c26801c.getIsSuggestion(), c26801c.getId(), c28655q, 0, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1022660058);
                if (c26801c.getIsLoading()) {
                    c28655q.m87150e0(-1020705818);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1022616286);
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(1 * 8), C2299e.f9110M, c28655q, 6);
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
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) c28655q.m87161k(AbstractC2453v1.f9577p);
                    boolean zM65745e = AbstractC22676k.m65745e(AbstractC25265s.m74114R0(this.f135533x.getConversation().m79883f()), c26801c);
                    boolean zM65745e2 = AbstractC22676k.m65745e(AbstractC25265s.m74100H0(this.f135533x.getConversation().m79883f()), c26801c);
                    boolean showChatIcon = c26801c.getShowChatIcon();
                    String content = c26801c.getContent();
                    List<InterfaceC25312u> listM79890f = c26801c.m79890f();
                    boolean feedbackEnabled = c26801c.getFeedbackEnabled();
                    AiMessageFeedback feedback = c26801c.getFeedback();
                    boolean isComplete = c26801c.getIsComplete();
                    boolean isStopped = c26801c.getIsStopped();
                    C26804f c26804f = this.f135533x;
                    boolean zM87157i = c28655q.m87157i(this.f135534y) | c28655q.m87157i(c26801c) | c28655q.m87153g(interfaceC2464x2) | c28655q.m87153g(this.f135535z);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87157i || objM87133R == C28635l.f115821a) {
                        objM87133R = new a(this.f135534y, c26801c, interfaceC2464x2, this.f135535z);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC32611g1.m101757n(c26804f, zM65745e2, showChatIcon, content, listM79890f, feedbackEnabled, null, feedback, false, isComplete, isStopped, (Function1) objM87133R, zM65745e, this.f135530E, this.f135531F, false, c28655q, 0, 0, 33088);
                    c28655q = c28655q;
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(false);
        }

        @Override // c93.InterfaceC4352n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m102279a((InterfaceC1103a) obj, ((Number) obj2).intValue(), (Composer) obj3, ((Number) obj4).intValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:102:0x017e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0186 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0190  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:44:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0099  */
    /* JADX WARN: Code duplicated, block: B:53:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:83:0x0105  */
    /* JADX WARN: Code duplicated, block: B:86:0x0111  */
    /* JADX WARN: Code duplicated, block: B:89:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0162  */
    /* JADX WARN: Code duplicated, block: B:94:0x0164  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    /* JADX INFO: renamed from: m */
    public static final void m102263m(InterfaceC23013y interfaceC23013y, C26804f viewState, InterfaceC4351m onFeedbackClicked, Function1 function1, Function1 function2, Function1 function3, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        Function1 function4;
        int i16;
        Function1 function5;
        int i17;
        int i18;
        boolean z13;
        int i19;
        boolean z14;
        Function1 function6;
        Function1 function7;
        Function1 function8;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function9;
        Function1 function10;
        int i24;
        Function1 function11;
        Object objM87133R;
        C32695y0 c32695y0;
        FeatureFlagChecker featureFlagChecker;
        Function1 function12;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object c18508r;
        boolean z24;
        Function1 function13;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        AbstractC22676k.m65750j(interfaceC23013y, "<this>");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1569106192);
        int i25 = 4;
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(interfaceC23013y) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onFeedbackClicked) ? 256 : 128;
        }
        int i26 = i14 & 4;
        if (i26 == 0) {
            if ((i13 & 3072) == 0) {
                function4 = function1;
                i15 |= c28655q.m87157i(function4) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 8;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function5 = function2;
                    if (c28655q.m87157i(function5)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    i15 |= 1572864;
                    z13 = z4;
                } else {
                    z13 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q.m87155h(z13)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i15 |= i19;
                    }
                }
                if ((i15 & 533651) != 533650) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c28655q.m87135U(i15 & 1, z14)) {
                    c28676v0 = C28635l.f115821a;
                    if (i26 != 0) {
                        objM87133R4 = c28655q.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C32618h3(i25);
                            c28655q.m87172p0(objM87133R4);
                        }
                        function9 = (Function1) objM87133R4;
                    } else {
                        function9 = function4;
                    }
                    if (i16 != 0) {
                        objM87133R3 = c28655q.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C32618h3(7);
                            c28655q.m87172p0(objM87133R3);
                        }
                        function10 = (Function1) objM87133R3;
                    } else {
                        function10 = function5;
                    }
                    i24 = 8;
                    if ((i14 & 16) != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32618h3(i24);
                            c28655q.m87172p0(objM87133R2);
                        }
                        function11 = (Function1) objM87133R2;
                    } else {
                        function11 = function3;
                    }
                    if (i18 != 0) {
                        z13 = false;
                    }
                    C26068u c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C32695y0();
                        c28655q.m87172p0(objM87133R);
                    }
                    c32695y0 = (C32695y0) objM87133R;
                    featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                    Modifier modifierM66779c = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f);
                    float f13 = 8;
                    function12 = function9;
                    C22976l1 c22976l1M3381c = AbstractC1099a.m3381c(0.0f, 2 * f13, 0.0f, ((float) 1.5d) * f13, 5);
                    C22949e c22949e = AbstractC22977m.f90650a;
                    C22971k c22971kM66748k = AbstractC22977m.m66748k(1 * f13, C2299e.f9109L);
                    boolean zM87157i = c28655q.m87157i(viewState);
                    if ((i15 & 7168) == 2048) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z25 = z15 | zM87157i;
                    if ((57344 & i15) == 16384) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zM87157i2 = z25 | z16 | c28655q.m87157i(featureFlagChecker);
                    if ((i15 & 896) == 256) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z26 = zM87157i2 | z17;
                    if ((i15 & 3670016) == 1048576) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z26 | z18;
                    Object objM87133R5 = c28655q.m87133R();
                    if (!z19 || objM87133R5 == c28676v0) {
                        boolean z27 = z13;
                        c18508r = new C18508r(viewState, z27, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                        z24 = z27;
                        function13 = function12;
                        c28655q.m87172p0(c18508r);
                    } else {
                        function13 = function12;
                        c18508r = objM87133R5;
                        z24 = z13;
                    }
                    AbstractC22674j.m65717c(modifierM66779c, c26068uM77569a, c22976l1M3381c, c22971kM66748k, null, null, false, null, (Function1) c18508r, c28655q, 24960, 488);
                    function7 = function13;
                    function8 = function10;
                    z13 = z24;
                    function6 = function11;
                } else {
                    c28655q.m87138X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C3922f(interfaceC23013y, viewState, onFeedbackClicked, function7, function8, function6, z13, i13, i14);
                }
            }
            i15 |= 24576;
            function5 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 533651) != 533650) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(i25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function9 = (Function1) objM87133R4;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32618h3(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function5;
                }
                i24 = 8;
                if ((i14 & 16) != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32618h3(i24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function11 = (Function1) objM87133R2;
                } else {
                    function11 = function3;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                C26068u c26068uM77569a2 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32695y0();
                    c28655q.m87172p0(objM87133R);
                }
                c32695y0 = (C32695y0) objM87133R;
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                Modifier modifierM66779c2 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f);
                float f14 = 8;
                function12 = function9;
                C22976l1 c22976l1M3381c2 = AbstractC1099a.m3381c(0.0f, 2 * f14, 0.0f, ((float) 1.5d) * f14, 5);
                C22949e c22949e2 = AbstractC22977m.f90650a;
                C22971k c22971kM66748k2 = AbstractC22977m.m66748k(1 * f14, C2299e.f9109L);
                boolean zM87157i3 = c28655q.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z28 = z15 | zM87157i3;
                if ((57344 & i15) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i4 = z28 | z16 | c28655q.m87157i(featureFlagChecker);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z29 = zM87157i4 | z17;
                if ((i15 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z29 | z18;
                Object objM87133R6 = c28655q.m87133R();
                if (z19) {
                    boolean z210 = z13;
                    c18508r = new C18508r(viewState, z210, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                    z24 = z210;
                    function13 = function12;
                    c28655q.m87172p0(c18508r);
                } else {
                    boolean z211 = z13;
                    c18508r = new C18508r(viewState, z211, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                    z24 = z211;
                    function13 = function12;
                    c28655q.m87172p0(c18508r);
                }
                AbstractC22674j.m65717c(modifierM66779c2, c26068uM77569a2, c22976l1M3381c2, c22971kM66748k2, null, null, false, null, (Function1) c18508r, c28655q, 24960, 488);
                function7 = function13;
                function8 = function10;
                z13 = z24;
                function6 = function11;
            } else {
                c28655q.m87138X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC23013y, viewState, onFeedbackClicked, function7, function8, function6, z13, i13, i14);
            }
        }
        i15 |= 3072;
        function4 = function1;
        i16 = i14 & 8;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function5 = function2;
                if (c28655q.m87157i(function5)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                i15 |= 1572864;
                z13 = z4;
            } else {
                z13 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q.m87155h(z13)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i15 |= i19;
                }
            }
            if ((i15 & 533651) != 533650) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                c28676v0 = C28635l.f115821a;
                if (i26 != 0) {
                    objM87133R4 = c28655q.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C32618h3(i25);
                        c28655q.m87172p0(objM87133R4);
                    }
                    function9 = (Function1) objM87133R4;
                } else {
                    function9 = function4;
                }
                if (i16 != 0) {
                    objM87133R3 = c28655q.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C32618h3(7);
                        c28655q.m87172p0(objM87133R3);
                    }
                    function10 = (Function1) objM87133R3;
                } else {
                    function10 = function5;
                }
                i24 = 8;
                if ((i14 & 16) != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32618h3(i24);
                        c28655q.m87172p0(objM87133R2);
                    }
                    function11 = (Function1) objM87133R2;
                } else {
                    function11 = function3;
                }
                if (i18 != 0) {
                    z13 = false;
                }
                C26068u c26068uM77569a3 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C32695y0();
                    c28655q.m87172p0(objM87133R);
                }
                c32695y0 = (C32695y0) objM87133R;
                featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
                Modifier modifierM66779c3 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f);
                float f15 = 8;
                function12 = function9;
                C22976l1 c22976l1M3381c3 = AbstractC1099a.m3381c(0.0f, 2 * f15, 0.0f, ((float) 1.5d) * f15, 5);
                C22949e c22949e3 = AbstractC22977m.f90650a;
                C22971k c22971kM66748k3 = AbstractC22977m.m66748k(1 * f15, C2299e.f9109L);
                boolean zM87157i5 = c28655q.m87157i(viewState);
                if ((i15 & 7168) == 2048) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z212 = z15 | zM87157i5;
                if ((57344 & i15) == 16384) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zM87157i6 = z212 | z16 | c28655q.m87157i(featureFlagChecker);
                if ((i15 & 896) == 256) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z213 = zM87157i6 | z17;
                if ((i15 & 3670016) == 1048576) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z213 | z18;
                Object objM87133R7 = c28655q.m87133R();
                if (z19) {
                    boolean z214 = z13;
                    c18508r = new C18508r(viewState, z214, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                    z24 = z214;
                    function13 = function12;
                    c28655q.m87172p0(c18508r);
                } else {
                    boolean z215 = z13;
                    c18508r = new C18508r(viewState, z215, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                    z24 = z215;
                    function13 = function12;
                    c28655q.m87172p0(c18508r);
                }
                AbstractC22674j.m65717c(modifierM66779c3, c26068uM77569a3, c22976l1M3381c3, c22971kM66748k3, null, null, false, null, (Function1) c18508r, c28655q, 24960, 488);
                function7 = function13;
                function8 = function10;
                z13 = z24;
                function6 = function11;
            } else {
                c28655q.m87138X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C3922f(interfaceC23013y, viewState, onFeedbackClicked, function7, function8, function6, z13, i13, i14);
            }
        }
        i15 |= 24576;
        function5 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            i15 |= 1572864;
            z13 = z4;
        } else {
            z13 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q.m87155h(z13)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i15 |= i19;
            }
        }
        if ((i15 & 533651) != 533650) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            c28676v0 = C28635l.f115821a;
            if (i26 != 0) {
                objM87133R4 = c28655q.m87133R();
                if (objM87133R4 == c28676v0) {
                    objM87133R4 = new C32618h3(i25);
                    c28655q.m87172p0(objM87133R4);
                }
                function9 = (Function1) objM87133R4;
            } else {
                function9 = function4;
            }
            if (i16 != 0) {
                objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C32618h3(7);
                    c28655q.m87172p0(objM87133R3);
                }
                function10 = (Function1) objM87133R3;
            } else {
                function10 = function5;
            }
            i24 = 8;
            if ((i14 & 16) != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32618h3(i24);
                    c28655q.m87172p0(objM87133R2);
                }
                function11 = (Function1) objM87133R2;
            } else {
                function11 = function3;
            }
            if (i18 != 0) {
                z13 = false;
            }
            C26068u c26068uM77569a4 = AbstractC26071x.m77569a(0, 0, c28655q, 3);
            objM87133R = c28655q.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = new C32695y0();
                c28655q.m87172p0(objM87133R);
            }
            c32695y0 = (C32695y0) objM87133R;
            featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            Modifier modifierM66779c4 = ((C23016z) interfaceC23013y).m66779c(AbstractC1102d.m3409f(1.0f, C2314t.f9131w), true, 1.0f);
            float f16 = 8;
            function12 = function9;
            C22976l1 c22976l1M3381c4 = AbstractC1099a.m3381c(0.0f, 2 * f16, 0.0f, ((float) 1.5d) * f16, 5);
            C22949e c22949e4 = AbstractC22977m.f90650a;
            C22971k c22971kM66748k4 = AbstractC22977m.m66748k(1 * f16, C2299e.f9109L);
            boolean zM87157i7 = c28655q.m87157i(viewState);
            if ((i15 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z216 = z15 | zM87157i7;
            if ((57344 & i15) == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zM87157i8 = z216 | z16 | c28655q.m87157i(featureFlagChecker);
            if ((i15 & 896) == 256) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z217 = zM87157i8 | z17;
            if ((i15 & 3670016) == 1048576) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z217 | z18;
            Object objM87133R8 = c28655q.m87133R();
            if (z19) {
                boolean z218 = z13;
                c18508r = new C18508r(viewState, z218, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                z24 = z218;
                function13 = function12;
                c28655q.m87172p0(c18508r);
            } else {
                boolean z219 = z13;
                c18508r = new C18508r(viewState, z219, function12, function10, c32695y0, featureFlagChecker, onFeedbackClicked);
                z24 = z219;
                function13 = function12;
                c28655q.m87172p0(c18508r);
            }
            AbstractC22674j.m65717c(modifierM66779c4, c26068uM77569a4, c22976l1M3381c4, c22971kM66748k4, null, null, false, null, (Function1) c18508r, c28655q, 24960, 488);
            function7 = function13;
            function8 = function10;
            z13 = z24;
            function6 = function11;
        } else {
            c28655q.m87138X();
            function6 = function3;
            function7 = function4;
            function8 = function5;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3922f(interfaceC23013y, viewState, onFeedbackClicked, function7, function8, function6, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m102264n(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m102265o(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m102266p(String it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m102267q(C26804f c26804f, boolean z4, Function1 function1, Function1 function2, C32695y0 c32695y0, FeatureFlagChecker featureFlagChecker, InterfaceC4351m interfaceC4351m, InterfaceC26064q LazyColumn) {
        C26801c c26801cPrevious;
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        C26808j educationHubState = c26804f.getEducationHubState();
        if (educationHubState != null) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C0563n((Object) educationHubState, (Object) c26804f, function1, (Object) function2, (Object) c32695y0, 13), true, 1650168612), 3);
        }
        List<C26801c> listM79883f = c26804f.getConversation().m79883f();
        ((C26053f) LazyColumn).m77529r(listM79883f.size(), null, new c(b.f135527w, listM79883f), new C37816b(new d(listM79883f, c26804f, featureFlagChecker, interfaceC4351m, function1, function2), true, 802480018));
        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
            List<C26801c> listM79883f2 = c26804f.getConversation().m79883f();
            ListIterator<C26801c> listIterator = listM79883f2.listIterator(listM79883f2.size());
            do {
                if (!listIterator.hasPrevious()) {
                    c26801cPrevious = null;
                    break;
                }
                c26801cPrevious = listIterator.previous();
            } while (c26801cPrevious.getRole() != EnumC26800b.ASSISTANT);
            C26801c c26801c = c26801cPrevious;
            if ((c26801c != null && c26801c.getIsLoading()) || z4) {
                InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C32665r0(c26804f, 3), true, -447773120), 3);
            }
        } else {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C32665r0(c26804f, 3), true, -447773120), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m102268r(C26808j c26808j, C26804f c26804f, Function1 function1, Function1 function2, C32695y0 c32695y0, InterfaceC1103a item, Composer composer, int i13) {
        C28655q c28655q;
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM3355a = AbstractC1091c.m3355a(AbstractC1102d.m3409f(1.0f, AbstractC1136a.m3599a(C2314t.f9131w, "educatonHubBox")), null, 3);
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C32618h3(9);
                c28655q2.m87172p0(objM87133R);
            }
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1125a.m3478a(modifierM3355a, (Function1) objM87133R), 2 * 4, 0.0f, 0.0f, 0.0f, 14);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
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
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            C16934f carouselState = c26808j.getCarouselState();
            if (carouselState == null) {
                c28655q2.m87150e0(-280712602);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-280712601);
                boolean zM87157i = c28655q2.m87157i(c26804f) | c28655q2.m87157i(carouselState) | c28655q2.m87153g(function1) | c28655q2.m87153g(function2);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87157i || objM87133R2 == c28676v0) {
                    C32663q3 c32663q3 = new C32663q3(c32695y0, c26804f, carouselState, function1, function2, 0);
                    c28655q2.m87172p0(c32663q3);
                    objM87133R2 = c32663q3;
                }
                AbstractC25303l.m74291r(carouselState, null, null, (Function1) objM87133R2, c28655q2, C16934f.f64958n, 6);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102269s(InterfaceC22131e drawBehind) {
        AbstractC22676k.m65750j(drawBehind, "$this$drawBehind");
        drawBehind.mo727R(AbstractC15673b0.m43972A(), 0L, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.mo731d() & 4294967295L)))) & 4294967295L), drawBehind.mo743q0(2 * 4), (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : 0.0f);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m102270t(C32695y0 c32695y0, C26804f c26804f, C16934f c16934f, Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        c32695y0.m102587a(event, 0, c26804f, c16934f, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m102271u(C26804f c26804f, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C32618h3(10);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function1 = (Function1) objM87133R;
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C32618h3(5);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function2 = (Function1) objM87133R2;
            Object objM87133R3 = c28655q.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C32618h3(6);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC32611g1.m101757n(c26804f, false, true, "", C25271y.f99162w, false, null, null, true, false, false, function1, true, function2, (Function1) objM87133R3, false, c28655q, 100887984, 28080, 34496);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m102272v(AiFeedbackType aiFeedbackType) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m102273w(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m102274x(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m102275y(InterfaceC23013y interfaceC23013y, C26804f c26804f, InterfaceC4351m interfaceC4351m, Function1 function1, Function1 function2, Function1 function3, boolean z4, int i13, int i14, Composer composer, int i15) {
        m102263m(interfaceC23013y, c26804f, interfaceC4351m, function1, function2, function3, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
