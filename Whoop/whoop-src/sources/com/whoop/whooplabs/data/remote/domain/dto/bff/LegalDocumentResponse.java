package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011B\u0091\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0098\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00105\u0012\u0004\b7\u00108\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b;\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b<\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00109\u001a\u0004\b=\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b>\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b?\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b@\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\bA\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\bB\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\bC\u0010\u0019R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\bD\u0010\u0019¨\u0006G"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "", "", "id", "", "title", "subtitle", "suffixTitle", "suffixSubtitle", "suffixType", "leftIcon", "rightIcon", "menuItemState", "style", "destination", "type", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "I", "getId", "getId$annotations", "()V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getSuffixTitle", "getSuffixSubtitle", "getSuffixType", "getLeftIcon", "getRightIcon", "getMenuItemState", "getStyle", "getDestination", "getType", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LegalDocumentResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String destination;
    private final int id;
    private final String leftIcon;
    private final String menuItemState;
    private final String rightIcon;
    private final String style;
    private final String subtitle;
    private final String suffixSubtitle;
    private final String suffixTitle;
    private final String suffixType;
    private final String title;
    private final String type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/LegalDocumentResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LegalDocumentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ LegalDocumentResponse(int i13, int i14, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i13 & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4095, LegalDocumentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i14;
        this.title = str;
        this.subtitle = str2;
        this.suffixTitle = str3;
        this.suffixSubtitle = str4;
        this.suffixType = str5;
        this.leftIcon = str6;
        this.rightIcon = str7;
        this.menuItemState = str8;
        this.style = str9;
        this.destination = str10;
        this.type = str11;
    }

    public static /* synthetic */ LegalDocumentResponse copy$default(LegalDocumentResponse legalDocumentResponse, int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = legalDocumentResponse.id;
        }
        if ((i14 & 2) != 0) {
            str = legalDocumentResponse.title;
        }
        if ((i14 & 4) != 0) {
            str2 = legalDocumentResponse.subtitle;
        }
        if ((i14 & 8) != 0) {
            str3 = legalDocumentResponse.suffixTitle;
        }
        if ((i14 & 16) != 0) {
            str4 = legalDocumentResponse.suffixSubtitle;
        }
        if ((i14 & 32) != 0) {
            str5 = legalDocumentResponse.suffixType;
        }
        if ((i14 & 64) != 0) {
            str6 = legalDocumentResponse.leftIcon;
        }
        if ((i14 & 128) != 0) {
            str7 = legalDocumentResponse.rightIcon;
        }
        if ((i14 & 256) != 0) {
            str8 = legalDocumentResponse.menuItemState;
        }
        if ((i14 & 512) != 0) {
            str9 = legalDocumentResponse.style;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str10 = legalDocumentResponse.destination;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            str11 = legalDocumentResponse.type;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str4;
        String str19 = str5;
        return legalDocumentResponse.copy(i13, str, str2, str3, str18, str19, str16, str17, str14, str15, str12, str13);
    }

    @InterfaceC37143h("document_id")
    public static /* synthetic */ void getId$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(LegalDocumentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.suffixTitle);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.suffixSubtitle);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.suffixType);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.leftIcon);
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.rightIcon);
        output.encodeStringElement(serialDesc, 8, self.menuItemState);
        output.encodeNullableSerializableElement(serialDesc, 9, stringSerializer, self.style);
        output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.destination);
        output.encodeNullableSerializableElement(serialDesc, 11, stringSerializer, self.type);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSuffixType() {
        return this.suffixType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLeftIcon() {
        return this.leftIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRightIcon() {
        return this.rightIcon;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final LegalDocumentResponse copy(int id4, String title, String subtitle, String suffixTitle, String suffixSubtitle, String suffixType, String leftIcon, String rightIcon, String menuItemState, String style, String destination, String type) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        return new LegalDocumentResponse(id4, title, subtitle, suffixTitle, suffixSubtitle, suffixType, leftIcon, rightIcon, menuItemState, style, destination, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalDocumentResponse)) {
            return false;
        }
        LegalDocumentResponse legalDocumentResponse = (LegalDocumentResponse) other;
        return this.id == legalDocumentResponse.id && AbstractC22676k.m65745e(this.title, legalDocumentResponse.title) && AbstractC22676k.m65745e(this.subtitle, legalDocumentResponse.subtitle) && AbstractC22676k.m65745e(this.suffixTitle, legalDocumentResponse.suffixTitle) && AbstractC22676k.m65745e(this.suffixSubtitle, legalDocumentResponse.suffixSubtitle) && AbstractC22676k.m65745e(this.suffixType, legalDocumentResponse.suffixType) && AbstractC22676k.m65745e(this.leftIcon, legalDocumentResponse.leftIcon) && AbstractC22676k.m65745e(this.rightIcon, legalDocumentResponse.rightIcon) && AbstractC22676k.m65745e(this.menuItemState, legalDocumentResponse.menuItemState) && AbstractC22676k.m65745e(this.style, legalDocumentResponse.style) && AbstractC22676k.m65745e(this.destination, legalDocumentResponse.destination) && AbstractC22676k.m65745e(this.type, legalDocumentResponse.type);
    }

    public final String getDestination() {
        return this.destination;
    }

    public final int getId() {
        return this.id;
    }

    public final String getLeftIcon() {
        return this.leftIcon;
    }

    public final String getMenuItemState() {
        return this.menuItemState;
    }

    public final String getRightIcon() {
        return this.rightIcon;
    }

    public final String getStyle() {
        return this.style;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getSuffixSubtitle() {
        return this.suffixSubtitle;
    }

    public final String getSuffixTitle() {
        return this.suffixTitle;
    }

    public final String getSuffixType() {
        return this.suffixType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(Integer.hashCode(this.id) * 31, 31, this.title), 31, this.subtitle);
        String str = this.suffixTitle;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suffixSubtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suffixType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leftIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightIcon;
        int iM30450d2 = AbstractC11266d.m30450d((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.menuItemState);
        String str6 = this.style;
        int iHashCode5 = (iM30450d2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.destination;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.type;
        return iHashCode6 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        int i13 = this.id;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.suffixTitle;
        String str4 = this.suffixSubtitle;
        String str5 = this.suffixType;
        String str6 = this.leftIcon;
        String str7 = this.rightIcon;
        String str8 = this.menuItemState;
        String str9 = this.style;
        String str10 = this.destination;
        String str11 = this.type;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "LegalDocumentResponse(id=", ", title=", str, ", subtitle=");
        AbstractC11266d.m30444B(sbM53373n, str2, ", suffixTitle=", str3, ", suffixSubtitle=");
        AbstractC11266d.m30444B(sbM53373n, str4, ", suffixType=", str5, ", leftIcon=");
        AbstractC11266d.m30444B(sbM53373n, str6, ", rightIcon=", str7, ", menuItemState=");
        AbstractC11266d.m30444B(sbM53373n, str8, ", style=", str9, ", destination=");
        return AbstractC11266d.m30464r(sbM53373n, str10, ", type=", str11, ")");
    }

    public LegalDocumentResponse(int i13, String title, String subtitle, String str, String str2, String str3, String str4, String str5, String menuItemState, String str6, String str7, String str8) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(menuItemState, "menuItemState");
        this.id = i13;
        this.title = title;
        this.subtitle = subtitle;
        this.suffixTitle = str;
        this.suffixSubtitle = str2;
        this.suffixType = str3;
        this.leftIcon = str4;
        this.rightIcon = str5;
        this.menuItemState = menuItemState;
        this.style = str6;
        this.destination = str7;
        this.type = str8;
    }
}
