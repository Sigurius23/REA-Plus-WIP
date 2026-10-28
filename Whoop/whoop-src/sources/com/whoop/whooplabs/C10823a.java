package com.whoop.whooplabs;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import bc3.AbstractC3006f0;
import bc3.AbstractC3028k2;
import bc3.C3033m;
import bc3.C3058t;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3025k;
import bc3.InterfaceC3055s;
import c93.InterfaceC4351m;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import com.whoop.whooplabs.data.domain.LabsCampaignKt;
import ge3.AbstractC15751g;
import l83.C23454a0;
import nz2.AbstractC27308b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: com.whoop.whooplabs.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lcom/whoop/whooplabs/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "campaign", "Lcom/whoop/whooplabs/WhoopLabsService;", "c", "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;", "a", "Landroid/content/Context;", "Ltr2/n;", "b", "Ltr2/n;", "logger", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C10823a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: com.whoop.whooplabs.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceConnector$connectService$3", m100430f = "WhoopLabsServiceConnector.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/whooplabs/WhoopLabsService;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/whooplabs/WhoopLabsService;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f33190w;

        /* JADX INFO: renamed from: x */
        int f33191x;

        /* JADX INFO: renamed from: y */
        int f33192y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f33193z;

        /* JADX INFO: renamed from: com.whoop.whooplabs.a$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41437a implements Function1 {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C10823a f33194w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ b f33195x;

            public C41437a(C10823a c10823a, b bVar) {
                this.f33194w = c10823a;
                this.f33195x = bVar;
            }

            /* JADX INFO: renamed from: a */
            public final void m28486a(Throwable th3) {
                try {
                    this.f33194w.context.unbindService(this.f33195x);
                } catch (Exception e5) {
                    this.f33194w.logger.mo85230v("Failed to unbind from WhoopLabsService", e5, new AbstractC30556a.a[0]);
                }
            }

            @Override // p715kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m28486a((Throwable) obj);
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: com.whoop.whooplabs.a$a$b */
        @Metadata(m65680d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"com/whoop/whooplabs/a$a$b", "Landroid/content/ServiceConnection;", "Landroid/content/ComponentName;", "name", "Landroid/os/IBinder;", "iBinder", "Ll83/a0;", "onServiceConnected", "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class b implements ServiceConnection {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C10823a f33196w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ InterfaceC2994c0 f33197x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC3025k f33198y;

            /* JADX INFO: renamed from: com.whoop.whooplabs.a$a$b$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.WhoopLabsServiceConnector$connectService$3$1$serviceConnection$1$onServiceConnected$1", m100430f = "WhoopLabsServiceConnector.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41438a extends AbstractC32275i implements InterfaceC4351m {

                /* JADX INFO: renamed from: w */
                int f33199w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ WhoopLabsService f33200x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ InterfaceC3025k f33201y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41438a(WhoopLabsService whoopLabsService, InterfaceC3025k interfaceC3025k, InterfaceC30057d<? super C41438a> interfaceC30057d) {
                    super(2, interfaceC30057d);
                    this.f33200x = whoopLabsService;
                    this.f33201y = interfaceC3025k;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                    return new C41438a(this.f33200x, this.f33201y, interfaceC30057d);
                }

                @Override // c93.InterfaceC4351m
                public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                    return ((C41438a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f33199w;
                    if (i13 == 0) {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC3055s startupCompleted = this.f33200x.getStartupCompleted();
                        this.f33199w = 1;
                        if (((C3058t) startupCompleted).m8817m(this) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    this.f33201y.resumeWith(this.f33200x);
                    return C23454a0.f92919a;
                }
            }

            public b(C10823a c10823a, InterfaceC2994c0 interfaceC2994c0, InterfaceC3025k interfaceC3025k) {
                this.f33196w = c10823a;
                this.f33197x = interfaceC2994c0;
                this.f33198y = interfaceC3025k;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder iBinder) {
                WhoopLabsService.BinderC10813a binderC10813a = iBinder instanceof WhoopLabsService.BinderC10813a ? (WhoopLabsService.BinderC10813a) iBinder : null;
                if (binderC10813a == null) {
                    this.f33198y.cancel(new IllegalStateException("WhoopLabsService binder type mismatch"));
                    return;
                }
                try {
                    this.f33196w.context.unbindService(this);
                } catch (IllegalArgumentException e5) {
                    this.f33196w.logger.mo85211a("Already unbound", e5, new AbstractC30556a.a[0]);
                }
                AbstractC3006f0.m8732z(this.f33197x, null, null, new C41438a(binderC10813a.getF33159f(), this.f33198y, null), 3);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C10823a.this.new a(interfaceC30057d);
            aVar.f33193z = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super WhoopLabsService> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f33193z;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f33192y;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C10823a c10823a = C10823a.this;
            this.f33193z = interfaceC2994c0;
            this.f33190w = c10823a;
            this.f33191x = 0;
            this.f33192y = 1;
            C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
            c3033m.m8774s();
            b bVar = new b(c10823a, interfaceC2994c0, c3033m);
            c3033m.m8776u(new C41437a(c10823a, bVar));
            c10823a.context.bindService(new Intent(c10823a.context, (Class<?>) WhoopLabsService.class), bVar, 1);
            Object objM8773r = c3033m.m8773r();
            return objM8773r == enumC31071a ? enumC31071a : objM8773r;
        }
    }

    public C10823a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        this.context = context;
        this.logger = AbstractC27308b.m82458a("WhoopLabsServiceConnector");
    }

    /* JADX INFO: renamed from: c */
    public final Object m28485c(LabsCampaign labsCampaign, InterfaceC30057d<? super WhoopLabsService> interfaceC30057d) {
        this.logger.mo85216g("Starting BleDeviceScannerService service", new AbstractC30556a.a[0]);
        Intent intent = new Intent(this.context, (Class<?>) WhoopLabsService.class);
        this.logger.mo85228t("Calling startService", new AbstractC30556a.a[0]);
        intent.putExtra(LabsCampaignKt.LABS_CAMPAIGN_TABLE, labsCampaign);
        this.context.startService(intent);
        return AbstractC3028k2.m8748b(1000L, new a(null), interfaceC30057d);
    }
}
