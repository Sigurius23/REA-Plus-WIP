package com.whoop.design.models.celebration;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotConfigModel;", "", "name", "", "mode", "Lcom/whoop/design/models/celebration/SlotModeModel;", "options", "Lcom/whoop/design/models/celebration/SlotOptionsModel;", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/celebration/SlotModeModel;Lcom/whoop/design/models/celebration/SlotOptionsModel;)V", "getName", "()Ljava/lang/String;", "getMode", "()Lcom/whoop/design/models/celebration/SlotModeModel;", "getOptions", "()Lcom/whoop/design/models/celebration/SlotOptionsModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = SlotConfigModelSerializer.class)
public final /* data */ class SlotConfigModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SlotModeModel mode;
    private final String name;
    private final SlotOptionsModel options;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/celebration/SlotConfigModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/celebration/SlotConfigModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SlotConfigModelSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SlotConfigModel(String name, SlotModeModel mode, SlotOptionsModel options) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(options, "options");
        this.name = name;
        this.mode = mode;
        this.options = options;
    }

    public static /* synthetic */ SlotConfigModel copy$default(SlotConfigModel slotConfigModel, String str, SlotModeModel slotModeModel, SlotOptionsModel slotOptionsModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = slotConfigModel.name;
        }
        if ((i13 & 2) != 0) {
            slotModeModel = slotConfigModel.mode;
        }
        if ((i13 & 4) != 0) {
            slotOptionsModel = slotConfigModel.options;
        }
        return slotConfigModel.copy(str, slotModeModel, slotOptionsModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SlotModeModel getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SlotOptionsModel getOptions() {
        return this.options;
    }

    public final SlotConfigModel copy(String name, SlotModeModel mode, SlotOptionsModel options) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(options, "options");
        return new SlotConfigModel(name, mode, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotConfigModel)) {
            return false;
        }
        SlotConfigModel slotConfigModel = (SlotConfigModel) other;
        return AbstractC22676k.m65745e(this.name, slotConfigModel.name) && this.mode == slotConfigModel.mode && AbstractC22676k.m65745e(this.options, slotConfigModel.options);
    }

    public final SlotModeModel getMode() {
        return this.mode;
    }

    public final String getName() {
        return this.name;
    }

    public final SlotOptionsModel getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.options.hashCode() + ((this.mode.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SlotConfigModel(name=" + this.name + ", mode=" + this.mode + ", options=" + this.options + ")";
    }
}
