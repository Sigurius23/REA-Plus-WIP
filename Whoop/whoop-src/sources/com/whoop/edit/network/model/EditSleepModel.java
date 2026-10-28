package com.whoop.edit.network.model;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJH\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/edit/network/model/EditSleepModel;", "", "", "startTime", "endTime", "", "garmentId", "", "resolveOverlaps", "gdcFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$add_activity_release", "(Lcom/whoop/edit/network/model/EditSleepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/Boolean;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/edit/network/model/EditSleepModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStartTime", "getEndTime", "Ljava/lang/Integer;", "getGarmentId", "Ljava/lang/Boolean;", "getResolveOverlaps", "getGdcFlow", "Companion", "$serializer", "a", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditSleepModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String endTime;
    private final Integer garmentId;
    private final Boolean gdcFlow;
    private final Boolean resolveOverlaps;
    private final String startTime;

    /* JADX INFO: renamed from: com.whoop.edit.network.model.EditSleepModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/edit/network/model/EditSleepModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/edit/network/model/EditSleepModel;", "serializer", "()Lwc3/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditSleepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditSleepModel(int i13, String str, String str2, Integer num, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, EditSleepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.startTime = str;
        this.endTime = str2;
        this.garmentId = num;
        this.resolveOverlaps = bool;
        this.gdcFlow = bool2;
    }

    public static /* synthetic */ EditSleepModel copy$default(EditSleepModel editSleepModel, String str, String str2, Integer num, Boolean bool, Boolean bool2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = editSleepModel.startTime;
        }
        if ((i13 & 2) != 0) {
            str2 = editSleepModel.endTime;
        }
        if ((i13 & 4) != 0) {
            num = editSleepModel.garmentId;
        }
        if ((i13 & 8) != 0) {
            bool = editSleepModel.resolveOverlaps;
        }
        if ((i13 & 16) != 0) {
            bool2 = editSleepModel.gdcFlow;
        }
        Boolean bool3 = bool2;
        Integer num2 = num;
        return editSleepModel.copy(str, str2, num2, bool, bool3);
    }

    public static final /* synthetic */ void write$Self$add_activity_release(EditSleepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.startTime);
        output.encodeStringElement(serialDesc, 1, self.endTime);
        output.encodeNullableSerializableElement(serialDesc, 2, IntSerializer.INSTANCE, self.garmentId);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, booleanSerializer, self.resolveOverlaps);
        output.encodeNullableSerializableElement(serialDesc, 4, booleanSerializer, self.gdcFlow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getGarmentId() {
        return this.garmentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getResolveOverlaps() {
        return this.resolveOverlaps;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getGdcFlow() {
        return this.gdcFlow;
    }

    public final EditSleepModel copy(String startTime, String endTime, Integer garmentId, Boolean resolveOverlaps, Boolean gdcFlow) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        return new EditSleepModel(startTime, endTime, garmentId, resolveOverlaps, gdcFlow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditSleepModel)) {
            return false;
        }
        EditSleepModel editSleepModel = (EditSleepModel) other;
        return AbstractC22676k.m65745e(this.startTime, editSleepModel.startTime) && AbstractC22676k.m65745e(this.endTime, editSleepModel.endTime) && AbstractC22676k.m65745e(this.garmentId, editSleepModel.garmentId) && AbstractC22676k.m65745e(this.resolveOverlaps, editSleepModel.resolveOverlaps) && AbstractC22676k.m65745e(this.gdcFlow, editSleepModel.gdcFlow);
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final Integer getGarmentId() {
        return this.garmentId;
    }

    public final Boolean getGdcFlow() {
        return this.gdcFlow;
    }

    public final Boolean getResolveOverlaps() {
        return this.resolveOverlaps;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.startTime.hashCode() * 31, 31, this.endTime);
        Integer num = this.garmentId;
        int iHashCode = (iM30450d + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.resolveOverlaps;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.gdcFlow;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        String str = this.startTime;
        String str2 = this.endTime;
        Integer num = this.garmentId;
        Boolean bool = this.resolveOverlaps;
        Boolean bool2 = this.gdcFlow;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditSleepModel(startTime=", str, ", endTime=", str2, ", garmentId=");
        sbM32001t.append(num);
        sbM32001t.append(", resolveOverlaps=");
        sbM32001t.append(bool);
        sbM32001t.append(", gdcFlow=");
        return AbstractC11478a.m30858j(sbM32001t, bool2, ")");
    }

    public EditSleepModel(String startTime, String endTime, Integer num, Boolean bool, Boolean bool2) {
        AbstractC22676k.m65750j(startTime, "startTime");
        AbstractC22676k.m65750j(endTime, "endTime");
        this.startTime = startTime;
        this.endTime = endTime;
        this.garmentId = num;
        this.resolveOverlaps = bool;
        this.gdcFlow = bool2;
    }
}
