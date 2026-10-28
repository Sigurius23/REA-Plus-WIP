package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;", "editOption", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;", "hideOption", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;", "unhideOption", "<init>", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;", "component2", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;", "component3", "()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;", "copy", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditOption;", "getEditOption", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HideOption;", "getHideOption", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/UnhideOption;", "getUnhideOption", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditCycleBottomSheet {
    private final EditOption editOption;
    private final HideOption hideOption;
    private final UnhideOption unhideOption;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/EditCycleBottomSheet;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditCycleBottomSheet$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditCycleBottomSheet(int i13, EditOption editOption, HideOption hideOption, UnhideOption unhideOption, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, EditCycleBottomSheet$$serializer.INSTANCE.getDescriptor());
        }
        this.editOption = editOption;
        this.hideOption = hideOption;
        this.unhideOption = unhideOption;
    }

    public static /* synthetic */ EditCycleBottomSheet copy$default(EditCycleBottomSheet editCycleBottomSheet, EditOption editOption, HideOption hideOption, UnhideOption unhideOption, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            editOption = editCycleBottomSheet.editOption;
        }
        if ((i13 & 2) != 0) {
            hideOption = editCycleBottomSheet.hideOption;
        }
        if ((i13 & 4) != 0) {
            unhideOption = editCycleBottomSheet.unhideOption;
        }
        return editCycleBottomSheet.copy(editOption, hideOption, unhideOption);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(EditCycleBottomSheet self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, EditOption$$serializer.INSTANCE, self.editOption);
        output.encodeNullableSerializableElement(serialDesc, 1, HideOption$$serializer.INSTANCE, self.hideOption);
        output.encodeNullableSerializableElement(serialDesc, 2, UnhideOption$$serializer.INSTANCE, self.unhideOption);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EditOption getEditOption() {
        return this.editOption;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final HideOption getHideOption() {
        return this.hideOption;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnhideOption getUnhideOption() {
        return this.unhideOption;
    }

    public final EditCycleBottomSheet copy(EditOption editOption, HideOption hideOption, UnhideOption unhideOption) {
        return new EditCycleBottomSheet(editOption, hideOption, unhideOption);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditCycleBottomSheet)) {
            return false;
        }
        EditCycleBottomSheet editCycleBottomSheet = (EditCycleBottomSheet) other;
        return AbstractC22676k.m65745e(this.editOption, editCycleBottomSheet.editOption) && AbstractC22676k.m65745e(this.hideOption, editCycleBottomSheet.hideOption) && AbstractC22676k.m65745e(this.unhideOption, editCycleBottomSheet.unhideOption);
    }

    public final EditOption getEditOption() {
        return this.editOption;
    }

    public final HideOption getHideOption() {
        return this.hideOption;
    }

    public final UnhideOption getUnhideOption() {
        return this.unhideOption;
    }

    public int hashCode() {
        EditOption editOption = this.editOption;
        int iHashCode = (editOption == null ? 0 : editOption.hashCode()) * 31;
        HideOption hideOption = this.hideOption;
        int iHashCode2 = (iHashCode + (hideOption == null ? 0 : hideOption.hashCode())) * 31;
        UnhideOption unhideOption = this.unhideOption;
        return iHashCode2 + (unhideOption != null ? unhideOption.hashCode() : 0);
    }

    public String toString() {
        return "EditCycleBottomSheet(editOption=" + this.editOption + ", hideOption=" + this.hideOption + ", unhideOption=" + this.unhideOption + ")";
    }

    public EditCycleBottomSheet(EditOption editOption, HideOption hideOption, UnhideOption unhideOption) {
        this.editOption = editOption;
        this.hideOption = hideOption;
        this.unhideOption = unhideOption;
    }
}
