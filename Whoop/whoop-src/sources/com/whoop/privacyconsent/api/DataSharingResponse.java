package com.whoop.privacyconsent.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import h00.C16497d0;
import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JH\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001cR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b2\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/DataSharingResponse;", "", "", "title", "subtitle", "", "Lcom/whoop/privacyconsent/api/AccountResponse;", "accountList", "footerText", "", "display", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$privacy_consent_release", "(Lcom/whoop/privacyconsent/api/DataSharingResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lcom/whoop/privacyconsent/api/DataSharingResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getAccountList", "getAccountList$annotations", "()V", "getFooterText", "Z", "getDisplay", "Companion", "$serializer", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DataSharingResponse {
    private final List<AccountResponse> accountList;
    private final boolean display;
    private final String footerText;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C16497d0(9)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/privacyconsent/api/DataSharingResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/privacyconsent/api/DataSharingResponse;", "serializer", "()Lwc3/c;", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DataSharingResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DataSharingResponse(int i13, String str, String str2, List list, String str3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, DataSharingResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.accountList = list;
        this.footerText = str3;
        this.display = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AccountResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataSharingResponse copy$default(DataSharingResponse dataSharingResponse, String str, String str2, List list, String str3, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dataSharingResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = dataSharingResponse.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = dataSharingResponse.accountList;
        }
        if ((i13 & 8) != 0) {
            str3 = dataSharingResponse.footerText;
        }
        if ((i13 & 16) != 0) {
            z4 = dataSharingResponse.display;
        }
        boolean z13 = z4;
        List list2 = list;
        return dataSharingResponse.copy(str, str2, list2, str3, z13);
    }

    @InterfaceC37143h("account_data_sharing_list")
    public static /* synthetic */ void getAccountList$annotations() {
    }

    public static final /* synthetic */ void write$Self$privacy_consent_release(DataSharingResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.accountList);
        output.encodeStringElement(serialDesc, 3, self.footerText);
        output.encodeBooleanElement(serialDesc, 4, self.display);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<AccountResponse> component3() {
        return this.accountList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getDisplay() {
        return this.display;
    }

    public final DataSharingResponse copy(String title, String subtitle, List<AccountResponse> accountList, String footerText, boolean display) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(accountList, "accountList");
        AbstractC22676k.m65750j(footerText, "footerText");
        return new DataSharingResponse(title, subtitle, accountList, footerText, display);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataSharingResponse)) {
            return false;
        }
        DataSharingResponse dataSharingResponse = (DataSharingResponse) other;
        return AbstractC22676k.m65745e(this.title, dataSharingResponse.title) && AbstractC22676k.m65745e(this.subtitle, dataSharingResponse.subtitle) && AbstractC22676k.m65745e(this.accountList, dataSharingResponse.accountList) && AbstractC22676k.m65745e(this.footerText, dataSharingResponse.footerText) && this.display == dataSharingResponse.display;
    }

    public final List<AccountResponse> getAccountList() {
        return this.accountList;
    }

    public final boolean getDisplay() {
        return this.display;
    }

    public final String getFooterText() {
        return this.footerText;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Boolean.hashCode(this.display) + AbstractC11266d.m30450d(AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.subtitle), 31, this.accountList), 31, this.footerText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<AccountResponse> list = this.accountList;
        String str3 = this.footerText;
        boolean z4 = this.display;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DataSharingResponse(title=", str, ", subtitle=", str2, ", accountList=");
        AbstractC17176i.m48511m(", footerText=", str3, ", display=", sbM32001t, list);
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public DataSharingResponse(String title, String subtitle, List<AccountResponse> accountList, String footerText, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(accountList, "accountList");
        AbstractC22676k.m65750j(footerText, "footerText");
        this.title = title;
        this.subtitle = subtitle;
        this.accountList = accountList;
        this.footerText = footerText;
        this.display = z4;
    }
}
