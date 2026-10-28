package a03;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.whoopstatus.domain.WhoopStatusService;
import com.whoop.whoopstatus.domain.model.WhoopStatusResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: a03.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"La03/c;", "Lod1/g;", "La03/a;", "La03/d;", "Lcom/whoop/whoopstatus/domain/WhoopStatusService;", "statusService", "Ltr2/n;", "logger", "La03/b;", "analyticHelper", "<init>", "(Lcom/whoop/whoopstatus/domain/WhoopStatusService;Ltr2/n;La03/b;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/whoopstatus/domain/WhoopStatusService;", "b", "Ltr2/n;", "c", "La03/b;", "whoop-status_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0100c implements InterfaceC27844g<InterfaceC0098a, InterfaceC0101d> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WhoopStatusService statusService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C0099b analyticHelper;

    /* JADX INFO: renamed from: a03.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.domain.WhoopStatusInteractor$interact$1", m100430f = "WhoopStatusInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"La03/d;", "previousResult", "La03/a;", "action", "<anonymous>", "(La03/d;La03/a;)La03/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f318w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f319x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f320y;

        /* JADX INFO: renamed from: a03.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.whoopstatus.domain.WhoopStatusInteractor$interact$1$response$1", m100430f = "WhoopStatusInteractor.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C41259a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f322w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0100c f323x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41259a(C0100c c0100c, InterfaceC30057d<? super C41259a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f323x = c0100c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C41259a(this.f323x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f322w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                WhoopStatusService whoopStatusService = this.f323x.statusService;
                this.f322w = 1;
                Object whoopStatus = whoopStatusService.getWhoopStatus(this);
                return whoopStatus == enumC31071a ? enumC31071a : whoopStatus;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super WhoopStatusResponse> interfaceC30057d) {
                return ((C41259a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC0101d interfaceC0101d, InterfaceC0098a interfaceC0098a, InterfaceC30057d<? super InterfaceC0101d> interfaceC30057d) {
            a aVar = C0100c.this.new a(interfaceC30057d);
            aVar.f319x = interfaceC0101d;
            aVar.f320y = interfaceC0098a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            InterfaceC0101d interfaceC0101d = (InterfaceC0101d) this.f319x;
            InterfaceC0098a interfaceC0098a = (InterfaceC0098a) this.f320y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f318w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (!(interfaceC0098a instanceof InterfaceC0098a.b)) {
                    if (!(interfaceC0098a instanceof InterfaceC0098a.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C0100c.this.analyticHelper.m270c(((InterfaceC0098a.a) interfaceC0098a).getSource(), "Alert Tapped");
                    return interfaceC0101d;
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C0100c.this.logger;
                C41259a c41259a = new C41259a(C0100c.this, null);
                this.f319x = null;
                this.f320y = interfaceC0098a;
                this.f318w = 1;
                aVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, c41259a, aVar, 6, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                aVar = this;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if ((interfaceC34385a instanceof InterfaceC34385a.b.a) || (interfaceC34385a instanceof InterfaceC34385a.b.C42432b)) {
                return InterfaceC0101d.a.f324a;
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
            boolean activeMaintenance = ((WhoopStatusResponse) cVar.m108735a()).getActiveMaintenance();
            C0100c c0100c = C0100c.this;
            if (activeMaintenance) {
                c0100c.analyticHelper.m270c(((InterfaceC0098a.b) interfaceC0098a).getSource(), "Alert Viewable");
            }
            return new InterfaceC0101d.c((WhoopStatusResponse) cVar.m108735a());
        }
    }

    public C0100c(WhoopStatusService statusService, InterfaceC34116n logger, C0099b analyticHelper) {
        AbstractC22676k.m65750j(statusService, "statusService");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticHelper, "analyticHelper");
        this.statusService = statusService;
        this.logger = logger;
        this.analyticHelper = analyticHelper;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(InterfaceC0101d.b.f325a, upstream, new a(null));
    }
}
