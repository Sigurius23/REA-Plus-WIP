package com.whoop.strava.domain.models;

import androidx.annotation.Keep;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
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

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00052\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u001b¨\u0006,"}, m65681d2 = {"Lcom/whoop/strava/domain/models/ShareableGraphicResponse;", "", "", "templateName", "templateUrl", "", "selected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$strava_release", "(Lcom/whoop/strava/domain/models/ShareableGraphicResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/strava/domain/models/ShareableGraphicResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTemplateName", "getTemplateUrl", "Z", "getSelected", "Companion", "$serializer", "a", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShareableGraphicResponse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean selected;
    private final String templateName;
    private final String templateUrl;

    /* JADX INFO: renamed from: com.whoop.strava.domain.models.ShareableGraphicResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/strava/domain/models/ShareableGraphicResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/strava/domain/models/ShareableGraphicResponse;", "serializer", "()Lwc3/c;", "strava_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShareableGraphicResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ShareableGraphicResponse(int i13, String str, String str2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ShareableGraphicResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.templateUrl = str2;
        this.selected = z4;
    }

    public static /* synthetic */ ShareableGraphicResponse copy$default(ShareableGraphicResponse shareableGraphicResponse, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shareableGraphicResponse.templateName;
        }
        if ((i13 & 2) != 0) {
            str2 = shareableGraphicResponse.templateUrl;
        }
        if ((i13 & 4) != 0) {
            z4 = shareableGraphicResponse.selected;
        }
        return shareableGraphicResponse.copy(str, str2, z4);
    }

    public static final /* synthetic */ void write$Self$strava_release(ShareableGraphicResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.templateName);
        output.encodeStringElement(serialDesc, 1, self.templateUrl);
        output.encodeBooleanElement(serialDesc, 2, self.selected);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTemplateName() {
        return this.templateName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final ShareableGraphicResponse copy(String templateName, String templateUrl, boolean selected) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(templateUrl, "templateUrl");
        return new ShareableGraphicResponse(templateName, templateUrl, selected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareableGraphicResponse)) {
            return false;
        }
        ShareableGraphicResponse shareableGraphicResponse = (ShareableGraphicResponse) other;
        return AbstractC22676k.m65745e(this.templateName, shareableGraphicResponse.templateName) && AbstractC22676k.m65745e(this.templateUrl, shareableGraphicResponse.templateUrl) && this.selected == shareableGraphicResponse.selected;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final String getTemplateUrl() {
        return this.templateUrl;
    }

    public int hashCode() {
        return Boolean.hashCode(this.selected) + AbstractC11266d.m30450d(this.templateName.hashCode() * 31, 31, this.templateUrl);
    }

    public String toString() {
        String str = this.templateName;
        String str2 = this.templateUrl;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("ShareableGraphicResponse(templateName=", str, ", templateUrl=", str2, ", selected="), this.selected, ")");
    }

    public ShareableGraphicResponse(String templateName, String templateUrl, boolean z4) {
        AbstractC22676k.m65750j(templateName, "templateName");
        AbstractC22676k.m65750j(templateUrl, "templateUrl");
        this.templateName = templateName;
        this.templateUrl = templateUrl;
        this.selected = z4;
    }
}
