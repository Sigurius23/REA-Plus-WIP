package org.chromium.net;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: org.chromium.net.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C28225c extends ICronetEngineBuilder {

    /* JADX INFO: renamed from: d */
    public static final Set f114007d = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 3)));

    /* JADX INFO: renamed from: a */
    public JSONObject f114008a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f114009b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ICronetEngineBuilder f114010c;

    public C28225c(ICronetEngineBuilder iCronetEngineBuilder) {
        this.f114010c = iCronetEngineBuilder;
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m85492a(String str, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e5) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("Failed adding a default object for key [", str, "]"), e5);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z4, Date date) {
        this.f114010c.addPublicKeyPins(str, set, z4, date);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder addQuicHint(String str, int i13, int i14) {
        this.f114010c.addQuicHint(str, i13, i14);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        JSONObject jSONObject = this.f114008a;
        ArrayList arrayList = this.f114009b;
        ICronetEngineBuilder iCronetEngineBuilder = this.f114010c;
        if (jSONObject == null && arrayList.isEmpty()) {
            return iCronetEngineBuilder.build();
        }
        if (this.f114008a == null) {
            this.f114008a = new JSONObject();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((C28224b) it.next()).m85491a(this.f114008a);
            } catch (JSONException e5) {
                throw new IllegalStateException("Unable to apply JSON patch!", e5);
            }
        }
        iCronetEngineBuilder.setExperimentalOptions(this.f114008a.toString());
        return iCronetEngineBuilder.build();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableBrotli(boolean z4) {
        this.f114010c.enableBrotli(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttp2(boolean z4) {
        this.f114010c.enableHttp2(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableHttpCache(int i13, long j7) {
        this.f114010c.enableHttpCache(i13, j7);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableNetworkQualityEstimator(boolean z4) {
        this.f114010c.enableNetworkQualityEstimator(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z4) {
        this.f114010c.enablePublicKeyPinningBypassForLocalTrustAnchors(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableQuic(boolean z4) {
        this.f114010c.enableQuic(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder enableSdch(boolean z4) {
        this.f114010c.enableSdch(z4);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final String getDefaultUserAgent() {
        return this.f114010c.getDefaultUserAgent();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final Set getSupportedConfigOptions() {
        return f114007d;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setConnectionMigrationOptions(ConnectionMigrationOptions connectionMigrationOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f114010c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(1)) {
            iCronetEngineBuilder.setConnectionMigrationOptions(connectionMigrationOptions);
            return this;
        }
        this.f114009b.add(new C28224b(connectionMigrationOptions, 1));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setDnsOptions(DnsOptions dnsOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f114010c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(2)) {
            iCronetEngineBuilder.setDnsOptions(dnsOptions);
            return this;
        }
        this.f114009b.add(new C28224b(dnsOptions, 0));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setExperimentalOptions(String str) {
        if (str == null || str.isEmpty()) {
            this.f114008a = null;
            return this;
        }
        try {
            this.f114008a = new JSONObject(str);
            return this;
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Experimental options parsing failed", e5);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.f114010c.setLibraryLoader(libraryLoader);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setQuicOptions(QuicOptions quicOptions) {
        ICronetEngineBuilder iCronetEngineBuilder = this.f114010c;
        if (iCronetEngineBuilder.getSupportedConfigOptions().contains(3)) {
            iCronetEngineBuilder.setQuicOptions(quicOptions);
            return this;
        }
        this.f114009b.add(new C28224b(quicOptions, 2));
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setStoragePath(String str) {
        this.f114010c.setStoragePath(str);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setThreadPriority(int i13) {
        this.f114010c.setThreadPriority(i13);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ICronetEngineBuilder setUserAgent(String str) {
        this.f114010c.setUserAgent(str);
        return this;
    }
}
