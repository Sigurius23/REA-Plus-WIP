package com.whoop.service.timezone;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.service.network.UsersPreferenceApi;
import da2.C11832a;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18377p0;
import p218ic.EnumC18368l;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.service.timezone.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001fR\u001e\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\bj\u0002`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lcom/whoop/service/timezone/a;", "", "Lcom/whoop/service/network/UsersPreferenceApi;", "usersPreferenceApi", "Lda2/a;", "dataStoreHelper", "Lic/p0;", "workManager", "Lkotlin/Function0;", "", "Lcom/whoop/service/timezone/ClockFormatProvider;", "clockFormatProvider", "Lbc3/c0;", "scope", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;)V", "", "timestamp", "Ll83/a0;", "e", "(J)V", "d", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/service/network/UsersPreferenceApi;", "b", "Lda2/a;", "c", "()Lda2/a;", "Lic/p0;", "Lc93/a;", "Lbc3/c0;", "f", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10023a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UsersPreferenceApi usersPreferenceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C11832a dataStoreHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC4339a clockFormatProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.service.timezone.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateUploader", m100430f = "TimezoneUpdateUploader.kt", m100431l = {38, 47, 57, 68}, m100432m = "retryTimezoneUpdate", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f30059E;

        /* JADX INFO: renamed from: w */
        Object f30060w;

        /* JADX INFO: renamed from: x */
        Object f30061x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f30062y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f30062y = obj;
            this.f30059E |= Integer.MIN_VALUE;
            return C10023a.this.m24801d(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.service.timezone.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.timezone.TimezoneUpdateUploader$scheduleRetry$1", m100430f = "TimezoneUpdateUploader.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f30064w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ long f30066y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j7, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f30066y = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C10023a.this.new b(this.f30066y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f30064w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C11832a dataStoreHelper = C10023a.this.getDataStoreHelper();
                long j7 = this.f30066y;
                this.f30064w = 1;
                if (dataStoreHelper.m31779c(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C10023a.this.workManager.m52876e("timezone_update_retry", EnumC18368l.f71503w, TimezoneUpdateRetryWorker.INSTANCE.m24797a());
            C10023a.this.logger.mo85216g(AbstractC11895b.m31994m(this.f30066y, "Scheduled timezone update retry for timestamp: "), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    public C10023a(UsersPreferenceApi usersPreferenceApi, C11832a dataStoreHelper, AbstractC18377p0 workManager, InterfaceC4339a clockFormatProvider, InterfaceC2994c0 scope, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(usersPreferenceApi, "usersPreferenceApi");
        AbstractC22676k.m65750j(dataStoreHelper, "dataStoreHelper");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(clockFormatProvider, "clockFormatProvider");
        AbstractC22676k.m65750j(scope, "scope");
        AbstractC22676k.m65750j(logger, "logger");
        this.usersPreferenceApi = usersPreferenceApi;
        this.dataStoreHelper = dataStoreHelper;
        this.workManager = workManager;
        this.clockFormatProvider = clockFormatProvider;
        this.scope = scope;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final C11832a getDataStoreHelper() {
        return this.dataStoreHelper;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0116  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r15.m31777a(r7) == r0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (r15.m31777a(r7) == r0) goto L45;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m24801d(q83.InterfaceC30057d<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.service.timezone.C10023a.m24801d(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: e */
    public final void m24802e(long timestamp) {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(timestamp, null), 3);
    }

    public /* synthetic */ C10023a(UsersPreferenceApi usersPreferenceApi, C11832a c11832a, AbstractC18377p0 abstractC18377p0, InterfaceC4339a interfaceC4339a, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(usersPreferenceApi, c11832a, abstractC18377p0, interfaceC4339a, interfaceC2994c0, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TimezoneUpdateUploader") : interfaceC34116n);
    }
}
