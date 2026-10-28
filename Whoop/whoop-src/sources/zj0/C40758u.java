package zj0;

import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import kk0.C22538a;
import kk0.C22539b;
import m83.AbstractC25260n;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import uk0.C35048b;
import ws0.C37605a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: zj0.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bZ\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00104\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\rR\u0014\u00108\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\rR\u0014\u0010:\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\rR\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\rR\u0014\u0010>\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\rR\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\rR\u0014\u0010B\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\rR\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010E\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\rR\u0014\u0010F\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\rR\u0014\u0010H\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\rR\u0014\u0010J\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\rR\u0014\u0010L\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\rR\u0014\u0010N\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\rR\u0014\u0010P\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\rR\u0014\u0010R\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\rR\u0014\u0010T\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\rR\u0014\u0010V\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\rR\u0014\u0010X\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\rR\u0014\u0010Z\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\rR\u0014\u0010\\\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\rR\u0014\u0010^\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010\rR\u0014\u0010`\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010\rR\u0014\u0010b\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010\rR\u0014\u0010e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010i\u001a\u00020f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0014\u0010t\u001a\u00020r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010sR\u0014\u0010w\u001a\u00020u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010vR\u0014\u0010{\u001a\u00020x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010|\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\tR\u0014\u0010}\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0014\u0010~\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\tR\u0017\u0010\u0082\u0001\u001a\u00020\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b;\u0010\u0088\u0001R\u0017\u0010\u008a\u0001\u001a\u00030\u0083\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b-\u0010\u0085\u0001R\u0017\u0010\u008d\u0001\u001a\u00030\u008b\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\f\u0010\u008c\u0001R\u0017\u0010\u008e\u0001\u001a\u00030\u0087\u00018VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0015\u0010\u0088\u0001R\u0016\u0010\u0090\u0001\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010d¨\u0006\u0091\u0001"}, m65681d2 = {"Lzj0/u;", "Lzj0/h;", "Lzj0/t$a;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "G", "()Ljava/lang/String;", "toString", "", "f", "I", "LENGTH_REVISION", "g", "LENGTH_BATTERY_LEVEL", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "LENGTH_CHARGING_STATUS", "i", "LENGTH_TIME_SECONDS", "j", "LENGTH_TIME_SUBSECONDS", "k", "LENGTH_SERIAL", "l", "LENGTH_VERSION_HASH", "m", "LENGTH_STRAP_SIGNATURE", "n", "LENGTH_HARDWARE_FAMILY", "o", "LENGTH_OPTICAL_REVISION", "p", "LENGTH_PCBA_REVISION", "q", "LENGTH_FIRMWARE_VERSION", "r", "LENGTH_SIGPROC_VERSION", "s", "LENGTH_HR_PROFILE_BROADCAST_STATE", "t", "LENGTH_ERROR_ENUM", "u", "LENGTH_WRIST_STATUS", "v", "LENGTH_NORDIC_VERSION", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "LENGTH_END_PADDING", "x", "OFFSET_REVISION", "y", "OFFSET_BATTERY_LEVEL", "z", "OFFSET_CHARGING_STATUS", "A", "OFFSET_TIME_SECONDS", "B", "OFFSET_TIME_SUBSECONDS", "C", "OFFSET_SERIAL", "D", "OFFSET_VERSION_HASH", "E", "OFFSET_STRAP_SIGNATURE", "F", "OFFSET_HARDWARE_FAMILY", "OFFSET_OPTICAL_REVISION", "H", "OFFSET_PCBA_REVISION", "OFFSET_FIRMWARE_VERSION_MAJOR", "J", "OFFSET_FIRMWARE_VERSION_MINOR", "K", "OFFSET_FIRMWARE_VERSION_POINT", "L", "OFFSET_FIRMWARE_VERSION_PATCH", "M", "OFFSET_SIGPROC_VERSION_MAJOR", "N", "OFFSET_SIGPROC_VERSION_MINOR", "O", "OFFSET_SIGPROC_VERSION_PATCH", "P", "OFFSET_HR_PROFILE_BROADCAST_STATE", "Q", "OFFSET_ERROR_ENUM", "R", "OFFSET_WRIST_STATUS", "S", "OFFSET_NORDIC_VERSION_MAJOR", "T", "OFFSET_NORDIC_VERSION_MINOR", "U", "OFFSET_NORDIC_VERSION_POINT", "V", "OFFSET_NORDIC_VERSION_EXTRA", "W", "PADDING_OFFSET", "Y", "()I", "harvardOffset", "", "a0", "()B", "wristStatus", "", "Z", "()S", "revision", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lws0/a;", "()Lws0/a;", "whoopBatteryLevel", "Lkk0/b;", "()Lkk0/b;", "chargingStatus", "Lfk2/a;", "getTime", "()Lfk2/a;", "time", "serial", "versionHash", "strapSignature", "Loh2/c;", "a", "()Loh2/c;", "hardwareVersion", "Loh2/b;", "d", "()Loh2/b;", "firmwareVersion", "", "()Z", "isOnBody", "nordicVersion", "Loh2/e;", "()Loh2/e;", "sigProcVersion", "hrBroadcastState", "X", "errorEnum", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40758u extends C40727h implements InterfaceC40756t.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int OFFSET_TIME_SECONDS;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int OFFSET_TIME_SUBSECONDS;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int OFFSET_SERIAL;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int OFFSET_VERSION_HASH;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int OFFSET_STRAP_SIGNATURE;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int OFFSET_HARDWARE_FAMILY;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int OFFSET_OPTICAL_REVISION;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int OFFSET_PCBA_REVISION;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_MAJOR;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_MINOR;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_POINT;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_PATCH;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_MAJOR;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_MINOR;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_PATCH;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final int OFFSET_HR_PROFILE_BROADCAST_STATE;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final int OFFSET_ERROR_ENUM;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final int OFFSET_WRIST_STATUS;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final int OFFSET_NORDIC_VERSION_MAJOR;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final int OFFSET_NORDIC_VERSION_MINOR;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final int OFFSET_NORDIC_VERSION_POINT;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final int OFFSET_NORDIC_VERSION_EXTRA;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final int PADDING_OFFSET;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int LENGTH_REVISION;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int LENGTH_BATTERY_LEVEL;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int LENGTH_CHARGING_STATUS;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int LENGTH_TIME_SECONDS;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int LENGTH_TIME_SUBSECONDS;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final int LENGTH_SERIAL;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int LENGTH_VERSION_HASH;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final int LENGTH_STRAP_SIGNATURE;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int LENGTH_HARDWARE_FAMILY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int LENGTH_OPTICAL_REVISION;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final int LENGTH_PCBA_REVISION;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final int LENGTH_FIRMWARE_VERSION;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private final int LENGTH_SIGPROC_VERSION;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int LENGTH_HR_PROFILE_BROADCAST_STATE;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int LENGTH_ERROR_ENUM;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int LENGTH_WRIST_STATUS;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int LENGTH_NORDIC_VERSION;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int LENGTH_END_PADDING;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int OFFSET_REVISION;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int OFFSET_BATTERY_LEVEL;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int OFFSET_CHARGING_STATUS;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40758u(ByteBuffer byteBuffer) {
        super(byteBuffer, null, 2, null);
        AbstractC22676k.m65747g(byteBuffer);
        this.LENGTH_REVISION = 1;
        this.LENGTH_BATTERY_LEVEL = 4;
        this.LENGTH_CHARGING_STATUS = 1;
        this.LENGTH_TIME_SECONDS = 4;
        this.LENGTH_TIME_SUBSECONDS = 4;
        this.LENGTH_SERIAL = 9;
        this.LENGTH_VERSION_HASH = 24;
        this.LENGTH_STRAP_SIGNATURE = 30;
        this.LENGTH_HARDWARE_FAMILY = 4;
        this.LENGTH_OPTICAL_REVISION = 4;
        this.LENGTH_PCBA_REVISION = 4;
        this.LENGTH_FIRMWARE_VERSION = 4;
        this.LENGTH_SIGPROC_VERSION = 1;
        this.LENGTH_HR_PROFILE_BROADCAST_STATE = 1;
        this.LENGTH_ERROR_ENUM = 4;
        this.LENGTH_WRIST_STATUS = 1;
        this.LENGTH_NORDIC_VERSION = 4;
        this.LENGTH_END_PADDING = 1;
        int i13 = this.OFFSET_REVISION;
        this.OFFSET_BATTERY_LEVEL = i13 + 1;
        this.OFFSET_CHARGING_STATUS = i13 + 5;
        this.OFFSET_TIME_SECONDS = i13 + 6;
        this.OFFSET_TIME_SUBSECONDS = i13 + 10;
        this.OFFSET_SERIAL = i13 + 14;
        this.OFFSET_VERSION_HASH = i13 + 23;
        this.OFFSET_STRAP_SIGNATURE = i13 + 47;
        this.OFFSET_HARDWARE_FAMILY = i13 + 77;
        this.OFFSET_OPTICAL_REVISION = i13 + 81;
        this.OFFSET_PCBA_REVISION = i13 + 85;
        this.OFFSET_FIRMWARE_VERSION_MAJOR = i13 + 89;
        this.OFFSET_FIRMWARE_VERSION_MINOR = i13 + 93;
        this.OFFSET_FIRMWARE_VERSION_POINT = i13 + 97;
        this.OFFSET_FIRMWARE_VERSION_PATCH = i13 + 101;
        this.OFFSET_SIGPROC_VERSION_MAJOR = i13 + 105;
        this.OFFSET_SIGPROC_VERSION_MINOR = i13 + 106;
        this.OFFSET_SIGPROC_VERSION_PATCH = i13 + 107;
        this.OFFSET_HR_PROFILE_BROADCAST_STATE = i13 + 108;
        this.OFFSET_ERROR_ENUM = i13 + 109;
        this.OFFSET_WRIST_STATUS = i13 + 113;
        this.OFFSET_NORDIC_VERSION_MAJOR = i13 + 114;
        this.OFFSET_NORDIC_VERSION_MINOR = i13 + 118;
        this.OFFSET_NORDIC_VERSION_POINT = i13 + 122;
        this.OFFSET_NORDIC_VERSION_EXTRA = i13 + 126;
        this.PADDING_OFFSET = i13 + 127;
    }

    /* JADX INFO: renamed from: Y */
    private final int m132250Y() {
        return m132253Z() == 4 ? 1 : 0;
    }

    /* JADX INFO: renamed from: a0 */
    private final byte m132251a0() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.get(this.OFFSET_WRIST_STATUS + m132250Y());
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: A */
    public String mo132210A() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        int iArrayOffset = byteBufferM132194S.arrayOffset() + this.OFFSET_STRAP_SIGNATURE + m132250Y();
        int i13 = this.LENGTH_STRAP_SIGNATURE + iArrayOffset;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        byte[] bArrArray = byteBufferM132194S2.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray, iArrayOffset, i13));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: C */
    public boolean mo132211C() {
        return m132251a0() == 1;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: G */
    public String mo132212G() {
        StringBuilder sb4 = new StringBuilder("HelloResponsePacket:");
        sb4.append("\nRevision: " + ((int) m132253Z()));
        sb4.append("\nBattery Level: " + ((int) mo132214b().getUserDisplayPercent()));
        sb4.append("\nWhoop Device Battery Level: " + mo132224k().getLevel());
        sb4.append("\nCharging: " + mo132225r().m65149d());
        sb4.append("\nTime: " + getTime().m41582i());
        sb4.append("\nSerial: " + mo132226y());
        sb4.append("\nVersion Hash: " + mo132222i());
        sb4.append("\nStrap Signature: " + mo132210A());
        sb4.append("\nHardware Version: " + mo132213a().m84332d());
        sb4.append("\nFirmware Version: " + mo132217d().mo84319a());
        sb4.append("\nSigProc Version: " + mo132220f().m84360f());
        sb4.append("\nHR Broadcast: " + mo132223j());
        sb4.append("\nError: " + m132252X());
        sb4.append("\nWrist Status: " + ((int) m132251a0()));
        sb4.append("\nNordic Version: " + mo132246v().mo84319a());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: X */
    public int m132252X() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.get(this.OFFSET_ERROR_ENUM + m132250Y());
    }

    /* JADX INFO: renamed from: Z */
    public short m132253Z() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return C35048b.m110782b(byteBufferM132194S.get(this.OFFSET_REVISION));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: a */
    public C27940c mo132213a() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(this.OFFSET_HARDWARE_FAMILY + m132250Y());
        C27940c.Companion companion = C27940c.INSTANCE;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        C27940c c27940cM84338b = companion.m84338b(byteBufferM132194S2);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return c27940cM84338b;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: b */
    public C22538a mo132214b() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        int i13 = byteBufferM132194S.getInt(this.OFFSET_BATTERY_LEVEL);
        C22538a c22538a = new C22538a();
        c22538a.m65141m((byte) (i13 / 10));
        return c22538a;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: d */
    public InterfaceC27939b mo132217d() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(this.OFFSET_FIRMWARE_VERSION_MAJOR + m132250Y());
        InterfaceC27939b.Companion companion = InterfaceC27939b.INSTANCE;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        InterfaceC27939b.b bVarM84323a = companion.m84323a(byteBufferM132194S2);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return bVarM84323a;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: f */
    public C27942e mo132220f() {
        C27942e.a aVarM84355a = C27942e.m84355a();
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        C27942e.a aVarM84362b = aVarM84355a.m84362b(C35048b.m110782b(byteBufferM132194S.get(this.OFFSET_SIGPROC_VERSION_MAJOR + m132250Y())));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        C27942e.a aVarM84363c = aVarM84362b.m84363c(C35048b.m110782b(byteBufferM132194S2.get(this.OFFSET_SIGPROC_VERSION_MINOR + m132250Y())));
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        C27942e c27942eM84361a = aVarM84363c.m84364d(C35048b.m110782b(byteBufferM132194S3.get(this.OFFSET_SIGPROC_VERSION_PATCH + m132250Y()))).m84361a();
        AbstractC22676k.m65749i(c27942eM84361a, "build(...)");
        return c27942eM84361a;
    }

    @Override // zj0.InterfaceC40756t
    public C14554a getTime() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        long jM110783d = C35048b.m110783d(byteBufferM132194S.getInt(this.OFFSET_TIME_SECONDS));
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        return new C14554a(jM110783d, C35048b.m110783d(byteBufferM132194S2.getInt(this.OFFSET_TIME_SUBSECONDS)));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: i */
    public String mo132222i() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        int iArrayOffset = byteBufferM132194S.arrayOffset() + this.OFFSET_VERSION_HASH + m132250Y();
        int i13 = this.LENGTH_VERSION_HASH + iArrayOffset;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        byte[] bArrArray = byteBufferM132194S2.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        return AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray, iArrayOffset, i13));
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: j */
    public boolean mo132223j() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return byteBufferM132194S.get(this.OFFSET_HR_PROFILE_BROADCAST_STATE + m132250Y()) != 0;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: k */
    public C37605a mo132224k() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        return new C37605a(byteBufferM132194S.getInt(this.OFFSET_BATTERY_LEVEL) / 10);
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: r */
    public C22539b mo132225r() {
        C22539b c22539b = new C22539b();
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        c22539b.m65155l(byteBufferM132194S.get(this.OFFSET_CHARGING_STATUS));
        return c22539b;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return mo132212G();
    }

    @Override // zj0.InterfaceC40756t.a
    /* JADX INFO: renamed from: v */
    public InterfaceC27939b mo132246v() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(this.OFFSET_NORDIC_VERSION_MAJOR + m132250Y());
        InterfaceC27939b.Companion companion = InterfaceC27939b.INSTANCE;
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        InterfaceC27939b.b bVarM84323a = companion.m84323a(byteBufferM132194S2);
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        byteBufferM132194S3.rewind();
        return bVarM84323a;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: y */
    public String mo132226y() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byte[] bArrArray = byteBufferM132194S.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        return AbstractC39414r.m125862H0(new String(bArrArray, byteBufferM132194S2.arrayOffset() + this.OFFSET_SERIAL, this.LENGTH_SERIAL + m132250Y(), AbstractC39397a.f169546a), (char) 0);
    }
}
