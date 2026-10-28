package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w70.C36870a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J>\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/AnimatedSequenceStepModel;", "", "", "lottieUrl", "Lcom/whoop/design/models/DesignSystemModel;", "content", "", "minDurationMs", "Lcom/whoop/navigation/models/GenericInteraction;", "onStepCompleteInteraction", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/Long;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/Long;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AnimatedSequenceStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DesignSystemModel;", "component3", "()Ljava/lang/Long;", "component4", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/Long;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/items/AnimatedSequenceStepModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLottieUrl", "Lcom/whoop/design/models/DesignSystemModel;", "getContent", "Ljava/lang/Long;", "getMinDurationMs", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnStepCompleteInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnimatedSequenceStepModel {
    private final DesignSystemModel content;
    private final String lottieUrl;
    private final Long minDurationMs;
    private final GenericInteraction onStepCompleteInteraction;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36870a(20)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AnimatedSequenceStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AnimatedSequenceStepModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AnimatedSequenceStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AnimatedSequenceStepModel(int i13, String str, DesignSystemModel designSystemModel, Long l7, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, AnimatedSequenceStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.lottieUrl = str;
        if ((i13 & 2) == 0) {
            this.content = null;
        } else {
            this.content = designSystemModel;
        }
        if ((i13 & 4) == 0) {
            this.minDurationMs = null;
        } else {
            this.minDurationMs = l7;
        }
        if ((i13 & 8) == 0) {
            this.onStepCompleteInteraction = null;
        } else {
            this.onStepCompleteInteraction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ AnimatedSequenceStepModel copy$default(AnimatedSequenceStepModel animatedSequenceStepModel, String str, DesignSystemModel designSystemModel, Long l7, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = animatedSequenceStepModel.lottieUrl;
        }
        if ((i13 & 2) != 0) {
            designSystemModel = animatedSequenceStepModel.content;
        }
        if ((i13 & 4) != 0) {
            l7 = animatedSequenceStepModel.minDurationMs;
        }
        if ((i13 & 8) != 0) {
            genericInteraction = animatedSequenceStepModel.onStepCompleteInteraction;
        }
        return animatedSequenceStepModel.copy(str, designSystemModel, l7, genericInteraction);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AnimatedSequenceStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.lottieUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.content != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.content);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.minDurationMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.minDurationMs);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.onStepCompleteInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, GenericInteraction$$serializer.INSTANCE, self.onStepCompleteInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DesignSystemModel getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getMinDurationMs() {
        return this.minDurationMs;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final GenericInteraction getOnStepCompleteInteraction() {
        return this.onStepCompleteInteraction;
    }

    public final AnimatedSequenceStepModel copy(String lottieUrl, DesignSystemModel content, Long minDurationMs, GenericInteraction onStepCompleteInteraction) {
        AbstractC22676k.m65750j(lottieUrl, "lottieUrl");
        return new AnimatedSequenceStepModel(lottieUrl, content, minDurationMs, onStepCompleteInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimatedSequenceStepModel)) {
            return false;
        }
        AnimatedSequenceStepModel animatedSequenceStepModel = (AnimatedSequenceStepModel) other;
        return AbstractC22676k.m65745e(this.lottieUrl, animatedSequenceStepModel.lottieUrl) && AbstractC22676k.m65745e(this.content, animatedSequenceStepModel.content) && AbstractC22676k.m65745e(this.minDurationMs, animatedSequenceStepModel.minDurationMs) && AbstractC22676k.m65745e(this.onStepCompleteInteraction, animatedSequenceStepModel.onStepCompleteInteraction);
    }

    public final DesignSystemModel getContent() {
        return this.content;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final Long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final GenericInteraction getOnStepCompleteInteraction() {
        return this.onStepCompleteInteraction;
    }

    public int hashCode() {
        int iHashCode = this.lottieUrl.hashCode() * 31;
        DesignSystemModel designSystemModel = this.content;
        int iHashCode2 = (iHashCode + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        Long l7 = this.minDurationMs;
        int iHashCode3 = (iHashCode2 + (l7 == null ? 0 : l7.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onStepCompleteInteraction;
        return iHashCode3 + (genericInteraction != null ? genericInteraction.hashCode() : 0);
    }

    public String toString() {
        return "AnimatedSequenceStepModel(lottieUrl=" + this.lottieUrl + ", content=" + this.content + ", minDurationMs=" + this.minDurationMs + ", onStepCompleteInteraction=" + this.onStepCompleteInteraction + ")";
    }

    public AnimatedSequenceStepModel(String lottieUrl, DesignSystemModel designSystemModel, Long l7, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(lottieUrl, "lottieUrl");
        this.lottieUrl = lottieUrl;
        this.content = designSystemModel;
        this.minDurationMs = l7;
        this.onStepCompleteInteraction = genericInteraction;
    }

    public /* synthetic */ AnimatedSequenceStepModel(String str, DesignSystemModel designSystemModel, Long l7, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : designSystemModel, (i13 & 4) != 0 ? null : l7, (i13 & 8) != 0 ? null : genericInteraction);
    }
}
