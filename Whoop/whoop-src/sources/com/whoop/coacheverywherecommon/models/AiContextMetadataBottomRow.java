package com.whoop.coacheverywherecommon.models;

import a13.C0148f;
import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B9\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b\u0006\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "", "", "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "bottomNavOverrides", "", "isWceEnabled", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "onboardingEducation", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "<init>", "(Ljava/util/List;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_common_release", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "component4", "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "copy", "(Ljava/util/List;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBottomNavOverrides", "Z", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "getOnboardingEducation", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "getCoachEntry", "Companion", "$serializer", "a", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiContextMetadataBottomRow {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<BottomNavOverride> bottomNavOverrides;
    private final CoachEntry coachEntry;
    private final boolean isWceEnabled;
    private final CoachEducationType onboardingEducation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.AiContextMetadataBottomRow$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiContextMetadataBottomRow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C0148f(29)), null, AbstractC30060g.m92087G(enumC23463i, new C13395a(0)), null};
    }

    public AiContextMetadataBottomRow() {
        this((List) null, false, (CoachEducationType) null, (CoachEntry) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BottomNavOverride$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CoachEducationType.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiContextMetadataBottomRow copy$default(AiContextMetadataBottomRow aiContextMetadataBottomRow, List list, boolean z4, CoachEducationType coachEducationType, CoachEntry coachEntry, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = aiContextMetadataBottomRow.bottomNavOverrides;
        }
        if ((i13 & 2) != 0) {
            z4 = aiContextMetadataBottomRow.isWceEnabled;
        }
        if ((i13 & 4) != 0) {
            coachEducationType = aiContextMetadataBottomRow.onboardingEducation;
        }
        if ((i13 & 8) != 0) {
            coachEntry = aiContextMetadataBottomRow.coachEntry;
        }
        return aiContextMetadataBottomRow.copy(list, z4, coachEducationType, coachEntry);
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_common_release(AiContextMetadataBottomRow self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.bottomNavOverrides, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.bottomNavOverrides);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isWceEnabled) {
            output.encodeBooleanElement(serialDesc, 1, self.isWceEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.onboardingEducation != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.onboardingEducation);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.coachEntry == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, CoachEntry$$serializer.INSTANCE, self.coachEntry);
    }

    public final List<BottomNavOverride> component1() {
        return this.bottomNavOverrides;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsWceEnabled() {
        return this.isWceEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoachEducationType getOnboardingEducation() {
        return this.onboardingEducation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final AiContextMetadataBottomRow copy(List<BottomNavOverride> bottomNavOverrides, boolean isWceEnabled, CoachEducationType onboardingEducation, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(bottomNavOverrides, "bottomNavOverrides");
        return new AiContextMetadataBottomRow(bottomNavOverrides, isWceEnabled, onboardingEducation, coachEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiContextMetadataBottomRow)) {
            return false;
        }
        AiContextMetadataBottomRow aiContextMetadataBottomRow = (AiContextMetadataBottomRow) other;
        return AbstractC22676k.m65745e(this.bottomNavOverrides, aiContextMetadataBottomRow.bottomNavOverrides) && this.isWceEnabled == aiContextMetadataBottomRow.isWceEnabled && this.onboardingEducation == aiContextMetadataBottomRow.onboardingEducation && AbstractC22676k.m65745e(this.coachEntry, aiContextMetadataBottomRow.coachEntry);
    }

    public final List<BottomNavOverride> getBottomNavOverrides() {
        return this.bottomNavOverrides;
    }

    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final CoachEducationType getOnboardingEducation() {
        return this.onboardingEducation;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.bottomNavOverrides.hashCode() * 31, 31, this.isWceEnabled);
        CoachEducationType coachEducationType = this.onboardingEducation;
        int iHashCode = (iM8289b + (coachEducationType == null ? 0 : coachEducationType.hashCode())) * 31;
        CoachEntry coachEntry = this.coachEntry;
        return iHashCode + (coachEntry != null ? coachEntry.hashCode() : 0);
    }

    public final boolean isWceEnabled() {
        return this.isWceEnabled;
    }

    public String toString() {
        return "AiContextMetadataBottomRow(bottomNavOverrides=" + this.bottomNavOverrides + ", isWceEnabled=" + this.isWceEnabled + ", onboardingEducation=" + this.onboardingEducation + ", coachEntry=" + this.coachEntry + ")";
    }

    public /* synthetic */ AiContextMetadataBottomRow(int i13, List list, boolean z4, CoachEducationType coachEducationType, CoachEntry coachEntry, SerializationConstructorMarker serializationConstructorMarker) {
        this.bottomNavOverrides = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.isWceEnabled = false;
        } else {
            this.isWceEnabled = z4;
        }
        if ((i13 & 4) == 0) {
            this.onboardingEducation = null;
        } else {
            this.onboardingEducation = coachEducationType;
        }
        if ((i13 & 8) == 0) {
            this.coachEntry = null;
        } else {
            this.coachEntry = coachEntry;
        }
    }

    public AiContextMetadataBottomRow(List<BottomNavOverride> bottomNavOverrides, boolean z4, CoachEducationType coachEducationType, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(bottomNavOverrides, "bottomNavOverrides");
        this.bottomNavOverrides = bottomNavOverrides;
        this.isWceEnabled = z4;
        this.onboardingEducation = coachEducationType;
        this.coachEntry = coachEntry;
    }

    public /* synthetic */ AiContextMetadataBottomRow(List list, boolean z4, CoachEducationType coachEducationType, CoachEntry coachEntry, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? null : coachEducationType, (i13 & 8) != 0 ? null : coachEntry);
    }
}
