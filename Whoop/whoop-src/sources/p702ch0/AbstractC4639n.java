package p702ch0;

import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.p018ui.layout.AbstractC1132b;
import androidx.compose.p018ui.layout.LayoutBoundsElement;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import c13.AbstractC3855a;
import c62.C4273a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ih0.AbstractC18486c;
import ih0.InterfaceC18484b;
import iz0.AbstractC21050i;
import j93.InterfaceC21467g;
import java.util.List;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import nl0.C26805g;
import nl0.C26809k;
import nl0.EnumC26811m;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13821r1;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39141w;
import p635y2.InterfaceC39127r0;
import p635y2.InterfaceC39147y;
import p668z1.C39970s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.C32645n0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import yg0.AbstractC39523b;
import zg0.AbstractC40624g;
import zg0.C40622e;
import zg0.C40625h;
import zg0.C40626i;
import zk0.AbstractC40817h0;

/* JADX INFO: renamed from: ch0.n */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aû\u0001\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\r0\n2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\n2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0011\u0012\u0004\u0012\u00020\r0\n2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\n2\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\r0\n2\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010#\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019H\u0003¢\u0006\u0004\b#\u0010$\u001a?\u0010%\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b%\u0010&¨\u0006.²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\u001a\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010)\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010+\u001a\u00020*8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\u0010\u0010-\u001a\u0004\u0018\u00010\f8\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lch0/v0;", "coordinator", "Lsl0/n0;", "screenArgs", "Landroidx/compose/ui/Modifier;", "modifier", "Lf0/r1;", "scrollState", "Ly3/f;", "bottomContentPadding", "Lkotlin/Function1;", "", "", "Ll83/a0;", "onSuggestionsChanged", "Lcom/whoop/design/util/TextResource;", "onBetaTagChanged", "Lkotlin/Function0;", "onBetaTagClickChanged", "Lch0/b;", "onInputStateChanged", "Lnl0/m;", "onMessageErrorStateChanged", "Lnl0/k;", "onSubmitErrorToastChanged", "", "scrollToBottomArrowEnabled", "Lch0/d0;", "scrolling", "onTurnCompleted", "s", "(Lch0/v0;Lsl0/n0;Landroidx/compose/ui/Modifier;Lf0/r1;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLch0/d0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lzg0/i;", "viewState", "pinsLatestResponse", "V", "(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZZLandroidx/compose/runtime/Composer;I)V", "D", "(Lch0/v0;Lzg0/i;Landroidx/compose/ui/Modifier;Lf0/r1;FZLandroidx/compose/runtime/Composer;I)V", "currentOnTurnCompleted", "initialScrollHandled", "appliedScrollToTurnId", "", "viewportTopY", "currentViewState", "lastInViewTurnId", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4639n {

    /* JADX INFO: renamed from: ch0.n$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$10$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18799w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18800x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18801y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4656v0 f18802z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1, InterfaceC28670t2 interfaceC28670t2, C4656v0 c4656v0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18800x = function1;
            this.f18801y = interfaceC28670t2;
            this.f18802z = c4656v0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final C23454a0 m14523h(C26805g c26805g, C4656v0 c4656v0) {
            C9598e c9598eM79966b = c26805g.getNavigationAction();
            c4656v0.m14701v(c9598eM79966b != null ? new AbstractC39523b.a(c9598eM79966b) : new AbstractC39523b.c(c26805g.getDestination()), null);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f18800x, this.f18801y, this.f18802z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18799w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            int i13 = 0;
            this.f18800x.invoke(new C4637m(i13, AbstractC4639n.m14464C(this.f18801y).getConversation().getBetaTagViewState(), this.f18802z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$11$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18803w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18804x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18805y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18804x = function1;
            this.f18805y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f18804x, this.f18805y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18803w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18804x.invoke(new C4605b(!AbstractC4639n.m14464C(this.f18805y).getDisableTextField(), AbstractC4639n.m14464C(this.f18805y).getShowStopGenerating()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$c */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$12$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18806w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18807x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18808y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18807x = function1;
            this.f18808y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f18807x, this.f18808y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18806w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18807x.invoke(AbstractC4639n.m14464C(this.f18808y).getLoadingState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$d */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$13$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18809w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18810x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18811y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18810x = function1;
            this.f18811y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f18810x, this.f18811y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18809w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18810x.invoke(AbstractC4639n.m14464C(this.f18811y).getSubmitErrorToastState());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$e */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$14$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18812w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4656v0 f18813x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18814y;

        /* JADX INFO: renamed from: ch0.n$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC28670t2 f18815w;

            public a(InterfaceC28670t2 interfaceC28670t2) {
                this.f18815w = interfaceC28670t2;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Function1 function1M14517v = AbstractC4639n.m14517v(this.f18815w);
                if (function1M14517v != null) {
                    function1M14517v.invoke(str);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C4656v0 c4656v0, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18813x = c4656v0;
            this.f18814y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f18813x, this.f18814y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18812w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM131819q = this.f18813x.getViewModel().getTurnCompletions();
                a aVar = new a(this.f18814y);
                this.f18812w = 1;
                if (interfaceC13058lM131819q.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ch0.n$f */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class f extends C22672i implements Function1 {
        public f(Object obj) {
            super(1, 0, C4656v0.class, obj, "trackFormAnalytic", "trackFormAnalytic(Lcom/whoop/ai/chat/view/formwidget/FormAnalyticEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14525a(InterfaceC18484b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4656v0) this.receiver).m14678F(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14525a((InterfaceC18484b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$g */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$7$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18816w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4656v0 f18817x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32645n0 f18818y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C4656v0 c4656v0, C32645n0 c32645n0, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18817x = c4656v0;
            this.f18818y = c32645n0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f18817x, this.f18818y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18816w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18817x.m14681a(this.f18818y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$h */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$8$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18819w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18820x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18821y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18820x = function1;
            this.f18821y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f18820x, this.f18821y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18819w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18820x.invoke(AbstractC4639n.m14464C(this.f18821y).getConversation().m131762f());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$i */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$AiChatDrawerListScreen$9$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18822w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18823x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18824y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function1 function1, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18823x = function1;
            this.f18824y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f18823x, this.f18824y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18822w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18823x.invoke(AbstractC4639n.m14464C(this.f18824y).getConversation().getBetaTagViewState().getTitle());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$j */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$LocallyPositionedList$1$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {265}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f18825E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C40626i f18826F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC28601c1 f18827G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC28601c1 f18828H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C13821r1 f18829I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ C39970s f18830J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC28601c1 f18831K;

        /* JADX INFO: renamed from: w */
        Object f18832w;

        /* JADX INFO: renamed from: x */
        Object f18833x;

        /* JADX INFO: renamed from: y */
        int f18834y;

        /* JADX INFO: renamed from: z */
        int f18835z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C40626i c40626i, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, C13821r1 c13821r1, C39970s c39970s, InterfaceC28601c1 interfaceC28601c3, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18826F = c40626i;
            this.f18827G = interfaceC28601c1;
            this.f18828H = interfaceC28601c2;
            this.f18829I = c13821r1;
            this.f18830J = c39970s;
            this.f18831K = interfaceC28601c3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final float m14527h(InterfaceC28601c1 interfaceC28601c1) {
            return AbstractC4639n.m14481T(interfaceC28601c1);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f18826F, this.f18827G, this.f18828H, this.f18829I, this.f18830J, this.f18831K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strM131840q;
            j jVar;
            String str;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18825E;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f18826F.getConversation().m131760d().isEmpty()) {
                    if (this.f18826F.getIsRefreshingMetadata()) {
                        AbstractC4639n.m14477P(this.f18827G, false);
                        return c23454a0;
                    }
                    strM131840q = this.f18826F.getScrollToTurnId();
                    int i14 = (strM131840q == null || strM131840q.equals(AbstractC4639n.m14479R(this.f18828H))) ? 0 : 1;
                    if (!AbstractC4639n.m14466E(this.f18827G) || i14 != 0) {
                        if (strM131840q != null) {
                            C13821r1 c13821r1 = this.f18829I;
                            C40626i c40626i = this.f18826F;
                            C39970s c39970s = this.f18830J;
                            InterfaceC28601c1 interfaceC28601c1 = this.f18831K;
                            List<C40622e> listM131761e = c40626i.getConversation().m131761e();
                            C4641o c4641o = new C4641o(interfaceC28601c1, 0);
                            this.f18832w = strM131840q;
                            this.f18833x = null;
                            this.f18834y = i14;
                            this.f18835z = 0;
                            this.f18825E = 1;
                            jVar = this;
                            if (AbstractC4652t0.m14632c(c13821r1, listM131761e, c39970s, c4641o, strM131840q, jVar) == enumC31071a) {
                                return enumC31071a;
                            }
                            str = strM131840q;
                        } else {
                            jVar = this;
                        }
                        AbstractC4639n.m14480S(jVar.f18828H, strM131840q);
                        AbstractC4639n.m14477P(jVar.f18827G, true);
                        return c23454a0;
                    }
                }
                return c23454a0;
            }
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f18832w;
            AbstractC34132o.m107864I(obj);
            jVar = this;
            strM131840q = str;
            AbstractC4639n.m14480S(jVar.f18828H, strM131840q);
            AbstractC4639n.m14477P(jVar.f18827G, true);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ch0.n$k */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatDrawerListScreenKt$LocallyPositionedList$2$1", m100430f = "AiChatDrawerListScreen.kt", m100431l = {281}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ InterfaceC28601c1 f18836E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f18837F;

        /* JADX INFO: renamed from: w */
        int f18838w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f18839x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39970s f18840y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC28670t2 f18841z;

        /* JADX INFO: renamed from: ch0.n$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39970s f18842w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f18843x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC28601c1 f18844y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ InterfaceC28601c1 f18845z;

            public a(C39970s c39970s, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2) {
                this.f18842w = c39970s;
                this.f18843x = interfaceC28670t2;
                this.f18844y = interfaceC28601c1;
                this.f18845z = interfaceC28601c2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m14530b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AbstractC4639n.m14469H(this.f18845z, AbstractC4652t0.m14631b(AbstractC4639n.m14467F(this.f18843x).getConversation().m131761e(), this.f18842w, AbstractC4639n.m14481T(this.f18844y)));
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m14530b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C13821r1 c13821r1, C39970s c39970s, InterfaceC28670t2 interfaceC28670t2, InterfaceC28601c1 interfaceC28601c1, InterfaceC28601c1 interfaceC28601c2, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18839x = c13821r1;
            this.f18840y = c39970s;
            this.f18841z = interfaceC28670t2;
            this.f18836E = interfaceC28601c1;
            this.f18837F = interfaceC28601c2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m14529h(C13821r1 c13821r1) {
            return c13821r1.f49318a.m87024x();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f18839x, this.f18840y, this.f18841z, this.f18836E, this.f18837F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18838w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C4643p(this.f18839x, 0));
                a aVar = new a(this.f18840y, this.f18841z, this.f18836E, this.f18837F);
                this.f18838w = 1;
                if (c13084s1M87240H.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ch0.n$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class l extends C22672i implements Function1 {
        public l(Object obj) {
            super(1, 0, C40625h.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/ai/chat/presentation/AiChatViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14531a(AbstractC40624g p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C40625h) this.receiver).mo1216g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14531a((AbstractC40624g) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class m extends C22672i implements Function1 {
        public m(Object obj) {
            super(1, 0, C4656v0.class, obj, "trackDesignItemAnalytic", "trackDesignItemAnalytic(Lcom/whoop/analytics/AnalyticEventModel;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14532a(AnalyticEventModel p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4656v0) this.receiver).m14675C(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14532a((AnalyticEventModel) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class n extends C22672i implements InterfaceC4339a {
        public n(Object obj) {
            super(0, 0, C4656v0.class, obj, "trackMessageCopied", "trackMessageCopied()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134055invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134055invoke() {
            ((C4656v0) this.receiver).m14679G();
        }
    }

    /* JADX INFO: renamed from: ch0.n$o */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"ch0/n$o", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC28601c1 f18846a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4656v0 f18847b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f18848c;

        public o(InterfaceC28601c1 interfaceC28601c1, C4656v0 c4656v0, String str) {
            this.f18846a = interfaceC28601c1;
            this.f18847b = c4656v0;
            this.f18848c = str;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            String strM14468G = AbstractC4639n.m14468G(this.f18846a);
            if (strM14468G != null) {
                this.f18847b.getViewModel().mo1216g(new AbstractC40624g.i(this.f18848c, strM14468G));
            }
        }
    }

    /* JADX INFO: renamed from: ch0.n$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class p extends C22672i implements Function1 {
        public p(Object obj) {
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

    /* JADX INFO: renamed from: ch0.n$q */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class q extends C22672i implements Function1 {
        public q(Object obj) {
            super(1, 0, C4642o0.class, obj, "onLatestAssistantMessagePositioned", "onLatestAssistantMessagePositioned(F)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).floatValue());
            return C23454a0.f92919a;
        }

        public final void invoke(float f13) {
            ((C4642o0) this.receiver).m14577w(f13);
        }
    }

    /* JADX INFO: renamed from: ch0.n$r */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class r extends C22672i implements Function1 {
        public r(Object obj) {
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

    /* JADX INFO: renamed from: ch0.n$s */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class s extends C22672i implements InterfaceC4351m {
        public s(Object obj) {
            super(2, 0, C4642o0.class, obj, "onTurnEndPositioned", "onTurnEndPositioned(Ljava/lang/String;F)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14533a(String p13, float f13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4642o0) this.receiver).m14580z(p13, f13);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m14533a((String) obj, ((Number) obj2).floatValue());
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$t */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class t extends C22672i implements Function1 {
        public t(Object obj) {
            super(1, 0, C40625h.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/ai/chat/presentation/AiChatViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14534a(AbstractC40624g p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C40625h) this.receiver).mo1216g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14534a((AbstractC40624g) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$u */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class u extends C22672i implements Function1 {
        public u(Object obj) {
            super(1, 0, C4656v0.class, obj, "trackDesignItemAnalytic", "trackDesignItemAnalytic(Lcom/whoop/analytics/AnalyticEventModel;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14535a(AnalyticEventModel p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4656v0) this.receiver).m14675C(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14535a((AnalyticEventModel) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$v */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class v extends C22672i implements InterfaceC4339a {
        public v(Object obj) {
            super(0, 0, C4656v0.class, obj, "trackMessageCopied", "trackMessageCopied()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134056invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134056invoke() {
            ((C4656v0) this.receiver).m14679G();
        }
    }

    /* JADX INFO: renamed from: ch0.n$w */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class w extends C22672i implements Function1 {
        public w(Object obj) {
            super(1, 0, C40625h.class, obj, "sendViewEvent", "sendViewEvent(Lcom/whoop/ai/chat/presentation/AiChatViewEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14536a(AbstractC40624g p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C40625h) this.receiver).mo1216g(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14536a((AbstractC40624g) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.n$x */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class x {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f18849a;

        static {
            int[] iArr = new int[EnumC4612d0.values().length];
            try {
                iArr[EnumC4612d0.LEGACY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4612d0.PINS_SENT_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4612d0.PINS_LATEST_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f18849a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m14462A(EnumC26811m it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m14463B(C26809k it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C40626i m14464C(InterfaceC28670t2 interfaceC28670t2) {
        return (C40626i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: D */
    private static final void m14465D(C4656v0 c4656v0, C40626i c40626i, Modifier modifier, C13821r1 c13821r1, float f13, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28676v0 c28676v0;
        boolean z13;
        char c3;
        C39970s c39970s;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC28601c1 interfaceC28601c2;
        C28676v0 c28676v1;
        boolean z14;
        C4656v0 c4656v1 = c4656v0;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1037273500);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(c4656v1) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(c40626i) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q2.m87153g(c13821r1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q2.m87147d(f13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q2.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if (c28655q2.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            boolean zIsFeatureEnabled = ((FeatureFlagChecker) c28655q2.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.AICHAT_CONVERSATION_SCROLL_POSITIONING);
            boolean zM87153g = c28655q2.m87153g(c40626i.getConversation().getFingerprint());
            Object objM87133R = c28655q2.m87133R();
            C28676v0 c28676v2 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v2) {
                objM87133R = AbstractC28683x.m87272z(Boolean.FALSE);
                c28655q2.m87172p0(objM87133R);
            }
            InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R;
            boolean zM87153g2 = c28655q2.m87153g(c40626i.getConversation().getFingerprint());
            Object objM87133R2 = c28655q2.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v2) {
                objM87133R2 = AbstractC28683x.m87272z(null);
                c28655q2.m87172p0(objM87133R2);
            }
            InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
            Object objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v2) {
                objM87133R3 = AbstractC3855a.m11831o(0.0f, c28655q2);
            }
            InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R3;
            Object objM87133R4 = c28655q2.m87133R();
            if (objM87133R4 == c28676v2) {
                objM87133R4 = new C39141w();
                c28655q2.m87172p0(objM87133R4);
            }
            C39141w c39141w = (C39141w) objM87133R4;
            boolean zM87153g3 = c28655q2.m87153g(c40626i.getConversation().getFingerprint());
            Object objM87133R5 = c28655q2.m87133R();
            if (zM87153g3 || objM87133R5 == c28676v2) {
                objM87133R5 = new C39970s();
                c28655q2.m87172p0(objM87133R5);
            }
            C39970s c39970s2 = (C39970s) objM87133R5;
            int i15 = i14 >> 3;
            int i16 = i15 & 14;
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(c40626i, c28655q2);
            if (zIsFeatureEnabled) {
                c28655q2.m87150e0(875784083);
                Object[] objArr = {c40626i.getConversation().getFingerprint(), Integer.valueOf(c40626i.getConversation().m131760d().size()), c40626i.getScrollToTurnId(), Boolean.valueOf(c40626i.getIsRefreshingMetadata())};
                int i17 = i14 & 7168;
                boolean zM87157i = c28655q2.m87157i(c40626i) | c28655q2.m87153g(interfaceC28601c3) | c28655q2.m87153g(interfaceC28601c4) | (i17 == 2048) | c28655q2.m87153g(c39970s2);
                Object objM87133R6 = c28655q2.m87133R();
                if (zM87157i || objM87133R6 == c28676v2) {
                    z13 = false;
                    c28676v0 = c28676v2;
                    interfaceC28601c2 = interfaceC28601c5;
                    j jVar = new j(c40626i, interfaceC28601c3, interfaceC28601c4, c13821r1, c39970s2, interfaceC28601c2, null);
                    interfaceC28601c1 = interfaceC28601c3;
                    c39970s = c39970s2;
                    c28655q2.m87172p0(jVar);
                    objM87133R6 = jVar;
                } else {
                    c39970s = c39970s2;
                    c28676v0 = c28676v2;
                    z13 = false;
                    interfaceC28601c1 = interfaceC28601c3;
                    interfaceC28601c2 = interfaceC28601c5;
                }
                AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R6, c28655q2);
                boolean zM87153g4 = c28655q2.m87153g(c40626i.getConversation().getFingerprint());
                Object objM87133R7 = c28655q2.m87133R();
                if (zM87153g4 || objM87133R7 == c28676v0) {
                    objM87133R7 = AbstractC28683x.m87272z(null);
                    c28655q2.m87172p0(objM87133R7);
                }
                InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R7;
                String strM131759c = c40626i.getConversation().getFingerprint();
                c3 = 2048;
                boolean zM87153g5 = c28655q2.m87153g(interfaceC28601c6) | (i17 == 2048 ? true : z13) | c28655q2.m87153g(interfaceC28601c1M87238F) | c28655q2.m87153g(c39970s);
                Object objM87133R8 = c28655q2.m87133R();
                if (zM87153g5 || objM87133R8 == c28676v0) {
                    InterfaceC28601c1 interfaceC28601c7 = interfaceC28601c2;
                    k kVar = new k(c13821r1, c39970s, interfaceC28601c1M87238F, interfaceC28601c7, interfaceC28601c6, null);
                    interfaceC28601c2 = interfaceC28601c7;
                    c28655q2.m87172p0(kVar);
                    objM87133R8 = kVar;
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, strM131759c);
                String strM131759c2 = c40626i.getConversation().getFingerprint();
                boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c6) | c28655q2.m87157i(c4656v1) | c28655q2.m87153g(strM131759c2);
                Object objM87133R9 = c28655q2.m87133R();
                if (zM87153g6 || objM87133R9 == c28676v0) {
                    objM87133R9 = new C4635l(interfaceC28601c6, c4656v1, strM131759c2);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87251e(strM131759c2, (Function1) objM87133R9, c28655q2);
                c28655q2.m87173q(z13);
            } else {
                i14 = i14;
                c28676v0 = c28676v2;
                i16 = i16;
                z13 = false;
                c3 = 2048;
                c39970s = c39970s2;
                interfaceC28601c1 = interfaceC28601c3;
                interfaceC28601c2 = interfaceC28601c5;
                c28655q2.m87150e0(877732030);
                c28655q2.m87173q(false);
            }
            Object objM87133R10 = c28655q2.m87133R();
            if (objM87133R10 == c28676v0) {
                objM87133R10 = new C4608c(interfaceC28601c2, 0);
                c28655q2.m87172p0(objM87133R10);
            }
            Modifier modifierMo3471e = AbstractC1131a.m3500d(modifier, (Function1) objM87133R10).mo3471e(new LayoutBoundsElement(c39141w));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, z13);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierMo3471e);
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
            boolean zM87153g7 = c28655q2.m87153g(c39970s);
            Object objM87133R11 = c28655q2.m87133R();
            if (zM87153g7 || objM87133R11 == c28676v0) {
                objM87133R11 = new C4611d(c39970s, 0);
                c28655q2.m87172p0(objM87133R11);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R11;
            boolean z15 = zIsFeatureEnabled;
            boolean zM87155h = c28655q2.m87155h(z15) | c28655q2.m87153g(interfaceC28601c1) | c28655q2.m87157i(c39141w) | c28655q2.m87157i(c4656v1);
            Object objM87133R12 = c28655q2.m87133R();
            if (zM87155h || objM87133R12 == c28676v0) {
                c28676v1 = c28676v0;
                z14 = true;
                C4614e c4614e = new C4614e(z15, c39141w, interfaceC28601c1, c4656v1, 0);
                z15 = z15;
                c4656v1 = c4656v1;
                c28655q2.m87172p0(c4614e);
                objM87133R12 = c4614e;
            } else {
                c28676v1 = c28676v0;
                z14 = true;
            }
            Function1 function1 = (Function1) objM87133R12;
            C40625h viewModel = c4656v1.getViewModel();
            boolean zM87157i2 = c28655q2.m87157i(viewModel);
            Object objM87133R13 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R13 == c28676v1) {
                objM87133R13 = new l(viewModel);
                c28655q2.m87172p0(objM87133R13);
            }
            Function1 function2 = (Function1) ((InterfaceC21467g) objM87133R13);
            boolean zM87157i3 = c28655q2.m87157i(c4656v1);
            Object objM87133R14 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R14 == c28676v1) {
                objM87133R14 = new C4617f(c4656v1, 0);
                c28655q2.m87172p0(objM87133R14);
            }
            Function1 function3 = (Function1) objM87133R14;
            boolean zM87157i4 = c28655q2.m87157i(c4656v1);
            Object objM87133R15 = c28655q2.m87133R();
            if (zM87157i4 || objM87133R15 == c28676v1) {
                objM87133R15 = new m(c4656v1);
                c28655q2.m87172p0(objM87133R15);
            }
            Function1 function4 = (Function1) ((InterfaceC21467g) objM87133R15);
            boolean zM87157i5 = c28655q2.m87157i(c4656v1);
            Object objM87133R16 = c28655q2.m87133R();
            if (zM87157i5 || objM87133R16 == c28676v1) {
                objM87133R16 = new n(c4656v1);
                c28655q2.m87172p0(objM87133R16);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R16);
            int i18 = i14 >> 6;
            int i19 = i16 | 3072 | (i18 & 112) | (i18 & 896);
            int i24 = i14;
            C28676v0 c28676v3 = c28676v1;
            AbstractC4609c0.m14284B(c40626i, c13821r1, f13, false, z15, null, 0, null, null, null, interfaceC4351m, function1, null, function2, function3, function4, interfaceC4339a, c28655q2, i19, 0, 5088);
            c28655q = c28655q2;
            if (z4) {
                c28655q.m87150e0(1385392940);
                boolean z16 = (i24 & 7168) == 2048;
                Object objM87133R17 = c28655q.m87133R();
                if (z16 || objM87133R17 == c28676v3) {
                    objM87133R17 = new C4643p(c13821r1, 1);
                    c28655q.m87172p0(objM87133R17);
                }
                AbstractC4646q0.m14596k(C1100b.f4583a, z15, c13821r1, (InterfaceC4339a) objM87133R17, 0, null, c28655q, 6 | (i15 & 896), 24);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1385681240);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4620g(c4656v0, c40626i, modifier, c13821r1, f13, z4, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final boolean m14466E(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C40626i m14467F(InterfaceC28670t2 interfaceC28670t2) {
        return (C40626i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m14468G(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m14469H(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final InterfaceC28620h0 m14470I(InterfaceC28601c1 interfaceC28601c1, C4656v0 c4656v0, String str, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new o(interfaceC28601c1, c4656v0, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final C23454a0 m14471J(InterfaceC28601c1 interfaceC28601c1, InterfaceC39147y it) {
        AbstractC22676k.m65750j(it, "it");
        m14482U(interfaceC28601c1, Float.intBitsToFloat((int) (it.mo3510E(0L) & 4294967295L)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final C23454a0 m14472K(C39970s c39970s, String turnId, float f13) {
        AbstractC22676k.m65750j(turnId, "turnId");
        c39970s.put(turnId, Float.valueOf(f13));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final Modifier m14473L(boolean z4, C39141w c39141w, InterfaceC28601c1 interfaceC28601c1, C4656v0 c4656v0, String turnId) {
        AbstractC22676k.m65750j(turnId, "turnId");
        return (z4 && m14466E(interfaceC28601c1)) ? AbstractC1132b.m3503c(c39141w, new C4626i(0, c4656v0, turnId)) : C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m14474M(C4656v0 c4656v0, String str, boolean z4) {
        c4656v0.getViewModel().mo1216g(new AbstractC40624g.u(str, z4));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m14475N(C4656v0 c4656v0, AbstractC39523b it) {
        AbstractC22676k.m65750j(it, "it");
        c4656v0.m14701v(it, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final int m14476O(C13821r1 c13821r1) {
        return c13821r1.f49321d.m87024x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final void m14477P(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m14478Q(C4656v0 c4656v0, C40626i c40626i, Modifier modifier, C13821r1 c13821r1, float f13, boolean z4, int i13, Composer composer, int i14) {
        m14465D(c4656v0, c40626i, modifier, c13821r1, f13, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final String m14479R(InterfaceC28601c1 interfaceC28601c1) {
        return (String) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final void m14480S(InterfaceC28601c1 interfaceC28601c1, String str) {
        interfaceC28601c1.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final float m14481T(InterfaceC28601c1 interfaceC28601c1) {
        return ((Number) interfaceC28601c1.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: U */
    private static final void m14482U(InterfaceC28601c1 interfaceC28601c1, float f13) {
        interfaceC28601c1.setValue(Float.valueOf(f13));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:107:0x0214  */
    /* JADX WARN: Code duplicated, block: B:111:0x022e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0261  */
    /* JADX WARN: Code duplicated, block: B:116:0x0272  */
    /* JADX WARN: Code duplicated, block: B:82:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:87:0x018f  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e1  */
    /* JADX INFO: renamed from: V */
    private static final void m14483V(final C4656v0 c4656v0, final C40626i c40626i, final Modifier modifier, final C13821r1 c13821r1, final float f13, final boolean z4, final boolean z13, Composer composer, final int i13) throws Throwable {
        int i14;
        C40626i c40626i2;
        float f14;
        C28676v0 c28676v0;
        InterfaceC21467g interfaceC21467g;
        boolean zM87157i;
        Object objM87133R;
        boolean zM87157i2;
        Object objM87133R2;
        C40625h viewModel;
        boolean zM87157i3;
        Object objM87133R3;
        boolean zM87157i4;
        Object objM87133R4;
        boolean zM87157i5;
        Object objM87133R5;
        boolean zM87157i6;
        Object objM87133R6;
        boolean zM87157i7;
        Object objM87133R7;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(744504795);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c4656v0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            c40626i2 = c40626i;
            i14 |= c28655q.m87157i(c40626i2) ? 32 : 16;
        } else {
            c40626i2 = c40626i;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87153g(modifier) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(c13821r1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            f14 = f13;
            i14 |= c28655q.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            f14 = f13;
        }
        if ((196608 & i13) == 0) {
            i14 |= c28655q.m87155h(z4) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i14 |= c28655q.m87155h(z13) ? 1048576 : 524288;
        }
        if (c28655q.m87135U(i14 & 1, (599187 & i14) != 599186)) {
            C40625h viewModel2 = c4656v0.getViewModel();
            boolean zM87157i8 = c28655q.m87157i(viewModel2);
            Object objM87133R8 = c28655q.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87157i8 || objM87133R8 == c28676v1) {
                objM87133R8 = new w(viewModel2);
                c28655q.m87172p0(objM87133R8);
            }
            Function1 function1 = (Function1) ((InterfaceC21467g) objM87133R8);
            int i15 = i14 >> 3;
            int i16 = i15 & 14;
            C4642o0 c4642o0M14604s = AbstractC4646q0.m14604s(c40626i2, false, function1, c13821r1, false, z13, true, c28655q, (i15 & 458752) | i16 | 1572912 | (i14 & 7168), 16);
            Modifier modifierMo3471e = modifier.mo3471e(c4642o0M14604s.m14576u());
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            boolean enabled = c4642o0M14604s.getEnabled();
            InterfaceC30833a firstResponseRequester = c4642o0M14604s.getFirstResponseRequester();
            int iM14574r = c4642o0M14604s.m14574r();
            boolean zM87157i9 = c28655q.m87157i(c4642o0M14604s);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i9) {
                c28676v0 = c28676v1;
            } else {
                c28676v0 = c28676v1;
                if (objM87133R9 == c28676v0) {
                }
                Function1 function2 = (Function1) ((InterfaceC21467g) objM87133R9);
                if (z13) {
                    c28655q.m87150e0(1178319105);
                    zM87157i7 = c28655q.m87157i(c4642o0M14604s);
                    objM87133R7 = c28655q.m87133R();
                    if (zM87157i7 || objM87133R7 == c28676v0) {
                        objM87133R7 = new q(c4642o0M14604s);
                        c28655q.m87172p0(objM87133R7);
                    }
                    interfaceC21467g = (InterfaceC21467g) objM87133R7;
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1178367464);
                    c28655q.m87173q(false);
                    interfaceC21467g = null;
                }
                Function1 function3 = (Function1) interfaceC21467g;
                zM87157i = c28655q.m87157i(c4642o0M14604s);
                objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == c28676v0) {
                    objM87133R = new r(c4642o0M14604s);
                    c28655q.m87172p0(objM87133R);
                }
                Function1 function4 = (Function1) ((InterfaceC21467g) objM87133R);
                zM87157i2 = c28655q.m87157i(c4642o0M14604s);
                objM87133R2 = c28655q.m87133R();
                if (zM87157i2 || objM87133R2 == c28676v0) {
                    objM87133R2 = new s(c4642o0M14604s);
                    c28655q.m87172p0(objM87133R2);
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) ((InterfaceC21467g) objM87133R2);
                viewModel = c4656v0.getViewModel();
                zM87157i3 = c28655q.m87157i(viewModel);
                int i17 = i14;
                objM87133R3 = c28655q.m87133R();
                if (zM87157i3 || objM87133R3 == c28676v0) {
                    objM87133R3 = new t(viewModel);
                    c28655q.m87172p0(objM87133R3);
                }
                Function1 function5 = (Function1) ((InterfaceC21467g) objM87133R3);
                zM87157i4 = c28655q.m87157i(c4656v0);
                objM87133R4 = c28655q.m87133R();
                if (zM87157i4 || objM87133R4 == c28676v0) {
                    objM87133R4 = new C4617f(c4656v0, 1);
                    c28655q.m87172p0(objM87133R4);
                }
                Function1 function6 = (Function1) objM87133R4;
                zM87157i5 = c28655q.m87157i(c4656v0);
                objM87133R5 = c28655q.m87133R();
                if (zM87157i5 || objM87133R5 == c28676v0) {
                    objM87133R5 = new u(c4656v0);
                    c28655q.m87172p0(objM87133R5);
                }
                Function1 function7 = (Function1) ((InterfaceC21467g) objM87133R5);
                zM87157i6 = c28655q.m87157i(c4656v0);
                objM87133R6 = c28655q.m87133R();
                if (zM87157i6 || objM87133R6 == c28676v0) {
                    objM87133R6 = new v(c4656v0);
                    c28655q.m87172p0(objM87133R6);
                }
                int i18 = i17 >> 6;
                AbstractC4609c0.m14284B(c40626i, c13821r1, f14, false, enabled, firstResponseRequester, iM14574r, function2, function3, function4, interfaceC4351m, null, null, function5, function6, function7, (InterfaceC4339a) ((InterfaceC21467g) objM87133R6), c28655q, i16 | 3072 | (i18 & 112) | (i18 & 896), 0, 6144);
                c28655q = c28655q;
                if (z4) {
                    c28655q.m87150e0(1178825490);
                    AbstractC4646q0.m14593h(C1100b.f4583a, c4642o0M14604s, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1178882189);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
            }
            objM87133R9 = new p(c4642o0M14604s);
            c28655q.m87172p0(objM87133R9);
            Function1 function8 = (Function1) ((InterfaceC21467g) objM87133R9);
            if (z13) {
                c28655q.m87150e0(1178319105);
                zM87157i7 = c28655q.m87157i(c4642o0M14604s);
                objM87133R7 = c28655q.m87133R();
                if (zM87157i7) {
                    objM87133R7 = new q(c4642o0M14604s);
                    c28655q.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new q(c4642o0M14604s);
                    c28655q.m87172p0(objM87133R7);
                }
                interfaceC21467g = (InterfaceC21467g) objM87133R7;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1178367464);
                c28655q.m87173q(false);
                interfaceC21467g = null;
            }
            Function1 function9 = (Function1) interfaceC21467g;
            zM87157i = c28655q.m87157i(c4642o0M14604s);
            objM87133R = c28655q.m87133R();
            if (zM87157i) {
                objM87133R = new r(c4642o0M14604s);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new r(c4642o0M14604s);
                c28655q.m87172p0(objM87133R);
            }
            Function1 function10 = (Function1) ((InterfaceC21467g) objM87133R);
            zM87157i2 = c28655q.m87157i(c4642o0M14604s);
            objM87133R2 = c28655q.m87133R();
            if (zM87157i2) {
                objM87133R2 = new s(c4642o0M14604s);
                c28655q.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new s(c4642o0M14604s);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) ((InterfaceC21467g) objM87133R2);
            viewModel = c4656v0.getViewModel();
            zM87157i3 = c28655q.m87157i(viewModel);
            int i19 = i14;
            objM87133R3 = c28655q.m87133R();
            if (zM87157i3) {
                objM87133R3 = new t(viewModel);
                c28655q.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new t(viewModel);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function11 = (Function1) ((InterfaceC21467g) objM87133R3);
            zM87157i4 = c28655q.m87157i(c4656v0);
            objM87133R4 = c28655q.m87133R();
            if (zM87157i4) {
                objM87133R4 = new C4617f(c4656v0, 1);
                c28655q.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new C4617f(c4656v0, 1);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function12 = (Function1) objM87133R4;
            zM87157i5 = c28655q.m87157i(c4656v0);
            objM87133R5 = c28655q.m87133R();
            if (zM87157i5) {
                objM87133R5 = new u(c4656v0);
                c28655q.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new u(c4656v0);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function13 = (Function1) ((InterfaceC21467g) objM87133R5);
            zM87157i6 = c28655q.m87157i(c4656v0);
            objM87133R6 = c28655q.m87133R();
            if (zM87157i6) {
                objM87133R6 = new v(c4656v0);
                c28655q.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new v(c4656v0);
                c28655q.m87172p0(objM87133R6);
            }
            int i110 = i19 >> 6;
            AbstractC4609c0.m14284B(c40626i, c13821r1, f14, false, enabled, firstResponseRequester, iM14574r, function8, function9, function10, interfaceC4351m2, null, null, function11, function12, function13, (InterfaceC4339a) ((InterfaceC21467g) objM87133R6), c28655q, i16 | 3072 | (i110 & 112) | (i110 & 896), 0, 6144);
            c28655q = c28655q;
            if (z4) {
                c28655q.m87150e0(1178825490);
                AbstractC4646q0.m14593h(C1100b.f4583a, c4642o0M14604s, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1178882189);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.h
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4639n.m14485X(c4656v0, c40626i, modifier, c13821r1, f13, z4, z13, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m14484W(C4656v0 c4656v0, AbstractC39523b it) {
        AbstractC22676k.m65750j(it, "it");
        c4656v0.m14701v(it, null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m14485X(C4656v0 c4656v0, C40626i c40626i, Modifier modifier, C13821r1 c13821r1, float f13, boolean z4, boolean z13, int i13, Composer composer, int i14) throws Throwable {
        m14483V(c4656v0, c40626i, modifier, c13821r1, f13, z4, z13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:114:0x015d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x017a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0185  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x018e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0190  */
    /* JADX WARN: Code duplicated, block: B:131:0x0192  */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:150:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:159:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:166:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:167:0x020f  */
    /* JADX WARN: Code duplicated, block: B:168:0x0212  */
    /* JADX WARN: Code duplicated, block: B:171:0x0217  */
    /* JADX WARN: Code duplicated, block: B:172:0x0220  */
    /* JADX WARN: Code duplicated, block: B:174:0x0223  */
    /* JADX WARN: Code duplicated, block: B:175:0x0225  */
    /* JADX WARN: Code duplicated, block: B:177:0x0229  */
    /* JADX WARN: Code duplicated, block: B:179:0x022f  */
    /* JADX WARN: Code duplicated, block: B:181:0x023d  */
    /* JADX WARN: Code duplicated, block: B:183:0x0240  */
    /* JADX WARN: Code duplicated, block: B:185:0x0246  */
    /* JADX WARN: Code duplicated, block: B:187:0x0253  */
    /* JADX WARN: Code duplicated, block: B:189:0x0256  */
    /* JADX WARN: Code duplicated, block: B:191:0x025c  */
    /* JADX WARN: Code duplicated, block: B:194:0x026a  */
    /* JADX WARN: Code duplicated, block: B:196:0x0270  */
    /* JADX WARN: Code duplicated, block: B:198:0x027d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0281  */
    /* JADX WARN: Code duplicated, block: B:202:0x0287  */
    /* JADX WARN: Code duplicated, block: B:204:0x0295  */
    /* JADX WARN: Code duplicated, block: B:206:0x0299  */
    /* JADX WARN: Code duplicated, block: B:208:0x029f  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:211:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:213:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:214:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:216:0x02be  */
    /* JADX WARN: Code duplicated, block: B:217:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:219:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:223:0x034e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:226:0x0354  */
    /* JADX WARN: Code duplicated, block: B:229:0x0378  */
    /* JADX WARN: Code duplicated, block: B:230:0x037a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0386 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0388  */
    /* JADX WARN: Code duplicated, block: B:237:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:238:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:242:0x03be  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:246:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:249:0x03f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:250:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:253:0x0425  */
    /* JADX WARN: Code duplicated, block: B:254:0x0427  */
    /* JADX WARN: Code duplicated, block: B:257:0x0433 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:258:0x0435  */
    /* JADX WARN: Code duplicated, block: B:261:0x0453  */
    /* JADX WARN: Code duplicated, block: B:262:0x0455  */
    /* JADX WARN: Code duplicated, block: B:265:0x0461 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x0463  */
    /* JADX WARN: Code duplicated, block: B:269:0x047e  */
    /* JADX WARN: Code duplicated, block: B:270:0x0481  */
    /* JADX WARN: Code duplicated, block: B:273:0x048f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x0491  */
    /* JADX WARN: Code duplicated, block: B:277:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:278:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:281:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:284:0x0539  */
    /* JADX WARN: Code duplicated, block: B:287:0x0557  */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:85:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x0108  */
    /* JADX WARN: Code duplicated, block: B:88:0x010b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    /* JADX WARN: Code duplicated, block: B:99:0x012b  */
    /* JADX INFO: renamed from: s */
    public static final void m14514s(final C4656v0 coordinator, C32645n0 screenArgs, Modifier modifier, C13821r1 c13821r1, float f13, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, boolean z4, EnumC4612d0 enumC4612d0, Function1 function7, Composer composer, int i13, int i14, int i15) {
        int i16;
        Modifier modifier2;
        int i17;
        int i18;
        final C13821r1 c13821r1M92099U;
        int i19;
        int i24;
        int i25;
        Function1 function8;
        int i26;
        int i27;
        Function1 function9;
        int i28;
        int i29;
        Function1 function10;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        int i54;
        int i55;
        int i56;
        int iOrdinal;
        int i57;
        int i58;
        boolean z13;
        float f14;
        Function1 function11;
        C28655q c28655q;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        Modifier modifier3;
        C13821r1 c13821r2;
        Function1 function15;
        Function1 function16;
        boolean z14;
        EnumC4612d0 enumC4612d1;
        Function1 function17;
        C28677v1 c28677v1M87180u;
        int i59;
        C28676v0 c28676v0;
        Modifier modifier4;
        float f15;
        Function1 function18;
        Function1 function19;
        Function1 function20;
        Function1 function21;
        boolean z15;
        EnumC4612d0 enumC4612d2;
        int i64;
        float f16;
        Function1 function22;
        Function1 function23;
        Object objM87133R;
        Object objM87133R2;
        Object objM87133R3;
        Object objM87133R4;
        Object objM87133R5;
        Object objM87133R6;
        final InterfaceC28601c1 interfaceC28601c1M87260n;
        int i65;
        boolean zM87157i;
        Object objM87133R7;
        boolean z16;
        boolean zM87153g;
        Object objM87133R8;
        boolean z17;
        boolean zM87153g2;
        Object objM87133R9;
        boolean z18;
        boolean zM87157i2;
        Object objM87133R10;
        boolean z19;
        boolean zM87153g3;
        Object objM87133R11;
        boolean z24;
        boolean zM87153g4;
        Object objM87133R12;
        boolean z25;
        boolean zM87153g5;
        Object objM87133R13;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        boolean zM87157i3;
        Object objM87133R14;
        boolean zM87157i4;
        Object objM87133R15;
        int i66;
        AbstractC22676k.m65750j(coordinator, "coordinator");
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-354293065);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87157i(coordinator) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87157i(screenArgs) ? 32 : 16;
        }
        int i67 = i15 & 4;
        if (i67 == 0) {
            if ((i13 & 384) == 0) {
                modifier2 = modifier;
                i16 |= c28655q2.m87153g(modifier2) ? 256 : 128;
            }
            i17 = i13 & 3072;
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i17 == 0) {
                if ((i15 & 8) == 0) {
                    c13821r1M92099U = c13821r1;
                    if (c28655q2.m87153g(c13821r1M92099U)) {
                        i66 = 2048;
                    }
                    i16 |= i66;
                } else {
                    c13821r1M92099U = c13821r1;
                }
                i66 = 1024;
                i16 |= i66;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i19 = i15 & 16;
            if (i19 != 0) {
                if ((i13 & 24576) == 0) {
                    if (c28655q2.m87147d(f13)) {
                        i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i24 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i16 |= i24;
                }
                i25 = i15 & 32;
                if (i25 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    function8 = function1;
                } else {
                    function8 = function1;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q2.m87157i(function8)) {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                        }
                        i16 |= i26;
                    }
                }
                i27 = i15 & 64;
                if (i27 != 0) {
                    i16 |= 1572864;
                    function9 = function2;
                } else {
                    function9 = function2;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q2.m87157i(function9)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 128;
                if (i29 != 0) {
                    i16 |= 12582912;
                    function10 = function3;
                } else {
                    function10 = function3;
                    if ((i13 & 12582912) == 0) {
                        if (c28655q2.m87157i(function10)) {
                            i34 = 8388608;
                        } else {
                            i34 = 4194304;
                        }
                        i16 |= i34;
                    }
                }
                i35 = i15 & 256;
                i36 = i16;
                if (i35 != 0) {
                    i36 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q2.m87157i(function4)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i36 |= i37;
                }
                i38 = i15 & 512;
                if (i38 != 0) {
                    i36 |= 805306368;
                } else if ((i13 & 805306368) == 0) {
                    if (c28655q2.m87157i(function5)) {
                        i39 = 536870912;
                    } else {
                        i39 = 268435456;
                    }
                    i36 |= i39;
                }
                i44 = i36;
                i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i45 != 0) {
                    i46 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q2.m87157i(function6)) {
                        i47 = 4;
                    } else {
                        i47 = 2;
                    }
                    i46 = i14 | i47;
                } else {
                    i46 = i14;
                }
                i48 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i48 != 0) {
                    i46 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (c28655q2.m87155h(z4)) {
                        i49 = 32;
                    } else {
                        i49 = 16;
                    }
                    i46 |= i49;
                }
                i54 = i46;
                i55 = i15 & 4096;
                if (i55 != 0) {
                    i56 = i54 | 384;
                } else if ((i14 & 384) == 0) {
                    if (enumC4612d0 == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = enumC4612d0.ordinal();
                    }
                    if (c28655q2.m87149e(iOrdinal)) {
                        i57 = 256;
                    } else {
                        i57 = 128;
                    }
                    i56 = i54 | i57;
                } else {
                    i56 = i54;
                }
                i58 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i58 != 0) {
                    if ((i14 & 3072) == 0) {
                        if (c28655q2.m87157i(function7)) {
                            i18 = 2048;
                        }
                        i56 |= i18;
                    }
                    if ((i44 & 306783379) == 306783378 || (i56 & 1171) != 1170) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c28655q2.m87135U(i44 & 1, z13)) {
                        c28655q2.m87140Z();
                        i59 = i13 & 1;
                        c28676v0 = C28635l.f115821a;
                        if (i59 != 0 || c28655q2.m87118C()) {
                            if (i67 != 0) {
                                modifier4 = C2314t.f9131w;
                            } else {
                                modifier4 = modifier2;
                            }
                            if ((i15 & 8) != 0) {
                                i44 &= -7169;
                                c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                            }
                            if (i19 != 0) {
                                f15 = 0;
                            } else {
                                f15 = f13;
                            }
                            if (i25 != 0) {
                                objM87133R6 = c28655q2.m87133R();
                                if (objM87133R6 == c28676v0) {
                                    objM87133R6 = new C4273a(8);
                                    c28655q2.m87172p0(objM87133R6);
                                }
                                function18 = (Function1) objM87133R6;
                            } else {
                                function18 = function8;
                            }
                            if (i27 != 0) {
                                objM87133R5 = c28655q2.m87133R();
                                if (objM87133R5 == c28676v0) {
                                    objM87133R5 = new C4273a(9);
                                    c28655q2.m87172p0(objM87133R5);
                                }
                                function19 = (Function1) objM87133R5;
                            } else {
                                function19 = function9;
                            }
                            if (i29 != 0) {
                                objM87133R4 = c28655q2.m87133R();
                                if (objM87133R4 == c28676v0) {
                                    objM87133R4 = new C4273a(10);
                                    c28655q2.m87172p0(objM87133R4);
                                }
                                function10 = (Function1) objM87133R4;
                            }
                            if (i35 != 0) {
                                objM87133R3 = c28655q2.m87133R();
                                if (objM87133R3 == c28676v0) {
                                    objM87133R3 = new C4273a(11);
                                    c28655q2.m87172p0(objM87133R3);
                                }
                                function11 = (Function1) objM87133R3;
                            } else {
                                function11 = function4;
                            }
                            if (i38 != 0) {
                                objM87133R2 = c28655q2.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C4273a(12);
                                    c28655q2.m87172p0(objM87133R2);
                                }
                                function20 = (Function1) objM87133R2;
                            } else {
                                function20 = function5;
                            }
                            if (i45 != 0) {
                                objM87133R = c28655q2.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C4273a(13);
                                    c28655q2.m87172p0(objM87133R);
                                }
                                function21 = (Function1) objM87133R;
                            } else {
                                modifier4 = modifier4;
                                function21 = function6;
                            }
                            if (i48 != 0) {
                                z15 = false;
                            } else {
                                z15 = z4;
                            }
                            if (i55 != 0) {
                                enumC4612d2 = EnumC4612d0.LEGACY;
                            } else {
                                enumC4612d2 = enumC4612d0;
                            }
                            if (i58 != 0) {
                                i64 = i44;
                                f16 = f15;
                                modifier2 = modifier4;
                                function22 = function21;
                                function23 = null;
                            } else {
                                i64 = i44;
                                f16 = f15;
                                modifier2 = modifier4;
                                function22 = function21;
                                function23 = function7;
                            }
                        } else {
                            c28655q2.m87138X();
                            if ((i15 & 8) != 0) {
                                i44 &= -7169;
                            }
                            function11 = function4;
                            function20 = function5;
                            enumC4612d2 = enumC4612d0;
                            function23 = function7;
                            i64 = i44;
                            function18 = function8;
                            function19 = function9;
                            f16 = f13;
                            function22 = function6;
                            z15 = z4;
                        }
                        c28655q2.m87175r();
                        interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                        i65 = i56;
                        final boolean z26 = z15;
                        String strM102021f = screenArgs.getFingerprint();
                        zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                        final Modifier modifier5 = modifier2;
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87157i || objM87133R7 == c28676v0) {
                            objM87133R7 = new g(coordinator, screenArgs, null);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f);
                        List<String> listM131762f = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                        if ((i64 & 458752) == 131072) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87153g || objM87133R8 == c28676v0) {
                            objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f);
                        TextResource textResourceM79967c = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                        if ((i64 & 3670016) == 1048576) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87153g2 || objM87133R9 == c28676v0) {
                            objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        TextResource.Companion c8687a = TextResource.INSTANCE;
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c);
                        C26805g c26805gM131757a = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                        boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c1M87260n);
                        if ((i64 & 29360128) == 8388608) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        zM87157i2 = z18 | zM87153g6 | c28655q2.m87157i(coordinator);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i2 || objM87133R10 == c28676v0) {
                            objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a);
                        Boolean boolValueOf = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                        Boolean boolValueOf2 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                        if ((i64 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87153g3 || objM87133R11 == c28676v0) {
                            objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                            c28655q2.m87172p0(objM87133R11);
                        }
                        AbstractC28683x.m87254h(boolValueOf, boolValueOf2, (InterfaceC4351m) objM87133R11, c28655q2);
                        EnumC26811m enumC26811mM131835l = m14464C(interfaceC28601c1M87260n).getLoadingState();
                        if ((i64 & 1879048192) == 536870912) {
                            z24 = true;
                        } else {
                            z24 = false;
                        }
                        zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                        objM87133R12 = c28655q2.m87133R();
                        if (zM87153g4 || objM87133R12 == c28676v0) {
                            objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l);
                        C26809k c26809kM131844u = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                        if ((i65 & 14) == 4) {
                            z25 = true;
                        } else {
                            z25 = false;
                        }
                        zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g5 || objM87133R13 == c28676v0) {
                            objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u);
                        interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                        zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                        objM87133R14 = c28655q2.m87133R();
                        if (zM87157i3 || objM87133R14 == c28676v0) {
                            objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                        C28673u1 c28673u1Mo86977a = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                        C28673u1 c28673u1Mo86977a2 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                        AbstractC28669t1 abstractC28669t1M53351e = AbstractC18486c.m53351e();
                        zM87157i4 = c28655q2.m87157i(coordinator);
                        Function1 function24 = function23;
                        objM87133R15 = c28655q2.m87133R();
                        if (zM87157i4 || objM87133R15 == c28676v0) {
                            objM87133R15 = new f(coordinator);
                            c28655q2.m87172p0(objM87133R15);
                        }
                        final float f17 = f16;
                        final EnumC4612d0 enumC4612d3 = enumC4612d2;
                        z14 = z26;
                        AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a, c28673u1Mo86977a2, abstractC28669t1M53351e.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4639n.m14518w(enumC4612d3, coordinator, modifier5, c13821r1M92099U, f17, z26, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 56);
                        c28655q = c28655q2;
                        function12 = function18;
                        function14 = function19;
                        modifier3 = modifier5;
                        c13821r2 = c13821r1M92099U;
                        function17 = function24;
                        enumC4612d1 = enumC4612d2;
                        function15 = function20;
                        function13 = function10;
                        function16 = function22;
                        f14 = f17;
                    } else {
                        c28655q2.m87138X();
                        f14 = f13;
                        function11 = function4;
                        c28655q = c28655q2;
                        function12 = function8;
                        function13 = function10;
                        function14 = function9;
                        modifier3 = modifier2;
                        c13821r2 = c13821r1M92099U;
                        function15 = function5;
                        function16 = function6;
                        z14 = z4;
                        enumC4612d1 = enumC4612d0;
                        function17 = function7;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
                    }
                }
                i56 |= 3072;
                if ((i44 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i44 & 1, z13)) {
                    c28655q2.m87140Z();
                    i59 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i59 != 0) {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    } else {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                    i65 = i56;
                    final boolean z27 = z15;
                    String strM102021f2 = screenArgs.getFingerprint();
                    zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                    final Modifier modifier6 = modifier2;
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f2);
                    List<String> listM131762f2 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                    if ((i64 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f2);
                    TextResource textResourceM79967c2 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                    if ((i64 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    TextResource.Companion c8687a2 = TextResource.INSTANCE;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c2);
                    C26805g c26805gM131757a2 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                    boolean zM87153g7 = c28655q2.m87153g(interfaceC28601c1M87260n);
                    if ((i64 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | zM87153g7 | c28655q2.m87157i(coordinator);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a2);
                    Boolean boolValueOf3 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                    Boolean boolValueOf4 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                    if ((i64 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87254h(boolValueOf3, boolValueOf4, (InterfaceC4351m) objM87133R11, c28655q2);
                    EnumC26811m enumC26811mM131835l2 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                    if ((i64 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l2);
                    C26809k c26809kM131844u2 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                    if ((i65 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g5) {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u2);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                    zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                    C28673u1 c28673u1Mo86977a3 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                    C28673u1 c28673u1Mo86977a4 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                    AbstractC28669t1 abstractC28669t1M53351e2 = AbstractC18486c.m53351e();
                    zM87157i4 = c28655q2.m87157i(coordinator);
                    Function1 function25 = function23;
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final float f18 = f16;
                    final EnumC4612d0 enumC4612d4 = enumC4612d2;
                    z14 = z27;
                    AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a3, c28673u1Mo86977a4, abstractC28669t1M53351e2.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4639n.m14518w(enumC4612d4, coordinator, modifier6, c13821r1M92099U, f18, z27, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    c28655q = c28655q2;
                    function12 = function18;
                    function14 = function19;
                    modifier3 = modifier6;
                    c13821r2 = c13821r1M92099U;
                    function17 = function25;
                    enumC4612d1 = enumC4612d2;
                    function15 = function20;
                    function13 = function10;
                    function16 = function22;
                    f14 = f18;
                } else {
                    c28655q2.m87138X();
                    f14 = f13;
                    function11 = function4;
                    c28655q = c28655q2;
                    function12 = function8;
                    function13 = function10;
                    function14 = function9;
                    modifier3 = modifier2;
                    c13821r2 = c13821r1M92099U;
                    function15 = function5;
                    function16 = function6;
                    z14 = z4;
                    enumC4612d1 = enumC4612d0;
                    function17 = function7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
                }
            }
            i16 |= 24576;
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function1;
            } else {
                function8 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function8)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                function9 = function2;
            } else {
                function9 = function2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function9)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 128;
            if (i29 != 0) {
                i16 |= 12582912;
                function10 = function3;
            } else {
                function10 = function3;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function10)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i16 |= i34;
                }
            }
            i35 = i15 & 256;
            i36 = i16;
            if (i35 != 0) {
                i36 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i36 |= i37;
            }
            i38 = i15 & 512;
            if (i38 != 0) {
                i36 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function5)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i36 |= i39;
            }
            i44 = i36;
            i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i45 != 0) {
                i46 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(function6)) {
                    i47 = 4;
                } else {
                    i47 = 2;
                }
                i46 = i14 | i47;
            } else {
                i46 = i14;
            }
            i48 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i48 != 0) {
                i46 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q2.m87155h(z4)) {
                    i49 = 32;
                } else {
                    i49 = 16;
                }
                i46 |= i49;
            }
            i54 = i46;
            i55 = i15 & 4096;
            if (i55 != 0) {
                i56 = i54 | 384;
            } else if ((i14 & 384) == 0) {
                if (enumC4612d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4612d0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i57 = 256;
                } else {
                    i57 = 128;
                }
                i56 = i54 | i57;
            } else {
                i56 = i54;
            }
            i58 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i58 != 0) {
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(function7)) {
                        i18 = 2048;
                    }
                    i56 |= i18;
                }
                if ((i44 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i44 & 1, z13)) {
                    c28655q2.m87140Z();
                    i59 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i59 != 0) {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    } else {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                    i65 = i56;
                    final boolean z28 = z15;
                    String strM102021f3 = screenArgs.getFingerprint();
                    zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                    final Modifier modifier7 = modifier2;
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f3);
                    List<String> listM131762f3 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                    if ((i64 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f3);
                    TextResource textResourceM79967c3 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                    if ((i64 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    TextResource.Companion c8687a3 = TextResource.INSTANCE;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c3);
                    C26805g c26805gM131757a3 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                    boolean zM87153g8 = c28655q2.m87153g(interfaceC28601c1M87260n);
                    if ((i64 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | zM87153g8 | c28655q2.m87157i(coordinator);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a3);
                    Boolean boolValueOf5 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                    Boolean boolValueOf6 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                    if ((i64 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87254h(boolValueOf5, boolValueOf6, (InterfaceC4351m) objM87133R11, c28655q2);
                    EnumC26811m enumC26811mM131835l3 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                    if ((i64 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l3);
                    C26809k c26809kM131844u3 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                    if ((i65 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g5) {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u3);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                    zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                    C28673u1 c28673u1Mo86977a5 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                    C28673u1 c28673u1Mo86977a6 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                    AbstractC28669t1 abstractC28669t1M53351e3 = AbstractC18486c.m53351e();
                    zM87157i4 = c28655q2.m87157i(coordinator);
                    Function1 function26 = function23;
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final float f19 = f16;
                    final EnumC4612d0 enumC4612d5 = enumC4612d2;
                    z14 = z28;
                    AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a5, c28673u1Mo86977a6, abstractC28669t1M53351e3.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4639n.m14518w(enumC4612d5, coordinator, modifier7, c13821r1M92099U, f19, z28, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    c28655q = c28655q2;
                    function12 = function18;
                    function14 = function19;
                    modifier3 = modifier7;
                    c13821r2 = c13821r1M92099U;
                    function17 = function26;
                    enumC4612d1 = enumC4612d2;
                    function15 = function20;
                    function13 = function10;
                    function16 = function22;
                    f14 = f19;
                } else {
                    c28655q2.m87138X();
                    f14 = f13;
                    function11 = function4;
                    c28655q = c28655q2;
                    function12 = function8;
                    function13 = function10;
                    function14 = function9;
                    modifier3 = modifier2;
                    c13821r2 = c13821r1M92099U;
                    function15 = function5;
                    function16 = function6;
                    z14 = z4;
                    enumC4612d1 = enumC4612d0;
                    function17 = function7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
                }
            }
            i56 |= 3072;
            if ((i44 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i44 & 1, z13)) {
                c28655q2.m87140Z();
                i59 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i59 != 0) {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                } else {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                }
                c28655q2.m87175r();
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                i65 = i56;
                final boolean z29 = z15;
                String strM102021f4 = screenArgs.getFingerprint();
                zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                final Modifier modifier8 = modifier2;
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f4);
                List<String> listM131762f4 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                if ((i64 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f4);
                TextResource textResourceM79967c4 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                if ((i64 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                TextResource.Companion c8687a4 = TextResource.INSTANCE;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c4);
                C26805g c26805gM131757a4 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                boolean zM87153g9 = c28655q2.m87153g(interfaceC28601c1M87260n);
                if ((i64 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = z18 | zM87153g9 | c28655q2.m87157i(coordinator);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a4);
                Boolean boolValueOf7 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                Boolean boolValueOf8 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                if ((i64 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87254h(boolValueOf7, boolValueOf8, (InterfaceC4351m) objM87133R11, c28655q2);
                EnumC26811m enumC26811mM131835l4 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                if ((i64 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l4);
                C26809k c26809kM131844u4 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                if ((i65 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g5) {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u4);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                C28673u1 c28673u1Mo86977a7 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                C28673u1 c28673u1Mo86977a8 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                AbstractC28669t1 abstractC28669t1M53351e4 = AbstractC18486c.m53351e();
                zM87157i4 = c28655q2.m87157i(coordinator);
                Function1 function27 = function23;
                objM87133R15 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                }
                final float f110 = f16;
                final EnumC4612d0 enumC4612d6 = enumC4612d2;
                z14 = z29;
                AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a7, c28673u1Mo86977a8, abstractC28669t1M53351e4.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4639n.m14518w(enumC4612d6, coordinator, modifier8, c13821r1M92099U, f110, z29, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                c28655q = c28655q2;
                function12 = function18;
                function14 = function19;
                modifier3 = modifier8;
                c13821r2 = c13821r1M92099U;
                function17 = function27;
                enumC4612d1 = enumC4612d2;
                function15 = function20;
                function13 = function10;
                function16 = function22;
                f14 = f110;
            } else {
                c28655q2.m87138X();
                f14 = f13;
                function11 = function4;
                c28655q = c28655q2;
                function12 = function8;
                function13 = function10;
                function14 = function9;
                modifier3 = modifier2;
                c13821r2 = c13821r1M92099U;
                function15 = function5;
                function16 = function6;
                z14 = z4;
                enumC4612d1 = enumC4612d0;
                function17 = function7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
            }
        }
        i16 |= 384;
        modifier2 = modifier;
        i17 = i13 & 3072;
        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 == 0) {
            if ((i15 & 8) == 0) {
                c13821r1M92099U = c13821r1;
                if (c28655q2.m87153g(c13821r1M92099U)) {
                    i66 = 2048;
                }
                i16 |= i66;
            } else {
                c13821r1M92099U = c13821r1;
            }
            i66 = 1024;
            i16 |= i66;
        } else {
            c13821r1M92099U = c13821r1;
        }
        i19 = i15 & 16;
        if (i19 != 0) {
            if ((i13 & 24576) == 0) {
                if (c28655q2.m87147d(f13)) {
                    i24 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i24 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i16 |= i24;
            }
            i25 = i15 & 32;
            if (i25 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                function8 = function1;
            } else {
                function8 = function1;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q2.m87157i(function8)) {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                    }
                    i16 |= i26;
                }
            }
            i27 = i15 & 64;
            if (i27 != 0) {
                i16 |= 1572864;
                function9 = function2;
            } else {
                function9 = function2;
                if ((i13 & 1572864) == 0) {
                    if (c28655q2.m87157i(function9)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 128;
            if (i29 != 0) {
                i16 |= 12582912;
                function10 = function3;
            } else {
                function10 = function3;
                if ((i13 & 12582912) == 0) {
                    if (c28655q2.m87157i(function10)) {
                        i34 = 8388608;
                    } else {
                        i34 = 4194304;
                    }
                    i16 |= i34;
                }
            }
            i35 = i15 & 256;
            i36 = i16;
            if (i35 != 0) {
                i36 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q2.m87157i(function4)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i36 |= i37;
            }
            i38 = i15 & 512;
            if (i38 != 0) {
                i36 |= 805306368;
            } else if ((i13 & 805306368) == 0) {
                if (c28655q2.m87157i(function5)) {
                    i39 = 536870912;
                } else {
                    i39 = 268435456;
                }
                i36 |= i39;
            }
            i44 = i36;
            i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i45 != 0) {
                i46 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q2.m87157i(function6)) {
                    i47 = 4;
                } else {
                    i47 = 2;
                }
                i46 = i14 | i47;
            } else {
                i46 = i14;
            }
            i48 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i48 != 0) {
                i46 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q2.m87155h(z4)) {
                    i49 = 32;
                } else {
                    i49 = 16;
                }
                i46 |= i49;
            }
            i54 = i46;
            i55 = i15 & 4096;
            if (i55 != 0) {
                i56 = i54 | 384;
            } else if ((i14 & 384) == 0) {
                if (enumC4612d0 == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = enumC4612d0.ordinal();
                }
                if (c28655q2.m87149e(iOrdinal)) {
                    i57 = 256;
                } else {
                    i57 = 128;
                }
                i56 = i54 | i57;
            } else {
                i56 = i54;
            }
            i58 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i58 != 0) {
                if ((i14 & 3072) == 0) {
                    if (c28655q2.m87157i(function7)) {
                        i18 = 2048;
                    }
                    i56 |= i18;
                }
                if ((i44 & 306783379) == 306783378) {
                    z13 = true;
                } else {
                    z13 = true;
                }
                if (c28655q2.m87135U(i44 & 1, z13)) {
                    c28655q2.m87140Z();
                    i59 = i13 & 1;
                    c28676v0 = C28635l.f115821a;
                    if (i59 != 0) {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    } else {
                        if (i67 != 0) {
                            modifier4 = C2314t.f9131w;
                        } else {
                            modifier4 = modifier2;
                        }
                        if ((i15 & 8) != 0) {
                            i44 &= -7169;
                            c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                        }
                        if (i19 != 0) {
                            f15 = 0;
                        } else {
                            f15 = f13;
                        }
                        if (i25 != 0) {
                            objM87133R6 = c28655q2.m87133R();
                            if (objM87133R6 == c28676v0) {
                                objM87133R6 = new C4273a(8);
                                c28655q2.m87172p0(objM87133R6);
                            }
                            function18 = (Function1) objM87133R6;
                        } else {
                            function18 = function8;
                        }
                        if (i27 != 0) {
                            objM87133R5 = c28655q2.m87133R();
                            if (objM87133R5 == c28676v0) {
                                objM87133R5 = new C4273a(9);
                                c28655q2.m87172p0(objM87133R5);
                            }
                            function19 = (Function1) objM87133R5;
                        } else {
                            function19 = function9;
                        }
                        if (i29 != 0) {
                            objM87133R4 = c28655q2.m87133R();
                            if (objM87133R4 == c28676v0) {
                                objM87133R4 = new C4273a(10);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            function10 = (Function1) objM87133R4;
                        }
                        if (i35 != 0) {
                            objM87133R3 = c28655q2.m87133R();
                            if (objM87133R3 == c28676v0) {
                                objM87133R3 = new C4273a(11);
                                c28655q2.m87172p0(objM87133R3);
                            }
                            function11 = (Function1) objM87133R3;
                        } else {
                            function11 = function4;
                        }
                        if (i38 != 0) {
                            objM87133R2 = c28655q2.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C4273a(12);
                                c28655q2.m87172p0(objM87133R2);
                            }
                            function20 = (Function1) objM87133R2;
                        } else {
                            function20 = function5;
                        }
                        if (i45 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C4273a(13);
                                c28655q2.m87172p0(objM87133R);
                            }
                            function21 = (Function1) objM87133R;
                        } else {
                            modifier4 = modifier4;
                            function21 = function6;
                        }
                        if (i48 != 0) {
                            z15 = false;
                        } else {
                            z15 = z4;
                        }
                        if (i55 != 0) {
                            enumC4612d2 = EnumC4612d0.LEGACY;
                        } else {
                            enumC4612d2 = enumC4612d0;
                        }
                        if (i58 != 0) {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = null;
                        } else {
                            i64 = i44;
                            f16 = f15;
                            modifier2 = modifier4;
                            function22 = function21;
                            function23 = function7;
                        }
                    }
                    c28655q2.m87175r();
                    interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                    i65 = i56;
                    final boolean z210 = z15;
                    String strM102021f5 = screenArgs.getFingerprint();
                    zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                    final Modifier modifier9 = modifier2;
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new g(coordinator, screenArgs, null);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f5);
                    List<String> listM131762f5 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                    if ((i64 & 458752) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87153g) {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f5);
                    TextResource textResourceM79967c5 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                    if ((i64 & 3670016) == 1048576) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87153g2) {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    TextResource.Companion c8687a5 = TextResource.INSTANCE;
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c5);
                    C26805g c26805gM131757a5 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                    boolean zM87153g10 = c28655q2.m87153g(interfaceC28601c1M87260n);
                    if ((i64 & 29360128) == 8388608) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    zM87157i2 = z18 | zM87153g10 | c28655q2.m87157i(coordinator);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i2) {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a5);
                    Boolean boolValueOf9 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                    Boolean boolValueOf10 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                    if ((i64 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87153g3) {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87254h(boolValueOf9, boolValueOf10, (InterfaceC4351m) objM87133R11, c28655q2);
                    EnumC26811m enumC26811mM131835l5 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                    if ((i64 & 1879048192) == 536870912) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R12 = c28655q2.m87133R();
                    if (zM87153g4) {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l5);
                    C26809k c26809kM131844u5 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                    if ((i65 & 14) == 4) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g5) {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u5);
                    interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                    zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                    C28673u1 c28673u1Mo86977a9 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                    C28673u1 c28673u1Mo86977a10 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                    AbstractC28669t1 abstractC28669t1M53351e5 = AbstractC18486c.m53351e();
                    zM87157i4 = c28655q2.m87157i(coordinator);
                    Function1 function28 = function23;
                    objM87133R15 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    } else {
                        objM87133R15 = new f(coordinator);
                        c28655q2.m87172p0(objM87133R15);
                    }
                    final float f111 = f16;
                    final EnumC4612d0 enumC4612d7 = enumC4612d2;
                    z14 = z210;
                    AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a9, c28673u1Mo86977a10, abstractC28669t1M53351e5.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4639n.m14518w(enumC4612d7, coordinator, modifier9, c13821r1M92099U, f111, z210, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    c28655q = c28655q2;
                    function12 = function18;
                    function14 = function19;
                    modifier3 = modifier9;
                    c13821r2 = c13821r1M92099U;
                    function17 = function28;
                    enumC4612d1 = enumC4612d2;
                    function15 = function20;
                    function13 = function10;
                    function16 = function22;
                    f14 = f111;
                } else {
                    c28655q2.m87138X();
                    f14 = f13;
                    function11 = function4;
                    c28655q = c28655q2;
                    function12 = function8;
                    function13 = function10;
                    function14 = function9;
                    modifier3 = modifier2;
                    c13821r2 = c13821r1M92099U;
                    function15 = function5;
                    function16 = function6;
                    z14 = z4;
                    enumC4612d1 = enumC4612d0;
                    function17 = function7;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
                }
            }
            i56 |= 3072;
            if ((i44 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i44 & 1, z13)) {
                c28655q2.m87140Z();
                i59 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i59 != 0) {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                } else {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                }
                c28655q2.m87175r();
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                i65 = i56;
                final boolean z211 = z15;
                String strM102021f6 = screenArgs.getFingerprint();
                zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                final Modifier modifier10 = modifier2;
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f6);
                List<String> listM131762f6 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                if ((i64 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f6);
                TextResource textResourceM79967c6 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                if ((i64 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                TextResource.Companion c8687a6 = TextResource.INSTANCE;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c6);
                C26805g c26805gM131757a6 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                boolean zM87153g11 = c28655q2.m87153g(interfaceC28601c1M87260n);
                if ((i64 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = z18 | zM87153g11 | c28655q2.m87157i(coordinator);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a6);
                Boolean boolValueOf11 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                Boolean boolValueOf12 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                if ((i64 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87254h(boolValueOf11, boolValueOf12, (InterfaceC4351m) objM87133R11, c28655q2);
                EnumC26811m enumC26811mM131835l6 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                if ((i64 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l6);
                C26809k c26809kM131844u6 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                if ((i65 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g5) {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u6);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                C28673u1 c28673u1Mo86977a11 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                C28673u1 c28673u1Mo86977a12 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                AbstractC28669t1 abstractC28669t1M53351e6 = AbstractC18486c.m53351e();
                zM87157i4 = c28655q2.m87157i(coordinator);
                Function1 function29 = function23;
                objM87133R15 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                }
                final float f112 = f16;
                final EnumC4612d0 enumC4612d8 = enumC4612d2;
                z14 = z211;
                AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a11, c28673u1Mo86977a12, abstractC28669t1M53351e6.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4639n.m14518w(enumC4612d8, coordinator, modifier10, c13821r1M92099U, f112, z211, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                c28655q = c28655q2;
                function12 = function18;
                function14 = function19;
                modifier3 = modifier10;
                c13821r2 = c13821r1M92099U;
                function17 = function29;
                enumC4612d1 = enumC4612d2;
                function15 = function20;
                function13 = function10;
                function16 = function22;
                f14 = f112;
            } else {
                c28655q2.m87138X();
                f14 = f13;
                function11 = function4;
                c28655q = c28655q2;
                function12 = function8;
                function13 = function10;
                function14 = function9;
                modifier3 = modifier2;
                c13821r2 = c13821r1M92099U;
                function15 = function5;
                function16 = function6;
                z14 = z4;
                enumC4612d1 = enumC4612d0;
                function17 = function7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
            }
        }
        i16 |= 24576;
        i25 = i15 & 32;
        if (i25 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            function8 = function1;
        } else {
            function8 = function1;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q2.m87157i(function8)) {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i26 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                i16 |= i26;
            }
        }
        i27 = i15 & 64;
        if (i27 != 0) {
            i16 |= 1572864;
            function9 = function2;
        } else {
            function9 = function2;
            if ((i13 & 1572864) == 0) {
                if (c28655q2.m87157i(function9)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i16 |= i28;
            }
        }
        i29 = i15 & 128;
        if (i29 != 0) {
            i16 |= 12582912;
            function10 = function3;
        } else {
            function10 = function3;
            if ((i13 & 12582912) == 0) {
                if (c28655q2.m87157i(function10)) {
                    i34 = 8388608;
                } else {
                    i34 = 4194304;
                }
                i16 |= i34;
            }
        }
        i35 = i15 & 256;
        i36 = i16;
        if (i35 != 0) {
            i36 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q2.m87157i(function4)) {
                i37 = 67108864;
            } else {
                i37 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i36 |= i37;
        }
        i38 = i15 & 512;
        if (i38 != 0) {
            i36 |= 805306368;
        } else if ((i13 & 805306368) == 0) {
            if (c28655q2.m87157i(function5)) {
                i39 = 536870912;
            } else {
                i39 = 268435456;
            }
            i36 |= i39;
        }
        i44 = i36;
        i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i45 != 0) {
            i46 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q2.m87157i(function6)) {
                i47 = 4;
            } else {
                i47 = 2;
            }
            i46 = i14 | i47;
        } else {
            i46 = i14;
        }
        i48 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i48 != 0) {
            i46 |= 48;
        } else if ((i14 & 48) != 0) {
            if (c28655q2.m87155h(z4)) {
                i49 = 32;
            } else {
                i49 = 16;
            }
            i46 |= i49;
        }
        i54 = i46;
        i55 = i15 & 4096;
        if (i55 != 0) {
            i56 = i54 | 384;
        } else if ((i14 & 384) == 0) {
            if (enumC4612d0 == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = enumC4612d0.ordinal();
            }
            if (c28655q2.m87149e(iOrdinal)) {
                i57 = 256;
            } else {
                i57 = 128;
            }
            i56 = i54 | i57;
        } else {
            i56 = i54;
        }
        i58 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i58 != 0) {
            if ((i14 & 3072) == 0) {
                if (c28655q2.m87157i(function7)) {
                    i18 = 2048;
                }
                i56 |= i18;
            }
            if ((i44 & 306783379) == 306783378) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (c28655q2.m87135U(i44 & 1, z13)) {
                c28655q2.m87140Z();
                i59 = i13 & 1;
                c28676v0 = C28635l.f115821a;
                if (i59 != 0) {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                } else {
                    if (i67 != 0) {
                        modifier4 = C2314t.f9131w;
                    } else {
                        modifier4 = modifier2;
                    }
                    if ((i15 & 8) != 0) {
                        i44 &= -7169;
                        c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                    }
                    if (i19 != 0) {
                        f15 = 0;
                    } else {
                        f15 = f13;
                    }
                    if (i25 != 0) {
                        objM87133R6 = c28655q2.m87133R();
                        if (objM87133R6 == c28676v0) {
                            objM87133R6 = new C4273a(8);
                            c28655q2.m87172p0(objM87133R6);
                        }
                        function18 = (Function1) objM87133R6;
                    } else {
                        function18 = function8;
                    }
                    if (i27 != 0) {
                        objM87133R5 = c28655q2.m87133R();
                        if (objM87133R5 == c28676v0) {
                            objM87133R5 = new C4273a(9);
                            c28655q2.m87172p0(objM87133R5);
                        }
                        function19 = (Function1) objM87133R5;
                    } else {
                        function19 = function9;
                    }
                    if (i29 != 0) {
                        objM87133R4 = c28655q2.m87133R();
                        if (objM87133R4 == c28676v0) {
                            objM87133R4 = new C4273a(10);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        function10 = (Function1) objM87133R4;
                    }
                    if (i35 != 0) {
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4273a(11);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        function11 = (Function1) objM87133R3;
                    } else {
                        function11 = function4;
                    }
                    if (i38 != 0) {
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C4273a(12);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        function20 = (Function1) objM87133R2;
                    } else {
                        function20 = function5;
                    }
                    if (i45 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4273a(13);
                            c28655q2.m87172p0(objM87133R);
                        }
                        function21 = (Function1) objM87133R;
                    } else {
                        modifier4 = modifier4;
                        function21 = function6;
                    }
                    if (i48 != 0) {
                        z15 = false;
                    } else {
                        z15 = z4;
                    }
                    if (i55 != 0) {
                        enumC4612d2 = EnumC4612d0.LEGACY;
                    } else {
                        enumC4612d2 = enumC4612d0;
                    }
                    if (i58 != 0) {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = null;
                    } else {
                        i64 = i44;
                        f16 = f15;
                        modifier2 = modifier4;
                        function22 = function21;
                        function23 = function7;
                    }
                }
                c28655q2.m87175r();
                interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
                i65 = i56;
                final boolean z212 = z15;
                String strM102021f7 = screenArgs.getFingerprint();
                zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
                final Modifier modifier11 = modifier2;
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new g(coordinator, screenArgs, null);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f7);
                List<String> listM131762f7 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
                if ((i64 & 458752) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R8 = c28655q2.m87133R();
                if (zM87153g) {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f7);
                TextResource textResourceM79967c7 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
                if ((i64 & 3670016) == 1048576) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R9 = c28655q2.m87133R();
                if (zM87153g2) {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                TextResource.Companion c8687a7 = TextResource.INSTANCE;
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c7);
                C26805g c26805gM131757a7 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
                boolean zM87153g12 = c28655q2.m87153g(interfaceC28601c1M87260n);
                if ((i64 & 29360128) == 8388608) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zM87157i2 = z18 | zM87153g12 | c28655q2.m87157i(coordinator);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i2) {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a7);
                Boolean boolValueOf13 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
                Boolean boolValueOf14 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
                if ((i64 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R11 = c28655q2.m87133R();
                if (zM87153g3) {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87254h(boolValueOf13, boolValueOf14, (InterfaceC4351m) objM87133R11, c28655q2);
                EnumC26811m enumC26811mM131835l7 = m14464C(interfaceC28601c1M87260n).getLoadingState();
                if ((i64 & 1879048192) == 536870912) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R12 = c28655q2.m87133R();
                if (zM87153g4) {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l7);
                C26809k c26809kM131844u7 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
                if ((i65 & 14) == 4) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g5) {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u7);
                interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
                zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                    c28655q2.m87172p0(objM87133R14);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
                C28673u1 c28673u1Mo86977a13 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
                C28673u1 c28673u1Mo86977a14 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
                AbstractC28669t1 abstractC28669t1M53351e7 = AbstractC18486c.m53351e();
                zM87157i4 = c28655q2.m87157i(coordinator);
                Function1 function210 = function23;
                objM87133R15 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                } else {
                    objM87133R15 = new f(coordinator);
                    c28655q2.m87172p0(objM87133R15);
                }
                final float f113 = f16;
                final EnumC4612d0 enumC4612d9 = enumC4612d2;
                z14 = z212;
                AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a13, c28673u1Mo86977a14, abstractC28669t1M53351e7.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4639n.m14518w(enumC4612d9, coordinator, modifier11, c13821r1M92099U, f113, z212, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                c28655q = c28655q2;
                function12 = function18;
                function14 = function19;
                modifier3 = modifier11;
                c13821r2 = c13821r1M92099U;
                function17 = function210;
                enumC4612d1 = enumC4612d2;
                function15 = function20;
                function13 = function10;
                function16 = function22;
                f14 = f113;
            } else {
                c28655q2.m87138X();
                f14 = f13;
                function11 = function4;
                c28655q = c28655q2;
                function12 = function8;
                function13 = function10;
                function14 = function9;
                modifier3 = modifier2;
                c13821r2 = c13821r1M92099U;
                function15 = function5;
                function16 = function6;
                z14 = z4;
                enumC4612d1 = enumC4612d0;
                function17 = function7;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
            }
        }
        i56 |= 3072;
        if ((i44 & 306783379) == 306783378) {
            z13 = true;
        } else {
            z13 = true;
        }
        if (c28655q2.m87135U(i44 & 1, z13)) {
            c28655q2.m87140Z();
            i59 = i13 & 1;
            c28676v0 = C28635l.f115821a;
            if (i59 != 0) {
                if (i67 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i15 & 8) != 0) {
                    i44 &= -7169;
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                }
                if (i19 != 0) {
                    f15 = 0;
                } else {
                    f15 = f13;
                }
                if (i25 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4273a(8);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function18 = (Function1) objM87133R6;
                } else {
                    function18 = function8;
                }
                if (i27 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4273a(9);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function19 = (Function1) objM87133R5;
                } else {
                    function19 = function9;
                }
                if (i29 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4273a(10);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4273a(11);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function4;
                }
                if (i38 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function20 = (Function1) objM87133R2;
                } else {
                    function20 = function5;
                }
                if (i45 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4273a(13);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function21 = (Function1) objM87133R;
                } else {
                    modifier4 = modifier4;
                    function21 = function6;
                }
                if (i48 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                if (i55 != 0) {
                    enumC4612d2 = EnumC4612d0.LEGACY;
                } else {
                    enumC4612d2 = enumC4612d0;
                }
                if (i58 != 0) {
                    i64 = i44;
                    f16 = f15;
                    modifier2 = modifier4;
                    function22 = function21;
                    function23 = null;
                } else {
                    i64 = i44;
                    f16 = f15;
                    modifier2 = modifier4;
                    function22 = function21;
                    function23 = function7;
                }
            } else {
                if (i67 != 0) {
                    modifier4 = C2314t.f9131w;
                } else {
                    modifier4 = modifier2;
                }
                if ((i15 & 8) != 0) {
                    i44 &= -7169;
                    c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q2, 1);
                }
                if (i19 != 0) {
                    f15 = 0;
                } else {
                    f15 = f13;
                }
                if (i25 != 0) {
                    objM87133R6 = c28655q2.m87133R();
                    if (objM87133R6 == c28676v0) {
                        objM87133R6 = new C4273a(8);
                        c28655q2.m87172p0(objM87133R6);
                    }
                    function18 = (Function1) objM87133R6;
                } else {
                    function18 = function8;
                }
                if (i27 != 0) {
                    objM87133R5 = c28655q2.m87133R();
                    if (objM87133R5 == c28676v0) {
                        objM87133R5 = new C4273a(9);
                        c28655q2.m87172p0(objM87133R5);
                    }
                    function19 = (Function1) objM87133R5;
                } else {
                    function19 = function9;
                }
                if (i29 != 0) {
                    objM87133R4 = c28655q2.m87133R();
                    if (objM87133R4 == c28676v0) {
                        objM87133R4 = new C4273a(10);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    function10 = (Function1) objM87133R4;
                }
                if (i35 != 0) {
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4273a(11);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    function11 = (Function1) objM87133R3;
                } else {
                    function11 = function4;
                }
                if (i38 != 0) {
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C4273a(12);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    function20 = (Function1) objM87133R2;
                } else {
                    function20 = function5;
                }
                if (i45 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4273a(13);
                        c28655q2.m87172p0(objM87133R);
                    }
                    function21 = (Function1) objM87133R;
                } else {
                    modifier4 = modifier4;
                    function21 = function6;
                }
                if (i48 != 0) {
                    z15 = false;
                } else {
                    z15 = z4;
                }
                if (i55 != 0) {
                    enumC4612d2 = EnumC4612d0.LEGACY;
                } else {
                    enumC4612d2 = enumC4612d0;
                }
                if (i58 != 0) {
                    i64 = i44;
                    f16 = f15;
                    modifier2 = modifier4;
                    function22 = function21;
                    function23 = null;
                } else {
                    i64 = i44;
                    f16 = f15;
                    modifier2 = modifier4;
                    function22 = function21;
                    function23 = function7;
                }
            }
            c28655q2.m87175r();
            interfaceC28601c1M87260n = AbstractC28683x.m87260n(coordinator.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q2, 0, 2);
            i65 = i56;
            final boolean z213 = z15;
            String strM102021f8 = screenArgs.getFingerprint();
            zM87157i = c28655q2.m87157i(coordinator) | c28655q2.m87157i(screenArgs);
            final Modifier modifier12 = modifier2;
            objM87133R7 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R7 = new g(coordinator, screenArgs, null);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new g(coordinator, screenArgs, null);
                c28655q2.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R7, strM102021f8);
            List<String> listM131762f8 = m14464C(interfaceC28601c1M87260n).getConversation().m131762f();
            if ((i64 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            zM87153g = z16 | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R8 = c28655q2.m87133R();
            if (zM87153g) {
                objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new h(function18, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, listM131762f8);
            TextResource textResourceM79967c8 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState().getTitle();
            if ((i64 & 3670016) == 1048576) {
                z17 = true;
            } else {
                z17 = false;
            }
            zM87153g2 = z17 | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R9 = c28655q2.m87133R();
            if (zM87153g2) {
                objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R9);
            } else {
                objM87133R9 = new i(function19, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R9);
            }
            TextResource.Companion c8687a8 = TextResource.INSTANCE;
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R9, textResourceM79967c8);
            C26805g c26805gM131757a8 = m14464C(interfaceC28601c1M87260n).getConversation().getBetaTagViewState();
            boolean zM87153g13 = c28655q2.m87153g(interfaceC28601c1M87260n);
            if ((i64 & 29360128) == 8388608) {
                z18 = true;
            } else {
                z18 = false;
            }
            zM87157i2 = z18 | zM87153g13 | c28655q2.m87157i(coordinator);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i2) {
                objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new a(function10, interfaceC28601c1M87260n, coordinator, null);
                c28655q2.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, c26805gM131757a8);
            Boolean boolValueOf15 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getDisableTextField());
            Boolean boolValueOf16 = Boolean.valueOf(m14464C(interfaceC28601c1M87260n).getShowStopGenerating());
            if ((i64 & 234881024) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            zM87153g3 = z19 | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R11 = c28655q2.m87133R();
            if (zM87153g3) {
                objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new b(function11, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R11);
            }
            AbstractC28683x.m87254h(boolValueOf15, boolValueOf16, (InterfaceC4351m) objM87133R11, c28655q2);
            EnumC26811m enumC26811mM131835l8 = m14464C(interfaceC28601c1M87260n).getLoadingState();
            if ((i64 & 1879048192) == 536870912) {
                z24 = true;
            } else {
                z24 = false;
            }
            zM87153g4 = z24 | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R12 = c28655q2.m87133R();
            if (zM87153g4) {
                objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R12);
            } else {
                objM87133R12 = new c(function20, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R12);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, enumC26811mM131835l8);
            C26809k c26809kM131844u8 = m14464C(interfaceC28601c1M87260n).getSubmitErrorToastState();
            if ((i65 & 14) == 4) {
                z25 = true;
            } else {
                z25 = false;
            }
            zM87153g5 = z25 | c28655q2.m87153g(interfaceC28601c1M87260n);
            objM87133R13 = c28655q2.m87133R();
            if (zM87153g5) {
                objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R13);
            } else {
                objM87133R13 = new d(function22, interfaceC28601c1M87260n, null);
                c28655q2.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c26809kM131844u8);
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(function23, c28655q2);
            zM87157i3 = c28655q2.m87157i(coordinator) | c28655q2.m87153g(interfaceC28601c1M87238F);
            objM87133R14 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R14);
            } else {
                objM87133R14 = new e(coordinator, interfaceC28601c1M87238F, null);
                c28655q2.m87172p0(objM87133R14);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R14, coordinator);
            C28673u1 c28673u1Mo86977a15 = AbstractC21050i.m58879c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownStyles());
            C28673u1 c28673u1Mo86977a16 = AbstractC40817h0.m132310c().mo86977a(m14464C(interfaceC28601c1M87260n).getMarkdownSpacing());
            AbstractC28669t1 abstractC28669t1M53351e8 = AbstractC18486c.m53351e();
            zM87157i4 = c28655q2.m87157i(coordinator);
            Function1 function211 = function23;
            objM87133R15 = c28655q2.m87133R();
            if (zM87157i4) {
                objM87133R15 = new f(coordinator);
                c28655q2.m87172p0(objM87133R15);
            } else {
                objM87133R15 = new f(coordinator);
                c28655q2.m87172p0(objM87133R15);
            }
            final float f114 = f16;
            final EnumC4612d0 enumC4612d10 = enumC4612d2;
            z14 = z213;
            AbstractC28683x.m87248b(new C28673u1[]{c28673u1Mo86977a15, c28673u1Mo86977a16, abstractC28669t1M53351e8.mo86977a((InterfaceC21467g) objM87133R15)}, AbstractC37817c.m121344e(-134533257, c28655q2, new InterfaceC4351m() { // from class: ch0.j
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4639n.m14518w(enumC4612d10, coordinator, modifier12, c13821r1M92099U, f114, z213, interfaceC28601c1M87260n, (Composer) obj, iIntValue);
                }
            }), c28655q2, 56);
            c28655q = c28655q2;
            function12 = function18;
            function14 = function19;
            modifier3 = modifier12;
            c13821r2 = c13821r1M92099U;
            function17 = function211;
            enumC4612d1 = enumC4612d2;
            function15 = function20;
            function13 = function10;
            function16 = function22;
            f14 = f114;
        } else {
            c28655q2.m87138X();
            f14 = f13;
            function11 = function4;
            c28655q = c28655q2;
            function12 = function8;
            function13 = function10;
            function14 = function9;
            modifier3 = modifier2;
            c13821r2 = c13821r1M92099U;
            function15 = function5;
            function16 = function6;
            z14 = z4;
            enumC4612d1 = enumC4612d0;
            function17 = function7;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4632k(coordinator, screenArgs, modifier3, c13821r2, f14, function12, function14, function13, function11, function15, function16, z14, enumC4612d1, function17, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m14515t(List it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m14516u(TextResource textResource) {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final Function1 m14517v(InterfaceC28670t2 interfaceC28670t2) {
        return (Function1) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m14518w(EnumC4612d0 enumC4612d0, C4656v0 c4656v0, Modifier modifier, C13821r1 c13821r1, float f13, boolean z4, InterfaceC28670t2 interfaceC28670t2, Composer composer, int i13) throws Throwable {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            int i14 = x.f18849a[enumC4612d0.ordinal()];
            if (i14 == 1) {
                c28655q.m87150e0(-437438494);
                m14465D(c4656v0, m14464C(interfaceC28670t2), modifier, c13821r1, f13, z4, c28655q, 0);
                c28655q.m87173q(false);
            } else {
                if (i14 != 2 && i14 != 3) {
                    throw AbstractC11895b.m32003v(-437439846, c28655q, false);
                }
                c28655q.m87150e0(-437424325);
                m14483V(c4656v0, m14464C(interfaceC28670t2), modifier, c13821r1, f13, z4, enumC4612d0 == EnumC4612d0.PINS_LATEST_RESPONSE, c28655q, 0);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m14519x(C4656v0 c4656v0, C32645n0 c32645n0, Modifier modifier, C13821r1 c13821r1, float f13, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function1 function5, Function1 function6, boolean z4, EnumC4612d0 enumC4612d0, Function1 function7, int i13, int i14, int i15, Composer composer, int i16) {
        m14514s(c4656v0, c32645n0, modifier, c13821r1, f13, function1, function2, function3, function4, function5, function6, z4, enumC4612d0, function7, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m14520y(InterfaceC4339a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m14521z(C4605b it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }
}
