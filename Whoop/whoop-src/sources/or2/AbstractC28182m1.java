package or2;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: or2.m1 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"", "sourcePillar", "a", "(Ljava/lang/String;)Ljava/lang/String;", "analytics_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC28182m1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0039 A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static final String m85299a(String sourcePillar) {
        AbstractC22676k.m65750j(sourcePillar, "sourcePillar");
        switch (sourcePillar) {
            case "Recovery Pillar":
                return "VoW_Recovery";
            case "Sleep Pillar":
                return "VoW_Sleep";
            case "Overview Pillar":
                return "VoW_Overview";
            case "Strain Pillar":
                return "VoW_Strain";
            default:
                return sourcePillar;
        }
    }
}
