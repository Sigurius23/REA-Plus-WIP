package com.whoop.membership.dunning.domain.models;

import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, m65681d2 = {"Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "", "", "headerImg", "title", "body", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;", "cta", "closeText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;Ljava/lang/String;)Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeaderImg", "getTitle", "getBody", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetCtaModel;", "getCta", "getCloseText", "Companion", "$serializer", "a", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PaymentsOptionsDunningBottomSheetModel {
    private final String body;
    private final String closeText;
    private final PaymentsOptionsDunningBottomSheetCtaModel cta;
    private final String headerImg;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: renamed from: com.whoop.membership.dunning.domain.models.PaymentsOptionsDunningBottomSheetModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/dunning/domain/models/PaymentsOptionsDunningBottomSheetModel;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PaymentsOptionsDunningBottomSheetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PaymentsOptionsDunningBottomSheetModel(int i13, String str, String str2, String str3, PaymentsOptionsDunningBottomSheetCtaModel paymentsOptionsDunningBottomSheetCtaModel, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, PaymentsOptionsDunningBottomSheetModel$$serializer.INSTANCE.getDescriptor());
        }
        this.headerImg = str;
        this.title = str2;
        this.body = str3;
        this.cta = paymentsOptionsDunningBottomSheetCtaModel;
        this.closeText = str4;
    }

    public static /* synthetic */ PaymentsOptionsDunningBottomSheetModel copy$default(PaymentsOptionsDunningBottomSheetModel paymentsOptionsDunningBottomSheetModel, String str, String str2, String str3, PaymentsOptionsDunningBottomSheetCtaModel paymentsOptionsDunningBottomSheetCtaModel, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = paymentsOptionsDunningBottomSheetModel.headerImg;
        }
        if ((i13 & 2) != 0) {
            str2 = paymentsOptionsDunningBottomSheetModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = paymentsOptionsDunningBottomSheetModel.body;
        }
        if ((i13 & 8) != 0) {
            paymentsOptionsDunningBottomSheetCtaModel = paymentsOptionsDunningBottomSheetModel.cta;
        }
        if ((i13 & 16) != 0) {
            str4 = paymentsOptionsDunningBottomSheetModel.closeText;
        }
        String str5 = str4;
        String str6 = str3;
        return paymentsOptionsDunningBottomSheetModel.copy(str, str2, str6, paymentsOptionsDunningBottomSheetCtaModel, str5);
    }

    public static final /* synthetic */ void write$Self$membership_release(PaymentsOptionsDunningBottomSheetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.headerImg);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.body);
        output.encodeSerializableElement(serialDesc, 3, PaymentsOptionsDunningBottomSheetCtaModel$$serializer.INSTANCE, self.cta);
        output.encodeStringElement(serialDesc, 4, self.closeText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeaderImg() {
        return this.headerImg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PaymentsOptionsDunningBottomSheetCtaModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCloseText() {
        return this.closeText;
    }

    public final PaymentsOptionsDunningBottomSheetModel copy(String headerImg, String title, String body, PaymentsOptionsDunningBottomSheetCtaModel cta, String closeText) {
        AbstractC22676k.m65750j(headerImg, "headerImg");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(closeText, "closeText");
        return new PaymentsOptionsDunningBottomSheetModel(headerImg, title, body, cta, closeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentsOptionsDunningBottomSheetModel)) {
            return false;
        }
        PaymentsOptionsDunningBottomSheetModel paymentsOptionsDunningBottomSheetModel = (PaymentsOptionsDunningBottomSheetModel) other;
        return AbstractC22676k.m65745e(this.headerImg, paymentsOptionsDunningBottomSheetModel.headerImg) && AbstractC22676k.m65745e(this.title, paymentsOptionsDunningBottomSheetModel.title) && AbstractC22676k.m65745e(this.body, paymentsOptionsDunningBottomSheetModel.body) && AbstractC22676k.m65745e(this.cta, paymentsOptionsDunningBottomSheetModel.cta) && AbstractC22676k.m65745e(this.closeText, paymentsOptionsDunningBottomSheetModel.closeText);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCloseText() {
        return this.closeText;
    }

    public final PaymentsOptionsDunningBottomSheetCtaModel getCta() {
        return this.cta;
    }

    public final String getHeaderImg() {
        return this.headerImg;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.closeText.hashCode() + ((this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.headerImg.hashCode() * 31, 31, this.title), 31, this.body)) * 31);
    }

    public String toString() {
        String str = this.headerImg;
        String str2 = this.title;
        String str3 = this.body;
        PaymentsOptionsDunningBottomSheetCtaModel paymentsOptionsDunningBottomSheetCtaModel = this.cta;
        String str4 = this.closeText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PaymentsOptionsDunningBottomSheetModel(headerImg=", str, ", title=", str2, ", body=");
        sbM32001t.append(str3);
        sbM32001t.append(", cta=");
        sbM32001t.append(paymentsOptionsDunningBottomSheetCtaModel);
        sbM32001t.append(", closeText=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public PaymentsOptionsDunningBottomSheetModel(String headerImg, String title, String body, PaymentsOptionsDunningBottomSheetCtaModel cta, String closeText) {
        AbstractC22676k.m65750j(headerImg, "headerImg");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(closeText, "closeText");
        this.headerImg = headerImg;
        this.title = title;
        this.body = body;
        this.cta = cta;
        this.closeText = closeText;
    }
}
