package com.whoop.design.models.cards;

import com.whoop.design.models.items.ImpactModel;
import com.whoop.design.models.items.ImpactModel$$serializer;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "", "Lcom/whoop/design/util/TextResource;", "title", "magnitude", "magnitudeSuffix", "Lcom/whoop/design/models/items/ImpactModel;", "trend", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/ImpactModel;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getTitle", "getMagnitude", "getMagnitudeSuffix", "Lcom/whoop/design/models/items/ImpactModel;", "getTrend", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphDescriptionCardBodyModel {
    public static final int $stable;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final TextResource magnitude;
    private final TextResource magnitudeSuffix;
    private final TextResource title;
    private final ImpactModel trend;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/cards/GraphDescriptionCardBodyModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphDescriptionCardBodyModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        int i13 = C9598e.f28134d;
        int i14 = TextResource.$stable;
        $stable = i13 | i14 | i14 | i14;
    }

    public /* synthetic */ GraphDescriptionCardBodyModel(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, ImpactModel impactModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, GraphDescriptionCardBodyModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = textResource;
        this.magnitude = textResource2;
        this.magnitudeSuffix = textResource3;
        this.trend = impactModel;
    }

    public static /* synthetic */ GraphDescriptionCardBodyModel copy$default(GraphDescriptionCardBodyModel graphDescriptionCardBodyModel, TextResource textResource, TextResource textResource2, TextResource textResource3, ImpactModel impactModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = graphDescriptionCardBodyModel.title;
        }
        if ((i13 & 2) != 0) {
            textResource2 = graphDescriptionCardBodyModel.magnitude;
        }
        if ((i13 & 4) != 0) {
            textResource3 = graphDescriptionCardBodyModel.magnitudeSuffix;
        }
        if ((i13 & 8) != 0) {
            impactModel = graphDescriptionCardBodyModel.trend;
        }
        return graphDescriptionCardBodyModel.copy(textResource, textResource2, textResource3, impactModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphDescriptionCardBodyModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.title);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.magnitude);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.magnitudeSuffix);
        output.encodeNullableSerializableElement(serialDesc, 3, ImpactModel$$serializer.INSTANCE, self.trend);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getMagnitudeSuffix() {
        return this.magnitudeSuffix;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ImpactModel getTrend() {
        return this.trend;
    }

    public final GraphDescriptionCardBodyModel copy(TextResource title, TextResource magnitude, TextResource magnitudeSuffix, ImpactModel trend) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(magnitude, "magnitude");
        AbstractC22676k.m65750j(magnitudeSuffix, "magnitudeSuffix");
        return new GraphDescriptionCardBodyModel(title, magnitude, magnitudeSuffix, trend);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphDescriptionCardBodyModel)) {
            return false;
        }
        GraphDescriptionCardBodyModel graphDescriptionCardBodyModel = (GraphDescriptionCardBodyModel) other;
        return AbstractC22676k.m65745e(this.title, graphDescriptionCardBodyModel.title) && AbstractC22676k.m65745e(this.magnitude, graphDescriptionCardBodyModel.magnitude) && AbstractC22676k.m65745e(this.magnitudeSuffix, graphDescriptionCardBodyModel.magnitudeSuffix) && AbstractC22676k.m65745e(this.trend, graphDescriptionCardBodyModel.trend);
    }

    public final TextResource getMagnitude() {
        return this.magnitude;
    }

    public final TextResource getMagnitudeSuffix() {
        return this.magnitudeSuffix;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public final ImpactModel getTrend() {
        return this.trend;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.title.hashCode() * 31, this.magnitude, 31), this.magnitudeSuffix, 31);
        ImpactModel impactModel = this.trend;
        return iM95625a + (impactModel == null ? 0 : impactModel.hashCode());
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.magnitude;
        TextResource textResource3 = this.magnitudeSuffix;
        ImpactModel impactModel = this.trend;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("GraphDescriptionCardBodyModel(title=", textResource, ", magnitude=", textResource2, ", magnitudeSuffix=");
        sbM106658q.append(textResource3);
        sbM106658q.append(", trend=");
        sbM106658q.append(impactModel);
        sbM106658q.append(")");
        return sbM106658q.toString();
    }

    public GraphDescriptionCardBodyModel(TextResource title, TextResource magnitude, TextResource magnitudeSuffix, ImpactModel impactModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(magnitude, "magnitude");
        AbstractC22676k.m65750j(magnitudeSuffix, "magnitudeSuffix");
        this.title = title;
        this.magnitude = magnitude;
        this.magnitudeSuffix = magnitudeSuffix;
        this.trend = impactModel;
    }
}
