package com.whoop.weightlifting;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.onboarding.FeatureEducationType;
import com.whoop.data.onboarding.OnboardingStatusChecker;
import com.whoop.data.repositories.FeatureFlagChecker;
import cu2.C11130j;
import cu2.C11131k;
import cu2.EnumC11122b;
import fi0.InterfaceC14515a;
import ge3.AbstractC15751g;
import in2.InterfaceC18732d;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21130a1;
import j02.InterfaceC21159o0;
import java.util.Iterator;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import or2.AbstractC28163g0;
import p000.AbstractC11266d;
import p000.C0003a0;
import p114eb.AbstractC12939a0;
import p114eb.C12962i;
import p114eb.C12991u0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p701ce2.C4494b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010,R\u001b\u00101\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b3\u00104R\u001b\u00109\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001a\u001a\u0004\b7\u00108¨\u0006;"}, m65681d2 = {"Lcom/whoop/weightlifting/StrengthTrainerFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Leb/u0;", "strengthTrainerNavController", "Ll83/a0;", "C", "(Leb/u0;Landroidx/compose/runtime/Composer;I)V", "", "E", "()Ljava/lang/String;", "L", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/whoop/data/onboarding/OnboardingStatusChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lcom/whoop/data/onboarding/OnboardingStatusChecker;", "onboardingStatusChecker", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "Lcu2/k;", "y", "Leb/i;", "F", "()Lcu2/k;", "args", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "z", "J", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lfi0/a;", "G", "()Lfi0/a;", "baseAnalytics", "Lrr2/c;", "H", "()Lrr2/c;", "crashReporter", "Lin2/d;", "I", "()Lin2/d;", "dispatcherFactory", "b", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class StrengthTrainerFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: I */
    public static final int f32800I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h baseAnalytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h crashReporter;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h dispatcherFactory;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingStatusChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C12962i args;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.StrengthTrainerFragment$CheckNavigationToEditWorkoutScreen$1$1$1", m100430f = "StrengthTrainerFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10748a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32808w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12991u0 f32809x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f32810y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ StrengthTrainerFragment f32811z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10748a(C12991u0 c12991u0, String str, StrengthTrainerFragment strengthTrainerFragment, InterfaceC30057d<? super C10748a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f32809x = c12991u0;
            this.f32810y = str;
            this.f32811z = strengthTrainerFragment;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C10748a(this.f32809x, this.f32810y, this.f32811z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C10748a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f32808w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            StrengthTrainerDestination.C10741d.f32764a.m28059m(this.f32809x, this.f32810y);
            Bundle arguments = this.f32811z.getArguments();
            if (arguments != null) {
                arguments.remove("sharedWorkoutId");
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10750c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32812w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32813x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32814y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10750c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32812w = componentCallbacks;
            this.f32813x = interfaceC35951a;
            this.f32814y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.onboarding.OnboardingStatusChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final OnboardingStatusChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32812w;
            InterfaceC35951a interfaceC35951a = this.f32813x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32814y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(OnboardingStatusChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10751d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32815w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32816x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32817y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10751d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32815w = componentCallbacks;
            this.f32816x = interfaceC35951a;
            this.f32817y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f32815w;
            InterfaceC35951a interfaceC35951a = this.f32816x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32817y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10752e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32818w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32819x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32820y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10752e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32818w = componentCallbacks;
            this.f32819x = interfaceC35951a;
            this.f32820y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f32818w;
            InterfaceC35951a interfaceC35951a = this.f32819x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32820y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10753f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32821w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32822x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32823y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10753f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32821w = componentCallbacks;
            this.f32822x = interfaceC35951a;
            this.f32823y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fi0.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC14515a invoke() {
            ComponentCallbacks componentCallbacks = this.f32821w;
            InterfaceC35951a interfaceC35951a = this.f32822x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32823y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10754g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32824w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32825x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32826y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10754g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32824w = componentCallbacks;
            this.f32825x = interfaceC35951a;
            this.f32826y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, rr2.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31766c invoke() {
            ComponentCallbacks componentCallbacks = this.f32824w;
            InterfaceC35951a interfaceC35951a = this.f32825x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32826y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31766c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10755h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f32827w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f32828x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f32829y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10755h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f32827w = componentCallbacks;
            this.f32828x = interfaceC35951a;
            this.f32829y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [in2.d, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC18732d invoke() {
            ComponentCallbacks componentCallbacks = this.f32827w;
            InterfaceC35951a interfaceC35951a = this.f32828x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f32829y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC18732d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.weightlifting.StrengthTrainerFragment$i */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10756i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f32830w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10756i(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f32830w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f32830w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f32830w, " has null arguments"));
        }
    }

    public StrengthTrainerFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.onboardingStatusChecker = AbstractC30060g.m92087G(enumC23463i, new C10750c(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10751d(this, null, new C11130j(this, 0)));
        this.args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11131k.class), new C10756i(this));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10752e(this, null, null));
        this.baseAnalytics = AbstractC30060g.m92087G(enumC23463i, new C10753f(this, null, null));
        this.crashReporter = AbstractC30060g.m92087G(enumC23463i, new C10754g(this, null, null));
        this.dispatcherFactory = AbstractC30060g.m92087G(enumC23463i, new C10755h(this, null, null));
    }

    /* JADX INFO: renamed from: C */
    private final void m28122C(C12991u0 c12991u0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-868732928);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c12991u0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(this) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString("sharedWorkoutId") : null;
            if (string == null) {
                c28655q.m87150e0(1050419394);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1050419395);
                boolean zM87157i = c28655q.m87157i(c12991u0) | c28655q.m87153g(string) | c28655q.m87157i(this);
                Object objM87133R = c28655q.m87133R();
                if (zM87157i || objM87133R == C28635l.f115821a) {
                    objM87133R = new C10748a(c12991u0, string, this, null);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, C23454a0.f92919a);
                c28655q.m87173q(false);
            }
            Bundle arguments2 = getArguments();
            Long lValueOf = arguments2 != null ? Long.valueOf(arguments2.getLong("templateId", -1L)) : null;
            Bundle arguments3 = getArguments();
            String string2 = arguments3 != null ? arguments3.getString("activityId", "") : null;
            if (lValueOf != null && lValueOf.longValue() != -1) {
                StrengthTrainerDestination.C10741d.m28056n(StrengthTrainerDestination.C10741d.f32764a, c12991u0, m28125F().m30101m(), m28125F().m30089a(), (string2 == null || string2.length() == 0) ? StrengthTrainerDestination.C10747j.f32796a : StrengthTrainerDestination.C10744g.f32784a, m28125F().m30096h(), false, m28125F().m30092d(), 16, null);
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    arguments4.remove("templateId");
                }
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4494b(this, c12991u0, i13, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m28123D(StrengthTrainerFragment strengthTrainerFragment, C12991u0 c12991u0, int i13, Composer composer, int i14) {
        strengthTrainerFragment.m28122C(c12991u0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: E */
    private final String m28124E() {
        Object next;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("destination") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("activityId") : null;
        if (string2 != null) {
            StrengthTrainerDestination.C10744g c10744g = StrengthTrainerDestination.C10744g.f32784a;
            if (AbstractC22676k.m65745e(string, c10744g.getName())) {
                String strM30100l = m28125F().m30100l();
                AbstractC22676k.m65749i(strM30100l, "getSource(...)");
                String strM28098e = c10744g.m28098e(string2, strM30100l);
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.remove("activityId");
                }
                Bundle arguments4 = getArguments();
                if (arguments4 != null) {
                    arguments4.remove("destination");
                }
                return strM28098e;
            }
        }
        Bundle arguments5 = getArguments();
        String string3 = arguments5 != null ? arguments5.getString("exerciseId") : null;
        Bundle arguments6 = getArguments();
        boolean z4 = arguments6 != null ? arguments6.getBoolean("showCTA", false) : false;
        if (string3 == null || string3.length() == 0 || !AbstractC22676k.m65745e(string, StrengthTrainerDestination.C10742e.f32774a.getName())) {
            if (string3 != null && string3.length() != 0) {
                StrengthTrainerDestination.C10739b c10739b = StrengthTrainerDestination.C10739b.f32758a;
                if (AbstractC22676k.m65745e(string, c10739b.getName())) {
                    String strM30100l2 = m28125F().m30100l();
                    AbstractC22676k.m65749i(strM30100l2, "getSource(...)");
                    String strM28039e = c10739b.m28039e(string3, strM30100l2);
                    Bundle arguments7 = getArguments();
                    if (arguments7 != null) {
                        arguments7.remove("exerciseId");
                    }
                    Bundle arguments8 = getArguments();
                    if (arguments8 != null) {
                        arguments8.remove("destination");
                    }
                    return strM28039e;
                }
            }
            return null;
        }
        boolean zIsFeatureEnabled = m28129J().isFeatureEnabled("exercise-details-image-navigation-android");
        Bundle arguments9 = getArguments();
        String string4 = arguments9 != null ? arguments9.getString("entryPointType") : null;
        Iterator<E> it = EnumC11122b.getEntries().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((EnumC11122b) next).name(), string4));
        EnumC11122b enumC11122b = (EnumC11122b) next;
        if (enumC11122b == null) {
            enumC11122b = zIsFeatureEnabled ? EnumC11122b.EXTERNAL : EnumC11122b.INTERNAL;
        }
        boolean zM30095g = m28125F().m30095g();
        StrengthTrainerDestination.C10742e c10742e = StrengthTrainerDestination.C10742e.f32774a;
        String strM30100l3 = m28125F().m30100l();
        String strM28081j = c10742e.m28081j(string3, z4, enumC11122b, (strM30100l3 == null || AbstractC39414r.m125890i0(strM30100l3)) ? null : strM30100l3, zM30095g);
        Bundle arguments10 = getArguments();
        if (arguments10 != null) {
            arguments10.remove("exerciseId");
        }
        Bundle arguments11 = getArguments();
        if (arguments11 != null) {
            arguments11.remove("showCTA");
        }
        Bundle arguments12 = getArguments();
        if (arguments12 != null) {
            arguments12.remove("destination");
        }
        Bundle arguments13 = getArguments();
        if (arguments13 != null) {
            arguments13.remove("entryPointType");
        }
        Bundle arguments14 = getArguments();
        if (arguments14 != null) {
            arguments14.remove("isExerciseDetailsV2ExperimentEnabled");
        }
        return strM28081j;
    }

    /* JADX INFO: renamed from: F */
    private final C11131k m28125F() {
        return (C11131k) this.args.getValue();
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC14515a m28126G() {
        return (InterfaceC14515a) this.baseAnalytics.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC31766c m28127H() {
        return (InterfaceC31766c) this.crashReporter.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final InterfaceC18732d m28128I() {
        return (InterfaceC18732d) this.dispatcherFactory.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final FeatureFlagChecker m28129J() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final OnboardingStatusChecker m28130K() {
        return (OnboardingStatusChecker) this.onboardingStatusChecker.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final void m28131L() {
        getActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m28132M(StrengthTrainerFragment strengthTrainerFragment) {
        return AbstractC15751g.m44431K(strengthTrainerFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m28133N(StrengthTrainerFragment strengthTrainerFragment, String str, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C12991u0 c12991u0M58963a = AbstractC21130a1.m58963a("StrengthTrainerNavGraph", null, c28655q, 6, 2);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = AbstractC5583n.m16799z(strengthTrainerFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC12939a0 abstractC12939a0 = (AbstractC12939a0) objM87133R;
            InterfaceC21159o0 navigator = strengthTrainerFragment.getNavigator();
            InterfaceC14515a interfaceC14515aM28126G = strengthTrainerFragment.m28126G();
            InterfaceC31766c interfaceC31766cM28127H = strengthTrainerFragment.m28127H();
            InterfaceC18732d interfaceC18732dM28128I = strengthTrainerFragment.m28128I();
            boolean zM30091c = strengthTrainerFragment.m28125F().m30091c();
            String strM30097i = strengthTrainerFragment.m28125F().m30097i();
            boolean zM87157i = c28655q.m87157i(strengthTrainerFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C11130j(strengthTrainerFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC10757a.m28171s(null, str, c12991u0M58963a, abstractC12939a0, navigator, interfaceC14515aM28126G, interfaceC31766cM28127H, interfaceC18732dM28128I, null, zM30091c, strM30097i, (InterfaceC4339a) objM87133R2, c28655q, 0, 0, 257);
            strengthTrainerFragment.m28122C(c12991u0M58963a, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m28134O(StrengthTrainerFragment strengthTrainerFragment) {
        Bundle arguments = strengthTrainerFragment.getArguments();
        if (arguments != null) {
            arguments.remove("endWorkout");
        }
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m28126G().mo41423e("Workout Builder", AbstractC25247g0.m73989X(new C23465k("source", m28125F().m30100l())));
        m28131L();
        AbstractC28163g0.m85256l(this);
        if (m28130K().shouldGoToFeatureEducation(FeatureEducationType.WEIGHTLIFTING_MSK_STORY)) {
            AbstractC28163g0.m85259o(this).m85338d(Uri.parse("android-app://com.whoop/onboardingStoriesFragmentRedesign/WEIGHTLIFTING_MSK_STORY"));
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0003a0(20, this, m28124E()), true, 1281947498));
    }
}
