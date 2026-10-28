package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBy\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0082\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b<\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b?\u0010\u0017R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0017¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/EndpointButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "buttonText", "successText", "leadingIcon", "successIcon", "errorText", "errorIcon", "", "showLoading", "path", "prefixText", "textStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Z", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/EndpointButtonModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/EndpointButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getButtonText", "getSuccessText", "getLeadingIcon", "getSuccessIcon", "getErrorText", "getErrorIcon", "Z", "getShowLoading", "getPath", "getPrefixText", "getTextStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EndpointButtonModel implements DesignSystemModel {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonText;
    private final String errorIcon;
    private final String errorText;
    private final String id;
    private final String leadingIcon;
    private final String path;
    private final String prefixText;
    private final boolean showLoading;
    private final String successIcon;
    private final String successText;
    private final String textStyle;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/EndpointButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/EndpointButtonModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EndpointButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public EndpointButtonModel() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ EndpointButtonModel copy$default(EndpointButtonModel endpointButtonModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, String str9, String str10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = endpointButtonModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = endpointButtonModel.buttonText;
        }
        if ((i13 & 4) != 0) {
            str3 = endpointButtonModel.successText;
        }
        if ((i13 & 8) != 0) {
            str4 = endpointButtonModel.leadingIcon;
        }
        if ((i13 & 16) != 0) {
            str5 = endpointButtonModel.successIcon;
        }
        if ((i13 & 32) != 0) {
            str6 = endpointButtonModel.errorText;
        }
        if ((i13 & 64) != 0) {
            str7 = endpointButtonModel.errorIcon;
        }
        if ((i13 & 128) != 0) {
            z4 = endpointButtonModel.showLoading;
        }
        if ((i13 & 256) != 0) {
            str8 = endpointButtonModel.path;
        }
        if ((i13 & 512) != 0) {
            str9 = endpointButtonModel.prefixText;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            str10 = endpointButtonModel.textStyle;
        }
        String str11 = str9;
        String str12 = str10;
        boolean z13 = z4;
        String str13 = str8;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return endpointButtonModel.copy(str, str2, str17, str4, str16, str14, str15, z13, str13, str11, str12);
    }

    public static final /* synthetic */ void write$Self$design_models_release(EndpointButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.buttonText, "")) {
            output.encodeStringElement(serialDesc, 1, self.buttonText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.successText, "")) {
            output.encodeStringElement(serialDesc, 2, self.successText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.leadingIcon, "")) {
            output.encodeStringElement(serialDesc, 3, self.leadingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.successIcon, "")) {
            output.encodeStringElement(serialDesc, 4, self.successIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.errorText, "")) {
            output.encodeStringElement(serialDesc, 5, self.errorText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !AbstractC22676k.m65745e(self.errorIcon, "")) {
            output.encodeStringElement(serialDesc, 6, self.errorIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !self.showLoading) {
            output.encodeBooleanElement(serialDesc, 7, self.showLoading);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.path, "")) {
            output.encodeStringElement(serialDesc, 8, self.path);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.prefixText != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.prefixText);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.textStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.textStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPrefixText() {
        return this.prefixText;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTextStyle() {
        return this.textStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSuccessText() {
        return this.successText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSuccessIcon() {
        return this.successIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorIcon() {
        return this.errorIcon;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final EndpointButtonModel copy(String id4, String buttonText, String successText, String leadingIcon, String successIcon, String errorText, String errorIcon, boolean showLoading, String path, String prefixText, String textStyle) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(errorText, "errorText");
        AbstractC22676k.m65750j(errorIcon, "errorIcon");
        AbstractC22676k.m65750j(path, "path");
        return new EndpointButtonModel(id4, buttonText, successText, leadingIcon, successIcon, errorText, errorIcon, showLoading, path, prefixText, textStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndpointButtonModel)) {
            return false;
        }
        EndpointButtonModel endpointButtonModel = (EndpointButtonModel) other;
        return AbstractC22676k.m65745e(this.id, endpointButtonModel.id) && AbstractC22676k.m65745e(this.buttonText, endpointButtonModel.buttonText) && AbstractC22676k.m65745e(this.successText, endpointButtonModel.successText) && AbstractC22676k.m65745e(this.leadingIcon, endpointButtonModel.leadingIcon) && AbstractC22676k.m65745e(this.successIcon, endpointButtonModel.successIcon) && AbstractC22676k.m65745e(this.errorText, endpointButtonModel.errorText) && AbstractC22676k.m65745e(this.errorIcon, endpointButtonModel.errorIcon) && this.showLoading == endpointButtonModel.showLoading && AbstractC22676k.m65745e(this.path, endpointButtonModel.path) && AbstractC22676k.m65745e(this.prefixText, endpointButtonModel.prefixText) && AbstractC22676k.m65745e(this.textStyle, endpointButtonModel.textStyle);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getErrorIcon() {
        return this.errorIcon;
    }

    public final String getErrorText() {
        return this.errorText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLeadingIcon() {
        return this.leadingIcon;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPrefixText() {
        return this.prefixText;
    }

    public final boolean getShowLoading() {
        return this.showLoading;
    }

    public final String getSuccessIcon() {
        return this.successIcon;
    }

    public final String getSuccessText() {
        return this.successText;
    }

    public final String getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.buttonText), 31, this.successText), 31, this.leadingIcon), 31, this.successIcon), 31, this.errorText), 31, this.errorIcon), 31, this.showLoading), 31, this.path);
        String str = this.prefixText;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textStyle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.buttonText;
        String str3 = this.successText;
        String str4 = this.leadingIcon;
        String str5 = this.successIcon;
        String str6 = this.errorText;
        String str7 = this.errorIcon;
        boolean z4 = this.showLoading;
        String str8 = this.path;
        String str9 = this.prefixText;
        String str10 = this.textStyle;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("EndpointButtonModel(id=", str, ", buttonText=", str2, ", successText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", leadingIcon=", str4, ", successIcon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", errorText=", str6, ", errorIcon=");
        AbstractC38963t7.m124390t(sbM32001t, str7, ", showLoading=", z4, ", path=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", prefixText=", str9, ", textStyle=");
        return AbstractC25012a.m73376i(str10, ")", sbM32001t);
    }

    public /* synthetic */ EndpointButtonModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.buttonText = "";
        } else {
            this.buttonText = str2;
        }
        if ((i13 & 4) == 0) {
            this.successText = "";
        } else {
            this.successText = str3;
        }
        if ((i13 & 8) == 0) {
            this.leadingIcon = "";
        } else {
            this.leadingIcon = str4;
        }
        if ((i13 & 16) == 0) {
            this.successIcon = "";
        } else {
            this.successIcon = str5;
        }
        if ((i13 & 32) == 0) {
            this.errorText = "";
        } else {
            this.errorText = str6;
        }
        if ((i13 & 64) == 0) {
            this.errorIcon = "";
        } else {
            this.errorIcon = str7;
        }
        if ((i13 & 128) == 0) {
            this.showLoading = true;
        } else {
            this.showLoading = z4;
        }
        if ((i13 & 256) == 0) {
            this.path = "";
        } else {
            this.path = str8;
        }
        if ((i13 & 512) == 0) {
            this.prefixText = null;
        } else {
            this.prefixText = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.textStyle = null;
        } else {
            this.textStyle = str10;
        }
    }

    public EndpointButtonModel(String id4, String buttonText, String successText, String leadingIcon, String successIcon, String errorText, String errorIcon, boolean z4, String path, String str, String str2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(successText, "successText");
        AbstractC22676k.m65750j(leadingIcon, "leadingIcon");
        AbstractC22676k.m65750j(successIcon, "successIcon");
        AbstractC22676k.m65750j(errorText, "errorText");
        AbstractC22676k.m65750j(errorIcon, "errorIcon");
        AbstractC22676k.m65750j(path, "path");
        this.id = id4;
        this.buttonText = buttonText;
        this.successText = successText;
        this.leadingIcon = leadingIcon;
        this.successIcon = successIcon;
        this.errorText = errorText;
        this.errorIcon = errorIcon;
        this.showLoading = z4;
        this.path = path;
        this.prefixText = str;
        this.textStyle = str2;
    }

    public /* synthetic */ EndpointButtonModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z4, String str8, String str9, String str10, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? "" : str7, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? "" : str8, (i13 & 512) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str10);
    }
}
