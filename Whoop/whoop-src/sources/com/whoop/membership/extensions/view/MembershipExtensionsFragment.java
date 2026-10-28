package com.whoop.membership.extensions.view;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1577e0;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.membership.extensions.domain.models.CheckoutPayload;
import com.whoop.membership.extensions.domain.models.CtaAction;
import com.whoop.membership.extensions.view.MembershipExtensionsFragment;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import eu.C13620k;
import ew1.C13722a;
import ge3.AbstractC15751g;
import hw1.AbstractC17702a;
import hw1.C17703b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iw1.AbstractC20995a;
import iw1.AbstractC20997c;
import iw1.AbstractC20998d;
import iw1.AbstractC20999e;
import iw1.AbstractC21004j;
import iw1.AbstractC21005k;
import iw1.C21002h;
import iw1.InterfaceC20996b;
import iw1.InterfaceC21000f;
import iw1.InterfaceC21003i;
import jf3.C21647a;
import jp1.C21851c;
import kd1.AbstractC22387b0;
import kk1.C22541b;
import kw1.AbstractC22853d;
import kw1.AbstractC22856g;
import kw1.AbstractC22859j;
import kw1.AbstractC22866q;
import kw1.AbstractC22869t;
import kw1.C22865p;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import or2.AbstractC28163g0;
import p088dc.AbstractC11895b;
import p161g.AbstractC14917t;
import p161g.C14923z;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28670t2;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pf.AbstractC29125c;
import q22.C29855e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import uf3.C34911a;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u001d\u0010*\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010.R\u001b\u00102\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0018\u001a\u0004\b1\u0010.R\u001d\u00105\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0018\u001a\u0004\b4\u0010)R\u001d\u00108\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b7\u0010)R\u001b\u0010;\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0018\u001a\u0004\b:\u0010.R\u001d\u0010>\u001a\u0004\u0018\u00010&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0018\u001a\u0004\b=\u0010)R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0018\u001a\u0004\bA\u0010B¨\u0006E²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/membership/extensions/view/MembershipExtensionsFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "onResume", "Liw1/i;", "viewState", "C0", "(Liw1/i;)V", "D0", "Liw1/h;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "f0", "()Liw1/h;", "viewModel", "Lq22/e;", "x", "c0", "()Lq22/e;", "paymentsFormValidator", "Lhw1/b;", "y", "Z", "()Lhw1/b;", "navigationRouter", "", "z", "d0", "()Ljava/lang/String;", "promoCode", "", "E", "i0", "()Z", "isOnTrial", "F", "k0", "isReactivationUpsell", "G", "e0", "sku", "H", "b0", "path", "I", "g0", "isFromLto", "J", "a0", "newTier", "Lew1/a;", "K", "Y", "()Lew1/a;", "analyticsHelper", "currentViewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MembershipExtensionsFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h isOnTrial;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h isReactivationUpsell;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h sku;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h path;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h isFromLto;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h newTier;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h paymentsFormValidator;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h navigationRouter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h promoCode;

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C9086a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f27190a;

        static {
            int[] iArr = new int[EnumC1632v.values().length];
            try {
                iArr[EnumC1632v.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1632v.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27190a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$b */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.view.MembershipExtensionsFragment$onCreateView$1$1$1", m100430f = "MembershipExtensionsFragment.kt", m100431l = {61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9087b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27191w;

        /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ MembershipExtensionsFragment f27193w;

            public a(MembershipExtensionsFragment membershipExtensionsFragment) {
                this.f27193w = membershipExtensionsFragment;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC17702a abstractC17702a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                this.f27193w.m22681Z().m50668a(abstractC17702a);
                return C23454a0.f92919a;
            }
        }

        public C9087b(InterfaceC30057d<? super C9087b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MembershipExtensionsFragment.this.new C9087b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9087b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f27191w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l navigationEvents = MembershipExtensionsFragment.this.m22687f0().getNavigationEvents();
                a aVar = new a(MembershipExtensionsFragment.this);
                this.f27191w = 1;
                if (navigationEvents.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$c */
    @InterfaceC32271e(m100429c = "com.whoop.membership.extensions.view.MembershipExtensionsFragment$onCreateView$1$2$1", m100430f = "MembershipExtensionsFragment.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9088c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f27194w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f27196y;

        /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$c$a */
        @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/membership/extensions/view/MembershipExtensionsFragment$c$a", "Lg/t;", "Ll83/a0;", "d", "()V", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC14917t {

            /* JADX INFO: renamed from: d */
            final /* synthetic */ MembershipExtensionsFragment f27197d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ InterfaceC28670t2 f27198e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MembershipExtensionsFragment membershipExtensionsFragment, InterfaceC28670t2 interfaceC28670t2) {
                super(true);
                this.f27197d = membershipExtensionsFragment;
                this.f27198e = interfaceC28670t2;
            }

            @Override // p161g.AbstractC14917t
            /* JADX INFO: renamed from: d */
            public void mo4073d() {
                InterfaceC21003i interfaceC21003iM22697p0 = MembershipExtensionsFragment.m22697p0(this.f27198e);
                if (interfaceC21003iM22697p0 instanceof AbstractC21005k) {
                    this.f27197d.m22681Z().m50668a(AbstractC17702a.a.f68771a);
                    return;
                }
                if (interfaceC21003iM22697p0 instanceof AbstractC20998d) {
                    this.f27197d.m22681Z().m50668a(AbstractC17702a.a.f68771a);
                    return;
                }
                if (interfaceC21003iM22697p0 instanceof InterfaceC20996b) {
                    if (this.f27197d.m22692k0()) {
                        this.f27197d.m22687f0().m58549v(AbstractC20995a.b.f79358a, this.f27197d.m22685d0(), Boolean.valueOf(this.f27197d.m22690i0()));
                        return;
                    } else if (this.f27197d.m22688g0()) {
                        this.f27197d.m22681Z().m50668a(AbstractC17702a.a.f68771a);
                        return;
                    } else {
                        this.f27197d.m22687f0().m58549v(AbstractC20995a.c.f79359a, this.f27197d.m22685d0(), Boolean.valueOf(this.f27197d.m22690i0()));
                        return;
                    }
                }
                if (interfaceC21003iM22697p0 instanceof InterfaceC21000f.c) {
                    this.f27197d.m22681Z().m50668a(AbstractC17702a.a.f68771a);
                } else {
                    if (!(interfaceC21003iM22697p0 instanceof InterfaceC21000f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C21002h c21002hM22687f0 = this.f27197d.m22687f0();
                    InterfaceC21003i interfaceC21003iM22697p1 = MembershipExtensionsFragment.m22697p0(this.f27198e);
                    AbstractC22676k.m65748h(interfaceC21003iM22697p1, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsPostCheckoutViewState");
                    c21002hM22687f0.m58549v(new AbstractC20999e.a((InterfaceC21000f) interfaceC21003iM22697p1, CtaAction.DISMISS), this.f27197d.m22685d0(), Boolean.valueOf(this.f27197d.m22690i0()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9088c(InterfaceC28670t2 interfaceC28670t2, InterfaceC30057d<? super C9088c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f27196y = interfaceC28670t2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return MembershipExtensionsFragment.this.new C9088c(this.f27196y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C9088c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f27194w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C14923z onBackPressedDispatcher = MembershipExtensionsFragment.this.requireActivity().getOnBackPressedDispatcher();
            InterfaceC1585g0 viewLifecycleOwner = MembershipExtensionsFragment.this.getViewLifecycleOwner();
            AbstractC22676k.m65749i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            onBackPressedDispatcher.m43015a(viewLifecycleOwner, new a(MembershipExtensionsFragment.this, this.f27196y));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$d */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"com/whoop/membership/extensions/view/MembershipExtensionsFragment$d", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9089d implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC1577e0 f27200b;

        public C9089d(InterfaceC1577e0 interfaceC1577e0) {
            this.f27200b = interfaceC1577e0;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            MembershipExtensionsFragment.this.getViewLifecycleOwner().getLifecycle().mo4988d(this.f27200b);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9090e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27201w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27202x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27203y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9090e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27201w = componentCallbacks;
            this.f27202x = interfaceC35951a;
            this.f27203y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, q22.e] */
        @Override // c93.InterfaceC4339a
        public final C29855e invoke() {
            ComponentCallbacks componentCallbacks = this.f27201w;
            InterfaceC35951a interfaceC35951a = this.f27202x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27203y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29855e.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9091f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27204w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27205x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27206y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9091f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27204w = componentCallbacks;
            this.f27205x = interfaceC35951a;
            this.f27206y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hw1.b, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17703b invoke() {
            ComponentCallbacks componentCallbacks = this.f27204w;
            InterfaceC35951a interfaceC35951a = this.f27205x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27206y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17703b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9092g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27207w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27208x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27209y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9092g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f27207w = componentCallbacks;
            this.f27208x = interfaceC35951a;
            this.f27209y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ew1.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C13722a invoke() {
            ComponentCallbacks componentCallbacks = this.f27207w;
            InterfaceC35951a interfaceC35951a = this.f27208x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f27209y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C13722a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$h */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9093h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27210w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9093h(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f27210w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f27210w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.membership.extensions.view.MembershipExtensionsFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9094i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f27211w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f27212x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f27213y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f27214z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9094i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f27211w = componentCallbacks;
            this.f27212x = interfaceC35951a;
            this.f27213y = interfaceC4339a;
            this.f27214z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, iw1.h] */
        @Override // c93.InterfaceC4339a
        public final C21002h invoke() {
            return AbstractC34132o.m107857B(this.f27211w, this.f27212x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21002h.class), this.f27213y, this.f27214z);
        }
    }

    public MembershipExtensionsFragment() {
        C22865p c22865p = new C22865p(this, 1);
        this.viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C9094i(this, null, new C9093h(this), c22865p));
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.paymentsFormValidator = AbstractC30060g.m92087G(enumC23463i, new C9090e(this, null, null));
        this.navigationRouter = AbstractC30060g.m92087G(enumC23463i, new C9091f(this, null, new C22865p(this, 2)));
        this.promoCode = AbstractC30060g.m92088H(new C22865p(this, 3));
        this.isOnTrial = AbstractC30060g.m92088H(new C22865p(this, 4));
        this.isReactivationUpsell = AbstractC30060g.m92088H(new C22865p(this, 5));
        this.sku = AbstractC30060g.m92088H(new C22865p(this, 6));
        this.path = AbstractC30060g.m92088H(new C22865p(this, 7));
        this.isFromLto = AbstractC30060g.m92088H(new C22865p(this, 8));
        this.newTier = AbstractC30060g.m92088H(new C22865p(this, 9));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C9092g(this, null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final String m22651A0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getString("path");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public static final String m22653B0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getString("promoCode");
    }

    /* JADX INFO: renamed from: C0 */
    private final void m22655C0(InterfaceC21003i viewState) {
        if (!m22692k0() && AbstractC22866q.m66409a(viewState)) {
            m22687f0().m58549v(AbstractC20997c.e.f79400a, m22685d0(), Boolean.valueOf(m22690i0()));
        }
    }

    /* JADX INFO: renamed from: D0 */
    private final void m22657D0() {
        C21002h c21002hM22687f0 = m22687f0();
        String strM22686e0 = m22686e0();
        if (strM22686e0 == null) {
            strM22686e0 = "";
        }
        CheckoutPayload checkoutPayload = new CheckoutPayload(strM22686e0, m22685d0(), m22682a0());
        String strM22683b0 = m22683b0();
        C21002h.m58547w(c21002hM22687f0, new AbstractC20995a.e(checkoutPayload, strM22683b0 != null ? strM22683b0 : "", m22685d0()), null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final String m22659E0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getString("sku");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C34911a m22661F0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return AbstractC15751g.m44431K(membershipExtensionsFragment.m22681Z());
    }

    /* JADX INFO: renamed from: Y */
    private final C13722a m22680Y() {
        return (C13722a) this.analyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public final C17703b m22681Z() {
        return (C17703b) this.navigationRouter.getValue();
    }

    /* JADX INFO: renamed from: a0 */
    private final String m22682a0() {
        return (String) this.newTier.getValue();
    }

    /* JADX INFO: renamed from: b0 */
    private final String m22683b0() {
        return (String) this.path.getValue();
    }

    /* JADX INFO: renamed from: c0 */
    private final C29855e m22684c0() {
        return (C29855e) this.paymentsFormValidator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public final String m22685d0() {
        return (String) this.promoCode.getValue();
    }

    /* JADX INFO: renamed from: e0 */
    private final String m22686e0() {
        return (String) this.sku.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f0 */
    public final C21002h m22687f0() {
        return (C21002h) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final boolean m22688g0() {
        return ((Boolean) this.isFromLto.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final boolean m22689h0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getBoolean("isFromLto");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public final boolean m22690i0() {
        return ((Boolean) this.isOnTrial.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j0 */
    public static final boolean m22691j0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getBoolean("isOnTrial");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public final boolean m22692k0() {
        return ((Boolean) this.isReactivationUpsell.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public static final boolean m22693l0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getBoolean("isReactivationUpsell");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final C34911a m22694m0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return AbstractC15751g.m44431K(membershipExtensionsFragment.requireActivity(), AbstractC5583n.m16799z(membershipExtensionsFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public static final String m22695n0(MembershipExtensionsFragment membershipExtensionsFragment) {
        return membershipExtensionsFragment.requireArguments().getString("newTier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final C23454a0 m22696o0(final MembershipExtensionsFragment membershipExtensionsFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        boolean zM87135U = c28655q.m87135U(i13 & 1, (i13 & 3) != 2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zM87135U) {
            c28655q.m87138X();
            return c23454a0;
        }
        InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(membershipExtensionsFragment.m22687f0().getViewState(), AbstractC20998d.b.f79402a, null, c28655q, 48, 2);
        boolean zM87157i = c28655q.m87157i(membershipExtensionsFragment);
        Object objM87133R = c28655q.m87133R();
        C28676v0 c28676v0 = C28635l.f115821a;
        if (zM87157i || objM87133R == c28676v0) {
            objM87133R = membershipExtensionsFragment.new C9087b(null);
            c28655q.m87172p0(objM87133R);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
        boolean zM87157i2 = c28655q.m87157i(membershipExtensionsFragment) | c28655q.m87153g(interfaceC28601c1M87260n);
        Object objM87133R2 = c28655q.m87133R();
        if (zM87157i2 || objM87133R2 == c28676v0) {
            objM87133R2 = membershipExtensionsFragment.new C9088c(interfaceC28601c1M87260n, null);
            c28655q.m87172p0(objM87133R2);
        }
        AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
        InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(m22697p0(interfaceC28601c1M87260n), c28655q);
        InterfaceC1585g0 viewLifecycleOwner = membershipExtensionsFragment.getViewLifecycleOwner();
        boolean zM87157i3 = c28655q.m87157i(membershipExtensionsFragment) | c28655q.m87153g(interfaceC28601c1M87238F);
        Object objM87133R3 = c28655q.m87133R();
        if (zM87157i3 || objM87133R3 == c28676v0) {
            objM87133R3 = new C21851c(15, membershipExtensionsFragment, interfaceC28601c1M87238F);
            c28655q.m87172p0(objM87133R3);
        }
        AbstractC28683x.m87251e(viewLifecycleOwner, (Function1) objM87133R3, c28655q);
        InterfaceC21003i interfaceC21003iM22697p0 = m22697p0(interfaceC28601c1M87260n);
        if (interfaceC21003iM22697p0 instanceof AbstractC21005k) {
            c28655q.m87150e0(-846624604);
            InterfaceC21003i interfaceC21003iM22697p1 = m22697p0(interfaceC28601c1M87260n);
            AbstractC22676k.m65748h(interfaceC21003iM22697p1, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ReactivationUpsellLandingViewState");
            AbstractC21005k abstractC21005k = (AbstractC21005k) interfaceC21003iM22697p1;
            boolean zM87157i4 = c28655q.m87157i(membershipExtensionsFragment);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                final int i14 = 0;
                objM87133R4 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipExtensionsFragment f90129x;

                    {
                        this.f90129x = membershipExtensionsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                            case 1:
                                return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                            case 2:
                                return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                            case 3:
                                return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                            case 4:
                                return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                            default:
                                return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R4);
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(membershipExtensionsFragment);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                final int i15 = 1;
                objM87133R5 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipExtensionsFragment f90129x;

                    {
                        this.f90129x = membershipExtensionsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                            case 1:
                                return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                            case 2:
                                return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                            case 3:
                                return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                            case 4:
                                return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                            default:
                                return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC22869t.m66436q(abstractC21005k, function1, (Function1) objM87133R5, membershipExtensionsFragment.m22680Y(), c28655q, 0, 0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        if (interfaceC21003iM22697p0 instanceof AbstractC20998d) {
            c28655q.m87150e0(-846608493);
            InterfaceC21003i interfaceC21003iM22697p2 = m22697p0(interfaceC28601c1M87260n);
            AbstractC22676k.m65748h(interfaceC21003iM22697p2, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsLandingV2ViewState");
            AbstractC20998d abstractC20998d = (AbstractC20998d) interfaceC21003iM22697p2;
            boolean zM87157i6 = c28655q.m87157i(membershipExtensionsFragment);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                final int i16 = 2;
                objM87133R6 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipExtensionsFragment f90129x;

                    {
                        this.f90129x = membershipExtensionsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i16) {
                            case 0:
                                return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                            case 1:
                                return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                            case 2:
                                return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                            case 3:
                                return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                            case 4:
                                return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                            default:
                                return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R6);
            }
            Function1 function2 = (Function1) objM87133R6;
            boolean zM87157i7 = c28655q.m87157i(membershipExtensionsFragment);
            Object objM87133R7 = c28655q.m87133R();
            if (zM87157i7 || objM87133R7 == c28676v0) {
                final int i17 = 3;
                objM87133R7 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipExtensionsFragment f90129x;

                    {
                        this.f90129x = membershipExtensionsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i17) {
                            case 0:
                                return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                            case 1:
                                return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                            case 2:
                                return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                            case 3:
                                return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                            case 4:
                                return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                            default:
                                return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R7);
            }
            AbstractC22859j.m66382r(abstractC20998d, function2, (Function1) objM87133R7, c28655q, 0, 0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        if (!(interfaceC21003iM22697p0 instanceof InterfaceC20996b)) {
            if (!(interfaceC21003iM22697p0 instanceof InterfaceC21000f)) {
                throw AbstractC11895b.m32003v(-846625554, c28655q, false);
            }
            c28655q.m87150e0(-846564432);
            InterfaceC21003i interfaceC21003iM22697p3 = m22697p0(interfaceC28601c1M87260n);
            AbstractC22676k.m65748h(interfaceC21003iM22697p3, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsPostCheckoutViewState");
            InterfaceC21000f interfaceC21000f = (InterfaceC21000f) interfaceC21003iM22697p3;
            boolean zM87157i8 = c28655q.m87157i(membershipExtensionsFragment);
            Object objM87133R8 = c28655q.m87133R();
            if (zM87157i8 || objM87133R8 == c28676v0) {
                final int i18 = 5;
                objM87133R8 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                    /* JADX INFO: renamed from: x */
                    public final /* synthetic */ MembershipExtensionsFragment f90129x;

                    {
                        this.f90129x = membershipExtensionsFragment;
                    }

                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                            case 1:
                                return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                            case 2:
                                return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                            case 3:
                                return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                            case 4:
                                return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                            default:
                                return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                        }
                    }
                };
                c28655q.m87172p0(objM87133R8);
            }
            AbstractC22856g.m66341f(interfaceC21000f, (Function1) objM87133R8, membershipExtensionsFragment.m22688g0(), c28655q, 0, 0);
            c28655q.m87173q(false);
            return c23454a0;
        }
        c28655q.m87150e0(-846593468);
        InterfaceC21003i interfaceC21003iM22697p4 = m22697p0(interfaceC28601c1M87260n);
        AbstractC22676k.m65748h(interfaceC21003iM22697p4, "null cannot be cast to non-null type com.whoop.membership.extensions.presentation.ExtensionsCheckoutViewState");
        InterfaceC20996b interfaceC20996b = (InterfaceC20996b) interfaceC21003iM22697p4;
        C29855e c29855eM22684c0 = membershipExtensionsFragment.m22684c0();
        boolean zM87157i9 = c28655q.m87157i(membershipExtensionsFragment);
        Object objM87133R9 = c28655q.m87133R();
        if (zM87157i9 || objM87133R9 == c28676v0) {
            final int i19 = 4;
            objM87133R9 = new Function1(membershipExtensionsFragment) { // from class: kw1.o

                /* JADX INFO: renamed from: x */
                public final /* synthetic */ MembershipExtensionsFragment f90129x;

                {
                    this.f90129x = membershipExtensionsFragment;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i19) {
                        case 0:
                            return MembershipExtensionsFragment.m22703v0(this.f90129x, (AbstractC21004j) obj);
                        case 1:
                            return MembershipExtensionsFragment.m22704w0(this.f90129x, (AbstractC17702a) obj);
                        case 2:
                            return MembershipExtensionsFragment.m22705x0(this.f90129x, (AbstractC20997c) obj);
                        case 3:
                            return MembershipExtensionsFragment.m22707y0(this.f90129x, (AbstractC17702a) obj);
                        case 4:
                            return MembershipExtensionsFragment.m22709z0(this.f90129x, (AbstractC20995a) obj);
                        default:
                            return MembershipExtensionsFragment.m22699r0(this.f90129x, (AbstractC20999e) obj);
                    }
                }
            };
            c28655q.m87172p0(objM87133R9);
        }
        Function1 function3 = (Function1) objM87133R9;
        boolean zM87157i10 = c28655q.m87157i(membershipExtensionsFragment);
        Object objM87133R10 = c28655q.m87133R();
        if (zM87157i10 || objM87133R10 == c28676v0) {
            objM87133R10 = new C22865p(membershipExtensionsFragment, 0);
            c28655q.m87172p0(objM87133R10);
        }
        AbstractC22853d.m66330v(interfaceC20996b, c29855eM22684c0, function3, (InterfaceC4339a) objM87133R10, c28655q, C29855e.f122028d << 3, 0);
        c28655q.m87173q(false);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public static final InterfaceC21003i m22697p0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC21003i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public static final C23454a0 m22698q0(MembershipExtensionsFragment membershipExtensionsFragment) {
        if (membershipExtensionsFragment.m22692k0()) {
            membershipExtensionsFragment.m22687f0().m58549v(AbstractC20995a.b.f79358a, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        } else if (membershipExtensionsFragment.m22688g0()) {
            membershipExtensionsFragment.m22681Z().m50668a(AbstractC17702a.a.f68771a);
        } else {
            membershipExtensionsFragment.m22687f0().m58549v(AbstractC20995a.c.f79359a, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public static final C23454a0 m22699r0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC20999e it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22687f0().m58549v(it, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: s0 */
    private static final InterfaceC21003i m22700s0(InterfaceC28670t2 interfaceC28670t2) {
        return (InterfaceC21003i) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final InterfaceC28620h0 m22701t0(MembershipExtensionsFragment membershipExtensionsFragment, InterfaceC28670t2 interfaceC28670t2, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        C13620k c13620k = new C13620k(5, membershipExtensionsFragment, interfaceC28670t2);
        membershipExtensionsFragment.getViewLifecycleOwner().getLifecycle().mo4986a(c13620k);
        return membershipExtensionsFragment.new C9089d(c13620k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public static final void m22702u0(MembershipExtensionsFragment membershipExtensionsFragment, InterfaceC28670t2 interfaceC28670t2, InterfaceC1585g0 interfaceC1585g0, EnumC1632v event) {
        AbstractC22676k.m65750j(interfaceC1585g0, "<unused var>");
        AbstractC22676k.m65750j(event, "event");
        int i13 = C9086a.f27190a[event.ordinal()];
        if (i13 != 1) {
            if (i13 == 2 && !membershipExtensionsFragment.m22688g0()) {
                membershipExtensionsFragment.m22655C0(m22700s0(interfaceC28670t2));
                return;
            }
            return;
        }
        if (membershipExtensionsFragment.m22688g0()) {
            membershipExtensionsFragment.m22657D0();
        } else if (membershipExtensionsFragment.m22692k0()) {
            membershipExtensionsFragment.m22687f0().m58549v(AbstractC21004j.c.f79484a, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0 */
    public static final C23454a0 m22703v0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC21004j it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22687f0().m58549v(it, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w0 */
    public static final C23454a0 m22704w0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC17702a it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22681Z().m50668a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C23454a0 m22705x0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC20997c it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22687f0().m58549v(it, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final C23454a0 m22707y0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC17702a it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22681Z().m50668a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m22709z0(MembershipExtensionsFragment membershipExtensionsFragment, AbstractC20995a it) {
        AbstractC22676k.m65750j(it, "it");
        membershipExtensionsFragment.m22687f0().m58549v(it, membershipExtensionsFragment.m22685d0(), Boolean.valueOf(membershipExtensionsFragment.m22690i0()));
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C22541b(this, 3), true, -1967359348));
    }
}
