package p702ch0;

import a81.C0563n;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.material.AbstractC1118c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import cb1.C4387a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ChatEntrypointExperience;
import com.whoop.p057ai.chat.models.AttachmentType;
import dp0.AbstractC12252h;
import dp0.InterfaceC12251g;
import gy0.AbstractC16272a;
import ih0.AbstractC18486c;
import ih0.InterfaceC18484b;
import io.sentry.config.AbstractC20301a;
import j93.InterfaceC21467g;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import nl0.C26805g;
import nl0.EnumC26800b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27274q;
import p026b2.AbstractC2294a;
import p026b2.C2314t;
import p163g1.C15199y3;
import p163g1.EnumC15209z3;
import p164g2.InterfaceC15250v;
import p291l0.InterfaceC23013y;
import p390p1.AbstractC28669t1;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p634y1.AbstractC39038k;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import p734sl0.AbstractC32662q2;
import p734sl0.C32645n0;
import p734sl0.EnumC32692x1;
import p734sl0.InterfaceC32647n2;
import p734sl0.InterfaceC32666r1;
import p745y81.EnumC39333f;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v41.AbstractC35660d;
import v41.AbstractC35664f;
import v41.C35666g;
import v41.EnumC35671i0;
import wk0.AbstractC37336b;
import y71.C39274g;
import yg0.AbstractC39523b;
import zg0.AbstractC40624g;
import zg0.C40620c;
import zg0.C40621d;
import zg0.C40622e;
import zg0.C40626i;
import zg0.C40628k;

/* JADX INFO: renamed from: ch0.c1 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a±\u0002\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022@\b\u0002\u0010\b\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\"\b\u0002\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010 \u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!¨\u0006&²\u0006\f\u0010\"\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010$\u001a\u0004\u0018\u00010#8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010%\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, m65681d2 = {"Lsl0/n0;", "screenArgs", "Lkotlin/Function0;", "Ll83/a0;", "onBackPressed", "Lkotlin/Function5;", "", "", "onProvideWrapperCallbacks", "Lkotlin/Function1;", "onShowContextHubChanged", "onShowHistoryChanged", "onNavigationEvent", "Lkotlin/Function3;", "onContentLoaded", "isWceLoading", "isBottomSheetVisible", "isDrawerVisible", "", "ttfmtStartTimeMs", "isVisible", "isSheetExpanded", "Landroidx/compose/ui/Modifier;", "historyDragModifier", "historyListModifier", "halfDrawerReadOnly", "Lch0/v0;", "coordinator", "p", "(Lsl0/n0;Lc93/a;Lc93/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function3;ZZZLjava/lang/Long;ZZLandroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;ZLch0/v0;Landroidx/compose/runtime/Composer;III)V", "Lzg0/i;", "viewState", "L", "(ZLzg0/i;)Z", "baseViewState", "Lg2/v;", "focusState", "pickerLaunched", "bot_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4610c1 {

    /* JADX INFO: renamed from: ch0.c1$a */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$1$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18538w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18539x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC12251g f18540y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40626i f18541z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z4, InterfaceC12251g interfaceC12251g, C40626i c40626i, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18539x = z4;
            this.f18540y = interfaceC12251g;
            this.f18541z = c40626i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f18539x, this.f18540y, this.f18541z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18538w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f18539x) {
                this.f18540y.mo34143r(this.f18541z.getConversation().getFingerprint());
            } else {
                this.f18540y.mo34136d();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$b */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$10$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18542w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4655v f18543x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Function3 f18544y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4655v c4655v, Function3 function3, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18543x = c4655v;
            this.f18544y = function3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new b(this.f18543x, this.f18544y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Function3 function3;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18542w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C4655v c4655v = this.f18543x;
            if (c4655v != null && (function3 = this.f18544y) != null) {
                function3.invoke(c4655v.getText(), c4655v.getTurnId(), Boolean.FALSE);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$c */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c extends C22672i implements Function1 {
        public c(Object obj) {
            super(1, 0, C4656v0.class, obj, "trackFormAnalytic", "trackFormAnalytic(Lcom/whoop/ai/chat/view/formwidget/FormAnalyticEvent;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14368a(InterfaceC18484b p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4656v0) this.receiver).m14678F(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14368a((InterfaceC18484b) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$d */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class d extends C22672i implements Function1 {
        public d(Object obj) {
            super(1, 0, C4656v0.class, obj, "trackDesignItemAnalytic", "trackDesignItemAnalytic(Lcom/whoop/analytics/AnalyticEventModel;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m14369a(AnalyticEventModel p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C4656v0) this.receiver).m14675C(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14369a((AnalyticEventModel) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$e */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$12$10$1$1$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {294}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18545w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f18546x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C15199y3 c15199y3, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18546x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new e(this.f18546x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18545w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f18546x;
                this.f18545w = 1;
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

    /* JADX INFO: renamed from: ch0.c1$f */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$12$6$1$1$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AttachmentType f18547E;

        /* JADX INFO: renamed from: w */
        int f18548w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4656v0 f18549x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f18550y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f18551z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C4656v0 c4656v0, Uri uri, String str, AttachmentType attachmentType, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18549x = c4656v0;
            this.f18550y = uri;
            this.f18551z = str;
            this.f18547E = attachmentType;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new f(this.f18549x, this.f18550y, this.f18551z, this.f18547E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18548w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18549x.m14699t(this.f18550y, this.f18551z, this.f18547E);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$g */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$12$9$1$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {280}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18552w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f18553x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C15199y3 c15199y3, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18553x = c15199y3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new g(this.f18553x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18552w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C15199y3 c15199y3 = this.f18553x;
                this.f18552w = 1;
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

    /* JADX INFO: renamed from: ch0.c1$h */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$2$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C4656v0 f18554E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC28601c1 f18555F;

        /* JADX INFO: renamed from: w */
        int f18556w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18557x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C40626i f18558y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ChatEntrypointExperience f18559z;

        /* JADX INFO: renamed from: ch0.c1$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f18560a;

            static {
                int[] iArr = new int[ChatEntrypointExperience.values().length];
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_ROLL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_BACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_CAMERA_FRONT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_FILES.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChatEntrypointExperience.STANDARD.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ChatEntrypointExperience.FAB_VOICE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_VOICE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_KEYBOARD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ChatEntrypointExperience.QUICK_HISTORY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ChatEntrypointExperience.FORM_INPUT_ONLY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f18560a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z4, C40626i c40626i, ChatEntrypointExperience chatEntrypointExperience, C4656v0 c4656v0, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18557x = z4;
            this.f18558y = c40626i;
            this.f18559z = chatEntrypointExperience;
            this.f18554E = c4656v0;
            this.f18555F = interfaceC28601c1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f18557x, this.f18558y, this.f18559z, this.f18554E, this.f18555F, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18556w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            boolean z4 = this.f18557x;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (!z4 || AbstractC4610c1.m14336G(this.f18555F) || this.f18558y.getConversation().getFingerprint().length() == 0) {
                return c23454a0;
            }
            ChatEntrypointExperience chatEntrypointExperience = this.f18559z;
            switch (chatEntrypointExperience == null ? -1 : a.f18560a[chatEntrypointExperience.ordinal()]) {
                case -1:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    return c23454a0;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                    this.f18554E.getMediaPickerLauncher().mo102038a(AbstractC32662q2.c.f135511a);
                    break;
                case 2:
                    this.f18554E.getMediaPickerLauncher().mo102038a(AbstractC32662q2.a.f135509a);
                    break;
                case 3:
                    this.f18554E.getMediaPickerLauncher().mo102038a(AbstractC32662q2.b.f135510a);
                    break;
                case 4:
                    this.f18554E.getFilePickerLauncher().mo102243a();
                    break;
            }
            AbstractC4610c1.m14337H(this.f18555F, true);
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$i */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$3$1$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {139, 141}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C15199y3 f18561E;

        /* JADX INFO: renamed from: w */
        int f18562w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C15199y3 f18563x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f18564y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f18565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C15199y3 c15199y3, boolean z4, InterfaceC4339a interfaceC4339a, C15199y3 c15199y4, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18563x = c15199y3;
            this.f18564y = z4;
            this.f18565z = interfaceC4339a;
            this.f18561E = c15199y4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f18563x, this.f18564y, this.f18565z, this.f18561E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r5.m43223d(r4) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r5.m43223d(r4) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            return r0;
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
                int r1 = r4.f18562w
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L15:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L51
            L19:
                p505ts.AbstractC34132o.m107864I(r5)
                g1.y3 r5 = r4.f18563x
                boolean r5 = r5.m43224e()
                if (r5 == 0) goto L39
                boolean r5 = r4.f18564y
                if (r5 == 0) goto L2e
                c93.a r5 = r4.f18565z
                r5.invoke()
                goto L51
            L2e:
                g1.y3 r5 = r4.f18563x
                r4.f18562w = r3
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L51
                goto L4b
            L39:
                g1.y3 r5 = r4.f18561E
                boolean r5 = r5.m43224e()
                if (r5 == 0) goto L4c
                g1.y3 r5 = r4.f18561E
                r4.f18562w = r2
                java.lang.Object r5 = r5.m43223d(r4)
                if (r5 != r0) goto L51
            L4b:
                return r0
            L4c:
                c93.a r5 = r4.f18565z
                r5.invoke()
            L51:
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p702ch0.AbstractC4610c1.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ch0.c1$j */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$5$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18566w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18567x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4656v0 f18568y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z4, C4656v0 c4656v0, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18567x = z4;
            this.f18568y = c4656v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f18567x, this.f18568y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18566w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (this.f18567x) {
                this.f18568y.m14677E();
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$k */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$6$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {166}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18569w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ boolean f18570x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Long f18571y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C4656v0 f18572z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z4, Long l7, C4656v0 c4656v0, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18570x = z4;
            this.f18571y = l7;
            this.f18572z = c4656v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new k(this.f18570x, this.f18571y, this.f18572z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Long l7;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18569w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                boolean z4 = this.f18570x;
                if (z4 && (l7 = this.f18571y) != null) {
                    C4656v0 c4656v0 = this.f18572z;
                    long jLongValue = l7.longValue();
                    this.f18569w = 1;
                    if (c4656v0.m14693m(jLongValue, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else if (!z4) {
                    this.f18572z.m14692l();
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

    /* JADX INFO: renamed from: ch0.c1$l */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$7$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18573w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4656v0 f18574x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C32645n0 f18575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C4656v0 c4656v0, C32645n0 c32645n0, InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18574x = c4656v0;
            this.f18575y = c32645n0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new l(this.f18574x, this.f18575y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18573w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f18574x.m14681a(this.f18575y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$m */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$8$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C4656v0 f18576E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ InterfaceC4339a f18577F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC2994c0 f18578G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C15199y3 f18579H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ C15199y3 f18580I;

        /* JADX INFO: renamed from: w */
        int f18581w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC4353o f18582x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f18583y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C40626i f18584z;

        /* JADX INFO: renamed from: ch0.c1$m$a */
        @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$8$1$2$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {192, 193}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f18585w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4656v0 f18586x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C15199y3 f18587y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C15199y3 f18588z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4656v0 c4656v0, C15199y3 c15199y3, C15199y3 c15199y4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f18586x = c4656v0;
                this.f18587y = c15199y3;
                this.f18588z = c15199y4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f18586x, this.f18587y, this.f18588z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
            
                if (r5.m43225f(r4) == r0) goto L15;
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
                    int r1 = r4.f18585w
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1c
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L40
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L35
                L1c:
                    p505ts.AbstractC34132o.m107864I(r5)
                    ch0.v0 r5 = r4.f18586x
                    zg0.h r5 = r5.getViewModel()
                    zg0.g$g r1 = zg0.AbstractC40624g.g.f175109a
                    r5.mo1216g(r1)
                    g1.y3 r5 = r4.f18587y
                    r4.f18585w = r3
                    java.lang.Object r5 = r5.m43223d(r4)
                    if (r5 != r0) goto L35
                    goto L3f
                L35:
                    g1.y3 r5 = r4.f18588z
                    r4.f18585w = r2
                    java.lang.Object r5 = r5.m43225f(r4)
                    if (r5 != r0) goto L40
                L3f:
                    return r0
                L40:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p702ch0.AbstractC4610c1.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC4353o interfaceC4353o, String str, C40626i c40626i, C4656v0 c4656v0, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, C15199y3 c15199y4, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18582x = interfaceC4353o;
            this.f18583y = str;
            this.f18584z = c40626i;
            this.f18576E = c4656v0;
            this.f18577F = interfaceC4339a;
            this.f18578G = interfaceC2994c0;
            this.f18579H = c15199y3;
            this.f18580I = c15199y4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: j */
        public static final C23454a0 m14373j(C40626i c40626i, C4656v0 c4656v0, InterfaceC4339a interfaceC4339a) {
            C26805g c26805gM131757a = c40626i.getConversation().getBetaTagViewState();
            C9598e c9598eM79966b = c26805gM131757a.getNavigationAction();
            c4656v0.m14701v(c9598eM79966b != null ? new AbstractC39523b.a(c9598eM79966b) : new AbstractC39523b.c(c26805gM131757a.getDestination()), interfaceC4339a);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public static final C23454a0 m14374k(InterfaceC2994c0 interfaceC2994c0, C4656v0 c4656v0, C15199y3 c15199y3, C15199y3 c15199y4) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(c4656v0, c15199y3, c15199y4, null), 3);
            return C23454a0.f92919a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l */
        public static final C23454a0 m14375l(C4656v0 c4656v0, InterfaceC4339a interfaceC4339a) {
            c4656v0.m14696p(interfaceC4339a);
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new m(this.f18582x, this.f18583y, this.f18584z, this.f18576E, this.f18577F, this.f18578G, this.f18579H, this.f18580I, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18581w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC4353o interfaceC4353o = this.f18582x;
            if (interfaceC4353o != null) {
                final C40626i c40626i = this.f18584z;
                final C4656v0 c4656v0 = this.f18576E;
                final InterfaceC4339a interfaceC4339a = this.f18577F;
                interfaceC4353o.invoke(new InterfaceC4339a() { // from class: ch0.d1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        return AbstractC4610c1.m.m14373j(c40626i, c4656v0, interfaceC4339a);
                    }
                }, new C4616e1(this.f18578G, c4656v0, this.f18579H, this.f18580I), new C4637m(c4656v0, interfaceC4339a), this.f18583y, Boolean.valueOf(AbstractC8693b.m21270d(c40626i.getConversation().getBetaTagViewState().getTitle())));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$n */
    @InterfaceC32271e(m100429c = "com.whoop.ai.chat.view.AiChatWrapperScreenKt$AiChatWrapperScreen$9$1", m100430f = "AiChatWrapperScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18589w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ Function1 f18590x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f18591y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Function1 f18592z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Function1 function1, boolean z4, Function1 function2, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18590x = function1;
            this.f18591y = z4;
            this.f18592z = function2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new n(this.f18590x, this.f18591y, this.f18592z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f18589w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Function1 function1 = this.f18590x;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(!this.f18591y));
            }
            Function1 function2 = this.f18592z;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(!this.f18591y));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ch0.c1$o */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"ch0/c1$o", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC12251g f18593a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C4656v0 f18594b;

        public o(InterfaceC12251g interfaceC12251g, C4656v0 c4656v0) {
            this.f18593a = interfaceC12251g;
            this.f18594b = c4656v0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f18593a.mo34136d();
            this.f18594b.m14692l();
            this.f18594b.m14698s();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m14330A(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new g(c15199y3, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m14331B(C40626i c40626i, C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, Modifier modifier, InterfaceC23013y BottomSheet, Composer composer, int i13) {
        AbstractC22676k.m65750j(BottomSheet, "$this$BottomSheet");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C40620c chatHistoryViewState = c40626i.getChatHistoryViewState();
            boolean zM87157i = c28655q.m87157i(c4656v0) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y3);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C4635l(c4656v0, interfaceC2994c0, c15199y3, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC4653u.m14646l(chatHistoryViewState, (Function1) objM87133R, modifier, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m14332C(C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, AbstractC40624g event) {
        AbstractC22676k.m65750j(event, "event");
        c4656v0.getViewModel().mo1216g(event);
        if (event instanceof AbstractC40624g.b) {
            AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new e(c15199y3, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m14333D(C32645n0 c32645n0, InterfaceC4339a interfaceC4339a, InterfaceC4353o interfaceC4353o, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a2, Function3 function3, boolean z4, boolean z13, boolean z14, Long l7, boolean z15, boolean z16, Modifier modifier, Modifier modifier2, boolean z17, C4656v0 c4656v0, int i13, int i14, int i15, Composer composer, int i16) {
        m14357p(c32645n0, interfaceC4339a, interfaceC4353o, function1, function2, interfaceC4339a2, function3, z4, z13, z14, l7, z15, z16, modifier, modifier2, z17, c4656v0, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private static final InterfaceC15250v m14334E(InterfaceC28601c1 interfaceC28601c1) {
        return (InterfaceC15250v) interfaceC28601c1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final InterfaceC28601c1 m14335F() {
        return AbstractC28683x.m87272z(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final boolean m14336G(InterfaceC28601c1 interfaceC28601c1) {
        return ((Boolean) interfaceC28601c1.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m14337H(InterfaceC28601c1 interfaceC28601c1, boolean z4) {
        interfaceC28601c1.setValue(Boolean.valueOf(z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m14338I(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, boolean z4, InterfaceC4339a interfaceC4339a, C15199y3 c15199y4) {
        AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new i(c15199y3, z4, interfaceC4339a, c15199y4, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m14341L(boolean z4, C40626i viewState) {
        AbstractC22676k.m65750j(viewState, "viewState");
        if (!z4) {
            return false;
        }
        C40622e c40622e = (C40622e) AbstractC25265s.m74114R0(viewState.getConversation().m131761e());
        if (c40622e == null) {
            return true;
        }
        List<C40621d> listM131752c = c40622e.m131752c();
        if ((listM131752c instanceof Collection) && listM131752c.isEmpty()) {
            return true;
        }
        for (C40621d c40621d : listM131752c) {
            if (c40621d.getRole() == EnumC26800b.ASSISTANT && c40621d.getRawTextContent().length() > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:105:0x0141  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:108:0x0149  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0168  */
    /* JADX WARN: Code duplicated, block: B:118:0x016b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:124:0x017c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0182  */
    /* JADX WARN: Code duplicated, block: B:128:0x018a  */
    /* JADX WARN: Code duplicated, block: B:129:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0194  */
    /* JADX WARN: Code duplicated, block: B:135:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:165:0x0200  */
    /* JADX WARN: Code duplicated, block: B:167:0x0206  */
    /* JADX WARN: Code duplicated, block: B:171:0x0211  */
    /* JADX WARN: Code duplicated, block: B:174:0x0221  */
    /* JADX WARN: Code duplicated, block: B:178:0x022e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0238  */
    /* JADX WARN: Code duplicated, block: B:183:0x0245  */
    /* JADX WARN: Code duplicated, block: B:193:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:194:0x0276  */
    /* JADX WARN: Code duplicated, block: B:196:0x0279  */
    /* JADX WARN: Code duplicated, block: B:198:0x027c  */
    /* JADX WARN: Code duplicated, block: B:200:0x027f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0282  */
    /* JADX WARN: Code duplicated, block: B:204:0x0285  */
    /* JADX WARN: Code duplicated, block: B:205:0x0287  */
    /* JADX WARN: Code duplicated, block: B:208:0x028d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0292  */
    /* JADX WARN: Code duplicated, block: B:211:0x0297  */
    /* JADX WARN: Code duplicated, block: B:212:0x0299  */
    /* JADX WARN: Code duplicated, block: B:214:0x029d  */
    /* JADX WARN: Code duplicated, block: B:215:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:217:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:218:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:222:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:225:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:228:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:231:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:233:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:236:0x034e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0351  */
    /* JADX WARN: Code duplicated, block: B:240:0x0392  */
    /* JADX WARN: Code duplicated, block: B:244:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:247:0x03af  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:251:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:254:0x0401  */
    /* JADX WARN: Code duplicated, block: B:255:0x040d  */
    /* JADX WARN: Code duplicated, block: B:258:0x0420  */
    /* JADX WARN: Code duplicated, block: B:259:0x042d  */
    /* JADX WARN: Code duplicated, block: B:262:0x045d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0463  */
    /* JADX WARN: Code duplicated, block: B:268:0x046d A[PHI: r78
      0x046d: PHI (r78v3 int) = (r78v1 int), (r78v4 int) binds: [B:267:0x046b, B:265:0x0466] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:269:0x0470  */
    /* JADX WARN: Code duplicated, block: B:272:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:273:0x0483  */
    /* JADX WARN: Code duplicated, block: B:276:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:277:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:280:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:281:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:284:0x04cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:287:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:290:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:294:0x0504  */
    /* JADX WARN: Code duplicated, block: B:297:0x051a  */
    /* JADX WARN: Code duplicated, block: B:298:0x051d  */
    /* JADX WARN: Code duplicated, block: B:301:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:304:0x0532  */
    /* JADX WARN: Code duplicated, block: B:307:0x0568 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:308:0x056a  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0582  */
    /* JADX WARN: Code duplicated, block: B:312:0x0585  */
    /* JADX WARN: Code duplicated, block: B:315:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x0593  */
    /* JADX WARN: Code duplicated, block: B:319:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:321:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:327:0x05be  */
    /* JADX WARN: Code duplicated, block: B:328:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:331:0x05ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:334:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:337:0x05f9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:341:0x062d  */
    /* JADX WARN: Code duplicated, block: B:342:0x0630  */
    /* JADX WARN: Code duplicated, block: B:345:0x0644  */
    /* JADX WARN: Code duplicated, block: B:346:0x0647  */
    /* JADX WARN: Code duplicated, block: B:349:0x0664 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:352:0x066a  */
    /* JADX WARN: Code duplicated, block: B:355:0x069a  */
    /* JADX WARN: Code duplicated, block: B:357:0x069f  */
    /* JADX WARN: Code duplicated, block: B:360:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:361:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:364:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:367:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:370:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:371:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:375:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:378:0x06ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:381:0x0705  */
    /* JADX WARN: Code duplicated, block: B:384:0x0723 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:385:0x0725  */
    /* JADX WARN: Code duplicated, block: B:387:0x0769  */
    /* JADX WARN: Code duplicated, block: B:390:0x078c  */
    /* JADX WARN: Code duplicated, block: B:392:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0124  */
    /* JADX INFO: renamed from: p */
    public static final void m14357p(final C32645n0 screenArgs, final InterfaceC4339a onBackPressed, InterfaceC4353o interfaceC4353o, Function1 function1, Function1 function2, InterfaceC4339a interfaceC4339a, Function3 function3, final boolean z4, boolean z13, boolean z14, Long l7, boolean z15, boolean z16, Modifier modifier, Modifier modifier2, boolean z17, C4656v0 c4656v0, Composer composer, final int i13, final int i14, final int i15) {
        int i16;
        InterfaceC4353o interfaceC4353o2;
        int i17;
        int i18;
        Function1 function4;
        int i19;
        int i24;
        int i25;
        Function1 function5;
        int i26;
        int i27;
        InterfaceC4339a interfaceC4339a2;
        int i28;
        int i29;
        int i34;
        Function3 function6;
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
        int i57;
        int i58;
        int i59;
        int i64;
        int i65;
        int i66;
        int i67;
        boolean z18;
        final Function1 function7;
        final boolean z19;
        final Long l12;
        final Modifier modifier3;
        final boolean z24;
        final C4656v0 c4656v1;
        final InterfaceC4339a interfaceC4339a3;
        C28655q c28655q;
        final Function1 function8;
        final Function3 function9;
        final InterfaceC4353o interfaceC4353o3;
        final boolean z25;
        final boolean z26;
        final boolean z27;
        final Modifier modifier4;
        C28677v1 c28677v1M87180u;
        boolean z28;
        int i68;
        boolean z29;
        Long l13;
        boolean z34;
        boolean z35;
        Modifier modifier5;
        Modifier modifier6;
        boolean z36;
        InterfaceC30057d interfaceC30057d;
        C4656v0 c4656v0M14712i;
        final InterfaceC4339a interfaceC4339a4;
        final Modifier modifier7;
        final boolean z37;
        final Modifier modifier8;
        final boolean z38;
        final ChatEntrypointExperience chatEntrypointExperienceM102020e;
        boolean zM102033r;
        boolean z39;
        boolean z44;
        C40626i c40626iM131824b;
        boolean z45;
        boolean z46;
        Object objM87133R;
        C28676v0 c28676v0;
        final InterfaceC2994c0 interfaceC2994c0;
        EnumC15209z3 enumC15209z3;
        C15199y3 c15199y3M3460c;
        InterfaceC4353o interfaceC4353o4;
        C15199y3 c15199y3M3460c2;
        Function3 function10;
        Object objM87133R2;
        C28655q c28655q2;
        Function1 function11;
        Object objM87133R3;
        InterfaceC28601c1 interfaceC28601c1;
        InterfaceC12251g interfaceC12251g;
        int i69;
        int i74;
        Long l14;
        int i75;
        boolean z47;
        boolean zM87157i;
        Object objM87133R4;
        boolean z48;
        int iOrdinal;
        boolean zM87149e;
        Object objM87133R5;
        boolean z49;
        C40626i c40626i;
        boolean z52;
        boolean z54;
        boolean zM87157i2;
        Object objM87133R6;
        C15199y3 c15199y3;
        final boolean z55;
        C15199y3 c15199y4;
        boolean zM87157i3;
        Object objM87133R7;
        boolean z56;
        boolean zM87157i4;
        Object objM87133R8;
        boolean z57;
        boolean zM87157i5;
        Object objM87133R9;
        boolean zM87157i6;
        Object objM87133R10;
        String strM21274h;
        boolean z58;
        boolean z59;
        boolean zM87157i7;
        Object objM87133R11;
        InterfaceC4353o interfaceC4353o5;
        boolean z60;
        boolean z64;
        boolean z65;
        Object objM87133R12;
        Function1 function12;
        Function1 function13;
        C4655v c4655vM14667a;
        boolean zM87153g;
        Object objM87133R13;
        Function3 function14;
        boolean zM87157i8;
        Object objM87133R14;
        int i76;
        AbstractC22676k.m65750j(screenArgs, "screenArgs");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(331093312);
        if ((i13 & 6) == 0) {
            i16 = (c28655q3.m87157i(screenArgs) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q3.m87157i(onBackPressed) ? 32 : 16;
        }
        int i77 = i15 & 4;
        if (i77 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4353o2 = interfaceC4353o;
                i16 |= c28655q3.m87157i(interfaceC4353o2) ? 256 : 128;
            }
            i17 = i15 & 8;
            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i17 != 0) {
                if ((i13 & 3072) == 0) {
                    function4 = function1;
                    if (c28655q3.m87157i(function4)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = 1024;
                    }
                    i16 |= i19;
                }
                i24 = i15 & 16;
                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        function5 = function2;
                        if (c28655q3.m87157i(function5)) {
                            i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i26 = 8192;
                        }
                        i16 |= i26;
                    }
                    i27 = i15 & 32;
                    if (i27 != 0) {
                        i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                        interfaceC4339a2 = interfaceC4339a;
                    } else {
                        interfaceC4339a2 = interfaceC4339a;
                        if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                            if (c28655q3.m87157i(interfaceC4339a2)) {
                                i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                            } else {
                                i28 = 65536;
                            }
                            i16 |= i28;
                        }
                    }
                    i29 = i15 & 64;
                    i34 = 524288;
                    if (i29 != 0) {
                        i16 |= 1572864;
                        function6 = function3;
                    } else {
                        function6 = function3;
                        if ((i13 & 1572864) == 0) {
                            if (c28655q3.m87157i(function6)) {
                                i35 = 1048576;
                            } else {
                                i35 = 524288;
                            }
                            i16 |= i35;
                        }
                    }
                    if ((i13 & 12582912) == 0) {
                        if (c28655q3.m87155h(z4)) {
                            i76 = 8388608;
                        } else {
                            i76 = 4194304;
                        }
                        i16 |= i76;
                    }
                    i36 = i15 & 256;
                    if (i36 != 0) {
                        i16 |= 100663296;
                    } else if ((i13 & 100663296) == 0) {
                        if (c28655q3.m87155h(z13)) {
                            i37 = 67108864;
                        } else {
                            i37 = AndroidSDKConstants.FLAG_MUTABLE;
                        }
                        i16 |= i37;
                    }
                    if ((i13 & 805306368) != 0) {
                        i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
                    }
                    i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    if (i38 != 0) {
                        i39 = i14 | 6;
                    } else if ((i14 & 6) == 0) {
                        if (c28655q3.m87153g(l7)) {
                            i44 = 4;
                        } else {
                            i44 = 2;
                        }
                        i39 = i14 | i44;
                    } else {
                        i39 = i14;
                    }
                    i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    if (i45 != 0) {
                        i39 |= 48;
                    } else if ((i14 & 48) != 0) {
                        if (c28655q3.m87155h(z15)) {
                            i46 = 32;
                        } else {
                            i46 = 16;
                        }
                        i39 |= i46;
                    }
                    i47 = i39;
                    i48 = i15 & 4096;
                    if (i48 != 0) {
                        i54 = i47 | 384;
                    } else {
                        i49 = i47;
                        if ((i14 & 384) != 0) {
                            if (c28655q3.m87155h(z16)) {
                                i55 = 256;
                            } else {
                                i55 = 128;
                            }
                            i49 |= i55;
                        }
                        i54 = i49;
                    }
                    i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                    if (i56 != 0) {
                        i58 = i54 | 3072;
                    } else {
                        i57 = i54;
                        if ((i14 & 3072) == 0) {
                            if (c28655q3.m87153g(modifier)) {
                                i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            }
                            i58 = i57 | i18;
                        } else {
                            i58 = i57;
                        }
                    }
                    i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                    if (i59 != 0) {
                        i65 = i58 | 24576;
                    } else {
                        i64 = i58;
                        if ((i14 & 24576) == 0) {
                            if (c28655q3.m87153g(modifier2)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            }
                            i65 = i64 | i25;
                        } else {
                            i65 = i64;
                        }
                    }
                    i66 = i15 & 32768;
                    if (i66 != 0) {
                        i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87155h(z17)) {
                            i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i67 = 65536;
                        }
                        i65 |= i67;
                    }
                    if ((i14 & 1572864) != 0) {
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0 && c28655q3.m87157i(c4656v0)) {
                            i34 = 1048576;
                        }
                        i65 |= i34;
                    }
                    if ((i16 & 306783379) == 306783378 || (i65 & 599187) != 599186) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (c28655q3.m87135U(i16 & 1, z18)) {
                        c28655q3.m87140Z();
                        if ((i13 & 1) != 0 || c28655q3.m87118C()) {
                            if (i77 != 0) {
                                interfaceC4353o2 = null;
                            }
                            if (i17 != 0) {
                                function4 = null;
                            }
                            if (i24 != 0) {
                                function5 = null;
                            }
                            if (i27 != 0) {
                                interfaceC4339a2 = null;
                            }
                            if (i29 != 0) {
                                function6 = null;
                            }
                            if (i36 != 0) {
                                z28 = false;
                            } else {
                                z28 = z13;
                            }
                            if ((i15 & 512) != 0) {
                                i68 = i16 & (-1879048193);
                                z29 = z28;
                            } else {
                                i68 = i16;
                                z29 = z14;
                            }
                            if (i38 != 0) {
                                l13 = null;
                            } else {
                                l13 = l7;
                            }
                            if (i45 != 0) {
                                z34 = true;
                            } else {
                                z34 = z15;
                            }
                            if (i48 != 0) {
                                z35 = false;
                            } else {
                                z35 = z16;
                            }
                            modifier5 = C2314t.f9131w;
                            if (i56 != 0) {
                                modifier6 = modifier5;
                            } else {
                                modifier6 = modifier;
                            }
                            if (i59 == 0) {
                                modifier5 = modifier2;
                            }
                            if (i66 != 0) {
                                z36 = false;
                            } else {
                                z36 = z17;
                            }
                            if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                                interfaceC30057d = null;
                                c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                                i65 &= -3670017;
                            } else {
                                interfaceC30057d = null;
                                c4656v0M14712i = c4656v0;
                            }
                            interfaceC4339a4 = interfaceC4339a2;
                            modifier7 = modifier6;
                            z37 = z35;
                            modifier8 = modifier5;
                            z38 = z36;
                        } else {
                            c28655q3.m87138X();
                            if ((i15 & 512) != 0) {
                                i16 &= -1879048193;
                            }
                            if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                                i65 &= -3670017;
                            }
                            z28 = z13;
                            l13 = l7;
                            z34 = z15;
                            z37 = z16;
                            modifier7 = modifier;
                            modifier8 = modifier2;
                            z38 = z17;
                            c4656v0M14712i = c4656v0;
                            i68 = i16;
                            interfaceC4339a4 = interfaceC4339a2;
                            interfaceC30057d = null;
                            z29 = z14;
                        }
                        c28655q3.m87175r();
                        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                        chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                        zM102033r = screenArgs.m102033r();
                        z39 = z28;
                        if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                            z44 = true;
                        } else {
                            z44 = false;
                        }
                        c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                        z45 = z44;
                        if (zM102033r || c40626iM131824b.getConversation().getFingerprint().length() != 0) {
                            z46 = false;
                        } else {
                            z46 = true;
                        }
                        objM87133R = c28655q3.m87133R();
                        c28676v0 = C28635l.f115821a;
                        if (objM87133R == c28676v0) {
                            objM87133R = AbstractC28683x.m87262p(c28655q3);
                            c28655q3.m87172p0(objM87133R);
                        }
                        interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                        if (zM102033r) {
                            enumC15209z3 = EnumC15209z3.f57107x;
                        } else {
                            enumC15209z3 = EnumC15209z3.f57106w;
                        }
                        c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                        interfaceC4353o4 = interfaceC4353o2;
                        c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                        function10 = function6;
                        objM87133R2 = c28655q3.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                            c28655q2 = c28655q3;
                            c28655q2.m87172p0(objM87133R2);
                        } else {
                            c28655q2 = c28655q3;
                        }
                        final InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) objM87133R2;
                        function11 = function5;
                        Object[] objArr = new Object[0];
                        objM87133R3 = c28655q2.m87133R();
                        if (objM87133R3 == c28676v0) {
                            objM87133R3 = new C4387a(10);
                            c28655q2.m87172p0(objM87133R3);
                        }
                        interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                        interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                        Boolean boolValueOf = Boolean.valueOf(z29);
                        i69 = i68;
                        String strM131759c = c40626iM131824b.getConversation().getFingerprint();
                        i74 = (i69 & 1879048192) ^ 805306368;
                        l14 = l13;
                        if (i74 > 536870912 || !c28655q2.m87155h(z29)) {
                            i75 = i74;
                            if ((i69 & 805306368) != 536870912) {
                                z47 = false;
                            }
                            zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                            objM87133R4 = c28655q2.m87133R();
                            if (zM87157i || objM87133R4 == c28676v0) {
                                objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                                c28655q2.m87172p0(objM87133R4);
                            }
                            AbstractC28683x.m87254h(boolValueOf, strM131759c, (InterfaceC4351m) objM87133R4, c28655q2);
                            Boolean boolValueOf2 = Boolean.valueOf(z39);
                            String strM131759c2 = c40626iM131824b.getConversation().getFingerprint();
                            if ((i69 & 234881024) == 67108864) {
                                z48 = true;
                            } else {
                                z48 = false;
                            }
                            boolean zM87153g2 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                            if (chatEntrypointExperienceM102020e == null) {
                                iOrdinal = -1;
                            } else {
                                iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                            }
                            zM87149e = zM87153g2 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                            objM87133R5 = c28655q2.m87133R();
                            if (!zM87149e || objM87133R5 == c28676v0) {
                                objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                                z49 = z39;
                                c40626i = c40626iM131824b;
                                c28655q2.m87172p0(objM87133R5);
                            } else {
                                c40626i = c40626iM131824b;
                                z49 = z39;
                            }
                            AbstractC28683x.m87254h(boolValueOf2, strM131759c2, (InterfaceC4351m) objM87133R5, c28655q2);
                            if (!c15199y3M3460c.m43224e() || c15199y3M3460c2.m43224e()) {
                                z52 = true;
                            } else {
                                z52 = false;
                            }
                            boolean zM87157i9 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                            if ((i69 & 112) == 32) {
                                z54 = true;
                            } else {
                                z54 = false;
                            }
                            zM87157i2 = zM87157i9 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                            objM87133R6 = c28655q2.m87133R();
                            if (!zM87157i2 || objM87133R6 == c28676v0) {
                                boolean z66 = z46;
                                objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z66, onBackPressed, c15199y3M3460c2);
                                c15199y3 = c15199y3M3460c;
                                z55 = z66;
                                c15199y4 = c15199y3M3460c2;
                                c28655q2.m87172p0(objM87133R6);
                            } else {
                                z55 = z46;
                                c15199y3 = c15199y3M3460c;
                                c15199y4 = c15199y3M3460c2;
                            }
                            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                            zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                            objM87133R7 = c28655q2.m87133R();
                            if (zM87157i3 || objM87133R7 == c28676v0) {
                                objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                                c28655q2.m87172p0(objM87133R7);
                            }
                            AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                            Boolean boolValueOf3 = Boolean.valueOf(z34);
                            if ((i65 & 112) == 32) {
                                z56 = true;
                            } else {
                                z56 = false;
                            }
                            zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                            objM87133R8 = c28655q2.m87133R();
                            if (zM87157i4 || objM87133R8 == c28676v0) {
                                objM87133R8 = new j(z34, c4656v0M14712i, null);
                                c28655q2.m87172p0(objM87133R8);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf3);
                            Boolean boolValueOf4 = Boolean.valueOf(z29);
                            boolean z67 = (i75 <= 536870912 && c28655q2.m87155h(z29)) || (i69 & 805306368) == 536870912;
                            if ((i65 & 14) == 4) {
                                z57 = true;
                            } else {
                                z57 = false;
                            }
                            zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                            objM87133R9 = c28655q2.m87133R();
                            if (!zM87157i5 || objM87133R9 == c28676v0) {
                                l12 = l14;
                                objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                                c28655q2.m87172p0(objM87133R9);
                            } else {
                                l12 = l14;
                            }
                            AbstractC28683x.m87254h(boolValueOf4, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                            String strM102021f = screenArgs.getFingerprint();
                            zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                            objM87133R10 = c28655q2.m87133R();
                            if (zM87157i6 || objM87133R10 == c28676v0) {
                                objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                                c28655q2.m87172p0(objM87133R10);
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f);
                            strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                            C26805g c26805gM131757a = c40626i.getConversation().getBetaTagViewState();
                            boolean z68 = z49;
                            if ((i69 & 896) == 256) {
                                z58 = true;
                            } else {
                                z58 = false;
                            }
                            boolean zM87157i10 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                            if ((458752 & i69) == 131072) {
                                z59 = true;
                            } else {
                                z59 = false;
                            }
                            zM87157i7 = zM87157i10 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                            objM87133R11 = c28655q2.m87133R();
                            if (!zM87157i7 || objM87133R11 == c28676v0) {
                                objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                                interfaceC4353o5 = interfaceC4353o4;
                                c28655q2.m87172p0(objM87133R11);
                            } else {
                                interfaceC4353o5 = interfaceC4353o4;
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a);
                            Boolean boolValueOf5 = Boolean.valueOf(z45);
                            if ((i69 & 7168) == 2048) {
                                z60 = true;
                            } else {
                                z60 = false;
                            }
                            boolean zM87155h = z60 | c28655q2.m87155h(z45);
                            InterfaceC4353o interfaceC4353o6 = interfaceC4353o5;
                            final C15199y3 c15199y5 = c15199y3;
                            if ((i69 & 57344) == 16384) {
                                z64 = true;
                            } else {
                                z64 = false;
                            }
                            z65 = z64 | zM87155h;
                            objM87133R12 = c28655q2.m87133R();
                            if (!z65 || objM87133R12 == c28676v0) {
                                function12 = function11;
                                function13 = function4;
                                objM87133R12 = new n(function13, z45, function12, null);
                                c28655q2.m87172p0(objM87133R12);
                            } else {
                                function12 = function11;
                                function13 = function4;
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf5);
                            if (c40626i.getHasContentPrefetched()) {
                                c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                            } else {
                                c4655vM14667a = null;
                            }
                            zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                            objM87133R13 = c28655q2.m87133R();
                            if (!zM87153g || objM87133R13 == c28676v0) {
                                function14 = function10;
                                objM87133R13 = new b(c4655vM14667a, function14, null);
                                c28655q2.m87172p0(objM87133R13);
                            } else {
                                function14 = function10;
                            }
                            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                            AbstractC28669t1 abstractC28669t1M53351e = AbstractC18486c.m53351e();
                            zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                            objM87133R14 = c28655q2.m87133R();
                            if (zM87157i8 || objM87133R14 == c28676v0) {
                                objM87133R14 = new c(c4656v0M14712i);
                                c28655q2.m87172p0(objM87133R14);
                            }
                            final C40626i c40626i2 = c40626i;
                            final C4656v0 c4656v2 = c4656v0M14712i;
                            final C15199y3 c15199y6 = c15199y4;
                            AbstractC28683x.m87247a(abstractC28669t1M53351e.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                                @Override // c93.InterfaceC4351m
                                public final Object invoke(Object obj, Object obj2) {
                                    int iIntValue = ((Integer) obj2).intValue();
                                    return AbstractC4610c1.m14360s(z4, c40626i2, c4656v2, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y6, c15199y5, z37, z55, modifier7, interfaceC28601c2, modifier8, (Composer) obj, iIntValue);
                                }
                            }), c28655q2, 56);
                            function7 = function13;
                            c4656v1 = c4656v0M14712i;
                            function9 = function14;
                            function8 = function12;
                            c28655q = c28655q2;
                            z26 = z34;
                            z24 = z38;
                            z27 = z37;
                            modifier4 = modifier7;
                            modifier3 = modifier8;
                            z19 = z68;
                            interfaceC4353o3 = interfaceC4353o6;
                            z25 = z29;
                            interfaceC4339a3 = interfaceC4339a4;
                        } else {
                            i75 = i74;
                        }
                        z47 = true;
                        zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                        objM87133R4 = c28655q2.m87133R();
                        if (zM87157i) {
                            objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                            c28655q2.m87172p0(objM87133R4);
                        } else {
                            objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                            c28655q2.m87172p0(objM87133R4);
                        }
                        AbstractC28683x.m87254h(boolValueOf, strM131759c, (InterfaceC4351m) objM87133R4, c28655q2);
                        Boolean boolValueOf6 = Boolean.valueOf(z39);
                        String strM131759c3 = c40626iM131824b.getConversation().getFingerprint();
                        if ((i69 & 234881024) == 67108864) {
                            z48 = true;
                        } else {
                            z48 = false;
                        }
                        boolean zM87153g3 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                        if (chatEntrypointExperienceM102020e == null) {
                            iOrdinal = -1;
                        } else {
                            iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                        }
                        zM87149e = zM87153g3 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                        objM87133R5 = c28655q2.m87133R();
                        if (zM87149e) {
                            objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                            z49 = z39;
                            c40626i = c40626iM131824b;
                            c28655q2.m87172p0(objM87133R5);
                        } else {
                            objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                            z49 = z39;
                            c40626i = c40626iM131824b;
                            c28655q2.m87172p0(objM87133R5);
                        }
                        AbstractC28683x.m87254h(boolValueOf6, strM131759c3, (InterfaceC4351m) objM87133R5, c28655q2);
                        if (c15199y3M3460c.m43224e()) {
                            z52 = true;
                        } else {
                            z52 = true;
                        }
                        boolean zM87157i11 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                        if ((i69 & 112) == 32) {
                            z54 = true;
                        } else {
                            z54 = false;
                        }
                        zM87157i2 = zM87157i11 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                        objM87133R6 = c28655q2.m87133R();
                        if (zM87157i2) {
                            boolean z69 = z46;
                            objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z69, onBackPressed, c15199y3M3460c2);
                            c15199y3 = c15199y3M3460c;
                            z55 = z69;
                            c15199y4 = c15199y3M3460c2;
                            c28655q2.m87172p0(objM87133R6);
                        } else {
                            boolean z610 = z46;
                            objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z610, onBackPressed, c15199y3M3460c2);
                            c15199y3 = c15199y3M3460c;
                            z55 = z610;
                            c15199y4 = c15199y3M3460c2;
                            c28655q2.m87172p0(objM87133R6);
                        }
                        AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                        zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                        objM87133R7 = c28655q2.m87133R();
                        if (zM87157i3) {
                            objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                            c28655q2.m87172p0(objM87133R7);
                        } else {
                            objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                            c28655q2.m87172p0(objM87133R7);
                        }
                        AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                        Boolean boolValueOf7 = Boolean.valueOf(z34);
                        if ((i65 & 112) == 32) {
                            z56 = true;
                        } else {
                            z56 = false;
                        }
                        zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                        objM87133R8 = c28655q2.m87133R();
                        if (zM87157i4) {
                            objM87133R8 = new j(z34, c4656v0M14712i, null);
                            c28655q2.m87172p0(objM87133R8);
                        } else {
                            objM87133R8 = new j(z34, c4656v0M14712i, null);
                            c28655q2.m87172p0(objM87133R8);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf7);
                        Boolean boolValueOf8 = Boolean.valueOf(z29);
                        if (i75 <= 536870912) {
                        }
                        if ((i65 & 14) == 4) {
                            z57 = true;
                        } else {
                            z57 = false;
                        }
                        zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                        objM87133R9 = c28655q2.m87133R();
                        if (zM87157i5) {
                            l12 = l14;
                            objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                            c28655q2.m87172p0(objM87133R9);
                        } else {
                            l12 = l14;
                            objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                            c28655q2.m87172p0(objM87133R9);
                        }
                        AbstractC28683x.m87254h(boolValueOf8, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                        String strM102021f2 = screenArgs.getFingerprint();
                        zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                        objM87133R10 = c28655q2.m87133R();
                        if (zM87157i6) {
                            objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                            c28655q2.m87172p0(objM87133R10);
                        } else {
                            objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                            c28655q2.m87172p0(objM87133R10);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f2);
                        strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                        C26805g c26805gM131757a2 = c40626i.getConversation().getBetaTagViewState();
                        boolean z611 = z49;
                        if ((i69 & 896) == 256) {
                            z58 = true;
                        } else {
                            z58 = false;
                        }
                        boolean zM87157i12 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                        if ((458752 & i69) == 131072) {
                            z59 = true;
                        } else {
                            z59 = false;
                        }
                        zM87157i7 = zM87157i12 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                        objM87133R11 = c28655q2.m87133R();
                        if (zM87157i7) {
                            objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                            interfaceC4353o5 = interfaceC4353o4;
                            c28655q2.m87172p0(objM87133R11);
                        } else {
                            objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                            interfaceC4353o5 = interfaceC4353o4;
                            c28655q2.m87172p0(objM87133R11);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a2);
                        Boolean boolValueOf9 = Boolean.valueOf(z45);
                        if ((i69 & 7168) == 2048) {
                            z60 = true;
                        } else {
                            z60 = false;
                        }
                        boolean zM87155h2 = z60 | c28655q2.m87155h(z45);
                        InterfaceC4353o interfaceC4353o7 = interfaceC4353o5;
                        final C15199y3 c15199y7 = c15199y3;
                        if ((i69 & 57344) == 16384) {
                            z64 = true;
                        } else {
                            z64 = false;
                        }
                        z65 = z64 | zM87155h2;
                        objM87133R12 = c28655q2.m87133R();
                        if (z65) {
                            function12 = function11;
                            function13 = function4;
                            objM87133R12 = new n(function13, z45, function12, null);
                            c28655q2.m87172p0(objM87133R12);
                        } else {
                            function12 = function11;
                            function13 = function4;
                            objM87133R12 = new n(function13, z45, function12, null);
                            c28655q2.m87172p0(objM87133R12);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf9);
                        if (c40626i.getHasContentPrefetched()) {
                            c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                        } else {
                            c4655vM14667a = null;
                        }
                        zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                        objM87133R13 = c28655q2.m87133R();
                        if (zM87153g) {
                            function14 = function10;
                            objM87133R13 = new b(c4655vM14667a, function14, null);
                            c28655q2.m87172p0(objM87133R13);
                        } else {
                            function14 = function10;
                            objM87133R13 = new b(c4655vM14667a, function14, null);
                            c28655q2.m87172p0(objM87133R13);
                        }
                        AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                        AbstractC28669t1 abstractC28669t1M53351e2 = AbstractC18486c.m53351e();
                        zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                        objM87133R14 = c28655q2.m87133R();
                        if (zM87157i8) {
                            objM87133R14 = new c(c4656v0M14712i);
                            c28655q2.m87172p0(objM87133R14);
                        } else {
                            objM87133R14 = new c(c4656v0M14712i);
                            c28655q2.m87172p0(objM87133R14);
                        }
                        final C40626i c40626i3 = c40626i;
                        final C4656v0 c4656v3 = c4656v0M14712i;
                        final C15199y3 c15199y8 = c15199y4;
                        AbstractC28683x.m87247a(abstractC28669t1M53351e2.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4610c1.m14360s(z4, c40626i3, c4656v3, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y8, c15199y7, z37, z55, modifier7, interfaceC28601c2, modifier8, (Composer) obj, iIntValue);
                            }
                        }), c28655q2, 56);
                        function7 = function13;
                        c4656v1 = c4656v0M14712i;
                        function9 = function14;
                        function8 = function12;
                        c28655q = c28655q2;
                        z26 = z34;
                        z24 = z38;
                        z27 = z37;
                        modifier4 = modifier7;
                        modifier3 = modifier8;
                        z19 = z611;
                        interfaceC4353o3 = interfaceC4353o7;
                        z25 = z29;
                        interfaceC4339a3 = interfaceC4339a4;
                    } else {
                        c28655q3.m87138X();
                        function7 = function1;
                        z19 = z13;
                        l12 = l7;
                        modifier3 = modifier2;
                        z24 = z17;
                        c4656v1 = c4656v0;
                        interfaceC4339a3 = interfaceC4339a2;
                        c28655q = c28655q3;
                        function8 = function5;
                        function9 = function6;
                        interfaceC4353o3 = interfaceC4353o2;
                        z25 = z14;
                        z26 = z15;
                        z27 = z16;
                        modifier4 = modifier;
                    }
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                            @Override // c93.InterfaceC4351m
                            public final Object invoke(Object obj, Object obj2) {
                                int iIntValue = ((Integer) obj2).intValue();
                                return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                            }
                        };
                    }
                }
                i16 |= 24576;
                function5 = function2;
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a2)) {
                            i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 64;
                i34 = 524288;
                if (i29 != 0) {
                    i16 |= 1572864;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87157i(function6)) {
                            i35 = 1048576;
                        } else {
                            i35 = 524288;
                        }
                        i16 |= i35;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q3.m87155h(z4)) {
                        i76 = 8388608;
                    } else {
                        i76 = 4194304;
                    }
                    i16 |= i76;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
                }
                i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i38 != 0) {
                    i39 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q3.m87153g(l7)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i14 | i44;
                } else {
                    i39 = i14;
                }
                i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i45 != 0) {
                    i39 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (c28655q3.m87155h(z15)) {
                        i46 = 32;
                    } else {
                        i46 = 16;
                    }
                    i39 |= i46;
                }
                i47 = i39;
                i48 = i15 & 4096;
                if (i48 != 0) {
                    i54 = i47 | 384;
                } else {
                    i49 = i47;
                    if ((i14 & 384) != 0) {
                        if (c28655q3.m87155h(z16)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i14 & 3072) == 0) {
                        if (c28655q3.m87153g(modifier)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i58 = i57 | i18;
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i59 != 0) {
                    i65 = i58 | 24576;
                } else {
                    i64 = i58;
                    if ((i14 & 24576) == 0) {
                        if (c28655q3.m87153g(modifier2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i65 = i64 | i25;
                    } else {
                        i65 = i64;
                    }
                }
                i66 = i15 & 32768;
                if (i66 != 0) {
                    i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z17)) {
                        i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i67 = 65536;
                    }
                    i65 |= i67;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                        i34 = 1048576;
                    }
                    i65 |= i34;
                }
                if ((i16 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q3.m87135U(i16 & 1, z18)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    } else {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    }
                    c28655q3.m87175r();
                    InterfaceC28601c1 interfaceC28601c1M87260n2 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                    chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                    zM102033r = screenArgs.m102033r();
                    z39 = z28;
                    if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n2), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                    z45 = z44;
                    if (zM102033r) {
                        z46 = false;
                    } else {
                        z46 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    if (zM102033r) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                    interfaceC4353o4 = interfaceC4353o2;
                    c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                    function10 = function6;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                        c28655q2 = c28655q3;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    final InterfaceC28601c1 interfaceC28601c3 = (InterfaceC28601c1) objM87133R2;
                    function11 = function5;
                    Object[] objArr2 = new Object[0];
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4387a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr2, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                    interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                    Boolean boolValueOf10 = Boolean.valueOf(z29);
                    i69 = i68;
                    String strM131759c4 = c40626iM131824b.getConversation().getFingerprint();
                    i74 = (i69 & 1879048192) ^ 805306368;
                    l14 = l13;
                    if (i74 > 536870912) {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    } else {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    }
                    zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(boolValueOf10, strM131759c4, (InterfaceC4351m) objM87133R4, c28655q2);
                    Boolean boolValueOf11 = Boolean.valueOf(z39);
                    String strM131759c5 = c40626iM131824b.getConversation().getFingerprint();
                    if ((i69 & 234881024) == 67108864) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zM87153g4 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                    if (chatEntrypointExperienceM102020e == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                    }
                    zM87149e = zM87153g4 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87149e) {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(boolValueOf11, strM131759c5, (InterfaceC4351m) objM87133R5, c28655q2);
                    if (c15199y3M3460c.m43224e()) {
                        z52 = true;
                    } else {
                        z52 = true;
                    }
                    boolean zM87157i13 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                    if ((i69 & 112) == 32) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    zM87157i2 = zM87157i13 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i2) {
                        boolean z612 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z612, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z612;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        boolean z613 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z613, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z613;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                    zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                    Boolean boolValueOf12 = Boolean.valueOf(z34);
                    if ((i65 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf12);
                    Boolean boolValueOf13 = Boolean.valueOf(z29);
                    if (i75 <= 536870912) {
                    }
                    if ((i65 & 14) == 4) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i5) {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87254h(boolValueOf13, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                    String strM102021f3 = screenArgs.getFingerprint();
                    zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i6) {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f3);
                    strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                    C26805g c26805gM131757a3 = c40626i.getConversation().getBetaTagViewState();
                    boolean z614 = z49;
                    if ((i69 & 896) == 256) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean zM87157i14 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                    if ((458752 & i69) == 131072) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    zM87157i7 = zM87157i14 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i7) {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a3);
                    Boolean boolValueOf14 = Boolean.valueOf(z45);
                    if ((i69 & 7168) == 2048) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    boolean zM87155h3 = z60 | c28655q2.m87155h(z45);
                    InterfaceC4353o interfaceC4353o8 = interfaceC4353o5;
                    final C15199y3 c15199y9 = c15199y3;
                    if ((i69 & 57344) == 16384) {
                        z64 = true;
                    } else {
                        z64 = false;
                    }
                    z65 = z64 | zM87155h3;
                    objM87133R12 = c28655q2.m87133R();
                    if (z65) {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf14);
                    if (c40626i.getHasContentPrefetched()) {
                        c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                    } else {
                        c4655vM14667a = null;
                    }
                    zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g) {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                    AbstractC28669t1 abstractC28669t1M53351e3 = AbstractC18486c.m53351e();
                    zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i8) {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final C40626i c40626i4 = c40626i;
                    final C4656v0 c4656v4 = c4656v0M14712i;
                    final C15199y3 c15199y10 = c15199y4;
                    AbstractC28683x.m87247a(abstractC28669t1M53351e3.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14360s(z4, c40626i4, c4656v4, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y10, c15199y9, z37, z55, modifier7, interfaceC28601c3, modifier8, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    function7 = function13;
                    c4656v1 = c4656v0M14712i;
                    function9 = function14;
                    function8 = function12;
                    c28655q = c28655q2;
                    z26 = z34;
                    z24 = z38;
                    z27 = z37;
                    modifier4 = modifier7;
                    modifier3 = modifier8;
                    z19 = z614;
                    interfaceC4353o3 = interfaceC4353o8;
                    z25 = z29;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q3.m87138X();
                    function7 = function1;
                    z19 = z13;
                    l12 = l7;
                    modifier3 = modifier2;
                    z24 = z17;
                    c4656v1 = c4656v0;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q3;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4353o3 = interfaceC4353o2;
                    z25 = z14;
                    z26 = z15;
                    z27 = z16;
                    modifier4 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 3072;
            function4 = function1;
            i24 = i15 & 16;
            i25 = DfuBaseService.ERROR_REMOTE_MASK;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function5 = function2;
                    if (c28655q3.m87157i(function5)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a2)) {
                            i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 64;
                i34 = 524288;
                if (i29 != 0) {
                    i16 |= 1572864;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87157i(function6)) {
                            i35 = 1048576;
                        } else {
                            i35 = 524288;
                        }
                        i16 |= i35;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q3.m87155h(z4)) {
                        i76 = 8388608;
                    } else {
                        i76 = 4194304;
                    }
                    i16 |= i76;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
                }
                i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i38 != 0) {
                    i39 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q3.m87153g(l7)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i14 | i44;
                } else {
                    i39 = i14;
                }
                i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i45 != 0) {
                    i39 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (c28655q3.m87155h(z15)) {
                        i46 = 32;
                    } else {
                        i46 = 16;
                    }
                    i39 |= i46;
                }
                i47 = i39;
                i48 = i15 & 4096;
                if (i48 != 0) {
                    i54 = i47 | 384;
                } else {
                    i49 = i47;
                    if ((i14 & 384) != 0) {
                        if (c28655q3.m87155h(z16)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i14 & 3072) == 0) {
                        if (c28655q3.m87153g(modifier)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i58 = i57 | i18;
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i59 != 0) {
                    i65 = i58 | 24576;
                } else {
                    i64 = i58;
                    if ((i14 & 24576) == 0) {
                        if (c28655q3.m87153g(modifier2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i65 = i64 | i25;
                    } else {
                        i65 = i64;
                    }
                }
                i66 = i15 & 32768;
                if (i66 != 0) {
                    i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z17)) {
                        i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i67 = 65536;
                    }
                    i65 |= i67;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                        i34 = 1048576;
                    }
                    i65 |= i34;
                }
                if ((i16 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q3.m87135U(i16 & 1, z18)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    } else {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    }
                    c28655q3.m87175r();
                    InterfaceC28601c1 interfaceC28601c1M87260n3 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                    chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                    zM102033r = screenArgs.m102033r();
                    z39 = z28;
                    if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n3), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                    z45 = z44;
                    if (zM102033r) {
                        z46 = false;
                    } else {
                        z46 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    if (zM102033r) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                    interfaceC4353o4 = interfaceC4353o2;
                    c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                    function10 = function6;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                        c28655q2 = c28655q3;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    final InterfaceC28601c1 interfaceC28601c4 = (InterfaceC28601c1) objM87133R2;
                    function11 = function5;
                    Object[] objArr3 = new Object[0];
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4387a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr3, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                    interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                    Boolean boolValueOf15 = Boolean.valueOf(z29);
                    i69 = i68;
                    String strM131759c6 = c40626iM131824b.getConversation().getFingerprint();
                    i74 = (i69 & 1879048192) ^ 805306368;
                    l14 = l13;
                    if (i74 > 536870912) {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    } else {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    }
                    zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(boolValueOf15, strM131759c6, (InterfaceC4351m) objM87133R4, c28655q2);
                    Boolean boolValueOf16 = Boolean.valueOf(z39);
                    String strM131759c7 = c40626iM131824b.getConversation().getFingerprint();
                    if ((i69 & 234881024) == 67108864) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zM87153g5 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                    if (chatEntrypointExperienceM102020e == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                    }
                    zM87149e = zM87153g5 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87149e) {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(boolValueOf16, strM131759c7, (InterfaceC4351m) objM87133R5, c28655q2);
                    if (c15199y3M3460c.m43224e()) {
                        z52 = true;
                    } else {
                        z52 = true;
                    }
                    boolean zM87157i15 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                    if ((i69 & 112) == 32) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    zM87157i2 = zM87157i15 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i2) {
                        boolean z615 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z615, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z615;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        boolean z616 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z616, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z616;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                    zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                    Boolean boolValueOf17 = Boolean.valueOf(z34);
                    if ((i65 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf17);
                    Boolean boolValueOf18 = Boolean.valueOf(z29);
                    if (i75 <= 536870912) {
                    }
                    if ((i65 & 14) == 4) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i5) {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87254h(boolValueOf18, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                    String strM102021f4 = screenArgs.getFingerprint();
                    zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i6) {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f4);
                    strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                    C26805g c26805gM131757a4 = c40626i.getConversation().getBetaTagViewState();
                    boolean z617 = z49;
                    if ((i69 & 896) == 256) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean zM87157i16 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                    if ((458752 & i69) == 131072) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    zM87157i7 = zM87157i16 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i7) {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a4);
                    Boolean boolValueOf19 = Boolean.valueOf(z45);
                    if ((i69 & 7168) == 2048) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    boolean zM87155h4 = z60 | c28655q2.m87155h(z45);
                    InterfaceC4353o interfaceC4353o9 = interfaceC4353o5;
                    final C15199y3 c15199y11 = c15199y3;
                    if ((i69 & 57344) == 16384) {
                        z64 = true;
                    } else {
                        z64 = false;
                    }
                    z65 = z64 | zM87155h4;
                    objM87133R12 = c28655q2.m87133R();
                    if (z65) {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf19);
                    if (c40626i.getHasContentPrefetched()) {
                        c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                    } else {
                        c4655vM14667a = null;
                    }
                    zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g) {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                    AbstractC28669t1 abstractC28669t1M53351e4 = AbstractC18486c.m53351e();
                    zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i8) {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final C40626i c40626i5 = c40626i;
                    final C4656v0 c4656v5 = c4656v0M14712i;
                    final C15199y3 c15199y12 = c15199y4;
                    AbstractC28683x.m87247a(abstractC28669t1M53351e4.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14360s(z4, c40626i5, c4656v5, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y12, c15199y11, z37, z55, modifier7, interfaceC28601c4, modifier8, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    function7 = function13;
                    c4656v1 = c4656v0M14712i;
                    function9 = function14;
                    function8 = function12;
                    c28655q = c28655q2;
                    z26 = z34;
                    z24 = z38;
                    z27 = z37;
                    modifier4 = modifier7;
                    modifier3 = modifier8;
                    z19 = z617;
                    interfaceC4353o3 = interfaceC4353o9;
                    z25 = z29;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q3.m87138X();
                    function7 = function1;
                    z19 = z13;
                    l12 = l7;
                    modifier3 = modifier2;
                    z24 = z17;
                    c4656v1 = c4656v0;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q3;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4353o3 = interfaceC4353o2;
                    z25 = z14;
                    z26 = z15;
                    z27 = z16;
                    modifier4 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            function5 = function2;
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 64;
            i34 = 524288;
            if (i29 != 0) {
                i16 |= 1572864;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87157i(function6)) {
                        i35 = 1048576;
                    } else {
                        i35 = 524288;
                    }
                    i16 |= i35;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q3.m87155h(z4)) {
                    i76 = 8388608;
                } else {
                    i76 = 4194304;
                }
                i16 |= i76;
            }
            i36 = i15 & 256;
            if (i36 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i37;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i38 != 0) {
                i39 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q3.m87153g(l7)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i14 | i44;
            } else {
                i39 = i14;
            }
            i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i45 != 0) {
                i39 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q3.m87155h(z15)) {
                    i46 = 32;
                } else {
                    i46 = 16;
                }
                i39 |= i46;
            }
            i47 = i39;
            i48 = i15 & 4096;
            if (i48 != 0) {
                i54 = i47 | 384;
            } else {
                i49 = i47;
                if ((i14 & 384) != 0) {
                    if (c28655q3.m87155h(z16)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i14 & 3072) == 0) {
                    if (c28655q3.m87153g(modifier)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i58 = i57 | i18;
                } else {
                    i58 = i57;
                }
            }
            i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i59 != 0) {
                i65 = i58 | 24576;
            } else {
                i64 = i58;
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87153g(modifier2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i65 = i64 | i25;
                } else {
                    i65 = i64;
                }
            }
            i66 = i15 & 32768;
            if (i66 != 0) {
                i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87155h(z17)) {
                    i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i67 = 65536;
                }
                i65 |= i67;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                    i34 = 1048576;
                }
                i65 |= i34;
            }
            if ((i16 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q3.m87135U(i16 & 1, z18)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                } else {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                }
                c28655q3.m87175r();
                InterfaceC28601c1 interfaceC28601c1M87260n4 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                zM102033r = screenArgs.m102033r();
                z39 = z28;
                if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n4), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                z45 = z44;
                if (zM102033r) {
                    z46 = false;
                } else {
                    z46 = false;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                if (zM102033r) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                interfaceC4353o4 = interfaceC4353o2;
                c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                function10 = function6;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                    c28655q2 = c28655q3;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    c28655q2 = c28655q3;
                }
                final InterfaceC28601c1 interfaceC28601c5 = (InterfaceC28601c1) objM87133R2;
                function11 = function5;
                Object[] objArr4 = new Object[0];
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4387a(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr4, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                Boolean boolValueOf110 = Boolean.valueOf(z29);
                i69 = i68;
                String strM131759c8 = c40626iM131824b.getConversation().getFingerprint();
                i74 = (i69 & 1879048192) ^ 805306368;
                l14 = l13;
                if (i74 > 536870912) {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                } else {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                }
                zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(boolValueOf110, strM131759c8, (InterfaceC4351m) objM87133R4, c28655q2);
                Boolean boolValueOf111 = Boolean.valueOf(z39);
                String strM131759c9 = c40626iM131824b.getConversation().getFingerprint();
                if ((i69 & 234881024) == 67108864) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zM87153g6 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                if (chatEntrypointExperienceM102020e == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                }
                zM87149e = zM87153g6 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                objM87133R5 = c28655q2.m87133R();
                if (zM87149e) {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(boolValueOf111, strM131759c9, (InterfaceC4351m) objM87133R5, c28655q2);
                if (c15199y3M3460c.m43224e()) {
                    z52 = true;
                } else {
                    z52 = true;
                }
                boolean zM87157i17 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                if ((i69 & 112) == 32) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                zM87157i2 = zM87157i17 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    boolean z618 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z618, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z618;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    boolean z619 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z619, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z619;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                Boolean boolValueOf112 = Boolean.valueOf(z34);
                if ((i65 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf112);
                Boolean boolValueOf113 = Boolean.valueOf(z29);
                if (i75 <= 536870912) {
                }
                if ((i65 & 14) == 4) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i5) {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87254h(boolValueOf113, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                String strM102021f5 = screenArgs.getFingerprint();
                zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i6) {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f5);
                strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                C26805g c26805gM131757a5 = c40626i.getConversation().getBetaTagViewState();
                boolean z6110 = z49;
                if ((i69 & 896) == 256) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean zM87157i18 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                if ((458752 & i69) == 131072) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                zM87157i7 = zM87157i18 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i7) {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a5);
                Boolean boolValueOf114 = Boolean.valueOf(z45);
                if ((i69 & 7168) == 2048) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                boolean zM87155h5 = z60 | c28655q2.m87155h(z45);
                InterfaceC4353o interfaceC4353o10 = interfaceC4353o5;
                final C15199y3 c15199y13 = c15199y3;
                if ((i69 & 57344) == 16384) {
                    z64 = true;
                } else {
                    z64 = false;
                }
                z65 = z64 | zM87155h5;
                objM87133R12 = c28655q2.m87133R();
                if (z65) {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf114);
                if (c40626i.getHasContentPrefetched()) {
                    c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                } else {
                    c4655vM14667a = null;
                }
                zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g) {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                AbstractC28669t1 abstractC28669t1M53351e5 = AbstractC18486c.m53351e();
                zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i8) {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                }
                final C40626i c40626i6 = c40626i;
                final C4656v0 c4656v6 = c4656v0M14712i;
                final C15199y3 c15199y14 = c15199y4;
                AbstractC28683x.m87247a(abstractC28669t1M53351e5.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14360s(z4, c40626i6, c4656v6, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y14, c15199y13, z37, z55, modifier7, interfaceC28601c5, modifier8, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                function7 = function13;
                c4656v1 = c4656v0M14712i;
                function9 = function14;
                function8 = function12;
                c28655q = c28655q2;
                z26 = z34;
                z24 = z38;
                z27 = z37;
                modifier4 = modifier7;
                modifier3 = modifier8;
                z19 = z6110;
                interfaceC4353o3 = interfaceC4353o10;
                z25 = z29;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q3.m87138X();
                function7 = function1;
                z19 = z13;
                l12 = l7;
                modifier3 = modifier2;
                z24 = z17;
                c4656v1 = c4656v0;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q3;
                function8 = function5;
                function9 = function6;
                interfaceC4353o3 = interfaceC4353o2;
                z25 = z14;
                z26 = z15;
                z27 = z16;
                modifier4 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 384;
        interfaceC4353o2 = interfaceC4353o;
        i17 = i15 & 8;
        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i17 != 0) {
            if ((i13 & 3072) == 0) {
                function4 = function1;
                if (c28655q3.m87157i(function4)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = 1024;
                }
                i16 |= i19;
            }
            i24 = i15 & 16;
            i25 = DfuBaseService.ERROR_REMOTE_MASK;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    function5 = function2;
                    if (c28655q3.m87157i(function5)) {
                        i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i26 = 8192;
                    }
                    i16 |= i26;
                }
                i27 = i15 & 32;
                if (i27 != 0) {
                    i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                    interfaceC4339a2 = interfaceC4339a;
                } else {
                    interfaceC4339a2 = interfaceC4339a;
                    if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                        if (c28655q3.m87157i(interfaceC4339a2)) {
                            i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                        } else {
                            i28 = 65536;
                        }
                        i16 |= i28;
                    }
                }
                i29 = i15 & 64;
                i34 = 524288;
                if (i29 != 0) {
                    i16 |= 1572864;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i13 & 1572864) == 0) {
                        if (c28655q3.m87157i(function6)) {
                            i35 = 1048576;
                        } else {
                            i35 = 524288;
                        }
                        i16 |= i35;
                    }
                }
                if ((i13 & 12582912) == 0) {
                    if (c28655q3.m87155h(z4)) {
                        i76 = 8388608;
                    } else {
                        i76 = 4194304;
                    }
                    i16 |= i76;
                }
                i36 = i15 & 256;
                if (i36 != 0) {
                    i16 |= 100663296;
                } else if ((i13 & 100663296) == 0) {
                    if (c28655q3.m87155h(z13)) {
                        i37 = 67108864;
                    } else {
                        i37 = AndroidSDKConstants.FLAG_MUTABLE;
                    }
                    i16 |= i37;
                }
                if ((i13 & 805306368) != 0) {
                    i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
                }
                i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                if (i38 != 0) {
                    i39 = i14 | 6;
                } else if ((i14 & 6) == 0) {
                    if (c28655q3.m87153g(l7)) {
                        i44 = 4;
                    } else {
                        i44 = 2;
                    }
                    i39 = i14 | i44;
                } else {
                    i39 = i14;
                }
                i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                if (i45 != 0) {
                    i39 |= 48;
                } else if ((i14 & 48) != 0) {
                    if (c28655q3.m87155h(z15)) {
                        i46 = 32;
                    } else {
                        i46 = 16;
                    }
                    i39 |= i46;
                }
                i47 = i39;
                i48 = i15 & 4096;
                if (i48 != 0) {
                    i54 = i47 | 384;
                } else {
                    i49 = i47;
                    if ((i14 & 384) != 0) {
                        if (c28655q3.m87155h(z16)) {
                            i55 = 256;
                        } else {
                            i55 = 128;
                        }
                        i49 |= i55;
                    }
                    i54 = i49;
                }
                i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
                if (i56 != 0) {
                    i58 = i54 | 3072;
                } else {
                    i57 = i54;
                    if ((i14 & 3072) == 0) {
                        if (c28655q3.m87153g(modifier)) {
                            i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        }
                        i58 = i57 | i18;
                    } else {
                        i58 = i57;
                    }
                }
                i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
                if (i59 != 0) {
                    i65 = i58 | 24576;
                } else {
                    i64 = i58;
                    if ((i14 & 24576) == 0) {
                        if (c28655q3.m87153g(modifier2)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        }
                        i65 = i64 | i25;
                    } else {
                        i65 = i64;
                    }
                }
                i66 = i15 & 32768;
                if (i66 != 0) {
                    i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87155h(z17)) {
                        i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i67 = 65536;
                    }
                    i65 |= i67;
                }
                if ((i14 & 1572864) != 0) {
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                        i34 = 1048576;
                    }
                    i65 |= i34;
                }
                if ((i16 & 306783379) == 306783378) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                if (c28655q3.m87135U(i16 & 1, z18)) {
                    c28655q3.m87140Z();
                    if ((i13 & 1) != 0) {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    } else {
                        if (i77 != 0) {
                            interfaceC4353o2 = null;
                        }
                        if (i17 != 0) {
                            function4 = null;
                        }
                        if (i24 != 0) {
                            function5 = null;
                        }
                        if (i27 != 0) {
                            interfaceC4339a2 = null;
                        }
                        if (i29 != 0) {
                            function6 = null;
                        }
                        if (i36 != 0) {
                            z28 = false;
                        } else {
                            z28 = z13;
                        }
                        if ((i15 & 512) != 0) {
                            i68 = i16 & (-1879048193);
                            z29 = z28;
                        } else {
                            i68 = i16;
                            z29 = z14;
                        }
                        if (i38 != 0) {
                            l13 = null;
                        } else {
                            l13 = l7;
                        }
                        if (i45 != 0) {
                            z34 = true;
                        } else {
                            z34 = z15;
                        }
                        if (i48 != 0) {
                            z35 = false;
                        } else {
                            z35 = z16;
                        }
                        modifier5 = C2314t.f9131w;
                        if (i56 != 0) {
                            modifier6 = modifier5;
                        } else {
                            modifier6 = modifier;
                        }
                        if (i59 == 0) {
                            modifier5 = modifier2;
                        }
                        if (i66 != 0) {
                            z36 = false;
                        } else {
                            z36 = z17;
                        }
                        if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                            interfaceC30057d = null;
                            c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                            i65 &= -3670017;
                        } else {
                            interfaceC30057d = null;
                            c4656v0M14712i = c4656v0;
                        }
                        interfaceC4339a4 = interfaceC4339a2;
                        modifier7 = modifier6;
                        z37 = z35;
                        modifier8 = modifier5;
                        z38 = z36;
                    }
                    c28655q3.m87175r();
                    InterfaceC28601c1 interfaceC28601c1M87260n5 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                    chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                    zM102033r = screenArgs.m102033r();
                    z39 = z28;
                    if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                        z44 = true;
                    } else {
                        z44 = false;
                    }
                    c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n5), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                    z45 = z44;
                    if (zM102033r) {
                        z46 = false;
                    } else {
                        z46 = false;
                    }
                    objM87133R = c28655q3.m87133R();
                    c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = AbstractC28683x.m87262p(c28655q3);
                        c28655q3.m87172p0(objM87133R);
                    }
                    interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                    if (zM102033r) {
                        enumC15209z3 = EnumC15209z3.f57107x;
                    } else {
                        enumC15209z3 = EnumC15209z3.f57106w;
                    }
                    c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                    interfaceC4353o4 = interfaceC4353o2;
                    c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                    function10 = function6;
                    objM87133R2 = c28655q3.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                        c28655q2 = c28655q3;
                        c28655q2.m87172p0(objM87133R2);
                    } else {
                        c28655q2 = c28655q3;
                    }
                    final InterfaceC28601c1 interfaceC28601c6 = (InterfaceC28601c1) objM87133R2;
                    function11 = function5;
                    Object[] objArr5 = new Object[0];
                    objM87133R3 = c28655q2.m87133R();
                    if (objM87133R3 == c28676v0) {
                        objM87133R3 = new C4387a(10);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr5, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                    interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                    Boolean boolValueOf115 = Boolean.valueOf(z29);
                    i69 = i68;
                    String strM131759c10 = c40626iM131824b.getConversation().getFingerprint();
                    i74 = (i69 & 1879048192) ^ 805306368;
                    l14 = l13;
                    if (i74 > 536870912) {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    } else {
                        i75 = i74;
                        if ((i69 & 805306368) != 536870912) {
                            z47 = true;
                        } else {
                            z47 = false;
                        }
                    }
                    zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                    objM87133R4 = c28655q2.m87133R();
                    if (zM87157i) {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    } else {
                        objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                        c28655q2.m87172p0(objM87133R4);
                    }
                    AbstractC28683x.m87254h(boolValueOf115, strM131759c10, (InterfaceC4351m) objM87133R4, c28655q2);
                    Boolean boolValueOf116 = Boolean.valueOf(z39);
                    String strM131759c11 = c40626iM131824b.getConversation().getFingerprint();
                    if ((i69 & 234881024) == 67108864) {
                        z48 = true;
                    } else {
                        z48 = false;
                    }
                    boolean zM87153g7 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                    if (chatEntrypointExperienceM102020e == null) {
                        iOrdinal = -1;
                    } else {
                        iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                    }
                    zM87149e = zM87153g7 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R5 = c28655q2.m87133R();
                    if (zM87149e) {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    } else {
                        objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                        z49 = z39;
                        c40626i = c40626iM131824b;
                        c28655q2.m87172p0(objM87133R5);
                    }
                    AbstractC28683x.m87254h(boolValueOf116, strM131759c11, (InterfaceC4351m) objM87133R5, c28655q2);
                    if (c15199y3M3460c.m43224e()) {
                        z52 = true;
                    } else {
                        z52 = true;
                    }
                    boolean zM87157i19 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                    if ((i69 & 112) == 32) {
                        z54 = true;
                    } else {
                        z54 = false;
                    }
                    zM87157i2 = zM87157i19 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                    objM87133R6 = c28655q2.m87133R();
                    if (zM87157i2) {
                        boolean z6111 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6111, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z6111;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    } else {
                        boolean z6112 = z46;
                        objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6112, onBackPressed, c15199y3M3460c2);
                        c15199y3 = c15199y3M3460c;
                        z55 = z6112;
                        c15199y4 = c15199y3M3460c2;
                        c28655q2.m87172p0(objM87133R6);
                    }
                    AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                    zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                    objM87133R7 = c28655q2.m87133R();
                    if (zM87157i3) {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    } else {
                        objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                        c28655q2.m87172p0(objM87133R7);
                    }
                    AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                    Boolean boolValueOf117 = Boolean.valueOf(z34);
                    if ((i65 & 112) == 32) {
                        z56 = true;
                    } else {
                        z56 = false;
                    }
                    zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                    objM87133R8 = c28655q2.m87133R();
                    if (zM87157i4) {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    } else {
                        objM87133R8 = new j(z34, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R8);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf117);
                    Boolean boolValueOf118 = Boolean.valueOf(z29);
                    if (i75 <= 536870912) {
                    }
                    if ((i65 & 14) == 4) {
                        z57 = true;
                    } else {
                        z57 = false;
                    }
                    zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                    objM87133R9 = c28655q2.m87133R();
                    if (zM87157i5) {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    } else {
                        l12 = l14;
                        objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                        c28655q2.m87172p0(objM87133R9);
                    }
                    AbstractC28683x.m87254h(boolValueOf118, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                    String strM102021f6 = screenArgs.getFingerprint();
                    zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                    objM87133R10 = c28655q2.m87133R();
                    if (zM87157i6) {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    } else {
                        objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                        c28655q2.m87172p0(objM87133R10);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f6);
                    strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                    C26805g c26805gM131757a6 = c40626i.getConversation().getBetaTagViewState();
                    boolean z6113 = z49;
                    if ((i69 & 896) == 256) {
                        z58 = true;
                    } else {
                        z58 = false;
                    }
                    boolean zM87157i110 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                    if ((458752 & i69) == 131072) {
                        z59 = true;
                    } else {
                        z59 = false;
                    }
                    zM87157i7 = zM87157i110 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                    objM87133R11 = c28655q2.m87133R();
                    if (zM87157i7) {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    } else {
                        objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                        interfaceC4353o5 = interfaceC4353o4;
                        c28655q2.m87172p0(objM87133R11);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a6);
                    Boolean boolValueOf119 = Boolean.valueOf(z45);
                    if ((i69 & 7168) == 2048) {
                        z60 = true;
                    } else {
                        z60 = false;
                    }
                    boolean zM87155h6 = z60 | c28655q2.m87155h(z45);
                    InterfaceC4353o interfaceC4353o11 = interfaceC4353o5;
                    final C15199y3 c15199y15 = c15199y3;
                    if ((i69 & 57344) == 16384) {
                        z64 = true;
                    } else {
                        z64 = false;
                    }
                    z65 = z64 | zM87155h6;
                    objM87133R12 = c28655q2.m87133R();
                    if (z65) {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    } else {
                        function12 = function11;
                        function13 = function4;
                        objM87133R12 = new n(function13, z45, function12, null);
                        c28655q2.m87172p0(objM87133R12);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf119);
                    if (c40626i.getHasContentPrefetched()) {
                        c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                    } else {
                        c4655vM14667a = null;
                    }
                    zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                    objM87133R13 = c28655q2.m87133R();
                    if (zM87153g) {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    } else {
                        function14 = function10;
                        objM87133R13 = new b(c4655vM14667a, function14, null);
                        c28655q2.m87172p0(objM87133R13);
                    }
                    AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                    AbstractC28669t1 abstractC28669t1M53351e6 = AbstractC18486c.m53351e();
                    zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                    objM87133R14 = c28655q2.m87133R();
                    if (zM87157i8) {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    } else {
                        objM87133R14 = new c(c4656v0M14712i);
                        c28655q2.m87172p0(objM87133R14);
                    }
                    final C40626i c40626i7 = c40626i;
                    final C4656v0 c4656v7 = c4656v0M14712i;
                    final C15199y3 c15199y16 = c15199y4;
                    AbstractC28683x.m87247a(abstractC28669t1M53351e6.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14360s(z4, c40626i7, c4656v7, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y16, c15199y15, z37, z55, modifier7, interfaceC28601c6, modifier8, (Composer) obj, iIntValue);
                        }
                    }), c28655q2, 56);
                    function7 = function13;
                    c4656v1 = c4656v0M14712i;
                    function9 = function14;
                    function8 = function12;
                    c28655q = c28655q2;
                    z26 = z34;
                    z24 = z38;
                    z27 = z37;
                    modifier4 = modifier7;
                    modifier3 = modifier8;
                    z19 = z6113;
                    interfaceC4353o3 = interfaceC4353o11;
                    z25 = z29;
                    interfaceC4339a3 = interfaceC4339a4;
                } else {
                    c28655q3.m87138X();
                    function7 = function1;
                    z19 = z13;
                    l12 = l7;
                    modifier3 = modifier2;
                    z24 = z17;
                    c4656v1 = c4656v0;
                    interfaceC4339a3 = interfaceC4339a2;
                    c28655q = c28655q3;
                    function8 = function5;
                    function9 = function6;
                    interfaceC4353o3 = interfaceC4353o2;
                    z25 = z14;
                    z26 = z15;
                    z27 = z16;
                    modifier4 = modifier;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                        @Override // c93.InterfaceC4351m
                        public final Object invoke(Object obj, Object obj2) {
                            int iIntValue = ((Integer) obj2).intValue();
                            return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                        }
                    };
                }
            }
            i16 |= 24576;
            function5 = function2;
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 64;
            i34 = 524288;
            if (i29 != 0) {
                i16 |= 1572864;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87157i(function6)) {
                        i35 = 1048576;
                    } else {
                        i35 = 524288;
                    }
                    i16 |= i35;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q3.m87155h(z4)) {
                    i76 = 8388608;
                } else {
                    i76 = 4194304;
                }
                i16 |= i76;
            }
            i36 = i15 & 256;
            if (i36 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i37;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i38 != 0) {
                i39 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q3.m87153g(l7)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i14 | i44;
            } else {
                i39 = i14;
            }
            i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i45 != 0) {
                i39 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q3.m87155h(z15)) {
                    i46 = 32;
                } else {
                    i46 = 16;
                }
                i39 |= i46;
            }
            i47 = i39;
            i48 = i15 & 4096;
            if (i48 != 0) {
                i54 = i47 | 384;
            } else {
                i49 = i47;
                if ((i14 & 384) != 0) {
                    if (c28655q3.m87155h(z16)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i14 & 3072) == 0) {
                    if (c28655q3.m87153g(modifier)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i58 = i57 | i18;
                } else {
                    i58 = i57;
                }
            }
            i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i59 != 0) {
                i65 = i58 | 24576;
            } else {
                i64 = i58;
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87153g(modifier2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i65 = i64 | i25;
                } else {
                    i65 = i64;
                }
            }
            i66 = i15 & 32768;
            if (i66 != 0) {
                i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87155h(z17)) {
                    i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i67 = 65536;
                }
                i65 |= i67;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                    i34 = 1048576;
                }
                i65 |= i34;
            }
            if ((i16 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q3.m87135U(i16 & 1, z18)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                } else {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                }
                c28655q3.m87175r();
                InterfaceC28601c1 interfaceC28601c1M87260n6 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                zM102033r = screenArgs.m102033r();
                z39 = z28;
                if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n6), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                z45 = z44;
                if (zM102033r) {
                    z46 = false;
                } else {
                    z46 = false;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                if (zM102033r) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                interfaceC4353o4 = interfaceC4353o2;
                c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                function10 = function6;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                    c28655q2 = c28655q3;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    c28655q2 = c28655q3;
                }
                final InterfaceC28601c1 interfaceC28601c7 = (InterfaceC28601c1) objM87133R2;
                function11 = function5;
                Object[] objArr6 = new Object[0];
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4387a(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr6, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                Boolean boolValueOf1110 = Boolean.valueOf(z29);
                i69 = i68;
                String strM131759c12 = c40626iM131824b.getConversation().getFingerprint();
                i74 = (i69 & 1879048192) ^ 805306368;
                l14 = l13;
                if (i74 > 536870912) {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                } else {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                }
                zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(boolValueOf1110, strM131759c12, (InterfaceC4351m) objM87133R4, c28655q2);
                Boolean boolValueOf1111 = Boolean.valueOf(z39);
                String strM131759c13 = c40626iM131824b.getConversation().getFingerprint();
                if ((i69 & 234881024) == 67108864) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zM87153g8 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                if (chatEntrypointExperienceM102020e == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                }
                zM87149e = zM87153g8 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                objM87133R5 = c28655q2.m87133R();
                if (zM87149e) {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(boolValueOf1111, strM131759c13, (InterfaceC4351m) objM87133R5, c28655q2);
                if (c15199y3M3460c.m43224e()) {
                    z52 = true;
                } else {
                    z52 = true;
                }
                boolean zM87157i111 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                if ((i69 & 112) == 32) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                zM87157i2 = zM87157i111 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    boolean z6114 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6114, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z6114;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    boolean z6115 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6115, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z6115;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                Boolean boolValueOf1112 = Boolean.valueOf(z34);
                if ((i65 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf1112);
                Boolean boolValueOf1113 = Boolean.valueOf(z29);
                if (i75 <= 536870912) {
                }
                if ((i65 & 14) == 4) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i5) {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87254h(boolValueOf1113, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                String strM102021f7 = screenArgs.getFingerprint();
                zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i6) {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f7);
                strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                C26805g c26805gM131757a7 = c40626i.getConversation().getBetaTagViewState();
                boolean z6116 = z49;
                if ((i69 & 896) == 256) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean zM87157i112 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                if ((458752 & i69) == 131072) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                zM87157i7 = zM87157i112 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i7) {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a7);
                Boolean boolValueOf1114 = Boolean.valueOf(z45);
                if ((i69 & 7168) == 2048) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                boolean zM87155h7 = z60 | c28655q2.m87155h(z45);
                InterfaceC4353o interfaceC4353o12 = interfaceC4353o5;
                final C15199y3 c15199y17 = c15199y3;
                if ((i69 & 57344) == 16384) {
                    z64 = true;
                } else {
                    z64 = false;
                }
                z65 = z64 | zM87155h7;
                objM87133R12 = c28655q2.m87133R();
                if (z65) {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf1114);
                if (c40626i.getHasContentPrefetched()) {
                    c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                } else {
                    c4655vM14667a = null;
                }
                zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g) {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                AbstractC28669t1 abstractC28669t1M53351e7 = AbstractC18486c.m53351e();
                zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i8) {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                }
                final C40626i c40626i8 = c40626i;
                final C4656v0 c4656v8 = c4656v0M14712i;
                final C15199y3 c15199y18 = c15199y4;
                AbstractC28683x.m87247a(abstractC28669t1M53351e7.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14360s(z4, c40626i8, c4656v8, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y18, c15199y17, z37, z55, modifier7, interfaceC28601c7, modifier8, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                function7 = function13;
                c4656v1 = c4656v0M14712i;
                function9 = function14;
                function8 = function12;
                c28655q = c28655q2;
                z26 = z34;
                z24 = z38;
                z27 = z37;
                modifier4 = modifier7;
                modifier3 = modifier8;
                z19 = z6116;
                interfaceC4353o3 = interfaceC4353o12;
                z25 = z29;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q3.m87138X();
                function7 = function1;
                z19 = z13;
                l12 = l7;
                modifier3 = modifier2;
                z24 = z17;
                c4656v1 = c4656v0;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q3;
                function8 = function5;
                function9 = function6;
                interfaceC4353o3 = interfaceC4353o2;
                z25 = z14;
                z26 = z15;
                z27 = z16;
                modifier4 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 3072;
        function4 = function1;
        i24 = i15 & 16;
        i25 = DfuBaseService.ERROR_REMOTE_MASK;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                function5 = function2;
                if (c28655q3.m87157i(function5)) {
                    i26 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i26 = 8192;
                }
                i16 |= i26;
            }
            i27 = i15 & 32;
            if (i27 != 0) {
                i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
                interfaceC4339a2 = interfaceC4339a;
            } else {
                interfaceC4339a2 = interfaceC4339a;
                if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                    if (c28655q3.m87157i(interfaceC4339a2)) {
                        i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                    } else {
                        i28 = 65536;
                    }
                    i16 |= i28;
                }
            }
            i29 = i15 & 64;
            i34 = 524288;
            if (i29 != 0) {
                i16 |= 1572864;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i13 & 1572864) == 0) {
                    if (c28655q3.m87157i(function6)) {
                        i35 = 1048576;
                    } else {
                        i35 = 524288;
                    }
                    i16 |= i35;
                }
            }
            if ((i13 & 12582912) == 0) {
                if (c28655q3.m87155h(z4)) {
                    i76 = 8388608;
                } else {
                    i76 = 4194304;
                }
                i16 |= i76;
            }
            i36 = i15 & 256;
            if (i36 != 0) {
                i16 |= 100663296;
            } else if ((i13 & 100663296) == 0) {
                if (c28655q3.m87155h(z13)) {
                    i37 = 67108864;
                } else {
                    i37 = AndroidSDKConstants.FLAG_MUTABLE;
                }
                i16 |= i37;
            }
            if ((i13 & 805306368) != 0) {
                i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
            }
            i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i38 != 0) {
                i39 = i14 | 6;
            } else if ((i14 & 6) == 0) {
                if (c28655q3.m87153g(l7)) {
                    i44 = 4;
                } else {
                    i44 = 2;
                }
                i39 = i14 | i44;
            } else {
                i39 = i14;
            }
            i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
            if (i45 != 0) {
                i39 |= 48;
            } else if ((i14 & 48) != 0) {
                if (c28655q3.m87155h(z15)) {
                    i46 = 32;
                } else {
                    i46 = 16;
                }
                i39 |= i46;
            }
            i47 = i39;
            i48 = i15 & 4096;
            if (i48 != 0) {
                i54 = i47 | 384;
            } else {
                i49 = i47;
                if ((i14 & 384) != 0) {
                    if (c28655q3.m87155h(z16)) {
                        i55 = 256;
                    } else {
                        i55 = 128;
                    }
                    i49 |= i55;
                }
                i54 = i49;
            }
            i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
            if (i56 != 0) {
                i58 = i54 | 3072;
            } else {
                i57 = i54;
                if ((i14 & 3072) == 0) {
                    if (c28655q3.m87153g(modifier)) {
                        i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    }
                    i58 = i57 | i18;
                } else {
                    i58 = i57;
                }
            }
            i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
            if (i59 != 0) {
                i65 = i58 | 24576;
            } else {
                i64 = i58;
                if ((i14 & 24576) == 0) {
                    if (c28655q3.m87153g(modifier2)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    }
                    i65 = i64 | i25;
                } else {
                    i65 = i64;
                }
            }
            i66 = i15 & 32768;
            if (i66 != 0) {
                i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87155h(z17)) {
                    i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i67 = 65536;
                }
                i65 |= i67;
            }
            if ((i14 & 1572864) != 0) {
                if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                    i34 = 1048576;
                }
                i65 |= i34;
            }
            if ((i16 & 306783379) == 306783378) {
                z18 = true;
            } else {
                z18 = true;
            }
            if (c28655q3.m87135U(i16 & 1, z18)) {
                c28655q3.m87140Z();
                if ((i13 & 1) != 0) {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                } else {
                    if (i77 != 0) {
                        interfaceC4353o2 = null;
                    }
                    if (i17 != 0) {
                        function4 = null;
                    }
                    if (i24 != 0) {
                        function5 = null;
                    }
                    if (i27 != 0) {
                        interfaceC4339a2 = null;
                    }
                    if (i29 != 0) {
                        function6 = null;
                    }
                    if (i36 != 0) {
                        z28 = false;
                    } else {
                        z28 = z13;
                    }
                    if ((i15 & 512) != 0) {
                        i68 = i16 & (-1879048193);
                        z29 = z28;
                    } else {
                        i68 = i16;
                        z29 = z14;
                    }
                    if (i38 != 0) {
                        l13 = null;
                    } else {
                        l13 = l7;
                    }
                    if (i45 != 0) {
                        z34 = true;
                    } else {
                        z34 = z15;
                    }
                    if (i48 != 0) {
                        z35 = false;
                    } else {
                        z35 = z16;
                    }
                    modifier5 = C2314t.f9131w;
                    if (i56 != 0) {
                        modifier6 = modifier5;
                    } else {
                        modifier6 = modifier;
                    }
                    if (i59 == 0) {
                        modifier5 = modifier2;
                    }
                    if (i66 != 0) {
                        z36 = false;
                    } else {
                        z36 = z17;
                    }
                    if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                        interfaceC30057d = null;
                        c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                        i65 &= -3670017;
                    } else {
                        interfaceC30057d = null;
                        c4656v0M14712i = c4656v0;
                    }
                    interfaceC4339a4 = interfaceC4339a2;
                    modifier7 = modifier6;
                    z37 = z35;
                    modifier8 = modifier5;
                    z38 = z36;
                }
                c28655q3.m87175r();
                InterfaceC28601c1 interfaceC28601c1M87260n7 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
                chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
                zM102033r = screenArgs.m102033r();
                z39 = z28;
                if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                    z44 = true;
                } else {
                    z44 = false;
                }
                c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n7), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
                z45 = z44;
                if (zM102033r) {
                    z46 = false;
                } else {
                    z46 = false;
                }
                objM87133R = c28655q3.m87133R();
                c28676v0 = C28635l.f115821a;
                if (objM87133R == c28676v0) {
                    objM87133R = AbstractC28683x.m87262p(c28655q3);
                    c28655q3.m87172p0(objM87133R);
                }
                interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
                if (zM102033r) {
                    enumC15209z3 = EnumC15209z3.f57107x;
                } else {
                    enumC15209z3 = EnumC15209z3.f57106w;
                }
                c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
                interfaceC4353o4 = interfaceC4353o2;
                c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
                function10 = function6;
                objM87133R2 = c28655q3.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                    c28655q2 = c28655q3;
                    c28655q2.m87172p0(objM87133R2);
                } else {
                    c28655q2 = c28655q3;
                }
                final InterfaceC28601c1 interfaceC28601c8 = (InterfaceC28601c1) objM87133R2;
                function11 = function5;
                Object[] objArr7 = new Object[0];
                objM87133R3 = c28655q2.m87133R();
                if (objM87133R3 == c28676v0) {
                    objM87133R3 = new C4387a(10);
                    c28655q2.m87172p0(objM87133R3);
                }
                interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr7, (InterfaceC4339a) objM87133R3, c28655q2, 48);
                interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
                Boolean boolValueOf1115 = Boolean.valueOf(z29);
                i69 = i68;
                String strM131759c14 = c40626iM131824b.getConversation().getFingerprint();
                i74 = (i69 & 1879048192) ^ 805306368;
                l14 = l13;
                if (i74 > 536870912) {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                } else {
                    i75 = i74;
                    if ((i69 & 805306368) != 536870912) {
                        z47 = true;
                    } else {
                        z47 = false;
                    }
                }
                zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
                objM87133R4 = c28655q2.m87133R();
                if (zM87157i) {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                } else {
                    objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                    c28655q2.m87172p0(objM87133R4);
                }
                AbstractC28683x.m87254h(boolValueOf1115, strM131759c14, (InterfaceC4351m) objM87133R4, c28655q2);
                Boolean boolValueOf1116 = Boolean.valueOf(z39);
                String strM131759c15 = c40626iM131824b.getConversation().getFingerprint();
                if ((i69 & 234881024) == 67108864) {
                    z48 = true;
                } else {
                    z48 = false;
                }
                boolean zM87153g9 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
                if (chatEntrypointExperienceM102020e == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = chatEntrypointExperienceM102020e.ordinal();
                }
                zM87149e = zM87153g9 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
                objM87133R5 = c28655q2.m87133R();
                if (zM87149e) {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                } else {
                    objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                    z49 = z39;
                    c40626i = c40626iM131824b;
                    c28655q2.m87172p0(objM87133R5);
                }
                AbstractC28683x.m87254h(boolValueOf1116, strM131759c15, (InterfaceC4351m) objM87133R5, c28655q2);
                if (c15199y3M3460c.m43224e()) {
                    z52 = true;
                } else {
                    z52 = true;
                }
                boolean zM87157i113 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
                if ((i69 & 112) == 32) {
                    z54 = true;
                } else {
                    z54 = false;
                }
                zM87157i2 = zM87157i113 | z54 | c28655q2.m87157i(c15199y3M3460c2);
                objM87133R6 = c28655q2.m87133R();
                if (zM87157i2) {
                    boolean z6117 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6117, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z6117;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                } else {
                    boolean z6118 = z46;
                    objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z6118, onBackPressed, c15199y3M3460c2);
                    c15199y3 = c15199y3M3460c;
                    z55 = z6118;
                    c15199y4 = c15199y3M3460c2;
                    c28655q2.m87172p0(objM87133R6);
                }
                AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
                zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
                objM87133R7 = c28655q2.m87133R();
                if (zM87157i3) {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                } else {
                    objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                    c28655q2.m87172p0(objM87133R7);
                }
                AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
                Boolean boolValueOf1117 = Boolean.valueOf(z34);
                if ((i65 & 112) == 32) {
                    z56 = true;
                } else {
                    z56 = false;
                }
                zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
                objM87133R8 = c28655q2.m87133R();
                if (zM87157i4) {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                } else {
                    objM87133R8 = new j(z34, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R8);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf1117);
                Boolean boolValueOf1118 = Boolean.valueOf(z29);
                if (i75 <= 536870912) {
                }
                if ((i65 & 14) == 4) {
                    z57 = true;
                } else {
                    z57 = false;
                }
                zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
                objM87133R9 = c28655q2.m87133R();
                if (zM87157i5) {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                } else {
                    l12 = l14;
                    objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                    c28655q2.m87172p0(objM87133R9);
                }
                AbstractC28683x.m87254h(boolValueOf1118, l12, (InterfaceC4351m) objM87133R9, c28655q2);
                String strM102021f8 = screenArgs.getFingerprint();
                zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
                objM87133R10 = c28655q2.m87133R();
                if (zM87157i6) {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                } else {
                    objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                    c28655q2.m87172p0(objM87133R10);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f8);
                strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
                C26805g c26805gM131757a8 = c40626i.getConversation().getBetaTagViewState();
                boolean z6119 = z49;
                if ((i69 & 896) == 256) {
                    z58 = true;
                } else {
                    z58 = false;
                }
                boolean zM87157i114 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
                if ((458752 & i69) == 131072) {
                    z59 = true;
                } else {
                    z59 = false;
                }
                zM87157i7 = zM87157i114 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
                objM87133R11 = c28655q2.m87133R();
                if (zM87157i7) {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                } else {
                    objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                    interfaceC4353o5 = interfaceC4353o4;
                    c28655q2.m87172p0(objM87133R11);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a8);
                Boolean boolValueOf1119 = Boolean.valueOf(z45);
                if ((i69 & 7168) == 2048) {
                    z60 = true;
                } else {
                    z60 = false;
                }
                boolean zM87155h8 = z60 | c28655q2.m87155h(z45);
                InterfaceC4353o interfaceC4353o13 = interfaceC4353o5;
                final C15199y3 c15199y19 = c15199y3;
                if ((i69 & 57344) == 16384) {
                    z64 = true;
                } else {
                    z64 = false;
                }
                z65 = z64 | zM87155h8;
                objM87133R12 = c28655q2.m87133R();
                if (z65) {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                } else {
                    function12 = function11;
                    function13 = function4;
                    objM87133R12 = new n(function13, z45, function12, null);
                    c28655q2.m87172p0(objM87133R12);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf1119);
                if (c40626i.getHasContentPrefetched()) {
                    c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
                } else {
                    c4655vM14667a = null;
                }
                zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
                objM87133R13 = c28655q2.m87133R();
                if (zM87153g) {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                } else {
                    function14 = function10;
                    objM87133R13 = new b(c4655vM14667a, function14, null);
                    c28655q2.m87172p0(objM87133R13);
                }
                AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
                AbstractC28669t1 abstractC28669t1M53351e8 = AbstractC18486c.m53351e();
                zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
                objM87133R14 = c28655q2.m87133R();
                if (zM87157i8) {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                } else {
                    objM87133R14 = new c(c4656v0M14712i);
                    c28655q2.m87172p0(objM87133R14);
                }
                final C40626i c40626i9 = c40626i;
                final C4656v0 c4656v9 = c4656v0M14712i;
                final C15199y3 c15199y110 = c15199y4;
                AbstractC28683x.m87247a(abstractC28669t1M53351e8.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14360s(z4, c40626i9, c4656v9, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y110, c15199y19, z37, z55, modifier7, interfaceC28601c8, modifier8, (Composer) obj, iIntValue);
                    }
                }), c28655q2, 56);
                function7 = function13;
                c4656v1 = c4656v0M14712i;
                function9 = function14;
                function8 = function12;
                c28655q = c28655q2;
                z26 = z34;
                z24 = z38;
                z27 = z37;
                modifier4 = modifier7;
                modifier3 = modifier8;
                z19 = z6119;
                interfaceC4353o3 = interfaceC4353o13;
                z25 = z29;
                interfaceC4339a3 = interfaceC4339a4;
            } else {
                c28655q3.m87138X();
                function7 = function1;
                z19 = z13;
                l12 = l7;
                modifier3 = modifier2;
                z24 = z17;
                c4656v1 = c4656v0;
                interfaceC4339a3 = interfaceC4339a2;
                c28655q = c28655q3;
                function8 = function5;
                function9 = function6;
                interfaceC4353o3 = interfaceC4353o2;
                z25 = z14;
                z26 = z15;
                z27 = z16;
                modifier4 = modifier;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i16 |= 24576;
        function5 = function2;
        i27 = i15 & 32;
        if (i27 != 0) {
            i16 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
            interfaceC4339a2 = interfaceC4339a;
        } else {
            interfaceC4339a2 = interfaceC4339a;
            if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
                if (c28655q3.m87157i(interfaceC4339a2)) {
                    i28 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                } else {
                    i28 = 65536;
                }
                i16 |= i28;
            }
        }
        i29 = i15 & 64;
        i34 = 524288;
        if (i29 != 0) {
            i16 |= 1572864;
            function6 = function3;
        } else {
            function6 = function3;
            if ((i13 & 1572864) == 0) {
                if (c28655q3.m87157i(function6)) {
                    i35 = 1048576;
                } else {
                    i35 = 524288;
                }
                i16 |= i35;
            }
        }
        if ((i13 & 12582912) == 0) {
            if (c28655q3.m87155h(z4)) {
                i76 = 8388608;
            } else {
                i76 = 4194304;
            }
            i16 |= i76;
        }
        i36 = i15 & 256;
        if (i36 != 0) {
            i16 |= 100663296;
        } else if ((i13 & 100663296) == 0) {
            if (c28655q3.m87155h(z13)) {
                i37 = 67108864;
            } else {
                i37 = AndroidSDKConstants.FLAG_MUTABLE;
            }
            i16 |= i37;
        }
        if ((i13 & 805306368) != 0) {
            i16 |= ((i15 & 512) == 0 || !c28655q3.m87155h(z14)) ? 268435456 : 536870912;
        }
        i38 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i38 != 0) {
            i39 = i14 | 6;
        } else if ((i14 & 6) == 0) {
            if (c28655q3.m87153g(l7)) {
                i44 = 4;
            } else {
                i44 = 2;
            }
            i39 = i14 | i44;
        } else {
            i39 = i14;
        }
        i45 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        if (i45 != 0) {
            i39 |= 48;
        } else if ((i14 & 48) != 0) {
            if (c28655q3.m87155h(z15)) {
                i46 = 32;
            } else {
                i46 = 16;
            }
            i39 |= i46;
        }
        i47 = i39;
        i48 = i15 & 4096;
        if (i48 != 0) {
            i54 = i47 | 384;
        } else {
            i49 = i47;
            if ((i14 & 384) != 0) {
                if (c28655q3.m87155h(z16)) {
                    i55 = 256;
                } else {
                    i55 = 128;
                }
                i49 |= i55;
            }
            i54 = i49;
        }
        i56 = i15 & DfuBaseService.ERROR_REMOTE_MASK;
        if (i56 != 0) {
            i58 = i54 | 3072;
        } else {
            i57 = i54;
            if ((i14 & 3072) == 0) {
                if (c28655q3.m87153g(modifier)) {
                    i18 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                i58 = i57 | i18;
            } else {
                i58 = i57;
            }
        }
        i59 = i15 & DfuBaseService.ERROR_CONNECTION_MASK;
        if (i59 != 0) {
            i65 = i58 | 24576;
        } else {
            i64 = i58;
            if ((i14 & 24576) == 0) {
                if (c28655q3.m87153g(modifier2)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                }
                i65 = i64 | i25;
            } else {
                i65 = i64;
            }
        }
        i66 = i15 & 32768;
        if (i66 != 0) {
            i65 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i14 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            if (c28655q3.m87155h(z17)) {
                i67 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            } else {
                i67 = 65536;
            }
            i65 |= i67;
        }
        if ((i14 & 1572864) != 0) {
            if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 0) {
                i34 = 1048576;
            }
            i65 |= i34;
        }
        if ((i16 & 306783379) == 306783378) {
            z18 = true;
        } else {
            z18 = true;
        }
        if (c28655q3.m87135U(i16 & 1, z18)) {
            c28655q3.m87140Z();
            if ((i13 & 1) != 0) {
                if (i77 != 0) {
                    interfaceC4353o2 = null;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if (i24 != 0) {
                    function5 = null;
                }
                if (i27 != 0) {
                    interfaceC4339a2 = null;
                }
                if (i29 != 0) {
                    function6 = null;
                }
                if (i36 != 0) {
                    z28 = false;
                } else {
                    z28 = z13;
                }
                if ((i15 & 512) != 0) {
                    i68 = i16 & (-1879048193);
                    z29 = z28;
                } else {
                    i68 = i16;
                    z29 = z14;
                }
                if (i38 != 0) {
                    l13 = null;
                } else {
                    l13 = l7;
                }
                if (i45 != 0) {
                    z34 = true;
                } else {
                    z34 = z15;
                }
                if (i48 != 0) {
                    z35 = false;
                } else {
                    z35 = z16;
                }
                modifier5 = C2314t.f9131w;
                if (i56 != 0) {
                    modifier6 = modifier5;
                } else {
                    modifier6 = modifier;
                }
                if (i59 == 0) {
                    modifier5 = modifier2;
                }
                if (i66 != 0) {
                    z36 = false;
                } else {
                    z36 = z17;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                    interfaceC30057d = null;
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                    i65 &= -3670017;
                } else {
                    interfaceC30057d = null;
                    c4656v0M14712i = c4656v0;
                }
                interfaceC4339a4 = interfaceC4339a2;
                modifier7 = modifier6;
                z37 = z35;
                modifier8 = modifier5;
                z38 = z36;
            } else {
                if (i77 != 0) {
                    interfaceC4353o2 = null;
                }
                if (i17 != 0) {
                    function4 = null;
                }
                if (i24 != 0) {
                    function5 = null;
                }
                if (i27 != 0) {
                    interfaceC4339a2 = null;
                }
                if (i29 != 0) {
                    function6 = null;
                }
                if (i36 != 0) {
                    z28 = false;
                } else {
                    z28 = z13;
                }
                if ((i15 & 512) != 0) {
                    i68 = i16 & (-1879048193);
                    z29 = z28;
                } else {
                    i68 = i16;
                    z29 = z14;
                }
                if (i38 != 0) {
                    l13 = null;
                } else {
                    l13 = l7;
                }
                if (i45 != 0) {
                    z34 = true;
                } else {
                    z34 = z15;
                }
                if (i48 != 0) {
                    z35 = false;
                } else {
                    z35 = z16;
                }
                modifier5 = C2314t.f9131w;
                if (i56 != 0) {
                    modifier6 = modifier5;
                } else {
                    modifier6 = modifier;
                }
                if (i59 == 0) {
                    modifier5 = modifier2;
                }
                if (i66 != 0) {
                    z36 = false;
                } else {
                    z36 = z17;
                }
                if ((i15 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0) {
                    interfaceC30057d = null;
                    c4656v0M14712i = AbstractC4658w0.m14712i((Context) c28655q3.m87161k(AndroidCompositionLocals_androidKt.f4976b), screenArgs, c28655q3, (i68 << 3) & 112);
                    i65 &= -3670017;
                } else {
                    interfaceC30057d = null;
                    c4656v0M14712i = c4656v0;
                }
                interfaceC4339a4 = interfaceC4339a2;
                modifier7 = modifier6;
                z37 = z35;
                modifier8 = modifier5;
                z38 = z36;
            }
            c28655q3.m87175r();
            InterfaceC28601c1 interfaceC28601c1M87260n8 = AbstractC28683x.m87260n(c4656v0M14712i.getViewModel().getViewState(), new C40626i(0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, false, false, null, false, false, 16777215, null), null, c28655q3, 0, 2);
            chatEntrypointExperienceM102020e = screenArgs.getEntrypointExperience();
            zM102033r = screenArgs.m102033r();
            z39 = z28;
            if (chatEntrypointExperienceM102020e == ChatEntrypointExperience.FORM_INPUT_ONLY) {
                z44 = true;
            } else {
                z44 = false;
            }
            c40626iM131824b = C40626i.m131824b(m14358q(interfaceC28601c1M87260n8), 0, null, false, false, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, z44, false, null, false, false, 16252927, null);
            z45 = z44;
            if (zM102033r) {
                z46 = false;
            } else {
                z46 = false;
            }
            objM87133R = c28655q3.m87133R();
            c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC28683x.m87262p(c28655q3);
                c28655q3.m87172p0(objM87133R);
            }
            interfaceC2994c0 = (InterfaceC2994c0) objM87133R;
            if (zM102033r) {
                enumC15209z3 = EnumC15209z3.f57107x;
            } else {
                enumC15209z3 = EnumC15209z3.f57106w;
            }
            c15199y3M3460c = AbstractC1118c.m3460c(enumC15209z3, null, null, true, c28655q3, 3072, 6);
            interfaceC4353o4 = interfaceC4353o2;
            c15199y3M3460c2 = AbstractC1118c.m3460c(EnumC15209z3.f57106w, null, null, true, c28655q3, 3078, 6);
            function10 = function6;
            objM87133R2 = c28655q3.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC28683x.m87272z(interfaceC30057d);
                c28655q2 = c28655q3;
                c28655q2.m87172p0(objM87133R2);
            } else {
                c28655q2 = c28655q3;
            }
            final InterfaceC28601c1 interfaceC28601c9 = (InterfaceC28601c1) objM87133R2;
            function11 = function5;
            Object[] objArr8 = new Object[0];
            objM87133R3 = c28655q2.m87133R();
            if (objM87133R3 == c28676v0) {
                objM87133R3 = new C4387a(10);
                c28655q2.m87172p0(objM87133R3);
            }
            interfaceC28601c1 = (InterfaceC28601c1) AbstractC39038k.m124457c(objArr8, (InterfaceC4339a) objM87133R3, c28655q2, 48);
            interfaceC12251g = (InterfaceC12251g) c28655q2.m87161k(AbstractC12252h.m34153c());
            Boolean boolValueOf11110 = Boolean.valueOf(z29);
            i69 = i68;
            String strM131759c16 = c40626iM131824b.getConversation().getFingerprint();
            i74 = (i69 & 1879048192) ^ 805306368;
            l14 = l13;
            if (i74 > 536870912) {
                i75 = i74;
                if ((i69 & 805306368) != 536870912) {
                    z47 = true;
                } else {
                    z47 = false;
                }
            } else {
                i75 = i74;
                if ((i69 & 805306368) != 536870912) {
                    z47 = true;
                } else {
                    z47 = false;
                }
            }
            zM87157i = z47 | c28655q2.m87157i(interfaceC12251g) | c28655q2.m87157i(c40626iM131824b);
            objM87133R4 = c28655q2.m87133R();
            if (zM87157i) {
                objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                c28655q2.m87172p0(objM87133R4);
            } else {
                objM87133R4 = new a(z29, interfaceC12251g, c40626iM131824b, interfaceC30057d);
                c28655q2.m87172p0(objM87133R4);
            }
            AbstractC28683x.m87254h(boolValueOf11110, strM131759c16, (InterfaceC4351m) objM87133R4, c28655q2);
            Boolean boolValueOf11111 = Boolean.valueOf(z39);
            String strM131759c17 = c40626iM131824b.getConversation().getFingerprint();
            if ((i69 & 234881024) == 67108864) {
                z48 = true;
            } else {
                z48 = false;
            }
            boolean zM87153g10 = c28655q2.m87153g(interfaceC28601c1) | z48 | c28655q2.m87157i(c40626iM131824b);
            if (chatEntrypointExperienceM102020e == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = chatEntrypointExperienceM102020e.ordinal();
            }
            zM87149e = zM87153g10 | c28655q2.m87149e(iOrdinal) | c28655q2.m87157i(c4656v0M14712i);
            objM87133R5 = c28655q2.m87133R();
            if (zM87149e) {
                objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                z49 = z39;
                c40626i = c40626iM131824b;
                c28655q2.m87172p0(objM87133R5);
            } else {
                objM87133R5 = new h(z39, c40626iM131824b, chatEntrypointExperienceM102020e, c4656v0M14712i, interfaceC28601c1, null);
                z49 = z39;
                c40626i = c40626iM131824b;
                c28655q2.m87172p0(objM87133R5);
            }
            AbstractC28683x.m87254h(boolValueOf11111, strM131759c17, (InterfaceC4351m) objM87133R5, c28655q2);
            if (c15199y3M3460c.m43224e()) {
                z52 = true;
            } else {
                z52 = true;
            }
            boolean zM87157i115 = c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y3M3460c) | c28655q2.m87155h(z46);
            if ((i69 & 112) == 32) {
                z54 = true;
            } else {
                z54 = false;
            }
            zM87157i2 = zM87157i115 | z54 | c28655q2.m87157i(c15199y3M3460c2);
            objM87133R6 = c28655q2.m87133R();
            if (zM87157i2) {
                boolean z61110 = z46;
                objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z61110, onBackPressed, c15199y3M3460c2);
                c15199y3 = c15199y3M3460c;
                z55 = z61110;
                c15199y4 = c15199y3M3460c2;
                c28655q2.m87172p0(objM87133R6);
            } else {
                boolean z61111 = z46;
                objM87133R6 = new C4660x0(interfaceC2994c0, c15199y3M3460c, z61111, onBackPressed, c15199y3M3460c2);
                c15199y3 = c15199y3M3460c;
                z55 = z61111;
                c15199y4 = c15199y3M3460c2;
                c28655q2.m87172p0(objM87133R6);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R6, z52, c28655q2, 0, 0);
            zM87157i3 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(interfaceC12251g);
            objM87133R7 = c28655q2.m87133R();
            if (zM87157i3) {
                objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                c28655q2.m87172p0(objM87133R7);
            } else {
                objM87133R7 = new C4635l(c4656v0M14712i, interfaceC2994c0, interfaceC12251g, 1);
                c28655q2.m87172p0(objM87133R7);
            }
            AbstractC28683x.m87251e(c4656v0M14712i, (Function1) objM87133R7, c28655q2);
            Boolean boolValueOf11112 = Boolean.valueOf(z34);
            if ((i65 & 112) == 32) {
                z56 = true;
            } else {
                z56 = false;
            }
            zM87157i4 = c28655q2.m87157i(c4656v0M14712i) | z56;
            objM87133R8 = c28655q2.m87133R();
            if (zM87157i4) {
                objM87133R8 = new j(z34, c4656v0M14712i, null);
                c28655q2.m87172p0(objM87133R8);
            } else {
                objM87133R8 = new j(z34, c4656v0M14712i, null);
                c28655q2.m87172p0(objM87133R8);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R8, boolValueOf11112);
            Boolean boolValueOf11113 = Boolean.valueOf(z29);
            if (i75 <= 536870912) {
            }
            if ((i65 & 14) == 4) {
                z57 = true;
            } else {
                z57 = false;
            }
            zM87157i5 = z57 | z67 | c28655q2.m87157i(c4656v0M14712i);
            objM87133R9 = c28655q2.m87133R();
            if (zM87157i5) {
                l12 = l14;
                objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                c28655q2.m87172p0(objM87133R9);
            } else {
                l12 = l14;
                objM87133R9 = new k(z29, l12, c4656v0M14712i, null);
                c28655q2.m87172p0(objM87133R9);
            }
            AbstractC28683x.m87254h(boolValueOf11113, l12, (InterfaceC4351m) objM87133R9, c28655q2);
            String strM102021f9 = screenArgs.getFingerprint();
            zM87157i6 = c28655q2.m87157i(c4656v0M14712i) | c28655q2.m87157i(screenArgs);
            objM87133R10 = c28655q2.m87133R();
            if (zM87157i6) {
                objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                c28655q2.m87172p0(objM87133R10);
            } else {
                objM87133R10 = new l(c4656v0M14712i, screenArgs, null);
                c28655q2.m87172p0(objM87133R10);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R10, strM102021f9);
            strM21274h = AbstractC8693b.m21274h(c40626i.getConversation().getBetaTagViewState().getTitle(), c28655q2, TextResource.$stable);
            C26805g c26805gM131757a9 = c40626i.getConversation().getBetaTagViewState();
            boolean z61112 = z49;
            if ((i69 & 896) == 256) {
                z58 = true;
            } else {
                z58 = false;
            }
            boolean zM87157i116 = z58 | c28655q2.m87157i(c40626i) | c28655q2.m87157i(c4656v0M14712i);
            if ((458752 & i69) == 131072) {
                z59 = true;
            } else {
                z59 = false;
            }
            zM87157i7 = zM87157i116 | z59 | c28655q2.m87157i(interfaceC2994c0) | c28655q2.m87157i(c15199y4) | c28655q2.m87157i(c15199y3) | c28655q2.m87153g(strM21274h);
            objM87133R11 = c28655q2.m87133R();
            if (zM87157i7) {
                objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                interfaceC4353o5 = interfaceC4353o4;
                c28655q2.m87172p0(objM87133R11);
            } else {
                objM87133R11 = new m(interfaceC4353o4, strM21274h, c40626i, c4656v0M14712i, interfaceC4339a4, interfaceC2994c0, c15199y4, c15199y3, null);
                interfaceC4353o5 = interfaceC4353o4;
                c28655q2.m87172p0(objM87133R11);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R11, c26805gM131757a9);
            Boolean boolValueOf11114 = Boolean.valueOf(z45);
            if ((i69 & 7168) == 2048) {
                z60 = true;
            } else {
                z60 = false;
            }
            boolean zM87155h9 = z60 | c28655q2.m87155h(z45);
            InterfaceC4353o interfaceC4353o14 = interfaceC4353o5;
            final C15199y3 c15199y111 = c15199y3;
            if ((i69 & 57344) == 16384) {
                z64 = true;
            } else {
                z64 = false;
            }
            z65 = z64 | zM87155h9;
            objM87133R12 = c28655q2.m87133R();
            if (z65) {
                function12 = function11;
                function13 = function4;
                objM87133R12 = new n(function13, z45, function12, null);
                c28655q2.m87172p0(objM87133R12);
            } else {
                function12 = function11;
                function13 = function4;
                objM87133R12 = new n(function13, z45, function12, null);
                c28655q2.m87172p0(objM87133R12);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R12, boolValueOf11114);
            if (c40626i.getHasContentPrefetched()) {
                c4655vM14667a = AbstractC4654u0.m14667a(c40626i);
            } else {
                c4655vM14667a = null;
            }
            zM87153g = c28655q2.m87153g(c4655vM14667a) | ((3670016 & i69) == 1048576);
            objM87133R13 = c28655q2.m87133R();
            if (zM87153g) {
                function14 = function10;
                objM87133R13 = new b(c4655vM14667a, function14, null);
                c28655q2.m87172p0(objM87133R13);
            } else {
                function14 = function10;
                objM87133R13 = new b(c4655vM14667a, function14, null);
                c28655q2.m87172p0(objM87133R13);
            }
            AbstractC28683x.m87253g(c28655q2, (InterfaceC4351m) objM87133R13, c4655vM14667a);
            AbstractC28669t1 abstractC28669t1M53351e9 = AbstractC18486c.m53351e();
            zM87157i8 = c28655q2.m87157i(c4656v0M14712i);
            objM87133R14 = c28655q2.m87133R();
            if (zM87157i8) {
                objM87133R14 = new c(c4656v0M14712i);
                c28655q2.m87172p0(objM87133R14);
            } else {
                objM87133R14 = new c(c4656v0M14712i);
                c28655q2.m87172p0(objM87133R14);
            }
            final C40626i c40626i10 = c40626i;
            final C4656v0 c4656v10 = c4656v0M14712i;
            final C15199y3 c15199y112 = c15199y4;
            AbstractC28683x.m87247a(abstractC28669t1M53351e9.mo86977a((InterfaceC21467g) objM87133R14), AbstractC37817c.m121344e(1665374336, c28655q2, new InterfaceC4351m() { // from class: ch0.y0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4610c1.m14360s(z4, c40626i10, c4656v10, z38, chatEntrypointExperienceM102020e, interfaceC2994c0, interfaceC4339a4, c15199y112, c15199y111, z37, z55, modifier7, interfaceC28601c9, modifier8, (Composer) obj, iIntValue);
                }
            }), c28655q2, 56);
            function7 = function13;
            c4656v1 = c4656v0M14712i;
            function9 = function14;
            function8 = function12;
            c28655q = c28655q2;
            z26 = z34;
            z24 = z38;
            z27 = z37;
            modifier4 = modifier7;
            modifier3 = modifier8;
            z19 = z61112;
            interfaceC4353o3 = interfaceC4353o14;
            z25 = z29;
            interfaceC4339a3 = interfaceC4339a4;
        } else {
            c28655q3.m87138X();
            function7 = function1;
            z19 = z13;
            l12 = l7;
            modifier3 = modifier2;
            z24 = z17;
            c4656v1 = c4656v0;
            interfaceC4339a3 = interfaceC4339a2;
            c28655q = c28655q3;
            function8 = function5;
            function9 = function6;
            interfaceC4353o3 = interfaceC4353o2;
            z25 = z14;
            z26 = z15;
            z27 = z16;
            modifier4 = modifier;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: ch0.z0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4610c1.m14333D(screenArgs, onBackPressed, interfaceC4353o3, function7, function8, interfaceC4339a3, function9, z4, z19, z25, l12, z26, z27, modifier4, modifier3, z24, c4656v1, i13, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: renamed from: q */
    private static final C40626i m14358q(InterfaceC28670t2 interfaceC28670t2) {
        return (C40626i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final InterfaceC28620h0 m14359r(C4656v0 c4656v0, InterfaceC2994c0 interfaceC2994c0, InterfaceC12251g interfaceC12251g, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        c4656v0.m14673A(interfaceC2994c0, false);
        return new o(interfaceC12251g, c4656v0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m14360s(boolean z4, final C40626i c40626i, final C4656v0 c4656v0, boolean z13, ChatEntrypointExperience chatEntrypointExperience, final InterfaceC2994c0 interfaceC2994c0, InterfaceC4339a interfaceC4339a, C15199y3 c15199y3, C15199y3 c15199y4, boolean z14, boolean z15, Modifier modifier, InterfaceC28601c1 interfaceC28601c1, Modifier modifier2, Composer composer, int i13) throws Throwable {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM14341L = m14341L(z4, c40626i);
            InterfaceC15250v interfaceC15250vM14334E = m14334E(interfaceC28601c1);
            boolean zM87157i = c28655q.m87157i(c4656v0);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new d(c4656v0);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R;
            InterfaceC32647n2 mediaPickerLauncher = c4656v0.getMediaPickerLauncher();
            InterfaceC32666r1 filePickerLauncher = c4656v0.getFilePickerLauncher();
            boolean zM14688h = c4656v0.m14688h();
            EnumC32692x1 enumC32692x1M102585a = z13 ? EnumC32692x1.NONE : EnumC32692x1.INSTANCE.m102585a(chatEntrypointExperience);
            boolean zM87157i2 = c28655q.m87157i(c4656v0);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C4617f(c4656v0, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(c4656v0);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4617f(c4656v0, 3);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(c4656v0);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new InterfaceC4339a() { // from class: ch0.a1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return AbstractC4610c1.m14363v(c4656v0);
                            default:
                                return AbstractC4610c1.m14367z(c4656v0);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            InterfaceC4339a interfaceC4339a2 = (InterfaceC4339a) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(c40626i) | c28655q.m87157i(c4656v0);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C4630j0(2, c40626i, c4656v0);
                c28655q.m87172p0(objM87133R5);
            }
            InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(c40626i) | c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c4656v0);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new InterfaceC4351m() { // from class: ch0.b1
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC4610c1.m14365x(c40626i, interfaceC2994c0, c4656v0, (Uri) obj, (String) obj2);
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) objM87133R6;
            boolean zM87157i7 = c28655q.m87157i(c4656v0) | c28655q.m87153g(interfaceC4339a);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i7 || objM87133R7 == c28676v0) {
                objM87133R7 = new C4626i(3, c4656v0, interfaceC4339a);
                c28655q.m87172p0(objM87133R7);
            }
            Function1 function3 = (Function1) objM87133R7;
            Function1 function4 = (Function1) interfaceC21467g;
            boolean zM87157i8 = c28655q.m87157i(c4656v0);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i8 || objM87133R8 == c28676v0) {
                final int i15 = 1;
                objM87133R8 = new InterfaceC4339a() { // from class: ch0.a1
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                return AbstractC4610c1.m14363v(c4656v0);
                            default:
                                return AbstractC4610c1.m14367z(c4656v0);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R8);
            }
            Function1.m14455z(c40626i, zM14341L, interfaceC15250vM14334E, function1, function2, interfaceC4339a2, mediaPickerLauncher, filePickerLauncher, zM14688h, interfaceC4351m, interfaceC4351m2, null, null, function3, function4, c15199y3, c15199y4, z14, null, (InterfaceC4339a) objM87133R8, enumC32692x1M102585a, z13, c28655q, 0, 2359296, 0, 268288);
            Modifier modifierM7154a = AbstractC2294a.m7154a(1.0f, AbstractC1102d.m3407d(1.0f, C2314t.f9131w));
            EnumC39333f enumC39333f = EnumC39333f.TRANSPARENT;
            C35666g c35666g = new C35666g(AbstractC8693b.m21277k(AbstractC37336b.f159632M), null, z15 ? null : new C39274g(AbstractC16272a.f62031Y, AbstractC8693b.m21277k(AbstractC37336b.f159630L)), EnumC35671i0.LEFT, EnumC39333f.BRAND_WHITE, 1 * 8, 0 * 4, 2, null);
            AbstractC35664f.a aVar = new AbstractC35664f.a(c15199y4);
            AbstractC27274q.a aVar2 = AbstractC27274q.a.f109136f;
            boolean zM87157i9 = c28655q.m87157i(interfaceC2994c0) | c28655q.m87157i(c15199y4);
            Object objM87133R9 = c28655q.m87133R();
            if (zM87157i9 || objM87133R9 == c28676v0) {
                objM87133R9 = new C4637m(5, interfaceC2994c0, c15199y4);
                c28655q.m87172p0(objM87133R9);
            }
            AbstractC35660d.m112871m(modifierM7154a, c35666g, aVar, enumC39333f, null, (InterfaceC4339a) objM87133R9, null, AbstractC37817c.m121344e(2029189806, c28655q, new C0563n(c40626i, c4656v0, interfaceC2994c0, c15199y4, modifier2, 1)), false, aVar2, null, modifier, false, null, C4625h1.f18654a.m14384b(), c28655q, (C35666g.f151591h << 3) | 12585990 | (AbstractC35664f.a.f151587c << 6) | (AbstractC27274q.a.f109137g << 27), 24960, 9552);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m14361t(C4656v0 c4656v0, AbstractC40624g it) {
        AbstractC22676k.m65750j(it, "it");
        c4656v0.getViewModel().mo1216g(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m14362u(C4656v0 c4656v0, int i13) {
        c4656v0.m14680H(i13);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m14363v(C4656v0 c4656v0) {
        c4656v0.m14679G();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m14364w(C40626i c40626i, C4656v0 c4656v0, String str, Uri uri) {
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
            c4656v0.getViewModel().mo1216g(new AbstractC40624g.m(str, uri));
        } else {
            c4656v0.getViewModel().mo1216g(new AbstractC40624g.l(str, uri));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m14365x(C40626i c40626i, InterfaceC2994c0 interfaceC2994c0, C4656v0 c4656v0, Uri uri, String displayName) {
        Object next;
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC22676k.m65750j(displayName, "displayName");
        Iterator<T> it = c40626i.m131827d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C40628k) next).getUri(), uri));
        C40628k c40628k = (C40628k) next;
        AttachmentType attachmentTypeM131852d = c40628k != null ? c40628k.getType() : null;
        if (attachmentTypeM131852d != null) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3006f0.m8732z(interfaceC2994c0, ExecutorC22364d.f87316w, null, new f(c4656v0, uri, displayName, attachmentTypeM131852d, null), 2);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m14366y(C4656v0 c4656v0, InterfaceC4339a interfaceC4339a, AbstractC39523b event) {
        AbstractC22676k.m65750j(event, "event");
        c4656v0.m14701v(event, interfaceC4339a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m14367z(C4656v0 c4656v0) {
        c4656v0.m14676D();
        return C23454a0.f92919a;
    }
}
