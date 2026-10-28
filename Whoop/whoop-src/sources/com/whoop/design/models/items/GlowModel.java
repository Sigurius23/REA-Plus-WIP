package com.whoop.design.models.items;

import com.whoop.design.atomic.atom.icon.GlowStyle;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36958e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0019¨\u0006*"}, m65681d2 = {"Lcom/whoop/design/models/items/GlowModel;", "", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "style", "", "doesPulse", "<init>", "(Lcom/whoop/design/atomic/atom/icon/GlowStyle;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/atomic/atom/icon/GlowStyle;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/GlowModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "component2", "()Z", "copy", "(Lcom/whoop/design/atomic/atom/icon/GlowStyle;Z)Lcom/whoop/design/models/items/GlowModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/atomic/atom/icon/GlowStyle;", "getStyle", "Z", "getDoesPulse", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GlowModel {
    public static final int $stable = 0;
    private final boolean doesPulse;
    private final GlowStyle style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36958e(1)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/GlowModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/GlowModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GlowModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GlowModel() {
        this((GlowStyle) null, false, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return GlowStyle.INSTANCE.serializer();
    }

    public static /* synthetic */ GlowModel copy$default(GlowModel glowModel, GlowStyle glowStyle, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            glowStyle = glowModel.style;
        }
        if ((i13 & 2) != 0) {
            z4 = glowModel.doesPulse;
        }
        return glowModel.copy(glowStyle, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GlowModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.doesPulse) {
            output.encodeBooleanElement(serialDesc, 1, self.doesPulse);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GlowStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDoesPulse() {
        return this.doesPulse;
    }

    public final GlowModel copy(GlowStyle style, boolean doesPulse) {
        return new GlowModel(style, doesPulse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlowModel)) {
            return false;
        }
        GlowModel glowModel = (GlowModel) other;
        return this.style == glowModel.style && this.doesPulse == glowModel.doesPulse;
    }

    public final boolean getDoesPulse() {
        return this.doesPulse;
    }

    public final GlowStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        GlowStyle glowStyle = this.style;
        return Boolean.hashCode(this.doesPulse) + ((glowStyle == null ? 0 : glowStyle.hashCode()) * 31);
    }

    public String toString() {
        return "GlowModel(style=" + this.style + ", doesPulse=" + this.doesPulse + ")";
    }

    public /* synthetic */ GlowModel(int i13, GlowStyle glowStyle, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        this.style = (i13 & 1) == 0 ? null : glowStyle;
        if ((i13 & 2) == 0) {
            this.doesPulse = false;
        } else {
            this.doesPulse = z4;
        }
    }

    public GlowModel(GlowStyle glowStyle, boolean z4) {
        this.style = glowStyle;
        this.doesPulse = z4;
    }

    public /* synthetic */ GlowModel(GlowStyle glowStyle, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : glowStyle, (i13 & 2) != 0 ? false : z4);
    }
}
