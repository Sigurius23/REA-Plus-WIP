package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J@\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0018¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/SpacingInsets;", "", "Lcom/whoop/design/models/items/Spacing;", "top", "bottom", "leading", "trailing", "<init>", "(Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SpacingInsets;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/Spacing;", "component2", "component3", "component4", "copy", "(Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;Lcom/whoop/design/models/items/Spacing;)Lcom/whoop/design/models/items/SpacingInsets;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/Spacing;", "getTop", "getBottom", "getLeading", "getTrailing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SpacingInsets {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Spacing bottom;
    private final Spacing leading;
    private final Spacing top;
    private final Spacing trailing;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SpacingInsets$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SpacingInsets;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SpacingInsets$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C36963j(19)), AbstractC30060g.m92087G(enumC23463i, new C36963j(20)), AbstractC30060g.m92087G(enumC23463i, new C36963j(21)), AbstractC30060g.m92087G(enumC23463i, new C36963j(22))};
    }

    public SpacingInsets() {
        this((Spacing) null, (Spacing) null, (Spacing) null, (Spacing) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return Spacing.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return Spacing.INSTANCE.serializer();
    }

    public static /* synthetic */ SpacingInsets copy$default(SpacingInsets spacingInsets, Spacing spacing, Spacing spacing2, Spacing spacing3, Spacing spacing4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            spacing = spacingInsets.top;
        }
        if ((i13 & 2) != 0) {
            spacing2 = spacingInsets.bottom;
        }
        if ((i13 & 4) != 0) {
            spacing3 = spacingInsets.leading;
        }
        if ((i13 & 8) != 0) {
            spacing4 = spacingInsets.trailing;
        }
        return spacingInsets.copy(spacing, spacing2, spacing3, spacing4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SpacingInsets self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.top != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.top);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.bottom != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.bottom);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.leading != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.leading);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.trailing == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.trailing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Spacing getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Spacing getBottom() {
        return this.bottom;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Spacing getLeading() {
        return this.leading;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Spacing getTrailing() {
        return this.trailing;
    }

    public final SpacingInsets copy(Spacing top, Spacing bottom, Spacing leading, Spacing trailing) {
        return new SpacingInsets(top, bottom, leading, trailing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpacingInsets)) {
            return false;
        }
        SpacingInsets spacingInsets = (SpacingInsets) other;
        return this.top == spacingInsets.top && this.bottom == spacingInsets.bottom && this.leading == spacingInsets.leading && this.trailing == spacingInsets.trailing;
    }

    public final Spacing getBottom() {
        return this.bottom;
    }

    public final Spacing getLeading() {
        return this.leading;
    }

    public final Spacing getTop() {
        return this.top;
    }

    public final Spacing getTrailing() {
        return this.trailing;
    }

    public int hashCode() {
        Spacing spacing = this.top;
        int iHashCode = (spacing == null ? 0 : spacing.hashCode()) * 31;
        Spacing spacing2 = this.bottom;
        int iHashCode2 = (iHashCode + (spacing2 == null ? 0 : spacing2.hashCode())) * 31;
        Spacing spacing3 = this.leading;
        int iHashCode3 = (iHashCode2 + (spacing3 == null ? 0 : spacing3.hashCode())) * 31;
        Spacing spacing4 = this.trailing;
        return iHashCode3 + (spacing4 != null ? spacing4.hashCode() : 0);
    }

    public String toString() {
        return "SpacingInsets(top=" + this.top + ", bottom=" + this.bottom + ", leading=" + this.leading + ", trailing=" + this.trailing + ")";
    }

    public /* synthetic */ SpacingInsets(int i13, Spacing spacing, Spacing spacing2, Spacing spacing3, Spacing spacing4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.top = null;
        } else {
            this.top = spacing;
        }
        if ((i13 & 2) == 0) {
            this.bottom = null;
        } else {
            this.bottom = spacing2;
        }
        if ((i13 & 4) == 0) {
            this.leading = null;
        } else {
            this.leading = spacing3;
        }
        if ((i13 & 8) == 0) {
            this.trailing = null;
        } else {
            this.trailing = spacing4;
        }
    }

    public SpacingInsets(Spacing spacing, Spacing spacing2, Spacing spacing3, Spacing spacing4) {
        this.top = spacing;
        this.bottom = spacing2;
        this.leading = spacing3;
        this.trailing = spacing4;
    }

    public /* synthetic */ SpacingInsets(Spacing spacing, Spacing spacing2, Spacing spacing3, Spacing spacing4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : spacing, (i13 & 2) != 0 ? null : spacing2, (i13 & 4) != 0 ? null : spacing3, (i13 & 8) != 0 ? null : spacing4);
    }
}
