package cv2;

import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wr2.InterfaceC37576d;
import yb3.C39412p;

/* JADX INFO: renamed from: cv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\u0018\u0010\"R \u0010%\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b$\u0010\"¨\u0006&"}, m65681d2 = {"Lcv2/b;", "Lwr2/d;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "exercise", "", "isSelected", "<init>", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)V", "d", "(Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;Z)Lcv2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "g", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "b", "Z", "i", "()Z", "c", "Ljava/lang/String;", "e", "userFacingText", "", "Ljava/util/List;", "()Ljava/util/List;", "userFacingKeywords", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "metadataKeywords", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C11149b implements InterfaceC37576d {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final WeightliftingExercise exercise;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isSelected;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String userFacingText;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<String> userFacingKeywords;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final List<String> metadataKeywords;

    public C11149b(WeightliftingExercise exercise, boolean z4) {
        AbstractC22676k.m65750j(exercise, "exercise");
        this.exercise = exercise;
        this.isSelected = z4;
        this.userFacingText = exercise.getName();
        this.userFacingKeywords = exercise.getNameKeywords();
        this.metadataKeywords = exercise.getMetadataKeywords();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ C11149b m30152f(C11149b c11149b, WeightliftingExercise weightliftingExercise, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            weightliftingExercise = c11149b.exercise;
        }
        if ((i13 & 2) != 0) {
            z4 = c11149b.isSelected;
        }
        return c11149b.m30156d(weightliftingExercise, z4);
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: a */
    public /* bridge */ C39412p getSearchQueryDelimiter() {
        return super.getSearchQueryDelimiter();
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: b */
    public List<String> mo30154b() {
        return this.userFacingKeywords;
    }

    /* JADX INFO: renamed from: d */
    public final C11149b m30156d(WeightliftingExercise exercise, boolean isSelected) {
        AbstractC22676k.m65750j(exercise, "exercise");
        return new C11149b(exercise, isSelected);
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getUserFacingText() {
        return this.userFacingText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C11149b)) {
            return false;
        }
        C11149b c11149b = (C11149b) other;
        return AbstractC22676k.m65745e(this.exercise, c11149b.exercise) && this.isSelected == c11149b.isSelected;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final WeightliftingExercise getExercise() {
        return this.exercise;
    }

    @Override // wr2.InterfaceC37576d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<String> mo30155c() {
        return this.metadataKeywords;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + (this.exercise.hashCode() * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "ExerciseListItem(exercise=" + this.exercise + ", isSelected=" + this.isSelected + ")";
    }
}
