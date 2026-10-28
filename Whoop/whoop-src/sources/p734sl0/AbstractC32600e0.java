package p734sl0;

import am2.C1044u;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.design.util.AbstractC8693b;
import java.io.IOException;
import l83.C23454a0;
import nl0.AbstractC26802d;
import nl0.C26804f;
import nl0.C26807i;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.C15199y3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;

/* JADX INFO: renamed from: sl0.e0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lnl0/f;", "viewState", "Lg1/y3;", "modalState", "", "showFeedbackForm", "", "feedbackMessageId", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "existingFeedback", "Lkotlin/Function1;", "Lnl0/d;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "bodyContent", "f", "(Lnl0/f;Lg1/y3;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lkotlin/jvm/functions/Function1;Lc93/m;Landroidx/compose/runtime/Composer;I)V", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32600e0 {

    /* JADX INFO: renamed from: sl0.e0$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationBottomSheetModalKt$AiConversationBottomSheetModal$1$1$1$1$1", m100430f = "AiConversationBottomSheetModal.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135090w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f135091x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function1 f135092y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC26802d f135093z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C15199y3 c15199y3, Function1 function1, AbstractC26802d abstractC26802d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135091x = c15199y3;
            this.f135092y = function1;
            this.f135093z = abstractC26802d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135091x, this.f135092y, this.f135093z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135090w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f135091x;
                this.f135090w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f135092y.invoke(this.f135093z);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.e0$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationBottomSheetModalKt$AiConversationBottomSheetModal$1$1$2$1$1", m100430f = "AiConversationBottomSheetModal.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135094w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f135095x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C15199y3 c15199y3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135095x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135095x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135094w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f135095x;
                this.f135094w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m101723f(C26804f viewState, C15199y3 modalState, boolean z4, String str, AiMessageFeedback aiMessageFeedback, Function1 onViewEvent, InterfaceC4351m bodyContent, Composer composer, int i13) {
        int i14;
        AiMessageFeedback aiMessageFeedback2;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(modalState, "modalState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(bodyContent, "bodyContent");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(860636266);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q2.m87153g(modalState) : c28655q2.m87157i(modalState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(str) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            aiMessageFeedback2 = aiMessageFeedback;
            i14 |= c28655q2.m87157i(aiMessageFeedback2) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            aiMessageFeedback2 = aiMessageFeedback;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q2.m87157i(bodyContent) ? 1048576 : 524288;
        }
        if (c28655q2.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            Object objM87133R = c28655q2.m87133R();
            if (objM87133R == C28635l.f115821a) {
                objM87133R = AbstractC28683x.m87262p(c28655q2);
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC35660d.m112871m(AbstractC1102d.m3407d(1.0f, C2314t.f9131w), new C35666g(AbstractC8693b.m21277k(z4 ? AbstractC37336b.f159616E : AbstractC37336b.f159632M), null, null, null, null, 0.0f, 0.0f, 126, null), new AbstractC35664f.a(modalState), EnumC39333f.TRANSPARENT, null, null, null, AbstractC37817c.m121344e(2046436632, c28655q2, new C32585b0(z4, str, aiMessageFeedback2, (InterfaceC2994c0) objM87133R, modalState, onViewEvent, viewState)), false, null, null, null, false, null, AbstractC37817c.m121344e(1281643484, c28655q2, new C32590c0(0, bodyContent)), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1044u(viewState, modalState, z4, str, aiMessageFeedback, onViewEvent, bodyContent, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m101724g(boolean z4, String str, AiMessageFeedback aiMessageFeedback, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, C26804f c26804f, InterfaceC23013y BottomSheet, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            Modifier modifierM66722k = AbstractC22953f.m66722k(C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4) {
                c28655q.m87150e0(1201172793);
                boolean zM87157i = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C32595d0(interfaceC2994c0, c15199y3, function1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC32681u2.m102490z(str, aiMessageFeedback, false, (Function1) objM87133R, c28655q, 0, 4);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1201630756);
                C26807i c26807iM79946d = c26804f.getConversationHistoryViewState();
                boolean zM87157i2 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87153g(function1);
                Object objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new C32595d0(interfaceC2994c0, function1, c15199y3);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC32656p1.m102152x(c26807iM79946d, (Function1) objM87133R2, c28655q, 0, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m101725h(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Function1 function1, AbstractC26802d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c15199y3, function1, event, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m101726i(InterfaceC2994c0 interfaceC2994c0, Function1 function1, C15199y3 c15199y3, AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c15199y3, null), 3);
        function1.invoke(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m101727j(InterfaceC4351m interfaceC4351m, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            interfaceC4351m.invoke(c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m101728k(C26804f c26804f, C15199y3 c15199y3, boolean z4, String str, AiMessageFeedback aiMessageFeedback, Function1 function1, InterfaceC4351m interfaceC4351m, int i13, Composer composer, int i14) {
        m101723f(c26804f, c15199y3, z4, str, aiMessageFeedback, function1, interfaceC4351m, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
