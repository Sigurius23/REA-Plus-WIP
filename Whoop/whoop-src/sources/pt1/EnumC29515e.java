package pt1;

import ge3.AbstractC15751g;
import java.util.ArrayList;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: pt1.e */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lpt1/e;", "", "", "rawValue", "<init>", "(Ljava/lang/String;IS)V", "S", "getRawValue", "()S", "", "getAnalyticsLabel", "()Ljava/lang/String;", "analyticsLabel", "Companion", "a", "LOW_AMPLITUDE", "SIGNIFICANT_NOISE", "UNSTABLE_SIGNAL", "NOT_ENOUGH_DATA", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC29515e {
    LOW_AMPLITUDE(1),
    SIGNIFICANT_NOISE(2),
    UNSTABLE_SIGNAL(4),
    NOT_ENOUGH_DATA(8);

    private final short rawValue;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: pt1.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lpt1/e$a;", "", "<init>", "()V", "", "rawValue", "", "Lpt1/e;", "a", "(S)Ljava/util/List;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List<EnumC29515e> m90193a(short rawValue) {
            EnumC29515e[] enumC29515eArrValues = EnumC29515e.values();
            ArrayList arrayList = new ArrayList();
            for (EnumC29515e enumC29515e : enumC29515eArrValues) {
                if ((enumC29515e.getRawValue() & rawValue) != 0) {
                    arrayList.add(enumC29515e);
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: pt1.e$b */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120151a;

        static {
            int[] iArr = new int[EnumC29515e.values().length];
            try {
                iArr[EnumC29515e.LOW_AMPLITUDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29515e.SIGNIFICANT_NOISE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC29515e.UNSTABLE_SIGNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC29515e.NOT_ENOUGH_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f120151a = iArr;
        }
    }

    EnumC29515e(short s13) {
        this.rawValue = s13;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsLabel() {
        int i13 = b.f120151a[ordinal()];
        if (i13 == 1) {
            return "low_amplitude";
        }
        if (i13 == 2) {
            return "significant_noise";
        }
        if (i13 == 3) {
            return "unstable_signal";
        }
        if (i13 == 4) {
            return "not_enough_data";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final short getRawValue() {
        return this.rawValue;
    }
}
