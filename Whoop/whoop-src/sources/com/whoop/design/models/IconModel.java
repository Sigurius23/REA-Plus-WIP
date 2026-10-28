package com.whoop.design.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/IconModel;", "", "Lgz0/m0;", "icon", "", "contentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "genericInteraction", "<init>", "(Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/IconModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lgz0/m0;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Lgz0/m0;Ljava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/design/models/IconModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lgz0/m0;", "getIcon", "Ljava/lang/String;", "getContentDescription", "Lcom/whoop/navigation/models/GenericInteraction;", "getGenericInteraction", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class IconModel {
    private final String contentDescription;
    private final GenericInteraction genericInteraction;
    private final EnumC16313m0 icon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6909a(2)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/IconModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/IconModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return IconModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ IconModel(int i13, EnumC16313m0 enumC16313m0, String str, GenericInteraction genericInteraction, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, IconModel$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = enumC16313m0;
        this.contentDescription = str;
        if ((i13 & 4) == 0) {
            this.genericInteraction = null;
        } else {
            this.genericInteraction = genericInteraction;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ IconModel copy$default(IconModel iconModel, EnumC16313m0 enumC16313m0, String str, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC16313m0 = iconModel.icon;
        }
        if ((i13 & 2) != 0) {
            str = iconModel.contentDescription;
        }
        if ((i13 & 4) != 0) {
            genericInteraction = iconModel.genericInteraction;
        }
        return iconModel.copy(enumC16313m0, str, genericInteraction);
    }

    public static final /* synthetic */ void write$Self$design_models_release(IconModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.icon);
        output.encodeStringElement(serialDesc, 1, self.contentDescription);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.genericInteraction == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, GenericInteraction$$serializer.INSTANCE, self.genericInteraction);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final IconModel copy(EnumC16313m0 icon, String contentDescription, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        return new IconModel(icon, contentDescription, genericInteraction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconModel)) {
            return false;
        }
        IconModel iconModel = (IconModel) other;
        return this.icon == iconModel.icon && AbstractC22676k.m65745e(this.contentDescription, iconModel.contentDescription) && AbstractC22676k.m65745e(this.genericInteraction, iconModel.genericInteraction);
    }

    public final String getContentDescription() {
        return this.contentDescription;
    }

    public final GenericInteraction getGenericInteraction() {
        return this.genericInteraction;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.icon.hashCode() * 31, 31, this.contentDescription);
        GenericInteraction genericInteraction = this.genericInteraction;
        return iM30450d + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public String toString() {
        EnumC16313m0 enumC16313m0 = this.icon;
        String str = this.contentDescription;
        GenericInteraction genericInteraction = this.genericInteraction;
        StringBuilder sb4 = new StringBuilder("IconModel(icon=");
        sb4.append(enumC16313m0);
        sb4.append(", contentDescription=");
        sb4.append(str);
        sb4.append(", genericInteraction=");
        return AbstractC26725a.m79506j(sb4, genericInteraction, ")");
    }

    public IconModel(EnumC16313m0 icon, String contentDescription, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        this.icon = icon;
        this.contentDescription = contentDescription;
        this.genericInteraction = genericInteraction;
    }

    public /* synthetic */ IconModel(EnumC16313m0 enumC16313m0, String str, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC16313m0, str, (i13 & 4) != 0 ? null : genericInteraction);
    }
}
