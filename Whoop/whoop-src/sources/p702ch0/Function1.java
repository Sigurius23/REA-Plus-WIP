package p702ch0;

import a41.C0373i;
import a81.C0556g;
import android.net.Uri;
import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c41.C4139w0;
import c62.C4273a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import cb1.C4387a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.p057ai.chat.models.AttachmentType;
import com.whoop.p057ai.chat.models.TurnFeedback;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gh0.AbstractC15850e;
import iz0.AbstractC21050i;
import j93.InterfaceC21467g;
import java.io.IOException;
import java.time.Clock;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.C25271y;
import nl0.AbstractC26802d;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p132f0.C13821r1;
import p132f0.EnumC13840z0;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p180h0.InterfaceC16413k2;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22940b2;
import p291l0.InterfaceC23004v;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.AbstractC32597d2;
import p734sl0.AbstractC32654p;
import p734sl0.AbstractC32661q1;
import p734sl0.AbstractC32667r2;
import p734sl0.AbstractC32680u1;
import p734sl0.C32655p0;
import p734sl0.C32684v1;
import p734sl0.EnumC32692x1;
import p734sl0.InterfaceC32647n2;
import p734sl0.InterfaceC32666r1;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import wb3.AbstractC37056f;
import wk0.AbstractC37336b;
import x81.AbstractC38073e;
import xk0.C38423a;
import yg0.AbstractC39523b;
import zg0.AbstractC40624g;
import zg0.C40626i;
import zg0.C40628k;
import zk0.AbstractC40817h0;

/* JADX INFO: renamed from: ch0.m0, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u000b\u001a0\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00062\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aÿ\u0002\u00100\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00002\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\n2\u001c\b\u0002\u0010\u001e\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020\u001d2\u001a\b\u0002\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u001d26\b\u0002\u0010 \u001a0\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020\u00002\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00020\u00002\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010)\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020*2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\r2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\nH\u0007¢\u0006\u0004\b0\u00101\u001a\u0017\u00104\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105¨\u0006:²\u0006\u0010\u00106\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00108\u001a\u0004\u0018\u0001078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00109\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lkotlin/Function1;", "Lzg0/g;", "Ll83/a0;", "onViewEvent", "Ljava/time/Clock;", "clock", "Lkotlin/Function4;", "", "", "Landroid/net/Uri;", "", "j0", "(Lkotlin/jvm/functions/Function1;Ljava/time/Clock;)Lc93/n;", "Lkotlin/Function0;", "h0", "(Lkotlin/jvm/functions/Function1;)Lc93/a;", "Lzg0/i;", "viewState", "isWceLoading", "Lg2/v;", "focusState", "", "onSuggestionsShown", "onMessageCopied", "Lsl0/n2;", "mediaPickerLauncher", "Lsl0/r1;", "filePickerLauncher", "isFileUploadEnabled", "Lkotlin/Function2;", "onRemoveAttachment", "onRetryAttachmentUpload", "onSendMessageClicked", "onChatIconClicked", "Lyg0/b;", "onNavigationEvent", "Lcom/whoop/analytics/AnalyticEventModel;", "onAnalyticEvent", "Lg1/y3;", "feedbackModalState", "historyModalState", "isSheetExpanded", "Lg2/i;", "focusManager", "onDisabledInputTapped", "Lsl0/x1;", "autoLaunch", "halfDrawerReadOnly", "z", "(Lzg0/i;ZLg2/v;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lsl0/n2;Lsl0/r1;ZLc93/m;Lc93/m;Lc93/n;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lg1/y3;Lg1/y3;ZLg2/i;Lc93/a;Lsl0/x1;ZLandroidx/compose/runtime/Composer;IIII)V", "Lf0/r1;", "scrollState", "c0", "(Lf0/r1;Landroidx/compose/runtime/Composer;I)V", "feedbackTurnId", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "feedbackType", "wasExpanded", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class Function1 {

    /* JADX INFO: renamed from: ch0.m0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements p715kotlin.jvm.functions.Function1 {
        public a(Object obj) {
            super(1, 0, C4642o0.class, obj, "onLatestUserMessagePositioned", "onLatestUserMessagePositioned(F)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }

        public final void invoke(float f13) {
            ((C4642o0) this.receiver).m14578x(f13);
        }
    }

    /* JADX INFO: renamed from: ch0.m0$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b extends C22672i implements p715kotlin.jvm.functions.Function1 {
        public b(Object obj) {
            super(1, 0, C4642o0.class, obj, "onMessagesBottomPositioned", "onMessagesBottomPositioned(F)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }

        public final void invoke(float f13) {
            ((C4642o0) this.receiver).m14579y(f13);
        }
    }

    /* JADX INFO: renamed from: ch0.m0$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements InterfaceC4351m {
        public c(Object obj) {
            super(2, 0, C4642o0.class, obj, "onTurnEndPositioned", "onTurnEndPositioned(Ljava/lang/String;F)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14456a(String p13, float f13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4642o0) this.receiver).m14580z(p13, f13);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m14456a((String) obj, ((Number) obj2).floatValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.m0$d */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$AiChatWrapperScreenContent$10$1$1$1$5$1$1", m100430f = "AiChatScreenContent.kt", m100431l = {246, 247}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18761w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f18762x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C15199y3 f18763y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C15199y3 c15199y3, C15199y3 c15199y4, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18762x = c15199y3;
            this.f18763y = c15199y4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f18762x, this.f18763y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        
            if (r5.m43225f(r4) == r0) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.f18761w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L37
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2c
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                g1.y3 r5 = r4.f18762x
                if (r5 == 0) goto L2c
                r4.f18761w = r3
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                g1.y3 r5 = r4.f18763y
                r4.f18761w = r2
                java.lang.Object r5 = r5.m43225f(r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p702ch0.Function1.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ch0.m0$e */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$AiChatWrapperScreenContent$10$1$6$1", m100430f = "AiChatScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18764w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ p715kotlin.jvm.functions.Function1 f18765x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<String> f18766y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p715kotlin.jvm.functions.Function1 function1, List<String> list, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18765x = function1;
            this.f18766y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f18765x, this.f18766y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18764w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18765x.invoke(new Integer(this.f18766y.size()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.m0$f */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$AiChatWrapperScreenContent$8$1", m100430f = "AiChatScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18767w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18768x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC15237i f18769y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f18770z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, InterfaceC15237i interfaceC15237i, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18768x = z4;
            this.f18769y = interfaceC15237i;
            this.f18770z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f18768x, this.f18769y, this.f18770z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18767w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (Function1.m14396E(this.f18770z) && !this.f18768x) {
                ((C15240l) this.f18769y).m43339b(false);
            }
            Function1.m14397F(this.f18770z, this.f18768x);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.m0$g */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$AiChatWrapperScreenContent$9$1$1$1$1$1$1$1", m100430f = "AiChatScreenContent.kt", m100431l = {205}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18771w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f18772x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28601c1 f18773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18772x = c15199y3;
            this.f18773y = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f18772x, this.f18773y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18771w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f18772x;
                this.f18771w = 1;
                if (c15199y3.m43223d(this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Function1.m14421b0(this.f18773y, null);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.m0$h */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$OnKeyboardOpenScrollHandler$1$1", m100430f = "AiChatScreenContent.kt", m100431l = {410}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f18774E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C13821r1 f18775F;

        /* JADX INFO: renamed from: w */
        int f18776w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC28670t2 f18777x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC39171c f18778y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC15237i f18779z;

        /* JADX INFO: renamed from: ch0.m0$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$OnKeyboardOpenScrollHandler$1$1$2", m100430f = "AiChatScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lch0/j1;", "state", "", "newValue", "<anonymous>", "(Lch0/j1;F)Lch0/j1;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f18780w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f18781x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ float f18782y;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            /* JADX INFO: renamed from: f */
            public final Object m14459f(C4631j1 c4631j1, float f13, InterfaceC30057d<? super C4631j1> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f18781x = c4631j1;
                aVar.f18782y = f13;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m14459f((C4631j1) obj, ((Number) obj2).floatValue(), (InterfaceC30057d) obj3);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C4631j1 c4631j1 = (C4631j1) this.f18781x;
                float f13 = this.f18782y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f18780w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return new C4631j1(f13, c4631j1.getCurrent());
            }
        }

        /* JADX INFO: renamed from: ch0.m0$h$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC15237i f18783w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ boolean f18784x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C13821r1 f18785y;

            /* JADX INFO: renamed from: ch0.m0$h$b$a */
            @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$OnKeyboardOpenScrollHandler$1$1$4$1", m100430f = "AiChatScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lh0/k2;", "Ll83/a0;", "<anonymous>", "(Lh0/k2;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f18786w;

                /* JADX INFO: renamed from: x */
                private /* synthetic */ Object f18787x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ float f18788y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(float f13, InterfaceC30057d<? super a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f18788y = f13;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    a aVar = new a(this.f18788y, interfaceC30057d);
                    aVar.f18787x = obj;
                    return aVar;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC16413k2 interfaceC16413k2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((a) create(interfaceC16413k2, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC16413k2 interfaceC16413k2 = (InterfaceC16413k2) this.f18787x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f18786w != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    interfaceC16413k2.mo29373a(this.f18788y);
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC15237i interfaceC15237i, boolean z4, C13821r1 c13821r1) {
                this.f18783w = interfaceC15237i;
                this.f18784x = z4;
                this.f18785y = c13821r1;
            }

            /* JADX INFO: renamed from: b */
            public final Object m14460b(float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objMo9764a;
                if (f13 < -50.0f) {
                    ((C15240l) this.f18783w).m43339b(false);
                }
                return (this.f18784x || (objMo9764a = this.f18785y.mo9764a(EnumC13840z0.f49374w, new a(f13, null), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objMo9764a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m14460b(((Number) obj).floatValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: ch0.m0$h$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f18789w;

            /* JADX INFO: renamed from: ch0.m0$h$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f18790w;

                /* JADX INFO: renamed from: ch0.m0$h$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScreenContentKt$OnKeyboardOpenScrollHandler$1$1$invokeSuspend$$inlined$map$1$2", m100430f = "AiChatScreenContent.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C41350a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f18791E;

                    /* JADX INFO: renamed from: F */
                    Object f18792F;

                    /* JADX INFO: renamed from: G */
                    Object f18793G;

                    /* JADX INFO: renamed from: H */
                    int f18794H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f18795w;

                    /* JADX INFO: renamed from: x */
                    int f18796x;

                    /* JADX INFO: renamed from: y */
                    Object f18797y;

                    public C41350a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f18795w = obj;
                        this.f18796x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f18790w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C41350a c41350a;
                    if (interfaceC30057d instanceof C41350a) {
                        c41350a = (C41350a) interfaceC30057d;
                        int i13 = c41350a.f18796x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c41350a.f18796x = i13 - Integer.MIN_VALUE;
                        } else {
                            c41350a = new C41350a(interfaceC30057d);
                        }
                    } else {
                        c41350a = new C41350a(interfaceC30057d);
                    }
                    Object obj2 = c41350a.f18795w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c41350a.f18796x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f18790w;
                        C4631j1 c4631j1 = (C4631j1) obj;
                        Float f13 = new Float(c4631j1.getCurrent() - c4631j1.getPrevious());
                        c41350a.f18797y = null;
                        c41350a.f18791E = null;
                        c41350a.f18792F = null;
                        c41350a.f18793G = null;
                        c41350a.f18794H = 0;
                        c41350a.f18796x = 1;
                        if (interfaceC13062m.emit(f13, c41350a) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            public c(InterfaceC13058l interfaceC13058l) {
                this.f18789w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f18789w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c, InterfaceC15237i interfaceC15237i, boolean z4, C13821r1 c13821r1, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18777x = interfaceC28670t2;
            this.f18778y = interfaceC39171c;
            this.f18779z = interfaceC15237i;
            this.f18774E = z4;
            this.f18775F = c13821r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final float m14458h(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c) {
            return ((InterfaceC22940b2) interfaceC28670t2.getValue()).mo43079c(interfaceC39171c);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f18777x, this.f18778y, this.f18779z, this.f18774E, this.f18775F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18776w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C4637m(1, this.f18777x, this.f18778y));
                float f13 = 0.0f;
                c cVar = new c(new C13060l1(new C4631j1(f13, f13, 3, null), c13084s1M87240H, new a(null)));
                b bVar = new b(this.f18779z, this.f18774E, this.f18775F);
                this.f18776w = 1;
                if (cVar.collect(bVar, this) == enumC31071a) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m14392A(int i13) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m14393B() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final AiFeedbackType m14394C(InterfaceC28601c1 interfaceC28601c1) {
        return (AiFeedbackType) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m14395D(InterfaceC28601c1 interfaceC28601c1, AiFeedbackType aiFeedbackType) {
        interfaceC28601c1.setValue(aiFeedbackType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final boolean m14396E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m14397F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m14398G(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, p715kotlin.jvm.functions.Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            AbstractC22953f.m66714a(null, null, false, AbstractC37817c.m121344e(656531378, c28655q, new C4615e0(interfaceC28601c1, interfaceC28601c2, function1, interfaceC2994c0, c15199y3, 0)), c28655q, 3072, 7);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final C23454a0 m14399H(InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, p715kotlin.jvm.functions.Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC23004v BoxWithConstraints, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i13 & 6) == 0) {
            i14 = i13 | (((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2);
        } else {
            i14 = i13;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Modifier modifierM3413j = AbstractC1102d.m3413j(C2314t.f9131w, 0.0f, ((C1101c) BoxWithConstraints).m3402c() * 0.7f, 1);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3413j);
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
            String strM14419a0 = m14419a0(interfaceC28601c1);
            if (strM14419a0 == null) {
                c28655q.m87150e0(476430655);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(476430656);
                AiFeedbackType aiFeedbackTypeM14394C = m14394C(interfaceC28601c2);
                if (aiFeedbackTypeM14394C == null) {
                    c28655q.m87150e0(966741005);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(966741006);
                    boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g || objM87133R == C28635l.f115821a) {
                        C4663z c4663z = new C4663z(function1, interfaceC2994c0, c15199y3, interfaceC28601c1, 1);
                        c28655q.m87172p0(c4663z);
                        objM87133R = c4663z;
                    }
                    AbstractC15850e.m44733t(strM14419a0, aiFeedbackTypeM14394C, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m14400I(p715kotlin.jvm.functions.Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC28601c1 interfaceC28601c1, TurnFeedback feedback) {
        AbstractC22676k.m65750j(feedback, "feedback");
        function1.invoke(new AbstractC40624g.s(feedback, false, 2, null));
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, interfaceC28601c1, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m14401J(final C4642o0 c4642o0, final C40626i c40626i, final p715kotlin.jvm.functions.Function1 function1, boolean z4, boolean z13, p715kotlin.jvm.functions.Function1 function2, final C13821r1 c13821r1, final InterfaceC2994c0 interfaceC2994c0, final C15199y3 c15199y3, final C15199y3 c15199y4, final p715kotlin.jvm.functions.Function1 function3, final p715kotlin.jvm.functions.Function1 function4, final InterfaceC4339a interfaceC4339a, final InterfaceC28601c1 interfaceC28601c1, final InterfaceC28601c1 interfaceC28601c2, final boolean z14, final InterfaceC32647n2 interfaceC32647n2, final InterfaceC32666r1 interfaceC32666r1, final InterfaceC4339a interfaceC4339a2, final InterfaceC4352n interfaceC4352n, final InterfaceC4351m interfaceC4351m, final InterfaceC4351m interfaceC4351m2, final InterfaceC15250v interfaceC15250v, final InterfaceC4339a interfaceC4339a3, final EnumC32692x1 enumC32692x1, Composer composer, int i13) {
        C28655q c28655q;
        boolean z15;
        C28655q c28655q2 = (C28655q) composer;
        if (c28655q2.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC1092a.m3357b(AbstractC1102d.m3407d(1.0f, AbstractC1102d.m3409f(1.0f, c2314t)), C32655p0.f135412a.m102118b(), null, 0.0f, 6));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM66722k);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            C23016z c23016z = C23016z.f90757a;
            Modifier modifierMo3471e = AbstractC1099a.m3398t(c23016z.m66779c(c2314t, true, 1.0f), 0.0f, 14 * 4, 0.0f, 0.0f, 13).mo3471e(c4642o0.m14576u());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC21050i.m58879c().mo86977a(c40626i.getMarkdownStyles()), AbstractC40817h0.m132310c().mo86977a(c40626i.getMarkdownSpacing())}, AbstractC37817c.m121344e(1105036864, c28655q2, new InterfaceC4351m() { // from class: ch0.g0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    return Function1.m14402K(c40626i, c13821r1, c4642o0, interfaceC2994c0, c15199y3, c15199y4, function1, function3, function4, interfaceC4339a, interfaceC28601c1, interfaceC28601c2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), c28655q2, 56);
            AbstractC4646q0.m14593h(C1100b.f4583a, c4642o0, c28655q2, 6);
            c28655q2.m87173q(true);
            EnumC26811m enumC26811mM131835l = c40626i.getLoadingState();
            EnumC26811m enumC26811m = EnumC26811m.MESSAGE_ERROR;
            C28676v0 c28676v0 = C28635l.f115821a;
            if (enumC26811mM131835l == enumC26811m || c40626i.getLoadingState() == EnumC26811m.MESSAGE_FLAGGED) {
                c28655q2.m87150e0(538530607);
                EnumC26811m enumC26811mM131835l2 = c40626i.getLoadingState();
                boolean zM87157i = c28655q2.m87157i(c40626i) | c28655q2.m87153g(function1);
                Object objM87133R = c28655q2.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new C4606b0(c40626i, function1);
                    c28655q2.m87172p0(objM87133R);
                }
                AbstractC32667r2.m102247d(enumC26811mM131835l2, (InterfaceC4339a) objM87133R, c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(538800648);
                c28655q2.m87173q(false);
            }
            AbstractC1090b.m3350e(c23016z, c40626i.getFeedbackToastState().getShowFeedbackToast(), null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(1687013586, c28655q2, new C4624h0(c40626i, 0)), c28655q2, 1600518, 18);
            AbstractC1090b.m3350e(c23016z, c40626i.getAttachmentErrorToastState().getShowFeedbackToast(), null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(-1302450231, c28655q2, new C4624h0(c40626i, 1)), c28655q2, 1600518, 18);
            AbstractC1090b.m3350e(c23016z, c40626i.getSubmitErrorToastState().getShowFeedbackToast(), null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(774995530, c28655q2, new C4624h0(c40626i, 2)), c28655q2, 1600518, 18);
            List<String> listM131762f = (c40626i.getFormInputOnly() || z4) ? C25271y.f99162w : c40626i.getConversation().m131762f();
            final boolean z16 = (listM131762f.isEmpty() || z13) ? false : true;
            if (z16) {
                c28655q2.m87150e0(540836511);
                boolean zM87153g = c28655q2.m87153g(function2) | c28655q2.m87157i(listM131762f);
                Object objM87133R2 = c28655q2.m87133R();
                if (zM87153g || objM87133R2 == c28676v0) {
                    objM87133R2 = new e(function2, listM131762f, null);
                    c28655q2.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R2, listM131762f);
                C32684v1 c32684v1 = new C32684v1(listM131762f, c40626i.getSectionCount(), "");
                boolean zM87153g2 = c28655q2.m87153g(function1);
                Object objM87133R3 = c28655q2.m87133R();
                if (zM87153g2 || objM87133R3 == c28676v0) {
                    objM87133R3 = new C4659x(function1, 2);
                    c28655q2.m87172p0(objM87133R3);
                }
                AbstractC32680u1.m102425d(c32684v1, (p715kotlin.jvm.functions.Function1) objM87133R3, !z13, c28655q2, 0, 0);
                c28655q = c28655q2;
                z15 = false;
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                z15 = false;
                c28655q.m87150e0(541982984);
                c28655q.m87173q(false);
            }
            final boolean zM102116t = AbstractC32654p.m102116t(z13, c40626i.getDisableTextField(), null, null);
            C28655q c28655q3 = c28655q;
            AbstractC1090b.m3350e(c23016z, (c40626i.getFormInputOnly() || z4) ? z15 : true, null, AbstractC3788w0.m11576d(null, null, 15), AbstractC3788w0.m11584l(null, null, null, 15), null, AbstractC37817c.m121344e(-1442526005, c28655q3, new Function3() { // from class: ch0.i0
                @Override // p715kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return Function1.m14409R(z16, c40626i, zM102116t, z14, interfaceC32647n2, interfaceC32666r1, interfaceC4339a2, function1, interfaceC4352n, interfaceC4351m, interfaceC4351m2, interfaceC15250v, interfaceC4339a3, enumC32692x1, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue);
                }
            }), c28655q3, 1600518, 18);
            c28655q3.m87173q(true);
        } else {
            c28655q2.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m14402K(C40626i c40626i, C13821r1 c13821r1, C4642o0 c4642o0, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, C15199y3 c15199y4, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, InterfaceC4339a interfaceC4339a, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean enabled = c4642o0.getEnabled();
            InterfaceC30833a firstResponseRequester = c4642o0.getFirstResponseRequester();
            if (!c4642o0.getEnabled()) {
                firstResponseRequester = null;
            }
            InterfaceC30833a interfaceC30833a = firstResponseRequester;
            int iM14574r = c4642o0.m14574r();
            boolean zM87157i = c28655q.m87157i(c4642o0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new a(c4642o0);
                c28655q.m87172p0(objM87133R);
            }
            p715kotlin.jvm.functions.Function1 function4 = (p715kotlin.jvm.functions.Function1) ((InterfaceC21467g) objM87133R);
            boolean zM87157i2 = c28655q.m87157i(c4642o0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new b(c4642o0);
                c28655q.m87172p0(objM87133R2);
            }
            p715kotlin.jvm.functions.Function1 function5 = (p715kotlin.jvm.functions.Function1) ((InterfaceC21467g) objM87133R2);
            boolean zM87157i3 = c28655q.m87157i(c4642o0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new c(c4642o0);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) ((InterfaceC21467g) objM87133R3);
            boolean zM87157i4 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3) | c28655q.m87157i(c15199y4);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                C0556g c0556g = new C0556g(interfaceC2994c0, interfaceC28601c1, interfaceC28601c2, c15199y3, c15199y4, 2);
                c28655q.m87172p0(c0556g);
                objM87133R4 = c0556g;
            }
            AbstractC4609c0.m14284B(c40626i, c13821r1, 0.0f, false, enabled, interfaceC30833a, iM14574r, function4, null, function5, interfaceC4351m, null, (InterfaceC4351m) objM87133R4, function1, function2, function3, interfaceC4339a, c28655q, 0, 0, 2316);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C23454a0 m14403L(InterfaceC2994c0 interfaceC2994c0, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C15199y3 c15199y3, C15199y3 c15199y4, String turnId, AiFeedbackType clickedFeedbackType) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(clickedFeedbackType, "clickedFeedbackType");
        m14421b0(interfaceC28601c1, turnId);
        m14395D(interfaceC28601c2, clickedFeedbackType);
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new d(c15199y3, c15199y4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m14404M(C40626i c40626i, p715kotlin.jvm.functions.Function1 function1) {
        if (c40626i.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
            function1.invoke(new AbstractC40624g.n());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m14405N(C40626i c40626i, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC32661q1.m102241b(c40626i.getFeedbackToastState().getFeedbackToastColor(), c40626i.getFeedbackToastState().getFeedbackToastText(), c40626i.getFeedbackToastState().getFeedbackToastIcon(), composer, TextResource.$stable << 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m14406O(C40626i c40626i, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC32661q1.m102241b(c40626i.getAttachmentErrorToastState().getFeedbackToastColor(), c40626i.getAttachmentErrorToastState().getFeedbackToastText(), c40626i.getAttachmentErrorToastState().getFeedbackToastIcon(), composer, TextResource.$stable << 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m14407P(C40626i c40626i, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC32661q1.m102241b(c40626i.getSubmitErrorToastState().getFeedbackToastColor(), c40626i.getSubmitErrorToastState().getFeedbackToastText(), c40626i.getSubmitErrorToastState().getFeedbackToastIcon(), composer, TextResource.$stable << 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m14408Q(p715kotlin.jvm.functions.Function1 function1, AbstractC26802d event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC26802d.m) {
            AbstractC26802d.m mVar = (AbstractC26802d.m) event;
            function1.invoke(new AbstractC40624g.o(mVar.getUserQuestion(), mVar.getIndex(), mVar.getMessageCount()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m14409R(boolean z4, C40626i c40626i, boolean z13, boolean z14, InterfaceC32647n2 interfaceC32647n2, InterfaceC32666r1 interfaceC32666r1, InterfaceC4339a interfaceC4339a, p715kotlin.jvm.functions.Function1 function1, InterfaceC4352n interfaceC4352n, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC15250v interfaceC15250v, InterfaceC4339a interfaceC4339a2, EnumC32692x1 enumC32692x1, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        Modifier modifierM3398t = C2314t.f9131w;
        if (!z4) {
            modifierM3398t = AbstractC1099a.m3398t(modifierM3398t, 0.0f, 8 * 1, 0.0f, 0.0f, 13);
        }
        Modifier modifierM3599a = AbstractC1136a.m3599a(modifierM3398t, "ai_chat_input_row");
        int iM131842s = c40626i.getSendFieldIcon();
        boolean zM131843t = c40626i.getShowStopGenerating();
        boolean z15 = c40626i.getConversation().getCanStartNewConversation() && !c40626i.getFormInputOnly();
        EnumC26811m enumC26811mM131835l = c40626i.getLoadingState();
        List<C40628k> listM131827d = c40626i.m131827d();
        C28655q c28655q = (C28655q) composer;
        boolean zM87153g = c28655q.m87153g(function1);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87153g || objM87133R == c28676v0) {
            objM87133R = new C4647r(function1, 2);
            c28655q.m87172p0(objM87133R);
        }
        InterfaceC4339a interfaceC4339a3 = (InterfaceC4339a) objM87133R;
        Object objM87133R2 = c28655q.m87133R();
        if (objM87133R2 == c28676v0) {
            objM87133R2 = new C4139w0(5);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC32597d2.m101712u(iM131842s, z13, zM131843t, z15, z14, enumC26811mM131835l, interfaceC32647n2, interfaceC32666r1, modifierM3599a, interfaceC4339a, interfaceC4339a3, interfaceC4352n, null, null, null, listM131827d, interfaceC4351m, interfaceC4351m2, interfaceC15250v, (InterfaceC4351m) objM87133R2, interfaceC4339a2, enumC32692x1, c28655q, 0, 805306368, 0, 28672);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m14410S(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(AbstractC40624g.r.f175126a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m14411T(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m14412U(C40626i c40626i, boolean z4, InterfaceC15250v interfaceC15250v, p715kotlin.jvm.functions.Function1 function1, p715kotlin.jvm.functions.Function1 function2, InterfaceC4339a interfaceC4339a, InterfaceC32647n2 interfaceC32647n2, InterfaceC32666r1 interfaceC32666r1, boolean z13, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4352n interfaceC4352n, InterfaceC4339a interfaceC4339a2, p715kotlin.jvm.functions.Function1 function3, p715kotlin.jvm.functions.Function1 function4, C15199y3 c15199y3, C15199y3 c15199y4, boolean z14, InterfaceC15237i interfaceC15237i, InterfaceC4339a interfaceC4339a3, EnumC32692x1 enumC32692x1, boolean z15, int i13, int i14, int i15, int i16, Composer composer, int i17) throws Throwable {
        m14455z(c40626i, z4, interfaceC15250v, function1, function2, interfaceC4339a, interfaceC32647n2, interfaceC32666r1, z13, interfaceC4351m, interfaceC4351m2, interfaceC4352n, interfaceC4339a2, function3, function4, c15199y3, c15199y4, z14, interfaceC15237i, interfaceC4339a3, enumC32692x1, z15, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), AbstractC28683x.m87244L(i15), i16);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m14413V(C40626i c40626i, p715kotlin.jvm.functions.Function1 function1, String str, Uri uri) {
        Object next;
        AbstractC22676k.m65750j(uri, "uri");
        Iterator<T> it = c40626i.m131827d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C40628k) next).getUri(), uri));
        C40628k c40628k = (C40628k) next;
        if ((c40628k != null ? c40628k.getType() : null) == AttachmentType.IMAGE) {
            function1.invoke(new AbstractC40624g.m(str, uri));
        } else {
            function1.invoke(new AbstractC40624g.l(str, uri));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m14414W(p715kotlin.jvm.functions.Function1 function1, Uri uri, String displayName) {
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(displayName, "displayName");
        function1.invoke(new AbstractC40624g.v(AbstractC37056f.m118958J(uri), AbstractC37056f.m118958J(displayName), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m14415X(AbstractC39523b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m14416Y(AnalyticEventModel it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m14417Z() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a0 */
    private static final String m14419a0(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final void m14421b0(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m14423c0(C13821r1 scrollState, Composer composer, int i13) {
        int i14;
        C13821r1 c13821r1;
        AbstractC22676k.m65750j(scrollState, "scrollState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-172722949);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(scrollState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            WeakHashMap weakHashMap = C22944c2.f90553v;
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(C22949e.m66712e(c28655q).f90556c, c28655q);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.AICHAT_CONVERSATION_SCROLL_POSITIONING);
            boolean zM87153g = c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC39171c) | c28655q.m87157i(interfaceC15237i) | c28655q.m87155h(zIsFeatureEnabled) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                c13821r1 = scrollState;
                h hVar = new h(interfaceC28601c1M87238F, interfaceC39171c, interfaceC15237i, zIsFeatureEnabled, c13821r1, null);
                c28655q.m87172p0(hVar);
                objM87133R = hVar;
            } else {
                c13821r1 = scrollState;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
        } else {
            c13821r1 = scrollState;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(c13821r1, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m14425d0(C13821r1 c13821r1, int i13, Composer composer, int i14) {
        m14423c0(c13821r1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h0 */
    public static final InterfaceC4339a m14433h0(p715kotlin.jvm.functions.Function1 onViewEvent) {
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        return new C4647r(onViewEvent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m14435i0(p715kotlin.jvm.functions.Function1 function1) {
        function1.invoke(AbstractC40624g.q.f175125a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    public static final InterfaceC4352n m14437j0(final p715kotlin.jvm.functions.Function1 onViewEvent, final Clock clock) {
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(clock, "clock");
        return new InterfaceC4352n() { // from class: ch0.f0
            @Override // c93.InterfaceC4352n
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                return Function1.m14441l0(onViewEvent, clock, (String) obj, (List) obj2, (List) obj3, zBooleanValue);
            }
        };
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ InterfaceC4352n m14439k0(p715kotlin.jvm.functions.Function1 function1, Clock clock, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        return m14437j0(function1, clock);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final C23454a0 m14441l0(p715kotlin.jvm.functions.Function1 function1, Clock clock, String message, List list, List list2, boolean z4) {
        AbstractC22676k.m65750j(message, "message");
        function1.invoke(new AbstractC40624g.d(message, EnumC26800b.USER, list2, false, clock.millis(), false, 32, null));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:0x0168  */
    /* JADX WARN: Code duplicated, block: B:111:0x0170  */
    /* JADX WARN: Code duplicated, block: B:119:0x0186  */
    /* JADX WARN: Code duplicated, block: B:122:0x018c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:154:0x01ee A[PHI: r27
      0x01ee: PHI (r27v25 int) = (r27v0 int), (r27v5 int), (r27v6 int) binds: [B:153:0x01ec, B:163:0x0207, B:162:0x0204] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:155:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:159:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:162:0x0204  */
    /* JADX WARN: Code duplicated, block: B:163:0x0207  */
    /* JADX WARN: Code duplicated, block: B:166:0x020e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0211  */
    /* JADX WARN: Code duplicated, block: B:169:0x0215  */
    /* JADX WARN: Code duplicated, block: B:171:0x0219  */
    /* JADX WARN: Code duplicated, block: B:172:0x021e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0224  */
    /* JADX WARN: Code duplicated, block: B:175:0x0227  */
    /* JADX WARN: Code duplicated, block: B:179:0x022f  */
    /* JADX WARN: Code duplicated, block: B:180:0x0234  */
    /* JADX WARN: Code duplicated, block: B:182:0x023a  */
    /* JADX WARN: Code duplicated, block: B:184:0x0240  */
    /* JADX WARN: Code duplicated, block: B:188:0x0248  */
    /* JADX WARN: Code duplicated, block: B:190:0x024e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0259  */
    /* JADX WARN: Code duplicated, block: B:197:0x025f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0264  */
    /* JADX WARN: Code duplicated, block: B:200:0x026a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0270  */
    /* JADX WARN: Code duplicated, block: B:206:0x0278  */
    /* JADX WARN: Code duplicated, block: B:207:0x027b  */
    /* JADX WARN: Code duplicated, block: B:209:0x027f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:210:0x0281  */
    /* JADX WARN: Code duplicated, block: B:212:0x0286  */
    /* JADX WARN: Code duplicated, block: B:215:0x0291  */
    /* JADX WARN: Code duplicated, block: B:216:0x0293  */
    /* JADX WARN: Code duplicated, block: B:218:0x0297  */
    /* JADX WARN: Code duplicated, block: B:221:0x029d  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:226:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:231:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:237:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:240:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:242:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:261:0x0336  */
    /* JADX WARN: Code duplicated, block: B:262:0x0338  */
    /* JADX WARN: Code duplicated, block: B:264:0x033e  */
    /* JADX WARN: Code duplicated, block: B:267:0x034d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0353  */
    /* JADX WARN: Code duplicated, block: B:272:0x0361  */
    /* JADX WARN: Code duplicated, block: B:273:0x0363  */
    /* JADX WARN: Code duplicated, block: B:275:0x0367  */
    /* JADX WARN: Code duplicated, block: B:276:0x0369  */
    /* JADX WARN: Code duplicated, block: B:279:0x036f  */
    /* JADX WARN: Code duplicated, block: B:281:0x037d  */
    /* JADX WARN: Code duplicated, block: B:282:0x037f  */
    /* JADX WARN: Code duplicated, block: B:285:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x038a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0399  */
    /* JADX WARN: Code duplicated, block: B:291:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:293:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:294:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:297:0x03b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:300:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:303:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:305:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:308:0x03df  */
    /* JADX WARN: Code duplicated, block: B:309:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:312:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:314:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:315:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:317:0x0404  */
    /* JADX WARN: Code duplicated, block: B:319:0x040a  */
    /* JADX WARN: Code duplicated, block: B:321:0x0410  */
    /* JADX WARN: Code duplicated, block: B:323:0x041d  */
    /* JADX WARN: Code duplicated, block: B:325:0x0421  */
    /* JADX WARN: Code duplicated, block: B:326:0x0423  */
    /* JADX WARN: Code duplicated, block: B:328:0x0427  */
    /* JADX WARN: Code duplicated, block: B:329:0x042a  */
    /* JADX WARN: Code duplicated, block: B:331:0x042e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0431  */
    /* JADX WARN: Code duplicated, block: B:335:0x0439  */
    /* JADX WARN: Code duplicated, block: B:336:0x0447  */
    /* JADX WARN: Code duplicated, block: B:339:0x044f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0455  */
    /* JADX WARN: Code duplicated, block: B:342:0x0462  */
    /* JADX WARN: Code duplicated, block: B:344:0x0467  */
    /* JADX WARN: Code duplicated, block: B:346:0x046d  */
    /* JADX WARN: Code duplicated, block: B:347:0x0470  */
    /* JADX WARN: Code duplicated, block: B:350:0x0485  */
    /* JADX WARN: Code duplicated, block: B:352:0x0494  */
    /* JADX WARN: Code duplicated, block: B:355:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:359:0x04df  */
    /* JADX WARN: Code duplicated, block: B:362:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:363:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:366:0x0505  */
    /* JADX WARN: Code duplicated, block: B:369:0x051a  */
    /* JADX WARN: Code duplicated, block: B:372:0x052e  */
    /* JADX WARN: Code duplicated, block: B:373:0x0531  */
    /* JADX WARN: Code duplicated, block: B:376:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:377:0x0541  */
    /* JADX WARN: Code duplicated, block: B:379:0x066e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0699  */
    /* JADX WARN: Code duplicated, block: B:384:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:74:0x0103  */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:82:0x011f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0125  */
    /* JADX WARN: Code duplicated, block: B:85:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x014c  */
    /* JADX INFO: renamed from: z */
    public static final void m14455z(final C40626i viewState, final boolean z4, final InterfaceC15250v interfaceC15250v, final p715kotlin.jvm.functions.Function1 onViewEvent, p715kotlin.jvm.functions.Function1 function1, InterfaceC4339a interfaceC4339a, final InterfaceC32647n2 mediaPickerLauncher, InterfaceC32666r1 interfaceC32666r1, boolean z13, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, InterfaceC4352n interfaceC4352n, InterfaceC4339a interfaceC4339a2, p715kotlin.jvm.functions.Function1 function2, p715kotlin.jvm.functions.Function1 function3, C15199y3 c15199y3, C15199y3 c15199y4, boolean z14, InterfaceC15237i interfaceC15237i, InterfaceC4339a interfaceC4339a3, EnumC32692x1 enumC32692x1, boolean z15, Composer composer, final int i13, final int i14, final int i15, final int i16) throws Throwable {
        int i17;
        p715kotlin.jvm.functions.Function1 function4;
        int i18;
        int i19;
        InterfaceC4339a interfaceC4339a4;
        int i24;
        int i25;
        boolean zM87157i;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        boolean zM87157i2;
        int i46;
        boolean zM87157i3;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int iOrdinal;
        int i56;
        int i57;
        int i58;
        int i59;
        boolean z16;
        C28655q c28655q;
        final InterfaceC32666r1 interfaceC32666r2;
        final boolean z17;
        final InterfaceC4351m interfaceC4351m3;
        final InterfaceC4351m interfaceC4351m4;
        final InterfaceC4339a interfaceC4339a5;
        final p715kotlin.jvm.functions.Function1 function5;
        final C15199y3 c15199y5;
        final C15199y3 c15199y6;
        final boolean z18;
        final InterfaceC15237i interfaceC15237i2;
        final InterfaceC4339a interfaceC4339a6;
        final EnumC32692x1 enumC32692x2;
        final boolean z19;
        final p715kotlin.jvm.functions.Function1 function6;
        final InterfaceC4339a interfaceC4339a7;
        final InterfaceC4352n interfaceC4352n2;
        final p715kotlin.jvm.functions.Function1 function7;
        C28677v1 c28677v1M87180u;
        int i64;
        C28676v0 c28676v0;
        final InterfaceC32666r1 interfaceC32666r3;
        boolean z24;
        InterfaceC4351m interfaceC4351m5;
        InterfaceC4351m interfaceC4351m6;
        InterfaceC4352n interfaceC4352nM14439k0;
        int i65;
        InterfaceC4339a interfaceC4339aM14433h0;
        int i66;
        p715kotlin.jvm.functions.Function1 function8;
        p715kotlin.jvm.functions.Function1 function9;
        C15199y3 c15199y7;
        C15199y3 c15199y8;
        boolean z25;
        int i67;
        InterfaceC15237i interfaceC15237i3;
        InterfaceC15237i interfaceC15237i4;
        InterfaceC4339a interfaceC4339a8;
        EnumC32692x1 enumC32692x3;
        final InterfaceC4351m interfaceC4351m7;
        final InterfaceC4351m interfaceC4351m8;
        final p715kotlin.jvm.functions.Function1 function10;
        final InterfaceC4339a interfaceC4339a9;
        final EnumC32692x1 enumC32692x4;
        final InterfaceC4352n interfaceC4352n3;
        C15199y3 c15199y9;
        final InterfaceC4339a interfaceC4339a10;
        boolean z26;
        int i68;
        boolean z27;
        int i69;
        int i74;
        final InterfaceC4339a interfaceC4339a11;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        boolean z28;
        Object objM87133R4;
        boolean z29;
        boolean z34;
        Object objM87133R5;
        Object objM87133R6;
        Object objM87133R7;
        Object objM87133R8;
        C15199y3 c15199y3M3460c;
        Object objM87133R9;
        Object obj;
        C28655q c28655q2;
        Object objM87133R10;
        Object objM87133R11;
        InterfaceC28601c1 interfaceC28601c1;
        boolean z35;
        boolean zM87157i4;
        Object objM87133R12;
        boolean zM87157i5;
        int i75;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-445726026);
        if ((i13 & 6) == 0) {
            i17 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i17 = i13;
        }
        if ((i13 & 48) == 0) {
            i17 |= c28655q3.m87155h(z4) ? 32 : 16;
        }
        int i76 = 128;
        if ((i13 & 384) == 0) {
            i17 |= c28655q3.m87157i(interfaceC15250v) ? 256 : 128;
        }
        int i77 = i13 & 3072;
        int i78 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i77 == 0) {
            i17 |= c28655q3.m87157i(onViewEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : 1024;
        }
        int i79 = i16 & 16;
        int i83 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i79 == 0) {
            if ((i13 & 24576) == 0) {
                function4 = function1;
                i17 |= c28655q3.m87157i(function4) ? 16384 : 8192;
            }
            i18 = i16 & 32;
            i19 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
            if (i18 != 0) {
                i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a4 = interfaceC4339a;
            } else {
                interfaceC4339a4 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a4)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i17 |= i24;
                }
            }
            if ((i13 & 1572864) == 0) {
                if ((i13 & 2097152) == 0) {
                    zM87157i5 = c28655q3.m87153g(mediaPickerLauncher);
                } else {
                    zM87157i5 = c28655q3.m87157i(mediaPickerLauncher);
                }
                if (zM87157i5) {
                    i75 = 1048576;
                } else {
                    i75 = 524288;
                }
                i17 |= i75;
            }
            i25 = i16 & 128;
            if (i25 != 0) {
                i17 |= 12582912;
            } else if ((i13 & 12582912) == 0) {
                if ((i13 & 16777216) == 0) {
                    zM87157i = c28655q3.m87153g(interfaceC32666r1);
                } else {
                    zM87157i = c28655q3.m87157i(interfaceC32666r1);
                }
                if (zM87157i) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i17 |= i26;
            }
            i27 = i16 & 256;
            i28 = AndroidSDKConstants.FLAG_MUTABLE;
            if (i27 != 0) {
                i17 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i29 = 67108864;
                } else {
                    i29 = 33554432;
                }
                i17 |= i29;
            }
            if ((i13 & 805306368) != 0) {
                i17 |= ((i16 & 512) == 0 || !c28655q3.m87157i(interfaceC4351m)) ? 268435456 : 536870912;
            }
            if ((i14 & 6) == 0) {
                i34 = i14 | (((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q3.m87157i(interfaceC4351m2)) ? 2 : 4);
            } else {
                i34 = i14;
            }
            if ((i14 & 48) != 0) {
                i34 |= ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 || !c28655q3.m87157i(interfaceC4352n)) ? 16 : 32;
            }
            if ((i14 & 384) != 0) {
                if ((i16 & 4096) == 0 && c28655q3.m87157i(interfaceC4339a2)) {
                    i76 = 256;
                }
                i34 |= i76;
            }
            i35 = i34;
            i36 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i36 != 0) {
                i38 = i35 | 3072;
            } else {
                i37 = i35;
                if ((i14 & 3072) != 0) {
                    if (c28655q3.m87157i(function2)) {
                        i78 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i37 |= i78;
                }
                i38 = i37;
            }
            i39 = i16 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i39 != 0) {
                i44 = i38;
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87157i(function3)) {
                        i83 = 16384;
                    }
                    i44 |= i83;
                }
                i45 = i16 & 32768;
                if (i45 == 0) {
                    i44 |= i19;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                        zM87157i2 = c28655q3.m87153g(c15199y3);
                    } else {
                        zM87157i2 = c28655q3.m87157i(c15199y3);
                    }
                    if (zM87157i2) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i44 |= i19;
                }
                i46 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                if (i46 != 0) {
                    i44 |= 1572864;
                } else if ((i14 & 1572864) == 0) {
                    if ((i14 & 2097152) == 0) {
                        zM87157i3 = c28655q3.m87153g(c15199y4);
                    } else {
                        zM87157i3 = c28655q3.m87157i(c15199y4);
                    }
                    if (zM87157i3) {
                        i47 = 1048576;
                    } else {
                        i47 = 524288;
                    }
                    i44 |= i47;
                }
                i48 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                if (i48 != 0) {
                    i44 |= 12582912;
                } else if ((i14 & 12582912) == 0) {
                    i44 |= c28655q3.m87155h(z14) ? 8388608 : 4194304;
                }
                if ((i14 & 100663296) != 0) {
                    if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0 && c28655q3.m87157i(interfaceC15237i)) {
                        i28 = 67108864;
                    }
                    i44 |= i28;
                }
                i49 = i16 & 524288;
                if (i49 != 0) {
                    i44 |= 805306368;
                } else if ((i14 & 805306368) == 0) {
                    i44 |= c28655q3.m87157i(interfaceC4339a3) ? 536870912 : 268435456;
                }
                i54 = i16 & 1048576;
                if (i54 != 0) {
                    i55 = i15 | 6;
                } else if ((i15 & 6) == 0) {
                    if (enumC32692x1 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC32692x1.ordinal();
                    }
                    if (c28655q3.m87149e(iOrdinal)) {
                        i56 = 4;
                    } else {
                        i56 = 2;
                    }
                    i55 = i15 | i56;
                } else {
                    i55 = i15;
                }
                i57 = i16 & 2097152;
                if (i57 != 0) {
                    i55 |= 48;
                    i58 = i57;
                } else {
                    i58 = i57;
                    if ((i15 & 48) == 0) {
                        if (c28655q3.m87155h(z15)) {
                            i59 = 32;
                        } else {
                            i59 = 16;
                        }
                        i55 |= i59;
                    }
                }
                if ((i17 & 306783379) != 306783378 && (i44 & 306783379) == 306783378 && (i55 & 19) == 18) {
                    z16 = false;
                } else {
                    z16 = true;
                }
                if (c28655q3.m87135U(i17 & 1, z16)) {
                    c28655q3.m87140Z();
                    i64 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i64 != 0 || c28655q3.m87118C()) {
                        if (i79 != 0) {
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v0) {
                                objM87133R7 = new C4273a(23);
                                c28655q3.m87172p0(objM87133R7);
                            }
                            function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                        }
                        if (i18 != 0) {
                            objM87133R6 = c28655q3.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4387a(7);
                                c28655q3.m87172p0(objM87133R6);
                            }
                            interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                        }
                        if (i25 != 0) {
                            interfaceC32666r3 = null;
                        } else {
                            interfaceC32666r3 = interfaceC32666r1;
                        }
                        if (i27 != 0) {
                            z24 = false;
                        } else {
                            z24 = z13;
                        }
                        if ((i16 & 512) != 0) {
                            boolean zM87157i6 = c28655q3.m87157i(viewState);
                            if ((i17 & 7168) == 2048) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            z34 = zM87157i6 | z29;
                            objM87133R5 = c28655q3.m87133R();
                            if (z34 || objM87133R5 == c28676v0) {
                                objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                            i17 &= -1879048193;
                        } else {
                            interfaceC4351m5 = interfaceC4351m;
                        }
                        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            if ((i17 & 7168) == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objM87133R4 = c28655q3.m87133R();
                            if (z28 || objM87133R4 == c28676v0) {
                                objM87133R4 = new C4611d(onViewEvent, 1);
                                c28655q3.m87172p0(objM87133R4);
                            }
                            interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                            i44 &= -15;
                        } else {
                            interfaceC4351m6 = interfaceC4351m2;
                        }
                        InterfaceC4351m interfaceC4351m9 = interfaceC4351m6;
                        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                            i44 &= -113;
                        } else {
                            interfaceC4352nM14439k0 = interfaceC4352n;
                        }
                        i65 = i44;
                        if ((i16 & 4096) != 0) {
                            interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                            i65 &= -897;
                        } else {
                            interfaceC4339aM14433h0 = interfaceC4339a2;
                        }
                        i66 = i65;
                        if (i36 != 0) {
                            objM87133R3 = c28655q3.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(24);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                        } else {
                            interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                            function8 = function2;
                        }
                        if (i39 != 0) {
                            objM87133R2 = c28655q3.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(25);
                                c28655q3.m87172p0(objM87133R2);
                            }
                            function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                        } else {
                            function9 = function3;
                        }
                        if (i45 != 0) {
                            c15199y7 = null;
                        } else {
                            c15199y7 = c15199y3;
                        }
                        if (i46 != 0) {
                            c15199y8 = null;
                        } else {
                            c15199y8 = c15199y4;
                        }
                        if (i48 != 0) {
                            z25 = false;
                        } else {
                            z25 = z14;
                        }
                        p715kotlin.jvm.functions.Function1 function11 = function8;
                        if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                            i67 = i66 & (-234881025);
                        } else {
                            i67 = i66;
                            interfaceC15237i3 = interfaceC15237i;
                        }
                        interfaceC15237i4 = interfaceC15237i3;
                        if (i49 != 0) {
                            objM87133R = c28655q3.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4387a(8);
                                c28655q3.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        } else {
                            function9 = function9;
                            interfaceC4339a8 = interfaceC4339a3;
                        }
                        if (i54 != 0) {
                            enumC32692x3 = EnumC32692x1.NONE;
                        } else {
                            enumC32692x3 = enumC32692x1;
                        }
                        interfaceC4351m7 = interfaceC4351m5;
                        interfaceC4351m8 = interfaceC4351m9;
                        function10 = function11;
                        interfaceC4339a9 = interfaceC4339a8;
                        enumC32692x4 = enumC32692x3;
                        interfaceC4352n3 = interfaceC4352nM14439k0;
                        c15199y9 = c15199y7;
                        interfaceC4339a10 = interfaceC4339a4;
                        z26 = z25;
                        if (i58 != 0) {
                            z27 = false;
                            i68 = 1;
                        } else {
                            i68 = 1;
                            z27 = z15;
                        }
                        i69 = i17;
                        i74 = i67;
                        interfaceC4339a11 = interfaceC4339aM14433h0;
                    } else {
                        c28655q3.m87138X();
                        if ((i16 & 512) != 0) {
                            i17 &= -1879048193;
                        }
                        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            i44 &= -15;
                        }
                        if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                            i44 &= -113;
                        }
                        int i84 = i44;
                        if ((i16 & 4096) != 0) {
                            i84 &= -897;
                        }
                        if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                            i84 &= -234881025;
                        }
                        interfaceC32666r3 = interfaceC32666r1;
                        z24 = z13;
                        interfaceC4351m7 = interfaceC4351m;
                        interfaceC4351m8 = interfaceC4351m2;
                        interfaceC4352n3 = interfaceC4352n;
                        interfaceC4339a11 = interfaceC4339a2;
                        function10 = function2;
                        c15199y9 = c15199y3;
                        c15199y8 = c15199y4;
                        z26 = z14;
                        interfaceC15237i4 = interfaceC15237i;
                        interfaceC4339a9 = interfaceC4339a3;
                        enumC32692x4 = enumC32692x1;
                        z27 = z15;
                        interfaceC4339a10 = interfaceC4339a4;
                        i68 = 1;
                        i69 = i17;
                        i74 = i84;
                        function9 = function3;
                    }
                    c28655q3.m87175r();
                    final p715kotlin.jvm.functions.Function1 function12 = function9;
                    final boolean z36 = z27;
                    final C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q3, i68);
                    objM87133R8 = c28655q3.m87133R();
                    if (objM87133R8 == c28676v0) {
                        objM87133R8 = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    final InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) objM87133R8;
                    c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                    if (c15199y9 != null) {
                        c15199y3M3460c = c15199y9;
                    }
                    objM87133R9 = c28655q3.m87133R();
                    if (objM87133R9 == c28676v0) {
                        obj = null;
                        objM87133R9 = AbstractC28683x.m87272z(null);
                        c28655q2 = c28655q3;
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        obj = null;
                        c28655q2 = c28655q3;
                    }
                    final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R9;
                    objM87133R10 = c28655q2.m87133R();
                    if (objM87133R10 == c28676v0) {
                        objM87133R10 = AbstractC28683x.m87272z(obj);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R10;
                    m14423c0(c13821r1M92099U, c28655q2, 0);
                    objM87133R11 = c28655q2.m87133R();
                    if (objM87133R11 == c28676v0) {
                        objM87133R11 = AbstractC31061c.m95647w(z26, c28655q2);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R11;
                    Boolean boolValueOf = Boolean.valueOf(z26);
                    if ((i74 & 29360128) == 8388608) {
                        z35 = true;
                    } else {
                        z35 = false;
                    }
                    zM87157i4 = z35 | c28655q2.m87157i(interfaceC15237i4);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87157i4 || objM87133R12 == c28676v0) {
                        objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf);
                    C28655q c28655q4 = c28655q2;
                    final C4642o0 c4642o0M14604s = AbstractC4646q0.m14604s(viewState, z4, onViewEvent, c13821r1M92099U, z36, false, false, c28655q4, (i69 & 126) | ((i69 >> 3) & 896) | ((i55 << 9) & 57344), 96);
                    Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                    EnumC39333f enumC39333f = EnumC39333f.TRANSPARENT;
                    C35666g c35666g = new C35666g(AbstractC8693b.m21277k(AbstractC37336b.f159616E), null, null, null, null, 0.0f, 0.0f, 126, null);
                    AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y3M3460c);
                    final C15199y3 c15199y10 = c15199y3M3460c;
                    final boolean z37 = z24;
                    C37816b c37816bM121344e = AbstractC37817c.m121344e(-1503076792, c28655q4, new C4615e0(interfaceC28601c2, interfaceC28601c3, onViewEvent, interfaceC2994c0, c15199y10, 1));
                    boolean z38 = z26;
                    final p715kotlin.jvm.functions.Function1 function13 = function4;
                    final C15199y3 c15199y11 = c15199y8;
                    InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: ch0.k0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return Function1.m14401J(c4642o0M14604s, viewState, onViewEvent, z36, z4, function13, c13821r1M92099U, interfaceC2994c0, c15199y11, c15199y10, function10, function12, interfaceC4339a10, interfaceC28601c2, interfaceC28601c3, z37, mediaPickerLauncher, interfaceC32666r3, interfaceC4339a11, interfaceC4352n3, interfaceC4351m7, interfaceC4351m8, interfaceC15250v, interfaceC4339a9, enumC32692x4, (Composer) obj2, iIntValue);
                        }
                    };
                    p715kotlin.jvm.functions.Function1 function14 = function10;
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a10;
                    InterfaceC32666r1 interfaceC32666r4 = interfaceC32666r3;
                    EnumC32692x1 enumC32692x5 = enumC32692x4;
                    c28655q = c28655q4;
                    AbstractC35660d.m112871m(modifierM3407d, c35666g, aVar, enumC39333f, null, null, null, c37816bM121344e, false, null, null, null, false, null, AbstractC37817c.m121344e(-1969974524, c28655q4, interfaceC4351m10), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
                    interfaceC4351m3 = interfaceC4351m7;
                    interfaceC4351m4 = interfaceC4351m8;
                    interfaceC4352n2 = interfaceC4352n3;
                    function6 = function13;
                    interfaceC4339a5 = interfaceC4339a11;
                    function5 = function14;
                    function7 = function12;
                    c15199y5 = c15199y9;
                    z18 = z38;
                    interfaceC15237i2 = interfaceC15237i4;
                    c15199y6 = c15199y11;
                    interfaceC4339a6 = interfaceC4339a9;
                    enumC32692x2 = enumC32692x5;
                    z19 = z36;
                    interfaceC4339a7 = interfaceC4339a12;
                    interfaceC32666r2 = interfaceC32666r4;
                    z17 = z37;
                } else {
                    c28655q = c28655q3;
                    c28655q.m87138X();
                    interfaceC32666r2 = interfaceC32666r1;
                    z17 = z13;
                    interfaceC4351m3 = interfaceC4351m;
                    interfaceC4351m4 = interfaceC4351m2;
                    interfaceC4339a5 = interfaceC4339a2;
                    function5 = function2;
                    c15199y5 = c15199y3;
                    c15199y6 = c15199y4;
                    z18 = z14;
                    interfaceC15237i2 = interfaceC15237i;
                    interfaceC4339a6 = interfaceC4339a3;
                    enumC32692x2 = enumC32692x1;
                    z19 = z15;
                    function6 = function4;
                    interfaceC4339a7 = interfaceC4339a4;
                    interfaceC4352n2 = interfaceC4352n;
                    function7 = function3;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.l0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj2, Object obj3) {
                            int iIntValue = ((Integer) obj3).intValue();
                            return Function1.m14412U(viewState, z4, interfaceC15250v, onViewEvent, function6, interfaceC4339a7, mediaPickerLauncher, interfaceC32666r2, z17, interfaceC4351m3, interfaceC4351m4, interfaceC4352n2, interfaceC4339a5, function5, function7, c15199y5, c15199y6, z18, interfaceC15237i2, interfaceC4339a6, enumC32692x2, z19, i13, i14, i15, i16, (Composer) obj2, iIntValue);
                        }
                    };
                }
            }
            i44 = i38 | 24576;
            i45 = i16 & 32768;
            if (i45 == 0) {
                i44 |= i19;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i2 = c28655q3.m87153g(c15199y3);
                } else {
                    zM87157i2 = c28655q3.m87157i(c15199y3);
                }
                if (zM87157i2) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i44 |= i19;
            }
            i46 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i46 != 0) {
                i44 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zM87157i3 = c28655q3.m87153g(c15199y4);
                } else {
                    zM87157i3 = c28655q3.m87157i(c15199y4);
                }
                if (zM87157i3) {
                    i47 = 1048576;
                } else {
                    i47 = 524288;
                }
                i44 |= i47;
            }
            i48 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i48 != 0) {
                i44 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                i44 |= c28655q3.m87155h(z14) ? 8388608 : 4194304;
            }
            if ((i14 & 100663296) != 0) {
                if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i28 = 67108864;
                }
                i44 |= i28;
            }
            i49 = i16 & 524288;
            if (i49 != 0) {
                i44 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                i44 |= c28655q3.m87157i(interfaceC4339a3) ? 536870912 : 268435456;
            }
            i54 = i16 & 1048576;
            if (i54 != 0) {
                i55 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (enumC32692x1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC32692x1.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i56 = 4;
                } else {
                    i56 = 2;
                }
                i55 = i15 | i56;
            } else {
                i55 = i15;
            }
            i57 = i16 & 2097152;
            if (i57 != 0) {
                i55 |= 48;
                i58 = i57;
            } else {
                i58 = i57;
                if ((i15 & 48) == 0) {
                    if (c28655q3.m87155h(z15)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i55 |= i59;
                }
            }
            if ((i17 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q3.m87135U(i17 & 1, z16)) {
                c28655q3.m87140Z();
                i64 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i64 != 0) {
                    if (i79 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4273a(23);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4387a(7);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    }
                    if (i25 != 0) {
                        interfaceC32666r3 = null;
                    } else {
                        interfaceC32666r3 = interfaceC32666r1;
                    }
                    if (i27 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if ((i16 & 512) != 0) {
                        boolean zM87157i7 = c28655q3.m87157i(viewState);
                        if ((i17 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i7 | z29;
                        objM87133R5 = c28655q3.m87133R();
                        if (z34) {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                        i17 &= -1879048193;
                    } else {
                        interfaceC4351m5 = interfaceC4351m;
                    }
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        if ((i17 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z28) {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                        i44 &= -15;
                    } else {
                        interfaceC4351m6 = interfaceC4351m2;
                    }
                    InterfaceC4351m interfaceC4351m11 = interfaceC4351m6;
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                        i44 &= -113;
                    } else {
                        interfaceC4352nM14439k0 = interfaceC4352n;
                    }
                    i65 = i44;
                    if ((i16 & 4096) != 0) {
                        interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                        i65 &= -897;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339a2;
                    }
                    i66 = i65;
                    if (i36 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(24);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                        function8 = function2;
                    }
                    if (i39 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(25);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                    } else {
                        function9 = function3;
                    }
                    if (i45 != 0) {
                        c15199y7 = null;
                    } else {
                        c15199y7 = c15199y3;
                    }
                    if (i46 != 0) {
                        c15199y8 = null;
                    } else {
                        c15199y8 = c15199y4;
                    }
                    if (i48 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    p715kotlin.jvm.functions.Function1 function15 = function8;
                    if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        i67 = i66 & (-234881025);
                    } else {
                        i67 = i66;
                        interfaceC15237i3 = interfaceC15237i;
                    }
                    interfaceC15237i4 = interfaceC15237i3;
                    if (i49 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4387a(8);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        function9 = function9;
                        interfaceC4339a8 = interfaceC4339a3;
                    }
                    if (i54 != 0) {
                        enumC32692x3 = EnumC32692x1.NONE;
                    } else {
                        enumC32692x3 = enumC32692x1;
                    }
                    interfaceC4351m7 = interfaceC4351m5;
                    interfaceC4351m8 = interfaceC4351m11;
                    function10 = function15;
                    interfaceC4339a9 = interfaceC4339a8;
                    enumC32692x4 = enumC32692x3;
                    interfaceC4352n3 = interfaceC4352nM14439k0;
                    c15199y9 = c15199y7;
                    interfaceC4339a10 = interfaceC4339a4;
                    z26 = z25;
                    if (i58 != 0) {
                        z27 = false;
                        i68 = 1;
                    } else {
                        i68 = 1;
                        z27 = z15;
                    }
                    i69 = i17;
                    i74 = i67;
                    interfaceC4339a11 = interfaceC4339aM14433h0;
                } else {
                    if (i79 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4273a(23);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4387a(7);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    }
                    if (i25 != 0) {
                        interfaceC32666r3 = null;
                    } else {
                        interfaceC32666r3 = interfaceC32666r1;
                    }
                    if (i27 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if ((i16 & 512) != 0) {
                        boolean zM87157i8 = c28655q3.m87157i(viewState);
                        if ((i17 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i8 | z29;
                        objM87133R5 = c28655q3.m87133R();
                        if (z34) {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                        i17 &= -1879048193;
                    } else {
                        interfaceC4351m5 = interfaceC4351m;
                    }
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        if ((i17 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z28) {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                        i44 &= -15;
                    } else {
                        interfaceC4351m6 = interfaceC4351m2;
                    }
                    InterfaceC4351m interfaceC4351m12 = interfaceC4351m6;
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                        i44 &= -113;
                    } else {
                        interfaceC4352nM14439k0 = interfaceC4352n;
                    }
                    i65 = i44;
                    if ((i16 & 4096) != 0) {
                        interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                        i65 &= -897;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339a2;
                    }
                    i66 = i65;
                    if (i36 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(24);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                        function8 = function2;
                    }
                    if (i39 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(25);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                    } else {
                        function9 = function3;
                    }
                    if (i45 != 0) {
                        c15199y7 = null;
                    } else {
                        c15199y7 = c15199y3;
                    }
                    if (i46 != 0) {
                        c15199y8 = null;
                    } else {
                        c15199y8 = c15199y4;
                    }
                    if (i48 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    p715kotlin.jvm.functions.Function1 function16 = function8;
                    if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        i67 = i66 & (-234881025);
                    } else {
                        i67 = i66;
                        interfaceC15237i3 = interfaceC15237i;
                    }
                    interfaceC15237i4 = interfaceC15237i3;
                    if (i49 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4387a(8);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        function9 = function9;
                        interfaceC4339a8 = interfaceC4339a3;
                    }
                    if (i54 != 0) {
                        enumC32692x3 = EnumC32692x1.NONE;
                    } else {
                        enumC32692x3 = enumC32692x1;
                    }
                    interfaceC4351m7 = interfaceC4351m5;
                    interfaceC4351m8 = interfaceC4351m12;
                    function10 = function16;
                    interfaceC4339a9 = interfaceC4339a8;
                    enumC32692x4 = enumC32692x3;
                    interfaceC4352n3 = interfaceC4352nM14439k0;
                    c15199y9 = c15199y7;
                    interfaceC4339a10 = interfaceC4339a4;
                    z26 = z25;
                    if (i58 != 0) {
                        z27 = false;
                        i68 = 1;
                    } else {
                        i68 = 1;
                        z27 = z15;
                    }
                    i69 = i17;
                    i74 = i67;
                    interfaceC4339a11 = interfaceC4339aM14433h0;
                }
                c28655q3.m87175r();
                final p715kotlin.jvm.functions.Function1 function17 = function9;
                final boolean z39 = z27;
                final C13821r1 c13821r1M92099U2 = AbstractC30060g.m92099U(0, c28655q3, i68);
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R8);
                }
                final InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) objM87133R8;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                if (c15199y9 != null) {
                    c15199y3M3460c = c15199y9;
                }
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    obj = null;
                    objM87133R9 = AbstractC28683x.m87272z(null);
                    c28655q2 = c28655q3;
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    obj = null;
                    c28655q2 = c28655q3;
                }
                final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(obj);
                    c28655q2.m87172p0(objM87133R10);
                }
                final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R10;
                m14423c0(c13821r1M92099U2, c28655q2, 0);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC31061c.m95647w(z26, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R11;
                Boolean boolValueOf2 = Boolean.valueOf(z26);
                if ((i74 & 29360128) == 8388608) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i4 = z35 | c28655q2.m87157i(interfaceC15237i4);
                objM87133R12 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf2);
                C28655q c28655q5 = c28655q2;
                final C4642o0 c4642o0M14604s2 = AbstractC4646q0.m14604s(viewState, z4, onViewEvent, c13821r1M92099U2, z39, false, false, c28655q5, (i69 & 126) | ((i69 >> 3) & 896) | ((i55 << 9) & 57344), 96);
                Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                EnumC39333f enumC39333f2 = EnumC39333f.TRANSPARENT;
                C35666g c35666g2 = new C35666g(AbstractC8693b.m21277k(AbstractC37336b.f159616E), null, null, null, null, 0.0f, 0.0f, 126, null);
                AbstractC35664f.a aVar2 = new AbstractC35664f.a(c15199y3M3460c);
                final C15199y3 c15199y12 = c15199y3M3460c;
                final boolean z310 = z24;
                C37816b c37816bM121344e2 = AbstractC37817c.m121344e(-1503076792, c28655q5, new C4615e0(interfaceC28601c4, interfaceC28601c5, onViewEvent, interfaceC2994c1, c15199y12, 1));
                boolean z311 = z26;
                final p715kotlin.jvm.functions.Function1 function18 = function4;
                final C15199y3 c15199y13 = c15199y8;
                InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: ch0.k0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return Function1.m14401J(c4642o0M14604s2, viewState, onViewEvent, z39, z4, function18, c13821r1M92099U2, interfaceC2994c1, c15199y13, c15199y12, function10, function17, interfaceC4339a10, interfaceC28601c4, interfaceC28601c5, z310, mediaPickerLauncher, interfaceC32666r3, interfaceC4339a11, interfaceC4352n3, interfaceC4351m7, interfaceC4351m8, interfaceC15250v, interfaceC4339a9, enumC32692x4, (Composer) obj2, iIntValue);
                    }
                };
                p715kotlin.jvm.functions.Function1 function19 = function10;
                InterfaceC4339a interfaceC4339a13 = interfaceC4339a10;
                InterfaceC32666r1 interfaceC32666r5 = interfaceC32666r3;
                EnumC32692x1 enumC32692x6 = enumC32692x4;
                c28655q = c28655q5;
                AbstractC35660d.m112871m(modifierM3407d2, c35666g2, aVar2, enumC39333f2, null, null, null, c37816bM121344e2, false, null, null, null, false, null, AbstractC37817c.m121344e(-1969974524, c28655q5, interfaceC4351m13), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
                interfaceC4351m3 = interfaceC4351m7;
                interfaceC4351m4 = interfaceC4351m8;
                interfaceC4352n2 = interfaceC4352n3;
                function6 = function18;
                interfaceC4339a5 = interfaceC4339a11;
                function5 = function19;
                function7 = function17;
                c15199y5 = c15199y9;
                z18 = z311;
                interfaceC15237i2 = interfaceC15237i4;
                c15199y6 = c15199y13;
                interfaceC4339a6 = interfaceC4339a9;
                enumC32692x2 = enumC32692x6;
                z19 = z39;
                interfaceC4339a7 = interfaceC4339a13;
                interfaceC32666r2 = interfaceC32666r5;
                z17 = z310;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                interfaceC32666r2 = interfaceC32666r1;
                z17 = z13;
                interfaceC4351m3 = interfaceC4351m;
                interfaceC4351m4 = interfaceC4351m2;
                interfaceC4339a5 = interfaceC4339a2;
                function5 = function2;
                c15199y5 = c15199y3;
                c15199y6 = c15199y4;
                z18 = z14;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC4339a6 = interfaceC4339a3;
                enumC32692x2 = enumC32692x1;
                z19 = z15;
                function6 = function4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4352n2 = interfaceC4352n;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.l0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return Function1.m14412U(viewState, z4, interfaceC15250v, onViewEvent, function6, interfaceC4339a7, mediaPickerLauncher, interfaceC32666r2, z17, interfaceC4351m3, interfaceC4351m4, interfaceC4352n2, interfaceC4339a5, function5, function7, c15199y5, c15199y6, z18, interfaceC15237i2, interfaceC4339a6, enumC32692x2, z19, i13, i14, i15, i16, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i17 |= 24576;
        function4 = function1;
        i18 = i16 & 32;
        i19 = ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i18 != 0) {
            i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a4 = interfaceC4339a;
        } else {
            interfaceC4339a4 = interfaceC4339a;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a4)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i17 |= i24;
            }
        }
        if ((i13 & 1572864) == 0) {
            if ((i13 & 2097152) == 0) {
                zM87157i5 = c28655q3.m87153g(mediaPickerLauncher);
            } else {
                zM87157i5 = c28655q3.m87157i(mediaPickerLauncher);
            }
            if (zM87157i5) {
                i75 = 1048576;
            } else {
                i75 = 524288;
            }
            i17 |= i75;
        }
        i25 = i16 & 128;
        if (i25 != 0) {
            i17 |= 12582912;
        } else if ((i13 & 12582912) == 0) {
            if ((i13 & 16777216) == 0) {
                zM87157i = c28655q3.m87153g(interfaceC32666r1);
            } else {
                zM87157i = c28655q3.m87157i(interfaceC32666r1);
            }
            if (zM87157i) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i17 |= i26;
        }
        i27 = i16 & 256;
        i28 = AndroidSDKConstants.FLAG_MUTABLE;
        if (i27 != 0) {
            i17 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q3.m87155h(z13)) {
                i29 = 67108864;
            } else {
                i29 = 33554432;
            }
            i17 |= i29;
        }
        if ((i13 & 805306368) != 0) {
            i17 |= ((i16 & 512) == 0 || !c28655q3.m87157i(interfaceC4351m)) ? 268435456 : 536870912;
        }
        if ((i14 & 6) == 0) {
            i34 = i14 | (((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 || !c28655q3.m87157i(interfaceC4351m2)) ? 2 : 4);
        } else {
            i34 = i14;
        }
        if ((i14 & 48) != 0) {
            i34 |= ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 || !c28655q3.m87157i(interfaceC4352n)) ? 16 : 32;
        }
        if ((i14 & 384) != 0) {
            if ((i16 & 4096) == 0) {
                i76 = 256;
            }
            i34 |= i76;
        }
        i35 = i34;
        i36 = i16 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i36 != 0) {
            i38 = i35 | 3072;
        } else {
            i37 = i35;
            if ((i14 & 3072) != 0) {
                if (c28655q3.m87157i(function2)) {
                    i78 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i37 |= i78;
            }
            i38 = i37;
        }
        i39 = i16 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i39 != 0) {
            i44 = i38;
            if ((i14 & 24576) == 0) {
                if (c28655q3.m87157i(function3)) {
                    i83 = 16384;
                }
                i44 |= i83;
            }
            i45 = i16 & 32768;
            if (i45 == 0) {
                i44 |= i19;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    zM87157i2 = c28655q3.m87153g(c15199y3);
                } else {
                    zM87157i2 = c28655q3.m87157i(c15199y3);
                }
                if (zM87157i2) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i44 |= i19;
            }
            i46 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            if (i46 != 0) {
                i44 |= 1572864;
            } else if ((i14 & 1572864) == 0) {
                if ((i14 & 2097152) == 0) {
                    zM87157i3 = c28655q3.m87153g(c15199y4);
                } else {
                    zM87157i3 = c28655q3.m87157i(c15199y4);
                }
                if (zM87157i3) {
                    i47 = 1048576;
                } else {
                    i47 = 524288;
                }
                i44 |= i47;
            }
            i48 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            if (i48 != 0) {
                i44 |= 12582912;
            } else if ((i14 & 12582912) == 0) {
                i44 |= c28655q3.m87155h(z14) ? 8388608 : 4194304;
            }
            if ((i14 & 100663296) != 0) {
                if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                    i28 = 67108864;
                }
                i44 |= i28;
            }
            i49 = i16 & 524288;
            if (i49 != 0) {
                i44 |= 805306368;
            } else if ((i14 & 805306368) == 0) {
                i44 |= c28655q3.m87157i(interfaceC4339a3) ? 536870912 : 268435456;
            }
            i54 = i16 & 1048576;
            if (i54 != 0) {
                i55 = i15 | 6;
            } else if ((i15 & 6) == 0) {
                if (enumC32692x1 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC32692x1.ordinal();
                }
                if (c28655q3.m87149e(iOrdinal)) {
                    i56 = 4;
                } else {
                    i56 = 2;
                }
                i55 = i15 | i56;
            } else {
                i55 = i15;
            }
            i57 = i16 & 2097152;
            if (i57 != 0) {
                i55 |= 48;
                i58 = i57;
            } else {
                i58 = i57;
                if ((i15 & 48) == 0) {
                    if (c28655q3.m87155h(z15)) {
                        i59 = 32;
                    } else {
                        i59 = 16;
                    }
                    i55 |= i59;
                }
            }
            if ((i17 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = true;
            }
            if (c28655q3.m87135U(i17 & 1, z16)) {
                c28655q3.m87140Z();
                i64 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i64 != 0) {
                    if (i79 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4273a(23);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4387a(7);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    }
                    if (i25 != 0) {
                        interfaceC32666r3 = null;
                    } else {
                        interfaceC32666r3 = interfaceC32666r1;
                    }
                    if (i27 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if ((i16 & 512) != 0) {
                        boolean zM87157i9 = c28655q3.m87157i(viewState);
                        if ((i17 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i9 | z29;
                        objM87133R5 = c28655q3.m87133R();
                        if (z34) {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                        i17 &= -1879048193;
                    } else {
                        interfaceC4351m5 = interfaceC4351m;
                    }
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        if ((i17 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z28) {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                        i44 &= -15;
                    } else {
                        interfaceC4351m6 = interfaceC4351m2;
                    }
                    InterfaceC4351m interfaceC4351m14 = interfaceC4351m6;
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                        i44 &= -113;
                    } else {
                        interfaceC4352nM14439k0 = interfaceC4352n;
                    }
                    i65 = i44;
                    if ((i16 & 4096) != 0) {
                        interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                        i65 &= -897;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339a2;
                    }
                    i66 = i65;
                    if (i36 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(24);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                        function8 = function2;
                    }
                    if (i39 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(25);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                    } else {
                        function9 = function3;
                    }
                    if (i45 != 0) {
                        c15199y7 = null;
                    } else {
                        c15199y7 = c15199y3;
                    }
                    if (i46 != 0) {
                        c15199y8 = null;
                    } else {
                        c15199y8 = c15199y4;
                    }
                    if (i48 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    p715kotlin.jvm.functions.Function1 function110 = function8;
                    if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        i67 = i66 & (-234881025);
                    } else {
                        i67 = i66;
                        interfaceC15237i3 = interfaceC15237i;
                    }
                    interfaceC15237i4 = interfaceC15237i3;
                    if (i49 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4387a(8);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        function9 = function9;
                        interfaceC4339a8 = interfaceC4339a3;
                    }
                    if (i54 != 0) {
                        enumC32692x3 = EnumC32692x1.NONE;
                    } else {
                        enumC32692x3 = enumC32692x1;
                    }
                    interfaceC4351m7 = interfaceC4351m5;
                    interfaceC4351m8 = interfaceC4351m14;
                    function10 = function110;
                    interfaceC4339a9 = interfaceC4339a8;
                    enumC32692x4 = enumC32692x3;
                    interfaceC4352n3 = interfaceC4352nM14439k0;
                    c15199y9 = c15199y7;
                    interfaceC4339a10 = interfaceC4339a4;
                    z26 = z25;
                    if (i58 != 0) {
                        z27 = false;
                        i68 = 1;
                    } else {
                        i68 = 1;
                        z27 = z15;
                    }
                    i69 = i17;
                    i74 = i67;
                    interfaceC4339a11 = interfaceC4339aM14433h0;
                } else {
                    if (i79 != 0) {
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v0) {
                            objM87133R7 = new C4273a(23);
                            c28655q3.m87172p0(objM87133R7);
                        }
                        function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                    }
                    if (i18 != 0) {
                        objM87133R6 = c28655q3.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4387a(7);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                    }
                    if (i25 != 0) {
                        interfaceC32666r3 = null;
                    } else {
                        interfaceC32666r3 = interfaceC32666r1;
                    }
                    if (i27 != 0) {
                        z24 = false;
                    } else {
                        z24 = z13;
                    }
                    if ((i16 & 512) != 0) {
                        boolean zM87157i10 = c28655q3.m87157i(viewState);
                        if ((i17 & 7168) == 2048) {
                            z29 = true;
                        } else {
                            z29 = false;
                        }
                        z34 = zM87157i10 | z29;
                        objM87133R5 = c28655q3.m87133R();
                        if (z34) {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                        i17 &= -1879048193;
                    } else {
                        interfaceC4351m5 = interfaceC4351m;
                    }
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        if ((i17 & 7168) == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R4 = c28655q3.m87133R();
                        if (z28) {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new C4611d(onViewEvent, 1);
                            c28655q3.m87172p0(objM87133R4);
                        }
                        interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                        i44 &= -15;
                    } else {
                        interfaceC4351m6 = interfaceC4351m2;
                    }
                    InterfaceC4351m interfaceC4351m15 = interfaceC4351m6;
                    if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                        interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                        i44 &= -113;
                    } else {
                        interfaceC4352nM14439k0 = interfaceC4352n;
                    }
                    i65 = i44;
                    if ((i16 & 4096) != 0) {
                        interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                        i65 &= -897;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339a2;
                    }
                    i66 = i65;
                    if (i36 != 0) {
                        objM87133R3 = c28655q3.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(24);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                    } else {
                        interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                        function8 = function2;
                    }
                    if (i39 != 0) {
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(25);
                            c28655q3.m87172p0(objM87133R2);
                        }
                        function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                    } else {
                        function9 = function3;
                    }
                    if (i45 != 0) {
                        c15199y7 = null;
                    } else {
                        c15199y7 = c15199y3;
                    }
                    if (i46 != 0) {
                        c15199y8 = null;
                    } else {
                        c15199y8 = c15199y4;
                    }
                    if (i48 != 0) {
                        z25 = false;
                    } else {
                        z25 = z14;
                    }
                    p715kotlin.jvm.functions.Function1 function111 = function8;
                    if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                        interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        i67 = i66 & (-234881025);
                    } else {
                        i67 = i66;
                        interfaceC15237i3 = interfaceC15237i;
                    }
                    interfaceC15237i4 = interfaceC15237i3;
                    if (i49 != 0) {
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4387a(8);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        function9 = function9;
                        interfaceC4339a8 = interfaceC4339a3;
                    }
                    if (i54 != 0) {
                        enumC32692x3 = EnumC32692x1.NONE;
                    } else {
                        enumC32692x3 = enumC32692x1;
                    }
                    interfaceC4351m7 = interfaceC4351m5;
                    interfaceC4351m8 = interfaceC4351m15;
                    function10 = function111;
                    interfaceC4339a9 = interfaceC4339a8;
                    enumC32692x4 = enumC32692x3;
                    interfaceC4352n3 = interfaceC4352nM14439k0;
                    c15199y9 = c15199y7;
                    interfaceC4339a10 = interfaceC4339a4;
                    z26 = z25;
                    if (i58 != 0) {
                        z27 = false;
                        i68 = 1;
                    } else {
                        i68 = 1;
                        z27 = z15;
                    }
                    i69 = i17;
                    i74 = i67;
                    interfaceC4339a11 = interfaceC4339aM14433h0;
                }
                c28655q3.m87175r();
                final p715kotlin.jvm.functions.Function1 function112 = function9;
                final boolean z312 = z27;
                final C13821r1 c13821r1M92099U3 = AbstractC30060g.m92099U(0, c28655q3, i68);
                objM87133R8 = c28655q3.m87133R();
                if (objM87133R8 == c28676v0) {
                    objM87133R8 = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R8);
                }
                final InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) objM87133R8;
                c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                if (c15199y9 != null) {
                    c15199y3M3460c = c15199y9;
                }
                objM87133R9 = c28655q3.m87133R();
                if (objM87133R9 == c28676v0) {
                    obj = null;
                    objM87133R9 = AbstractC28683x.m87272z(null);
                    c28655q2 = c28655q3;
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    obj = null;
                    c28655q2 = c28655q3;
                }
                final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R9;
                objM87133R10 = c28655q2.m87133R();
                if (objM87133R10 == c28676v0) {
                    objM87133R10 = AbstractC28683x.m87272z(obj);
                    c28655q2.m87172p0(objM87133R10);
                }
                final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R10;
                m14423c0(c13821r1M92099U3, c28655q2, 0);
                objM87133R11 = c28655q2.m87133R();
                if (objM87133R11 == c28676v0) {
                    objM87133R11 = AbstractC31061c.m95647w(z26, c28655q2);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R11;
                Boolean boolValueOf3 = Boolean.valueOf(z26);
                if ((i74 & 29360128) == 8388608) {
                    z35 = true;
                } else {
                    z35 = false;
                }
                zM87157i4 = z35 | c28655q2.m87157i(interfaceC15237i4);
                objM87133R12 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf3);
                C28655q c28655q6 = c28655q2;
                final C4642o0 c4642o0M14604s3 = AbstractC4646q0.m14604s(viewState, z4, onViewEvent, c13821r1M92099U3, z312, false, false, c28655q6, (i69 & 126) | ((i69 >> 3) & 896) | ((i55 << 9) & 57344), 96);
                Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                EnumC39333f enumC39333f3 = EnumC39333f.TRANSPARENT;
                C35666g c35666g3 = new C35666g(AbstractC8693b.m21277k(AbstractC37336b.f159616E), null, null, null, null, 0.0f, 0.0f, 126, null);
                AbstractC35664f.a aVar3 = new AbstractC35664f.a(c15199y3M3460c);
                final C15199y3 c15199y14 = c15199y3M3460c;
                final boolean z313 = z24;
                C37816b c37816bM121344e3 = AbstractC37817c.m121344e(-1503076792, c28655q6, new C4615e0(interfaceC28601c6, interfaceC28601c7, onViewEvent, interfaceC2994c2, c15199y14, 1));
                boolean z314 = z26;
                final p715kotlin.jvm.functions.Function1 function113 = function4;
                final C15199y3 c15199y15 = c15199y8;
                InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: ch0.k0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return Function1.m14401J(c4642o0M14604s3, viewState, onViewEvent, z312, z4, function113, c13821r1M92099U3, interfaceC2994c2, c15199y15, c15199y14, function10, function112, interfaceC4339a10, interfaceC28601c6, interfaceC28601c7, z313, mediaPickerLauncher, interfaceC32666r3, interfaceC4339a11, interfaceC4352n3, interfaceC4351m7, interfaceC4351m8, interfaceC15250v, interfaceC4339a9, enumC32692x4, (Composer) obj2, iIntValue);
                    }
                };
                p715kotlin.jvm.functions.Function1 function114 = function10;
                InterfaceC4339a interfaceC4339a14 = interfaceC4339a10;
                InterfaceC32666r1 interfaceC32666r6 = interfaceC32666r3;
                EnumC32692x1 enumC32692x7 = enumC32692x4;
                c28655q = c28655q6;
                AbstractC35660d.m112871m(modifierM3407d3, c35666g3, aVar3, enumC39333f3, null, null, null, c37816bM121344e3, false, null, null, null, false, null, AbstractC37817c.m121344e(-1969974524, c28655q6, interfaceC4351m16), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
                interfaceC4351m3 = interfaceC4351m7;
                interfaceC4351m4 = interfaceC4351m8;
                interfaceC4352n2 = interfaceC4352n3;
                function6 = function113;
                interfaceC4339a5 = interfaceC4339a11;
                function5 = function114;
                function7 = function112;
                c15199y5 = c15199y9;
                z18 = z314;
                interfaceC15237i2 = interfaceC15237i4;
                c15199y6 = c15199y15;
                interfaceC4339a6 = interfaceC4339a9;
                enumC32692x2 = enumC32692x7;
                z19 = z312;
                interfaceC4339a7 = interfaceC4339a14;
                interfaceC32666r2 = interfaceC32666r6;
                z17 = z313;
            } else {
                c28655q = c28655q3;
                c28655q.m87138X();
                interfaceC32666r2 = interfaceC32666r1;
                z17 = z13;
                interfaceC4351m3 = interfaceC4351m;
                interfaceC4351m4 = interfaceC4351m2;
                interfaceC4339a5 = interfaceC4339a2;
                function5 = function2;
                c15199y5 = c15199y3;
                c15199y6 = c15199y4;
                z18 = z14;
                interfaceC15237i2 = interfaceC15237i;
                interfaceC4339a6 = interfaceC4339a3;
                enumC32692x2 = enumC32692x1;
                z19 = z15;
                function6 = function4;
                interfaceC4339a7 = interfaceC4339a4;
                interfaceC4352n2 = interfaceC4352n;
                function7 = function3;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.l0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj3).intValue();
                        return Function1.m14412U(viewState, z4, interfaceC15250v, onViewEvent, function6, interfaceC4339a7, mediaPickerLauncher, interfaceC32666r2, z17, interfaceC4351m3, interfaceC4351m4, interfaceC4352n2, interfaceC4339a5, function5, function7, c15199y5, c15199y6, z18, interfaceC15237i2, interfaceC4339a6, enumC32692x2, z19, i13, i14, i15, i16, (Composer) obj2, iIntValue);
                    }
                };
            }
        }
        i44 = i38 | 24576;
        i45 = i16 & 32768;
        if (i45 == 0) {
            i44 |= i19;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if ((i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                zM87157i2 = c28655q3.m87153g(c15199y3);
            } else {
                zM87157i2 = c28655q3.m87157i(c15199y3);
            }
            if (zM87157i2) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i44 |= i19;
        }
        i46 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        if (i46 != 0) {
            i44 |= 1572864;
        } else if ((i14 & 1572864) == 0) {
            if ((i14 & 2097152) == 0) {
                zM87157i3 = c28655q3.m87153g(c15199y4);
            } else {
                zM87157i3 = c28655q3.m87157i(c15199y4);
            }
            if (zM87157i3) {
                i47 = 1048576;
            } else {
                i47 = 524288;
            }
            i44 |= i47;
        }
        i48 = i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
        if (i48 != 0) {
            i44 |= 12582912;
        } else if ((i14 & 12582912) == 0) {
            i44 |= c28655q3.m87155h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) != 0) {
            if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0) {
                i28 = 67108864;
            }
            i44 |= i28;
        }
        i49 = i16 & 524288;
        if (i49 != 0) {
            i44 |= 805306368;
        } else if ((i14 & 805306368) == 0) {
            i44 |= c28655q3.m87157i(interfaceC4339a3) ? 536870912 : 268435456;
        }
        i54 = i16 & 1048576;
        if (i54 != 0) {
            i55 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            if (enumC32692x1 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC32692x1.ordinal();
            }
            if (c28655q3.m87149e(iOrdinal)) {
                i56 = 4;
            } else {
                i56 = 2;
            }
            i55 = i15 | i56;
        } else {
            i55 = i15;
        }
        i57 = i16 & 2097152;
        if (i57 != 0) {
            i55 |= 48;
            i58 = i57;
        } else {
            i58 = i57;
            if ((i15 & 48) == 0) {
                if (c28655q3.m87155h(z15)) {
                    i59 = 32;
                } else {
                    i59 = 16;
                }
                i55 |= i59;
            }
        }
        if ((i17 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = true;
        }
        if (c28655q3.m87135U(i17 & 1, z16)) {
            c28655q3.m87140Z();
            i64 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i64 != 0) {
                if (i79 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4273a(23);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4387a(7);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                }
                if (i25 != 0) {
                    interfaceC32666r3 = null;
                } else {
                    interfaceC32666r3 = interfaceC32666r1;
                }
                if (i27 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if ((i16 & 512) != 0) {
                    boolean zM87157i11 = c28655q3.m87157i(viewState);
                    if ((i17 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zM87157i11 | z29;
                    objM87133R5 = c28655q3.m87133R();
                    if (z34) {
                        objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                    i17 &= -1879048193;
                } else {
                    interfaceC4351m5 = interfaceC4351m;
                }
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    if ((i17 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z28) {
                        objM87133R4 = new C4611d(onViewEvent, 1);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C4611d(onViewEvent, 1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                    i44 &= -15;
                } else {
                    interfaceC4351m6 = interfaceC4351m2;
                }
                InterfaceC4351m interfaceC4351m17 = interfaceC4351m6;
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                    i44 &= -113;
                } else {
                    interfaceC4352nM14439k0 = interfaceC4352n;
                }
                i65 = i44;
                if ((i16 & 4096) != 0) {
                    interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                    i65 &= -897;
                } else {
                    interfaceC4339aM14433h0 = interfaceC4339a2;
                }
                i66 = i65;
                if (i36 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4273a(24);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                } else {
                    interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                    function8 = function2;
                }
                if (i39 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(25);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                } else {
                    function9 = function3;
                }
                if (i45 != 0) {
                    c15199y7 = null;
                } else {
                    c15199y7 = c15199y3;
                }
                if (i46 != 0) {
                    c15199y8 = null;
                } else {
                    c15199y8 = c15199y4;
                }
                if (i48 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                p715kotlin.jvm.functions.Function1 function115 = function8;
                if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                    interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    i67 = i66 & (-234881025);
                } else {
                    i67 = i66;
                    interfaceC15237i3 = interfaceC15237i;
                }
                interfaceC15237i4 = interfaceC15237i3;
                if (i49 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4387a(8);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    function9 = function9;
                    interfaceC4339a8 = interfaceC4339a3;
                }
                if (i54 != 0) {
                    enumC32692x3 = EnumC32692x1.NONE;
                } else {
                    enumC32692x3 = enumC32692x1;
                }
                interfaceC4351m7 = interfaceC4351m5;
                interfaceC4351m8 = interfaceC4351m17;
                function10 = function115;
                interfaceC4339a9 = interfaceC4339a8;
                enumC32692x4 = enumC32692x3;
                interfaceC4352n3 = interfaceC4352nM14439k0;
                c15199y9 = c15199y7;
                interfaceC4339a10 = interfaceC4339a4;
                z26 = z25;
                if (i58 != 0) {
                    z27 = false;
                    i68 = 1;
                } else {
                    i68 = 1;
                    z27 = z15;
                }
                i69 = i17;
                i74 = i67;
                interfaceC4339a11 = interfaceC4339aM14433h0;
            } else {
                if (i79 != 0) {
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v0) {
                        objM87133R7 = new C4273a(23);
                        c28655q3.m87172p0(objM87133R7);
                    }
                    function4 = (p715kotlin.jvm.functions.Function1) objM87133R7;
                }
                if (i18 != 0) {
                    objM87133R6 = c28655q3.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4387a(7);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R6;
                }
                if (i25 != 0) {
                    interfaceC32666r3 = null;
                } else {
                    interfaceC32666r3 = interfaceC32666r1;
                }
                if (i27 != 0) {
                    z24 = false;
                } else {
                    z24 = z13;
                }
                if ((i16 & 512) != 0) {
                    boolean zM87157i12 = c28655q3.m87157i(viewState);
                    if ((i17 & 7168) == 2048) {
                        z29 = true;
                    } else {
                        z29 = false;
                    }
                    z34 = zM87157i12 | z29;
                    objM87133R5 = c28655q3.m87133R();
                    if (z34) {
                        objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new C4630j0(0, viewState, onViewEvent);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    interfaceC4351m5 = (InterfaceC4351m) objM87133R5;
                    i17 &= -1879048193;
                } else {
                    interfaceC4351m5 = interfaceC4351m;
                }
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    if ((i17 & 7168) == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R4 = c28655q3.m87133R();
                    if (z28) {
                        objM87133R4 = new C4611d(onViewEvent, 1);
                        c28655q3.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new C4611d(onViewEvent, 1);
                        c28655q3.m87172p0(objM87133R4);
                    }
                    interfaceC4351m6 = (InterfaceC4351m) objM87133R4;
                    i44 &= -15;
                } else {
                    interfaceC4351m6 = interfaceC4351m2;
                }
                InterfaceC4351m interfaceC4351m18 = interfaceC4351m6;
                if ((i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
                    interfaceC4352nM14439k0 = m14439k0(onViewEvent, null, 2, null);
                    i44 &= -113;
                } else {
                    interfaceC4352nM14439k0 = interfaceC4352n;
                }
                i65 = i44;
                if ((i16 & 4096) != 0) {
                    interfaceC4339aM14433h0 = m14433h0(onViewEvent);
                    i65 &= -897;
                } else {
                    interfaceC4339aM14433h0 = interfaceC4339a2;
                }
                i66 = i65;
                if (i36 != 0) {
                    objM87133R3 = c28655q3.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4273a(24);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    function8 = (p715kotlin.jvm.functions.Function1) objM87133R3;
                } else {
                    interfaceC4339aM14433h0 = interfaceC4339aM14433h0;
                    function8 = function2;
                }
                if (i39 != 0) {
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(25);
                        c28655q3.m87172p0(objM87133R2);
                    }
                    function9 = (p715kotlin.jvm.functions.Function1) objM87133R2;
                } else {
                    function9 = function3;
                }
                if (i45 != 0) {
                    c15199y7 = null;
                } else {
                    c15199y7 = c15199y3;
                }
                if (i46 != 0) {
                    c15199y8 = null;
                } else {
                    c15199y8 = c15199y4;
                }
                if (i48 != 0) {
                    z25 = false;
                } else {
                    z25 = z14;
                }
                p715kotlin.jvm.functions.Function1 function116 = function8;
                if ((i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
                    interfaceC15237i3 = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    i67 = i66 & (-234881025);
                } else {
                    i67 = i66;
                    interfaceC15237i3 = interfaceC15237i;
                }
                interfaceC15237i4 = interfaceC15237i3;
                if (i49 != 0) {
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4387a(8);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    function9 = function9;
                    interfaceC4339a8 = interfaceC4339a3;
                }
                if (i54 != 0) {
                    enumC32692x3 = EnumC32692x1.NONE;
                } else {
                    enumC32692x3 = enumC32692x1;
                }
                interfaceC4351m7 = interfaceC4351m5;
                interfaceC4351m8 = interfaceC4351m18;
                function10 = function116;
                interfaceC4339a9 = interfaceC4339a8;
                enumC32692x4 = enumC32692x3;
                interfaceC4352n3 = interfaceC4352nM14439k0;
                c15199y9 = c15199y7;
                interfaceC4339a10 = interfaceC4339a4;
                z26 = z25;
                if (i58 != 0) {
                    z27 = false;
                    i68 = 1;
                } else {
                    i68 = 1;
                    z27 = z15;
                }
                i69 = i17;
                i74 = i67;
                interfaceC4339a11 = interfaceC4339aM14433h0;
            }
            c28655q3.m87175r();
            final p715kotlin.jvm.functions.Function1 function117 = function9;
            final boolean z315 = z27;
            final C13821r1 c13821r1M92099U4 = AbstractC30060g.m92099U(0, c28655q3, i68);
            objM87133R8 = c28655q3.m87133R();
            if (objM87133R8 == c28676v0) {
                objM87133R8 = AbstractC28683x.m87262p(c28655q3);
                c28655q3.m87172p0(objM87133R8);
            }
            final InterfaceC2994c0 interfaceC2994c3 = (InterfaceC2994c0) objM87133R8;
            c15199y3M3460c = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
            if (c15199y9 != null) {
                c15199y3M3460c = c15199y9;
            }
            objM87133R9 = c28655q3.m87133R();
            if (objM87133R9 == c28676v0) {
                obj = null;
                objM87133R9 = AbstractC28683x.m87272z(null);
                c28655q2 = c28655q3;
                c28655q2.m87172p0(objM87133R9);
            } else {
                obj = null;
                c28655q2 = c28655q3;
            }
            final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R9;
            objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = AbstractC28683x.m87272z(obj);
                c28655q2.m87172p0(objM87133R10);
            }
            final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R10;
            m14423c0(c13821r1M92099U4, c28655q2, 0);
            objM87133R11 = c28655q2.m87133R();
            if (objM87133R11 == c28676v0) {
                objM87133R11 = AbstractC31061c.m95647w(z26, c28655q2);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R11;
            Boolean boolValueOf4 = Boolean.valueOf(z26);
            if ((i74 & 29360128) == 8388608) {
                z35 = true;
            } else {
                z35 = false;
            }
            zM87157i4 = z35 | c28655q2.m87157i(interfaceC15237i4);
            objM87133R12 = c28655q2.m87133R();
            if (zM87157i4) {
                objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new f(z26, interfaceC15237i4, interfaceC28601c1, null);
                c28655q2.m87172p0(objM87133R12);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf4);
            C28655q c28655q7 = c28655q2;
            final C4642o0 c4642o0M14604s4 = AbstractC4646q0.m14604s(viewState, z4, onViewEvent, c13821r1M92099U4, z315, false, false, c28655q7, (i69 & 126) | ((i69 >> 3) & 896) | ((i55 << 9) & 57344), 96);
            Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            EnumC39333f enumC39333f4 = EnumC39333f.TRANSPARENT;
            C35666g c35666g4 = new C35666g(AbstractC8693b.m21277k(AbstractC37336b.f159616E), null, null, null, null, 0.0f, 0.0f, 126, null);
            AbstractC35664f.a aVar4 = new AbstractC35664f.a(c15199y3M3460c);
            final C15199y3 c15199y16 = c15199y3M3460c;
            final boolean z316 = z24;
            C37816b c37816bM121344e4 = AbstractC37817c.m121344e(-1503076792, c28655q7, new C4615e0(interfaceC28601c8, interfaceC28601c9, onViewEvent, interfaceC2994c3, c15199y16, 1));
            boolean z317 = z26;
            final p715kotlin.jvm.functions.Function1 function118 = function4;
            final C15199y3 c15199y17 = c15199y8;
            InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: ch0.k0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return Function1.m14401J(c4642o0M14604s4, viewState, onViewEvent, z315, z4, function118, c13821r1M92099U4, interfaceC2994c3, c15199y17, c15199y16, function10, function117, interfaceC4339a10, interfaceC28601c8, interfaceC28601c9, z316, mediaPickerLauncher, interfaceC32666r3, interfaceC4339a11, interfaceC4352n3, interfaceC4351m7, interfaceC4351m8, interfaceC15250v, interfaceC4339a9, enumC32692x4, (Composer) obj2, iIntValue);
                }
            };
            p715kotlin.jvm.functions.Function1 function119 = function10;
            InterfaceC4339a interfaceC4339a15 = interfaceC4339a10;
            InterfaceC32666r1 interfaceC32666r7 = interfaceC32666r3;
            EnumC32692x1 enumC32692x8 = enumC32692x4;
            c28655q = c28655q7;
            AbstractC35660d.m112871m(modifierM3407d4, c35666g4, aVar4, enumC39333f4, null, null, null, c37816bM121344e4, false, null, null, null, false, null, AbstractC37817c.m121344e(-1969974524, c28655q7, interfaceC4351m19), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6), 24576, 16240);
            interfaceC4351m3 = interfaceC4351m7;
            interfaceC4351m4 = interfaceC4351m8;
            interfaceC4352n2 = interfaceC4352n3;
            function6 = function118;
            interfaceC4339a5 = interfaceC4339a11;
            function5 = function119;
            function7 = function117;
            c15199y5 = c15199y9;
            z18 = z317;
            interfaceC15237i2 = interfaceC15237i4;
            c15199y6 = c15199y17;
            interfaceC4339a6 = interfaceC4339a9;
            enumC32692x2 = enumC32692x8;
            z19 = z315;
            interfaceC4339a7 = interfaceC4339a15;
            interfaceC32666r2 = interfaceC32666r7;
            z17 = z316;
        } else {
            c28655q = c28655q3;
            c28655q.m87138X();
            interfaceC32666r2 = interfaceC32666r1;
            z17 = z13;
            interfaceC4351m3 = interfaceC4351m;
            interfaceC4351m4 = interfaceC4351m2;
            interfaceC4339a5 = interfaceC4339a2;
            function5 = function2;
            c15199y5 = c15199y3;
            c15199y6 = c15199y4;
            z18 = z14;
            interfaceC15237i2 = interfaceC15237i;
            interfaceC4339a6 = interfaceC4339a3;
            enumC32692x2 = enumC32692x1;
            z19 = z15;
            function6 = function4;
            interfaceC4339a7 = interfaceC4339a4;
            interfaceC4352n2 = interfaceC4352n;
            function7 = function3;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.l0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return Function1.m14412U(viewState, z4, interfaceC15250v, onViewEvent, function6, interfaceC4339a7, mediaPickerLauncher, interfaceC32666r2, z17, interfaceC4351m3, interfaceC4351m4, interfaceC4352n2, interfaceC4339a5, function5, function7, c15199y5, c15199y6, z18, interfaceC15237i2, interfaceC4339a6, enumC32692x2, z19, i13, i14, i15, i16, (Composer) obj2, iIntValue);
                }
            };
        }
    }
}
