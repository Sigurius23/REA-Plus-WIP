package com.whoop.design.models.celebration;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import ty1.C34260e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JV\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b3\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010$¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/celebration/DynamicLottieModel;", "", "", "overlayUrl", "", "Lcom/whoop/design/models/celebration/SlotConfigModel;", "slots", "", "animated", "highlightGradient", "Lcom/whoop/design/models/celebration/AnimationModeModel;", "animationMode", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/celebration/DynamicLottieModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Lcom/whoop/design/models/celebration/AnimationModeModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;)Lcom/whoop/design/models/celebration/DynamicLottieModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getOverlayUrl", "Ljava/util/List;", "getSlots", "Ljava/lang/Boolean;", "getAnimated", "getHighlightGradient", "Lcom/whoop/design/models/celebration/AnimationModeModel;", "getAnimationMode", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DynamicLottieModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Boolean animated;
    private final AnimationModeModel animationMode;
    private final List<String> highlightGradient;
    private final String overlayUrl;
    private final List<SlotConfigModel> slots;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/DynamicLottieModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/DynamicLottieModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DynamicLottieModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C34260e(21)), null, AbstractC30060g.m92087G(enumC23463i, new C34260e(22)), AbstractC30060g.m92087G(enumC23463i, new C34260e(23))};
    }

    public /* synthetic */ DynamicLottieModel(int i13, String str, List list, Boolean bool, List list2, AnimationModeModel animationModeModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (29 != (i13 & 29)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 29, DynamicLottieModel$$serializer.INSTANCE.getDescriptor());
        }
        this.overlayUrl = str;
        if ((i13 & 2) == 0) {
            this.slots = C25271y.f99162w;
        } else {
            this.slots = list;
        }
        this.animated = bool;
        this.highlightGradient = list2;
        this.animationMode = animationModeModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SlotConfigModelSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnimationModeModel.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DynamicLottieModel copy$default(DynamicLottieModel dynamicLottieModel, String str, List list, Boolean bool, List list2, AnimationModeModel animationModeModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dynamicLottieModel.overlayUrl;
        }
        if ((i13 & 2) != 0) {
            list = dynamicLottieModel.slots;
        }
        if ((i13 & 4) != 0) {
            bool = dynamicLottieModel.animated;
        }
        if ((i13 & 8) != 0) {
            list2 = dynamicLottieModel.highlightGradient;
        }
        if ((i13 & 16) != 0) {
            animationModeModel = dynamicLottieModel.animationMode;
        }
        AnimationModeModel animationModeModel2 = animationModeModel;
        Boolean bool2 = bool;
        return dynamicLottieModel.copy(str, list, bool2, list2, animationModeModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(DynamicLottieModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.overlayUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.slots, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.slots);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.animated);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.highlightGradient);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.animationMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOverlayUrl() {
        return this.overlayUrl;
    }

    public final List<SlotConfigModel> component2() {
        return this.slots;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAnimated() {
        return this.animated;
    }

    public final List<String> component4() {
        return this.highlightGradient;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnimationModeModel getAnimationMode() {
        return this.animationMode;
    }

    public final DynamicLottieModel copy(String overlayUrl, List<SlotConfigModel> slots, Boolean animated, List<String> highlightGradient, AnimationModeModel animationMode) {
        AbstractC22676k.m65750j(slots, "slots");
        return new DynamicLottieModel(overlayUrl, slots, animated, highlightGradient, animationMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DynamicLottieModel)) {
            return false;
        }
        DynamicLottieModel dynamicLottieModel = (DynamicLottieModel) other;
        return AbstractC22676k.m65745e(this.overlayUrl, dynamicLottieModel.overlayUrl) && AbstractC22676k.m65745e(this.slots, dynamicLottieModel.slots) && AbstractC22676k.m65745e(this.animated, dynamicLottieModel.animated) && AbstractC22676k.m65745e(this.highlightGradient, dynamicLottieModel.highlightGradient) && this.animationMode == dynamicLottieModel.animationMode;
    }

    public final Boolean getAnimated() {
        return this.animated;
    }

    public final AnimationModeModel getAnimationMode() {
        return this.animationMode;
    }

    public final List<String> getHighlightGradient() {
        return this.highlightGradient;
    }

    public final String getOverlayUrl() {
        return this.overlayUrl;
    }

    public final List<SlotConfigModel> getSlots() {
        return this.slots;
    }

    public int hashCode() {
        String str = this.overlayUrl;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.slots);
        Boolean bool = this.animated;
        int iHashCode = (iM31983b + (bool == null ? 0 : bool.hashCode())) * 31;
        List<String> list = this.highlightGradient;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AnimationModeModel animationModeModel = this.animationMode;
        return iHashCode2 + (animationModeModel != null ? animationModeModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.overlayUrl;
        List<SlotConfigModel> list = this.slots;
        Boolean bool = this.animated;
        List<String> list2 = this.highlightGradient;
        AnimationModeModel animationModeModel = this.animationMode;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("DynamicLottieModel(overlayUrl=", str, ", slots=", ", animated=", list);
        sbM94766o.append(bool);
        sbM94766o.append(", highlightGradient=");
        sbM94766o.append(list2);
        sbM94766o.append(", animationMode=");
        sbM94766o.append(animationModeModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public DynamicLottieModel(String str, List<SlotConfigModel> slots, Boolean bool, List<String> list, AnimationModeModel animationModeModel) {
        AbstractC22676k.m65750j(slots, "slots");
        this.overlayUrl = str;
        this.slots = slots;
        this.animated = bool;
        this.highlightGradient = list;
        this.animationMode = animationModeModel;
    }

    public /* synthetic */ DynamicLottieModel(String str, List list, Boolean bool, List list2, AnimationModeModel animationModeModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, bool, list2, animationModeModel);
    }
}
