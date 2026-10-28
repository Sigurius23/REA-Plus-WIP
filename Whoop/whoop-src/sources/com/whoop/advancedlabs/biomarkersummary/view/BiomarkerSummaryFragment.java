package com.whoop.advancedlabs.biomarkersummary.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.activity.result.contract.ActivityResultContracts$CreateDocument;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import aq0.C1904o;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment;
import com.whoop.whoopaction.domain.models.Action;
import fb0.AbstractC14335a;
import fb0.C14336b;
import gb0.AbstractC15666a;
import gb0.AbstractC15668c;
import gb0.C15667b;
import ge3.AbstractC15751g;
import ib0.AbstractC18333d;
import ib0.C18330a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import jf0.C21640c;
import jf3.C21647a;
import kd0.InterfaceC22381a;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p236j.AbstractC21065d;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
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
import ya0.C39355a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b'\u0010(R\"\u0010.\u001a\u0010\u0012\f\u0012\n +*\u0004\u0018\u00010%0%0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/advancedlabs/biomarkersummary/view/BiomarkerSummaryFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lgb0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "N", "()Lgb0/b;", "viewModel", "Lfb0/b;", "x", "K", "()Lfb0/b;", "navRouter", "Lya0/a;", "y", "J", "()Lya0/a;", "analyticsHelper", "Ljf0/c;", "z", "M", "()Ljf0/c;", "textFileDownloadHelper", "", "E", "L", "()Ljava/lang/String;", "statusType", "Lj/d;", "kotlin.jvm.PlatformType", "F", "Lj/d;", "createDocumentLauncher", "Lgb0/c;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class BiomarkerSummaryFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h statusType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final AbstractC21065d createDocumentLauncher;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C5803g(this, null, new C5802f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h textFileDownloadHelper;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$createDocumentLauncher$1$1$1", m100430f = "BiomarkerSummaryFragment.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5797a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22893w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Uri f22895y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5797a(Uri uri, InterfaceC30057d<? super C5797a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22895y = uri;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BiomarkerSummaryFragment.this.new C5797a(this.f22895y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5797a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f22893w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21640c c21640cM17311M = BiomarkerSummaryFragment.this.m17311M();
                Context contextRequireContext = BiomarkerSummaryFragment.this.requireContext();
                AbstractC22676k.m65749i(contextRequireContext, "requireContext(...)");
                Uri uri = this.f22895y;
                this.f22893w = 1;
                if (c21640cM17311M.m60893a(contextRequireContext, uri, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$onCreateView$1$1$1", m100430f = "BiomarkerSummaryFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5798b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22896w;

        public C5798b(InterfaceC30057d<? super C5798b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return BiomarkerSummaryFragment.this.new C5798b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5798b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22896w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            BiomarkerSummaryFragment.this.m17312N().m43964n(AbstractC15666a.a.f58792a);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5799c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22898w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22899x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22900y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5799c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22898w = componentCallbacks;
            this.f22899x = interfaceC35951a;
            this.f22900y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [fb0.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C14336b invoke() {
            ComponentCallbacks componentCallbacks = this.f22898w;
            InterfaceC35951a interfaceC35951a = this.f22899x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22900y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14336b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5800d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22901w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22902x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22903y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5800d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22901w = componentCallbacks;
            this.f22902x = interfaceC35951a;
            this.f22903y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ya0.a] */
        @Override // c93.InterfaceC4339a
        public final C39355a invoke() {
            ComponentCallbacks componentCallbacks = this.f22901w;
            InterfaceC35951a interfaceC35951a = this.f22902x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22903y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39355a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5801e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22904w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22905x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22906y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5801e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f22904w = componentCallbacks;
            this.f22905x = interfaceC35951a;
            this.f22906y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jf0.c] */
        @Override // c93.InterfaceC4339a
        public final C21640c invoke() {
            ComponentCallbacks componentCallbacks = this.f22904w;
            InterfaceC35951a interfaceC35951a = this.f22905x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f22906y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21640c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5802f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22907w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5802f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f22907w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f22907w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.advancedlabs.biomarkersummary.view.BiomarkerSummaryFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5803g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f22908w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f22909x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f22910y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f22911z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5803g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f22908w = componentCallbacks;
            this.f22909x = interfaceC35951a;
            this.f22910y = interfaceC4339a;
            this.f22911z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, gb0.b] */
        @Override // c93.InterfaceC4339a
        public final C15667b invoke() {
            return AbstractC34132o.m107857B(this.f22908w, this.f22909x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C15667b.class), this.f22910y, this.f22911z);
        }
    }

    public BiomarkerSummaryFragment() {
        C18330a c18330a = new C18330a(this, 0);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C5799c(this, null, c18330a));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C5800d(this, null, null));
        this.textFileDownloadHelper = AbstractC30060g.m92087G(enumC23463i, new C5801e(this, null, null));
        this.statusType = AbstractC30060g.m92088H(new C18330a(this, 1));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$CreateDocument(MimeType.MIME_TYPE_TXT), new C1904o(this, 5));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.createDocumentLauncher = abstractC21065dRegisterForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m17307I(BiomarkerSummaryFragment biomarkerSummaryFragment, Uri uri) {
        if (uri != null) {
            AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(biomarkerSummaryFragment), null, null, biomarkerSummaryFragment.new C5797a(uri, null), 3);
        }
    }

    /* JADX INFO: renamed from: J */
    private final C39355a m17308J() {
        return (C39355a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final C14336b m17309K() {
        return (C14336b) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final String m17310L() {
        return (String) this.statusType.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public final C21640c m17311M() {
        return (C21640c) this.textFileDownloadHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public final C15667b m17312N() {
        return (C15667b) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m17313O(BiomarkerSummaryFragment biomarkerSummaryFragment) {
        return AbstractC15751g.m44431K(biomarkerSummaryFragment.requireActivity(), AbstractC5583n.m16799z(biomarkerSummaryFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m17314P(final BiomarkerSummaryFragment biomarkerSummaryFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(biomarkerSummaryFragment.m17312N().getViewState(), AbstractC15668c.b.f58816b, null, c28655q, 48, 2);
            C15667b c15667bM17312N = biomarkerSummaryFragment.m17312N();
            boolean zM87157i = c28655q.m87157i(biomarkerSummaryFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = biomarkerSummaryFragment.new C5798b(null);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c15667bM17312N);
            AbstractC15668c abstractC15668cM17315Q = m17315Q(interfaceC28601c1M87260n);
            String strM17310L = biomarkerSummaryFragment.m17310L();
            boolean zM87157i2 = c28655q.m87157i(biomarkerSummaryFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                final int i14 = 0;
                objM87133R2 = new Function1(biomarkerSummaryFragment) { // from class: ib0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerSummaryFragment f71346x;

                    {
                        this.f71346x = biomarkerSummaryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return BiomarkerSummaryFragment.m17316R(this.f71346x, (InterfaceC22381a.c) obj);
                            case 1:
                                return BiomarkerSummaryFragment.m17317S(this.f71346x, (AbstractC14335a) obj);
                            default:
                                return BiomarkerSummaryFragment.m17318T(this.f71346x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R2);
            }
            Function1 function1 = (Function1) objM87133R2;
            boolean zM87157i3 = c28655q.m87157i(biomarkerSummaryFragment);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                final int i15 = 1;
                objM87133R3 = new Function1(biomarkerSummaryFragment) { // from class: ib0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerSummaryFragment f71346x;

                    {
                        this.f71346x = biomarkerSummaryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return BiomarkerSummaryFragment.m17316R(this.f71346x, (InterfaceC22381a.c) obj);
                            case 1:
                                return BiomarkerSummaryFragment.m17317S(this.f71346x, (AbstractC14335a) obj);
                            default:
                                return BiomarkerSummaryFragment.m17318T(this.f71346x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R3);
            }
            Function1 function2 = (Function1) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(biomarkerSummaryFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i16 = 2;
                objM87133R4 = new Function1(biomarkerSummaryFragment) { // from class: ib0.b

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ BiomarkerSummaryFragment f71346x;

                    {
                        this.f71346x = biomarkerSummaryFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return BiomarkerSummaryFragment.m17316R(this.f71346x, (InterfaceC22381a.c) obj);
                            case 1:
                                return BiomarkerSummaryFragment.m17317S(this.f71346x, (AbstractC14335a) obj);
                            default:
                                return BiomarkerSummaryFragment.m17318T(this.f71346x, obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function3 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(biomarkerSummaryFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C18330a(biomarkerSummaryFragment, 2);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC18333d.m52752J(abstractC15668cM17315Q, strM17310L, function1, function2, function3, (InterfaceC4339a) objM87133R5, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private static final AbstractC15668c m17315Q(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC15668c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m17316R(BiomarkerSummaryFragment biomarkerSummaryFragment, InterfaceC22381a.c analyticEvent) {
        AbstractC22676k.m65750j(analyticEvent, "analyticEvent");
        biomarkerSummaryFragment.m17308J().m125496e(analyticEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m17317S(BiomarkerSummaryFragment biomarkerSummaryFragment, AbstractC14335a navEvent) {
        AbstractC22676k.m65750j(navEvent, "navEvent");
        biomarkerSummaryFragment.m17309K().m40954b(navEvent);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m17318T(BiomarkerSummaryFragment biomarkerSummaryFragment, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof Action) {
            biomarkerSummaryFragment.m17312N().m43964n(new AbstractC15666a.b((Action) event));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m17319U(BiomarkerSummaryFragment biomarkerSummaryFragment) {
        biomarkerSummaryFragment.m17308J().m125496e(InterfaceC22381a.o.f87433a);
        biomarkerSummaryFragment.createDocumentLauncher.mo4052a("biomarkers_export", null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final String m17320V(BiomarkerSummaryFragment biomarkerSummaryFragment) {
        return biomarkerSummaryFragment.requireArguments().getString("statusType");
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
        return AbstractC22387b0.m64387c(this, new C37816b(new C17098f(this, 5), true, 1938723402));
    }
}
