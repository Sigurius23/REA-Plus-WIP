package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorDetailsTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "impactCard", "", "impactAdditionalDetails", "<init>", "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BehaviorDetailsTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "component2", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;Ljava/util/List;)Lcom/whoop/design/models/items/BehaviorDetailsTileModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/BehaviorDetailsTileImpactCard;", "getImpactCard", "Ljava/util/List;", "getImpactAdditionalDetails", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BehaviorDetailsTileModel implements DesignSystemModel {
    private final List<DesignSystemModel> impactAdditionalDetails;
    private final BehaviorDetailsTileImpactCard impactCard;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(9))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BehaviorDetailsTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BehaviorDetailsTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BehaviorDetailsTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BehaviorDetailsTileModel(int i13, BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, BehaviorDetailsTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.impactCard = behaviorDetailsTileImpactCard;
        if ((i13 & 2) == 0) {
            this.impactAdditionalDetails = C25271y.f99162w;
        } else {
            this.impactAdditionalDetails = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BehaviorDetailsTileModel copy$default(BehaviorDetailsTileModel behaviorDetailsTileModel, BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            behaviorDetailsTileImpactCard = behaviorDetailsTileModel.impactCard;
        }
        if ((i13 & 2) != 0) {
            list = behaviorDetailsTileModel.impactAdditionalDetails;
        }
        return behaviorDetailsTileModel.copy(behaviorDetailsTileImpactCard, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BehaviorDetailsTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, BehaviorDetailsTileImpactCard$$serializer.INSTANCE, self.impactCard);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && AbstractC22676k.m65745e(self.impactAdditionalDetails, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.impactAdditionalDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BehaviorDetailsTileImpactCard getImpactCard() {
        return this.impactCard;
    }

    public final List<DesignSystemModel> component2() {
        return this.impactAdditionalDetails;
    }

    public final BehaviorDetailsTileModel copy(BehaviorDetailsTileImpactCard impactCard, List<? extends DesignSystemModel> impactAdditionalDetails) {
        AbstractC22676k.m65750j(impactCard, "impactCard");
        AbstractC22676k.m65750j(impactAdditionalDetails, "impactAdditionalDetails");
        return new BehaviorDetailsTileModel(impactCard, impactAdditionalDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BehaviorDetailsTileModel)) {
            return false;
        }
        BehaviorDetailsTileModel behaviorDetailsTileModel = (BehaviorDetailsTileModel) other;
        return AbstractC22676k.m65745e(this.impactCard, behaviorDetailsTileModel.impactCard) && AbstractC22676k.m65745e(this.impactAdditionalDetails, behaviorDetailsTileModel.impactAdditionalDetails);
    }

    public final List<DesignSystemModel> getImpactAdditionalDetails() {
        return this.impactAdditionalDetails;
    }

    public final BehaviorDetailsTileImpactCard getImpactCard() {
        return this.impactCard;
    }

    public int hashCode() {
        return this.impactAdditionalDetails.hashCode() + (this.impactCard.hashCode() * 31);
    }

    public String toString() {
        return "BehaviorDetailsTileModel(impactCard=" + this.impactCard + ", impactAdditionalDetails=" + this.impactAdditionalDetails + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BehaviorDetailsTileModel(BehaviorDetailsTileImpactCard impactCard, List<? extends DesignSystemModel> impactAdditionalDetails) {
        AbstractC22676k.m65750j(impactCard, "impactCard");
        AbstractC22676k.m65750j(impactAdditionalDetails, "impactAdditionalDetails");
        this.impactCard = impactCard;
        this.impactAdditionalDetails = impactAdditionalDetails;
    }

    public /* synthetic */ BehaviorDetailsTileModel(BehaviorDetailsTileImpactCard behaviorDetailsTileImpactCard, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(behaviorDetailsTileImpactCard, (i13 & 2) != 0 ? C25271y.f99162w : list);
    }
}
