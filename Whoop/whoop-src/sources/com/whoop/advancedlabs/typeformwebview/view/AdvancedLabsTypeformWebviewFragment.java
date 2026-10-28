package com.whoop.advancedlabs.typeformwebview.view;

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
import com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ef0.AbstractC13142a;
import ef0.C13144c;
import ff0.AbstractC14424a;
import ff0.AbstractC14426c;
import ff0.C14425b;
import ge3.AbstractC15751g;
import hf0.C17233a;
import if0.AbstractC18452c;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.InterfaceC21159o0;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
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
import p708hb2.C17095c;
import p708hb2.C17098f;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010#\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u001fR\u001d\u0010&\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010\u001fR\u001d\u0010)\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010\u001fR\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,¨\u00062²\u0006\f\u00101\u001a\u0002008\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/typeformwebview/view/AdvancedLabsTypeformWebviewFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "Lff0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "R", "()Lff0/b;", "viewModel", "Lj02/o0;", "x", "getNavigator", "()Lj02/o0;", "navigator", "", "y", "Q", "()Ljava/lang/String;", QueryParams.URL, "z", "N", "testTokenId", "E", "O", "testType", "F", "P", "typeformUrl", "", "G", "Z", "hasNavigatedToConsent", "H", "hasInitialized", "Lff0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class AdvancedLabsTypeformWebviewFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h testType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h typeformUrl;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean hasNavigatedToConsent;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean hasInitialized;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5906e(this, null, new C5905d(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h url;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h testTokenId;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$onCreateView$1$1$1", m100430f = "AdvancedLabsTypeformWebviewFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5902a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23213w;

        public C5902a(InterfaceC30057d<? super C5902a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AdvancedLabsTypeformWebviewFragment.this.new C5902a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5902a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f23213w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (!AdvancedLabsTypeformWebviewFragment.this.hasInitialized) {
                AdvancedLabsTypeformWebviewFragment.this.hasInitialized = true;
                AdvancedLabsTypeformWebviewFragment.this.m17672R().m41138p(new AbstractC14424a.a(AdvancedLabsTypeformWebviewFragment.this.m17669O()));
                AdvancedLabsTypeformWebviewFragment.this.m17672R().m41138p(new AbstractC14424a.b(AdvancedLabsTypeformWebviewFragment.this.m17671Q(), AdvancedLabsTypeformWebviewFragment.this.m17668N(), AdvancedLabsTypeformWebviewFragment.this.m17669O()));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$onCreateView$1$2$1", m100430f = "AdvancedLabsTypeformWebviewFragment.kt", m100431l = {HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5903b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f23215w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C13144c f23217y;

        /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$onCreateView$1$2$1$1", m100430f = "AdvancedLabsTypeformWebviewFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lef0/a;", "navigationEvent", "Ll83/a0;", "<anonymous>", "(Lef0/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f23218w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f23219x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ AdvancedLabsTypeformWebviewFragment f23220y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C13144c f23221z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment, C13144c c13144c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f23220y = advancedLabsTypeformWebviewFragment;
                this.f23221z = c13144c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f23220y, this.f23221z, interfaceC30057d);
                aVar.f23219x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC13142a abstractC13142a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(abstractC13142a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                AbstractC13142a abstractC13142a = (AbstractC13142a) this.f23219x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f23218w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                if (abstractC13142a instanceof AbstractC13142a.c) {
                    this.f23220y.hasNavigatedToConsent = true;
                }
                this.f23221z.m36774a(abstractC13142a);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5903b(C13144c c13144c, InterfaceC30057d<? super C5903b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f23217y = c13144c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AdvancedLabsTypeformWebviewFragment.this.new C5903b(this.f23217y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5903b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f23215w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM41137n = AdvancedLabsTypeformWebviewFragment.this.m17672R().getNavigationEvent();
                a aVar = new a(AdvancedLabsTypeformWebviewFragment.this, this.f23217y, null);
                this.f23215w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058lM41137n, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5904c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23222w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23223x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23224y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5904c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f23222w = componentCallbacks;
            this.f23223x = interfaceC35951a;
            this.f23224y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f23222w;
            InterfaceC35951a interfaceC35951a = this.f23223x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f23224y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$d */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5905d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23225w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5905d(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f23225w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f23225w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.typeformwebview.view.AdvancedLabsTypeformWebviewFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5906e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f23226w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f23227x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f23228y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f23229z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5906e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f23226w = componentCallbacks;
            this.f23227x = interfaceC35951a;
            this.f23228y = interfaceC4339a;
            this.f23229z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, ff0.b] */
        @Override // c93.InterfaceC4339a
        public final C14425b invoke() {
            return AbstractC34132o.m107857B(this.f23226w, this.f23227x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14425b.class), this.f23228y, this.f23229z);
        }
    }

    public AdvancedLabsTypeformWebviewFragment() {
        final int i13 = 0;
        this.navigator = AbstractC30060g.m92087G(EnumC23463i.f92933w, new C5904c(this, null, new InterfaceC4339a(this) { // from class: if0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AdvancedLabsTypeformWebviewFragment f71869x;

            {
                this.f71869x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return AdvancedLabsTypeformWebviewFragment.m17673S(this.f71869x);
                    case 1:
                        return AdvancedLabsTypeformWebviewFragment.m17681a0(this.f71869x);
                    case 2:
                        return AdvancedLabsTypeformWebviewFragment.m17678X(this.f71869x);
                    case 3:
                        return AdvancedLabsTypeformWebviewFragment.m17679Y(this.f71869x);
                    default:
                        return AdvancedLabsTypeformWebviewFragment.m17680Z(this.f71869x);
                }
            }
        }));
        final int i14 = 1;
        this.url = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: if0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AdvancedLabsTypeformWebviewFragment f71869x;

            {
                this.f71869x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return AdvancedLabsTypeformWebviewFragment.m17673S(this.f71869x);
                    case 1:
                        return AdvancedLabsTypeformWebviewFragment.m17681a0(this.f71869x);
                    case 2:
                        return AdvancedLabsTypeformWebviewFragment.m17678X(this.f71869x);
                    case 3:
                        return AdvancedLabsTypeformWebviewFragment.m17679Y(this.f71869x);
                    default:
                        return AdvancedLabsTypeformWebviewFragment.m17680Z(this.f71869x);
                }
            }
        });
        final int i15 = 2;
        this.testTokenId = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: if0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AdvancedLabsTypeformWebviewFragment f71869x;

            {
                this.f71869x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return AdvancedLabsTypeformWebviewFragment.m17673S(this.f71869x);
                    case 1:
                        return AdvancedLabsTypeformWebviewFragment.m17681a0(this.f71869x);
                    case 2:
                        return AdvancedLabsTypeformWebviewFragment.m17678X(this.f71869x);
                    case 3:
                        return AdvancedLabsTypeformWebviewFragment.m17679Y(this.f71869x);
                    default:
                        return AdvancedLabsTypeformWebviewFragment.m17680Z(this.f71869x);
                }
            }
        });
        final int i16 = 3;
        this.testType = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: if0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AdvancedLabsTypeformWebviewFragment f71869x;

            {
                this.f71869x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return AdvancedLabsTypeformWebviewFragment.m17673S(this.f71869x);
                    case 1:
                        return AdvancedLabsTypeformWebviewFragment.m17681a0(this.f71869x);
                    case 2:
                        return AdvancedLabsTypeformWebviewFragment.m17678X(this.f71869x);
                    case 3:
                        return AdvancedLabsTypeformWebviewFragment.m17679Y(this.f71869x);
                    default:
                        return AdvancedLabsTypeformWebviewFragment.m17680Z(this.f71869x);
                }
            }
        });
        final int i17 = 4;
        this.typeformUrl = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: if0.a

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ AdvancedLabsTypeformWebviewFragment f71869x;

            {
                this.f71869x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return AdvancedLabsTypeformWebviewFragment.m17673S(this.f71869x);
                    case 1:
                        return AdvancedLabsTypeformWebviewFragment.m17681a0(this.f71869x);
                    case 2:
                        return AdvancedLabsTypeformWebviewFragment.m17678X(this.f71869x);
                    case 3:
                        return AdvancedLabsTypeformWebviewFragment.m17679Y(this.f71869x);
                    default:
                        return AdvancedLabsTypeformWebviewFragment.m17680Z(this.f71869x);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final String m17668N() {
        return (String) this.testTokenId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public final String m17669O() {
        return (String) this.testType.getValue();
    }

    /* JADX INFO: renamed from: P */
    private final String m17670P() {
        return (String) this.typeformUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final String m17671Q() {
        return (String) this.url.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public final C14425b m17672R() {
        return (C14425b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m17673S(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment) {
        return AbstractC15751g.m44431K(advancedLabsTypeformWebviewFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m17674T(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C13144c(AbstractC5583n.m16799z(advancedLabsTypeformWebviewFragment), advancedLabsTypeformWebviewFragment.getNavigator());
                c28655q.m87172p0(objM87133R);
            }
            C13144c c13144c = (C13144c) objM87133R;
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(advancedLabsTypeformWebviewFragment.m17672R().getViewState(), AbstractC14426c.c.f52649b, null, c28655q, 48, 2);
            C14425b c14425bM17672R = advancedLabsTypeformWebviewFragment.m17672R();
            boolean zM87157i = c28655q.m87157i(advancedLabsTypeformWebviewFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = advancedLabsTypeformWebviewFragment.new C5902a(null);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c14425bM17672R);
            C14425b c14425bM17672R2 = advancedLabsTypeformWebviewFragment.m17672R();
            boolean zM87157i2 = c28655q.m87157i(advancedLabsTypeformWebviewFragment) | c28655q.m87157i(c13144c);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i2 || objM87133R3 == c28676v0) {
                objM87133R3 = advancedLabsTypeformWebviewFragment.new C5903b(c13144c, null);
                c28655q.m87172p0(objM87133R3);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, c14425bM17672R2);
            String strM17670P = advancedLabsTypeformWebviewFragment.m17670P();
            AbstractC14426c abstractC14426cM17675U = m17675U(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(advancedLabsTypeformWebviewFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C17095c(advancedLabsTypeformWebviewFragment, 9);
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i4 = c28655q.m87157i(c13144c);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i4 || objM87133R5 == c28676v0) {
                objM87133R5 = new C17095c(c13144c, 10);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC18452c.m53191w(strM17670P, abstractC14426cM17675U, function1, (Function1) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: U */
    private static final AbstractC14426c m17675U(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC14426c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m17676V(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment, AbstractC14424a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        advancedLabsTypeformWebviewFragment.m17672R().m41138p(viewEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final C23454a0 m17677W(C13144c c13144c, AbstractC13142a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        c13144c.m36774a(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final String m17678X(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment) {
        return advancedLabsTypeformWebviewFragment.requireArguments().getString("testTokenId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final String m17679Y(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment) {
        return advancedLabsTypeformWebviewFragment.requireArguments().getString("testType");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final String m17680Z(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment) {
        return C17233a.f66224a.m48739a(advancedLabsTypeformWebviewFragment.m17671Q(), advancedLabsTypeformWebviewFragment.m17669O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final String m17681a0(AdvancedLabsTypeformWebviewFragment advancedLabsTypeformWebviewFragment) {
        return advancedLabsTypeformWebviewFragment.requireArguments().getString(QueryParams.URL);
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
    public void onResume() {
        super.onResume();
        if (this.hasNavigatedToConsent) {
            this.hasNavigatedToConsent = false;
            m17672R().m41138p(AbstractC14424a.e.f52610a);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 9), true, 2016835873));
    }
}
