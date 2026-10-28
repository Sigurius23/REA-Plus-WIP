package com.whoop.design.models;

import com.whoop.navigation.models.GenericInteraction;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/design/models/BinaryIconModel;", "", "Lcom/whoop/design/models/IconModel;", "selectedIcon", "unselectedIcon", "<init>", "(Lcom/whoop/design/models/IconModel;Lcom/whoop/design/models/IconModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/IconModel;Lcom/whoop/design/models/IconModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/BinaryIconModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/IconModel;", "component2", "copy", "(Lcom/whoop/design/models/IconModel;Lcom/whoop/design/models/IconModel;)Lcom/whoop/design/models/BinaryIconModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/IconModel;", "getSelectedIcon", "getUnselectedIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BinaryIconModel {
    private final IconModel selectedIcon;
    private final IconModel unselectedIcon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericInteraction.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/BinaryIconModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/BinaryIconModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BinaryIconModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BinaryIconModel(int i13, IconModel iconModel, IconModel iconModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, BinaryIconModel$$serializer.INSTANCE.getDescriptor());
        }
        this.selectedIcon = iconModel;
        this.unselectedIcon = iconModel2;
    }

    public static /* synthetic */ BinaryIconModel copy$default(BinaryIconModel binaryIconModel, IconModel iconModel, IconModel iconModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            iconModel = binaryIconModel.selectedIcon;
        }
        if ((i13 & 2) != 0) {
            iconModel2 = binaryIconModel.unselectedIcon;
        }
        return binaryIconModel.copy(iconModel, iconModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BinaryIconModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        IconModel$$serializer iconModel$$serializer = IconModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 0, iconModel$$serializer, self.selectedIcon);
        output.encodeSerializableElement(serialDesc, 1, iconModel$$serializer, self.unselectedIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final IconModel getSelectedIcon() {
        return this.selectedIcon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final IconModel getUnselectedIcon() {
        return this.unselectedIcon;
    }

    public final BinaryIconModel copy(IconModel selectedIcon, IconModel unselectedIcon) {
        AbstractC22676k.m65750j(selectedIcon, "selectedIcon");
        AbstractC22676k.m65750j(unselectedIcon, "unselectedIcon");
        return new BinaryIconModel(selectedIcon, unselectedIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BinaryIconModel)) {
            return false;
        }
        BinaryIconModel binaryIconModel = (BinaryIconModel) other;
        return AbstractC22676k.m65745e(this.selectedIcon, binaryIconModel.selectedIcon) && AbstractC22676k.m65745e(this.unselectedIcon, binaryIconModel.unselectedIcon);
    }

    public final IconModel getSelectedIcon() {
        return this.selectedIcon;
    }

    public final IconModel getUnselectedIcon() {
        return this.unselectedIcon;
    }

    public int hashCode() {
        return this.unselectedIcon.hashCode() + (this.selectedIcon.hashCode() * 31);
    }

    public String toString() {
        return "BinaryIconModel(selectedIcon=" + this.selectedIcon + ", unselectedIcon=" + this.unselectedIcon + ")";
    }

    public BinaryIconModel(IconModel selectedIcon, IconModel unselectedIcon) {
        AbstractC22676k.m65750j(selectedIcon, "selectedIcon");
        AbstractC22676k.m65750j(unselectedIcon, "unselectedIcon");
        this.selectedIcon = selectedIcon;
        this.unselectedIcon = unselectedIcon;
    }
}
