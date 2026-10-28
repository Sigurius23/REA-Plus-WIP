package uu2;

import com.whoop.design.models.anchorSelector.AnchorSectionModel;
import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsModel;
import cu2.EnumC11122b;
import fi0.InterfaceC14515a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: uu2.n */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0002*\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001a\u001a\u00020\u0017*\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, m65681d2 = {"Lcu2/b;", "entryPointType", "", "analyticsEntryPoint", "e", "(Lcu2/b;Ljava/lang/String;)Ljava/lang/String;", "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;", "d", "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Lcom/whoop/weightlifting/feature/builder/details/ExerciseInstructionsModel;", "c", "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;)Ljava/lang/String;", "openSource", "requestedExerciseId", "Luu2/m;", "a", "(Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;Ljava/lang/String;Ljava/lang/String;)Luu2/m;", "context", "", "", "b", "(Luu2/m;)Ljava/util/Map;", "Lfi0/a;", "Ll83/a0;", "f", "(Lfi0/a;Luu2/m;)V", "g", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC35263n {
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX INFO: renamed from: a */
    public static final C35262m m111823a(ExerciseDetailsModel exerciseDetailsModel, String openSource, String requestedExerciseId) {
        String str;
        String volumeInputFormat;
        String exerciseId;
        AbstractC22676k.m65750j(exerciseDetailsModel, "<this>");
        AbstractC22676k.m65750j(openSource, "openSource");
        AbstractC22676k.m65750j(requestedExerciseId, "requestedExerciseId");
        ExerciseInstructionsModel exerciseInstructionsModelM111826d = m111826d(exerciseDetailsModel);
        if (exerciseInstructionsModelM111826d == null || (exerciseId = exerciseInstructionsModelM111826d.getExerciseId()) == null) {
            str = requestedExerciseId;
        } else {
            if (AbstractC39414r.m125890i0(exerciseId)) {
                exerciseId = null;
            }
            if (exerciseId == null) {
                str = requestedExerciseId;
            } else {
                str = exerciseId;
            }
        }
        if (exerciseInstructionsModelM111826d == null || (volumeInputFormat = exerciseInstructionsModelM111826d.getVolumeInputFormat()) == null || AbstractC39414r.m125890i0(volumeInputFormat)) {
            volumeInputFormat = null;
        }
        if (volumeInputFormat == null) {
            volumeInputFormat = "";
        }
        String strM111825c = m111825c(exerciseDetailsModel);
        if (AbstractC39414r.m125890i0(openSource)) {
            openSource = "Workout Builder";
        }
        String str2 = openSource;
        String str3 = volumeInputFormat.length() == 0 ? "" : volumeInputFormat;
        String equipmentBody = exerciseInstructionsModelM111826d != null ? exerciseInstructionsModelM111826d.getEquipmentBody() : null;
        return new C35262m(str, strM111825c, str2, str3, equipmentBody == null ? "" : equipmentBody, exerciseDetailsModel.getEmptyStateCard() != null);
    }

    /* JADX INFO: renamed from: b */
    public static final Map<String, Object> m111824b(C35262m context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC25247g0.m73990Y(new C23465k("exercise_name", context.getExerciseName()), new C23465k("source", context.getSource()), new C23465k("exercise_type", context.getExerciseType()), new C23465k("equipment", context.getEquipment()), new C23465k("empty_data", Boolean.valueOf(context.getEmptyData())));
    }

    /* JADX INFO: renamed from: c */
    public static final String m111825c(ExerciseDetailsModel exerciseDetailsModel) {
        AbstractC22676k.m65750j(exerciseDetailsModel, "<this>");
        String subtitle = exerciseDetailsModel.getHeader().getSubtitle();
        String string = subtitle != null ? AbstractC39414r.m125869O0(subtitle).toString() : null;
        if (string == null) {
            string = "";
        }
        String string2 = AbstractC39414r.m125869O0(exerciseDetailsModel.getHeader().getTitle()).toString();
        if (string.length() > 0) {
            return string;
        }
        return string2.length() > 0 ? string2 : "";
    }

    /* JADX INFO: renamed from: d */
    public static final ExerciseInstructionsModel m111826d(ExerciseDetailsModel exerciseDetailsModel) {
        AbstractC22676k.m65750j(exerciseDetailsModel, "<this>");
        List<AnchorSectionModel> items = exerciseDetailsModel.getContent().getItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            AbstractC25265s.m74141p0(arrayList, ((AnchorSectionModel) it.next()).getItems());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ExerciseInstructionsModel) {
                arrayList2.add(obj);
            }
        }
        return (ExerciseInstructionsModel) AbstractC25265s.m74100H0(arrayList2);
    }

    /* JADX INFO: renamed from: e */
    public static final String m111827e(EnumC11122b entryPointType, String str) {
        AbstractC22676k.m65750j(entryPointType, "entryPointType");
        if (str == null || AbstractC39414r.m125890i0(str)) {
            return entryPointType == EnumC11122b.INTERNAL ? "Workout Builder" : "external";
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static final void m111828f(InterfaceC14515a interfaceC14515a, C35262m context) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(context, "context");
        interfaceC14515a.mo41428k("Exercise Details", "Open", context.getExerciseId(), "Workout Builder", m111824b(context));
    }

    /* JADX INFO: renamed from: g */
    public static final void m111829g(InterfaceC14515a interfaceC14515a, C35262m context) {
        AbstractC22676k.m65750j(interfaceC14515a, "<this>");
        AbstractC22676k.m65750j(context, "context");
        interfaceC14515a.mo41428k("Exercise Details", "Open WCE", "", "Workout Builder", AbstractC25247g0.m73996e0(m111824b(context), new C23465k("source", "exercise_details")));
    }
}
