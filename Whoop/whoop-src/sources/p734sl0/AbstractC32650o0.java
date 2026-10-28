package p734sl0;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.design.util.TextResource;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import gb1.C15687o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26801c;
import nl0.C26804f;
import nl0.C26810l;
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
import p077d0.AbstractC11348f;
import p132f0.EnumC13840z0;
import p164g2.C15240l;
import p164g2.EnumC15251w;
import p164g2.InterfaceC15237i;
import p164g2.InterfaceC15250v;
import p180h0.AbstractC16444q3;
import p180h0.InterfaceC16413k2;
import p208i2.AbstractC17918w0;
import p238j0.InterfaceC21083i;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22944c2;
import p291l0.C22949e;
import p291l0.C23010x;
import p291l0.C23016z;
import p291l0.InterfaceC22940b2;
import p329n0.AbstractC26071x;
import p329n0.C26062o;
import p329n0.C26068u;
import p329n0.InterfaceC26054g;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p717lq2.C24678j;
import p745y81.InterfaceC39332e;
import q81.C30047e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import re1.C31314a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sc2.C32375n;
import sh2.C32513d;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import x81.C38072d;
import xk0.C38423a;

/* JADX INFO: renamed from: sl0.o0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a§\u0001\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\b\u001a\u00020\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\t2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\t2\u001a\b\u0002\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u000f*\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006\"²\u0006\u0010\u0010!\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnl0/f;", "viewState", "Lkotlin/Function2;", "", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "Ll83/a0;", "onFeedbackClicked", "Lsl0/n2;", "mediaPickerLauncher", "Lkotlin/Function1;", "Lnl0/d;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "Lxk0/a$a;", "", "keyboardEvent", "isFromWrapper", "Lkotlin/Function0;", "onDisabledInputTapped", "suppressAutoScroll", "q", "(Lnl0/f;Lc93/m;Lsl0/n2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;ZLc93/a;ZLandroidx/compose/runtime/Composer;II)V", "H", "(Lnl0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ln0/u;", "scrollState", "onClear", "J", "(Ln0/u;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "M", "(Ln0/u;)Z", "Lg2/v;", "focusState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32650o0 {

    /* JADX INFO: renamed from: sl0.o0$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$AiConversationScreenContent$6$1", m100430f = "AiConversationScreenContent.kt", m100431l = {74, 77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C26068u f135346E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC39171c f135347F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ Configuration f135348G;

        /* JADX INFO: renamed from: w */
        int f135349w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f135350x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ FeatureFlagChecker f135351y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C26804f f135352z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, FeatureFlagChecker featureFlagChecker, C26804f c26804f, C26068u c26068u, InterfaceC39171c interfaceC39171c, Configuration configuration, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135350x = z4;
            this.f135351y = featureFlagChecker;
            this.f135352z = c26804f;
            this.f135346E = c26068u;
            this.f135347F = interfaceC39171c;
            this.f135348G = configuration;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135350x, this.f135351y, this.f135352z, this.f135346E, this.f135347F, this.f135348G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, java.util.List] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135349w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f135350x && !this.f135351y.isFeatureEnabled("coach-message-streaming-android-v2") && (this.f135352z.getConversation().m79883f().size() > 2 || !this.f135352z.getConversation().m79884g().isEmpty())) {
                    InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(this.f135346E.m77565h().f103177k);
                    if (interfaceC26054g == null || ((C26062o) interfaceC26054g).f103184a != AbstractC37056f.m118951C(this.f135352z.getConversation().m79883f())) {
                        C26068u c26068u = this.f135346E;
                        int size = this.f135352z.getConversation().m79883f().size() - 1;
                        if (size < 0) {
                            size = 0;
                        }
                        this.f135349w = 1;
                        if (c26068u.m77563f(size, 0, this) != enumC31071a) {
                        }
                    }
                    return enumC31071a;
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (this.f135346E.mo39183d()) {
                C26068u c26068u2 = this.f135346E;
                float fMo743q0 = this.f135347F.mo743q0(this.f135348G.screenHeightDp);
                this.f135349w = 2;
                if (AbstractC16444q3.m46621c(c26068u2, fMo743q0, AbstractC11348f.m30573u(0.0f, 0.0f, 7, null), this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.o0$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$AiConversationScreenContent$7$1", m100430f = "AiConversationScreenContent.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f135353E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ boolean f135354F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ FeatureFlagChecker f135355G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C26068u f135356H;

        /* JADX INFO: renamed from: w */
        int f135357w;

        /* JADX INFO: renamed from: x */
        int f135358x;

        /* JADX INFO: renamed from: y */
        Object f135359y;

        /* JADX INFO: renamed from: z */
        Object f135360z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, FeatureFlagChecker featureFlagChecker, C26068u c26068u, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135354F = z4;
            this.f135355G = featureFlagChecker;
            this.f135356H = c26068u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f135354F, this.f135355G, this.f135356H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC26054g interfaceC26054g;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135353E;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f135354F && !this.f135355G.isFeatureEnabled("coach-message-streaming-android-v2")) {
                }
                return C23454a0.f92919a;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (!AbstractC32650o0.m102062M(this.f135356H) && this.f135356H.mo39183d()) {
                int i14 = this.f135356H.m77565h().f103180n - 1;
                if (i14 >= 0 && (interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(this.f135356H.m77565h().f103177k)) != null) {
                    C26068u c26068u = this.f135356H;
                    C26062o c26062o = (C26062o) interfaceC26054g;
                    int i15 = c26062o.f103199p + c26062o.f103198o;
                    this.f135359y = null;
                    this.f135360z = null;
                    this.f135357w = i14;
                    this.f135358x = 0;
                    this.f135353E = 1;
                    if (c26068u.m77563f(i14, i15, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.o0$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$AiConversationScreenContent$8$1", m100430f = "AiConversationScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135361w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f135362x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135362x = function1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f135362x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135361w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f135362x.invoke(AbstractC26802d.g.f106769a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.o0$d */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$HorizontalSuggestionsIfEnabled$1$1", m100430f = "AiConversationScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135363w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f135364x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C26804f f135365y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ List<String> f135366z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, C26804f c26804f, List<String> list, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135364x = function1;
            this.f135365y = c26804f;
            this.f135366z = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f135364x, this.f135365y, this.f135366z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135363w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f135364x.invoke(new AbstractC26802d.p(this.f135365y.getConversation().getId(), "wce-android-horizontal-scrolling", this.f135366z.size()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.o0$e */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$OnKeyboardOpenScrollHandler$1$1", m100430f = "AiConversationScreenContent.kt", m100431l = {270}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC4339a f135367E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC15237i f135368F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ C26068u f135369G;

        /* JADX INFO: renamed from: w */
        int f135370w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ FeatureFlagChecker f135371x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f135372y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC39171c f135373z;

        /* JADX INFO: renamed from: sl0.o0$e$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$OnKeyboardOpenScrollHandler$1$1$2", m100430f = "AiConversationScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lsl0/e2;", "state", "", "newValue", "<anonymous>", "(Lsl0/e2;F)Lsl0/e2;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: w */
            int f135374w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f135375x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ float f135376y;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            /* JADX INFO: renamed from: f */
            public final Object m102091f(C32602e2 c32602e2, float f13, InterfaceC30057d<? super C32602e2> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f135375x = c32602e2;
                aVar.f135376y = f13;
                return aVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // p715kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return m102091f((C32602e2) obj, ((Number) obj2).floatValue(), (InterfaceC30057d) obj3);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C32602e2 c32602e2 = (C32602e2) this.f135375x;
                float f13 = this.f135376y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f135374w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return new C32602e2(f13, c32602e2.getCurrent());
            }
        }

        /* JADX INFO: renamed from: sl0.o0$e$b */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC4339a f135377w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC15237i f135378x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C26068u f135379y;

            /* JADX INFO: renamed from: sl0.o0$e$b$a */
            @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$OnKeyboardOpenScrollHandler$1$1$4$1", m100430f = "AiConversationScreenContent.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lh0/k2;", "Ll83/a0;", "<anonymous>", "(Lh0/k2;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f135380w;

                /* JADX INFO: renamed from: x */
                private /* synthetic */ Object f135381x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ float f135382y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(float f13, InterfaceC30057d<? super a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f135382y = f13;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    a aVar = new a(this.f135382y, interfaceC30057d);
                    aVar.f135381x = obj;
                    return aVar;
                }

                @Override // c93.InterfaceC4351m
                /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC16413k2 interfaceC16413k2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((a) create(interfaceC16413k2, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    InterfaceC16413k2 interfaceC16413k2 = (InterfaceC16413k2) this.f135381x;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    if (this.f135380w != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    interfaceC16413k2.mo29373a(this.f135382y);
                    return C23454a0.f92919a;
                }
            }

            public b(InterfaceC4339a interfaceC4339a, InterfaceC15237i interfaceC15237i, C26068u c26068u) {
                this.f135377w = interfaceC4339a;
                this.f135378x = interfaceC15237i;
                this.f135379y = c26068u;
            }

            /* JADX INFO: renamed from: b */
            public final Object m102092b(float f13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                if (f13 < -50.0f) {
                    this.f135377w.invoke();
                    ((C15240l) this.f135378x).m43339b(false);
                }
                Object objMo9764a = this.f135379y.mo9764a(EnumC13840z0.f49374w, new a(f13, null), interfaceC30057d);
                return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m102092b(((Number) obj).floatValue(), interfaceC30057d);
            }
        }

        /* JADX INFO: renamed from: sl0.o0$e$c */
        @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c implements InterfaceC13058l {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13058l f135383w;

            /* JADX INFO: renamed from: sl0.o0$e$c$a */
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class a<T> implements InterfaceC13062m {

                /* JADX INFO: renamed from: w */
                final /* synthetic */ InterfaceC13062m f135384w;

                /* JADX INFO: renamed from: sl0.o0$e$c$a$a, reason: collision with other inner class name */
                @InterfaceC32271e(m100429c = "com.whoop.bot.view.AiConversationScreenContentKt$OnKeyboardOpenScrollHandler$1$1$invokeSuspend$$inlined$map$1$2", m100430f = "AiConversationScreenContent.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                public static final class C42324a extends AbstractC32269c {

                    /* JADX INFO: renamed from: E */
                    Object f135385E;

                    /* JADX INFO: renamed from: F */
                    Object f135386F;

                    /* JADX INFO: renamed from: G */
                    Object f135387G;

                    /* JADX INFO: renamed from: H */
                    int f135388H;

                    /* JADX INFO: renamed from: w */
                    /* synthetic */ Object f135389w;

                    /* JADX INFO: renamed from: x */
                    int f135390x;

                    /* JADX INFO: renamed from: y */
                    Object f135391y;

                    public C42324a(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.f135389w = obj;
                        this.f135390x |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC13062m interfaceC13062m) {
                    this.f135384w = interfaceC13062m;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    C42324a c42324a;
                    if (interfaceC30057d instanceof C42324a) {
                        c42324a = (C42324a) interfaceC30057d;
                        int i13 = c42324a.f135390x;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            c42324a.f135390x = i13 - Integer.MIN_VALUE;
                        } else {
                            c42324a = new C42324a(interfaceC30057d);
                        }
                    } else {
                        c42324a = new C42324a(interfaceC30057d);
                    }
                    Object obj2 = c42324a.f135389w;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = c42324a.f135390x;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.f135384w;
                        C32602e2 c32602e2 = (C32602e2) obj;
                        Float f13 = new Float(c32602e2.getCurrent() - c32602e2.getPrevious());
                        c42324a.f135391y = null;
                        c42324a.f135385E = null;
                        c42324a.f135386F = null;
                        c42324a.f135387G = null;
                        c42324a.f135388H = 0;
                        c42324a.f135390x = 1;
                        if (interfaceC13062m.emit(f13, c42324a) == enumC31071a) {
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
                this.f135383w = interfaceC13058l;
            }

            @Override // ec3.InterfaceC13058l
            public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = this.f135383w.collect(new a(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(FeatureFlagChecker featureFlagChecker, InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c, InterfaceC4339a interfaceC4339a, InterfaceC15237i interfaceC15237i, C26068u c26068u, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135371x = featureFlagChecker;
            this.f135372y = interfaceC28670t2;
            this.f135373z = interfaceC39171c;
            this.f135367E = interfaceC4339a;
            this.f135368F = interfaceC15237i;
            this.f135369G = c26068u;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final float m102090h(InterfaceC28670t2 interfaceC28670t2, InterfaceC39171c interfaceC39171c) {
            return ((InterfaceC22940b2) interfaceC28670t2.getValue()).mo43079c(interfaceC39171c);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f135371x, this.f135372y, this.f135373z, this.f135367E, this.f135368F, this.f135369G, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f135370w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f135371x.isFeatureEnabled("coach-message-streaming-android-v2")) {
                    C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C32580a0(1, this.f135372y, this.f135373z));
                    float f13 = 0.0f;
                    c cVar = new c(new C13060l1(new C32602e2(f13, f13, 3, null), c13084s1M87240H, new a(null)));
                    b bVar = new b(this.f135367E, this.f135368F, this.f135369G);
                    this.f135370w = 1;
                    if (cVar.collect(bVar, this) == enumC31071a) {
                        return enumC31071a;
                    }
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
    public static final C23454a0 m102050A(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v it) {
        AbstractC22676k.m65750j(it, "it");
        m102055F(interfaceC28601c1, it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m102051B(C26804f c26804f, InterfaceC4351m interfaceC4351m, InterfaceC32647n2 interfaceC32647n2, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m2, boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, int i13, int i14, Composer composer, int i15) {
        m102079q(c26804f, interfaceC4351m, interfaceC32647n2, function1, function2, interfaceC4351m2, z4, interfaceC4339a, z13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m102052C(C38423a.a aVar, boolean z4) {
        AbstractC22676k.m65750j(aVar, "<unused var>");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m102053D() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final InterfaceC15250v m102054E(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC15250v) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: F */
    private static final void m102055F(InterfaceC28601c1 interfaceC28601c1, InterfaceC15250v interfaceC15250v) {
        interfaceC28601c1.setValue(interfaceC15250v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m102056G(InterfaceC4351m interfaceC4351m, InterfaceC28601c1 interfaceC28601c1) {
        InterfaceC15250v interfaceC15250vM102054E = m102054E(interfaceC28601c1);
        if (interfaceC15250vM102054E != null && ((EnumC15251w) interfaceC15250vM102054E).m43353a()) {
            interfaceC4351m.invoke(C38423a.a.CLOSE, Boolean.TRUE);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    public static final void m102057H(C26804f viewState, Function1 onViewEvent, Composer composer, int i13) {
        int i14;
        Function1 function1;
        C26801c c26801cPrevious;
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(660082767);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("wce-android-horizontal-scrolling");
            List<C26801c> listM79883f = viewState.getConversation().m79883f();
            ListIterator<C26801c> listIterator = listM79883f.listIterator(listM79883f.size());
            do {
                if (!listIterator.hasPrevious()) {
                    c26801cPrevious = null;
                    break;
                }
                c26801cPrevious = listIterator.previous();
            } while (c26801cPrevious.getRole() != EnumC26800b.ASSISTANT);
            C26801c c26801c = c26801cPrevious;
            boolean z4 = c26801c != null && c26801c.getIsComplete();
            List<String> listM79884g = viewState.getConversation().m79884g();
            if (!zIsFeatureEnabled || listM79884g.isEmpty() || viewState.getConversation().m79883f().isEmpty() || !z4 || viewState.getLoadingState() == EnumC26811m.MESSAGE_LOADING || viewState.getIsWceLoading()) {
                function1 = onViewEvent;
                c28655q.m87150e0(-2127994125);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2128755237);
                int i16 = i14 & 112;
                boolean zM87157i = (i16 == 32) | c28655q.m87157i(viewState) | c28655q.m87157i(listM79884g);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new d(onViewEvent, viewState, listM79884g, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, listM79884g);
                List<C26801c> listM79883f2 = viewState.getConversation().m79883f();
                if ((listM79883f2 instanceof Collection) && listM79883f2.isEmpty()) {
                    i15 = 0;
                } else {
                    Iterator<T> it = listM79883f2.iterator();
                    i15 = 0;
                    while (it.hasNext()) {
                        if (((C26801c) it.next()).getRole() == EnumC26800b.USER && (i15 = i15 + 1) < 0) {
                            AbstractC37056f.m118976c0();
                            throw null;
                        }
                    }
                }
                function1 = onViewEvent;
                AbstractC32680u1.m102425d(new C32684v1(listM79884g, i15, viewState.getConversation().getId()), function1, true ^ viewState.getIsWceLoading(), c28655q, i16, 0);
                c28655q.m87173q(false);
            }
        } else {
            function1 = onViewEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30047e(viewState, function1, i13, 27);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m102058I(C26804f c26804f, Function1 function1, int i13, Composer composer, int i14) {
        m102057H(c26804f, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: J */
    private static final void m102059J(C26068u c26068u, InterfaceC4339a interfaceC4339a, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1705915620);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c26068u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(interfaceC4339a) ? 32 : 16;
        }
        int i15 = 1;
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            WeakHashMap weakHashMap = C22944c2.f90553v;
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(C22949e.m66712e(c28655q).f90556c, c28655q);
            InterfaceC15237i interfaceC15237i = (InterfaceC15237i) c28655q.m87161k(AbstractC2453v1.f9570i);
            InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
            FeatureFlagChecker featureFlagChecker = (FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p());
            boolean zM87157i = ((i14 & 112) == 32) | c28655q.m87157i(featureFlagChecker) | c28655q.m87153g(interfaceC28601c1M87238F) | c28655q.m87153g(interfaceC39171c) | c28655q.m87157i(interfaceC15237i) | ((i14 & 14) == 4);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                e eVar = new e(featureFlagChecker, interfaceC28601c1M87238F, interfaceC39171c, interfaceC4339a, interfaceC15237i, c26068u, null);
                c28655q.m87172p0(eVar);
                objM87133R = eVar;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C15687o(c26068u, interfaceC4339a, i13, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m102060K(C26068u c26068u, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m102059J(c26068u, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: M */
    public static final boolean m102062M(C26068u c26068u) {
        InterfaceC26054g interfaceC26054g = (InterfaceC26054g) AbstractC25265s.m74114R0(c26068u.m77565h().f103177k);
        if (interfaceC26054g == null) {
            return true;
        }
        C26062o c26062o = (C26062o) interfaceC26054g;
        return c26062o.f103199p + c26062o.f103198o <= c26068u.m77565h().f103179m;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x0158  */
    /* JADX WARN: Code duplicated, block: B:111:0x015c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:115:0x016f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0176  */
    /* JADX WARN: Code duplicated, block: B:121:0x017c  */
    /* JADX WARN: Code duplicated, block: B:124:0x018d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0192  */
    /* JADX WARN: Code duplicated, block: B:127:0x0194  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:144:0x0224  */
    /* JADX WARN: Code duplicated, block: B:145:0x0227  */
    /* JADX WARN: Code duplicated, block: B:148:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:149:0x024f  */
    /* JADX WARN: Code duplicated, block: B:154:0x029b  */
    /* JADX WARN: Code duplicated, block: B:155:0x029d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:159:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:172:0x030c  */
    /* JADX WARN: Code duplicated, block: B:175:0x031e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0320  */
    /* JADX WARN: Code duplicated, block: B:179:0x0364  */
    /* JADX WARN: Code duplicated, block: B:180:0x0368  */
    /* JADX WARN: Code duplicated, block: B:183:0x037b  */
    /* JADX WARN: Code duplicated, block: B:185:0x0389  */
    /* JADX WARN: Code duplicated, block: B:188:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:193:0x042b  */
    /* JADX WARN: Code duplicated, block: B:195:0x043a  */
    /* JADX WARN: Code duplicated, block: B:196:0x043c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0445  */
    /* JADX WARN: Code duplicated, block: B:204:0x044c  */
    /* JADX WARN: Code duplicated, block: B:206:0x0450  */
    /* JADX WARN: Code duplicated, block: B:209:0x045a  */
    /* JADX WARN: Code duplicated, block: B:214:0x046f  */
    /* JADX WARN: Code duplicated, block: B:217:0x0478  */
    /* JADX WARN: Code duplicated, block: B:220:0x048b  */
    /* JADX WARN: Code duplicated, block: B:222:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:226:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:229:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:231:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:234:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:237:0x04df  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:244:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:246:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:249:0x0509  */
    /* JADX WARN: Code duplicated, block: B:252:0x0513  */
    /* JADX WARN: Code duplicated, block: B:256:0x0525  */
    /* JADX WARN: Code duplicated, block: B:259:0x053b  */
    /* JADX WARN: Code duplicated, block: B:260:0x053d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0549 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:264:0x054b  */
    /* JADX WARN: Code duplicated, block: B:267:0x055a  */
    /* JADX WARN: Code duplicated, block: B:268:0x055c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:272:0x0565  */
    /* JADX WARN: Code duplicated, block: B:275:0x057a  */
    /* JADX WARN: Code duplicated, block: B:276:0x057c  */
    /* JADX WARN: Code duplicated, block: B:279:0x058b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:280:0x058d  */
    /* JADX WARN: Code duplicated, block: B:283:0x059c  */
    /* JADX WARN: Code duplicated, block: B:284:0x059e  */
    /* JADX WARN: Code duplicated, block: B:287:0x05a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:288:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:291:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:292:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:295:0x05bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:299:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:300:0x0600  */
    /* JADX WARN: Code duplicated, block: B:303:0x0649  */
    /* JADX WARN: Code duplicated, block: B:305:0x0668  */
    /* JADX WARN: Code duplicated, block: B:308:0x067c  */
    /* JADX WARN: Code duplicated, block: B:310:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0507 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x051f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:? A[LOOP:1: B:250:0x050d->B:317:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x04d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:319:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:? A[LOOP:2: B:235:0x04d9->B:320:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: q */
    public static final void m102079q(C26804f viewState, InterfaceC4351m onFeedbackClicked, InterfaceC32647n2 mediaPickerLauncher, Function1 function1, Function1 function2, InterfaceC4351m interfaceC4351m, boolean z4, InterfaceC4339a interfaceC4339a, boolean z13, Composer composer, int i13, int i14) {
        int i15;
        Function1 function3;
        int i16;
        Function1 function4;
        int i17;
        int i18;
        int i19;
        int i24;
        boolean z14;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        boolean z15;
        InterfaceC4351m interfaceC4351m2;
        InterfaceC4339a interfaceC4339a2;
        boolean z16;
        Function1 function5;
        C28655q c28655q;
        boolean z17;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        Function1 function6;
        InterfaceC4351m interfaceC4351m3;
        InterfaceC4339a interfaceC4339a3;
        boolean z18;
        Configuration configuration;
        InterfaceC39171c interfaceC39171c;
        C26068u c26068uM77569a;
        Object objM87133R;
        InterfaceC28601c1 interfaceC28601c1;
        C22669g0 c22669g0;
        Function1 function7;
        Object objM87133R2;
        FeatureFlagChecker featureFlagChecker;
        boolean z19;
        boolean z24;
        Object objM87133R3;
        int i36;
        boolean z25;
        boolean zM87157i;
        Object objM87133R4;
        C28676v0 c28676v1;
        int i37;
        FeatureFlagChecker featureFlagChecker2;
        int i38;
        boolean z26;
        boolean z27;
        boolean zM87157i2;
        Object objM87133R5;
        C28676v0 c28676v2;
        int i39;
        boolean z28;
        Object objM87133R6;
        C26801c c26801c;
        InterfaceC15237i interfaceC15237i;
        Object objM87133R7;
        boolean zM87157i3;
        Object objM87133R8;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean zIsFeatureEnabled;
        C23016z c23016z;
        boolean z29;
        C28655q c28655q2;
        int i44;
        C26804f c26804f;
        Function1 function8;
        Function1 function9;
        ListIterator<C26801c> listIterator;
        C26801c c26801cPrevious;
        C26801c c26801c2;
        boolean z34;
        boolean z35;
        EnumC26811m enumC26811mM79953k;
        EnumC26811m enumC26811mM79953k2;
        Function1 function10;
        boolean z36;
        List<C26810l> listM79952j;
        Boolean boolValueOf;
        List<C26810l> listM79952j2;
        Boolean boolValueOf2;
        boolean z37;
        boolean zM87157i4;
        Object objM87133R9;
        boolean z38;
        Object objM87133R10;
        boolean z39;
        boolean zM87157i5;
        Object objM87133R11;
        boolean z44;
        Object objM87133R12;
        boolean z45;
        Object objM87133R13;
        Object objM87133R14;
        List<C26810l> list;
        Iterator<T> it;
        boolean z46;
        List<C26810l> list2;
        Iterator<T> it3;
        boolean z47;
        boolean zM79886b;
        boolean z48;
        Object objM87133R15;
        Object objM87133R16;
        Object objM87133R17;
        Object objM87133R18;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onFeedbackClicked, "onFeedbackClicked");
        AbstractC22676k.m65750j(mediaPickerLauncher, "mediaPickerLauncher");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1585252751);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87157i(onFeedbackClicked) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= (i13 & 512) == 0 ? c28655q3.m87153g(mediaPickerLauncher) : c28655q3.m87157i(mediaPickerLauncher) ? 256 : 128;
        }
        int i45 = i14 & 8;
        if (i45 == 0) {
            if ((i13 & 3072) == 0) {
                function3 = function1;
                i15 |= c28655q3.m87157i(function3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    function4 = function2;
                    if (c28655q3.m87157i(function4)) {
                        i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 32;
                if (i18 != 0) {
                    if ((196608 & i13) == 0) {
                        if (c28655q3.m87157i(interfaceC4351m)) {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 64;
                    if (i24 != 0) {
                        i15 |= 1572864;
                        z14 = z4;
                    } else {
                        z14 = z4;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q3.m87155h(z14)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i15 |= i25;
                        }
                    }
                    i26 = i14 & 128;
                    if (i26 != 0) {
                        if ((i13 & 12582912) == 0) {
                            int i46 = i15;
                            if (c28655q3.m87157i(interfaceC4339a)) {
                                i27 = 8388608;
                            } else {
                                i27 = 4194304;
                            }
                            i28 = i46 | i27;
                        }
                        i29 = i14 & 256;
                        if (i29 != 0) {
                            i28 |= 100663296;
                        } else if ((i13 & 100663296) == 0) {
                            if (c28655q3.m87155h(z13)) {
                                i34 = 67108864;
                            } else {
                                i34 = AndroidSDKConstants.FLAG_MUTABLE;
                            }
                            i28 |= i34;
                        }
                        i35 = i28;
                        if ((i35 & 38347923) != 38347922) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (c28655q3.m87135U(i35 & 1, z15)) {
                            c28676v0 = C28635l.f115821a;
                            if (i45 != 0) {
                                objM87133R18 = c28655q3.m87133R();
                                if (objM87133R18 == c28676v0) {
                                    objM87133R18 = new C32375n(13);
                                    c28655q3.m87172p0(objM87133R18);
                                }
                                function3 = (Function1) objM87133R18;
                            }
                            if (i16 != 0) {
                                objM87133R17 = c28655q3.m87133R();
                                if (objM87133R17 == c28676v0) {
                                    objM87133R17 = new C32375n(14);
                                    c28655q3.m87172p0(objM87133R17);
                                }
                                function6 = (Function1) objM87133R17;
                            } else {
                                function6 = function4;
                            }
                            if (i18 != 0) {
                                objM87133R16 = c28655q3.m87133R();
                                if (objM87133R16 == c28676v0) {
                                    objM87133R16 = new C31314a(19);
                                    c28655q3.m87172p0(objM87133R16);
                                }
                                interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                            } else {
                                interfaceC4351m3 = interfaceC4351m;
                            }
                            if (i24 != 0) {
                                z14 = false;
                            }
                            if (i26 != 0) {
                                objM87133R15 = c28655q3.m87133R();
                                if (objM87133R15 == c28676v0) {
                                    objM87133R15 = new C32513d(19);
                                    c28655q3.m87172p0(objM87133R15);
                                }
                                interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                            } else {
                                interfaceC4339a3 = interfaceC4339a;
                            }
                            if (i29 != 0) {
                                z18 = false;
                            } else {
                                z18 = z13;
                            }
                            configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                            interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                            objM87133R = c28655q3.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = AbstractC28683x.m87272z(null);
                                c28655q3.m87172p0(objM87133R);
                            }
                            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                            c22669g0 = new C22669g0();
                            function7 = function3;
                            objM87133R2 = c28655q3.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C32693x2();
                                c28655q3.m87172p0(objM87133R2);
                            }
                            c22669g0.f89336w = (C32693x2) objM87133R2;
                            featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                            z19 = z18;
                            if ((i35 & 458752) == 131072) {
                                z24 = true;
                            } else {
                                z24 = false;
                            }
                            objM87133R3 = c28655q3.m87133R();
                            if (z24 || objM87133R3 == c28676v0) {
                                objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                                c28655q3.m87172p0(objM87133R3);
                            }
                            m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                            List<C26801c> listM79883f = viewState.getConversation().m79883f();
                            List<String> listM79884g = viewState.getConversation().m79884g();
                            EnumC26811m enumC26811mM79953k3 = viewState.getLoadingState();
                            i36 = i35 & 234881024;
                            if (i36 == 67108864) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                            objM87133R4 = c28655q3.m87133R();
                            if (!zM87157i || objM87133R4 == c28676v0) {
                                c28676v1 = c28676v0;
                                i37 = i36;
                                featureFlagChecker2 = featureFlagChecker;
                                i38 = 67108864;
                                a aVar = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                                z26 = z19;
                                c28655q3.m87172p0(aVar);
                                objM87133R4 = aVar;
                            } else {
                                c28676v1 = c28676v0;
                                featureFlagChecker2 = featureFlagChecker;
                                i37 = i36;
                                z26 = z19;
                                i38 = 67108864;
                            }
                            AbstractC28683x.m87255i(listM79883f, listM79884g, enumC26811mM79953k3, (InterfaceC4351m) objM87133R4, c28655q3);
                            Boolean boolValueOf3 = Boolean.valueOf(m102062M(c26068uM77569a));
                            if (i37 == i38) {
                                z27 = true;
                            } else {
                                z27 = false;
                            }
                            zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                            objM87133R5 = c28655q3.m87133R();
                            c28676v2 = c28676v1;
                            if (zM87157i2 || objM87133R5 == c28676v2) {
                                objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                                c28655q3.m87172p0(objM87133R5);
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf3);
                            i39 = i35 & 7168;
                            if (i39 == 2048) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                            objM87133R6 = c28655q3.m87133R();
                            if (!z28 || objM87133R6 == c28676v2) {
                                c26801c = null;
                                objM87133R6 = new c(function7, null);
                                c28655q3.m87172p0(objM87133R6);
                            } else {
                                c26801c = null;
                            }
                            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                            interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                            objM87133R7 = c28655q3.m87133R();
                            if (objM87133R7 == c28676v2) {
                                objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                            }
                            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R7;
                            zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                            objM87133R8 = c28655q3.m87133R();
                            if (zM87157i3 || objM87133R8 == c28676v2) {
                                objM87133R8 = new C32683v0(interfaceC15237i, 3);
                                c28655q3.m87172p0(objM87133R8);
                            }
                            Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                            iHashCode = Long.hashCode(c28655q3.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3407d);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q3.m87158i0();
                            if (c28655q3.f115903S) {
                                c28655q3.m87163l(c0213j);
                            } else {
                                c28655q3.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a);
                            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N);
                            zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                            c23016z = C23016z.f90757a;
                            if (zIsFeatureEnabled) {
                                c28655q3.m87150e0(752864065);
                                int i47 = i35 << 3;
                                int i48 = (57344 & i35) | (i47 & 896) | 6 | (i47 & 112) | i39;
                                int i49 = i35 >> 3;
                                boolean z49 = z14;
                                Function1 function11 = function6;
                                i44 = i35;
                                AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function11, z49, viewState.getIsWceLoading(), z26, c28655q3, i48 | (i49 & 458752) | (i49 & 29360128), 0);
                                z29 = z49;
                                c28655q2 = c28655q3;
                                c28655q2.m87173q(false);
                                c26804f = viewState;
                                function8 = function7;
                                function9 = function11;
                            } else {
                                z29 = z14;
                                c28655q2 = c28655q3;
                                Function1 function12 = function6;
                                i44 = i35;
                                c28655q2.m87150e0(753275497);
                                int i54 = i44 << 3;
                                AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function12, null, viewState.getIsWceLoading(), c28655q2, (i54 & 896) | 6 | (i54 & 112) | i39 | (i44 & 57344), 16);
                                c26804f = viewState;
                                function8 = function7;
                                function9 = function12;
                                c28655q2.m87173q(false);
                            }
                            List<C26801c> listM79883f2 = c26804f.getConversation().m79883f();
                            listIterator = listM79883f2.listIterator(listM79883f2.size());
                            do {
                                if (listIterator.hasPrevious()) {
                                    c26801cPrevious = c26801c;
                                    break;
                                }
                                c26801cPrevious = listIterator.previous();
                                if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                    z48 = true;
                                } else {
                                    z48 = false;
                                }
                            } while (!z48);
                            c26801c2 = c26801cPrevious;
                            if (c26801c2 != null) {
                                zM79886b = c26801c2.getFailure();
                                z34 = true;
                                if (zM79886b) {
                                    z35 = true;
                                }
                                enumC26811mM79953k = c26804f.getLoadingState();
                                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                                if (enumC26811mM79953k != enumC26811mM79953k2 || c26804f.getLoadingState() == EnumC26811m.MESSAGE_FLAGGED || z35) {
                                    c28655q2.m87150e0(753924203);
                                    if (!z35) {
                                        enumC26811mM79953k2 = c26804f.getLoadingState();
                                    }
                                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(754187517);
                                    c28655q2.m87173q(false);
                                }
                                if (z29) {
                                    function10 = function8;
                                    c28655q2.m87150e0(757135741);
                                    c28655q2.m87173q(false);
                                } else {
                                    c28655q2.m87150e0(754377671);
                                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                    int iM79958p = c26804f.getSendFieldIcon();
                                    InterfaceC39332e interfaceC39332eM79957o = c26804f.getSendFieldColor();
                                    TextResource textResourceM79951i = c26804f.getHint();
                                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING || c26804f.getIsWceLoading()) {
                                        z36 = z34;
                                    } else {
                                        z36 = false;
                                    }
                                    boolean zM79947e = c26804f.getDisableTextField();
                                    listM79952j = c26804f.m79952j();
                                    if (listM79952j != null) {
                                        list2 = listM79952j;
                                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                                            z47 = false;
                                            break;
                                        }
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                        boolValueOf = Boolean.valueOf(z47);
                                    } else {
                                        boolValueOf = c26801c;
                                    }
                                    listM79952j2 = c26804f.m79952j();
                                    if (listM79952j2 != null) {
                                        list = listM79952j2;
                                        if ((list instanceof Collection) && list.isEmpty()) {
                                            z46 = false;
                                            break;
                                        }
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                        boolValueOf2 = Boolean.valueOf(z46);
                                    } else {
                                        boolValueOf2 = c26801c;
                                    }
                                    boolean zM102116t = AbstractC32654p.m102116t(z36, zM79947e, boolValueOf, boolValueOf2);
                                    boolean zM79960r = c26804f.getShowStopGenerating();
                                    boolean zM79880c = c26804f.getConversation().getCanStartNewConversation();
                                    if (i39 == 2048) {
                                        z37 = z34;
                                    } else {
                                        z37 = false;
                                    }
                                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                    objM87133R9 = c28655q2.m87133R();
                                    if (zM87157i4 || objM87133R9 == c28676v2) {
                                        objM87133R9 = new C32629k(function8, c26804f, 1);
                                        c28655q2.m87172p0(objM87133R9);
                                    }
                                    InterfaceC4352n interfaceC4352n = (InterfaceC4352n) objM87133R9;
                                    if (i39 == 2048) {
                                        z38 = z34;
                                    } else {
                                        z38 = false;
                                    }
                                    objM87133R10 = c28655q2.m87133R();
                                    if (z38 || objM87133R10 == c28676v2) {
                                        objM87133R10 = new C32599e(function8, 2);
                                        c28655q2.m87172p0(objM87133R10);
                                    }
                                    Function1 function13 = (Function1) objM87133R10;
                                    List<C26810l> listM79952j3 = c26804f.m79952j();
                                    if (i39 == 2048) {
                                        z39 = true;
                                    } else {
                                        z39 = false;
                                    }
                                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                    objM87133R11 = c28655q2.m87133R();
                                    if (zM87157i5 || objM87133R11 == c28676v2) {
                                        objM87133R11 = new C32634l(function8, c26804f, 1);
                                        c28655q2.m87172p0(objM87133R11);
                                    }
                                    InterfaceC4339a interfaceC4339a4 = (InterfaceC4339a) objM87133R11;
                                    if (i39 == 2048) {
                                        z44 = true;
                                    } else {
                                        z44 = false;
                                    }
                                    objM87133R12 = c28655q2.m87133R();
                                    if (z44 || objM87133R12 == c28676v2) {
                                        objM87133R12 = new C32639m(function8, 1);
                                        c28655q2.m87172p0(objM87133R12);
                                    }
                                    InterfaceC4351m interfaceC4351m4 = (InterfaceC4351m) objM87133R12;
                                    if (i39 == 2048) {
                                        z45 = true;
                                    } else {
                                        z45 = false;
                                    }
                                    objM87133R13 = c28655q2.m87133R();
                                    if (z45 || objM87133R13 == c28676v2) {
                                        objM87133R13 = new C32644n(function8, 1);
                                        c28655q2.m87172p0(objM87133R13);
                                    }
                                    InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R13;
                                    boolean zM79959q = viewState.getShowKeyboardOnLaunch();
                                    EnumC26811m enumC26811mM79953k4 = viewState.getLoadingState();
                                    boolean zIsEmpty = viewState.getConversation().m79883f().isEmpty();
                                    int i55 = i44;
                                    InterfaceC15250v interfaceC15250vM102054E = m102054E(interfaceC28601c1);
                                    objM87133R14 = c28655q2.m87133R();
                                    if (objM87133R14 == c28676v2) {
                                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                                        c28655q2.m87172p0(objM87133R14);
                                    }
                                    C28655q c28655q4 = c28655q2;
                                    function10 = function8;
                                    AbstractC32700z1.m102618e(iM79958p, interfaceC39332eM79957o, textResourceM79951i, zM102116t, zM79960r, zM79880c, c26068uM77569a, interfaceC4352n, function13, listM79952j3, interfaceC4339a4, interfaceC4351m4, interfaceC4339a5, zM79959q, enumC26811mM79953k4, zIsEmpty, interfaceC4351m3, interfaceC15250vM102054E, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q4, TextResource.$stable << 6, ((i55 << 3) & 3670016) | 100663296 | ((i55 << 21) & 1879048192), (i55 >> 21) & 14, 2097152);
                                    c28655q2 = c28655q4;
                                    c28655q2.m87173q(false);
                                }
                                c28655q2.m87173q(true);
                                c28655q = c28655q2;
                                interfaceC4351m2 = interfaceC4351m3;
                                interfaceC4339a2 = interfaceC4339a3;
                                z17 = z29;
                                z16 = z26;
                                function4 = function9;
                                function5 = function10;
                            } else {
                                z34 = true;
                            }
                            z35 = false;
                            enumC26811mM79953k = c26804f.getLoadingState();
                            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                            if (enumC26811mM79953k != enumC26811mM79953k2) {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            if (z29) {
                                c28655q2.m87150e0(754377671);
                                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                int iM79958p2 = c26804f.getSendFieldIcon();
                                InterfaceC39332e interfaceC39332eM79957o2 = c26804f.getSendFieldColor();
                                TextResource textResourceM79951i2 = c26804f.getHint();
                                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                    z36 = z34;
                                } else {
                                    z36 = z34;
                                }
                                boolean zM79947e2 = c26804f.getDisableTextField();
                                listM79952j = c26804f.m79952j();
                                if (listM79952j != null) {
                                    list2 = listM79952j;
                                    if (list2 instanceof Collection) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z47);
                                } else {
                                    boolValueOf = c26801c;
                                }
                                listM79952j2 = c26804f.m79952j();
                                if (listM79952j2 != null) {
                                    list = listM79952j2;
                                    if (list instanceof Collection) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf2 = Boolean.valueOf(z46);
                                } else {
                                    boolValueOf2 = c26801c;
                                }
                                boolean zM102116t2 = AbstractC32654p.m102116t(z36, zM79947e2, boolValueOf, boolValueOf2);
                                boolean zM79960r2 = c26804f.getShowStopGenerating();
                                boolean zM79880c2 = c26804f.getConversation().getCanStartNewConversation();
                                if (i39 == 2048) {
                                    z37 = z34;
                                } else {
                                    z37 = false;
                                }
                                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87157i4) {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4352n interfaceC4352n2 = (InterfaceC4352n) objM87133R9;
                                if (i39 == 2048) {
                                    z38 = z34;
                                } else {
                                    z38 = false;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (z38) {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                Function1 function14 = (Function1) objM87133R10;
                                List<C26810l> listM79952j4 = c26804f.m79952j();
                                if (i39 == 2048) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                objM87133R11 = c28655q2.m87133R();
                                if (zM87157i5) {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R11;
                                if (i39 == 2048) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R12 = c28655q2.m87133R();
                                if (z44) {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4351m interfaceC4351m5 = (InterfaceC4351m) objM87133R12;
                                if (i39 == 2048) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                objM87133R13 = c28655q2.m87133R();
                                if (z45) {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                }
                                InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R13;
                                boolean zM79959q2 = viewState.getShowKeyboardOnLaunch();
                                EnumC26811m enumC26811mM79953k5 = viewState.getLoadingState();
                                boolean zIsEmpty2 = viewState.getConversation().m79883f().isEmpty();
                                int i56 = i44;
                                InterfaceC15250v interfaceC15250vM102054E2 = m102054E(interfaceC28601c1);
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v2) {
                                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                C28655q c28655q5 = c28655q2;
                                function10 = function8;
                                AbstractC32700z1.m102618e(iM79958p2, interfaceC39332eM79957o2, textResourceM79951i2, zM102116t2, zM79960r2, zM79880c2, c26068uM77569a, interfaceC4352n2, function14, listM79952j4, interfaceC4339a6, interfaceC4351m5, interfaceC4339a7, zM79959q2, enumC26811mM79953k5, zIsEmpty2, interfaceC4351m3, interfaceC15250vM102054E2, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q5, TextResource.$stable << 6, ((i56 << 3) & 3670016) | 100663296 | ((i56 << 21) & 1879048192), (i56 >> 21) & 14, 2097152);
                                c28655q2 = c28655q5;
                                c28655q2.m87173q(false);
                            } else {
                                function10 = function8;
                                c28655q2.m87150e0(757135741);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q = c28655q2;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a2 = interfaceC4339a3;
                            z17 = z29;
                            z16 = z26;
                            function4 = function9;
                            function5 = function10;
                        } else {
                            c28655q3.m87138X();
                            interfaceC4351m2 = interfaceC4351m;
                            interfaceC4339a2 = interfaceC4339a;
                            z16 = z13;
                            function5 = function3;
                            c28655q = c28655q3;
                            z17 = z14;
                        }
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                        }
                    }
                    i15 |= 12582912;
                    i28 = i15;
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i28 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i28 |= i34;
                    }
                    i35 = i28;
                    if ((i35 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q3.m87135U(i35 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C32375n(13);
                                c28655q3.m87172p0(objM87133R18);
                            }
                            function3 = (Function1) objM87133R18;
                        }
                        if (i16 != 0) {
                            objM87133R17 = c28655q3.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C32375n(14);
                                c28655q3.m87172p0(objM87133R17);
                            }
                            function6 = (Function1) objM87133R17;
                        } else {
                            function6 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R16 = c28655q3.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(19);
                                c28655q3.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q3.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C32513d(19);
                                c28655q3.m87172p0(objM87133R15);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                        interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c22669g0 = new C22669g0();
                        function7 = function3;
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32693x2();
                            c28655q3.m87172p0(objM87133R2);
                        }
                        c22669g0.f89336w = (C32693x2) objM87133R2;
                        featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                        z19 = z18;
                        if ((i35 & 458752) == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (z24) {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                        List<C26801c> listM79883f3 = viewState.getConversation().m79883f();
                        List<String> listM79884g2 = viewState.getConversation().m79884g();
                        EnumC26811m enumC26811mM79953k6 = viewState.getLoadingState();
                        i36 = i35 & 234881024;
                        if (i36 == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                        objM87133R4 = c28655q3.m87133R();
                        if (zM87157i) {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar2 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar2);
                            objM87133R4 = aVar2;
                        } else {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar3 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar3);
                            objM87133R4 = aVar3;
                        }
                        AbstractC28683x.m87255i(listM79883f3, listM79884g2, enumC26811mM79953k6, (InterfaceC4351m) objM87133R4, c28655q3);
                        Boolean boolValueOf4 = Boolean.valueOf(m102062M(c26068uM77569a));
                        if (i37 == i38) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                        objM87133R5 = c28655q3.m87133R();
                        c28676v2 = c28676v1;
                        if (zM87157i2) {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf4);
                        i39 = i35 & 7168;
                        if (i39 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z28) {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v2) {
                            objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                        }
                        InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R7;
                        zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                        objM87133R8 = c28655q3.m87133R();
                        if (zM87157i3) {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c2, interfaceC21083i2, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3407d2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N2);
                        zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                        c23016z = C23016z.f90757a;
                        if (zIsFeatureEnabled) {
                            c28655q3.m87150e0(752864065);
                            int i410 = i35 << 3;
                            int i411 = (57344 & i35) | (i410 & 896) | 6 | (i410 & 112) | i39;
                            int i412 = i35 >> 3;
                            boolean z410 = z14;
                            Function1 function15 = function6;
                            i44 = i35;
                            AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function15, z410, viewState.getIsWceLoading(), z26, c28655q3, i411 | (i412 & 458752) | (i412 & 29360128), 0);
                            z29 = z410;
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(false);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function15;
                        } else {
                            z29 = z14;
                            c28655q2 = c28655q3;
                            Function1 function16 = function6;
                            i44 = i35;
                            c28655q2.m87150e0(753275497);
                            int i57 = i44 << 3;
                            AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function16, null, viewState.getIsWceLoading(), c28655q2, (i57 & 896) | 6 | (i57 & 112) | i39 | (i44 & 57344), 16);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function16;
                            c28655q2.m87173q(false);
                        }
                        List<C26801c> listM79883f4 = c26804f.getConversation().m79883f();
                        listIterator = listM79883f4.listIterator(listM79883f4.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                c26801cPrevious = c26801c;
                                break;
                            }
                            c26801cPrevious = listIterator.previous();
                            if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                        } while (!z48);
                        c26801c2 = c26801cPrevious;
                        if (c26801c2 != null) {
                            zM79886b = c26801c2.getFailure();
                            z34 = true;
                            if (zM79886b) {
                                z35 = true;
                            }
                            enumC26811mM79953k = c26804f.getLoadingState();
                            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                            if (enumC26811mM79953k != enumC26811mM79953k2) {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            if (z29) {
                                c28655q2.m87150e0(754377671);
                                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                int iM79958p3 = c26804f.getSendFieldIcon();
                                InterfaceC39332e interfaceC39332eM79957o3 = c26804f.getSendFieldColor();
                                TextResource textResourceM79951i3 = c26804f.getHint();
                                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                    z36 = z34;
                                } else {
                                    z36 = z34;
                                }
                                boolean zM79947e3 = c26804f.getDisableTextField();
                                listM79952j = c26804f.m79952j();
                                if (listM79952j != null) {
                                    list2 = listM79952j;
                                    if (list2 instanceof Collection) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z47);
                                } else {
                                    boolValueOf = c26801c;
                                }
                                listM79952j2 = c26804f.m79952j();
                                if (listM79952j2 != null) {
                                    list = listM79952j2;
                                    if (list instanceof Collection) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf2 = Boolean.valueOf(z46);
                                } else {
                                    boolValueOf2 = c26801c;
                                }
                                boolean zM102116t3 = AbstractC32654p.m102116t(z36, zM79947e3, boolValueOf, boolValueOf2);
                                boolean zM79960r3 = c26804f.getShowStopGenerating();
                                boolean zM79880c3 = c26804f.getConversation().getCanStartNewConversation();
                                if (i39 == 2048) {
                                    z37 = z34;
                                } else {
                                    z37 = false;
                                }
                                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87157i4) {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4352n interfaceC4352n3 = (InterfaceC4352n) objM87133R9;
                                if (i39 == 2048) {
                                    z38 = z34;
                                } else {
                                    z38 = false;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (z38) {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                Function1 function17 = (Function1) objM87133R10;
                                List<C26810l> listM79952j5 = c26804f.m79952j();
                                if (i39 == 2048) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                objM87133R11 = c28655q2.m87133R();
                                if (zM87157i5) {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                InterfaceC4339a interfaceC4339a8 = (InterfaceC4339a) objM87133R11;
                                if (i39 == 2048) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R12 = c28655q2.m87133R();
                                if (z44) {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4351m interfaceC4351m6 = (InterfaceC4351m) objM87133R12;
                                if (i39 == 2048) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                objM87133R13 = c28655q2.m87133R();
                                if (z45) {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                }
                                InterfaceC4339a interfaceC4339a9 = (InterfaceC4339a) objM87133R13;
                                boolean zM79959q3 = viewState.getShowKeyboardOnLaunch();
                                EnumC26811m enumC26811mM79953k7 = viewState.getLoadingState();
                                boolean zIsEmpty3 = viewState.getConversation().m79883f().isEmpty();
                                int i58 = i44;
                                InterfaceC15250v interfaceC15250vM102054E3 = m102054E(interfaceC28601c1);
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v2) {
                                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                C28655q c28655q6 = c28655q2;
                                function10 = function8;
                                AbstractC32700z1.m102618e(iM79958p3, interfaceC39332eM79957o3, textResourceM79951i3, zM102116t3, zM79960r3, zM79880c3, c26068uM77569a, interfaceC4352n3, function17, listM79952j5, interfaceC4339a8, interfaceC4351m6, interfaceC4339a9, zM79959q3, enumC26811mM79953k7, zIsEmpty3, interfaceC4351m3, interfaceC15250vM102054E3, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q6, TextResource.$stable << 6, ((i58 << 3) & 3670016) | 100663296 | ((i58 << 21) & 1879048192), (i58 >> 21) & 14, 2097152);
                                c28655q2 = c28655q6;
                                c28655q2.m87173q(false);
                            } else {
                                function10 = function8;
                                c28655q2.m87150e0(757135741);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q = c28655q2;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a2 = interfaceC4339a3;
                            z17 = z29;
                            z16 = z26;
                            function4 = function9;
                            function5 = function10;
                        } else {
                            z34 = true;
                        }
                        z35 = false;
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p4 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o4 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i4 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e4 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t4 = AbstractC32654p.m102116t(z36, zM79947e4, boolValueOf, boolValueOf2);
                            boolean zM79960r4 = c26804f.getShowStopGenerating();
                            boolean zM79880c4 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n4 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function18 = (Function1) objM87133R10;
                            List<C26810l> listM79952j6 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a10 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m7 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a11 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q4 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k8 = viewState.getLoadingState();
                            boolean zIsEmpty4 = viewState.getConversation().m79883f().isEmpty();
                            int i59 = i44;
                            InterfaceC15250v interfaceC15250vM102054E4 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q7 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p4, interfaceC39332eM79957o4, textResourceM79951i4, zM102116t4, zM79960r4, zM79880c4, c26068uM77569a, interfaceC4352n4, function18, listM79952j6, interfaceC4339a10, interfaceC4351m7, interfaceC4339a11, zM79959q4, enumC26811mM79953k8, zIsEmpty4, interfaceC4351m3, interfaceC15250vM102054E4, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q7, TextResource.$stable << 6, ((i59 << 3) & 3670016) | 100663296 | ((i59 << 21) & 1879048192), (i59 >> 21) & 14, 2097152);
                            c28655q2 = c28655q7;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a2 = interfaceC4339a;
                        z16 = z13;
                        function5 = function3;
                        c28655q = c28655q3;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                    }
                }
                i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z14 = z4;
                } else {
                    z14 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87155h(z14)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        int i413 = i15;
                        if (c28655q3.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i28 = i413 | i27;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i28 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i28 |= i34;
                    }
                    i35 = i28;
                    if ((i35 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q3.m87135U(i35 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C32375n(13);
                                c28655q3.m87172p0(objM87133R18);
                            }
                            function3 = (Function1) objM87133R18;
                        }
                        if (i16 != 0) {
                            objM87133R17 = c28655q3.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C32375n(14);
                                c28655q3.m87172p0(objM87133R17);
                            }
                            function6 = (Function1) objM87133R17;
                        } else {
                            function6 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R16 = c28655q3.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(19);
                                c28655q3.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q3.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C32513d(19);
                                c28655q3.m87172p0(objM87133R15);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                        interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c22669g0 = new C22669g0();
                        function7 = function3;
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32693x2();
                            c28655q3.m87172p0(objM87133R2);
                        }
                        c22669g0.f89336w = (C32693x2) objM87133R2;
                        featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                        z19 = z18;
                        if ((i35 & 458752) == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (z24) {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                        List<C26801c> listM79883f5 = viewState.getConversation().m79883f();
                        List<String> listM79884g3 = viewState.getConversation().m79884g();
                        EnumC26811m enumC26811mM79953k9 = viewState.getLoadingState();
                        i36 = i35 & 234881024;
                        if (i36 == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                        objM87133R4 = c28655q3.m87133R();
                        if (zM87157i) {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar4 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar4);
                            objM87133R4 = aVar4;
                        } else {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar5 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar5);
                            objM87133R4 = aVar5;
                        }
                        AbstractC28683x.m87255i(listM79883f5, listM79884g3, enumC26811mM79953k9, (InterfaceC4351m) objM87133R4, c28655q3);
                        Boolean boolValueOf5 = Boolean.valueOf(m102062M(c26068uM77569a));
                        if (i37 == i38) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                        objM87133R5 = c28655q3.m87133R();
                        c28676v2 = c28676v1;
                        if (zM87157i2) {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf5);
                        i39 = i35 & 7168;
                        if (i39 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z28) {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3358c3 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v2) {
                            objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                        }
                        InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R7;
                        zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                        objM87133R8 = c28655q3.m87133R();
                        if (zM87157i3) {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3407d3 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c3, interfaceC21083i3, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, modifierM3407d3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N3);
                        zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                        c23016z = C23016z.f90757a;
                        if (zIsFeatureEnabled) {
                            c28655q3.m87150e0(752864065);
                            int i414 = i35 << 3;
                            int i415 = (57344 & i35) | (i414 & 896) | 6 | (i414 & 112) | i39;
                            int i416 = i35 >> 3;
                            boolean z411 = z14;
                            Function1 function19 = function6;
                            i44 = i35;
                            AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function19, z411, viewState.getIsWceLoading(), z26, c28655q3, i415 | (i416 & 458752) | (i416 & 29360128), 0);
                            z29 = z411;
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(false);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function19;
                        } else {
                            z29 = z14;
                            c28655q2 = c28655q3;
                            Function1 function110 = function6;
                            i44 = i35;
                            c28655q2.m87150e0(753275497);
                            int i510 = i44 << 3;
                            AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function110, null, viewState.getIsWceLoading(), c28655q2, (i510 & 896) | 6 | (i510 & 112) | i39 | (i44 & 57344), 16);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function110;
                            c28655q2.m87173q(false);
                        }
                        List<C26801c> listM79883f6 = c26804f.getConversation().m79883f();
                        listIterator = listM79883f6.listIterator(listM79883f6.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                c26801cPrevious = c26801c;
                                break;
                            }
                            c26801cPrevious = listIterator.previous();
                            if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                        } while (!z48);
                        c26801c2 = c26801cPrevious;
                        if (c26801c2 != null) {
                            zM79886b = c26801c2.getFailure();
                            z34 = true;
                            if (zM79886b) {
                                z35 = true;
                            }
                            enumC26811mM79953k = c26804f.getLoadingState();
                            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                            if (enumC26811mM79953k != enumC26811mM79953k2) {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            if (z29) {
                                c28655q2.m87150e0(754377671);
                                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                int iM79958p5 = c26804f.getSendFieldIcon();
                                InterfaceC39332e interfaceC39332eM79957o5 = c26804f.getSendFieldColor();
                                TextResource textResourceM79951i5 = c26804f.getHint();
                                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                    z36 = z34;
                                } else {
                                    z36 = z34;
                                }
                                boolean zM79947e5 = c26804f.getDisableTextField();
                                listM79952j = c26804f.m79952j();
                                if (listM79952j != null) {
                                    list2 = listM79952j;
                                    if (list2 instanceof Collection) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z47);
                                } else {
                                    boolValueOf = c26801c;
                                }
                                listM79952j2 = c26804f.m79952j();
                                if (listM79952j2 != null) {
                                    list = listM79952j2;
                                    if (list instanceof Collection) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf2 = Boolean.valueOf(z46);
                                } else {
                                    boolValueOf2 = c26801c;
                                }
                                boolean zM102116t5 = AbstractC32654p.m102116t(z36, zM79947e5, boolValueOf, boolValueOf2);
                                boolean zM79960r5 = c26804f.getShowStopGenerating();
                                boolean zM79880c5 = c26804f.getConversation().getCanStartNewConversation();
                                if (i39 == 2048) {
                                    z37 = z34;
                                } else {
                                    z37 = false;
                                }
                                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87157i4) {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4352n interfaceC4352n5 = (InterfaceC4352n) objM87133R9;
                                if (i39 == 2048) {
                                    z38 = z34;
                                } else {
                                    z38 = false;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (z38) {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                Function1 function111 = (Function1) objM87133R10;
                                List<C26810l> listM79952j7 = c26804f.m79952j();
                                if (i39 == 2048) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                objM87133R11 = c28655q2.m87133R();
                                if (zM87157i5) {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                InterfaceC4339a interfaceC4339a12 = (InterfaceC4339a) objM87133R11;
                                if (i39 == 2048) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R12 = c28655q2.m87133R();
                                if (z44) {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4351m interfaceC4351m8 = (InterfaceC4351m) objM87133R12;
                                if (i39 == 2048) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                objM87133R13 = c28655q2.m87133R();
                                if (z45) {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                }
                                InterfaceC4339a interfaceC4339a13 = (InterfaceC4339a) objM87133R13;
                                boolean zM79959q5 = viewState.getShowKeyboardOnLaunch();
                                EnumC26811m enumC26811mM79953k10 = viewState.getLoadingState();
                                boolean zIsEmpty5 = viewState.getConversation().m79883f().isEmpty();
                                int i511 = i44;
                                InterfaceC15250v interfaceC15250vM102054E5 = m102054E(interfaceC28601c1);
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v2) {
                                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                C28655q c28655q8 = c28655q2;
                                function10 = function8;
                                AbstractC32700z1.m102618e(iM79958p5, interfaceC39332eM79957o5, textResourceM79951i5, zM102116t5, zM79960r5, zM79880c5, c26068uM77569a, interfaceC4352n5, function111, listM79952j7, interfaceC4339a12, interfaceC4351m8, interfaceC4339a13, zM79959q5, enumC26811mM79953k10, zIsEmpty5, interfaceC4351m3, interfaceC15250vM102054E5, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q8, TextResource.$stable << 6, ((i511 << 3) & 3670016) | 100663296 | ((i511 << 21) & 1879048192), (i511 >> 21) & 14, 2097152);
                                c28655q2 = c28655q8;
                                c28655q2.m87173q(false);
                            } else {
                                function10 = function8;
                                c28655q2.m87150e0(757135741);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q = c28655q2;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a2 = interfaceC4339a3;
                            z17 = z29;
                            z16 = z26;
                            function4 = function9;
                            function5 = function10;
                        } else {
                            z34 = true;
                        }
                        z35 = false;
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p6 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o6 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i6 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e6 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t6 = AbstractC32654p.m102116t(z36, zM79947e6, boolValueOf, boolValueOf2);
                            boolean zM79960r6 = c26804f.getShowStopGenerating();
                            boolean zM79880c6 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n6 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function112 = (Function1) objM87133R10;
                            List<C26810l> listM79952j8 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a14 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m9 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a15 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q6 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k11 = viewState.getLoadingState();
                            boolean zIsEmpty6 = viewState.getConversation().m79883f().isEmpty();
                            int i512 = i44;
                            InterfaceC15250v interfaceC15250vM102054E6 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q9 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p6, interfaceC39332eM79957o6, textResourceM79951i6, zM102116t6, zM79960r6, zM79880c6, c26068uM77569a, interfaceC4352n6, function112, listM79952j8, interfaceC4339a14, interfaceC4351m9, interfaceC4339a15, zM79959q6, enumC26811mM79953k11, zIsEmpty6, interfaceC4351m3, interfaceC15250vM102054E6, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q9, TextResource.$stable << 6, ((i512 << 3) & 3670016) | 100663296 | ((i512 << 21) & 1879048192), (i512 >> 21) & 14, 2097152);
                            c28655q2 = c28655q9;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a2 = interfaceC4339a;
                        z16 = z13;
                        function5 = function3;
                        c28655q = c28655q3;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i15;
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f7 = viewState.getConversation().m79883f();
                    List<String> listM79884g4 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k12 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar6 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar6);
                        objM87133R4 = aVar6;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar7 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar7);
                        objM87133R4 = aVar7;
                    }
                    AbstractC28683x.m87255i(listM79883f7, listM79884g4, enumC26811mM79953k12, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf6 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf6);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c4 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d4 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c4, interfaceC21083i4, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a4 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3407d4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a4);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N4);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i417 = i35 << 3;
                        int i418 = (57344 & i35) | (i417 & 896) | 6 | (i417 & 112) | i39;
                        int i419 = i35 >> 3;
                        boolean z412 = z14;
                        Function1 function113 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function113, z412, viewState.getIsWceLoading(), z26, c28655q3, i418 | (i419 & 458752) | (i419 & 29360128), 0);
                        z29 = z412;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function113;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function114 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i513 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function114, null, viewState.getIsWceLoading(), c28655q2, (i513 & 896) | 6 | (i513 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function114;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f8 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f8.listIterator(listM79883f8.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p7 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o7 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i7 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e7 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t7 = AbstractC32654p.m102116t(z36, zM79947e7, boolValueOf, boolValueOf2);
                            boolean zM79960r7 = c26804f.getShowStopGenerating();
                            boolean zM79880c7 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n7 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function115 = (Function1) objM87133R10;
                            List<C26810l> listM79952j9 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a16 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m10 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a17 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q7 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k13 = viewState.getLoadingState();
                            boolean zIsEmpty7 = viewState.getConversation().m79883f().isEmpty();
                            int i514 = i44;
                            InterfaceC15250v interfaceC15250vM102054E7 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q10 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p7, interfaceC39332eM79957o7, textResourceM79951i7, zM102116t7, zM79960r7, zM79880c7, c26068uM77569a, interfaceC4352n7, function115, listM79952j9, interfaceC4339a16, interfaceC4351m10, interfaceC4339a17, zM79959q7, enumC26811mM79953k13, zIsEmpty7, interfaceC4351m3, interfaceC15250vM102054E7, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q10, TextResource.$stable << 6, ((i514 << 3) & 3670016) | 100663296 | ((i514 << 21) & 1879048192), (i514 >> 21) & 14, 2097152);
                            c28655q2 = c28655q10;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p8 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o8 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i8 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e8 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t8 = AbstractC32654p.m102116t(z36, zM79947e8, boolValueOf, boolValueOf2);
                        boolean zM79960r8 = c26804f.getShowStopGenerating();
                        boolean zM79880c8 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n8 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function116 = (Function1) objM87133R10;
                        List<C26810l> listM79952j10 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a18 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m11 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a19 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q8 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k14 = viewState.getLoadingState();
                        boolean zIsEmpty8 = viewState.getConversation().m79883f().isEmpty();
                        int i515 = i44;
                        InterfaceC15250v interfaceC15250vM102054E8 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q11 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p8, interfaceC39332eM79957o8, textResourceM79951i8, zM102116t8, zM79960r8, zM79880c8, c26068uM77569a, interfaceC4352n8, function116, listM79952j10, interfaceC4339a18, interfaceC4351m11, interfaceC4339a19, zM79959q8, enumC26811mM79953k14, zIsEmpty8, interfaceC4351m3, interfaceC15250vM102054E8, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q11, TextResource.$stable << 6, ((i515 << 3) & 3670016) | 100663296 | ((i515 << 21) & 1879048192), (i515 >> 21) & 14, 2097152);
                        c28655q2 = c28655q11;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= 24576;
            function4 = function2;
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z14 = z4;
                } else {
                    z14 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87155h(z14)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        int i4110 = i15;
                        if (c28655q3.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i28 = i4110 | i27;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i28 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i28 |= i34;
                    }
                    i35 = i28;
                    if ((i35 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q3.m87135U(i35 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C32375n(13);
                                c28655q3.m87172p0(objM87133R18);
                            }
                            function3 = (Function1) objM87133R18;
                        }
                        if (i16 != 0) {
                            objM87133R17 = c28655q3.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C32375n(14);
                                c28655q3.m87172p0(objM87133R17);
                            }
                            function6 = (Function1) objM87133R17;
                        } else {
                            function6 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R16 = c28655q3.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(19);
                                c28655q3.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q3.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C32513d(19);
                                c28655q3.m87172p0(objM87133R15);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                        interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c22669g0 = new C22669g0();
                        function7 = function3;
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32693x2();
                            c28655q3.m87172p0(objM87133R2);
                        }
                        c22669g0.f89336w = (C32693x2) objM87133R2;
                        featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                        z19 = z18;
                        if ((i35 & 458752) == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (z24) {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                        List<C26801c> listM79883f9 = viewState.getConversation().m79883f();
                        List<String> listM79884g5 = viewState.getConversation().m79884g();
                        EnumC26811m enumC26811mM79953k15 = viewState.getLoadingState();
                        i36 = i35 & 234881024;
                        if (i36 == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                        objM87133R4 = c28655q3.m87133R();
                        if (zM87157i) {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar8 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar8);
                            objM87133R4 = aVar8;
                        } else {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar9 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar9);
                            objM87133R4 = aVar9;
                        }
                        AbstractC28683x.m87255i(listM79883f9, listM79884g5, enumC26811mM79953k15, (InterfaceC4351m) objM87133R4, c28655q3);
                        Boolean boolValueOf7 = Boolean.valueOf(m102062M(c26068uM77569a));
                        if (i37 == i38) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                        objM87133R5 = c28655q3.m87133R();
                        c28676v2 = c28676v1;
                        if (zM87157i2) {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf7);
                        i39 = i35 & 7168;
                        if (i39 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z28) {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3358c5 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v2) {
                            objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                        }
                        InterfaceC21083i interfaceC21083i5 = (InterfaceC21083i) objM87133R7;
                        zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                        objM87133R8 = c28655q3.m87133R();
                        if (zM87157i3) {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3407d5 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c5, interfaceC21083i5, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                        C23010x c23010xM66775a5 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q3.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q3, modifierM3407d5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a5);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N5);
                        zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                        c23016z = C23016z.f90757a;
                        if (zIsFeatureEnabled) {
                            c28655q3.m87150e0(752864065);
                            int i4111 = i35 << 3;
                            int i4112 = (57344 & i35) | (i4111 & 896) | 6 | (i4111 & 112) | i39;
                            int i4113 = i35 >> 3;
                            boolean z413 = z14;
                            Function1 function117 = function6;
                            i44 = i35;
                            AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function117, z413, viewState.getIsWceLoading(), z26, c28655q3, i4112 | (i4113 & 458752) | (i4113 & 29360128), 0);
                            z29 = z413;
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(false);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function117;
                        } else {
                            z29 = z14;
                            c28655q2 = c28655q3;
                            Function1 function118 = function6;
                            i44 = i35;
                            c28655q2.m87150e0(753275497);
                            int i516 = i44 << 3;
                            AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function118, null, viewState.getIsWceLoading(), c28655q2, (i516 & 896) | 6 | (i516 & 112) | i39 | (i44 & 57344), 16);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function118;
                            c28655q2.m87173q(false);
                        }
                        List<C26801c> listM79883f10 = c26804f.getConversation().m79883f();
                        listIterator = listM79883f10.listIterator(listM79883f10.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                c26801cPrevious = c26801c;
                                break;
                            }
                            c26801cPrevious = listIterator.previous();
                            if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                        } while (!z48);
                        c26801c2 = c26801cPrevious;
                        if (c26801c2 != null) {
                            zM79886b = c26801c2.getFailure();
                            z34 = true;
                            if (zM79886b) {
                                z35 = true;
                            }
                            enumC26811mM79953k = c26804f.getLoadingState();
                            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                            if (enumC26811mM79953k != enumC26811mM79953k2) {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            if (z29) {
                                c28655q2.m87150e0(754377671);
                                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                int iM79958p9 = c26804f.getSendFieldIcon();
                                InterfaceC39332e interfaceC39332eM79957o9 = c26804f.getSendFieldColor();
                                TextResource textResourceM79951i9 = c26804f.getHint();
                                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                    z36 = z34;
                                } else {
                                    z36 = z34;
                                }
                                boolean zM79947e9 = c26804f.getDisableTextField();
                                listM79952j = c26804f.m79952j();
                                if (listM79952j != null) {
                                    list2 = listM79952j;
                                    if (list2 instanceof Collection) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z47);
                                } else {
                                    boolValueOf = c26801c;
                                }
                                listM79952j2 = c26804f.m79952j();
                                if (listM79952j2 != null) {
                                    list = listM79952j2;
                                    if (list instanceof Collection) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf2 = Boolean.valueOf(z46);
                                } else {
                                    boolValueOf2 = c26801c;
                                }
                                boolean zM102116t9 = AbstractC32654p.m102116t(z36, zM79947e9, boolValueOf, boolValueOf2);
                                boolean zM79960r9 = c26804f.getShowStopGenerating();
                                boolean zM79880c9 = c26804f.getConversation().getCanStartNewConversation();
                                if (i39 == 2048) {
                                    z37 = z34;
                                } else {
                                    z37 = false;
                                }
                                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87157i4) {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4352n interfaceC4352n9 = (InterfaceC4352n) objM87133R9;
                                if (i39 == 2048) {
                                    z38 = z34;
                                } else {
                                    z38 = false;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (z38) {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                Function1 function119 = (Function1) objM87133R10;
                                List<C26810l> listM79952j11 = c26804f.m79952j();
                                if (i39 == 2048) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                objM87133R11 = c28655q2.m87133R();
                                if (zM87157i5) {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                InterfaceC4339a interfaceC4339a110 = (InterfaceC4339a) objM87133R11;
                                if (i39 == 2048) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R12 = c28655q2.m87133R();
                                if (z44) {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4351m interfaceC4351m12 = (InterfaceC4351m) objM87133R12;
                                if (i39 == 2048) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                objM87133R13 = c28655q2.m87133R();
                                if (z45) {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                }
                                InterfaceC4339a interfaceC4339a111 = (InterfaceC4339a) objM87133R13;
                                boolean zM79959q9 = viewState.getShowKeyboardOnLaunch();
                                EnumC26811m enumC26811mM79953k16 = viewState.getLoadingState();
                                boolean zIsEmpty9 = viewState.getConversation().m79883f().isEmpty();
                                int i517 = i44;
                                InterfaceC15250v interfaceC15250vM102054E9 = m102054E(interfaceC28601c1);
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v2) {
                                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                C28655q c28655q12 = c28655q2;
                                function10 = function8;
                                AbstractC32700z1.m102618e(iM79958p9, interfaceC39332eM79957o9, textResourceM79951i9, zM102116t9, zM79960r9, zM79880c9, c26068uM77569a, interfaceC4352n9, function119, listM79952j11, interfaceC4339a110, interfaceC4351m12, interfaceC4339a111, zM79959q9, enumC26811mM79953k16, zIsEmpty9, interfaceC4351m3, interfaceC15250vM102054E9, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q12, TextResource.$stable << 6, ((i517 << 3) & 3670016) | 100663296 | ((i517 << 21) & 1879048192), (i517 >> 21) & 14, 2097152);
                                c28655q2 = c28655q12;
                                c28655q2.m87173q(false);
                            } else {
                                function10 = function8;
                                c28655q2.m87150e0(757135741);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q = c28655q2;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a2 = interfaceC4339a3;
                            z17 = z29;
                            z16 = z26;
                            function4 = function9;
                            function5 = function10;
                        } else {
                            z34 = true;
                        }
                        z35 = false;
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p10 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o10 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i10 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e10 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t10 = AbstractC32654p.m102116t(z36, zM79947e10, boolValueOf, boolValueOf2);
                            boolean zM79960r10 = c26804f.getShowStopGenerating();
                            boolean zM79880c10 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n10 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function1110 = (Function1) objM87133R10;
                            List<C26810l> listM79952j12 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a112 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m13 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a113 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q10 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k17 = viewState.getLoadingState();
                            boolean zIsEmpty10 = viewState.getConversation().m79883f().isEmpty();
                            int i518 = i44;
                            InterfaceC15250v interfaceC15250vM102054E10 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q13 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p10, interfaceC39332eM79957o10, textResourceM79951i10, zM102116t10, zM79960r10, zM79880c10, c26068uM77569a, interfaceC4352n10, function1110, listM79952j12, interfaceC4339a112, interfaceC4351m13, interfaceC4339a113, zM79959q10, enumC26811mM79953k17, zIsEmpty10, interfaceC4351m3, interfaceC15250vM102054E10, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q13, TextResource.$stable << 6, ((i518 << 3) & 3670016) | 100663296 | ((i518 << 21) & 1879048192), (i518 >> 21) & 14, 2097152);
                            c28655q2 = c28655q13;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a2 = interfaceC4339a;
                        z16 = z13;
                        function5 = function3;
                        c28655q = c28655q3;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i15;
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f11 = viewState.getConversation().m79883f();
                    List<String> listM79884g6 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k18 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar10 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar10);
                        objM87133R4 = aVar10;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar11 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar11);
                        objM87133R4 = aVar11;
                    }
                    AbstractC28683x.m87255i(listM79883f11, listM79884g6, enumC26811mM79953k18, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf8 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf8);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c6 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i6 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d6 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c6, interfaceC21083i6, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q3.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q3, modifierM3407d6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N6);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i4114 = i35 << 3;
                        int i4115 = (57344 & i35) | (i4114 & 896) | 6 | (i4114 & 112) | i39;
                        int i4116 = i35 >> 3;
                        boolean z414 = z14;
                        Function1 function1111 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function1111, z414, viewState.getIsWceLoading(), z26, c28655q3, i4115 | (i4116 & 458752) | (i4116 & 29360128), 0);
                        z29 = z414;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function1111;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function1112 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i519 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function1112, null, viewState.getIsWceLoading(), c28655q2, (i519 & 896) | 6 | (i519 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function1112;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f12 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f12.listIterator(listM79883f12.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p11 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o11 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i11 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e11 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t11 = AbstractC32654p.m102116t(z36, zM79947e11, boolValueOf, boolValueOf2);
                            boolean zM79960r11 = c26804f.getShowStopGenerating();
                            boolean zM79880c11 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n11 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function1113 = (Function1) objM87133R10;
                            List<C26810l> listM79952j13 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a114 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m14 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a115 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q11 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k19 = viewState.getLoadingState();
                            boolean zIsEmpty11 = viewState.getConversation().m79883f().isEmpty();
                            int i5110 = i44;
                            InterfaceC15250v interfaceC15250vM102054E11 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q14 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p11, interfaceC39332eM79957o11, textResourceM79951i11, zM102116t11, zM79960r11, zM79880c11, c26068uM77569a, interfaceC4352n11, function1113, listM79952j13, interfaceC4339a114, interfaceC4351m14, interfaceC4339a115, zM79959q11, enumC26811mM79953k19, zIsEmpty11, interfaceC4351m3, interfaceC15250vM102054E11, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q14, TextResource.$stable << 6, ((i5110 << 3) & 3670016) | 100663296 | ((i5110 << 21) & 1879048192), (i5110 >> 21) & 14, 2097152);
                            c28655q2 = c28655q14;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p12 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o12 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i12 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e12 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t12 = AbstractC32654p.m102116t(z36, zM79947e12, boolValueOf, boolValueOf2);
                        boolean zM79960r12 = c26804f.getShowStopGenerating();
                        boolean zM79880c12 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n12 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function1114 = (Function1) objM87133R10;
                        List<C26810l> listM79952j14 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a116 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m15 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a117 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q12 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k110 = viewState.getLoadingState();
                        boolean zIsEmpty12 = viewState.getConversation().m79883f().isEmpty();
                        int i5111 = i44;
                        InterfaceC15250v interfaceC15250vM102054E12 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q15 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p12, interfaceC39332eM79957o12, textResourceM79951i12, zM102116t12, zM79960r12, zM79880c12, c26068uM77569a, interfaceC4352n12, function1114, listM79952j14, interfaceC4339a116, interfaceC4351m15, interfaceC4339a117, zM79959q12, enumC26811mM79953k110, zIsEmpty12, interfaceC4351m3, interfaceC15250vM102054E12, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q15, TextResource.$stable << 6, ((i5111 << 3) & 3670016) | 100663296 | ((i5111 << 21) & 1879048192), (i5111 >> 21) & 14, 2097152);
                        c28655q2 = c28655q15;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z14)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    int i4117 = i15;
                    if (c28655q3.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i28 = i4117 | i27;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f13 = viewState.getConversation().m79883f();
                    List<String> listM79884g7 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k111 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar12 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar12);
                        objM87133R4 = aVar12;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar13 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar13);
                        objM87133R4 = aVar13;
                    }
                    AbstractC28683x.m87255i(listM79883f13, listM79884g7, enumC26811mM79953k111, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf9 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf9);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c7 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i7 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d7 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c7, interfaceC21083i7, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a7 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q3.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q3, modifierM3407d7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a7);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N7);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i4118 = i35 << 3;
                        int i4119 = (57344 & i35) | (i4118 & 896) | 6 | (i4118 & 112) | i39;
                        int i41110 = i35 >> 3;
                        boolean z415 = z14;
                        Function1 function1115 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function1115, z415, viewState.getIsWceLoading(), z26, c28655q3, i4119 | (i41110 & 458752) | (i41110 & 29360128), 0);
                        z29 = z415;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function1115;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function1116 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i5112 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function1116, null, viewState.getIsWceLoading(), c28655q2, (i5112 & 896) | 6 | (i5112 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function1116;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f14 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f14.listIterator(listM79883f14.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p13 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o13 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i13 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e13 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t13 = AbstractC32654p.m102116t(z36, zM79947e13, boolValueOf, boolValueOf2);
                            boolean zM79960r13 = c26804f.getShowStopGenerating();
                            boolean zM79880c13 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n13 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function1117 = (Function1) objM87133R10;
                            List<C26810l> listM79952j15 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a118 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m16 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a119 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q13 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k112 = viewState.getLoadingState();
                            boolean zIsEmpty13 = viewState.getConversation().m79883f().isEmpty();
                            int i5113 = i44;
                            InterfaceC15250v interfaceC15250vM102054E13 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q16 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p13, interfaceC39332eM79957o13, textResourceM79951i13, zM102116t13, zM79960r13, zM79880c13, c26068uM77569a, interfaceC4352n13, function1117, listM79952j15, interfaceC4339a118, interfaceC4351m16, interfaceC4339a119, zM79959q13, enumC26811mM79953k112, zIsEmpty13, interfaceC4351m3, interfaceC15250vM102054E13, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q16, TextResource.$stable << 6, ((i5113 << 3) & 3670016) | 100663296 | ((i5113 << 21) & 1879048192), (i5113 >> 21) & 14, 2097152);
                            c28655q2 = c28655q16;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p14 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o14 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i14 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e14 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t14 = AbstractC32654p.m102116t(z36, zM79947e14, boolValueOf, boolValueOf2);
                        boolean zM79960r14 = c26804f.getShowStopGenerating();
                        boolean zM79880c14 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n14 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function1118 = (Function1) objM87133R10;
                        List<C26810l> listM79952j16 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a1110 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m17 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a1111 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q14 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k113 = viewState.getLoadingState();
                        boolean zIsEmpty14 = viewState.getConversation().m79883f().isEmpty();
                        int i5114 = i44;
                        InterfaceC15250v interfaceC15250vM102054E14 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q17 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p14, interfaceC39332eM79957o14, textResourceM79951i14, zM102116t14, zM79960r14, zM79880c14, c26068uM77569a, interfaceC4352n14, function1118, listM79952j16, interfaceC4339a1110, interfaceC4351m17, interfaceC4339a1111, zM79959q14, enumC26811mM79953k113, zIsEmpty14, interfaceC4351m3, interfaceC15250vM102054E14, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q17, TextResource.$stable << 6, ((i5114 << 3) & 3670016) | 100663296 | ((i5114 << 21) & 1879048192), (i5114 >> 21) & 14, 2097152);
                        c28655q2 = c28655q17;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i15;
            i29 = i14 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i34;
            }
            i35 = i28;
            if ((i35 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i35 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R18 = c28655q3.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C32375n(13);
                        c28655q3.m87172p0(objM87133R18);
                    }
                    function3 = (Function1) objM87133R18;
                }
                if (i16 != 0) {
                    objM87133R17 = c28655q3.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C32375n(14);
                        c28655q3.m87172p0(objM87133R17);
                    }
                    function6 = (Function1) objM87133R17;
                } else {
                    function6 = function4;
                }
                if (i18 != 0) {
                    objM87133R16 = c28655q3.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(19);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i24 != 0) {
                    z14 = false;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q3.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32513d(19);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c22669g0 = new C22669g0();
                function7 = function3;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32693x2();
                    c28655q3.m87172p0(objM87133R2);
                }
                c22669g0.f89336w = (C32693x2) objM87133R2;
                featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                z19 = z18;
                if ((i35 & 458752) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (z24) {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                }
                m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                List<C26801c> listM79883f15 = viewState.getConversation().m79883f();
                List<String> listM79884g8 = viewState.getConversation().m79884g();
                EnumC26811m enumC26811mM79953k114 = viewState.getLoadingState();
                i36 = i35 & 234881024;
                if (i36 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar14 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar14);
                    objM87133R4 = aVar14;
                } else {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar15 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar15);
                    objM87133R4 = aVar15;
                }
                AbstractC28683x.m87255i(listM79883f15, listM79884g8, enumC26811mM79953k114, (InterfaceC4351m) objM87133R4, c28655q3);
                Boolean boolValueOf10 = Boolean.valueOf(m102062M(c26068uM77569a));
                if (i37 == i38) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                objM87133R5 = c28655q3.m87133R();
                c28676v2 = c28676v1;
                if (zM87157i2) {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf10);
                i39 = i35 & 7168;
                if (i39 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R6 = c28655q3.m87133R();
                if (z28) {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3358c8 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v2) {
                    objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                }
                InterfaceC21083i interfaceC21083i8 = (InterfaceC21083i) objM87133R7;
                zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                objM87133R8 = c28655q3.m87133R();
                if (zM87157i3) {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d8 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c8, interfaceC21083i8, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                C23010x c23010xM66775a8 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q3.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q3, modifierM3407d8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a8);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N8);
                zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                c23016z = C23016z.f90757a;
                if (zIsFeatureEnabled) {
                    c28655q3.m87150e0(752864065);
                    int i41111 = i35 << 3;
                    int i41112 = (57344 & i35) | (i41111 & 896) | 6 | (i41111 & 112) | i39;
                    int i41113 = i35 >> 3;
                    boolean z416 = z14;
                    Function1 function1119 = function6;
                    i44 = i35;
                    AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function1119, z416, viewState.getIsWceLoading(), z26, c28655q3, i41112 | (i41113 & 458752) | (i41113 & 29360128), 0);
                    z29 = z416;
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function1119;
                } else {
                    z29 = z14;
                    c28655q2 = c28655q3;
                    Function1 function11110 = function6;
                    i44 = i35;
                    c28655q2.m87150e0(753275497);
                    int i5115 = i44 << 3;
                    AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function11110, null, viewState.getIsWceLoading(), c28655q2, (i5115 & 896) | 6 | (i5115 & 112) | i39 | (i44 & 57344), 16);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function11110;
                    c28655q2.m87173q(false);
                }
                List<C26801c> listM79883f16 = c26804f.getConversation().m79883f();
                listIterator = listM79883f16.listIterator(listM79883f16.size());
                do {
                    if (listIterator.hasPrevious()) {
                        c26801cPrevious = c26801c;
                        break;
                    }
                    c26801cPrevious = listIterator.previous();
                    if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                } while (!z48);
                c26801c2 = c26801cPrevious;
                if (c26801c2 != null) {
                    zM79886b = c26801c2.getFailure();
                    z34 = true;
                    if (zM79886b) {
                        z35 = true;
                    }
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p15 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o15 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i15 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e15 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t15 = AbstractC32654p.m102116t(z36, zM79947e15, boolValueOf, boolValueOf2);
                        boolean zM79960r15 = c26804f.getShowStopGenerating();
                        boolean zM79880c15 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n15 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function11111 = (Function1) objM87133R10;
                        List<C26810l> listM79952j17 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a1112 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m18 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a1113 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q15 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k115 = viewState.getLoadingState();
                        boolean zIsEmpty15 = viewState.getConversation().m79883f().isEmpty();
                        int i5116 = i44;
                        InterfaceC15250v interfaceC15250vM102054E15 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q18 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p15, interfaceC39332eM79957o15, textResourceM79951i15, zM102116t15, zM79960r15, zM79880c15, c26068uM77569a, interfaceC4352n15, function11111, listM79952j17, interfaceC4339a1112, interfaceC4351m18, interfaceC4339a1113, zM79959q15, enumC26811mM79953k115, zIsEmpty15, interfaceC4351m3, interfaceC15250vM102054E15, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q18, TextResource.$stable << 6, ((i5116 << 3) & 3670016) | 100663296 | ((i5116 << 21) & 1879048192), (i5116 >> 21) & 14, 2097152);
                        c28655q2 = c28655q18;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    z34 = true;
                }
                z35 = false;
                enumC26811mM79953k = c26804f.getLoadingState();
                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                if (enumC26811mM79953k != enumC26811mM79953k2) {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                }
                if (z29) {
                    c28655q2.m87150e0(754377671);
                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                    int iM79958p16 = c26804f.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o16 = c26804f.getSendFieldColor();
                    TextResource textResourceM79951i16 = c26804f.getHint();
                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        z36 = z34;
                    } else {
                        z36 = z34;
                    }
                    boolean zM79947e16 = c26804f.getDisableTextField();
                    listM79952j = c26804f.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if (list2 instanceof Collection) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z47);
                    } else {
                        boolValueOf = c26801c;
                    }
                    listM79952j2 = c26804f.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z46);
                    } else {
                        boolValueOf2 = c26801c;
                    }
                    boolean zM102116t16 = AbstractC32654p.m102116t(z36, zM79947e16, boolValueOf, boolValueOf2);
                    boolean zM79960r16 = c26804f.getShowStopGenerating();
                    boolean zM79880c16 = c26804f.getConversation().getCanStartNewConversation();
                    if (i39 == 2048) {
                        z37 = z34;
                    } else {
                        z37 = false;
                    }
                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4352n interfaceC4352n16 = (InterfaceC4352n) objM87133R9;
                    if (i39 == 2048) {
                        z38 = z34;
                    } else {
                        z38 = false;
                    }
                    objM87133R10 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Function1 function11112 = (Function1) objM87133R10;
                    List<C26810l> listM79952j18 = c26804f.m79952j();
                    if (i39 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i5) {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a1114 = (InterfaceC4339a) objM87133R11;
                    if (i39 == 2048) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = c28655q2.m87133R();
                    if (z44) {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4351m interfaceC4351m19 = (InterfaceC4351m) objM87133R12;
                    if (i39 == 2048) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z45) {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a1115 = (InterfaceC4339a) objM87133R13;
                    boolean zM79959q16 = viewState.getShowKeyboardOnLaunch();
                    EnumC26811m enumC26811mM79953k116 = viewState.getLoadingState();
                    boolean zIsEmpty16 = viewState.getConversation().m79883f().isEmpty();
                    int i5117 = i44;
                    InterfaceC15250v interfaceC15250vM102054E16 = m102054E(interfaceC28601c1);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    C28655q c28655q19 = c28655q2;
                    function10 = function8;
                    AbstractC32700z1.m102618e(iM79958p16, interfaceC39332eM79957o16, textResourceM79951i16, zM102116t16, zM79960r16, zM79880c16, c26068uM77569a, interfaceC4352n16, function11112, listM79952j18, interfaceC4339a1114, interfaceC4351m19, interfaceC4339a1115, zM79959q16, enumC26811mM79953k116, zIsEmpty16, interfaceC4351m3, interfaceC15250vM102054E16, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q19, TextResource.$stable << 6, ((i5117 << 3) & 3670016) | 100663296 | ((i5117 << 21) & 1879048192), (i5117 >> 21) & 14, 2097152);
                    c28655q2 = c28655q19;
                    c28655q2.m87173q(false);
                } else {
                    function10 = function8;
                    c28655q2.m87150e0(757135741);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a2 = interfaceC4339a3;
                z17 = z29;
                z16 = z26;
                function4 = function9;
                function5 = function10;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a2 = interfaceC4339a;
                z16 = z13;
                function5 = function3;
                c28655q = c28655q3;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
            }
        }
        i15 |= 3072;
        function3 = function1;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                function4 = function2;
                if (c28655q3.m87157i(function4)) {
                    i17 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            i18 = i14 & 32;
            if (i18 != 0) {
                if ((196608 & i13) == 0) {
                    if (c28655q3.m87157i(interfaceC4351m)) {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 64;
                if (i24 != 0) {
                    i15 |= 1572864;
                    z14 = z4;
                } else {
                    z14 = z4;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87155h(z14)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i15 |= i25;
                    }
                }
                i26 = i14 & 128;
                if (i26 != 0) {
                    if ((i13 & 12582912) == 0) {
                        int i41114 = i15;
                        if (c28655q3.m87157i(interfaceC4339a)) {
                            i27 = 8388608;
                        } else {
                            i27 = 4194304;
                        }
                        i28 = i41114 | i27;
                    }
                    i29 = i14 & 256;
                    if (i29 != 0) {
                        i28 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i34 = 67108864;
                        } else {
                            i34 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i28 |= i34;
                    }
                    i35 = i28;
                    if ((i35 & 38347923) != 38347922) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (c28655q3.m87135U(i35 & 1, z15)) {
                        c28676v0 = C28635l.f115821a;
                        if (i45 != 0) {
                            objM87133R18 = c28655q3.m87133R();
                            if (objM87133R18 == c28676v0) {
                                objM87133R18 = new C32375n(13);
                                c28655q3.m87172p0(objM87133R18);
                            }
                            function3 = (Function1) objM87133R18;
                        }
                        if (i16 != 0) {
                            objM87133R17 = c28655q3.m87133R();
                            if (objM87133R17 == c28676v0) {
                                objM87133R17 = new C32375n(14);
                                c28655q3.m87172p0(objM87133R17);
                            }
                            function6 = (Function1) objM87133R17;
                        } else {
                            function6 = function4;
                        }
                        if (i18 != 0) {
                            objM87133R16 = c28655q3.m87133R();
                            if (objM87133R16 == c28676v0) {
                                objM87133R16 = new C31314a(19);
                                c28655q3.m87172p0(objM87133R16);
                            }
                            interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                        } else {
                            interfaceC4351m3 = interfaceC4351m;
                        }
                        if (i24 != 0) {
                            z14 = false;
                        }
                        if (i26 != 0) {
                            objM87133R15 = c28655q3.m87133R();
                            if (objM87133R15 == c28676v0) {
                                objM87133R15 = new C32513d(19);
                                c28655q3.m87172p0(objM87133R15);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                        } else {
                            interfaceC4339a3 = interfaceC4339a;
                        }
                        if (i29 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                        interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                        c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                        objM87133R = c28655q3.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87272z(null);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                        c22669g0 = new C22669g0();
                        function7 = function3;
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C32693x2();
                            c28655q3.m87172p0(objM87133R2);
                        }
                        c22669g0.f89336w = (C32693x2) objM87133R2;
                        featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                        z19 = z18;
                        if ((i35 & 458752) == 131072) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        objM87133R3 = c28655q3.m87133R();
                        if (z24) {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        } else {
                            objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                            c28655q3.m87172p0(objM87133R3);
                        }
                        m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                        List<C26801c> listM79883f17 = viewState.getConversation().m79883f();
                        List<String> listM79884g9 = viewState.getConversation().m79884g();
                        EnumC26811m enumC26811mM79953k117 = viewState.getLoadingState();
                        i36 = i35 & 234881024;
                        if (i36 == 67108864) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                        objM87133R4 = c28655q3.m87133R();
                        if (zM87157i) {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar16 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar16);
                            objM87133R4 = aVar16;
                        } else {
                            c28676v1 = c28676v0;
                            i37 = i36;
                            featureFlagChecker2 = featureFlagChecker;
                            i38 = 67108864;
                            a aVar17 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                            z26 = z19;
                            c28655q3.m87172p0(aVar17);
                            objM87133R4 = aVar17;
                        }
                        AbstractC28683x.m87255i(listM79883f17, listM79884g9, enumC26811mM79953k117, (InterfaceC4351m) objM87133R4, c28655q3);
                        Boolean boolValueOf11 = Boolean.valueOf(m102062M(c26068uM77569a));
                        if (i37 == i38) {
                            z27 = true;
                        } else {
                            z27 = false;
                        }
                        zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                        objM87133R5 = c28655q3.m87133R();
                        c28676v2 = c28676v1;
                        if (zM87157i2) {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                            c28655q3.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf11);
                        i39 = i35 & 7168;
                        if (i39 == 2048) {
                            z28 = true;
                        } else {
                            z28 = false;
                        }
                        objM87133R6 = c28655q3.m87133R();
                        if (z28) {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        } else {
                            c26801c = null;
                            objM87133R6 = new c(function7, null);
                            c28655q3.m87172p0(objM87133R6);
                        }
                        AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                        interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                        Modifier modifierM3358c9 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                        objM87133R7 = c28655q3.m87133R();
                        if (objM87133R7 == c28676v2) {
                            objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                        }
                        InterfaceC21083i interfaceC21083i9 = (InterfaceC21083i) objM87133R7;
                        zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                        objM87133R8 = c28655q3.m87133R();
                        if (zM87157i3) {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new C32683v0(interfaceC15237i, 3);
                            c28655q3.m87172p0(objM87133R8);
                        }
                        Modifier modifierM3407d9 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c9, interfaceC21083i9, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                        C23010x c23010xM66775a9 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                        iHashCode = Long.hashCode(c28655q3.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q3.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q3, modifierM3407d9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q3.m87158i0();
                        if (c28655q3.f115903S) {
                            c28655q3.m87163l(c0213j);
                        } else {
                            c28655q3.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a9);
                        AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q3.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N9);
                        zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                        c23016z = C23016z.f90757a;
                        if (zIsFeatureEnabled) {
                            c28655q3.m87150e0(752864065);
                            int i41115 = i35 << 3;
                            int i41116 = (57344 & i35) | (i41115 & 896) | 6 | (i41115 & 112) | i39;
                            int i41117 = i35 >> 3;
                            boolean z417 = z14;
                            Function1 function11113 = function6;
                            i44 = i35;
                            AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function11113, z417, viewState.getIsWceLoading(), z26, c28655q3, i41116 | (i41117 & 458752) | (i41117 & 29360128), 0);
                            z29 = z417;
                            c28655q2 = c28655q3;
                            c28655q2.m87173q(false);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function11113;
                        } else {
                            z29 = z14;
                            c28655q2 = c28655q3;
                            Function1 function11114 = function6;
                            i44 = i35;
                            c28655q2.m87150e0(753275497);
                            int i5118 = i44 << 3;
                            AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function11114, null, viewState.getIsWceLoading(), c28655q2, (i5118 & 896) | 6 | (i5118 & 112) | i39 | (i44 & 57344), 16);
                            c26804f = viewState;
                            function8 = function7;
                            function9 = function11114;
                            c28655q2.m87173q(false);
                        }
                        List<C26801c> listM79883f18 = c26804f.getConversation().m79883f();
                        listIterator = listM79883f18.listIterator(listM79883f18.size());
                        do {
                            if (listIterator.hasPrevious()) {
                                c26801cPrevious = c26801c;
                                break;
                            }
                            c26801cPrevious = listIterator.previous();
                            if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                        } while (!z48);
                        c26801c2 = c26801cPrevious;
                        if (c26801c2 != null) {
                            zM79886b = c26801c2.getFailure();
                            z34 = true;
                            if (zM79886b) {
                                z35 = true;
                            }
                            enumC26811mM79953k = c26804f.getLoadingState();
                            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                            if (enumC26811mM79953k != enumC26811mM79953k2) {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            } else {
                                c28655q2.m87150e0(753924203);
                                if (!z35) {
                                    enumC26811mM79953k2 = c26804f.getLoadingState();
                                }
                                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                                c28655q2.m87173q(false);
                            }
                            if (z29) {
                                c28655q2.m87150e0(754377671);
                                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                                int iM79958p17 = c26804f.getSendFieldIcon();
                                InterfaceC39332e interfaceC39332eM79957o17 = c26804f.getSendFieldColor();
                                TextResource textResourceM79951i17 = c26804f.getHint();
                                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                    z36 = z34;
                                } else {
                                    z36 = z34;
                                }
                                boolean zM79947e17 = c26804f.getDisableTextField();
                                listM79952j = c26804f.m79952j();
                                if (listM79952j != null) {
                                    list2 = listM79952j;
                                    if (list2 instanceof Collection) {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it3 = list2.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                z47 = false;
                                                break;
                                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                                z47 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf = Boolean.valueOf(z47);
                                } else {
                                    boolValueOf = c26801c;
                                }
                                listM79952j2 = c26804f.m79952j();
                                if (listM79952j2 != null) {
                                    list = listM79952j2;
                                    if (list instanceof Collection) {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                z46 = false;
                                                break;
                                            } else if (((C26810l) it.next()).getIsError()) {
                                                z46 = z34;
                                                break;
                                            }
                                        }
                                    }
                                    boolValueOf2 = Boolean.valueOf(z46);
                                } else {
                                    boolValueOf2 = c26801c;
                                }
                                boolean zM102116t17 = AbstractC32654p.m102116t(z36, zM79947e17, boolValueOf, boolValueOf2);
                                boolean zM79960r17 = c26804f.getShowStopGenerating();
                                boolean zM79880c17 = c26804f.getConversation().getCanStartNewConversation();
                                if (i39 == 2048) {
                                    z37 = z34;
                                } else {
                                    z37 = false;
                                }
                                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                                objM87133R9 = c28655q2.m87133R();
                                if (zM87157i4) {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                } else {
                                    objM87133R9 = new C32629k(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R9);
                                }
                                InterfaceC4352n interfaceC4352n17 = (InterfaceC4352n) objM87133R9;
                                if (i39 == 2048) {
                                    z38 = z34;
                                } else {
                                    z38 = false;
                                }
                                objM87133R10 = c28655q2.m87133R();
                                if (z38) {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                } else {
                                    objM87133R10 = new C32599e(function8, 2);
                                    c28655q2.m87172p0(objM87133R10);
                                }
                                Function1 function11115 = (Function1) objM87133R10;
                                List<C26810l> listM79952j19 = c26804f.m79952j();
                                if (i39 == 2048) {
                                    z39 = true;
                                } else {
                                    z39 = false;
                                }
                                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                                objM87133R11 = c28655q2.m87133R();
                                if (zM87157i5) {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                } else {
                                    objM87133R11 = new C32634l(function8, c26804f, 1);
                                    c28655q2.m87172p0(objM87133R11);
                                }
                                InterfaceC4339a interfaceC4339a1116 = (InterfaceC4339a) objM87133R11;
                                if (i39 == 2048) {
                                    z44 = true;
                                } else {
                                    z44 = false;
                                }
                                objM87133R12 = c28655q2.m87133R();
                                if (z44) {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                } else {
                                    objM87133R12 = new C32639m(function8, 1);
                                    c28655q2.m87172p0(objM87133R12);
                                }
                                InterfaceC4351m interfaceC4351m110 = (InterfaceC4351m) objM87133R12;
                                if (i39 == 2048) {
                                    z45 = true;
                                } else {
                                    z45 = false;
                                }
                                objM87133R13 = c28655q2.m87133R();
                                if (z45) {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                } else {
                                    objM87133R13 = new C32644n(function8, 1);
                                    c28655q2.m87172p0(objM87133R13);
                                }
                                InterfaceC4339a interfaceC4339a1117 = (InterfaceC4339a) objM87133R13;
                                boolean zM79959q17 = viewState.getShowKeyboardOnLaunch();
                                EnumC26811m enumC26811mM79953k118 = viewState.getLoadingState();
                                boolean zIsEmpty17 = viewState.getConversation().m79883f().isEmpty();
                                int i5119 = i44;
                                InterfaceC15250v interfaceC15250vM102054E17 = m102054E(interfaceC28601c1);
                                objM87133R14 = c28655q2.m87133R();
                                if (objM87133R14 == c28676v2) {
                                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                                    c28655q2.m87172p0(objM87133R14);
                                }
                                C28655q c28655q110 = c28655q2;
                                function10 = function8;
                                AbstractC32700z1.m102618e(iM79958p17, interfaceC39332eM79957o17, textResourceM79951i17, zM102116t17, zM79960r17, zM79880c17, c26068uM77569a, interfaceC4352n17, function11115, listM79952j19, interfaceC4339a1116, interfaceC4351m110, interfaceC4339a1117, zM79959q17, enumC26811mM79953k118, zIsEmpty17, interfaceC4351m3, interfaceC15250vM102054E17, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q110, TextResource.$stable << 6, ((i5119 << 3) & 3670016) | 100663296 | ((i5119 << 21) & 1879048192), (i5119 >> 21) & 14, 2097152);
                                c28655q2 = c28655q110;
                                c28655q2.m87173q(false);
                            } else {
                                function10 = function8;
                                c28655q2.m87150e0(757135741);
                                c28655q2.m87173q(false);
                            }
                            c28655q2.m87173q(true);
                            c28655q = c28655q2;
                            interfaceC4351m2 = interfaceC4351m3;
                            interfaceC4339a2 = interfaceC4339a3;
                            z17 = z29;
                            z16 = z26;
                            function4 = function9;
                            function5 = function10;
                        } else {
                            z34 = true;
                        }
                        z35 = false;
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p18 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o18 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i18 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e18 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t18 = AbstractC32654p.m102116t(z36, zM79947e18, boolValueOf, boolValueOf2);
                            boolean zM79960r18 = c26804f.getShowStopGenerating();
                            boolean zM79880c18 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n18 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function11116 = (Function1) objM87133R10;
                            List<C26810l> listM79952j110 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a1118 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m111 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a1119 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q18 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k119 = viewState.getLoadingState();
                            boolean zIsEmpty18 = viewState.getConversation().m79883f().isEmpty();
                            int i51110 = i44;
                            InterfaceC15250v interfaceC15250vM102054E18 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q111 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p18, interfaceC39332eM79957o18, textResourceM79951i18, zM102116t18, zM79960r18, zM79880c18, c26068uM77569a, interfaceC4352n18, function11116, listM79952j110, interfaceC4339a1118, interfaceC4351m111, interfaceC4339a1119, zM79959q18, enumC26811mM79953k119, zIsEmpty18, interfaceC4351m3, interfaceC15250vM102054E18, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q111, TextResource.$stable << 6, ((i51110 << 3) & 3670016) | 100663296 | ((i51110 << 21) & 1879048192), (i51110 >> 21) & 14, 2097152);
                            c28655q2 = c28655q111;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        c28655q3.m87138X();
                        interfaceC4351m2 = interfaceC4351m;
                        interfaceC4339a2 = interfaceC4339a;
                        z16 = z13;
                        function5 = function3;
                        c28655q = c28655q3;
                        z17 = z14;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                    }
                }
                i15 |= 12582912;
                i28 = i15;
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f19 = viewState.getConversation().m79883f();
                    List<String> listM79884g10 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k1110 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar18 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar18);
                        objM87133R4 = aVar18;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar19 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar19);
                        objM87133R4 = aVar19;
                    }
                    AbstractC28683x.m87255i(listM79883f19, listM79884g10, enumC26811mM79953k1110, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf12 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf12);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c10 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i10 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d10 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c10, interfaceC21083i10, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a10 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q3.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q3, modifierM3407d10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a10);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N10);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i41118 = i35 << 3;
                        int i41119 = (57344 & i35) | (i41118 & 896) | 6 | (i41118 & 112) | i39;
                        int i411110 = i35 >> 3;
                        boolean z418 = z14;
                        Function1 function11117 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function11117, z418, viewState.getIsWceLoading(), z26, c28655q3, i41119 | (i411110 & 458752) | (i411110 & 29360128), 0);
                        z29 = z418;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function11117;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function11118 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i51111 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function11118, null, viewState.getIsWceLoading(), c28655q2, (i51111 & 896) | 6 | (i51111 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function11118;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f110 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f110.listIterator(listM79883f110.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p19 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o19 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i19 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e19 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t19 = AbstractC32654p.m102116t(z36, zM79947e19, boolValueOf, boolValueOf2);
                            boolean zM79960r19 = c26804f.getShowStopGenerating();
                            boolean zM79880c19 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n19 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function11119 = (Function1) objM87133R10;
                            List<C26810l> listM79952j111 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a11110 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m112 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a11111 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q19 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k1111 = viewState.getLoadingState();
                            boolean zIsEmpty19 = viewState.getConversation().m79883f().isEmpty();
                            int i51112 = i44;
                            InterfaceC15250v interfaceC15250vM102054E19 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q112 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p19, interfaceC39332eM79957o19, textResourceM79951i19, zM102116t19, zM79960r19, zM79880c19, c26068uM77569a, interfaceC4352n19, function11119, listM79952j111, interfaceC4339a11110, interfaceC4351m112, interfaceC4339a11111, zM79959q19, enumC26811mM79953k1111, zIsEmpty19, interfaceC4351m3, interfaceC15250vM102054E19, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q112, TextResource.$stable << 6, ((i51112 << 3) & 3670016) | 100663296 | ((i51112 << 21) & 1879048192), (i51112 >> 21) & 14, 2097152);
                            c28655q2 = c28655q112;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p110 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o110 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i110 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e110 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t110 = AbstractC32654p.m102116t(z36, zM79947e110, boolValueOf, boolValueOf2);
                        boolean zM79960r110 = c26804f.getShowStopGenerating();
                        boolean zM79880c110 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n110 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function111110 = (Function1) objM87133R10;
                        List<C26810l> listM79952j112 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a11112 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m113 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a11113 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q110 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k1112 = viewState.getLoadingState();
                        boolean zIsEmpty110 = viewState.getConversation().m79883f().isEmpty();
                        int i51113 = i44;
                        InterfaceC15250v interfaceC15250vM102054E110 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q113 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p110, interfaceC39332eM79957o110, textResourceM79951i110, zM102116t110, zM79960r110, zM79880c110, c26068uM77569a, interfaceC4352n110, function111110, listM79952j112, interfaceC4339a11112, interfaceC4351m113, interfaceC4339a11113, zM79959q110, enumC26811mM79953k1112, zIsEmpty110, interfaceC4351m3, interfaceC15250vM102054E110, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q113, TextResource.$stable << 6, ((i51113 << 3) & 3670016) | 100663296 | ((i51113 << 21) & 1879048192), (i51113 >> 21) & 14, 2097152);
                        c28655q2 = c28655q113;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z14)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    int i411111 = i15;
                    if (c28655q3.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i28 = i411111 | i27;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f111 = viewState.getConversation().m79883f();
                    List<String> listM79884g11 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k1113 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar110 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar110);
                        objM87133R4 = aVar110;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar111 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar111);
                        objM87133R4 = aVar111;
                    }
                    AbstractC28683x.m87255i(listM79883f111, listM79884g11, enumC26811mM79953k1113, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf13 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf13);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c11 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i11 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d11 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c11, interfaceC21083i11, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a11 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q3.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q3, modifierM3407d11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a11);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N11);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i411112 = i35 << 3;
                        int i411113 = (57344 & i35) | (i411112 & 896) | 6 | (i411112 & 112) | i39;
                        int i411114 = i35 >> 3;
                        boolean z419 = z14;
                        Function1 function111111 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function111111, z419, viewState.getIsWceLoading(), z26, c28655q3, i411113 | (i411114 & 458752) | (i411114 & 29360128), 0);
                        z29 = z419;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function111111;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function111112 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i51114 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function111112, null, viewState.getIsWceLoading(), c28655q2, (i51114 & 896) | 6 | (i51114 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function111112;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f112 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f112.listIterator(listM79883f112.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p111 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o111 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i111 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e111 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t111 = AbstractC32654p.m102116t(z36, zM79947e111, boolValueOf, boolValueOf2);
                            boolean zM79960r111 = c26804f.getShowStopGenerating();
                            boolean zM79880c111 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n111 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function111113 = (Function1) objM87133R10;
                            List<C26810l> listM79952j113 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a11114 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m114 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a11115 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q111 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k1114 = viewState.getLoadingState();
                            boolean zIsEmpty111 = viewState.getConversation().m79883f().isEmpty();
                            int i51115 = i44;
                            InterfaceC15250v interfaceC15250vM102054E111 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q114 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p111, interfaceC39332eM79957o111, textResourceM79951i111, zM102116t111, zM79960r111, zM79880c111, c26068uM77569a, interfaceC4352n111, function111113, listM79952j113, interfaceC4339a11114, interfaceC4351m114, interfaceC4339a11115, zM79959q111, enumC26811mM79953k1114, zIsEmpty111, interfaceC4351m3, interfaceC15250vM102054E111, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q114, TextResource.$stable << 6, ((i51115 << 3) & 3670016) | 100663296 | ((i51115 << 21) & 1879048192), (i51115 >> 21) & 14, 2097152);
                            c28655q2 = c28655q114;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p112 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o112 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i112 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e112 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t112 = AbstractC32654p.m102116t(z36, zM79947e112, boolValueOf, boolValueOf2);
                        boolean zM79960r112 = c26804f.getShowStopGenerating();
                        boolean zM79880c112 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n112 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function111114 = (Function1) objM87133R10;
                        List<C26810l> listM79952j114 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a11116 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m115 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a11117 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q112 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k1115 = viewState.getLoadingState();
                        boolean zIsEmpty112 = viewState.getConversation().m79883f().isEmpty();
                        int i51116 = i44;
                        InterfaceC15250v interfaceC15250vM102054E112 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q115 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p112, interfaceC39332eM79957o112, textResourceM79951i112, zM102116t112, zM79960r112, zM79880c112, c26068uM77569a, interfaceC4352n112, function111114, listM79952j114, interfaceC4339a11116, interfaceC4351m115, interfaceC4339a11117, zM79959q112, enumC26811mM79953k1115, zIsEmpty112, interfaceC4351m3, interfaceC15250vM102054E112, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q115, TextResource.$stable << 6, ((i51116 << 3) & 3670016) | 100663296 | ((i51116 << 21) & 1879048192), (i51116 >> 21) & 14, 2097152);
                        c28655q2 = c28655q115;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i15;
            i29 = i14 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i34;
            }
            i35 = i28;
            if ((i35 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i35 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R18 = c28655q3.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C32375n(13);
                        c28655q3.m87172p0(objM87133R18);
                    }
                    function3 = (Function1) objM87133R18;
                }
                if (i16 != 0) {
                    objM87133R17 = c28655q3.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C32375n(14);
                        c28655q3.m87172p0(objM87133R17);
                    }
                    function6 = (Function1) objM87133R17;
                } else {
                    function6 = function4;
                }
                if (i18 != 0) {
                    objM87133R16 = c28655q3.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(19);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i24 != 0) {
                    z14 = false;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q3.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32513d(19);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c22669g0 = new C22669g0();
                function7 = function3;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32693x2();
                    c28655q3.m87172p0(objM87133R2);
                }
                c22669g0.f89336w = (C32693x2) objM87133R2;
                featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                z19 = z18;
                if ((i35 & 458752) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (z24) {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                }
                m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                List<C26801c> listM79883f113 = viewState.getConversation().m79883f();
                List<String> listM79884g12 = viewState.getConversation().m79884g();
                EnumC26811m enumC26811mM79953k1116 = viewState.getLoadingState();
                i36 = i35 & 234881024;
                if (i36 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar112 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar112);
                    objM87133R4 = aVar112;
                } else {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar113 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar113);
                    objM87133R4 = aVar113;
                }
                AbstractC28683x.m87255i(listM79883f113, listM79884g12, enumC26811mM79953k1116, (InterfaceC4351m) objM87133R4, c28655q3);
                Boolean boolValueOf14 = Boolean.valueOf(m102062M(c26068uM77569a));
                if (i37 == i38) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                objM87133R5 = c28655q3.m87133R();
                c28676v2 = c28676v1;
                if (zM87157i2) {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf14);
                i39 = i35 & 7168;
                if (i39 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R6 = c28655q3.m87133R();
                if (z28) {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3358c12 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v2) {
                    objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                }
                InterfaceC21083i interfaceC21083i12 = (InterfaceC21083i) objM87133R7;
                zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                objM87133R8 = c28655q3.m87133R();
                if (zM87157i3) {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d12 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c12, interfaceC21083i12, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q3.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q3, modifierM3407d12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N12);
                zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                c23016z = C23016z.f90757a;
                if (zIsFeatureEnabled) {
                    c28655q3.m87150e0(752864065);
                    int i411115 = i35 << 3;
                    int i411116 = (57344 & i35) | (i411115 & 896) | 6 | (i411115 & 112) | i39;
                    int i411117 = i35 >> 3;
                    boolean z4110 = z14;
                    Function1 function111115 = function6;
                    i44 = i35;
                    AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function111115, z4110, viewState.getIsWceLoading(), z26, c28655q3, i411116 | (i411117 & 458752) | (i411117 & 29360128), 0);
                    z29 = z4110;
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function111115;
                } else {
                    z29 = z14;
                    c28655q2 = c28655q3;
                    Function1 function111116 = function6;
                    i44 = i35;
                    c28655q2.m87150e0(753275497);
                    int i51117 = i44 << 3;
                    AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function111116, null, viewState.getIsWceLoading(), c28655q2, (i51117 & 896) | 6 | (i51117 & 112) | i39 | (i44 & 57344), 16);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function111116;
                    c28655q2.m87173q(false);
                }
                List<C26801c> listM79883f114 = c26804f.getConversation().m79883f();
                listIterator = listM79883f114.listIterator(listM79883f114.size());
                do {
                    if (listIterator.hasPrevious()) {
                        c26801cPrevious = c26801c;
                        break;
                    }
                    c26801cPrevious = listIterator.previous();
                    if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                } while (!z48);
                c26801c2 = c26801cPrevious;
                if (c26801c2 != null) {
                    zM79886b = c26801c2.getFailure();
                    z34 = true;
                    if (zM79886b) {
                        z35 = true;
                    }
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p113 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o113 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i113 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e113 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t113 = AbstractC32654p.m102116t(z36, zM79947e113, boolValueOf, boolValueOf2);
                        boolean zM79960r113 = c26804f.getShowStopGenerating();
                        boolean zM79880c113 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n113 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function111117 = (Function1) objM87133R10;
                        List<C26810l> listM79952j115 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a11118 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m116 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a11119 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q113 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k1117 = viewState.getLoadingState();
                        boolean zIsEmpty113 = viewState.getConversation().m79883f().isEmpty();
                        int i51118 = i44;
                        InterfaceC15250v interfaceC15250vM102054E113 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q116 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p113, interfaceC39332eM79957o113, textResourceM79951i113, zM102116t113, zM79960r113, zM79880c113, c26068uM77569a, interfaceC4352n113, function111117, listM79952j115, interfaceC4339a11118, interfaceC4351m116, interfaceC4339a11119, zM79959q113, enumC26811mM79953k1117, zIsEmpty113, interfaceC4351m3, interfaceC15250vM102054E113, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q116, TextResource.$stable << 6, ((i51118 << 3) & 3670016) | 100663296 | ((i51118 << 21) & 1879048192), (i51118 >> 21) & 14, 2097152);
                        c28655q2 = c28655q116;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    z34 = true;
                }
                z35 = false;
                enumC26811mM79953k = c26804f.getLoadingState();
                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                if (enumC26811mM79953k != enumC26811mM79953k2) {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                }
                if (z29) {
                    c28655q2.m87150e0(754377671);
                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                    int iM79958p114 = c26804f.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o114 = c26804f.getSendFieldColor();
                    TextResource textResourceM79951i114 = c26804f.getHint();
                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        z36 = z34;
                    } else {
                        z36 = z34;
                    }
                    boolean zM79947e114 = c26804f.getDisableTextField();
                    listM79952j = c26804f.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if (list2 instanceof Collection) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z47);
                    } else {
                        boolValueOf = c26801c;
                    }
                    listM79952j2 = c26804f.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z46);
                    } else {
                        boolValueOf2 = c26801c;
                    }
                    boolean zM102116t114 = AbstractC32654p.m102116t(z36, zM79947e114, boolValueOf, boolValueOf2);
                    boolean zM79960r114 = c26804f.getShowStopGenerating();
                    boolean zM79880c114 = c26804f.getConversation().getCanStartNewConversation();
                    if (i39 == 2048) {
                        z37 = z34;
                    } else {
                        z37 = false;
                    }
                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4352n interfaceC4352n114 = (InterfaceC4352n) objM87133R9;
                    if (i39 == 2048) {
                        z38 = z34;
                    } else {
                        z38 = false;
                    }
                    objM87133R10 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Function1 function111118 = (Function1) objM87133R10;
                    List<C26810l> listM79952j116 = c26804f.m79952j();
                    if (i39 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i5) {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a111110 = (InterfaceC4339a) objM87133R11;
                    if (i39 == 2048) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = c28655q2.m87133R();
                    if (z44) {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4351m interfaceC4351m117 = (InterfaceC4351m) objM87133R12;
                    if (i39 == 2048) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z45) {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a111111 = (InterfaceC4339a) objM87133R13;
                    boolean zM79959q114 = viewState.getShowKeyboardOnLaunch();
                    EnumC26811m enumC26811mM79953k1118 = viewState.getLoadingState();
                    boolean zIsEmpty114 = viewState.getConversation().m79883f().isEmpty();
                    int i51119 = i44;
                    InterfaceC15250v interfaceC15250vM102054E114 = m102054E(interfaceC28601c1);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    C28655q c28655q117 = c28655q2;
                    function10 = function8;
                    AbstractC32700z1.m102618e(iM79958p114, interfaceC39332eM79957o114, textResourceM79951i114, zM102116t114, zM79960r114, zM79880c114, c26068uM77569a, interfaceC4352n114, function111118, listM79952j116, interfaceC4339a111110, interfaceC4351m117, interfaceC4339a111111, zM79959q114, enumC26811mM79953k1118, zIsEmpty114, interfaceC4351m3, interfaceC15250vM102054E114, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q117, TextResource.$stable << 6, ((i51119 << 3) & 3670016) | 100663296 | ((i51119 << 21) & 1879048192), (i51119 >> 21) & 14, 2097152);
                    c28655q2 = c28655q117;
                    c28655q2.m87173q(false);
                } else {
                    function10 = function8;
                    c28655q2.m87150e0(757135741);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a2 = interfaceC4339a3;
                z17 = z29;
                z16 = z26;
                function4 = function9;
                function5 = function10;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a2 = interfaceC4339a;
                z16 = z13;
                function5 = function3;
                c28655q = c28655q3;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
            }
        }
        i15 |= 24576;
        function4 = function2;
        i18 = i14 & 32;
        if (i18 != 0) {
            if ((196608 & i13) == 0) {
                if (c28655q3.m87157i(interfaceC4351m)) {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i15 |= i19;
            }
            i24 = i14 & 64;
            if (i24 != 0) {
                i15 |= 1572864;
                z14 = z4;
            } else {
                z14 = z4;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87155h(z14)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i15 |= i25;
                }
            }
            i26 = i14 & 128;
            if (i26 != 0) {
                if ((i13 & 12582912) == 0) {
                    int i411118 = i15;
                    if (c28655q3.m87157i(interfaceC4339a)) {
                        i27 = 8388608;
                    } else {
                        i27 = 4194304;
                    }
                    i28 = i411118 | i27;
                }
                i29 = i14 & 256;
                if (i29 != 0) {
                    i28 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i34 = 67108864;
                    } else {
                        i34 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i28 |= i34;
                }
                i35 = i28;
                if ((i35 & 38347923) != 38347922) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (c28655q3.m87135U(i35 & 1, z15)) {
                    c28676v0 = C28635l.f115821a;
                    if (i45 != 0) {
                        objM87133R18 = c28655q3.m87133R();
                        if (objM87133R18 == c28676v0) {
                            objM87133R18 = new C32375n(13);
                            c28655q3.m87172p0(objM87133R18);
                        }
                        function3 = (Function1) objM87133R18;
                    }
                    if (i16 != 0) {
                        objM87133R17 = c28655q3.m87133R();
                        if (objM87133R17 == c28676v0) {
                            objM87133R17 = new C32375n(14);
                            c28655q3.m87172p0(objM87133R17);
                        }
                        function6 = (Function1) objM87133R17;
                    } else {
                        function6 = function4;
                    }
                    if (i18 != 0) {
                        objM87133R16 = c28655q3.m87133R();
                        if (objM87133R16 == c28676v0) {
                            objM87133R16 = new C31314a(19);
                            c28655q3.m87172p0(objM87133R16);
                        }
                        interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                    } else {
                        interfaceC4351m3 = interfaceC4351m;
                    }
                    if (i24 != 0) {
                        z14 = false;
                    }
                    if (i26 != 0) {
                        objM87133R15 = c28655q3.m87133R();
                        if (objM87133R15 == c28676v0) {
                            objM87133R15 = new C32513d(19);
                            c28655q3.m87172p0(objM87133R15);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                    } else {
                        interfaceC4339a3 = interfaceC4339a;
                    }
                    if (i29 != 0) {
                        z18 = false;
                    } else {
                        z18 = z13;
                    }
                    configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                    interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                    c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                    objM87133R = c28655q3.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87272z(null);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                    c22669g0 = new C22669g0();
                    function7 = function3;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C32693x2();
                        c28655q3.m87172p0(objM87133R2);
                    }
                    c22669g0.f89336w = (C32693x2) objM87133R2;
                    featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                    z19 = z18;
                    if ((i35 & 458752) == 131072) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objM87133R3 = c28655q3.m87133R();
                    if (z24) {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                        c28655q3.m87172p0(objM87133R3);
                    }
                    m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                    List<C26801c> listM79883f115 = viewState.getConversation().m79883f();
                    List<String> listM79884g13 = viewState.getConversation().m79884g();
                    EnumC26811m enumC26811mM79953k1119 = viewState.getLoadingState();
                    i36 = i35 & 234881024;
                    if (i36 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                    objM87133R4 = c28655q3.m87133R();
                    if (zM87157i) {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar114 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar114);
                        objM87133R4 = aVar114;
                    } else {
                        c28676v1 = c28676v0;
                        i37 = i36;
                        featureFlagChecker2 = featureFlagChecker;
                        i38 = 67108864;
                        a aVar115 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                        z26 = z19;
                        c28655q3.m87172p0(aVar115);
                        objM87133R4 = aVar115;
                    }
                    AbstractC28683x.m87255i(listM79883f115, listM79884g13, enumC26811mM79953k1119, (InterfaceC4351m) objM87133R4, c28655q3);
                    Boolean boolValueOf15 = Boolean.valueOf(m102062M(c26068uM77569a));
                    if (i37 == i38) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                    objM87133R5 = c28655q3.m87133R();
                    c28676v2 = c28676v1;
                    if (zM87157i2) {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                        c28655q3.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf15);
                    i39 = i35 & 7168;
                    if (i39 == 2048) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    objM87133R6 = c28655q3.m87133R();
                    if (z28) {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    } else {
                        c26801c = null;
                        objM87133R6 = new c(function7, null);
                        c28655q3.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                    interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                    Modifier modifierM3358c13 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                    objM87133R7 = c28655q3.m87133R();
                    if (objM87133R7 == c28676v2) {
                        objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                    }
                    InterfaceC21083i interfaceC21083i13 = (InterfaceC21083i) objM87133R7;
                    zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                    objM87133R8 = c28655q3.m87133R();
                    if (zM87157i3) {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new C32683v0(interfaceC15237i, 3);
                        c28655q3.m87172p0(objM87133R8);
                    }
                    Modifier modifierM3407d13 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c13, interfaceC21083i13, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                    C23010x c23010xM66775a13 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                    iHashCode = Long.hashCode(c28655q3.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q3.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q3, modifierM3407d13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q3.m87158i0();
                    if (c28655q3.f115903S) {
                        c28655q3.m87163l(c0213j);
                    } else {
                        c28655q3.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a13);
                    AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q3.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N13);
                    zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                    c23016z = C23016z.f90757a;
                    if (zIsFeatureEnabled) {
                        c28655q3.m87150e0(752864065);
                        int i411119 = i35 << 3;
                        int i4111110 = (57344 & i35) | (i411119 & 896) | 6 | (i411119 & 112) | i39;
                        int i4111111 = i35 >> 3;
                        boolean z4111 = z14;
                        Function1 function111119 = function6;
                        i44 = i35;
                        AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function111119, z4111, viewState.getIsWceLoading(), z26, c28655q3, i4111110 | (i4111111 & 458752) | (i4111111 & 29360128), 0);
                        z29 = z4111;
                        c28655q2 = c28655q3;
                        c28655q2.m87173q(false);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function111119;
                    } else {
                        z29 = z14;
                        c28655q2 = c28655q3;
                        Function1 function1111110 = function6;
                        i44 = i35;
                        c28655q2.m87150e0(753275497);
                        int i511110 = i44 << 3;
                        AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function1111110, null, viewState.getIsWceLoading(), c28655q2, (i511110 & 896) | 6 | (i511110 & 112) | i39 | (i44 & 57344), 16);
                        c26804f = viewState;
                        function8 = function7;
                        function9 = function1111110;
                        c28655q2.m87173q(false);
                    }
                    List<C26801c> listM79883f116 = c26804f.getConversation().m79883f();
                    listIterator = listM79883f116.listIterator(listM79883f116.size());
                    do {
                        if (listIterator.hasPrevious()) {
                            c26801cPrevious = c26801c;
                            break;
                        }
                        c26801cPrevious = listIterator.previous();
                        if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                    } while (!z48);
                    c26801c2 = c26801cPrevious;
                    if (c26801c2 != null) {
                        zM79886b = c26801c2.getFailure();
                        z34 = true;
                        if (zM79886b) {
                            z35 = true;
                        }
                        enumC26811mM79953k = c26804f.getLoadingState();
                        enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                        if (enumC26811mM79953k != enumC26811mM79953k2) {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        } else {
                            c28655q2.m87150e0(753924203);
                            if (!z35) {
                                enumC26811mM79953k2 = c26804f.getLoadingState();
                            }
                            AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                            c28655q2.m87173q(false);
                        }
                        if (z29) {
                            c28655q2.m87150e0(754377671);
                            m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                            int iM79958p115 = c26804f.getSendFieldIcon();
                            InterfaceC39332e interfaceC39332eM79957o115 = c26804f.getSendFieldColor();
                            TextResource textResourceM79951i115 = c26804f.getHint();
                            if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                                z36 = z34;
                            } else {
                                z36 = z34;
                            }
                            boolean zM79947e115 = c26804f.getDisableTextField();
                            listM79952j = c26804f.m79952j();
                            if (listM79952j != null) {
                                list2 = listM79952j;
                                if (list2 instanceof Collection) {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            z47 = false;
                                            break;
                                        } else if (((C26810l) it3.next()).getIsUploading()) {
                                            z47 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf = Boolean.valueOf(z47);
                            } else {
                                boolValueOf = c26801c;
                            }
                            listM79952j2 = c26804f.m79952j();
                            if (listM79952j2 != null) {
                                list = listM79952j2;
                                if (list instanceof Collection) {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z46 = false;
                                            break;
                                        } else if (((C26810l) it.next()).getIsError()) {
                                            z46 = z34;
                                            break;
                                        }
                                    }
                                }
                                boolValueOf2 = Boolean.valueOf(z46);
                            } else {
                                boolValueOf2 = c26801c;
                            }
                            boolean zM102116t115 = AbstractC32654p.m102116t(z36, zM79947e115, boolValueOf, boolValueOf2);
                            boolean zM79960r115 = c26804f.getShowStopGenerating();
                            boolean zM79880c115 = c26804f.getConversation().getCanStartNewConversation();
                            if (i39 == 2048) {
                                z37 = z34;
                            } else {
                                z37 = false;
                            }
                            zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                            objM87133R9 = c28655q2.m87133R();
                            if (zM87157i4) {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                objM87133R9 = new C32629k(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R9);
                            }
                            InterfaceC4352n interfaceC4352n115 = (InterfaceC4352n) objM87133R9;
                            if (i39 == 2048) {
                                z38 = z34;
                            } else {
                                z38 = false;
                            }
                            objM87133R10 = c28655q2.m87133R();
                            if (z38) {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            } else {
                                objM87133R10 = new C32599e(function8, 2);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            Function1 function1111111 = (Function1) objM87133R10;
                            List<C26810l> listM79952j117 = c26804f.m79952j();
                            if (i39 == 2048) {
                                z39 = true;
                            } else {
                                z39 = false;
                            }
                            zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                            objM87133R11 = c28655q2.m87133R();
                            if (zM87157i5) {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                objM87133R11 = new C32634l(function8, c26804f, 1);
                                c28655q2.m87172p0(objM87133R11);
                            }
                            InterfaceC4339a interfaceC4339a111112 = (InterfaceC4339a) objM87133R11;
                            if (i39 == 2048) {
                                z44 = true;
                            } else {
                                z44 = false;
                            }
                            objM87133R12 = c28655q2.m87133R();
                            if (z44) {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                objM87133R12 = new C32639m(function8, 1);
                                c28655q2.m87172p0(objM87133R12);
                            }
                            InterfaceC4351m interfaceC4351m118 = (InterfaceC4351m) objM87133R12;
                            if (i39 == 2048) {
                                z45 = true;
                            } else {
                                z45 = false;
                            }
                            objM87133R13 = c28655q2.m87133R();
                            if (z45) {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                objM87133R13 = new C32644n(function8, 1);
                                c28655q2.m87172p0(objM87133R13);
                            }
                            InterfaceC4339a interfaceC4339a111113 = (InterfaceC4339a) objM87133R13;
                            boolean zM79959q115 = viewState.getShowKeyboardOnLaunch();
                            EnumC26811m enumC26811mM79953k11110 = viewState.getLoadingState();
                            boolean zIsEmpty115 = viewState.getConversation().m79883f().isEmpty();
                            int i511111 = i44;
                            InterfaceC15250v interfaceC15250vM102054E115 = m102054E(interfaceC28601c1);
                            objM87133R14 = c28655q2.m87133R();
                            if (objM87133R14 == c28676v2) {
                                objM87133R14 = new C32614h(2, interfaceC28601c1);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            C28655q c28655q118 = c28655q2;
                            function10 = function8;
                            AbstractC32700z1.m102618e(iM79958p115, interfaceC39332eM79957o115, textResourceM79951i115, zM102116t115, zM79960r115, zM79880c115, c26068uM77569a, interfaceC4352n115, function1111111, listM79952j117, interfaceC4339a111112, interfaceC4351m118, interfaceC4339a111113, zM79959q115, enumC26811mM79953k11110, zIsEmpty115, interfaceC4351m3, interfaceC15250vM102054E115, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q118, TextResource.$stable << 6, ((i511111 << 3) & 3670016) | 100663296 | ((i511111 << 21) & 1879048192), (i511111 >> 21) & 14, 2097152);
                            c28655q2 = c28655q118;
                            c28655q2.m87173q(false);
                        } else {
                            function10 = function8;
                            c28655q2.m87150e0(757135741);
                            c28655q2.m87173q(false);
                        }
                        c28655q2.m87173q(true);
                        c28655q = c28655q2;
                        interfaceC4351m2 = interfaceC4351m3;
                        interfaceC4339a2 = interfaceC4339a3;
                        z17 = z29;
                        z16 = z26;
                        function4 = function9;
                        function5 = function10;
                    } else {
                        z34 = true;
                    }
                    z35 = false;
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p116 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o116 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i116 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e116 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t116 = AbstractC32654p.m102116t(z36, zM79947e116, boolValueOf, boolValueOf2);
                        boolean zM79960r116 = c26804f.getShowStopGenerating();
                        boolean zM79880c116 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n116 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function1111112 = (Function1) objM87133R10;
                        List<C26810l> listM79952j118 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a111114 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m119 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a111115 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q116 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k11111 = viewState.getLoadingState();
                        boolean zIsEmpty116 = viewState.getConversation().m79883f().isEmpty();
                        int i511112 = i44;
                        InterfaceC15250v interfaceC15250vM102054E116 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q119 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p116, interfaceC39332eM79957o116, textResourceM79951i116, zM102116t116, zM79960r116, zM79880c116, c26068uM77569a, interfaceC4352n116, function1111112, listM79952j118, interfaceC4339a111114, interfaceC4351m119, interfaceC4339a111115, zM79959q116, enumC26811mM79953k11111, zIsEmpty116, interfaceC4351m3, interfaceC15250vM102054E116, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q119, TextResource.$stable << 6, ((i511112 << 3) & 3670016) | 100663296 | ((i511112 << 21) & 1879048192), (i511112 >> 21) & 14, 2097152);
                        c28655q2 = c28655q119;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    c28655q3.m87138X();
                    interfaceC4351m2 = interfaceC4351m;
                    interfaceC4339a2 = interfaceC4339a;
                    z16 = z13;
                    function5 = function3;
                    c28655q = c28655q3;
                    z17 = z14;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
                }
            }
            i15 |= 12582912;
            i28 = i15;
            i29 = i14 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i34;
            }
            i35 = i28;
            if ((i35 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i35 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R18 = c28655q3.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C32375n(13);
                        c28655q3.m87172p0(objM87133R18);
                    }
                    function3 = (Function1) objM87133R18;
                }
                if (i16 != 0) {
                    objM87133R17 = c28655q3.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C32375n(14);
                        c28655q3.m87172p0(objM87133R17);
                    }
                    function6 = (Function1) objM87133R17;
                } else {
                    function6 = function4;
                }
                if (i18 != 0) {
                    objM87133R16 = c28655q3.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(19);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i24 != 0) {
                    z14 = false;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q3.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32513d(19);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c22669g0 = new C22669g0();
                function7 = function3;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32693x2();
                    c28655q3.m87172p0(objM87133R2);
                }
                c22669g0.f89336w = (C32693x2) objM87133R2;
                featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                z19 = z18;
                if ((i35 & 458752) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (z24) {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                }
                m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                List<C26801c> listM79883f117 = viewState.getConversation().m79883f();
                List<String> listM79884g14 = viewState.getConversation().m79884g();
                EnumC26811m enumC26811mM79953k11112 = viewState.getLoadingState();
                i36 = i35 & 234881024;
                if (i36 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar116 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar116);
                    objM87133R4 = aVar116;
                } else {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar117 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar117);
                    objM87133R4 = aVar117;
                }
                AbstractC28683x.m87255i(listM79883f117, listM79884g14, enumC26811mM79953k11112, (InterfaceC4351m) objM87133R4, c28655q3);
                Boolean boolValueOf16 = Boolean.valueOf(m102062M(c26068uM77569a));
                if (i37 == i38) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                objM87133R5 = c28655q3.m87133R();
                c28676v2 = c28676v1;
                if (zM87157i2) {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf16);
                i39 = i35 & 7168;
                if (i39 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R6 = c28655q3.m87133R();
                if (z28) {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3358c14 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v2) {
                    objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                }
                InterfaceC21083i interfaceC21083i14 = (InterfaceC21083i) objM87133R7;
                zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                objM87133R8 = c28655q3.m87133R();
                if (zM87157i3) {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d14 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c14, interfaceC21083i14, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                C23010x c23010xM66775a14 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q3.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q3, modifierM3407d14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a14);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N14);
                zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                c23016z = C23016z.f90757a;
                if (zIsFeatureEnabled) {
                    c28655q3.m87150e0(752864065);
                    int i4111112 = i35 << 3;
                    int i4111113 = (57344 & i35) | (i4111112 & 896) | 6 | (i4111112 & 112) | i39;
                    int i4111114 = i35 >> 3;
                    boolean z4112 = z14;
                    Function1 function1111113 = function6;
                    i44 = i35;
                    AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function1111113, z4112, viewState.getIsWceLoading(), z26, c28655q3, i4111113 | (i4111114 & 458752) | (i4111114 & 29360128), 0);
                    z29 = z4112;
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function1111113;
                } else {
                    z29 = z14;
                    c28655q2 = c28655q3;
                    Function1 function1111114 = function6;
                    i44 = i35;
                    c28655q2.m87150e0(753275497);
                    int i511113 = i44 << 3;
                    AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function1111114, null, viewState.getIsWceLoading(), c28655q2, (i511113 & 896) | 6 | (i511113 & 112) | i39 | (i44 & 57344), 16);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function1111114;
                    c28655q2.m87173q(false);
                }
                List<C26801c> listM79883f118 = c26804f.getConversation().m79883f();
                listIterator = listM79883f118.listIterator(listM79883f118.size());
                do {
                    if (listIterator.hasPrevious()) {
                        c26801cPrevious = c26801c;
                        break;
                    }
                    c26801cPrevious = listIterator.previous();
                    if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                } while (!z48);
                c26801c2 = c26801cPrevious;
                if (c26801c2 != null) {
                    zM79886b = c26801c2.getFailure();
                    z34 = true;
                    if (zM79886b) {
                        z35 = true;
                    }
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p117 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o117 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i117 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e117 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t117 = AbstractC32654p.m102116t(z36, zM79947e117, boolValueOf, boolValueOf2);
                        boolean zM79960r117 = c26804f.getShowStopGenerating();
                        boolean zM79880c117 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n117 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function1111115 = (Function1) objM87133R10;
                        List<C26810l> listM79952j119 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a111116 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m1110 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a111117 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q117 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k11113 = viewState.getLoadingState();
                        boolean zIsEmpty117 = viewState.getConversation().m79883f().isEmpty();
                        int i511114 = i44;
                        InterfaceC15250v interfaceC15250vM102054E117 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q1110 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p117, interfaceC39332eM79957o117, textResourceM79951i117, zM102116t117, zM79960r117, zM79880c117, c26068uM77569a, interfaceC4352n117, function1111115, listM79952j119, interfaceC4339a111116, interfaceC4351m1110, interfaceC4339a111117, zM79959q117, enumC26811mM79953k11113, zIsEmpty117, interfaceC4351m3, interfaceC15250vM102054E117, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1110, TextResource.$stable << 6, ((i511114 << 3) & 3670016) | 100663296 | ((i511114 << 21) & 1879048192), (i511114 >> 21) & 14, 2097152);
                        c28655q2 = c28655q1110;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    z34 = true;
                }
                z35 = false;
                enumC26811mM79953k = c26804f.getLoadingState();
                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                if (enumC26811mM79953k != enumC26811mM79953k2) {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                }
                if (z29) {
                    c28655q2.m87150e0(754377671);
                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                    int iM79958p118 = c26804f.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o118 = c26804f.getSendFieldColor();
                    TextResource textResourceM79951i118 = c26804f.getHint();
                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        z36 = z34;
                    } else {
                        z36 = z34;
                    }
                    boolean zM79947e118 = c26804f.getDisableTextField();
                    listM79952j = c26804f.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if (list2 instanceof Collection) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z47);
                    } else {
                        boolValueOf = c26801c;
                    }
                    listM79952j2 = c26804f.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z46);
                    } else {
                        boolValueOf2 = c26801c;
                    }
                    boolean zM102116t118 = AbstractC32654p.m102116t(z36, zM79947e118, boolValueOf, boolValueOf2);
                    boolean zM79960r118 = c26804f.getShowStopGenerating();
                    boolean zM79880c118 = c26804f.getConversation().getCanStartNewConversation();
                    if (i39 == 2048) {
                        z37 = z34;
                    } else {
                        z37 = false;
                    }
                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4352n interfaceC4352n118 = (InterfaceC4352n) objM87133R9;
                    if (i39 == 2048) {
                        z38 = z34;
                    } else {
                        z38 = false;
                    }
                    objM87133R10 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Function1 function1111116 = (Function1) objM87133R10;
                    List<C26810l> listM79952j1110 = c26804f.m79952j();
                    if (i39 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i5) {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a111118 = (InterfaceC4339a) objM87133R11;
                    if (i39 == 2048) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = c28655q2.m87133R();
                    if (z44) {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4351m interfaceC4351m1111 = (InterfaceC4351m) objM87133R12;
                    if (i39 == 2048) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z45) {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a111119 = (InterfaceC4339a) objM87133R13;
                    boolean zM79959q118 = viewState.getShowKeyboardOnLaunch();
                    EnumC26811m enumC26811mM79953k11114 = viewState.getLoadingState();
                    boolean zIsEmpty118 = viewState.getConversation().m79883f().isEmpty();
                    int i511115 = i44;
                    InterfaceC15250v interfaceC15250vM102054E118 = m102054E(interfaceC28601c1);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    C28655q c28655q1111 = c28655q2;
                    function10 = function8;
                    AbstractC32700z1.m102618e(iM79958p118, interfaceC39332eM79957o118, textResourceM79951i118, zM102116t118, zM79960r118, zM79880c118, c26068uM77569a, interfaceC4352n118, function1111116, listM79952j1110, interfaceC4339a111118, interfaceC4351m1111, interfaceC4339a111119, zM79959q118, enumC26811mM79953k11114, zIsEmpty118, interfaceC4351m3, interfaceC15250vM102054E118, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1111, TextResource.$stable << 6, ((i511115 << 3) & 3670016) | 100663296 | ((i511115 << 21) & 1879048192), (i511115 >> 21) & 14, 2097152);
                    c28655q2 = c28655q1111;
                    c28655q2.m87173q(false);
                } else {
                    function10 = function8;
                    c28655q2.m87150e0(757135741);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a2 = interfaceC4339a3;
                z17 = z29;
                z16 = z26;
                function4 = function9;
                function5 = function10;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a2 = interfaceC4339a;
                z16 = z13;
                function5 = function3;
                c28655q = c28655q3;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
            }
        }
        i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        i24 = i14 & 64;
        if (i24 != 0) {
            i15 |= 1572864;
            z14 = z4;
        } else {
            z14 = z4;
            if ((i13 & 1572864) == 0) {
                if (c28655q3.m87155h(z14)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i15 |= i25;
            }
        }
        i26 = i14 & 128;
        if (i26 != 0) {
            if ((i13 & 12582912) == 0) {
                int i4111115 = i15;
                if (c28655q3.m87157i(interfaceC4339a)) {
                    i27 = 8388608;
                } else {
                    i27 = 4194304;
                }
                i28 = i4111115 | i27;
            }
            i29 = i14 & 256;
            if (i29 != 0) {
                i28 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i34 = 67108864;
                } else {
                    i34 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i28 |= i34;
            }
            i35 = i28;
            if ((i35 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (c28655q3.m87135U(i35 & 1, z15)) {
                c28676v0 = C28635l.f115821a;
                if (i45 != 0) {
                    objM87133R18 = c28655q3.m87133R();
                    if (objM87133R18 == c28676v0) {
                        objM87133R18 = new C32375n(13);
                        c28655q3.m87172p0(objM87133R18);
                    }
                    function3 = (Function1) objM87133R18;
                }
                if (i16 != 0) {
                    objM87133R17 = c28655q3.m87133R();
                    if (objM87133R17 == c28676v0) {
                        objM87133R17 = new C32375n(14);
                        c28655q3.m87172p0(objM87133R17);
                    }
                    function6 = (Function1) objM87133R17;
                } else {
                    function6 = function4;
                }
                if (i18 != 0) {
                    objM87133R16 = c28655q3.m87133R();
                    if (objM87133R16 == c28676v0) {
                        objM87133R16 = new C31314a(19);
                        c28655q3.m87172p0(objM87133R16);
                    }
                    interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
                } else {
                    interfaceC4351m3 = interfaceC4351m;
                }
                if (i24 != 0) {
                    z14 = false;
                }
                if (i26 != 0) {
                    objM87133R15 = c28655q3.m87133R();
                    if (objM87133R15 == c28676v0) {
                        objM87133R15 = new C32513d(19);
                        c28655q3.m87172p0(objM87133R15);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
                } else {
                    interfaceC4339a3 = interfaceC4339a;
                }
                if (i29 != 0) {
                    z18 = false;
                } else {
                    z18 = z13;
                }
                configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
                interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
                c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
                objM87133R = c28655q3.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87272z(null);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
                c22669g0 = new C22669g0();
                function7 = function3;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C32693x2();
                    c28655q3.m87172p0(objM87133R2);
                }
                c22669g0.f89336w = (C32693x2) objM87133R2;
                featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
                z19 = z18;
                if ((i35 & 458752) == 131072) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objM87133R3 = c28655q3.m87133R();
                if (z24) {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                    c28655q3.m87172p0(objM87133R3);
                }
                m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
                List<C26801c> listM79883f119 = viewState.getConversation().m79883f();
                List<String> listM79884g15 = viewState.getConversation().m79884g();
                EnumC26811m enumC26811mM79953k11115 = viewState.getLoadingState();
                i36 = i35 & 234881024;
                if (i36 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
                objM87133R4 = c28655q3.m87133R();
                if (zM87157i) {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar118 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar118);
                    objM87133R4 = aVar118;
                } else {
                    c28676v1 = c28676v0;
                    i37 = i36;
                    featureFlagChecker2 = featureFlagChecker;
                    i38 = 67108864;
                    a aVar119 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                    z26 = z19;
                    c28655q3.m87172p0(aVar119);
                    objM87133R4 = aVar119;
                }
                AbstractC28683x.m87255i(listM79883f119, listM79884g15, enumC26811mM79953k11115, (InterfaceC4351m) objM87133R4, c28655q3);
                Boolean boolValueOf17 = Boolean.valueOf(m102062M(c26068uM77569a));
                if (i37 == i38) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
                objM87133R5 = c28655q3.m87133R();
                c28676v2 = c28676v1;
                if (zM87157i2) {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                    c28655q3.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf17);
                i39 = i35 & 7168;
                if (i39 == 2048) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                objM87133R6 = c28655q3.m87133R();
                if (z28) {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                } else {
                    c26801c = null;
                    objM87133R6 = new c(function7, null);
                    c28655q3.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
                interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
                Modifier modifierM3358c15 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
                objM87133R7 = c28655q3.m87133R();
                if (objM87133R7 == c28676v2) {
                    objM87133R7 = AbstractC11266d.m30453g(c28655q3);
                }
                InterfaceC21083i interfaceC21083i15 = (InterfaceC21083i) objM87133R7;
                zM87157i3 = c28655q3.m87157i(interfaceC15237i);
                objM87133R8 = c28655q3.m87133R();
                if (zM87157i3) {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new C32683v0(interfaceC15237i, 3);
                    c28655q3.m87172p0(objM87133R8);
                }
                Modifier modifierM3407d15 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c15, interfaceC21083i15, null, false, null, (InterfaceC4339a) objM87133R8, 28));
                C23010x c23010xM66775a15 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
                iHashCode = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q3.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q3, modifierM3407d15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a15);
                AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q3.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N15);
                zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
                c23016z = C23016z.f90757a;
                if (zIsFeatureEnabled) {
                    c28655q3.m87150e0(752864065);
                    int i4111116 = i35 << 3;
                    int i4111117 = (57344 & i35) | (i4111116 & 896) | 6 | (i4111116 & 112) | i39;
                    int i4111118 = i35 >> 3;
                    boolean z4113 = z14;
                    Function1 function1111117 = function6;
                    i44 = i35;
                    AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function1111117, z4113, viewState.getIsWceLoading(), z26, c28655q3, i4111117 | (i4111118 & 458752) | (i4111118 & 29360128), 0);
                    z29 = z4113;
                    c28655q2 = c28655q3;
                    c28655q2.m87173q(false);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function1111117;
                } else {
                    z29 = z14;
                    c28655q2 = c28655q3;
                    Function1 function1111118 = function6;
                    i44 = i35;
                    c28655q2.m87150e0(753275497);
                    int i511116 = i44 << 3;
                    AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function1111118, null, viewState.getIsWceLoading(), c28655q2, (i511116 & 896) | 6 | (i511116 & 112) | i39 | (i44 & 57344), 16);
                    c26804f = viewState;
                    function8 = function7;
                    function9 = function1111118;
                    c28655q2.m87173q(false);
                }
                List<C26801c> listM79883f1110 = c26804f.getConversation().m79883f();
                listIterator = listM79883f1110.listIterator(listM79883f1110.size());
                do {
                    if (listIterator.hasPrevious()) {
                        c26801cPrevious = c26801c;
                        break;
                    }
                    c26801cPrevious = listIterator.previous();
                    if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                } while (!z48);
                c26801c2 = c26801cPrevious;
                if (c26801c2 != null) {
                    zM79886b = c26801c2.getFailure();
                    z34 = true;
                    if (zM79886b) {
                        z35 = true;
                    }
                    enumC26811mM79953k = c26804f.getLoadingState();
                    enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                    if (enumC26811mM79953k != enumC26811mM79953k2) {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    } else {
                        c28655q2.m87150e0(753924203);
                        if (!z35) {
                            enumC26811mM79953k2 = c26804f.getLoadingState();
                        }
                        AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                        c28655q2.m87173q(false);
                    }
                    if (z29) {
                        c28655q2.m87150e0(754377671);
                        m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                        int iM79958p119 = c26804f.getSendFieldIcon();
                        InterfaceC39332e interfaceC39332eM79957o119 = c26804f.getSendFieldColor();
                        TextResource textResourceM79951i119 = c26804f.getHint();
                        if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                            z36 = z34;
                        } else {
                            z36 = z34;
                        }
                        boolean zM79947e119 = c26804f.getDisableTextField();
                        listM79952j = c26804f.m79952j();
                        if (listM79952j != null) {
                            list2 = listM79952j;
                            if (list2 instanceof Collection) {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z47 = false;
                                        break;
                                    } else if (((C26810l) it3.next()).getIsUploading()) {
                                        z47 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf = Boolean.valueOf(z47);
                        } else {
                            boolValueOf = c26801c;
                        }
                        listM79952j2 = c26804f.m79952j();
                        if (listM79952j2 != null) {
                            list = listM79952j2;
                            if (list instanceof Collection) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z46 = false;
                                        break;
                                    } else if (((C26810l) it.next()).getIsError()) {
                                        z46 = z34;
                                        break;
                                    }
                                }
                            }
                            boolValueOf2 = Boolean.valueOf(z46);
                        } else {
                            boolValueOf2 = c26801c;
                        }
                        boolean zM102116t119 = AbstractC32654p.m102116t(z36, zM79947e119, boolValueOf, boolValueOf2);
                        boolean zM79960r119 = c26804f.getShowStopGenerating();
                        boolean zM79880c119 = c26804f.getConversation().getCanStartNewConversation();
                        if (i39 == 2048) {
                            z37 = z34;
                        } else {
                            z37 = false;
                        }
                        zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            objM87133R9 = new C32629k(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        InterfaceC4352n interfaceC4352n119 = (InterfaceC4352n) objM87133R9;
                        if (i39 == 2048) {
                            z38 = z34;
                        } else {
                            z38 = false;
                        }
                        objM87133R10 = c28655q2.m87133R();
                        if (z38) {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new C32599e(function8, 2);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        Function1 function1111119 = (Function1) objM87133R10;
                        List<C26810l> listM79952j1111 = c26804f.m79952j();
                        if (i39 == 2048) {
                            z39 = true;
                        } else {
                            z39 = false;
                        }
                        zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i5) {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new C32634l(function8, c26804f, 1);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        InterfaceC4339a interfaceC4339a1111110 = (InterfaceC4339a) objM87133R11;
                        if (i39 == 2048) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        objM87133R12 = c28655q2.m87133R();
                        if (z44) {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            objM87133R12 = new C32639m(function8, 1);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        InterfaceC4351m interfaceC4351m1112 = (InterfaceC4351m) objM87133R12;
                        if (i39 == 2048) {
                            z45 = true;
                        } else {
                            z45 = false;
                        }
                        objM87133R13 = c28655q2.m87133R();
                        if (z45) {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            objM87133R13 = new C32644n(function8, 1);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        InterfaceC4339a interfaceC4339a1111111 = (InterfaceC4339a) objM87133R13;
                        boolean zM79959q119 = viewState.getShowKeyboardOnLaunch();
                        EnumC26811m enumC26811mM79953k11116 = viewState.getLoadingState();
                        boolean zIsEmpty119 = viewState.getConversation().m79883f().isEmpty();
                        int i511117 = i44;
                        InterfaceC15250v interfaceC15250vM102054E119 = m102054E(interfaceC28601c1);
                        objM87133R14 = c28655q2.m87133R();
                        if (objM87133R14 == c28676v2) {
                            objM87133R14 = new C32614h(2, interfaceC28601c1);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        C28655q c28655q1112 = c28655q2;
                        function10 = function8;
                        AbstractC32700z1.m102618e(iM79958p119, interfaceC39332eM79957o119, textResourceM79951i119, zM102116t119, zM79960r119, zM79880c119, c26068uM77569a, interfaceC4352n119, function1111119, listM79952j1111, interfaceC4339a1111110, interfaceC4351m1112, interfaceC4339a1111111, zM79959q119, enumC26811mM79953k11116, zIsEmpty119, interfaceC4351m3, interfaceC15250vM102054E119, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1112, TextResource.$stable << 6, ((i511117 << 3) & 3670016) | 100663296 | ((i511117 << 21) & 1879048192), (i511117 >> 21) & 14, 2097152);
                        c28655q2 = c28655q1112;
                        c28655q2.m87173q(false);
                    } else {
                        function10 = function8;
                        c28655q2.m87150e0(757135741);
                        c28655q2.m87173q(false);
                    }
                    c28655q2.m87173q(true);
                    c28655q = c28655q2;
                    interfaceC4351m2 = interfaceC4351m3;
                    interfaceC4339a2 = interfaceC4339a3;
                    z17 = z29;
                    z16 = z26;
                    function4 = function9;
                    function5 = function10;
                } else {
                    z34 = true;
                }
                z35 = false;
                enumC26811mM79953k = c26804f.getLoadingState();
                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                if (enumC26811mM79953k != enumC26811mM79953k2) {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                }
                if (z29) {
                    c28655q2.m87150e0(754377671);
                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                    int iM79958p1110 = c26804f.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o1110 = c26804f.getSendFieldColor();
                    TextResource textResourceM79951i1110 = c26804f.getHint();
                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        z36 = z34;
                    } else {
                        z36 = z34;
                    }
                    boolean zM79947e1110 = c26804f.getDisableTextField();
                    listM79952j = c26804f.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if (list2 instanceof Collection) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z47);
                    } else {
                        boolValueOf = c26801c;
                    }
                    listM79952j2 = c26804f.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z46);
                    } else {
                        boolValueOf2 = c26801c;
                    }
                    boolean zM102116t1110 = AbstractC32654p.m102116t(z36, zM79947e1110, boolValueOf, boolValueOf2);
                    boolean zM79960r1110 = c26804f.getShowStopGenerating();
                    boolean zM79880c1110 = c26804f.getConversation().getCanStartNewConversation();
                    if (i39 == 2048) {
                        z37 = z34;
                    } else {
                        z37 = false;
                    }
                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4352n interfaceC4352n1110 = (InterfaceC4352n) objM87133R9;
                    if (i39 == 2048) {
                        z38 = z34;
                    } else {
                        z38 = false;
                    }
                    objM87133R10 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Function1 function11111110 = (Function1) objM87133R10;
                    List<C26810l> listM79952j1112 = c26804f.m79952j();
                    if (i39 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i5) {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a1111112 = (InterfaceC4339a) objM87133R11;
                    if (i39 == 2048) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = c28655q2.m87133R();
                    if (z44) {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4351m interfaceC4351m1113 = (InterfaceC4351m) objM87133R12;
                    if (i39 == 2048) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z45) {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a1111113 = (InterfaceC4339a) objM87133R13;
                    boolean zM79959q1110 = viewState.getShowKeyboardOnLaunch();
                    EnumC26811m enumC26811mM79953k11117 = viewState.getLoadingState();
                    boolean zIsEmpty1110 = viewState.getConversation().m79883f().isEmpty();
                    int i511118 = i44;
                    InterfaceC15250v interfaceC15250vM102054E1110 = m102054E(interfaceC28601c1);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    C28655q c28655q1113 = c28655q2;
                    function10 = function8;
                    AbstractC32700z1.m102618e(iM79958p1110, interfaceC39332eM79957o1110, textResourceM79951i1110, zM102116t1110, zM79960r1110, zM79880c1110, c26068uM77569a, interfaceC4352n1110, function11111110, listM79952j1112, interfaceC4339a1111112, interfaceC4351m1113, interfaceC4339a1111113, zM79959q1110, enumC26811mM79953k11117, zIsEmpty1110, interfaceC4351m3, interfaceC15250vM102054E1110, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1113, TextResource.$stable << 6, ((i511118 << 3) & 3670016) | 100663296 | ((i511118 << 21) & 1879048192), (i511118 >> 21) & 14, 2097152);
                    c28655q2 = c28655q1113;
                    c28655q2.m87173q(false);
                } else {
                    function10 = function8;
                    c28655q2.m87150e0(757135741);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a2 = interfaceC4339a3;
                z17 = z29;
                z16 = z26;
                function4 = function9;
                function5 = function10;
            } else {
                c28655q3.m87138X();
                interfaceC4351m2 = interfaceC4351m;
                interfaceC4339a2 = interfaceC4339a;
                z16 = z13;
                function5 = function3;
                c28655q = c28655q3;
                z17 = z14;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
            }
        }
        i15 |= 12582912;
        i28 = i15;
        i29 = i14 & 256;
        if (i29 != 0) {
            i28 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q3.m87155h(z13)) {
                i34 = 67108864;
            } else {
                i34 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i28 |= i34;
        }
        i35 = i28;
        if ((i35 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (c28655q3.m87135U(i35 & 1, z15)) {
            c28676v0 = C28635l.f115821a;
            if (i45 != 0) {
                objM87133R18 = c28655q3.m87133R();
                if (objM87133R18 == c28676v0) {
                    objM87133R18 = new C32375n(13);
                    c28655q3.m87172p0(objM87133R18);
                }
                function3 = (Function1) objM87133R18;
            }
            if (i16 != 0) {
                objM87133R17 = c28655q3.m87133R();
                if (objM87133R17 == c28676v0) {
                    objM87133R17 = new C32375n(14);
                    c28655q3.m87172p0(objM87133R17);
                }
                function6 = (Function1) objM87133R17;
            } else {
                function6 = function4;
            }
            if (i18 != 0) {
                objM87133R16 = c28655q3.m87133R();
                if (objM87133R16 == c28676v0) {
                    objM87133R16 = new C31314a(19);
                    c28655q3.m87172p0(objM87133R16);
                }
                interfaceC4351m3 = (InterfaceC4351m) objM87133R16;
            } else {
                interfaceC4351m3 = interfaceC4351m;
            }
            if (i24 != 0) {
                z14 = false;
            }
            if (i26 != 0) {
                objM87133R15 = c28655q3.m87133R();
                if (objM87133R15 == c28676v0) {
                    objM87133R15 = new C32513d(19);
                    c28655q3.m87172p0(objM87133R15);
                }
                interfaceC4339a3 = (InterfaceC4339a) objM87133R15;
            } else {
                interfaceC4339a3 = interfaceC4339a;
            }
            if (i29 != 0) {
                z18 = false;
            } else {
                z18 = z13;
            }
            configuration = (Configuration) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4975a);
            interfaceC39171c = (InterfaceC39171c) c28655q3.m87161k(AbstractC2453v1.f9569h);
            c26068uM77569a = AbstractC26071x.m77569a(0, 0, c28655q3, 3);
            objM87133R = c28655q3.m87133R();
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87272z(null);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC28601c1 = (InterfaceC28601c1) objM87133R;
            c22669g0 = new C22669g0();
            function7 = function3;
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = new C32693x2();
                c28655q3.m87172p0(objM87133R2);
            }
            c22669g0.f89336w = (C32693x2) objM87133R2;
            featureFlagChecker = (FeatureFlagChecker) c28655q3.m87161k(AbstractC38073e.m121968p());
            z19 = z18;
            if ((i35 & 458752) == 131072) {
                z24 = true;
            } else {
                z24 = false;
            }
            objM87133R3 = c28655q3.m87133R();
            if (z24) {
                objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                c28655q3.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C32580a0(6, interfaceC4351m3, interfaceC28601c1);
                c28655q3.m87172p0(objM87133R3);
            }
            m102059J(c26068uM77569a, (InterfaceC4339a) objM87133R3, c28655q3, 0);
            List<C26801c> listM79883f1111 = viewState.getConversation().m79883f();
            List<String> listM79884g16 = viewState.getConversation().m79884g();
            EnumC26811m enumC26811mM79953k11118 = viewState.getLoadingState();
            i36 = i35 & 234881024;
            if (i36 == 67108864) {
                z25 = true;
            } else {
                z25 = false;
            }
            zM87157i = z25 | c28655q3.m87157i(featureFlagChecker) | c28655q3.m87157i(viewState) | c28655q3.m87153g(c26068uM77569a) | c28655q3.m87153g(interfaceC39171c) | c28655q3.m87157i(configuration);
            objM87133R4 = c28655q3.m87133R();
            if (zM87157i) {
                c28676v1 = c28676v0;
                i37 = i36;
                featureFlagChecker2 = featureFlagChecker;
                i38 = 67108864;
                a aVar1110 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                z26 = z19;
                c28655q3.m87172p0(aVar1110);
                objM87133R4 = aVar1110;
            } else {
                c28676v1 = c28676v0;
                i37 = i36;
                featureFlagChecker2 = featureFlagChecker;
                i38 = 67108864;
                a aVar1111 = new a(z19, featureFlagChecker2, viewState, c26068uM77569a, interfaceC39171c, configuration, null);
                z26 = z19;
                c28655q3.m87172p0(aVar1111);
                objM87133R4 = aVar1111;
            }
            AbstractC28683x.m87255i(listM79883f1111, listM79884g16, enumC26811mM79953k11118, (InterfaceC4351m) objM87133R4, c28655q3);
            Boolean boolValueOf18 = Boolean.valueOf(m102062M(c26068uM77569a));
            if (i37 == i38) {
                z27 = true;
            } else {
                z27 = false;
            }
            zM87157i2 = z27 | c28655q3.m87157i(featureFlagChecker2) | c28655q3.m87153g(c26068uM77569a);
            objM87133R5 = c28655q3.m87133R();
            c28676v2 = c28676v1;
            if (zM87157i2) {
                objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                c28655q3.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new b(z26, featureFlagChecker2, c26068uM77569a, null);
                c28655q3.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R5, boolValueOf18);
            i39 = i35 & 7168;
            if (i39 == 2048) {
                z28 = true;
            } else {
                z28 = false;
            }
            objM87133R6 = c28655q3.m87133R();
            if (z28) {
                c26801c = null;
                objM87133R6 = new c(function7, null);
                c28655q3.m87172p0(objM87133R6);
            } else {
                c26801c = null;
                objM87133R6 = new c(function7, null);
                c28655q3.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(c28655q3, (InterfaceC4351m) objM87133R6, C23454a0.f92919a);
            interfaceC15237i = (InterfaceC15237i) c28655q3.m87161k(AbstractC2453v1.f9570i);
            Modifier modifierM3358c16 = AbstractC1092a.m3358c(AbstractC1136a.m3599a(C2314t.f9131w, "contentColumn"), C38072d.f163053a.m121949b(c28655q3, C38072d.f163054b).getTransparent(), AbstractC17918w0.f69621a);
            objM87133R7 = c28655q3.m87133R();
            if (objM87133R7 == c28676v2) {
                objM87133R7 = AbstractC11266d.m30453g(c28655q3);
            }
            InterfaceC21083i interfaceC21083i16 = (InterfaceC21083i) objM87133R7;
            zM87157i3 = c28655q3.m87157i(interfaceC15237i);
            objM87133R8 = c28655q3.m87133R();
            if (zM87157i3) {
                objM87133R8 = new C32683v0(interfaceC15237i, 3);
                c28655q3.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new C32683v0(interfaceC15237i, 3);
                c28655q3.m87172p0(objM87133R8);
            }
            Modifier modifierM3407d16 = AbstractC1102d.m3407d(1.0f, AbstractC1092a.m3360e(modifierM3358c16, interfaceC21083i16, null, false, null, (InterfaceC4339a) objM87133R8, 28));
            C23010x c23010xM66775a16 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q3, 0);
            iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q3.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q3, modifierM3407d16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f729g, c23010xM66775a16);
            AbstractC28683x.m87239G(c28655q3, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q3.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q3, C0217k.f726d, modifierM118962N16);
            zIsFeatureEnabled = featureFlagChecker2.isFeatureEnabled("coach-message-streaming-android-v2");
            c23016z = C23016z.f90757a;
            if (zIsFeatureEnabled) {
                c28655q3.m87150e0(752864065);
                int i4111119 = i35 << 3;
                int i41111110 = (57344 & i35) | (i4111119 & 896) | 6 | (i4111119 & 112) | i39;
                int i41111111 = i35 >> 3;
                boolean z4114 = z14;
                Function1 function11111111 = function6;
                i44 = i35;
                AbstractC32673s3.m102320t(c23016z, viewState, onFeedbackClicked, function7, function11111111, z4114, viewState.getIsWceLoading(), z26, c28655q3, i41111110 | (i41111111 & 458752) | (i41111111 & 29360128), 0);
                z29 = z4114;
                c28655q2 = c28655q3;
                c28655q2.m87173q(false);
                c26804f = viewState;
                function8 = function7;
                function9 = function11111111;
            } else {
                z29 = z14;
                c28655q2 = c28655q3;
                Function1 function11111112 = function6;
                i44 = i35;
                c28655q2.m87150e0(753275497);
                int i511119 = i44 << 3;
                AbstractC32668r3.m102263m(c23016z, viewState, onFeedbackClicked, function7, function11111112, null, viewState.getIsWceLoading(), c28655q2, (i511119 & 896) | 6 | (i511119 & 112) | i39 | (i44 & 57344), 16);
                c26804f = viewState;
                function8 = function7;
                function9 = function11111112;
                c28655q2.m87173q(false);
            }
            List<C26801c> listM79883f1112 = c26804f.getConversation().m79883f();
            listIterator = listM79883f1112.listIterator(listM79883f1112.size());
            do {
                if (listIterator.hasPrevious()) {
                    c26801cPrevious = c26801c;
                    break;
                }
                c26801cPrevious = listIterator.previous();
                if (c26801cPrevious.getRole() == EnumC26800b.ASSISTANT) {
                    z48 = true;
                } else {
                    z48 = false;
                }
            } while (!z48);
            c26801c2 = c26801cPrevious;
            if (c26801c2 != null) {
                zM79886b = c26801c2.getFailure();
                z34 = true;
                if (zM79886b) {
                    z35 = true;
                }
                enumC26811mM79953k = c26804f.getLoadingState();
                enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
                if (enumC26811mM79953k != enumC26811mM79953k2) {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                } else {
                    c28655q2.m87150e0(753924203);
                    if (!z35) {
                        enumC26811mM79953k2 = c26804f.getLoadingState();
                    }
                    AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                    c28655q2.m87173q(false);
                }
                if (z29) {
                    c28655q2.m87150e0(754377671);
                    m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                    int iM79958p1111 = c26804f.getSendFieldIcon();
                    InterfaceC39332e interfaceC39332eM79957o1111 = c26804f.getSendFieldColor();
                    TextResource textResourceM79951i1111 = c26804f.getHint();
                    if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                        z36 = z34;
                    } else {
                        z36 = z34;
                    }
                    boolean zM79947e1111 = c26804f.getDisableTextField();
                    listM79952j = c26804f.m79952j();
                    if (listM79952j != null) {
                        list2 = listM79952j;
                        if (list2 instanceof Collection) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z47 = false;
                                    break;
                                } else if (((C26810l) it3.next()).getIsUploading()) {
                                    z47 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z47);
                    } else {
                        boolValueOf = c26801c;
                    }
                    listM79952j2 = c26804f.m79952j();
                    if (listM79952j2 != null) {
                        list = listM79952j2;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z46 = false;
                                    break;
                                } else if (((C26810l) it.next()).getIsError()) {
                                    z46 = z34;
                                    break;
                                }
                            }
                        }
                        boolValueOf2 = Boolean.valueOf(z46);
                    } else {
                        boolValueOf2 = c26801c;
                    }
                    boolean zM102116t1111 = AbstractC32654p.m102116t(z36, zM79947e1111, boolValueOf, boolValueOf2);
                    boolean zM79960r1111 = c26804f.getShowStopGenerating();
                    boolean zM79880c1111 = c26804f.getConversation().getCanStartNewConversation();
                    if (i39 == 2048) {
                        z37 = z34;
                    } else {
                        z37 = false;
                    }
                    zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new C32629k(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    InterfaceC4352n interfaceC4352n1111 = (InterfaceC4352n) objM87133R9;
                    if (i39 == 2048) {
                        z38 = z34;
                    } else {
                        z38 = false;
                    }
                    objM87133R10 = c28655q2.m87133R();
                    if (z38) {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new C32599e(function8, 2);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    Function1 function11111113 = (Function1) objM87133R10;
                    List<C26810l> listM79952j1113 = c26804f.m79952j();
                    if (i39 == 2048) {
                        z39 = true;
                    } else {
                        z39 = false;
                    }
                    zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i5) {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new C32634l(function8, c26804f, 1);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    InterfaceC4339a interfaceC4339a1111114 = (InterfaceC4339a) objM87133R11;
                    if (i39 == 2048) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    objM87133R12 = c28655q2.m87133R();
                    if (z44) {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new C32639m(function8, 1);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    InterfaceC4351m interfaceC4351m1114 = (InterfaceC4351m) objM87133R12;
                    if (i39 == 2048) {
                        z45 = true;
                    } else {
                        z45 = false;
                    }
                    objM87133R13 = c28655q2.m87133R();
                    if (z45) {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new C32644n(function8, 1);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    InterfaceC4339a interfaceC4339a1111115 = (InterfaceC4339a) objM87133R13;
                    boolean zM79959q1111 = viewState.getShowKeyboardOnLaunch();
                    EnumC26811m enumC26811mM79953k11119 = viewState.getLoadingState();
                    boolean zIsEmpty1111 = viewState.getConversation().m79883f().isEmpty();
                    int i5111110 = i44;
                    InterfaceC15250v interfaceC15250vM102054E1111 = m102054E(interfaceC28601c1);
                    objM87133R14 = c28655q2.m87133R();
                    if (objM87133R14 == c28676v2) {
                        objM87133R14 = new C32614h(2, interfaceC28601c1);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    C28655q c28655q1114 = c28655q2;
                    function10 = function8;
                    AbstractC32700z1.m102618e(iM79958p1111, interfaceC39332eM79957o1111, textResourceM79951i1111, zM102116t1111, zM79960r1111, zM79880c1111, c26068uM77569a, interfaceC4352n1111, function11111113, listM79952j1113, interfaceC4339a1111114, interfaceC4351m1114, interfaceC4339a1111115, zM79959q1111, enumC26811mM79953k11119, zIsEmpty1111, interfaceC4351m3, interfaceC15250vM102054E1111, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1114, TextResource.$stable << 6, ((i5111110 << 3) & 3670016) | 100663296 | ((i5111110 << 21) & 1879048192), (i5111110 >> 21) & 14, 2097152);
                    c28655q2 = c28655q1114;
                    c28655q2.m87173q(false);
                } else {
                    function10 = function8;
                    c28655q2.m87150e0(757135741);
                    c28655q2.m87173q(false);
                }
                c28655q2.m87173q(true);
                c28655q = c28655q2;
                interfaceC4351m2 = interfaceC4351m3;
                interfaceC4339a2 = interfaceC4339a3;
                z17 = z29;
                z16 = z26;
                function4 = function9;
                function5 = function10;
            } else {
                z34 = true;
            }
            z35 = false;
            enumC26811mM79953k = c26804f.getLoadingState();
            enumC26811mM79953k2 = EnumC26811m.MESSAGE_ERROR;
            if (enumC26811mM79953k != enumC26811mM79953k2) {
                c28655q2.m87150e0(753924203);
                if (!z35) {
                    enumC26811mM79953k2 = c26804f.getLoadingState();
                }
                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(753924203);
                if (!z35) {
                    enumC26811mM79953k2 = c26804f.getLoadingState();
                }
                AbstractC32667r2.m102247d(enumC26811mM79953k2, new C32694y(c22669g0, c26804f, function8), c28655q2, 0, 0);
                c28655q2.m87173q(false);
            }
            if (z29) {
                c28655q2.m87150e0(754377671);
                m102057H(c26804f, function8, c28655q2, (i44 & 14) | ((i44 >> 6) & 112));
                int iM79958p1112 = c26804f.getSendFieldIcon();
                InterfaceC39332e interfaceC39332eM79957o1112 = c26804f.getSendFieldColor();
                TextResource textResourceM79951i1112 = c26804f.getHint();
                if (c26804f.getLoadingState() != EnumC26811m.MESSAGE_LOADING) {
                    z36 = z34;
                } else {
                    z36 = z34;
                }
                boolean zM79947e1112 = c26804f.getDisableTextField();
                listM79952j = c26804f.m79952j();
                if (listM79952j != null) {
                    list2 = listM79952j;
                    if (list2 instanceof Collection) {
                        it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z47 = false;
                                break;
                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                z47 = z34;
                                break;
                            }
                        }
                    } else {
                        it3 = list2.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                z47 = false;
                                break;
                            } else if (((C26810l) it3.next()).getIsUploading()) {
                                z47 = z34;
                                break;
                            }
                        }
                    }
                    boolValueOf = Boolean.valueOf(z47);
                } else {
                    boolValueOf = c26801c;
                }
                listM79952j2 = c26804f.m79952j();
                if (listM79952j2 != null) {
                    list = listM79952j2;
                    if (list instanceof Collection) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z46 = false;
                                break;
                            } else if (((C26810l) it.next()).getIsError()) {
                                z46 = z34;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z46 = false;
                                break;
                            } else if (((C26810l) it.next()).getIsError()) {
                                z46 = z34;
                                break;
                            }
                        }
                    }
                    boolValueOf2 = Boolean.valueOf(z46);
                } else {
                    boolValueOf2 = c26801c;
                }
                boolean zM102116t1112 = AbstractC32654p.m102116t(z36, zM79947e1112, boolValueOf, boolValueOf2);
                boolean zM79960r1112 = c26804f.getShowStopGenerating();
                boolean zM79880c1112 = c26804f.getConversation().getCanStartNewConversation();
                if (i39 == 2048) {
                    z37 = z34;
                } else {
                    z37 = false;
                }
                zM87157i4 = z37 | c28655q2.m87157i(c26804f);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R9 = new C32629k(function8, c26804f, 1);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new C32629k(function8, c26804f, 1);
                    c28655q2.m87172p0(objM87133R9);
                }
                InterfaceC4352n interfaceC4352n1112 = (InterfaceC4352n) objM87133R9;
                if (i39 == 2048) {
                    z38 = z34;
                } else {
                    z38 = false;
                }
                objM87133R10 = c28655q2.m87133R();
                if (z38) {
                    objM87133R10 = new C32599e(function8, 2);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new C32599e(function8, 2);
                    c28655q2.m87172p0(objM87133R10);
                }
                Function1 function11111114 = (Function1) objM87133R10;
                List<C26810l> listM79952j1114 = c26804f.m79952j();
                if (i39 == 2048) {
                    z39 = true;
                } else {
                    z39 = false;
                }
                zM87157i5 = z39 | c28655q2.m87157i(c26804f);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i5) {
                    objM87133R11 = new C32634l(function8, c26804f, 1);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new C32634l(function8, c26804f, 1);
                    c28655q2.m87172p0(objM87133R11);
                }
                InterfaceC4339a interfaceC4339a1111116 = (InterfaceC4339a) objM87133R11;
                if (i39 == 2048) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                objM87133R12 = c28655q2.m87133R();
                if (z44) {
                    objM87133R12 = new C32639m(function8, 1);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new C32639m(function8, 1);
                    c28655q2.m87172p0(objM87133R12);
                }
                InterfaceC4351m interfaceC4351m1115 = (InterfaceC4351m) objM87133R12;
                if (i39 == 2048) {
                    z45 = true;
                } else {
                    z45 = false;
                }
                objM87133R13 = c28655q2.m87133R();
                if (z45) {
                    objM87133R13 = new C32644n(function8, 1);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new C32644n(function8, 1);
                    c28655q2.m87172p0(objM87133R13);
                }
                InterfaceC4339a interfaceC4339a1111117 = (InterfaceC4339a) objM87133R13;
                boolean zM79959q1112 = viewState.getShowKeyboardOnLaunch();
                EnumC26811m enumC26811mM79953k111110 = viewState.getLoadingState();
                boolean zIsEmpty1112 = viewState.getConversation().m79883f().isEmpty();
                int i5111111 = i44;
                InterfaceC15250v interfaceC15250vM102054E1112 = m102054E(interfaceC28601c1);
                objM87133R14 = c28655q2.m87133R();
                if (objM87133R14 == c28676v2) {
                    objM87133R14 = new C32614h(2, interfaceC28601c1);
                    c28655q2.m87172p0(objM87133R14);
                }
                C28655q c28655q1115 = c28655q2;
                function10 = function8;
                AbstractC32700z1.m102618e(iM79958p1112, interfaceC39332eM79957o1112, textResourceM79951i1112, zM102116t1112, zM79960r1112, zM79880c1112, c26068uM77569a, interfaceC4352n1112, function11111114, listM79952j1114, interfaceC4339a1111116, interfaceC4351m1115, interfaceC4339a1111117, zM79959q1112, enumC26811mM79953k111110, zIsEmpty1112, interfaceC4351m3, interfaceC15250vM102054E1112, (Function1) objM87133R14, mediaPickerLauncher, interfaceC4339a3, null, c28655q1115, TextResource.$stable << 6, ((i5111111 << 3) & 3670016) | 100663296 | ((i5111111 << 21) & 1879048192), (i5111111 >> 21) & 14, 2097152);
                c28655q2 = c28655q1115;
                c28655q2.m87173q(false);
            } else {
                function10 = function8;
                c28655q2.m87150e0(757135741);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q = c28655q2;
            interfaceC4351m2 = interfaceC4351m3;
            interfaceC4339a2 = interfaceC4339a3;
            z17 = z29;
            z16 = z26;
            function4 = function9;
            function5 = function10;
        } else {
            c28655q3.m87138X();
            interfaceC4351m2 = interfaceC4351m;
            interfaceC4339a2 = interfaceC4339a;
            z16 = z13;
            function5 = function3;
            c28655q = c28655q3;
            z17 = z14;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C24678j(viewState, onFeedbackClicked, mediaPickerLauncher, function5, function4, interfaceC4351m2, z17, interfaceC4339a2, z16, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m102080r(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m102081s(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m102082t(InterfaceC15237i interfaceC15237i) {
        ((C15240l) interfaceC15237i).m43339b(false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m102083u(C22669g0 c22669g0, C26804f c26804f, Function1 function1) {
        AbstractC26802d abstractC26802dM102586a = ((C32693x2) c22669g0.f89336w).m102586a(c26804f.getRetryAction());
        if (abstractC26802dM102586a != null) {
            function1.invoke(abstractC26802dM102586a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m102084v(Function1 function1, C26804f c26804f, String message, List list, List list2, boolean z4) {
        AbstractC22676k.m65750j(message, "message");
        List<C26801c> listM79883f = c26804f.getConversation().m79883f();
        int i13 = 0;
        if (!(listM79883f instanceof Collection) || !listM79883f.isEmpty()) {
            Iterator<T> it = listM79883f.iterator();
            while (it.hasNext()) {
                if (((C26801c) it.next()).getRole() == EnumC26800b.USER && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        function1.invoke(new AbstractC26802d.l(message, i13, null, list, list2, z4, null, 68, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m102085w(Function1 function1, Uri it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new AbstractC26802d.r(AbstractC37056f.m118958J(it)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m102086x(Function1 function1, C26804f c26804f) {
        C26801c c26801cPrevious;
        String strM79889e;
        String strM79882e = c26804f.getConversation().getId();
        List<C26801c> listM79883f = c26804f.getConversation().m79883f();
        ListIterator<C26801c> listIterator = listM79883f.listIterator(listM79883f.size());
        do {
            if (!listIterator.hasPrevious()) {
                c26801cPrevious = null;
                break;
            }
            c26801cPrevious = listIterator.previous();
        } while (c26801cPrevious.getRole() != EnumC26800b.ASSISTANT);
        C26801c c26801c = c26801cPrevious;
        if (c26801c == null || (strM79889e = c26801c.getId()) == null) {
            strM79889e = "";
        }
        function1.invoke(new AbstractC26802d.n(strM79882e, strM79889e));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m102087y(Function1 function1, String str, Uri uri) {
        AbstractC22676k.m65750j(uri, "uri");
        function1.invoke(new AbstractC26802d.j(str, uri));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m102088z(Function1 function1) {
        function1.invoke(AbstractC26802d.i.f106778a);
        return C23454a0.f92919a;
    }
}
