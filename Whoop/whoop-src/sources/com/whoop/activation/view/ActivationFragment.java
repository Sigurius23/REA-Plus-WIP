package com.whoop.activation.view;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import b03.C2209f;
import b03.InterfaceC2208e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c31.C3927k;
import c41.C4065l3;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import c93.InterfaceC4356r;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.ActivationFragment;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import f80.C14242a;
import f80.C14245d;
import f80.C14246e;
import g80.C15564e;
import g80.C15566g;
import ge3.AbstractC15751g;
import h80.C17003c;
import h80.InterfaceC17002b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import j80.InterfaceC21414b;
import j93.InterfaceC21467g;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l80.AbstractC23437n;
import l80.AbstractC23438o;
import l80.C23439p;
import l80.InterfaceC23444u;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.InterfaceC25005a;
import m32.InterfaceC25007c;
import or2.AbstractC28163g0;
import p114eb.C12991u0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p714k80.AbstractC22282k;
import p714k80.C22275d;
import p714k80.C22276e;
import p714k80.C22281j;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p720m91.InterfaceC25312u;
import p90.C28997e;
import pf.AbstractC29125c;
import q80.C30038j;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u001d\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0003R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001b\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u001b\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u001b\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010JR\u001b\u0010O\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001b\u001a\u0004\bQ\u0010R¨\u0006V²\u0006\f\u0010U\u001a\u00020T8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/activation/view/ActivationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lkotlin/Function0;", "onNext", "K", "(Lc93/a;)V", "W", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "getNavigator", "()Lj02/o0;", "navigator", "Landroid/content/Intent;", "x", "N", "()Landroid/content/Intent;", "pairingFlowIntent", "Lh80/c;", "y", "L", "()Lh80/c;", "analyticsHelper", "Lf80/a;", "z", "M", "()Lf80/a;", "credentialHelper", "Lf80/d;", "E", "O", "()Lf80/d;", "passwordManagerTracker", "Lf80/e;", "F", "S", "()Lf80/e;", "saveCredentialOnAdvance", "Lm32/c;", "G", "R", "()Lm32/c;", "pushNotificationPermissionHelper", "Lm32/a;", "H", "P", "()Lm32/a;", "permissionChecker", "Lk80/j;", "I", "T", "()Lk80/j;", "screenArgs", "Lg80/e;", "J", "U", "()Lg80/e;", "viewModel", "Lb03/f;", "V", "()Lb03/f;", "whoopStatusViewModel", "Lq80/j;", "Q", "()Lq80/j;", "progressButtonNavHandler", "Ll80/p;", "navRouter", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class ActivationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h passwordManagerTracker;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h saveCredentialOnAdvance;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h pushNotificationPermissionHelper;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h permissionChecker;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h screenArgs;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h whoopStatusViewModel;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h progressButtonNavHandler;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h pairingFlowIntent;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h credentialHelper;

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.view.ActivationFragment$askPermission$1", m100430f = "ActivationFragment.kt", m100431l = {106}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5748a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22765w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22767y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5748a(InterfaceC4339a interfaceC4339a, InterfaceC30057d<? super C5748a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22767y = interfaceC4339a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ActivationFragment.this.new C5748a(this.f22767y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5748a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f22765w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!ActivationFragment.this.m17192P().mo73346a("android.permission.POST_NOTIFICATIONS")) {
                    InterfaceC25007c interfaceC25007cM17194R = ActivationFragment.this.m17194R();
                    this.f22765w = 1;
                    if (interfaceC25007cM17194R.mo73348x(true, this) == enumC31071a) {
                        return enumC31071a;
                    }
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.f22767y.invoke();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C5749b extends C22672i implements InterfaceC4356r {
        public C5749b(Object obj) {
            super(8, 0, C30038j.class, obj, "handleProgressButtonClick", "handleProgressButtonClick(Lcom/whoop/design/item/ItemViewState;Lcom/whoop/activation/view/screens/paymentmethod/Card;Lcom/whoop/activation/view/screens/paymentmethod/Card;Lcom/whoop/design/atomic/molecule/progressbutton/ProgressButtonState;Lcom/whoop/activation/presentation/BffScreenContainerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m17213a(InterfaceC25312u p13, C28997e p14, C28997e p15, C3927k p16, C15566g p17, Function1 p18, Function1 p19, SignUpSource p24) {
            AbstractC22676k.m65750j(p13, "p0");
            AbstractC22676k.m65750j(p14, "p1");
            AbstractC22676k.m65750j(p15, "p2");
            AbstractC22676k.m65750j(p16, "p3");
            AbstractC22676k.m65750j(p17, "p4");
            AbstractC22676k.m65750j(p18, "p5");
            AbstractC22676k.m65750j(p19, "p6");
            AbstractC22676k.m65750j(p24, "p7");
            ((C30038j) this.receiver).m91971a(p13, p14, p15, p16, p17, p18, p19, p24);
        }

        @Override // c93.InterfaceC4356r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            m17213a((InterfaceC25312u) obj, (C28997e) obj2, (C28997e) obj3, (C3927k) obj4, (C15566g) obj5, (Function1) obj6, (Function1) obj7, (SignUpSource) obj8);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5750c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22768w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22769x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22770y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5750c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22768w = componentCallbacks;
            this.f22769x = interfaceC35951a;
            this.f22770y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l80.p] */
        @Override // c93.InterfaceC4339a
        public final C23439p invoke() {
            ComponentCallbacks componentCallbacks = this.f22768w;
            InterfaceC35951a interfaceC35951a = this.f22769x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22770y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23439p.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5751d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22771w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22772x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22773y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5751d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22771w = componentCallbacks;
            this.f22772x = interfaceC35951a;
            this.f22773y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22771w;
            InterfaceC35951a interfaceC35951a = this.f22772x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22773y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5752e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22774w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22775x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5752e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22774w = componentCallbacks;
            this.f22775x = interfaceC35951a;
            this.f22776y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Intent, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final Intent invoke() {
            ComponentCallbacks componentCallbacks = this.f22774w;
            InterfaceC35951a interfaceC35951a = this.f22775x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22776y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Intent.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5753f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22777w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22778x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22779y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5753f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22777w = componentCallbacks;
            this.f22778x = interfaceC35951a;
            this.f22779y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [h80.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17003c invoke() {
            ComponentCallbacks componentCallbacks = this.f22777w;
            InterfaceC35951a interfaceC35951a = this.f22778x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22779y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17003c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5754g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22780w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22781x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22782y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5754g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22780w = componentCallbacks;
            this.f22781x = interfaceC35951a;
            this.f22782y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [f80.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14242a invoke() {
            ComponentCallbacks componentCallbacks = this.f22780w;
            InterfaceC35951a interfaceC35951a = this.f22781x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22782y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14242a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5755h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22783w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22784x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22785y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5755h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22783w = componentCallbacks;
            this.f22784x = interfaceC35951a;
            this.f22785y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [f80.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14245d invoke() {
            ComponentCallbacks componentCallbacks = this.f22783w;
            InterfaceC35951a interfaceC35951a = this.f22784x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22785y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14245d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5756i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22786w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22787x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22788y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5756i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22786w = componentCallbacks;
            this.f22787x = interfaceC35951a;
            this.f22788y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [f80.e, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14246e invoke() {
            ComponentCallbacks componentCallbacks = this.f22786w;
            InterfaceC35951a interfaceC35951a = this.f22787x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22788y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14246e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5757j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22789w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22790x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22791y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5757j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22789w = componentCallbacks;
            this.f22790x = interfaceC35951a;
            this.f22791y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f22789w;
            InterfaceC35951a interfaceC35951a = this.f22790x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22791y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5758k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22792w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22793x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22794y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5758k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22792w = componentCallbacks;
            this.f22793x = interfaceC35951a;
            this.f22794y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25005a invoke() {
            ComponentCallbacks componentCallbacks = this.f22792w;
            InterfaceC35951a interfaceC35951a = this.f22793x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22794y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25005a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5759l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22795w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22796x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22797y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5759l(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22795w = componentCallbacks;
            this.f22796x = interfaceC35951a;
            this.f22797y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q80.j] */
        @Override // c93.InterfaceC4339a
        public final C30038j invoke() {
            ComponentCallbacks componentCallbacks = this.f22795w;
            InterfaceC35951a interfaceC35951a = this.f22796x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22797y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30038j.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$m */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5760m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22798w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5760m(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22798w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22798w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5761n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22799w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22800x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22801y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22802z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5761n(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22799w = componentCallbacks;
            this.f22800x = interfaceC35951a;
            this.f22801y = interfaceC4339a;
            this.f22802z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, g80.e] */
        @Override // c93.InterfaceC4339a
        public final C15564e invoke() {
            return AbstractC34132o.m107857B(this.f22799w, this.f22800x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15564e.class), this.f22801y, this.f22802z);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$o */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5762o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22803w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5762o(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22803w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22803w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.activation.view.ActivationFragment$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5763p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22804w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22805x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22806y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5763p(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22804w = componentCallbacks;
            this.f22805x = interfaceC35951a;
            this.f22806y = interfaceC4339a;
            this.f22807z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, b03.f] */
        @Override // c93.InterfaceC4339a
        public final C2209f invoke() {
            return AbstractC34132o.m107857B(this.f22804w, this.f22805x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2209f.class), this.f22806y, this.f22807z);
        }
    }

    public ActivationFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: k80.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ActivationFragment f86937x;

            {
                this.f86937x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ActivationFragment.m17200X(this.f86937x);
                    case 1:
                        return ActivationFragment.m17208f0(this.f86937x);
                    case 2:
                        return ActivationFragment.m17209g0(this.f86937x);
                    default:
                        return ActivationFragment.m17210h0(this.f86937x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5751d(this, null, interfaceC4339a));
        final int i14 = 1;
        this.pairingFlowIntent = AbstractC30060g.m92087G(enumC23463i, new C5752e(this, new C35953c("CONNECTIVITY_PAIRING_FLOW_INTENT"), new InterfaceC4339a(this) { // from class: k80.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ActivationFragment f86937x;

            {
                this.f86937x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ActivationFragment.m17200X(this.f86937x);
                    case 1:
                        return ActivationFragment.m17208f0(this.f86937x);
                    case 2:
                        return ActivationFragment.m17209g0(this.f86937x);
                    default:
                        return ActivationFragment.m17210h0(this.f86937x);
                }
            }
        }));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5753f(this, null, null));
        this.credentialHelper = AbstractC30060g.m92087G(enumC23463i, new C5754g(this, null, null));
        this.passwordManagerTracker = AbstractC30060g.m92087G(enumC23463i, new C5755h(this, null, null));
        this.saveCredentialOnAdvance = AbstractC30060g.m92087G(enumC23463i, new C5756i(this, null, null));
        final int i15 = 2;
        this.pushNotificationPermissionHelper = AbstractC30060g.m92087G(enumC23463i, new C5757j(this, new C35953c("push-notification-permission-helper"), new InterfaceC4339a(this) { // from class: k80.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ActivationFragment f86937x;

            {
                this.f86937x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ActivationFragment.m17200X(this.f86937x);
                    case 1:
                        return ActivationFragment.m17208f0(this.f86937x);
                    case 2:
                        return ActivationFragment.m17209g0(this.f86937x);
                    default:
                        return ActivationFragment.m17210h0(this.f86937x);
                }
            }
        }));
        this.permissionChecker = AbstractC30060g.m92087G(enumC23463i, new C5758k(this, null, null));
        EnumC23463i enumC23463i2 = EnumC23463i.f92935y;
        final int i16 = 3;
        this.screenArgs = AbstractC30060g.m92087G(enumC23463i2, new InterfaceC4339a(this) { // from class: k80.c

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ ActivationFragment f86937x;

            {
                this.f86937x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ActivationFragment.m17200X(this.f86937x);
                    case 1:
                        return ActivationFragment.m17208f0(this.f86937x);
                    case 2:
                        return ActivationFragment.m17209g0(this.f86937x);
                    default:
                        return ActivationFragment.m17210h0(this.f86937x);
                }
            }
        });
        this.viewModel = AbstractC30060g.m92087G(enumC23463i2, new C5761n(this, null, new C5760m(this), null));
        this.whoopStatusViewModel = AbstractC30060g.m92087G(enumC23463i2, new C5763p(this, null, new C5762o(this), null));
        this.progressButtonNavHandler = AbstractC30060g.m92087G(enumC23463i, new C5759l(this, null, null));
    }

    /* JADX INFO: renamed from: K */
    private final void m17187K(InterfaceC4339a onNext) {
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(this), null, null, new C5748a(onNext, null), 3);
    }

    /* JADX INFO: renamed from: L */
    private final C17003c m17188L() {
        return (C17003c) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final C14242a m17189M() {
        return (C14242a) this.credentialHelper.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final Intent m17190N() {
        return (Intent) this.pairingFlowIntent.getValue();
    }

    /* JADX INFO: renamed from: O */
    private final C14245d m17191O() {
        return (C14245d) this.passwordManagerTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public final InterfaceC25005a m17192P() {
        return (InterfaceC25005a) this.permissionChecker.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final C30038j m17193Q() {
        return (C30038j) this.progressButtonNavHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final InterfaceC25007c m17194R() {
        return (InterfaceC25007c) this.pushNotificationPermissionHelper.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final C14246e m17195S() {
        return (C14246e) this.saveCredentialOnAdvance.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final C22281j m17196T() {
        return (C22281j) this.screenArgs.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final C15564e m17197U() {
        return (C15564e) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final C2209f m17198V() {
        return (C2209f) this.whoopStatusViewModel.getValue();
    }

    /* JADX INFO: renamed from: W */
    private final void m17199W() {
        ActivityCompat.OnRequestPermissionsResultCallback onRequestPermissionsResultCallbackRequireActivity = requireActivity();
        InterfaceC23444u interfaceC23444u = onRequestPermissionsResultCallbackRequireActivity instanceof InterfaceC23444u ? (InterfaceC23444u) onRequestPermissionsResultCallbackRequireActivity : null;
        if (interfaceC23444u != null) {
            interfaceC23444u.mo27322i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C34911a m17200X(ActivationFragment activationFragment) {
        return AbstractC15751g.m44431K(activationFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m17201Y(final ActivationFragment activationFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            activationFragment.m17199W();
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("ActivationFlowNavHost", null, c28655q, 6, 2);
            boolean zM87157i = c28655q.m87157i(c12991u0M58963a) | c28655q.m87157i(activationFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C22275d(0, c12991u0M58963a, activationFragment);
                c28655q.m87172p0(objM87133R);
            }
            InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C5750c(activationFragment, null, (InterfaceC4339a) objM87133R));
            C15564e c15564eM17197U = activationFragment.m17197U();
            C2209f c2209fM17198V = activationFragment.m17198V();
            Intent intentM17190N = activationFragment.m17190N();
            String source = activationFragment.m17196T().getSource();
            ActivationFlowDestination startDestination = activationFragment.m17196T().getStartDestination();
            C14242a c14242aM17189M = activationFragment.m17189M();
            C14245d c14245dM17191O = activationFragment.m17191O();
            C14246e c14246eM17195S = activationFragment.m17195S();
            C30038j c30038jM17193Q = activationFragment.m17193Q();
            boolean zM87157i2 = c28655q.m87157i(c30038jM17193Q);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C5749b(c30038jM17193Q);
                c28655q.m87172p0(objM87133R2);
            }
            InterfaceC21467g interfaceC21467g = (InterfaceC21467g) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(interfaceC23462hM92087G);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C22276e(interfaceC23462hM92087G, 0);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(activationFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(activationFragment) { // from class: k80.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivationFragment f86944x;

                    {
                        this.f86944x = activationFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return ActivationFragment.m17205c0(this.f86944x, (InterfaceC21414b) obj);
                            case 1:
                                return ActivationFragment.m17206d0(this.f86944x, (InterfaceC4339a) obj);
                            default:
                                return ActivationFragment.m17207e0(this.f86944x, (InterfaceC17002b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(activationFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(activationFragment) { // from class: k80.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivationFragment f86944x;

                    {
                        this.f86944x = activationFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return ActivationFragment.m17205c0(this.f86944x, (InterfaceC21414b) obj);
                            case 1:
                                return ActivationFragment.m17206d0(this.f86944x, (InterfaceC4339a) obj);
                            default:
                                return ActivationFragment.m17207e0(this.f86944x, (InterfaceC17002b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function3 = (Function1) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(activationFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                final int i16 = 2;
                objM87133R6 = new Function1(activationFragment) { // from class: k80.f

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ ActivationFragment f86944x;

                    {
                        this.f86944x = activationFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return ActivationFragment.m17205c0(this.f86944x, (InterfaceC21414b) obj);
                            case 1:
                                return ActivationFragment.m17206d0(this.f86944x, (InterfaceC4339a) obj);
                            default:
                                return ActivationFragment.m17207e0(this.f86944x, (InterfaceC17002b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC23437n.m67919E(c15564eM17197U, startDestination, c2209fM17198V, c12991u0M58963a, intentM17190N, source, function1, function2, function3, (Function1) objM87133R6, c14242aM17189M, c14245dM17191O, c14246eM17195S, (InterfaceC4356r) interfaceC21467g, c28655q, C2209f.f8791F << 6, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C34911a m17202Z(C12991u0 c12991u0, ActivationFragment activationFragment) {
        return AbstractC15751g.m44431K(c12991u0, activationFragment.getNavigator(), activationFragment.requireActivity());
    }

    /* JADX INFO: renamed from: a0 */
    private static final C23439p m17203a0(InterfaceC23462h interfaceC23462h) {
        return (C23439p) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final C23454a0 m17204b0(InterfaceC23462h interfaceC23462h, AbstractC23438o it) {
        AbstractC22676k.m65750j(it, "it");
        m17203a0(interfaceC23462h).m68000c(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c0 */
    public static final C23454a0 m17205c0(ActivationFragment activationFragment, InterfaceC21414b it) {
        AbstractC22676k.m65750j(it, "it");
        activationFragment.m17197U().m43830r(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final C23454a0 m17206d0(ActivationFragment activationFragment, InterfaceC4339a onNext) {
        AbstractC22676k.m65750j(onNext, "onNext");
        activationFragment.m17187K(onNext);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C23454a0 m17207e0(ActivationFragment activationFragment, InterfaceC17002b it) {
        AbstractC22676k.m65750j(it, "it");
        activationFragment.m17188L().m47941p(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C34911a m17208f0(ActivationFragment activationFragment) {
        return AbstractC15751g.m44431K(activationFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C34911a m17209g0(ActivationFragment activationFragment) {
        return AbstractC15751g.m44431K(activationFragment.requireActivity().getActivityResultRegistry(), AbstractC37056f.m118958J("android.permission.POST_NOTIFICATIONS"), "activationFragment");
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final C22281j m17210h0(ActivationFragment activationFragment) {
        return AbstractC22282k.m64012a(activationFragment.getArguments());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4065l3(this, 7), true, 1625610006));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m17198V().mo1216g(new InterfaceC2208e.b("Login Screen"));
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycle().mo4986a(m17194R());
    }
}
