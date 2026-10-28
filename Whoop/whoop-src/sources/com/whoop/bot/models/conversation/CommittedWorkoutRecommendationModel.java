package com.whoop.bot.models.conversation;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel;
import com.whoop.design.models.items.activityrecommendation.ActivityRecommendationTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJF\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b7\u0010\u001f¨\u0006:"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "activityRecommendation", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "activityRecommendationV2", "Lcom/whoop/bot/models/conversation/ActionButton;", "startActivityButton", "generateAlternativeButton", "decommitButton", "<init>", "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "component2", "()Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "component3", "()Lcom/whoop/bot/models/conversation/ActionButton;", "component4", "component5", "copy", "(Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;Lcom/whoop/bot/models/conversation/ActionButton;)Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/bot/models/conversation/ActivityRecommendationModel;", "getActivityRecommendation", "Lcom/whoop/design/models/items/activityrecommendation/ActivityRecommendationTileModel;", "getActivityRecommendationV2", "getActivityRecommendationV2$annotations", "()V", "Lcom/whoop/bot/models/conversation/ActionButton;", "getStartActivityButton", "getGenerateAlternativeButton", "getDecommitButton", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommittedWorkoutRecommendationModel implements DesignSystemModel {
    private final ActivityRecommendationModel activityRecommendation;

    @SerializedName("activity_recommendation_v2")
    private final ActivityRecommendationTileModel activityRecommendationV2;
    private final ActionButton decommitButton;
    private final ActionButton generateAlternativeButton;
    private final ActionButton startActivityButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/CommittedWorkoutRecommendationModel;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommittedWorkoutRecommendationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommittedWorkoutRecommendationModel(int i13, ActivityRecommendationModel activityRecommendationModel, ActivityRecommendationTileModel activityRecommendationTileModel, ActionButton actionButton, ActionButton actionButton2, ActionButton actionButton3, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i13 & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 29, CommittedWorkoutRecommendationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.activityRecommendation = activityRecommendationModel;
        if ((i13 & 2) == 0) {
            this.activityRecommendationV2 = null;
        } else {
            this.activityRecommendationV2 = activityRecommendationTileModel;
        }
        this.startActivityButton = actionButton;
        this.generateAlternativeButton = actionButton2;
        this.decommitButton = actionButton3;
    }

    public static /* synthetic */ CommittedWorkoutRecommendationModel copy$default(CommittedWorkoutRecommendationModel committedWorkoutRecommendationModel, ActivityRecommendationModel activityRecommendationModel, ActivityRecommendationTileModel activityRecommendationTileModel, ActionButton actionButton, ActionButton actionButton2, ActionButton actionButton3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activityRecommendationModel = committedWorkoutRecommendationModel.activityRecommendation;
        }
        if ((i13 & 2) != 0) {
            activityRecommendationTileModel = committedWorkoutRecommendationModel.activityRecommendationV2;
        }
        if ((i13 & 4) != 0) {
            actionButton = committedWorkoutRecommendationModel.startActivityButton;
        }
        if ((i13 & 8) != 0) {
            actionButton2 = committedWorkoutRecommendationModel.generateAlternativeButton;
        }
        if ((i13 & 16) != 0) {
            actionButton3 = committedWorkoutRecommendationModel.decommitButton;
        }
        ActionButton actionButton4 = actionButton3;
        ActionButton actionButton5 = actionButton;
        return committedWorkoutRecommendationModel.copy(activityRecommendationModel, activityRecommendationTileModel, actionButton5, actionButton2, actionButton4);
    }

    @InterfaceC37143h("activity_recommendation_v2")
    public static /* synthetic */ void getActivityRecommendationV2$annotations() {
    }

    public static final /* synthetic */ void write$Self$bot_release(CommittedWorkoutRecommendationModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, ActivityRecommendationModel$$serializer.INSTANCE, self.activityRecommendation);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.activityRecommendationV2 != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, ActivityRecommendationTileModel$$serializer.INSTANCE, self.activityRecommendationV2);
        }
        ActionButton$$serializer actionButton$$serializer = ActionButton$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, actionButton$$serializer, self.startActivityButton);
        output.encodeSerializableElement(serialDesc, 3, actionButton$$serializer, self.generateAlternativeButton);
        output.encodeSerializableElement(serialDesc, 4, actionButton$$serializer, self.decommitButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActivityRecommendationModel getActivityRecommendation() {
        return this.activityRecommendation;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivityRecommendationTileModel getActivityRecommendationV2() {
        return this.activityRecommendationV2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ActionButton getStartActivityButton() {
        return this.startActivityButton;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ActionButton getGenerateAlternativeButton() {
        return this.generateAlternativeButton;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ActionButton getDecommitButton() {
        return this.decommitButton;
    }

    public final CommittedWorkoutRecommendationModel copy(ActivityRecommendationModel activityRecommendation, ActivityRecommendationTileModel activityRecommendationV2, ActionButton startActivityButton, ActionButton generateAlternativeButton, ActionButton decommitButton) {
        AbstractC22676k.m65750j(startActivityButton, "startActivityButton");
        AbstractC22676k.m65750j(generateAlternativeButton, "generateAlternativeButton");
        AbstractC22676k.m65750j(decommitButton, "decommitButton");
        return new CommittedWorkoutRecommendationModel(activityRecommendation, activityRecommendationV2, startActivityButton, generateAlternativeButton, decommitButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommittedWorkoutRecommendationModel)) {
            return false;
        }
        CommittedWorkoutRecommendationModel committedWorkoutRecommendationModel = (CommittedWorkoutRecommendationModel) other;
        return AbstractC22676k.m65745e(this.activityRecommendation, committedWorkoutRecommendationModel.activityRecommendation) && AbstractC22676k.m65745e(this.activityRecommendationV2, committedWorkoutRecommendationModel.activityRecommendationV2) && AbstractC22676k.m65745e(this.startActivityButton, committedWorkoutRecommendationModel.startActivityButton) && AbstractC22676k.m65745e(this.generateAlternativeButton, committedWorkoutRecommendationModel.generateAlternativeButton) && AbstractC22676k.m65745e(this.decommitButton, committedWorkoutRecommendationModel.decommitButton);
    }

    public final ActivityRecommendationModel getActivityRecommendation() {
        return this.activityRecommendation;
    }

    public final ActivityRecommendationTileModel getActivityRecommendationV2() {
        return this.activityRecommendationV2;
    }

    public final ActionButton getDecommitButton() {
        return this.decommitButton;
    }

    public final ActionButton getGenerateAlternativeButton() {
        return this.generateAlternativeButton;
    }

    public final ActionButton getStartActivityButton() {
        return this.startActivityButton;
    }

    public int hashCode() {
        ActivityRecommendationModel activityRecommendationModel = this.activityRecommendation;
        int iHashCode = (activityRecommendationModel == null ? 0 : activityRecommendationModel.hashCode()) * 31;
        ActivityRecommendationTileModel activityRecommendationTileModel = this.activityRecommendationV2;
        return this.decommitButton.hashCode() + ((this.generateAlternativeButton.hashCode() + ((this.startActivityButton.hashCode() + ((iHashCode + (activityRecommendationTileModel != null ? activityRecommendationTileModel.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "CommittedWorkoutRecommendationModel(activityRecommendation=" + this.activityRecommendation + ", activityRecommendationV2=" + this.activityRecommendationV2 + ", startActivityButton=" + this.startActivityButton + ", generateAlternativeButton=" + this.generateAlternativeButton + ", decommitButton=" + this.decommitButton + ")";
    }

    public CommittedWorkoutRecommendationModel(ActivityRecommendationModel activityRecommendationModel, ActivityRecommendationTileModel activityRecommendationTileModel, ActionButton startActivityButton, ActionButton generateAlternativeButton, ActionButton decommitButton) {
        AbstractC22676k.m65750j(startActivityButton, "startActivityButton");
        AbstractC22676k.m65750j(generateAlternativeButton, "generateAlternativeButton");
        AbstractC22676k.m65750j(decommitButton, "decommitButton");
        this.activityRecommendation = activityRecommendationModel;
        this.activityRecommendationV2 = activityRecommendationTileModel;
        this.startActivityButton = startActivityButton;
        this.generateAlternativeButton = generateAlternativeButton;
        this.decommitButton = decommitButton;
    }

    public /* synthetic */ CommittedWorkoutRecommendationModel(ActivityRecommendationModel activityRecommendationModel, ActivityRecommendationTileModel activityRecommendationTileModel, ActionButton actionButton, ActionButton actionButton2, ActionButton actionButton3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityRecommendationModel, (i13 & 2) != 0 ? null : activityRecommendationTileModel, actionButton, actionButton2, actionButton3);
    }
}
