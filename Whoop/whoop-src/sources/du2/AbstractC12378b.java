package du2;

import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import n83.C26463f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: du2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aG\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u00020\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a!\u0010\u0014\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u000f\u001a;\u0010\u0019\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001c\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u001e\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u001e\u0010\r\u001a1\u0010#\u001a\u00020\b*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b#\u0010$\u001a1\u0010%\u001a\u00020\b*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001¢\u0006\u0004\b%\u0010$\u001aK\u0010,\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010/\u001a\u00020\b*\u00020\u00002\u0006\u0010.\u001a\u00020\u0001¢\u0006\u0004\b/\u0010\r¨\u00060"}, m65681d2 = {"Lfi0/a;", "", "action", "category", "label", "", "", "otherProperties", "Ll83/a0;", "m", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "source", "j", "(Lfi0/a;Ljava/lang/String;)V", "e", "(Lfi0/a;)V", "g", "", "templateId", "templateName", "f", "(Lfi0/a;JLjava/lang/String;)V", "d", "linkedActivityId", "activityName", "i", "(Lfi0/a;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "failureReason", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lfi0/a;JLjava/lang/String;Ljava/lang/String;)V", "b", "nameOfTheCustomExercise", "linkedExercise", "equipment", "muscleGroup", "c", "(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "workoutTemplateId", "exerciseId", "", "numCompletedSets", "Ldu2/c;", "onScreen", "k", "(Lfi0/a;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILdu2/c;Ljava/lang/String;)V", "tabName", "o", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC12378b {
    /* JADX INFO: renamed from: a */
    public static final void m34731a(InterfaceC14515a interfaceC14515a, String nameOfTheCustomExercise, String linkedExercise, String equipment, String muscleGroup) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(nameOfTheCustomExercise, "nameOfTheCustomExercise");
        AbstractC22676k.m65750j(linkedExercise, "linkedExercise");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroup, "muscleGroup");
        interfaceC14515a.mo41428k("Custom Exercise", "Delete", nameOfTheCustomExercise, "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("linked_exercise", linkedExercise), new C23465k("equipment", equipment), new C23465k("muscle_group", muscleGroup)));
    }

    /* JADX INFO: renamed from: b */
    public static final void m34732b(InterfaceC14515a interfaceC14515a, String label) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(label, "label");
        interfaceC14515a.mo41424f("Custom Exercise", "Open", label, "Workout Builder");
    }

    /* JADX INFO: renamed from: c */
    public static final void m34733c(InterfaceC14515a interfaceC14515a, String nameOfTheCustomExercise, String linkedExercise, String equipment, String muscleGroup) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(nameOfTheCustomExercise, "nameOfTheCustomExercise");
        AbstractC22676k.m65750j(linkedExercise, "linkedExercise");
        AbstractC22676k.m65750j(equipment, "equipment");
        AbstractC22676k.m65750j(muscleGroup, "muscleGroup");
        interfaceC14515a.mo41428k("Custom Exercise", "Save", nameOfTheCustomExercise, "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("linked_exercise", linkedExercise), new C23465k("equipment", equipment), new C23465k("muscle_group", muscleGroup)));
    }

    /* JADX INFO: renamed from: d */
    public static final void m34734d(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "AI Workout Selected", null, "Link Workout", null, null, 53, null);
    }

    /* JADX INFO: renamed from: e */
    public static final void m34735e(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "Exit", null, "Link Workout", null, null, 53, null);
    }

    /* JADX INFO: renamed from: f */
    public static final void m34736f(InterfaceC14515a interfaceC14515a, long j7, String templateName) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(templateName, "templateName");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "My Workout Selected", null, "Link Workout", null, AbstractC25247g0.m73990Y(new C23465k("workoutId", Long.valueOf(j7)), new C23465k("workoutName", templateName)), 21, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m34737g(InterfaceC14515a interfaceC14515a) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "New Workout Selected", null, "Link Workout", null, null, 53, null);
    }

    /* JADX INFO: renamed from: h */
    public static final void m34738h(InterfaceC14515a interfaceC14515a, long j7, String linkedActivityId, String failureReason) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(linkedActivityId, "linkedActivityId");
        AbstractC22676k.m65750j(failureReason, "failureReason");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "Error", null, "Link Workout", null, AbstractC25247g0.m73990Y(new C23465k("workoutId", Long.valueOf(j7)), new C23465k("activityId", linkedActivityId), new C23465k("failureReason", failureReason)), 21, null);
    }

    /* JADX INFO: renamed from: i */
    public static final void m34739i(InterfaceC14515a interfaceC14515a, long j7, String templateName, String linkedActivityId, String activityName, String str) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(linkedActivityId, "linkedActivityId");
        AbstractC22676k.m65750j(activityName, "activityName");
        C26463f c26463f = new C26463f();
        c26463f.putAll(AbstractC25247g0.m73990Y(new C23465k("workoutId", Long.valueOf(j7)), new C23465k("workoutName", templateName), new C23465k("activityId", linkedActivityId), new C23465k("activity_type", activityName)));
        if (str != null && str.length() != 0) {
            c26463f.put("source", str);
        }
        InterfaceC14515a.m41418i(interfaceC14515a, null, "Process Workout", null, "Link Workout", null, c26463f.m78380b(), 21, null);
    }

    /* JADX INFO: renamed from: j */
    public static final void m34740j(InterfaceC14515a interfaceC14515a, String source) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(source, "source");
        InterfaceC14515a.m41418i(interfaceC14515a, null, "View", null, "Link Workout", null, AbstractC31061c.m95645u("source", source), 21, null);
    }

    /* JADX INFO: renamed from: k */
    public static final void m34741k(InterfaceC14515a interfaceC14515a, String action, Long l7, String str, int i13, EnumC12379c onScreen, String str2) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(onScreen, "onScreen");
        if (str == null) {
            str = "";
        }
        interfaceC14515a.mo41428k(str, action, str2, "Workout Builder", AbstractC25247g0.m73990Y(new C23465k("workoutId", l7), new C23465k("setNumber", Integer.valueOf(i13)), new C23465k("on_screen", onScreen.getPropertyValue())));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m34742l(InterfaceC14515a interfaceC14515a, String str, Long l7, String str2, int i13, EnumC12379c enumC12379c, String str3, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            str2 = "";
        }
        if ((i14 & 32) != 0) {
            str3 = "";
        }
        m34741k(interfaceC14515a, str, l7, str2, i13, enumC12379c, str3);
    }

    /* JADX INFO: renamed from: m */
    public static final void m34743m(InterfaceC14515a interfaceC14515a, String action, String str, String label, Map<String, ? extends Object> map) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(action, "action");
        AbstractC22676k.m65750j(label, "label");
        interfaceC14515a.mo41428k(str, action, label, "Workout Builder", map);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m34744n(InterfaceC14515a interfaceC14515a, String str, String str2, String str3, Map map, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = "";
        }
        if ((i13 & 8) != 0) {
            map = null;
        }
        m34743m(interfaceC14515a, str, str2, str3, map);
    }

    /* JADX INFO: renamed from: o */
    public static final void m34745o(InterfaceC14515a interfaceC14515a, String tabName) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(tabName, "tabName");
        InterfaceC14515a.m41418i(interfaceC14515a, tabName, "Open", null, "Workout Builder", null, null, 52, null);
    }
}
