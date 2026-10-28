package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB=\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/design/models/items/RangeMeterModel;", "", "", "Lcom/whoop/design/models/items/RangeSectionModel;", "sections", "", "indicatorPercent", "", "indicatorImageUrl", "<init>", "(Ljava/util/List;FLjava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;FLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/RangeMeterModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()F", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;FLjava/lang/String;)Lcom/whoop/design/models/items/RangeMeterModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "F", "getIndicatorPercent", "Ljava/lang/String;", "getIndicatorImageUrl", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class RangeMeterModel {
    private final String indicatorImageUrl;
    private final float indicatorPercent;
    private final List<RangeSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36962i(10)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/RangeMeterModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/RangeMeterModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return RangeMeterModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RangeMeterModel(int i13, List list, float f13, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, RangeMeterModel$$serializer.INSTANCE.getDescriptor());
        }
        this.sections = list;
        this.indicatorPercent = f13;
        this.indicatorImageUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RangeSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RangeMeterModel copy$default(RangeMeterModel rangeMeterModel, List list, float f13, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = rangeMeterModel.sections;
        }
        if ((i13 & 2) != 0) {
            f13 = rangeMeterModel.indicatorPercent;
        }
        if ((i13 & 4) != 0) {
            str = rangeMeterModel.indicatorImageUrl;
        }
        return rangeMeterModel.copy(list, f13, str);
    }

    public static final /* synthetic */ void write$Self$design_models_release(RangeMeterModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.sections);
        output.encodeFloatElement(serialDesc, 1, self.indicatorPercent);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.indicatorImageUrl);
    }

    public final List<RangeSectionModel> component1() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getIndicatorPercent() {
        return this.indicatorPercent;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIndicatorImageUrl() {
        return this.indicatorImageUrl;
    }

    public final RangeMeterModel copy(List<RangeSectionModel> sections, float indicatorPercent, String indicatorImageUrl) {
        AbstractC22676k.m65750j(sections, "sections");
        return new RangeMeterModel(sections, indicatorPercent, indicatorImageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RangeMeterModel)) {
            return false;
        }
        RangeMeterModel rangeMeterModel = (RangeMeterModel) other;
        return AbstractC22676k.m65745e(this.sections, rangeMeterModel.sections) && Float.compare(this.indicatorPercent, rangeMeterModel.indicatorPercent) == 0 && AbstractC22676k.m65745e(this.indicatorImageUrl, rangeMeterModel.indicatorImageUrl);
    }

    public final String getIndicatorImageUrl() {
        return this.indicatorImageUrl;
    }

    public final float getIndicatorPercent() {
        return this.indicatorPercent;
    }

    public final List<RangeSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        int iM30447a = AbstractC11266d.m30447a(this.indicatorPercent, this.sections.hashCode() * 31, 31);
        String str = this.indicatorImageUrl;
        return iM30447a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<RangeSectionModel> list = this.sections;
        float f13 = this.indicatorPercent;
        String str = this.indicatorImageUrl;
        StringBuilder sb4 = new StringBuilder("RangeMeterModel(sections=");
        sb4.append(list);
        sb4.append(", indicatorPercent=");
        sb4.append(f13);
        sb4.append(", indicatorImageUrl=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public RangeMeterModel(List<RangeSectionModel> sections, float f13, String str) {
        AbstractC22676k.m65750j(sections, "sections");
        this.sections = sections;
        this.indicatorPercent = f13;
        this.indicatorImageUrl = str;
    }
}
