package p395p6;

import android.widget.RemoteViews;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p6.l1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28896l1 {

    /* JADX INFO: renamed from: a */
    public final RemoteViews f116969a;

    /* JADX INFO: renamed from: b */
    public final C28931x0 f116970b;

    public C28896l1(RemoteViews remoteViews, C28931x0 c28931x0) {
        this.f116969a = remoteViews;
        this.f116970b = c28931x0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28896l1)) {
            return false;
        }
        C28896l1 c28896l1 = (C28896l1) obj;
        return AbstractC22676k.m65745e(this.f116969a, c28896l1.f116969a) && AbstractC22676k.m65745e(this.f116970b, c28896l1.f116970b);
    }

    public final int hashCode() {
        return this.f116970b.hashCode() + (this.f116969a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.f116969a + ", view=" + this.f116970b + ')';
    }
}
