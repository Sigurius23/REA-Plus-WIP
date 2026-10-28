package lu2;

import ad3.AbstractC0757c;
import com.whoop.weightlifting.data.domain.WorkoutTemplate;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import rr2.InterfaceC31766c;

/* JADX INFO: renamed from: lu2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Llu2/e;", "", "Llu2/d;", "jsonFormat", "Lrr2/c;", "crashReporter", "<init>", "(Llu2/d;Lrr2/c;)V", "", "serializedWorkout", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "a", "(Ljava/lang/String;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "serializedWorkoutTemplate", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "b", "(Ljava/lang/String;)Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "workout", "c", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;)Ljava/lang/String;", "workoutTemplate", "d", "(Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;)Ljava/lang/String;", "Llu2/d;", "Lrr2/c;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24755e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C24754d jsonFormat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    public C24755e(C24754d jsonFormat, InterfaceC31766c crashReporter) {
        AbstractC22676k.m65750j(jsonFormat, "jsonFormat");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        this.jsonFormat = jsonFormat;
        this.crashReporter = crashReporter;
    }

    /* JADX INFO: renamed from: a */
    public final WeightliftingWorkoutDto m72487a(String serializedWorkout) {
        AbstractC22676k.m65750j(serializedWorkout, "serializedWorkout");
        try {
            AbstractC0757c json = this.jsonFormat.getJson();
            json.getClass();
            return (WeightliftingWorkoutDto) json.m1831b(WeightliftingWorkoutDto.INSTANCE.serializer(), serializedWorkout);
        } catch (IllegalArgumentException e5) {
            this.crashReporter.mo98631p(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final WorkoutTemplate m72488b(String serializedWorkoutTemplate) {
        AbstractC22676k.m65750j(serializedWorkoutTemplate, "serializedWorkoutTemplate");
        try {
            AbstractC0757c json = this.jsonFormat.getJson();
            json.getClass();
            return (WorkoutTemplate) json.m1831b(WorkoutTemplate.INSTANCE.serializer(), serializedWorkoutTemplate);
        } catch (IllegalArgumentException e5) {
            this.crashReporter.mo98631p(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m72489c(WeightliftingWorkoutDto workout) {
        AbstractC22676k.m65750j(workout, "workout");
        try {
            AbstractC0757c json = this.jsonFormat.getJson();
            json.getClass();
            return json.m1833d(WeightliftingWorkoutDto.INSTANCE.serializer(), workout);
        } catch (IllegalArgumentException e5) {
            this.crashReporter.mo98631p(e5);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m72490d(WorkoutTemplate workoutTemplate) {
        AbstractC22676k.m65750j(workoutTemplate, "workoutTemplate");
        try {
            AbstractC0757c json = this.jsonFormat.getJson();
            json.getClass();
            return json.m1833d(WorkoutTemplate.INSTANCE.serializer(), workoutTemplate);
        } catch (IllegalArgumentException e5) {
            this.crashReporter.mo98631p(e5);
            return null;
        }
    }
}
