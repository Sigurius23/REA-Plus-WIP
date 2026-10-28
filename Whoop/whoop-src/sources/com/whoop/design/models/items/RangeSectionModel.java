package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u001a¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/RangeSectionModel;", "", "Lcom/whoop/design/models/items/RangeSectionStyle;", "style", "", "start", "end", "<init>", "(Lcom/whoop/design/models/items/RangeSectionStyle;FF)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/RangeSectionStyle;FFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/RangeSectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/RangeSectionStyle;", "component2", "()F", "component3", "copy", "(Lcom/whoop/design/models/items/RangeSectionStyle;FF)Lcom/whoop/design/models/items/RangeSectionModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/RangeSectionStyle;", "getStyle", "F", "getStart", "getEnd", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RangeSectionModel {
    public static final int $stable = 0;
    private final float end;
    private final float start;
    private final RangeSectionStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(11)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/RangeSectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/RangeSectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RangeSectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RangeSectionModel(int i13, RangeSectionStyle rangeSectionStyle, float f13, float f14, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, RangeSectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.style = rangeSectionStyle;
        this.start = f13;
        this.end = f14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.RangeSectionStyle", RangeSectionStyle.values());
    }

    public static /* synthetic */ RangeSectionModel copy$default(RangeSectionModel rangeSectionModel, RangeSectionStyle rangeSectionStyle, float f13, float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            rangeSectionStyle = rangeSectionModel.style;
        }
        if ((i13 & 2) != 0) {
            f13 = rangeSectionModel.start;
        }
        if ((i13 & 4) != 0) {
            f14 = rangeSectionModel.end;
        }
        return rangeSectionModel.copy(rangeSectionStyle, f13, f14);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RangeSectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.style);
        output.encodeFloatElement(serialDesc, 1, self.start);
        output.encodeFloatElement(serialDesc, 2, self.end);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RangeSectionStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    public final RangeSectionModel copy(RangeSectionStyle style, float start, float end) {
        AbstractC22676k.m65750j(style, "style");
        return new RangeSectionModel(style, start, end);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeSectionModel)) {
            return false;
        }
        RangeSectionModel rangeSectionModel = (RangeSectionModel) other;
        return this.style == rangeSectionModel.style && Float.compare(this.start, rangeSectionModel.start) == 0 && Float.compare(this.end, rangeSectionModel.end) == 0;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public final RangeSectionStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return Float.hashCode(this.end) + AbstractC11266d.m30447a(this.start, this.style.hashCode() * 31, 31);
    }

    public String toString() {
        RangeSectionStyle rangeSectionStyle = this.style;
        float f13 = this.start;
        float f14 = this.end;
        StringBuilder sb4 = new StringBuilder("RangeSectionModel(style=");
        sb4.append(rangeSectionStyle);
        sb4.append(", start=");
        sb4.append(f13);
        sb4.append(", end=");
        return AbstractC30007c.m91837g(f14, ")", sb4);
    }

    public RangeSectionModel(RangeSectionStyle style, float f13, float f14) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.start = f13;
        this.end = f14;
    }
}
