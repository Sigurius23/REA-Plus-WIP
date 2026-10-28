package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import p154fs.AbstractC14733k;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5119x {

    /* JADX INFO: renamed from: b */
    public static final C5119x f21470b = new C5119x();

    /* JADX INFO: renamed from: a */
    public final HashMap f21471a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final synchronized void m16085a(String str, AbstractC14733k abstractC14733k) {
        try {
            if (!this.f21471a.containsKey(str)) {
                this.f21471a.put(str, abstractC14733k);
                return;
            }
            if (((AbstractC14733k) this.f21471a.get(str)).equals(abstractC14733k)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f21471a.get(str) + "), cannot insert " + abstractC14733k);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m16086b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            m16085a((String) entry.getKey(), (AbstractC14733k) entry.getValue());
        }
    }
}
