package io.sentry.rrweb;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.rrweb.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20523b {

    /* JADX INFO: renamed from: w */
    public EnumC20524c f76900w;

    /* JADX INFO: renamed from: x */
    public long f76901x = System.currentTimeMillis();

    public AbstractC20523b(EnumC20524c enumC20524c) {
        this.f76900w = enumC20524c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC20523b)) {
            return false;
        }
        AbstractC20523b abstractC20523b = (AbstractC20523b) obj;
        return this.f76901x == abstractC20523b.f76901x && this.f76900w == abstractC20523b.f76900w;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f76900w, Long.valueOf(this.f76901x)});
    }
}
