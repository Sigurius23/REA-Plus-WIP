package com.whoop.weeklyplan.hubandspoke.domain.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ8\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u001a¨\u0006-"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx;", "", "", "behaviorTrackerId", "", "title", "titleAvoid", "description", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$weekly_plan_release", "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBehaviorTrackerId", "Ljava/lang/String;", "getTitle", "getTitleAvoid", "getDescription", "Companion", "$serializer", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorDetailKotlinx {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int behaviorTrackerId;
    private final String description;
    private final String title;
    private final String titleAvoid;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorDetailKotlinx;", "serializer", "()Lwc3/c;", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorDetailKotlinx$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorDetailKotlinx(int i13, int i14, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BehaviorDetailKotlinx$$serializer.INSTANCE.getDescriptor());
        }
        this.behaviorTrackerId = i14;
        this.title = str;
        this.titleAvoid = str2;
        this.description = str3;
    }

    public static /* synthetic */ BehaviorDetailKotlinx copy$default(BehaviorDetailKotlinx behaviorDetailKotlinx, int i13, String str, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = behaviorDetailKotlinx.behaviorTrackerId;
        }
        if ((i14 & 2) != 0) {
            str = behaviorDetailKotlinx.title;
        }
        if ((i14 & 4) != 0) {
            str2 = behaviorDetailKotlinx.titleAvoid;
        }
        if ((i14 & 8) != 0) {
            str3 = behaviorDetailKotlinx.description;
        }
        return behaviorDetailKotlinx.copy(i13, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$weekly_plan_release(BehaviorDetailKotlinx self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.behaviorTrackerId);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.titleAvoid);
        output.encodeStringElement(serialDesc, 3, self.description);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleAvoid() {
        return this.titleAvoid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final BehaviorDetailKotlinx copy(int behaviorTrackerId, String title, String titleAvoid, String description) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleAvoid, "titleAvoid");
        AbstractC22676k.m65750j(description, "description");
        return new BehaviorDetailKotlinx(behaviorTrackerId, title, titleAvoid, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorDetailKotlinx)) {
            return false;
        }
        BehaviorDetailKotlinx behaviorDetailKotlinx = (BehaviorDetailKotlinx) other;
        return this.behaviorTrackerId == behaviorDetailKotlinx.behaviorTrackerId && AbstractC22676k.m65745e(this.title, behaviorDetailKotlinx.title) && AbstractC22676k.m65745e(this.titleAvoid, behaviorDetailKotlinx.titleAvoid) && AbstractC22676k.m65745e(this.description, behaviorDetailKotlinx.description);
    }

    public final int getBehaviorTrackerId() {
        return this.behaviorTrackerId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleAvoid() {
        return this.titleAvoid;
    }

    public int hashCode() {
        return this.description.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.behaviorTrackerId) * 31, 31, this.title), 31, this.titleAvoid);
    }

    public String toString() {
        int i13 = this.behaviorTrackerId;
        String str = this.title;
        return AbstractC11266d.m30464r(AbstractC18489d0.m53373n(i13, "BehaviorDetailKotlinx(behaviorTrackerId=", ", title=", str, ", titleAvoid="), this.titleAvoid, ", description=", this.description, ")");
    }

    public BehaviorDetailKotlinx(int i13, String title, String titleAvoid, String description) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(titleAvoid, "titleAvoid");
        AbstractC22676k.m65750j(description, "description");
        this.behaviorTrackerId = i13;
        this.title = title;
        this.titleAvoid = titleAvoid;
        this.description = description;
    }
}
