package com.whoop.clinicianintheloop.api;

import com.whoop.design.models.ProgressButtonModel;
import go0.C16014d;
import go0.EnumC16011a;
import go0.EnumC16015e;
import go0.InterfaceC16013c;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b¨\u00064"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "", "", "id", "navigationTitle", "navigationSkipTitle", "Lgo0/a;", "contentAlignment", "Lgo0/e;", "type", "Lgo0/c;", "content", "Lcom/whoop/design/models/ProgressButtonModel;", "progressButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lgo0/a;", "component5", "()Lgo0/e;", "component6", "()Lgo0/c;", "component7", "()Lcom/whoop/design/models/ProgressButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgo0/a;Lgo0/e;Lgo0/c;Lcom/whoop/design/models/ProgressButtonModel;)Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getNavigationTitle", "getNavigationSkipTitle", "Lgo0/a;", "getContentAlignment", "Lgo0/e;", "getType", "Lgo0/c;", "getContent", "Lcom/whoop/design/models/ProgressButtonModel;", "getProgressButton", "Companion", "a", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i(with = C16014d.class)
public final /* data */ class VideoSchedulingIntakeScreen {
    private final InterfaceC16013c content;
    private final EnumC16011a contentAlignment;
    private final String id;
    private final String navigationSkipTitle;
    private final String navigationTitle;
    private final ProgressButtonModel progressButton;
    private final EnumC16015e type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = ProgressButtonModel.$stable;

    /* JADX INFO: renamed from: com.whoop.clinicianintheloop.api.VideoSchedulingIntakeScreen$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeScreen;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return C16014d.f60609a;
        }

        private Companion() {
        }
    }

    public VideoSchedulingIntakeScreen(String id4, String navigationTitle, String str, EnumC16011a contentAlignment, EnumC16015e type, InterfaceC16013c content, ProgressButtonModel progressButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(contentAlignment, "contentAlignment");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        this.id = id4;
        this.navigationTitle = navigationTitle;
        this.navigationSkipTitle = str;
        this.contentAlignment = contentAlignment;
        this.type = type;
        this.content = content;
        this.progressButton = progressButton;
    }

    public static /* synthetic */ VideoSchedulingIntakeScreen copy$default(VideoSchedulingIntakeScreen videoSchedulingIntakeScreen, String str, String str2, String str3, EnumC16011a enumC16011a, EnumC16015e enumC16015e, InterfaceC16013c interfaceC16013c, ProgressButtonModel progressButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = videoSchedulingIntakeScreen.id;
        }
        if ((i13 & 2) != 0) {
            str2 = videoSchedulingIntakeScreen.navigationTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = videoSchedulingIntakeScreen.navigationSkipTitle;
        }
        if ((i13 & 8) != 0) {
            enumC16011a = videoSchedulingIntakeScreen.contentAlignment;
        }
        if ((i13 & 16) != 0) {
            enumC16015e = videoSchedulingIntakeScreen.type;
        }
        if ((i13 & 32) != 0) {
            interfaceC16013c = videoSchedulingIntakeScreen.content;
        }
        if ((i13 & 64) != 0) {
            progressButtonModel = videoSchedulingIntakeScreen.progressButton;
        }
        InterfaceC16013c interfaceC16013c2 = interfaceC16013c;
        ProgressButtonModel progressButtonModel2 = progressButtonModel;
        EnumC16015e enumC16015e2 = enumC16015e;
        String str4 = str3;
        return videoSchedulingIntakeScreen.copy(str, str2, str4, enumC16011a, enumC16015e2, interfaceC16013c2, progressButtonModel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNavigationSkipTitle() {
        return this.navigationSkipTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC16011a getContentAlignment() {
        return this.contentAlignment;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16015e getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InterfaceC16013c getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public final VideoSchedulingIntakeScreen copy(String id4, String navigationTitle, String navigationSkipTitle, EnumC16011a contentAlignment, EnumC16015e type, InterfaceC16013c content, ProgressButtonModel progressButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(contentAlignment, "contentAlignment");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(progressButton, "progressButton");
        return new VideoSchedulingIntakeScreen(id4, navigationTitle, navigationSkipTitle, contentAlignment, type, content, progressButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoSchedulingIntakeScreen)) {
            return false;
        }
        VideoSchedulingIntakeScreen videoSchedulingIntakeScreen = (VideoSchedulingIntakeScreen) other;
        return AbstractC22676k.m65745e(this.id, videoSchedulingIntakeScreen.id) && AbstractC22676k.m65745e(this.navigationTitle, videoSchedulingIntakeScreen.navigationTitle) && AbstractC22676k.m65745e(this.navigationSkipTitle, videoSchedulingIntakeScreen.navigationSkipTitle) && this.contentAlignment == videoSchedulingIntakeScreen.contentAlignment && this.type == videoSchedulingIntakeScreen.type && AbstractC22676k.m65745e(this.content, videoSchedulingIntakeScreen.content) && AbstractC22676k.m65745e(this.progressButton, videoSchedulingIntakeScreen.progressButton);
    }

    public final InterfaceC16013c getContent() {
        return this.content;
    }

    public final EnumC16011a getContentAlignment() {
        return this.contentAlignment;
    }

    public final String getId() {
        return this.id;
    }

    public final String getNavigationSkipTitle() {
        return this.navigationSkipTitle;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final ProgressButtonModel getProgressButton() {
        return this.progressButton;
    }

    public final EnumC16015e getType() {
        return this.type;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.navigationTitle);
        String str = this.navigationSkipTitle;
        return this.progressButton.hashCode() + ((this.content.hashCode() + ((this.type.hashCode() + ((this.contentAlignment.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.navigationTitle;
        String str3 = this.navigationSkipTitle;
        EnumC16011a enumC16011a = this.contentAlignment;
        EnumC16015e enumC16015e = this.type;
        InterfaceC16013c interfaceC16013c = this.content;
        ProgressButtonModel progressButtonModel = this.progressButton;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("VideoSchedulingIntakeScreen(id=", str, ", navigationTitle=", str2, ", navigationSkipTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", contentAlignment=");
        sbM32001t.append(enumC16011a);
        sbM32001t.append(", type=");
        sbM32001t.append(enumC16015e);
        sbM32001t.append(", content=");
        sbM32001t.append(interfaceC16013c);
        sbM32001t.append(", progressButton=");
        sbM32001t.append(progressButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
