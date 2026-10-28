package ep0;

import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachEntryData;
import com.whoop.coacheverywherecommon.models.CoachSurfaceType;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: ep0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "Lep0/f;", "a", "(Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/f;", "coach-everywhere-common_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13397c {

    /* JADX INFO: renamed from: ep0.c$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46923a;

        static {
            int[] iArr = new int[CoachSurfaceType.values().length];
            try {
                iArr[CoachSurfaceType.COACH_BAR_PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoachSurfaceType.COACH_BAR_POP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f46923a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC13400f m37824a(CoachEntry coachEntry) {
        CoachEntryData data;
        CoachSurfaceType type = coachEntry != null ? coachEntry.getType() : null;
        int i13 = type == null ? -1 : a.f46923a[type.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return EnumC13400f.PREVIEW;
        }
        if (coachEntry == null || (data = coachEntry.getData()) == null) {
            return null;
        }
        return data.getOnLoadStyle();
    }
}
