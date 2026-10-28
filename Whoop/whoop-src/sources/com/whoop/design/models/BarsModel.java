package com.whoop.design.models;

import com.whoop.core.details.network.model.C6451a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J>\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b\u0005\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010 ¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/BarsModel;", "", "", "titleDisplay", "", "isTitleOnTop", "valueDisplay", "", "Lcom/whoop/design/models/SegmentModel;", "segments", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/BarsModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/BarsModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "Z", "getValueDisplay", "Ljava/util/List;", "getSegments", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarsModel {
    private final boolean isTitleOnTop;
    private final List<SegmentModel> segments;
    private final String titleDisplay;
    private final String valueDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C6451a(24))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/BarsModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/BarsModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarsModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarsModel(int i13, String str, boolean z4, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BarsModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.isTitleOnTop = z4;
        this.valueDisplay = str2;
        this.segments = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarsModel copy$default(BarsModel barsModel, String str, boolean z4, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = barsModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            z4 = barsModel.isTitleOnTop;
        }
        if ((i13 & 4) != 0) {
            str2 = barsModel.valueDisplay;
        }
        if ((i13 & 8) != 0) {
            list = barsModel.segments;
        }
        return barsModel.copy(str, z4, str2, list);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarsModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeBooleanElement(serialDesc, 1, self.isTitleOnTop);
        output.encodeStringElement(serialDesc, 2, self.valueDisplay);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.segments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTitleOnTop() {
        return this.isTitleOnTop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    public final List<SegmentModel> component4() {
        return this.segments;
    }

    public final BarsModel copy(String titleDisplay, boolean isTitleOnTop, String valueDisplay, List<SegmentModel> segments) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(segments, "segments");
        return new BarsModel(titleDisplay, isTitleOnTop, valueDisplay, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarsModel)) {
            return false;
        }
        BarsModel barsModel = (BarsModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, barsModel.titleDisplay) && this.isTitleOnTop == barsModel.isTitleOnTop && AbstractC22676k.m65745e(this.valueDisplay, barsModel.valueDisplay) && AbstractC22676k.m65745e(this.segments, barsModel.segments);
    }

    public final List<SegmentModel> getSegments() {
        return this.segments;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getValueDisplay() {
        return this.valueDisplay;
    }

    public int hashCode() {
        return this.segments.hashCode() + AbstractC11266d.m30450d(AbstractC2875y.m8289b(this.titleDisplay.hashCode() * 31, 31, this.isTitleOnTop), 31, this.valueDisplay);
    }

    public final boolean isTitleOnTop() {
        return this.isTitleOnTop;
    }

    public String toString() {
        String str = this.titleDisplay;
        boolean z4 = this.isTitleOnTop;
        return AbstractC30007c.m91840j(this.valueDisplay, ", segments=", ")", AbstractC25012a.m73379l("BarsModel(titleDisplay=", str, ", isTitleOnTop=", ", valueDisplay=", z4), this.segments);
    }

    public BarsModel(String titleDisplay, boolean z4, String valueDisplay, List<SegmentModel> segments) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(valueDisplay, "valueDisplay");
        AbstractC22676k.m65750j(segments, "segments");
        this.titleDisplay = titleDisplay;
        this.isTitleOnTop = z4;
        this.valueDisplay = valueDisplay;
        this.segments = segments;
    }
}
