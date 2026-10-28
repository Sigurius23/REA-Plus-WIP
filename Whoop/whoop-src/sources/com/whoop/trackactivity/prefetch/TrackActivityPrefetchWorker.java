package com.whoop.trackactivity.prefetch;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.metrics.worker.BaseReportingWorker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nm0.C26830a;
import of3.InterfaceC27903a;
import om0.C28026c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;
import z92.InterfaceC40205a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0014\u001a\u0004\b$\u0010%¨\u0006)"}, m65681d2 = {"Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lnm0/a;", "z", "Ll83/h;", "k", "()Lnm0/a;", "apiClientRequester", "Lz92/a;", "E", "n", "()Lz92/a;", "userInfoAccessor", "Lom0/c;", "F", "m", "()Lom0/c;", "prefetcher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "G", "l", "()Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "H", "a", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TrackActivityPrefetchWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: H */
    private static final C10417a f31420H = new C10417a(null);

    /* JADX INFO: renamed from: I */
    public static final int f31421I = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h userInfoAccessor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h prefetcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h apiClientRequester;

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lcom/whoop/trackactivity/prefetch/TrackActivityPrefetchWorker$a;", "", "<init>", "()V", "", "PREFETCH_PATH", "Ljava/lang/String;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10417a {
        public /* synthetic */ C10417a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10417a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10418b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31427w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31428x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31429y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10418b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31427w = interfaceC27903a;
            this.f31428x = interfaceC35951a;
            this.f31429y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nm0.a] */
        @Override // c93.InterfaceC4339a
        public final C26830a invoke() {
            InterfaceC27903a interfaceC27903a = this.f31427w;
            InterfaceC35951a interfaceC35951a = this.f31428x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31429y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26830a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10419c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31430w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31431x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31432y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10419c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31430w = interfaceC27903a;
            this.f31431x = interfaceC35951a;
            this.f31432y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, z92.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC40205a invoke() {
            InterfaceC27903a interfaceC27903a = this.f31430w;
            InterfaceC35951a interfaceC35951a = this.f31431x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31432y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC40205a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10420d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31433w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31434x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31435y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10420d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31433w = interfaceC27903a;
            this.f31434x = interfaceC35951a;
            this.f31435y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, om0.c] */
        @Override // c93.InterfaceC4339a
        public final C28026c invoke() {
            InterfaceC27903a interfaceC27903a = this.f31433w;
            InterfaceC35951a interfaceC35951a = this.f31434x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31435y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C28026c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10421e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31436w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31437x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31438y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10421e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31436w = interfaceC27903a;
            this.f31437x = interfaceC35951a;
            this.f31438y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.data.repositories.FeatureFlagChecker, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final FeatureFlagChecker invoke() {
            InterfaceC27903a interfaceC27903a = this.f31436w;
            InterfaceC35951a interfaceC35951a = this.f31437x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31438y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(FeatureFlagChecker.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker$f */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker", m100430f = "TrackActivityPrefetchWorker.kt", m100431l = {44, 50}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10422f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f31439E;

        /* JADX INFO: renamed from: w */
        int f31440w;

        /* JADX INFO: renamed from: x */
        Object f31441x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f31442y;

        public C10422f(InterfaceC30057d<? super C10422f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31442y = obj;
            this.f31439E |= Integer.MIN_VALUE;
            return TrackActivityPrefetchWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackActivityPrefetchWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "TrackActivityPrefetchWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.apiClientRequester = AbstractC30060g.m92087G(enumC23463i, new C10418b(this, null, null));
        this.userInfoAccessor = AbstractC30060g.m92087G(enumC23463i, new C10419c(this, null, null));
        this.prefetcher = AbstractC30060g.m92087G(enumC23463i, new C10420d(this, null, null));
        this.featureFlagChecker = AbstractC30060g.m92087G(enumC23463i, new C10421e(this, null, null));
    }

    /* JADX INFO: renamed from: k */
    private final C26830a m26518k() {
        return (C26830a) this.apiClientRequester.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final FeatureFlagChecker m26519l() {
        return (FeatureFlagChecker) this.featureFlagChecker.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final C28026c m26520m() {
        return (C28026c) this.prefetcher.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC40205a m26521n() {
        return (InterfaceC40205a) this.userInfoAccessor.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (r12 == r1) goto L27;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r12) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.trackactivity.prefetch.TrackActivityPrefetchWorker.mo18568j(q83.d):java.lang.Object");
    }
}
