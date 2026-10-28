package af1;

import ef1.InterfaceC13145a;
import i11.C17863f;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import o51.C27540f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: af1.a */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m65681d2 = {"Laf1/a;", "", "<init>", "()V", "", "segmentLabel", "", "segmentIndex", "c", "(Ljava/lang/String;I)Ljava/lang/String;", "graphSegmentIndex", "Lo51/f;", "segmentController", "scrubValue", "exerciseName", "exerciseType", "Lef1/a$a$c;", "b", "(ILo51/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$c;", "selectedIndex", "newIndex", "Lef1/a$a$a;", "d", "(Lo51/f;Ljava/lang/Integer;ILjava/lang/String;)Lef1/a$a$a;", "Li11/f;", "dateSelectorState", "pressedDateRaw", "primaryMetricValue", "Lef1/a$a$b;", "a", "(Li11/f;Lo51/f;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lef1/a$a$b;", "exercise-progress-mini-arch_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0807a {

    /* JADX INFO: renamed from: a */
    public static final C0807a f2971a = new C0807a();

    private C0807a() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC13145a.a.b m1959a(C17863f dateSelectorState, C27540f segmentController, Integer selectedIndex, Object pressedDateRaw, String primaryMetricValue, String exerciseName) {
        List<String> listM83096a;
        AbstractC22676k.m65750j(dateSelectorState, "dateSelectorState");
        AbstractC22676k.m65750j(primaryMetricValue, "primaryMetricValue");
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        String str = null;
        String str2 = pressedDateRaw instanceof String ? (String) pressedDateRaw : null;
        if (str2 == null) {
            return null;
        }
        if (segmentController != null && (listM83096a = segmentController.m83096a()) != null) {
            str = (String) AbstractC25265s.m74102I0(selectedIndex != null ? selectedIndex.intValue() : 0, listM83096a);
        }
        String strM1961c = m1961c(str, selectedIndex != null ? selectedIndex.intValue() : 0);
        C23465k c23465kM1968b = AbstractC0809c.m1968b(dateSelectorState, str2);
        return new InterfaceC13145a.a.b(primaryMetricValue, (String) c23465kM1968b.f92937w, (String) c23465kM1968b.f92938x, exerciseName, strM1961c, str2, dateSelectorState.getBackDate(), dateSelectorState.getForwardDate());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC13145a.a.c m1960b(int graphSegmentIndex, C27540f segmentController, String scrubValue, String exerciseName, String exerciseType) {
        List<String> listM83096a;
        AbstractC22676k.m65750j(scrubValue, "scrubValue");
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        AbstractC22676k.m65750j(exerciseType, "exerciseType");
        return new InterfaceC13145a.a.c(scrubValue, m1961c((segmentController == null || (listM83096a = segmentController.m83096a()) == null) ? null : (String) AbstractC25265s.m74102I0(graphSegmentIndex, listM83096a), graphSegmentIndex), exerciseName, exerciseType);
    }

    /* JADX INFO: renamed from: c */
    public final String m1961c(String segmentLabel, int segmentIndex) {
        if (segmentLabel == null) {
            segmentLabel = "";
        }
        if (segmentLabel.equalsIgnoreCase("Month")) {
            return "Month";
        }
        if (segmentLabel.equalsIgnoreCase("6 Months") || segmentLabel.equalsIgnoreCase("6 Month")) {
            return "6 Month";
        }
        if (segmentIndex == 0) {
            return "Month";
        }
        if (segmentIndex == 1) {
            return "6 Month";
        }
        return AbstractC39414r.m125890i0(segmentLabel) ? "Month" : segmentLabel;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13145a.a.C41523a m1962d(C27540f segmentController, Integer selectedIndex, int newIndex, String exerciseName) {
        AbstractC22676k.m65750j(segmentController, "segmentController");
        AbstractC22676k.m65750j(exerciseName, "exerciseName");
        if (newIndex == (selectedIndex != null ? selectedIndex.intValue() : segmentController.getInitialIndex())) {
            return null;
        }
        return new InterfaceC13145a.a.C41523a(m1961c((String) AbstractC25265s.m74102I0(newIndex, segmentController.m83096a()), newIndex), exerciseName);
    }
}
