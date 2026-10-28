package zj0;

import fk2.C14554a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.nio.ByteBuffer;
import kk0.C22538a;
import kk0.C22539b;
import lt0.EnumC24733j;
import m83.AbstractC25260n;
import oh2.C27940c;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import st0.EnumC32973q;
import st0.EnumC32978v;
import st0.InterfaceC32972p;
import uk0.C35048b;
import ws0.C37605a;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import ze1.AbstractC40586b;

/* JADX INFO: renamed from: zj0.v */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bQ\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0014\u0010\u001a\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\rR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001d\u0010\rR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010\rR\u0014\u0010\"\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\rR\u0014\u0010$\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010\rR\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010\rR\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010\rR\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010\rR\u0014\u0010,\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010\rR\u0014\u0010.\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010\rR\u0014\u00100\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b/\u0010\rR\u0014\u00102\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\rR\u0014\u00104\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b3\u0010\rR\u0014\u00106\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\rR\u0014\u00108\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\rR\u0014\u0010:\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\rR\u0014\u0010<\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\rR\u0014\u0010>\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010\rR\u0014\u0010@\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\rR\u0014\u0010B\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010\rR\u0014\u0010C\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010E\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010\rR\u0014\u0010F\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\rR\u0014\u0010H\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010\rR\u0014\u0010J\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\rR\u0014\u0010L\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\rR\u0014\u0010N\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010\rR\u0014\u0010P\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010\rR\u0014\u0010R\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\rR\u0014\u0010T\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010\rR\u0014\u0010V\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010\rR\u0014\u0010X\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010\rR\u0014\u0010Z\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010\rR\u0014\u0010\\\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\rR\u001a\u0010a\u001a\u00020]8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010`R\u001a\u0010g\u001a\u00020b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010l\u001a\u00020h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\b\u0017\u0010kR\u001a\u0010q\u001a\u00020m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\b%\u0010pR\u001a\u0010v\u001a\u00020r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010s\u001a\u0004\bt\u0010uR\u001a\u0010y\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\b3\u0010\tR\u001a\u0010{\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010x\u001a\u0004\b\u0013\u0010\tR\u001a\u0010}\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b|\u0010x\u001a\u0004\b7\u0010\tR\u001e\u0010\u0083\u0001\u001a\u00020~8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0017\u0010\u0086\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u00109R\u001e\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010w\u001a\u0005\b;\u0010\u0089\u0001R\u0016\u0010\u008c\u0001\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\rR\u001f\u0010\u0091\u0001\u001a\u00030\u008d\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0005\b\f\u0010\u0090\u0001R\u001e\u0010\u0093\u0001\u001a\u00030\u0087\u00018\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010w\u001a\u0005\b\u0015\u0010\u0089\u0001R\u001d\u0010\u0096\u0001\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010\r\u001a\u0005\bn\u0010\u0095\u0001R\u001f\u0010\u009b\u0001\u001a\u00030\u0097\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0005\b\u001b\u0010\u009a\u0001R\u0018\u0010\u009f\u0001\u001a\u00030\u009c\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010£\u0001\u001a\u0005\u0018\u00010 \u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0001\u0010¢\u0001¨\u0006¤\u0001"}, m65681d2 = {"Lzj0/v;", "Lzj0/h;", "Lzj0/t$b;", "Ljava/nio/ByteBuffer;", "payload", "<init>", "(Ljava/nio/ByteBuffer;)V", "", "G", "()Ljava/lang/String;", "toString", "", "f", "I", "LENGTH_REVISION", "g", "LENGTH_BATTERY_LEVEL", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "LENGTH_CHARGING_STATUS", "i", "LENGTH_TIME_SECONDS", "j", "LENGTH_TIME_SUBSECONDS", "k", "LENGTH_SERIAL", "l", "LENGTH_VERSION_HASH", "m", "LENGTH_STRAP_SIGNATURE", "n", "LENGTH_HARDWARE_FAMILY", "o", "LENGTH_OPTICAL_REVISION", "p", "LENGTH_PCBA_REVISION", "q", "LENGTH_FIRMWARE_VERSION", "r", "LENGTH_FIRMWARE_VERSION_EXTRA", "s", "LENGTH_SIGPROC_VERSION", "t", "LENGTH_HR_PROFILE_BROADCAST_STATE", "u", "LENGTH_WRIST_STATUS", "v", "LENGTH_ERROR_ENUM", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "LENGTH_LOCKED_COUNTER", "x", "MASK_STRAP_LOCKED", "y", "OFFSET_REVISION", "z", "OFFSET_BATTERY_LEVEL", "A", "OFFSET_CHARGING_STATUS", "B", "OFFSET_TIME_SECONDS", "C", "OFFSET_TIME_SUBSECONDS", "D", "OFFSET_SERIAL", "E", "OFFSET_VERSION_HASH", "F", "OFFSET_STRAP_SIGNATURE", "OFFSET_HARDWARE_FAMILY", "H", "OFFSET_OPTICAL_REVISION", "OFFSET_PCBA_REVISION", "J", "OFFSET_FIRMWARE_VERSION_MAJOR", "K", "OFFSET_FIRMWARE_VERSION_MINOR", "L", "OFFSET_FIRMWARE_VERSION_POINT", "M", "OFFSET_FIRMWARE_VERSION_PATCH", "N", "OFFSET_SIGPROC_VERSION_MAJOR", "O", "OFFSET_SIGPROC_VERSION_MINOR", "P", "OFFSET_SIGPROC_VERSION_PATCH", "Q", "OFFSET_HR_PROFILE_BROADCAST_STATE", "R", "OFFSET_WRIST_STATUS", "S", "OFFSET_ERROR_ENUM", "T", "OFFSET_LOCKED_COUNTER", "", "U", "Y", "()S", "revision", "Lkk0/a;", "V", "Lkk0/a;", "b", "()Lkk0/a;", "batteryLevel", "Lws0/a;", "W", "Lws0/a;", "()Lws0/a;", "whoopBatteryLevel", "Lkk0/b;", "X", "Lkk0/b;", "()Lkk0/b;", "chargingStatus", "Lfk2/a;", "Lfk2/a;", "getTime", "()Lfk2/a;", "time", "Z", "Ljava/lang/String;", "serial", "a0", "versionHash", "b0", "strapSignature", "Loh2/b;", "c0", "Loh2/b;", "d", "()Loh2/b;", "firmwareVersion", "", "d0", "wristStatus", "", "e0", "()Z", "isOnBody", "f0", "pcbaId", "Loh2/e;", "g0", "Loh2/e;", "()Loh2/e;", "sigProcVersion", "h0", "hrBroadcastState", "i0", "()I", "errorEnum", "Lst0/p;", "j0", "Lst0/p;", "()Lst0/p;", "lockInfo", "Loh2/c;", "a", "()Loh2/c;", "hardwareVersion", "Lst0/v;", "c", "()Lst0/v;", "deviceType", "connectivity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C40760v extends C40727h implements InterfaceC40756t.b {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final int OFFSET_CHARGING_STATUS;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final int OFFSET_TIME_SECONDS;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final int OFFSET_TIME_SUBSECONDS;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final int OFFSET_SERIAL;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final int OFFSET_VERSION_HASH;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final int OFFSET_STRAP_SIGNATURE;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final int OFFSET_HARDWARE_FAMILY;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final int OFFSET_OPTICAL_REVISION;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final int OFFSET_PCBA_REVISION;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_MAJOR;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_MINOR;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_POINT;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final int OFFSET_FIRMWARE_VERSION_PATCH;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_MAJOR;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_MINOR;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final int OFFSET_SIGPROC_VERSION_PATCH;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final int OFFSET_HR_PROFILE_BROADCAST_STATE;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final int OFFSET_WRIST_STATUS;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final int OFFSET_ERROR_ENUM;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final int OFFSET_LOCKED_COUNTER;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final short revision;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final C22538a batteryLevel;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final C37605a whoopBatteryLevel;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final C22539b chargingStatus;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final C14554a time;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final String serial;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    private final String versionHash;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    private final String strapSignature;

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    private final InterfaceC27939b firmwareVersion;

    /* JADX INFO: renamed from: d0, reason: from kotlin metadata */
    private final byte wristStatus;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    private final boolean isOnBody;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int LENGTH_REVISION;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    private final int pcbaId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int LENGTH_BATTERY_LEVEL;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    private final C27942e sigProcVersion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final int LENGTH_CHARGING_STATUS;

    /* JADX INFO: renamed from: h0, reason: from kotlin metadata */
    private final boolean hrBroadcastState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int LENGTH_TIME_SECONDS;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    private final int errorEnum;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final int LENGTH_TIME_SUBSECONDS;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    private final InterfaceC32972p lockInfo;

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
    private final int LENGTH_FIRMWARE_VERSION_EXTRA;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final int LENGTH_SIGPROC_VERSION;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int LENGTH_HR_PROFILE_BROADCAST_STATE;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final int LENGTH_WRIST_STATUS;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int LENGTH_ERROR_ENUM;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final int LENGTH_LOCKED_COUNTER;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final int MASK_STRAP_LOCKED;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final int OFFSET_REVISION;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final int OFFSET_BATTERY_LEVEL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:19:0x02d1  */
    public C40760v(ByteBuffer byteBuffer) {
        InterfaceC32972p bVar;
        super(byteBuffer, null, 2, null);
        AbstractC22676k.m65747g(byteBuffer);
        this.LENGTH_REVISION = 1;
        this.LENGTH_BATTERY_LEVEL = 4;
        this.LENGTH_CHARGING_STATUS = 1;
        this.LENGTH_TIME_SECONDS = 4;
        this.LENGTH_TIME_SUBSECONDS = 4;
        this.LENGTH_SERIAL = 11;
        this.LENGTH_VERSION_HASH = 24;
        this.LENGTH_STRAP_SIGNATURE = 30;
        this.LENGTH_HARDWARE_FAMILY = 4;
        this.LENGTH_OPTICAL_REVISION = 4;
        this.LENGTH_PCBA_REVISION = 4;
        this.LENGTH_FIRMWARE_VERSION = 1;
        this.LENGTH_FIRMWARE_VERSION_EXTRA = 4;
        this.LENGTH_SIGPROC_VERSION = 1;
        this.LENGTH_HR_PROFILE_BROADCAST_STATE = 1;
        this.LENGTH_WRIST_STATUS = 1;
        this.LENGTH_ERROR_ENUM = 4;
        this.LENGTH_LOCKED_COUNTER = 4;
        this.MASK_STRAP_LOCKED = 64;
        int i13 = this.OFFSET_REVISION;
        int i14 = i13 + 1;
        this.OFFSET_BATTERY_LEVEL = i14;
        int i15 = i13 + 5;
        this.OFFSET_CHARGING_STATUS = i15;
        int i16 = i13 + 6;
        this.OFFSET_TIME_SECONDS = i16;
        int i17 = i13 + 10;
        this.OFFSET_TIME_SUBSECONDS = i17;
        int i18 = i13 + 14;
        this.OFFSET_SERIAL = i18;
        int i19 = i13 + 25;
        this.OFFSET_VERSION_HASH = i19;
        int i24 = i13 + 49;
        this.OFFSET_STRAP_SIGNATURE = i24;
        int i25 = i13 + 79;
        this.OFFSET_HARDWARE_FAMILY = i25;
        this.OFFSET_OPTICAL_REVISION = i13 + 83;
        int i26 = i13 + 87;
        this.OFFSET_PCBA_REVISION = i26;
        int i27 = i13 + 91;
        this.OFFSET_FIRMWARE_VERSION_MAJOR = i27;
        int i28 = i13 + 92;
        this.OFFSET_FIRMWARE_VERSION_MINOR = i28;
        int i29 = i13 + 93;
        this.OFFSET_FIRMWARE_VERSION_POINT = i29;
        int i34 = i13 + 94;
        this.OFFSET_FIRMWARE_VERSION_PATCH = i34;
        int i35 = i13 + 98;
        this.OFFSET_SIGPROC_VERSION_MAJOR = i35;
        int i36 = i13 + 99;
        this.OFFSET_SIGPROC_VERSION_MINOR = i36;
        int i37 = i13 + 100;
        this.OFFSET_SIGPROC_VERSION_PATCH = i37;
        int i38 = i13 + 101;
        this.OFFSET_HR_PROFILE_BROADCAST_STATE = i38;
        int i39 = i13 + 102;
        this.OFFSET_WRIST_STATUS = i39;
        int i44 = i13 + 103;
        this.OFFSET_ERROR_ENUM = i44;
        int i45 = i13 + 107;
        this.OFFSET_LOCKED_COUNTER = i45;
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        this.revision = C35048b.m110782b(byteBufferM132194S.get(this.OFFSET_REVISION));
        C22538a c22538a = new C22538a();
        ByteBuffer byteBufferM132194S2 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S2);
        c22538a.m65141m((byte) (byteBufferM132194S2.getInt(i14) / 10));
        this.batteryLevel = c22538a;
        ByteBuffer byteBufferM132194S3 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S3);
        this.whoopBatteryLevel = new C37605a(byteBufferM132194S3.getInt(i14) / 10);
        C22539b c22539b = new C22539b();
        ByteBuffer byteBufferM132194S4 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S4);
        c22539b.m65155l(byteBufferM132194S4.get(i15));
        this.chargingStatus = c22539b;
        ByteBuffer byteBufferM132194S5 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S5);
        long jM110783d = C35048b.m110783d(byteBufferM132194S5.getInt(i16));
        ByteBuffer byteBufferM132194S6 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S6);
        this.time = new C14554a(jM110783d, C35048b.m110783d(byteBufferM132194S6.getInt(i17)));
        ByteBuffer byteBufferM132194S7 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S7);
        byte[] bArrArray = byteBufferM132194S7.array();
        AbstractC22676k.m65749i(bArrArray, "array(...)");
        ByteBuffer byteBufferM132194S8 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S8);
        this.serial = AbstractC39414r.m125862H0(new String(bArrArray, byteBufferM132194S8.arrayOffset() + i18, 11, AbstractC39397a.f169546a), (char) 0);
        ByteBuffer byteBufferM132194S9 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S9);
        byte[] bArrArray2 = byteBufferM132194S9.array();
        AbstractC22676k.m65749i(bArrArray2, "array(...)");
        ByteBuffer byteBufferM132194S10 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S10);
        int iArrayOffset = byteBufferM132194S10.arrayOffset() + i19;
        ByteBuffer byteBufferM132194S11 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S11);
        this.versionHash = AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray2, iArrayOffset, byteBufferM132194S11.arrayOffset() + i24));
        ByteBuffer byteBufferM132194S12 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S12);
        byte[] bArrArray3 = byteBufferM132194S12.array();
        AbstractC22676k.m65749i(bArrArray3, "array(...)");
        ByteBuffer byteBufferM132194S13 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S13);
        int iArrayOffset2 = byteBufferM132194S13.arrayOffset() + i24;
        ByteBuffer byteBufferM132194S14 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S14);
        this.strapSignature = AbstractC40586b.m131620e(AbstractC25260n.m74070k0(bArrArray3, iArrayOffset2, byteBufferM132194S14.arrayOffset() + i25));
        ByteBuffer byteBufferM132194S15 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S15);
        long jM110782b = C35048b.m110782b(byteBufferM132194S15.get(i27));
        ByteBuffer byteBufferM132194S16 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S16);
        long jM110782b2 = C35048b.m110782b(byteBufferM132194S16.get(i28));
        ByteBuffer byteBufferM132194S17 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S17);
        long jM110782b3 = C35048b.m110782b(byteBufferM132194S17.get(i29));
        ByteBuffer byteBufferM132194S18 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S18);
        this.firmwareVersion = new InterfaceC27939b.b(jM110782b, jM110782b2, jM110782b3, C35048b.m110783d(byteBufferM132194S18.getInt(i34)));
        ByteBuffer byteBufferM132194S19 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S19);
        byte b = byteBufferM132194S19.get(i39);
        this.wristStatus = b;
        this.isOnBody = b == 1;
        ByteBuffer byteBufferM132194S20 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S20);
        this.pcbaId = byteBufferM132194S20.getInt(i26);
        C27942e.a aVarM84355a = C27942e.m84355a();
        ByteBuffer byteBufferM132194S21 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S21);
        C27942e.a aVarM84362b = aVarM84355a.m84362b(C35048b.m110782b(byteBufferM132194S21.get(i35)));
        ByteBuffer byteBufferM132194S22 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S22);
        C27942e.a aVarM84363c = aVarM84362b.m84363c(C35048b.m110782b(byteBufferM132194S22.get(i36)));
        ByteBuffer byteBufferM132194S23 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S23);
        C27942e c27942eM84361a = aVarM84363c.m84364d(C35048b.m110782b(byteBufferM132194S23.get(i37))).m84361a();
        AbstractC22676k.m65749i(c27942eM84361a, "build(...)");
        this.sigProcVersion = c27942eM84361a;
        ByteBuffer byteBufferM132194S24 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S24);
        this.hrBroadcastState = byteBufferM132194S24.get(i38) != 0;
        ByteBuffer byteBufferM132194S25 = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S25);
        this.errorEnum = byteBufferM132194S25.get(i44);
        if (getRevision() == EnumC24733j.REVISION_3.getValue()) {
            ByteBuffer byteBufferM132194S26 = m132194S();
            AbstractC22676k.m65747g(byteBufferM132194S26);
            if (byteBufferM132194S26.limit() >= i13 + 111) {
                ByteBuffer byteBufferM132194S27 = m132194S();
                AbstractC22676k.m65747g(byteBufferM132194S27);
                EnumC32973q enumC32973q = (byteBufferM132194S27.get(i44) & 64) != 0 ? EnumC32973q.LOCKED : EnumC32973q.UNLOCKED;
                ByteBuffer byteBufferM132194S28 = m132194S();
                AbstractC22676k.m65747g(byteBufferM132194S28);
                bVar = new InterfaceC32972p.b(enumC32973q, C35048b.m110783d(byteBufferM132194S28.getInt(i45)));
            } else {
                bVar = InterfaceC32972p.a.f137300a;
            }
        } else {
            bVar = InterfaceC32972p.a.f137300a;
        }
        this.lockInfo = bVar;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: A, reason: from getter */
    public String getStrapSignature() {
        return this.strapSignature;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: C, reason: from getter */
    public boolean getIsOnBody() {
        return this.isOnBody;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: G */
    public String mo132212G() {
        StringBuilder sb4 = new StringBuilder("HelloResponsePacket:");
        sb4.append("\nRevision: " + ((int) getRevision()));
        sb4.append("\nBattery Level: " + ((int) getBatteryLevel().getUserDisplayPercent()));
        sb4.append("\nWhoop Device Battery Level: " + getWhoopBatteryLevel().getLevel());
        sb4.append("\nCharging: " + getChargingStatus().m65149d());
        sb4.append("\nTime: " + getTime().m41582i());
        sb4.append("\nSerial: " + getSerial());
        sb4.append("\nVersion Hash: " + getVersionHash());
        sb4.append("\nStrap Signature: " + getStrapSignature());
        sb4.append("\nHardware Version: " + mo132213a().m84332d());
        sb4.append("\nFirmware Version: " + getFirmwareVersion().mo84319a());
        sb4.append("\nSigProc Version: " + getSigProcVersion().m84360f());
        sb4.append("\nHR Broadcast: " + getHrBroadcastState());
        sb4.append("\nWrist Status: " + ((int) this.wristStatus));
        sb4.append("\nPCBA ID: " + this.pcbaId);
        sb4.append("\nDevice Type: " + mo132247c());
        sb4.append("\nError: " + getErrorEnum());
        sb4.append("\nLock Info: " + getLockInfo());
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public int getErrorEnum() {
        return this.errorEnum;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public short getRevision() {
        return this.revision;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: a */
    public C27940c mo132213a() {
        ByteBuffer byteBufferM132194S = m132194S();
        AbstractC22676k.m65747g(byteBufferM132194S);
        byteBufferM132194S.position(this.OFFSET_HARDWARE_FAMILY);
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
    /* JADX INFO: renamed from: b, reason: from getter */
    public C22538a getBatteryLevel() {
        return this.batteryLevel;
    }

    @Override // zj0.InterfaceC40756t.b
    /* JADX INFO: renamed from: c */
    public EnumC32978v mo132247c() {
        int i13 = this.pcbaId;
        if (i13 >= 0 && i13 < 38) {
            return EnumC32978v.MAVERICK;
        }
        if (48 > i13 || i13 >= 86) {
            return null;
        }
        return EnumC32978v.GOOSE;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: d, reason: from getter */
    public InterfaceC27939b getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: f, reason: from getter */
    public C27942e getSigProcVersion() {
        return this.sigProcVersion;
    }

    @Override // zj0.InterfaceC40756t
    public C14554a getTime() {
        return this.time;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: i, reason: from getter */
    public String getVersionHash() {
        return this.versionHash;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: j, reason: from getter */
    public boolean getHrBroadcastState() {
        return this.hrBroadcastState;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: k, reason: from getter */
    public C37605a getWhoopBatteryLevel() {
        return this.whoopBatteryLevel;
    }

    @Override // zj0.InterfaceC40756t.b
    /* JADX INFO: renamed from: m, reason: from getter */
    public InterfaceC32972p getLockInfo() {
        return this.lockInfo;
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: r, reason: from getter */
    public C22539b getChargingStatus() {
        return this.chargingStatus;
    }

    @Override // zj0.C40727h, lt0.AbstractC24726c
    public String toString() {
        return mo132212G();
    }

    @Override // zj0.InterfaceC40756t
    /* JADX INFO: renamed from: y, reason: from getter */
    public String getSerial() {
        return this.serial;
    }
}
