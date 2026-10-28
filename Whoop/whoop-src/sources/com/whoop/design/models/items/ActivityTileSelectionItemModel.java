package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.util.TextResource;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "activity", "Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;", "selectableState", "<init>", "(Lcom/whoop/design/models/items/ActivityTileSelectionModel;Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/ActivityTileSelectionModel;Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "component2", "()Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;", "copy", "(Lcom/whoop/design/models/items/ActivityTileSelectionModel;Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;)Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/ActivityTileSelectionModel;", "getActivity", "Lcom/whoop/design/models/items/ActivityTileSelectionStateModel;", "getSelectableState", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivityTileSelectionItemModel implements DesignSystemModel {
    private final ActivityTileSelectionModel activity;
    private final ActivityTileSelectionStateModel selectableState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ActivityTileSelectionItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ActivityTileSelectionItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivityTileSelectionItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivityTileSelectionItemModel(int i13, ActivityTileSelectionModel activityTileSelectionModel, ActivityTileSelectionStateModel activityTileSelectionStateModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, ActivityTileSelectionItemModel$$serializer.INSTANCE.getDescriptor());
        }
        this.activity = activityTileSelectionModel;
        this.selectableState = activityTileSelectionStateModel;
    }

    public static /* synthetic */ ActivityTileSelectionItemModel copy$default(ActivityTileSelectionItemModel activityTileSelectionItemModel, ActivityTileSelectionModel activityTileSelectionModel, ActivityTileSelectionStateModel activityTileSelectionStateModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            activityTileSelectionModel = activityTileSelectionItemModel.activity;
        }
        if ((i13 & 2) != 0) {
            activityTileSelectionStateModel = activityTileSelectionItemModel.selectableState;
        }
        return activityTileSelectionItemModel.copy(activityTileSelectionModel, activityTileSelectionStateModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ActivityTileSelectionItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, ActivityTileSelectionModel$$serializer.INSTANCE, self.activity);
        output.encodeSerializableElement(serialDesc, 1, ActivityTileSelectionStateModel$$serializer.INSTANCE, self.selectableState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ActivityTileSelectionModel getActivity() {
        return this.activity;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ActivityTileSelectionStateModel getSelectableState() {
        return this.selectableState;
    }

    public final ActivityTileSelectionItemModel copy(ActivityTileSelectionModel activity, ActivityTileSelectionStateModel selectableState) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(selectableState, "selectableState");
        return new ActivityTileSelectionItemModel(activity, selectableState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityTileSelectionItemModel)) {
            return false;
        }
        ActivityTileSelectionItemModel activityTileSelectionItemModel = (ActivityTileSelectionItemModel) other;
        return AbstractC22676k.m65745e(this.activity, activityTileSelectionItemModel.activity) && AbstractC22676k.m65745e(this.selectableState, activityTileSelectionItemModel.selectableState);
    }

    public final ActivityTileSelectionModel getActivity() {
        return this.activity;
    }

    public final ActivityTileSelectionStateModel getSelectableState() {
        return this.selectableState;
    }

    public int hashCode() {
        return this.selectableState.hashCode() + (this.activity.hashCode() * 31);
    }

    public String toString() {
        return "ActivityTileSelectionItemModel(activity=" + this.activity + ", selectableState=" + this.selectableState + ")";
    }

    public ActivityTileSelectionItemModel(ActivityTileSelectionModel activity, ActivityTileSelectionStateModel selectableState) {
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(selectableState, "selectableState");
        this.activity = activity;
        this.selectableState = selectableState;
    }
}
