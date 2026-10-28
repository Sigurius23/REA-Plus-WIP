package p344nm;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import dm.EnumC12174d;
import gm.C15981i;
import p430qm.AbstractC30477a;

/* JADX INFO: renamed from: nm.f */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C26824f implements InterfaceC26825g {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f106983w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15981i f106984x;

    public /* synthetic */ C26824f(long j7, C15981i c15981i) {
        this.f106983w = j7;
        this.f106984x = c15981i;
    }

    @Override // p344nm.InterfaceC26825g
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f106983w));
        C15981i c15981i = this.f106984x;
        String str = c15981i.f60488a;
        EnumC12174d enumC12174d = c15981i.f60490c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC30477a.m93285a(enumC12174d))}) < 1) {
            contentValues.put("backend_name", c15981i.f60488a);
            contentValues.put("priority", Integer.valueOf(AbstractC30477a.m93285a(enumC12174d)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
