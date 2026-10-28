package com.whoop.navigation;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u0005\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "testId", "", "isAiConfirmation", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTestId", "Z", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AdvancedLabsEditBiomarkersScreenModel implements CommonNavigationScreenModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isAiConfirmation;
    private final String testId;

    /* JADX INFO: renamed from: com.whoop.navigation.AdvancedLabsEditBiomarkersScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AdvancedLabsEditBiomarkersScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AdvancedLabsEditBiomarkersScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AdvancedLabsEditBiomarkersScreenModel(int i13, String str, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AdvancedLabsEditBiomarkersScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.testId = str;
        if ((i13 & 2) == 0) {
            this.isAiConfirmation = false;
        } else {
            this.isAiConfirmation = z4;
        }
    }

    public static /* synthetic */ AdvancedLabsEditBiomarkersScreenModel copy$default(AdvancedLabsEditBiomarkersScreenModel advancedLabsEditBiomarkersScreenModel, String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = advancedLabsEditBiomarkersScreenModel.testId;
        }
        if ((i13 & 2) != 0) {
            z4 = advancedLabsEditBiomarkersScreenModel.isAiConfirmation;
        }
        return advancedLabsEditBiomarkersScreenModel.copy(str, z4);
    }

    public static final /* synthetic */ void write$Self$navigation_release(AdvancedLabsEditBiomarkersScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.testId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isAiConfirmation) {
            output.encodeBooleanElement(serialDesc, 1, self.isAiConfirmation);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTestId() {
        return this.testId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAiConfirmation() {
        return this.isAiConfirmation;
    }

    public final AdvancedLabsEditBiomarkersScreenModel copy(String testId, boolean isAiConfirmation) {
        AbstractC22676k.m65750j(testId, "testId");
        return new AdvancedLabsEditBiomarkersScreenModel(testId, isAiConfirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvancedLabsEditBiomarkersScreenModel)) {
            return false;
        }
        AdvancedLabsEditBiomarkersScreenModel advancedLabsEditBiomarkersScreenModel = (AdvancedLabsEditBiomarkersScreenModel) other;
        return AbstractC22676k.m65745e(this.testId, advancedLabsEditBiomarkersScreenModel.testId) && this.isAiConfirmation == advancedLabsEditBiomarkersScreenModel.isAiConfirmation;
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAiConfirmation) + (this.testId.hashCode() * 31);
    }

    public final boolean isAiConfirmation() {
        return this.isAiConfirmation;
    }

    public String toString() {
        return AbstractC26725a.m79503g("AdvancedLabsEditBiomarkersScreenModel(testId=", this.testId, ", isAiConfirmation=", ")", this.isAiConfirmation);
    }

    public AdvancedLabsEditBiomarkersScreenModel(String testId, boolean z4) {
        AbstractC22676k.m65750j(testId, "testId");
        this.testId = testId;
        this.isAiConfirmation = z4;
    }

    public /* synthetic */ AdvancedLabsEditBiomarkersScreenModel(String str, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? false : z4);
    }
}
