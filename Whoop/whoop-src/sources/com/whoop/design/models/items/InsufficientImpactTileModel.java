package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import w91.C36959f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001c¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/InsufficientImpactTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/util/TextResource;", "insufficientAnswersTitleDisplay", "insufficientAnswersSubtitleDisplay", "", "Lcom/whoop/design/models/items/ImpactCardModel;", "impactCards", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/InsufficientImpactTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)Lcom/whoop/design/models/items/InsufficientImpactTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getInsufficientAnswersTitleDisplay", "getInsufficientAnswersSubtitleDisplay", "Ljava/util/List;", "getImpactCards", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InsufficientImpactTileModel implements DesignSystemModel {
    private final List<ImpactCardModel> impactCards;
    private final TextResource insufficientAnswersSubtitleDisplay;
    private final TextResource insufficientAnswersTitleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36959f(22))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/InsufficientImpactTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/InsufficientImpactTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InsufficientImpactTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ InsufficientImpactTileModel(int i13, TextResource textResource, TextResource textResource2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, InsufficientImpactTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.insufficientAnswersTitleDisplay = textResource;
        this.insufficientAnswersSubtitleDisplay = textResource2;
        this.impactCards = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ImpactCardModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InsufficientImpactTileModel copy$default(InsufficientImpactTileModel insufficientImpactTileModel, TextResource textResource, TextResource textResource2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = insufficientImpactTileModel.insufficientAnswersTitleDisplay;
        }
        if ((i13 & 2) != 0) {
            textResource2 = insufficientImpactTileModel.insufficientAnswersSubtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            list = insufficientImpactTileModel.impactCards;
        }
        return insufficientImpactTileModel.copy(textResource, textResource2, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(InsufficientImpactTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.insufficientAnswersTitleDisplay);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.insufficientAnswersSubtitleDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.impactCards);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getInsufficientAnswersTitleDisplay() {
        return this.insufficientAnswersTitleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getInsufficientAnswersSubtitleDisplay() {
        return this.insufficientAnswersSubtitleDisplay;
    }

    public final List<ImpactCardModel> component3() {
        return this.impactCards;
    }

    public final InsufficientImpactTileModel copy(TextResource insufficientAnswersTitleDisplay, TextResource insufficientAnswersSubtitleDisplay, List<ImpactCardModel> impactCards) {
        AbstractC22676k.m65750j(insufficientAnswersTitleDisplay, "insufficientAnswersTitleDisplay");
        AbstractC22676k.m65750j(insufficientAnswersSubtitleDisplay, "insufficientAnswersSubtitleDisplay");
        AbstractC22676k.m65750j(impactCards, "impactCards");
        return new InsufficientImpactTileModel(insufficientAnswersTitleDisplay, insufficientAnswersSubtitleDisplay, impactCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InsufficientImpactTileModel)) {
            return false;
        }
        InsufficientImpactTileModel insufficientImpactTileModel = (InsufficientImpactTileModel) other;
        return AbstractC22676k.m65745e(this.insufficientAnswersTitleDisplay, insufficientImpactTileModel.insufficientAnswersTitleDisplay) && AbstractC22676k.m65745e(this.insufficientAnswersSubtitleDisplay, insufficientImpactTileModel.insufficientAnswersSubtitleDisplay) && AbstractC22676k.m65745e(this.impactCards, insufficientImpactTileModel.impactCards);
    }

    public final List<ImpactCardModel> getImpactCards() {
        return this.impactCards;
    }

    public final TextResource getInsufficientAnswersSubtitleDisplay() {
        return this.insufficientAnswersSubtitleDisplay;
    }

    public final TextResource getInsufficientAnswersTitleDisplay() {
        return this.insufficientAnswersTitleDisplay;
    }

    public int hashCode() {
        return this.impactCards.hashCode() + AbstractC31061c.m95625a(this.insufficientAnswersTitleDisplay.hashCode() * 31, this.insufficientAnswersSubtitleDisplay, 31);
    }

    public String toString() {
        TextResource textResource = this.insufficientAnswersTitleDisplay;
        TextResource textResource2 = this.insufficientAnswersSubtitleDisplay;
        return AbstractC3855a.m11829m(AbstractC33745d.m106658q("InsufficientImpactTileModel(insufficientAnswersTitleDisplay=", textResource, ", insufficientAnswersSubtitleDisplay=", textResource2, ", impactCards="), this.impactCards, ")");
    }

    public InsufficientImpactTileModel(TextResource insufficientAnswersTitleDisplay, TextResource insufficientAnswersSubtitleDisplay, List<ImpactCardModel> impactCards) {
        AbstractC22676k.m65750j(insufficientAnswersTitleDisplay, "insufficientAnswersTitleDisplay");
        AbstractC22676k.m65750j(insufficientAnswersSubtitleDisplay, "insufficientAnswersSubtitleDisplay");
        AbstractC22676k.m65750j(impactCards, "impactCards");
        this.insufficientAnswersTitleDisplay = insufficientAnswersTitleDisplay;
        this.insufficientAnswersSubtitleDisplay = insufficientAnswersSubtitleDisplay;
        this.impactCards = impactCards;
    }
}
