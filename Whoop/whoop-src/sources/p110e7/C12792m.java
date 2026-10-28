package p110e7;

import android.health.connect.HealthConnectManager;
import android.health.connect.ReadRecordsRequestUsingFilters;
import android.health.connect.TimeInstantRangeFilter;
import android.health.connect.changelog.ChangeLogTokenRequest;
import bc3.C3033m;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.time.Instant;
import java.util.Iterator;
import l83.C23454a0;
import p027b3.AbstractC2378g1;
import p029b5.C2726e;
import p336n7.C26411a;
import p359o7.C27625a;
import p359o7.C27626b;
import p416q7.C30008a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e7.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C12792m extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f43778w;

    /* JADX INFO: renamed from: x */
    public int f43779x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C12797r f43780y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f43781z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12792m(C12797r c12797r, Object obj, InterfaceC30057d interfaceC30057d, int i13) {
        super(1, interfaceC30057d);
        this.f43778w = i13;
        this.f43780y = c12797r;
        this.f43781z = obj;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        switch (this.f43778w) {
            case 0:
                return new C12792m(this.f43780y, (C27625a) this.f43781z, interfaceC30057d, 0);
            default:
                return new C12792m(this.f43780y, (C27626b) this.f43781z, interfaceC30057d, 1);
        }
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj;
        switch (this.f43778w) {
            case 0:
                break;
        }
        return ((C12792m) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        TimeInstantRangeFilter timeInstantRangeFilterBuild;
        int i13 = this.f43778w;
        Object obj2 = this.f43781z;
        C12797r c12797r = this.f43780y;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f43779x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C27625a c27625a = (C27625a) obj2;
                this.f43779x = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
                c3033m.m8774s();
                HealthConnectManager healthConnectManager = c12797r.f43797d;
                AbstractC22676k.m65750j(c27625a, "<this>");
                ChangeLogTokenRequest.Builder builder = new ChangeLogTokenRequest.Builder();
                Iterator it = c27625a.f111162b.iterator();
                while (it.hasNext()) {
                    builder.addDataOriginFilter(AbstractC2378g1.m7350y((C26411a) it.next()));
                }
                Iterator it3 = c27625a.f111161a.iterator();
                while (it3.hasNext()) {
                    builder.addRecordType(AbstractC2378g1.m7317E((InterfaceC21461d) it3.next()));
                }
                ChangeLogTokenRequest changeLogTokenRequestBuild = builder.build();
                AbstractC22676k.m65749i(changeLogTokenRequestBuild, "Builder()\n        .apply…       }\n        .build()");
                healthConnectManager.getChangeLogToken(changeLogTokenRequestBuild, c12797r.f43795b, new C2726e(c3033m));
                Object objM8773r = c3033m.m8773r();
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                return objM8773r == enumC31071a ? enumC31071a : objM8773r;
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f43779x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C27626b c27626b = (C27626b) obj2;
                this.f43779x = 1;
                C3033m c3033m2 = new C3033m(1, AbstractC15751g.m44424D(this));
                c3033m2.m8774s();
                HealthConnectManager healthConnectManager2 = c12797r.f43797d;
                AbstractC22676k.m65750j(c27626b, "<this>");
                ReadRecordsRequestUsingFilters.Builder builder2 = new ReadRecordsRequestUsingFilters.Builder(AbstractC2378g1.m7317E(c27626b.f111163a));
                C30008a c30008a = c27626b.f111164b;
                Instant instant = c30008a.f122517b;
                Instant instant2 = c30008a.f122516a;
                if (instant2 == null && instant == null) {
                    timeInstantRangeFilterBuild = new TimeInstantRangeFilter.Builder().setStartTime(Instant.EPOCH).build();
                    AbstractC22676k.m65749i(timeInstantRangeFilterBuild, "{\n        // Platform do…tant.EPOCH).build()\n    }");
                } else {
                    timeInstantRangeFilterBuild = new TimeInstantRangeFilter.Builder().setStartTime(instant2).setEndTime(instant).build();
                    AbstractC22676k.m65749i(timeInstantRangeFilterBuild, "{\n        TimeInstantRan…me(endTime).build()\n    }");
                }
                ReadRecordsRequestUsingFilters.Builder pageSize = builder2.setTimeRangeFilter(timeInstantRangeFilterBuild).setPageSize(1000);
                Iterator it4 = c27626b.f111165c.iterator();
                while (it4.hasNext()) {
                    pageSize.addDataOrigins(AbstractC2378g1.m7350y((C26411a) it4.next()));
                }
                pageSize.setAscending(true);
                ReadRecordsRequestUsingFilters readRecordsRequestUsingFiltersBuild = pageSize.build();
                AbstractC22676k.m65749i(readRecordsRequestUsingFiltersBuild, "Builder(recordType.toPla…       }\n        .build()");
                healthConnectManager2.readRecords(readRecordsRequestUsingFiltersBuild, c12797r.f43795b, new C2726e(c3033m2));
                Object objM8773r2 = c3033m2.m8773r();
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                return objM8773r2 == enumC31071a3 ? enumC31071a3 : objM8773r2;
        }
    }
}
