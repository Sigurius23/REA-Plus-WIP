package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0019¨\u00060"}, m65681d2 = {"Lcom/whoop/navigation/ExerciseDetailsScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "exerciseId", "", "showCTA", "entryPoint", "entryPointType", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/ExerciseDetailsScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/whoop/navigation/ExerciseDetailsScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExerciseId", "Z", "getShowCTA", "getEntryPoint", "getEntryPointType", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExerciseDetailsScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String entryPoint;
    private final String entryPointType;
    private final String exerciseId;
    private final boolean showCTA;

    /* JADX INFO: renamed from: com.whoop.navigation.ExerciseDetailsScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ExerciseDetailsScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ExerciseDetailsScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExerciseDetailsScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ExerciseDetailsScreenModel() {
        this((String) null, false, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ExerciseDetailsScreenModel copy$default(ExerciseDetailsScreenModel exerciseDetailsScreenModel, String str, boolean z4, String str2, String str3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exerciseDetailsScreenModel.exerciseId;
        }
        if ((i13 & 2) != 0) {
            z4 = exerciseDetailsScreenModel.showCTA;
        }
        if ((i13 & 4) != 0) {
            str2 = exerciseDetailsScreenModel.entryPoint;
        }
        if ((i13 & 8) != 0) {
            str3 = exerciseDetailsScreenModel.entryPointType;
        }
        return exerciseDetailsScreenModel.copy(str, z4, str2, str3);
    }

    public static final /* synthetic */ void write$Self$navigation_release(ExerciseDetailsScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.exerciseId, "")) {
            output.encodeStringElement(serialDesc, 0, self.exerciseId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.showCTA) {
            output.encodeBooleanElement(serialDesc, 1, self.showCTA);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.entryPoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.entryPoint);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.entryPointType, "EXTERNAL")) {
            return;
        }
        output.encodeStringElement(serialDesc, 3, self.entryPointType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExerciseId() {
        return this.exerciseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowCTA() {
        return this.showCTA;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntryPointType() {
        return this.entryPointType;
    }

    public final ExerciseDetailsScreenModel copy(String exerciseId, boolean showCTA, String entryPoint, String entryPointType) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(entryPointType, "entryPointType");
        return new ExerciseDetailsScreenModel(exerciseId, showCTA, entryPoint, entryPointType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseDetailsScreenModel)) {
            return false;
        }
        ExerciseDetailsScreenModel exerciseDetailsScreenModel = (ExerciseDetailsScreenModel) other;
        return AbstractC22676k.m65745e(this.exerciseId, exerciseDetailsScreenModel.exerciseId) && this.showCTA == exerciseDetailsScreenModel.showCTA && AbstractC22676k.m65745e(this.entryPoint, exerciseDetailsScreenModel.entryPoint) && AbstractC22676k.m65745e(this.entryPointType, exerciseDetailsScreenModel.entryPointType);
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getEntryPointType() {
        return this.entryPointType;
    }

    public final String getExerciseId() {
        return this.exerciseId;
    }

    public final boolean getShowCTA() {
        return this.showCTA;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.exerciseId.hashCode() * 31, 31, this.showCTA);
        String str = this.entryPoint;
        return this.entryPointType.hashCode() + ((iM8289b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.exerciseId;
        boolean z4 = this.showCTA;
        return AbstractC11266d.m30464r(AbstractC25012a.m73379l("ExerciseDetailsScreenModel(exerciseId=", str, ", showCTA=", ", entryPoint=", z4), this.entryPoint, ", entryPointType=", this.entryPointType, ")");
    }

    public /* synthetic */ ExerciseDetailsScreenModel(int i13, String str, boolean z4, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.exerciseId = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.showCTA = false;
        } else {
            this.showCTA = z4;
        }
        if ((i13 & 4) == 0) {
            this.entryPoint = null;
        } else {
            this.entryPoint = str2;
        }
        if ((i13 & 8) == 0) {
            this.entryPointType = "EXTERNAL";
        } else {
            this.entryPointType = str3;
        }
    }

    public ExerciseDetailsScreenModel(String exerciseId, boolean z4, String str, String entryPointType) {
        AbstractC22676k.m65750j(exerciseId, "exerciseId");
        AbstractC22676k.m65750j(entryPointType, "entryPointType");
        this.exerciseId = exerciseId;
        this.showCTA = z4;
        this.entryPoint = str;
        this.entryPointType = entryPointType;
    }

    public /* synthetic */ ExerciseDetailsScreenModel(String str, boolean z4, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? "EXTERNAL" : str3);
    }
}
