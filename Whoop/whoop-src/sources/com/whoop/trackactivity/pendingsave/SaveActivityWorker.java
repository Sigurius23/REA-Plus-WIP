package com.whoop.trackactivity.pendingsave;

import android.content.Context;
import androidx.work.WorkerParameters;
import c93.InterfaceC4339a;
import com.whoop.addactivity.network.CoreDetailsActivityResponse;
import com.whoop.addactivity.network.CreateActivityRequestV1;
import com.whoop.metrics.worker.BaseReportingWorker;
import com.whoop.service.network.ActivitiesApi;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import l83.C23468n;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import of3.InterfaceC27903a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import rk2.InterfaceC31502f;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vf3.InterfaceC35951a;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006+"}, m65681d2 = {"Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker;", "Lcom/whoop/metrics/worker/BaseReportingWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "id", "Ll83/a0;", "p", "(JLq83/d;)Ljava/lang/Object;", "", "metricName", "o", "(Ljava/lang/String;)V", "Lic/u;", "j", "(Lq83/d;)Ljava/lang/Object;", "y", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "uniqueWorkName", "Lrk2/f;", "z", "Ll83/h;", "n", "()Lrk2/f;", "pendingActivitySaveStore", "Lcom/whoop/service/network/ActivitiesApi;", "E", "m", "()Lcom/whoop/service/network/ActivitiesApi;", "activitiesApi", "Liy1/c;", "F", "d", "()Liy1/c;", "metricWriter", "G", "a", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SaveActivityWorker extends BaseReportingWorker {

    /* JADX INFO: renamed from: G */
    private static final C10410a f31389G = new C10410a(null);

    /* JADX INFO: renamed from: H */
    public static final int f31390H = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC23462h activitiesApi;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String uniqueWorkName;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h pendingActivitySaveStore;

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$a */
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/trackactivity/pendingsave/SaveActivityWorker$a;", "", "<init>", "()V", "", "HTTP_CONFLICT", "I", "", "METRIC_PENDING_SAVE_REMOVE_FAILURE", "Ljava/lang/String;", "METRIC_PENDING_SAVE_CREATE_CONFLICT", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10410a {
        public /* synthetic */ C10410a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C10410a() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.SaveActivityWorker", m100430f = "SaveActivityWorker.kt", m100431l = {63}, m100432m = "removePendingSave", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10411b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f31395w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f31396x;

        /* JADX INFO: renamed from: z */
        int f31398z;

        public C10411b(InterfaceC30057d<? super C10411b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31396x = obj;
            this.f31398z |= Integer.MIN_VALUE;
            return SaveActivityWorker.this.m26517p(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$c */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10412c extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31399w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31400x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31401y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10412c(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31399w = interfaceC27903a;
            this.f31400x = interfaceC35951a;
            this.f31401y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, rk2.f] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC31502f invoke() {
            InterfaceC27903a interfaceC27903a = this.f31399w;
            InterfaceC35951a interfaceC35951a = this.f31400x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31401y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC31502f.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$d */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10413d extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31402w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31403x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31404y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10413d(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31402w = interfaceC27903a;
            this.f31403x = interfaceC35951a;
            this.f31404y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [com.whoop.service.network.ActivitiesApi, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final ActivitiesApi invoke() {
            InterfaceC27903a interfaceC27903a = this.f31402w;
            InterfaceC35951a interfaceC35951a = this.f31403x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31404y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(ActivitiesApi.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$e */
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"}, m65681d2 = {"", "T", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10414e extends AbstractC22680m implements InterfaceC4339a {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC27903a f31405w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ InterfaceC35951a f31406x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC4339a f31407y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10414e(InterfaceC27903a interfaceC27903a, InterfaceC35951a interfaceC35951a, InterfaceC4339a interfaceC4339a) {
            super(0);
            this.f31405w = interfaceC27903a;
            this.f31406x = interfaceC35951a;
            this.f31407y = interfaceC4339a;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [iy1.c, java.lang.Object] */
        @Override // c93.InterfaceC4339a
        public final InterfaceC21030c invoke() {
            InterfaceC27903a interfaceC27903a = this.f31405w;
            InterfaceC35951a interfaceC35951a = this.f31406x;
            return interfaceC27903a.getKoin().f106046a.f159364d.m122602a(this.f31407y, AbstractC22671h0.f89337a.getOrCreateKotlinClass(InterfaceC21030c.class), interfaceC35951a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$f */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.SaveActivityWorker", m100430f = "SaveActivityWorker.kt", m100431l = {25, 38, 41}, m100432m = "work", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10415f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f31408E;

        /* JADX INFO: renamed from: F */
        int f31409F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f31410G;

        /* JADX INFO: renamed from: I */
        int f31412I;

        /* JADX INFO: renamed from: w */
        Object f31413w;

        /* JADX INFO: renamed from: x */
        Object f31414x;

        /* JADX INFO: renamed from: y */
        Object f31415y;

        /* JADX INFO: renamed from: z */
        Object f31416z;

        public C10415f(InterfaceC30057d<? super C10415f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f31410G = obj;
            this.f31412I |= Integer.MIN_VALUE;
            return SaveActivityWorker.this.mo18568j(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.trackactivity.pendingsave.SaveActivityWorker$g */
    @InterfaceC32271e(m100429c = "com.whoop.trackactivity.pendingsave.SaveActivityWorker$work$result$1", m100430f = "SaveActivityWorker.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/addactivity/network/CoreDetailsActivityResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10416g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f31417w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ CreateActivityRequestV1 f31419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10416g(CreateActivityRequestV1 createActivityRequestV1, InterfaceC30057d<? super C10416g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f31419y = createActivityRequestV1;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return SaveActivityWorker.this.new C10416g(this.f31419y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f31417w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivitiesApi activitiesApiM26514m = SaveActivityWorker.this.m26514m();
            CreateActivityRequestV1 createActivityRequestV1 = this.f31419y;
            this.f31417w = 1;
            Object objCreateActivity = activitiesApiM26514m.createActivity(createActivityRequestV1, this);
            return objCreateActivity == enumC31071a ? enumC31071a : objCreateActivity;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<CoreDetailsActivityResponse>> interfaceC30057d) {
            return ((C10416g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveActivityWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.uniqueWorkName = "PERIODIC_SAVE_ACTIVITY_WORK";
        EnumC23463i enumC23463i = EnumC23463i.f92933w;
        this.pendingActivitySaveStore = AbstractC30060g.m92087G(enumC23463i, new C10412c(this, null, null));
        this.activitiesApi = AbstractC30060g.m92087G(enumC23463i, new C10413d(this, null, null));
        this.metricWriter = AbstractC30060g.m92087G(enumC23463i, new C10414e(this, null, null));
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC21030c m26511d() {
        return (InterfaceC21030c) this.metricWriter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final ActivitiesApi m26514m() {
        return (ActivitiesApi) this.activitiesApi.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC31502f m26515n() {
        return (InterfaceC31502f) this.pendingActivitySaveStore.getValue();
    }

    /* JADX INFO: renamed from: o */
    private final void m26516o(String metricName) {
        m26511d().mo58701b(new C22047a(0, metricName, null, C25271y.f99162w, null, 21, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m26517p(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C10411b c10411b;
        Object objMo97069b;
        if (interfaceC30057d instanceof C10411b) {
            c10411b = (C10411b) interfaceC30057d;
            int i13 = c10411b.f31398z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10411b.f31398z = i13 - Integer.MIN_VALUE;
            } else {
                c10411b = new C10411b(interfaceC30057d);
            }
        } else {
            c10411b = new C10411b(interfaceC30057d);
        }
        Object obj = c10411b.f31396x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10411b.f31398z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC31502f interfaceC31502fM26515n = m26515n();
            c10411b.f31395w = j7;
            c10411b.f31398z = 1;
            objMo97069b = interfaceC31502fM26515n.mo97069b(j7, c10411b);
            if (objMo97069b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objMo97069b = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objMo97069b);
        if (thM68037a != null) {
            m22895c().mo85230v("Failed to remove pending activity save after success", thM68037a, new AbstractC30556a.a[0]);
            m26516o("track_activity.pending_save.remove_failure");
        }
        return C23454a0.f92919a;
    }

    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUniqueWorkName() {
        return this.uniqueWorkName;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x010a -> B:14:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x012b -> B:27:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.whoop.metrics.worker.BaseReportingWorker
    /* JADX INFO: renamed from: j */
    public java.lang.Object mo18568j(q83.InterfaceC30057d<? super p218ic.AbstractC18386u> r24) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.trackactivity.pendingsave.SaveActivityWorker.mo18568j(q83.d):java.lang.Object");
    }
}
