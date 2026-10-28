package dq1;

import androidx.health.platform.client.proto.C1533u;
import ec3.InterfaceC13058l;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: dq1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u000e\u001a\u00020\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Ldq1/b;", "", "", "Ldq1/a;", "hrZonesList", "Ll83/a0;", "b", "(Ljava/util/List;)V", "Lec3/l;", "a", "()Lec3/l;", "e", "(Lq83/d;)Ljava/lang/Object;", "hrZoneList", "d", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC12289b {

    /* JADX INFO: renamed from: dq1.b$a */
    @InterfaceC32271e(m100429c = "com.whoop.hrZones.db.HrZonesDao", m100430f = "HrZonesDao.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "updateHrZones$suspendImpl", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f41154E;

        /* JADX INFO: renamed from: w */
        Object f41155w;

        /* JADX INFO: renamed from: x */
        Object f41156x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f41157y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f41157y = obj;
            this.f41154E |= Integer.MIN_VALUE;
            return InterfaceC12289b.m34205c(InterfaceC12289b.this, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    static Object m34205c(InterfaceC12289b interfaceC12289b, List<C12288a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f41154E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f41154E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = interfaceC12289b.new a(interfaceC30057d);
            }
        } else {
            aVar = interfaceC12289b.new a(interfaceC30057d);
        }
        Object obj = aVar.f41157y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f41154E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            aVar.f41155w = interfaceC12289b;
            aVar.f41156x = list;
            aVar.f41154E = 1;
            if (interfaceC12289b.mo34209e(aVar) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) aVar.f41156x;
            interfaceC12289b = (InterfaceC12289b) aVar.f41155w;
            AbstractC34132o.m107864I(obj);
        }
        interfaceC12289b.mo34207b(list);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: a */
    InterfaceC13058l mo34206a();

    /* JADX INFO: renamed from: b */
    void mo34207b(List<C12288a> hrZonesList);

    /* JADX INFO: renamed from: d */
    default Object mo34208d(List<C12288a> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return m34205c(this, list, interfaceC30057d);
    }

    /* JADX INFO: renamed from: e */
    Object mo34209e(InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
