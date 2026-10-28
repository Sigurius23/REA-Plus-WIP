package com.whoop.user.journey.model.yearinreview.chronologicalsection;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba;
import com.whoop.design.models.items.amoeba.WhoopAgeAmoeba$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010#JR\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b2\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b7\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "amoebaHighlighted", "", "title", "subtitle", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "amoeba", "", "ticksPerStep", "totalTicks", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "component5", "()Ljava/lang/Integer;", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getAmoebaHighlighted", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/whoop/design/models/items/amoeba/WhoopAgeAmoeba;", "getAmoeba", "Ljava/lang/Integer;", "getTicksPerStep", "getTotalTicks", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class YearInReviewTimelineModel implements DesignSystemModel {
    private final WhoopAgeAmoeba amoeba;
    private final boolean amoebaHighlighted;
    private final String subtitle;
    private final Integer ticksPerStep;
    private final String title;
    private final Integer totalTicks;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = WhoopAgeAmoeba.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewTimelineModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return YearInReviewTimelineModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ YearInReviewTimelineModel(int i13, boolean z4, String str, String str2, WhoopAgeAmoeba whoopAgeAmoeba, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, YearInReviewTimelineModel$$serializer.INSTANCE.getDescriptor());
        }
        this.amoebaHighlighted = z4;
        this.title = str;
        this.subtitle = str2;
        this.amoeba = whoopAgeAmoeba;
        this.ticksPerStep = num;
        this.totalTicks = num2;
    }

    public static /* synthetic */ YearInReviewTimelineModel copy$default(YearInReviewTimelineModel yearInReviewTimelineModel, boolean z4, String str, String str2, WhoopAgeAmoeba whoopAgeAmoeba, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = yearInReviewTimelineModel.amoebaHighlighted;
        }
        if ((i13 & 2) != 0) {
            str = yearInReviewTimelineModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = yearInReviewTimelineModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            whoopAgeAmoeba = yearInReviewTimelineModel.amoeba;
        }
        if ((i13 & 16) != 0) {
            num = yearInReviewTimelineModel.ticksPerStep;
        }
        if ((i13 & 32) != 0) {
            num2 = yearInReviewTimelineModel.totalTicks;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return yearInReviewTimelineModel.copy(z4, str, str2, whoopAgeAmoeba, num3, num4);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(YearInReviewTimelineModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.amoebaHighlighted);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, WhoopAgeAmoeba$$serializer.INSTANCE, self.amoeba);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 4, intSerializer, self.ticksPerStep);
        output.encodeNullableSerializableElement(serialDesc, 5, intSerializer, self.totalTicks);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAmoebaHighlighted() {
        return this.amoebaHighlighted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final WhoopAgeAmoeba getAmoeba() {
        return this.amoeba;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTicksPerStep() {
        return this.ticksPerStep;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTotalTicks() {
        return this.totalTicks;
    }

    public final YearInReviewTimelineModel copy(boolean amoebaHighlighted, String title, String subtitle, WhoopAgeAmoeba amoeba, Integer ticksPerStep, Integer totalTicks) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new YearInReviewTimelineModel(amoebaHighlighted, title, subtitle, amoeba, ticksPerStep, totalTicks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YearInReviewTimelineModel)) {
            return false;
        }
        YearInReviewTimelineModel yearInReviewTimelineModel = (YearInReviewTimelineModel) other;
        return this.amoebaHighlighted == yearInReviewTimelineModel.amoebaHighlighted && AbstractC22676k.m65745e(this.title, yearInReviewTimelineModel.title) && AbstractC22676k.m65745e(this.subtitle, yearInReviewTimelineModel.subtitle) && AbstractC22676k.m65745e(this.amoeba, yearInReviewTimelineModel.amoeba) && AbstractC22676k.m65745e(this.ticksPerStep, yearInReviewTimelineModel.ticksPerStep) && AbstractC22676k.m65745e(this.totalTicks, yearInReviewTimelineModel.totalTicks);
    }

    public final WhoopAgeAmoeba getAmoeba() {
        return this.amoeba;
    }

    public final boolean getAmoebaHighlighted() {
        return this.amoebaHighlighted;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Integer getTicksPerStep() {
        return this.ticksPerStep;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalTicks() {
        return this.totalTicks;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Boolean.hashCode(this.amoebaHighlighted) * 31, 31, this.title), 31, this.subtitle);
        WhoopAgeAmoeba whoopAgeAmoeba = this.amoeba;
        int iHashCode = (iM30450d + (whoopAgeAmoeba == null ? 0 : whoopAgeAmoeba.hashCode())) * 31;
        Integer num = this.ticksPerStep;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalTicks;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.amoebaHighlighted;
        String str = this.title;
        String str2 = this.subtitle;
        WhoopAgeAmoeba whoopAgeAmoeba = this.amoeba;
        Integer num = this.ticksPerStep;
        Integer num2 = this.totalTicks;
        StringBuilder sbM38567n = AbstractC13673n.m38567n("YearInReviewTimelineModel(amoebaHighlighted=", ", title=", str, ", subtitle=", z4);
        sbM38567n.append(str2);
        sbM38567n.append(", amoeba=");
        sbM38567n.append(whoopAgeAmoeba);
        sbM38567n.append(", ticksPerStep=");
        sbM38567n.append(num);
        sbM38567n.append(", totalTicks=");
        sbM38567n.append(num2);
        sbM38567n.append(")");
        return sbM38567n.toString();
    }

    public YearInReviewTimelineModel(boolean z4, String title, String subtitle, WhoopAgeAmoeba whoopAgeAmoeba, Integer num, Integer num2) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.amoebaHighlighted = z4;
        this.title = title;
        this.subtitle = subtitle;
        this.amoeba = whoopAgeAmoeba;
        this.ticksPerStep = num;
        this.totalTicks = num2;
    }
}
