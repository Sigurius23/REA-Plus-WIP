package com.whoop;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.C3029l;
import bc3.InterfaceC2994c0;
import bh.C3239b;
import bh.InterfaceC3242e;
import bh.InterfaceC3243f;
import c92.C4335g;
import c93.InterfaceC4351m;
import com.bumptech.glide.ComponentCallbacks2C4960b;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.repositories.FeatureFlagRepository;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.Logout;
import com.whoop.initializer.KoinInitializer;
import com.whoop.realtime.service.C9907b;
import dq0.C12287e;
import e50.C12723b;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import fu2.C14791f;
import hc3.AbstractC17182o;
import hc3.C17171d;
import hj0.C17343b;
import hj0.InterfaceC17346e;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.models.UploadAttachmentsNetworkType;
import iq0.AbstractC20830i;
import j92.C21440h;
import j92.C21454v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import js0.AbstractC21909c;
import kc3.C22365e;
import l52.C23359a;
import l83.C23454a0;
import my1.C26032a;
import n92.InterfaceC26483e;
import nf3.C26669a;
import od1.InterfaceC27837a0;
import of3.InterfaceC27903a;
import oh3.AbstractC27944b;
import oh3.AbstractC27946d;
import oh3.AbstractC27947e;
import oh3.C27945c;
import or2.C28147b;
import or2.C28179l1;
import p007a6.C0428i;
import p031b9.AbstractC2875y;
import p195hh.InterfaceC17278i;
import p505ts.AbstractC34132o;
import p644yb.C39376a;
import p692zt.C41113q;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rr2.C31773j;
import rr2.InterfaceC31766c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.C34107e;
import tr2.InterfaceC34116n;
import ud3.C34824k0;
import ud3.C34826l0;
import ud3.InterfaceC34816g0;
import vf3.C35953c;
import vp0.InterfaceC36263a;
import vr2.C36309b;
import x82.AbstractC38077d;
import xf3.C38266c;
import y92.C39352a;
import z82.InterfaceC40188b;
import zg3.C40634a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0019B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0013\u0010-\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/"}, m65681d2 = {"Lcom/whoop/WhoopApplication;", "Landroid/app/Application;", "Lof3/a;", "Lhj0/e;", "Lbh/f;", "<init>", "()V", "Ll83/a0;", "q", "l", "j", "k", "n", "g", "onCreate", "", "level", "onTrimMemory", "(I)V", "Landroid/app/Activity;", "activity", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Lbh/e;", "a", "()Lbh/e;", "Ltr2/e;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltr2/e;", "i", "()Ltr2/e;", "setLogDistributor", "(Ltr2/e;)V", "logDistributor", "Ljava/lang/ref/WeakReference;", "x", "Ljava/lang/ref/WeakReference;", "currentActivityReference", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "y", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Landroid/app/Activity;", "currentActivity", "z", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WhoopApplication extends Application implements InterfaceC27903a, InterfaceC17346e, InterfaceC3243f {

    /* JADX INFO: renamed from: F */
    private static final InterfaceC2994c0 f22613F;

    /* JADX INFO: renamed from: G */
    private static WhoopApplication f22614G;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private C34107e logDistributor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private WeakReference<Activity> currentActivityReference;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private FeatureFlagRepository featureFlagRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: E */
    public static final int f22612E = 8;

    /* JADX INFO: renamed from: com.whoop.WhoopApplication$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lcom/whoop/WhoopApplication$a;", "", "<init>", "()V", "Lcom/whoop/WhoopApplication;", "a", "()Lcom/whoop/WhoopApplication;", "Lbc3/c0;", "applicationScope", "Lbc3/c0;", "b", "()Lbc3/c0;", "instance", "Lcom/whoop/WhoopApplication;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final WhoopApplication m16948a() {
            WhoopApplication whoopApplication = WhoopApplication.f22614G;
            if (whoopApplication != null) {
                return whoopApplication;
            }
            AbstractC22676k.m65757q("instance");
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC2994c0 m16949b() {
            return WhoopApplication.f22613F;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.WhoopApplication$b */
    @InterfaceC32271e(m100429c = "com.whoop.WhoopApplication$initCrashReporting$1", m100430f = "WhoopApplication.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lcom/whoop/domain/model/Logout;", "it", "Ll83/a0;", "<anonymous>", "(Lcom/whoop/domain/model/Logout;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C5708b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22619w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC31766c f22620x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5708b(InterfaceC31766c interfaceC31766c, InterfaceC30057d<? super C5708b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22620x = interfaceC31766c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C5708b(this.f22620x, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Logout logout, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C5708b) create(logout, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f22619w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            this.f22620x.mo98625d("");
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.WhoopApplication$c */
    @Metadata(m65680d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"com/whoop/WhoopApplication$c", "Loh3/b;", "", "priority", "", "tag", "message", "", "t", "Ll83/a0;", "k", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C5709c extends AbstractC27944b {

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC34116n f22621e;

        public C5709c(InterfaceC34116n interfaceC34116n) {
            this.f22621e = interfaceC34116n;
        }

        @Override // oh3.AbstractC27946d
        /* JADX INFO: renamed from: k */
        public void mo16951k(int priority, String tag, String message, Throwable t14) {
            AbstractC22676k.m65750j(message, "message");
            this.f22621e.mo85217h(priority, tag, message, t14);
        }
    }

    static {
        C22365e c22365e = AbstractC3050q0.f12077a;
        f22613F = AbstractC3006f0.m8708b(AbstractC17182o.f65999a.mo8825s().plus(AbstractC3006f0.m8710d()));
    }

    /* JADX INFO: renamed from: g */
    private final void m16937g() {
        C14791f c14791f = (C14791f) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C14791f.class), null);
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C22365e c22365e = AbstractC3050q0.f12077a;
        c14791f.m42520d(new C17171d(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a)));
    }

    /* JADX INFO: renamed from: j */
    private final void m16938j() {
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC31766c interfaceC31766c = (InterfaceC31766c) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC31766c.class), null);
        interfaceC31766c.mo98622a();
        InterfaceC27837a0 interfaceC27837a0 = (InterfaceC27837a0) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null);
        int userId = interfaceC27837a0.getUserId();
        if (userId > 0) {
            interfaceC31766c.mo98625d(String.valueOf(userId));
        }
        AbstractC13091v.m36582H(new C13052j1(interfaceC27837a0.getLogoutFlow(), new C5708b(interfaceC31766c, null), 0), f22613F);
    }

    /* JADX INFO: renamed from: k */
    private final void m16939k() {
        ((InterfaceC26483e) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC26483e.class), null)).mo78528b(this, "com.whoop.android", "3ca737072def44f5b04b2799aec5db2d");
    }

    /* JADX INFO: renamed from: l */
    private final void m16940l() {
        C34107e c34107e = new C34107e();
        InterfaceC34116n.Companion companion = InterfaceC34116n.INSTANCE;
        companion.m107851d(c34107e);
        this.logDistributor = c34107e;
        InterfaceC36263a.INSTANCE.m115721c(new C3029l(companion.m107848a("android-commons"), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m16941m(InterfaceC34116n interfaceC34116n, int i13, String message, Throwable th3) {
        AbstractC22676k.m65750j(message, "message");
        interfaceC34116n.mo85217h(i13, null, message, th3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private final void m16942n() {
        ((InterfaceC27837a0) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC27837a0.class), null)).mo83920j().m122652B(C40634a.m131874a()).m122661K(new C6529c(new C0428i(this, 9), 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m16943o(WhoopApplication whoopApplication, Logout logout) {
        ((InterfaceC40188b) whoopApplication.getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40188b.class), null)).mo41419a();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m16944p(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: q */
    private final void m16945q() {
        ChatClient.Builder builder = new ChatClient.Builder("eajfquvasejv", this);
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        builder.cdn(new C12287e((C39352a) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C39352a.class), null)));
        ChatClient.Builder.notifications$default(builder, AbstractC20830i.m57454b(), null, 2, null);
        C34824k0 c34824k0 = new C34824k0();
        c34824k0.m109891a((InterfaceC34816g0) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C21454v.class), null));
        c34824k0.m109891a((InterfaceC34816g0) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C21440h.class), null));
        builder.okHttpClient(new C34826l0(c34824k0));
        builder.uploadAttachmentsNetworkType(UploadAttachmentsNetworkType.NOT_ROAMING);
        builder.build();
    }

    @Override // bh.InterfaceC3243f
    /* JADX INFO: renamed from: a */
    public InterfaceC3242e mo9383a() {
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        if (!((FeatureFlagRepository) c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null)).isFeatureEnabled(OnboardingFeatureFlag.IMAGE_LANGUAGE_SUPPORT_ANDROID)) {
            return new C41113q(this).m133463e();
        }
        C41113q c41113q = new C41113q(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        arrayList.add((InterfaceC17278i) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC17278i.class), new C35953c("coilInterceptor")));
        c41113q.f177226z = new C3239b(AbstractC30060g.m92108b0(arrayList), AbstractC30060g.m92108b0(arrayList2), AbstractC30060g.m92108b0(arrayList3), AbstractC30060g.m92108b0(arrayList4), AbstractC30060g.m92108b0(arrayList5));
        return c41113q.m133463e();
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }

    /* JADX INFO: renamed from: h */
    public final Activity m16946h() {
        WeakReference<Activity> weakReference = this.currentActivityReference;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C34107e getLogDistributor() {
        return this.logDistributor;
    }

    @Override // hj0.InterfaceC17346e
    public void onActivityPaused(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        WeakReference<Activity> weakReference = this.currentActivityReference;
        if (weakReference == null || weakReference.get() != activity) {
            return;
        }
        this.currentActivityReference = null;
    }

    @Override // hj0.InterfaceC17346e
    public void onActivityResumed(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        this.currentActivityReference = new WeakReference<>(activity);
    }

    @Override // android.app.Application
    @SuppressLint({"LogNotTimber"})
    public void onCreate() {
        m16940l();
        new C28179l1().m85296a();
        super.onCreate();
        f22614G = this;
        AbstractC38077d.m121984b();
        C39376a.m125585c(this).m125588d(KoinInitializer.class);
        C31773j.f131576w.m98652b();
        C28147b.f113814w.m85174d();
        C12723b.m35566a().m35574i(this);
        C38266c c38266c = getKoin().f106046a.f159364d;
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        c38266c.m122602a(null, c22673i0.getOrCreateKotlinClass(C4335g.class), null);
        m16939k();
        FeatureFlagRepository featureFlagRepository = (FeatureFlagRepository) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(FeatureFlagRepository.class), null);
        featureFlagRepository.subscribeToUserChangeEvents((InterfaceC27837a0) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC27837a0.class), null));
        this.featureFlagRepository = featureFlagRepository;
        InterfaceC34116n interfaceC34116n = (InterfaceC34116n) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(InterfaceC34116n.class), null);
        getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C36309b.class), null);
        C27945c c27945c = AbstractC27947e.f112718a;
        C5709c c5709c = new C5709c(interfaceC34116n);
        c27945c.getClass();
        if (c5709c == c27945c) {
            throw new IllegalArgumentException("Cannot plant Timber into itself.");
        }
        ArrayList arrayList = AbstractC27947e.f112719b;
        synchronized (arrayList) {
            arrayList.add(c5709c);
            Object[] array = arrayList.toArray(new AbstractC27946d[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            AbstractC27947e.f112720c = (AbstractC27946d[]) array;
        }
        m16938j();
        C9907b.m24263v(this);
        interfaceC34116n.mo85232x("WHOOP", AbstractC2875y.m8295h(getApplicationContext().hashCode(), "Application Started, application context hash = "), new AbstractC30556a.a[0]);
        ((C17343b) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C17343b.class), null)).m49087a();
        m16942n();
        m16945q();
        ((AbstractC21909c) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(AbstractC21909c.class), null)).fetchConfigurationValuesAsync();
        ((C23359a) getKoin().f106046a.f159364d.m122602a(null, c22673i0.getOrCreateKotlinClass(C23359a.class), null)).m67651b();
        m16937g();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        ComponentCallbacks2C4960b.m15527c(this).m15531b();
        ((C26032a) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26032a.class), null)).m77444c(level);
    }
}
