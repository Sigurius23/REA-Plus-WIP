package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VUB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B£\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001eJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b.\u0010/J\u009e\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u001eJ\u0010\u00103\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010B\u001a\u0004\bC\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010B\u001a\u0004\bD\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010B\u001a\u0004\bE\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010F\u001a\u0004\bG\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010F\u001a\u0004\bH\u0010\"R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010%R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010'R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bM\u0010'R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u0010*R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010N\u001a\u0004\bP\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010B\u001a\u0004\bQ\u0010\u001eR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010B\u001a\u0004\bR\u0010\u001eR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010/¨\u0006W"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "", "", "navigationTitle", "title", "searchPlaceholder", "Lcom/whoop/design/models/items/DividerModel;", "includedItemsHeader", "notIncludedItemsHeader", "", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerItem;", "items", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "button", "bottomSheetButton", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "exitDialog", "deleteDialog", "calculationEducationTitle", "calculationEducationDescription", "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "testDeletedModal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/DividerModel;", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "component8", "component9", "()Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "component10", "component11", "component12", "component13", "()Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;)Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getNavigationTitle", "getTitle", "getSearchPlaceholder", "Lcom/whoop/design/models/items/DividerModel;", "getIncludedItemsHeader", "getNotIncludedItemsHeader", "Ljava/util/List;", "getItems", "Lcom/whoop/advancedlabs/domain/models/PrimaryButtonModel;", "getButton", "getBottomSheetButton", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkerDialog;", "getExitDialog", "getDeleteDialog", "getCalculationEducationTitle", "getCalculationEducationDescription", "Lcom/whoop/advancedlabs/domain/models/TestDeletedModalItem;", "getTestDeletedModal", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditBiomarkersResponse {
    private final PrimaryButtonModel bottomSheetButton;
    private final PrimaryButtonModel button;
    private final String calculationEducationDescription;
    private final String calculationEducationTitle;
    private final EditBiomarkerDialog deleteDialog;
    private final EditBiomarkerDialog exitDialog;
    private final DividerModel includedItemsHeader;
    private final List<EditBiomarkerItem> items;
    private final String navigationTitle;
    private final DividerModel notIncludedItemsHeader;
    private final String searchPlaceholder;
    private final TestDeletedModalItem testDeletedModal;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(6)), null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/EditBiomarkersResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditBiomarkersResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ EditBiomarkersResponse(int i13, String str, String str2, String str3, DividerModel dividerModel, DividerModel dividerModel2, List list, PrimaryButtonModel primaryButtonModel, PrimaryButtonModel primaryButtonModel2, EditBiomarkerDialog editBiomarkerDialog, EditBiomarkerDialog editBiomarkerDialog2, String str4, String str5, TestDeletedModalItem testDeletedModalItem, SerializationConstructorMarker serializationConstructorMarker) {
        if (8191 != (i13 & 8191)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8191, EditBiomarkersResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.title = str2;
        this.searchPlaceholder = str3;
        this.includedItemsHeader = dividerModel;
        this.notIncludedItemsHeader = dividerModel2;
        this.items = list;
        this.button = primaryButtonModel;
        this.bottomSheetButton = primaryButtonModel2;
        this.exitDialog = editBiomarkerDialog;
        this.deleteDialog = editBiomarkerDialog2;
        this.calculationEducationTitle = str4;
        this.calculationEducationDescription = str5;
        this.testDeletedModal = testDeletedModalItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(EditBiomarkerItem$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditBiomarkersResponse copy$default(EditBiomarkersResponse editBiomarkersResponse, String str, String str2, String str3, DividerModel dividerModel, DividerModel dividerModel2, List list, PrimaryButtonModel primaryButtonModel, PrimaryButtonModel primaryButtonModel2, EditBiomarkerDialog editBiomarkerDialog, EditBiomarkerDialog editBiomarkerDialog2, String str4, String str5, TestDeletedModalItem testDeletedModalItem, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = editBiomarkersResponse.navigationTitle;
        }
        return editBiomarkersResponse.copy(str, (i13 & 2) != 0 ? editBiomarkersResponse.title : str2, (i13 & 4) != 0 ? editBiomarkersResponse.searchPlaceholder : str3, (i13 & 8) != 0 ? editBiomarkersResponse.includedItemsHeader : dividerModel, (i13 & 16) != 0 ? editBiomarkersResponse.notIncludedItemsHeader : dividerModel2, (i13 & 32) != 0 ? editBiomarkersResponse.items : list, (i13 & 64) != 0 ? editBiomarkersResponse.button : primaryButtonModel, (i13 & 128) != 0 ? editBiomarkersResponse.bottomSheetButton : primaryButtonModel2, (i13 & 256) != 0 ? editBiomarkersResponse.exitDialog : editBiomarkerDialog, (i13 & 512) != 0 ? editBiomarkersResponse.deleteDialog : editBiomarkerDialog2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? editBiomarkersResponse.calculationEducationTitle : str4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? editBiomarkersResponse.calculationEducationDescription : str5, (i13 & 4096) != 0 ? editBiomarkersResponse.testDeletedModal : testDeletedModalItem);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(EditBiomarkersResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.searchPlaceholder);
        DividerModel$$serializer dividerModel$$serializer = DividerModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, dividerModel$$serializer, self.includedItemsHeader);
        output.encodeSerializableElement(serialDesc, 4, dividerModel$$serializer, self.notIncludedItemsHeader);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.items);
        PrimaryButtonModel$$serializer primaryButtonModel$$serializer = PrimaryButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 6, primaryButtonModel$$serializer, self.button);
        output.encodeSerializableElement(serialDesc, 7, primaryButtonModel$$serializer, self.bottomSheetButton);
        EditBiomarkerDialog$$serializer editBiomarkerDialog$$serializer = EditBiomarkerDialog$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 8, editBiomarkerDialog$$serializer, self.exitDialog);
        output.encodeSerializableElement(serialDesc, 9, editBiomarkerDialog$$serializer, self.deleteDialog);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.calculationEducationTitle);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.calculationEducationDescription);
        output.encodeNullableSerializableElement(serialDesc, 12, TestDeletedModalItem$$serializer.INSTANCE, self.testDeletedModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final EditBiomarkerDialog getDeleteDialog() {
        return this.deleteDialog;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCalculationEducationTitle() {
        return this.calculationEducationTitle;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCalculationEducationDescription() {
        return this.calculationEducationDescription;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final TestDeletedModalItem getTestDeletedModal() {
        return this.testDeletedModal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DividerModel getIncludedItemsHeader() {
        return this.includedItemsHeader;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DividerModel getNotIncludedItemsHeader() {
        return this.notIncludedItemsHeader;
    }

    public final List<EditBiomarkerItem> component6() {
        return this.items;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PrimaryButtonModel getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PrimaryButtonModel getBottomSheetButton() {
        return this.bottomSheetButton;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final EditBiomarkerDialog getExitDialog() {
        return this.exitDialog;
    }

    public final EditBiomarkersResponse copy(String navigationTitle, String title, String searchPlaceholder, DividerModel includedItemsHeader, DividerModel notIncludedItemsHeader, List<EditBiomarkerItem> items, PrimaryButtonModel button, PrimaryButtonModel bottomSheetButton, EditBiomarkerDialog exitDialog, EditBiomarkerDialog deleteDialog, String calculationEducationTitle, String calculationEducationDescription, TestDeletedModalItem testDeletedModal) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(includedItemsHeader, "includedItemsHeader");
        AbstractC22676k.m65750j(notIncludedItemsHeader, "notIncludedItemsHeader");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(bottomSheetButton, "bottomSheetButton");
        AbstractC22676k.m65750j(exitDialog, "exitDialog");
        AbstractC22676k.m65750j(deleteDialog, "deleteDialog");
        return new EditBiomarkersResponse(navigationTitle, title, searchPlaceholder, includedItemsHeader, notIncludedItemsHeader, items, button, bottomSheetButton, exitDialog, deleteDialog, calculationEducationTitle, calculationEducationDescription, testDeletedModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditBiomarkersResponse)) {
            return false;
        }
        EditBiomarkersResponse editBiomarkersResponse = (EditBiomarkersResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, editBiomarkersResponse.navigationTitle) && AbstractC22676k.m65745e(this.title, editBiomarkersResponse.title) && AbstractC22676k.m65745e(this.searchPlaceholder, editBiomarkersResponse.searchPlaceholder) && AbstractC22676k.m65745e(this.includedItemsHeader, editBiomarkersResponse.includedItemsHeader) && AbstractC22676k.m65745e(this.notIncludedItemsHeader, editBiomarkersResponse.notIncludedItemsHeader) && AbstractC22676k.m65745e(this.items, editBiomarkersResponse.items) && AbstractC22676k.m65745e(this.button, editBiomarkersResponse.button) && AbstractC22676k.m65745e(this.bottomSheetButton, editBiomarkersResponse.bottomSheetButton) && AbstractC22676k.m65745e(this.exitDialog, editBiomarkersResponse.exitDialog) && AbstractC22676k.m65745e(this.deleteDialog, editBiomarkersResponse.deleteDialog) && AbstractC22676k.m65745e(this.calculationEducationTitle, editBiomarkersResponse.calculationEducationTitle) && AbstractC22676k.m65745e(this.calculationEducationDescription, editBiomarkersResponse.calculationEducationDescription) && AbstractC22676k.m65745e(this.testDeletedModal, editBiomarkersResponse.testDeletedModal);
    }

    public final PrimaryButtonModel getBottomSheetButton() {
        return this.bottomSheetButton;
    }

    public final PrimaryButtonModel getButton() {
        return this.button;
    }

    public final String getCalculationEducationDescription() {
        return this.calculationEducationDescription;
    }

    public final String getCalculationEducationTitle() {
        return this.calculationEducationTitle;
    }

    public final EditBiomarkerDialog getDeleteDialog() {
        return this.deleteDialog;
    }

    public final EditBiomarkerDialog getExitDialog() {
        return this.exitDialog;
    }

    public final DividerModel getIncludedItemsHeader() {
        return this.includedItemsHeader;
    }

    public final List<EditBiomarkerItem> getItems() {
        return this.items;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final DividerModel getNotIncludedItemsHeader() {
        return this.notIncludedItemsHeader;
    }

    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    public final TestDeletedModalItem getTestDeletedModal() {
        return this.testDeletedModal;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.deleteDialog.hashCode() + ((this.exitDialog.hashCode() + ((this.bottomSheetButton.hashCode() + ((this.button.hashCode() + AbstractC11895b.m31983b((this.notIncludedItemsHeader.hashCode() + ((this.includedItemsHeader.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.navigationTitle.hashCode() * 31, 31, this.title), 31, this.searchPlaceholder)) * 31)) * 31, 31, this.items)) * 31)) * 31)) * 31)) * 31;
        String str = this.calculationEducationTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.calculationEducationDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TestDeletedModalItem testDeletedModalItem = this.testDeletedModal;
        return iHashCode3 + (testDeletedModalItem != null ? testDeletedModalItem.hashCode() : 0);
    }

    public String toString() {
        String str = this.navigationTitle;
        String str2 = this.title;
        String str3 = this.searchPlaceholder;
        DividerModel dividerModel = this.includedItemsHeader;
        DividerModel dividerModel2 = this.notIncludedItemsHeader;
        List<EditBiomarkerItem> list = this.items;
        PrimaryButtonModel primaryButtonModel = this.button;
        PrimaryButtonModel primaryButtonModel2 = this.bottomSheetButton;
        EditBiomarkerDialog editBiomarkerDialog = this.exitDialog;
        EditBiomarkerDialog editBiomarkerDialog2 = this.deleteDialog;
        String str4 = this.calculationEducationTitle;
        String str5 = this.calculationEducationDescription;
        TestDeletedModalItem testDeletedModalItem = this.testDeletedModal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EditBiomarkersResponse(navigationTitle=", str, ", title=", str2, ", searchPlaceholder=");
        sbM32001t.append(str3);
        sbM32001t.append(", includedItemsHeader=");
        sbM32001t.append(dividerModel);
        sbM32001t.append(", notIncludedItemsHeader=");
        sbM32001t.append(dividerModel2);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(primaryButtonModel);
        sbM32001t.append(", bottomSheetButton=");
        sbM32001t.append(primaryButtonModel2);
        sbM32001t.append(", exitDialog=");
        sbM32001t.append(editBiomarkerDialog);
        sbM32001t.append(", deleteDialog=");
        sbM32001t.append(editBiomarkerDialog2);
        sbM32001t.append(", calculationEducationTitle=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", calculationEducationDescription=", str5, ", testDeletedModal=");
        sbM32001t.append(testDeletedModalItem);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public EditBiomarkersResponse(String navigationTitle, String title, String searchPlaceholder, DividerModel includedItemsHeader, DividerModel notIncludedItemsHeader, List<EditBiomarkerItem> items, PrimaryButtonModel button, PrimaryButtonModel bottomSheetButton, EditBiomarkerDialog exitDialog, EditBiomarkerDialog deleteDialog, String str, String str2, TestDeletedModalItem testDeletedModalItem) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(searchPlaceholder, "searchPlaceholder");
        AbstractC22676k.m65750j(includedItemsHeader, "includedItemsHeader");
        AbstractC22676k.m65750j(notIncludedItemsHeader, "notIncludedItemsHeader");
        AbstractC22676k.m65750j(items, "items");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(bottomSheetButton, "bottomSheetButton");
        AbstractC22676k.m65750j(exitDialog, "exitDialog");
        AbstractC22676k.m65750j(deleteDialog, "deleteDialog");
        this.navigationTitle = navigationTitle;
        this.title = title;
        this.searchPlaceholder = searchPlaceholder;
        this.includedItemsHeader = includedItemsHeader;
        this.notIncludedItemsHeader = notIncludedItemsHeader;
        this.items = items;
        this.button = button;
        this.bottomSheetButton = bottomSheetButton;
        this.exitDialog = exitDialog;
        this.deleteDialog = deleteDialog;
        this.calculationEducationTitle = str;
        this.calculationEducationDescription = str2;
        this.testDeletedModal = testDeletedModalItem;
    }
}
