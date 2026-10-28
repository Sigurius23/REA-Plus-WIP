package com.whoop.challengedetails.domain.models;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import com.whoop.design.util.TextResource;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kg2.C22458d;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import md1.C25452a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJF\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b2\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b5\u0010.\u001a\u0004\b4\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010/\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\u001c¨\u0006:"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/design/util/TextResource;", "text", "subText", "ctaText", "ctaClose", "<init>", "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$challenge_details_release", "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", "component2", "()Lcom/whoop/design/util/TextResource;", "component3", "component4", "component5", "copy", "(Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponseStatus;", "getStatus", "getStatus$annotations", "()V", "Lcom/whoop/design/util/TextResource;", "getText", "getText$annotations", "getSubText", "getSubText$annotations", "getCtaText", "getCtaText$annotations", "getCtaClose", "getCtaClose$annotations", "Companion", "$serializer", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class JoinChallengeResponse {

    @SerializedName("cta_close")
    private final TextResource ctaClose;

    @SerializedName("cta_text")
    private final TextResource ctaText;

    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final JoinChallengeResponseStatus status;

    @SerializedName("sub_text")
    private final TextResource subText;

    @SerializedName("text")
    private final TextResource text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextResource.$stable;
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C22458d(14)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/challengedetails/domain/models/JoinChallengeResponse;", "serializer", "()Lwc3/c;", "challenge-details_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return JoinChallengeResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ JoinChallengeResponse(int i13, JoinChallengeResponseStatus joinChallengeResponseStatus, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, JoinChallengeResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.status = joinChallengeResponseStatus;
        this.text = textResource;
        this.subText = textResource2;
        this.ctaText = textResource3;
        this.ctaClose = textResource4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return JoinChallengeResponseStatus.INSTANCE.serializer();
    }

    public static /* synthetic */ JoinChallengeResponse copy$default(JoinChallengeResponse joinChallengeResponse, JoinChallengeResponseStatus joinChallengeResponseStatus, TextResource textResource, TextResource textResource2, TextResource textResource3, TextResource textResource4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            joinChallengeResponseStatus = joinChallengeResponse.status;
        }
        if ((i13 & 2) != 0) {
            textResource = joinChallengeResponse.text;
        }
        if ((i13 & 4) != 0) {
            textResource2 = joinChallengeResponse.subText;
        }
        if ((i13 & 8) != 0) {
            textResource3 = joinChallengeResponse.ctaText;
        }
        if ((i13 & 16) != 0) {
            textResource4 = joinChallengeResponse.ctaClose;
        }
        TextResource textResource5 = textResource4;
        TextResource textResource6 = textResource2;
        return joinChallengeResponse.copy(joinChallengeResponseStatus, textResource, textResource6, textResource3, textResource5);
    }

    @InterfaceC37143h("cta_close")
    public static /* synthetic */ void getCtaClose$annotations() {
    }

    @InterfaceC37143h("cta_text")
    public static /* synthetic */ void getCtaText$annotations() {
    }

    @InterfaceC37143h(NotificationCompat.CATEGORY_STATUS)
    public static /* synthetic */ void getStatus$annotations() {
    }

    @InterfaceC37143h("sub_text")
    public static /* synthetic */ void getSubText$annotations() {
    }

    @InterfaceC37143h("text")
    public static /* synthetic */ void getText$annotations() {
    }

    public static final /* synthetic */ void write$Self$challenge_details_release(JoinChallengeResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.status);
        C25452a c25452a = C25452a.f99689a;
        output.encodeSerializableElement(serialDesc, 1, c25452a, self.text);
        output.encodeSerializableElement(serialDesc, 2, c25452a, self.subText);
        output.encodeNullableSerializableElement(serialDesc, 3, c25452a, self.ctaText);
        output.encodeNullableSerializableElement(serialDesc, 4, c25452a, self.ctaClose);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final JoinChallengeResponseStatus getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final TextResource getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TextResource getSubText() {
        return this.subText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TextResource getCtaText() {
        return this.ctaText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TextResource getCtaClose() {
        return this.ctaClose;
    }

    public final JoinChallengeResponse copy(JoinChallengeResponseStatus status, TextResource text, TextResource subText, TextResource ctaText, TextResource ctaClose) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subText, "subText");
        return new JoinChallengeResponse(status, text, subText, ctaText, ctaClose);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JoinChallengeResponse)) {
            return false;
        }
        JoinChallengeResponse joinChallengeResponse = (JoinChallengeResponse) other;
        return this.status == joinChallengeResponse.status && AbstractC22676k.m65745e(this.text, joinChallengeResponse.text) && AbstractC22676k.m65745e(this.subText, joinChallengeResponse.subText) && AbstractC22676k.m65745e(this.ctaText, joinChallengeResponse.ctaText) && AbstractC22676k.m65745e(this.ctaClose, joinChallengeResponse.ctaClose);
    }

    public final TextResource getCtaClose() {
        return this.ctaClose;
    }

    public final TextResource getCtaText() {
        return this.ctaText;
    }

    public final JoinChallengeResponseStatus getStatus() {
        return this.status;
    }

    public final TextResource getSubText() {
        return this.subText;
    }

    public final TextResource getText() {
        return this.text;
    }

    public int hashCode() {
        int iM95625a = AbstractC31061c.m95625a(AbstractC31061c.m95625a(this.status.hashCode() * 31, this.text, 31), this.subText, 31);
        TextResource textResource = this.ctaText;
        int iHashCode = (iM95625a + (textResource == null ? 0 : textResource.hashCode())) * 31;
        TextResource textResource2 = this.ctaClose;
        return iHashCode + (textResource2 != null ? textResource2.hashCode() : 0);
    }

    public String toString() {
        JoinChallengeResponseStatus joinChallengeResponseStatus = this.status;
        TextResource textResource = this.text;
        TextResource textResource2 = this.subText;
        TextResource textResource3 = this.ctaText;
        TextResource textResource4 = this.ctaClose;
        StringBuilder sb4 = new StringBuilder("JoinChallengeResponse(status=");
        sb4.append(joinChallengeResponseStatus);
        sb4.append(", text=");
        sb4.append(textResource);
        sb4.append(", subText=");
        AbstractC30007c.m91855y(sb4, textResource2, ", ctaText=", textResource3, ", ctaClose=");
        return AbstractC30007c.m91841k(sb4, textResource4, ")");
    }

    public JoinChallengeResponse(JoinChallengeResponseStatus status, TextResource text, TextResource subText, TextResource textResource, TextResource textResource2) {
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(subText, "subText");
        this.status = status;
        this.text = text;
        this.subText = subText;
        this.ctaText = textResource;
        this.ctaClose = textResource2;
    }
}
