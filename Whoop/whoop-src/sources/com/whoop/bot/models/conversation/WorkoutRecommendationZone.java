package com.whoop.bot.models.conversation;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ:\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b/\u0010\u001c¨\u00062"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;", "", "", "size", "", "style", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "<init>", "(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/design/util/TextResource;", "component4", "copy", "(FLjava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getSize", "Ljava/lang/String;", "getStyle", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WorkoutRecommendationZone {
    private final float size;
    private final String style;
    private final String subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/WorkoutRecommendationZone;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WorkoutRecommendationZone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WorkoutRecommendationZone(float f13, String style, TextResource title, String str) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        this.size = f13;
        this.style = style;
        this.title = title;
        this.subtitle = str;
    }

    public static /* synthetic */ WorkoutRecommendationZone copy$default(WorkoutRecommendationZone workoutRecommendationZone, float f13, String str, TextResource textResource, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = workoutRecommendationZone.size;
        }
        if ((i13 & 2) != 0) {
            str = workoutRecommendationZone.style;
        }
        if ((i13 & 4) != 0) {
            textResource = workoutRecommendationZone.title;
        }
        if ((i13 & 8) != 0) {
            str2 = workoutRecommendationZone.subtitle;
        }
        return workoutRecommendationZone.copy(f13, str, textResource, str2);
    }

    public static final /* synthetic */ void write$Self$bot_release(WorkoutRecommendationZone self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeFloatElement(serialDesc, 0, self.size);
        output.encodeStringElement(serialDesc, 1, self.style);
        output.encodeSerializableElement(serialDesc, 2, C25452a.f99689a, self.title);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.subtitle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final WorkoutRecommendationZone copy(float size, String style, TextResource title, String subtitle) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(title, "title");
        return new WorkoutRecommendationZone(size, style, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutRecommendationZone)) {
            return false;
        }
        WorkoutRecommendationZone workoutRecommendationZone = (WorkoutRecommendationZone) other;
        return Float.compare(this.size, workoutRecommendationZone.size) == 0 && AbstractC22676k.m65745e(this.style, workoutRecommendationZone.style) && AbstractC22676k.m65745e(this.title, workoutRecommendationZone.title) && AbstractC22676k.m65745e(this.subtitle, workoutRecommendationZone.subtitle);
    }

    public final float getSize() {
        return this.size;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC11266d.m30450d(Float.hashCode(this.size) * 31, 31, this.style), this.title, 31);
        String str = this.subtitle;
        return iM95625a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WorkoutRecommendationZone(size=" + this.size + ", style=" + this.style + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    public /* synthetic */ WorkoutRecommendationZone(int i13, float f13, String str, TextResource textResource, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, WorkoutRecommendationZone$$serializer.INSTANCE.getDescriptor());
        }
        this.size = f13;
        this.style = str;
        this.title = textResource;
        this.subtitle = str2;
    }
}
