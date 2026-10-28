package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0017J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "", "", "initialIndex", "", "", "elementNames", "<init>", "(ILjava/util/List;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentControllerDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getInitialIndex", "getInitialIndex$annotations", "()V", "Ljava/util/List;", "getElementNames", "getElementNames$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentControllerDtoV3 {

    @SerializedName("element_names")
    private final List<String> elementNames;

    @SerializedName("initial_index")
    private final int initialIndex;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37358a(1))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentControllerDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentControllerDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentControllerDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentControllerDtoV3(int i13, int i14, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, SegmentControllerDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        this.initialIndex = i14;
        this.elementNames = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentControllerDtoV3 copy$default(SegmentControllerDtoV3 segmentControllerDtoV3, int i13, List list, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = segmentControllerDtoV3.initialIndex;
        }
        if ((i14 & 2) != 0) {
            list = segmentControllerDtoV3.elementNames;
        }
        return segmentControllerDtoV3.copy(i13, list);
    }

    @InterfaceC37143h("element_names")
    public static /* synthetic */ void getElementNames$annotations() {
    }

    @InterfaceC37143h("initial_index")
    public static /* synthetic */ void getInitialIndex$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentControllerDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.initialIndex);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.elementNames);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getInitialIndex() {
        return this.initialIndex;
    }

    public final List<String> component2() {
        return this.elementNames;
    }

    public final SegmentControllerDtoV3 copy(int initialIndex, List<String> elementNames) {
        AbstractC22676k.m65750j(elementNames, "elementNames");
        return new SegmentControllerDtoV3(initialIndex, elementNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentControllerDtoV3)) {
            return false;
        }
        SegmentControllerDtoV3 segmentControllerDtoV3 = (SegmentControllerDtoV3) other;
        return this.initialIndex == segmentControllerDtoV3.initialIndex && AbstractC22676k.m65745e(this.elementNames, segmentControllerDtoV3.elementNames);
    }

    public final List<String> getElementNames() {
        return this.elementNames;
    }

    public final int getInitialIndex() {
        return this.initialIndex;
    }

    public int hashCode() {
        return this.elementNames.hashCode() + (Integer.hashCode(this.initialIndex) * 31);
    }

    public String toString() {
        return "SegmentControllerDtoV3(initialIndex=" + this.initialIndex + ", elementNames=" + this.elementNames + ")";
    }

    public SegmentControllerDtoV3(int i13, List<String> elementNames) {
        AbstractC22676k.m65750j(elementNames, "elementNames");
        this.initialIndex = i13;
        this.elementNames = elementNames;
    }
}
