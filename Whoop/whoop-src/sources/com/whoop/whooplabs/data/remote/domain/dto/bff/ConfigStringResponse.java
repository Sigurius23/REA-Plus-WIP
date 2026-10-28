package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.core.app.FrameMetricsAggregator;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBu\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'Jl\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;", "", "", "title", "body", "positiveCta", "negativeCta", "errorTitle", "errorBody", "errorPositiveCta", "errorNegativeCta", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "cancelScreen", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBody", "getPositiveCta", "getNegativeCta", "getErrorTitle", "getErrorBody", "getErrorPositiveCta", "getErrorNegativeCta", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CancelScreenConfigResponse;", "getCancelScreen", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConfigStringResponse {
    private final String body;
    private final CancelScreenConfigResponse cancelScreen;
    private final String errorBody;
    private final String errorNegativeCta;
    private final String errorPositiveCta;
    private final String errorTitle;
    private final String negativeCta;
    private final String positiveCta;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConfigStringResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConfigStringResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConfigStringResponse(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CancelScreenConfigResponse cancelScreenConfigResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, ConfigStringResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.body = str2;
        this.positiveCta = str3;
        this.negativeCta = str4;
        this.errorTitle = str5;
        this.errorBody = str6;
        this.errorPositiveCta = str7;
        this.errorNegativeCta = str8;
        this.cancelScreen = cancelScreenConfigResponse;
    }

    public static /* synthetic */ ConfigStringResponse copy$default(ConfigStringResponse configStringResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CancelScreenConfigResponse cancelScreenConfigResponse, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = configStringResponse.title;
        }
        if ((i13 & 2) != 0) {
            str2 = configStringResponse.body;
        }
        if ((i13 & 4) != 0) {
            str3 = configStringResponse.positiveCta;
        }
        if ((i13 & 8) != 0) {
            str4 = configStringResponse.negativeCta;
        }
        if ((i13 & 16) != 0) {
            str5 = configStringResponse.errorTitle;
        }
        if ((i13 & 32) != 0) {
            str6 = configStringResponse.errorBody;
        }
        if ((i13 & 64) != 0) {
            str7 = configStringResponse.errorPositiveCta;
        }
        if ((i13 & 128) != 0) {
            str8 = configStringResponse.errorNegativeCta;
        }
        if ((i13 & 256) != 0) {
            cancelScreenConfigResponse = configStringResponse.cancelScreen;
        }
        String str9 = str8;
        CancelScreenConfigResponse cancelScreenConfigResponse2 = cancelScreenConfigResponse;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return configStringResponse.copy(str, str2, str13, str4, str12, str10, str11, str9, cancelScreenConfigResponse2);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ConfigStringResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.body);
        output.encodeStringElement(serialDesc, 2, self.positiveCta);
        output.encodeStringElement(serialDesc, 3, self.negativeCta);
        output.encodeStringElement(serialDesc, 4, self.errorTitle);
        output.encodeStringElement(serialDesc, 5, self.errorBody);
        output.encodeStringElement(serialDesc, 6, self.errorPositiveCta);
        output.encodeStringElement(serialDesc, 7, self.errorNegativeCta);
        output.encodeNullableSerializableElement(serialDesc, 8, CancelScreenConfigResponse$$serializer.INSTANCE, self.cancelScreen);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPositiveCta() {
        return this.positiveCta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNegativeCta() {
        return this.negativeCta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getErrorTitle() {
        return this.errorTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorBody() {
        return this.errorBody;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getErrorPositiveCta() {
        return this.errorPositiveCta;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getErrorNegativeCta() {
        return this.errorNegativeCta;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final CancelScreenConfigResponse getCancelScreen() {
        return this.cancelScreen;
    }

    public final ConfigStringResponse copy(String title, String body, String positiveCta, String negativeCta, String errorTitle, String errorBody, String errorPositiveCta, String errorNegativeCta, CancelScreenConfigResponse cancelScreen) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorBody, "errorBody");
        AbstractC22676k.m65750j(errorPositiveCta, "errorPositiveCta");
        AbstractC22676k.m65750j(errorNegativeCta, "errorNegativeCta");
        return new ConfigStringResponse(title, body, positiveCta, negativeCta, errorTitle, errorBody, errorPositiveCta, errorNegativeCta, cancelScreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigStringResponse)) {
            return false;
        }
        ConfigStringResponse configStringResponse = (ConfigStringResponse) other;
        return AbstractC22676k.m65745e(this.title, configStringResponse.title) && AbstractC22676k.m65745e(this.body, configStringResponse.body) && AbstractC22676k.m65745e(this.positiveCta, configStringResponse.positiveCta) && AbstractC22676k.m65745e(this.negativeCta, configStringResponse.negativeCta) && AbstractC22676k.m65745e(this.errorTitle, configStringResponse.errorTitle) && AbstractC22676k.m65745e(this.errorBody, configStringResponse.errorBody) && AbstractC22676k.m65745e(this.errorPositiveCta, configStringResponse.errorPositiveCta) && AbstractC22676k.m65745e(this.errorNegativeCta, configStringResponse.errorNegativeCta) && AbstractC22676k.m65745e(this.cancelScreen, configStringResponse.cancelScreen);
    }

    public final String getBody() {
        return this.body;
    }

    public final CancelScreenConfigResponse getCancelScreen() {
        return this.cancelScreen;
    }

    public final String getErrorBody() {
        return this.errorBody;
    }

    public final String getErrorNegativeCta() {
        return this.errorNegativeCta;
    }

    public final String getErrorPositiveCta() {
        return this.errorPositiveCta;
    }

    public final String getErrorTitle() {
        return this.errorTitle;
    }

    public final String getNegativeCta() {
        return this.negativeCta;
    }

    public final String getPositiveCta() {
        return this.positiveCta;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.body), 31, this.positiveCta), 31, this.negativeCta), 31, this.errorTitle), 31, this.errorBody), 31, this.errorPositiveCta), 31, this.errorNegativeCta);
        CancelScreenConfigResponse cancelScreenConfigResponse = this.cancelScreen;
        return iM30450d + (cancelScreenConfigResponse == null ? 0 : cancelScreenConfigResponse.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.body;
        String str3 = this.positiveCta;
        String str4 = this.negativeCta;
        String str5 = this.errorTitle;
        String str6 = this.errorBody;
        String str7 = this.errorPositiveCta;
        String str8 = this.errorNegativeCta;
        CancelScreenConfigResponse cancelScreenConfigResponse = this.cancelScreen;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConfigStringResponse(title=", str, ", body=", str2, ", positiveCta=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", negativeCta=", str4, ", errorTitle=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", errorBody=", str6, ", errorPositiveCta=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", errorNegativeCta=", str8, ", cancelScreen=");
        sbM32001t.append(cancelScreenConfigResponse);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ConfigStringResponse(String title, String body, String positiveCta, String negativeCta, String errorTitle, String errorBody, String errorPositiveCta, String errorNegativeCta, CancelScreenConfigResponse cancelScreenConfigResponse) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(body, "body");
        AbstractC22676k.m65750j(positiveCta, "positiveCta");
        AbstractC22676k.m65750j(negativeCta, "negativeCta");
        AbstractC22676k.m65750j(errorTitle, "errorTitle");
        AbstractC22676k.m65750j(errorBody, "errorBody");
        AbstractC22676k.m65750j(errorPositiveCta, "errorPositiveCta");
        AbstractC22676k.m65750j(errorNegativeCta, "errorNegativeCta");
        this.title = title;
        this.body = body;
        this.positiveCta = positiveCta;
        this.negativeCta = negativeCta;
        this.errorTitle = errorTitle;
        this.errorBody = errorBody;
        this.errorPositiveCta = errorPositiveCta;
        this.errorNegativeCta = errorNegativeCta;
        this.cancelScreen = cancelScreenConfigResponse;
    }
}
