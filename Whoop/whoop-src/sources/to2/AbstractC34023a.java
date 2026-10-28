package to2;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import androidx.profileinstaller.ProfileVerifier;
import ao1.C1871f;
import b20.C2327g;
import bc3.InterfaceC2994c0;
import bm2.C3433d0;
import bm2.C3440f1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import d10.C11465b;
import e20.C12593a;
import fy1.AbstractC14874j;
import ge3.AbstractC15751g;
import h00.C16497d0;
import h20.AbstractC16632b4;
import h20.C16729s;
import h20.InterfaceC16627b;
import h20.InterfaceC16638c4;
import h20.InterfaceC16642d2;
import h20.InterfaceC16645e;
import h20.InterfaceC16646e0;
import ho2.C17538a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.sentry.config.AbstractC20301a;
import j02.EnumC21177x0;
import j02.InterfaceC21159o0;
import j93.InterfaceC21467g;
import jf3.C21647a;
import jo2.C21842e;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23459e;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import mn2.EnumC25719b;
import n20.C26167b;
import n20.C26174i;
import n20.C26177l;
import n20.C26185t;
import n20.C26186u;
import no.nordicsemi.android.dfu.DfuBaseService;
import o02.InterfaceC27353d;
import oo2.C28066a;
import oo2.C28068c;
import p048ce.AbstractC4482w;
import p088dc.AbstractC11895b;
import p108e4.AbstractC12667a;
import p114eb.AbstractC12939a0;
import p114eb.C12982q;
import p179h.AbstractC16349g;
import p236j.InterfaceC21072k;
import p245j8.AbstractC21412c;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p298l8.C23418a;
import p319m4.AbstractC25012a;
import p323m8.AbstractC25218a;
import p386oy.C28466c;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p634y1.AbstractC39038k;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22672i;
import p715kotlin.jvm.internal.InterfaceC22666f;
import p736sz0.C33205o0;
import pf3.C29155a;
import po2.C29403b;
import po2.C29404c;
import po2.InterfaceC29402a;
import q20.C29814e;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import s90.C32290f;
import so2.AbstractC32845c;
import so2.AbstractC32847e;
import so2.AbstractC32849g;
import t71.C33572i;
import t80.C33592b;
import uf3.C34911a;
import v03.C35516c;
import v03.C35518e;
import vf3.InterfaceC35951a;
import xf3.C38266c;
import y00.C38915o4;

/* JADX INFO: renamed from: to2.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ai\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a-\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006'²\u0006\f\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010$\u001a\u00020#8\nX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"}, m65681d2 = {"", "dynamicPath", "dynamicPayload", "source", "cartId", "method", "Lj02/x0;", "autoTrigger", "Leb/a0;", "universalCheckoutNavController", "globalNavController", "Landroidx/fragment/app/r0;", "activity", "Leb/q;", "currentBackStackEntry", "Ll83/a0;", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj02/x0;Leb/a0;Leb/a0;Landroidx/fragment/app/r0;Leb/q;Landroidx/compose/runtime/Composer;II)V", "Lpo2/c;", "viewState", "Lkotlin/Function1;", "Lpo2/a;", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lpo2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Ljo2/e;", "stripeFlowControllerManager", "Lho2/a;", "analyticsHelper", "Lpo2/b;", "viewModel", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Loo2/a;", "actionRouter", "Lj02/o0;", "navigator", "Lo02/d;", "baseNavReducer", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34023a {

    /* JADX INFO: renamed from: to2.a$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142625w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142626x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142627y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142625w = c38266c;
            this.f142626x = interfaceC35951a;
            this.f142627y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jo2.e] */
        @Override // c93.InterfaceC4339a
        public final C21842e invoke() {
            return this.f142625w.m122602a(this.f142627y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21842e.class), this.f142626x);
        }
    }

    /* JADX INFO: renamed from: to2.a$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142628w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142629x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142630y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142628w = c38266c;
            this.f142629x = interfaceC35951a;
            this.f142630y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [ho2.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C17538a invoke() {
            return this.f142628w.m122602a(this.f142630y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C17538a.class), this.f142629x);
        }
    }

    /* JADX INFO: renamed from: to2.a$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142631w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142632x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142633y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142631w = c38266c;
            this.f142632x = interfaceC35951a;
            this.f142633y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f142631w.m122602a(this.f142633y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f142632x);
        }
    }

    /* JADX INFO: renamed from: to2.a$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142634w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142635x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142636y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142634w = c38266c;
            this.f142635x = interfaceC35951a;
            this.f142636y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, oo2.a] */
        @Override // c93.InterfaceC4339a
        public final C28066a invoke() {
            return this.f142634w.m122602a(this.f142636y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28066a.class), this.f142635x);
        }
    }

    /* JADX INFO: renamed from: to2.a$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142637w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142638x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142639y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142637w = c38266c;
            this.f142638x = interfaceC35951a;
            this.f142639y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j02.o0, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21159o0 invoke() {
            return this.f142637w.m122602a(this.f142639y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21159o0.class), this.f142638x);
        }
    }

    /* JADX INFO: renamed from: to2.a$f */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142640w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142641x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142642y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f142640w = c38266c;
            this.f142641x = interfaceC35951a;
            this.f142642y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o02.d] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27353d invoke() {
            return this.f142640w.m122602a(this.f142642y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27353d.class), this.f142641x);
        }
    }

    /* JADX INFO: renamed from: to2.a$g */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f142643w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f142644x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f142645y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21647a f142646z;

        /* JADX INFO: renamed from: to2.a$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC22680m implements InterfaceC4339a {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C21647a f142647w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C21647a c21647a) {
                super(0);
                this.f142647w = c21647a;
            }

            @Override // c93.InterfaceC4339a
            public final C21647a invoke() {
                return this.f142647w;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a, C21647a c21647a) {
            super(0);
            this.f142643w = c38266c;
            this.f142644x = interfaceC35951a;
            this.f142645y = interfaceC4339a;
            this.f142646z = c21647a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.w1, po2.b] */
        @Override // c93.InterfaceC4339a
        public final C29403b invoke() {
            return AbstractC21598x.m60668X(this.f142643w, this.f142644x, new a(this.f142646z), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29403b.class), null, this.f142645y);
        }
    }

    /* JADX INFO: renamed from: to2.a$h */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.view.screens.UniversalCheckoutScreenKt$UniversalCheckoutScreen$1$1", m100430f = "UniversalCheckoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f142648E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f142649F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ EnumC21177x0 f142650G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ InterfaceC16642d2 f142651H;

        /* JADX INFO: renamed from: I */
        final /* synthetic */ InterfaceC23462h f142652I;

        /* JADX INFO: renamed from: J */
        final /* synthetic */ InterfaceC28670t2 f142653J;

        /* JADX INFO: renamed from: K */
        final /* synthetic */ InterfaceC23462h f142654K;

        /* JADX INFO: renamed from: w */
        int f142655w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ String f142656x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f142657y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f142658z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2, String str3, String str4, String str5, EnumC21177x0 enumC21177x0, InterfaceC16642d2 interfaceC16642d2, InterfaceC23462h interfaceC23462h, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f142656x = str;
            this.f142657y = str2;
            this.f142658z = str3;
            this.f142648E = str4;
            this.f142649F = str5;
            this.f142650G = enumC21177x0;
            this.f142651H = interfaceC16642d2;
            this.f142652I = interfaceC23462h;
            this.f142653J = interfaceC28670t2;
            this.f142654K = interfaceC23462h2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new h(this.f142656x, this.f142657y, this.f142658z, this.f142648E, this.f142649F, this.f142650G, this.f142651H, this.f142652I, this.f142653J, this.f142654K, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f142655w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C29403b c29403bM107608o = AbstractC34023a.m107608o(this.f142652I);
            String str = this.f142656x;
            String str2 = this.f142657y;
            String str3 = this.f142658z;
            String strM89659e = AbstractC34023a.m107610q(this.f142653J).getCartId();
            if (strM89659e == null) {
                strM89659e = this.f142648E;
            }
            c29403bM107608o.m89655r(new InterfaceC29402a.l(str, str2, str3, strM89659e, this.f142649F, this.f142650G));
            AbstractC34023a.m107602i(this.f142654K).m61814A(this.f142651H);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to2.a$i */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.view.screens.UniversalCheckoutScreenKt$UniversalCheckoutScreen$2$1", m100430f = "UniversalCheckoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f142659w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28068c f142660x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC28670t2 f142661y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC23462h f142662z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C28068c c28068c, InterfaceC28670t2 interfaceC28670t2, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f142660x = c28068c;
            this.f142661y = interfaceC28670t2;
            this.f142662z = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new i(this.f142660x, this.f142661y, this.f142662z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f142659w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            EnumC21177x0 enumC21177x0M89658d = AbstractC34023a.m107610q(this.f142661y).getAutoTrigger();
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (enumC21177x0M89658d == null) {
                return c23454a0;
            }
            String strM89659e = AbstractC34023a.m107610q(this.f142661y).getCartId();
            if (enumC21177x0M89658d == EnumC21177x0.SHIPPING_ADDRESS && strM89659e != null) {
                this.f142660x.m84847d(new InterfaceC29402a.r(strM89659e));
            }
            AbstractC34023a.m107608o(this.f142662z).m89655r(new InterfaceC29402a.n(enumC21177x0M89658d));
            return c23454a0;
        }
    }

    /* JADX INFO: renamed from: to2.a$j */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.checkout.view.screens.UniversalCheckoutScreenKt$UniversalCheckoutScreen$3$1", m100430f = "UniversalCheckoutScreen.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f142663w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12982q f142664x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC23462h f142665y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C12982q c12982q, InterfaceC23462h interfaceC23462h, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f142664x = c12982q;
            this.f142665y = interfaceC23462h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new j(this.f142664x, this.f142665y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C1601k1 c1601k1M36480b;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f142663w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C12982q c12982q = this.f142664x;
            if (c12982q != null && (c1601k1M36480b = c12982q.m36480b()) != null) {
                InterfaceC23462h interfaceC23462h = this.f142665y;
                String str = (String) c1601k1M36480b.m5001b("externalCheckoutCartId");
                if (str != null) {
                    AbstractC34023a.m107608o(interfaceC23462h).m89655r(new InterfaceC29402a.h0(str));
                    c1601k1M36480b.m5003d("externalCheckoutCartId");
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to2.a$k */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class k extends C22672i implements Function1 {
        public k(Object obj) {
            super(1, 0, C29403b.class, obj, "handlePaymentOptionChanged", "handlePaymentOptionChanged(Lcom/stripe/android/paymentsheet/model/PaymentOption;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m107619a(C29814e c29814e) {
            ((C29403b) this.receiver).m89653p(c29814e);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m107619a((C29814e) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to2.a$l */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class l extends C22672i implements Function1 {
        public l(Object obj) {
            super(1, 0, C29403b.class, obj, "onPaymentSheetResult", "onPaymentSheetResult(Lcom/stripe/android/paymentsheet/PaymentSheetResult;)V");
        }

        /* JADX INFO: renamed from: a */
        public final void m107620a(AbstractC16632b4 p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((C29403b) this.receiver).m89654q(p13);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m107620a((AbstractC16632b4) obj);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: to2.a$m */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class m extends C22672i implements Function3 {
        public m(Object obj) {
            super(3, 0, C29403b.class, obj, "createAndConfirmIntent", "createAndConfirmIntent(Lcom/stripe/android/model/PaymentMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;");
        }

        /* JADX INFO: renamed from: a */
        public final Object m107621a(C38915o4 c38915o4, boolean z4, InterfaceC30057d<? super InterfaceC16645e> interfaceC30057d) {
            return ((C29403b) this.receiver).m89652o(c38915o4, z4, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m107621a((C38915o4) obj, ((Boolean) obj2).booleanValue(), (InterfaceC30057d) obj3);
        }
    }

    /* JADX INFO: renamed from: to2.a$n */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n implements InterfaceC16627b, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function3 f142666w;

        public n(Function3 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f142666w = function;
        }

        @Override // h20.InterfaceC16627b
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object mo43523a(C38915o4 c38915o4, boolean z4, InterfaceC30057d interfaceC30057d) {
            return this.f142666w.invoke(c38915o4, Boolean.valueOf(z4), interfaceC30057d);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC16627b) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f142666w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: to2.a$o */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o implements InterfaceC16646e0, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f142667w;

        public o(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f142667w = function;
        }

        @Override // h20.InterfaceC16646e0
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo47224a(C29814e c29814e) {
            this.f142667w.invoke(c29814e);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC16646e0) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f142667w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: renamed from: to2.a$p */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements InterfaceC16638c4, InterfaceC22666f {

        /* JADX INFO: renamed from: w */
        private final /* synthetic */ Function1 f142668w;

        public p(Function1 function) {
            AbstractC22676k.m65750j(function, "function");
            this.f142668w = function;
        }

        @Override // h20.InterfaceC16638c4
        /* JADX INFO: renamed from: a */
        public final /* synthetic */ void mo43511a(AbstractC16632b4 abstractC16632b4) {
            this.f142668w.invoke(abstractC16632b4);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC16638c4) && (obj instanceof InterfaceC22666f)) {
                return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p715kotlin.jvm.internal.InterfaceC22666f
        public final InterfaceC23459e getFunctionDelegate() {
            return this.f142668w;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX INFO: renamed from: g */
    public static final void m107600g(String dynamicPath, String dynamicPayload, String str, String str2, String str3, EnumC21177x0 enumC21177x0, AbstractC12939a0 universalCheckoutNavController, AbstractC12939a0 globalNavController, AbstractActivityC1340r0 activity, C12982q c12982q, Composer composer, int i13, int i14) {
        int i15;
        C28655q c28655q;
        C12982q c12982q2;
        EnumC21177x0 enumC21177x1;
        C28676v0 c28676v0;
        C28655q c28655q2;
        int i16;
        Window window;
        Object hVar;
        InterfaceC23462h interfaceC23462h;
        InterfaceC28601c1 interfaceC28601c1;
        String source = str;
        AbstractC22676k.m65750j(dynamicPath, "dynamicPath");
        AbstractC22676k.m65750j(dynamicPayload, "dynamicPayload");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(universalCheckoutNavController, "universalCheckoutNavController");
        AbstractC22676k.m65750j(globalNavController, "globalNavController");
        AbstractC22676k.m65750j(activity, "activity");
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(-292126336);
        if ((i13 & 6) == 0) {
            i15 = (c28655q3.m87153g(dynamicPath) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q3.m87153g(dynamicPayload) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87153g(source) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q3.m87153g(str2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q3.m87153g(str3) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i17 = i14 & 32;
        if (i17 != 0) {
            i15 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        } else if ((i13 & ProfileVerifier.CompilationStatus.f6515xf2722a21) == 0) {
            i15 |= c28655q3.m87149e(enumC21177x0 == null ? -1 : enumC21177x0.ordinal()) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i15 |= c28655q3.m87157i(universalCheckoutNavController) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i15 |= c28655q3.m87157i(globalNavController) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i15 |= c28655q3.m87157i(activity) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i15 |= c28655q3.m87157i(c12982q) ? 536870912 : 268435456;
        }
        if (c28655q3.m87135U(i15 & 1, (306783379 & i15) != 306783378)) {
            EnumC21177x0 enumC21177x2 = i17 != 0 ? null : enumC21177x0;
            c28655q3.m87152f0(1903845737);
            C29155a c29155a = C29155a.f118016a;
            C38266c c38266c = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R = c28655q3.m87133R();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (zM87153g || objM87133R == c28676v1) {
                objM87133R = AbstractC30060g.m92087G(EnumC23463i.f92935y, new a(c38266c, null, null));
                c28655q3.m87172p0(objM87133R);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h2 = (InterfaceC23462h) objM87133R;
            c28655q3.m87173q(false);
            c28655q3.m87152f0(1903845737);
            C38266c c38266c2 = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g2 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R2 = c28655q3.m87133R();
            if (zM87153g2 || objM87133R2 == c28676v1) {
                objM87133R2 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new b(c38266c2, null, null));
                c28655q3.m87172p0(objM87133R2);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h3 = (InterfaceC23462h) objM87133R2;
            c28655q3.m87173q(false);
            c28655q3.m87152f0(-1688186518);
            C38266c c38266c3 = c29155a.m88599a().f106046a.f159364d;
            int i18 = i15;
            C21647a c21647aM114690r = AbstractC36095b.m114690r(c28655q3, -1688186210, c28655q3, false, -3686552);
            boolean zM87153g3 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R3 = c28655q3.m87133R();
            if (zM87153g3 || objM87133R3 == c28676v1) {
                objM87133R3 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new g(c38266c3, null, null, c21647aM114690r));
                c28655q3.m87172p0(objM87133R3);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h4 = (InterfaceC23462h) objM87133R3;
            c28655q3.m87173q(false);
            InterfaceC28601c1 interfaceC28601c1M87260n = AbstractC28683x.m87260n(m107608o(interfaceC23462h4).getViewState(), new C29404c(null, new C29404c.b(C33205o0.f138451a.m105288b(), null, null, null, 14, null), 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 29, null), null, c28655q3, 0, 2);
            c28655q3.m87152f0(1903845737);
            C38266c c38266c4 = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g4 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R4 = c28655q3.m87133R();
            if (zM87153g4 || objM87133R4 == c28676v1) {
                objM87133R4 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new c(c38266c4, null, null));
                c28655q3.m87172p0(objM87133R4);
            }
            c28655q3.m87173q(false);
            c28655q3.m87173q(false);
            boolean zIsFeatureEnabled = m107611r((InterfaceC23462h) objM87133R4).isFeatureEnabled(OnboardingFeatureFlag.IAJF_PREPAIDS_UC_BACK_ANDROID);
            c28655q3.m87152f0(1903845737);
            C38266c c38266c5 = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g5 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R5 = c28655q3.m87133R();
            if (zM87153g5 || objM87133R5 == c28676v1) {
                objM87133R5 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new d(c38266c5, null, null));
                c28655q3.m87172p0(objM87133R5);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h5 = (InterfaceC23462h) objM87133R5;
            c28655q3.m87173q(false);
            boolean zM87157i = c28655q3.m87157i(activity);
            Object objM87133R6 = c28655q3.m87133R();
            if (zM87157i || objM87133R6 == c28676v1) {
                objM87133R6 = new C1871f(activity, 17);
                c28655q3.m87172p0(objM87133R6);
            }
            InterfaceC4339a interfaceC4339a = (InterfaceC4339a) objM87133R6;
            c28655q3.m87152f0(1903845737);
            C38266c c38266c6 = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g6 = c28655q3.m87153g(null) | c28655q3.m87153g(interfaceC4339a);
            Object objM87133R7 = c28655q3.m87133R();
            if (zM87153g6 || objM87133R7 == c28676v1) {
                objM87133R7 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new e(c38266c6, null, interfaceC4339a));
                c28655q3.m87172p0(objM87133R7);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h6 = (InterfaceC23462h) objM87133R7;
            c28655q3.m87173q(false);
            c28655q3.m87152f0(1903845737);
            C38266c c38266c7 = c29155a.m88599a().f106046a.f159364d;
            c28655q3.m87152f0(-3686552);
            boolean zM87153g7 = c28655q3.m87153g(null) | c28655q3.m87153g(null);
            Object objM87133R8 = c28655q3.m87133R();
            if (zM87153g7 || objM87133R8 == c28676v1) {
                objM87133R8 = AbstractC30060g.m92087G(EnumC23463i.f92935y, new f(c38266c7, null, null));
                c28655q3.m87172p0(objM87133R8);
            }
            c28655q3.m87173q(false);
            InterfaceC23462h interfaceC23462h7 = (InterfaceC23462h) objM87133R8;
            c28655q3.m87173q(false);
            boolean zM87153g8 = c28655q3.m87153g(universalCheckoutNavController) | c28655q3.m87153g(globalNavController);
            Object objM87133R9 = c28655q3.m87133R();
            if (zM87153g8 || objM87133R9 == c28676v1) {
                c28676v0 = c28676v1;
                c28655q2 = c28655q3;
                i16 = 0;
                C28068c c28068c = new C28068c(m107614u(interfaceC23462h6), globalNavController, universalCheckoutNavController, m107603j(interfaceC23462h3), m107615v(interfaceC23462h7), null, 32, null);
                c28655q2.m87172p0(c28068c);
                objM87133R9 = c28068c;
            } else {
                c28655q2 = c28655q3;
                c28676v0 = c28676v1;
                i16 = 0;
            }
            C28068c c28068c2 = (C28068c) objM87133R9;
            C29403b c29403bM107608o = m107608o(interfaceC23462h4);
            boolean zM87157i2 = c28655q2.m87157i(c29403bM107608o);
            Object objM87133R10 = c28655q2.m87133R();
            if (zM87157i2 || objM87133R10 == c28676v0) {
                objM87133R10 = new k(c29403bM107608o);
                c28655q2.m87172p0(objM87133R10);
            }
            o oVar = new o((Function1) ((InterfaceC21467g) objM87133R10));
            C29403b c29403bM107608o2 = m107608o(interfaceC23462h4);
            boolean zM87157i3 = c28655q2.m87157i(c29403bM107608o2);
            Object objM87133R11 = c28655q2.m87133R();
            if (zM87157i3 || objM87133R11 == c28676v0) {
                objM87133R11 = new l(c29403bM107608o2);
                c28655q2.m87172p0(objM87133R11);
            }
            p pVar = new p((Function1) ((InterfaceC21467g) objM87133R11));
            C29403b c29403bM107608o3 = m107608o(interfaceC23462h4);
            boolean zM87157i4 = c28655q2.m87157i(c29403bM107608o3);
            Object objM87133R12 = c28655q2.m87133R();
            if (zM87157i4 || objM87133R12 == c28676v0) {
                objM87133R12 = new m(c29403bM107608o3);
                c28655q2.m87172p0(objM87133R12);
            }
            n nVar = new n((Function3) ((InterfaceC21467g) objM87133R12));
            c28655q2.m87150e0(738579796);
            c28655q2.m87150e0(-1511348497);
            boolean zM87153g9 = c28655q2.m87153g(nVar);
            Object objM87133R13 = c28655q2.m87133R();
            if (zM87153g9 || objM87133R13 == c28676v0) {
                objM87133R13 = new C11465b(nVar);
                c28655q2.m87172p0(objM87133R13);
            }
            C11465b callbacks = (C11465b) objM87133R13;
            c28655q2.m87173q(i16);
            c28655q2.m87150e0(-1717648231);
            InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(oVar, c28655q2);
            c28655q2.m87150e0(-332838003);
            Object objM87133R14 = c28655q2.m87133R();
            if (objM87133R14 == c28676v0) {
                objM87133R14 = new C16729s(interfaceC28601c1M87238F);
                c28655q2.m87172p0(objM87133R14);
            }
            C16729s paymentOptionResultCallback = (C16729s) objM87133R14;
            c28655q2.m87173q(i16);
            c28655q2.m87173q(i16);
            AbstractC22676k.m65750j(callbacks, "callbacks");
            AbstractC22676k.m65750j(paymentOptionResultCallback, "paymentOptionResultCallback");
            c28655q2.m87150e0(1095396757);
            Object[] objArr = new Object[i16];
            c28655q2.m87150e0(-1624537477);
            Object objM87133R15 = c28655q2.m87133R();
            if (objM87133R15 == c28676v0) {
                objM87133R15 = new C16497d0(3);
                c28655q2.m87172p0(objM87133R15);
            }
            c28655q2.m87173q(i16);
            C28655q c28655q4 = c28655q2;
            Object objM124459e = AbstractC39038k.m124459e(objArr, null, (InterfaceC4339a) objM87133R15, c28655q4, 3072, 6);
            AbstractC22676k.m65749i(objM124459e, "rememberSaveable(...)");
            String str4 = (String) objM124459e;
            AbstractC12667a.m35459k(str4, callbacks, c28655q4, i16);
            InterfaceC1583f2 interfaceC1583f2M73844a = AbstractC25218a.m73844a(c28655q4);
            if (interfaceC1583f2M73844a == null) {
                throw new IllegalArgumentException("PaymentSheet.FlowController must be created with access to a ViewModelStoreOwner");
            }
            InterfaceC21072k interfaceC21072kM46560a = AbstractC16349g.m46560a(c28655q4);
            if (interfaceC21072kM46560a == null) {
                throw new IllegalArgumentException("PaymentSheet.FlowController must be created with access to a ActivityResultRegistryOwner");
            }
            InterfaceC1585g0 lifecycleOwner = (InterfaceC1585g0) c28655q4.m87161k(AbstractC21412c.f82093a);
            c28655q4.m87150e0(-1624518742);
            Object objM87133R16 = c28655q4.m87133R();
            if (objM87133R16 == c28676v0) {
                objM87133R16 = new C16497d0(4);
                c28655q4.m87172p0(objM87133R16);
            }
            c28655q4.m87173q(i16);
            Activity activity2 = AbstractC4482w.m13991b0((InterfaceC4339a) objM87133R16, c28655q4);
            c28655q4.m87150e0(-1624514897);
            boolean zM87153g10 = c28655q4.m87153g(paymentOptionResultCallback) | c28655q4.m87153g(pVar);
            Object objM87133R17 = c28655q4.m87133R();
            if (zM87153g10 || objM87133R17 == c28676v0) {
                AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
                C28466c c28466c = new C28466c(AbstractC11895b.m31996o("FlowController(instance = ", str4, ")"), interfaceC21072kM46560a);
                AbstractC22676k.m65750j(activity2, "activity");
                C26185t c26185t = new C26185t((Build.VERSION.SDK_INT <= 34 && (window = activity2.getWindow()) != null) ? Integer.valueOf(window.getStatusBarColor()) : null, str4);
                C1579e2 store = interfaceC1583f2M73844a.getViewModelStore();
                AbstractC23420c defaultCreationExtras = interfaceC1583f2M73844a instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2M73844a).getDefaultViewModelCreationExtras() : C23418a.f92771b;
                AbstractC22676k.m65750j(store, "store");
                AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
                C41113q c41113q = new C41113q(store, c26185t, defaultCreationExtras);
                String key = "FlowControllerViewModel(instance = " + str4 + ")";
                AbstractC22676k.m65750j(key, "key");
                C26167b c26167b = ((C26186u) c41113q.m133475w(key, AbstractC21598x.m60666V(C26186u.class))).f103862y.f103705a;
                objM87133R17 = (C26174i) C35516c.m112678b(new C26177l(c26167b.f103714e0, C35518e.m112679a(lifecycleOwner), new C12593a(new C2327g(c26167b.f103720h0, c26167b.f103722i0, 6), c26167b.f103725k, 4), C35518e.m112679a(paymentOptionResultCallback), C35518e.m112679a(pVar), C35518e.m112679a(c28466c), C35518e.m112679a(interfaceC21072kM46560a), c26167b.f103725k, c26167b.f103710c0, c26167b.f103696R, c26167b.f103724j0, c26167b.f103703Y, c26167b.f103698T, c26167b.f103726k0, c26167b.f103712d0, c26167b.f103715f, c26167b.f103731n, c26167b.f103744t0, c26167b.f103735p, C35518e.m112679a(Boolean.TRUE), c26167b.f103707b)).get();
                objM87133R17.getClass();
                c28655q4.m87172p0(objM87133R17);
            }
            InterfaceC16642d2 interfaceC16642d2 = (InterfaceC16642d2) objM87133R17;
            AbstractC25012a.m73392y(c28655q4, false, false, false);
            C29403b c29403bM107608o4 = m107608o(interfaceC23462h4);
            boolean z4 = i18 & 896;
            boolean zM87157i5 = c28655q4.m87157i(interfaceC23462h4) | ((i18 & 14) == 4) | ((i18 & 112) == 32) | (z4 == 256) | c28655q4.m87153g(interfaceC28601c1M87260n) | ((i18 & 7168) == 2048) | ((57344 & i18) == 16384) | ((458752 & i18) == 131072) | c28655q4.m87157i(interfaceC23462h2) | c28655q4.m87157i(interfaceC16642d2);
            Object objM87133R18 = c28655q4.m87133R();
            if (zM87157i5 || objM87133R18 == c28676v0) {
                interfaceC23462h = interfaceC23462h4;
                interfaceC28601c1 = interfaceC28601c1M87260n;
                c28655q = c28655q4;
                enumC21177x1 = enumC21177x2;
                source = str;
                hVar = new h(dynamicPath, dynamicPayload, source, str2, str3, enumC21177x1, interfaceC16642d2, interfaceC23462h, interfaceC28601c1, interfaceC23462h2, null);
                c28655q.m87172p0(hVar);
            } else {
                interfaceC28601c1 = interfaceC28601c1M87260n;
                c28655q = c28655q4;
                hVar = objM87133R18;
                enumC21177x1 = enumC21177x2;
                source = str;
                interfaceC23462h = interfaceC23462h4;
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) hVar, c29403bM107608o4);
            EnumC21177x0 enumC21177x0M89658d = m107610q(interfaceC28601c1).getAutoTrigger();
            boolean zM87153g11 = c28655q.m87153g(interfaceC28601c1) | c28655q.m87157i(c28068c2) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R19 = c28655q.m87133R();
            if (zM87153g11 || objM87133R19 == c28676v0) {
                objM87133R19 = new i(c28068c2, interfaceC28601c1, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R19);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R19, enumC21177x0M89658d);
            c12982q2 = c12982q;
            boolean zM87157i6 = c28655q.m87157i(c12982q2) | c28655q.m87157i(interfaceC23462h);
            Object objM87133R20 = c28655q.m87133R();
            if (zM87157i6 || objM87133R20 == c28676v0) {
                objM87133R20 = new j(c12982q2, interfaceC23462h, null);
                c28655q.m87172p0(objM87133R20);
            }
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R20, c12982q2);
            AbstractC14874j.m42904c(m107610q(interfaceC28601c1), "universal_checkout", c28655q, 48);
            boolean zM87155h = c28655q.m87155h(zIsFeatureEnabled) | (z4 == 256) | c28655q.m87157i(c28068c2);
            Object objM87133R21 = c28655q.m87133R();
            if (zM87155h || objM87133R21 == c28676v0) {
                objM87133R21 = new C3433d0(zIsFeatureEnabled, source, c28068c2, 10);
                c28655q.m87172p0(objM87133R21);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R21, false, c28655q, 0, 1);
            C29404c c29404cM107610q = m107610q(interfaceC28601c1);
            boolean zM87157i7 = c28655q.m87157i(interfaceC23462h5) | c28655q.m87157i(interfaceC23462h) | c28655q.m87157i(c28068c2);
            Object objM87133R22 = c28655q.m87133R();
            if (zM87157i7 || objM87133R22 == c28676v0) {
                objM87133R22 = new C32290f(c28068c2, interfaceC23462h5, interfaceC23462h, 9);
                c28655q.m87172p0(objM87133R22);
            }
            m107601h(c29404cM107610q, (Function1) objM87133R22, c28655q, 0, 0);
        } else {
            c28655q = c28655q3;
            c12982q2 = c12982q;
            c28655q.m87138X();
            enumC21177x1 = enumC21177x0;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C3440f1(dynamicPath, dynamicPayload, source, str2, str3, enumC21177x1, universalCheckoutNavController, globalNavController, activity, c12982q2, i13, i14, 4);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m107601h(C29404c viewState, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(283941934);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C33572i(13);
                    c28655q.m87172p0(objM87133R);
                }
                function1 = (Function1) objM87133R;
            }
            if (viewState.getScreenContent() == null) {
                c28655q.m87150e0(2123709094);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2123709095);
                AbstractC32847e.m103094e(viewState, function1, c28655q, i15 & 126);
                AbstractC32849g.m103107i(viewState.getScreenContent(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            }
            if (viewState.getFullScreenModal() == null) {
                c28655q.m87150e0(2123879439);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2123879440);
                AbstractC32845c.m103085j(viewState.getFullScreenModal(), function1, c28655q, i15 & 112);
                c28655q.m87173q(false);
            }
        } else {
            c28655q.m87138X();
        }
        Function1 function2 = function1;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33592b(viewState, i13, function2, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C21842e m107602i(InterfaceC23462h interfaceC23462h) {
        return (C21842e) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: j */
    private static final C17538a m107603j(InterfaceC23462h interfaceC23462h) {
        return (C17538a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m107604k(boolean z4, String str, C28068c c28068c) {
        if (z4 || EnumC25719b.INSTANCE.m75836a(str) != EnumC25719b.JOIN) {
            c28068c.m84847d(InterfaceC29402a.m.f119335a);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m107605l(C28068c c28068c, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, InterfaceC29402a event) {
        AbstractC22676k.m65750j(event, "event");
        InterfaceC29402a interfaceC29402aM84843c = m107612s(interfaceC23462h).m84843c(event);
        if (interfaceC29402aM84843c instanceof InterfaceC29402a.n0) {
            m107608o(interfaceC23462h2).m89655r((InterfaceC29402a.n0) interfaceC29402aM84843c);
        } else if (interfaceC29402aM84843c instanceof InterfaceC29402a.s) {
            c28068c.m84847d((InterfaceC29402a.s) interfaceC29402aM84843c);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m107606m(String str, String str2, String str3, String str4, String str5, EnumC21177x0 enumC21177x0, AbstractC12939a0 abstractC12939a0, AbstractC12939a0 abstractC12939a1, AbstractActivityC1340r0 abstractActivityC1340r0, C12982q c12982q, int i13, int i14, Composer composer, int i15) {
        m107600g(str, str2, str3, str4, str5, enumC21177x0, abstractC12939a0, abstractC12939a1, abstractActivityC1340r0, c12982q, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m107607n(InterfaceC29402a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C29403b m107608o(InterfaceC23462h interfaceC23462h) {
        return (C29403b) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m107609p(C29404c c29404c, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m107601h(c29404c, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C29404c m107610q(InterfaceC28670t2 interfaceC28670t2) {
        return (C29404c) interfaceC28670t2.getValue();
    }

    /* JADX INFO: renamed from: r */
    private static final FeatureFlagChecker m107611r(InterfaceC23462h interfaceC23462h) {
        return (FeatureFlagChecker) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: s */
    private static final C28066a m107612s(InterfaceC23462h interfaceC23462h) {
        return (C28066a) interfaceC23462h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C34911a m107613t(AbstractActivityC1340r0 abstractActivityC1340r0) {
        return AbstractC15751g.m44431K(abstractActivityC1340r0);
    }

    /* JADX INFO: renamed from: u */
    private static final InterfaceC21159o0 m107614u(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC21159o0) interfaceC23462h.getValue();
    }

    /* JADX INFO: renamed from: v */
    private static final InterfaceC27353d m107615v(InterfaceC23462h interfaceC23462h) {
        return (InterfaceC27353d) interfaceC23462h.getValue();
    }
}
