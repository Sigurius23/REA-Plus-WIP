package com.iterable.iterableapi;

import a00.C0072g;
import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import io.getstream.chat.android.models.MessageType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p031b9.C2817b;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.j2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5340j2 implements InterfaceC5348l2 {

    /* JADX INFO: renamed from: z */
    public static final HashSet f21738z = new HashSet(Arrays.asList("events/track", "events/trackPushOpen", "commerce/trackPurchase", "events/trackInAppOpen", "events/trackInAppClick", "events/trackInAppClose", "events/trackInboxSession", "events/trackInAppDelivery", "embedded-messaging/messages", "events/inAppConsume", "users/disableDevice"));

    /* JADX INFO: renamed from: w */
    public final C5356n2 f21739w;

    /* JADX INFO: renamed from: x */
    public final C0072g f21740x;

    /* JADX INFO: renamed from: y */
    public final C5301a f21741y;

    public C5340j2(Context context) {
        if (C2817b.f11020F == null) {
            C2817b c2817b = new C2817b(1);
            c2817b.f11025z = new ArrayList();
            c2817b.f11021E = new HashSet();
            if (context != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                c2817b.f11024y = connectivityManager;
                try {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    c2817b.f11023x = activeNetwork == null ? false : connectivityManager.getNetworkCapabilities(activeNetwork).hasCapability(12);
                    AbstractC12350b.m34577Z("NetworkConnectivityManager", "Internet active : " + c2817b.f11023x);
                } catch (Exception unused) {
                    AbstractC12350b.m34595p("NetworkConnectivityManager", "Error in detecting network availability");
                }
                NetworkRequest networkRequestBuild = new NetworkRequest.Builder().build();
                ConnectivityManager connectivityManager2 = (ConnectivityManager) c2817b.f11024y;
                if (connectivityManager2 != null) {
                    try {
                        connectivityManager2.registerNetworkCallback(networkRequestBuild, new C5368r1(c2817b, 0));
                    } catch (SecurityException e5) {
                        AbstractC12350b.m34595p("NetworkConnectivityManager", e5.getLocalizedMessage());
                    }
                }
            }
            C2817b.f11020F = c2817b;
        }
        C2817b c2817b2 = C2817b.f11020F;
        if (C0072g.f219F == null) {
            C0072g c0072g = new C0072g(8, false);
            c0072g.f225z = new ArrayList();
            c0072g.f221E = new ArrayList();
            if (context != null) {
                try {
                    if (((C5302a0) c0072g.f224y) == null) {
                        c0072g.f224y = new C5302a0(context, "iterable_sdk.db", null, 1);
                    }
                    c0072g.f223x = ((C5302a0) c0072g.f224y).getWritableDatabase();
                } catch (SQLException unused2) {
                    AbstractC12350b.m34595p("IterableTaskStorage", "Database cannot be opened for writing");
                }
            }
            C0072g.f219F = c0072g;
        }
        C0072g c0072g2 = C0072g.f219F;
        this.f21740x = c0072g2;
        C5301a c5301a = new C5301a();
        c5301a.f21628a = false;
        c5301a.f21629b = c0072g2;
        if (c0072g2.m202t()) {
            AbstractC12350b.m34577Z("HealthMonitor", "DB Ready notified to healthMonitor");
            c5301a.f21628a = false;
        } else {
            AbstractC12350b.m34595p("HealthMonitor", "DB Error notified to healthMonitor");
            c5301a.f21628a = true;
        }
        ((ArrayList) c0072g2.f221E).add(c5301a);
        this.f21741y = c5301a;
        C5325g c5325g = C5325g.f21686i;
        C5316d2 c5316d2 = new C5316d2();
        HandlerThread handlerThread = new HandlerThread("NetworkThread");
        c5316d2.f21670F = new ArrayList();
        c5316d2.f21671w = c0072g2;
        c5316d2.f21672x = c5325g;
        c5316d2.f21673y = c2817b2;
        c5316d2.f21674z = c5301a;
        handlerThread.start();
        c5316d2.f21669E = new Handler(handlerThread.getLooper(), c5316d2);
        ((ArrayList) c0072g2.f225z).add(c5316d2);
        synchronized (c2817b2) {
            ((ArrayList) c2817b2.f11025z).add(c5316d2);
        }
        c5325g.m16438a(c5316d2);
        this.f21739w = new C5356n2(c0072g2, c5316d2);
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: a */
    public final void mo16477a() {
        C0072g c0072g = this.f21740x;
        if (c0072g.m202t()) {
            AbstractC12350b.m34577Z("IterableTaskStorage", "Deleted " + ((SQLiteDatabase) c0072g.f223x).delete("OfflineTask", null, null) + " offline tasks");
        }
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: b */
    public final void mo16478b(String str, String str2, JSONObject jSONObject, String str3, C5392z1 c5392z1, InterfaceC5318e0 interfaceC5318e0) {
        C5357o c5357o = new C5357o(str, str2, jSONObject, "POST", str3, c5392z1, interfaceC5318e0);
        if (f21738z.contains(str2)) {
            C5301a c5301a = this.f21741y;
            c5301a.getClass();
            AbstractC12350b.m34593n("HealthMonitor", "canSchedule");
            try {
                C0072g c0072g = c5301a.f21629b;
                if (!c0072g.m202t()) {
                    throw new IllegalStateException("Database is not ready");
                }
                if (DatabaseUtils.queryNumEntries((SQLiteDatabase) c0072g.f223x, "OfflineTask") < 1000) {
                    c5357o.f21788f = EnumC5353n.f21775x;
                    C5356n2 c5356n2 = this.f21739w;
                    c5356n2.getClass();
                    try {
                        JSONObject jSONObjectM16502b = c5357o.m16502b();
                        C0072g c0072g2 = c5356n2.f21782a;
                        String string = jSONObjectM16502b.toString();
                        String str4 = null;
                        if (c0072g2.m202t()) {
                            ContentValues contentValues = new ContentValues();
                            C5308b2 c5308b2 = new C5308b2();
                            String string2 = UUID.randomUUID().toString();
                            c5308b2.f21638a = string2;
                            long time = new Date().getTime();
                            c5308b2.f21640c = time;
                            long time2 = new Date().getTime();
                            long time3 = new Date().getTime();
                            c5308b2.f21646i = string;
                            c5308b2.f21648k = 1;
                            contentValues.put("task_id", string2);
                            contentValues.put("name", str2);
                            contentValues.put("version", Integer.valueOf(c5308b2.f21639b));
                            contentValues.put(AnalyticsRequestV2.PARAM_CREATED, Long.valueOf(time));
                            long j7 = c5308b2.f21641d;
                            if (j7 != 0) {
                                contentValues.put("modified", Long.valueOf(j7));
                            }
                            long j13 = c5308b2.f21642e;
                            if (j13 != 0) {
                                contentValues.put("last_attempt", Long.valueOf(j13));
                            }
                            if (time2 != 0) {
                                contentValues.put("scheduled", Long.valueOf(time2));
                            }
                            if (time3 != 0) {
                                contentValues.put("requested", Long.valueOf(time3));
                            }
                            contentValues.put("processing", Boolean.valueOf(c5308b2.f21643f));
                            contentValues.put(MessageType.FAILED, Boolean.valueOf(c5308b2.f21644g));
                            contentValues.put("blocking", Boolean.valueOf(c5308b2.f21645h));
                            if (string != null) {
                                contentValues.put("data", string);
                            }
                            String str5 = c5308b2.f21647j;
                            if (str5 != null) {
                                contentValues.put("error", str5);
                            }
                            contentValues.put("type", "API");
                            contentValues.put("attempts", Integer.valueOf(c5308b2.f21649l));
                            if (((SQLiteDatabase) c0072g2.f223x).insert("OfflineTask", null, contentValues) == -1) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC5320e2(c0072g2));
                            } else {
                                contentValues.clear();
                                new Handler(Looper.getMainLooper()).post(new RunnableC5320e2(c0072g2, c5308b2));
                                str4 = string2;
                            }
                        }
                        if (str4 == null) {
                            new AsyncTaskC5304a2().execute(c5357o);
                            return;
                        } else {
                            C5356n2.f21780b.put(str4, c5392z1);
                            C5356n2.f21781c.put(str4, interfaceC5318e0);
                            return;
                        }
                    } catch (JSONException unused) {
                        AbstractC12350b.m34595p("RequestProcessor", "Failed serializing the request for offline execution. Attempting to request the request now...");
                        new AsyncTaskC5304a2().execute(c5357o);
                        return;
                    }
                }
            } catch (IllegalStateException e5) {
                AbstractC12350b.m34595p("HealthMonitor", e5.getLocalizedMessage());
                c5301a.f21628a = true;
            }
        }
        new AsyncTaskC5304a2().execute(c5357o);
    }

    @Override // com.iterable.iterableapi.InterfaceC5348l2
    /* JADX INFO: renamed from: c */
    public final void mo16479c(String str, String str2, JSONObject jSONObject, String str3, InterfaceC5322f0 interfaceC5322f0) {
        new AsyncTaskC5304a2().execute(new C5357o(str, str2, jSONObject, "GET", str3, interfaceC5322f0));
    }
}
