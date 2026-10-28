package io.seon.androidsdk.service;

import android.net.TrafficStats;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import live.hms.video.utils.HMSConstantsKt;
import org.json.JSONException;
import org.json.JSONObject;
import p037bu.C3632c;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.seon.androidsdk.service.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC20671i0 implements Callable {

    /* JADX INFO: renamed from: w */
    public final C20653c0 f77331w;

    /* JADX INFO: renamed from: x */
    public final int f77332x;

    /* JADX INFO: renamed from: y */
    public C20659e0 f77333y;

    /* JADX INFO: renamed from: z */
    public static final C3632c f77330z = new C3632c(CallableC20671i0.class.getName());

    /* JADX INFO: renamed from: E */
    public static final Pattern f77329E = Pattern.compile("[A-Za-z0-9](?:[A-Za-z0-9\\-]{0,61}[A-Za-z0-9])?");

    public CallableC20671i0(C20653c0 c20653c0, int i13) {
        this.f77331w = c20653c0;
        this.f77332x = i13;
    }

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection m56813a(String str) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
        httpURLConnection.setRequestProperty("Accept", "*/*");
        int i13 = this.f77332x;
        httpURLConnection.setConnectTimeout(i13);
        httpURLConnection.setReadTimeout(i13);
        return httpURLConnection;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        String strGroup;
        C20659e0 c20659e0 = new C20659e0();
        c20659e0.f77284a = null;
        this.f77333y = c20659e0;
        C20653c0 c20653c0 = this.f77331w;
        String str = c20653c0.f77248a;
        String str2 = c20653c0.f77249b;
        C3632c c3632c = f77330z;
        if (str != null) {
            Matcher matcher = f77329E.matcher(str.replaceAll("[^a-zA-Z0-9-]", ""));
            if (matcher.find()) {
                try {
                    strGroup = matcher.group();
                } catch (Exception e5) {
                    c3632c.m11163L(3, e5);
                    strGroup = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
                }
            } else {
                strGroup = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
            }
        } else {
            strGroup = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
        }
        try {
            HttpURLConnection httpURLConnectionM56813a = m56813a(AbstractC11895b.m31996o("https://", strGroup, ".seondnsresolve.com/android"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str2);
            if (str2 != null) {
                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnectionM56813a.getOutputStream());
                try {
                    try {
                        dataOutputStream.writeBytes(jSONObject.toString());
                    } catch (Exception e13) {
                        c3632c.m11163L(3, e13);
                        dataOutputStream.close();
                    }
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    TrafficStats.clearThreadStatsTag();
                } catch (Throwable th3) {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            }
            httpURLConnectionM56813a.connect();
            int responseCode = httpURLConnectionM56813a.getResponseCode();
            c3632c.m11157F(4, "Status code: " + String.valueOf(responseCode));
            if (responseCode == 202 || responseCode == 200) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnectionM56813a.getInputStream(), "utf-8"));
                    try {
                        StringBuilder sb4 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb4.append(line.trim());
                            httpURLConnectionM56813a.disconnect();
                            throw th;
                        }
                        this.f77333y.getClass();
                        String string = sb4.toString();
                        bufferedReader.close();
                        if (string != null && !string.isEmpty()) {
                            try {
                                this.f77333y.f77284a = new JSONObject(string).getString("data");
                            } catch (JSONException unused) {
                                httpURLConnectionM56813a.disconnect();
                            }
                        }
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    httpURLConnectionM56813a.disconnect();
                    throw th6;
                }
            }
            httpURLConnectionM56813a.disconnect();
        } catch (Exception unused2) {
        }
        return this.f77333y;
    }
}
