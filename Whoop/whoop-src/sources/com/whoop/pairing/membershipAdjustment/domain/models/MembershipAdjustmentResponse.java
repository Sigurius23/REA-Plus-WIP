package com.whoop.pairing.membershipAdjustment.domain.models;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0081\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jv\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;", "", "", "header", "tag", "title", "body", "continueCtaTitle", "cancelCtaTitle", "strapImage", "path", "", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$pairing_ui_release", "(Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getTag", "getTitle", "getBody", "getContinueCtaTitle", "getCancelCtaTitle", "getStrapImage", "getPath", "Ljava/util/Map;", "getPayload", "Companion", "$serializer", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MembershipAdjustmentResponse {
    private final String body;
    private final String cancelCtaTitle;
    private final String continueCtaTitle;
    private final String header;
    private final String path;
    private final Map<String, String> payload;
    private final String strapImage;
    private final String tag;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(13))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/pairing/membershipAdjustment/domain/models/MembershipAdjustmentResponse;", "serializer", "()Lwc3/c;", "pairing-ui_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MembershipAdjustmentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MembershipAdjustmentResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, MembershipAdjustmentResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.tag = str2;
        this.title = str3;
        this.body = str4;
        this.continueCtaTitle = str5;
        this.cancelCtaTitle = str6;
        this.strapImage = str7;
        this.path = str8;
        this.payload = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MembershipAdjustmentResponse copy$default(MembershipAdjustmentResponse membershipAdjustmentResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = membershipAdjustmentResponse.header;
        }
        if ((i13 & 2) != 0) {
            str2 = membershipAdjustmentResponse.tag;
        }
        if ((i13 & 4) != 0) {
            str3 = membershipAdjustmentResponse.title;
        }
        if ((i13 & 8) != 0) {
            str4 = membershipAdjustmentResponse.body;
        }
        if ((i13 & 16) != 0) {
            str5 = membershipAdjustmentResponse.continueCtaTitle;
        }
        if ((i13 & 32) != 0) {
            str6 = membershipAdjustmentResponse.cancelCtaTitle;
        }
        if ((i13 & 64) != 0) {
            str7 = membershipAdjustmentResponse.strapImage;
        }
        if ((i13 & 128) != 0) {
            str8 = membershipAdjustmentResponse.path;
        }
        if ((i13 & 256) != 0) {
            map = membershipAdjustmentResponse.payload;
        }
        String str9 = str8;
        Map map2 = map;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return membershipAdjustmentResponse.copy(str, str2, str13, str4, str12, str10, str11, str9, map2);
    }

    public static final /* synthetic */ void write$Self$pairing_ui_release(MembershipAdjustmentResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.header);
        output.encodeStringElement(serialDesc, 1, self.tag);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.body);
        output.encodeStringElement(serialDesc, 4, self.continueCtaTitle);
        output.encodeStringElement(serialDesc, 5, self.cancelCtaTitle);
        output.encodeStringElement(serialDesc, 6, self.strapImage);
        output.encodeStringElement(serialDesc, 7, self.path);
        output.encodeSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.payload);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContinueCtaTitle() {
        return this.continueCtaTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCancelCtaTitle() {
        return this.cancelCtaTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStrapImage() {
        return this.strapImage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> component9() {
        return this.payload;
    }

    public final MembershipAdjustmentResponse copy(String header, String tag, String title, String body, String continueCtaTitle, String cancelCtaTitle, String strapImage, String path, Map<String, String> payload) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(continueCtaTitle, "continueCtaTitle");
        AbstractC22676k.m65750j(cancelCtaTitle, "cancelCtaTitle");
        AbstractC22676k.m65750j(strapImage, "strapImage");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        return new MembershipAdjustmentResponse(header, tag, title, body, continueCtaTitle, cancelCtaTitle, strapImage, path, payload);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MembershipAdjustmentResponse)) {
            return false;
        }
        MembershipAdjustmentResponse membershipAdjustmentResponse = (MembershipAdjustmentResponse) other;
        return AbstractC22676k.m65745e(this.header, membershipAdjustmentResponse.header) && AbstractC22676k.m65745e(this.tag, membershipAdjustmentResponse.tag) && AbstractC22676k.m65745e(this.title, membershipAdjustmentResponse.title) && AbstractC22676k.m65745e(this.body, membershipAdjustmentResponse.body) && AbstractC22676k.m65745e(this.continueCtaTitle, membershipAdjustmentResponse.continueCtaTitle) && AbstractC22676k.m65745e(this.cancelCtaTitle, membershipAdjustmentResponse.cancelCtaTitle) && AbstractC22676k.m65745e(this.strapImage, membershipAdjustmentResponse.strapImage) && AbstractC22676k.m65745e(this.path, membershipAdjustmentResponse.path) && AbstractC22676k.m65745e(this.payload, membershipAdjustmentResponse.payload);
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCancelCtaTitle() {
        return this.cancelCtaTitle;
    }

    public final String getContinueCtaTitle() {
        return this.continueCtaTitle;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getPath() {
        return this.path;
    }

    public final Map<String, String> getPayload() {
        return this.payload;
    }

    public final String getStrapImage() {
        return this.strapImage;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.payload.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.tag), 31, this.title), 31, this.body), 31, this.continueCtaTitle), 31, this.cancelCtaTitle), 31, this.strapImage), 31, this.path);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.tag;
        String str3 = this.title;
        String str4 = this.body;
        String str5 = this.continueCtaTitle;
        String str6 = this.cancelCtaTitle;
        String str7 = this.strapImage;
        String str8 = this.path;
        Map<String, String> map = this.payload;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MembershipAdjustmentResponse(header=", str, ", tag=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", body=", str4, ", continueCtaTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", cancelCtaTitle=", str6, ", strapImage=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", path=", str8, ", payload=");
        return AbstractC13673n.m38565l(sbM32001t, map, ")");
    }

    public MembershipAdjustmentResponse(String header, String tag, String title, String body, String continueCtaTitle, String cancelCtaTitle, String strapImage, String path, Map<String, String> payload) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(continueCtaTitle, "continueCtaTitle");
        AbstractC22676k.m65750j(cancelCtaTitle, "cancelCtaTitle");
        AbstractC22676k.m65750j(strapImage, "strapImage");
        AbstractC22676k.m65750j(path, "path");
        AbstractC22676k.m65750j(payload, "payload");
        this.header = header;
        this.tag = tag;
        this.title = title;
        this.body = body;
        this.continueCtaTitle = continueCtaTitle;
        this.cancelCtaTitle = cancelCtaTitle;
        this.strapImage = strapImage;
        this.path = path;
        this.payload = payload;
    }
}
