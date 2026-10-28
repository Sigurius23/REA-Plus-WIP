package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.celebration.AnimationModeModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import nh3.AbstractC26725a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BE\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JN\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010$¨\u0006<"}, m65681d2 = {"Lcom/whoop/design/models/items/AnimatedSequenceModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;", "steps", "Lcom/whoop/design/models/celebration/AnimationModeModel;", "repeatMode", "", "height", "width", "Lcom/whoop/navigation/models/GenericInteraction;", "onCompleteInteraction", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AnimatedSequenceModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/celebration/AnimationModeModel;", "component3", "()Ljava/lang/Float;", "component4", "component5", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/celebration/AnimationModeModel;Ljava/lang/Float;Ljava/lang/Float;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/AnimatedSequenceModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSteps", "Lcom/whoop/design/models/celebration/AnimationModeModel;", "getRepeatMode", "Ljava/lang/Float;", "getHeight", "getWidth", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnCompleteInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnimatedSequenceModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final Float height;
    private final GenericInteraction onCompleteInteraction;
    private final AnimationModeModel repeatMode;
    private final List<AnimatedSequenceStepModel> steps;
    private final Float width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AnimatedSequenceModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AnimatedSequenceModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AnimatedSequenceModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36870a(18)), AbstractC30060g.m92087G(enumC23463i, new C36870a(19)), null, null, null};
    }

    public AnimatedSequenceModel() {
        this((List) null, (AnimationModeModel) null, (Float) null, (Float) null, (GenericInteraction) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AnimatedSequenceStepModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return AnimationModeModel.INSTANCE.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnimatedSequenceModel copy$default(AnimatedSequenceModel animatedSequenceModel, List list, AnimationModeModel animationModeModel, Float f13, Float f14, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = animatedSequenceModel.steps;
        }
        if ((i13 & 2) != 0) {
            animationModeModel = animatedSequenceModel.repeatMode;
        }
        if ((i13 & 4) != 0) {
            f13 = animatedSequenceModel.height;
        }
        if ((i13 & 8) != 0) {
            f14 = animatedSequenceModel.width;
        }
        if ((i13 & 16) != 0) {
            genericInteraction = animatedSequenceModel.onCompleteInteraction;
        }
        GenericInteraction genericInteraction2 = genericInteraction;
        Float f15 = f13;
        return animatedSequenceModel.copy(list, animationModeModel, f15, f14, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AnimatedSequenceModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.steps, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.steps);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.repeatMode != AnimationModeModel.PLAY_ONCE) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.repeatMode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.height != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.width != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.width);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.onCompleteInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, GenericInteraction$$serializer.INSTANCE, self.onCompleteInteraction);
    }

    public final List<AnimatedSequenceStepModel> component1() {
        return this.steps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnimationModeModel getRepeatMode() {
        return this.repeatMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GenericInteraction getOnCompleteInteraction() {
        return this.onCompleteInteraction;
    }

    public final AnimatedSequenceModel copy(List<AnimatedSequenceStepModel> steps, AnimationModeModel repeatMode, Float height, Float width, GenericInteraction onCompleteInteraction) {
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(repeatMode, "repeatMode");
        return new AnimatedSequenceModel(steps, repeatMode, height, width, onCompleteInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedSequenceModel)) {
            return false;
        }
        AnimatedSequenceModel animatedSequenceModel = (AnimatedSequenceModel) other;
        return AbstractC22676k.m65745e(this.steps, animatedSequenceModel.steps) && this.repeatMode == animatedSequenceModel.repeatMode && AbstractC22676k.m65745e(this.height, animatedSequenceModel.height) && AbstractC22676k.m65745e(this.width, animatedSequenceModel.width) && AbstractC22676k.m65745e(this.onCompleteInteraction, animatedSequenceModel.onCompleteInteraction);
    }

    public final Float getHeight() {
        return this.height;
    }

    public final GenericInteraction getOnCompleteInteraction() {
        return this.onCompleteInteraction;
    }

    public final AnimationModeModel getRepeatMode() {
        return this.repeatMode;
    }

    public final List<AnimatedSequenceStepModel> getSteps() {
        return this.steps;
    }

    public final Float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.repeatMode.hashCode() + (this.steps.hashCode() * 31)) * 31;
        Float f13 = this.height;
        int iHashCode2 = (iHashCode + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.width;
        int iHashCode3 = (iHashCode2 + (f14 == null ? 0 : f14.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onCompleteInteraction;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        List<AnimatedSequenceStepModel> list = this.steps;
        AnimationModeModel animationModeModel = this.repeatMode;
        Float f13 = this.height;
        Float f14 = this.width;
        GenericInteraction genericInteraction = this.onCompleteInteraction;
        StringBuilder sb4 = new StringBuilder("AnimatedSequenceModel(steps=");
        sb4.append(list);
        sb4.append(", repeatMode=");
        sb4.append(animationModeModel);
        sb4.append(", height=");
        sb4.append(f13);
        sb4.append(", width=");
        sb4.append(f14);
        sb4.append(", onCompleteInteraction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }

    public /* synthetic */ AnimatedSequenceModel(int i13, List list, AnimationModeModel animationModeModel, Float f13, Float f14, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        this.steps = (i13 & 1) == 0 ? C25271y.f99162w : list;
        if ((i13 & 2) == 0) {
            this.repeatMode = AnimationModeModel.PLAY_ONCE;
        } else {
            this.repeatMode = animationModeModel;
        }
        if ((i13 & 4) == 0) {
            this.height = null;
        } else {
            this.height = f13;
        }
        if ((i13 & 8) == 0) {
            this.width = null;
        } else {
            this.width = f14;
        }
        if ((i13 & 16) == 0) {
            this.onCompleteInteraction = null;
        } else {
            this.onCompleteInteraction = genericInteraction;
        }
    }

    public AnimatedSequenceModel(List<AnimatedSequenceStepModel> steps, AnimationModeModel repeatMode, Float f13, Float f14, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(steps, "steps");
        AbstractC22676k.m65750j(repeatMode, "repeatMode");
        this.steps = steps;
        this.repeatMode = repeatMode;
        this.height = f13;
        this.width = f14;
        this.onCompleteInteraction = genericInteraction;
    }

    public /* synthetic */ AnimatedSequenceModel(List list, AnimationModeModel animationModeModel, Float f13, Float f14, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C25271y.f99162w : list, (i13 & 2) != 0 ? AnimationModeModel.PLAY_ONCE : animationModeModel, (i13 & 4) != 0 ? null : f13, (i13 & 8) != 0 ? null : f14, (i13 & 16) != 0 ? null : genericInteraction);
    }
}
