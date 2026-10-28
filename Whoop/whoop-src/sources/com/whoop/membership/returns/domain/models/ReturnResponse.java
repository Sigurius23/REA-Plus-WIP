package com.whoop.membership.returns.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.modal.C8527a;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import te0.AbstractC33745d;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010+Jv\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010+J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010!R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010!R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010!R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010!R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b<\u0010&R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b=\u0010!R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b>\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010+¨\u0006C"}, m65681d2 = {"Lcom/whoop/membership/returns/domain/models/ReturnResponse;", "", "Lcom/whoop/design/util/TextResource;", "navbarTitle", "alertTitle", "alertSubtitle", "instructionsTitle", "", "Lcom/whoop/membership/returns/domain/models/Instruction;", "instructions", "Lcom/whoop/membership/returns/domain/models/DownloadButton;", "buttons", "footerText", "policyCtaText", "", "policyCtaUrl", "<init>", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$membership_release", "(Lcom/whoop/membership/returns/domain/models/ReturnResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/util/TextResource;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "component9", "()Ljava/lang/String;", "copy", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/util/TextResource;", "getNavbarTitle", "getAlertTitle", "getAlertSubtitle", "getInstructionsTitle", "Ljava/util/List;", "getInstructions", "getButtons", "getFooterText", "getPolicyCtaText", "Ljava/lang/String;", "getPolicyCtaUrl", "Companion", "$serializer", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ReturnResponse {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("alert_subtitle")
    private final TextResource alertSubtitle;

    @SerializedName("alert_title")
    private final TextResource alertTitle;

    @SerializedName("buttons")
    private final List<DownloadButton> buttons;

    @SerializedName("footer_text")
    private final TextResource footerText;

    @SerializedName("instructions")
    private final List<Instruction> instructions;

    @SerializedName("instructions_title")
    private final TextResource instructionsTitle;

    @SerializedName("navbar_title")
    private final TextResource navbarTitle;

    @SerializedName("policy_cta_text")
    private final TextResource policyCtaText;

    @SerializedName("policy_cta_url")
    private final String policyCtaUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/membership/returns/domain/models/ReturnResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/membership/returns/domain/models/ReturnResponse;", "serializer", "()Lwc3/c;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ReturnResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C8527a(5)), AbstractC30060g.m92087G(enumC23463i, new C8527a(6)), null, null, null};
    }

    public /* synthetic */ ReturnResponse(int i13, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, List list, List list2, TextResource textResource5, TextResource textResource6, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ReturnResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navbarTitle = textResource;
        this.alertTitle = textResource2;
        this.alertSubtitle = textResource3;
        this.instructionsTitle = textResource4;
        this.instructions = list;
        this.buttons = list2;
        this.footerText = textResource5;
        this.policyCtaText = textResource6;
        this.policyCtaUrl = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Instruction$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(DownloadButton$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnResponse copy$default(ReturnResponse returnResponse, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, List list, List list2, TextResource textResource5, TextResource textResource6, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            textResource = returnResponse.navbarTitle;
        }
        if ((i13 & 2) != 0) {
            textResource2 = returnResponse.alertTitle;
        }
        if ((i13 & 4) != 0) {
            textResource3 = returnResponse.alertSubtitle;
        }
        if ((i13 & 8) != 0) {
            textResource4 = returnResponse.instructionsTitle;
        }
        if ((i13 & 16) != 0) {
            list = returnResponse.instructions;
        }
        if ((i13 & 32) != 0) {
            list2 = returnResponse.buttons;
        }
        if ((i13 & 64) != 0) {
            textResource5 = returnResponse.footerText;
        }
        if ((i13 & 128) != 0) {
            textResource6 = returnResponse.policyCtaText;
        }
        if ((i13 & 256) != 0) {
            str = returnResponse.policyCtaUrl;
        }
        TextResource textResource7 = textResource6;
        String str2 = str;
        List list3 = list2;
        TextResource textResource8 = textResource5;
        List list4 = list;
        TextResource textResource9 = textResource3;
        return returnResponse.copy(textResource, textResource2, textResource9, textResource4, list4, list3, textResource8, textResource7, str2);
    }

    public static final /* synthetic */ void write$Self$membership_release(ReturnResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 0, c25452a, self.navbarTitle);
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.alertTitle);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.alertSubtitle);
        output.encodeSerializableElement(serialDesc, 3, c25452a, self.instructionsTitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.instructions);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.buttons);
        output.encodeSerializableElement(serialDesc, 6, c25452a, self.footerText);
        output.encodeSerializableElement(serialDesc, 7, c25452a, self.policyCtaText);
        output.encodeStringElement(serialDesc, 8, self.policyCtaUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TextResource getNavbarTitle() {
        return this.navbarTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getAlertTitle() {
        return this.alertTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getAlertSubtitle() {
        return this.alertSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getInstructionsTitle() {
        return this.instructionsTitle;
    }

    public final List<Instruction> component5() {
        return this.instructions;
    }

    public final List<DownloadButton> component6() {
        return this.buttons;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TextResource getFooterText() {
        return this.footerText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TextResource getPolicyCtaText() {
        return this.policyCtaText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPolicyCtaUrl() {
        return this.policyCtaUrl;
    }

    public final ReturnResponse copy(TextResource navbarTitle, TextResource alertTitle, TextResource alertSubtitle, TextResource instructionsTitle, List<Instruction> instructions, List<DownloadButton> buttons, TextResource footerText, TextResource policyCtaText, String policyCtaUrl) {
        AbstractC22676k.m65750j(navbarTitle, "navbarTitle");
        AbstractC22676k.m65750j(alertTitle, "alertTitle");
        AbstractC22676k.m65750j(alertSubtitle, "alertSubtitle");
        AbstractC22676k.m65750j(instructionsTitle, "instructionsTitle");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(policyCtaText, "policyCtaText");
        AbstractC22676k.m65750j(policyCtaUrl, "policyCtaUrl");
        return new ReturnResponse(navbarTitle, alertTitle, alertSubtitle, instructionsTitle, instructions, buttons, footerText, policyCtaText, policyCtaUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnResponse)) {
            return false;
        }
        ReturnResponse returnResponse = (ReturnResponse) other;
        return AbstractC22676k.m65745e(this.navbarTitle, returnResponse.navbarTitle) && AbstractC22676k.m65745e(this.alertTitle, returnResponse.alertTitle) && AbstractC22676k.m65745e(this.alertSubtitle, returnResponse.alertSubtitle) && AbstractC22676k.m65745e(this.instructionsTitle, returnResponse.instructionsTitle) && AbstractC22676k.m65745e(this.instructions, returnResponse.instructions) && AbstractC22676k.m65745e(this.buttons, returnResponse.buttons) && AbstractC22676k.m65745e(this.footerText, returnResponse.footerText) && AbstractC22676k.m65745e(this.policyCtaText, returnResponse.policyCtaText) && AbstractC22676k.m65745e(this.policyCtaUrl, returnResponse.policyCtaUrl);
    }

    public final TextResource getAlertSubtitle() {
        return this.alertSubtitle;
    }

    public final TextResource getAlertTitle() {
        return this.alertTitle;
    }

    public final List<DownloadButton> getButtons() {
        return this.buttons;
    }

    public final TextResource getFooterText() {
        return this.footerText;
    }

    public final List<Instruction> getInstructions() {
        return this.instructions;
    }

    public final TextResource getInstructionsTitle() {
        return this.instructionsTitle;
    }

    public final TextResource getNavbarTitle() {
        return this.navbarTitle;
    }

    public final TextResource getPolicyCtaText() {
        return this.policyCtaText;
    }

    public final String getPolicyCtaUrl() {
        return this.policyCtaUrl;
    }

    public int hashCode() {
        return this.policyCtaUrl.hashCode() + AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC31061c.m95625a(AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.navbarTitle.hashCode() * 31, this.alertTitle, 31), this.alertSubtitle, 31), this.instructionsTitle, 31), 31, this.instructions), 31, this.buttons), this.footerText, 31), this.policyCtaText, 31);
    }

    public String toString() {
        TextResource textResource = this.navbarTitle;
        TextResource textResource2 = this.alertTitle;
        TextResource textResource3 = this.alertSubtitle;
        TextResource textResource4 = this.instructionsTitle;
        List<Instruction> list = this.instructions;
        List<DownloadButton> list2 = this.buttons;
        TextResource textResource5 = this.footerText;
        TextResource textResource6 = this.policyCtaText;
        String str = this.policyCtaUrl;
        StringBuilder sbM106658q = AbstractC33745d.m106658q("ReturnResponse(navbarTitle=", textResource, ", alertTitle=", textResource2, ", alertSubtitle=");
        AbstractC30007c.m91855y(sbM106658q, textResource3, ", instructionsTitle=", textResource4, ", instructions=");
        AbstractC21702c.m61148s(sbM106658q, list, ", buttons=", list2, ", footerText=");
        AbstractC30007c.m91855y(sbM106658q, textResource5, ", policyCtaText=", textResource6, ", policyCtaUrl=");
        return AbstractC25012a.m73376i(str, ")", sbM106658q);
    }

    public ReturnResponse(TextResource navbarTitle, TextResource alertTitle, TextResource alertSubtitle, TextResource instructionsTitle, List<Instruction> instructions, List<DownloadButton> buttons, TextResource footerText, TextResource policyCtaText, String policyCtaUrl) {
        AbstractC22676k.m65750j(navbarTitle, "navbarTitle");
        AbstractC22676k.m65750j(alertTitle, "alertTitle");
        AbstractC22676k.m65750j(alertSubtitle, "alertSubtitle");
        AbstractC22676k.m65750j(instructionsTitle, "instructionsTitle");
        AbstractC22676k.m65750j(instructions, "instructions");
        AbstractC22676k.m65750j(buttons, "buttons");
        AbstractC22676k.m65750j(footerText, "footerText");
        AbstractC22676k.m65750j(policyCtaText, "policyCtaText");
        AbstractC22676k.m65750j(policyCtaUrl, "policyCtaUrl");
        this.navbarTitle = navbarTitle;
        this.alertTitle = alertTitle;
        this.alertSubtitle = alertSubtitle;
        this.instructionsTitle = instructionsTitle;
        this.instructions = instructions;
        this.buttons = buttons;
        this.footerText = footerText;
        this.policyCtaText = policyCtaText;
        this.policyCtaUrl = policyCtaUrl;
    }
}
