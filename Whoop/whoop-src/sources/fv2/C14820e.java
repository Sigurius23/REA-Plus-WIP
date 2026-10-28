package fv2;

import com.whoop.weightlifting.data.domain.FilterItem;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import jh3.AbstractC21702c;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: fv2.e */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0010Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJx\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b\"\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010\u0013R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b'\u0010*¨\u0006+"}, m65681d2 = {"Lfv2/e;", "", "", "updatedName", "updatedDescription", "", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "cachedEquipments", "cachedMuscleGroups", "selectedEquipment", "selectedMuscleGroup", "customExerciseId", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "linkedExercise", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/FilterItem;Lcom/whoop/weightlifting/data/domain/FilterItem;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/whoop/weightlifting/data/domain/FilterItem;Lcom/whoop/weightlifting/data/domain/FilterItem;Ljava/lang/String;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)Lfv2/e;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "i", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "e", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "g", "()Lcom/whoop/weightlifting/data/domain/FilterItem;", "f", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C14820e {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final int f55072j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String updatedName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String updatedDescription;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final List<FilterItem> cachedEquipments;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<FilterItem> cachedMuscleGroups;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FilterItem selectedEquipment;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FilterItem selectedMuscleGroup;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String customExerciseId;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final WeightliftingExercise linkedExercise;

    /* JADX INFO: renamed from: fv2.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lfv2/e$a;", "", "<init>", "()V", "", "Lcom/whoop/weightlifting/data/domain/FilterItem;", "cachedEquipments", "cachedMuscleGroups", "Lfv2/e;", "a", "(Ljava/util/List;Ljava/util/List;)Lfv2/e;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C14820e m42618a(List<FilterItem> cachedEquipments, List<FilterItem> cachedMuscleGroups) {
            AbstractC22676k.m65750j(cachedEquipments, "cachedEquipments");
            AbstractC22676k.m65750j(cachedMuscleGroups, "cachedMuscleGroups");
            return new C14820e(null, null, cachedEquipments, cachedMuscleGroups, null, null, null, null);
        }

        private Companion() {
        }
    }

    public C14820e(String str, String str2, List<FilterItem> cachedEquipments, List<FilterItem> cachedMuscleGroups, FilterItem filterItem, FilterItem filterItem2, String str3, WeightliftingExercise weightliftingExercise) {
        AbstractC22676k.m65750j(cachedEquipments, "cachedEquipments");
        AbstractC22676k.m65750j(cachedMuscleGroups, "cachedMuscleGroups");
        this.updatedName = str;
        this.updatedDescription = str2;
        this.cachedEquipments = cachedEquipments;
        this.cachedMuscleGroups = cachedMuscleGroups;
        this.selectedEquipment = filterItem;
        this.selectedMuscleGroup = filterItem2;
        this.customExerciseId = str3;
        this.linkedExercise = weightliftingExercise;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C14820e m42608b(C14820e c14820e, String str, String str2, List list, List list2, FilterItem filterItem, FilterItem filterItem2, String str3, WeightliftingExercise weightliftingExercise, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = c14820e.updatedName;
        }
        if ((i13 & 2) != 0) {
            str2 = c14820e.updatedDescription;
        }
        if ((i13 & 4) != 0) {
            list = c14820e.cachedEquipments;
        }
        if ((i13 & 8) != 0) {
            list2 = c14820e.cachedMuscleGroups;
        }
        if ((i13 & 16) != 0) {
            filterItem = c14820e.selectedEquipment;
        }
        if ((i13 & 32) != 0) {
            filterItem2 = c14820e.selectedMuscleGroup;
        }
        if ((i13 & 64) != 0) {
            str3 = c14820e.customExerciseId;
        }
        if ((i13 & 128) != 0) {
            weightliftingExercise = c14820e.linkedExercise;
        }
        String str4 = str3;
        WeightliftingExercise weightliftingExercise2 = weightliftingExercise;
        FilterItem filterItem3 = filterItem;
        FilterItem filterItem4 = filterItem2;
        return c14820e.m42609a(str, str2, list, list2, filterItem3, filterItem4, str4, weightliftingExercise2);
    }

    /* JADX INFO: renamed from: a */
    public final C14820e m42609a(String updatedName, String updatedDescription, List<FilterItem> cachedEquipments, List<FilterItem> cachedMuscleGroups, FilterItem selectedEquipment, FilterItem selectedMuscleGroup, String customExerciseId, WeightliftingExercise linkedExercise) {
        AbstractC22676k.m65750j(cachedEquipments, "cachedEquipments");
        AbstractC22676k.m65750j(cachedMuscleGroups, "cachedMuscleGroups");
        return new C14820e(updatedName, updatedDescription, cachedEquipments, cachedMuscleGroups, selectedEquipment, selectedMuscleGroup, customExerciseId, linkedExercise);
    }

    /* JADX INFO: renamed from: c */
    public final List<FilterItem> m42610c() {
        return this.cachedEquipments;
    }

    /* JADX INFO: renamed from: d */
    public final List<FilterItem> m42611d() {
        return this.cachedMuscleGroups;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCustomExerciseId() {
        return this.customExerciseId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14820e)) {
            return false;
        }
        C14820e c14820e = (C14820e) other;
        return AbstractC22676k.m65745e(this.updatedName, c14820e.updatedName) && AbstractC22676k.m65745e(this.updatedDescription, c14820e.updatedDescription) && AbstractC22676k.m65745e(this.cachedEquipments, c14820e.cachedEquipments) && AbstractC22676k.m65745e(this.cachedMuscleGroups, c14820e.cachedMuscleGroups) && AbstractC22676k.m65745e(this.selectedEquipment, c14820e.selectedEquipment) && AbstractC22676k.m65745e(this.selectedMuscleGroup, c14820e.selectedMuscleGroup) && AbstractC22676k.m65745e(this.customExerciseId, c14820e.customExerciseId) && AbstractC22676k.m65745e(this.linkedExercise, c14820e.linkedExercise);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final WeightliftingExercise getLinkedExercise() {
        return this.linkedExercise;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final FilterItem getSelectedEquipment() {
        return this.selectedEquipment;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final FilterItem getSelectedMuscleGroup() {
        return this.selectedMuscleGroup;
    }

    public int hashCode() {
        String str = this.updatedName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.updatedDescription;
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.cachedEquipments), 31, this.cachedMuscleGroups);
        FilterItem filterItem = this.selectedEquipment;
        int iHashCode2 = (iM31983b + (filterItem == null ? 0 : filterItem.hashCode())) * 31;
        FilterItem filterItem2 = this.selectedMuscleGroup;
        int iHashCode3 = (iHashCode2 + (filterItem2 == null ? 0 : filterItem2.hashCode())) * 31;
        String str3 = this.customExerciseId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WeightliftingExercise weightliftingExercise = this.linkedExercise;
        return iHashCode4 + (weightliftingExercise != null ? weightliftingExercise.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getUpdatedDescription() {
        return this.updatedDescription;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getUpdatedName() {
        return this.updatedName;
    }

    public String toString() {
        String str = this.updatedName;
        String str2 = this.updatedDescription;
        List<FilterItem> list = this.cachedEquipments;
        List<FilterItem> list2 = this.cachedMuscleGroups;
        FilterItem filterItem = this.selectedEquipment;
        FilterItem filterItem2 = this.selectedMuscleGroup;
        String str3 = this.customExerciseId;
        WeightliftingExercise weightliftingExercise = this.linkedExercise;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Loaded(updatedName=", str, ", updatedDescription=", str2, ", cachedEquipments=");
        AbstractC21702c.m61148s(sbM32001t, list, ", cachedMuscleGroups=", list2, ", selectedEquipment=");
        sbM32001t.append(filterItem);
        sbM32001t.append(", selectedMuscleGroup=");
        sbM32001t.append(filterItem2);
        sbM32001t.append(", customExerciseId=");
        sbM32001t.append(str3);
        sbM32001t.append(", linkedExercise=");
        sbM32001t.append(weightliftingExercise);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
