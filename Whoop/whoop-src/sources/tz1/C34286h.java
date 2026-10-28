package tz1;

import com.whoop.navigation.C9598e;
import d13.AbstractC11478a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: tz1.h */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ltz1/h;", "", "Lcom/whoop/navigation/e;", "destination", "", "analyticsValue", "", "index", "<init>", "(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/e;", "b", "()Lcom/whoop/navigation/e;", "Ljava/lang/String;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C34286h {

    /* JADX INFO: renamed from: d */
    public static final int f144008d = C9598e.f28134d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C9598e destination;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String analyticsValue;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Integer index;

    public C34286h(C9598e c9598e, String str, Integer num) {
        this.destination = c9598e;
        this.analyticsValue = str;
        this.index = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getIndex() {
        return this.index;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C34286h)) {
            return false;
        }
        C34286h c34286h = (C34286h) other;
        return AbstractC22676k.m65745e(this.destination, c34286h.destination) && AbstractC22676k.m65745e(this.analyticsValue, c34286h.analyticsValue) && AbstractC22676k.m65745e(this.index, c34286h.index);
    }

    public int hashCode() {
        C9598e c9598e = this.destination;
        int iHashCode = (c9598e == null ? 0 : c9598e.hashCode()) * 31;
        String str = this.analyticsValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.index;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        C9598e c9598e = this.destination;
        String str = this.analyticsValue;
        Integer num = this.index;
        StringBuilder sb4 = new StringBuilder("ShopBannerClickEvent(destination=");
        sb4.append(c9598e);
        sb4.append(", analyticsValue=");
        sb4.append(str);
        sb4.append(", index=");
        return AbstractC11478a.m30859k(sb4, num, ")");
    }
}
