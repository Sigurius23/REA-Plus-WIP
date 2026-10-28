package p734sl0;

import a00.C0073h;
import am0.C1001e;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b81.C2799f;
import b91.C2886a;
import bc3.InterfaceC2994c0;
import bm0.C3416s;
import c21.C3891d;
import c41.C4067l5;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm0.C4808e;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiFeedbackTypeKt;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import f21.C14028d;
import gy0.AbstractC16276e;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io2.C20771l0;
import iz0.C21054m;
import j01.C21127d;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k01.C22093e;
import l83.C23454a0;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import nl0.C26801c;
import nl0.C26804f;
import nl0.EnumC26800b;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import ny0.C27273p0;
import o01.AbstractC27348d;
import oz0.C28497c;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p710im1.C18709z0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p745y81.C39336i;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qx0.C30745a;
import qz0.AbstractC30795n;
import r31.C30911f;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tl0.C33916c;
import ul0.C35062d;
import v41.AbstractC35684p;
import v41.InterfaceC35689r0;
import wb3.AbstractC37056f;
import wk0.AbstractC37335a;
import wk0.AbstractC37336b;
import wl0.AbstractC37352a;
import x81.AbstractC38073e;
import x81.C38072d;
import y00.AbstractC38963t7;
import y41.C39215f;
import zk0.C40819i0;

/* JADX INFO: renamed from: sl0.g1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÑ\u0001\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00022\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00112\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001aA\u0010!\u001a\u00020\u00132\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u0011H\u0003¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010$\u001a\u00020#2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\bH\u0003¢\u0006\u0004\b(\u0010)\"\u0018\u0010,\u001a\u00020\u001f*\u00020\u00128CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00062²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00100\u001a\u0004\u0018\u00010\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00101\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lnl0/f;", "viewState", "", "firstMessage", "showIcon", "", "text", "", "Lm91/u;", "items", "feedbackEnabled", "timestamp", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedbackSent", "isLoading", "isComplete", "isStopped", "Lkotlin/Function1;", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "Ll83/a0;", "onFeedbackClicked", "isLastMessage", "Lnl0/d;", "onViewEvent", "Lml0/a;", "onNavigationEvent", "isFromWrapper", "n", "(Lnl0/f;ZZLjava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZZZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V", "suggestions", "conversationId", "", "messageCount", "H", "(Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ly3/f;", "L", "(ZZ)F", "itemViewState", "Landroidx/compose/ui/Modifier;", "K", "(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "M", "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Landroidx/compose/runtime/Composer;I)I", "icon", "Landroid/content/ClipboardManager;", "clipboardManager", "typewriterEffectFinished", "imageUrl", "showCyclingText", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32611g1 {

    /* JADX INFO: renamed from: sl0.g1$a */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.BotAnswerMessageKt$BotAnswerMessage$3$1", m100430f = "BotAnswerMessage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f135167w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f135168x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f135169y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28601c1 f135170z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, boolean z13, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135168x = z4;
            this.f135169y = z13;
            this.f135170z = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f135168x, this.f135169y, this.f135170z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135167w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f135168x || this.f135169y) {
                AbstractC32611g1.m101736F(this.f135170z, true);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.g1$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final b f135171w = new b();

        /* JADX INFO: renamed from: a */
        public final long m101770a(C39336i whoopColor) {
            AbstractC22676k.m65750j(whoopColor, "$this$whoopColor");
            return whoopColor.getBrandWhite();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m101770a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: sl0.g1$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.BotAnswerMessageKt$SuggestionViews$1$1", m100430f = "BotAnswerMessage.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f135172E;

        /* JADX INFO: renamed from: w */
        int f135173w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ List<String> f135174x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f135175y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f135176z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<String> list, String str, Function1 function1, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f135174x = list;
            this.f135175y = str;
            this.f135176z = function1;
            this.f135172E = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f135174x, this.f135175y, this.f135176z, this.f135172E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f135173w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!this.f135174x.isEmpty() && (str = this.f135175y) != null) {
                this.f135176z.invoke(new AbstractC26802d.p(this.f135172E, str, this.f135174x.size()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: sl0.g1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135177a;

        static {
            int[] iArr = new int[AiFeedbackType.values().length];
            try {
                iArr[AiFeedbackType.BETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AiFeedbackType.WORSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f135177a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final Modifier m101731A(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-666828524);
        Modifier modifierM101741K = m101741K(it, c28655q, i13 & 14);
        c28655q.m87173q(false);
        return modifierM101741K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m101732B(C32695y0 c32695y0, int i13, C26804f c26804f, InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, InterfaceC28601c1 interfaceC28601c1, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof ArticleTileModelEvent.Image) {
            m101760q(interfaceC28601c1, ((ArticleTileModelEvent.Image) it).getImageUrl());
        } else {
            c32695y0.m102587a(it, i13, c26804f, interfaceC25312u, function1, function2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m101733C(C26804f c26804f, boolean z4, boolean z13, String str, List list, boolean z14, String str2, AiMessageFeedback aiMessageFeedback, boolean z15, boolean z16, boolean z17, Function1 function1, boolean z18, Function1 function2, Function1 function3, boolean z19, int i13, int i14, int i15, Composer composer, int i16) {
        m101757n(c26804f, z4, z13, str, list, z14, str2, aiMessageFeedback, z15, z16, z17, function1, z18, function2, function3, z19, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    private static final ClipboardManager m101734D(InterfaceC28670t2 interfaceC28670t2) {
        return (ClipboardManager) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: E */
    private static final boolean m101735E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m101736F(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: renamed from: G */
    private static final String m101737G(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: renamed from: H */
    private static final void m101738H(List<String> list, String str, int i13, Function1 function1, Composer composer, int i14) {
        int i15;
        Function1 function2;
        C28655q c28655q;
        String str2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-229229403);
        if ((i14 & 6) == 0) {
            i15 = (c28655q2.m87157i(list) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= c28655q2.m87153g(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= c28655q2.m87149e(i13) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            function2 = function1;
            i15 |= c28655q2.m87157i(function2) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function2 = function1;
        }
        int i16 = i15;
        if (c28655q2.m87135U(i16 & 1, (i16 & 1171) != 1170)) {
            String str3 = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled("wce-android-horizontal-scrolling") ? null : "control";
            int i17 = i16 & 7168;
            boolean zM87157i = (i17 == 2048) | c28655q2.m87157i(list) | c28655q2.m87153g(str3) | ((i16 & 112) == 32);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                str2 = str3;
                c cVar = new c(list, str2, function2, str, null);
                c28655q2.m87172p0(cVar);
                objM87133R = cVar;
            } else {
                str2 = str3;
            }
            AbstractC28683x.m87254h(list, str2, (InterfaceC4351m) objM87133R, c28655q2);
            if (AbstractC22676k.m65745e(str2, "control")) {
                c28655q2.m87150e0(25621104);
                c28655q = c28655q2;
                AbstractC32583a3.m101640d(str, list, i13, function1, c28655q, ((i16 >> 3) & 14) | ((i16 << 3) & 112) | (i16 & 896) | i17, 0);
                c28655q.m87173q(false);
            } else {
                c28655q = c28655q2;
                if (str2 == null) {
                    c28655q.m87150e0(25866066);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(25882589);
                    c28655q.m87173q(false);
                }
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20771l0(list, str, i13, function1, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m101739I(List list, String str, int i13, Function1 function1, int i14, Composer composer, int i15) {
        m101738H(list, str, i13, function1, composer, AbstractC28683x.m87244L(i14 | 1));
        return C23454a0.f92919a;
    }

    @SuppressLint({"ComposableModifierFactory", "ModifierFactoryExtensionFunction"})
    /* JADX INFO: renamed from: K */
    private static final Modifier m101741K(InterfaceC25312u interfaceC25312u, Composer composer, int i13) {
        boolean z4 = interfaceC25312u instanceof C4067l5;
        C2314t c2314t = C2314t.f9131w;
        if (z4 || (interfaceC25312u instanceof C22093e) || (interfaceC25312u instanceof C21127d) || (interfaceC25312u instanceof C3891d) || (interfaceC25312u instanceof C3416s) || (interfaceC25312u instanceof C35062d) || (interfaceC25312u instanceof C39215f)) {
            float f13 = 8;
            return AbstractC1099a.m3398t(c2314t, ((float) 5.5d) * f13, 0.0f, 5 * f13, 0.0f, 10);
        }
        if (interfaceC25312u instanceof C4808e) {
            float f14 = 8;
            return AbstractC1099a.m3398t(c2314t, ((float) 4.0d) * f14, 2 * f14, 5 * f14, 0.0f, 8);
        }
        if (interfaceC25312u instanceof C27273p0) {
            float f15 = 8;
            return AbstractC1099a.m3398t(c2314t, ((float) 4.0d) * f15, 0.0f, 5 * f15, 0.0f, 10);
        }
        if (interfaceC25312u instanceof C1001e) {
            float f16 = 8;
            return AbstractC1099a.m3398t(c2314t, ((float) 5.5d) * f16, 0.0f, 5 * f16, 0.0f, 10);
        }
        if (interfaceC25312u instanceof C33916c) {
            return AbstractC1099a.m3398t(c2314t, ((float) 1.5d) * 8, 0.0f, 0.0f, 0.0f, 14);
        }
        if (interfaceC25312u instanceof C28497c) {
            float f17 = 8;
            return AbstractC1099a.m3398t(c2314t, ((float) 5.5d) * f17, 0.0f, 5 * f17, 1 * f17, 2);
        }
        if (interfaceC25312u instanceof C14028d) {
            return AbstractC1099a.m3396r(c2314t, 2 * 8, 0.0f, 2);
        }
        if (!(interfaceC25312u instanceof C30911f) && !(interfaceC25312u instanceof C2799f)) {
            return c2314t;
        }
        float f18 = 2 * 8;
        return AbstractC1099a.m3398t(c2314t, f18, f18, f18, 0.0f, 8);
    }

    /* JADX INFO: renamed from: L */
    private static final float m101742L(boolean z4, boolean z13) {
        return ((!z13 && z4) ? (float) 3.5d : 0) * 8;
    }

    /* JADX INFO: renamed from: M */
    private static final int m101743M(AiFeedbackType aiFeedbackType, Composer composer, int i13) {
        int i14 = d.f135177a[aiFeedbackType.ordinal()];
        if (i14 == 1) {
            return C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsUp();
        }
        if (i14 == 2) {
            return C38072d.f163053a.m121951d().getVarious().getFeedbackThumbsDown();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Failed to calculate best type for var: r54v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r54v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r54v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r54v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r31v4 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: n */
    public static final void m101757n(nl0.C26804f r36, boolean r37, boolean r38, java.lang.String r39, java.util.List<? extends p720m91.InterfaceC25312u> r40, boolean r41, java.lang.String r42, com.whoop.bot.models.feedback.AiMessageFeedback r43, boolean r44, boolean r45, boolean r46, p715kotlin.jvm.functions.Function1 r47, boolean r48, p715kotlin.jvm.functions.Function1 r49, p715kotlin.jvm.functions.Function1 r50, boolean r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p734sl0.AbstractC32611g1.m101757n(nl0.f, boolean, boolean, java.lang.String, java.util.List, boolean, java.lang.String, com.whoop.bot.models.feedback.AiMessageFeedback, boolean, boolean, boolean, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m101758o(AbstractC26802d it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m101759p(AbstractC25669a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    private static final void m101760q(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m101761r(InterfaceC28601c1 interfaceC28601c1) {
        m101760q(interfaceC28601c1, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m101762s(boolean z4, boolean z13, boolean z14, boolean z15, boolean z16, List list, C26804f c26804f, boolean z17, Function1 function1, String str, boolean z18, InterfaceC28601c1 interfaceC28601c1, final Function1 function2, final C32695y0 c32695y0, boolean z19, AiMessageFeedback aiMessageFeedback, InterfaceC28670t2 interfaceC28670t2, Context context, String str2, Function1 function3, String str3, final InterfaceC28601c1 interfaceC28601c2, Composer composer, int i13) throws Throwable {
        C0209i c0209i;
        int i14;
        Throwable th3;
        C2314t c2314t;
        InterfaceC28601c1 interfaceC28601c3;
        int i15;
        boolean z24;
        C28676v0 c28676v0;
        C26804f c26804f2;
        InterfaceC25312u interfaceC25312u;
        C28676v0 c28676v1;
        boolean z25;
        int i16;
        C28676v0 c28676v2;
        Integer numValueOf;
        Integer num;
        int iM46344k0;
        boolean z26;
        C2314t c2314t2;
        boolean z27;
        C26804f c26804f3 = c26804f;
        final Function1 function4 = function1;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t3), 0.0f, m101742L(z4, z13), 0.0f, 0.0f, 13);
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (!z4 || z14) {
                c0209i = c0209i3;
                i14 = 0;
                c28655q.m87150e0(-1943919903);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1944064053);
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t3, ((float) 1.5d) * 8, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                c0209i = c0209i3;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
                i14 = 0;
                AbstractC27348d.m82519c(null, c28655q, 0, 1);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, i14);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            C28676v0 c28676v3 = C28635l.f115821a;
            if (z15) {
                c28655q.m87150e0(154181287);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v3) {
                    objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                    c28655q.m87172p0(objM87133R);
                }
                InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R;
                if (((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_LONG_LOADING) && m101763t(interfaceC28601c4)) {
                    c28655q.m87150e0(154343076);
                    AbstractC37352a.m119611d(AbstractC1099a.m3398t(c2314t3, ((float) 5.5d) * 8, 0.0f, 0.0f, 0.0f, 14), null, c28655q, 6, 2);
                    c28655q.m87173q(false);
                    th3 = null;
                    c2314t2 = c2314t3;
                    z27 = false;
                } else {
                    c28655q.m87150e0(154481522);
                    float f13 = 8;
                    c2314t2 = c2314t3;
                    float f14 = 4;
                    Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f14 * f14, AbstractC1099a.m3398t(c2314t3, ((float) 5.5d) * f13, 0.0f, 10 * f13, 0.0f, 10)), "loadingAnimation");
                    InterfaceC35689r0.d dVarM113128a = InterfaceC35689r0.d.m113128a(InterfaceC35689r0.d.m113129b(AbstractC16276e.f62212f));
                    int i17 = ((FeatureFlagChecker) c28655q.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.WHOOP_COACH_LONG_LOADING) ? 2 : Integer.MAX_VALUE;
                    Object objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v3) {
                        objM87133R2 = new C32586b1(4, interfaceC28601c4);
                        c28655q.m87172p0(objM87133R2);
                    }
                    th3 = null;
                    AbstractC35684p.m113047h(modifierM3599a, dVarM113128a, false, 0.5f, i17, (InterfaceC4339a) objM87133R2, null, null, null, c28655q, 199686, 452);
                    c28655q = c28655q;
                    z27 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z27);
                interfaceC28601c3 = interfaceC28601c1;
                c2314t = c2314t2;
                i15 = 8;
                z24 = false;
            } else {
                th3 = null;
                c28655q.m87150e0(155213680);
                float f15 = 8;
                float f16 = ((float) 1.5d) * f15;
                Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t3, f16, 0.0f, f16, 1 * f15, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i4);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N4);
                Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t3, 4 * f15, 0.0f, ((float) 8.5d) * f15, 0.0f, 10);
                c2314t = c2314t3;
                boolean z28 = z18 || z16;
                boolean zM79961s = c26804f3.getStoppedByUser();
                boolean zM79962t = c26804f3.getTypewriterEffectFix();
                C21054m c21054mM79955m = c26804f3.getMarkdownStyles();
                C40819i0 c40819i0M79954l = c26804f3.getMarkdownSpacing();
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v3) {
                    interfaceC28601c3 = interfaceC28601c1;
                    objM87133R3 = new C32614h(3, interfaceC28601c3);
                    c28655q.m87172p0(objM87133R3);
                } else {
                    interfaceC28601c3 = interfaceC28601c1;
                }
                i15 = 8;
                AbstractC32637l2.m101983u(str, modifierM3398t3, null, z28, zM79961s, zM79962t, c21054mM79955m, c40819i0M79954l, false, (Function1) objM87133R3, c28655q, (C21054m.f79836p << 18) | 805306416, 260);
                c28655q = c28655q;
                c28655q.m87173q(true);
                z24 = false;
                c28655q.m87173q(false);
            }
            if (m101735E(interfaceC28601c3) || z16) {
                c28655q.m87150e0(156133853);
                int i18 = 0;
                for (Object obj : list) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        AbstractC37056f.m118977d0();
                        throw th3;
                    }
                    InterfaceC25312u interfaceC25312u2 = (InterfaceC25312u) obj;
                    if ((interfaceC25312u2 instanceof C30911f) || (interfaceC25312u2 instanceof C2799f)) {
                        c28655q.m87150e0(-957351878);
                        C25307p c25307pM102010c = AbstractC32640m0.m102010c();
                        C30745a c30745a = new C30745a(11);
                        boolean zM87149e = c28655q.m87149e(i18) | c28655q.m87157i(c26804f3) | c28655q.m87157i(interfaceC25312u2) | c28655q.m87153g(function4) | c28655q.m87153g(function2);
                        Object objM87133R4 = c28655q.m87133R();
                        if (zM87149e || objM87133R4 == c28676v3) {
                            interfaceC25312u = interfaceC25312u2;
                            C18709z0 c18709z0 = new C18709z0(c32695y0, i18, c26804f3, interfaceC25312u, function4, function2);
                            c28655q.m87172p0(c18709z0);
                            objM87133R4 = c18709z0;
                        } else {
                            interfaceC25312u = interfaceC25312u2;
                        }
                        C28655q c28655q2 = c28655q;
                        InterfaceC25312u interfaceC25312u3 = interfaceC25312u;
                        i15 = i15;
                        AbstractC25303l.m74291r(interfaceC25312u3, c25307pM102010c, c30745a, (Function1) objM87133R4, c28655q2, C25307p.f99300b << 3, 0);
                        c28655q = c28655q2;
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-956831977);
                        c28655q.m87173q(false);
                        c26804f3 = c26804f3;
                    }
                    c28676v3 = c28676v3;
                    c26804f3 = c26804f3;
                    i18 = i19;
                }
                c28676v0 = c28676v3;
                c26804f2 = c26804f3;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(156866135);
                c28655q.m87173q(z24);
                c28676v0 = c28676v3;
                c26804f2 = c26804f3;
            }
            if (c26804f2.getDisableTextField() || !m101735E(interfaceC28601c3)) {
                c28676v1 = c28676v0;
                z25 = false;
                function2 = function2;
                c28655q.m87150e0(159311415);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(157017508);
                float f17 = 4;
                Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1099a.m3398t(c2314t, 9 * f17, 0.0f, ((float) 1.5d) * i15, 0.0f, 10), "feedbackRow");
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
                int iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3599a2);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j2 = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                C0209i c0209i6 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                if (z19 || aiMessageFeedback != null) {
                    c28655q.m87150e0(1990243915);
                    AbstractC27274q.b bVar = AbstractC27274q.b.f109138f;
                    int i24 = AbstractC37335a.f159604f;
                    Object objM87133R5 = c28655q.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = b.f135171w;
                        c28655q.m87172p0(objM87133R5);
                    }
                    C27270o c27270o = new C27270o(bVar, i24, p745y81.Function1.m125323a((Function1) objM87133R5), null, null, false, false, false, 0.0f, false, MessageListItemViewType.UNREAD_SEPARATOR, null);
                    String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC37336b.f159681m);
                    boolean zM87153g = c28655q.m87153g(interfaceC28670t2) | c28655q.m87153g(str) | c28655q.m87157i(context) | c28655q.m87153g(str2) | c28655q.m87153g(function4);
                    Object objM87133R6 = c28655q.m87133R();
                    if (zM87153g || objM87133R6 == c28676v0) {
                        c28676v2 = c28676v0;
                        C0073h c0073h = new C0073h(str, context, str2, function4, interfaceC28670t2);
                        function4 = function4;
                        c28655q.m87172p0(c0073h);
                        objM87133R6 = c0073h;
                    } else {
                        c28676v2 = c28676v0;
                    }
                    c28676v1 = c28676v2;
                    AbstractC27242b1.m82092d(c27270o, strM92103Y, null, null, (InterfaceC4339a) objM87133R6, c28655q, C27270o.f109105k, 12);
                    AbstractC38963t7.m124386p(1, f17, c2314t, c28655q);
                    AiFeedbackType aiFeedbackTypeFeedbackFromString = AiFeedbackTypeKt.feedbackFromString(aiMessageFeedback != null ? aiMessageFeedback.getFeedbackType() : th3);
                    if (aiFeedbackTypeFeedbackFromString == null) {
                        c28655q.m87150e0(1991621833);
                        c28655q.m87173q(false);
                        num = th3;
                    } else {
                        c28655q.m87150e0(-1598322120);
                        int iM101743M = m101743M(aiFeedbackTypeFeedbackFromString, c28655q, 0);
                        c28655q.m87173q(false);
                        numValueOf = Integer.valueOf(iM101743M);
                    }
                    if (num != 0) {
                        num = numValueOf;
                        iM46344k0 = num.intValue();
                    } else {
                        num = numValueOf;
                        iM46344k0 = C38072d.f163053a.m121951d().getVarious().getThumbUp();
                    }
                    AbstractC32699z0.m102606e(null, iM46344k0, 0.7f, aiMessageFeedback != null, function3, c28655q, 384, 1);
                    z26 = false;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1991784398);
                    c28655q.m87173q(false);
                    c28676v1 = c28676v0;
                    z26 = false;
                }
                if (str3 == null) {
                    c28655q.m87150e0(1991830711);
                    c28655q.m87173q(z26);
                    z25 = false;
                } else {
                    c28655q.m87150e0(1991830712);
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    AbstractC11895b.m32006y(1.0f, true, c28655q);
                    C38072d c38072d = C38072d.f163053a;
                    int i25 = C38072d.f163054b;
                    C28655q c28655q3 = c28655q;
                    AbstractC30795n.m94707h(str3, null, c38072d.m121949b(c28655q, i25).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i25).getH6(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q3;
                    z25 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(z25);
            }
            if (m101735E(interfaceC28601c3) || z16) {
                c28655q.m87150e0(159401656);
                int i26 = 0;
                for (Object obj2 : list) {
                    int i27 = i26 + 1;
                    if (i26 < 0) {
                        AbstractC37056f.m118977d0();
                        throw th3;
                    }
                    final InterfaceC25312u interfaceC25312u4 = (InterfaceC25312u) obj2;
                    if ((interfaceC25312u4 instanceof C30911f) || (interfaceC25312u4 instanceof C2799f)) {
                        c28676v1 = c28676v1;
                        c28655q.m87150e0(-1912531207);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-1913269255);
                        C25307p c25307pM102010c2 = AbstractC32640m0.m102010c();
                        C30745a c30745a2 = new C30745a(10);
                        boolean zM87149e2 = c28655q.m87149e(i26) | c28655q.m87157i(c26804f2) | c28655q.m87157i(interfaceC25312u4) | c28655q.m87153g(function4) | c28655q.m87153g(function2);
                        Object objM87133R7 = c28655q.m87133R();
                        if (zM87149e2 || objM87133R7 == c28676v1) {
                            final C26804f c26804f4 = c26804f2;
                            final int i28 = i26;
                            Function1 function5 = new Function1() { // from class: sl0.d1
                                @Override // p715kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    return AbstractC32611g1.m101732B(c32695y0, i28, c26804f4, interfaceC25312u4, function4, function2, interfaceC28601c2, obj3);
                                }
                            };
                            c28655q.m87172p0(function5);
                            objM87133R7 = function5;
                        }
                        AbstractC25303l.m74291r(interfaceC25312u4, c25307pM102010c2, c30745a2, (Function1) objM87133R7, c28655q, C25307p.f99300b << 3, 0);
                        c28655q.m87173q(false);
                    }
                    c26804f2 = c26804f;
                    function4 = function1;
                    function2 = function2;
                    i26 = i27;
                    c28676v1 = c28676v1;
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(160354007);
                c28655q.m87173q(z25);
            }
            if (!m101735E(interfaceC28601c3) || c26804f.getConversation().m79884g().isEmpty() || !z17 || c26804f.getLoadingState() == EnumC26811m.MESSAGE_LOADING) {
                c28655q.m87150e0(160924407);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(160538085);
                List<String> listM79884g = c26804f.getConversation().m79884g();
                String strM79882e = c26804f.getConversation().getId();
                List<C26801c> listM79883f = c26804f.getConversation().m79883f();
                if ((listM79883f instanceof Collection) && listM79883f.isEmpty()) {
                    i16 = 0;
                } else {
                    Iterator<T> it = listM79883f.iterator();
                    i16 = 0;
                    while (it.hasNext()) {
                        if (((C26801c) it.next()).getRole() == EnumC26800b.USER && (i16 = i16 + 1) < 0) {
                            AbstractC37056f.m118976c0();
                            throw th3;
                        }
                    }
                }
                m101738H(listM79884g, strM79882e, i16, function1, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final boolean m101763t(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: u */
    private static final void m101764u(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m101765v(InterfaceC28601c1 interfaceC28601c1) {
        m101764u(interfaceC28601c1, !m101763t(interfaceC28601c1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m101766w(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        m101736F(interfaceC28601c1, z4);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Modifier m101767x(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1289610666);
        Modifier modifierM101741K = m101741K(it, c28655q, i13 & 14);
        c28655q.m87173q(false);
        return modifierM101741K;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m101768y(C32695y0 c32695y0, int i13, C26804f c26804f, InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, Object it) {
        AbstractC22676k.m65750j(it, "it");
        c32695y0.m102587a(it, i13, c26804f, interfaceC25312u, function1, function2);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m101769z(String str, Context context, String str2, Function1 function1, InterfaceC28670t2 interfaceC28670t2) {
        m101734D(interfaceC28670t2).setPrimaryClip(ClipData.newPlainText("Copied Text", str));
        if (Build.VERSION.SDK_INT < 33) {
            Toast.makeText(context, str2, 1).show();
        }
        function1.invoke(AbstractC26802d.b.f106764a);
        return C23454a0.f92919a;
    }
}
