package stream.video.sfu.models;

import com.squareup.wire.AbstractC5579j;
import com.squareup.wire.AbstractC5581l;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5587r;
import com.squareup.wire.C5588s;
import com.squareup.wire.C5591v;
import com.squareup.wire.EnumC5573d;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.EnumC5595z;
import com.squareup.wire.InterfaceC5570a0;
import j93.InterfaceC21461d;
import java.io.IOException;
import java.util.ArrayList;
import jh3.AbstractC21702c;
import l83.InterfaceC23457c;
import m83.AbstractC25265s;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 -2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-BK\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010\u001c¨\u0006."}, m65681d2 = {"Lstream/video/sfu/models/ClientDetails;", "Lcom/squareup/wire/l;", "", "Lstream/video/sfu/models/Sdk;", "sdk", "Lstream/video/sfu/models/OS;", "os", "Lstream/video/sfu/models/Browser;", "browser", "Lstream/video/sfu/models/Device;", "device", "", "webrtc_version", "Lne3/l;", "unknownFields", "<init>", "(Lstream/video/sfu/models/Sdk;Lstream/video/sfu/models/OS;Lstream/video/sfu/models/Browser;Lstream/video/sfu/models/Device;Ljava/lang/String;Lne3/l;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "copy", "(Lstream/video/sfu/models/Sdk;Lstream/video/sfu/models/OS;Lstream/video/sfu/models/Browser;Lstream/video/sfu/models/Device;Ljava/lang/String;Lne3/l;)Lstream/video/sfu/models/ClientDetails;", "Lstream/video/sfu/models/Sdk;", "getSdk", "()Lstream/video/sfu/models/Sdk;", "Lstream/video/sfu/models/OS;", "getOs", "()Lstream/video/sfu/models/OS;", "Lstream/video/sfu/models/Browser;", "getBrowser", "()Lstream/video/sfu/models/Browser;", "Lstream/video/sfu/models/Device;", "getDevice", "()Lstream/video/sfu/models/Device;", "Ljava/lang/String;", "getWebrtc_version", "Companion", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class ClientDetails extends AbstractC5581l {
    public static final AbstractC5586q ADAPTER;
    private static final long serialVersionUID = 0;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Browser#ADAPTER", label = EnumC5595z.f22132F, tag = 3)
    private final Browser browser;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Device#ADAPTER", label = EnumC5595z.f22132F, tag = 4)
    private final Device device;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.OS#ADAPTER", label = EnumC5595z.f22132F, tag = 2)
    private final C32996OS os;

    @InterfaceC5570a0(adapter = "stream.video.sfu.models.Sdk#ADAPTER", label = EnumC5595z.f22132F, tag = 1)
    private final Sdk sdk;

    @InterfaceC5570a0(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "webrtcVersion", label = EnumC5595z.f22132F, tag = 5)
    private final String webrtc_version;

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(ClientDetails.class);
        final EnumC5573d enumC5573d = EnumC5573d.LENGTH_DELIMITED;
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5586q(enumC5573d, orCreateKotlinClass, enumC5593x) { // from class: stream.video.sfu.models.ClientDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5586q
            public ClientDetails decode(C5587r reader) {
                AbstractC22676k.m65750j(reader, "reader");
                long jM16807d = reader.m16807d();
                Object objDecode = null;
                Object objDecode2 = null;
                Object objDecode3 = null;
                Object objDecode4 = "";
                Object objDecode5 = null;
                while (true) {
                    int iM16810g = reader.m16810g();
                    if (iM16810g == -1) {
                        return new ClientDetails((Sdk) objDecode, (C32996OS) objDecode5, (Browser) objDecode2, (Device) objDecode3, (String) objDecode4, reader.m16808e(jM16807d));
                    }
                    if (iM16810g == 1) {
                        objDecode = Sdk.ADAPTER.decode(reader);
                    } else if (iM16810g == 2) {
                        objDecode5 = C32996OS.ADAPTER.decode(reader);
                    } else if (iM16810g == 3) {
                        objDecode2 = Browser.ADAPTER.decode(reader);
                    } else if (iM16810g == 4) {
                        objDecode3 = Device.ADAPTER.decode(reader);
                    } else if (iM16810g != 5) {
                        reader.m16813j(iM16810g);
                    } else {
                        objDecode4 = AbstractC5586q.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.AbstractC5586q
            public int encodedSize(ClientDetails value) {
                AbstractC22676k.m65750j(value, "value");
                int iMo79253d = value.unknownFields().mo79253d();
                if (value.getSdk() != null) {
                    iMo79253d += Sdk.ADAPTER.encodedSizeWithTag(1, value.getSdk());
                }
                if (value.getOs() != null) {
                    iMo79253d += C32996OS.ADAPTER.encodedSizeWithTag(2, value.getOs());
                }
                if (value.getBrowser() != null) {
                    iMo79253d += Browser.ADAPTER.encodedSizeWithTag(3, value.getBrowser());
                }
                if (value.getDevice() != null) {
                    iMo79253d += Device.ADAPTER.encodedSizeWithTag(4, value.getDevice());
                }
                return !AbstractC22676k.m65745e(value.getWebrtc_version(), "") ? AbstractC5586q.STRING.encodedSizeWithTag(5, value.getWebrtc_version()) + iMo79253d : iMo79253d;
            }

            @Override // com.squareup.wire.AbstractC5586q
            public ClientDetails redact(ClientDetails value) {
                AbstractC22676k.m65750j(value, "value");
                Sdk sdk = value.getSdk();
                Sdk sdk2 = sdk != null ? (Sdk) Sdk.ADAPTER.redact(sdk) : null;
                C32996OS os2 = value.getOs();
                C32996OS c32996os = os2 != null ? (C32996OS) C32996OS.ADAPTER.redact(os2) : null;
                Browser browser = value.getBrowser();
                Browser browser2 = browser != null ? (Browser) Browser.ADAPTER.redact(browser) : null;
                Device device = value.getDevice();
                return ClientDetails.copy$default(value, sdk2, c32996os, browser2, device != null ? (Device) Device.ADAPTER.redact(device) : null, null, C26624l.f105881E, 16, null);
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5588s writer, ClientDetails value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                if (value.getSdk() != null) {
                    Sdk.ADAPTER.encodeWithTag(writer, 1, value.getSdk());
                }
                if (value.getOs() != null) {
                    C32996OS.ADAPTER.encodeWithTag(writer, 2, value.getOs());
                }
                if (value.getBrowser() != null) {
                    Browser.ADAPTER.encodeWithTag(writer, 3, value.getBrowser());
                }
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 4, value.getDevice());
                }
                if (!AbstractC22676k.m65745e(value.getWebrtc_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getWebrtc_version());
                }
                writer.m16818a(value.unknownFields());
            }

            @Override // com.squareup.wire.AbstractC5586q
            public void encode(C5591v writer, ClientDetails value) throws IOException {
                AbstractC22676k.m65750j(writer, "writer");
                AbstractC22676k.m65750j(value, "value");
                writer.m16825d(value.unknownFields());
                if (!AbstractC22676k.m65745e(value.getWebrtc_version(), "")) {
                    AbstractC5586q.STRING.encodeWithTag(writer, 5, value.getWebrtc_version());
                }
                if (value.getDevice() != null) {
                    Device.ADAPTER.encodeWithTag(writer, 4, value.getDevice());
                }
                if (value.getBrowser() != null) {
                    Browser.ADAPTER.encodeWithTag(writer, 3, value.getBrowser());
                }
                if (value.getOs() != null) {
                    C32996OS.ADAPTER.encodeWithTag(writer, 2, value.getOs());
                }
                if (value.getSdk() != null) {
                    Sdk.ADAPTER.encodeWithTag(writer, 1, value.getSdk());
                }
            }
        };
    }

    public ClientDetails() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ ClientDetails copy$default(ClientDetails clientDetails, Sdk sdk, C32996OS c32996os, Browser browser, Device device, String str, C26624l c26624l, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            sdk = clientDetails.sdk;
        }
        if ((i13 & 2) != 0) {
            c32996os = clientDetails.os;
        }
        if ((i13 & 4) != 0) {
            browser = clientDetails.browser;
        }
        if ((i13 & 8) != 0) {
            device = clientDetails.device;
        }
        if ((i13 & 16) != 0) {
            str = clientDetails.webrtc_version;
        }
        if ((i13 & 32) != 0) {
            c26624l = clientDetails.unknownFields();
        }
        String str2 = str;
        C26624l c26624l2 = c26624l;
        return clientDetails.copy(sdk, c32996os, browser, device, str2, c26624l2);
    }

    public final ClientDetails copy(Sdk sdk, C32996OS os2, Browser browser, Device device, String webrtc_version, C26624l unknownFields) {
        AbstractC22676k.m65750j(webrtc_version, "webrtc_version");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        return new ClientDetails(sdk, os2, browser, device, webrtc_version, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ClientDetails)) {
            return false;
        }
        ClientDetails clientDetails = (ClientDetails) other;
        return AbstractC22676k.m65745e(unknownFields(), clientDetails.unknownFields()) && AbstractC22676k.m65745e(this.sdk, clientDetails.sdk) && AbstractC22676k.m65745e(this.os, clientDetails.os) && AbstractC22676k.m65745e(this.browser, clientDetails.browser) && AbstractC22676k.m65745e(this.device, clientDetails.device) && AbstractC22676k.m65745e(this.webrtc_version, clientDetails.webrtc_version);
    }

    public final Browser getBrowser() {
        return this.browser;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final C32996OS getOs() {
        return this.os;
    }

    public final Sdk getSdk() {
        return this.sdk;
    }

    public final String getWebrtc_version() {
        return this.webrtc_version;
    }

    public int hashCode() {
        int i13 = this.hashCode;
        if (i13 != 0) {
            return i13;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Sdk sdk = this.sdk;
        int iHashCode2 = (iHashCode + (sdk != null ? sdk.hashCode() : 0)) * 37;
        C32996OS c32996os = this.os;
        int iHashCode3 = (iHashCode2 + (c32996os != null ? c32996os.hashCode() : 0)) * 37;
        Browser browser = this.browser;
        int iHashCode4 = (iHashCode3 + (browser != null ? browser.hashCode() : 0)) * 37;
        Device device = this.device;
        int iHashCode5 = this.webrtc_version.hashCode() + ((iHashCode4 + (device != null ? device.hashCode() : 0)) * 37);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.AbstractC5581l
    public /* bridge */ /* synthetic */ AbstractC5579j newBuilder() {
        return (AbstractC5579j) m134525newBuilder();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        Sdk sdk = this.sdk;
        if (sdk != null) {
            arrayList.add("sdk=" + sdk);
        }
        C32996OS c32996os = this.os;
        if (c32996os != null) {
            arrayList.add("os=" + c32996os);
        }
        Browser browser = this.browser;
        if (browser != null) {
            arrayList.add("browser=" + browser);
        }
        Device device = this.device;
        if (device != null) {
            arrayList.add("device=" + device);
        }
        AbstractC21702c.m61149t(arrayList, this.webrtc_version, "webrtc_version=");
        return AbstractC25265s.m74110N0(arrayList, ", ", "ClientDetails{", "}", null, 56);
    }

    public /* synthetic */ ClientDetails(Sdk sdk, C32996OS c32996os, Browser browser, Device device, String str, C26624l c26624l, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : sdk, (i13 & 2) != 0 ? null : c32996os, (i13 & 4) != 0 ? null : browser, (i13 & 8) != 0 ? null : device, (i13 & 16) != 0 ? "" : str, (i13 & 32) != 0 ? C26624l.f105881E : c26624l);
    }

    @InterfaceC23457c
    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m134525newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientDetails(Sdk sdk, C32996OS c32996os, Browser browser, Device device, String webrtc_version, C26624l unknownFields) {
        super(ADAPTER, unknownFields);
        AbstractC22676k.m65750j(webrtc_version, "webrtc_version");
        AbstractC22676k.m65750j(unknownFields, "unknownFields");
        this.sdk = sdk;
        this.os = c32996os;
        this.browser = browser;
        this.device = device;
        this.webrtc_version = webrtc_version;
    }
}
