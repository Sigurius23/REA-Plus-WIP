package com.whoop.advancedlabs.editbiomarkers.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
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
import vb0.AbstractC35866a;
import vb0.C35867b;
import vf3.InterfaceC35951a;
import w20.C36727q;
import wb0.AbstractC37036g;
import wb0.AbstractC37038i;
import wb0.C37037h;
import x30.C37894h1;
import ya0.C39355a;
import yb0.AbstractC39388k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(¨\u0006,²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/editbiomarkers/view/EditBiomarkersFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lwb0/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "K", "()Lwb0/h;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "", "y", "J", "()Ljava/lang/String;", "testId", "", "z", "L", "()Z", "isAiConfirmation", "Lya0/a;", "E", "I", "()Lya0/a;", "analyticsHelper", "Lwb0/i;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EditBiomarkersFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5815e(this, null, new C5814d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h testId;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h isAiConfirmation;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$onCreateView$1$1$1", m100430f = "EditBiomarkersFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5811a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22952w;

        public C5811a(InterfaceC30057d<? super C5811a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return EditBiomarkersFragment.this.new C5811a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5811a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22952w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            String strM17408J = EditBiomarkersFragment.this.m17408J();
            if (strM17408J == null) {
                strM17408J = "";
            }
            EditBiomarkersFragment.this.m17409K().m118880n(new AbstractC37036g.d(strM17408J, EditBiomarkersFragment.this.m17410L()));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5812b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22954w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22955x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22956y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5812b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22954w = componentCallbacks;
            this.f22955x = interfaceC35951a;
            this.f22956y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f22954w;
            InterfaceC35951a interfaceC35951a = this.f22955x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22956y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5813c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22957w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22958x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22959y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5813c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22957w = componentCallbacks;
            this.f22958x = interfaceC35951a;
            this.f22959y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22957w;
            InterfaceC35951a interfaceC35951a = this.f22958x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22959y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5814d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22960w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5814d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22960w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22960w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5815e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22961w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22962x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22963y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22964z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5815e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22961w = componentCallbacks;
            this.f22962x = interfaceC35951a;
            this.f22963y = interfaceC4339a;
            this.f22964z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, wb0.h] */
        @Override // c93.InterfaceC4339a
        public final C37037h invoke() {
            return AbstractC34132o.m107857B(this.f22961w, this.f22962x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37037h.class), this.f22963y, this.f22964z);
        }
    }

    public EditBiomarkersFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: yb0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditBiomarkersFragment f169461x;

            {
                this.f169461x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return EditBiomarkersFragment.m17412N(this.f169461x);
                    case 1:
                        return EditBiomarkersFragment.m17418T(this.f169461x);
                    default:
                        return Boolean.valueOf(EditBiomarkersFragment.m17411M(this.f169461x));
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C5812b(this, null, interfaceC4339a));
        final int i14 = 1;
        this.testId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: yb0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditBiomarkersFragment f169461x;

            {
                this.f169461x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return EditBiomarkersFragment.m17412N(this.f169461x);
                    case 1:
                        return EditBiomarkersFragment.m17418T(this.f169461x);
                    default:
                        return Boolean.valueOf(EditBiomarkersFragment.m17411M(this.f169461x));
                }
            }
        });
        final int i15 = 2;
        this.isAiConfirmation = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: yb0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ EditBiomarkersFragment f169461x;

            {
                this.f169461x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return EditBiomarkersFragment.m17412N(this.f169461x);
                    case 1:
                        return EditBiomarkersFragment.m17418T(this.f169461x);
                    default:
                        return Boolean.valueOf(EditBiomarkersFragment.m17411M(this.f169461x));
                }
            }
        });
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5813c(this, null, null));
    }

    /* JADX INFO: renamed from: I */
    private final C39355a m17407I() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public final String m17408J() {
        return (String) this.testId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public final C37037h m17409K() {
        return (C37037h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final boolean m17410L() {
        return ((Boolean) this.isAiConfirmation.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final boolean m17411M(EditBiomarkersFragment editBiomarkersFragment) {
        return editBiomarkersFragment.requireArguments().getBoolean("is_ai_confirmation", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C34911a m17412N(EditBiomarkersFragment editBiomarkersFragment) {
        return AbstractC15751g.m44431K(editBiomarkersFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m17413O(final EditBiomarkersFragment editBiomarkersFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C35867b(AbstractC5583n.m16799z(editBiomarkersFragment), editBiomarkersFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C35867b c35867b = (C35867b) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(editBiomarkersFragment.m17409K().getViewState(), AbstractC37038i.c.f158486b, null, c28655q, 48, 2);
            C37037h c37037hM17409K = editBiomarkersFragment.m17409K();
            boolean zM87157i = c28655q.m87157i(editBiomarkersFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = editBiomarkersFragment.new C5811a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c37037hM17409K);
            AbstractC37038i abstractC37038iM17414P = m17414P(interfaceC28601c1M87260n);
            boolean zM17410L = editBiomarkersFragment.m17410L();
            boolean zM87157i2 = c28655q.m87157i(editBiomarkersFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                final int i14 = 0;
                objM87133R3 = new Function1(editBiomarkersFragment) { // from class: yb0.i

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditBiomarkersFragment f169463x;

                    {
                        this.f169463x = editBiomarkersFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return EditBiomarkersFragment.m17415Q(this.f169463x, (InterfaceC22381a.c) obj);
                            default:
                                return EditBiomarkersFragment.m17417S(this.f169463x, (AbstractC37036g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function1 = (Function1) objM87133R3;
            boolean zM87157i3 = c28655q.m87157i(c35867b);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C37894h1(c35867b, 8);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function2 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(editBiomarkersFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(editBiomarkersFragment) { // from class: yb0.i

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ EditBiomarkersFragment f169463x;

                    {
                        this.f169463x = editBiomarkersFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return EditBiomarkersFragment.m17415Q(this.f169463x, (InterfaceC22381a.c) obj);
                            default:
                                return EditBiomarkersFragment.m17417S(this.f169463x, (AbstractC37036g) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC39388k.m125708e1(abstractC37038iM17414P, zM17410L, function1, function2, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final AbstractC37038i m17414P(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC37038i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m17415Q(EditBiomarkersFragment editBiomarkersFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        editBiomarkersFragment.m17407I().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m17416R(C35867b c35867b, AbstractC35866a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c35867b.m113852a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m17417S(EditBiomarkersFragment editBiomarkersFragment, AbstractC37036g viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        editBiomarkersFragment.m17409K().m118880n(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final String m17418T(EditBiomarkersFragment editBiomarkersFragment) {
        return editBiomarkersFragment.requireArguments().getString("test_id");
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C36727q(this, 14), true, 1767303745));
    }
}
