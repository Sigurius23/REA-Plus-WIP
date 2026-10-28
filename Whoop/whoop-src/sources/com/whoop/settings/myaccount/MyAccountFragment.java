package com.whoop.settings.myaccount;

import android.content.ComponentCallbacks;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import as2.AbstractC1953c;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.remote.domain.response.growth.AffiliateType;
import com.whoop.data.remote.domain.response.growth.MembershipStatus;
import com.whoop.data.remote.domain.response.growth.TrialDetails;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.ReferAFriendHubScreenModel;
import com.whoop.p069ui.AbstractC10463c;
import com.whoop.p069ui.C10462b;
import com.whoop.p069ui.WhoopNewToolbar;
import com.whoop.p069ui.pills.StrokedPillButton;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.settings.myaccount.MyAccountFragment;
import gb2.AbstractC15700b;
import gc2.EnumC15710a;
import ge3.AbstractC15751g;
import gy0.AbstractC16272a;
import h02.C16574h;
import hc2.C17155c;
import hc2.C17156d;
import hc2.C17157e;
import hc2.C17158f;
import hc2.C17159g;
import hc2.C17162j;
import hc2.C17163k;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21493z;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jf3.C21647a;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import na2.C26512a;
import na2.C26513b;
import ng0.C26679a;
import ng0.C26681c;
import oa2.C27756d;
import oa2.InterfaceC27755c;
import og0.InterfaceC27915a;
import or2.AbstractC28163g0;
import or2.C28216y;
import org.joda.time.LocalDateTime;
import org.xmlpull.v1.XmlPullParserException;
import p012ab.C0680g0;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p184h5.C16899o1;
import p184h5.C16905q1;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p399pb.InterfaceC29049f;
import p505ts.AbstractC34132o;
import p543v4.C35643b;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p705ea2.AbstractC12919p;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.AbstractC25303l;
import p743vy1.Function1;
import pa2.AbstractC29037a;
import pf.AbstractC29125c;
import py1.C29622a;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import t22.C33352b;
import tr2.InterfaceC34116n;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import w22.C36740a;
import w22.C36742c;
import wb3.AbstractC37056f;
import x22.InterfaceC37862a;
import x81.AbstractC38073e;
import y71.C39282o;
import z82.C40191e;
import z82.InterfaceC40188b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u000f\u0010+\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010\u0003R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00107\u001a\n 4*\u0004\u0018\u000103038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010/\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010/\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010/\u001a\u0004\bM\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010/\u001a\u0004\bR\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010/\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010/\u001a\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010/\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010/\u001a\u0004\bf\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010/\u001a\u0004\bk\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010/\u001a\u0004\bp\u0010qR\u001d\u0010w\u001a\u0004\u0018\u00010s8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010/\u001a\u0004\bu\u0010vR,\u0010\u0080\u0001\u001a\u00020x2\u0006\u0010y\u001a\u00020x8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0019\u0010\u0083\u0001\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0084\u0001"}, m65681d2 = {"Lcom/whoop/settings/myaccount/MyAccountFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", ProfileAnalyticsKt.VIEW, "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "y0", "j0", "O0", "C0", "I0", "n1", "Lhc2/k;", "viewState", "e1", "(Lhc2/k;)V", "Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;", "membershipStatus", "X0", "(Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)V", "P0", "Lcom/whoop/data/remote/domain/response/growth/AffiliateType;", "affiliateType", "V0", "(Lcom/whoop/data/remote/domain/response/growth/AffiliateType;)V", "g1", "o1", "c1", "R0", "r1", "M0", "Lhc2/j;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "w0", "()Lhc2/j;", "viewModel", "Lz82/e;", "kotlin.jvm.PlatformType", "x", "Lz82/e;", "eventDispatcher", "Ltr2/n;", "y", "Ltr2/n;", "logger", "Lj02/o0;", "z", "getNavigator", "()Lj02/o0;", "navigator", "Lor2/y;", "E", "getExternalLinkNavigator", "()Lor2/y;", "externalLinkNavigator", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "F", "o0", "()Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lna2/b;", "G", "q0", "()Lna2/b;", "headerNavigationRouter", "Lng0/c;", "H", "m0", "()Lng0/c;", "advancedLabsNavigationRouter", "Lng0/a;", "I", "l0", "()Lng0/a;", "advancedLabsActionRouter", "Lw22/c;", "J", "u0", "()Lw22/c;", "paymentMethodNavigationRouter", "Lw22/a;", "K", "s0", "()Lw22/a;", "paymentMethodActionRouter", "Lt22/b;", "L", "t0", "()Lt22/b;", "paymentMethodManagementAnalyticsHelper", "Lna2/a;", "M", "p0", "()Lna2/a;", "headerCtaEventHandler", "", "N", "r0", "()Z", "openFamilyPlan", "", "O", "v0", "()Ljava/lang/String;", "source", "Lgb2/b;", "<set-?>", "P", "Lcom/whoop/ui/b;", "n0", "()Lgb2/b;", "N0", "(Lgb2/b;)V", "binding", "Q", "Z", "shouldRefreshData", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class MyAccountFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: R */
    static final /* synthetic */ InterfaceC21493z[] f30547R = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(MyAccountFragment.class, "binding", "getBinding()Lcom/whoop/settings/databinding/FragmentMyAccountLandingBinding;", 0))};

    /* JADX INFO: renamed from: S */
    public static final int f30548S = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h externalLinkNavigator;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h headerNavigationRouter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC23462h advancedLabsNavigationRouter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC23462h advancedLabsActionRouter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC23462h paymentMethodNavigationRouter;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC23462h paymentMethodActionRouter;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC23462h paymentMethodManagementAnalyticsHelper;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC23462h headerCtaEventHandler;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC23462h openFamilyPlan;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC23462h source;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final C10462b binding;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean shouldRefreshData;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h viewModel = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C10137m(this, null, new C10136l(this), null));

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C40191e eventDispatcher = ((InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).getDispatcher();

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("MyAccountFragment");

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h navigator;

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C10125a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30566a;

        static {
            int[] iArr = new int[AffiliateType.values().length];
            try {
                iArr[AffiliateType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AffiliateType.COMMUNITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AffiliateType.PGA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30566a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10126b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30567w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30568x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30569y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10126b(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30567w = componentCallbacks;
            this.f30568x = interfaceC35951a;
            this.f30569y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, na2.a] */
        @Override // c93.InterfaceC4339a
        public final C26512a invoke() {
            ComponentCallbacks componentCallbacks = this.f30567w;
            InterfaceC35951a interfaceC35951a = this.f30568x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30569y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26512a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10127c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30570w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30571x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30572y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10127c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30570w = componentCallbacks;
            this.f30571x = interfaceC35951a;
            this.f30572y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            ComponentCallbacks componentCallbacks = this.f30570w;
            InterfaceC35951a interfaceC35951a = this.f30571x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30572y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10128d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30573w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30574x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30575y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10128d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30573w = componentCallbacks;
            this.f30574x = interfaceC35951a;
            this.f30575y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, or2.y] */
        @Override // c93.InterfaceC4339a
        public final C28216y invoke() {
            ComponentCallbacks componentCallbacks = this.f30573w;
            InterfaceC35951a interfaceC35951a = this.f30574x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30575y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28216y.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10129e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30576w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30577x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30578y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10129e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30576w = componentCallbacks;
            this.f30577x = interfaceC35951a;
            this.f30578y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.whoop.data.repositories.FeatureFlagRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagRepository invoke() {
            ComponentCallbacks componentCallbacks = this.f30576w;
            InterfaceC35951a interfaceC35951a = this.f30577x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30578y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10130f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30579w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30580x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30581y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10130f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30579w = componentCallbacks;
            this.f30580x = interfaceC35951a;
            this.f30581y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, na2.b] */
        @Override // c93.InterfaceC4339a
        public final C26513b invoke() {
            ComponentCallbacks componentCallbacks = this.f30579w;
            InterfaceC35951a interfaceC35951a = this.f30580x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30581y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26513b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10131g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30582w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30583x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30584y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10131g(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30582w = componentCallbacks;
            this.f30583x = interfaceC35951a;
            this.f30584y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ng0.c] */
        @Override // c93.InterfaceC4339a
        public final C26681c invoke() {
            ComponentCallbacks componentCallbacks = this.f30582w;
            InterfaceC35951a interfaceC35951a = this.f30583x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30584y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26681c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10132h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30585w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30586x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30587y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10132h(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30585w = componentCallbacks;
            this.f30586x = interfaceC35951a;
            this.f30587y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ng0.a] */
        @Override // c93.InterfaceC4339a
        public final C26679a invoke() {
            ComponentCallbacks componentCallbacks = this.f30585w;
            InterfaceC35951a interfaceC35951a = this.f30586x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30587y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26679a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10133i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30588w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30589x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30590y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10133i(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30588w = componentCallbacks;
            this.f30589x = interfaceC35951a;
            this.f30590y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w22.c] */
        @Override // c93.InterfaceC4339a
        public final C36742c invoke() {
            ComponentCallbacks componentCallbacks = this.f30588w;
            InterfaceC35951a interfaceC35951a = this.f30589x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30590y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36742c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10134j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30591w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30592x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30593y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10134j(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30591w = componentCallbacks;
            this.f30592x = interfaceC35951a;
            this.f30593y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w22.a] */
        @Override // c93.InterfaceC4339a
        public final C36740a invoke() {
            ComponentCallbacks componentCallbacks = this.f30591w;
            InterfaceC35951a interfaceC35951a = this.f30592x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30593y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C36740a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10135k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30594w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30595x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30596y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10135k(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f30594w = componentCallbacks;
            this.f30595x = interfaceC35951a;
            this.f30596y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, t22.b] */
        @Override // c93.InterfaceC4339a
        public final C33352b invoke() {
            ComponentCallbacks componentCallbacks = this.f30594w;
            InterfaceC35951a interfaceC35951a = this.f30595x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f30596y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C33352b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$l */
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "Ljf3/a;", "<anonymous>", "()Ljf3/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10136l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30597w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10136l(ComponentCallbacks componentCallbacks) {
            super(0);
            this.f30597w = componentCallbacks;
        }

        @Override // c93.InterfaceC4339a
        public final C21647a invoke() {
            ComponentCallbacks componentCallbacks = this.f30597w;
            InterfaceC1583f2 storeOwner = (InterfaceC1583f2) componentCallbacks;
            InterfaceC29049f interfaceC29049f = componentCallbacks instanceof InterfaceC29049f ? (InterfaceC29049f) componentCallbacks : null;
            AbstractC22676k.m65750j(storeOwner, "storeOwner");
            C1579e2 viewModelStore = storeOwner.getViewModelStore();
            AbstractC22676k.m65749i(viewModelStore, "storeOwner.viewModelStore");
            return new C21647a(viewModelStore, interfaceC29049f);
        }
    }

    /* JADX INFO: renamed from: com.whoop.settings.myaccount.MyAccountFragment$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"Landroidx/lifecycle/w1;", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10137m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f30598w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f30599x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f30600y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC4339a f30601z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10137m(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2) {
            super(0);
            this.f30598w = componentCallbacks;
            this.f30599x = interfaceC35951a;
            this.f30600y = interfaceC4339a;
            this.f30601z = interfaceC4339a2;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, hc2.j] */
        @Override // c93.InterfaceC4339a
        public final C17162j invoke() {
            return AbstractC34132o.m107857B(this.f30598w, this.f30599x, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17162j.class), this.f30600y, this.f30601z);
        }
    }

    public MyAccountFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navigator = AbstractC30060g.m92087G(enumC23463i, new C10127c(this, null, interfaceC4339a));
        this.externalLinkNavigator = AbstractC30060g.m92087G(enumC23463i, new C10128d(this, null, null));
        this.featureFlagRepository = AbstractC30060g.m92087G(enumC23463i, new C10129e(this, null, null));
        final int i14 = 1;
        this.headerNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10130f(this, null, new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        }));
        final int i15 = 2;
        this.advancedLabsNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10131g(this, null, new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        }));
        this.advancedLabsActionRouter = AbstractC30060g.m92087G(enumC23463i, new C10132h(this, null, null));
        final int i16 = 3;
        this.paymentMethodNavigationRouter = AbstractC30060g.m92087G(enumC23463i, new C10133i(this, null, new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        }));
        this.paymentMethodActionRouter = AbstractC30060g.m92087G(enumC23463i, new C10134j(this, null, null));
        this.paymentMethodManagementAnalyticsHelper = AbstractC30060g.m92087G(enumC23463i, new C10135k(this, null, null));
        this.headerCtaEventHandler = AbstractC30060g.m92087G(enumC23463i, new C10126b(this, null, null));
        final int i17 = 4;
        this.openFamilyPlan = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        });
        final int i18 = 5;
        this.source = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: hc2.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ MyAccountFragment f65871x;

            {
                this.f65871x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return MyAccountFragment.m25572H0(this.f65871x);
                    case 1:
                        return MyAccountFragment.m25653x0(this.f65871x);
                    case 2:
                        return MyAccountFragment.m25625i0(this.f65871x);
                    case 3:
                        return MyAccountFragment.m25580L0(this.f65871x);
                    case 4:
                        return Boolean.valueOf(MyAccountFragment.m25578K0(this.f65871x));
                    default:
                        return MyAccountFragment.m25590Q0(this.f65871x);
                }
            }
        });
        this.binding = AbstractC10463c.m26726c(this, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A0 */
    public static final C23454a0 m25558A0(MyAccountFragment myAccountFragment, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(myAccountFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17155c(myAccountFragment, 12);
                c28655q.m87172p0(objM87133R);
            }
            Function1.m117567x((p715kotlin.jvm.functions.Function1) objM87133R, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public static final C23454a0 m25560B0(MyAccountFragment myAccountFragment, String it) {
        AbstractC22676k.m65750j(it, "it");
        ((C29622a) AbstractC29125c.m88492A(myAccountFragment).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29622a.class), null)).m91023l(it);
        myAccountFragment.getNavigator().mo59393b(new AbstractC21155m0.c3("settings", null, 2, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C0 */
    private final void m25562C0() {
        m25635n0().f58966E.m26687n(new C17155c(this, 0));
        ConstraintLayout profileInformationLayout = m25635n0().f58973L;
        AbstractC22676k.m65749i(profileInformationLayout, "profileInformationLayout");
        AbstractC1953c.m5963a(profileInformationLayout, new C17155c(this, 8));
        ConstraintLayout changePasswordLayout = m25635n0().f59000n;
        AbstractC22676k.m65749i(changePasswordLayout, "changePasswordLayout");
        AbstractC1953c.m5963a(changePasswordLayout, new C17155c(this, 13));
        ConstraintLayout extendMembershipLayout = m25635n0().f59006t;
        AbstractC22676k.m65749i(extendMembershipLayout, "extendMembershipLayout");
        AbstractC1953c.m5963a(extendMembershipLayout, new C17155c(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final C23454a0 m25564D0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC5583n.m16799z(myAccountFragment).m36410z();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final C23454a0 m25566E0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.eventDispatcher.m129040k("Settings - My Account", "Profile Information", null);
        myAccountFragment.getNavigator().mo59393b(new AbstractC21155m0.w3(null, null, "my_account", null, 11, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final C23454a0 m25568F0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.eventDispatcher.m129040k("Settings - My Account", "Change Password", null);
        AbstractC28163g0.m85259o(myAccountFragment).m85338d(Uri.parse("android-app://com.whoop/changePassword"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final C23454a0 m25570G0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.eventDispatcher.m129015T();
        AbstractC28163g0.m85259o(myAccountFragment).m85338d(Uri.parse("android-app://com.whoop/extensions"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0 */
    public static final C34911a m25572H0(MyAccountFragment myAccountFragment) {
        return AbstractC15751g.m44431K(myAccountFragment.requireActivity());
    }

    /* JADX INFO: renamed from: I0 */
    private final void m25574I0() {
        m25652w0().m48443b0().observe(getViewLifecycleOwner(), new C10138a(new C17155c(this, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J0 */
    public static final C23454a0 m25576J0(MyAccountFragment myAccountFragment, C17163k c17163k) {
        myAccountFragment.m25600V0(c17163k.getAffiliateType());
        MembershipStatus membershipStatusM48463g = c17163k.getMembershipStatus();
        if (membershipStatusM48463g != null) {
            myAccountFragment.m25604X0(membershipStatusM48463g);
            myAccountFragment.m25588P0(membershipStatusM48463g);
        }
        myAccountFragment.m25622g1(c17163k);
        myAccountFragment.m25638o1();
        myAccountFragment.m25614c1();
        myAccountFragment.m25592R0();
        myAccountFragment.m25644r1();
        myAccountFragment.m25618e1(c17163k);
        myAccountFragment.m25636n1();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public static final boolean m25578K0(MyAccountFragment myAccountFragment) {
        Bundle arguments = myAccountFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("openFamilyPlan", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C34911a m25580L0(MyAccountFragment myAccountFragment) {
        return AbstractC15751g.m44431K(myAccountFragment.requireActivity(), AbstractC5583n.m16799z(myAccountFragment));
    }

    /* JADX INFO: renamed from: M0 */
    private final void m25582M0() {
        String strM25651v0 = m25651v0();
        if (strM25651v0 != null) {
            ((InterfaceC40188b) AbstractC29125c.m88492A(this).m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).mo41422d(null, "Open", null, "Settings - My Account", null, AbstractC31061c.m95645u("source", strM25651v0));
        }
    }

    /* JADX INFO: renamed from: N0 */
    private final void m25584N0(AbstractC15700b abstractC15700b) {
        this.binding.setValue(this, f30547R[0], abstractC15700b);
    }

    /* JADX INFO: renamed from: O0 */
    private final void m25586O0() {
        m25635n0().f58966E.setBackArrowResource(AbstractC16272a.f61979P1);
        m25635n0().f58966E.m26686l();
    }

    /* JADX INFO: renamed from: P0 */
    private final void m25588P0(MembershipStatus membershipStatus) {
        ConstraintLayout extendMembershipLayout = m25635n0().f59006t;
        AbstractC22676k.m65749i(extendMembershipLayout, "extendMembershipLayout");
        extendMembershipLayout.setVisibility(membershipStatus.isInSubscriptionPeriod() && m25652w0().m48446g0(EnumC15710a.EXTEND_MEMBERSHIP) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final String m25590Q0(MyAccountFragment myAccountFragment) {
        Bundle arguments = myAccountFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("source");
        }
        return null;
    }

    /* JADX INFO: renamed from: R0 */
    private final void m25592R0() {
        C17163k c17163k = (C17163k) m25652w0().m48443b0().getValue();
        C39282o c39282oM48459c = c17163k != null ? c17163k.getAdvancedLabsManagementItem() : null;
        ComposeView advancedLabsManagementLayout = m25635n0().f58987a;
        AbstractC22676k.m65749i(advancedLabsManagementLayout, "advancedLabsManagementLayout");
        advancedLabsManagementLayout.setVisibility(c39282oM48459c != null ? 0 : 8);
        if (c39282oM48459c != null) {
            m25635n0().f58987a.setContent(new C37816b(new C17158f(c39282oM48459c, this, 1), true, 1370543082));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C23454a0 m25594S0(C39282o c39282o, MyAccountFragment myAccountFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(657526885, c28655q, new C17158f(c39282o, myAccountFragment, 3)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C23454a0 m25596T0(C39282o c39282o, MyAccountFragment myAccountFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(c39282o) | c28655q.m87157i(myAccountFragment);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17159g(c39282o, myAccountFragment);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, C39282o.f168987q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C23454a0 m25598U0(C39282o c39282o, MyAccountFragment myAccountFragment, Object it) {
        AbstractC22676k.m65750j(it, "it");
        C9598e destination = c39282o.getDestination();
        if (destination != null) {
            InterfaceC27915a interfaceC27915aM79361c = myAccountFragment.m25631l0().m79361c(new InterfaceC27915a.d(destination));
            C26681c c26681cM25633m0 = myAccountFragment.m25633m0();
            AbstractC22676k.m65748h(interfaceC27915aM79361c, "null cannot be cast to non-null type com.whoop.advancedlabsmanagement.presentation.AdvancedLabsManagementEvent.NavigationEvent");
            c26681cM25633m0.m79363b((InterfaceC27915a.g) interfaceC27915aM79361c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: V0 */
    private final void m25600V0(AffiliateType affiliateType) {
        String string;
        int i13 = affiliateType == null ? -1 : C10125a.f30566a[affiliateType.ordinal()];
        if (i13 == 1) {
            string = getString(AbstractC12922s.f44582Q);
        } else if (i13 != 2) {
            string = i13 != 3 ? null : getString(AbstractC12922s.f44588W);
        } else {
            string = getString(AbstractC12922s.f44585T);
        }
        ConstraintLayout affiliateLayout = m25635n0().f58991e;
        AbstractC22676k.m65749i(affiliateLayout, "affiliateLayout");
        affiliateLayout.setVisibility(string != null ? 0 : 8);
        m25635n0().f58990d.setText(string);
        ConstraintLayout affiliateLayout2 = m25635n0().f58991e;
        AbstractC22676k.m65749i(affiliateLayout2, "affiliateLayout");
        AbstractC1953c.m5963a(affiliateLayout2, new C16574h(4, this, affiliateType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C23454a0 m25602W0(MyAccountFragment myAccountFragment, AffiliateType affiliateType, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.eventDispatcher.m128992H0(affiliateType != null ? affiliateType.getValue() : null);
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85418e(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: X0 */
    private final void m25604X0(MembershipStatus membershipStatus) {
        boolean z4 = m25637o0().isFeatureEnabled("validate-is-paying-member-android") && membershipStatus.isPayingMember();
        ConstraintLayout billingLayout = m25635n0().f58994h;
        AbstractC22676k.m65749i(billingLayout, "billingLayout");
        billingLayout.setVisibility((m25652w0().m48446g0(EnumC15710a.MEMBERSHIP_AND_BILLING) && z4) ? 0 : 8);
        ConstraintLayout billingLayout2 = m25635n0().f58994h;
        AbstractC22676k.m65749i(billingLayout2, "billingLayout");
        if (billingLayout2.getVisibility() == 0) {
            if (m25637o0().isFeatureEnabled("maverick-membership-management-android")) {
                m25635n0().f58992f.setImageDrawable(requireContext().getDrawable(AbstractC12919p.f44471e));
                m25635n0().f58993g.setText(getString(AbstractC12922s.f44586U));
                TextView billingSubtext = m25635n0().f58995i;
                AbstractC22676k.m65749i(billingSubtext, "billingSubtext");
                billingSubtext.setVisibility(0);
                m25635n0().f58995i.setText(getString(AbstractC12922s.f44587V));
                ConstraintLayout referAFriendLayout = m25635n0().f58980S;
                AbstractC22676k.m65749i(referAFriendLayout, "referAFriendLayout");
                referAFriendLayout.setVisibility(m25652w0().m48446g0(EnumC15710a.MY_ACCOUNT_REFER_A_FRIEND) ? 0 : 8);
                m25635n0().f58976O.setVisibility(0);
                ConstraintLayout referAFriendLayout2 = m25635n0().f58980S;
                AbstractC22676k.m65749i(referAFriendLayout2, "referAFriendLayout");
                AbstractC1953c.m5963a(referAFriendLayout2, new C17155c(this, 3));
                ConstraintLayout redeemGiftExtensionLayout = m25635n0().f58976O;
                AbstractC22676k.m65749i(redeemGiftExtensionLayout, "redeemGiftExtensionLayout");
                AbstractC1953c.m5963a(redeemGiftExtensionLayout, new C17155c(this, 4));
            } else {
                TextView billingSubtext2 = m25635n0().f58995i;
                AbstractC22676k.m65749i(billingSubtext2, "billingSubtext");
                billingSubtext2.setVisibility(8);
            }
            if (m25637o0().isFeatureEnabled("maverick-membership-management-android")) {
                ConstraintLayout billingLayout3 = m25635n0().f58994h;
                AbstractC22676k.m65749i(billingLayout3, "billingLayout");
                AbstractC1953c.m5963a(billingLayout3, new C17155c(this, 5));
            } else {
                ConstraintLayout billingLayout4 = m25635n0().f58994h;
                AbstractC22676k.m65749i(billingLayout4, "billingLayout");
                AbstractC1953c.m5963a(billingLayout4, new C17155c(this, 6));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C23454a0 m25606Y0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.m25652w0().m48453n0();
        myAccountFragment.getNavigator().mo59392a(new C9598e(AppScreen.C9444w4.f28018w, new ReferAFriendHubScreenModel((String) null, "MyAccount", (Integer) null, true, 5, (DefaultConstructorMarker) null), null, 4, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final C23454a0 m25608Z0(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.m25652w0().m48452m0();
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85430s(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C23454a0 m25610a1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.m25652w0().m48450k0();
        AbstractC28163g0.m85259o(myAccountFragment).m85338d(Uri.parse("android-app://com.whoop/membershipManagement?startDestination=MEMBERSHIP_AND_BILLING"));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final C23454a0 m25612b1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85419h(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c1 */
    private final void m25614c1() {
        ConstraintLayout cancelLayout = m25635n0().f58998l;
        AbstractC22676k.m65749i(cancelLayout, "cancelLayout");
        C17163k c17163k = (C17163k) m25652w0().m48443b0().getValue();
        cancelLayout.setVisibility((c17163k != null ? c17163k.getShowCancelMembershipButton() : false) && m25652w0().m48446g0(EnumC15710a.CANCEL_MEMBERSHIP) ? 0 : 8);
        ConstraintLayout cancelLayout2 = m25635n0().f58998l;
        AbstractC22676k.m65749i(cancelLayout2, "cancelLayout");
        AbstractC1953c.m5963a(cancelLayout2, new C17155c(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C23454a0 m25616d1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.shouldRefreshData = true;
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85420i(abstractActivityC1340r0RequireActivity);
        myAccountFragment.m25652w0().m48449j0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e1 */
    private final void m25618e1(C17163k viewState) {
        m25635n0().f59003q.setText(viewState.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String());
        ConstraintLayout editEmailLayout = m25635n0().f59002p;
        AbstractC22676k.m65749i(editEmailLayout, "editEmailLayout");
        AbstractC1953c.m5963a(editEmailLayout, new C17155c(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C23454a0 m25620f1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.eventDispatcher.m129040k("Settings - My Account", "Change Email", null);
        AbstractC28163g0.m85259o(myAccountFragment).m85342h("android-app://com.whoop/settings/editemail");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g1 */
    private final void m25622g1(C17163k viewState) {
        AbstractC15700b abstractC15700bM25635n0 = m25635n0();
        if (m25637o0().isFeatureEnabled(FeatureFlagRepositoryKt.MY_ACCOUNT_TRIALS_HEADER)) {
            abstractC15700bM25635n0.f59011y.setVisibility(8);
            C27756d c27756dM48464h = viewState.getMyAccountHeaderViewState();
            if (c27756dM48464h == null) {
                abstractC15700bM25635n0.f58965D.setVisibility(8);
                return;
            } else {
                abstractC15700bM25635n0.f58965D.setVisibility(0);
                abstractC15700bM25635n0.f58965D.setContent(new C37816b(new C17157e(this, c27756dM48464h, 0), true, -1900263823));
                return;
            }
        }
        if (!m25637o0().isFeatureEnabled(FeatureFlagRepositoryKt.TRIAL_CANCEL_SETTINGS)) {
            abstractC15700bM25635n0.f59011y.setVisibility(8);
            abstractC15700bM25635n0.f58965D.setVisibility(8);
            return;
        }
        abstractC15700bM25635n0.f58965D.setVisibility(8);
        TrialDetails trialDetailsM48468l = viewState.getTrialDetails();
        if (!m25637o0().isFeatureEnabled(FeatureFlagRepositoryKt.TRIAL_CANCEL_SETTINGS) || trialDetailsM48468l == null || !trialDetailsM48468l.getTrialCancellationEligible()) {
            abstractC15700bM25635n0.f59011y.setVisibility(8);
            return;
        }
        LocalDateTime trialEndDate = trialDetailsM48468l.getTrialEndDate();
        String string = trialEndDate != null ? trialEndDate.toString("MMM d, yyyy") : null;
        abstractC15700bM25635n0.f59011y.setVisibility(0);
        abstractC15700bM25635n0.f59009w.setText(getString(AbstractC12922s.f44630t));
        abstractC15700bM25635n0.f58962A.setText(getString(AbstractC12922s.f44632u));
        abstractC15700bM25635n0.f59012z.setText(getString(AbstractC12922s.f44634v, string));
        StrokedPillButton freeTrialButton = abstractC15700bM25635n0.f59009w;
        AbstractC22676k.m65749i(freeTrialButton, "freeTrialButton");
        AbstractC1953c.m5963a(freeTrialButton, new C17155c(this, 7));
    }

    private final C28216y getExternalLinkNavigator() {
        return (C28216y) this.externalLinkNavigator.getValue();
    }

    private final InterfaceC21159o0 getNavigator() {
        return (InterfaceC21159o0) this.navigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C23454a0 m25624h1(MyAccountFragment myAccountFragment, C27756d c27756d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(995206188, c28655q, new C17157e(myAccountFragment, c27756d, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final C34911a m25625i0(MyAccountFragment myAccountFragment) {
        return AbstractC15751g.m44431K(myAccountFragment.requireActivity(), AbstractC5583n.m16799z(myAccountFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C23454a0 m25626i1(MyAccountFragment myAccountFragment, C27756d c27756d, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(myAccountFragment);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C17155c(myAccountFragment, 14);
                c28655q.m87172p0(objM87133R);
            }
            p715kotlin.jvm.functions.Function1 function1 = (p715kotlin.jvm.functions.Function1) objM87133R;
            boolean zM87157i2 = c28655q.m87157i(myAccountFragment);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C17156d(myAccountFragment, 2);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC29037a.m88276g(c27756d, (InterfaceC4351m) objM87133R2, function1, c28655q, 0, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: j0 */
    private final void m25627j0() {
        C0680g0 c0680g0 = new C0680g0(this, 29);
        View root = m25635n0().getRoot();
        WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
        AbstractC16877h0.m47517l(root, c0680g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C23454a0 m25628j1(MyAccountFragment myAccountFragment, InterfaceC27755c it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.m25652w0().m48455p0(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final C16905q1 m25629k0(MyAccountFragment myAccountFragment, View view, C16905q1 windowInsets) {
        AbstractC22676k.m65750j(view, "<unused var>");
        AbstractC22676k.m65750j(windowInsets, "windowInsets");
        C16899o1 c16899o1 = windowInsets.f64864a;
        C35643b c35643bMo47530g = c16899o1.mo47530g(1);
        AbstractC22676k.m65749i(c35643bMo47530g, "getInsets(...)");
        C35643b c35643bMo47530g2 = c16899o1.mo47530g(2);
        AbstractC22676k.m65749i(c35643bMo47530g2, "getInsets(...)");
        WhoopNewToolbar myAccountToolbar = myAccountFragment.m25635n0().f58966E;
        AbstractC22676k.m65749i(myAccountToolbar, "myAccountToolbar");
        myAccountToolbar.setPadding(myAccountToolbar.getPaddingLeft(), c35643bMo47530g.f151450b, myAccountToolbar.getPaddingRight(), myAccountToolbar.getPaddingBottom());
        ComposeView advancedSecurityView = myAccountFragment.m25635n0().f58988b;
        AbstractC22676k.m65749i(advancedSecurityView, "advancedSecurityView");
        advancedSecurityView.setPadding(advancedSecurityView.getPaddingLeft(), advancedSecurityView.getPaddingTop(), advancedSecurityView.getPaddingRight(), c35643bMo47530g2.f151452d);
        return C16905q1.f64863b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C23454a0 m25630k1(MyAccountFragment myAccountFragment, C9598e navigationAction, String str) {
        AbstractC22676k.m65750j(navigationAction, "navigationAction");
        myAccountFragment.m25639p0().m78590a(navigationAction, str, new C17155c(myAccountFragment, 15));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l0 */
    private final C26679a m25631l0() {
        return (C26679a) this.advancedLabsActionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C23454a0 m25632l1(MyAccountFragment myAccountFragment, C9598e it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.m25641q0().m78591a(it);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m0 */
    private final C26681c m25633m0() {
        return (C26681c) this.advancedLabsNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C23454a0 m25634m1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85421j(abstractActivityC1340r0RequireActivity);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n0 */
    private final AbstractC15700b m25635n0() {
        return (AbstractC15700b) this.binding.getValue(this, f30547R[0]);
    }

    /* JADX INFO: renamed from: n1 */
    private final void m25636n1() {
        AbstractC15700b abstractC15700bM25635n0 = m25635n0();
        ConstraintLayout billingLayout = abstractC15700bM25635n0.f58994h;
        AbstractC22676k.m65749i(billingLayout, "billingLayout");
        ConstraintLayout extendMembershipLayout = abstractC15700bM25635n0.f59006t;
        AbstractC22676k.m65749i(extendMembershipLayout, "extendMembershipLayout");
        ComposeView advancedLabsManagementLayout = abstractC15700bM25635n0.f58987a;
        AbstractC22676k.m65749i(advancedLabsManagementLayout, "advancedLabsManagementLayout");
        ComposeView paymentMethodMenuItemLayout = abstractC15700bM25635n0.f58970I;
        AbstractC22676k.m65749i(paymentMethodMenuItemLayout, "paymentMethodMenuItemLayout");
        ConstraintLayout affiliateLayout = abstractC15700bM25635n0.f58991e;
        AbstractC22676k.m65749i(affiliateLayout, "affiliateLayout");
        ConstraintLayout referAFriendLayout = abstractC15700bM25635n0.f58980S;
        AbstractC22676k.m65749i(referAFriendLayout, "referAFriendLayout");
        ConstraintLayout redeemGiftExtensionLayout = abstractC15700bM25635n0.f58976O;
        AbstractC22676k.m65749i(redeemGiftExtensionLayout, "redeemGiftExtensionLayout");
        ConstraintLayout pauseLayout = abstractC15700bM25635n0.f58969H;
        AbstractC22676k.m65749i(pauseLayout, "pauseLayout");
        ConstraintLayout resumeLayout = abstractC15700bM25635n0.f58984W;
        AbstractC22676k.m65749i(resumeLayout, "resumeLayout");
        ConstraintLayout cancelLayout = abstractC15700bM25635n0.f58998l;
        AbstractC22676k.m65749i(cancelLayout, "cancelLayout");
        boolean z4 = true;
        List listM118959K = AbstractC37056f.m118959K(billingLayout, extendMembershipLayout, advancedLabsManagementLayout, paymentMethodMenuItemLayout, affiliateLayout, referAFriendLayout, redeemGiftExtensionLayout, pauseLayout, resumeLayout, cancelLayout);
        if (!(listM118959K instanceof Collection) || !listM118959K.isEmpty()) {
            Iterator it = listM118959K.iterator();
            do {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                }
            } while (((ViewGroup) it.next()).getVisibility() != 0);
        } else {
            z4 = false;
            break;
        }
        View membershipDivider = abstractC15700bM25635n0.f58963B;
        AbstractC22676k.m65749i(membershipDivider, "membershipDivider");
        membershipDivider.setVisibility(z4 ? 0 : 8);
        TextView membershipDividerText = abstractC15700bM25635n0.f58964C;
        AbstractC22676k.m65749i(membershipDividerText, "membershipDividerText");
        membershipDividerText.setVisibility(z4 ? 0 : 8);
    }

    /* JADX INFO: renamed from: o0 */
    private final FeatureFlagRepository m25637o0() {
        return (FeatureFlagRepository) this.featureFlagRepository.getValue();
    }

    /* JADX INFO: renamed from: o1 */
    private final void m25638o1() {
        m25652w0().m48447h0(m25651v0());
        ConstraintLayout pauseLayout = m25635n0().f58969H;
        AbstractC22676k.m65749i(pauseLayout, "pauseLayout");
        pauseLayout.setVisibility(m25652w0().m48444e0() ? 0 : 8);
        ConstraintLayout resumeLayout = m25635n0().f58984W;
        AbstractC22676k.m65749i(resumeLayout, "resumeLayout");
        resumeLayout.setVisibility(m25652w0().m48445f0() ? 0 : 8);
        ConstraintLayout pauseLayout2 = m25635n0().f58969H;
        AbstractC22676k.m65749i(pauseLayout2, "pauseLayout");
        AbstractC1953c.m5963a(pauseLayout2, new C17155c(this, 9));
        ConstraintLayout resumeLayout2 = m25635n0().f58984W;
        AbstractC22676k.m65749i(resumeLayout2, "resumeLayout");
        AbstractC1953c.m5963a(resumeLayout2, new C17155c(this, 10));
    }

    /* JADX INFO: renamed from: p0 */
    private final C26512a m25639p0() {
        return (C26512a) this.headerCtaEventHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public static final C23454a0 m25640p1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.shouldRefreshData = true;
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85428q(abstractActivityC1340r0RequireActivity);
        myAccountFragment.m25652w0().m48451l0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: q0 */
    private final C26513b m25641q0() {
        return (C26513b) this.headerNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final C23454a0 m25642q1(MyAccountFragment myAccountFragment, View it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.shouldRefreshData = true;
        C28216y externalLinkNavigator = myAccountFragment.getExternalLinkNavigator();
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = myAccountFragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        externalLinkNavigator.m85426o(abstractActivityC1340r0RequireActivity);
        myAccountFragment.m25652w0().m48454o0();
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r0 */
    private final boolean m25643r0() {
        return ((Boolean) this.openFamilyPlan.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: r1 */
    private final void m25644r1() {
        C17163k c17163k = (C17163k) m25652w0().m48443b0().getValue();
        C39282o c39282oM48465i = c17163k != null ? c17163k.getPaymentMethodMenuItem() : null;
        ComposeView paymentMethodMenuItemLayout = m25635n0().f58970I;
        AbstractC22676k.m65749i(paymentMethodMenuItemLayout, "paymentMethodMenuItemLayout");
        paymentMethodMenuItemLayout.setVisibility(c39282oM48465i != null ? 0 : 8);
        if (c39282oM48465i != null) {
            m25635n0().f58970I.setContent(new C37816b(new C17158f(c39282oM48465i, this, 0), true, 185683502));
        }
    }

    /* JADX INFO: renamed from: s0 */
    private final C36740a m25645s0() {
        return (C36740a) this.paymentMethodActionRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final C23454a0 m25646s1(C39282o c39282o, MyAccountFragment myAccountFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(-391506349, c28655q, new C17158f(c39282o, myAccountFragment, 2)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t0 */
    private final C33352b m25647t0() {
        return (C33352b) this.paymentMethodManagementAnalyticsHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C23454a0 m25648t1(C39282o c39282o, MyAccountFragment myAccountFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            boolean zM87157i = c28655q.m87157i(myAccountFragment) | c28655q.m87157i(c39282o);
            Object objM87133R = c28655q.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C17159g(myAccountFragment, c39282o);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(c39282o, null, null, (p715kotlin.jvm.functions.Function1) objM87133R, c28655q, C39282o.f168987q, 6);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u0 */
    private final C36742c m25649u0() {
        return (C36742c) this.paymentMethodNavigationRouter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final C23454a0 m25650u1(MyAccountFragment myAccountFragment, C39282o c39282o, Object it) {
        AbstractC22676k.m65750j(it, "it");
        myAccountFragment.shouldRefreshData = true;
        C17163k c17163k = (C17163k) myAccountFragment.m25652w0().m48443b0().getValue();
        myAccountFragment.m25647t0().m105777c(new InterfaceC37862a.q(c17163k != null ? c17163k.m48466j() : null));
        C9598e destination = c39282o.getDestination();
        if (destination != null) {
            InterfaceC37862a interfaceC37862aM117869d = myAccountFragment.m25645s0().m117869d(new InterfaceC37862a.b(destination));
            C36742c c36742cM25649u0 = myAccountFragment.m25649u0();
            AbstractC22676k.m65748h(interfaceC37862aM117869d, "null cannot be cast to non-null type com.whoop.payments.feature.paymentmethodmanagement.presentation.PaymentMethodManagementEvent.NavigationEvent");
            c36742cM25649u0.m117870a((InterfaceC37862a.n) interfaceC37862aM117869d);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: v0 */
    private final String m25651v0() {
        return (String) this.source.getValue();
    }

    /* JADX INFO: renamed from: w0 */
    private final C17162j m25652w0() {
        return (C17162j) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public static final C34911a m25653x0(MyAccountFragment myAccountFragment) {
        return AbstractC15751g.m44431K(myAccountFragment.requireActivity());
    }

    /* JADX INFO: renamed from: y0 */
    private final void m25655y0() {
        m25635n0().f58988b.setContent(new C37816b(new C17156d(this, 0), true, -99322340));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0 */
    public static final C23454a0 m25657z0(MyAccountFragment myAccountFragment, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            AbstractC38073e.m121966n(null, null, null, null, AbstractC37817c.m121344e(573790295, c28655q, new C17156d(myAccountFragment, 1)), c28655q, 24576, 15);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85256l(this);
        AbstractC28163g0.m85250f(this, this.logger);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        AbstractC15700b abstractC15700bM44180c = AbstractC15700b.m44180c(inflater, container, false);
        AbstractC22676k.m65747g(abstractC15700bM44180c);
        m25584N0(abstractC15700bM44180c);
        View root = abstractC15700bM44180c.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        if (this.shouldRefreshData) {
            this.shouldRefreshData = false;
            m25652w0().m48448i0();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onViewCreated(View view, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m25586O0();
        m25582M0();
        m25562C0();
        m25574I0();
        if (m25643r0()) {
            C28216y externalLinkNavigator = getExternalLinkNavigator();
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            externalLinkNavigator.m85422k(abstractActivityC1340r0RequireActivity);
        }
        m25627j0();
        m25655y0();
    }
}
