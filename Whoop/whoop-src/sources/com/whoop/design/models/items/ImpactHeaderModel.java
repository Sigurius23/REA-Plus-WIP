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
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b,\u0010\u0018¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactHeaderModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ImpactLabelModel;", "impactLabelLeft", "Lcom/whoop/design/util/TextResource;", "impactLabelCenter", "impactLabelRight", "<init>", "(Lcom/whoop/design/models/items/ImpactLabelModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactLabelModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ImpactLabelModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactLabelModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ImpactHeaderModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ImpactLabelModel;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "copy", "(Lcom/whoop/design/models/items/ImpactLabelModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactLabelModel;)Lcom/whoop/design/models/items/ImpactHeaderModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ImpactLabelModel;", "getImpactLabelLeft", "Lcom/whoop/design/util/TextResource;", "getImpactLabelCenter", "getImpactLabelRight", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ImpactHeaderModel implements DesignSystemModel {
    private final TextResource impactLabelCenter;
    private final ImpactLabelModel impactLabelLeft;
    private final ImpactLabelModel impactLabelRight;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ImpactHeaderModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ImpactHeaderModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ImpactHeaderModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImpactHeaderModel(int i13, ImpactLabelModel impactLabelModel, TextResource textResource, ImpactLabelModel impactLabelModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ImpactHeaderModel$$serializer.INSTANCE.getDescriptor());
        }
        this.impactLabelLeft = impactLabelModel;
        this.impactLabelCenter = textResource;
        this.impactLabelRight = impactLabelModel2;
    }

    public static /* synthetic */ ImpactHeaderModel copy$default(ImpactHeaderModel impactHeaderModel, ImpactLabelModel impactLabelModel, TextResource textResource, ImpactLabelModel impactLabelModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            impactLabelModel = impactHeaderModel.impactLabelLeft;
        }
        if ((i13 & 2) != 0) {
            textResource = impactHeaderModel.impactLabelCenter;
        }
        if ((i13 & 4) != 0) {
            impactLabelModel2 = impactHeaderModel.impactLabelRight;
        }
        return impactHeaderModel.copy(impactLabelModel, textResource, impactLabelModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ImpactHeaderModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        ImpactLabelModel$$serializer impactLabelModel$$serializer = ImpactLabelModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, impactLabelModel$$serializer, self.impactLabelLeft);
        output.encodeSerializableElement(serialDesc, 1, C25452a.f99689a, self.impactLabelCenter);
        output.encodeSerializableElement(serialDesc, 2, impactLabelModel$$serializer, self.impactLabelRight);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ImpactLabelModel getImpactLabelLeft() {
        return this.impactLabelLeft;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getImpactLabelCenter() {
        return this.impactLabelCenter;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImpactLabelModel getImpactLabelRight() {
        return this.impactLabelRight;
    }

    public final ImpactHeaderModel copy(ImpactLabelModel impactLabelLeft, TextResource impactLabelCenter, ImpactLabelModel impactLabelRight) {
        AbstractC22676k.m65750j(impactLabelLeft, "impactLabelLeft");
        AbstractC22676k.m65750j(impactLabelCenter, "impactLabelCenter");
        AbstractC22676k.m65750j(impactLabelRight, "impactLabelRight");
        return new ImpactHeaderModel(impactLabelLeft, impactLabelCenter, impactLabelRight);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImpactHeaderModel)) {
            return false;
        }
        ImpactHeaderModel impactHeaderModel = (ImpactHeaderModel) other;
        return AbstractC22676k.m65745e(this.impactLabelLeft, impactHeaderModel.impactLabelLeft) && AbstractC22676k.m65745e(this.impactLabelCenter, impactHeaderModel.impactLabelCenter) && AbstractC22676k.m65745e(this.impactLabelRight, impactHeaderModel.impactLabelRight);
    }

    public final TextResource getImpactLabelCenter() {
        return this.impactLabelCenter;
    }

    public final ImpactLabelModel getImpactLabelLeft() {
        return this.impactLabelLeft;
    }

    public final ImpactLabelModel getImpactLabelRight() {
        return this.impactLabelRight;
    }

    public int hashCode() {
        return this.impactLabelRight.hashCode() + AbstractC31061c.m95625a(this.impactLabelLeft.hashCode() * 31, this.impactLabelCenter, 31);
    }

    public String toString() {
        return "ImpactHeaderModel(impactLabelLeft=" + this.impactLabelLeft + ", impactLabelCenter=" + this.impactLabelCenter + ", impactLabelRight=" + this.impactLabelRight + ")";
    }

    public ImpactHeaderModel(ImpactLabelModel impactLabelLeft, TextResource impactLabelCenter, ImpactLabelModel impactLabelRight) {
        AbstractC22676k.m65750j(impactLabelLeft, "impactLabelLeft");
        AbstractC22676k.m65750j(impactLabelCenter, "impactLabelCenter");
        AbstractC22676k.m65750j(impactLabelRight, "impactLabelRight");
        this.impactLabelLeft = impactLabelLeft;
        this.impactLabelCenter = impactLabelCenter;
        this.impactLabelRight = impactLabelRight;
    }
}
