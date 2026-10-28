package com.whoop.lastnightsleep.domain.models;

import com.whoop.design.models.items.HeaderModel;
import com.whoop.design.models.items.HeaderModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ6\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "", "Lcom/whoop/design/models/items/HeaderModel;", "headerSection", "", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepSectionModel;", "sections", "Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;", "subHeaderSection", "<init>", "(Lcom/whoop/design/models/items/HeaderModel;Ljava/util/List;Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/HeaderModel;Ljava/util/List;Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$last_night_sleep_release", "(Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/HeaderModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;", "copy", "(Lcom/whoop/design/models/items/HeaderModel;Ljava/util/List;Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;)Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/HeaderModel;", "getHeaderSection", "Ljava/util/List;", "getSections", "Lcom/whoop/lastnightsleep/domain/models/SubHeaderModel;", "getSubHeaderSection", "Companion", "$serializer", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LastNightSleepModel {
    private final HeaderModel headerSection;
    private final List<LastNightSleepSectionModel> sections;
    private final SubHeaderModel subHeaderSection;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C28376a(0)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/lastnightsleep/domain/models/LastNightSleepModel;", "serializer", "()Lwc3/c;", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LastNightSleepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LastNightSleepModel(int i13, HeaderModel headerModel, List list, SubHeaderModel subHeaderModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, LastNightSleepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.headerSection = headerModel;
        this.sections = list;
        this.subHeaderSection = subHeaderModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(LastNightSleepSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LastNightSleepModel copy$default(LastNightSleepModel lastNightSleepModel, HeaderModel headerModel, List list, SubHeaderModel subHeaderModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            headerModel = lastNightSleepModel.headerSection;
        }
        if ((i13 & 2) != 0) {
            list = lastNightSleepModel.sections;
        }
        if ((i13 & 4) != 0) {
            subHeaderModel = lastNightSleepModel.subHeaderSection;
        }
        return lastNightSleepModel.copy(headerModel, list, subHeaderModel);
    }

    public static final /* synthetic */ void write$Self$last_night_sleep_release(LastNightSleepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, HeaderModel$$serializer.INSTANCE, self.headerSection);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 2, SubHeaderModel$$serializer.INSTANCE, self.subHeaderSection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    public final List<LastNightSleepSectionModel> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SubHeaderModel getSubHeaderSection() {
        return this.subHeaderSection;
    }

    public final LastNightSleepModel copy(HeaderModel headerSection, List<LastNightSleepSectionModel> sections, SubHeaderModel subHeaderSection) {
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(sections, "sections");
        return new LastNightSleepModel(headerSection, sections, subHeaderSection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastNightSleepModel)) {
            return false;
        }
        LastNightSleepModel lastNightSleepModel = (LastNightSleepModel) other;
        return AbstractC22676k.m65745e(this.headerSection, lastNightSleepModel.headerSection) && AbstractC22676k.m65745e(this.sections, lastNightSleepModel.sections) && AbstractC22676k.m65745e(this.subHeaderSection, lastNightSleepModel.subHeaderSection);
    }

    public final HeaderModel getHeaderSection() {
        return this.headerSection;
    }

    public final List<LastNightSleepSectionModel> getSections() {
        return this.sections;
    }

    public final SubHeaderModel getSubHeaderSection() {
        return this.subHeaderSection;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.headerSection.hashCode() * 31, 31, this.sections);
        SubHeaderModel subHeaderModel = this.subHeaderSection;
        return iM31983b + (subHeaderModel == null ? 0 : subHeaderModel.hashCode());
    }

    public String toString() {
        return "LastNightSleepModel(headerSection=" + this.headerSection + ", sections=" + this.sections + ", subHeaderSection=" + this.subHeaderSection + ")";
    }

    public LastNightSleepModel(HeaderModel headerSection, List<LastNightSleepSectionModel> sections, SubHeaderModel subHeaderModel) {
        AbstractC22676k.m65750j(headerSection, "headerSection");
        AbstractC22676k.m65750j(sections, "sections");
        this.headerSection = headerSection;
        this.sections = sections;
        this.subHeaderSection = subHeaderModel;
    }
}
