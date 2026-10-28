package fy1;

import com.whoop.metrics.common.ScreenState;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fy1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lfy1/e;", "", "<init>", "()V", "", "appearTimeNanos", "", "hasEmitted", "Lcom/whoop/metrics/common/ScreenState;", "currentState", "nowNanos", "a", "(JZLcom/whoop/metrics/common/ScreenState;J)Ljava/lang/Long;", "metrics-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14869e {

    /* JADX INFO: renamed from: a */
    public static final C14869e f55499a = new C14869e();

    /* JADX INFO: renamed from: fy1.e$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55500a;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.CACHE_HIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenState.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScreenState.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScreenState.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScreenState.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f55500a = iArr;
        }
    }

    private C14869e() {
    }

    /* JADX INFO: renamed from: a */
    public final Long m42894a(long appearTimeNanos, boolean hasEmitted, ScreenState currentState, long nowNanos) {
        AbstractC22676k.m65750j(currentState, "currentState");
        if (hasEmitted) {
            return null;
        }
        switch (a.f55500a[currentState.ordinal()]) {
            case 1:
            case 2:
                return Long.valueOf(nowNanos - appearTimeNanos);
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
