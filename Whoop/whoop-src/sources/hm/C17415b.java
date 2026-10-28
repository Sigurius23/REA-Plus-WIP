package hm;

import android.content.Context;
import p319m4.AbstractC25012a;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: hm.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C17415b extends AbstractC17416c {

    /* JADX INFO: renamed from: a */
    public final Context f67501a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC29353a f67502b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC29353a f67503c;

    /* JADX INFO: renamed from: d */
    public final String f67504d;

    public C17415b(Context context, InterfaceC29353a interfaceC29353a, InterfaceC29353a interfaceC29353a2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f67501a = context;
        if (interfaceC29353a == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f67502b = interfaceC29353a;
        if (interfaceC29353a2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f67503c = interfaceC29353a2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f67504d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17416c) {
            C17415b c17415b = (C17415b) ((AbstractC17416c) obj);
            if (this.f67501a.equals(c17415b.f67501a) && this.f67502b.equals(c17415b.f67502b) && this.f67503c.equals(c17415b.f67503c) && this.f67504d.equals(c17415b.f67504d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f67501a.hashCode() ^ 1000003) * 1000003) ^ this.f67502b.hashCode()) * 1000003) ^ this.f67503c.hashCode()) * 1000003) ^ this.f67504d.hashCode();
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CreationContext{applicationContext=");
        sb4.append(this.f67501a);
        sb4.append(", wallClock=");
        sb4.append(this.f67502b);
        sb4.append(", monotonicClock=");
        sb4.append(this.f67503c);
        sb4.append(", backendName=");
        return AbstractC25012a.m73376i(this.f67504d, "}", sb4);
    }
}
