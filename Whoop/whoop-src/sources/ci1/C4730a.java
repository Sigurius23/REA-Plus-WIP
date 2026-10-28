package ci1;

import ai1.InterfaceC0909a;
import bi1.C3284a;
import ei1.InterfaceC13220a;
import fv1.C14814b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: ci1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lci1/a;", "Lei1/a;", "Lai1/a;", "foregroundGpsRoutePointDao", "<init>", "(Lai1/a;)V", "", "sessionStartTimeMs", "Lfv1/b;", "location", "Ll83/a0;", "b", "(JLfv1/b;Lq83/d;)Ljava/lang/Object;", "", "a", "(JLq83/d;)Ljava/lang/Object;", "c", "minTimestamp", "maxTimestamp", "d", "(JJJLq83/d;)Ljava/lang/Object;", "Lai1/a;", "gps-tracking_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4730a implements InterfaceC13220a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0909a foregroundGpsRoutePointDao;

    /* JADX INFO: renamed from: ci1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.gps.foreground.data.repository.RoomForegroundGpsRouteStorage", m100430f = "RoomForegroundGpsRouteStorage.kt", m100431l = {26}, m100432m = "getRoute", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        long f19334w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f19335x;

        /* JADX INFO: renamed from: z */
        int f19337z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f19335x = obj;
            this.f19337z |= Integer.MIN_VALUE;
            return C4730a.this.mo14809a(0L, this);
        }
    }

    public C4730a(InterfaceC0909a foregroundGpsRoutePointDao) {
        AbstractC22676k.m65750j(foregroundGpsRoutePointDao, "foregroundGpsRoutePointDao");
        this.foregroundGpsRoutePointDao = foregroundGpsRoutePointDao;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ei1.InterfaceC13220a
    /* JADX INFO: renamed from: a */
    public Object mo14809a(long j7, InterfaceC30057d<? super List<C14814b>> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f19337z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f19337z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo2241a = aVar.f19335x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f19337z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo2241a);
            InterfaceC0909a interfaceC0909a = this.foregroundGpsRoutePointDao;
            aVar.f19334w = j7;
            aVar.f19337z = 1;
            objMo2241a = interfaceC0909a.mo2241a(j7, aVar);
            if (objMo2241a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo2241a);
        }
        Iterable iterable = (Iterable) objMo2241a;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC4731b.m14814b((C3284a) it.next()));
        }
        return arrayList;
    }

    @Override // ei1.InterfaceC13220a
    /* JADX INFO: renamed from: b */
    public Object mo14810b(long j7, C14814b c14814b, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo2244d = this.foregroundGpsRoutePointDao.mo2244d(new C3284a(j7, c14814b.getTimestamp(), c14814b.getLatitude(), c14814b.getLongitude(), c14814b.getAltitude(), c14814b.getHorizontalAccuracy(), c14814b.getCom.google.android.gms.location.FusedLocationProviderClient.KEY_VERTICAL_ACCURACY java.lang.String()), interfaceC30057d);
        return objMo2244d == EnumC31071a.f128113w ? objMo2244d : C23454a0.f92919a;
    }

    @Override // ei1.InterfaceC13220a
    /* JADX INFO: renamed from: c */
    public Object mo14811c(long j7, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo2242b = this.foregroundGpsRoutePointDao.mo2242b(j7, interfaceC30057d);
        return objMo2242b == EnumC31071a.f128113w ? objMo2242b : C23454a0.f92919a;
    }

    @Override // ei1.InterfaceC13220a
    /* JADX INFO: renamed from: d */
    public Object mo14812d(long j7, long j13, long j14, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo2243c = this.foregroundGpsRoutePointDao.mo2243c(j7, j13, j14, interfaceC30057d);
        return objMo2243c == EnumC31071a.f128113w ? objMo2243c : C23454a0.f92919a;
    }
}
