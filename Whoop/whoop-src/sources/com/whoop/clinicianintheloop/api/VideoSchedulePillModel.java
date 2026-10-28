package com.whoop.clinicianintheloop.api;

import c13.AbstractC3855a;
import com.whoop.design.models.DateDisplay;
import com.whoop.design.models.DateDisplay$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gm2.C15999a;
import h11.EnumC16612g;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eBY\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b%\u0010$JP\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001eJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010\"R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010$R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b7\u0010$¨\u0006;"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;", "", "", "selectionDisplay", "Lcom/whoop/design/models/DateDisplay;", "dateDisplay", "Lh11/g;", "style", "", "Lcom/whoop/design/models/DesignSystemModel;", "topItems", "Lcom/whoop/clinicianintheloop/api/VideoScheduleSection;", "scheduleSections", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/DateDisplay;", "component3", "()Lh11/g;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/DateDisplay;Lh11/g;Ljava/util/List;Ljava/util/List;)Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectionDisplay", "Lcom/whoop/design/models/DateDisplay;", "getDateDisplay", "Lh11/g;", "getStyle", "Ljava/util/List;", "getTopItems", "getScheduleSections", "Companion", "$serializer", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class VideoSchedulePillModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final DateDisplay dateDisplay;
    private final List<VideoScheduleSection> scheduleSections;
    private final String selectionDisplay;
    private final EnumC16612g style;
    private final List<DesignSystemModel> topItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.VideoSchedulePillModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulePillModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return VideoSchedulePillModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C15999a(16)), AbstractC30060g.m92087G(enumC23463i, new C15999a(17)), AbstractC30060g.m92087G(enumC23463i, new C15999a(18))};
    }

    public /* synthetic */ VideoSchedulePillModel(int i13, String str, DateDisplay dateDisplay, EnumC16612g enumC16612g, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, VideoSchedulePillModel$$serializer.INSTANCE.getDescriptor());
        }
        this.selectionDisplay = str;
        this.dateDisplay = dateDisplay;
        this.style = enumC16612g;
        this.topItems = list;
        this.scheduleSections = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.datepill.DatePillStyle", EnumC16612g.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(VideoScheduleSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VideoSchedulePillModel copy$default(VideoSchedulePillModel videoSchedulePillModel, String str, DateDisplay dateDisplay, EnumC16612g enumC16612g, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoSchedulePillModel.selectionDisplay;
        }
        if ((i13 & 2) != 0) {
            dateDisplay = videoSchedulePillModel.dateDisplay;
        }
        if ((i13 & 4) != 0) {
            enumC16612g = videoSchedulePillModel.style;
        }
        if ((i13 & 8) != 0) {
            list = videoSchedulePillModel.topItems;
        }
        if ((i13 & 16) != 0) {
            list2 = videoSchedulePillModel.scheduleSections;
        }
        List list3 = list2;
        EnumC16612g enumC16612g2 = enumC16612g;
        return videoSchedulePillModel.copy(str, dateDisplay, enumC16612g2, list, list3);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(VideoSchedulePillModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.selectionDisplay);
        output.encodeSerializableElement(serialDesc, 1, DateDisplay$$serializer.INSTANCE, self.dateDisplay);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.topItems);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.scheduleSections);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectionDisplay() {
        return this.selectionDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC16612g getStyle() {
        return this.style;
    }

    public final List<DesignSystemModel> component4() {
        return this.topItems;
    }

    public final List<VideoScheduleSection> component5() {
        return this.scheduleSections;
    }

    public final VideoSchedulePillModel copy(String selectionDisplay, DateDisplay dateDisplay, EnumC16612g style, List<? extends DesignSystemModel> topItems, List<VideoScheduleSection> scheduleSections) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(scheduleSections, "scheduleSections");
        return new VideoSchedulePillModel(selectionDisplay, dateDisplay, style, topItems, scheduleSections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSchedulePillModel)) {
            return false;
        }
        VideoSchedulePillModel videoSchedulePillModel = (VideoSchedulePillModel) other;
        return AbstractC22676k.m65745e(this.selectionDisplay, videoSchedulePillModel.selectionDisplay) && AbstractC22676k.m65745e(this.dateDisplay, videoSchedulePillModel.dateDisplay) && this.style == videoSchedulePillModel.style && AbstractC22676k.m65745e(this.topItems, videoSchedulePillModel.topItems) && AbstractC22676k.m65745e(this.scheduleSections, videoSchedulePillModel.scheduleSections);
    }

    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    public final List<VideoScheduleSection> getScheduleSections() {
        return this.scheduleSections;
    }

    public final String getSelectionDisplay() {
        return this.selectionDisplay;
    }

    public final EnumC16612g getStyle() {
        return this.style;
    }

    public final List<DesignSystemModel> getTopItems() {
        return this.topItems;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + ((this.dateDisplay.hashCode() + (this.selectionDisplay.hashCode() * 31)) * 31)) * 31;
        List<DesignSystemModel> list = this.topItems;
        return this.scheduleSections.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        String str = this.selectionDisplay;
        DateDisplay dateDisplay = this.dateDisplay;
        EnumC16612g enumC16612g = this.style;
        List<DesignSystemModel> list = this.topItems;
        List<VideoScheduleSection> list2 = this.scheduleSections;
        StringBuilder sb4 = new StringBuilder("VideoSchedulePillModel(selectionDisplay=");
        sb4.append(str);
        sb4.append(", dateDisplay=");
        sb4.append(dateDisplay);
        sb4.append(", style=");
        sb4.append(enumC16612g);
        sb4.append(", topItems=");
        sb4.append(list);
        sb4.append(", scheduleSections=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VideoSchedulePillModel(String selectionDisplay, DateDisplay dateDisplay, EnumC16612g style, List<? extends DesignSystemModel> list, List<VideoScheduleSection> scheduleSections) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(scheduleSections, "scheduleSections");
        this.selectionDisplay = selectionDisplay;
        this.dateDisplay = dateDisplay;
        this.style = style;
        this.topItems = list;
        this.scheduleSections = scheduleSections;
    }
}
