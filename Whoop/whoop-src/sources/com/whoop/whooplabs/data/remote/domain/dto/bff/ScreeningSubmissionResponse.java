package com.whoop.whooplabs.data.remote.domain.dto.bff;

import androidx.core.app.NotificationCompat;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dx2.C12430a;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JP\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "", "", "icon", "iconColor", "content", "cta", "backgroundUrl", "Lcom/whoop/navigation/e;", NotificationCompat.CATEGORY_NAVIGATION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getIconColor", "getContent", "getCta", "getBackgroundUrl", "getBackgroundUrl$annotations", "()V", "Lcom/whoop/navigation/e;", "getNavigation", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ScreeningSubmissionResponse {
    private final String backgroundUrl;
    private final String content;
    private final String cta;
    private final String icon;
    private final String iconColor;
    private final C9598e navigation;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12430a(11))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ScreeningSubmissionResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ScreeningSubmissionResponse(int i13, String str, String str2, String str3, String str4, String str5, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ScreeningSubmissionResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.icon = str;
        this.iconColor = str2;
        this.content = str3;
        this.cta = str4;
        this.backgroundUrl = str5;
        this.navigation = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ScreeningSubmissionResponse copy$default(ScreeningSubmissionResponse screeningSubmissionResponse, String str, String str2, String str3, String str4, String str5, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = screeningSubmissionResponse.icon;
        }
        if ((i13 & 2) != 0) {
            str2 = screeningSubmissionResponse.iconColor;
        }
        if ((i13 & 4) != 0) {
            str3 = screeningSubmissionResponse.content;
        }
        if ((i13 & 8) != 0) {
            str4 = screeningSubmissionResponse.cta;
        }
        if ((i13 & 16) != 0) {
            str5 = screeningSubmissionResponse.backgroundUrl;
        }
        if ((i13 & 32) != 0) {
            c9598e = screeningSubmissionResponse.navigation;
        }
        String str6 = str5;
        C9598e c9598e2 = c9598e;
        return screeningSubmissionResponse.copy(str, str2, str3, str4, str6, c9598e2);
    }

    @InterfaceC37143h("background_image_url")
    public static /* synthetic */ void getBackgroundUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ScreeningSubmissionResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.icon);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.iconColor);
        output.encodeStringElement(serialDesc, 2, self.content);
        output.encodeStringElement(serialDesc, 3, self.cta);
        output.encodeStringElement(serialDesc, 4, self.backgroundUrl);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.navigation);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final C9598e getNavigation() {
        return this.navigation;
    }

    public final ScreeningSubmissionResponse copy(String icon, String iconColor, String content, String cta, String backgroundUrl, C9598e navigation) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(backgroundUrl, "backgroundUrl");
        return new ScreeningSubmissionResponse(icon, iconColor, content, cta, backgroundUrl, navigation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreeningSubmissionResponse)) {
            return false;
        }
        ScreeningSubmissionResponse screeningSubmissionResponse = (ScreeningSubmissionResponse) other;
        return AbstractC22676k.m65745e(this.icon, screeningSubmissionResponse.icon) && AbstractC22676k.m65745e(this.iconColor, screeningSubmissionResponse.iconColor) && AbstractC22676k.m65745e(this.content, screeningSubmissionResponse.content) && AbstractC22676k.m65745e(this.cta, screeningSubmissionResponse.cta) && AbstractC22676k.m65745e(this.backgroundUrl, screeningSubmissionResponse.backgroundUrl) && AbstractC22676k.m65745e(this.navigation, screeningSubmissionResponse.navigation);
    }

    public final String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final C9598e getNavigation() {
        return this.navigation;
    }

    public int hashCode() {
        int iHashCode = this.icon.hashCode() * 31;
        String str = this.iconColor;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.content), 31, this.cta), 31, this.backgroundUrl);
        C9598e c9598e = this.navigation;
        return iM30450d + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        String str = this.icon;
        String str2 = this.iconColor;
        String str3 = this.content;
        String str4 = this.cta;
        String str5 = this.backgroundUrl;
        C9598e c9598e = this.navigation;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ScreeningSubmissionResponse(icon=", str, ", iconColor=", str2, ", content=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", cta=", str4, ", backgroundUrl=");
        return AbstractC13673n.m38563j(sbM32001t, str5, ", navigation=", c9598e, ")");
    }

    public ScreeningSubmissionResponse(String icon, String str, String content, String cta, String backgroundUrl, C9598e c9598e) {
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(backgroundUrl, "backgroundUrl");
        this.icon = icon;
        this.iconColor = str;
        this.content = content;
        this.cta = cta;
        this.backgroundUrl = backgroundUrl;
        this.navigation = c9598e;
    }
}
