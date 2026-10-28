package com.whoop.activation.domain.models;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import q41.C29968a;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u001cR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;", "", "", "header", "title", "subtitle", "selectAllCtaTitle", "nextStepCtaTitle", "", "Lcom/whoop/activation/domain/models/ActivationFlowConsent;", "consents", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getTitle", "getSubtitle", "getSelectAllCtaTitle", "getNextStepCtaTitle", "Ljava/util/List;", "getConsents", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowConsentsResponse {
    private final List<ActivationFlowConsent> consents;
    private final String header;
    private final String nextStepCtaTitle;
    private final String selectAllCtaTitle;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C29968a(16))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowConsentsResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowConsentsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActivationFlowConsentsResponse(int i13, String str, String str2, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ActivationFlowConsentsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.title = str2;
        this.subtitle = str3;
        this.selectAllCtaTitle = str4;
        this.nextStepCtaTitle = str5;
        this.consents = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ActivationFlowConsent$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivationFlowConsentsResponse copy$default(ActivationFlowConsentsResponse activationFlowConsentsResponse, String str, String str2, String str3, String str4, String str5, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = activationFlowConsentsResponse.header;
        }
        if ((i13 & 2) != 0) {
            str2 = activationFlowConsentsResponse.title;
        }
        if ((i13 & 4) != 0) {
            str3 = activationFlowConsentsResponse.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = activationFlowConsentsResponse.selectAllCtaTitle;
        }
        if ((i13 & 16) != 0) {
            str5 = activationFlowConsentsResponse.nextStepCtaTitle;
        }
        if ((i13 & 32) != 0) {
            list = activationFlowConsentsResponse.consents;
        }
        String str6 = str5;
        List list2 = list;
        return activationFlowConsentsResponse.copy(str, str2, str3, str4, str6, list2);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowConsentsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.header);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.subtitle);
        output.encodeStringElement(serialDesc, 3, self.selectAllCtaTitle);
        output.encodeStringElement(serialDesc, 4, self.nextStepCtaTitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.consents);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
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
    public final String getSelectAllCtaTitle() {
        return this.selectAllCtaTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNextStepCtaTitle() {
        return this.nextStepCtaTitle;
    }

    public final List<ActivationFlowConsent> component6() {
        return this.consents;
    }

    public final ActivationFlowConsentsResponse copy(String header, String title, String subtitle, String selectAllCtaTitle, String nextStepCtaTitle, List<ActivationFlowConsent> consents) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(selectAllCtaTitle, "selectAllCtaTitle");
        AbstractC22676k.m65750j(nextStepCtaTitle, "nextStepCtaTitle");
        AbstractC22676k.m65750j(consents, "consents");
        return new ActivationFlowConsentsResponse(header, title, subtitle, selectAllCtaTitle, nextStepCtaTitle, consents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowConsentsResponse)) {
            return false;
        }
        ActivationFlowConsentsResponse activationFlowConsentsResponse = (ActivationFlowConsentsResponse) other;
        return AbstractC22676k.m65745e(this.header, activationFlowConsentsResponse.header) && AbstractC22676k.m65745e(this.title, activationFlowConsentsResponse.title) && AbstractC22676k.m65745e(this.subtitle, activationFlowConsentsResponse.subtitle) && AbstractC22676k.m65745e(this.selectAllCtaTitle, activationFlowConsentsResponse.selectAllCtaTitle) && AbstractC22676k.m65745e(this.nextStepCtaTitle, activationFlowConsentsResponse.nextStepCtaTitle) && AbstractC22676k.m65745e(this.consents, activationFlowConsentsResponse.consents);
    }

    public final List<ActivationFlowConsent> getConsents() {
        return this.consents;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getNextStepCtaTitle() {
        return this.nextStepCtaTitle;
    }

    public final String getSelectAllCtaTitle() {
        return this.selectAllCtaTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.consents.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.selectAllCtaTitle), 31, this.nextStepCtaTitle);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.selectAllCtaTitle;
        String str5 = this.nextStepCtaTitle;
        List<ActivationFlowConsent> list = this.consents;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ActivationFlowConsentsResponse(header=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectAllCtaTitle=", str4, ", nextStepCtaTitle=");
        return AbstractC30007c.m91840j(str5, ", consents=", ")", sbM32001t, list);
    }

    public ActivationFlowConsentsResponse(String header, String title, String subtitle, String selectAllCtaTitle, String nextStepCtaTitle, List<ActivationFlowConsent> consents) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        AbstractC22676k.m65750j(selectAllCtaTitle, "selectAllCtaTitle");
        AbstractC22676k.m65750j(nextStepCtaTitle, "nextStepCtaTitle");
        AbstractC22676k.m65750j(consents, "consents");
        this.header = header;
        this.title = title;
        this.subtitle = subtitle;
        this.selectAllCtaTitle = selectAllCtaTitle;
        this.nextStepCtaTitle = nextStepCtaTitle;
        this.consents = consents;
    }
}
