package com.whoop.design.showcase.gallery.view.fragment;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1565b0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cd1.C4444h;
import cd1.C4445i;
import com.squareup.wire.AbstractC5583n;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.showcase.navigation.DesignShowcaseMenuType;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13062m;
import f91.C14287e;
import ge3.AbstractC15751g;
import id1.C18412c;
import id1.C18414e;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.C12473e;
import p114eb.C12962i;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import yc1.C39431a;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R!\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/showcase/gallery/view/fragment/DesignShowcaseGalleryFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Lbc3/k1;", "H", "()Lbc3/k1;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "Ll83/a0;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcd1/i;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Leb/i;", "C", "()Lcd1/i;", "args", "Lyc1/a;", "<set-?>", "x", "Lcom/whoop/ui/b;", "D", "()Lyc1/a;", "G", "(Lyc1/a;)V", "binding", "Lid1/c;", "Lcom/whoop/design/showcase/navigation/DesignShowcaseMenuType;", "y", "Ll83/h;", "E", "()Lid1/c;", "viewModel", "design-showcase_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DesignShowcaseGalleryFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C12962i args = new C12962i(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C4445i.class), new C8680b(this));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C10462b binding = AbstractC10463c.m26726c(this, null, 1, null);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: z */
    static final /* synthetic */ InterfaceC21493z[] f25856z = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(DesignShowcaseGalleryFragment.class, "binding", "getBinding()Lcom/whoop/design/showcase/databinding/FragmentDesignShowcaseBinding;", 0))};

    /* JADX INFO: renamed from: E */
    public static final int f25855E = 8;

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$setupViewModel$1", m100430f = "DesignShowcaseGalleryFragment.kt", m100431l = {50}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8679a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f25860w;

        /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$a$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ DesignShowcaseGalleryFragment f25862w;

            public a(DesignShowcaseGalleryFragment designShowcaseGalleryFragment) {
                this.f25862w = designShowcaseGalleryFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C18414e c18414e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f25862w.m21206D().f169664b.setViewState(c18414e);
                return C23454a0.f92919a;
            }
        }

        public C8679a(InterfaceC30057d<? super C8679a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return DesignShowcaseGalleryFragment.this.new C8679a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C8679a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f25860w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13037f2 viewState = DesignShowcaseGalleryFragment.this.m21207E().getViewState();
                a aVar = new a(DesignShowcaseGalleryFragment.this);
                this.f25860w = 1;
                if (viewState.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$b */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Leb/h;", "Args", "Landroid/os/Bundle;", "invoke", "()Landroid/os/Bundle;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8680b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ AbstractComponentCallbacksC1320m0 f25863w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8680b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0) {
            super(0);
            this.f25863w = abstractComponentCallbacksC1320m0;
        }

        @Override // c93.InterfaceC4339a
        public final Bundle invoke() {
            Bundle arguments = this.f25863w.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(AbstractC11266d.m30463q(new StringBuilder("Fragment "), this.f25863w, " has null arguments"));
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$c */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8681c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25864w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8681c(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25864w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25864w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.design.showcase.gallery.view.fragment.DesignShowcaseGalleryFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8682d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25865w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25866x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25867y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25868z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8682d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25865w = componentCallbacks;
            this.f25866x = interfaceC35951a;
            this.f25867y = interfaceC4339a;
            this.f25868z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, id1.c<com.whoop.design.showcase.navigation.DesignShowcaseMenuType>] */
        @Override // c93.InterfaceC4339a
        public final C18412c<DesignShowcaseMenuType> invoke() {
            return AbstractC34132o.m107857B(this.f25865w, this.f25866x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C18412c.class), this.f25867y, this.f25868z);
        }
    }

    public DesignShowcaseGalleryFragment() {
        C35953c c35953cM40814c = C14287e.f52149a.m40814c();
        C4444h c4444h = new C4444h(this, 1);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8682d(this, c35953cM40814c, new C8681c(this), c4444h));
    }

    /* JADX INFO: renamed from: C */
    private final C4445i m21205C() {
        return (C4445i) this.args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public final C39431a m21206D() {
        return (C39431a) this.binding.getValue(this, f25856z[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public final C18412c<DesignShowcaseMenuType> m21207E() {
        return (C18412c) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m21208F(DesignShowcaseGalleryFragment designShowcaseGalleryFragment) {
        AbstractC5583n.m16799z(designShowcaseGalleryFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: G */
    private final void m21209G(C39431a c39431a) {
        this.binding.setValue(this, f25856z[0], c39431a);
    }

    /* JADX INFO: renamed from: H */
    private final InterfaceC3027k1 m21210H() {
        C1565b0 c1565b0M5020j = AbstractC1613o1.m5020j(this);
        return AbstractC3006f0.m8732z(c1565b0M5020j, null, null, new C12473e(c1565b0M5020j, new C8679a(null), (InterfaceC30057d) null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C34911a m21211I(DesignShowcaseGalleryFragment designShowcaseGalleryFragment) {
        return AbstractC15751g.m44431K(designShowcaseGalleryFragment.m21205C().m13892a());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        C39431a c39431aM125943c = C39431a.m125943c(inflater, container, false);
        AbstractC22676k.m65749i(c39431aM125943c, "inflate(...)");
        m21209G(c39431aM125943c);
        ConstraintLayout constraintLayoutM125944b = m21206D().getRoot();
        AbstractC22676k.m65749i(constraintLayoutM125944b, "getRoot(...)");
        return constraintLayoutM125944b;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m21206D().f169665c.setToolbarType(AbstractC6721d.INSTANCE.m20173a(AbstractC8693b.m21278l(m21205C().m13892a().getTitle())));
        m21206D().f169665c.setOnLeftButtonClick(new C4444h(this, 0));
        m21210H();
    }
}
