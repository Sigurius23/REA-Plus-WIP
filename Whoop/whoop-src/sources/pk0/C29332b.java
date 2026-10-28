package pk0;

import ak0.C0940b;
import ak0.C0941c;
import ak0.C0942d;
import ak0.C0945g;
import ak0.C0946h;
import ak0.C0947i;
import ak0.GetBodyLocationResponsePacket;
import androidx.health.platform.client.proto.C1533u;
import bk0.C3347a;
import bk0.C3348b;
import bk0.C3349c;
import bk0.C3350d;
import dk0.AbstractC12109i;
import dk0.C12102b;
import dk0.C12104d;
import dk0.C12107g;
import dk0.C12108h;
import dk0.C12110j;
import dk0.C12111k;
import ek0.C13271a;
import ek0.C13272a0;
import ek0.C13273b;
import ek0.C13274b0;
import ek0.C13275c;
import ek0.C13276c0;
import ek0.C13277d;
import ek0.C13278d0;
import ek0.C13279e;
import ek0.C13280e0;
import ek0.C13281f;
import ek0.C13282g;
import ek0.C13283h;
import ek0.C13284i;
import ek0.C13285j;
import ek0.C13286k;
import ek0.C13287l;
import ek0.C13288m;
import ek0.C13289n;
import ek0.C13290o;
import ek0.C13291p;
import ek0.C13292q;
import ek0.C13294s;
import ek0.C13295t;
import ek0.C13297v;
import ek0.C13298w;
import ek0.C13299x;
import ek0.C13300y;
import ek0.C13301z;
import fk0.AbstractC14551g;
import fk0.C14545a;
import fk0.C14547c;
import fk0.C14548d;
import fk0.C14550f;
import fk0.C14552h;
import fk0.EnumC14546b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import lt0.AbstractC24726c;
import lt0.AbstractC24727d;
import lt0.AbstractC24732i;
import lt0.C24725b;
import lt0.EnumC24728e;
import lt0.EnumC24735l;
import lt0.InterfaceC24724a;
import m83.AbstractC25260n;
import mt0.C25932b;
import mt0.C25933c;
import mt0.C25934d;
import mt0.C25935e;
import mt0.C25936f;
import mt0.C25937g;
import mt0.C25938h;
import ot0.C28323a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qr2.AbstractC30556a;
import st0.EnumC32978v;
import tr2.InterfaceC34116n;
import xj0.AbstractC38334b;
import ze1.AbstractC40586b;
import zj0.C40707a0;
import zj0.C40708a1;
import zj0.C40710b0;
import zj0.C40711b1;
import zj0.C40713c0;
import zj0.C40714c1;
import zj0.C40715d;
import zj0.C40716d0;
import zj0.C40717d1;
import zj0.C40718e;
import zj0.C40719e0;
import zj0.C40720e1;
import zj0.C40723f1;
import zj0.C40726g1;
import zj0.C40727h;
import zj0.C40729h1;
import zj0.C40732i1;
import zj0.C40733j;
import zj0.C40735j1;
import zj0.C40736k;
import zj0.C40738k1;
import zj0.C40739l;
import zj0.C40741l1;
import zj0.C40742m;
import zj0.C40744n;
import zj0.C40746o;
import zj0.C40748p;
import zj0.C40749p0;
import zj0.C40750q;
import zj0.C40751q0;
import zj0.C40752r;
import zj0.C40753r0;
import zj0.C40754s;
import zj0.C40755s0;
import zj0.C40757t0;
import zj0.C40758u;
import zj0.C40759u0;
import zj0.C40760v;
import zj0.C40761v0;
import zj0.C40763w0;
import zj0.C40764x;
import zj0.C40765x0;
import zj0.C40766y;
import zj0.C40767y0;
import zj0.C40768z;
import zj0.C40769z0;

/* JADX INFO: renamed from: pk0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J!\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0018J\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u0004\u0018\u00010\t2\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b-\u0010.J#\u00103\u001a\u0004\u0018\u00010'2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J#\u00105\u001a\u0004\u0018\u00010'2\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b5\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00107¨\u00069"}, m65681d2 = {"Lpk0/b;", "", "<init>", "()V", "Ljava/nio/ByteBuffer;", "rawData", "payload", "Llt0/c$a;", "type", "Llt0/c;", "c", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Llt0/c$a;)Llt0/c;", "d", "(Ljava/nio/ByteBuffer;)Llt0/c;", "l", "Llt0/e;", "commandNumber", "e", "(Ljava/nio/ByteBuffer;Llt0/e;)Llt0/c;", "Ldk0/i;", "i", "(Ljava/nio/ByteBuffer;)Ldk0/i;", "Lot0/a;", "f", "(Ljava/nio/ByteBuffer;)Lot0/a;", "o", "Lot0/a$b;", "g", "(Ljava/nio/ByteBuffer;Lot0/a$b;)Lot0/a;", "p", "Ldk0/i$b;", "j", "(Ljava/nio/ByteBuffer;Ldk0/i$b;)Ldk0/i;", "Lfk0/g;", "m", "(Ljava/nio/ByteBuffer;)Lfk0/g;", "Lfk0/g$b;", "n", "(Ljava/nio/ByteBuffer;Lfk0/g$b;)Lfk0/g;", "Llt0/i;", "packetFrame", "Lmt0/b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Llt0/i;)Lmt0/b;", "framedPacket", "k", "(Lmt0/b;)Llt0/c;", "", "data", "Lst0/v;", "gen", "b", "([BLst0/v;)Llt0/i;", "a", "Ltr2/n;", "Ltr2/n;", "logger", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29332b {

    /* JADX INFO: renamed from: a */
    public static final C29332b f118813a = new C29332b();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC34116n logger = InterfaceC34116n.INSTANCE.m107848a("PacketFactory");

    /* JADX INFO: renamed from: pk0.b$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118815a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f118816b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f118817c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f118818d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f118819e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int[] f118820f;

        /* JADX INFO: renamed from: g */
        public static final /* synthetic */ int[] f118821g;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f118822h;

        static {
            int[] iArr = new int[EnumC32978v.values().length];
            try {
                iArr[EnumC32978v.MAVERICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC32978v.PUFFIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC32978v.GOOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC32978v.GEN_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f118815a = iArr;
            int[] iArr2 = new int[AbstractC24726c.a.values().length];
            try {
                iArr2[AbstractC24726c.a.COMMAND.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AbstractC24726c.a.COMMAND_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AbstractC24726c.a.PUFFIN_COMMAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AbstractC24726c.a.PUFFIN_COMMAND_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[AbstractC24726c.a.HISTORICAL_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AbstractC24726c.a.REALTIME_RAW_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AbstractC24726c.a.REALTIME_DATA.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AbstractC24726c.a.PUFFIN_EVENTS_FROM_STRAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AbstractC24726c.a.EVENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AbstractC24726c.a.CONSOLE_LOGS.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[AbstractC24726c.a.METADATA.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[AbstractC24726c.a.REALTIME_IMU_DATA_STREAM.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[AbstractC24726c.a.HISTORICAL_IMU_DATA_STREAM.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[AbstractC24726c.a.RELATIVE_PUFFIN_EVENTS.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[AbstractC24726c.a.RELATIVE_BATTERY_PACK_CONSOLE_LOGS.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[AbstractC24726c.a.PUFFIN_METADATA.ordinal()] = 16;
            } catch (NoSuchFieldError unused20) {
            }
            f118816b = iArr2;
            int[] iArr3 = new int[EnumC24735l.values().length];
            try {
                iArr3[EnumC24735l.PUFFIN_GET_HELLO.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[EnumC24735l.SEND_HISTORICAL_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[EnumC24735l.HISTORICAL_PULL_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[EnumC24735l.HISTORICAL_PULL_ABORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[EnumC24735l.PUFFIN_START_FW_LOAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[EnumC24735l.PUFFIN_LOAD_FW_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr3[EnumC24735l.PUFFIN_PROCESS_FW.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            f118817c = iArr3;
            int[] iArr4 = new int[EnumC24728e.values().length];
            try {
                iArr4[EnumC24728e.REPORT_VERSION_INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[EnumC24728e.GET_CLOCK_DEPRECATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[EnumC24728e.GET_BATTERY_LEVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[EnumC24728e.GET_DATA_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[EnumC24728e.GET_HELLO.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[EnumC24728e.GET_HELLO_HARVARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[EnumC24728e.GET_LED_DRIVE.ordinal()] = 7;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr4[EnumC24728e.GET_TIA_GAIN.ordinal()] = 8;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr4[EnumC24728e.GET_BIAS_OFFSET.ordinal()] = 9;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr4[EnumC24728e.SET_BIAS_OFFSET.ordinal()] = 10;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr4[EnumC24728e.RUN_HAPTIC_PATTERN_MAVERICK.ordinal()] = 11;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr4[EnumC24728e.ABORT_HISTORICAL_TRANSMITS.ordinal()] = 12;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr4[EnumC24728e.START_FIRMWARE_LOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr4[EnumC24728e.START_FIRMWARE_LOAD_NEW.ordinal()] = 14;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr4[EnumC24728e.LOAD_FIRMWARE_DATA.ordinal()] = 15;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr4[EnumC24728e.LOAD_FIRMWARE_DATA_NEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr4[EnumC24728e.PROCESS_FIRMWARE_IMAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr4[EnumC24728e.PROCESS_FIRMWARE_IMAGE_NEW.ordinal()] = 18;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr4[EnumC24728e.VERIFY_FIRMWARE_IMAGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr4[EnumC24728e.VERIFY_CERTIFICATE.ordinal()] = 20;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_GENERIC_HR_PROFILE.ordinal()] = 21;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_REALTIME_HR.ordinal()] = 22;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr4[EnumC24728e.SET_ALARM_TIME.ordinal()] = 23;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr4[EnumC24728e.GET_ALARM_TIME.ordinal()] = 24;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr4[EnumC24728e.RUN_ALARM.ordinal()] = 25;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr4[EnumC24728e.DISABLE_ALARM.ordinal()] = 26;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr4[EnumC24728e.GET_ADVERTISING_NAME_HARVARD.ordinal()] = 27;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr4[EnumC24728e.SET_ADVERTISING_NAME_HARVARD.ordinal()] = 28;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr4[EnumC24728e.GET_ADVERTISING_NAME.ordinal()] = 29;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr4[EnumC24728e.SET_ADVERTISING_NAME.ordinal()] = 30;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr4[EnumC24728e.RUN_HAPTICS_PATTERN.ordinal()] = 31;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr4[EnumC24728e.GET_ALL_HAPTICS_PATTERN.ordinal()] = 32;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr4[EnumC24728e.ENTER_HIGH_FREQ_SYNC.ordinal()] = 33;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr4[EnumC24728e.EXIT_HIGH_FREQ_SYNC.ordinal()] = 34;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr4[EnumC24728e.GET_BODY_LOCATION_AND_STATUS.ordinal()] = 35;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_IMU_MODE_HISTORICAL.ordinal()] = 36;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_IMU_MODE.ordinal()] = 37;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr4[EnumC24728e.START_FF_KEY_EXCHANGE.ordinal()] = 38;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr4[EnumC24728e.SEND_NEXT_FF.ordinal()] = 39;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr4[EnumC24728e.SET_FF_VALUE.ordinal()] = 40;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr4[EnumC24728e.GET_FF_VALUE.ordinal()] = 41;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr4[EnumC24728e.STOP_HAPTICS.ordinal()] = 42;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr4[EnumC24728e.SELECT_WRIST.ordinal()] = 43;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_LABRADOR_FILTERED.ordinal()] = 44;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_LABRADOR_RAW_SAVE.ordinal()] = 45;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_LABRADOR_DATA_GENERATION.ordinal()] = 46;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr4[EnumC24728e.START_DEVICE_CONFIG_KEY_EXCHANGE.ordinal()] = 47;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr4[EnumC24728e.SEND_NEXT_DEVICE_CONFIG.ordinal()] = 48;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr4[EnumC24728e.SET_DEVICE_CONFIG_VALUE.ordinal()] = 49;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr4[EnumC24728e.GET_DEVICE_CONFIG_VALUE.ordinal()] = 50;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr4[EnumC24728e.START_RAW_DATA.ordinal()] = 51;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr4[EnumC24728e.GET_BATTERY_PACK_INFO.ordinal()] = 52;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr4[EnumC24728e.ENABLE_OPTICAL_DATA.ordinal()] = 53;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_PERSISTENT_R20.ordinal()] = 54;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr4[EnumC24728e.TOGGLE_PERSISTENT_R21.ordinal()] = 55;
            } catch (NoSuchFieldError unused82) {
            }
            f118818d = iArr4;
            int[] iArr5 = new int[EnumC14546b.values().length];
            try {
                iArr5[EnumC14546b.STATE_OF_CHARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused83) {
            }
            f118819e = iArr5;
            int[] iArr6 = new int[C28323a.b.values().length];
            try {
                iArr6[C28323a.b.BATTERY_LEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr6[C28323a.b.BLE_CONNECTION_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr6[C28323a.b.BLE_CONNECTION_UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr6[C28323a.b.BLE_REALTIME_HR_OFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr6[C28323a.b.BLE_REALTIME_HR_ON.ordinal()] = 5;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr6[C28323a.b.CHARGING_OFF.ordinal()] = 6;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr6[C28323a.b.CHARGING_ON.ordinal()] = 7;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr6[C28323a.b.DOUBLE_TAP.ordinal()] = 8;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr6[C28323a.b.FLASH_INIT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr6[C28323a.b.RTC_LOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr6[C28323a.b.STRAP_CONDITION_REPORT.ordinal()] = 11;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr6[C28323a.b.SYSTEM_CONTROL.ordinal()] = 12;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr6[C28323a.b.WRIST_OFF.ordinal()] = 13;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr6[C28323a.b.WRIST_ON.ordinal()] = 14;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr6[C28323a.b.CONSOLE_OUTPUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr6[C28323a.b.STRAP_DRIVEN_ALARM_SET.ordinal()] = 16;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr6[C28323a.b.STRAP_DRIVEN_ALARM_EXECUTED.ordinal()] = 17;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr6[C28323a.b.APP_DRIVEN_ALARM_EXECUTED.ordinal()] = 18;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr6[C28323a.b.STRAP_DRIVEN_ALARM_DISABLED.ordinal()] = 19;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr6[C28323a.b.HAPTICS_FIRED.ordinal()] = 20;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr6[C28323a.b.HIGH_FREQ_SYNC_PROMPT.ordinal()] = 21;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr6[C28323a.b.HIGH_FREQ_SYNC_ENABLED.ordinal()] = 22;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr6[C28323a.b.HIGH_FREQ_SYNC_DISABLED.ordinal()] = 23;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr6[C28323a.b.BATTERY_PACK_CONNECTED.ordinal()] = 24;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr6[C28323a.b.BATTERY_PACK_REMOVED.ordinal()] = 25;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr6[C28323a.b.HAPTICS_TERMINATED.ordinal()] = 26;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr6[C28323a.b.BATTERY_PACK_INFO.ordinal()] = 27;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr6[C28323a.b.GENERIC_FIRMWARE_EVENT.ordinal()] = 28;
            } catch (NoSuchFieldError unused111) {
            }
            f118820f = iArr6;
            int[] iArr7 = new int[AbstractC12109i.b.values().length];
            try {
                iArr7[AbstractC12109i.b.HISTORY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr7[AbstractC12109i.b.HISTORY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr7[AbstractC12109i.b.HISTORY_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused114) {
            }
            f118821g = iArr7;
            int[] iArr8 = new int[AbstractC14551g.b.values().length];
            try {
                iArr8[AbstractC14551g.b.HISTORY_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr8[AbstractC14551g.b.HISTORY_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr8[AbstractC14551g.b.HISTORY_COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused117) {
            }
            f118822h = iArr8;
        }
    }

    private C29332b() {
    }

    /* JADX INFO: renamed from: c */
    private final AbstractC24726c m89266c(ByteBuffer rawData, ByteBuffer payload, AbstractC24726c.a type) {
        switch (a.f118816b[type.ordinal()]) {
            case 1:
                logger.mo85222m("Unexpected command packet from strap, command byte: " + AbstractC38334b.INSTANCE.m122893a(payload), new AbstractC30556a.a[0]);
                return null;
            case 2:
                return m89267d(payload);
            case 3:
                return null;
            case 4:
                return m89273l(payload);
            case 5:
            case 6:
                short sM72392U = new C24725b(payload, rawData).m72392U();
                if (sM72392U == 16) {
                    return new C25937g(rawData, payload);
                }
                return sM72392U == 17 ? new C12110j(rawData, payload) : new C24725b(payload, rawData);
            case 7:
                return new C12111k(payload);
            case 8:
                return new C13298w(payload);
            case 9:
            case 10:
                return m89269f(payload);
            case 11:
                return m89271i(payload);
            case 12:
            case 13:
                return new C12108h(rawData, payload);
            case 14:
                return m89276o(payload);
            case 15:
                return new C14545a(payload);
            case 16:
                return m89274m(payload);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: d */
    private final AbstractC24726c m89267d(ByteBuffer payload) {
        Byte bM122893a = AbstractC38334b.INSTANCE.m122893a(payload);
        if (bM122893a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read a command - payload too short?: "), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            EnumC24728e enumC24728eM72386b = InterfaceC24724a.INSTANCE.m72386b(bM122893a.byteValue());
            AbstractC22676k.m65748h(enumC24728eM72386b, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.CommandNumber");
            return m89268e(payload, enumC24728eM72386b);
        } catch (Exception e5) {
            logger.mo85230v("Unrecognized command type: " + bM122893a, e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC24726c m89268e(ByteBuffer payload, EnumC24728e commandNumber) {
        switch (a.f118818d[commandNumber.ordinal()]) {
            case 1:
                return new C40719e0(payload);
            case 2:
                return new C40748p(payload);
            case 3:
                return new C40744n(payload);
            case 4:
                return new C40750q(payload);
            case 5:
                return new C40760v(payload);
            case 6:
                return new C40758u(payload);
            case 7:
                return new C40707a0(payload);
            case 8:
                return new C40714c1(payload);
            case 9:
                return new C40715d(payload);
            case 10:
                return new C40718e(payload);
            case 11:
                return new C40751q0(payload);
            case 12:
                return new C40764x(payload);
            case 13:
            case 14:
                return new C40708a1(payload);
            case 15:
            case 16:
                return new C40710b0(payload);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C40713c0(payload);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C40741l1(payload);
            case 20:
                return new C40738k1(payload);
            case 21:
                return new C40717d1(payload);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C40735j1(payload);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C40761v0(payload);
            case 24:
                return new C40742m(payload);
            case 25:
                return new C40749p0(payload);
            case 26:
                return new C40733j(payload);
            case 27:
                return new C0941c(payload);
            case 28:
                return new C0946h(payload);
            case 29:
                return new C40739l(payload);
            case 30:
                return new C40759u0(payload);
            case 31:
                return new C0945g(payload);
            case 32:
                return new C0942d(payload);
            case 33:
                return new C0940b(payload);
            case 34:
                return new C40736k(payload);
            case 35:
                return new GetBodyLocationResponsePacket(payload);
            case 36:
                return new C40720e1(payload);
            case 37:
                return new C40726g1(payload);
            case 38:
                return new C40769z0(payload);
            case 39:
                return new C40757t0(payload);
            case 40:
                return new C40765x0(payload);
            case 41:
                return new C40754s(payload);
            case 42:
                return new C40711b1(payload);
            case 43:
                return new C40753r0(payload);
            case 44:
                return new C40716d0(payload);
            case 45:
                return new C40768z(payload);
            case 46:
                return new C40766y(payload);
            case 47:
                return new C40767y0(payload);
            case 48:
                return new C40755s0(payload);
            case 49:
                return new C40763w0(payload);
            case 50:
                return new C40752r(payload);
            case 51:
                return new C0947i(payload);
            case 52:
                return new C40746o(payload);
            case 53:
                return new C40723f1(payload);
            case 54:
                return new C40729h1(payload);
            case 55:
                return new C40732i1(payload);
            default:
                return new C40727h(payload, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    private final C28323a m89269f(ByteBuffer payload) {
        Integer numM85787a = C28323a.INSTANCE.m85787a(payload);
        if (numM85787a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read event type - payload too short?: "), new AbstractC30556a.a[0]);
            return m89277p(payload);
        }
        try {
            return m89270g(payload, C28323a.b.INSTANCE.m85788a(numM85787a.intValue()));
        } catch (Exception unused) {
            logger.mo85222m("Unrecognized event type: " + numM85787a, new AbstractC30556a.a[0]);
            return m89277p(payload);
        }
    }

    /* JADX INFO: renamed from: g */
    private final C28323a m89270g(ByteBuffer payload, C28323a.b type) {
        switch (type == null ? -1 : a.f118820f[type.ordinal()]) {
            case 1:
                return new C13273b(payload);
            case 2:
                return new C13281f(payload);
            case 3:
                return new C13282g(payload);
            case 4:
                return new C13283h(payload);
            case 5:
                return new C13284i(payload);
            case 6:
                return new C13285j(payload);
            case 7:
                return new C13286k(payload);
            case 8:
                return new C13288m(payload);
            case 9:
                return new C13289n(payload);
            case 10:
                return new C13299x(payload);
            case 11:
                return new C13300y(payload);
            case 12:
                return new C13276c0(payload);
            case 13:
                return new C13278d0(payload);
            case 14:
                return new C13280e0(payload);
            case 15:
                return new C13287l(payload);
            case 16:
                return new C13274b0(payload);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C13272a0(payload);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return new C13271a(payload);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C13301z(payload);
            case 20:
                return new C13291p(payload);
            case 21:
                return new C13297v(payload);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return new C13295t(payload);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C13294s(payload);
            case 24:
                return new C13275c(payload);
            case 25:
                return new C13279e(payload);
            case 26:
                return new C13292q(payload);
            case 27:
                logger.mo85219j(AbstractC11266d.m30461o("Parsing battery pack info packet from payload: ", AbstractC40586b.m131617b(payload)), new AbstractC30556a.a[0]);
                return new C13277d(payload);
            case 28:
                return new C13290o(payload);
            default:
                logger.mo85216g("Parsing unknown firmware event for type: " + type, new AbstractC30556a.a[0]);
                return m89277p(payload);
        }
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC12109i m89271i(ByteBuffer payload) {
        Short shM33454a = AbstractC12109i.INSTANCE.m33454a(payload);
        if (shM33454a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read a metadata packet - payload too short?: "), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            return m89272j(payload, AbstractC12109i.b.INSTANCE.m33455a(shM33454a.shortValue()));
        } catch (Exception e5) {
            logger.mo85230v("Unrecognized metdata type: " + shM33454a, e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC12109i m89272j(ByteBuffer payload, AbstractC12109i.b type) {
        int i13 = a.f118821g[type.ordinal()];
        if (i13 == 1) {
            return new C12107g(payload);
        }
        if (i13 == 2) {
            return new C12104d(payload);
        }
        if (i13 == 3) {
            return new C12102b(payload);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: l */
    private final AbstractC24726c m89273l(ByteBuffer payload) {
        Byte bM122893a = AbstractC38334b.INSTANCE.m122893a(payload);
        if (bM122893a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read the response, puffin payload too short: "), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            EnumC24735l enumC24735lM72385a = InterfaceC24724a.INSTANCE.m72385a(bM122893a.byteValue());
            AbstractC22676k.m65748h(enumC24735lM72385a, "null cannot be cast to non-null type com.whoop.connectivityCore.packets.PuffinCommandNumber");
            switch (a.f118817c[enumC24735lM72385a.ordinal()]) {
                case 1:
                    return new C3347a(payload);
                case 2:
                    return new C3350d(payload);
                case 3:
                    return new C3349c(payload);
                case 4:
                    return new C3348b(payload);
                case 5:
                    return new C40708a1(payload);
                case 6:
                    return new C40710b0(payload);
                case 7:
                    return new C40713c0(payload);
                default:
                    throw new IllegalArgumentException("No matching puffin command response packet known for commandNumber: " + enumC24735lM72385a);
            }
        } catch (Exception e5) {
            logger.mo85230v("Failed to read puffin command response packet", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    private final AbstractC14551g m89274m(ByteBuffer payload) {
        Integer numM41570a = AbstractC14551g.INSTANCE.m41570a(payload);
        if (numM41570a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read a puffin metadata packet - payload too short?: "), new AbstractC30556a.a[0]);
            return null;
        }
        try {
            return m89275n(payload, AbstractC14551g.b.INSTANCE.m41571a(numM41570a.intValue()));
        } catch (Exception e5) {
            logger.mo85230v("Unrecognized puffin metadata type: " + numM41570a, e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private final AbstractC14551g m89275n(ByteBuffer payload, AbstractC14551g.b type) {
        int i13 = a.f118822h[type.ordinal()];
        if (i13 == 1) {
            return new C14550f(payload);
        }
        if (i13 == 2) {
            return new C14548d(payload);
        }
        if (i13 == 3) {
            return new C14547c(payload);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o */
    private final C28323a m89276o(ByteBuffer payload) {
        Integer numM85787a = C28323a.INSTANCE.m85787a(payload);
        if (numM85787a == null) {
            logger.mo85222m(AbstractC2875y.m8295h(payload.limit(), "Can't read puffin event type - payload too short?: "), new AbstractC30556a.a[0]);
            return new C28323a(payload);
        }
        try {
            EnumC14546b enumC14546bM41556a = EnumC14546b.INSTANCE.m41556a(numM85787a.intValue());
            return (enumC14546bM41556a == null ? -1 : a.f118819e[enumC14546bM41556a.ordinal()]) == 1 ? new C14552h(payload) : new C28323a(payload);
        } catch (Exception unused) {
            logger.mo85222m("Unrecognized puffin event type: " + numM85787a, new AbstractC30556a.a[0]);
            return new C28323a(payload);
        }
    }

    /* JADX INFO: renamed from: p */
    private final C28323a m89277p(ByteBuffer payload) {
        return new C28323a(payload);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC24732i m89278a(byte[] data, EnumC32978v gen) {
        AbstractC22676k.m65750j(gen, "gen");
        if (data == null || data.length == 0 || data[0] != -86) {
            return null;
        }
        int[] iArr = a.f118815a;
        if (iArr[gen.ordinal()] == 4) {
            return new C25933c(data);
        }
        Byte bM74082w0 = AbstractC25260n.m74082w0(1, data);
        if (bM74082w0 != null && bM74082w0.byteValue() == 2) {
            return new C25938h(data);
        }
        int i13 = iArr[gen.ordinal()];
        if (i13 == 1) {
            return new C25935e(data);
        }
        if (i13 == 2) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(AbstractC24727d.m72403a());
            AbstractC22676k.m65749i(byteBufferOrder, "order(...)");
            return new C25936f(byteBufferOrder);
        }
        if (i13 == 3) {
            return new C25934d(data);
        }
        logger.mo85226q("Dropping packet: " + gen + " reached Rev1 fallback without a Rev2 envelope (revByte=" + AbstractC25260n.m74082w0(1, data) + ")", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC24732i m89279b(byte[] data, EnumC32978v gen) {
        AbstractC22676k.m65750j(gen, "gen");
        AbstractC24732i abstractC24732iM89278a = m89278a(data, gen);
        if (abstractC24732iM89278a == null || !abstractC24732iM89278a.m72426q(true)) {
            return null;
        }
        return abstractC24732iM89278a;
    }

    /* JADX INFO: renamed from: h */
    public final C25932b m89280h(AbstractC24732i packetFrame) {
        AbstractC22676k.m65750j(packetFrame, "packetFrame");
        C25932b c25932b = new C25932b(packetFrame);
        if (c25932b.m76712i()) {
            return c25932b;
        }
        logger.mo85222m("Can't read FramedPacket: Validation failed", new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC24726c m89281k(C25932b framedPacket) {
        AbstractC22676k.m65750j(framedPacket, "framedPacket");
        ByteBuffer byteBufferM76709c = framedPacket.m76709c();
        ByteBuffer byteBufferM76710f = framedPacket.m76710f();
        Byte bM72404b = byteBufferM76709c != null ? AbstractC24727d.m72404b(byteBufferM76709c) : null;
        if (bM72404b == null) {
            logger.mo85222m("No packet type found", new AbstractC30556a.a[0]);
            return null;
        }
        try {
            return m89266c(byteBufferM76710f, byteBufferM76709c, AbstractC24726c.a.INSTANCE.m72402a(bM72404b.byteValue()));
        } catch (Exception e5) {
            logger.mo85230v("Unrecognized packet type: " + bM72404b, e5, new AbstractC30556a.a[0]);
            return null;
        }
    }
}
