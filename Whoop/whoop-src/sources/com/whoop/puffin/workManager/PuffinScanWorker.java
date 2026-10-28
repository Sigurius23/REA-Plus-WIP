package com.whoop.puffin.workManager;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.metrics.worker.BaseReportingWorker;
import e52.C12741a;
import java.util.List;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m32.InterfaceC25005a;
import of3.InterfaceC27903a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import vf3.C35953c;
import vf3.InterfaceC35951a;
import y42.C39228j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR!\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lcom/whoop/puffin/workManager/PuffinScanWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Ly42/j;", "z", "Ll83/h;", "l", "()Ly42/j;", "puffinManager", "Le52/a;", "E", "m", "()Le52/a;", "puffinStore", "Lm32/a;", "F", "k", "()Lm32/a;", "permissionChecker", "", "G", "n", "()Ljava/util/List;", "requiredPermissions", "puffin_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class PuffinScanWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h puffinStore;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h permissionChecker;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC23462h requiredPermissions;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h puffinManager;

    /* JADX INFO: renamed from: com.whoop.puffin.workManager.PuffinScanWorker$a */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9825a extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28702w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28703x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9825a(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28702w = interfaceC27903a;
            this.f28703x = interfaceC35951a;
            this.f28704y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, y42.j] */
        @Override // c93.InterfaceC4339a
        public final C39228j invoke() {
            InterfaceC27903a interfaceC27903a = this.f28702w;
            InterfaceC35951a interfaceC35951a = this.f28703x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28704y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C39228j.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.workManager.PuffinScanWorker$b */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9826b extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28705w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28706x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28707y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9826b(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28705w = interfaceC27903a;
            this.f28706x = interfaceC35951a;
            this.f28707y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [e52.a, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final C12741a invoke() {
            InterfaceC27903a interfaceC27903a = this.f28705w;
            InterfaceC35951a interfaceC35951a = this.f28706x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28707y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C12741a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.workManager.PuffinScanWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9827c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28708w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28709x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28710y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9827c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28708w = interfaceC27903a;
            this.f28709x = interfaceC35951a;
            this.f28710y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m32.a] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC25005a invoke() {
            InterfaceC27903a interfaceC27903a = this.f28708w;
            InterfaceC35951a interfaceC35951a = this.f28709x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28710y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC25005a.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.workManager.PuffinScanWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C9828d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f28711w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f28712x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f28713y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9828d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f28711w = interfaceC27903a;
            this.f28712x = interfaceC35951a;
            this.f28713y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List<? extends java.lang.String>] */
        @Override // c93.InterfaceC4339a
        public final List<? extends String> invoke() {
            InterfaceC27903a interfaceC27903a = this.f28711w;
            InterfaceC35951a interfaceC35951a = this.f28712x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f28713y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.puffin.workManager.PuffinScanWorker$e */
    @InterfaceC32271e(m100429c = "com.whoop.puffin.workManager.PuffinScanWorker", m100430f = "PuffinScanWorker.kt", m100431l = {40, 51}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9829e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f28714E;

        /* JADX INFO: renamed from: w */
        Object f28715w;

        /* JADX INFO: renamed from: x */
        Object f28716x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f28717y;

        public C9829e(InterfaceC30057d<? super C9829e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f28717y = obj;
            this.f28714E |= Integer.MIN_VALUE;
            return PuffinScanWorker.this.mo18568j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PuffinScanWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PuffinScanWorker";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.puffinManager = AbstractC30060g.m92087G(enumC23463i, new C9825a(this, null, null));
        this.puffinStore = AbstractC30060g.m92087G(enumC23463i, new C9826b(this, null, null));
        this.permissionChecker = AbstractC30060g.m92087G(enumC23463i, new C9827c(this, null, null));
        this.requiredPermissions = AbstractC30060g.m92087G(enumC23463i, new C9828d(this, new C35953c("bluetooth-device-permissions"), null));
    }

    /* JADX INFO: renamed from: k */
    private final InterfaceC25005a m23701k() {
        return (InterfaceC25005a) this.permissionChecker.getValue();
    }

    /* JADX INFO: renamed from: l */
    private final C39228j m23702l() {
        return (C39228j) this.puffinManager.getValue();
    }

    /* JADX INFO: renamed from: m */
    private final C12741a m23703m() {
        return (C12741a) this.puffinStore.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final List<String> m23704n() {
        return (List) this.requiredPermissions.getValue();
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        if (r9 == r1) goto L40;
     */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r9) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.puffin.workManager.PuffinScanWorker.mo18568j(q83.d):java.lang.Object");
    }
}
