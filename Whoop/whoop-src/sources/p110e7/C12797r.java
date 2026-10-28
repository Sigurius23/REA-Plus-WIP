package p110e7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import android.health.connect.ReadRecordsResponse;
import android.health.connect.changelog.ChangeLogTokenResponse;
import android.health.connect.changelog.ChangeLogsResponse;
import android.health.connect.datatypes.Record;
import bc3.AbstractC3050q0;
import bc3.C3033m;
import bc3.ExecutorC3046p0;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kc3.C22365e;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import n83.C26460c;
import n83.C26466i;
import p027b3.AbstractC2378g1;
import p030b7.InterfaceC2773b;
import p030b7.InterfaceC2774c;
import p083d7.C11745a;
import p083d7.C11746b;
import p098dt.AbstractC12350b;
import p359o7.C27625a;
import p359o7.C27626b;
import p396p7.C28950a;
import p396p7.C28952c;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: e7.r */
/* JADX INFO: loaded from: classes.dex */
public final class C12797r implements InterfaceC2773b, InterfaceC2774c {

    /* JADX INFO: renamed from: b */
    public final Executor f43795b;

    /* JADX INFO: renamed from: c */
    public final Context f43796c;

    /* JADX INFO: renamed from: d */
    public final HealthConnectManager f43797d;

    public C12797r(Context context) {
        Executor executor;
        AbstractC22676k.m65750j(context, "context");
        C22365e c22365e = AbstractC3050q0.f12077a;
        C22365e c22365e2 = c22365e != null ? c22365e : null;
        this.f43795b = (c22365e2 == null || (executor = c22365e2.getExecutor()) == null) ? new ExecutorC3046p0(c22365e) : executor;
        this.f43796c = context;
        Object systemService = context.getSystemService("healthconnect");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.health.connect.HealthConnectManager");
        this.f43797d = (HealthConnectManager) systemService;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: a */
    public final Object mo7837a(C27626b c27626b, AbstractC32269c abstractC32269c) throws Exception {
        C12795p c12795p;
        if (abstractC32269c instanceof C12795p) {
            c12795p = (C12795p) abstractC32269c;
            int i13 = c12795p.f43791y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12795p.f43791y = i13 - Integer.MIN_VALUE;
            } else {
                c12795p = new C12795p(this, abstractC32269c);
            }
        } else {
            c12795p = new C12795p(this, abstractC32269c);
        }
        Object objM35834h = c12795p.f43789w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c12795p.f43791y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35834h);
            Function1 c12792m = new C12792m(this, c27626b, null, 1);
            c12795p.f43791y = 1;
            objM35834h = m35834h(c12792m, c12795p);
            if (objM35834h == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM35834h);
        }
        ReadRecordsResponse readRecordsResponse = (ReadRecordsResponse) objM35834h;
        List records = readRecordsResponse.getRecords();
        AbstractC22676k.m65749i(records, "response.records");
        List<Record> list = records;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Record it : list) {
            AbstractC22676k.m65749i(it, "it");
            arrayList.add(AbstractC2378g1.m7323K(it));
        }
        new Long(readRecordsResponse.getNextPageToken());
        return new C28952c(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: b */
    public final Object mo7838b(String str, AbstractC32269c abstractC32269c) throws Exception {
        C12790k c12790k;
        if (abstractC32269c instanceof C12790k) {
            c12790k = (C12790k) abstractC32269c;
            int i13 = c12790k.f43774y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12790k.f43774y = i13 - Integer.MIN_VALUE;
            } else {
                c12790k = new C12790k(this, abstractC32269c);
            }
        } else {
            c12790k = new C12790k(this, abstractC32269c);
        }
        Object objM8773r = c12790k.f43772w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c12790k.f43774y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM8773r);
                c12790k.f43774y = 1;
                C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c12790k));
                c3033m.m8774s();
                HealthConnectManager healthConnectManager = this.f43797d;
                AbstractC12787h.m35824q();
                healthConnectManager.getChangeLogs(AbstractC12787h.m35808a(str).build(), this.f43795b, AbstractC35903f.m114015j(c3033m));
                objM8773r = c3033m.m8773r();
                if (objM8773r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM8773r);
            }
            ChangeLogsResponse changeLogsResponse = (ChangeLogsResponse) objM8773r;
            C26460c c26460cM119000x = AbstractC37056f.m119000x();
            List<Record> upsertedRecords = changeLogsResponse.getUpsertedRecords();
            AbstractC22676k.m65749i(upsertedRecords, "response.upsertedRecords");
            for (Record it : upsertedRecords) {
                AbstractC22676k.m65749i(it, "it");
                c26460cM119000x.add(new C11746b(AbstractC2378g1.m7323K(it)));
            }
            List<ChangeLogsResponse.DeletedLog> deletedLogs = changeLogsResponse.getDeletedLogs();
            AbstractC22676k.m65749i(deletedLogs, "response.deletedLogs");
            Iterator<T> it3 = deletedLogs.iterator();
            while (it3.hasNext()) {
                String deletedRecordId = ((ChangeLogsResponse.DeletedLog) it3.next()).getDeletedRecordId();
                AbstractC22676k.m65749i(deletedRecordId, "it.deletedRecordId");
                c26460cM119000x.add(new C11745a(deletedRecordId));
            }
            C26460c c26460cM118988k = AbstractC37056f.m118988k(c26460cM119000x);
            String nextChangesToken = changeLogsResponse.getNextChangesToken();
            AbstractC22676k.m65749i(nextChangesToken, "response.nextChangesToken");
            return new C28950a(c26460cM118988k, nextChangesToken, changeLogsResponse.hasMorePages(), false);
        } catch (HealthConnectException e5) {
            if (e5.getErrorCode() == 3) {
                return new C28950a(C25271y.f99162w, "", false, true);
            }
            throw AbstractC2378g1.m7348w(e5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: c */
    public final Object mo7839c(List list, AbstractC32269c abstractC32269c) throws Exception {
        C12793n c12793n;
        if (abstractC32269c instanceof C12793n) {
            c12793n = (C12793n) abstractC32269c;
            int i13 = c12793n.f43784y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12793n.f43784y = i13 - Integer.MIN_VALUE;
            } else {
                c12793n = new C12793n(this, abstractC32269c);
            }
        } else {
            c12793n = new C12793n(this, abstractC32269c);
        }
        Object objM35834h = c12793n.f43782w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c12793n.f43784y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35834h);
            Function1 c12794o = new C12794o(this, list, null);
            c12793n.f43784y = 1;
            objM35834h = m35834h(c12794o, c12793n);
            if (objM35834h == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM35834h);
        }
        InsertRecordsResponse response = (InsertRecordsResponse) objM35834h;
        AbstractC22676k.m65749i(response, "response");
        return AbstractC2378g1.m7349x(response);
    }

    @Override // p030b7.InterfaceC2774c
    /* JADX INFO: renamed from: d */
    public final Object mo7843d(AbstractC32269c abstractC32269c) throws PackageManager.NameNotFoundException {
        Context context = this.f43796c;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        C26466i c26466i = new C26466i();
        int length = packageInfo.requestedPermissions.length;
        for (int i13 = 0; i13 < length; i13++) {
            String str = packageInfo.requestedPermissions[i13];
            AbstractC22676k.m65749i(str, "it.requestedPermissions[i]");
            if (AbstractC39421y.m125930O(str, "android.permission.health.", false) && (packageInfo.requestedPermissionsFlags[i13] & 2) > 0) {
                String str2 = packageInfo.requestedPermissions[i13];
                AbstractC22676k.m65749i(str2, "it.requestedPermissions[i]");
                c26466i.add(str2);
            }
        }
        return AbstractC12350b.m34586g(c26466i);
    }

    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: e */
    public final InterfaceC2774c mo7840e() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: f */
    public final Object mo7841f(C27625a c27625a, AbstractC32269c abstractC32269c) throws Exception {
        C12791l c12791l;
        if (abstractC32269c instanceof C12791l) {
            c12791l = (C12791l) abstractC32269c;
            int i13 = c12791l.f43777y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12791l.f43777y = i13 - Integer.MIN_VALUE;
            } else {
                c12791l = new C12791l(this, abstractC32269c);
            }
        } else {
            c12791l = new C12791l(this, abstractC32269c);
        }
        Object objM35834h = c12791l.f43775w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c12791l.f43777y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM35834h);
            Function1 c12792m = new C12792m(this, c27625a, null, 0);
            c12791l.f43777y = 1;
            objM35834h = m35834h(c12792m, c12791l);
            if (objM35834h == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM35834h);
        }
        String token = ((ChangeLogTokenResponse) objM35834h).getToken();
        AbstractC22676k.m65749i(token, "override suspend fun get…\n            .token\n    }");
        return token;
    }

    @Override // p030b7.InterfaceC2773b
    /* JADX INFO: renamed from: g */
    public final Object mo7842g(InterfaceC21461d interfaceC21461d, C25271y c25271y, List list, InterfaceC30057d interfaceC30057d) throws Exception {
        Object objM35834h = m35834h(new C12789j(this, list, interfaceC21461d, null), (AbstractC32269c) interfaceC30057d);
        return objM35834h == EnumC31071a.f128113w ? objM35834h : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m35834h(Function1 function1, AbstractC32269c abstractC32269c) throws Exception {
        C12796q c12796q;
        if (abstractC32269c instanceof C12796q) {
            c12796q = (C12796q) abstractC32269c;
            int i13 = c12796q.f43794y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c12796q.f43794y = i13 - Integer.MIN_VALUE;
            } else {
                c12796q = new C12796q(this, abstractC32269c);
            }
        } else {
            c12796q = new C12796q(this, abstractC32269c);
        }
        Object obj = c12796q.f43792w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c12796q.f43794y;
        try {
            if (i14 != 0) {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            c12796q.f43794y = 1;
            Object objInvoke = function1.invoke(c12796q);
            return objInvoke == obj2 ? obj2 : objInvoke;
        } catch (HealthConnectException e5) {
            throw AbstractC2378g1.m7348w(e5);
        }
    }
}
