package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b(\u0010\u001fJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b4\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b\t\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010%¨\u0006;"}, m65681d2 = {"Lcom/whoop/navigation/StrengthTrainerScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "startingId", "", "linkActivityId", "entryPoint", "openTab", "", "isFromWhoopCoach", "Lcom/whoop/navigation/AiAction;", "aiAction", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/StrengthTrainerScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "component6", "()Lcom/whoop/navigation/AiAction;", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;)Lcom/whoop/navigation/StrengthTrainerScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Long;", "getStartingId", "Ljava/lang/String;", "getLinkActivityId", "getEntryPoint", "getOpenTab", "Z", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StrengthTrainerScreenModel implements CommonNavigationScreenModel {
    private final AiAction aiAction;
    private final String entryPoint;
    private final boolean isFromWhoopCoach;
    private final String linkActivityId;
    private final String openTab;
    private final Long startingId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.StrengthTrainerScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/StrengthTrainerScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/StrengthTrainerScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StrengthTrainerScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public StrengthTrainerScreenModel() {
        this((Long) null, (String) null, (String) null, (String) null, false, (AiAction) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ StrengthTrainerScreenModel copy$default(StrengthTrainerScreenModel strengthTrainerScreenModel, Long l7, String str, String str2, String str3, boolean z4, AiAction aiAction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            l7 = strengthTrainerScreenModel.startingId;
        }
        if ((i13 & 2) != 0) {
            str = strengthTrainerScreenModel.linkActivityId;
        }
        if ((i13 & 4) != 0) {
            str2 = strengthTrainerScreenModel.entryPoint;
        }
        if ((i13 & 8) != 0) {
            str3 = strengthTrainerScreenModel.openTab;
        }
        if ((i13 & 16) != 0) {
            z4 = strengthTrainerScreenModel.isFromWhoopCoach;
        }
        if ((i13 & 32) != 0) {
            aiAction = strengthTrainerScreenModel.aiAction;
        }
        boolean z13 = z4;
        AiAction aiAction2 = aiAction;
        return strengthTrainerScreenModel.copy(l7, str, str2, str3, z13, aiAction2);
    }

    public static final /* synthetic */ void write$Self$navigation_release(StrengthTrainerScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.startingId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, LongSerializer.INSTANCE, self.startingId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.linkActivityId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.linkActivityId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.entryPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.entryPoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.openTab != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.openTab);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isFromWhoopCoach) {
            output.encodeBooleanElement(serialDesc, 4, self.isFromWhoopCoach);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.aiAction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, AiAction$$serializer.INSTANCE, self.aiAction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getStartingId() {
        return this.startingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLinkActivityId() {
        return this.linkActivityId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOpenTab() {
        return this.openTab;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsFromWhoopCoach() {
        return this.isFromWhoopCoach;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final StrengthTrainerScreenModel copy(Long startingId, String linkActivityId, String entryPoint, String openTab, boolean isFromWhoopCoach, AiAction aiAction) {
        return new StrengthTrainerScreenModel(startingId, linkActivityId, entryPoint, openTab, isFromWhoopCoach, aiAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrengthTrainerScreenModel)) {
            return false;
        }
        StrengthTrainerScreenModel strengthTrainerScreenModel = (StrengthTrainerScreenModel) other;
        return AbstractC22676k.m65745e(this.startingId, strengthTrainerScreenModel.startingId) && AbstractC22676k.m65745e(this.linkActivityId, strengthTrainerScreenModel.linkActivityId) && AbstractC22676k.m65745e(this.entryPoint, strengthTrainerScreenModel.entryPoint) && AbstractC22676k.m65745e(this.openTab, strengthTrainerScreenModel.openTab) && this.isFromWhoopCoach == strengthTrainerScreenModel.isFromWhoopCoach && AbstractC22676k.m65745e(this.aiAction, strengthTrainerScreenModel.aiAction);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getLinkActivityId() {
        return this.linkActivityId;
    }

    public final String getOpenTab() {
        return this.openTab;
    }

    public final Long getStartingId() {
        return this.startingId;
    }

    public int hashCode() {
        Long l7 = this.startingId;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.linkActivityId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.entryPoint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.openTab;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isFromWhoopCoach);
        AiAction aiAction = this.aiAction;
        return iM8289b + (aiAction != null ? aiAction.hashCode() : 0);
    }

    public final boolean isFromWhoopCoach() {
        return this.isFromWhoopCoach;
    }

    public String toString() {
        Long l7 = this.startingId;
        String str = this.linkActivityId;
        String str2 = this.entryPoint;
        String str3 = this.openTab;
        boolean z4 = this.isFromWhoopCoach;
        AiAction aiAction = this.aiAction;
        StringBuilder sb4 = new StringBuilder("StrengthTrainerScreenModel(startingId=");
        sb4.append(l7);
        sb4.append(", linkActivityId=");
        sb4.append(str);
        sb4.append(", entryPoint=");
        AbstractC11266d.m30444B(sb4, str2, ", openTab=", str3, ", isFromWhoopCoach=");
        sb4.append(z4);
        sb4.append(", aiAction=");
        sb4.append(aiAction);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ StrengthTrainerScreenModel(int i13, Long l7, String str, String str2, String str3, boolean z4, AiAction aiAction, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.startingId = null;
        } else {
            this.startingId = l7;
        }
        if ((i13 & 2) == 0) {
            this.linkActivityId = null;
        } else {
            this.linkActivityId = str;
        }
        if ((i13 & 4) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = str2;
        }
        if ((i13 & 8) == 0) {
            this.openTab = null;
        } else {
            this.openTab = str3;
        }
        if ((i13 & 16) == 0) {
            this.isFromWhoopCoach = false;
        } else {
            this.isFromWhoopCoach = z4;
        }
        if ((i13 & 32) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
    }

    public StrengthTrainerScreenModel(Long l7, String str, String str2, String str3, boolean z4, AiAction aiAction) {
        this.startingId = l7;
        this.linkActivityId = str;
        this.entryPoint = str2;
        this.openTab = str3;
        this.isFromWhoopCoach = z4;
        this.aiAction = aiAction;
    }

    public /* synthetic */ StrengthTrainerScreenModel(Long l7, String str, String str2, String str3, boolean z4, AiAction aiAction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : l7, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? null : aiAction);
    }
}
