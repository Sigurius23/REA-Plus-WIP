package rk2;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.trackactivity.pendingsave.SaveActivityWorker;
import io.getstream.chat.android.client.ChatClient;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25265s;
import p080d4.C11653l;
import p218ic.AbstractC18377p0;
import p218ic.C18354e;
import p218ic.C18365j0;
import p218ic.C18367k0;
import p218ic.EnumC18346a;
import p218ic.EnumC18366k;
import p218ic.EnumC18390x;
import p457rc.C31222e;
import p505ts.AbstractC34132o;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: rk2.h */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lrk2/h;", "", "Lic/p0;", "workManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lic/p0;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Lic/k0;", "b", "()Lic/k0;", "Ll83/a0;", "c", "()V", "Ll83/n;", "a", "(Lq83/d;)Ljava/lang/Object;", "Lic/p0;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31504h {

    /* JADX INFO: renamed from: d */
    public static final int f129969d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: rk2.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.SaveActivityScheduler", m100430f = "SaveActivityScheduler.kt", m100431l = {42}, m100432m = "cancelPeriodicRetry-IoAF18A", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f129972E;

        /* JADX INFO: renamed from: w */
        Object f129973w;

        /* JADX INFO: renamed from: x */
        int f129974x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f129975y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f129975y = obj;
            this.f129972E |= Integer.MIN_VALUE;
            Object objM97073a = C31504h.this.m97073a(this);
            return objM97073a == EnumC31071a.f128113w ? objM97073a : new C23468n(objM97073a);
        }
    }

    public C31504h(AbstractC18377p0 workManager, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.workManager = workManager;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: b */
    private final C18367k0 m97072b() {
        C18365j0 c18365j0 = new C18365j0(SaveActivityWorker.class, 20L, TimeUnit.MINUTES);
        EnumC18390x enumC18390x = EnumC18390x.f71560w;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return (C18367k0) ((C18365j0) ((C18365j0) c18365j0.m52880f(new C18354e(new C31222e(null), EnumC18390x.f71561x, false, false, false, false, -1L, -1L, AbstractC25265s.m74103I1(linkedHashSet)))).m52879e(EnumC18346a.f71444x, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, TimeUnit.MILLISECONDS)).m52878b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m97073a(InterfaceC30057d<? super C23468n> interfaceC30057d) throws Throwable {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f129972E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f129972E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM108238x = bVar.f129975y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f129972E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM108238x);
                C11653l c11653l = this.workManager.mo52873b("PERIODIC_SAVE_ACTIVITY_WORK").f71478c;
                bVar.f129973w = null;
                bVar.f129974x = 0;
                bVar.f129972E = 1;
                objM108238x = AbstractC34235f.m108238x(c11653l, bVar);
                if (objM108238x == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108238x);
            }
            AbstractC22676k.m65749i(objM108238x, "await(...)");
            return C23454a0.f92919a;
        } catch (Exception e5) {
            return AbstractC34132o.m107888l(e5);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m97074c() {
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.START_ACTIVITY_REVAMP)) {
            this.workManager.mo52875d("PERIODIC_SAVE_ACTIVITY_WORK", EnumC18366k.f71499w, m97072b());
        }
    }
}
