package c12;

import java.util.UUID;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: c12.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lc12/a;", "", "<init>", "()V", "", "persistenceId", "b", "(I)I", "recoveryId", "c", "", "activityId", "a", "(Ljava/lang/String;)I", "notifications_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3850a {

    /* JADX INFO: renamed from: a */
    public static final C3850a f15766a = new C3850a();

    private C3850a() {
    }

    /* JADX INFO: renamed from: b */
    public static final int m11797b(int persistenceId) {
        return Integer.MAX_VALUE - persistenceId;
    }

    /* JADX INFO: renamed from: a */
    public final int m11798a(String activityId) {
        AbstractC22676k.m65750j(activityId, "activityId");
        return UUID.fromString(activityId).hashCode();
    }

    /* JADX INFO: renamed from: c */
    public final int m11799c(int recoveryId) {
        return recoveryId;
    }
}
