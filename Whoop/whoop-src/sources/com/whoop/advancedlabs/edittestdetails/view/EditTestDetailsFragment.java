package com.whoop.advancedlabs.edittestdetails.view;

import ac0.AbstractC0736a;
import ac0.C0737b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc0.AbstractC2978a;
import bc0.AbstractC2980c;
import bc0.C2979b;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ci0.C4726a;
import ck1.C4780c;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment;
import dc0.AbstractC11903e;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import or2.C28205u0;
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
import ya0.C39355a;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/edittestdetails/view/EditTestDetailsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lbc0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lbc0/b;", "viewModel", "", "x", "J", "()Ljava/lang/String;", "testId", "Lor2/u0;", "y", "I", "()Lor2/u0;", "localizedDateTimeFormatter", "Lzr2/a;", "z", "H", "()Lzr2/a;", "dateAndTimeProvider", "Lya0/a;", "E", "G", "()Lya0/a;", "analyticsHelper", "Lbc0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditTestDetailsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5821f(this, null, new C5820e(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h testId;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h localizedDateTimeFormatter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h dateAndTimeProvider;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$onCreateView$1$1$1", m100430f = "EditTestDetailsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5816a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22970w;

        public C5816a(InterfaceC30057d<? super C5816a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EditTestDetailsFragment.this.new C5816a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5816a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22970w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM17430J = EditTestDetailsFragment.this.m17430J();
            if (strM17430J == null) {
                strM17430J = "";
            }
            EditTestDetailsFragment.this.m17431K().m8664n(new AbstractC2978a.a(strM17430J));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5817b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22972w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22973x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22974y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5817b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22972w = componentCallbacks;
            this.f22973x = interfaceC35951a;
            this.f22974y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.u0] */
        @Override // c93.InterfaceC4339a
        public final C28205u0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22972w;
            InterfaceC35951a interfaceC35951a = this.f22973x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22974y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28205u0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5818c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22975w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22976x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22977y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5818c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22975w = componentCallbacks;
            this.f22976x = interfaceC35951a;
            this.f22977y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, zr2.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC41070a invoke() {
            ComponentCallbacks componentCallbacks = this.f22975w;
            InterfaceC35951a interfaceC35951a = this.f22976x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22977y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5819d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22978w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22979x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22980y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5819d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22978w = componentCallbacks;
            this.f22979x = interfaceC35951a;
            this.f22980y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22978w;
            InterfaceC35951a interfaceC35951a = this.f22979x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22980y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$e */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5820e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22981w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5820e(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22981w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22981w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.edittestdetails.view.EditTestDetailsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5821f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22982w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22983x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22984y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22985z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5821f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22982w = componentCallbacks;
            this.f22983x = interfaceC35951a;
            this.f22984y = interfaceC4339a;
            this.f22985z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, bc0.b] */
        @Override // c93.InterfaceC4339a
        public final C2979b invoke() {
            return AbstractC34132o.m107857B(this.f22982w, this.f22983x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C2979b.class), this.f22984y, this.f22985z);
        }
    }

    public EditTestDetailsFragment() {
        final int i13 = 0;
        this.testId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: dc0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditTestDetailsFragment f38896x;

            {
                this.f38896x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return EditTestDetailsFragment.m17438R(this.f38896x);
                    default:
                        return EditTestDetailsFragment.m17432L(this.f38896x);
                }
            }
        });
        final int i14 = 1;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: dc0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditTestDetailsFragment f38896x;

            {
                this.f38896x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return EditTestDetailsFragment.m17438R(this.f38896x);
                    default:
                        return EditTestDetailsFragment.m17432L(this.f38896x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.localizedDateTimeFormatter = AbstractC30060g.m92087G(enumC23463i, new C5817b(this, null, interfaceC4339a));
        this.dateAndTimeProvider = AbstractC30060g.m92087G(enumC23463i, new C5818c(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5819d(this, null, null));
    }

    /* JADX INFO: renamed from: G */
    private final C39355a m17427G() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC41070a m17428H() {
        return (InterfaceC41070a) this.dateAndTimeProvider.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C28205u0 m17429I() {
        return (C28205u0) this.localizedDateTimeFormatter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final String m17430J() {
        return (String) this.testId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C2979b m17431K() {
        return (C2979b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final C34911a m17432L(EditTestDetailsFragment editTestDetailsFragment) {
        return AbstractC15751g.m44431K(editTestDetailsFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C23454a0 m17433M(final EditTestDetailsFragment editTestDetailsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C0737b(AbstractC5583n.m16799z(editTestDetailsFragment));
                c28655q.m87172p0(objM87133R);
            }
            C0737b c0737b = (C0737b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(editTestDetailsFragment.m17431K().getViewState(), AbstractC2980c.b.f11967b, null, c28655q, 48, 2);
            C2979b c2979bM17431K = editTestDetailsFragment.m17431K();
            boolean zM87157i = c28655q.m87157i(editTestDetailsFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = editTestDetailsFragment.new C5816a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c2979bM17431K);
            AbstractC2980c abstractC2980cM17434N = m17434N(interfaceC28601c1M87260n);
            InterfaceC41070a interfaceC41070aM17428H = editTestDetailsFragment.m17428H();
            boolean zM85383l = editTestDetailsFragment.m17429I().m85383l();
            boolean zM87157i2 = c28655q.m87157i(c0737b);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = new C4780c(c0737b, 20);
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(editTestDetailsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(editTestDetailsFragment) { // from class: dc0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditTestDetailsFragment f38898x;

                    {
                        this.f38898x = editTestDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return EditTestDetailsFragment.m17436P(this.f38898x, (InterfaceC22381a.c) obj);
                            default:
                                return EditTestDetailsFragment.m17437Q(this.f38898x, (AbstractC2978a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(editTestDetailsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(editTestDetailsFragment) { // from class: dc0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditTestDetailsFragment f38898x;

                    {
                        this.f38898x = editTestDetailsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return EditTestDetailsFragment.m17436P(this.f38898x, (InterfaceC22381a.c) obj);
                            default:
                                return EditTestDetailsFragment.m17437Q(this.f38898x, (AbstractC2978a) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC11903e.m32035p(abstractC2980cM17434N, interfaceC41070aM17428H, zM85383l, function1, function2, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: N */
    private static final AbstractC2980c m17434N(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC2980c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m17435O(C0737b c0737b, AbstractC0736a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c0737b.m1792a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m17436P(EditTestDetailsFragment editTestDetailsFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        editTestDetailsFragment.m17427G().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m17437Q(EditTestDetailsFragment editTestDetailsFragment, AbstractC2978a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        editTestDetailsFragment.m17431K().m8664n(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final String m17438R(EditTestDetailsFragment editTestDetailsFragment) {
        return editTestDetailsFragment.requireArguments().getString("testId");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C4726a(this, 21), true, 1996207030));
    }
}
