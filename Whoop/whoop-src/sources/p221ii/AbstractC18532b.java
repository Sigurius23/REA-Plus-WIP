package p221ii;

import android.graphics.Bitmap;
import gi.C15878i;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: ii.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC18532b {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC18532b) && AbstractC22676k.m65745e(getCacheKey(), ((AbstractC18532b) obj).getCacheKey());
    }

    public abstract String getCacheKey();

    public int hashCode() {
        return getCacheKey().hashCode();
    }

    public final String toString() {
        return AbstractC22671h0.f89337a.getOrCreateKotlinClass(getClass()).getSimpleName() + "(cacheKey=" + getCacheKey() + ')';
    }

    public abstract Object transform(Bitmap bitmap, C15878i c15878i, InterfaceC30057d interfaceC30057d);
}
