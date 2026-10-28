package fv2;

import com.whoop.weightlifting.data.domain.FilterItem;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fv2.b */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Lfv2/b;", "", "<init>", "()V", "f", "a", "d", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "g", "e", "j", "b", "Lfv2/b$a;", "Lfv2/b$b;", "Lfv2/b$c;", "Lfv2/b$d;", "Lfv2/b$e;", "Lfv2/b$f;", "Lfv2/b$g;", "Lfv2/b$h;", "Lfv2/b$i;", "Lfv2/b$j;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14817b {

    /* JADX INFO: renamed from: fv2.b$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfv2/b$a;", "Lfv2/b;", "", "linkedExerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String linkedExerciseId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String linkedExerciseId) {
            super(null);
            AbstractC22676k.m65750j(linkedExerciseId, "linkedExerciseId");
            this.linkedExerciseId = linkedExerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getLinkedExerciseId() {
            return this.linkedExerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && AbstractC22676k.m65745e(this.linkedExerciseId, ((a) other).linkedExerciseId);
        }

        public int hashCode() {
            return this.linkedExerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ApplyLinkedExerciseSelection(linkedExerciseId=", this.linkedExerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: fv2.b$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfv2/b$b;", "Lfv2/b;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC14817b {

        /* JADX INFO: renamed from: a */
        public static final b f55016a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fv2.b$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfv2/b$c;", "Lfv2/b;", "", "newDescription", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String newDescription) {
            super(null);
            AbstractC22676k.m65750j(newDescription, "newDescription");
            this.newDescription = newDescription;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewDescription() {
            return this.newDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && AbstractC22676k.m65745e(this.newDescription, ((c) other).newDescription);
        }

        public int hashCode() {
            return this.newDescription.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ExerciseDescriptionUpdated(newDescription=", this.newDescription, ")");
        }
    }

    /* JADX INFO: renamed from: fv2.b$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfv2/b$d;", "Lfv2/b;", "", "newName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String newName) {
            super(null);
            AbstractC22676k.m65750j(newName, "newName");
            this.newName = newName;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getNewName() {
            return this.newName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && AbstractC22676k.m65745e(this.newName, ((d) other).newName);
        }

        public int hashCode() {
            return this.newName.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("ExerciseNameUpdated(newName=", this.newName, ")");
        }
    }

    /* JADX INFO: renamed from: fv2.b$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfv2/b$e;", "Lfv2/b;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC14817b {

        /* JADX INFO: renamed from: a */
        public static final e f55019a = new e();

        private e() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fv2.b$f */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lfv2/b$f;", "Lfv2/b;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class f extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        public f(String str) {
            super(null);
            this.exerciseId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof f) && AbstractC22676k.m65745e(this.exerciseId, ((f) other).exerciseId);
        }

        public int hashCode() {
            String str = this.exerciseId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("Refresh(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: fv2.b$g */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfv2/b$g;", "Lfv2/b;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC14817b {

        /* JADX INFO: renamed from: a */
        public static final g f55021a = new g();

        private g() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: fv2.b$h */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfv2/b$h;", "Lfv2/b;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "equipment", "<init>", "(Lcom/whoop/weightlifting/data/domain/FilterItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "()Lcom/whoop/weightlifting/data/domain/FilterItem;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class h extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FilterItem equipment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(FilterItem equipment) {
            super(null);
            AbstractC22676k.m65750j(equipment, "equipment");
            this.equipment = equipment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FilterItem getEquipment() {
            return this.equipment;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof h) && AbstractC22676k.m65745e(this.equipment, ((h) other).equipment);
        }

        public int hashCode() {
            return this.equipment.hashCode();
        }

        public String toString() {
            return "SelectEquipment(equipment=" + this.equipment + ")";
        }
    }

    /* JADX INFO: renamed from: fv2.b$i */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lfv2/b$i;", "Lfv2/b;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "muscleGroup", "<init>", "(Lcom/whoop/weightlifting/data/domain/FilterItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "()Lcom/whoop/weightlifting/data/domain/FilterItem;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i extends AbstractC14817b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FilterItem muscleGroup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(FilterItem muscleGroup) {
            super(null);
            AbstractC22676k.m65750j(muscleGroup, "muscleGroup");
            this.muscleGroup = muscleGroup;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FilterItem getMuscleGroup() {
            return this.muscleGroup;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.muscleGroup, ((i) other).muscleGroup);
        }

        public int hashCode() {
            return this.muscleGroup.hashCode();
        }

        public String toString() {
            return "SelectMuscleGroup(muscleGroup=" + this.muscleGroup + ")";
        }
    }

    /* JADX INFO: renamed from: fv2.b$j */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lfv2/b$j;", "Lfv2/b;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC14817b {

        /* JADX INFO: renamed from: a */
        public static final j f55024a = new j();

        private j() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC14817b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14817b() {
    }
}
