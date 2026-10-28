package com.whoop.archv2.feature.view;

import ag2.C0864a;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.p018ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.connect.client.contracts.HealthPermissionsRequestContract;
import aq0.C1904o;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.archv2.feature.domain.C6005m;
import com.whoop.archv2.feature.view.GenericFragment;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.whoopaction.domain.models.PermissionType;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21467g;
import java.util.List;
import java.util.Set;
import kd1.AbstractC22387b0;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.InterfaceC25007c;
import or2.AbstractC28163g0;
import p236j.AbstractC21065d;
import p236j.AbstractC21071j;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p739ui0.AbstractC35012n;
import p739ui0.C35010l;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qi0.C30406a;
import qi0.C30407b;
import qi0.C30409d;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import tx0.C34238a;
import uf3.C34911a;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R.\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020( )*\n\u0012\u0004\u0012\u00020(\u0018\u00010'0'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0013\u001a\u0004\b/\u00100R\u001b\u00105\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b3\u00104¨\u00067"}, m65681d2 = {"Lcom/whoop/archv2/feature/view/GenericFragment;", "Landroidx/fragment/app/m0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ll83/a0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Lqi0/d;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ll83/h;", "H", "()Lqi0/d;", "navRouter", "Lqi0/b;", "x", "I", "()Lqi0/b;", "parameterParser", "Ltr2/n;", "y", "G", "()Ltr2/n;", "logger", "Lm32/c;", "z", "L", "()Lm32/c;", "pushPermissionHelper", "Lj/d;", "", "", "kotlin.jvm.PlatformType", "E", "Lj/d;", "healthConnectPermissionsLauncher", "Lui0/l;", "F", "K", "()Lui0/l;", "permissionRequester", "Lqi0/b$a;", "J", "()Lqi0/b$a;", "params", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class GenericFragment extends AbstractComponentCallbacksC1320m0 {

    /* JADX INFO: renamed from: I */
    public static final int f24034I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final AbstractC21065d healthConnectPermissionsLauncher;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h permissionRequester;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h params;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC23462h navRouter;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h parameterParser;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h logger;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h pushPermissionHelper;

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.GenericFragment$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class C6015b extends C22672i implements InterfaceC4351m {
        public C6015b(Object obj) {
            super(2, 0, C35010l.class, obj, "request", "request(Lcom/whoop/whoopaction/domain/models/PermissionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(PermissionType permissionType, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C35010l) this.receiver).m110563g(permissionType, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.GenericFragment$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6016c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24042w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24043x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24044y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6016c(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24042w = componentCallbacks;
            this.f24043x = interfaceC35951a;
            this.f24044y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qi0.d] */
        @Override // c93.InterfaceC4339a
        public final C30409d invoke() {
            ComponentCallbacks componentCallbacks = this.f24042w;
            InterfaceC35951a interfaceC35951a = this.f24043x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24044y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30409d.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.GenericFragment$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6017d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24045w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24046x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24047y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6017d(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24045w = componentCallbacks;
            this.f24046x = interfaceC35951a;
            this.f24047y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, qi0.b] */
        @Override // c93.InterfaceC4339a
        public final C30407b invoke() {
            ComponentCallbacks componentCallbacks = this.f24045w;
            InterfaceC35951a interfaceC35951a = this.f24046x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24047y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30407b.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.GenericFragment$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6018e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24048w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24049x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24050y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6018e(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24048w = componentCallbacks;
            this.f24049x = interfaceC35951a;
            this.f24050y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, m32.c] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25007c invoke() {
            ComponentCallbacks componentCallbacks = this.f24048w;
            InterfaceC35951a interfaceC35951a = this.f24049x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24050y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25007c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.archv2.feature.view.GenericFragment$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C6019f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ ComponentCallbacks f24051w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f24052x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f24053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6019f(ComponentCallbacks componentCallbacks, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f24051w = componentCallbacks;
            this.f24052x = interfaceC35951a;
            this.f24053y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ui0.l] */
        @Override // c93.InterfaceC4339a
        public final C35010l invoke() {
            ComponentCallbacks componentCallbacks = this.f24051w;
            InterfaceC35951a interfaceC35951a = this.f24052x;
            return AbstractC29125c.m88492A(componentCallbacks).m122602a(this.f24053y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35010l.class), interfaceC35951a);
        }
    }

    public GenericFragment() {
        final int i13 = 0;
        InterfaceC4339a interfaceC4339a = new InterfaceC4339a(this) { // from class: ui0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GenericFragment f148082x;

            {
                this.f148082x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return GenericFragment.m18064O(this.f148082x);
                    case 1:
                        return GenericFragment.m18063N(this.f148082x);
                    case 2:
                        return GenericFragment.m18069T(this.f148082x);
                    case 3:
                        return GenericFragment.m18068S(this.f148082x);
                    default:
                        return GenericFragment.m18067R(this.f148082x);
                }
            }
        };
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.navRouter = AbstractC30060g.m92087G(enumC23463i, new C6016c(this, null, interfaceC4339a));
        this.parameterParser = AbstractC30060g.m92087G(enumC23463i, new C6017d(this, null, null));
        final int i14 = 1;
        this.logger = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ui0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GenericFragment f148082x;

            {
                this.f148082x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return GenericFragment.m18064O(this.f148082x);
                    case 1:
                        return GenericFragment.m18063N(this.f148082x);
                    case 2:
                        return GenericFragment.m18069T(this.f148082x);
                    case 3:
                        return GenericFragment.m18068S(this.f148082x);
                    default:
                        return GenericFragment.m18067R(this.f148082x);
                }
            }
        });
        final int i15 = 2;
        this.pushPermissionHelper = AbstractC30060g.m92087G(enumC23463i, new C6018e(this, new C35953c("push-notification-permission-helper"), new InterfaceC4339a(this) { // from class: ui0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GenericFragment f148082x;

            {
                this.f148082x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return GenericFragment.m18064O(this.f148082x);
                    case 1:
                        return GenericFragment.m18063N(this.f148082x);
                    case 2:
                        return GenericFragment.m18069T(this.f148082x);
                    case 3:
                        return GenericFragment.m18068S(this.f148082x);
                    default:
                        return GenericFragment.m18067R(this.f148082x);
                }
            }
        }));
        AbstractC21065d abstractC21065dRegisterForActivityResult = registerForActivityResult(new HealthPermissionsRequestContract("com.google.android.apps.healthdata"), new C1904o(this, 16));
        AbstractC22676k.m65749i(abstractC21065dRegisterForActivityResult, "registerForActivityResult(...)");
        this.healthConnectPermissionsLauncher = abstractC21065dRegisterForActivityResult;
        final int i16 = 3;
        this.permissionRequester = AbstractC30060g.m92087G(enumC23463i, new C6019f(this, null, new InterfaceC4339a(this) { // from class: ui0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GenericFragment f148082x;

            {
                this.f148082x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return GenericFragment.m18064O(this.f148082x);
                    case 1:
                        return GenericFragment.m18063N(this.f148082x);
                    case 2:
                        return GenericFragment.m18069T(this.f148082x);
                    case 3:
                        return GenericFragment.m18068S(this.f148082x);
                    default:
                        return GenericFragment.m18067R(this.f148082x);
                }
            }
        }));
        final int i17 = 4;
        this.params = AbstractC30060g.m92088H(new InterfaceC4339a(this) { // from class: ui0.h

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ GenericFragment f148082x;

            {
                this.f148082x = this;
            }

            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return GenericFragment.m18064O(this.f148082x);
                    case 1:
                        return GenericFragment.m18063N(this.f148082x);
                    case 2:
                        return GenericFragment.m18069T(this.f148082x);
                    case 3:
                        return GenericFragment.m18068S(this.f148082x);
                    default:
                        return GenericFragment.m18067R(this.f148082x);
                }
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private final InterfaceC34116n m18056G() {
        return (InterfaceC34116n) this.logger.getValue();
    }

    /* JADX INFO: renamed from: H */
    private final C30409d m18057H() {
        return (C30409d) this.navRouter.getValue();
    }

    /* JADX INFO: renamed from: I */
    private final C30407b m18058I() {
        return (C30407b) this.parameterParser.getValue();
    }

    /* JADX INFO: renamed from: J */
    private final C30407b.a m18059J() {
        return (C30407b.a) this.params.getValue();
    }

    /* JADX INFO: renamed from: K */
    private final C35010l m18060K() {
        return (C35010l) this.permissionRequester.getValue();
    }

    /* JADX INFO: renamed from: L */
    private final InterfaceC25007c m18061L() {
        return (InterfaceC25007c) this.pushPermissionHelper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final void m18062M(GenericFragment genericFragment, Set set) {
        genericFragment.m18056G().mo85228t("Health Connect permission result: " + set, new AbstractC30556a.a[0]);
        genericFragment.m18060K().m110562f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final InterfaceC34116n m18063N(GenericFragment genericFragment) {
        InterfaceC34116n.Companion companion = InterfaceC34116n.INSTANCE;
        MetricEventModel metricEventModelM92926e = genericFragment.m18059J().getMetricEvents();
        return companion.m107848a("GenericFragment-" + (metricEventModelM92926e != null ? metricEventModelM92926e.getFeatureName() : null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final C34911a m18064O(GenericFragment genericFragment) {
        return AbstractC15751g.m44431K(genericFragment.requireActivity(), AbstractC5583n.m16799z(genericFragment));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final C23454a0 m18065P(GenericFragment genericFragment, Composer composer, int i13) {
        String featureName;
        String requestName;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            ScreenAnalyticEventModel screenAnalyticEventModelM92922a = genericFragment.m18059J().getAnalyticEvents();
            ScreenAnalyticEventModel screenAnalyticEventModel = screenAnalyticEventModelM92922a == null ? new ScreenAnalyticEventModel((AnalyticEventModel) null, (AnalyticEventModel) null, (AnalyticEventModel) null, 7, (DefaultConstructorMarker) null) : screenAnalyticEventModelM92922a;
            boolean zM87157i = c28655q.m87157i(screenAnalyticEventModel);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C0864a(screenAnalyticEventModel, 2);
                c28655q.m87172p0(objM87133R);
            }
            C30406a c30406a = (C30406a) AbstractC29125c.m88492A(genericFragment).m122602a((InterfaceC4339a) objM87133R, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C30406a.class), null);
            MetricEventModel metricEventModelM92926e = genericFragment.m18059J().getMetricEvents();
            if (metricEventModelM92926e == null || (featureName = metricEventModelM92926e.getFeatureName()) == null) {
                featureName = "generic_screen";
            }
            String str = featureName;
            MetricEventModel metricEventModelM92926e2 = genericFragment.m18059J().getMetricEvents();
            if (metricEventModelM92926e2 == null || (requestName = metricEventModelM92926e2.getRequestName()) == null) {
                requestName = "generic_request";
            }
            String str2 = requestName;
            CachePolicyModel cachePolicyModelM92923b = genericFragment.m18059J().getCachePolicy();
            CachePolicyModel cachePolicyModel = cachePolicyModelM92923b == null ? new CachePolicyModel(false, (String) null, (Set) null, 7, (DefaultConstructorMarker) null) : cachePolicyModelM92923b;
            C6005m c6005m = (genericFragment.m18059J().m92925d() == null && genericFragment.m18059J().m92924c() == null) ? null : new C6005m(genericFragment.m18059J().m92925d(), genericFragment.m18059J().m92924c());
            C30409d c30409dM18057H = genericFragment.m18057H();
            ApiRequest apiRequestM92928g = genericFragment.m18059J().getRequest();
            C35010l c35010lM18060K = genericFragment.m18060K();
            boolean zM87157i2 = c28655q.m87157i(c35010lM18060K);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C6015b(c35010lM18060K);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC35012n.m110592n(c30409dM18057H, c30406a, apiRequestM92928g, str, screenAnalyticEventModel, str2, cachePolicyModel, genericFragment.m18059J().getOnStartInteraction(), c6005m, (InterfaceC4351m) ((InterfaceC21467g) objM87133R2), c28655q, (ApiRequest.$stable << 6) | (CachePolicyModel.$stable << 18) | (GenericInteraction.$stable << 21), 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final C34911a m18066Q(ScreenAnalyticEventModel screenAnalyticEventModel) {
        return AbstractC15751g.m44431K(screenAnalyticEventModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final C30407b.a m18067R(GenericFragment genericFragment) {
        return genericFragment.m18058I().m92913a(genericFragment.getArguments());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final C34911a m18068S(GenericFragment genericFragment) {
        return AbstractC15751g.m44431K(genericFragment.healthConnectPermissionsLauncher, genericFragment.m18061L());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final C34911a m18069T(GenericFragment genericFragment) {
        String featureName;
        AbstractC21071j activityResultRegistry = genericFragment.requireActivity().getActivityResultRegistry();
        List listM118958J = AbstractC37056f.m118958J("android.permission.POST_NOTIFICATIONS");
        MetricEventModel metricEventModelM92926e = genericFragment.m18059J().getMetricEvents();
        if (metricEventModelM92926e == null || (featureName = metricEventModelM92926e.getFeatureName()) == null) {
            featureName = "generic_screen";
        }
        return AbstractC15751g.m44431K(activityResultRegistry, listM118958J, "genericScreen_".concat(featureName));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AbstractC28163g0.m85250f(this, m18056G());
        getLifecycle().mo4986a(m18061L());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        getActivity();
        AbstractC28163g0.m85256l(this);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public ComposeView onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        AbstractC22676k.m65750j(inflater, "inflater");
        return AbstractC22387b0.m64387c(this, new C37816b(new C34238a(this, 11), true, -171560804));
    }
}
