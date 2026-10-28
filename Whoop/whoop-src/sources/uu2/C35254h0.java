package uu2;

import androidx.core.app.NotificationCompat;
import gu2.C16214a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: uu2.h0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b)\u00100R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b\u001e\u00100R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b\"\u00100R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b1\u00100R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010/\u001a\u0004\b2\u00100R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b,\u00100R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b.\u00106¨\u00067"}, m65681d2 = {"Luu2/h0;", "Lm91/u;", "", NotificationCompat.CATEGORY_EVENT, "", "exerciseId", "equipmentBodyRaw", "name", "Lkd1/o;", "image", "videoUrl", "Lgu2/a;", "instructionText", "equipmentLabel", "equipmentValue", "muscleGroupsLabel", "muscleGroupsValue", "linkedExerciseLabel", "linkedExerciseValue", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lgu2/a;Lm91/u;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "getEvent", "()Ljava/lang/Object;", "b", "Ljava/lang/String;", "getExerciseId", "c", "getEquipmentBodyRaw", "d", "j", "e", "Lkd1/o;", "()Lkd1/o;", "f", "k", "g", "Lgu2/a;", "()Lgu2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "l", "m", "Lm91/u;", "()Lm91/u;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C35254h0 implements InterfaceC25312u {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Object event;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final String exerciseId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String equipmentBodyRaw;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC22403o image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String videoUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C16214a instructionText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C16214a equipmentLabel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C16214a equipmentValue;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C16214a muscleGroupsLabel;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C16214a muscleGroupsValue;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final C16214a linkedExerciseLabel;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final InterfaceC25312u linkedExerciseValue;

    public C35254h0(Object event, String exerciseId, String str, String str2, AbstractC22403o abstractC22403o, String str3, C16214a instructionText, C16214a equipmentLabel, C16214a equipmentValue, C16214a muscleGroupsLabel, C16214a muscleGroupsValue, C16214a c16214a, InterfaceC25312u interfaceC25312u) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(instructionText, "instructionText");
        AbstractC22676k.m65750j(equipmentLabel, "equipmentLabel");
        AbstractC22676k.m65750j(equipmentValue, "equipmentValue");
        AbstractC22676k.m65750j(muscleGroupsLabel, "muscleGroupsLabel");
        AbstractC22676k.m65750j(muscleGroupsValue, "muscleGroupsValue");
        this.event = event;
        this.exerciseId = exerciseId;
        this.equipmentBodyRaw = str;
        this.name = str2;
        this.image = abstractC22403o;
        this.videoUrl = str3;
        this.instructionText = instructionText;
        this.equipmentLabel = equipmentLabel;
        this.equipmentValue = equipmentValue;
        this.muscleGroupsLabel = muscleGroupsLabel;
        this.muscleGroupsValue = muscleGroupsValue;
        this.linkedExerciseLabel = c16214a;
        this.linkedExerciseValue = interfaceC25312u;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final C16214a getEquipmentLabel() {
        return this.equipmentLabel;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final C16214a getEquipmentValue() {
        return this.equipmentValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22403o getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final C16214a getInstructionText() {
        return this.instructionText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C35254h0)) {
            return false;
        }
        C35254h0 c35254h0 = (C35254h0) other;
        return AbstractC22676k.m65745e(this.event, c35254h0.event) && AbstractC22676k.m65745e(this.exerciseId, c35254h0.exerciseId) && AbstractC22676k.m65745e(this.equipmentBodyRaw, c35254h0.equipmentBodyRaw) && AbstractC22676k.m65745e(this.name, c35254h0.name) && AbstractC22676k.m65745e(this.image, c35254h0.image) && AbstractC22676k.m65745e(this.videoUrl, c35254h0.videoUrl) && AbstractC22676k.m65745e(this.instructionText, c35254h0.instructionText) && AbstractC22676k.m65745e(this.equipmentLabel, c35254h0.equipmentLabel) && AbstractC22676k.m65745e(this.equipmentValue, c35254h0.equipmentValue) && AbstractC22676k.m65745e(this.muscleGroupsLabel, c35254h0.muscleGroupsLabel) && AbstractC22676k.m65745e(this.muscleGroupsValue, c35254h0.muscleGroupsValue) && AbstractC22676k.m65745e(this.linkedExerciseLabel, c35254h0.linkedExerciseLabel) && AbstractC22676k.m65745e(this.linkedExerciseValue, c35254h0.linkedExerciseValue);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C16214a getLinkedExerciseLabel() {
        return this.linkedExerciseLabel;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final InterfaceC25312u getLinkedExerciseValue() {
        return this.linkedExerciseValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final C16214a getMuscleGroupsLabel() {
        return this.muscleGroupsLabel;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.event.hashCode() * 31, 31, this.exerciseId);
        String str = this.equipmentBodyRaw;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AbstractC22403o abstractC22403o = this.image;
        int iHashCode3 = (iHashCode2 + (abstractC22403o == null ? 0 : abstractC22403o.hashCode())) * 31;
        String str3 = this.videoUrl;
        int iHashCode4 = (this.muscleGroupsValue.hashCode() + ((this.muscleGroupsLabel.hashCode() + ((this.equipmentValue.hashCode() + ((this.equipmentLabel.hashCode() + ((this.instructionText.hashCode() + ((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        C16214a c16214a = this.linkedExerciseLabel;
        int iHashCode5 = (iHashCode4 + (c16214a == null ? 0 : c16214a.hashCode())) * 31;
        InterfaceC25312u interfaceC25312u = this.linkedExerciseValue;
        return iHashCode5 + (interfaceC25312u != null ? interfaceC25312u.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C16214a getMuscleGroupsValue() {
        return this.muscleGroupsValue;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public String toString() {
        Object obj = this.event;
        String str = this.exerciseId;
        String str2 = this.equipmentBodyRaw;
        String str3 = this.name;
        AbstractC22403o abstractC22403o = this.image;
        String str4 = this.videoUrl;
        C16214a c16214a = this.instructionText;
        C16214a c16214a2 = this.equipmentLabel;
        C16214a c16214a3 = this.equipmentValue;
        C16214a c16214a4 = this.muscleGroupsLabel;
        C16214a c16214a5 = this.muscleGroupsValue;
        C16214a c16214a6 = this.linkedExerciseLabel;
        InterfaceC25312u interfaceC25312u = this.linkedExerciseValue;
        StringBuilder sb4 = new StringBuilder("ExerciseInstructionsViewState(event=");
        sb4.append(obj);
        sb4.append(", exerciseId=");
        sb4.append(str);
        sb4.append(", equipmentBodyRaw=");
        AbstractC11266d.m30444B(sb4, str2, ", name=", str3, ", image=");
        sb4.append(abstractC22403o);
        sb4.append(", videoUrl=");
        sb4.append(str4);
        sb4.append(", instructionText=");
        sb4.append(c16214a);
        sb4.append(", equipmentLabel=");
        sb4.append(c16214a2);
        sb4.append(", equipmentValue=");
        sb4.append(c16214a3);
        sb4.append(", muscleGroupsLabel=");
        sb4.append(c16214a4);
        sb4.append(", muscleGroupsValue=");
        sb4.append(c16214a5);
        sb4.append(", linkedExerciseLabel=");
        sb4.append(c16214a6);
        sb4.append(", linkedExerciseValue=");
        sb4.append(interfaceC25312u);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ C35254h0(Object obj, String str, String str2, String str3, AbstractC22403o abstractC22403o, String str4, C16214a c16214a, C16214a c16214a2, C16214a c16214a3, C16214a c16214a4, C16214a c16214a5, C16214a c16214a6, InterfaceC25312u interfaceC25312u, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C23454a0.f92919a : obj, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : abstractC22403o, (i13 & 32) != 0 ? null : str4, c16214a, c16214a2, c16214a3, c16214a4, c16214a5, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c16214a6, (i13 & 4096) != 0 ? null : interfaceC25312u);
    }
}
