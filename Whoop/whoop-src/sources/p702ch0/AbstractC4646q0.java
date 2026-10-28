package p702ch0;

import android.content.res.Configuration;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cb1.C4387a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.C13096w1;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import l83.C23454a0;
import nl0.EnumC26800b;
import no.nordicsemi.android.dfu.DfuBaseService;
import p027b3.AbstractC2453v1;
import p077d0.AbstractC11333b0;
import p077d0.AbstractC11348f;
import p132f0.C13821r1;
import p238j0.C21076b;
import p238j0.InterfaceC21082h;
import p291l0.InterfaceC23001u;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p445r0.C30835c;
import p445r0.InterfaceC30833a;
import p505ts.AbstractC34132o;
import p636y3.InterfaceC39171c;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.AbstractC32673s3;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;
import x81.AbstractC38073e;
import zg0.AbstractC40624g;
import zg0.C40621d;
import zg0.C40626i;

/* JADX INFO: renamed from: ch0.q0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a[\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u000f\u0010\u0013\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0012\u001a'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001c\u0010\u0019\u001a\u00020\u0006*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0080@¢\u0006\u0004\b\u0019\u0010\u001a\u001aK\u0010\u001f\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\b\b\u0002\u0010\u0016\u001a\u00020\u00102\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\u0006*\u00020\u001b2\u0006\u0010!\u001a\u00020\rH\u0007¢\u0006\u0004\b\"\u0010#\u001a1\u0010)\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\b\u0002\u0010(\u001a\u00020\u0010H\u0001¢\u0006\u0004\b)\u0010*\u001a9\u0010/\u001a\u0004\u0018\u00010\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0010H\u0001¢\u0006\u0004\b/\u00100\"\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00103¨\u00068²\u0006\f\u00107\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lzg0/i;", "viewState", "", "isWceLoading", "Lkotlin/Function1;", "Lzg0/g;", "Ll83/a0;", "onViewEvent", "Lf0/r1;", "scrollState", "halfDrawerReadOnly", "pinsLatestResponse", "honorsLateAnchor", "Lch0/o0;", "s", "(Lzg0/i;ZLkotlin/jvm/functions/Function1;Lf0/r1;ZZZLandroidx/compose/runtime/Composer;II)Lch0/o0;", "", "y", "(Landroidx/compose/runtime/Composer;I)I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "bottom", "scrollValue", "threshold", "x", "(III)I", "q", "(Lf0/r1;ILq83/d;)Ljava/lang/Object;", "Ll0/u;", "enabled", "Lkotlin/Function0;", "onTap", "k", "(Ll0/u;ZLf0/r1;Lc93/a;ILc93/a;Landroidx/compose/runtime/Composer;II)V", "behavior", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ll0/u;Lch0/o0;Landroidx/compose/runtime/Composer;I)V", "viewportHeightPx", "", "pinnedMessageTopY", "messagesBottomY", "peekHeightPx", "r", "(IFFI)I", "currentScroll", "maxScroll", "responseTopY", "viewportTopY", "v", "(IIFFI)Ljava/lang/Integer;", "Ly3/f;", "a", "F", "SCROLL_TO_BOTTOM_MAX_THRESHOLD", "b", "RESPONSE_PIN_MAX_PEEK", "currentViewState", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4646q0 {

    /* JADX INFO: renamed from: a */
    private static final float f18887a = 150;

    /* JADX INFO: renamed from: b */
    private static final float f18888b = 80;

    /* JADX INFO: renamed from: ch0.q0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a extends C22672i implements InterfaceC4339a {
        public a(Object obj) {
            super(0, 0, C4642o0.class, obj, "onUserScrolled", "onUserScrolled$bot_release()V");
        }

        @Override // c93.InterfaceC4339a
        public /* bridge */ /* synthetic */ Object invoke() {
            m134057invoke();
            return C23454a0.f92919a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m134057invoke() {
            ((C4642o0) this.receiver).m14553A();
        }
    }

    /* JADX INFO: renamed from: ch0.q0$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$ScrollToBottomAffordance$3$1$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {603}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18889w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13821r1 f18890x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f18891y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18890x = c13821r1;
            this.f18891y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f18890x, this.f18891y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18889w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13821r1 c13821r1 = this.f18890x;
                int iIntValue = ((Number) this.f18891y.invoke()).intValue();
                this.f18889w = 1;
                if (AbstractC4646q0.m14602q(c13821r1, iIntValue, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ch0.q0$c */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$1$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {413}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18892w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18893x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40626i f18894y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4642o0 f18895z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z4, C40626i c40626i, C4642o0 c4642o0, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18893x = z4;
            this.f18894y = c40626i;
            this.f18895z = c4642o0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new c(this.f18893x, this.f18894y, this.f18895z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18892w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f18893x && !this.f18894y.getConversation().m131760d().isEmpty()) {
                    C4642o0 c4642o0 = this.f18895z;
                    this.f18892w = 1;
                    if (c4642o0.m14564g(this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ch0.q0$d */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$3$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {445, 450, 452, 453, 454}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C40626i f18896E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C4642o0 f18897F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ boolean f18898G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ boolean f18899H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ String f18900I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ int f18901J;

        /* JADX INFO: renamed from: w */
        Object f18902w;

        /* JADX INFO: renamed from: x */
        int f18903x;

        /* JADX INFO: renamed from: y */
        int f18904y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f18905z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z4, C40626i c40626i, C4642o0 c4642o0, boolean z13, boolean z14, String str, int i13, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18905z = z4;
            this.f18896E = c40626i;
            this.f18897F = c4642o0;
            this.f18898G = z13;
            this.f18899H = z14;
            this.f18900I = str;
            this.f18901J = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new d(this.f18905z, this.f18896E, this.f18897F, this.f18898G, this.f18899H, this.f18900I, this.f18901J, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        
            if (r2.m14557J(r10, r3, r9) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00bf, code lost:
        
            r0 = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
        
            if (r2.m14556H(r9) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f5, code lost:
        
            if (((p445r0.C30835c) r3).m94839b(null, r9) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        
            if (r2.m39185g(r3, r9) == r0) goto L62;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 297
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: p702ch0.AbstractC4646q0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ch0.q0$e */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$4$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {470}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C4642o0 f18906E;

        /* JADX INFO: renamed from: w */
        int f18907w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18908x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f18909y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40626i f18910z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z4, String str, C40626i c40626i, C4642o0 c4642o0, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18908x = z4;
            this.f18909y = str;
            this.f18910z = c40626i;
            this.f18906E = c4642o0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f18908x, this.f18909y, this.f18910z, this.f18906E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18907w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f18908x && this.f18909y != null && !this.f18910z.getIsRefreshingMetadata()) {
                    C4642o0 c4642o0 = this.f18906E;
                    this.f18907w = 1;
                    if (c4642o0.m14555F(this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ch0.q0$f */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$5$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {493}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18911w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18912x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4642o0 f18913y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ int f18914z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z4, C4642o0 c4642o0, int i13, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18912x = z4;
            this.f18913y = c4642o0;
            this.f18914z = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f18912x, this.f18913y, this.f18914z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18911w;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!this.f18912x && this.f18913y.m14571n() && this.f18914z > this.f18913y.m14573p()) {
                    this.f18913y.m14562Q(this.f18914z);
                    C4642o0 c4642o0 = this.f18913y;
                    this.f18911w = 1;
                    if (c4642o0.m14556H(this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ch0.q0$g */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$6$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {501}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18915w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4642o0 f18916x;

        /* JADX INFO: renamed from: ch0.q0$g$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$6$1$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lj0/h;", "it", "", "<anonymous>", "(Lj0/h;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f18917w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f18918x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f18918x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC21082h interfaceC21082h, InterfaceC30057d<? super Boolean> interfaceC30057d) {
                return ((a) create(interfaceC21082h, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC21082h interfaceC21082h = (InterfaceC21082h) this.f18918x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f18917w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(interfaceC21082h instanceof C21076b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C4642o0 c4642o0, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18916x = c4642o0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f18916x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18915w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13096w1 c13096w1 = this.f18916x.getScrollState().f49320c.f79947a;
                a aVar = new a(null);
                this.f18915w = 1;
                if (AbstractC13091v.m36616z(c13096w1, aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f18916x.m14553A();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.q0$h */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$7$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {508}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18919w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4642o0 f18920x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18921y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f18922z;

        /* JADX INFO: renamed from: ch0.q0$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C4642o0 f18923w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ Function1 f18924x;

            public a(C4642o0 c4642o0, Function1 function1) {
                this.f18923w = c4642o0;
                this.f18924x = function1;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List<C4642o0.a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C4642o0 c4642o0 = this.f18923w;
                Function1 function1 = this.f18924x;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String strM14565h = c4642o0.m14565h((C4642o0.a) it.next());
                    if (strM14565h != null) {
                        function1.invoke(new AbstractC40624g.t(strM14565h));
                    }
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C4642o0 c4642o0, InterfaceC28670t2 interfaceC28670t2, Function1 function1, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18920x = c4642o0;
            this.f18921y = interfaceC28670t2;
            this.f18922z = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final List m14613h(C4642o0 c4642o0, InterfaceC28670t2 interfaceC28670t2) {
            c4642o0.getScrollState().f49318a.m87024x();
            return c4642o0.m14558L(AbstractC4646q0.m14606u(interfaceC28670t2));
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f18920x, this.f18921y, this.f18922z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18919w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C4637m(2, this.f18920x, this.f18921y));
                a aVar = new a(this.f18920x, this.f18922z);
                this.f18919w = 1;
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

    /* JADX INFO: renamed from: ch0.q0$i */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatScrollBehaviorKt$rememberAiChatScrollBehavior$8$1", m100430f = "AiChatScrollBehavior.kt", m100431l = {523}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18925w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4642o0 f18926x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f18927y;

        /* JADX INFO: renamed from: ch0.q0$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C4642o0 f18928w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC28670t2 f18929x;

            public a(C4642o0 c4642o0, InterfaceC28670t2 interfaceC28670t2) {
                this.f18928w = c4642o0;
                this.f18929x = interfaceC28670t2;
            }

            /* JADX INFO: renamed from: b */
            public final Object m14617b(int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C4642o0 c4642o0 = this.f18928w;
                c4642o0.m14561P(c4642o0.m14563R(AbstractC4646q0.m14606u(this.f18929x).getConversation().m131761e()));
                return C23454a0.f92919a;
            }

            @Override // ec3.InterfaceC13062m
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                return m14617b(((Number) obj).intValue(), interfaceC30057d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C4642o0 c4642o0, InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18926x = c4642o0;
            this.f18927y = interfaceC28670t2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public static final int m14616h(C4642o0 c4642o0) {
            return c4642o0.getScrollState().f49318a.m87024x();
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f18926x, this.f18927y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18925w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13084s1 c13084s1M87240H = AbstractC28683x.m87240H(new C4648r0(this.f18926x, 0));
                a aVar = new a(this.f18926x, this.f18927y);
                this.f18925w = 1;
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

    /* JADX INFO: renamed from: ch0.q0$j */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"ch0/q0$j", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C4650s0 f18930a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4642o0 f18931b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Function1 f18932c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f18933d;

        public j(C4650s0 c4650s0, C4642o0 c4642o0, Function1 function1, String str) {
            this.f18930a = c4650s0;
            this.f18931b = c4642o0;
            this.f18932c = function1;
            this.f18933d = str;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            String strM14572o;
            if (!this.f18930a.getHasBeenVisible() || (strM14572o = this.f18931b.m14572o()) == null) {
                return;
            }
            this.f18932c.invoke(new AbstractC40624g.i(this.f18933d, strM14572o));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m14593h(InterfaceC23001u interfaceC23001u, C4642o0 behavior, Composer composer, int i13) {
        int i14;
        InterfaceC23001u interfaceC23001u2;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(behavior, "behavior");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1434695866);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(behavior) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            boolean zM14569l = behavior.getEnabled();
            C13821r1 c13821r1M14575t = behavior.getScrollState();
            boolean zM87157i = c28655q.m87157i(behavior);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C4648r0(behavior, 2);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R;
            int iM14567j = behavior.getScrollToBottomThreshold();
            boolean zM87157i2 = c28655q.m87157i(behavior);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new a(behavior);
                c28655q.m87172p0(objM87133R2);
            }
            interfaceC23001u2 = interfaceC23001u;
            m14596k(interfaceC23001u2, zM14569l, c13821r1M14575t, interfaceC4339a, iM14567j, (InterfaceC4339a) ((InterfaceC21467g) objM87133R2), c28655q, i14 & 14, 0);
        } else {
            interfaceC23001u2 = interfaceC23001u;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(interfaceC23001u2, behavior, i13, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m14594i(C4642o0 c4642o0) {
        return c4642o0.m14568k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m14595j(InterfaceC23001u interfaceC23001u, C4642o0 c4642o0, int i13, Composer composer, int i14) {
        m14593h(interfaceC23001u, c4642o0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015a  */
    /* JADX WARN: Code duplicated, block: B:102:0x0177  */
    /* JADX WARN: Code duplicated, block: B:105:0x0185  */
    /* JADX WARN: Code duplicated, block: B:106:0x0197 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0 A[PHI: r5 r6
      0x00d0: PHI (r5v28 int) = (r5v12 int), (r5v9 int), (r5v30 int) binds: [B:71:0x00de, B:65:0x00cc, B:66:0x00ce] A[DONT_GENERATE, DONT_INLINE]
      0x00d0: PHI (r6v12 int) = (r6v8 int), (r6v5 int), (r6v5 int) binds: [B:71:0x00de, B:65:0x00cc, B:66:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x010e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0117  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x013c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0146  */
    /* JADX WARN: Code duplicated, block: B:93:0x0149  */
    /* JADX WARN: Code duplicated, block: B:96:0x014f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0158 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: k */
    public static final void m14596k(InterfaceC23001u interfaceC23001u, boolean z4, C13821r1 scrollState, InterfaceC4339a bottom, int i13, InterfaceC4339a interfaceC4339a, Composer composer, int i14, int i15) {
        int i16;
        int iM14610y;
        InterfaceC4339a interfaceC4339a2;
        boolean z13;
        C13821r1 c13821r1;
        InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        int i17;
        InterfaceC4339a interfaceC4339a4;
        C28677v1 c28677v1M87180u;
        C4644p0 c4644p0;
        int i18;
        C28676v0 c28676v0;
        Object objM87133R;
        int i19;
        int i24;
        Object objM87133R2;
        InterfaceC2994c0 interfaceC2994c0;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R3;
        int i25;
        AbstractC22676k.m65750j(interfaceC23001u, "<this>");
        AbstractC22676k.m65750j(scrollState, "scrollState");
        AbstractC22676k.m65750j(bottom, "bottom");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1715318250);
        if ((i14 & 6) == 0) {
            i16 = (c28655q2.m87153g(interfaceC23001u) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= c28655q2.m87153g(scrollState) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= c28655q2.m87157i(bottom) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i14 & 24576) == 0) {
            if ((i15 & 8) == 0) {
                iM14610y = i13;
                if (c28655q2.m87149e(iM14610y)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i16 |= i25;
            } else {
                iM14610y = i13;
            }
            i25 = DfuBaseService.ERROR_REMOTE_MASK;
            i16 |= i25;
        } else {
            iM14610y = i13;
        }
        int i26 = i15 & 16;
        if (i26 == 0) {
            if ((196608 & i14) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i16 |= c28655q2.m87157i(interfaceC4339a2) ? 131072 : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i16) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i16 & 1, z13)) {
                c28655q2.m87140Z();
                i18 = i14 & 1;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0 || c28655q2.m87118C()) {
                    if ((i15 & 8) != 0) {
                        iM14610y = m14610y(c28655q2, 0);
                        i16 &= -57345;
                    }
                    if (i26 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C4387a(9);
                            c28655q2.m87172p0(objM87133R);
                        }
                        InterfaceC4339a interfaceC4339a5 = (InterfaceC4339a) objM87133R;
                        i19 = i16;
                        i24 = iM14610y;
                        interfaceC4339a4 = interfaceC4339a5;
                    }
                    c28655q2.m87175r();
                    if (z4) {
                        c13821r1 = scrollState;
                        interfaceC4339a3 = bottom;
                        int i27 = i24;
                        objM87133R2 = c28655q2.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                            c28655q2.m87172p0(objM87133R2);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                        int iM14609x = m14609x(((Number) interfaceC4339a3.invoke()).intValue(), c13821r1.f49318a.m87024x(), i27);
                        if ((458752 & i19) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        boolean zM87157i = z14 | c28655q2.m87157i(interfaceC2994c0);
                        if ((i19 & 896) == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = zM87157i | z15 | ((i19 & 7168) == 2048);
                        objM87133R3 = c28655q2.m87133R();
                        if (z16 || objM87133R3 == c28676v0) {
                            objM87133R3 = new C4616e1(interfaceC4339a4, interfaceC2994c0, c13821r1, interfaceC4339a3);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        c28655q = c28655q2;
                        AbstractC32673s3.m102314n(interfaceC23001u, i27, iM14609x, (InterfaceC4339a) objM87133R3, c28655q, (i19 & 14) | ((i19 >> 9) & 112));
                        i17 = i27;
                    } else {
                        c28677v1M87180u = c28655q2.m87180u();
                        if (c28677v1M87180u == null) {
                            return;
                        } else {
                            c4644p0 = new C4644p0(interfaceC23001u, z4, scrollState, bottom, i24, interfaceC4339a4, i14, i15, 0);
                        }
                    }
                    c28677v1M87180u.f115982d = c4644p0;
                }
                c28655q2.m87138X();
                if ((i15 & 8) != 0) {
                    i16 &= -57345;
                }
                i19 = i16;
                i24 = iM14610y;
                interfaceC4339a4 = interfaceC4339a2;
                c28655q2.m87175r();
                if (z4) {
                    c28677v1M87180u = c28655q2.m87180u();
                    if (c28677v1M87180u == null) {
                        return;
                    } else {
                        c4644p0 = new C4644p0(interfaceC23001u, z4, scrollState, bottom, i24, interfaceC4339a4, i14, i15, 0);
                    }
                } else {
                    c13821r1 = scrollState;
                    interfaceC4339a3 = bottom;
                    int i28 = i24;
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                    int iM14609x2 = m14609x(((Number) interfaceC4339a3.invoke()).intValue(), c13821r1.f49318a.m87024x(), i28);
                    if ((458752 & i19) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean zM87157i2 = z14 | c28655q2.m87157i(interfaceC2994c0);
                    if ((i19 & 896) == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = zM87157i2 | z15 | ((i19 & 7168) == 2048);
                    objM87133R3 = c28655q2.m87133R();
                    if (z16) {
                        objM87133R3 = new C4616e1(interfaceC4339a4, interfaceC2994c0, c13821r1, interfaceC4339a3);
                        c28655q2.m87172p0(objM87133R3);
                    } else {
                        objM87133R3 = new C4616e1(interfaceC4339a4, interfaceC2994c0, c13821r1, interfaceC4339a3);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q = c28655q2;
                    AbstractC32673s3.m102314n(interfaceC23001u, i28, iM14609x2, (InterfaceC4339a) objM87133R3, c28655q, (i19 & 14) | ((i19 >> 9) & 112));
                    i17 = i28;
                }
                c28677v1M87180u.f115982d = c4644p0;
            }
            c13821r1 = scrollState;
            interfaceC4339a3 = bottom;
            c28655q = c28655q2;
            c28655q.m87138X();
            i17 = iM14610y;
            interfaceC4339a4 = interfaceC4339a2;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c4644p0 = new C4644p0(interfaceC23001u, z4, c13821r1, interfaceC4339a3, i17, interfaceC4339a4, i14, i15, 1);
                c28677v1M87180u.f115982d = c4644p0;
            }
        }
        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        interfaceC4339a2 = interfaceC4339a;
        if ((74899 & i16) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i16 & 1, z13)) {
            c28655q2.m87140Z();
            i18 = i14 & 1;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if ((i15 & 8) != 0) {
                    iM14610y = m14610y(c28655q2, 0);
                    i16 &= -57345;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4387a(9);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a6 = (InterfaceC4339a) objM87133R;
                    i19 = i16;
                    i24 = iM14610y;
                    interfaceC4339a4 = interfaceC4339a6;
                } else {
                    i19 = i16;
                    i24 = iM14610y;
                    interfaceC4339a4 = interfaceC4339a2;
                }
            } else {
                if ((i15 & 8) != 0) {
                    iM14610y = m14610y(c28655q2, 0);
                    i16 &= -57345;
                }
                if (i26 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C4387a(9);
                        c28655q2.m87172p0(objM87133R);
                    }
                    InterfaceC4339a interfaceC4339a7 = (InterfaceC4339a) objM87133R;
                    i19 = i16;
                    i24 = iM14610y;
                    interfaceC4339a4 = interfaceC4339a7;
                } else {
                    i19 = i16;
                    i24 = iM14610y;
                    interfaceC4339a4 = interfaceC4339a2;
                }
            }
            c28655q2.m87175r();
            if (z4) {
                c28677v1M87180u = c28655q2.m87180u();
                if (c28677v1M87180u == null) {
                    return;
                } else {
                    c4644p0 = new C4644p0(interfaceC23001u, z4, scrollState, bottom, i24, interfaceC4339a4, i14, i15, 0);
                }
            } else {
                c13821r1 = scrollState;
                interfaceC4339a3 = bottom;
                int i29 = i24;
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87262p(c28655q2);
                    c28655q2.m87172p0(objM87133R2);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R2;
                int iM14609x3 = m14609x(((Number) interfaceC4339a3.invoke()).intValue(), c13821r1.f49318a.m87024x(), i29);
                if ((458752 & i19) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zM87157i3 = z14 | c28655q2.m87157i(interfaceC2994c0);
                if ((i19 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = zM87157i3 | z15 | ((i19 & 7168) == 2048);
                objM87133R3 = c28655q2.m87133R();
                if (z16) {
                    objM87133R3 = new C4616e1(interfaceC4339a4, interfaceC2994c0, c13821r1, interfaceC4339a3);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C4616e1(interfaceC4339a4, interfaceC2994c0, c13821r1, interfaceC4339a3);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q = c28655q2;
                AbstractC32673s3.m102314n(interfaceC23001u, i29, iM14609x3, (InterfaceC4339a) objM87133R3, c28655q, (i19 & 14) | ((i19 >> 9) & 112));
                i17 = i29;
            }
            c28677v1M87180u.f115982d = c4644p0;
        }
        c13821r1 = scrollState;
        interfaceC4339a3 = bottom;
        c28655q = c28655q2;
        c28655q.m87138X();
        i17 = iM14610y;
        interfaceC4339a4 = interfaceC4339a2;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c4644p0 = new C4644p0(interfaceC23001u, z4, c13821r1, interfaceC4339a3, i17, interfaceC4339a4, i14, i15, 1);
            c28677v1M87180u.f115982d = c4644p0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m14597l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m14598m(InterfaceC23001u interfaceC23001u, boolean z4, C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, int i13, InterfaceC4339a interfaceC4339a2, int i14, int i15, Composer composer, int i16) {
        m14596k(interfaceC23001u, z4, c13821r1, interfaceC4339a, i13, interfaceC4339a2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m14599n(InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, C13821r1 c13821r1, InterfaceC4339a interfaceC4339a2) {
        interfaceC4339a.invoke();
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new b(c13821r1, interfaceC4339a2, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m14600o(InterfaceC23001u interfaceC23001u, boolean z4, C13821r1 c13821r1, InterfaceC4339a interfaceC4339a, int i13, InterfaceC4339a interfaceC4339a2, int i14, int i15, Composer composer, int i16) {
        m14596k(interfaceC23001u, z4, c13821r1, interfaceC4339a, i13, interfaceC4339a2, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q */
    public static final Object m14602q(C13821r1 c13821r1, int i13, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM39184f = c13821r1.m39184f(i13, AbstractC11348f.m30574v(500, 0, AbstractC11333b0.f36312c, 2), interfaceC30057d);
        return objM39184f == EnumC31071a.f128113w ? objM39184f : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final int m14603r(int i13, float f13, float f14, int i14) {
        int iM36258X = (i13 - i14) - AbstractC12889b.m36258X(f14 - f13);
        if (iM36258X < 0) {
            return 0;
        }
        return iM36258X;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x024b A[PHI: r16
      0x024b: PHI (r16v4 int) = (r16v2 int), (r16v6 int) binds: [B:106:0x0249, B:104:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x024d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0265  */
    /* JADX WARN: Code duplicated, block: B:113:0x026b  */
    /* JADX WARN: Code duplicated, block: B:119:0x0278  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:133:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:143:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x0300  */
    /* JADX WARN: Code duplicated, block: B:148:0x0306  */
    /* JADX WARN: Code duplicated, block: B:154:0x0322 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:159:0x0340  */
    /* JADX WARN: Code duplicated, block: B:161:0x034c  */
    /* JADX WARN: Code duplicated, block: B:163:0x035a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0360  */
    /* JADX WARN: Code duplicated, block: B:171:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:172:0x0379  */
    /* JADX WARN: Code duplicated, block: B:174:0x038c  */
    /* JADX WARN: Code duplicated, block: B:177:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03db  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:193:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0412  */
    /* JADX WARN: Code duplicated, block: B:197:0x0435  */
    /* JADX WARN: Code duplicated, block: B:199:0x043b  */
    /* JADX WARN: Code duplicated, block: B:205:0x044e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:206:0x0450  */
    /* JADX WARN: Code duplicated, block: B:209:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x02e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0183 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x0143  */
    /* JADX WARN: Code duplicated, block: B:63:0x0149  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:72:0x016f  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0191  */
    /* JADX WARN: Code duplicated, block: B:92:0x01db  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    /* JADX WARN: Code duplicated, block: B:98:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v74, types: [q83.d] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer, p1.q] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX INFO: renamed from: s */
    public static final C4642o0 m14604s(C40626i viewState, boolean z4, Function1 onViewEvent, C13821r1 c13821r1, boolean z13, boolean z14, boolean z15, Composer composer, int i13, int i14) throws Throwable {
        int i15;
        boolean z16;
        boolean zM87149e;
        Object objM87133R;
        C4650s0 c4650s0;
        C4642o0 c4642o0;
        InterfaceC28601c1 interfaceC28601c1M87238F;
        ListIterator<C40621d> listIterator;
        Throwable th3;
        C40621d c40621dPrevious;
        C40621d c40621d;
        ?? M131744a;
        List<C40621d> listM131760d;
        Iterator it;
        int i16;
        String strM131840q;
        String str;
        int i17;
        C4650s0 c4650s1;
        int i18;
        boolean z17;
        boolean zM87157i;
        Object dVar;
        Object obj;
        C4642o0 c4642o1;
        boolean zM87157i2;
        Object objM87133R2;
        boolean zM87157i3;
        Object objM87133R3;
        boolean zM87157i4;
        Object objM87133R4;
        String strM131759c;
        boolean zM87157i5;
        Object objM87133R5;
        boolean zM87157i6;
        Object objM87133R6;
        ListIterator<C40621d> listIterator2;
        C40621d c40621dPrevious2;
        C40621d c40621d2;
        String strM131744a;
        boolean zM87153g;
        Object objM87133R7;
        String str2;
        boolean zM87157i7;
        Object objM87133R8;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        ?? r14 = (C28655q) composer;
        r14.m87150e0(-426432534);
        C13821r1 c13821r1M92099U = (i14 & 8) != 0 ? AbstractC30060g.m92099U(0, r14, 1) : c13821r1;
        boolean z18 = (i14 & 16) != 0 ? false : z13;
        boolean z19 = (i14 & 32) != 0 ? false : z14;
        boolean z24 = (i14 & 64) != 0 ? false : z15;
        boolean zIsFeatureEnabled = ((FeatureFlagChecker) r14.m87161k(AbstractC38073e.m121968p())).isFeatureEnabled(FeatureFlagRepositoryKt.AICHAT_CONVERSATION_SCROLL_POSITIONING);
        int iM14610y = m14610y(r14, 0);
        int iM14608w = m14608w(r14, 0);
        Object objM87133R9 = r14.m87133R();
        Object obj2 = C28635l.f115821a;
        if (objM87133R9 == obj2) {
            objM87133R9 = new C30835c();
            r14.m87172p0(objM87133R9);
        }
        InterfaceC30833a interfaceC30833a = (InterfaceC30833a) objM87133R9;
        Object objM87133R10 = r14.m87133R();
        if (objM87133R10 == obj2) {
            objM87133R10 = new C4650s0();
            r14.m87172p0(objM87133R10);
        }
        C4650s0 c4650s2 = (C4650s0) objM87133R10;
        boolean zM87153g2 = r14.m87153g(viewState.getConversation().getFingerprint());
        Object objM87133R11 = r14.m87133R();
        if (zM87153g2 || objM87133R11 == obj2) {
            objM87133R11 = new C4602a();
            r14.m87172p0(objM87133R11);
        }
        C4602a c4602a = (C4602a) objM87133R11;
        boolean zM87155h = ((((i13 & 7168) ^ 3072) > 2048 && r14.m87153g(c13821r1M92099U)) || (i13 & 3072) == 2048) | r14.m87155h(zIsFeatureEnabled) | r14.m87149e(iM14610y) | r14.m87153g(c4650s2) | r14.m87153g(c4602a);
        int i19 = (458752 & i13) ^ ProfileVerifier.CompilationStatus.f6515xf2722a21;
        if (i19 <= 131072 || !r14.m87155h(z19)) {
            i15 = iM14610y;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) != 131072) {
                z16 = false;
            }
            zM87149e = z16 | zM87155h | r14.m87149e(iM14608w);
            objM87133R = r14.m87133R();
            if (!zM87149e || objM87133R == obj2) {
                C4642o0 c4642o2 = new C4642o0(c13821r1M92099U, zIsFeatureEnabled, interfaceC30833a, i15, c4650s2, c4602a, z19, iM14608w);
                c4650s0 = c4650s2;
                r14.m87172p0(c4642o2);
                objM87133R = c4642o2;
            } else {
                c4650s0 = c4650s2;
            }
            c4642o0 = (C4642o0) objM87133R;
            interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState, r14);
            List<C40621d> listM131760d2 = viewState.getConversation().m131760d();
            listIterator = listM131760d2.listIterator(listM131760d2.size());
            do {
                if (listIterator.hasPrevious()) {
                    th3 = null;
                    c40621dPrevious = null;
                    break;
                }
                c40621dPrevious = listIterator.previous();
                th3 = null;
            } while (c40621dPrevious.getRole() != EnumC26800b.USER);
            c40621d = c40621dPrevious;
            if (c40621d != null) {
                M131744a = c40621d.getId();
            } else {
                M131744a = th3;
            }
            listM131760d = viewState.getConversation().m131760d();
            if ((listM131760d instanceof Collection) || !listM131760d.isEmpty()) {
                it = listM131760d.iterator();
                i16 = 0;
                while (it.hasNext()) {
                    Iterator it3 = it;
                    if (((C40621d) it.next()).getRole() != EnumC26800b.USER && (i16 = i16 + 1) < 0) {
                        AbstractC37056f.m118976c0();
                        throw th3;
                    }
                    it = it3;
                }
            } else {
                i16 = 0;
            }
            if (!zIsFeatureEnabled) {
                r14.m87150e0(663506384);
                Object[] objArr = {Integer.valueOf(viewState.getConversation().m131760d().size()), viewState.getLastMessageId(), Boolean.valueOf(z4), Boolean.valueOf(z18)};
                zM87157i7 = r14.m87157i(viewState) | ((((57344 & i13) ^ 24576) <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87157i(c4642o0);
                objM87133R8 = r14.m87133R();
                if (zM87157i7 || objM87133R8 == obj2) {
                    objM87133R8 = new c(z18, viewState, c4642o0, th3);
                    r14.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87256j(objArr, (InterfaceC4351m) objM87133R8, r14);
                r14.m87173q(false);
                r14.m87173q(false);
                return c4642o0;
            }
            r14.m87150e0(663975352);
            r14.m87173q(false);
            Integer numValueOf = Integer.valueOf(viewState.getConversation().m131760d().size());
            String strM131834k = viewState.getLastMessageId();
            Boolean boolValueOf = Boolean.valueOf(z4);
            Boolean boolValueOf2 = Boolean.valueOf(z18);
            strM131840q = viewState.getScrollToTurnId();
            if (z24) {
                str = strM131840q;
            } else {
                str = null;
            }
            Object[] objArr2 = {numValueOf, strM131834k, boolValueOf, boolValueOf2, str, Boolean.valueOf(viewState.getIsRefreshingMetadata())};
            i17 = (i13 & 57344) ^ 24576;
            c4650s1 = c4650s0;
            if (i17 > 16384 || !r14.m87155h(z18)) {
                i18 = i17;
                if ((i13 & 24576) != 16384) {
                    z17 = false;
                }
                zM87157i = z17 | r14.m87157i(viewState) | r14.m87157i(c4642o0) | ((((3670016 & i13) ^ 1572864) <= 1048576 && r14.m87155h(z24)) || (i13 & 1572864) == 1048576) | ((i19 <= 131072 && r14.m87155h(z19)) || (i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072) | r14.m87153g(M131744a) | r14.m87149e(i16);
                Object objM87133R12 = r14.m87133R();
                if (!zM87157i || objM87133R12 == obj2) {
                    obj = obj2;
                    c4642o1 = c4642o0;
                    dVar = new d(z18, viewState, c4642o1, z24, z19, M131744a, i16, null);
                    r14.m87172p0(dVar);
                } else {
                    dVar = objM87133R12;
                    c4642o1 = c4642o0;
                    obj = obj2;
                }
                AbstractC28683x.m87256j(objArr2, (InterfaceC4351m) dVar, r14);
                if (z19 != 0) {
                    r14.m87150e0(666046183);
                    List<C40621d> listM131760d3 = viewState.getConversation().m131760d();
                    listIterator2 = listM131760d3.listIterator(listM131760d3.size());
                    do {
                        if (!listIterator2.hasPrevious()) {
                            c40621dPrevious2 = null;
                            break;
                        }
                        c40621dPrevious2 = listIterator2.previous();
                    } while (c40621dPrevious2.getRole() != EnumC26800b.ASSISTANT);
                    c40621d2 = c40621dPrevious2;
                    if (c40621d2 != null) {
                        strM131744a = c40621d2.getId();
                    } else {
                        strM131744a = null;
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z18);
                    Boolean boolValueOf4 = Boolean.valueOf(viewState.getIsRefreshingMetadata());
                    zM87153g = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87153g(strM131744a) | r14.m87157i(viewState) | r14.m87157i(c4642o1);
                    objM87133R7 = r14.m87133R();
                    if (!zM87153g || objM87133R7 == obj) {
                        str2 = strM131744a;
                        C4642o0 c4642o3 = c4642o1;
                        e eVar = new e(z18, str2, viewState, c4642o3, null);
                        c4642o1 = c4642o3;
                        r14.m87172p0(eVar);
                        objM87133R7 = eVar;
                    } else {
                        str2 = strM131744a;
                    }
                    AbstractC28683x.m87255i(str2, boolValueOf3, boolValueOf4, (InterfaceC4351m) objM87133R7, r14);
                    r14.m87173q(false);
                } else {
                    r14.m87150e0(666493048);
                    r14.m87173q(false);
                }
                if (z19) {
                    r14.m87150e0(667748920);
                    r14.m87173q(false);
                } else {
                    r14.m87150e0(667360676);
                    Integer numValueOf2 = Integer.valueOf(i16);
                    zM87157i6 = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87157i(c4642o1) | r14.m87149e(i16);
                    objM87133R6 = r14.m87133R();
                    if (zM87157i6 || objM87133R6 == obj) {
                        objM87133R6 = new f(z18, c4642o1, i16, null);
                        r14.m87172p0(objM87133R6);
                    }
                    AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R6, numValueOf2);
                    r14.m87173q(false);
                }
                C13821r1 c13821r1M14575t = c4642o1.getScrollState();
                String strM131759c2 = viewState.getConversation().getFingerprint();
                zM87157i2 = r14.m87157i(c4642o1);
                objM87133R2 = r14.m87133R();
                if (zM87157i2 || objM87133R2 == obj) {
                    objM87133R2 = new g(c4642o1, null);
                    r14.m87172p0(objM87133R2);
                }
                AbstractC28683x.m87254h(c13821r1M14575t, strM131759c2, (InterfaceC4351m) objM87133R2, r14);
                String strM131759c3 = viewState.getConversation().getFingerprint();
                int i24 = (i13 & 896) ^ 384;
                zM87157i3 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F) | ((i24 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256);
                objM87133R3 = r14.m87133R();
                if (zM87157i3 || objM87133R3 == obj) {
                    objM87133R3 = new h(c4642o1, interfaceC28601c1M87238F, onViewEvent, null);
                    r14.m87172p0(objM87133R3);
                }
                AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R3, strM131759c3);
                String strM131759c4 = viewState.getConversation().getFingerprint();
                zM87157i4 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F);
                objM87133R4 = r14.m87133R();
                if (zM87157i4 || objM87133R4 == obj) {
                    objM87133R4 = new i(c4642o1, interfaceC28601c1M87238F, null);
                    r14.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R4, strM131759c4);
                strM131759c = viewState.getConversation().getFingerprint();
                zM87157i5 = r14.m87157i(c4650s1) | r14.m87157i(c4642o1) | ((i24 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256) | r14.m87153g(strM131759c);
                objM87133R5 = r14.m87133R();
                if (zM87157i5 || objM87133R5 == obj) {
                    objM87133R5 = new C4663z(c4650s1, c4642o1, onViewEvent, strM131759c);
                    r14.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87251e(strM131759c, (Function1) objM87133R5, r14);
                r14.m87173q(false);
                return c4642o1;
            }
            i18 = i17;
            z17 = true;
            zM87157i = z17 | r14.m87157i(viewState) | r14.m87157i(c4642o0) | ((((3670016 & i13) ^ 1572864) <= 1048576 && r14.m87155h(z24)) || (i13 & 1572864) == 1048576) | ((i19 <= 131072 && r14.m87155h(z19)) || (i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072) | r14.m87153g(M131744a) | r14.m87149e(i16);
            Object objM87133R13 = r14.m87133R();
            if (zM87157i) {
                obj = obj2;
                c4642o1 = c4642o0;
                dVar = new d(z18, viewState, c4642o1, z24, z19, M131744a, i16, null);
                r14.m87172p0(dVar);
            } else {
                obj = obj2;
                c4642o1 = c4642o0;
                dVar = new d(z18, viewState, c4642o1, z24, z19, M131744a, i16, null);
                r14.m87172p0(dVar);
            }
            AbstractC28683x.m87256j(objArr2, (InterfaceC4351m) dVar, r14);
            if (z19 != 0) {
                r14.m87150e0(666046183);
                List<C40621d> listM131760d4 = viewState.getConversation().m131760d();
                listIterator2 = listM131760d4.listIterator(listM131760d4.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        c40621dPrevious2 = null;
                        break;
                    }
                    c40621dPrevious2 = listIterator2.previous();
                } while (c40621dPrevious2.getRole() != EnumC26800b.ASSISTANT);
                c40621d2 = c40621dPrevious2;
                if (c40621d2 != null) {
                    strM131744a = c40621d2.getId();
                } else {
                    strM131744a = null;
                }
                Boolean boolValueOf5 = Boolean.valueOf(z18);
                Boolean boolValueOf6 = Boolean.valueOf(viewState.getIsRefreshingMetadata());
                zM87153g = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87153g(strM131744a) | r14.m87157i(viewState) | r14.m87157i(c4642o1);
                objM87133R7 = r14.m87133R();
                if (zM87153g) {
                    str2 = strM131744a;
                    C4642o0 c4642o4 = c4642o1;
                    e eVar2 = new e(z18, str2, viewState, c4642o4, null);
                    c4642o1 = c4642o4;
                    r14.m87172p0(eVar2);
                    objM87133R7 = eVar2;
                } else {
                    str2 = strM131744a;
                    C4642o0 c4642o5 = c4642o1;
                    e eVar3 = new e(z18, str2, viewState, c4642o5, null);
                    c4642o1 = c4642o5;
                    r14.m87172p0(eVar3);
                    objM87133R7 = eVar3;
                }
                AbstractC28683x.m87255i(str2, boolValueOf5, boolValueOf6, (InterfaceC4351m) objM87133R7, r14);
                r14.m87173q(false);
            } else {
                r14.m87150e0(666493048);
                r14.m87173q(false);
            }
            if (z19) {
                r14.m87150e0(667360676);
                Integer numValueOf3 = Integer.valueOf(i16);
                zM87157i6 = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87157i(c4642o1) | r14.m87149e(i16);
                objM87133R6 = r14.m87133R();
                if (zM87157i6) {
                    objM87133R6 = new f(z18, c4642o1, i16, null);
                    r14.m87172p0(objM87133R6);
                } else {
                    objM87133R6 = new f(z18, c4642o1, i16, null);
                    r14.m87172p0(objM87133R6);
                }
                AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R6, numValueOf3);
                r14.m87173q(false);
            } else {
                r14.m87150e0(667748920);
                r14.m87173q(false);
            }
            C13821r1 c13821r1M14575t2 = c4642o1.getScrollState();
            String strM131759c5 = viewState.getConversation().getFingerprint();
            zM87157i2 = r14.m87157i(c4642o1);
            objM87133R2 = r14.m87133R();
            if (zM87157i2) {
                objM87133R2 = new g(c4642o1, null);
                r14.m87172p0(objM87133R2);
            } else {
                objM87133R2 = new g(c4642o1, null);
                r14.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87254h(c13821r1M14575t2, strM131759c5, (InterfaceC4351m) objM87133R2, r14);
            String strM131759c6 = viewState.getConversation().getFingerprint();
            int i25 = (i13 & 896) ^ 384;
            zM87157i3 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F) | ((i25 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256);
            objM87133R3 = r14.m87133R();
            if (zM87157i3) {
                objM87133R3 = new h(c4642o1, interfaceC28601c1M87238F, onViewEvent, null);
                r14.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new h(c4642o1, interfaceC28601c1M87238F, onViewEvent, null);
                r14.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R3, strM131759c6);
            String strM131759c7 = viewState.getConversation().getFingerprint();
            zM87157i4 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F);
            objM87133R4 = r14.m87133R();
            if (zM87157i4) {
                objM87133R4 = new i(c4642o1, interfaceC28601c1M87238F, null);
                r14.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new i(c4642o1, interfaceC28601c1M87238F, null);
                r14.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R4, strM131759c7);
            strM131759c = viewState.getConversation().getFingerprint();
            zM87157i5 = r14.m87157i(c4650s1) | r14.m87157i(c4642o1) | ((i25 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256) | r14.m87153g(strM131759c);
            objM87133R5 = r14.m87133R();
            if (zM87157i5) {
                objM87133R5 = new C4663z(c4650s1, c4642o1, onViewEvent, strM131759c);
                r14.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new C4663z(c4650s1, c4642o1, onViewEvent, strM131759c);
                r14.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87251e(strM131759c, (Function1) objM87133R5, r14);
            r14.m87173q(false);
            return c4642o1;
        }
        i15 = iM14610y;
        z16 = true;
        zM87149e = z16 | zM87155h | r14.m87149e(iM14608w);
        objM87133R = r14.m87133R();
        if (zM87149e) {
            C4642o0 c4642o6 = new C4642o0(c13821r1M92099U, zIsFeatureEnabled, interfaceC30833a, i15, c4650s2, c4602a, z19, iM14608w);
            c4650s0 = c4650s2;
            r14.m87172p0(c4642o6);
            objM87133R = c4642o6;
        } else {
            C4642o0 c4642o7 = new C4642o0(c13821r1M92099U, zIsFeatureEnabled, interfaceC30833a, i15, c4650s2, c4602a, z19, iM14608w);
            c4650s0 = c4650s2;
            r14.m87172p0(c4642o7);
            objM87133R = c4642o7;
        }
        c4642o0 = (C4642o0) objM87133R;
        interfaceC28601c1M87238F = AbstractC28683x.m87238F(viewState, r14);
        List<C40621d> listM131760d5 = viewState.getConversation().m131760d();
        listIterator = listM131760d5.listIterator(listM131760d5.size());
        do {
            if (listIterator.hasPrevious()) {
                th3 = null;
                c40621dPrevious = null;
                break;
            }
            c40621dPrevious = listIterator.previous();
            th3 = null;
        } while (c40621dPrevious.getRole() != EnumC26800b.USER);
        c40621d = c40621dPrevious;
        if (c40621d != null) {
            M131744a = c40621d.getId();
        } else {
            M131744a = th3;
        }
        listM131760d = viewState.getConversation().m131760d();
        if (listM131760d instanceof Collection) {
            it = listM131760d.iterator();
            i16 = 0;
            while (it.hasNext()) {
                Iterator it4 = it;
                if (((C40621d) it.next()).getRole() != EnumC26800b.USER) {
                }
                it = it4;
            }
        } else {
            it = listM131760d.iterator();
            i16 = 0;
            while (it.hasNext()) {
                Iterator it5 = it;
                if (((C40621d) it.next()).getRole() != EnumC26800b.USER) {
                }
                it = it5;
            }
        }
        if (!zIsFeatureEnabled) {
            r14.m87150e0(663506384);
            Object[] objArr3 = {Integer.valueOf(viewState.getConversation().m131760d().size()), viewState.getLastMessageId(), Boolean.valueOf(z4), Boolean.valueOf(z18)};
            zM87157i7 = r14.m87157i(viewState) | ((((57344 & i13) ^ 24576) <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87157i(c4642o0);
            objM87133R8 = r14.m87133R();
            if (zM87157i7) {
                objM87133R8 = new c(z18, viewState, c4642o0, th3);
                r14.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new c(z18, viewState, c4642o0, th3);
                r14.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87256j(objArr3, (InterfaceC4351m) objM87133R8, r14);
            r14.m87173q(false);
            r14.m87173q(false);
            return c4642o0;
        }
        r14.m87150e0(663975352);
        r14.m87173q(false);
        Integer numValueOf4 = Integer.valueOf(viewState.getConversation().m131760d().size());
        String strM131834k2 = viewState.getLastMessageId();
        Boolean boolValueOf7 = Boolean.valueOf(z4);
        Boolean boolValueOf8 = Boolean.valueOf(z18);
        strM131840q = viewState.getScrollToTurnId();
        if (z24) {
            str = strM131840q;
        } else {
            str = null;
        }
        Object[] objArr4 = {numValueOf4, strM131834k2, boolValueOf7, boolValueOf8, str, Boolean.valueOf(viewState.getIsRefreshingMetadata())};
        i17 = (i13 & 57344) ^ 24576;
        c4650s1 = c4650s0;
        if (i17 > 16384) {
            i18 = i17;
            if ((i13 & 24576) != 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
        } else {
            i18 = i17;
            if ((i13 & 24576) != 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
        }
        zM87157i = z17 | r14.m87157i(viewState) | r14.m87157i(c4642o0) | ((((3670016 & i13) ^ 1572864) <= 1048576 && r14.m87155h(z24)) || (i13 & 1572864) == 1048576) | ((i19 <= 131072 && r14.m87155h(z19)) || (i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 131072) | r14.m87153g(M131744a) | r14.m87149e(i16);
        Object objM87133R14 = r14.m87133R();
        if (zM87157i) {
            obj = obj2;
            c4642o1 = c4642o0;
            dVar = new d(z18, viewState, c4642o1, z24, z19, M131744a, i16, null);
            r14.m87172p0(dVar);
        } else {
            obj = obj2;
            c4642o1 = c4642o0;
            dVar = new d(z18, viewState, c4642o1, z24, z19, M131744a, i16, null);
            r14.m87172p0(dVar);
        }
        AbstractC28683x.m87256j(objArr4, (InterfaceC4351m) dVar, r14);
        if (z19 != 0) {
            r14.m87150e0(666046183);
            List<C40621d> listM131760d6 = viewState.getConversation().m131760d();
            listIterator2 = listM131760d6.listIterator(listM131760d6.size());
            do {
                if (!listIterator2.hasPrevious()) {
                    c40621dPrevious2 = null;
                    break;
                }
                c40621dPrevious2 = listIterator2.previous();
            } while (c40621dPrevious2.getRole() != EnumC26800b.ASSISTANT);
            c40621d2 = c40621dPrevious2;
            if (c40621d2 != null) {
                strM131744a = c40621d2.getId();
            } else {
                strM131744a = null;
            }
            Boolean boolValueOf9 = Boolean.valueOf(z18);
            Boolean boolValueOf10 = Boolean.valueOf(viewState.getIsRefreshingMetadata());
            zM87153g = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87153g(strM131744a) | r14.m87157i(viewState) | r14.m87157i(c4642o1);
            objM87133R7 = r14.m87133R();
            if (zM87153g) {
                str2 = strM131744a;
                C4642o0 c4642o8 = c4642o1;
                e eVar4 = new e(z18, str2, viewState, c4642o8, null);
                c4642o1 = c4642o8;
                r14.m87172p0(eVar4);
                objM87133R7 = eVar4;
            } else {
                str2 = strM131744a;
                C4642o0 c4642o9 = c4642o1;
                e eVar5 = new e(z18, str2, viewState, c4642o9, null);
                c4642o1 = c4642o9;
                r14.m87172p0(eVar5);
                objM87133R7 = eVar5;
            }
            AbstractC28683x.m87255i(str2, boolValueOf9, boolValueOf10, (InterfaceC4351m) objM87133R7, r14);
            r14.m87173q(false);
        } else {
            r14.m87150e0(666493048);
            r14.m87173q(false);
        }
        if (z19) {
            r14.m87150e0(667360676);
            Integer numValueOf5 = Integer.valueOf(i16);
            zM87157i6 = ((i18 <= 16384 && r14.m87155h(z18)) || (i13 & 24576) == 16384) | r14.m87157i(c4642o1) | r14.m87149e(i16);
            objM87133R6 = r14.m87133R();
            if (zM87157i6) {
                objM87133R6 = new f(z18, c4642o1, i16, null);
                r14.m87172p0(objM87133R6);
            } else {
                objM87133R6 = new f(z18, c4642o1, i16, null);
                r14.m87172p0(objM87133R6);
            }
            AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R6, numValueOf5);
            r14.m87173q(false);
        } else {
            r14.m87150e0(667748920);
            r14.m87173q(false);
        }
        C13821r1 c13821r1M14575t3 = c4642o1.getScrollState();
        String strM131759c8 = viewState.getConversation().getFingerprint();
        zM87157i2 = r14.m87157i(c4642o1);
        objM87133R2 = r14.m87133R();
        if (zM87157i2) {
            objM87133R2 = new g(c4642o1, null);
            r14.m87172p0(objM87133R2);
        } else {
            objM87133R2 = new g(c4642o1, null);
            r14.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87254h(c13821r1M14575t3, strM131759c8, (InterfaceC4351m) objM87133R2, r14);
        String strM131759c9 = viewState.getConversation().getFingerprint();
        int i26 = (i13 & 896) ^ 384;
        zM87157i3 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F) | ((i26 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256);
        objM87133R3 = r14.m87133R();
        if (zM87157i3) {
            objM87133R3 = new h(c4642o1, interfaceC28601c1M87238F, onViewEvent, null);
            r14.m87172p0(objM87133R3);
        } else {
            objM87133R3 = new h(c4642o1, interfaceC28601c1M87238F, onViewEvent, null);
            r14.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R3, strM131759c9);
        String strM131759c10 = viewState.getConversation().getFingerprint();
        zM87157i4 = r14.m87157i(c4642o1) | r14.m87153g(interfaceC28601c1M87238F);
        objM87133R4 = r14.m87133R();
        if (zM87157i4) {
            objM87133R4 = new i(c4642o1, interfaceC28601c1M87238F, null);
            r14.m87172p0(objM87133R4);
        } else {
            objM87133R4 = new i(c4642o1, interfaceC28601c1M87238F, null);
            r14.m87172p0(objM87133R4);
        }
        AbstractC28683x.m87253g(r14, (InterfaceC4351m) objM87133R4, strM131759c10);
        strM131759c = viewState.getConversation().getFingerprint();
        zM87157i5 = r14.m87157i(c4650s1) | r14.m87157i(c4642o1) | ((i26 <= 256 && r14.m87153g(onViewEvent)) || (i13 & 384) == 256) | r14.m87153g(strM131759c);
        objM87133R5 = r14.m87133R();
        if (zM87157i5) {
            objM87133R5 = new C4663z(c4650s1, c4642o1, onViewEvent, strM131759c);
            r14.m87172p0(objM87133R5);
        } else {
            objM87133R5 = new C4663z(c4650s1, c4642o1, onViewEvent, strM131759c);
            r14.m87172p0(objM87133R5);
        }
        AbstractC28683x.m87251e(strM131759c, (Function1) objM87133R5, r14);
        r14.m87173q(false);
        return c4642o1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final InterfaceC28620h0 m14605t(C4650s0 c4650s0, C4642o0 c4642o0, Function1 function1, String str, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        return new j(c4650s0, c4642o0, function1, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C40626i m14606u(InterfaceC28670t2 interfaceC28670t2) {
        return (C40626i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: v */
    public static final Integer m14607v(int i13, int i14, float f13, float f14, int i15) {
        int iM36284n = AbstractC12889b.m36284n((AbstractC12889b.m36258X(f13 - f14) + i13) - i15, 0, i14);
        int i16 = i15 / 4;
        if (i16 < 1) {
            i16 = 1;
        }
        Integer numValueOf = Integer.valueOf(iM36284n);
        if (Math.abs(numValueOf.intValue() - i13) > i16) {
            return numValueOf;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final int m14608w(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-1421528929);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        float fMin = Math.min(interfaceC39171c.mo743q0(f18888b), interfaceC39171c.mo743q0(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp) * 0.12f);
        c28655q.m87173q(false);
        return (int) fMin;
    }

    /* JADX INFO: renamed from: x */
    public static final int m14609x(int i13, int i14, int i15) {
        int i16 = i13 - i14;
        if (i16 < 0) {
            i16 = 0;
        }
        if (i16 <= i15) {
            return 0;
        }
        return i16;
    }

    /* JADX INFO: renamed from: y */
    public static final int m14610y(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(-2063993762);
        InterfaceC39171c interfaceC39171c = (InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h);
        float fMin = Math.min(interfaceC39171c.mo743q0(f18887a), interfaceC39171c.mo743q0(((Configuration) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4975a)).screenHeightDp) * 0.15f);
        c28655q.m87173q(false);
        return (int) fMin;
    }
}
