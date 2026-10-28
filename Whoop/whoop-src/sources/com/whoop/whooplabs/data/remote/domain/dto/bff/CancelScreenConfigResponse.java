package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00066"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "", "", "title", "subtitle", "", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenOptionResponse;", "options", "bottomText", "ctaText", "backText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Ljava/util/List;", "getOptions", "getBottomText", "getCtaText", "getBackText", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CancelScreenConfigResponse {
    private final String backText;
    private final String bottomText;
    private final String ctaText;
    private final List<CancelScreenOptionResponse> options;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(2)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CancelScreenConfigResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CancelScreenConfigResponse(int i13, String str, String str2, List list, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, CancelScreenConfigResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.options = list;
        this.bottomText = str3;
        this.ctaText = str4;
        this.backText = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CancelScreenOptionResponse$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CancelScreenConfigResponse copy$default(CancelScreenConfigResponse cancelScreenConfigResponse, String str, String str2, List list, String str3, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = cancelScreenConfigResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = cancelScreenConfigResponse.subtitle;
        }
        if ((i13 & 4) != 0) {
            list = cancelScreenConfigResponse.options;
        }
        if ((i13 & 8) != 0) {
            str3 = cancelScreenConfigResponse.bottomText;
        }
        if ((i13 & 16) != 0) {
            str4 = cancelScreenConfigResponse.ctaText;
        }
        if ((i13 & 32) != 0) {
            str5 = cancelScreenConfigResponse.backText;
        }
        String str6 = str4;
        String str7 = str5;
        return cancelScreenConfigResponse.copy(str, str2, list, str3, str6, str7);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(CancelScreenConfigResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.options);
        output.encodeStringElement(serialDesc, 3, self.bottomText);
        output.encodeStringElement(serialDesc, 4, self.ctaText);
        output.encodeStringElement(serialDesc, 5, self.backText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final List<CancelScreenOptionResponse> component3() {
        return this.options;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBottomText() {
        return this.bottomText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBackText() {
        return this.backText;
    }

    public final CancelScreenConfigResponse copy(String title, String subtitle, List<CancelScreenOptionResponse> options, String bottomText, String ctaText, String backText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(bottomText, "bottomText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(backText, "backText");
        return new CancelScreenConfigResponse(title, subtitle, options, bottomText, ctaText, backText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelScreenConfigResponse)) {
            return false;
        }
        CancelScreenConfigResponse cancelScreenConfigResponse = (CancelScreenConfigResponse) other;
        return AbstractC22676k.m65745e(this.title, cancelScreenConfigResponse.title) && AbstractC22676k.m65745e(this.subtitle, cancelScreenConfigResponse.subtitle) && AbstractC22676k.m65745e(this.options, cancelScreenConfigResponse.options) && AbstractC22676k.m65745e(this.bottomText, cancelScreenConfigResponse.bottomText) && AbstractC22676k.m65745e(this.ctaText, cancelScreenConfigResponse.ctaText) && AbstractC22676k.m65745e(this.backText, cancelScreenConfigResponse.backText);
    }

    public final String getBackText() {
        return this.backText;
    }

    public final String getBottomText() {
        return this.bottomText;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final List<CancelScreenOptionResponse> getOptions() {
        return this.options;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.backText.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11895b.m31983b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.options), 31, this.bottomText), 31, this.ctaText);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        List<CancelScreenOptionResponse> list = this.options;
        String str3 = this.bottomText;
        String str4 = this.ctaText;
        String str5 = this.backText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CancelScreenConfigResponse(title=", str, ", subtitle=", str2, ", options=");
        AbstractC17176i.m48511m(", bottomText=", str3, ", ctaText=", sbM32001t, list);
        return AbstractC11266d.m30464r(sbM32001t, str4, ", backText=", str5, ")");
    }

    public CancelScreenConfigResponse(String title, String str, List<CancelScreenOptionResponse> options, String bottomText, String ctaText, String backText) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(options, "options");
        AbstractC22676k.m65750j(bottomText, "bottomText");
        AbstractC22676k.m65750j(ctaText, "ctaText");
        AbstractC22676k.m65750j(backText, "backText");
        this.title = title;
        this.subtitle = str;
        this.options = options;
        this.bottomText = bottomText;
        this.ctaText = ctaText;
        this.backText = backText;
    }
}
