package fi1;

import com.whoop.gps.foreground.network.ForegroundGpsApi;
import com.whoop.gps.foreground.network.dto.ForegroundGpsRoutePointDto;
import com.whoop.gps.foreground.network.dto.ForegroundGpsRouteSummaryDto;
import fv1.C14814b;
import java.util.LinkedHashMap;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: fi1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfi1/c;", "Lfi1/b;", "Lcom/whoop/gps/foreground/network/ForegroundGpsApi;", "foregroundGpsApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/gps/foreground/network/ForegroundGpsApi;Ltr2/n;)V", "", "startTimeMs", "endTimeMs", "", "Lfv1/b;", "route", "", "a", "(JJLjava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/gps/foreground/network/ForegroundGpsApi;", "b", "Ltr2/n;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14522c implements InterfaceC14521b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ForegroundGpsApi foregroundGpsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: fi1.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.upload.ForegroundGpsUploaderImpl", m100430f = "ForegroundGpsUploaderImpl.kt", m100431l = {35}, m100432m = "upload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f53059E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f53060F;

        /* JADX INFO: renamed from: H */
        int f53062H;

        /* JADX INFO: renamed from: w */
        long f53063w;

        /* JADX INFO: renamed from: x */
        long f53064x;

        /* JADX INFO: renamed from: y */
        Object f53065y;

        /* JADX INFO: renamed from: z */
        Object f53066z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53060F = obj;
            this.f53062H |= Integer.MIN_VALUE;
            return C14522c.this.mo41438a(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: fi1.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.upload.ForegroundGpsUploaderImpl$upload$response$1", m100430f = "ForegroundGpsUploaderImpl.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f53067w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ ForegroundGpsRouteSummaryDto f53069y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f53069y = foregroundGpsRouteSummaryDto;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14522c.this.new b(this.f53069y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f53067w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ForegroundGpsApi foregroundGpsApi = C14522c.this.foregroundGpsApi;
            ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto = this.f53069y;
            this.f53067w = 1;
            Object objPostRouteSummary = foregroundGpsApi.postRouteSummary(foregroundGpsRouteSummaryDto, this);
            return objPostRouteSummary == enumC31071a ? enumC31071a : objPostRouteSummary;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<Boolean>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14522c(ForegroundGpsApi foregroundGpsApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(foregroundGpsApi, "foregroundGpsApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.foregroundGpsApi = foregroundGpsApi;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // fi1.InterfaceC14521b
    /* JADX INFO: renamed from: a */
    public Object mo41438a(long j7, long j13, List<C14814b> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        List<C14814b> list2 = list;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f53062H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f53062H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f53060F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f53062H;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (list2.isEmpty()) {
                return Boolean.TRUE;
            }
            List<C14814b> list3 = list2;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list3, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (C14814b c14814b : list3) {
                linkedHashMap.put(new Long(c14814b.getTimestamp()), new ForegroundGpsRoutePointDto(c14814b.getLatitude(), c14814b.getLongitude(), c14814b.getAltitude(), c14814b.getHorizontalAccuracy(), c14814b.getCom.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY java.lang.String()));
            }
            ForegroundGpsRouteSummaryDto foregroundGpsRouteSummaryDto = new ForegroundGpsRouteSummaryDto((String) null, linkedHashMap, AbstractC2875y.m8300m("(", AbstractC14523d.m41441b(j7), ",", AbstractC14523d.m41441b(j13), ")"), 1, (DefaultConstructorMarker) null);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(foregroundGpsRouteSummaryDto, null);
            aVar2.f53065y = list2;
            aVar2.f53066z = null;
            aVar2.f53059E = null;
            aVar2.f53063w = j7;
            aVar2.f53064x = j13;
            aVar2.f53062H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload foreground GPS route", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) aVar2.f53065y;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.logger.mo85216g(AbstractC2875y.m8296i(list2.size(), "Successfully uploaded ", " foreground GPS route points"), new AbstractC30556a.a[0]);
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to upload foreground GPS route: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
