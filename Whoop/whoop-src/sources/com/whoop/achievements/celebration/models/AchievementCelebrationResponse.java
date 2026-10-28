package com.whoop.achievements.celebration.models;

import com.whoop.design.models.celebration.CelebrationOverlayModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, m65681d2 = {"Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;", "", "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "celebrationOverlay", "<init>", "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/celebration/CelebrationOverlayModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$achievements_release", "(Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "copy", "(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/celebration/CelebrationOverlayModel;", "getCelebrationOverlay", "Companion", "$serializer", "a", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AchievementCelebrationResponse {
    private final CelebrationOverlayModel celebrationOverlay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = CelebrationOverlayModel.$stable;

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.models.AchievementCelebrationResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;", "serializer", "()Lwc3/c;", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AchievementCelebrationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AchievementCelebrationResponse(int i13, CelebrationOverlayModel celebrationOverlayModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AchievementCelebrationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.celebrationOverlay = celebrationOverlayModel;
    }

    public static /* synthetic */ AchievementCelebrationResponse copy$default(AchievementCelebrationResponse achievementCelebrationResponse, CelebrationOverlayModel celebrationOverlayModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            celebrationOverlayModel = achievementCelebrationResponse.celebrationOverlay;
        }
        return achievementCelebrationResponse.copy(celebrationOverlayModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CelebrationOverlayModel getCelebrationOverlay() {
        return this.celebrationOverlay;
    }

    public final AchievementCelebrationResponse copy(CelebrationOverlayModel celebrationOverlay) {
        AbstractC22676k.m65750j(celebrationOverlay, "celebrationOverlay");
        return new AchievementCelebrationResponse(celebrationOverlay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AchievementCelebrationResponse) && AbstractC22676k.m65745e(this.celebrationOverlay, ((AchievementCelebrationResponse) other).celebrationOverlay);
    }

    public final CelebrationOverlayModel getCelebrationOverlay() {
        return this.celebrationOverlay;
    }

    public int hashCode() {
        return this.celebrationOverlay.hashCode();
    }

    public String toString() {
        return "AchievementCelebrationResponse(celebrationOverlay=" + this.celebrationOverlay + ")";
    }

    public AchievementCelebrationResponse(CelebrationOverlayModel celebrationOverlay) {
        AbstractC22676k.m65750j(celebrationOverlay, "celebrationOverlay");
        this.celebrationOverlay = celebrationOverlay;
    }
}
