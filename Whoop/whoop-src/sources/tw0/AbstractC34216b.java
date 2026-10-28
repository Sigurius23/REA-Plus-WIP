package tw0;

import com.whoop.design.util.TextResource;
import hy0.C17730c1;
import hy0.C17750h1;
import hy0.EnumC17775o1;
import java.util.List;
import jb1.AbstractC21537c;
import jb1.C21535a;
import n83.C26460c;
import p490t0.AbstractC33253j;
import p715kotlin.Metadata;
import p745y81.EnumC39333f;
import pw0.AbstractC29584a;
import sw0.C33053j;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: tw0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\n\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\r\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000f¨\u0006\u0011"}, m65681d2 = {"Lsw0/j;", "Lhy0/h1;", "inlineTag", "", "c", "(Lsw0/j;Lhy0/h1;)Ljava/util/List;", "a", "Lhy0/h1;", "getCustomBehaviorTag", "()Lhy0/h1;", "customBehaviorTag", "b", "getWeeklyPlanTag", "weeklyPlanTag", "Ljb1/a;", "Ljb1/a;", "cardReducer", "custombottomsheet_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34216b {

    /* JADX INFO: renamed from: a */
    private static final C17750h1 f143524a;

    /* JADX INFO: renamed from: b */
    private static final C17750h1 f143525b;

    /* JADX INFO: renamed from: c */
    private static final C21535a f143526c = AbstractC21537c.m60555e(null, 1, null);

    static {
        float f13 = 2 * 4;
        float f14 = 8;
        float f15 = ((float) 0.5d) * f14;
        float f16 = 1 * f14;
        f143524a = new C17750h1(new TextResource.C8688b(AbstractC29584a.f120742b, null, 2, null), null, EnumC39333f.TRANSPARENT, null, EnumC39333f.WHITE_70, null, null, EnumC17775o1.BADGE_SMALL_SECONDARY_NEUTRAL, false, AbstractC33253j.m105489e(f13), f15, f16, 0.0f, null, 0.0f, null, null, null, new C17730c1(EnumC39333f.WHITE_20, (float) 1.5d, null), null, null, null, 3928426, null);
        f143525b = new C17750h1(new TextResource.C8688b(AbstractC29584a.f120746f, null, 2, null), null, EnumC39333f.NEUTRAL_15, null, EnumC39333f.RECOVERY, null, null, EnumC17775o1.BADGE_SMALL_ACCENT, false, AbstractC33253j.m105489e(f13), f15, f16, 0.0f, null, 0.0f, null, null, null, null, null, null, null, 4190570, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final List<C17750h1> m108150c(C33053j c33053j, C17750h1 c17750h1) {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        if (c33053j.getIsCustom()) {
            c26460cM119000x.add(f143524a);
        }
        if (c33053j.getWeeklyPlanGoal() && c17750h1 == null) {
            c26460cM119000x.add(f143525b);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }
}
