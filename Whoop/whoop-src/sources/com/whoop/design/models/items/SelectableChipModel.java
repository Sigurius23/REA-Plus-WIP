package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,+B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ.\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001c¨\u0006-"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableChipModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "selectionId", "", "title", "", "selected", "<init>", "(ILjava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SelectableChipModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(ILjava/lang/String;Z)Lcom/whoop/design/models/items/SelectableChipModel;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getSelectionId", "Ljava/lang/String;", "getTitle", "Z", "getSelected", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectableChipModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean selected;
    private final int selectionId;
    private final String title;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SelectableChipModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SelectableChipModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectableChipModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public SelectableChipModel() {
        this(0, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SelectableChipModel copy$default(SelectableChipModel selectableChipModel, int i13, String str, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = selectableChipModel.selectionId;
        }
        if ((i14 & 2) != 0) {
            str = selectableChipModel.title;
        }
        if ((i14 & 4) != 0) {
            z4 = selectableChipModel.selected;
        }
        return selectableChipModel.copy(i13, str, z4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SelectableChipModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.selectionId != 0) {
            output.encodeIntElement(serialDesc, 0, self.selectionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 1, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.selected) {
            output.encodeBooleanElement(serialDesc, 2, self.selected);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSelectionId() {
        return this.selectionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final SelectableChipModel copy(int selectionId, String title, boolean selected) {
        AbstractC22676k.m65750j(title, "title");
        return new SelectableChipModel(selectionId, title, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableChipModel)) {
            return false;
        }
        SelectableChipModel selectableChipModel = (SelectableChipModel) other;
        return this.selectionId == selectableChipModel.selectionId && AbstractC22676k.m65745e(this.title, selectableChipModel.title) && this.selected == selectableChipModel.selected;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final int getSelectionId() {
        return this.selectionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d(Integer.hashCode(this.selectionId) * 31, 31, this.title);
    }

    public String toString() {
        int i13 = this.selectionId;
        String str = this.title;
        return AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i13, "SelectableChipModel(selectionId=", ", title=", str, ", selected="), this.selected, ")");
    }

    public /* synthetic */ SelectableChipModel(int i13, int i14, String str, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.selectionId = 0;
        } else {
            this.selectionId = i14;
        }
        if ((i13 & 2) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i13 & 4) == 0) {
            this.selected = false;
        } else {
            this.selected = z4;
        }
    }

    public SelectableChipModel(int i13, String title, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        this.selectionId = i13;
        this.title = title;
        this.selected = z4;
    }

    public /* synthetic */ SelectableChipModel(int i13, String str, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? false : z4);
    }
}
