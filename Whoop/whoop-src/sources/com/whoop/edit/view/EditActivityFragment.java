package com.whoop.edit.view;

import a80.C0539c;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import be1.AbstractC3173g;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.edit.view.EditActivityFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n82.InterfaceC26456b;
import or2.AbstractC28163g0;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
import p003a1.C0103b;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import sp0.EnumC32861a;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yd1.AbstractC39457a;
import yd1.C39458b;
import zd1.C40548c;
import zd1.InterfaceC40547b;
import zd1.InterfaceC40549d;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010'R\u001d\u0010.\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010'R\u001d\u00101\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010'R\u001d\u00104\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u0010'R\u001d\u00107\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0016\u001a\u0004\b6\u0010'R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0016\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\u0016\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0016\u001a\u0004\bD\u0010E¨\u0006I²\u0006\f\u0010H\u001a\u00020G8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/edit/view/EditActivityFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lzd1/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "a0", "()Lzd1/c;", "viewModel", "Lzr2/a;", "x", "T", "()Lzr2/a;", "dateAndTimeProvider", "Lor2/u0;", "y", "X", "()Lor2/u0;", "localizedDateTimeFormatter", "", "z", "Z", "()Ljava/lang/String;", "startDate", "E", "U", "endDate", "F", "W", "internalActivityName", "G", "R", "activityId", "H", "S", "activityType", "I", "V", "flow", "", "J", "c0", "()Z", "isDeletable", "Lsp0/a;", "K", "Y", "()Lsp0/a;", "resolvedActivityType", "Lj02/o0;", "L", "getNavigator", "()Lj02/o0;", "navigator", "Lzd1/d;", "viewState", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditActivityFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h endDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h internalActivityName;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h activityId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h activityType;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h flow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h isDeletable;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h resolvedActivityType;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8709g(this, null, new C8708f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h startDate;

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.edit.view.EditActivityFragment$onCreateView$1$1$1", m100430f = "EditActivityFragment.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8703a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25930w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C39458b f25932y;

        /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C39458b f25933w;

            public a(C39458b c39458b) {
                this.f25933w = c39458b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC39457a abstractC39457a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f25933w.m126006a(abstractC39457a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8703a(C39458b c39458b, InterfaceC30057d<? super C8703a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f25932y = c39458b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EditActivityFragment.this.new C8703a(this.f25932y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8703a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25930w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM131449p = EditActivityFragment.this.m21313a0().getNavigationEvents();
                a aVar = new a(this.f25932y);
                this.f25930w = 1;
                if (interfaceC13058lM131449p.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/edit/view/EditActivityFragment$b", "Lg/t;", "Ll83/a0;", "d", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C8704b extends AbstractC14917t {
        public C8704b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            EditActivityFragment.this.m21313a0().m131452v(InterfaceC40547b.i.f174468a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8705c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25935w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25936x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25937y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8705c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25935w = componentCallbacks;
            this.f25936x = interfaceC35951a;
            this.f25937y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f25935w;
            InterfaceC35951a interfaceC35951a = this.f25936x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25937y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8706d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25938w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25939x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25940y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8706d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25938w = componentCallbacks;
            this.f25939x = interfaceC35951a;
            this.f25940y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25938w;
            InterfaceC35951a interfaceC35951a = this.f25939x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25940y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8707e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25941w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25942x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25943y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8707e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25941w = componentCallbacks;
            this.f25942x = interfaceC35951a;
            this.f25943y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25941w;
            InterfaceC35951a interfaceC35951a = this.f25942x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25943y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8708f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25944w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8708f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25944w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25944w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.edit.view.EditActivityFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8709g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25945w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25946x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25947y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25948z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8709g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25945w = componentCallbacks;
            this.f25946x = interfaceC35951a;
            this.f25947y = interfaceC4339a;
            this.f25948z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, zd1.c] */
        @Override // c93.InterfaceC4339a
        public final C40548c invoke() {
            return AbstractC34132o.m107857B(this.f25945w, this.f25946x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40548c.class), this.f25947y, this.f25948z);
        }
    }

    public EditActivityFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C8705c(this, null, null));
        final int i13 = 1;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i, new C8706d(this, null, new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        }));
        final int i14 = 2;
        this.startDate = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i15 = 3;
        this.endDate = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i16 = 4;
        this.internalActivityName = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i17 = 5;
        this.activityId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i18 = 6;
        this.activityType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i19 = 7;
        this.flow = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i24 = 8;
        this.isDeletable = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i25 = 9;
        this.resolvedActivityType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        });
        final int i26 = 0;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8707e(this, null, new InterfaceC4339a(this) { // from class: ae1.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditActivityFragment f2939x;

            {
                this.f2939x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return EditActivityFragment.m21318f0(this.f2939x);
                    case 1:
                        return EditActivityFragment.m21317e0(this.f2939x);
                    case 2:
                        return EditActivityFragment.m21325m0(this.f2939x);
                    case 3:
                        return EditActivityFragment.m21302P(this.f2939x);
                    case 4:
                        return EditActivityFragment.m21314b0(this.f2939x);
                    case 5:
                        return EditActivityFragment.m21300N(this.f2939x);
                    case 6:
                        return EditActivityFragment.m21301O(this.f2939x);
                    case 7:
                        return EditActivityFragment.m21303Q(this.f2939x);
                    case 8:
                        return Boolean.valueOf(EditActivityFragment.m21316d0(this.f2939x));
                    default:
                        return EditActivityFragment.m21324l0(this.f2939x);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m21300N(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("activityId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m21301O(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("activityType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m21302P(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("endDate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m21303Q(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("flow");
    }

    /* JADX INFO: renamed from: R */
    private final String m21304R() {
        return (String) this.activityId.getValue();
    }

    /* JADX INFO: renamed from: S */
    private final String m21305S() {
        return (String) this.activityType.getValue();
    }

    /* JADX INFO: renamed from: T */
    private final InterfaceC41070a m21306T() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: U */
    private final String m21307U() {
        return (String) this.endDate.getValue();
    }

    /* JADX INFO: renamed from: V */
    private final String m21308V() {
        return (String) this.flow.getValue();
    }

    /* JADX INFO: renamed from: W */
    private final String m21309W() {
        return (String) this.internalActivityName.getValue();
    }

    /* JADX INFO: renamed from: X */
    private final C28205u0 m21310X() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: Y */
    private final EnumC32861a m21311Y() {
        return (EnumC32861a) this.resolvedActivityType.getValue();
    }

    /* JADX INFO: renamed from: Z */
    private final String m21312Z() {
        return (String) this.startDate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public final C40548c m21313a0() {
        return (C40548c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final String m21314b0(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("internalActivityName");
    }

    /* JADX INFO: renamed from: c0 */
    private final boolean m21315c0() {
        return ((Boolean) this.isDeletable.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public static final boolean m21316d0(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getBoolean("isDeletable", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e0 */
    public static final C34911a m21317e0(EditActivityFragment editActivityFragment) {
        return AbstractC15751g.m44431K(editActivityFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public static final C34911a m21318f0(EditActivityFragment editActivityFragment) {
        return AbstractC15751g.m44431K(editActivityFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public static final C23454a0 m21319g0(final EditActivityFragment editActivityFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(editActivityFragment.m21313a0().getViewState(), new InterfaceC40549d.a(null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, false, null, 262143, null), null, c28655q, 0, 2);
            C39458b c39458b = new C39458b(AbstractC5583n.m16799z(editActivityFragment), editActivityFragment.getNavigator());
            C40548c c40548cM21313a0 = editActivityFragment.m21313a0();
            boolean zM87157i = c28655q.m87157i(editActivityFragment) | c28655q.m87157i(c39458b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = editActivityFragment.new C8703a(c39458b, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c40548cM21313a0);
            InterfaceC40549d interfaceC40549dM21320h0 = m21320h0(interfaceC28601c1M87260n);
            C28205u0 c28205u0M21310X = editActivityFragment.m21310X();
            InterfaceC41070a interfaceC41070aM21306T = editActivityFragment.m21306T();
            boolean zM87157i2 = c28655q.m87157i(editActivityFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(editActivityFragment) { // from class: ae1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditActivityFragment f2941x;

                    {
                        this.f2941x = editActivityFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return EditActivityFragment.m21321i0(this.f2941x, (InterfaceC40547b) obj);
                            default:
                                return EditActivityFragment.m21322j0(this.f2941x, (InterfaceC26456b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(editActivityFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(editActivityFragment) { // from class: ae1.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditActivityFragment f2941x;

                    {
                        this.f2941x = editActivityFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return EditActivityFragment.m21321i0(this.f2941x, (InterfaceC40547b) obj);
                            default:
                                return EditActivityFragment.m21322j0(this.f2941x, (InterfaceC26456b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(c39458b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C0103b(c39458b, 5);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC3173g.m9090W(interfaceC40549dM21320h0, c28205u0M21310X, interfaceC41070aM21306T, function1, function2, (Function1) objM87133R4, c28655q, C28205u0.f113964d << 3);
            C14923z onBackPressedDispatcher = editActivityFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = editActivityFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, editActivityFragment.new C8704b());
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: renamed from: h0 */
    private static final InterfaceC40549d m21320h0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC40549d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C23454a0 m21321i0(EditActivityFragment editActivityFragment, InterfaceC40547b it) {
        AbstractC22676k.m65750j(it, "it");
        editActivityFragment.m21313a0().m131452v(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final C23454a0 m21322j0(EditActivityFragment editActivityFragment, InterfaceC26456b it) {
        AbstractC22676k.m65750j(it, "it");
        editActivityFragment.m21313a0().m131451u(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C23454a0 m21323k0(C39458b c39458b, AbstractC39457a it) {
        AbstractC22676k.m65750j(it, "it");
        c39458b.m126006a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final EnumC32861a m21324l0(EditActivityFragment editActivityFragment) {
        EnumC32861a enumC32861aM103130a;
        String strM21305S = editActivityFragment.m21305S();
        return (strM21305S == null || (enumC32861aM103130a = EnumC32861a.INSTANCE.m103130a(strM21305S)) == null) ? EnumC32861a.SLEEP : enumC32861aM103130a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final String m21325m0(EditActivityFragment editActivityFragment) {
        return editActivityFragment.requireArguments().getString("startDate");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        String str;
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        C40548c c40548cM21313a0 = m21313a0();
        EnumC32861a enumC32861aM21311Y = m21311Y();
        String strM21312Z = m21312Z();
        if (strM21312Z == null) {
            strM21312Z = LocalDateTime.now().minusHours(1).toString();
            AbstractC22676k.m65749i(strM21312Z, "toString(...)");
        }
        String strM21307U = m21307U();
        if (strM21307U == null) {
            strM21307U = LocalDateTime.now().toString();
            AbstractC22676k.m65749i(strM21307U, "toString(...)");
        }
        String str2 = strM21307U;
        String strM21309W = m21309W();
        if (strM21309W == null) {
            strM21309W = "";
            str = strM21309W;
        } else {
            str = "";
        }
        EnumC32861a enumC32861aM21311Y2 = m21311Y();
        String strM21304R = m21304R();
        if (strM21304R == null) {
            strM21304R = str;
        }
        String strM21308V = m21308V();
        if (strM21308V != null) {
            str = strM21308V;
        }
        c40548cM21313a0.m131450q(enumC32861aM21311Y, new InterfaceC40547b.k(strM21312Z, str2, strM21309W, enumC32861aM21311Y2, strM21304R, str, m21315c0()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C0539c(this, 1), true, -736556772));
    }
}
