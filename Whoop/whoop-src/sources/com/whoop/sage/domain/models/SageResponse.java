package com.whoop.sage.domain.models;

import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010)¨\u0006C"}, m65681d2 = {"Lcom/whoop/sage/domain/models/SageResponse;", "", "", "navigationTitle", "Lcom/whoop/design/models/items/TagModel;", "navigationTag", "Lcom/whoop/sage/domain/models/UnlockedContent;", "unlockedContent", "Lcom/whoop/sage/domain/models/LockedContent;", "lockedContent", "Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "navigationTagDialogContent", "Lcom/whoop/sage/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sage_release", "(Lcom/whoop/sage/domain/models/SageResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/TagModel;", "component3", "()Lcom/whoop/sage/domain/models/UnlockedContent;", "component4", "()Lcom/whoop/sage/domain/models/LockedContent;", "component5", "()Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "component6", "()Lcom/whoop/sage/domain/models/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/sage/domain/models/UnlockedContent;Lcom/whoop/sage/domain/models/LockedContent;Lcom/whoop/sage/domain/models/SageBottomSheetModel;Lcom/whoop/sage/domain/models/MetaData;)Lcom/whoop/sage/domain/models/SageResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "Lcom/whoop/design/models/items/TagModel;", "getNavigationTag", "getNavigationTag$annotations", "()V", "Lcom/whoop/sage/domain/models/UnlockedContent;", "getUnlockedContent", "Lcom/whoop/sage/domain/models/LockedContent;", "getLockedContent", "Lcom/whoop/sage/domain/models/SageBottomSheetModel;", "getNavigationTagDialogContent", "Lcom/whoop/sage/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SageResponse {
    private final LockedContent lockedContent;
    private final MetaData metadata;
    private final TagModel navigationTag;
    private final SageBottomSheetModel navigationTagDialogContent;
    private final String navigationTitle;
    private final UnlockedContent unlockedContent;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(23)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sage/domain/models/SageResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sage/domain/models/SageResponse;", "serializer", "()Lwc3/c;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SageResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SageResponse(int i13, String str, TagModel tagModel, UnlockedContent unlockedContent, LockedContent lockedContent, SageBottomSheetModel sageBottomSheetModel, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SageResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.navigationTag = tagModel;
        this.unlockedContent = unlockedContent;
        this.lockedContent = lockedContent;
        this.navigationTagDialogContent = sageBottomSheetModel;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TagModel.class), AbstractC38195a.m122336d(TagModel$$serializer.INSTANCE), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ SageResponse copy$default(SageResponse sageResponse, String str, TagModel tagModel, UnlockedContent unlockedContent, LockedContent lockedContent, SageBottomSheetModel sageBottomSheetModel, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sageResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            tagModel = sageResponse.navigationTag;
        }
        if ((i13 & 4) != 0) {
            unlockedContent = sageResponse.unlockedContent;
        }
        if ((i13 & 8) != 0) {
            lockedContent = sageResponse.lockedContent;
        }
        if ((i13 & 16) != 0) {
            sageBottomSheetModel = sageResponse.navigationTagDialogContent;
        }
        if ((i13 & 32) != 0) {
            metaData = sageResponse.metadata;
        }
        SageBottomSheetModel sageBottomSheetModel2 = sageBottomSheetModel;
        MetaData metaData2 = metaData;
        return sageResponse.copy(str, tagModel, unlockedContent, lockedContent, sageBottomSheetModel2, metaData2);
    }

    public static /* synthetic */ void getNavigationTag$annotations() {
    }

    public static final /* synthetic */ void write$Self$sage_release(SageResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.navigationTag);
        output.encodeNullableSerializableElement(serialDesc, 2, UnlockedContent$$serializer.INSTANCE, self.unlockedContent);
        output.encodeNullableSerializableElement(serialDesc, 3, LockedContent$$serializer.INSTANCE, self.lockedContent);
        output.encodeNullableSerializableElement(serialDesc, 4, SageBottomSheetModel$$serializer.INSTANCE, self.navigationTagDialogContent);
        output.encodeNullableSerializableElement(serialDesc, 5, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final UnlockedContent getUnlockedContent() {
        return this.unlockedContent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LockedContent getLockedContent() {
        return this.lockedContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SageBottomSheetModel getNavigationTagDialogContent() {
        return this.navigationTagDialogContent;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final SageResponse copy(String navigationTitle, TagModel navigationTag, UnlockedContent unlockedContent, LockedContent lockedContent, SageBottomSheetModel navigationTagDialogContent, MetaData metadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        return new SageResponse(navigationTitle, navigationTag, unlockedContent, lockedContent, navigationTagDialogContent, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SageResponse)) {
            return false;
        }
        SageResponse sageResponse = (SageResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, sageResponse.navigationTitle) && AbstractC22676k.m65745e(this.navigationTag, sageResponse.navigationTag) && AbstractC22676k.m65745e(this.unlockedContent, sageResponse.unlockedContent) && AbstractC22676k.m65745e(this.lockedContent, sageResponse.lockedContent) && AbstractC22676k.m65745e(this.navigationTagDialogContent, sageResponse.navigationTagDialogContent) && AbstractC22676k.m65745e(this.metadata, sageResponse.metadata);
    }

    public final LockedContent getLockedContent() {
        return this.lockedContent;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final TagModel getNavigationTag() {
        return this.navigationTag;
    }

    public final SageBottomSheetModel getNavigationTagDialogContent() {
        return this.navigationTagDialogContent;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final UnlockedContent getUnlockedContent() {
        return this.unlockedContent;
    }

    public int hashCode() {
        int iHashCode = this.navigationTitle.hashCode() * 31;
        TagModel tagModel = this.navigationTag;
        int iHashCode2 = (iHashCode + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        UnlockedContent unlockedContent = this.unlockedContent;
        int iHashCode3 = (iHashCode2 + (unlockedContent == null ? 0 : unlockedContent.hashCode())) * 31;
        LockedContent lockedContent = this.lockedContent;
        int iHashCode4 = (iHashCode3 + (lockedContent == null ? 0 : lockedContent.hashCode())) * 31;
        SageBottomSheetModel sageBottomSheetModel = this.navigationTagDialogContent;
        int iHashCode5 = (iHashCode4 + (sageBottomSheetModel == null ? 0 : sageBottomSheetModel.hashCode())) * 31;
        MetaData metaData = this.metadata;
        return iHashCode5 + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "SageResponse(navigationTitle=" + this.navigationTitle + ", navigationTag=" + this.navigationTag + ", unlockedContent=" + this.unlockedContent + ", lockedContent=" + this.lockedContent + ", navigationTagDialogContent=" + this.navigationTagDialogContent + ", metadata=" + this.metadata + ")";
    }

    public SageResponse(String navigationTitle, TagModel tagModel, UnlockedContent unlockedContent, LockedContent lockedContent, SageBottomSheetModel sageBottomSheetModel, MetaData metaData) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        this.navigationTitle = navigationTitle;
        this.navigationTag = tagModel;
        this.unlockedContent = unlockedContent;
        this.lockedContent = lockedContent;
        this.navigationTagDialogContent = sageBottomSheetModel;
        this.metadata = metaData;
    }
}
