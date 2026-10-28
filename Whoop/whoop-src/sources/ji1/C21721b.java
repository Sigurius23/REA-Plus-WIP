package ji1;

import com.whoop.gps.network.GpsTrackingApi;
import com.whoop.gps.upload.dto.GpsUploadModel;
import com.whoop.gps.upload.dto.SpeedDataModel;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yh1.C39540a;
import yh1.C39541b;

/* JADX INFO: renamed from: ji1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lji1/b;", "Lji1/a;", "Lcom/whoop/gps/network/GpsTrackingApi;", "gpsTrackingApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/gps/network/GpsTrackingApi;Ltr2/n;)V", "", "Lyh1/a;", "locations", "", "a", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/gps/network/GpsTrackingApi;", "b", "Ltr2/n;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21721b implements InterfaceC21720a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final GpsTrackingApi gpsTrackingApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ji1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.gps.upload.BackendUploaderImpl", m100430f = "BackendUploaderImpl.kt", m100431l = {36}, m100432m = "upload", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83427E;

        /* JADX INFO: renamed from: w */
        Object f83428w;

        /* JADX INFO: renamed from: x */
        Object f83429x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83430y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83430y = obj;
            this.f83427E |= Integer.MIN_VALUE;
            return C21721b.this.mo61195a(null, this);
        }
    }

    /* JADX INFO: renamed from: ji1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.gps.upload.BackendUploaderImpl$upload$response$1", m100430f = "BackendUploaderImpl.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f83432w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<GpsUploadModel> f83434y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<GpsUploadModel> list, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f83434y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21721b.this.new b(this.f83434y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83432w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            GpsTrackingApi gpsTrackingApi = C21721b.this.gpsTrackingApi;
            List<GpsUploadModel> list = this.f83434y;
            this.f83432w = 1;
            Object objUploadGpsLocations = gpsTrackingApi.uploadGpsLocations(list, this);
            return objUploadGpsLocations == enumC31071a ? enumC31071a : objUploadGpsLocations;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C21721b(GpsTrackingApi gpsTrackingApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(gpsTrackingApi, "gpsTrackingApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.gpsTrackingApi = gpsTrackingApi;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // ji1.InterfaceC21720a
    /* JADX INFO: renamed from: a */
    public Object mo61195a(List<C39540a> list, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        a aVar;
        List<C39540a> list2 = list;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f83427E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f83427E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f83430y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f83427E;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            List<C39540a> list3 = list2;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            for (C39540a c39540a : list3) {
                C39541b speed = c39540a.getSpeed();
                arrayList.add(new GpsUploadModel(c39540a.getTimestamp(), c39540a.getLatitude(), c39540a.getLongitude(), c39540a.getAltitude(), c39540a.getHorizontalAccuracyMeters(), c39540a.getVerticalAccuracyMeters(), speed != null ? new SpeedDataModel(speed.getValue(), speed.getUnit(), speed.getAccuracy()) : null, c39540a.getTrigger()));
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(arrayList, null);
            aVar2.f83428w = list2;
            aVar2.f83429x = null;
            aVar2.f83427E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upload GPS locations", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) aVar2.f83428w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            this.logger.mo85216g(AbstractC2875y.m8296i(list2.size(), "Successfully uploaded ", " GPS locations"), new AbstractC30556a.a[0]);
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to upload GPS locations: ", ((InterfaceC34385a.b) interfaceC34385a).getErrorMessage()), new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
