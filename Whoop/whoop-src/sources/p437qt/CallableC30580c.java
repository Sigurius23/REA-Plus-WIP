package p437qt;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p014aj.C0928c;
import p037bu.C3631b;

/* JADX INFO: renamed from: qt.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC30580c implements Callable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f125824w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30581d f125825x;

    public /* synthetic */ CallableC30580c(C30581d c30581d, int i13) {
        this.f125824w = i13;
        this.f125825x = c30581d;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f125824w) {
            case 0:
                C30581d c30581d = this.f125825x;
                synchronized (c30581d) {
                    try {
                        C0928c c0928c = (C0928c) c30581d.f125826a.get();
                        ArrayList arrayListM2298G = c0928c.m2298G();
                        c0928c.m2295C();
                        JSONArray jSONArray = new JSONArray();
                        for (int i13 = 0; i13 < arrayListM2298G.size(); i13++) {
                            C30578a c30578a = (C30578a) arrayListM2298G.get(i13);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", c30578a.m93812c());
                            jSONObject.put("dates", new JSONArray((Collection) c30578a.m93811b()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th3) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
                return string;
            default:
                C30581d c30581d2 = this.f125825x;
                synchronized (c30581d2) {
                    ((C0928c) c30581d2.f125826a.get()).m2313W(System.currentTimeMillis(), ((C3631b) c30581d2.f125828c.get()).m11151a());
                    break;
                }
                return null;
        }
    }
}
