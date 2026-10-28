package com.whoop.design.models.items;

import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import w91.C36958e;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBu\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 Jx\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0016J\u0010\u0010$\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010 ¨\u0006A"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalDividedListItem;", "", "", "id", "Lcom/whoop/design/util/TextResource;", "title", "subtitle", "imageUrl", "icon", "mainImage", "mainImageStyle", "mainImagePosition", "Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;", "dialogInfo", "<init>", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;", "copy", "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;)Lcom/whoop/design/models/items/HorizontalDividedListItem;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/HorizontalDividedListItem;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Lcom/whoop/design/util/TextResource;", "getTitle", "getSubtitle", "getImageUrl", "getIcon", "getMainImage", "getMainImageStyle", "getMainImagePosition", "Lcom/whoop/design/models/items/HorizontalDividedListItemDialogInfo;", "getDialogInfo", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HorizontalDividedListItem {
    private static final InterfaceC23462h[] $childSerializers;
    private final HorizontalDividedListItemDialogInfo dialogInfo;
    private final String icon;
    private final String id;
    private final String imageUrl;
    private final String mainImage;
    private final String mainImagePosition;
    private final String mainImageStyle;
    private final TextResource subtitle;
    private final TextResource title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/HorizontalDividedListItem$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/HorizontalDividedListItem;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HorizontalDividedListItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C36958e(23)), AbstractC30060g.m92087G(enumC23463i, new C36958e(24)), null, null, null, null, null, null};
    }

    public /* synthetic */ HorizontalDividedListItem(int i13, String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, String str6, HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, HorizontalDividedListItem$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = textResource;
        if ((i13 & 4) == 0) {
            this.subtitle = null;
        } else {
            this.subtitle = textResource2;
        }
        if ((i13 & 8) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str2;
        }
        if ((i13 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = str3;
        }
        if ((i13 & 32) == 0) {
            this.mainImage = null;
        } else {
            this.mainImage = str4;
        }
        if ((i13 & 64) == 0) {
            this.mainImageStyle = null;
        } else {
            this.mainImageStyle = str5;
        }
        if ((i13 & 128) == 0) {
            this.mainImagePosition = null;
        } else {
            this.mainImagePosition = str6;
        }
        if ((i13 & 256) == 0) {
            this.dialogInfo = null;
        } else {
            this.dialogInfo = horizontalDividedListItemDialogInfo;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TextResource.class), C25452a.f99689a, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(TextResource.class), AbstractC38195a.m122336d(C25452a.f99689a), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HorizontalDividedListItem copy$default(HorizontalDividedListItem horizontalDividedListItem, String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, String str6, HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = horizontalDividedListItem.id;
        }
        if ((i13 & 2) != 0) {
            textResource = horizontalDividedListItem.title;
        }
        if ((i13 & 4) != 0) {
            textResource2 = horizontalDividedListItem.subtitle;
        }
        if ((i13 & 8) != 0) {
            str2 = horizontalDividedListItem.imageUrl;
        }
        if ((i13 & 16) != 0) {
            str3 = horizontalDividedListItem.icon;
        }
        if ((i13 & 32) != 0) {
            str4 = horizontalDividedListItem.mainImage;
        }
        if ((i13 & 64) != 0) {
            str5 = horizontalDividedListItem.mainImageStyle;
        }
        if ((i13 & 128) != 0) {
            str6 = horizontalDividedListItem.mainImagePosition;
        }
        if ((i13 & 256) != 0) {
            horizontalDividedListItemDialogInfo = horizontalDividedListItem.dialogInfo;
        }
        String str7 = str6;
        HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo2 = horizontalDividedListItemDialogInfo;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        TextResource textResource3 = textResource2;
        return horizontalDividedListItem.copy(str, textResource, textResource3, str2, str10, str8, str9, str7, horizontalDividedListItemDialogInfo2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(HorizontalDividedListItem self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.title);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.subtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.imageUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.imageUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.mainImage != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.mainImage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.mainImageStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.mainImageStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.mainImagePosition != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.mainImagePosition);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.dialogInfo == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, HorizontalDividedListItemDialogInfo$$serializer.INSTANCE, self.dialogInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMainImage() {
        return this.mainImage;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMainImageStyle() {
        return this.mainImageStyle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getMainImagePosition() {
        return this.mainImagePosition;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final HorizontalDividedListItemDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public final HorizontalDividedListItem copy(String id4, TextResource title, TextResource subtitle, String imageUrl, String icon, String mainImage, String mainImageStyle, String mainImagePosition, HorizontalDividedListItemDialogInfo dialogInfo) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        return new HorizontalDividedListItem(id4, title, subtitle, imageUrl, icon, mainImage, mainImageStyle, mainImagePosition, dialogInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalDividedListItem)) {
            return false;
        }
        HorizontalDividedListItem horizontalDividedListItem = (HorizontalDividedListItem) other;
        return AbstractC22676k.m65745e(this.id, horizontalDividedListItem.id) && AbstractC22676k.m65745e(this.title, horizontalDividedListItem.title) && AbstractC22676k.m65745e(this.subtitle, horizontalDividedListItem.subtitle) && AbstractC22676k.m65745e(this.imageUrl, horizontalDividedListItem.imageUrl) && AbstractC22676k.m65745e(this.icon, horizontalDividedListItem.icon) && AbstractC22676k.m65745e(this.mainImage, horizontalDividedListItem.mainImage) && AbstractC22676k.m65745e(this.mainImageStyle, horizontalDividedListItem.mainImageStyle) && AbstractC22676k.m65745e(this.mainImagePosition, horizontalDividedListItem.mainImagePosition) && AbstractC22676k.m65745e(this.dialogInfo, horizontalDividedListItem.dialogInfo);
    }

    public final HorizontalDividedListItemDialogInfo getDialogInfo() {
        return this.dialogInfo;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getMainImage() {
        return this.mainImage;
    }

    public final String getMainImagePosition() {
        return this.mainImagePosition;
    }

    public final String getMainImageStyle() {
        return this.mainImageStyle;
    }

    public final TextResource getSubtitle() {
        return this.subtitle;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(this.id.hashCode() * 31, this.title, 31);
        TextResource textResource = this.subtitle;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mainImage;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mainImageStyle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mainImagePosition;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo = this.dialogInfo;
        return iHashCode6 + (horizontalDividedListItemDialogInfo != null ? horizontalDividedListItemDialogInfo.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        TextResource textResource = this.title;
        TextResource textResource2 = this.subtitle;
        String str2 = this.imageUrl;
        String str3 = this.icon;
        String str4 = this.mainImage;
        String str5 = this.mainImageStyle;
        String str6 = this.mainImagePosition;
        HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo = this.dialogInfo;
        StringBuilder sbM91847q = AbstractC30007c.m91847q("HorizontalDividedListItem(id=", str, ", title=", textResource, ", subtitle=");
        AbstractC30007c.m91856z(sbM91847q, textResource2, ", imageUrl=", str2, ", icon=");
        AbstractC11266d.m30444B(sbM91847q, str3, ", mainImage=", str4, ", mainImageStyle=");
        AbstractC11266d.m30444B(sbM91847q, str5, ", mainImagePosition=", str6, ", dialogInfo=");
        sbM91847q.append(horizontalDividedListItemDialogInfo);
        sbM91847q.append(")");
        return sbM91847q.toString();
    }

    public HorizontalDividedListItem(String id4, TextResource title, TextResource textResource, String str, String str2, String str3, String str4, String str5, HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        this.id = id4;
        this.title = title;
        this.subtitle = textResource;
        this.imageUrl = str;
        this.icon = str2;
        this.mainImage = str3;
        this.mainImageStyle = str4;
        this.mainImagePosition = str5;
        this.dialogInfo = horizontalDividedListItemDialogInfo;
    }

    public /* synthetic */ HorizontalDividedListItem(String str, TextResource textResource, TextResource textResource2, String str2, String str3, String str4, String str5, String str6, HorizontalDividedListItemDialogInfo horizontalDividedListItemDialogInfo, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textResource, (i13 & 4) != 0 ? null : textResource2, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : str4, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? null : horizontalDividedListItemDialogInfo);
    }
}
