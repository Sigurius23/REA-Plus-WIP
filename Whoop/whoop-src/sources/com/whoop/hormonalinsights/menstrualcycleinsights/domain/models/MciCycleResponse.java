package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/.B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00060"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;", "", "", "navigationTitle", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleSection;", "sections", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "hidingCycleModal", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "Ljava/util/List;", "getSections", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;", "getHidingCycleModal", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciCycleResponse {
    private final com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hidingCycleModal;
    private final String navigationTitle;
    private final List<CycleSection> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C30526a(25)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciCycleResponse;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciCycleResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciCycleResponse(int i13, String str, List list, com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, MciCycleResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.sections = list;
        this.hidingCycleModal = hormonalInsightsConfirmDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CycleSection$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MciCycleResponse copy$default(MciCycleResponse mciCycleResponse, String str, List list, com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mciCycleResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            list = mciCycleResponse.sections;
        }
        if ((i13 & 4) != 0) {
            hormonalInsightsConfirmDialog = mciCycleResponse.hidingCycleModal;
        }
        return mciCycleResponse.copy(str, list, hormonalInsightsConfirmDialog);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciCycleResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.sections);
        output.encodeSerializableElement(serialDesc, 2, com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog$$serializer.INSTANCE, self.hidingCycleModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<CycleSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog getHidingCycleModal() {
        return this.hidingCycleModal;
    }

    public final MciCycleResponse copy(String navigationTitle, List<CycleSection> sections, com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hidingCycleModal) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(hidingCycleModal, "hidingCycleModal");
        return new MciCycleResponse(navigationTitle, sections, hidingCycleModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciCycleResponse)) {
            return false;
        }
        MciCycleResponse mciCycleResponse = (MciCycleResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, mciCycleResponse.navigationTitle) && AbstractC22676k.m65745e(this.sections, mciCycleResponse.sections) && AbstractC22676k.m65745e(this.hidingCycleModal, mciCycleResponse.hidingCycleModal);
    }

    public final com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog getHidingCycleModal() {
        return this.hidingCycleModal;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<CycleSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.hidingCycleModal.hashCode() + AbstractC11895b.m31983b(this.navigationTitle.hashCode() * 31, 31, this.sections);
    }

    public String toString() {
        String str = this.navigationTitle;
        List<CycleSection> list = this.sections;
        com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hormonalInsightsConfirmDialog = this.hidingCycleModal;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("MciCycleResponse(navigationTitle=", str, ", sections=", ", hidingCycleModal=", list);
        sbM94766o.append(hormonalInsightsConfirmDialog);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public MciCycleResponse(String navigationTitle, List<CycleSection> sections, com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsConfirmDialog hidingCycleModal) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(hidingCycleModal, "hidingCycleModal");
        this.navigationTitle = navigationTitle;
        this.sections = sections;
        this.hidingCycleModal = hidingCycleModal;
    }
}
