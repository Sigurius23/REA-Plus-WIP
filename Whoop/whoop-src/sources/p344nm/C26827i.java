package p344nm;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import dm.C12173c;
import gm.C15981i;
import io.seon.androidsdk.service.C20669h1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import jm.EnumC21781c;
import k83.InterfaceC22297a;
import om.InterfaceC28022a;
import om.InterfaceC28023b;
import p032bc.C2953i;
import p430qm.AbstractC30477a;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: nm.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C26827i implements InterfaceC26822d, InterfaceC28023b, InterfaceC26821c {

    /* JADX INFO: renamed from: F */
    public static final C12173c f106987F = new C12173c("proto");

    /* JADX INFO: renamed from: E */
    public final InterfaceC22297a f106988E;

    /* JADX INFO: renamed from: w */
    public final C26829k f106989w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC29353a f106990x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC29353a f106991y;

    /* JADX INFO: renamed from: z */
    public final C26819a f106992z;

    public C26827i(InterfaceC29353a interfaceC29353a, InterfaceC29353a interfaceC29353a2, C26819a c26819a, C26829k c26829k, InterfaceC22297a interfaceC22297a) {
        this.f106989w = c26829k;
        this.f106990x = interfaceC29353a;
        this.f106991y = interfaceC29353a2;
        this.f106992z = c26819a;
        this.f106988E = interfaceC22297a;
    }

    /* JADX INFO: renamed from: J */
    public static Object m80055J(Cursor cursor, InterfaceC26825g interfaceC26825g) {
        try {
            return interfaceC26825g.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: h */
    public static Long m80056h(SQLiteDatabase sQLiteDatabase, C15981i c15981i) {
        StringBuilder sb4 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c15981i.f60488a, String.valueOf(AbstractC30477a.m93285a(c15981i.f60490c))));
        byte[] bArr = c15981i.f60489b;
        if (bArr != null) {
            sb4.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb4.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb4.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: x */
    public static String m80057x(Iterable iterable) {
        StringBuilder sb4 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb4.append(((C26820b) it.next()).f106978a);
            if (it.hasNext()) {
                sb4.append(DateTimeRange.lowerUpperDelimiter);
            }
        }
        sb4.append(')');
        return sb4.toString();
    }

    /* JADX INFO: renamed from: b */
    public final SQLiteDatabase m80058b() {
        C26829k c26829k = this.f106989w;
        Objects.requireNonNull(c26829k);
        InterfaceC29353a interfaceC29353a = this.f106991y;
        long time = interfaceC29353a.getTime();
        while (true) {
            try {
                return c26829k.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e5) {
                if (interfaceC29353a.getTime() >= ((long) this.f106992z.f106975c) + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f106989w.close();
    }

    /* JADX INFO: renamed from: i */
    public final Object m80059i(InterfaceC26825g interfaceC26825g) {
        SQLiteDatabase sQLiteDatabaseM80058b = m80058b();
        sQLiteDatabaseM80058b.beginTransaction();
        try {
            Object objApply = interfaceC26825g.apply(sQLiteDatabaseM80058b);
            sQLiteDatabaseM80058b.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM80058b.endTransaction();
        }
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m80060k(SQLiteDatabase sQLiteDatabase, C15981i c15981i, int i13) {
        ArrayList arrayList = new ArrayList();
        Long lM80056h = m80056h(sQLiteDatabase, c15981i);
        if (lM80056h == null) {
            return arrayList;
        }
        m80055J(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lM80056h.toString()}, null, null, null, String.valueOf(i13)), new C2953i(this, arrayList, c15981i, 10));
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final void m80061m(long j7, EnumC21781c enumC21781c, String str) {
        m80059i(new C20669h1(j7, str, enumC21781c));
    }

    /* JADX INFO: renamed from: s */
    public final Object m80062s(InterfaceC28022a interfaceC28022a) {
        SQLiteDatabase sQLiteDatabaseM80058b = m80058b();
        InterfaceC29353a interfaceC29353a = this.f106991y;
        long time = interfaceC29353a.getTime();
        while (true) {
            try {
                sQLiteDatabaseM80058b.beginTransaction();
                try {
                    Object objExecute = interfaceC28022a.execute();
                    sQLiteDatabaseM80058b.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseM80058b.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e5) {
                if (interfaceC29353a.getTime() >= ((long) this.f106992z.f106975c) + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e5);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
