package p032bc;

import a00.C0072g;
import a30.C0332w0;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import ax.InterfaceC2117b;
import c93.InterfaceC4339a;
import cd3.C4455g;
import com.amplitude.android.engagement.C4861a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.internal.C5101l0;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mapbox.bindgen.Expected;
import com.mapbox.common.HttpHeaders;
import com.mapbox.maps.SnapshotCompleteCallback;
import com.mapbox.maps.SnapshotOverlayCallback;
import com.mapbox.maps.SnapshotResultCallback;
import com.mapbox.maps.Snapshotter;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import cx.C11168d;
import dm.C12173c;
import dm.EnumC12174d;
import gm.C15980h;
import gm.C15981i;
import gm.C15985m;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.feature.messages.list.MessageListController;
import io.getstream.chat.android.p226ui.utils.PermissionChecker;
import io.sentry.C20265b7;
import io.sentry.C20321e5;
import io.sentry.C20337g0;
import io.sentry.C20513q6;
import io.sentry.EnumC20048a7;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20045a4;
import io.sentry.InterfaceC20259b1;
import io.sentry.InterfaceC20262b4;
import io.sentry.InterfaceC20432n1;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC20091g;
import io.sentry.hints.InterfaceC20354a;
import io.sentry.protocol.C20496q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import jm.C21779a;
import jm.C21780b;
import jm.C21782d;
import jm.C21783e;
import jm.C21784f;
import jm.C21785g;
import jm.EnumC21781c;
import l83.C23454a0;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.C27485o;
import o23.InterfaceC27471a;
import om.InterfaceC28022a;
import p073cq.C11052u;
import p073cq.InterfaceC11035d;
import p073cq.InterfaceC11039h;
import p080d4.C11650i;
import p080d4.C11655n;
import p080d4.InterfaceC11651j;
import p095dp.AbstractC12240d;
import p098dt.C12355g;
import p171g9.C15587d;
import p218ic.EnumC18364j;
import p218ic.RunnableC18376p;
import p218ic.RunnableC18378q;
import p249jc.AbstractC21598x;
import p299l9.C23488c0;
import p299l9.C23537y;
import p299l9.InterfaceC23506i0;
import p307lm.C24504a;
import p344nm.C26819a;
import p344nm.C26820b;
import p344nm.C26827i;
import p344nm.InterfaceC26825g;
import p361o9.C27670j;
import p361o9.C27673m;
import p361o9.InterfaceC27674n;
import p423qf.C30318b;
import p430qm.AbstractC30477a;
import p459rf.C31330a;
import p459rf.C31335f;
import p459rf.C31347r;
import p479s4.AbstractC32120a;
import p516u8.C34611p0;
import p532ur.AbstractC35172a;
import p532ur.C35175d;
import p607x8.InterfaceC38049d;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p692zt.C41106j;
import p692zt.C41114r;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qm2.C30486c;
import u93.C34671d0;
import ud3.AbstractC34798a0;
import ud3.C34826l0;
import ud3.InterfaceC34853z;
import wb3.AbstractC37056f;
import zd3.C40571o;

/* JADX INFO: renamed from: bc.i */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C2953i implements SnapshotCompleteCallback, InterfaceC11651j, InterfaceC27471a, InterfaceC2117b, InterfaceC20045a4, InterfaceC20262b4, InterfaceC38049d, InterfaceC28022a, InterfaceC26825g, InterfaceC27674n, InterfaceC34853z, InterfaceC11035d, InterfaceC11039h {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11858w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f11859x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f11860y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f11861z;

    public /* synthetic */ C2953i(Object obj, Object obj2, Object obj3, int i13) {
        this.f11858w = i13;
        this.f11859x = obj;
        this.f11860y = obj2;
        this.f11861z = obj3;
    }

    @Override // io.sentry.InterfaceC20045a4
    /* JADX INFO: renamed from: a */
    public void mo8618a(C20265b7 c20265b7) {
        ConcurrentHashMap concurrentHashMap;
        C4455g c4455g = (C4455g) this.f11859x;
        C20321e5 c20321e5 = (C20321e5) this.f11860y;
        C20337g0 c20337g0 = (C20337g0) this.f11861z;
        if (c20265b7 == null) {
            ((C20513q6) c4455g.f17962x).getLogger().mo16066m(EnumC20436n5.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strMo56083d = null;
        EnumC20048a7 enumC20048a7 = c20321e5.m56482f() != null ? EnumC20048a7.Crashed : null;
        boolean z4 = EnumC20048a7.Crashed == enumC20048a7 || c20321e5.m56483g();
        C20496q c20496q = c20321e5.f76886z;
        String str = (c20496q == null || (concurrentHashMap = c20496q.f76768F) == null || !concurrentHashMap.containsKey(HttpHeaders.USER_AGENT)) ? null : (String) c20321e5.f76886z.f76768F.get(HttpHeaders.USER_AGENT);
        Object objM56491b = c20337g0.m56491b("sentry:typeCheckHint");
        if (objM56491b instanceof InterfaceC20354a) {
            strMo56083d = ((InterfaceC20354a) objM56491b).mo56083d();
            enumC20048a7 = EnumC20048a7.Abnormal;
        }
        if (!c20265b7.m56222d(enumC20048a7, str, z4, strMo56083d) || c20265b7.f76092G == EnumC20048a7.Ok) {
            return;
        }
        c20265b7.m56220b(AbstractC21598x.m60659O());
    }

    @Override // p607x8.InterfaceC38049d
    public void accept(Object obj) {
        C15587d c15587d = (C15587d) this.f11859x;
        ((InterfaceC23506i0) obj).mo8318e(c15587d.f58537a, (C23488c0) this.f11860y, (C23537y) this.f11861z);
    }

    @Override // p344nm.InterfaceC26825g
    public Object apply(Object obj) {
        String str;
        long jInsert;
        EnumC21781c enumC21781c;
        int i13 = this.f11858w;
        String str2 = "bytes";
        int i14 = 5;
        int i15 = 3;
        EnumC21781c enumC21781c2 = EnumC21781c.CACHE_FULL;
        int i16 = 2;
        int i17 = 4;
        Object obj2 = this.f11861z;
        Object obj3 = this.f11860y;
        int i18 = 0;
        C26827i c26827i = (C26827i) this.f11859x;
        switch (i13) {
            case 10:
                ArrayList arrayList = (ArrayList) obj3;
                C15981i c15981i = (C15981i) obj2;
                Cursor cursor = (Cursor) obj;
                while (cursor.moveToNext()) {
                    long j7 = cursor.getLong(0);
                    boolean z4 = cursor.getInt(7) != 0;
                    C0332w0 c0332w0 = new C0332w0(i17);
                    c0332w0.f1166G = new HashMap();
                    String string = cursor.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c0332w0.f1170z = string;
                    c0332w0.f1164E = Long.valueOf(cursor.getLong(2));
                    c0332w0.f1165F = Long.valueOf(cursor.getLong(3));
                    if (z4) {
                        String string2 = cursor.getString(i17);
                        c0332w0.f1169y = new C15985m(string2 == null ? C26827i.f106987F : new C12173c(string2), cursor.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor.getString(i17);
                        C12173c c12173c = string3 == null ? C26827i.f106987F : new C12173c(string3);
                        Cursor cursorQuery = c26827i.m80058b().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j7)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int length = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList2.add(blob);
                                length += blob.length;
                            }
                            byte[] bArr = new byte[length];
                            int i19 = 0;
                            int length2 = 0;
                            while (i19 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i19);
                                String str3 = str2;
                                ArrayList arrayList3 = arrayList2;
                                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                                length2 += bArr2.length;
                                i19++;
                                arrayList2 = arrayList3;
                                str2 = str3;
                            }
                            str = str2;
                            cursorQuery.close();
                            c0332w0.f1169y = new C15985m(c12173c, bArr);
                        } catch (Throwable th3) {
                            cursorQuery.close();
                            throw th3;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c0332w0.f1168x = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new C26820b(j7, c15981i, c0332w0.m860m()));
                    str2 = str;
                    i17 = 4;
                }
                return null;
            case 11:
                C15980h c15980h = (C15980h) obj3;
                C15985m c15985m = c15980h.f60484c;
                String str4 = c15980h.f60482a;
                C15981i c15981i2 = (C15981i) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long jSimpleQueryForLong = c26827i.m80058b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c26827i.m80058b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C26819a c26819a = c26827i.f106992z;
                if (jSimpleQueryForLong >= c26819a.f106973a) {
                    c26827i.m80061m(1L, enumC21781c2, str4);
                    return -1L;
                }
                Long lM80056h = C26827i.m80056h(sQLiteDatabase, c15981i2);
                if (lM80056h != null) {
                    jInsert = lM80056h.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c15981i2.f60488a);
                    contentValues.put("priority", Integer.valueOf(AbstractC30477a.m93285a(c15981i2.f60490c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = c15981i2.f60489b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i24 = c26819a.f106977e;
                byte[] bArr4 = c15985m.f60499b;
                boolean z13 = bArr4.length <= i24;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(c15980h.f60485d));
                contentValues2.put("uptime_ms", Long.valueOf(c15980h.f60486e));
                contentValues2.put("payload_encoding", c15985m.f60498a.f40478a);
                contentValues2.put("code", c15980h.f60483b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z13));
                contentValues2.put("payload", z13 ? bArr4 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z13) {
                    int iCeil = (int) Math.ceil(((double) bArr4.length) / ((double) i24));
                    for (int i25 = 1; i25 <= iCeil; i25++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr4, (i25 - 1) * i24, Math.min(i25 * i24, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(AnalyticsRequestV2.PARAM_EVENT_ID, Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i25));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c15980h.f60487f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put(AnalyticsRequestV2.PARAM_EVENT_ID, Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            default:
                HashMap map = (HashMap) obj3;
                C0072g c0072g = (C0072g) obj2;
                ArrayList arrayList4 = (ArrayList) c0072g.f224y;
                Cursor cursor2 = (Cursor) obj;
                c26827i.getClass();
                while (cursor2.moveToNext()) {
                    String string4 = cursor2.getString(i18);
                    int i26 = cursor2.getInt(1);
                    EnumC21781c enumC21781c3 = EnumC21781c.REASON_UNKNOWN;
                    if (i26 != 0) {
                        if (i26 == 1) {
                            enumC21781c3 = EnumC21781c.MESSAGE_TOO_OLD;
                        } else if (i26 == i16) {
                            enumC21781c = enumC21781c2;
                        } else if (i26 == i15) {
                            enumC21781c3 = EnumC21781c.PAYLOAD_TOO_BIG;
                        } else if (i26 == 4) {
                            enumC21781c3 = EnumC21781c.MAX_RETRIES_REACHED;
                        } else if (i26 == i14) {
                            enumC21781c3 = EnumC21781c.INVALID_PAYLOD;
                        } else if (i26 == 6) {
                            enumC21781c3 = EnumC21781c.SERVER_ERROR;
                        } else {
                            AbstractC12240d.m34088y(Integer.valueOf(i26), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                        }
                        enumC21781c = enumC21781c3;
                    } else {
                        enumC21781c = enumC21781c3;
                    }
                    long j13 = cursor2.getLong(i16);
                    if (!map.containsKey(string4)) {
                        map.put(string4, new ArrayList());
                    }
                    ((List) map.get(string4)).add(new C21782d(j13, enumC21781c));
                    i18 = 0;
                    i14 = 5;
                    i15 = 3;
                    i16 = 2;
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    int i27 = C21783e.f83918c;
                    new ArrayList();
                    arrayList4.add(new C21783e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long time = c26827i.f106990x.getTime();
                SQLiteDatabase sQLiteDatabaseM80058b = c26827i.m80058b();
                sQLiteDatabaseM80058b.beginTransaction();
                try {
                    Cursor cursorRawQuery = sQLiteDatabaseM80058b.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        cursorRawQuery.moveToNext();
                        C21785g c21785g = new C21785g(cursorRawQuery.getLong(0), time);
                        cursorRawQuery.close();
                        sQLiteDatabaseM80058b.setTransactionSuccessful();
                        sQLiteDatabaseM80058b.endTransaction();
                        c0072g.f223x = c21785g;
                        c0072g.f225z = new C21780b(new C21784f(c26827i.m80058b().compileStatement("PRAGMA page_size").simpleQueryForLong() * c26827i.m80058b().compileStatement("PRAGMA page_count").simpleQueryForLong(), C26819a.f106972f.f106973a));
                        c0072g.f221E = (String) c26827i.f106988E.get();
                        return new C21779a((C21785g) c0072g.f223x, Collections.unmodifiableList(arrayList4), (C21780b) c0072g.f225z, (String) c0072g.f221E);
                    } catch (Throwable th4) {
                        cursorRawQuery.close();
                        throw th4;
                    }
                } catch (Throwable th5) {
                    sQLiteDatabaseM80058b.endTransaction();
                    throw th5;
                }
        }
    }

    @Override // ud3.InterfaceC34853z
    /* JADX INFO: renamed from: b */
    public AbstractC34798a0 mo8619b(C40571o c40571o) {
        C34826l0 c34826l0 = (C34826l0) this.f11859x;
        C31347r c31347r = (C31347r) this.f11860y;
        return new C31330a(AbstractC37056f.m118958J(new C31335f(c34826l0.f146648F, c31347r.f117917h, c34826l0.f146649a, (C30318b) this.f11861z, c40571o)));
    }

    @Override // p361o9.InterfaceC27674n
    /* JADX INFO: renamed from: c */
    public C41060w0 mo8620c(int i13, C34611p0 c34611p0, int[] iArr) {
        C27670j c27670j = (C27670j) this.f11859x;
        String str = (String) this.f11860y;
        String str2 = (String) this.f11861z;
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (int i14 = 0; i14 < c34611p0.f145796a; i14++) {
            c41014d0M133251l.m133222a(new C27673m(i13, c34611p0, i14, c27670j, iArr[i14], str, str2));
        }
        return c41014d0M133251l.m133239f();
    }

    @Override // p080d4.InterfaceC11651j
    /* JADX INFO: renamed from: d */
    public Object mo8621d(C11650i c11650i) {
        Executor executor = (Executor) this.f11859x;
        String str = (String) this.f11860y;
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) this.f11861z;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        RunnableC18376p runnableC18376p = new RunnableC18376p(atomicBoolean, 0);
        EnumC18364j enumC18364j = EnumC18364j.f71497w;
        C11655n c11655n = c11650i.f37630c;
        if (c11655n != null) {
            c11655n.mo31061a(runnableC18376p, enumC18364j);
        }
        executor.execute(new RunnableC18378q(atomicBoolean, c11650i, interfaceC4339a, 0));
        return str;
    }

    @Override // ax.InterfaceC2117b
    /* JADX INFO: renamed from: e */
    public void mo6683e(C11168d c11168d, ArrayList arrayList) {
        PermissionChecker.checkPermissions$lambda$10((PermissionChecker) this.f11859x, (View) this.f11860y, (String) this.f11861z, c11168d, arrayList);
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        C24504a c24504a = (C24504a) this.f11859x;
        C15981i c15981i = (C15981i) this.f11860y;
        C15980h c15980h = (C15980h) this.f11861z;
        C26827i c26827i = (C26827i) c24504a.f95601d;
        c26827i.getClass();
        EnumC12174d enumC12174d = c15981i.f60490c;
        String str = c15980h.f60482a;
        String str2 = c15981i.f60488a;
        String strConcat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, "Storing event with priority=" + enumC12174d + ", name=" + str + " for destination " + str2);
        }
        ((Long) c26827i.m80059i(new C2953i(c26827i, c15980h, c15981i, 11))).getClass();
        c24504a.f95598a.m45149O(c15981i, 1, false);
        return null;
    }

    @Override // io.sentry.InterfaceC20262b4
    /* JADX INFO: renamed from: g */
    public void mo8622g(InterfaceC20432n1 interfaceC20432n1) {
        GestureDetectorOnGestureListenerC20091g gestureDetectorOnGestureListenerC20091g = (GestureDetectorOnGestureListenerC20091g) this.f11859x;
        InterfaceC20259b1 interfaceC20259b1 = (InterfaceC20259b1) this.f11860y;
        InterfaceC20432n1 interfaceC20432n2 = (InterfaceC20432n1) this.f11861z;
        if (interfaceC20432n1 == null) {
            interfaceC20259b1.mo56180B(interfaceC20432n2);
        } else {
            gestureDetectorOnGestureListenerC20091g.f75472y.getLogger().mo16066m(EnumC20436n5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC20432n2.getName());
        }
    }

    @Override // p073cq.InterfaceC11039h
    /* JADX INFO: renamed from: i */
    public C11052u mo8623i(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f11859x;
        String str = (String) this.f11860y;
        C41114r c41114r = (C41114r) this.f11861z;
        String str2 = (String) obj;
        C34671d0 c34671d0M16385d = FirebaseMessaging.m16385d(firebaseMessaging.f21616b);
        String strM16387e = firebaseMessaging.m16387e();
        String strM56016b = firebaseMessaging.f21622h.m56016b();
        synchronized (c34671d0M16385d) {
            String strM133478a = C41114r.m133478a(System.currentTimeMillis(), str2, strM56016b);
            if (strM133478a != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) c34671d0M16385d.f146043w).edit();
                editorEdit.putString(C34671d0.m109559a(strM16387e, str), strM133478a);
                editorEdit.commit();
            }
        }
        if (c41114r == null || !str2.equals(c41114r.f177228a)) {
            C12355g c12355g = firebaseMessaging.f21615a;
            c12355g.m34610a();
            if ("[DEFAULT]".equals(c12355g.f41520b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb4 = new StringBuilder("Invoking onNewToken for app: ");
                    c12355g.m34610a();
                    sb4.append(c12355g.f41520b);
                    Log.d("FirebaseMessaging", sb4.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C41106j(firebaseMessaging.f21616b).m133443b(intent);
            }
        }
        return Tasks.m15640d(str2);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h resultB) {
        switch (this.f11858w) {
            case 3:
                MessageListController.removeAttachment$lambda$155((MessageListController) this.f11859x, (String) this.f11860y, (Attachment) this.f11861z, resultB);
                break;
            case 4:
                MessageListController.loadMessageById$lambda$71((Function1) this.f11859x, (MessageListController) this.f11860y, (String) this.f11861z, resultB);
                break;
            default:
                C27485o c27485o = (C27485o) this.f11859x;
                AbstractC26205h abstractC26205h = (AbstractC26205h) this.f11860y;
                InterfaceC27471a interfaceC27471a = (InterfaceC27471a) this.f11861z;
                AbstractC22676k.m65750j(resultB, "resultB");
                AbstractC26205h c26203f = null;
                if (!c27485o.f110717c.m1812a()) {
                    if (resultB instanceof C26204g) {
                        c26203f = C27485o.m82915a(abstractC26205h, resultB);
                    } else if (resultB instanceof C26203f) {
                        c26203f = new C26203f(((C26203f) resultB).f103918a);
                    }
                }
                if (c26203f != null) {
                    interfaceC27471a.onResult(c26203f);
                }
                break;
        }
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task requestTask) {
        C35175d c35175d = (C35175d) this.f11859x;
        Activity activity = (Activity) this.f11860y;
        String str = (String) this.f11861z;
        AbstractC22676k.m65750j(requestTask, "requestTask");
        if (requestTask.isSuccessful()) {
            c35175d.m111310a(activity, (AbstractC35172a) requestTask.getResult()).addOnCompleteListener(new C30486c(10, str, activity));
            return;
        }
        C5101l0 c5101l0 = C4861a.f20259o;
        StringBuilder sb4 = new StringBuilder("PlayStoreHandler: Failed to request review flow: ");
        Exception exception = requestTask.getException();
        C23454a0 c23454a0 = null;
        sb4.append(exception != null ? exception.getMessage() : null);
        c5101l0.m16032K(sb4.toString());
        if (str != null) {
            AbstractC32120a.m99982h(activity, str);
            c23454a0 = C23454a0.f92919a;
        }
        if (c23454a0 == null) {
            c5101l0.m16032K("PlayStoreHandler: Failed to open app page - no package name.");
        }
    }

    @Override // com.mapbox.maps.SnapshotCompleteCallback
    public void run(Expected expected) {
        Snapshotter.start$lambda$17((Snapshotter) this.f11859x, (SnapshotResultCallback) this.f11860y, (SnapshotOverlayCallback) this.f11861z, expected);
    }

    public /* synthetic */ C2953i(Runnable runnable, AbstractC2974w abstractC2974w, Runnable runnable2) {
        this.f11858w = 0;
        this.f11859x = runnable;
        this.f11861z = abstractC2974w;
        this.f11860y = runnable2;
    }
}
