package com.whoop.education.view;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1583f2;
import aq0.C1904o;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ge3.AbstractC15751g;
import ie1.AbstractC18445c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.InterfaceC21159o0;
import java.util.Map;
import jf3.C21647a;
import kd1.AbstractC22387b0;
import kotlin.C1990b0;
import l83.C23454a0;
import l83.C23465k;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.C25272z;
import ne1.AbstractC26598a;
import ne1.C26599b;
import no0.C26954j0;
import oe1.AbstractC27873c;
import oe1.AbstractC27875e;
import oe1.C27872b;
import oe1.C27874d;
import oe1.InterfaceC27871a;
import or2.AbstractC28163g0;
import or2.AbstractC28188o1;
import or2.C28216y;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p236j.AbstractC21065d;
import p236j.C21062a;
import p329n0.C26057j;
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
import pp2.C29440d;
import q80.C30036h;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import re1.AbstractC31318e;
import re1.C31316c;
import re1.C31317d;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u0019\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0019\u001a\u0004\b6\u00107R\"\u0010;\u001a\u0010\u0012\f\u0012\n 9*\u0004\u0018\u00010\u001e0\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010 R\"\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\n0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002"}, m65681d2 = {"Lcom/whoop/education/view/EducationFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "", "propertyName", "W", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Loe1/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "L", "()Loe1/d;", "viewModel", "Lj/d;", "Landroid/content/Intent;", "x", "Lj/d;", "activityResultLauncher", "y", "Ljava/lang/String;", "featureEducationScreenName", "Lor2/y;", "z", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Loe1/b;", "E", "J", "()Loe1/b;", "analyticsHelper", "Lj02/o0;", "F", "getNavigator", "()Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "K", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "kotlin.jvm.PlatformType", "H", "videoActivityResultLauncher", "Lkotlin/Function1;", "I", "Lkotlin/jvm/functions/Function1;", "setFragmentResult", "a", "Loe1/e;", "viewState", "education_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EducationFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: K */
    public static final int f25967K = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h analyticsHelper;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final AbstractC21065d videoActivityResultLauncher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final Function1 setFragmentResult;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C8725g(this, null, new C8724f(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String featureEducationScreenName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8720b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25977w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25978x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25979y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8720b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25977w = componentCallbacks;
            this.f25978x = interfaceC35951a;
            this.f25979y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f25977w;
            InterfaceC35951a interfaceC35951a = this.f25978x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25979y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8721c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25980w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25981x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25982y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8721c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25980w = componentCallbacks;
            this.f25981x = interfaceC35951a;
            this.f25982y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oe1.b] */
        @Override // c93.InterfaceC4339a
        public final C27872b invoke() {
            ComponentCallbacks componentCallbacks = this.f25980w;
            InterfaceC35951a interfaceC35951a = this.f25981x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25982y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27872b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8722d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25983w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25984x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25985y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8722d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25983w = componentCallbacks;
            this.f25984x = interfaceC35951a;
            this.f25985y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f25983w;
            InterfaceC35951a interfaceC35951a = this.f25984x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25985y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8723e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25986w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25987x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8723e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f25986w = componentCallbacks;
            this.f25987x = interfaceC35951a;
            this.f25988y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            ComponentCallbacks componentCallbacks = this.f25986w;
            InterfaceC35951a interfaceC35951a = this.f25987x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f25988y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$f */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8724f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25989w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8724f(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f25989w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f25989w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.education.view.EducationFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C8725g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f25990w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f25991x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f25992y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f25993z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8725g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f25990w = componentCallbacks;
            this.f25991x = interfaceC35951a;
            this.f25992y = interfaceC4339a;
            this.f25993z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, oe1.d] */
        @Override // c93.InterfaceC4339a
        public final C27874d invoke() {
            return AbstractC34132o.m107857B(this.f25990w, this.f25991x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C27874d.class), this.f25992y, this.f25993z);
        }
    }

    public EducationFragment() {
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C8720b(this, null, null));
        this.analyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C8721c(this, null, null));
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C8722d(this, null, new C30036h(this, 13)));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C8723e(this, null, null));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new C1904o(this, 12));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.videoActivityResultLauncher = abstractC21065dRegisterForActivityResult;
        this.setFragmentResult = new C31317d(this, 0);
    }

    /* JADX INFO: renamed from: J */
    private final C27872b m21364J() {
        return (C27872b) this.analyticsHelper.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final FeatureFlagChecker m21365K() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final C27874d m21366L() {
        return (C27874d) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final C34911a m21367M(EducationFragment educationFragment) {
        return AbstractC15751g.m44431K(educationFragment.requireActivity());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final C23454a0 m21368N(EducationFragment educationFragment, String str, String str2, String str3, String str4, String str5, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(educationFragment) | c28655q.m87153g(str);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C31316c(educationFragment, str, 1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(educationFragment.m21366L().getViewState(), AbstractC27875e.b.f112409a, null, c28655q, 48, 2);
            educationFragment.m21366L().m84142p(new AbstractC27873c.a(str2));
            Context context = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            C27874d c27874dM21366L = educationFragment.m21366L();
            String str6 = educationFragment.featureEducationScreenName;
            if (str6 == null) {
                str6 = "";
            }
            AbstractC12939a0 abstractC12939a0M16799z = AbstractC5583n.m16799z(educationFragment);
            InterfaceC21159o0 navigator = educationFragment.getNavigator();
            AbstractC21065d abstractC21065d = educationFragment.activityResultLauncher;
            C28216y externalLinkNavigator = educationFragment.getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = educationFragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            C27872b c27872bM21364J = educationFragment.m21364J();
            boolean zM87157i2 = c28655q.m87157i(educationFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C31317d(educationFragment, 1);
                c28655q.m87172p0(objM87133R2);
            }
            C26599b c26599b = new C26599b(c27874dM21366L, str6, context, abstractC12939a0M16799z, navigator, abstractC21065d, externalLinkNavigator, abstractActivityC1340r0RequireActivity, c27872bM21364J, str, (Function1) objM87133R2);
            AbstractC27875e abstractC27875eM21370P = m21370P(interfaceC28601c1M87260n);
            boolean zM87157i3 = c28655q.m87157i(educationFragment) | c28655q.m87153g(str2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                objM87133R3 = new C31316c(educationFragment, str2, 2);
                c28655q.m87172p0(objM87133R3);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R3;
            boolean zM87157i4 = c28655q.m87157i(educationFragment) | c28655q.m87153g(str3) | c28655q.m87153g(str) | c28655q.m87153g(str4) | c28655q.m87153g(str5);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                C29440d c29440d = new C29440d(educationFragment, str3, str, str4, str5, 2);
                c28655q.m87172p0(c29440d);
                objM87133R4 = c29440d;
            }
            Function1 function1 = (Function1) objM87133R4;
            boolean zM87157i5 = c28655q.m87157i(c26599b) | c28655q.m87157i(educationFragment) | c28655q.m87153g(str);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C26954j0(c26599b, educationFragment, str, 25);
                c28655q.m87172p0(objM87133R5);
            }
            Function1 function2 = (Function1) objM87133R5;
            boolean zM87157i6 = c28655q.m87157i(educationFragment) | c28655q.m87153g(str5) | c28655q.m87153g(str);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i6 || objM87133R6 == c28676v0) {
                objM87133R6 = new C26057j(educationFragment, str5, str, 29);
                c28655q.m87172p0(objM87133R6);
            }
            AbstractC31318e.m96325b(abstractC27875eM21370P, interfaceC4339a, function1, function2, (InterfaceC4339a) objM87133R6, educationFragment.m21365K().isFeatureEnabled(FeatureFlagRepositoryKt.MEDIA_CARD_ARTICLE_TILE_MIGRATION), c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C23454a0 m21369O(EducationFragment educationFragment, String str) {
        educationFragment.setFragmentResult.invoke(str);
        AbstractC5583n.m16799z(educationFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: P */
    private static final AbstractC27875e m21370P(InterfaceC28670t2 interfaceC28670t2) {
        return (AbstractC27875e) interfaceC28670t2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C23454a0 m21371Q(EducationFragment educationFragment, String name) {
        AbstractC22676k.m65750j(name, "name");
        Toast.makeText(educationFragment.getActivity(), educationFragment.getString(AbstractC18445c.f71818c, name), 0).show();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C23454a0 m21372R(EducationFragment educationFragment, String str) {
        educationFragment.m21366L().m84142p(new AbstractC27873c.a(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C23454a0 m21373S(EducationFragment educationFragment, String str, String str2, String str3, String str4, int i13) {
        C27874d c27874dM21366L = educationFragment.m21366L();
        String str5 = educationFragment.featureEducationScreenName;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        if (str.length() == 0) {
            str = "Explainer Page";
        }
        c27874dM21366L.m84141n(new InterfaceC27871a.a(str6, null, str4, str, AbstractC25247g0.m73990Y(new C23465k("value", Integer.valueOf(i13)), new C23465k("Source", str2), new C23465k("Type", str3)), 2, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C23454a0 m21374T(C26599b c26599b, EducationFragment educationFragment, String str, AbstractC26598a event) {
        AbstractC22676k.m65750j(event, "event");
        c26599b.m79116d(event, new C31316c(educationFragment, str, 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public static final C23454a0 m21375U(EducationFragment educationFragment, String str) {
        educationFragment.setFragmentResult.invoke(str);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public static final C23454a0 m21376V(EducationFragment educationFragment, String str, String str2) {
        educationFragment.m21366L().m84141n(new InterfaceC27871a.f(null, null, str, null, AbstractC31061c.m95645u("Source", str2), 11, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: W */
    private final String m21377W(String propertyName) {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString(propertyName, "")) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final C23454a0 m21378X(EducationFragment educationFragment, String featureEducationEntryPoint) {
        C1601k1 c1601k1M36480b;
        AbstractC22676k.m65750j(featureEducationEntryPoint, "featureEducationEntryPoint");
        C12982q c12982qM36398m = AbstractC5583n.m16799z(educationFragment).m36398m();
        if (c12982qM36398m == null || (c1601k1M36480b = c12982qM36398m.m36480b()) == null) {
            return null;
        }
        c1601k1M36480b.m5004e(featureEducationEntryPoint, "EDUCATION_FRAGMENT_RESULT_TREND_NAME");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m21379Y(EducationFragment educationFragment, C21062a c21062a) {
        C27874d c27874dM21366L = educationFragment.m21366L();
        String str = educationFragment.featureEducationScreenName;
        if (str == null) {
            str = "";
        }
        c27874dM21366L.m84141n(new InterfaceC27871a.b(str, null, null, null, null, 30, null));
        Intent intent = c21062a.f79916x;
        if (intent == null || !intent.getBooleanExtra("USER_VIEWED_FULL_VIDEO", false)) {
            return;
        }
        C27874d c27874dM21366L2 = educationFragment.m21366L();
        String str2 = educationFragment.featureEducationScreenName;
        c27874dM21366L2.m84141n(new InterfaceC27871a.i(str2 == null ? "" : str2, null, null, null, null, 30, null));
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        this.activityResultLauncher = this.videoActivityResultLauncher;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String str;
        Map mapM95645u;
        AbstractC22676k.m65750j(inflater, "inflater");
        this.featureEducationScreenName = m21377W("screenName");
        String strM21377W = m21377W("path");
        String strM21377W2 = m21377W("articleId");
        String strM85312b = AbstractC28188o1.m85312b(m21377W("entryPoint"));
        String strM21377W3 = m21377W("eventName");
        String strM21377W4 = m21377W("contentType");
        C27874d c27874dM21366L = m21366L();
        String str2 = this.featureEducationScreenName;
        if (str2 == null) {
            str2 = "";
        }
        switch (strM85312b) {
            case "Recovery Deep Dive":
                str = "deep_dive_info";
                break;
            case "Pillar":
                str = "Pillar Info";
                break;
            case "Tile":
                str = "Onboarding Pillar Education Tile";
                break;
            case "Sleep Deep Dive":
                str = "deep_dive_info";
                break;
            case "workoutLibrary":
                str = "Strength Trainer";
                break;
            case "weightliftingDetails":
                str = "Activity Details";
                break;
            case "Strain Deep Dive":
                str = "deep_dive_info";
                break;
            default:
                str = strM85312b;
                break;
        }
        if (AbstractC22676k.m65745e(strM21377W, "STRAIN_VS_RECOVERY") || strM85312b.equals("Recovery Deep Dive") || strM85312b.equals("Strain Deep Dive") || strM85312b.equals("Sleep Deep Dive")) {
            mapM95645u = AbstractC31061c.m95645u("Source", strM85312b);
        } else if (AbstractC22676k.m65745e(strM21377W, "WU")) {
            mapM95645u = AbstractC31061c.m95645u("Source", AbstractC39421y.m125926K(strM85312b, " ", "_", false));
        } else if (strM85312b.equals("milestone pop")) {
            mapM95645u = AbstractC31061c.m95645u("source", "milestone_pop");
        } else {
            mapM95645u = (strM85312b.equals("data streak explainer") || AbstractC22676k.m65745e(strM21377W, "DATA_STREAK_EDUCATION")) ? AbstractC31061c.m95645u("source", "streaks_explainer_page") : C25272z.f99163w;
        }
        Map map = mapM95645u;
        c27874dM21366L.m84141n(new InterfaceC27871a.d(str2, null, str, null, map, 10, null));
        return AbstractC22387b0.m64387c(this, new C37816b(new C1990b0(this, strM85312b, strM21377W, strM21377W3, strM21377W4, strM21377W2, 8), true, -153907006));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getActivity();
    }
}
