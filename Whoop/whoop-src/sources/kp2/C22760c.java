package kp2;

import c13.AbstractC3855a;
import com.whoop.design.util.TextResource;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressModels;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m83.C25235a0;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: kp2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJÞ\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b.\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u00109\u001a\u0004\b2\u0010 R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b>\u0010 R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b:\u0010 R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b4\u0010ER\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006¢\u0006\f\n\u0004\b0\u00105\u001a\u0004\b@\u00107R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00109\u001a\u0004\bC\u0010 ¨\u0006F"}, m65681d2 = {"Lkp2/c;", "", "Lkp2/a;", "currentDialogType", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "response", "", "", "userInput", "Lcom/whoop/design/util/TextResource;", "validationErrors", "", "interactedFields", "backendErrorMessage", "", "manualRefresh", "displayRefreshingSpinner", "bottomSheetFieldType", "bottomSheetTitle", "", "Lkp2/h;", "bottomSheetOptions", "bottomSheetSelectedValue", "", "bottomSheetOpenTimestamp", "requiredFields", "source", "<init>", "(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;)V", "a", "(Lkp2/a;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;Ljava/util/Map;Ljava/util/Map;Ljava/util/Set;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/Set;Ljava/lang/String;)Lkp2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkp2/a;", "i", "()Lkp2/a;", "b", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "l", "()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressModels;", "c", "Ljava/util/Map;", "n", "()Ljava/util/Map;", "d", "o", "e", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "f", "Ljava/lang/String;", "g", "Z", "getManualRefresh", "()Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "getDisplayRefreshingSpinner", "k", "Ljava/util/List;", "()Ljava/util/List;", "m", "J", "()J", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C22760c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22758a currentDialogType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ShippingAddressModels response;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Map<String, String> userInput;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Map<String, TextResource> validationErrors;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<String> interactedFields;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String backendErrorMessage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean manualRefresh;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean displayRefreshingSpinner;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String bottomSheetFieldType;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final String bottomSheetTitle;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<C22765h> bottomSheetOptions;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final String bottomSheetSelectedValue;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final long bottomSheetOpenTimestamp;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final Set<String> requiredFields;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final String source;

    /* JADX WARN: Multi-variable type inference failed */
    public C22760c(InterfaceC22758a interfaceC22758a, ShippingAddressModels shippingAddressModels, Map<String, String> userInput, Map<String, ? extends TextResource> validationErrors, Set<String> interactedFields, String str, boolean z4, boolean z13, String str2, String str3, List<C22765h> list, String str4, long j7, Set<String> requiredFields, String source) {
        AbstractC22676k.m65750j(userInput, "userInput");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(interactedFields, "interactedFields");
        AbstractC22676k.m65750j(requiredFields, "requiredFields");
        AbstractC22676k.m65750j(source, "source");
        this.currentDialogType = interfaceC22758a;
        this.response = shippingAddressModels;
        this.userInput = userInput;
        this.validationErrors = validationErrors;
        this.interactedFields = interactedFields;
        this.backendErrorMessage = str;
        this.manualRefresh = z4;
        this.displayRefreshingSpinner = z13;
        this.bottomSheetFieldType = str2;
        this.bottomSheetTitle = str3;
        this.bottomSheetOptions = list;
        this.bottomSheetSelectedValue = str4;
        this.bottomSheetOpenTimestamp = j7;
        this.requiredFields = requiredFields;
        this.source = source;
    }

    /* JADX INFO: renamed from: a */
    public final C22760c m65914a(InterfaceC22758a currentDialogType, ShippingAddressModels response, Map<String, String> userInput, Map<String, ? extends TextResource> validationErrors, Set<String> interactedFields, String backendErrorMessage, boolean manualRefresh, boolean displayRefreshingSpinner, String bottomSheetFieldType, String bottomSheetTitle, List<C22765h> bottomSheetOptions, String bottomSheetSelectedValue, long bottomSheetOpenTimestamp, Set<String> requiredFields, String source) {
        AbstractC22676k.m65750j(userInput, "userInput");
        AbstractC22676k.m65750j(validationErrors, "validationErrors");
        AbstractC22676k.m65750j(interactedFields, "interactedFields");
        AbstractC22676k.m65750j(requiredFields, "requiredFields");
        AbstractC22676k.m65750j(source, "source");
        return new C22760c(currentDialogType, response, userInput, validationErrors, interactedFields, backendErrorMessage, manualRefresh, displayRefreshingSpinner, bottomSheetFieldType, bottomSheetTitle, bottomSheetOptions, bottomSheetSelectedValue, bottomSheetOpenTimestamp, requiredFields, source);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getBottomSheetFieldType() {
        return this.bottomSheetFieldType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getBottomSheetOpenTimestamp() {
        return this.bottomSheetOpenTimestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C22760c)) {
            return false;
        }
        C22760c c22760c = (C22760c) other;
        return AbstractC22676k.m65745e(this.currentDialogType, c22760c.currentDialogType) && AbstractC22676k.m65745e(this.response, c22760c.response) && AbstractC22676k.m65745e(this.userInput, c22760c.userInput) && AbstractC22676k.m65745e(this.validationErrors, c22760c.validationErrors) && AbstractC22676k.m65745e(this.interactedFields, c22760c.interactedFields) && AbstractC22676k.m65745e(this.backendErrorMessage, c22760c.backendErrorMessage) && this.manualRefresh == c22760c.manualRefresh && this.displayRefreshingSpinner == c22760c.displayRefreshingSpinner && AbstractC22676k.m65745e(this.bottomSheetFieldType, c22760c.bottomSheetFieldType) && AbstractC22676k.m65745e(this.bottomSheetTitle, c22760c.bottomSheetTitle) && AbstractC22676k.m65745e(this.bottomSheetOptions, c22760c.bottomSheetOptions) && AbstractC22676k.m65745e(this.bottomSheetSelectedValue, c22760c.bottomSheetSelectedValue) && this.bottomSheetOpenTimestamp == c22760c.bottomSheetOpenTimestamp && AbstractC22676k.m65745e(this.requiredFields, c22760c.requiredFields) && AbstractC22676k.m65745e(this.source, c22760c.source);
    }

    /* JADX INFO: renamed from: f */
    public final List<C22765h> m65918f() {
        return this.bottomSheetOptions;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getBottomSheetSelectedValue() {
        return this.bottomSheetSelectedValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    public int hashCode() {
        InterfaceC22758a interfaceC22758a = this.currentDialogType;
        int iHashCode = (interfaceC22758a == null ? 0 : interfaceC22758a.hashCode()) * 31;
        ShippingAddressModels shippingAddressModels = this.response;
        int iM73368a = AbstractC25012a.m73368a(this.interactedFields, AbstractC3855a.m11821e(this.validationErrors, AbstractC3855a.m11821e(this.userInput, (iHashCode + (shippingAddressModels == null ? 0 : shippingAddressModels.hashCode())) * 31, 31), 31), 31);
        String str = this.backendErrorMessage;
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM73368a + (str == null ? 0 : str.hashCode())) * 31, 31, this.manualRefresh), 31, this.displayRefreshingSpinner);
        String str2 = this.bottomSheetFieldType;
        int iHashCode2 = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bottomSheetTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<C22765h> list = this.bottomSheetOptions;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.bottomSheetSelectedValue;
        return this.source.hashCode() + AbstractC25012a.m73368a(this.requiredFields, AbstractC11266d.m30451e((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, this.bottomSheetOpenTimestamp, 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final InterfaceC22758a getCurrentDialogType() {
        return this.currentDialogType;
    }

    /* JADX INFO: renamed from: j */
    public final Set<String> m65922j() {
        return this.interactedFields;
    }

    /* JADX INFO: renamed from: k */
    public final Set<String> m65923k() {
        return this.requiredFields;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ShippingAddressModels getResponse() {
        return this.response;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: n */
    public final Map<String, String> m65926n() {
        return this.userInput;
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, TextResource> m65927o() {
        return this.validationErrors;
    }

    public String toString() {
        InterfaceC22758a interfaceC22758a = this.currentDialogType;
        ShippingAddressModels shippingAddressModels = this.response;
        Map<String, String> map = this.userInput;
        Map<String, TextResource> map2 = this.validationErrors;
        Set<String> set = this.interactedFields;
        String str = this.backendErrorMessage;
        boolean z4 = this.manualRefresh;
        boolean z13 = this.displayRefreshingSpinner;
        String str2 = this.bottomSheetFieldType;
        String str3 = this.bottomSheetTitle;
        List<C22765h> list = this.bottomSheetOptions;
        String str4 = this.bottomSheetSelectedValue;
        long j7 = this.bottomSheetOpenTimestamp;
        Set<String> set2 = this.requiredFields;
        String str5 = this.source;
        StringBuilder sb4 = new StringBuilder("ShippingAddressDomainState(currentDialogType=");
        sb4.append(interfaceC22758a);
        sb4.append(", response=");
        sb4.append(shippingAddressModels);
        sb4.append(", userInput=");
        AbstractC3855a.m11840x(sb4, map, ", validationErrors=", map2, ", interactedFields=");
        sb4.append(set);
        sb4.append(", backendErrorMessage=");
        sb4.append(str);
        sb4.append(", manualRefresh=");
        AbstractC38963t7.m124392v(sb4, z4, ", displayRefreshingSpinner=", z13, ", bottomSheetFieldType=");
        AbstractC11266d.m30444B(sb4, str2, ", bottomSheetTitle=", str3, ", bottomSheetOptions=");
        AbstractC17176i.m48511m(", bottomSheetSelectedValue=", str4, ", bottomSheetOpenTimestamp=", sb4, list);
        sb4.append(j7);
        sb4.append(", requiredFields=");
        sb4.append(set2);
        return AbstractC2875y.m8304q(sb4, ", source=", str5, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C22760c(InterfaceC22758a interfaceC22758a, ShippingAddressModels shippingAddressModels, Map map, Map map2, Set set, String str, boolean z4, boolean z13, String str2, String str3, List list, String str4, long j7, Set set2, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        InterfaceC22758a interfaceC22758a2 = (i13 & 1) != 0 ? null : interfaceC22758a;
        ShippingAddressModels shippingAddressModels2 = (i13 & 2) != 0 ? null : shippingAddressModels;
        int i14 = i13 & 4;
        Map map3 = C25272z.f99163w;
        Map map4 = i14 != 0 ? map3 : map;
        map3 = (i13 & 8) == 0 ? map2 : map3;
        int i15 = i13 & 16;
        Set set3 = C25235a0.f99113w;
        this(interfaceC22758a2, shippingAddressModels2, map4, map3, i15 != 0 ? set3 : set, (i13 & 32) != 0 ? null : str, (i13 & 64) != 0 ? false : z4, (i13 & 128) == 0 ? z13 : false, (i13 & 256) != 0 ? null : str2, (i13 & 512) != 0 ? null : str3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0 ? str4 : null, (i13 & 4096) != 0 ? 0L : j7, (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? set2 : set3, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? "" : str5);
    }
}
