package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b/\u0010\u001c¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorCountTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "detailsCountTitleDisplay", "detailsCountSubtitleDisplay", "Lcom/whoop/design/models/items/AnswerCount;", "detailsYesAnswers", "detailsNoAnswers", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/AnswerCount;Lcom/whoop/design/models/items/AnswerCount;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/AnswerCount;Lcom/whoop/design/models/items/AnswerCount;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BehaviorCountTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Lcom/whoop/design/models/items/AnswerCount;", "component4", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/AnswerCount;Lcom/whoop/design/models/items/AnswerCount;)Lcom/whoop/design/models/items/BehaviorCountTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getDetailsCountTitleDisplay", "getDetailsCountSubtitleDisplay", "Lcom/whoop/design/models/items/AnswerCount;", "getDetailsYesAnswers", "getDetailsNoAnswers", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorCountTileModel implements DesignSystemModel {
    private final TextResource detailsCountSubtitleDisplay;
    private final TextResource detailsCountTitleDisplay;
    private final AnswerCount detailsNoAnswers;
    private final AnswerCount detailsYesAnswers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorCountTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BehaviorCountTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorCountTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorCountTileModel(int i13, TextResource textResource, TextResource textResource2, AnswerCount answerCount, AnswerCount answerCount2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BehaviorCountTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.detailsCountTitleDisplay = textResource;
        this.detailsCountSubtitleDisplay = textResource2;
        this.detailsYesAnswers = answerCount;
        this.detailsNoAnswers = answerCount2;
    }

    public static /* synthetic */ BehaviorCountTileModel copy$default(BehaviorCountTileModel behaviorCountTileModel, TextResource textResource, TextResource textResource2, AnswerCount answerCount, AnswerCount answerCount2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = behaviorCountTileModel.detailsCountTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = behaviorCountTileModel.detailsCountSubtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            answerCount = behaviorCountTileModel.detailsYesAnswers;
        }
        if ((i13 & 8) != 0) {
            answerCount2 = behaviorCountTileModel.detailsNoAnswers;
        }
        return behaviorCountTileModel.copy(textResource, textResource2, answerCount, answerCount2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorCountTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.detailsCountTitleDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.detailsCountSubtitleDisplay);
        AnswerCount$$serializer answerCount$$serializer = AnswerCount$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 2, answerCount$$serializer, self.detailsYesAnswers);
        output.encodeSerializableElement(serialDesc, 3, answerCount$$serializer, self.detailsNoAnswers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getDetailsCountTitleDisplay() {
        return this.detailsCountTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getDetailsCountSubtitleDisplay() {
        return this.detailsCountSubtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnswerCount getDetailsYesAnswers() {
        return this.detailsYesAnswers;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AnswerCount getDetailsNoAnswers() {
        return this.detailsNoAnswers;
    }

    public final BehaviorCountTileModel copy(TextResource detailsCountTitleDisplay, TextResource detailsCountSubtitleDisplay, AnswerCount detailsYesAnswers, AnswerCount detailsNoAnswers) {
        AbstractC22676k.m65750j(detailsCountTitleDisplay, "detailsCountTitleDisplay");
        AbstractC22676k.m65750j(detailsCountSubtitleDisplay, "detailsCountSubtitleDisplay");
        AbstractC22676k.m65750j(detailsYesAnswers, "detailsYesAnswers");
        AbstractC22676k.m65750j(detailsNoAnswers, "detailsNoAnswers");
        return new BehaviorCountTileModel(detailsCountTitleDisplay, detailsCountSubtitleDisplay, detailsYesAnswers, detailsNoAnswers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorCountTileModel)) {
            return false;
        }
        BehaviorCountTileModel behaviorCountTileModel = (BehaviorCountTileModel) other;
        return AbstractC22676k.m65745e(this.detailsCountTitleDisplay, behaviorCountTileModel.detailsCountTitleDisplay) && AbstractC22676k.m65745e(this.detailsCountSubtitleDisplay, behaviorCountTileModel.detailsCountSubtitleDisplay) && AbstractC22676k.m65745e(this.detailsYesAnswers, behaviorCountTileModel.detailsYesAnswers) && AbstractC22676k.m65745e(this.detailsNoAnswers, behaviorCountTileModel.detailsNoAnswers);
    }

    public final TextResource getDetailsCountSubtitleDisplay() {
        return this.detailsCountSubtitleDisplay;
    }

    public final TextResource getDetailsCountTitleDisplay() {
        return this.detailsCountTitleDisplay;
    }

    public final AnswerCount getDetailsNoAnswers() {
        return this.detailsNoAnswers;
    }

    public final AnswerCount getDetailsYesAnswers() {
        return this.detailsYesAnswers;
    }

    public int hashCode() {
        return this.detailsNoAnswers.hashCode() + ((this.detailsYesAnswers.hashCode() + AbstractC31061c.m95625a(this.detailsCountTitleDisplay.hashCode() * 31, this.detailsCountSubtitleDisplay, 31)) * 31);
    }

    public String toString() {
        TextResource textResource = this.detailsCountTitleDisplay;
        TextResource textResource2 = this.detailsCountSubtitleDisplay;
        AnswerCount answerCount = this.detailsYesAnswers;
        AnswerCount answerCount2 = this.detailsNoAnswers;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("BehaviorCountTileModel(detailsCountTitleDisplay=", textResource, ", detailsCountSubtitleDisplay=", textResource2, ", detailsYesAnswers=");
        sbM106658q.append(answerCount);
        sbM106658q.append(", detailsNoAnswers=");
        sbM106658q.append(answerCount2);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public BehaviorCountTileModel(TextResource detailsCountTitleDisplay, TextResource detailsCountSubtitleDisplay, AnswerCount detailsYesAnswers, AnswerCount detailsNoAnswers) {
        AbstractC22676k.m65750j(detailsCountTitleDisplay, "detailsCountTitleDisplay");
        AbstractC22676k.m65750j(detailsCountSubtitleDisplay, "detailsCountSubtitleDisplay");
        AbstractC22676k.m65750j(detailsYesAnswers, "detailsYesAnswers");
        AbstractC22676k.m65750j(detailsNoAnswers, "detailsNoAnswers");
        this.detailsCountTitleDisplay = detailsCountTitleDisplay;
        this.detailsCountSubtitleDisplay = detailsCountSubtitleDisplay;
        this.detailsYesAnswers = detailsYesAnswers;
        this.detailsNoAnswers = detailsNoAnswers;
    }
}
