package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b\u0005\u0010\u0019¨\u0006)"}, m65681d2 = {"Lcom/whoop/design/models/items/TickMarkStateModel;", "", "Lcom/whoop/design/models/items/TickMarkStyle;", "style", "", "isToday", "<init>", "(Lcom/whoop/design/models/items/TickMarkStyle;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/TickMarkStyle;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TickMarkStateModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/TickMarkStyle;", "component2", "()Ljava/lang/Boolean;", "copy", "(Lcom/whoop/design/models/items/TickMarkStyle;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/TickMarkStateModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/TickMarkStyle;", "getStyle", "Ljava/lang/Boolean;", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TickMarkStateModel {
    public static final int $stable = 0;
    private final Boolean isToday;
    private final TickMarkStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36964k(16)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TickMarkStateModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TickMarkStateModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TickMarkStateModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TickMarkStateModel(int i13, TickMarkStyle tickMarkStyle, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TickMarkStateModel$$serializer.INSTANCE.getDescriptor());
        }
        this.style = tickMarkStyle;
        this.isToday = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TickMarkStyle", TickMarkStyle.values());
    }

    public static /* synthetic */ TickMarkStateModel copy$default(TickMarkStateModel tickMarkStateModel, TickMarkStyle tickMarkStyle, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            tickMarkStyle = tickMarkStateModel.style;
        }
        if ((i13 & 2) != 0) {
            bool = tickMarkStateModel.isToday;
        }
        return tickMarkStateModel.copy(tickMarkStyle, bool);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TickMarkStateModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 1, BooleanSerializer.INSTANCE, self.isToday);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TickMarkStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsToday() {
        return this.isToday;
    }

    public final TickMarkStateModel copy(TickMarkStyle style, Boolean isToday) {
        AbstractC22676k.m65750j(style, "style");
        return new TickMarkStateModel(style, isToday);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickMarkStateModel)) {
            return false;
        }
        TickMarkStateModel tickMarkStateModel = (TickMarkStateModel) other;
        return this.style == tickMarkStateModel.style && AbstractC22676k.m65745e(this.isToday, tickMarkStateModel.isToday);
    }

    public final TickMarkStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        Boolean bool = this.isToday;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean isToday() {
        return this.isToday;
    }

    public String toString() {
        return "TickMarkStateModel(style=" + this.style + ", isToday=" + this.isToday + ")";
    }

    public TickMarkStateModel(TickMarkStyle style, Boolean bool) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.isToday = bool;
    }
}
