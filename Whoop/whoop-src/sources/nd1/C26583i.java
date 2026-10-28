package nd1;

import aa2.C0599h;
import aa2.InterfaceC0596e;
import ad3.AbstractC0757c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.text.format.DateFormat;
import androidx.core.app.NotificationManagerCompat;
import androidx.health.platform.client.proto.C1533u;
import ao1.C1873h;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c92.C4338j;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ca2.C4365e;
import ca2.C4367g;
import ca2.InterfaceC4368h;
import com.google.android.gms.common.api.C4975f;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.data.local.prefs.PreferenceHelper;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.remote.NewWhoopLoginInterceptor;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.repositories.ActiveSessionChecker;
import com.whoop.data.repositories.ArabicBetaOptOutStatusStore;
import com.whoop.data.repositories.ArabicLanguageEnabledChecker;
import com.whoop.data.repositories.DefaultLanguageDecider;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.data.serialization.DateTimeRangeSerializer;
import com.whoop.data.serialization.DateTimeSerializer;
import com.whoop.domain.bootstrap.BootstrapApi;
import com.whoop.service.network.ActivitiesApi;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.GpsServiceApi;
import com.whoop.service.network.HomeComponentDismissApi;
import com.whoop.service.network.UsersPreferenceApi;
import com.whoop.service.timezone.C10023a;
import com.whoop.util.avatar.AvatarApi;
import da2.C11832a;
import dj0.C12066b;
import fi0.C14519e;
import fi0.InterfaceC14515a;
import fn2.C14641a;
import fn2.C14645e;
import fn2.C14646f;
import fn2.C14647g;
import fn2.C14649i;
import fn2.InterfaceC14643c;
import fn2.InterfaceC14644d;
import fn2.InterfaceC14652l;
import fn2.InterfaceC14654n;
import fv1.C14813a;
import fv1.InterfaceC14815c;
import ge3.AbstractC15751g;
import i92.C18257b;
import i92.C18258c;
import i92.C18259d;
import i92.C18270o;
import ih0.AbstractC18489d0;
import in2.InterfaceC18732d;
import io.sentry.okhttp.C20452d;
import iy1.InterfaceC21030c;
import j92.C21434b;
import j92.C21435c;
import j92.C21436d;
import j92.C21439g;
import j92.C21440h;
import j92.C21441i;
import j92.C21443k;
import j92.C21444l;
import j92.C21445m;
import j92.C21446n;
import j92.C21448p;
import j92.C21449q;
import j92.C21450r;
import j92.C21454v;
import j92.InterfaceC21437e;
import j93.InterfaceC21461d;
import java.io.File;
import java.time.Clock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import jk0.InterfaceC21751e;
import js0.AbstractC21909c;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import l92.C23543a;
import m83.AbstractC25265s;
import m83.C25235a0;
import ma1.C25371a;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import me3.C25480c;
import na1.C26511a;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.C27838b;
import od1.C27847j;
import od1.C27853p;
import od1.C27858u;
import od1.C27859v;
import od1.C27862y;
import od1.InterfaceC27837a0;
import or2.C28156e;
import or2.C28162g;
import or2.C28167h1;
import or2.C28169i0;
import or2.C28176k1;
import or2.C28195r;
import or2.C28218y1;
import or2.InterfaceC28197r1;
import or2.InterfaceC28215x1;
import org.joda.time.DateTime;
import org.koin.core.error.DefinitionParameterException;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p098dt.AbstractC12350b;
import p218ic.AbstractC18377p0;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p503tp.AbstractC34037h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.C22673i0;
import pd1.C29104a;
import pf.AbstractC29125c;
import pg3.AbstractC29199m;
import pg3.C29222x0;
import pg3.C29224y0;
import pr2.C29493a;
import pr2.C29495c;
import pr2.InterfaceC29494b;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import q92.C30073e;
import q92.C30076h;
import qd1.C30294a;
import qf3.C30330b;
import qg3.C30354f;
import r80.AbstractC31061c;
import rd1.C31242a;
import rf3.C31362a;
import rf3.C31365d;
import rg3.C31410a;
import rm0.C31585c;
import rr2.InterfaceC31766c;
import s03.C32053b;
import sr2.AbstractC32943y;
import tf3.C33768a;
import tm0.C33950b;
import tm0.InterfaceC33949a;
import tr2.InterfaceC34116n;
import u82.AbstractC34645f;
import u82.AbstractC34650k;
import u82.C34646g;
import u92.C34659c;
import ud3.C34815g;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.InterfaceC34803c;
import ud3.InterfaceC34816g0;
import uf3.C34911a;
import us0.C35210f;
import v82.C35799a;
import v92.C35832b;
import v92.C35833c;
import v92.C35834d;
import v92.InterfaceC35831a;
import va3.AbstractC35846d;
import vf3.AbstractC35952b;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import vs0.InterfaceC36471a;
import w82.AbstractC36948a;
import wb3.AbstractC37056f;
import wd3.AbstractC37174h;
import we1.C37223g;
import xf3.C38266c;
import y92.C39352a;
import y92.C39353b;
import z82.C40195i;
import z92.C40206b;
import z92.C40207c;
import z92.InterfaceC40205a;
import z92.InterfaceC40208d;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: nd1.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m65681d2 = {"Lnd1/i;", "Lnd1/j;", "<init>", "()V", "Ltf3/a;", "define", "()Ltf3/a;", "", "a", "Ljava/util/List;", "getDependencies", "()Ljava/util/List;", "dependencies", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26583i implements InterfaceC26584j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<InterfaceC26584j> dependencies = AbstractC37056f.m118959K(new C26587m(), new C31585c(), new C35799a());

    /* JADX INFO: renamed from: nd1.i$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105691w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105692x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105693y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105691w = c38266c;
            this.f105692x = interfaceC35951a;
            this.f105693y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f105691w.m122602a(this.f105693y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f105692x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105694w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105695x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105696y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105694w = c38266c;
            this.f105695x = interfaceC35951a;
            this.f105696y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, od1.a0] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC27837a0 invoke() {
            return this.f105694w.m122602a(this.f105696y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), this.f105695x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105697w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105698x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105699y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105697w = c38266c;
            this.f105698x = interfaceC35951a;
            this.f105699y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, we1.g] */
        @Override // c93.InterfaceC4339a
        public final C37223g invoke() {
            return this.f105697w.m122602a(this.f105699y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C37223g.class), this.f105698x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105700w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105701x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105702y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105700w = c38266c;
            this.f105701x = interfaceC35951a;
            this.f105702y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.remote.AppConfigurationRepository, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final AppConfigurationRepository invoke() {
            return this.f105700w.m122602a(this.f105702y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(AppConfigurationRepository.class), this.f105701x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105703w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105704x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105705y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105703w = c38266c;
            this.f105704x = interfaceC35951a;
            this.f105705y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j92.p, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21448p invoke() {
            return this.f105703w.m122602a(this.f105705y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21448p.class), this.f105704x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$f */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105706w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105707x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105708y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105706w = c38266c;
            this.f105707x = interfaceC35951a;
            this.f105708y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f105706w.m122602a(this.f105708y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f105707x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$g */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105709w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105710x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105711y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105709w = c38266c;
            this.f105710x = interfaceC35951a;
            this.f105711y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            return this.f105709w.m122602a(this.f105711y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), this.f105710x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$h */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105712w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105713x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105714y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105712w = c38266c;
            this.f105713x = interfaceC35951a;
            this.f105714y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [j92.k, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C21443k invoke() {
            return this.f105712w.m122602a(this.f105714y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21443k.class), this.f105713x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$i */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105715w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105716x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105717y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105715w = c38266c;
            this.f105716x = interfaceC35951a;
            this.f105717y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l92.a] */
        @Override // c93.InterfaceC4339a
        public final C23543a invoke() {
            return this.f105715w.m122602a(this.f105717y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C23543a.class), this.f105716x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$j */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105718w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105719x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105720y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105718w = c38266c;
            this.f105719x = interfaceC35951a;
            this.f105720y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f105718w.m122602a(this.f105720y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f105719x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$k */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105721w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105722x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105723y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105721w = c38266c;
            this.f105722x = interfaceC35951a;
            this.f105723y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, y92.a] */
        @Override // c93.InterfaceC4339a
        public final C39352a invoke() {
            return this.f105721w.m122602a(this.f105723y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39352a.class), this.f105722x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$l */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105724w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105725x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105726y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105724w = c38266c;
            this.f105725x = interfaceC35951a;
            this.f105726y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f105724w.m122602a(this.f105726y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f105725x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$m */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105727w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105728x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105729y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105727w = c38266c;
            this.f105728x = interfaceC35951a;
            this.f105729y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.DefaultLanguageDecider, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final DefaultLanguageDecider invoke() {
            return this.f105727w.m122602a(this.f105729y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(DefaultLanguageDecider.class), this.f105728x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$n */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105730w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105731x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105732y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105730w = c38266c;
            this.f105731x = interfaceC35951a;
            this.f105732y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            return this.f105730w.m122602a(this.f105732y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), this.f105731x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$o */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class o extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105733w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105734x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105735y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105733w = c38266c;
            this.f105734x = interfaceC35951a;
            this.f105735y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            return this.f105733w.m122602a(this.f105735y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), this.f105734x);
        }
    }

    /* JADX INFO: renamed from: nd1.i$p */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class p extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ C38266c f105736w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f105737x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f105738y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C38266c c38266c, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f105736w = c38266c;
            this.f105737x = interfaceC35951a;
            this.f105738y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            return this.f105736w.m122602a(this.f105738y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), this.f105737x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final InterfaceC27837a0 m78882A1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30294a((C27853p) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27853p.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C27847j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null), (NewWhoopLoginInterceptor) single.m122602a(null, c22673i0.getOrCreateKotlinClass(NewWhoopLoginInterceptor.class), null), (C39352a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (AppConfigurationRepository) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AppConfigurationRepository.class), null), (C37223g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C37223g.class), null), (C29104a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C29104a.class), null), (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C12066b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), null, DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B1 */
    public static final C27847j m78885B1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C27847j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final C4367g m78888C1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        SharedPreferences sharedPreferences = AbstractC29125c.m88532i(factory).getSharedPreferences("prefs-raw-data", 0);
        AbstractC22676k.m65749i(sharedPreferences, "getSharedPreferences(...)");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4367g(sharedPreferences, (InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null), (InterfaceC14515a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14515a.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), InterfaceC34116n.INSTANCE.m107848a("RawDataPacketsSaveAnalytics"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final NewWhoopLoginInterceptor m78891D1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new NewWhoopLoginInterceptor((InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C27847j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null), (AbstractC21909c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null), (FeatureFlagRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (C37223g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C37223g.class), null), (AppConfigurationRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AppConfigurationRepository.class), null), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), null, 128, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final C28176k1 m78894E1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28176k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final C27838b m78897F1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27838b((C33950b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C33950b.class), null), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null), (InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final C21441i m78900G1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C27858u c27858u = (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c);
        C27847j c27847j = (C27847j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        return new C21441i(c27858u, c27847j, AbstractC30060g.m92087G(enumC23463i, new k(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new l(factory, null, null)), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final InterfaceC28215x1 m78903H1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28218y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final C35210f m78906I1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC14515a interfaceC14515a = (InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null);
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        AbstractC22676k.m65749i(clockSystemDefaultZone, "systemDefaultZone(...)");
        return new C35210f(interfaceC14515a, clockSystemDefaultZone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final C4365e m78909J1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C4365e((InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null));
    }

    /* JADX INFO: renamed from: K0 */
    private static final C23454a0 m78911K0(C33768a module) {
        AbstractC22676k.m65750j(module, "$this$module");
        C35953c c35953cM114198f = AbstractC35952b.m114198f("defaultOkHttpClient");
        final int i13 = 8;
        C30330b c30330b = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34826l0.class), c35953cM114198f, new C26578d(i13), 1);
        C35953c c35953cM95648x = AbstractC31061c.m95648x(c30330b, module, AbstractC21598x.m60669Y(c30330b.m92688a(), c35953cM114198f, AbstractC35846d.m113782g()), "unauthenticatedOkHttpClient");
        final int i14 = 10;
        C30330b c30330b2 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34826l0.class), c35953cM95648x, new C26578d(i14), 1);
        C35953c c35953cM95648x2 = AbstractC31061c.m95648x(c30330b2, module, AbstractC21598x.m60669Y(c30330b2.m92688a(), c35953cM95648x, AbstractC35846d.m113782g()), "cacheEnabledOktthpClient");
        final int i15 = 22;
        C30330b c30330b3 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C34826l0.class), c35953cM95648x2, new C26578d(i15), 1);
        C35953c c35953cM95648x3 = AbstractC31061c.m95648x(c30330b3, module, AbstractC21598x.m60669Y(c30330b3.m92688a(), c35953cM95648x2, AbstractC35846d.m113782g()), "cacheEnabledRetrofit");
        final int i16 = 4;
        C30330b c30330b4 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C29224y0.class), c35953cM95648x3, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i16) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        C35953c c35953cM95648x4 = AbstractC31061c.m95648x(c30330b4, module, AbstractC21598x.m60669Y(c30330b4.m92688a(), c35953cM95648x3, AbstractC35846d.m113782g()), "httpLoggingInterceptor");
        final int i17 = 16;
        C30330b c30330b5 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C25480c.class), c35953cM95648x4, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i17) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b5.m92688a(), c35953cM95648x4, AbstractC35846d.m113782g()), new C31365d(c30330b5), false);
        final int i18 = 28;
        InterfaceC4351m interfaceC4351m = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g = AbstractC35846d.m113782g();
        C30330b c30330b6 = new C30330b(c35953cM113782g, AbstractC22671h0.m65688a(C21441i.class), null, interfaceC4351m, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b6.m92688a(), null, c35953cM113782g), new C31362a(c30330b6), false);
        InterfaceC4351m interfaceC4351m2 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i14) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g2 = AbstractC35846d.m113782g();
        C30330b c30330b7 = new C30330b(c35953cM113782g2, AbstractC22671h0.m65688a(C21440h.class), null, interfaceC4351m2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b7.m92688a(), null, c35953cM113782g2), new C31362a(c30330b7), false);
        InterfaceC4351m interfaceC4351m3 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g3 = AbstractC35846d.m113782g();
        C30330b c30330b8 = new C30330b(c35953cM113782g3, AbstractC22671h0.m65688a(C21434b.class), null, interfaceC4351m3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b8.m92688a(), null, c35953cM113782g3), new C31362a(c30330b8), false);
        InterfaceC4351m interfaceC4351m4 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i18) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g4 = AbstractC35846d.m113782g();
        C30330b c30330b9 = new C30330b(c35953cM113782g4, AbstractC22671h0.m65688a(C21439g.class), null, interfaceC4351m4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b9.m92688a(), null, c35953cM113782g4), new C31362a(c30330b9), false);
        final int i19 = 29;
        InterfaceC4351m interfaceC4351m5 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g5 = AbstractC35846d.m113782g();
        C30330b c30330b10 = new C30330b(c35953cM113782g5, AbstractC22671h0.m65688a(C21449q.class), null, interfaceC4351m5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b10.m92688a(), null, c35953cM113782g5), new C31362a(c30330b10), false);
        C26578d c26578d = new C26578d(19);
        C35953c c35953cM113782g6 = AbstractC35846d.m113782g();
        C30330b c30330b11 = new C30330b(c35953cM113782g6, AbstractC22671h0.m65688a(C21454v.class), null, c26578d, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b11.m92688a(), null, c35953cM113782g6), new C31362a(c30330b11), false);
        final int i24 = 0;
        InterfaceC4351m interfaceC4351m6 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i24) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g7 = AbstractC35846d.m113782g();
        C30330b c30330b12 = new C30330b(c35953cM113782g7, AbstractC22671h0.m65688a(C21444l.class), null, interfaceC4351m6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b12.m92688a(), null, c35953cM113782g7), new C31362a(c30330b12), false);
        final int i25 = 11;
        InterfaceC4351m interfaceC4351m7 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i25) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g8 = AbstractC35846d.m113782g();
        C30330b c30330b13 = new C30330b(c35953cM113782g8, AbstractC22671h0.m65688a(C21443k.class), null, interfaceC4351m7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b13.m92688a(), null, c35953cM113782g8), new C31362a(c30330b13), false);
        C35953c c35953cM114198f2 = AbstractC35952b.m114198f("onboardingRefreshMutex");
        C30330b c30330b14 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC25435a.class), c35953cM114198f2, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i15) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b14.m92688a(), c35953cM114198f2, AbstractC35846d.m113782g()), new C31365d(c30330b14), false);
        final int i26 = 3;
        InterfaceC4351m interfaceC4351m8 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i26) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g9 = AbstractC35846d.m113782g();
        C30330b c30330b15 = new C30330b(c35953cM113782g9, AbstractC22671h0.m65688a(C23543a.class), null, interfaceC4351m8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b15.m92688a(), null, c35953cM113782g9), new C31362a(c30330b15), false);
        final int i27 = 14;
        InterfaceC4351m interfaceC4351m9 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g10 = AbstractC35846d.m113782g();
        C30330b c30330b16 = new C30330b(c35953cM113782g10, AbstractC22671h0.m65688a(C21450r.class), null, interfaceC4351m9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b16.m92688a(), null, c35953cM113782g10), new C31362a(c30330b16), false);
        final int i28 = 25;
        C30330b c30330b17 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C21448p.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b17.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b17), false);
        C26582h c26582h = new C26582h(i24);
        C35953c c35953cM113782g11 = AbstractC35846d.m113782g();
        C30330b c30330b18 = new C30330b(c35953cM113782g11, AbstractC22671h0.m65688a(C20452d.class), null, c26582h, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b18.m92688a(), null, c35953cM113782g11), new C31362a(c30330b18), false);
        final int i29 = 1;
        C30330b c30330b19 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C21446n.class), null, new C26582h(i29), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b19.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b19), false);
        C30330b c30330b20 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C21445m.class), null, new C26578d(9), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b20.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b20), false);
        C26578d c26578d2 = new C26578d(i25);
        C35953c c35953cM113782g12 = AbstractC35846d.m113782g();
        C30330b c30330b21 = new C30330b(c35953cM113782g12, AbstractC22671h0.m65688a(C21436d.class), null, c26578d2, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b21.m92688a(), null, c35953cM113782g12), new C31362a(c30330b21), false);
        C26578d c26578d3 = new C26578d(12);
        C35953c c35953cM113782g13 = AbstractC35846d.m113782g();
        C30330b c30330b22 = new C30330b(c35953cM113782g13, AbstractC22671h0.m65688a(ActivitiesApi.class), null, c26578d3, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b22.m92688a(), null, c35953cM113782g13), new C31362a(c30330b22), false);
        C26578d c26578d4 = new C26578d(13);
        C35953c c35953cM113782g14 = AbstractC35846d.m113782g();
        C30330b c30330b23 = new C30330b(c35953cM113782g14, AbstractC22671h0.m65688a(GpsServiceApi.class), null, c26578d4, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b23.m92688a(), null, c35953cM113782g14), new C31362a(c30330b23), false);
        C26578d c26578d5 = new C26578d(i27);
        C35953c c35953cM113782g15 = AbstractC35846d.m113782g();
        C30330b c30330b24 = new C30330b(c35953cM113782g15, AbstractC22671h0.m65688a(HomeComponentDismissApi.class), null, c26578d5, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b24.m92688a(), null, c35953cM113782g15), new C31362a(c30330b24), false);
        C26578d c26578d6 = new C26578d(15);
        C35953c c35953cM113782g16 = AbstractC35846d.m113782g();
        C30330b c30330b25 = new C30330b(c35953cM113782g16, AbstractC22671h0.m65688a(C34659c.class), null, c26578d6, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b25.m92688a(), null, c35953cM113782g16), new C31362a(c30330b25), false);
        C35953c c35953cM114198f3 = AbstractC35952b.m114198f("baseRetrofit");
        C30330b c30330b26 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C29224y0.class), c35953cM114198f3, new C26578d(i17), 1);
        C35953c c35953cM95648x5 = AbstractC31061c.m95648x(c30330b26, module, AbstractC21598x.m60669Y(c30330b26.m92688a(), c35953cM114198f3, AbstractC35846d.m113782g()), "legacyDefaultRetrofit");
        final int i34 = 17;
        C30330b c30330b27 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C29224y0.class), c35953cM95648x5, new C26578d(i34), 1);
        C35953c c35953cM95648x6 = AbstractC31061c.m95648x(c30330b27, module, AbstractC21598x.m60669Y(c30330b27.m92688a(), c35953cM95648x5, AbstractC35846d.m113782g()), "defaultRetrofit");
        C30330b c30330b28 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C29224y0.class), c35953cM95648x6, new C26578d(18), 1);
        C35953c c35953cM95648x7 = AbstractC31061c.m95648x(c30330b28, module, AbstractC21598x.m60669Y(c30330b28.m92688a(), c35953cM95648x6, AbstractC35846d.m113782g()), "retrofitWithKtxSerialization");
        C26578d c26578d7 = new C26578d(20);
        C35953c c35953cM113782g17 = AbstractC35846d.m113782g();
        C30330b c30330b29 = new C30330b(c35953cM113782g17, AbstractC22671h0.m65688a(C29224y0.class), c35953cM95648x7, c26578d7, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b29.m92688a(), c35953cM95648x7, c35953cM113782g17), new C31362a(c30330b29), false);
        C35953c c35953cM114198f4 = AbstractC35952b.m114198f("featureFlaggableLegacyDefaultRetrofit");
        C26578d c26578d8 = new C26578d(21);
        C35953c c35953cM113782g18 = AbstractC35846d.m113782g();
        C30330b c30330b30 = new C30330b(c35953cM113782g18, AbstractC22671h0.m65688a(C29224y0.class), c35953cM114198f4, c26578d8, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b30.m92688a(), c35953cM114198f4, c35953cM113782g18), new C31362a(c30330b30), false);
        C35953c c35953cM114198f5 = AbstractC35952b.m114198f("featureFlaggableDefaultRetrofit");
        C26578d c26578d9 = new C26578d(23);
        C35953c c35953cM113782g19 = AbstractC35846d.m113782g();
        C30330b c30330b31 = new C30330b(c35953cM113782g19, AbstractC22671h0.m65688a(C29224y0.class), c35953cM114198f5, c26578d9, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b31.m92688a(), c35953cM114198f5, c35953cM113782g19), new C31362a(c30330b31), false);
        C35953c c35953cM114198f6 = AbstractC35952b.m114198f("featureFlaggableRetrofitWithRxJava");
        final int i35 = 24;
        C26578d c26578d10 = new C26578d(i35);
        C35953c c35953cM113782g20 = AbstractC35846d.m113782g();
        C30330b c30330b32 = new C30330b(c35953cM113782g20, AbstractC22671h0.m65688a(C29224y0.class), c35953cM114198f6, c26578d10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b32.m92688a(), c35953cM114198f6, c35953cM113782g20), new C31362a(c30330b32), false);
        C35953c c35953cM114198f7 = AbstractC35952b.m114198f("legacyGsonConverter");
        C30330b c30330b33 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31410a.class), c35953cM114198f7, new C26578d(i28), 1);
        C35953c c35953cM95648x8 = AbstractC31061c.m95648x(c30330b33, module, AbstractC21598x.m60669Y(c30330b33.m92688a(), c35953cM114198f7, AbstractC35846d.m113782g()), "gsonConverter");
        C30330b c30330b34 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C31410a.class), c35953cM95648x8, new C26578d(26), 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b34.m92688a(), c35953cM95648x8, AbstractC35846d.m113782g()), new C31365d(c30330b34), false);
        C26578d c26578d11 = new C26578d(27);
        C35953c c35953cM113782g21 = AbstractC35846d.m113782g();
        C30330b c30330b35 = new C30330b(c35953cM113782g21, AbstractC22671h0.m65688a(C18258c.class), null, c26578d11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b35.m92688a(), null, c35953cM113782g21), new C31362a(c30330b35), false);
        C35953c c35953cM114198f8 = AbstractC35952b.m114198f("shared-refs-perm-status-decider");
        C26578d c26578d12 = new C26578d(i18);
        C35953c c35953cM113782g22 = AbstractC35846d.m113782g();
        C30330b c30330b36 = new C30330b(c35953cM113782g22, AbstractC22671h0.m65688a(SharedPreferences.class), c35953cM114198f8, c26578d12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b36.m92688a(), c35953cM114198f8, c35953cM113782g22), new C31362a(c30330b36), false);
        C26578d c26578d13 = new C26578d(i19);
        C35953c c35953cM113782g23 = AbstractC35846d.m113782g();
        C30330b c30330b37 = new C30330b(c35953cM113782g23, AbstractC22671h0.m65688a(C14519e.class), null, c26578d13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b37.m92688a(), null, c35953cM113782g23), new C31362a(c30330b37), false);
        C30330b c30330b38 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(FeatureFlagRepository.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x = AbstractC2875y.m8311x(c30330b38, module, AbstractC21598x.m60669Y(c30330b38.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz = AbstractC22671h0.m65688a(FeatureFlagChecker.class);
        AbstractC22676k.m65750j(clazz, "clazz");
        C30330b c30330b39 = c31365dM8311x.f129023a;
        c30330b39.f124475f = AbstractC25265s.m74128f1(clazz, (Collection) c30330b39.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz, c30330b39.f124472c, c30330b39.f124470a), c31365dM8311x, true);
        final int i36 = 2;
        C30330b c30330b40 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C27859v.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i36) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x2 = AbstractC2875y.m8311x(c30330b40, module, AbstractC21598x.m60669Y(c30330b40.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d clazz2 = AbstractC22671h0.m65688a(ActiveSessionChecker.class);
        AbstractC22676k.m65750j(clazz2, "clazz");
        C30330b c30330b41 = c31365dM8311x2.f129023a;
        c30330b41.f124475f = AbstractC25265s.m74128f1(clazz2, (Collection) c30330b41.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz2, c30330b41.f124472c, c30330b41.f124470a), c31365dM8311x2, true);
        final int i37 = 3;
        InterfaceC4351m interfaceC4351m10 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i37) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g24 = AbstractC35846d.m113782g();
        C30330b c30330b42 = new C30330b(c35953cM113782g24, AbstractC22671h0.m65688a(ArabicLanguageEnabledChecker.class), null, interfaceC4351m10, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b42.m92688a(), null, c35953cM113782g24), new C31362a(c30330b42), false);
        final int i38 = 5;
        C30330b c30330b43 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(ArabicBetaOptOutStatusStore.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i38) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b43.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b43), false);
        final int i39 = 6;
        InterfaceC4351m interfaceC4351m11 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i39) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g25 = AbstractC35846d.m113782g();
        C30330b c30330b44 = new C30330b(c35953cM113782g25, AbstractC22671h0.m65688a(AuthServiceApiV2.class), null, interfaceC4351m11, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b44.m92688a(), null, c35953cM113782g25), new C31362a(c30330b44), false);
        final int i44 = 7;
        InterfaceC4351m interfaceC4351m12 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i44) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g26 = AbstractC35846d.m113782g();
        C30330b c30330b45 = new C30330b(c35953cM113782g26, AbstractC22671h0.m65688a(BootstrapApi.class), null, interfaceC4351m12, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b45.m92688a(), null, c35953cM113782g26), new C31362a(c30330b45), false);
        InterfaceC4351m interfaceC4351m13 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g27 = AbstractC35846d.m113782g();
        C30330b c30330b46 = new C30330b(c35953cM113782g27, AbstractC22671h0.m65688a(C29104a.class), null, interfaceC4351m13, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b46.m92688a(), null, c35953cM113782g27), new C31362a(c30330b46), false);
        final int i45 = 9;
        C30330b c30330b47 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC27837a0.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i45) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b47.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b47), false);
        final int i46 = 10;
        C30330b c30330b48 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C27847j.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i46) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b48.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b48), false);
        final int i47 = 12;
        InterfaceC4351m interfaceC4351m14 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i47) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g28 = AbstractC35846d.m113782g();
        C30330b c30330b49 = new C30330b(c35953cM113782g28, AbstractC22671h0.m65688a(C4367g.class), null, interfaceC4351m14, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b49.m92688a(), null, c35953cM113782g28), new C31362a(c30330b49), false);
        final int i48 = 13;
        InterfaceC4351m interfaceC4351m15 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i48) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g29 = AbstractC35846d.m113782g();
        C30330b c30330b50 = new C30330b(c35953cM113782g29, AbstractC22671h0.m65688a(NewWhoopLoginInterceptor.class), null, interfaceC4351m15, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b50.m92688a(), null, c35953cM113782g29), new C31362a(c30330b50), false);
        InterfaceC4351m interfaceC4351m16 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i27) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g30 = AbstractC35846d.m113782g();
        C30330b c30330b51 = new C30330b(c35953cM113782g30, AbstractC22671h0.m65688a(C28176k1.class), null, interfaceC4351m16, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b51.m92688a(), null, c35953cM113782g30), new C31362a(c30330b51), false);
        final int i49 = 15;
        InterfaceC4351m interfaceC4351m17 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g31 = AbstractC35846d.m113782g();
        C30330b c30330b52 = new C30330b(c35953cM113782g31, AbstractC22671h0.m65688a(C27838b.class), null, interfaceC4351m17, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b52.m92688a(), null, c35953cM113782g31), new C31362a(c30330b52), false);
        InterfaceC4351m interfaceC4351m18 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g32 = AbstractC35846d.m113782g();
        C30330b c30330b53 = new C30330b(c35953cM113782g32, AbstractC22671h0.m65688a(InterfaceC28215x1.class), null, interfaceC4351m18, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b53.m92688a(), null, c35953cM113782g32), new C31362a(c30330b53), false);
        final int i54 = 18;
        InterfaceC4351m interfaceC4351m19 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i54) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g33 = AbstractC35846d.m113782g();
        C30330b c30330b54 = new C30330b(c35953cM113782g33, AbstractC22671h0.m65688a(C35210f.class), null, interfaceC4351m19, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b54.m92688a(), null, c35953cM113782g33), new C31362a(c30330b54), false);
        final int i55 = 19;
        InterfaceC4351m interfaceC4351m20 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i55) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g34 = AbstractC35846d.m113782g();
        C30330b c30330b55 = new C30330b(c35953cM113782g34, AbstractC22671h0.m65688a(C4365e.class), null, interfaceC4351m20, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b55.m92688a(), null, c35953cM113782g34), new C31362a(c30330b55), false);
        final int i56 = 20;
        InterfaceC4351m interfaceC4351m21 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i56) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g35 = AbstractC35846d.m113782g();
        C30330b c30330b56 = new C30330b(c35953cM113782g35, AbstractC22671h0.m65688a(C28195r.class), null, interfaceC4351m21, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b56.m92688a(), null, c35953cM113782g35), new C31362a(c30330b56), false);
        final int i57 = 21;
        C30330b c30330b57 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(InterfaceC14643c.class), null, new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i57) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b57.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b57), false);
        final int i58 = 23;
        InterfaceC4351m interfaceC4351m22 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i58) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g36 = AbstractC35846d.m113782g();
        C30330b c30330b58 = new C30330b(c35953cM113782g36, AbstractC22671h0.m65688a(InterfaceC14644d.class), null, interfaceC4351m22, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b58.m92688a(), null, c35953cM113782g36), new C31362a(c30330b58), false);
        InterfaceC4351m interfaceC4351m23 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g37 = AbstractC35846d.m113782g();
        C30330b c30330b59 = new C30330b(c35953cM113782g37, AbstractC22671h0.m65688a(InterfaceC14652l.class), null, interfaceC4351m23, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b59.m92688a(), null, c35953cM113782g37), new C31362a(c30330b59), false);
        InterfaceC4351m interfaceC4351m24 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i28) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g38 = AbstractC35846d.m113782g();
        C30330b c30330b60 = new C30330b(c35953cM113782g38, AbstractC22671h0.m65688a(C14647g.class), null, interfaceC4351m24, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b60.m92688a(), null, c35953cM113782g38), new C31362a(c30330b60), false);
        final int i59 = 26;
        InterfaceC4351m interfaceC4351m25 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i59) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g39 = AbstractC35846d.m113782g();
        C30330b c30330b61 = new C30330b(c35953cM113782g39, AbstractC22671h0.m65688a(InterfaceC14654n.class), null, interfaceC4351m25, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b61.m92688a(), null, c35953cM113782g39), new C31362a(c30330b61), false);
        final int i64 = 27;
        InterfaceC4351m interfaceC4351m26 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i64) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g40 = AbstractC35846d.m113782g();
        C30330b c30330b62 = new C30330b(c35953cM113782g40, AbstractC22671h0.m65688a(C31242a.class), null, interfaceC4351m26, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b62.m92688a(), null, c35953cM113782g40), new C31362a(c30330b62), false);
        InterfaceC4351m interfaceC4351m27 = new InterfaceC4351m() { // from class: nd1.f
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i19) {
                    case 0:
                        return C26583i.m78923O0(c38266c, c34911a);
                    case 1:
                        return C26583i.m79032s1(c38266c, c34911a);
                    case 2:
                        return C26583i.m79036t1(c38266c, c34911a);
                    case 3:
                        return C26583i.m79040u1(c38266c, c34911a);
                    case 4:
                        return C26583i.m79000k1(c38266c, c34911a);
                    case 5:
                        return C26583i.m79047w1(c38266c, c34911a);
                    case 6:
                        return C26583i.m79050x1(c38266c, c34911a);
                    case 7:
                        return C26583i.m79053y1(c38266c, c34911a);
                    case 8:
                        return C26583i.m79056z1(c38266c, c34911a);
                    case 9:
                        return C26583i.m78882A1(c38266c, c34911a);
                    case 10:
                        return C26583i.m78885B1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78926P0(c38266c, c34911a);
                    case 12:
                        return C26583i.m78888C1(c38266c, c34911a);
                    case 13:
                        return C26583i.m78891D1(c38266c, c34911a);
                    case 14:
                        return C26583i.m78894E1(c38266c, c34911a);
                    case 15:
                        return C26583i.m78897F1(c38266c, c34911a);
                    case 16:
                        return C26583i.m79044v1(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78903H1(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m78906I1(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m78909J1(c38266c, c34911a);
                    case 20:
                        return C26583i.m78912K1(c38266c, c34911a);
                    case 21:
                        return C26583i.m78915L1(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78929Q0(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m78918M1(c38266c, c34911a);
                    case 24:
                        return C26583i.m78921N1(c38266c, c34911a);
                    case 25:
                        return C26583i.m78924O1(c38266c, c34911a);
                    case 26:
                        return C26583i.m78927P1(c38266c, c34911a);
                    case 27:
                        return C26583i.m78930Q1(c38266c, c34911a);
                    case 28:
                        return C26583i.m78900G1(c38266c, c34911a);
                    default:
                        return C26583i.m78936S1(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g41 = AbstractC35846d.m113782g();
        C30330b c30330b63 = new C30330b(c35953cM113782g41, AbstractC22671h0.m65688a(C40195i.class), null, interfaceC4351m27, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b63.m92688a(), null, c35953cM113782g41), new C31362a(c30330b63), false);
        final int i65 = 0;
        InterfaceC4351m interfaceC4351m28 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i65) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g42 = AbstractC35846d.m113782g();
        C30330b c30330b64 = new C30330b(c35953cM113782g42, AbstractC22671h0.m65688a(InterfaceC21751e.class), null, interfaceC4351m28, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b64.m92688a(), null, c35953cM113782g42), new C31362a(c30330b64), false);
        InterfaceC4351m interfaceC4351m29 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i29) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g43 = AbstractC35846d.m113782g();
        C30330b c30330b65 = new C30330b(c35953cM113782g43, AbstractC22671h0.m65688a(C18270o.class), null, interfaceC4351m29, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b65.m92688a(), null, c35953cM113782g43), new C31362a(c30330b65), false);
        final int i66 = 2;
        C30330b c30330b66 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C35834d.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i66) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106773a().add(AbstractC2875y.m8311x(c30330b66, module, AbstractC21598x.m60669Y(c30330b66.m92688a(), null, AbstractC35846d.m113782g())));
        final int i67 = 4;
        C30330b c30330b67 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C35833c.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i67) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b67.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b67), false);
        final int i68 = 5;
        InterfaceC4351m interfaceC4351m30 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i68) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g44 = AbstractC35846d.m113782g();
        C30330b c30330b68 = new C30330b(c35953cM113782g44, AbstractC22671h0.m65688a(C35832b.class), null, interfaceC4351m30, 2);
        String strM60669Y = AbstractC21598x.m60669Y(c30330b68.m92688a(), null, c35953cM113782g44);
        C31362a c31362a = new C31362a(c30330b68);
        module.m106774b(strM60669Y, c31362a, false);
        InterfaceC21461d clazz3 = AbstractC22671h0.m65688a(InterfaceC35831a.class);
        AbstractC22676k.m65750j(clazz3, "clazz");
        C30330b c30330b69 = c31362a.f129023a;
        c30330b69.f124475f = AbstractC25265s.m74128f1(clazz3, (Collection) c30330b69.f124475f);
        module.m106774b(AbstractC21598x.m60669Y(clazz3, c30330b69.f124472c, c30330b69.f124470a), c31362a, true);
        final int i69 = 6;
        InterfaceC4351m interfaceC4351m31 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i69) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g45 = AbstractC35846d.m113782g();
        C30330b c30330b70 = new C30330b(c35953cM113782g45, AbstractC22671h0.m65688a(C0599h.class), null, interfaceC4351m31, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b70.m92688a(), null, c35953cM113782g45), new C31362a(c30330b70), false);
        final int i74 = 7;
        C30330b c30330b71 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C40206b.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i74) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        C31365d c31365dM8311x3 = AbstractC2875y.m8311x(c30330b71, module, AbstractC21598x.m60669Y(c30330b71.m92688a(), null, AbstractC35846d.m113782g()));
        InterfaceC21461d[] interfaceC21461dArr = {AbstractC22671h0.m65688a(InterfaceC40205a.class), AbstractC22671h0.m65688a(InterfaceC40208d.class)};
        C30330b c30330b72 = c31365dM8311x3.f129023a;
        c30330b72.f124475f = AbstractC25265s.m74130h1((Collection) c30330b72.f124475f, interfaceC21461dArr);
        for (InterfaceC21461d interfaceC21461d : interfaceC21461dArr) {
            module.m106774b(AbstractC21598x.m60669Y(interfaceC21461d, c30330b72.f124472c, c30330b72.f124470a), c31365dM8311x3, true);
        }
        InterfaceC4351m interfaceC4351m32 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i13) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g46 = AbstractC35846d.m113782g();
        C30330b c30330b73 = new C30330b(c35953cM113782g46, AbstractC22671h0.m65688a(InterfaceC36471a.class), null, interfaceC4351m32, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b73.m92688a(), null, c35953cM113782g46), new C31362a(c30330b73), false);
        final int i75 = 9;
        InterfaceC4351m interfaceC4351m33 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i75) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g47 = AbstractC35846d.m113782g();
        C30330b c30330b74 = new C30330b(c35953cM113782g47, AbstractC22671h0.m65688a(C39352a.class), null, interfaceC4351m33, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b74.m92688a(), null, c35953cM113782g47), new C31362a(c30330b74), false);
        final int i76 = 11;
        InterfaceC4351m interfaceC4351m34 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i76) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g48 = AbstractC35846d.m113782g();
        C30330b c30330b75 = new C30330b(c35953cM113782g48, AbstractC22671h0.m65688a(C39353b.class), null, interfaceC4351m34, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b75.m92688a(), null, c35953cM113782g48), new C31362a(c30330b75), false);
        final int i77 = 12;
        InterfaceC4351m interfaceC4351m35 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i77) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g49 = AbstractC35846d.m113782g();
        C30330b c30330b76 = new C30330b(c35953cM113782g49, AbstractC22671h0.m65688a(C28156e.class), null, interfaceC4351m35, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b76.m92688a(), null, c35953cM113782g49), new C31362a(c30330b76), false);
        final int i78 = 13;
        InterfaceC4351m interfaceC4351m36 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i78) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g50 = AbstractC35846d.m113782g();
        C30330b c30330b77 = new C30330b(c35953cM113782g50, AbstractC22671h0.m65688a(C32053b.class), null, interfaceC4351m36, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b77.m92688a(), null, c35953cM113782g50), new C31362a(c30330b77), false);
        InterfaceC4351m interfaceC4351m37 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i49) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g51 = AbstractC35846d.m113782g();
        C30330b c30330b78 = new C30330b(c35953cM113782g51, AbstractC22671h0.m65688a(FusedLocationProviderClient.class), null, interfaceC4351m37, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b78.m92688a(), null, c35953cM113782g51), new C31362a(c30330b78), false);
        final int i79 = 16;
        InterfaceC4351m interfaceC4351m38 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i79) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g52 = AbstractC35846d.m113782g();
        C30330b c30330b79 = new C30330b(c35953cM113782g52, AbstractC22671h0.m65688a(InterfaceC14815c.class), null, interfaceC4351m38, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b79.m92688a(), null, c35953cM113782g52), new C31362a(c30330b79), false);
        InterfaceC4351m interfaceC4351m39 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i34) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g53 = AbstractC35846d.m113782g();
        C30330b c30330b80 = new C30330b(c35953cM113782g53, AbstractC22671h0.m65688a(AvatarApi.class), null, interfaceC4351m39, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b80.m92688a(), null, c35953cM113782g53), new C31362a(c30330b80), false);
        final int i83 = 18;
        InterfaceC4351m interfaceC4351m40 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i83) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g54 = AbstractC35846d.m113782g();
        C30330b c30330b81 = new C30330b(c35953cM113782g54, AbstractC22671h0.m65688a(InterfaceC29494b.class), null, interfaceC4351m40, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b81.m92688a(), null, c35953cM113782g54), new C31362a(c30330b81), false);
        final int i84 = 19;
        InterfaceC4351m interfaceC4351m41 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i84) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g55 = AbstractC35846d.m113782g();
        C30330b c30330b82 = new C30330b(c35953cM113782g55, AbstractC22671h0.m65688a(C29493a.class), null, interfaceC4351m41, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b82.m92688a(), null, c35953cM113782g55), new C31362a(c30330b82), false);
        final int i85 = 20;
        InterfaceC4351m interfaceC4351m42 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i85) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g56 = AbstractC35846d.m113782g();
        C30330b c30330b83 = new C30330b(c35953cM113782g56, AbstractC22671h0.m65688a(EmailDataStoreHelper.class), null, interfaceC4351m42, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b83.m92688a(), null, c35953cM113782g56), new C31362a(c30330b83), false);
        final int i86 = 21;
        InterfaceC4351m interfaceC4351m43 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i86) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g57 = AbstractC35846d.m113782g();
        C30330b c30330b84 = new C30330b(c35953cM113782g57, AbstractC22671h0.m65688a(C11832a.class), null, interfaceC4351m43, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b84.m92688a(), null, c35953cM113782g57), new C31362a(c30330b84), false);
        final int i87 = 23;
        C30330b c30330b85 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C30073e.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i87) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b85.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b85), false);
        InterfaceC4351m interfaceC4351m44 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i35) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g58 = AbstractC35846d.m113782g();
        C30330b c30330b86 = new C30330b(c35953cM113782g58, AbstractC22671h0.m65688a(C10023a.class), null, interfaceC4351m44, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b86.m92688a(), null, c35953cM113782g58), new C31362a(c30330b86), false);
        final int i88 = 26;
        InterfaceC4351m interfaceC4351m45 = new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i88) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        };
        C35953c c35953cM113782g59 = AbstractC35846d.m113782g();
        C30330b c30330b87 = new C30330b(c35953cM113782g59, AbstractC22671h0.m65688a(C27862y.class), null, interfaceC4351m45, 2);
        module.m106774b(AbstractC21598x.m60669Y(c30330b87.m92688a(), null, c35953cM113782g59), new C31362a(c30330b87), false);
        final int i89 = 27;
        C30330b c30330b88 = new C30330b(AbstractC35846d.m113782g(), AbstractC22671h0.m65688a(C18259d.class), null, new InterfaceC4351m() { // from class: nd1.g
            @Override // c93.InterfaceC4351m
            public final Object invoke(Object obj, Object obj2) {
                C38266c c38266c = (C38266c) obj;
                C34911a c34911a = (C34911a) obj2;
                switch (i89) {
                    case 0:
                        return C26583i.m78939T1(c38266c, c34911a);
                    case 1:
                        return C26583i.m78942U1(c38266c, c34911a);
                    case 2:
                        return C26583i.m78948W1(c38266c, c34911a);
                    case 3:
                        return C26583i.m78932R0(c38266c, c34911a);
                    case 4:
                        return C26583i.m78951X1(c38266c, c34911a);
                    case 5:
                        return C26583i.m78954Y1(c38266c, c34911a);
                    case 6:
                        return C26583i.m78957Z1(c38266c, c34911a);
                    case 7:
                        return C26583i.m78961a2(c38266c, c34911a);
                    case 8:
                        return C26583i.m78965b2(c38266c, c34911a);
                    case 9:
                        return C26583i.m78969c2(c38266c, c34911a);
                    case 10:
                        return C26583i.m78933R1(c38266c, c34911a);
                    case 11:
                        return C26583i.m78977e2(c38266c, c34911a);
                    case 12:
                        return C26583i.m78981f2(c38266c, c34911a);
                    case 13:
                        return C26583i.m78985g2(c38266c, c34911a);
                    case 14:
                        return C26583i.m78935S0(c38266c, c34911a);
                    case 15:
                        return C26583i.m78989h2(c38266c, c34911a);
                    case 16:
                        return C26583i.m78993i2(c38266c, c34911a);
                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                        return C26583i.m78997j2(c38266c, c34911a);
                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                        return C26583i.m79001k2(c38266c, c34911a);
                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                        return C26583i.m79005l2(c38266c, c34911a);
                    case 20:
                        return C26583i.m79009m2(c38266c, c34911a);
                    case 21:
                        return C26583i.m79013n2(c38266c, c34911a);
                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                        return C26583i.m78973d2(c38266c, c34911a);
                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                        return C26583i.m79021p2(c38266c, c34911a);
                    case 24:
                        return C26583i.m79025q2(c38266c, c34911a);
                    case 25:
                        return C26583i.m78938T0(c38266c, c34911a);
                    case 26:
                        return C26583i.m79033s2(c38266c, c34911a);
                    case 27:
                        return C26583i.m79037t2(c38266c, c34911a);
                    case 28:
                        return C26583i.m79017o2(c38266c, c34911a);
                    default:
                        return C26583i.m79041u2(c38266c, c34911a);
                }
            }
        }, 1);
        module.m106774b(AbstractC21598x.m60669Y(c30330b88.m92688a(), null, AbstractC35846d.m113782g()), new C31365d(c30330b88), false);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final C28195r m78912K1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C28195r((FeatureFlagRepository) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L0 */
    public static final C34826l0 m78914L0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C34824k0 c34824k0 = new C34824k0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21449q.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C20452d.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21441i.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21434b.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21444l.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25480c.class), new C35953c("httpLoggingInterceptor")));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21446n.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21454v.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21436d.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21439g.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21437e.class), null));
        InterfaceC34803c authenticator = (InterfaceC34803c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21450r.class), null);
        AbstractC22676k.m65750j(authenticator, "authenticator");
        c34824k0.f146619h = authenticator;
        return new C34826l0(c34824k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final InterfaceC14643c m78915L1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C14645e(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final C34826l0 m78917M0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C34824k0 c34824k0 = new C34824k0();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21449q.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C20452d.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21434b.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C25480c.class), new C35953c("httpLoggingInterceptor")));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21454v.class), null));
        c34824k0.m109891a((InterfaceC34816g0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C21446n.class), null));
        TimeUnit unit = TimeUnit.SECONDS;
        AbstractC22676k.m65750j(unit, "unit");
        c34824k0.f146635x = AbstractC37174h.m119135b("timeout", 10L, unit);
        return new C34826l0(c34824k0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final InterfaceC14644d m78918M1(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Context.class));
        if (objM110111b != null) {
            return new C14646f((Context) objM110111b, (C14647g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14647g.class), null), (InterfaceC14643c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14643c.class), null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Context.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public static final C21454v m78920N0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21454v((C28162g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28162g.class), null), AbstractC30060g.m92087G(EnumC23463i.f92933w, new a(factory, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final InterfaceC14652l m78921N1(C38266c factory, C34911a params) throws DefinitionParameterException {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        Object objM110111b = params.m110111b(c22673i0.getOrCreateKotlinClass(Context.class));
        if (objM110111b != null) {
            return new C14649i((Context) objM110111b, (C14647g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C14647g.class), null), (InterfaceC14643c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC14643c.class), null));
        }
        throw new DefinitionParameterException(AbstractC25012a.m73378k(c22673i0, Context.class, new StringBuilder("No value found for type '"), '\''));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O0 */
    public static final C21444l m78923O0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21444l((C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final C14647g m78924O1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14647g((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final C21443k m78926P0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("userContext");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C27858u c27858u = (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), c35953c);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        return new C21443k(c27858u, null, AbstractC30060g.m92087G(enumC23463i, new b(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new c(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new d(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new e(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new f(factory, null, null)), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, 258, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final InterfaceC14654n m78927P1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14641a((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q0 */
    public static final InterfaceC25435a m78929Q0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return AbstractC25438d.m74669a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final C31242a m78930Q1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        InterfaceC34116n interfaceC34116nM107848a = InterfaceC34116n.INSTANCE.m107848a("AppBacklogTracker");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C31242a(interfaceC34116nM107848a, (InterfaceC21030c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (InterfaceC4368h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC4368h.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final C23543a m78932R0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C23543a((C27847j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null), (C12066b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), AbstractC30060g.m92087G(EnumC23463i.f92933w, new g(factory, null, null)), (InterfaceC25435a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC25435a.class), new C35953c("onboardingRefreshMutex")), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R1 */
    public static final C21440h m78933R1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21440h((InterfaceC34116n) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC34116n.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S0 */
    public static final C21450r m78935S0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC40205a interfaceC40205a = (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null);
        C27847j c27847j = (C27847j) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        return new C21450r(interfaceC40205a, c27847j, AbstractC30060g.m92087G(enumC23463i, new h(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new i(factory, null, null)), AbstractC30060g.m92087G(enumC23463i, new j(factory, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final C40195i m78936S1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40195i((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T0 */
    public static final C21448p m78938T0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21448p((AuthServiceApiV2) single.m122602a(null, c22673i0.getOrCreateKotlinClass(AuthServiceApiV2.class), null), (C12066b) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C12066b.class), null), (C39352a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), null, (C27858u) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (InterfaceC21030c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC21030c.class), null), (C28156e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C28156e.class), null), AbstractC25438d.m74669a(), null, 264, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final InterfaceC21751e m78939T1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C4338j(InterfaceC34116n.INSTANCE.m107848a("ManualPairingHelper"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U0 */
    public static final C20452d m78941U0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C20452d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final C18270o m78942U1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C18270o((InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (UsersPreferenceApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersPreferenceApi.class), null), new C1873h(factory, 26), (InterfaceC34116n) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public static final C21446n m78944V0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21446n((C21445m) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C21445m.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final boolean m78945V1(C38266c c38266c) {
        return DateFormat.is24HourFormat(AbstractC29125c.m88531h(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public static final C21445m m78947W0(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C21445m((PreferenceHelper) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(PreferenceHelper.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final C35834d m78948W1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C35834d(AbstractC29125c.m88532i(single));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final C34826l0 m78950X0(C38266c c38266c, C34911a c34911a) {
        C34824k0 c34824k0M109897a = ((C34826l0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C34826l0.class), AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "defaultOkHttpClient"))).m109897a();
        File cacheDir = AbstractC29125c.m88531h(c38266c).getCacheDir();
        AbstractC22676k.m65749i(cacheDir, "getCacheDir(...)");
        c34824k0M109897a.f146623l = new C34815g(cacheDir);
        return new C34826l0(c34824k0M109897a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final C35833c m78951X1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C35833c((C35834d) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C35834d.class), null), (InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC31766c) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (FeatureFlagChecker) single.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final C21436d m78953Y0(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21436d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final C35832b m78954Y1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C35832b((C35833c) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C35833c.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z0 */
    public static final ActivitiesApi m78956Z0(C38266c c38266c, C34911a c34911a) {
        return (ActivitiesApi) ((C29224y0) c38266c.m122602a(new C25371a(8), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableRetrofitWithRxJava"))).m88733b(ActivitiesApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final C0599h m78957Z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C0599h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public static final C34911a m78960a1() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_ACTIVITIES_API));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final C40206b m78961a2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C40206b((InterfaceC0596e) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0596e.class), null), (C0599h) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C0599h.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b1 */
    public static final GpsServiceApi m78964b1(C38266c c38266c, C34911a c34911a) {
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"));
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88727a(new C30354f());
        return (GpsServiceApi) c29222x0.m88730d().m88733b(GpsServiceApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final InterfaceC36471a m78965b2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C40207c((InterfaceC40205a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c1 */
    public static final HomeComponentDismissApi m78968c1(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(new C26511a(17), AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "featureFlaggableDefaultRetrofit"))).m88733b(HomeComponentDismissApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (HomeComponentDismissApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final C39352a m78969c2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C39352a((InterfaceC40208d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40208d.class), null), (InterfaceC35831a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC35831a.class), null), (FeatureFlagChecker) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagChecker.class), null), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final C34911a m78972d1() {
        return AbstractC15751g.m44431K(AbstractC12350b.m34570S(FeatureFlagRepositoryKt.KT_SERIALIZATION_HOME_COMPONENT_DISMISS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final C21434b m78973d2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        PackageInfo packageInfoM85270c = ((C28167h1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28167h1.class), null)).m85270c(AbstractC29125c.m88532i(factory));
        C18258c c18258c = (C18258c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18258c.class), null);
        String strM60327a = C21435c.f82277a.m60327a(DateFormat.is24HourFormat(AbstractC29125c.m88532i(factory)));
        C30076h c30076h = (C30076h) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30076h.class), null);
        C30073e c30073e = (C30073e) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C30073e.class), null);
        PreferenceHelper preferenceHelper = (PreferenceHelper) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(PreferenceHelper.class), null);
        C28162g c28162g = (C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null);
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        InterfaceC23462h interfaceC23462hM92087G = AbstractC30060g.m92087G(enumC23463i, new m(factory, null, null));
        String packageName = packageInfoM85270c.packageName;
        AbstractC22676k.m65749i(packageName, "packageName");
        String str = packageInfoM85270c.versionName;
        if (str == null) {
            str = "99.99.99";
        }
        return new C21434b(c30076h, c30073e, preferenceHelper, c28162g, interfaceC23462hM92087G, packageName, str, C21434b.INSTANCE.m60326a(packageInfoM85270c, ((C28162g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C28162g.class), null)).getSdkInt()), c18258c, packageInfoM85270c.firstInstallTime, strM60327a, (InterfaceC28197r1) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC28197r1.class), null), AbstractC30060g.m92087G(enumC23463i, new n(factory, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public static final C34659c m78976e1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C34659c((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final C39353b m78977e2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C39352a c39352a = (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null);
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null);
        C22365e c22365e = AbstractC3050q0.f12077a;
        return new C39353b(c39352a, interfaceC2994c0, ExecutorC22364d.f87316w, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f1 */
    public static final C29224y0 m78980f1(C38266c c38266c, C34911a c34911a) {
        C29222x0 c29222x0M73382o = AbstractC25012a.m73382o(c38266c, "$this$single", c34911a, "it");
        C35953c c35953c = new C35953c("defaultOkHttpClient");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c29222x0M73382o.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), c35953c));
        c29222x0M73382o.m88729c(((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl());
        return c29222x0M73382o.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final C28156e m78981f2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C28156e((InterfaceC14515a) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC14515a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g1 */
    public static final C29224y0 m78984g1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "baseRetrofit");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C29224y0.class), c35953cM73387t);
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C31410a.class), new C35953c("legacyGsonConverter")));
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final C32053b m78985g2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C32053b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h1 */
    public static final C29224y0 m78988h1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "baseRetrofit");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C29224y0.class), c35953cM73387t);
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88728b((AbstractC29199m) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C31410a.class), new C35953c("gsonConverter")));
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final FusedLocationProviderClient m78989h2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        Context context = (Context) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Context.class), null);
        C4975f c4975f = AbstractC34037h.f142695a;
        return new FusedLocationProviderClient(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final C29224y0 m78992i1(C38266c factory, C34911a params) {
        Object next;
        AbstractC29199m abstractC29199mM109497d;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof AbstractC0757c)) {
                next = null;
            }
        } while (next == null);
        AbstractC0757c abstractC0757c = (AbstractC0757c) next;
        if (abstractC0757c == null || (abstractC29199mM109497d = AbstractC34645f.m109482a(abstractC0757c)) == null) {
            abstractC29199mM109497d = AbstractC34650k.m109497d();
        }
        C29224y0 c29224y0 = (C29224y0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), new C35953c("baseRetrofit"));
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88728b(abstractC29199mM109497d);
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final InterfaceC14815c m78993i2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C14813a((FusedLocationProviderClient) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FusedLocationProviderClient.class), null), InterfaceC34116n.INSTANCE.m107848a("FusedLocationManager"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j1 */
    public static final C29224y0 m78996j1(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof Set)) {
                next = null;
            }
        } while (next == null);
        Set set = (Set) next;
        if (set == null) {
            set = C25235a0.f99113w;
        }
        Set set2 = set;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return C34646g.m109483b((C34646g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34646g.class), null), ((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl(), (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), C28169i0.m85274d(), AbstractC34650k.m109496c(), set2, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final AvatarApi m78997j2(C38266c c38266c, C34911a c34911a) {
        Object objM88733b = ((C29224y0) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C29224y0.class), AbstractC25012a.m73387t(c38266c, "$this$factory", c34911a, "it", "retrofitWithKtxSerialization"))).m88733b(AvatarApi.class);
        AbstractC22676k.m65749i(objM88733b, "create(...)");
        return (AvatarApi) objM88733b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final C29224y0 m79000k1(C38266c c38266c, C34911a c34911a) {
        C35953c c35953cM73387t = AbstractC25012a.m73387t(c38266c, "$this$single", c34911a, "it", "defaultRetrofit");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        C29224y0 c29224y0 = (C29224y0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C29224y0.class), c35953cM73387t);
        c29224y0.getClass();
        C29222x0 c29222x0 = new C29222x0(c29224y0);
        c29222x0.m88731e((C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("cacheEnabledOktthpClient")));
        return c29222x0.m88730d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final InterfaceC29494b m79001k2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29495c((AvatarApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AvatarApi.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), InterfaceC34116n.INSTANCE.m107848a("AvatarService"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public static final C29224y0 m79004l1(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof Set)) {
                next = null;
            }
        } while (next == null);
        Set set = (Set) next;
        if (set == null) {
            set = C25235a0.f99113w;
        }
        Set set2 = set;
        GsonBuilder gsonBuilder = new GsonBuilder();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        GsonBuilder gsonBuilderRegisterTypeAdapter = gsonBuilder.registerTypeAdapter(DateTime.class, new DateTimeSerializer((InterfaceC41070a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null))).registerTypeAdapter(DateTimeRange.class, new DateTimeRangeSerializer());
        AbstractC22676k.m65749i(gsonBuilderRegisterTypeAdapter, "registerTypeAdapter(...)");
        Gson gsonCreate = AbstractC36948a.m118635a(gsonBuilderRegisterTypeAdapter).create();
        C34646g c34646g = (C34646g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34646g.class), null);
        String apiBaseUrl = ((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl();
        C34826l0 c34826l0 = (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient"));
        AbstractC22676k.m65747g(gsonCreate);
        return C34646g.m109483b(c34646g, apiBaseUrl, c34826l0, gsonCreate, AbstractC34650k.m109496c(), set2, null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final C29493a m79005l2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29493a((InterfaceC27837a0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null), (InterfaceC29494b) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC29494b.class), null), (C27858u) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C27858u.class), new C35953c("userContext")), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("AvatarManager"), (C29104a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29104a.class), null), (InterfaceC40205a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public static final C29224y0 m79008m1(C38266c factory, C34911a params) {
        Object next;
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(params, "params");
        Iterator it = params.f147011a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(next instanceof Set)) {
                next = null;
            }
        } while (next == null);
        Set<String> set = (Set) next;
        if (set == null) {
            set = C25235a0.f99113w;
        }
        Set<String> set2 = set;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return ((C34646g) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34646g.class), null)).m109485a(((AbstractC32943y) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl(), (C34826l0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("defaultOkHttpClient")), C28169i0.m85274d(), AbstractC34650k.m109496c(), set2, new C30354f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public static final EmailDataStoreHelper m79009m2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new EmailDataStoreHelper((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final C31410a m79012n1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return C31410a.m96728a(C28169i0.m85274d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public static final C11832a m79013n2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C11832a((InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public static final C31410a m79016o1(C38266c c38266c, C34911a c34911a) {
        GsonBuilder gsonBuilderRegisterTypeAdapter = AbstractC18489d0.m53366g(c38266c, "$this$single", c34911a, "it").registerTypeAdapter(DateTime.class, new DateTimeSerializer((InterfaceC41070a) c38266c.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC41070a.class), null))).registerTypeAdapter(DateTimeRange.class, new DateTimeRangeSerializer());
        AbstractC22676k.m65749i(gsonBuilderRegisterTypeAdapter, "registerTypeAdapter(...)");
        return C31410a.m96728a(AbstractC36948a.m118635a(gsonBuilderRegisterTypeAdapter).create());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final C21439g m79017o2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        AbstractC0757c abstractC0757cM109496c = AbstractC34650k.m109496c();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C21439g(abstractC0757cM109496c, (C18259d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C18259d.class), null), (InterfaceC33949a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC33949a.class), null), null, null, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p1 */
    public static final C18258c m79020p1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C18258c(null, (InterfaceC0422g) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC0422g.class), null), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final C30073e m79021p2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C30073e((InterfaceC0422g) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC0422g.class), null), (InterfaceC2994c0) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final SharedPreferences m79024q1(C38266c c38266c, C34911a c34911a) {
        return AbstractC2875y.m8292e(c38266c, "$this$factory", c34911a, "it", c38266c).getSharedPreferences("prefs-permission-status-decider", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final C10023a m79025q2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C10023a((UsersPreferenceApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(UsersPreferenceApi.class), null), (C11832a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C11832a.class), null), (AbstractC18377p0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC18377p0.class), new C35953c("workManagerInstance")), new C1873h(factory, 25), (InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), null, 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r1 */
    public static final C14519e m79028r1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C35953c c35953c = new C35953c("shared-refs-perm-status-decider");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        SharedPreferences sharedPreferences = (SharedPreferences) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(SharedPreferences.class), c35953c);
        InterfaceC30063j interfaceC30063jMo54465b = ((InterfaceC18732d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC18732d.class), null)).mo54465b();
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(AbstractC29125c.m88532i(factory));
        AbstractC22676k.m65749i(notificationManagerCompatFrom, "from(...)");
        return new C14519e(sharedPreferences, interfaceC30063jMo54465b, notificationManagerCompatFrom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final boolean m79029r2(C38266c c38266c) {
        return DateFormat.is24HourFormat(AbstractC29125c.m88531h(c38266c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s1 */
    public static final FeatureFlagRepository m79032s1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return (FeatureFlagRepository) single.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagRepository.class), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final C27862y m79033s2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27862y((InterfaceC2994c0) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC2994c0.class), null), (C29104a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C29104a.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t1 */
    public static final C27859v m79036t1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C27859v((InterfaceC40205a) single.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40205a.class), null), (C27847j) single.m122602a(null, c22673i0.getOrCreateKotlinClass(C27847j.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final C18259d m79037t2(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18259d(AbstractC30060g.m92087G(EnumC23463i.f92933w, new o(single, null, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u1 */
    public static final ArabicLanguageEnabledChecker m79040u1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new ArabicLanguageEnabledChecker((FeatureFlagChecker) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final C21449q m79041u2(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        return new C21449q(AbstractC30060g.m92087G(EnumC23463i.f92933w, new p(factory, null, null)), (InterfaceC2994c0) factory.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC2994c0.class), null), InterfaceC34116n.INSTANCE.m107848a("ResponseMetricsLoggerInterceptor"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v1 */
    public static final C25480c m79044v1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new C18257b().m52595b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final ArabicBetaOptOutStatusStore m79047w1(C38266c single, C34911a it) {
        AbstractC22676k.m65750j(single, "$this$single");
        AbstractC22676k.m65750j(it, "it");
        return new ArabicBetaOptOutStatusStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static final AuthServiceApiV2 m79050x1(C38266c c38266c, C34911a c34911a) {
        GsonBuilder gsonBuilderM53366g = AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        GsonBuilder gsonBuilderRegisterTypeAdapter = gsonBuilderM53366g.registerTypeAdapter(DateTime.class, new DateTimeSerializer((InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null))).registerTypeAdapter(DateTimeRange.class, new DateTimeRangeSerializer());
        AbstractC22676k.m65749i(gsonBuilderRegisterTypeAdapter, "registerTypeAdapter(...)");
        Gson gsonCreate = AbstractC36948a.m118635a(gsonBuilderRegisterTypeAdapter).create();
        C34646g c34646g = (C34646g) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34646g.class), null);
        String apiBaseUrl = ((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl();
        C34826l0 c34826l0 = (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("unauthenticatedOkHttpClient"));
        AbstractC22676k.m65747g(gsonCreate);
        return (AuthServiceApiV2) C34646g.m109483b(c34646g, apiBaseUrl, c34826l0, gsonCreate, AbstractC34650k.m109496c(), AbstractC12350b.m34570S(OnboardingFeatureFlag.KT_SERIALIZATION_AUTH_SERVICE.getFlagName()), null, 32, null).m88733b(AuthServiceApiV2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final BootstrapApi m79053y1(C38266c c38266c, C34911a c34911a) {
        GsonBuilder gsonBuilderM53366g = AbstractC18489d0.m53366g(c38266c, "$this$factory", c34911a, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        GsonBuilder gsonBuilderRegisterTypeAdapter = gsonBuilderM53366g.registerTypeAdapter(DateTime.class, new DateTimeSerializer((InterfaceC41070a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC41070a.class), null))).registerTypeAdapter(DateTimeRange.class, new DateTimeRangeSerializer());
        AbstractC22676k.m65749i(gsonBuilderRegisterTypeAdapter, "registerTypeAdapter(...)");
        Gson gsonCreate = AbstractC36948a.m118635a(gsonBuilderRegisterTypeAdapter).create();
        C34646g c34646g = (C34646g) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34646g.class), null);
        String apiBaseUrl = ((AbstractC32943y) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC32943y.class), null)).getApiBaseUrl();
        C34826l0 c34826l0 = (C34826l0) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C34826l0.class), new C35953c("unauthenticatedOkHttpClient"));
        AbstractC22676k.m65747g(gsonCreate);
        return (BootstrapApi) C34646g.m109483b(c34646g, apiBaseUrl, c34826l0, gsonCreate, AbstractC34650k.m109496c(), AbstractC12350b.m34570S(OnboardingFeatureFlag.KT_SERIALIZATION_BOOTSTRAP_API.getFlagName()), null, 32, null).m88733b(BootstrapApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z1 */
    public static final C29104a m79056z1(C38266c factory, C34911a it) {
        AbstractC22676k.m65750j(factory, "$this$factory");
        AbstractC22676k.m65750j(it, "it");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C29104a((BootstrapApi) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(BootstrapApi.class), null), (InterfaceC31766c) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null), (C39352a) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null), (InterfaceC40208d) factory.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC40208d.class), null), null, 16, null);
    }

    @Override // nd1.InterfaceC26584j
    public C33768a define() {
        C33768a c33768a = new C33768a();
        m78911K0(c33768a);
        return c33768a;
    }

    @Override // nd1.InterfaceC26584j
    public List<InterfaceC26584j> getDependencies() {
        return this.dependencies;
    }

    @Override // nd1.InterfaceC26584j
    public /* bridge */ Object getKey() {
        return super.getKey();
    }
}
