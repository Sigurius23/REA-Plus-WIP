package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.BiomarkerCardModel;
import com.whoop.design.models.items.BiomarkerCardModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import tb0.C33691b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010 JT\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b5\u0010 ¨\u00068"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "Lcom/whoop/design/models/items/BiomarkerCardModel;", "biomarkers", "Lcom/whoop/advancedlabs/domain/models/BiomarkerStatusModel;", "statuses", "", "searchPlaceholder", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "bottomSheet", "allBiomarkersTitle", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getBiomarkers", "getStatuses", "Ljava/lang/String;", "getSearchPlaceholder", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "getBottomSheet", "getAllBiomarkersTitle", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SearchableBiomarkersListModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String allBiomarkersTitle;
    private final List<BiomarkerCardModel> biomarkers;
    private final BiomarkersListBottomSheet bottomSheet;
    private final String searchPlaceholder;
    private final List<BiomarkerStatusModel> statuses;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SearchableBiomarkersListModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SearchableBiomarkersListModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C33690a(29)), AbstractC30060g.m92087G(enumC23463i, new C33691b(0)), null, null, null};
    }

    public /* synthetic */ SearchableBiomarkersListModel(int i13, List list, List list2, String str, BiomarkersListBottomSheet biomarkersListBottomSheet, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SearchableBiomarkersListModel$$serializer.INSTANCE.getDescriptor());
        }
        this.biomarkers = list;
        this.statuses = list2;
        this.searchPlaceholder = str;
        this.bottomSheet = biomarkersListBottomSheet;
        this.allBiomarkersTitle = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BiomarkerCardModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(BiomarkerStatusModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchableBiomarkersListModel copy$default(SearchableBiomarkersListModel searchableBiomarkersListModel, List list, List list2, String str, BiomarkersListBottomSheet biomarkersListBottomSheet, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = searchableBiomarkersListModel.biomarkers;
        }
        if ((i13 & 2) != 0) {
            list2 = searchableBiomarkersListModel.statuses;
        }
        if ((i13 & 4) != 0) {
            str = searchableBiomarkersListModel.searchPlaceholder;
        }
        if ((i13 & 8) != 0) {
            biomarkersListBottomSheet = searchableBiomarkersListModel.bottomSheet;
        }
        if ((i13 & 16) != 0) {
            str2 = searchableBiomarkersListModel.allBiomarkersTitle;
        }
        String str3 = str2;
        String str4 = str;
        return searchableBiomarkersListModel.copy(list, list2, str4, biomarkersListBottomSheet, str3);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SearchableBiomarkersListModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.biomarkers);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.statuses);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.searchPlaceholder);
        output.encodeNullableSerializableElement(serialDesc, 3, BiomarkersListBottomSheet$$serializer.INSTANCE, self.bottomSheet);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.allBiomarkersTitle);
    }

    public final List<BiomarkerCardModel> component1() {
        return this.biomarkers;
    }

    public final List<BiomarkerStatusModel> component2() {
        return this.statuses;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BiomarkersListBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAllBiomarkersTitle() {
        return this.allBiomarkersTitle;
    }

    public final SearchableBiomarkersListModel copy(List<BiomarkerCardModel> biomarkers, List<BiomarkerStatusModel> statuses, String searchPlaceholder, BiomarkersListBottomSheet bottomSheet, String allBiomarkersTitle) {
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(statuses, "statuses");
        return new SearchableBiomarkersListModel(biomarkers, statuses, searchPlaceholder, bottomSheet, allBiomarkersTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchableBiomarkersListModel)) {
            return false;
        }
        SearchableBiomarkersListModel searchableBiomarkersListModel = (SearchableBiomarkersListModel) other;
        return AbstractC22676k.m65745e(this.biomarkers, searchableBiomarkersListModel.biomarkers) && AbstractC22676k.m65745e(this.statuses, searchableBiomarkersListModel.statuses) && AbstractC22676k.m65745e(this.searchPlaceholder, searchableBiomarkersListModel.searchPlaceholder) && AbstractC22676k.m65745e(this.bottomSheet, searchableBiomarkersListModel.bottomSheet) && AbstractC22676k.m65745e(this.allBiomarkersTitle, searchableBiomarkersListModel.allBiomarkersTitle);
    }

    public final String getAllBiomarkersTitle() {
        return this.allBiomarkersTitle;
    }

    public final List<BiomarkerCardModel> getBiomarkers() {
        return this.biomarkers;
    }

    public final BiomarkersListBottomSheet getBottomSheet() {
        return this.bottomSheet;
    }

    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public final List<BiomarkerStatusModel> getStatuses() {
        return this.statuses;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.biomarkers.hashCode() * 31, 31, this.statuses);
        String str = this.searchPlaceholder;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        BiomarkersListBottomSheet biomarkersListBottomSheet = this.bottomSheet;
        int iHashCode2 = (iHashCode + (biomarkersListBottomSheet == null ? 0 : biomarkersListBottomSheet.hashCode())) * 31;
        String str2 = this.allBiomarkersTitle;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<BiomarkerCardModel> list = this.biomarkers;
        List<BiomarkerStatusModel> list2 = this.statuses;
        String str = this.searchPlaceholder;
        BiomarkersListBottomSheet biomarkersListBottomSheet = this.bottomSheet;
        String str2 = this.allBiomarkersTitle;
        StringBuilder sbM124380j = AbstractC38963t7.m124380j("SearchableBiomarkersListModel(biomarkers=", ", statuses=", list, ", searchPlaceholder=", list2);
        sbM124380j.append(str);
        sbM124380j.append(", bottomSheet=");
        sbM124380j.append(biomarkersListBottomSheet);
        sbM124380j.append(", allBiomarkersTitle=");
        return AbstractC25012a.m73376i(str2, ")", sbM124380j);
    }

    public SearchableBiomarkersListModel(List<BiomarkerCardModel> biomarkers, List<BiomarkerStatusModel> statuses, String str, BiomarkersListBottomSheet biomarkersListBottomSheet, String str2) {
        AbstractC22676k.m65750j(biomarkers, "biomarkers");
        AbstractC22676k.m65750j(statuses, "statuses");
        this.biomarkers = biomarkers;
        this.statuses = statuses;
        this.searchPlaceholder = str;
        this.bottomSheet = biomarkersListBottomSheet;
        this.allBiomarkersTitle = str2;
    }
}
