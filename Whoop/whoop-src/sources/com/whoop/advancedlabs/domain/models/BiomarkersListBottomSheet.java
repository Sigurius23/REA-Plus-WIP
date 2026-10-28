package com.whoop.advancedlabs.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;", "entryPoint", "", "title", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;", "sortData", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;", "statusFilters", "<init>", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;", "component4", "()Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;", "copy", "(Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;)Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheetEntryPoint;", "getEntryPoint", "Ljava/lang/String;", "getTitle", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListSortData;", "getSortData", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListFilterData;", "getStatusFilters", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkersListBottomSheet {
    private final BiomarkersListBottomSheetEntryPoint entryPoint;
    private final BiomarkersListSortData sortData;
    private final BiomarkersListFilterData statusFilters;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/BiomarkersListBottomSheet;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkersListBottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BiomarkersListBottomSheet(int i13, BiomarkersListBottomSheetEntryPoint biomarkersListBottomSheetEntryPoint, String str, BiomarkersListSortData biomarkersListSortData, BiomarkersListFilterData biomarkersListFilterData, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, BiomarkersListBottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.entryPoint = biomarkersListBottomSheetEntryPoint;
        this.title = str;
        this.sortData = biomarkersListSortData;
        this.statusFilters = biomarkersListFilterData;
    }

    public static /* synthetic */ BiomarkersListBottomSheet copy$default(BiomarkersListBottomSheet biomarkersListBottomSheet, BiomarkersListBottomSheetEntryPoint biomarkersListBottomSheetEntryPoint, String str, BiomarkersListSortData biomarkersListSortData, BiomarkersListFilterData biomarkersListFilterData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            biomarkersListBottomSheetEntryPoint = biomarkersListBottomSheet.entryPoint;
        }
        if ((i13 & 2) != 0) {
            str = biomarkersListBottomSheet.title;
        }
        if ((i13 & 4) != 0) {
            biomarkersListSortData = biomarkersListBottomSheet.sortData;
        }
        if ((i13 & 8) != 0) {
            biomarkersListFilterData = biomarkersListBottomSheet.statusFilters;
        }
        return biomarkersListBottomSheet.copy(biomarkersListBottomSheetEntryPoint, str, biomarkersListSortData, biomarkersListFilterData);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(BiomarkersListBottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, BiomarkersListBottomSheetEntryPoint$$serializer.INSTANCE, self.entryPoint);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, BiomarkersListSortData$$serializer.INSTANCE, self.sortData);
        output.encodeNullableSerializableElement(serialDesc, 3, BiomarkersListFilterData$$serializer.INSTANCE, self.statusFilters);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BiomarkersListBottomSheetEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BiomarkersListSortData getSortData() {
        return this.sortData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BiomarkersListFilterData getStatusFilters() {
        return this.statusFilters;
    }

    public final BiomarkersListBottomSheet copy(BiomarkersListBottomSheetEntryPoint entryPoint, String title, BiomarkersListSortData sortData, BiomarkersListFilterData statusFilters) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        AbstractC22676k.m65750j(title, "title");
        return new BiomarkersListBottomSheet(entryPoint, title, sortData, statusFilters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkersListBottomSheet)) {
            return false;
        }
        BiomarkersListBottomSheet biomarkersListBottomSheet = (BiomarkersListBottomSheet) other;
        return AbstractC22676k.m65745e(this.entryPoint, biomarkersListBottomSheet.entryPoint) && AbstractC22676k.m65745e(this.title, biomarkersListBottomSheet.title) && AbstractC22676k.m65745e(this.sortData, biomarkersListBottomSheet.sortData) && AbstractC22676k.m65745e(this.statusFilters, biomarkersListBottomSheet.statusFilters);
    }

    public final BiomarkersListBottomSheetEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final BiomarkersListSortData getSortData() {
        return this.sortData;
    }

    public final BiomarkersListFilterData getStatusFilters() {
        return this.statusFilters;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.entryPoint.hashCode() * 31, 31, this.title);
        BiomarkersListSortData biomarkersListSortData = this.sortData;
        int iHashCode = (iM30450d + (biomarkersListSortData == null ? 0 : biomarkersListSortData.hashCode())) * 31;
        BiomarkersListFilterData biomarkersListFilterData = this.statusFilters;
        return iHashCode + (biomarkersListFilterData != null ? biomarkersListFilterData.hashCode() : 0);
    }

    public String toString() {
        return "BiomarkersListBottomSheet(entryPoint=" + this.entryPoint + ", title=" + this.title + ", sortData=" + this.sortData + ", statusFilters=" + this.statusFilters + ")";
    }

    public BiomarkersListBottomSheet(BiomarkersListBottomSheetEntryPoint entryPoint, String title, BiomarkersListSortData biomarkersListSortData, BiomarkersListFilterData biomarkersListFilterData) {
        AbstractC22676k.m65750j(entryPoint, "entryPoint");
        AbstractC22676k.m65750j(title, "title");
        this.entryPoint = entryPoint;
        this.title = title;
        this.sortData = biomarkersListSortData;
        this.statusFilters = biomarkersListFilterData;
    }
}
