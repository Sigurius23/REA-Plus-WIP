package com.whoop.whooplabs.data.remote.domain.dto.bff;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import no.nordicsemi.android.dfu.DfuBaseService;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0080\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b9\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00107\u001a\u0004\b;\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b<\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b?\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b@\u0010\u0018R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\bA\u0010\u0018R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010$¨\u0006G"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "", "", "deviceType", "title", "connectedSubtitle", "connectedText", "connectedIcon", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;", "connectedCtaButton", "disconnectedSubtitle", "disconnectedText", "disconnectedIcon", "disconnectedCtaButton", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "disconnectView", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;", "component7", "component8", "component9", "component10", "component11", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;)Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$whooplabs_release", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getDeviceType", "getTitle", "getConnectedSubtitle", "getConnectedText", "getConnectedIcon", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CtaButton;", "getConnectedCtaButton", "getDisconnectedSubtitle", "getDisconnectedText", "getDisconnectedIcon", "getDisconnectedCtaButton", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/DisconnectView;", "getDisconnectView", "Companion", "$serializer", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConnectedDeviceDisplay {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CtaButton connectedCtaButton;
    private final String connectedIcon;
    private final String connectedSubtitle;
    private final String connectedText;
    private final String deviceType;
    private final DisconnectView disconnectView;
    private final CtaButton disconnectedCtaButton;
    private final String disconnectedIcon;
    private final String disconnectedSubtitle;
    private final String disconnectedText;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ConnectedDeviceDisplay;", "serializer", "()Lwc3/c;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConnectedDeviceDisplay$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConnectedDeviceDisplay(int i13, String str, String str2, String str3, String str4, String str5, CtaButton ctaButton, String str6, String str7, String str8, CtaButton ctaButton2, DisconnectView disconnectView, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i13 & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2047, ConnectedDeviceDisplay$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceType = str;
        this.title = str2;
        this.connectedSubtitle = str3;
        this.connectedText = str4;
        this.connectedIcon = str5;
        this.connectedCtaButton = ctaButton;
        this.disconnectedSubtitle = str6;
        this.disconnectedText = str7;
        this.disconnectedIcon = str8;
        this.disconnectedCtaButton = ctaButton2;
        this.disconnectView = disconnectView;
    }

    public static /* synthetic */ ConnectedDeviceDisplay copy$default(ConnectedDeviceDisplay connectedDeviceDisplay, String str, String str2, String str3, String str4, String str5, CtaButton ctaButton, String str6, String str7, String str8, CtaButton ctaButton2, DisconnectView disconnectView, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = connectedDeviceDisplay.deviceType;
        }
        if ((i13 & 2) != 0) {
            str2 = connectedDeviceDisplay.title;
        }
        if ((i13 & 4) != 0) {
            str3 = connectedDeviceDisplay.connectedSubtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = connectedDeviceDisplay.connectedText;
        }
        if ((i13 & 16) != 0) {
            str5 = connectedDeviceDisplay.connectedIcon;
        }
        if ((i13 & 32) != 0) {
            ctaButton = connectedDeviceDisplay.connectedCtaButton;
        }
        if ((i13 & 64) != 0) {
            str6 = connectedDeviceDisplay.disconnectedSubtitle;
        }
        if ((i13 & 128) != 0) {
            str7 = connectedDeviceDisplay.disconnectedText;
        }
        if ((i13 & 256) != 0) {
            str8 = connectedDeviceDisplay.disconnectedIcon;
        }
        if ((i13 & 512) != 0) {
            ctaButton2 = connectedDeviceDisplay.disconnectedCtaButton;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            disconnectView = connectedDeviceDisplay.disconnectView;
        }
        CtaButton ctaButton3 = ctaButton2;
        DisconnectView disconnectView2 = disconnectView;
        String str9 = str7;
        String str10 = str8;
        CtaButton ctaButton4 = ctaButton;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return connectedDeviceDisplay.copy(str, str2, str13, str4, str12, ctaButton4, str11, str9, str10, ctaButton3, disconnectView2);
    }

    public static final /* synthetic */ void write$Self$whooplabs_release(ConnectedDeviceDisplay self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.deviceType);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.connectedSubtitle);
        output.encodeStringElement(serialDesc, 3, self.connectedText);
        output.encodeStringElement(serialDesc, 4, self.connectedIcon);
        CtaButton$$serializer ctaButton$$serializer = CtaButton$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, ctaButton$$serializer, self.connectedCtaButton);
        output.encodeStringElement(serialDesc, 6, self.disconnectedSubtitle);
        output.encodeStringElement(serialDesc, 7, self.disconnectedText);
        output.encodeStringElement(serialDesc, 8, self.disconnectedIcon);
        output.encodeSerializableElement(serialDesc, 9, ctaButton$$serializer, self.disconnectedCtaButton);
        output.encodeNullableSerializableElement(serialDesc, 10, DisconnectView$$serializer.INSTANCE, self.disconnectView);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final CtaButton getDisconnectedCtaButton() {
        return this.disconnectedCtaButton;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DisconnectView getDisconnectView() {
        return this.disconnectView;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConnectedSubtitle() {
        return this.connectedSubtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConnectedText() {
        return this.connectedText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConnectedIcon() {
        return this.connectedIcon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CtaButton getConnectedCtaButton() {
        return this.connectedCtaButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDisconnectedSubtitle() {
        return this.disconnectedSubtitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisconnectedText() {
        return this.disconnectedText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDisconnectedIcon() {
        return this.disconnectedIcon;
    }

    public final ConnectedDeviceDisplay copy(String deviceType, String title, String connectedSubtitle, String connectedText, String connectedIcon, CtaButton connectedCtaButton, String disconnectedSubtitle, String disconnectedText, String disconnectedIcon, CtaButton disconnectedCtaButton, DisconnectView disconnectView) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(connectedSubtitle, "connectedSubtitle");
        AbstractC22676k.m65750j(connectedText, "connectedText");
        AbstractC22676k.m65750j(connectedIcon, "connectedIcon");
        AbstractC22676k.m65750j(connectedCtaButton, "connectedCtaButton");
        AbstractC22676k.m65750j(disconnectedSubtitle, "disconnectedSubtitle");
        AbstractC22676k.m65750j(disconnectedText, "disconnectedText");
        AbstractC22676k.m65750j(disconnectedIcon, "disconnectedIcon");
        AbstractC22676k.m65750j(disconnectedCtaButton, "disconnectedCtaButton");
        return new ConnectedDeviceDisplay(deviceType, title, connectedSubtitle, connectedText, connectedIcon, connectedCtaButton, disconnectedSubtitle, disconnectedText, disconnectedIcon, disconnectedCtaButton, disconnectView);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConnectedDeviceDisplay)) {
            return false;
        }
        ConnectedDeviceDisplay connectedDeviceDisplay = (ConnectedDeviceDisplay) other;
        return AbstractC22676k.m65745e(this.deviceType, connectedDeviceDisplay.deviceType) && AbstractC22676k.m65745e(this.title, connectedDeviceDisplay.title) && AbstractC22676k.m65745e(this.connectedSubtitle, connectedDeviceDisplay.connectedSubtitle) && AbstractC22676k.m65745e(this.connectedText, connectedDeviceDisplay.connectedText) && AbstractC22676k.m65745e(this.connectedIcon, connectedDeviceDisplay.connectedIcon) && AbstractC22676k.m65745e(this.connectedCtaButton, connectedDeviceDisplay.connectedCtaButton) && AbstractC22676k.m65745e(this.disconnectedSubtitle, connectedDeviceDisplay.disconnectedSubtitle) && AbstractC22676k.m65745e(this.disconnectedText, connectedDeviceDisplay.disconnectedText) && AbstractC22676k.m65745e(this.disconnectedIcon, connectedDeviceDisplay.disconnectedIcon) && AbstractC22676k.m65745e(this.disconnectedCtaButton, connectedDeviceDisplay.disconnectedCtaButton) && AbstractC22676k.m65745e(this.disconnectView, connectedDeviceDisplay.disconnectView);
    }

    public final CtaButton getConnectedCtaButton() {
        return this.connectedCtaButton;
    }

    public final String getConnectedIcon() {
        return this.connectedIcon;
    }

    public final String getConnectedSubtitle() {
        return this.connectedSubtitle;
    }

    public final String getConnectedText() {
        return this.connectedText;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final DisconnectView getDisconnectView() {
        return this.disconnectView;
    }

    public final CtaButton getDisconnectedCtaButton() {
        return this.disconnectedCtaButton;
    }

    public final String getDisconnectedIcon() {
        return this.disconnectedIcon;
    }

    public final String getDisconnectedSubtitle() {
        return this.disconnectedSubtitle;
    }

    public final String getDisconnectedText() {
        return this.disconnectedText;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = (this.disconnectedCtaButton.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.connectedCtaButton.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.deviceType.hashCode() * 31, 31, this.title), 31, this.connectedSubtitle), 31, this.connectedText), 31, this.connectedIcon)) * 31, 31, this.disconnectedSubtitle), 31, this.disconnectedText), 31, this.disconnectedIcon)) * 31;
        DisconnectView disconnectView = this.disconnectView;
        return iHashCode + (disconnectView == null ? 0 : disconnectView.hashCode());
    }

    public String toString() {
        String str = this.deviceType;
        String str2 = this.title;
        String str3 = this.connectedSubtitle;
        String str4 = this.connectedText;
        String str5 = this.connectedIcon;
        CtaButton ctaButton = this.connectedCtaButton;
        String str6 = this.disconnectedSubtitle;
        String str7 = this.disconnectedText;
        String str8 = this.disconnectedIcon;
        CtaButton ctaButton2 = this.disconnectedCtaButton;
        DisconnectView disconnectView = this.disconnectView;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConnectedDeviceDisplay(deviceType=", str, ", title=", str2, ", connectedSubtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", connectedText=", str4, ", connectedIcon=");
        sbM32001t.append(str5);
        sbM32001t.append(", connectedCtaButton=");
        sbM32001t.append(ctaButton);
        sbM32001t.append(", disconnectedSubtitle=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", disconnectedText=", str7, ", disconnectedIcon=");
        sbM32001t.append(str8);
        sbM32001t.append(", disconnectedCtaButton=");
        sbM32001t.append(ctaButton2);
        sbM32001t.append(", disconnectView=");
        sbM32001t.append(disconnectView);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ConnectedDeviceDisplay(String deviceType, String title, String connectedSubtitle, String connectedText, String connectedIcon, CtaButton connectedCtaButton, String disconnectedSubtitle, String disconnectedText, String disconnectedIcon, CtaButton disconnectedCtaButton, DisconnectView disconnectView) {
        AbstractC22676k.m65750j(deviceType, "deviceType");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(connectedSubtitle, "connectedSubtitle");
        AbstractC22676k.m65750j(connectedText, "connectedText");
        AbstractC22676k.m65750j(connectedIcon, "connectedIcon");
        AbstractC22676k.m65750j(connectedCtaButton, "connectedCtaButton");
        AbstractC22676k.m65750j(disconnectedSubtitle, "disconnectedSubtitle");
        AbstractC22676k.m65750j(disconnectedText, "disconnectedText");
        AbstractC22676k.m65750j(disconnectedIcon, "disconnectedIcon");
        AbstractC22676k.m65750j(disconnectedCtaButton, "disconnectedCtaButton");
        this.deviceType = deviceType;
        this.title = title;
        this.connectedSubtitle = connectedSubtitle;
        this.connectedText = connectedText;
        this.connectedIcon = connectedIcon;
        this.connectedCtaButton = connectedCtaButton;
        this.disconnectedSubtitle = disconnectedSubtitle;
        this.disconnectedText = disconnectedText;
        this.disconnectedIcon = disconnectedIcon;
        this.disconnectedCtaButton = disconnectedCtaButton;
        this.disconnectView = disconnectView;
    }
}
