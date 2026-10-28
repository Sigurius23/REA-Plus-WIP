package com.whoop.privacyconsent.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u001aR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001f¨\u00064"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/AccountResponse;", "", "", "accountName", "dataSharingStatus", "buttonText", "iconName", "Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;", "accountDataSharing", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$privacy_consent_release", "(Lcom/whoop/privacyconsent/api/AccountResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;)Lcom/whoop/privacyconsent/api/AccountResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountName", "getDataSharingStatus", "getButtonText", "getIconName", "Lcom/whoop/privacyconsent/api/AccountDataSharingResponse;", "getAccountDataSharing", "getAccountDataSharing$annotations", "()V", "Companion", "$serializer", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AccountResponse {
    private final AccountDataSharingResponse accountDataSharing;
    private final String accountName;
    private final String buttonText;
    private final String dataSharingStatus;
    private final String iconName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/AccountResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/privacyconsent/api/AccountResponse;", "serializer", "()Lwc3/c;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AccountResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccountResponse(int i13, String str, String str2, String str3, String str4, AccountDataSharingResponse accountDataSharingResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, AccountResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.accountName = str;
        this.dataSharingStatus = str2;
        this.buttonText = str3;
        this.iconName = str4;
        this.accountDataSharing = accountDataSharingResponse;
    }

    public static /* synthetic */ AccountResponse copy$default(AccountResponse accountResponse, String str, String str2, String str3, String str4, AccountDataSharingResponse accountDataSharingResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = accountResponse.accountName;
        }
        if ((i13 & 2) != 0) {
            str2 = accountResponse.dataSharingStatus;
        }
        if ((i13 & 4) != 0) {
            str3 = accountResponse.buttonText;
        }
        if ((i13 & 8) != 0) {
            str4 = accountResponse.iconName;
        }
        if ((i13 & 16) != 0) {
            accountDataSharingResponse = accountResponse.accountDataSharing;
        }
        AccountDataSharingResponse accountDataSharingResponse2 = accountDataSharingResponse;
        String str5 = str3;
        return accountResponse.copy(str, str2, str5, str4, accountDataSharingResponse2);
    }

    @InterfaceC37143h("data_sharing_dto")
    public static /* synthetic */ void getAccountDataSharing$annotations() {
    }

    public static final /* synthetic */ void write$Self$privacy_consent_release(AccountResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.accountName);
        output.encodeStringElement(serialDesc, 1, self.dataSharingStatus);
        output.encodeStringElement(serialDesc, 2, self.buttonText);
        output.encodeStringElement(serialDesc, 3, self.iconName);
        output.encodeSerializableElement(serialDesc, 4, AccountDataSharingResponse$$serializer.INSTANCE, self.accountDataSharing);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataSharingStatus() {
        return this.dataSharingStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AccountDataSharingResponse getAccountDataSharing() {
        return this.accountDataSharing;
    }

    public final AccountResponse copy(String accountName, String dataSharingStatus, String buttonText, String iconName, AccountDataSharingResponse accountDataSharing) {
        AbstractC22676k.m65750j(accountName, "accountName");
        AbstractC22676k.m65750j(dataSharingStatus, "dataSharingStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(iconName, "iconName");
        AbstractC22676k.m65750j(accountDataSharing, "accountDataSharing");
        return new AccountResponse(accountName, dataSharingStatus, buttonText, iconName, accountDataSharing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountResponse)) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) other;
        return AbstractC22676k.m65745e(this.accountName, accountResponse.accountName) && AbstractC22676k.m65745e(this.dataSharingStatus, accountResponse.dataSharingStatus) && AbstractC22676k.m65745e(this.buttonText, accountResponse.buttonText) && AbstractC22676k.m65745e(this.iconName, accountResponse.iconName) && AbstractC22676k.m65745e(this.accountDataSharing, accountResponse.accountDataSharing);
    }

    public final AccountDataSharingResponse getAccountDataSharing() {
        return this.accountDataSharing;
    }

    public final String getAccountName() {
        return this.accountName;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getDataSharingStatus() {
        return this.dataSharingStatus;
    }

    public final String getIconName() {
        return this.iconName;
    }

    public int hashCode() {
        return this.accountDataSharing.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.accountName.hashCode() * 31, 31, this.dataSharingStatus), 31, this.buttonText), 31, this.iconName);
    }

    public String toString() {
        String str = this.accountName;
        String str2 = this.dataSharingStatus;
        String str3 = this.buttonText;
        String str4 = this.iconName;
        AccountDataSharingResponse accountDataSharingResponse = this.accountDataSharing;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AccountResponse(accountName=", str, ", dataSharingStatus=", str2, ", buttonText=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", iconName=", str4, ", accountDataSharing=");
        sbM32001t.append(accountDataSharingResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AccountResponse(String accountName, String dataSharingStatus, String buttonText, String iconName, AccountDataSharingResponse accountDataSharing) {
        AbstractC22676k.m65750j(accountName, "accountName");
        AbstractC22676k.m65750j(dataSharingStatus, "dataSharingStatus");
        AbstractC22676k.m65750j(buttonText, "buttonText");
        AbstractC22676k.m65750j(iconName, "iconName");
        AbstractC22676k.m65750j(accountDataSharing, "accountDataSharing");
        this.accountName = accountName;
        this.dataSharingStatus = dataSharingStatus;
        this.buttonText = buttonText;
        this.iconName = iconName;
        this.accountDataSharing = accountDataSharing;
    }
}
