package com.iterable.iterableapi;

import a00.C0072g;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.getstream.chat.android.models.MessageType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p031b9.C2817b;
import p044c5.RunnableC4221m;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.d2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5316d2 implements Handler.Callback, InterfaceC5321f {

    /* JADX INFO: renamed from: E */
    public Handler f21669E;

    /* JADX INFO: renamed from: F */
    public ArrayList f21670F;

    /* JADX INFO: renamed from: w */
    public C0072g f21671w;

    /* JADX INFO: renamed from: x */
    public C5325g f21672x;

    /* JADX INFO: renamed from: y */
    public C2817b f21673y;

    /* JADX INFO: renamed from: z */
    public C5301a f21674z;

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: a */
    public final void mo16418a() {
    }

    @Override // com.iterable.iterableapi.InterfaceC5321f
    /* JADX INFO: renamed from: b */
    public final void mo16419b() {
        m16427c();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m16427c() {
        this.f21669E.removeMessages(100);
        this.f21669E.sendEmptyMessage(100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        C5308b2 c5308b2;
        int i13;
        C5308b2 c5308b3;
        JSONObject jSONObject;
        String str;
        String str2;
        C5301a c5301a;
        C5360p c5360pM16404b;
        C5316d2 c5316d2 = this;
        int i14 = 100;
        if (message.what != 100) {
            return false;
        }
        C0072g c0072g = c5316d2.f21671w;
        C5301a c5301a2 = c5316d2.f21674z;
        WeakReference weakReference = c5316d2.f21672x.f21688b;
        String[] strArr = null;
        String str3 = "IterableTaskRunner";
        if ((weakReference != null ? (Activity) weakReference.get() : null) == null) {
            AbstractC12350b.m34593n("IterableTaskRunner", "App not in foreground, skipping processing tasks");
            return true;
        }
        StringBuilder sb4 = new StringBuilder("Health monitor can process: ");
        sb4.append(!c5301a2.f21628a);
        String str4 = "HealthMonitor";
        AbstractC12350b.m34593n("HealthMonitor", sb4.toString());
        if (!c5301a2.f21628a) {
            while (c5316d2.f21673y.f11023x) {
                boolean zM202t = c0072g.m202t();
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) c0072g.f223x;
                String str5 = "data";
                if (zM202t) {
                    Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select * from OfflineTask order by scheduled limit 1", strArr);
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("task_id"));
                        cursorRawQuery.getString(cursorRawQuery.getColumnIndex("name"));
                        int i15 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("version"));
                        long j7 = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex(AnalyticsRequestV2.PARAM_CREATED));
                        long j13 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("modified")) ? cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("modified")) : 0L;
                        long j14 = cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("last_attempt")) ? 0L : cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("last_attempt"));
                        if (!cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("scheduled"))) {
                            cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("scheduled"));
                        }
                        if (!cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("requested"))) {
                            cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("requested"));
                        }
                        boolean z4 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("processing")) && cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("processing")) > 0;
                        boolean z13 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex(MessageType.FAILED)) && cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(MessageType.FAILED)) > 0;
                        boolean z14 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("blocking")) && cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("blocking")) > 0;
                        String string2 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("data")) ? cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data")) : null;
                        String string3 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("error")) ? cursorRawQuery.getString(cursorRawQuery.getColumnIndex("error")) : null;
                        if (cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("type"))) {
                            i13 = 0;
                        } else {
                            String string4 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("type"));
                            if (string4 == null) {
                                throw new NullPointerException("Name is null");
                            }
                            if (!string4.equals("API")) {
                                throw new IllegalArgumentException("No enum constant com.iterable.iterableapi.IterableTaskType.".concat(string4));
                            }
                            i13 = 1;
                        }
                        int i16 = i13;
                        int i17 = !cursorRawQuery.isNull(cursorRawQuery.getColumnIndex("attempts")) ? cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("attempts")) : 0;
                        C5308b2 c5308b4 = new C5308b2();
                        c5308b4.f21638a = string;
                        c5308b4.f21639b = i15;
                        c5308b4.f21640c = j7;
                        c5308b4.f21641d = j13;
                        c5308b4.f21642e = j14;
                        c5308b4.f21643f = z4;
                        c5308b4.f21644g = z13;
                        c5308b4.f21645h = z14;
                        c5308b4.f21646i = string2;
                        c5308b4.f21647j = string3;
                        c5308b4.f21648k = i16;
                        c5308b4.f21649l = i17;
                        c5308b2 = c5308b4;
                    } else {
                        i14 = i14;
                        c5308b2 = null;
                    }
                    cursorRawQuery.close();
                    c5308b3 = c5308b2;
                } else {
                    i14 = i14;
                    c0072g = c0072g;
                    c5301a2 = c5301a2;
                    str3 = str3;
                    str4 = str4;
                    sQLiteDatabase = sQLiteDatabase;
                    str5 = "data";
                    c5308b3 = strArr;
                }
                if (c5308b3 == 0) {
                    return true;
                }
                String str6 = c5308b3.f21638a;
                if (c5308b3.f21648k == 1) {
                    try {
                        try {
                            jSONObject = new JSONObject(c5308b3.f21646i);
                            jSONObject.getJSONObject(str5).put("createdAt", c5308b3.f21640c / 1000);
                        } catch (JSONException e5) {
                            e5.printStackTrace();
                            jSONObject = null;
                        }
                        C5357o c5357oM16501a = C5357o.m16501a(jSONObject);
                        c5357oM16501a.f21788f = EnumC5353n.f21775x;
                        c5360pM16404b = AsyncTaskC5304a2.m16404b(c5357oM16501a);
                        c5301a = c5301a2;
                        str2 = str4;
                        str = str3;
                    } catch (Exception e13) {
                        str = str3;
                        AbstractC12350b.m34596q(str, "Error while processing request task", e13);
                        str2 = str4;
                        AbstractC12350b.m34595p(str2, "DB Error notified to healthMonitor");
                        c5301a = c5301a2;
                        c5301a.f21628a = true;
                        c5360pM16404b = null;
                    }
                    int i18 = 2;
                    if (c5360pM16404b != null) {
                        if (c5360pM16404b.f21797a) {
                            i18 = 1;
                        } else if (c5360pM16404b.f21801e.contains("failed to connect")) {
                            i18 = 3;
                        }
                    }
                    Iterator it = this.f21670F.iterator();
                    while (it.hasNext()) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC4221m((InterfaceC5312c2) it.next(), str6, i18, c5360pM16404b));
                    }
                    if (i18 != 3) {
                        if (c0072g.m202t()) {
                            AbstractC12350b.m34577Z("IterableTaskStorage", "Deleted entry - " + sQLiteDatabase.delete("OfflineTask", "task_id =?", new String[]{str6}));
                        }
                        str4 = str2;
                        str3 = str;
                        c5301a2 = c5301a;
                        c5316d2 = this;
                        c0072g = c0072g;
                        i14 = i14;
                        strArr = null;
                    }
                } else {
                    this = this;
                }
                Handler handler = this.f21669E;
                handler.removeCallbacksAndMessages(Integer.valueOf(i14));
                handler.sendEmptyMessageDelayed(i14, 60000L);
                return true;
            }
        }
        return true;
    }
}
