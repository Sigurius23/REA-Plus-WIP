package com.whoop.design.models.anchorSelector;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "", "", "nameDisplay", "id", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNameDisplay", "getId", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentedControlDisplayModel {
    private final AnalyticEventModel analyticEvent;
    private final String id;
    private final String nameDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/anchorSelector/SegmentedControlDisplayModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentedControlDisplayModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentedControlDisplayModel(int i13, String str, String str2, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SegmentedControlDisplayModel$$serializer.INSTANCE.getDescriptor());
        }
        this.nameDisplay = str;
        this.id = str2;
        if ((i13 & 4) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
    }

    public static /* synthetic */ SegmentedControlDisplayModel copy$default(SegmentedControlDisplayModel segmentedControlDisplayModel, String str, String str2, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = segmentedControlDisplayModel.nameDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = segmentedControlDisplayModel.id;
        }
        if ((i13 & 4) != 0) {
            analyticEventModel = segmentedControlDisplayModel.analyticEvent;
        }
        return segmentedControlDisplayModel.copy(str, str2, analyticEventModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(SegmentedControlDisplayModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.nameDisplay);
        output.encodeStringElement(serialDesc, 1, self.id);
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.analyticEvent == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNameDisplay() {
        return this.nameDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final SegmentedControlDisplayModel copy(String nameDisplay, String id4, AnalyticEventModel analyticEvent) {
        AbstractC22676k.m65750j(nameDisplay, "nameDisplay");
        AbstractC22676k.m65750j(id4, "id");
        return new SegmentedControlDisplayModel(nameDisplay, id4, analyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentedControlDisplayModel)) {
            return false;
        }
        SegmentedControlDisplayModel segmentedControlDisplayModel = (SegmentedControlDisplayModel) other;
        return AbstractC22676k.m65745e(this.nameDisplay, segmentedControlDisplayModel.nameDisplay) && AbstractC22676k.m65745e(this.id, segmentedControlDisplayModel.id) && AbstractC22676k.m65745e(this.analyticEvent, segmentedControlDisplayModel.analyticEvent);
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNameDisplay() {
        return this.nameDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.nameDisplay.hashCode() * 31, 31, this.id);
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        return iM30450d + (analyticEventModel == null ? 0 : analyticEventModel.hashCode());
    }

    public String toString() {
        String str = this.nameDisplay;
        String str2 = this.id;
        return AbstractC38963t7.m124378h(AbstractC11895b.m32001t("SegmentedControlDisplayModel(nameDisplay=", str, ", id=", str2, ", analyticEvent="), this.analyticEvent, ")");
    }

    public SegmentedControlDisplayModel(String nameDisplay, String id4, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(nameDisplay, "nameDisplay");
        AbstractC22676k.m65750j(id4, "id");
        this.nameDisplay = nameDisplay;
        this.id = id4;
        this.analyticEvent = analyticEventModel;
    }

    public /* synthetic */ SegmentedControlDisplayModel(String str, String str2, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : analyticEventModel);
    }
}
