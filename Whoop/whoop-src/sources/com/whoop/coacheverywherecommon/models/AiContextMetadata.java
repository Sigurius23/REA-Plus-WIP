package com.whoop.coacheverywherecommon.models;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ej1.C13228a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IJBW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b6\u00107\u001a\u0004\b\u0003\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00108\u0012\u0004\b9\u00107\u001a\u0004\b\u0004\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010:\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010=\u0012\u0004\b?\u00107\u001a\u0004\b>\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bB\u00107\u001a\u0004\bA\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010C\u0012\u0004\bE\u00107\u001a\u0004\bD\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010#¨\u0006K"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "", "", "isWceEnabled", "isWcePrefetch", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "onboardingEducation", "", "screenIdentifier", "Lcom/whoop/navigation/AiAction;", "aiAction", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "<init>", "(ZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/whoop/navigation/e;", "component4", "()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/navigation/AiAction;", "component7", "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "copy", "(ZLjava/lang/Boolean;Lcom/whoop/navigation/e;Lcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_common_release", "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;Lzc3/c;Lyc3/g;)V", "write$Self", "Z", "isWceEnabled$annotations", "()V", "Ljava/lang/Boolean;", "isWcePrefetch$annotations", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "Lcom/whoop/coacheverywherecommon/models/CoachEducationType;", "getOnboardingEducation", "getOnboardingEducation$annotations", "Ljava/lang/String;", "getScreenIdentifier", "getScreenIdentifier$annotations", "Lcom/whoop/navigation/AiAction;", "getAiAction", "getAiAction$annotations", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "getCoachEntry", "Companion", "$serializer", "a", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiContextMetadata {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("ai_action")
    private final AiAction aiAction;
    private final CoachEntry coachEntry;

    @SerializedName("destination")
    private final C9598e destination;

    @SerializedName("is_wce_enabled")
    private final boolean isWceEnabled;

    @SerializedName("is_wce_prefetch")
    private final Boolean isWcePrefetch;

    @SerializedName("onboarding_education")
    private final CoachEducationType onboardingEducation;

    @SerializedName("screen_identifier")
    private final String screenIdentifier;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiAction.$stable | C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.AiContextMetadata$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/AiContextMetadata$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiContextMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C13228a(9)), AbstractC30060g.m92087G(enumC23463i, new C13228a(10)), null, null, null};
    }

    public AiContextMetadata() {
        this(false, (Boolean) null, (C9598e) null, (CoachEducationType) null, (String) null, (AiAction) null, (CoachEntry) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return CoachEducationType.INSTANCE.serializer();
    }

    public static /* synthetic */ AiContextMetadata copy$default(AiContextMetadata aiContextMetadata, boolean z4, Boolean bool, C9598e c9598e, CoachEducationType coachEducationType, String str, AiAction aiAction, CoachEntry coachEntry, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = aiContextMetadata.isWceEnabled;
        }
        if ((i13 & 2) != 0) {
            bool = aiContextMetadata.isWcePrefetch;
        }
        if ((i13 & 4) != 0) {
            c9598e = aiContextMetadata.destination;
        }
        if ((i13 & 8) != 0) {
            coachEducationType = aiContextMetadata.onboardingEducation;
        }
        if ((i13 & 16) != 0) {
            str = aiContextMetadata.screenIdentifier;
        }
        if ((i13 & 32) != 0) {
            aiAction = aiContextMetadata.aiAction;
        }
        if ((i13 & 64) != 0) {
            coachEntry = aiContextMetadata.coachEntry;
        }
        AiAction aiAction2 = aiAction;
        CoachEntry coachEntry2 = coachEntry;
        String str2 = str;
        C9598e c9598e2 = c9598e;
        return aiContextMetadata.copy(z4, bool, c9598e2, coachEducationType, str2, aiAction2, coachEntry2);
    }

    @InterfaceC37143h("ai_action")
    public static /* synthetic */ void getAiAction$annotations() {
    }

    @InterfaceC37143h("destination")
    public static /* synthetic */ void getDestination$annotations() {
    }

    @InterfaceC37143h("onboarding_education")
    public static /* synthetic */ void getOnboardingEducation$annotations() {
    }

    @InterfaceC37143h("screen_identifier")
    public static /* synthetic */ void getScreenIdentifier$annotations() {
    }

    @InterfaceC37143h("is_wce_enabled")
    public static /* synthetic */ void isWceEnabled$annotations() {
    }

    @InterfaceC37143h("is_wce_prefetch")
    public static /* synthetic */ void isWcePrefetch$annotations() {
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_common_release(AiContextMetadata self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isWceEnabled) {
            output.encodeBooleanElement(serialDesc, 0, self.isWceEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.isWcePrefetch != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.isWcePrefetch);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.onboardingEducation != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.onboardingEducation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.screenIdentifier, "")) {
            output.encodeStringElement(serialDesc, 4, self.screenIdentifier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.coachEntry == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, CoachEntry$$serializer.INSTANCE, self.coachEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsWceEnabled() {
        return this.isWceEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsWcePrefetch() {
        return this.isWcePrefetch;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CoachEducationType getOnboardingEducation() {
        return this.onboardingEducation;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final AiContextMetadata copy(boolean isWceEnabled, Boolean isWcePrefetch, C9598e destination, CoachEducationType onboardingEducation, String screenIdentifier, AiAction aiAction, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
        return new AiContextMetadata(isWceEnabled, isWcePrefetch, destination, onboardingEducation, screenIdentifier, aiAction, coachEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiContextMetadata)) {
            return false;
        }
        AiContextMetadata aiContextMetadata = (AiContextMetadata) other;
        return this.isWceEnabled == aiContextMetadata.isWceEnabled && AbstractC22676k.m65745e(this.isWcePrefetch, aiContextMetadata.isWcePrefetch) && AbstractC22676k.m65745e(this.destination, aiContextMetadata.destination) && this.onboardingEducation == aiContextMetadata.onboardingEducation && AbstractC22676k.m65745e(this.screenIdentifier, aiContextMetadata.screenIdentifier) && AbstractC22676k.m65745e(this.aiAction, aiContextMetadata.aiAction) && AbstractC22676k.m65745e(this.coachEntry, aiContextMetadata.coachEntry);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final CoachEducationType getOnboardingEducation() {
        return this.onboardingEducation;
    }

    public final String getScreenIdentifier() {
        return this.screenIdentifier;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isWceEnabled) * 31;
        Boolean bool = this.isWcePrefetch;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode3 = (iHashCode2 + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        CoachEducationType coachEducationType = this.onboardingEducation;
        int iM30450d = AbstractC11266d.m30450d((iHashCode3 + (coachEducationType == null ? 0 : coachEducationType.hashCode())) * 31, 31, this.screenIdentifier);
        AiAction aiAction = this.aiAction;
        int iHashCode4 = (iM30450d + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
        CoachEntry coachEntry = this.coachEntry;
        return iHashCode4 + (coachEntry != null ? coachEntry.hashCode() : 0);
    }

    public final boolean isWceEnabled() {
        return this.isWceEnabled;
    }

    public final Boolean isWcePrefetch() {
        return this.isWcePrefetch;
    }

    public String toString() {
        return "AiContextMetadata(isWceEnabled=" + this.isWceEnabled + ", isWcePrefetch=" + this.isWcePrefetch + ", destination=" + this.destination + ", onboardingEducation=" + this.onboardingEducation + ", screenIdentifier=" + this.screenIdentifier + ", aiAction=" + this.aiAction + ", coachEntry=" + this.coachEntry + ")";
    }

    public /* synthetic */ AiContextMetadata(int i13, boolean z4, Boolean bool, C9598e c9598e, CoachEducationType coachEducationType, String str, AiAction aiAction, CoachEntry coachEntry, SerializationConstructorMarker serializationConstructorMarker) {
        this.isWceEnabled = (i13 & 1) == 0 ? false : z4;
        if ((i13 & 2) == 0) {
            this.isWcePrefetch = null;
        } else {
            this.isWcePrefetch = bool;
        }
        if ((i13 & 4) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 8) == 0) {
            this.onboardingEducation = null;
        } else {
            this.onboardingEducation = coachEducationType;
        }
        if ((i13 & 16) == 0) {
            this.screenIdentifier = "";
        } else {
            this.screenIdentifier = str;
        }
        if ((i13 & 32) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 64) == 0) {
            this.coachEntry = null;
        } else {
            this.coachEntry = coachEntry;
        }
    }

    public AiContextMetadata(boolean z4, Boolean bool, C9598e c9598e, CoachEducationType coachEducationType, String screenIdentifier, AiAction aiAction, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(screenIdentifier, "screenIdentifier");
        this.isWceEnabled = z4;
        this.isWcePrefetch = bool;
        this.destination = c9598e;
        this.onboardingEducation = coachEducationType;
        this.screenIdentifier = screenIdentifier;
        this.aiAction = aiAction;
        this.coachEntry = coachEntry;
    }

    public /* synthetic */ AiContextMetadata(boolean z4, Boolean bool, C9598e c9598e, CoachEducationType coachEducationType, String str, AiAction aiAction, CoachEntry coachEntry, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : c9598e, (i13 & 8) != 0 ? null : coachEducationType, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? null : aiAction, (i13 & 64) != 0 ? null : coachEntry);
    }
}
