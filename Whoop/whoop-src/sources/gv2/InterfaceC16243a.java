package gv2;

import com.whoop.weightlifting.data.domain.FilterItem;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: gv2.a */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lgv2/a;", "", "q", "l", "a", "d", "c", "p", "n", "o", "m", "k", "b", "g", "e", "f", "j", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lgv2/a$g;", "Lgv2/a$q;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC16243a {

    /* JADX INFO: renamed from: gv2.a$a */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$a;", "Lgv2/a$q;", "", "linkedExerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String linkedExerciseId;

        public a(String linkedExerciseId) {
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

    /* JADX INFO: renamed from: gv2.a$b */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$b;", "Lgv2/a$q;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements q {

        /* JADX INFO: renamed from: a */
        public static final b f61704a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$c */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$c;", "Lgv2/a$q;", "", "newDescription", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class c implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newDescription;

        public c(String newDescription) {
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

    /* JADX INFO: renamed from: gv2.a$d */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$d;", "Lgv2/a$q;", "", "newName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class d implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String newName;

        public d(String newName) {
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

    /* JADX INFO: renamed from: gv2.a$e */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$e;", "Lgv2/a$g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements g {

        /* JADX INFO: renamed from: a */
        public static final e f61707a = new e();

        private e() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$f */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$f;", "Lgv2/a$g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements g {

        /* JADX INFO: renamed from: a */
        public static final f f61708a = new f();

        private f() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$g */
    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lgv2/a$g;", "Lgv2/a;", "Lgv2/a$e;", "Lgv2/a$f;", "Lgv2/a$h;", "Lgv2/a$i;", "Lgv2/a$j;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface g extends InterfaceC16243a {
    }

    /* JADX INFO: renamed from: gv2.a$h */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$h;", "Lgv2/a$g;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements g {

        /* JADX INFO: renamed from: a */
        public static final h f61709a = new h();

        private h() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$i */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$i;", "Lgv2/a$g;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class i implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        public i(String exerciseId) {
            AbstractC22676k.m65750j(exerciseId, "exerciseId");
            this.exerciseId = exerciseId;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getExerciseId() {
            return this.exerciseId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof i) && AbstractC22676k.m65745e(this.exerciseId, ((i) other).exerciseId);
        }

        public int hashCode() {
            return this.exerciseId.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PopBackAfterEditCustomExercise(exerciseId=", this.exerciseId, ")");
        }
    }

    /* JADX INFO: renamed from: gv2.a$j */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$j;", "Lgv2/a$g;", "", "customExerciseIdToSelect", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class j implements g {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String customExerciseIdToSelect;

        public j(String customExerciseIdToSelect) {
            AbstractC22676k.m65750j(customExerciseIdToSelect, "customExerciseIdToSelect");
            this.customExerciseIdToSelect = customExerciseIdToSelect;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCustomExerciseIdToSelect() {
            return this.customExerciseIdToSelect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof j) && AbstractC22676k.m65745e(this.customExerciseIdToSelect, ((j) other).customExerciseIdToSelect);
        }

        public int hashCode() {
            return this.customExerciseIdToSelect.hashCode();
        }

        public String toString() {
            return AbstractC11895b.m31996o("PopBackWithSelection(customExerciseIdToSelect=", this.customExerciseIdToSelect, ")");
        }
    }

    /* JADX INFO: renamed from: gv2.a$k */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$k;", "Lgv2/a$q;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements q {

        /* JADX INFO: renamed from: a */
        public static final k f61712a = new k();

        private k() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$l */
    @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lgv2/a$l;", "Lgv2/a$q;", "", "exerciseId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class l implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String exerciseId;

        public l(String str) {
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
            return (other instanceof l) && AbstractC22676k.m65745e(this.exerciseId, ((l) other).exerciseId);
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

    /* JADX INFO: renamed from: gv2.a$m */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$m;", "Lgv2/a$q;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m implements q {

        /* JADX INFO: renamed from: a */
        public static final m f61714a = new m();

        private m() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$n */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgv2/a$n;", "Lgv2/a$q;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "equipment", "<init>", "(Lcom/whoop/weightlifting/data/domain/FilterItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "()Lcom/whoop/weightlifting/data/domain/FilterItem;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class n implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FilterItem equipment;

        public n(FilterItem equipment) {
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
            return (other instanceof n) && AbstractC22676k.m65745e(this.equipment, ((n) other).equipment);
        }

        public int hashCode() {
            return this.equipment.hashCode();
        }

        public String toString() {
            return "SelectEquipment(equipment=" + this.equipment + ")";
        }
    }

    /* JADX INFO: renamed from: gv2.a$o */
    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lgv2/a$o;", "Lgv2/a$q;", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "muscleGroup", "<init>", "(Lcom/whoop/weightlifting/data/domain/FilterItem;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "()Lcom/whoop/weightlifting/data/domain/FilterItem;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class o implements q {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final FilterItem muscleGroup;

        public o(FilterItem muscleGroup) {
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
            return (other instanceof o) && AbstractC22676k.m65745e(this.muscleGroup, ((o) other).muscleGroup);
        }

        public int hashCode() {
            return this.muscleGroup.hashCode();
        }

        public String toString() {
            return "SelectMuscleGroup(muscleGroup=" + this.muscleGroup + ")";
        }
    }

    /* JADX INFO: renamed from: gv2.a$p */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lgv2/a$p;", "Lgv2/a$q;", "<init>", "()V", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class p implements q {

        /* JADX INFO: renamed from: a */
        public static final p f61717a = new p();

        private p() {
        }
    }

    /* JADX INFO: renamed from: gv2.a$q */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lgv2/a$q;", "Lgv2/a;", "Lgv2/a$a;", "Lgv2/a$b;", "Lgv2/a$c;", "Lgv2/a$d;", "Lgv2/a$k;", "Lgv2/a$l;", "Lgv2/a$m;", "Lgv2/a$n;", "Lgv2/a$o;", "Lgv2/a$p;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface q extends InterfaceC16243a {
    }
}
