package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J4\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010\u0017¨\u0006+"}, m65681d2 = {"Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "", "Lcom/whoop/analytics/AnalyticEventModel;", ProfileAnalyticsKt.VIEW, "cta", "dismiss", "<init>", "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/analytics/AnalyticEventModel;", "component2", "component3", "copy", "(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/analytics/AnalyticEventModel;", "getView", "getCta", "getDismiss", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EntryPointAnalyticEventsModel {
    private final AnalyticEventModel cta;
    private final AnalyticEventModel dismiss;
    private final AnalyticEventModel view;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/EntryPointAnalyticEventsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EntryPointAnalyticEventsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EntryPointAnalyticEventsModel(int i13, AnalyticEventModel analyticEventModel, AnalyticEventModel analyticEventModel2, AnalyticEventModel analyticEventModel3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, EntryPointAnalyticEventsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.view = analyticEventModel;
        this.cta = analyticEventModel2;
        this.dismiss = analyticEventModel3;
    }

    public static /* synthetic */ EntryPointAnalyticEventsModel copy$default(EntryPointAnalyticEventsModel entryPointAnalyticEventsModel, AnalyticEventModel analyticEventModel, AnalyticEventModel analyticEventModel2, AnalyticEventModel analyticEventModel3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            analyticEventModel = entryPointAnalyticEventsModel.view;
        }
        if ((i13 & 2) != 0) {
            analyticEventModel2 = entryPointAnalyticEventsModel.cta;
        }
        if ((i13 & 4) != 0) {
            analyticEventModel3 = entryPointAnalyticEventsModel.dismiss;
        }
        return entryPointAnalyticEventsModel.copy(analyticEventModel, analyticEventModel2, analyticEventModel3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(EntryPointAnalyticEventsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        AnalyticEventModel$$serializer analyticEventModel$$serializer = AnalyticEventModel$$serializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, analyticEventModel$$serializer, self.view);
        output.encodeNullableSerializableElement(serialDesc, 1, analyticEventModel$$serializer, self.cta);
        output.encodeNullableSerializableElement(serialDesc, 2, analyticEventModel$$serializer, self.dismiss);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticEventModel getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnalyticEventModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnalyticEventModel getDismiss() {
        return this.dismiss;
    }

    public final EntryPointAnalyticEventsModel copy(AnalyticEventModel view, AnalyticEventModel cta, AnalyticEventModel dismiss) {
        return new EntryPointAnalyticEventsModel(view, cta, dismiss);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryPointAnalyticEventsModel)) {
            return false;
        }
        EntryPointAnalyticEventsModel entryPointAnalyticEventsModel = (EntryPointAnalyticEventsModel) other;
        return AbstractC22676k.m65745e(this.view, entryPointAnalyticEventsModel.view) && AbstractC22676k.m65745e(this.cta, entryPointAnalyticEventsModel.cta) && AbstractC22676k.m65745e(this.dismiss, entryPointAnalyticEventsModel.dismiss);
    }

    public final AnalyticEventModel getCta() {
        return this.cta;
    }

    public final AnalyticEventModel getDismiss() {
        return this.dismiss;
    }

    public final AnalyticEventModel getView() {
        return this.view;
    }

    public int hashCode() {
        AnalyticEventModel analyticEventModel = this.view;
        int iHashCode = (analyticEventModel == null ? 0 : analyticEventModel.hashCode()) * 31;
        AnalyticEventModel analyticEventModel2 = this.cta;
        int iHashCode2 = (iHashCode + (analyticEventModel2 == null ? 0 : analyticEventModel2.hashCode())) * 31;
        AnalyticEventModel analyticEventModel3 = this.dismiss;
        return iHashCode2 + (analyticEventModel3 != null ? analyticEventModel3.hashCode() : 0);
    }

    public String toString() {
        AnalyticEventModel analyticEventModel = this.view;
        AnalyticEventModel analyticEventModel2 = this.cta;
        AnalyticEventModel analyticEventModel3 = this.dismiss;
        StringBuilder sb4 = new StringBuilder("EntryPointAnalyticEventsModel(view=");
        sb4.append(analyticEventModel);
        sb4.append(", cta=");
        sb4.append(analyticEventModel2);
        sb4.append(", dismiss=");
        return AbstractC38963t7.m124378h(sb4, analyticEventModel3, ")");
    }

    public EntryPointAnalyticEventsModel(AnalyticEventModel analyticEventModel, AnalyticEventModel analyticEventModel2, AnalyticEventModel analyticEventModel3) {
        this.view = analyticEventModel;
        this.cta = analyticEventModel2;
        this.dismiss = analyticEventModel3;
    }
}
