package ht;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import gm.C15981i;
import hm.C17417d;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jm.EnumC21781c;
import om.InterfaceC28022a;
import p127ev.C13668i;
import p344nm.C26824f;
import p344nm.C26827i;
import p344nm.InterfaceC26822d;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: ht.b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C17613b implements InterfaceC17619h, InterfaceC28022a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f68313E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f68314w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f68315x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f68316y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f68317z;

    public /* synthetic */ C17613b(C13668i c13668i, Iterable iterable, C15981i c15981i, long j7) {
        this.f68314w = 2;
        this.f68315x = c13668i;
        this.f68313E = iterable;
        this.f68317z = c15981i;
        this.f68316y = j7;
    }

    @Override // ht.InterfaceC17619h
    /* JADX INFO: renamed from: a */
    public ScheduledFuture mo50174a(C17417d c17417d) {
        switch (this.f68314w) {
            case 0:
                ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g = (ScheduledExecutorServiceC17618g) this.f68315x;
                Runnable runnable = (Runnable) this.f68313E;
                return scheduledExecutorServiceC17618g.f68336x.schedule(new RunnableC17616e(scheduledExecutorServiceC17618g, runnable, c17417d, 1), this.f68316y, (TimeUnit) this.f68317z);
            default:
                ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g2 = (ScheduledExecutorServiceC17618g) this.f68315x;
                Callable callable = (Callable) this.f68313E;
                return scheduledExecutorServiceC17618g2.f68336x.schedule(new CallableC17617f(scheduledExecutorServiceC17618g2, callable, c17417d, 0), this.f68316y, (TimeUnit) this.f68317z);
        }
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        C13668i c13668i = (C13668i) this.f68315x;
        Iterable iterable = (Iterable) this.f68313E;
        C15981i c15981i = (C15981i) this.f68317z;
        C26827i c26827i = (C26827i) ((InterfaceC26822d) c13668i.f48456c);
        c26827i.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C26827i.m80057x(iterable);
            SQLiteDatabase sQLiteDatabaseM80058b = c26827i.m80058b();
            sQLiteDatabaseM80058b.beginTransaction();
            try {
                sQLiteDatabaseM80058b.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseM80058b.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        c26827i.m80061m(cursorRawQuery.getInt(0), EnumC21781c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th3) {
                        cursorRawQuery.close();
                        throw th3;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseM80058b.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseM80058b.setTransactionSuccessful();
                sQLiteDatabaseM80058b.endTransaction();
            } catch (Throwable th4) {
                sQLiteDatabaseM80058b.endTransaction();
                throw th4;
            }
        }
        c26827i.m80059i(new C26824f(((InterfaceC29353a) c13668i.f48460g).getTime() + this.f68316y, c15981i));
        return null;
    }

    public /* synthetic */ C17613b(ScheduledExecutorServiceC17618g scheduledExecutorServiceC17618g, Object obj, long j7, TimeUnit timeUnit, int i13) {
        this.f68314w = i13;
        this.f68315x = scheduledExecutorServiceC17618g;
        this.f68313E = obj;
        this.f68316y = j7;
        this.f68317z = timeUnit;
    }
}
