package io.seon.androidsdk.service;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import gm.C15981i;
import jm.EnumC21781c;
import om.InterfaceC28022a;
import org.json.JSONObject;
import p127ev.C13668i;
import p344nm.C26824f;
import p344nm.C26827i;
import p344nm.InterfaceC26822d;
import p344nm.InterfaceC26825g;
import pm.InterfaceC29353a;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: io.seon.androidsdk.service.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20669h1 implements InterfaceC28022a, InterfaceC26825g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f77326w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f77327x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f77328y;

    public /* synthetic */ C20669h1(long j7, Object obj, Object obj2) {
        this.f77327x = obj;
        this.f77328y = obj2;
        this.f77326w = j7;
    }

    @Override // p344nm.InterfaceC26825g
    public Object apply(Object obj) {
        String str = (String) this.f77327x;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i13 = ((EnumC21781c) this.f77328y).f83915w;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i13)});
        try {
            boolean z4 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j7 = this.f77326w;
            if (z4) {
                sQLiteDatabase.execSQL(AbstractC31061c.m95636l(j7, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i13)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i13));
            contentValues.put("events_dropped_count", Long.valueOf(j7));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th3) {
            cursorRawQuery.close();
            throw th3;
        }
    }

    @Override // om.InterfaceC28022a
    public Object execute() {
        C13668i c13668i = (C13668i) this.f77327x;
        C15981i c15981i = (C15981i) this.f77328y;
        InterfaceC26822d interfaceC26822d = (InterfaceC26822d) c13668i.f48456c;
        long time = ((InterfaceC29353a) c13668i.f48460g).getTime() + this.f77326w;
        C26827i c26827i = (C26827i) interfaceC26822d;
        c26827i.getClass();
        c26827i.m80059i(new C26824f(time, c15981i));
        return null;
    }

    public /* synthetic */ C20669h1(C20672i1 c20672i1, long j7, JSONObject jSONObject) {
        this.f77327x = c20672i1;
        this.f77326w = j7;
        this.f77328y = jSONObject;
    }
}
