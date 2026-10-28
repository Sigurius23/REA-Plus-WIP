package com.whoop.user.journey.workmanager;

import android.content.Context;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23454a0;
import nf3.C26669a;
import of3.InterfaceC27903a;
import p218ic.AbstractC18386u;
import p218ic.C18382s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import zp2.C40944b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m65681d2 = {"Lcom/whoop/user/journey/workmanager/TimeCapsuleSyncWorker;", "Landroidx/work/CoroutineWorker;", "Lof3/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lic/u;", "doWork", "(Lq83/d;)Ljava/lang/Object;", "Lzp2/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lzp2/b;", "timeCapsuleRepository", "Ltr2/n;", "x", "Ltr2/n;", "logger", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class TimeCapsuleSyncWorker extends CoroutineWorker implements InterfaceC27903a {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C40944b timeCapsuleRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.user.journey.workmanager.TimeCapsuleSyncWorker$a */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.workmanager.TimeCapsuleSyncWorker", m100430f = "TimeCapsuleSyncWorker.kt", m100431l = {21}, m100432m = "doWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C10691a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f32614w;

        /* JADX INFO: renamed from: y */
        int f32616y;

        public C10691a(InterfaceC30057d<? super C10691a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f32614w = obj;
            this.f32616y |= Integer.MIN_VALUE;
            return TimeCapsuleSyncWorker.this.doWork(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.user.journey.workmanager.TimeCapsuleSyncWorker$b */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.workmanager.TimeCapsuleSyncWorker$doWork$2", m100430f = "TimeCapsuleSyncWorker.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Lic/u;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lbc3/c0;)Lic/u;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C10692b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f32617w;

        public C10692b(InterfaceC30057d<? super C10692b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return TimeCapsuleSyncWorker.this.new C10692b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
            return ((C10692b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f32617w;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C40944b c40944b = TimeCapsuleSyncWorker.this.timeCapsuleRepository;
                    this.f32617w = 1;
                    obj = c40944b.m132862c(this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    TimeCapsuleSyncWorker.this.logger.mo85228t("Time capsule synced successfully", new AbstractC30556a.a[0]);
                    return AbstractC18386u.m52885b();
                }
                TimeCapsuleSyncWorker.this.logger.mo85228t("Time capsule sync failed, will retry", new AbstractC30556a.a[0]);
                return new C18382s();
            } catch (Exception e5) {
                TimeCapsuleSyncWorker.this.logger.mo85230v("Exception in TimeCapsuleSyncWorker", e5, new AbstractC30556a.a[0]);
                return new C18382s();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeCapsuleSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(params, "params");
        this.timeCapsuleRepository = (C40944b) getKoin().f106046a.f159364d.m122602a(null, AbstractC22671h0.f89337a.getOrCreateKotlinClass(C40944b.class), null);
        this.logger = InterfaceC34116n.INSTANCE.m107848a("TimeCapsuleSyncWorker");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public Object doWork(InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) throws Throwable {
        C10691a c10691a;
        if (interfaceC30057d instanceof C10691a) {
            c10691a = (C10691a) interfaceC30057d;
            int i13 = c10691a.f32616y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c10691a.f32616y = i13 - Integer.MIN_VALUE;
            } else {
                c10691a = new C10691a(interfaceC30057d);
            }
        } else {
            c10691a = new C10691a(interfaceC30057d);
        }
        Object objM8705K = c10691a.f32614w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c10691a.f32616y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C22365e c22365e = AbstractC3050q0.f12077a;
            ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
            C10692b c10692b = new C10692b(null);
            c10691a.f32616y = 1;
            objM8705K = AbstractC3006f0.m8705K(executorC22364d, c10692b, c10691a);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        AbstractC22676k.m65749i(objM8705K, "withContext(...)");
        return objM8705K;
    }

    @Override // of3.InterfaceC27903a
    public /* bridge */ C26669a getKoin() {
        return AbstractC34132o.m107856A(this);
    }
}
