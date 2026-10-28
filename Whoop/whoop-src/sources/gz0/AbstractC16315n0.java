package gz0;

import live.hms.video.utils.HMSConstantsKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gz0.n0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u0004*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"", "", "a", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lgz0/m0;", HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY, "e", "(Ljava/lang/String;Lgz0/m0;)I", "b", "(Ljava/lang/String;)Lgz0/m0;", "c", "(Ljava/lang/String;Lgz0/m0;)Lgz0/m0;", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16315n0 {
    /* JADX INFO: renamed from: a */
    public static final Integer m46376a(String str) {
        EnumC16313m0 enumC16313m0M46377b = m46377b(str);
        if (enumC16313m0M46377b != null) {
            return Integer.valueOf(enumC16313m0M46377b.toWhoopIcon());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final EnumC16313m0 m46377b(String str) {
        if (str != null) {
            for (EnumC16313m0 enumC16313m0 : EnumC16313m0.values()) {
                if (AbstractC22676k.m65745e(enumC16313m0.name(), str)) {
                    return enumC16313m0;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final EnumC16313m0 m46378c(String str, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(enumC16313m0, "default");
        EnumC16313m0 enumC16313m0M46377b = m46377b(str);
        return enumC16313m0M46377b == null ? enumC16313m0 : enumC16313m0M46377b;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ EnumC16313m0 m46379d(String str, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        }
        return m46378c(str, enumC16313m0);
    }

    /* JADX INFO: renamed from: e */
    public static final int m46380e(String str, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(enumC16313m0, "default");
        Integer numM46376a = m46376a(str);
        return numM46376a != null ? numM46376a.intValue() : enumC16313m0.toWhoopIcon();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m46381f(String str, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = EnumC16313m0.WHOOP_LOGO_CIRCLE;
        }
        return m46380e(str, enumC16313m0);
    }
}
