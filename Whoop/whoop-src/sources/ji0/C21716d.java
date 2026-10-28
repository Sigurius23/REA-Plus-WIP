package ji0;

import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: ji0.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0012B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, m65681d2 = {"Lji0/d;", "", "", "id", "", "responseJson", "", "lastUpdated", "<init>", "(ILjava/lang/String;J)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "J", "()J", "d", "app-configuration_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C21716d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String responseJson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long lastUpdated;

    public C21716d(int i13, String responseJson, long j7) {
        AbstractC22676k.m65750j(responseJson, "responseJson");
        this.id = i13;
        this.responseJson = responseJson;
        this.lastUpdated = j7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getResponseJson() {
        return this.responseJson;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C21716d)) {
            return false;
        }
        C21716d c21716d = (C21716d) other;
        return this.id == c21716d.id && AbstractC22676k.m65745e(this.responseJson, c21716d.responseJson) && this.lastUpdated == c21716d.lastUpdated;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdated) + AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.responseJson);
    }

    public String toString() {
        return AbstractC11266d.m30457k(this.lastUpdated, ")", AbstractC18489d0.m53373n(this.id, "AppConfigurationCacheEntity(id=", ", responseJson=", this.responseJson, ", lastUpdated="));
    }

    public /* synthetic */ C21716d(int i13, String str, long j7, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, str, j7);
    }
}
