package com.whoop.add.activity.view;

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
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca0.AbstractC4359a;
import ca0.C4360b;
import ci0.C4726a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.add.activity.view.AddActivityFragment;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import da0.C11830c;
import da0.InterfaceC11829b;
import da0.InterfaceC11831d;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fa0.AbstractC14296c;
import ge3.AbstractC15751g;
import hj0.AbstractC17357p;
import io.getstream.chat.android.client.parser2.adapters.internal.StreamDateFormatter;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import n82.EnumC26455a;
import n82.InterfaceC26456b;
import or2.AbstractC28163g0;
import or2.C28205u0;
import org.joda.time.LocalDateTime;
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
import uf3.C34911a;
import vf3.InterfaceC35951a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001d\u0010(\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'R\u001d\u0010+\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010'R\u001d\u0010.\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0016\u001a\u0004\b-\u0010'R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u00102R\u001d\u00106\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010'¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/add/activity/view/AddActivityFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lda0/c;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "S", "()Lda0/c;", "viewModel", "Lzr2/a;", "x", "L", "()Lzr2/a;", "dateAndTimeProvider", "Lor2/u0;", "y", "P", "()Lor2/u0;", "localizedDateTimeFormatter", "", "z", "Q", "()Ljava/lang/String;", "screenType", "E", "R", "startDate", "F", "M", "endDate", "", "G", "N", "()Z", "gdcFlow", "H", "O", "internalActivityName", "Lda0/d;", "viewState", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AddActivityFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h startDate;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h endDate;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h gdcFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h internalActivityName;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5771f(this, null, new C5770e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h screenType;

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.add.activity.view.AddActivityFragment$onCreateView$1$1$1", m100430f = "AddActivityFragment.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5766a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22818w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C4360b f22820y;

        /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C4360b f22821w;

            public a(C4360b c4360b) {
                this.f22821w = c4360b;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC4359a abstractC4359a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f22821w.m13735a(abstractC4359a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5766a(C4360b c4360b, InterfaceC30057d<? super C5766a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22820y = c4360b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AddActivityFragment.this.new C5766a(this.f22820y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5766a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f22818w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM31733p = AddActivityFragment.this.m17234S().getNavigationEvents();
                a aVar = new a(this.f22820y);
                this.f22818w = 1;
                if (interfaceC13058lM31733p.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$b */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/add/activity/view/AddActivityFragment$b", "Lg/t;", "Ll83/a0;", "d", "()V", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C5767b extends AbstractC14917t {
        public C5767b() {
            super(true);
        }

        @Override // p161g.AbstractC14917t
        /* JADX INFO: renamed from: d */
        public void mo4073d() {
            AddActivityFragment.this.m17234S().m31735u(new InterfaceC11829b.b(false));
        }
    }

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5768c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22823w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22824x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22825y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5768c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22823w = componentCallbacks;
            this.f22824x = interfaceC35951a;
            this.f22825y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f22823w;
            InterfaceC35951a interfaceC35951a = this.f22824x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22825y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5769d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22826w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22827x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22828y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5769d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22826w = componentCallbacks;
            this.f22827x = interfaceC35951a;
            this.f22828y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22826w;
            InterfaceC35951a interfaceC35951a = this.f22827x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22828y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5770e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22829w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5770e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22829w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22829w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.add.activity.view.AddActivityFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5771f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22830w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22831x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22832y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22833z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5771f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22830w = componentCallbacks;
            this.f22831x = interfaceC35951a;
            this.f22832y = interfaceC4339a;
            this.f22833z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, da0.c] */
        @Override // c93.InterfaceC4339a
        public final C11830c invoke() {
            return AbstractC34132o.m107857B(this.f22830w, this.f22831x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C11830c.class), this.f22832y, this.f22833z);
        }
    }

    public AddActivityFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C5768c(this, null, null));
        final int i13 = 0;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i, new C5769d(this, null, new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        }));
        final int i14 = 1;
        this.screenType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        });
        final int i15 = 2;
        this.startDate = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        });
        final int i16 = 3;
        this.endDate = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        });
        final int i17 = 4;
        this.gdcFlow = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        });
        final int i18 = 5;
        this.internalActivityName = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ea0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AddActivityFragment f44387x;

            {
                this.f44387x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return AddActivityFragment.m17236U(this.f44387x);
                    case 1:
                        return AddActivityFragment.m17242a0(this.f44387x);
                    case 2:
                        return AddActivityFragment.m17243b0(this.f44387x);
                    case 3:
                        return AddActivityFragment.m17225J(this.f44387x);
                    case 4:
                        return Boolean.valueOf(AddActivityFragment.m17226K(this.f44387x));
                    default:
                        return AddActivityFragment.m17235T(this.f44387x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final String m17225J(AddActivityFragment addActivityFragment) {
        return addActivityFragment.requireArguments().getString("endDate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final boolean m17226K(AddActivityFragment addActivityFragment) {
        return addActivityFragment.requireArguments().getBoolean("GDCflow");
    }

    /* JADX INFO: renamed from: L */
    private final InterfaceC41070a m17227L() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: M */
    private final String m17228M() {
        return (String) this.endDate.getValue();
    }

    /* JADX INFO: renamed from: N */
    private final boolean m17229N() {
        return ((Boolean) this.gdcFlow.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: O */
    private final String m17230O() {
        return (String) this.internalActivityName.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final C28205u0 m17231P() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: renamed from: Q */
    private final String m17232Q() {
        return (String) this.screenType.getValue();
    }

    /* JADX INFO: renamed from: R */
    private final String m17233R() {
        return (String) this.startDate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public final C11830c m17234S() {
        return (C11830c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final String m17235T(AddActivityFragment addActivityFragment) {
        return addActivityFragment.requireArguments().getString("internalActivityName");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C34911a m17236U(AddActivityFragment addActivityFragment) {
        return AbstractC15751g.m44431K(addActivityFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m17237V(final AddActivityFragment addActivityFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(addActivityFragment.m17234S().getViewState(), new InterfaceC11831d.a(null, null, null, null, null, null, null, null, null, null, null, null, false, null, 16383, null), null, c28655q, 0, 2);
            C4360b c4360b = new C4360b(AbstractC5583n.m16799z(addActivityFragment));
            C11830c c11830cM17234S = addActivityFragment.m17234S();
            boolean zM87157i = c28655q.m87157i(addActivityFragment) | c28655q.m87157i(c4360b);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = addActivityFragment.new C5766a(c4360b, null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c11830cM17234S);
            InterfaceC11831d interfaceC11831dM17238W = m17238W(interfaceC28601c1M87260n);
            C28205u0 c28205u0M17231P = addActivityFragment.m17231P();
            InterfaceC41070a interfaceC41070aM17227L = addActivityFragment.m17227L();
            boolean zM87157i2 = c28655q.m87157i(addActivityFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(addActivityFragment) { // from class: ea0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ AddActivityFragment f44389x;

                    {
                        this.f44389x = addActivityFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return AddActivityFragment.m17239X(this.f44389x, (InterfaceC11829b) obj);
                            default:
                                return AddActivityFragment.m17240Y(this.f44389x, (InterfaceC26456b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(addActivityFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(addActivityFragment) { // from class: ea0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ AddActivityFragment f44389x;

                    {
                        this.f44389x = addActivityFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return AddActivityFragment.m17239X(this.f44389x, (InterfaceC11829b) obj);
                            default:
                                return AddActivityFragment.m17240Y(this.f44389x, (InterfaceC26456b) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(c4360b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                objM87133R4 = new C4780c(c4360b, 27);
                c28655q.m87172p0(objM87133R4);
            }
            AbstractC14296c.m40846I(interfaceC11831dM17238W, c28205u0M17231P, interfaceC41070aM17227L, function1, function2, (Function1) objM87133R4, c28655q, C28205u0.f113964d << 3);
            C14923z onBackPressedDispatcher = addActivityFragment.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = addActivityFragment.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, addActivityFragment.new C5767b());
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private static final InterfaceC11831d m17238W(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC11831d) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m17239X(AddActivityFragment addActivityFragment, InterfaceC11829b it) {
        AbstractC22676k.m65750j(it, "it");
        addActivityFragment.m17234S().m31735u(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final C23454a0 m17240Y(AddActivityFragment addActivityFragment, InterfaceC26456b it) {
        AbstractC22676k.m65750j(it, "it");
        addActivityFragment.m17234S().m31734t(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final C23454a0 m17241Z(C4360b c4360b, AbstractC4359a it) {
        AbstractC22676k.m65750j(it, "it");
        c4360b.m13735a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final String m17242a0(AddActivityFragment addActivityFragment) {
        return addActivityFragment.requireArguments().getString("screenType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b0 */
    public static final String m17243b0(AddActivityFragment addActivityFragment) {
        return addActivityFragment.requireArguments().getString("startDate");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        AbstractC17357p.m49141a(this);
        getActivity();
        C11830c c11830cM17234S = m17234S();
        String strM17232Q = m17232Q();
        if (strM17232Q == null) {
            strM17232Q = EnumC26455a.ALL.getValue();
        }
        String str = strM17232Q;
        String strM17233R = m17233R();
        if (strM17233R == null) {
            strM17233R = LocalDateTime.now().minusHours(1).toString(StreamDateFormatter.DATE_FORMAT);
        }
        AbstractC22676k.m65747g(strM17233R);
        String strM17228M = m17228M();
        if (strM17228M == null) {
            strM17228M = LocalDateTime.now().toString(StreamDateFormatter.DATE_FORMAT);
        }
        AbstractC22676k.m65747g(strM17228M);
        String strM17230O = m17230O();
        if (strM17230O == null) {
            strM17230O = "";
        }
        c11830cM17234S.m31735u(new InterfaceC11829b.g(str, strM17233R, strM17228M, strM17230O, m17229N()));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 27), true, 217588378));
    }
}
