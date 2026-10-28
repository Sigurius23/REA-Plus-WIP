package com.whoop.bottomnavigation.domain.models;

import com.whoop.coacheverywherecommon.models.CoachEntry;
import com.whoop.coacheverywherecommon.models.CoachEntry$$serializer;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AiAction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab;", "", "", "id", "Lcom/whoop/navigation/AiAction;", "aiAction", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "coachEntry", "<init>", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bottom_navigation_release", "(Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/navigation/AiAction;", "component3", "()Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "copy", "(Ljava/lang/String;Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Lcom/whoop/coacheverywherecommon/models/CoachEntry;", "getCoachEntry", "Companion", "$serializer", "a", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BottomNavCoachTab {
    private final AiAction aiAction;
    private final CoachEntry coachEntry;
    private final String id;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CoachEntry.$stable | AiAction.$stable;

    /* JADX INFO: renamed from: com.whoop.bottomnavigation.domain.models.BottomNavCoachTab$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bottomnavigation/domain/models/BottomNavCoachTab;", "serializer", "()Lwc3/c;", "bottom-navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BottomNavCoachTab$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BottomNavCoachTab(int i13, String str, AiAction aiAction, CoachEntry coachEntry, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, BottomNavCoachTab$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.aiAction = aiAction;
        this.coachEntry = coachEntry;
    }

    public static /* synthetic */ BottomNavCoachTab copy$default(BottomNavCoachTab bottomNavCoachTab, String str, AiAction aiAction, CoachEntry coachEntry, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bottomNavCoachTab.id;
        }
        if ((i13 & 2) != 0) {
            aiAction = bottomNavCoachTab.aiAction;
        }
        if ((i13 & 4) != 0) {
            coachEntry = bottomNavCoachTab.coachEntry;
        }
        return bottomNavCoachTab.copy(str, aiAction, coachEntry);
    }

    public static final /* synthetic */ void write$Self$bottom_navigation_release(BottomNavCoachTab self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeNullableSerializableElement(serialDesc, 1, AiAction$$serializer.INSTANCE, self.aiAction);
        output.encodeNullableSerializableElement(serialDesc, 2, CoachEntry$$serializer.INSTANCE, self.coachEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final BottomNavCoachTab copy(String id4, AiAction aiAction, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(id4, "id");
        return new BottomNavCoachTab(id4, aiAction, coachEntry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomNavCoachTab)) {
            return false;
        }
        BottomNavCoachTab bottomNavCoachTab = (BottomNavCoachTab) other;
        return AbstractC22676k.m65745e(this.id, bottomNavCoachTab.id) && AbstractC22676k.m65745e(this.aiAction, bottomNavCoachTab.aiAction) && AbstractC22676k.m65745e(this.coachEntry, bottomNavCoachTab.coachEntry);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final CoachEntry getCoachEntry() {
        return this.coachEntry;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        AiAction aiAction = this.aiAction;
        int iHashCode2 = (iHashCode + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
        CoachEntry coachEntry = this.coachEntry;
        return iHashCode2 + (coachEntry != null ? coachEntry.hashCode() : 0);
    }

    public String toString() {
        return "BottomNavCoachTab(id=" + this.id + ", aiAction=" + this.aiAction + ", coachEntry=" + this.coachEntry + ")";
    }

    public BottomNavCoachTab(String id4, AiAction aiAction, CoachEntry coachEntry) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.aiAction = aiAction;
        this.coachEntry = coachEntry;
    }
}
