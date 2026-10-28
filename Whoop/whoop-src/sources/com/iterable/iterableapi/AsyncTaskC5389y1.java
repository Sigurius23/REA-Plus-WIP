package com.iterable.iterableapi;

import ad3.C0783z;
import android.content.Context;
import android.os.AsyncTask;
import androidx.core.app.NotificationCompat;
import com.google.crypto.tink.internal.C5101l0;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p098dt.AbstractC12350b;

/* JADX INFO: renamed from: com.iterable.iterableapi.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC5389y1 extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public C5386x1 f21891a;

    /* JADX WARN: Code duplicated, block: B:21:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[Catch: JSONException -> 0x00ca, TryCatch #1 {JSONException -> 0x00ca, blocks: (B:38:0x00bd, B:40:0x00c4, B:45:0x00d4, B:44:0x00cf), top: B:52:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf A[Catch: JSONException -> 0x00ca, TryCatch #1 {JSONException -> 0x00ca, blocks: (B:38:0x00bd, B:40:0x00c4, B:45:0x00d4, B:44:0x00cf), top: B:52:0x00bd }] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        C0783z c0783z;
        int i13;
        C5341k c5341k;
        String str;
        String str2;
        String str3;
        String str4;
        JSONObject jSONObject;
        C5341k c5341k2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        HashMap map;
        C5386x1 c5386x1 = ((C5386x1[]) objArr)[0];
        this.f21891a = c5386x1;
        if (c5386x1.f21887c == null) {
            AbstractC12350b.m34595p("IterablePush", "iterablePushRegistrationData has not been specified");
            return null;
        }
        try {
            Context context = C5341k.f21742r.f21743a;
            if (context != null) {
                int identifier = context.getResources().getIdentifier("gcm_defaultSenderId", "string", context.getPackageName());
                if ((identifier != 0 ? context.getResources().getString(identifier) : null) == null) {
                    AbstractC12350b.m34595p("IterablePushRegistration", "Could not find gcm_defaultSenderId, please check that Firebase SDK is set up properly");
                } else {
                    String strM16401l = IterableFirebaseMessagingService.m16401l();
                    c0783z = new C0783z(6);
                    c0783z.f2818x = strM16401l;
                }
                if (c0783z != null) {
                    i13 = this.f21891a.f21889e;
                    if (i13 == 1) {
                        c5341k2 = C5341k.f21742r;
                        C5386x1 c5386x2 = this.f21891a;
                        str5 = c5386x2.f21885a;
                        str6 = c5386x2.f21886b;
                        str7 = c5386x2.f21888d;
                        str8 = c5386x2.f21887c;
                        str9 = (String) c0783z.f2818x;
                        map = C5341k.f21742r.f21757o;
                        if (str9 != null) {
                            c5341k2.getClass();
                        } else if (c5341k2.m16482a() && c5341k2.f21748f == null) {
                            C5341k.f21742r.f21744b.getClass();
                        } else {
                            new Thread(new RunnableC5337j(c5341k2, str5, str6, str7, str8, str9, map)).start();
                        }
                    } else if (i13 == 2) {
                        c5341k = C5341k.f21742r;
                        C5386x1 c5386x3 = this.f21891a;
                        str = c5386x3.f21885a;
                        str2 = c5386x3.f21886b;
                        str3 = c5386x3.f21888d;
                        str4 = (String) c0783z.f2818x;
                        if (str4 == null) {
                            c5341k.getClass();
                            AbstractC12350b.m34593n("IterableApi", "device token not available");
                        } else {
                            C5101l0 c5101l0 = c5341k.f21752j;
                            jSONObject = new JSONObject();
                            try {
                                jSONObject.put("token", str4);
                                if (str != null) {
                                    jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
                                } else if (str2 != null) {
                                    jSONObject.put("userId", str2);
                                }
                                c5101l0.m16056g0("users/disableDevice", jSONObject, str3, null, null);
                            } catch (JSONException e5) {
                                e5.printStackTrace();
                            }
                        }
                    }
                }
                return null;
            }
            AbstractC12350b.m34595p("IterablePushRegistration", "MainActivity Context is null");
        } catch (Exception e13) {
            AbstractC12350b.m34596q("IterablePushRegistration", "Exception while retrieving the device token: check that firebase is added to the build dependencies", e13);
        }
        c0783z = null;
        if (c0783z != null) {
            i13 = this.f21891a.f21889e;
            if (i13 == 1) {
                c5341k2 = C5341k.f21742r;
                C5386x1 c5386x4 = this.f21891a;
                str5 = c5386x4.f21885a;
                str6 = c5386x4.f21886b;
                str7 = c5386x4.f21888d;
                str8 = c5386x4.f21887c;
                str9 = (String) c0783z.f2818x;
                map = C5341k.f21742r.f21757o;
                if (str9 != null) {
                    c5341k2.getClass();
                } else if (c5341k2.m16482a()) {
                    new Thread(new RunnableC5337j(c5341k2, str5, str6, str7, str8, str9, map)).start();
                } else {
                    new Thread(new RunnableC5337j(c5341k2, str5, str6, str7, str8, str9, map)).start();
                }
            } else if (i13 == 2) {
                c5341k = C5341k.f21742r;
                C5386x1 c5386x5 = this.f21891a;
                str = c5386x5.f21885a;
                str2 = c5386x5.f21886b;
                str3 = c5386x5.f21888d;
                str4 = (String) c0783z.f2818x;
                if (str4 == null) {
                    c5341k.getClass();
                    AbstractC12350b.m34593n("IterableApi", "device token not available");
                } else {
                    C5101l0 c5101l1 = c5341k.f21752j;
                    jSONObject = new JSONObject();
                    jSONObject.put("token", str4);
                    if (str != null) {
                        jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
                    } else if (str2 != null) {
                        jSONObject.put("userId", str2);
                    }
                    c5101l1.m16056g0("users/disableDevice", jSONObject, str3, null, null);
                }
            }
        }
        return null;
    }
}
