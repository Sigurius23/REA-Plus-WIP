package p108e4;

import java.util.LinkedHashMap;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e4.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12683q {

    /* JADX INFO: renamed from: a */
    public final Object f43367a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f43368b = new LinkedHashMap();

    public AbstractC12683q(Object obj) {
        this.f43367a = obj;
    }

    /* JADX INFO: renamed from: a */
    public Object mo35474a() {
        return this.f43367a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC12683q) && AbstractC22676k.m65745e(mo35474a(), ((AbstractC12683q) obj).mo35474a());
    }

    public final int hashCode() {
        return mo35474a().hashCode();
    }
}
