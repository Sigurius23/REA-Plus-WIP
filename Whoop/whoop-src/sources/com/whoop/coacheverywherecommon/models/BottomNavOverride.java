package com.whoop.coacheverywherecommon.models;

import androidx.annotation.Keep;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import ep0.C13395a;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JJ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b\u000b\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "", "", "type", "Lcom/whoop/navigation/e;", "destination", "Lcom/whoop/navigation/AiAction;", "aiAction", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "", "isWcePrefetch", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$coach_everywhere_common_release", "(Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/e;", "component3", "()Lcom/whoop/navigation/AiAction;", "component4", "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "component5", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Ljava/lang/Boolean;)Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "getCoachEntry", "Ljava/lang/Boolean;", "Companion", "$serializer", "a", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomNavOverride {
    private final AiAction aiAction;
    private final CoachEntry coachEntry;
    private final C9598e destination;
    private final Boolean isWcePrefetch;
    private final String type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = AiAction.$stable | C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13395a(1)), null, null, null};

    /* JADX INFO: renamed from: com.whoop.coacheverywherecommon.models.BottomNavOverride$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/coacheverywherecommon/models/BottomNavOverride$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;", "serializer", "()Lwc3/c;", "coach-everywhere-common_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomNavOverride$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BottomNavOverride(int i13, String str, C9598e c9598e, AiAction aiAction, CoachEntry coachEntry, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BottomNavOverride$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.destination = c9598e;
        if ((i13 & 4) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 8) == 0) {
            this.coachEntry = null;
        } else {
            this.coachEntry = coachEntry;
        }
        if ((i13 & 16) == 0) {
            this.isWcePrefetch = null;
        } else {
            this.isWcePrefetch = bool;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ BottomNavOverride copy$default(BottomNavOverride bottomNavOverride, String str, C9598e c9598e, AiAction aiAction, CoachEntry coachEntry, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomNavOverride.type;
        }
        if ((i13 & 2) != 0) {
            c9598e = bottomNavOverride.destination;
        }
        if ((i13 & 4) != 0) {
            aiAction = bottomNavOverride.aiAction;
        }
        if ((i13 & 8) != 0) {
            coachEntry = bottomNavOverride.coachEntry;
        }
        if ((i13 & 16) != 0) {
            bool = bottomNavOverride.isWcePrefetch;
        }
        Boolean bool2 = bool;
        AiAction aiAction2 = aiAction;
        return bottomNavOverride.copy(str, c9598e, aiAction2, coachEntry, bool2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$coach_everywhere_common_release(BottomNavOverride self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.type);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.destination);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.coachEntry != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, CoachEntry$$serializer.INSTANCE, self.coachEntry);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.isWcePrefetch == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.isWcePrefetch);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIsWcePrefetch() {
        return this.isWcePrefetch;
    }

    public final BottomNavOverride copy(String type, C9598e destination, AiAction aiAction, CoachEntry coachEntry, Boolean isWcePrefetch) {
        AbstractC22676k.m65750j(type, "type");
        return new BottomNavOverride(type, destination, aiAction, coachEntry, isWcePrefetch);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavOverride)) {
            return false;
        }
        BottomNavOverride bottomNavOverride = (BottomNavOverride) other;
        return AbstractC22676k.m65745e(this.type, bottomNavOverride.type) && AbstractC22676k.m65745e(this.destination, bottomNavOverride.destination) && AbstractC22676k.m65745e(this.aiAction, bottomNavOverride.aiAction) && AbstractC22676k.m65745e(this.coachEntry, bottomNavOverride.coachEntry) && AbstractC22676k.m65745e(this.isWcePrefetch, bottomNavOverride.isWcePrefetch);
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

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        int iHashCode3 = (iHashCode2 + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
        CoachEntry coachEntry = this.coachEntry;
        int iHashCode4 = (iHashCode3 + (coachEntry == null ? 0 : coachEntry.hashCode())) * 31;
        Boolean bool = this.isWcePrefetch;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isWcePrefetch() {
        return this.isWcePrefetch;
    }

    public String toString() {
        String str = this.type;
        C9598e c9598e = this.destination;
        AiAction aiAction = this.aiAction;
        CoachEntry coachEntry = this.coachEntry;
        Boolean bool = this.isWcePrefetch;
        StringBuilder sb4 = new StringBuilder("BottomNavOverride(type=");
        sb4.append(str);
        sb4.append(", destination=");
        sb4.append(c9598e);
        sb4.append(", aiAction=");
        sb4.append(aiAction);
        sb4.append(", coachEntry=");
        sb4.append(coachEntry);
        sb4.append(", isWcePrefetch=");
        return AbstractC11478a.m30858j(sb4, bool, ")");
    }

    public BottomNavOverride(String type, C9598e c9598e, AiAction aiAction, CoachEntry coachEntry, Boolean bool) {
        AbstractC22676k.m65750j(type, "type");
        this.type = type;
        this.destination = c9598e;
        this.aiAction = aiAction;
        this.coachEntry = coachEntry;
        this.isWcePrefetch = bool;
    }

    public /* synthetic */ BottomNavOverride(String str, C9598e c9598e, AiAction aiAction, CoachEntry coachEntry, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, c9598e, (i13 & 4) != 0 ? null : aiAction, (i13 & 8) != 0 ? null : coachEntry, (i13 & 16) != 0 ? null : bool);
    }
}
