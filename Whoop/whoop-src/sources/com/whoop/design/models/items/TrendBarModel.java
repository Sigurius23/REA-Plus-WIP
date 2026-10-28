package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/TrendBarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/TrendBarType;", "segments", "currentPosition", "<init>", "(Ljava/util/List;Lcom/whoop/design/models/items/TrendBarType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/design/models/items/TrendBarType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TrendBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/design/models/items/TrendBarType;", "copy", "(Ljava/util/List;Lcom/whoop/design/models/items/TrendBarType;)Lcom/whoop/design/models/items/TrendBarModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSegments", "Lcom/whoop/design/models/items/TrendBarType;", "getCurrentPosition", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrendBarModel implements DesignSystemModel {
    private final TrendBarType currentPosition;
    private final List<TrendBarType> segments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(25)), null};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TrendBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TrendBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrendBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TrendBarModel(int i13, List list, TrendBarType trendBarType, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, TrendBarModel$$serializer.INSTANCE.getDescriptor());
        }
        this.segments = list;
        if ((i13 & 2) == 0) {
            this.currentPosition = null;
        } else {
            this.currentPosition = trendBarType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrendBarType$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendBarModel copy$default(TrendBarModel trendBarModel, List list, TrendBarType trendBarType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = trendBarModel.segments;
        }
        if ((i13 & 2) != 0) {
            trendBarType = trendBarModel.currentPosition;
        }
        return trendBarModel.copy(list, trendBarType);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TrendBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.segments);
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.currentPosition == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, TrendBarType$$serializer.INSTANCE, self.currentPosition);
    }

    public final List<TrendBarType> component1() {
        return this.segments;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TrendBarType getCurrentPosition() {
        return this.currentPosition;
    }

    public final TrendBarModel copy(List<TrendBarType> segments, TrendBarType currentPosition) {
        AbstractC22676k.m65750j(segments, "segments");
        return new TrendBarModel(segments, currentPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrendBarModel)) {
            return false;
        }
        TrendBarModel trendBarModel = (TrendBarModel) other;
        return AbstractC22676k.m65745e(this.segments, trendBarModel.segments) && AbstractC22676k.m65745e(this.currentPosition, trendBarModel.currentPosition);
    }

    public final TrendBarType getCurrentPosition() {
        return this.currentPosition;
    }

    public final List<TrendBarType> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        int iHashCode = this.segments.hashCode() * 31;
        TrendBarType trendBarType = this.currentPosition;
        return iHashCode + (trendBarType == null ? 0 : trendBarType.hashCode());
    }

    public String toString() {
        return "TrendBarModel(segments=" + this.segments + ", currentPosition=" + this.currentPosition + ")";
    }

    public TrendBarModel(List<TrendBarType> segments, TrendBarType trendBarType) {
        AbstractC22676k.m65750j(segments, "segments");
        this.segments = segments;
        this.currentPosition = trendBarType;
    }

    public /* synthetic */ TrendBarModel(List list, TrendBarType trendBarType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : trendBarType);
    }
}
