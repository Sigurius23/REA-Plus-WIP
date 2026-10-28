package gl1;

import c41.EnumC4142w3;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gl1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m65681d2 = {"Lc41/w3;", "", "a", "(Lc41/w3;)Ljava/lang/String;", "healthMonitorAnalyticName", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC15969d {

    /* JADX INFO: renamed from: gl1.d$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60457a;

        static {
            int[] iArr = new int[EnumC4142w3.values().length];
            try {
                iArr[EnumC4142w3.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4142w3.CALIBRATING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4142w3.NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4142w3.OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC4142w3.PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC4142w3.WARNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC4142w3.DATA_HIDDEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC4142w3.HIGH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC4142w3.LOW.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC4142w3.MEDIUM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f60457a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final String m45106a(EnumC4142w3 enumC4142w3) {
        AbstractC22676k.m65750j(enumC4142w3, "<this>");
        switch (a.f60457a[enumC4142w3.ordinal()]) {
            case 1:
                return "red";
            case 2:
                return "calibrating";
            case 3:
                return "no data";
            case 4:
                return "green";
            case 5:
                return "pending";
            case 6:
                return "yellow";
            case 7:
            case 8:
            case 9:
            case 10:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
