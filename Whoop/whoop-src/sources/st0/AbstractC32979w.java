package st0;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.UUID;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: st0.w */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b@\"\"\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\"\u0010\t\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\"\u0010\f\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0003\u001a\u0004\b\u000b\u0010\u0005\"\"\u0010\u000f\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u0005\"\"\u0010\u0012\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\"\u0010\u0015\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0014\u0010\u0005\"\"\u0010\u0017\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0016\u0010\u0005\"\"\u0010\u0019\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0003\u001a\u0004\b\u0018\u0010\u0005\"\"\u0010\u001b\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u001a\u0010\u0005\"\"\u0010\u001d\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0003\u001a\u0004\b\u001c\u0010\u0005\"\"\u0010\u001f\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u001e\u0010\u0005\"\"\u0010!\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0003\u001a\u0004\b \u0010\u0005\"\"\u0010\"\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0013\u0010\u0005\"\"\u0010#\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0007\u0010\u0005\"\"\u0010$\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0002\u0010\u0005\"\"\u0010%\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0003\u001a\u0004\b\r\u0010\u0005\"\"\u0010&\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0003\u001a\u0004\b\n\u0010\u0005\"\"\u0010'\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0010\u0010\u0005\"\"\u0010*\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010\u0003\u001a\u0004\b)\u0010\u0005\"\"\u0010,\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\u0003\u001a\u0004\b+\u0010\u0005\"\"\u0010.\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010\u0003\u001a\u0004\b(\u0010\u0005\"\"\u00100\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\u0003\u001a\u0004\b/\u0010\u0005\"\"\u00102\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010\u0003\u001a\u0004\b-\u0010\u0005\"\"\u00103\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010\u0003\u001a\u0004\b1\u0010\u0005\"\"\u00106\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\u0003\u001a\u0004\b5\u0010\u0005\"\"\u00108\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u0010\u0003\u001a\u0004\b7\u0010\u0005\"\"\u0010:\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b9\u0010\u0003\u001a\u0004\b4\u0010\u0005\"\"\u0010<\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u0010\u0003\u001a\u0004\b;\u0010\u0005\"\"\u0010>\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010\u0003\u001a\u0004\b9\u0010\u0005\"\"\u0010?\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\u0003\u001a\u0004\b=\u0010\u0005¨\u0006@"}, m65681d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "a", "Ljava/util/UUID;", "l", "()Ljava/util/UUID;", "WHOOP_GEN_4_SERVICE_ID", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "WHOOP_GEN_4_CHAR_CMD_TO_STRAP", "c", "g", "WHOOP_GEN_4_CHAR_CMD_FROM_STRAP", "d", "j", "WHOOP_GEN_4_CHAR_EVENTS_FROM_STRAP", "e", "i", "WHOOP_GEN_4_CHAR_DATA_FROM_STRAP", "f", "k", "WHOOP_GEN_4_CHAR_MEMFAULT", "r", "WHOOP_MAVERICK_SERVICE_ID", "n", "WHOOP_MAVERICK_CHAR_CMD_TO_STRAP", "m", "WHOOP_MAVERICK_CHAR_CMD_FROM_STRAP", "p", "WHOOP_MAVERICK_CHAR_EVENTS_FROM_STRAP", "o", "WHOOP_MAVERICK_CHAR_DATA_FROM_STRAP", "q", "WHOOP_MAVERICK_CHAR_MEMFAULT", "PUFFIN_SERVICE_ID", "PUFFIN_CHAR_CMD_TO_STRAP", "PUFFIN_CHAR_CMD_FROM_STRAP", "PUFFIN_CHAR_EVENTS_FROM_STRAP", "PUFFIN_CHAR_DATA_FROM_STRAP", "PUFFIN_CHAR_MEMFAULT", "s", "x", "WHOOP_MONUMENT_SERVICE_ID", "t", "WHOOP_MONUMENT_CHAR_CMD_TO_STRAP", "u", "WHOOP_MONUMENT_CHAR_CMD_FROM_STRAP", "v", "WHOOP_MONUMENT_CHAR_EVENTS_FROM_STRAP", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "WHOOP_MONUMENT_CHAR_DATA_FROM_STRAP", "WHOOP_MONUMENT_CHAR_MEMFAULT", "y", "D", "WHOOP_SYMPHONY_SERVICE_ID", "z", "WHOOP_SYMPHONY_CHAR_CMD_TO_STRAP", "A", "WHOOP_SYMPHONY_CHAR_CMD_FROM_STRAP", "B", "WHOOP_SYMPHONY_CHAR_EVENTS_FROM_STRAP", "C", "WHOOP_SYMPHONY_CHAR_DATA_FROM_STRAP", "WHOOP_SYMPHONY_CHAR_MEMFAULT", "connectivity-core_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC32979w {

    /* JADX INFO: renamed from: a */
    private static final UUID f137312a = UUID.fromString("61080001-8d6d-82b8-614a-1c8cb0f8dcc6");

    /* JADX INFO: renamed from: b */
    private static final UUID f137313b = UUID.fromString("61080002-8d6d-82b8-614a-1c8cb0f8dcc6");

    /* JADX INFO: renamed from: c */
    private static final UUID f137314c = UUID.fromString("61080003-8d6d-82b8-614a-1c8cb0f8dcc6");

    /* JADX INFO: renamed from: d */
    private static final UUID f137315d = UUID.fromString("61080004-8d6d-82b8-614a-1c8cb0f8dcc6");

    /* JADX INFO: renamed from: e */
    private static final UUID f137316e = UUID.fromString("61080005-8d6d-82b8-614a-1c8cb0f8dcc6");

    /* JADX INFO: renamed from: f */
    private static final UUID f137317f = UUID.fromString("61080007-8D6D-82B8-614A-1C8CB0F8DCC6");

    /* JADX INFO: renamed from: g */
    private static final UUID f137318g = UUID.fromString("fd4b0001-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: h */
    private static final UUID f137319h = UUID.fromString("fd4b0002-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: i */
    private static final UUID f137320i = UUID.fromString("fd4b0003-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: j */
    private static final UUID f137321j = UUID.fromString("fd4b0004-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: k */
    private static final UUID f137322k = UUID.fromString("fd4b0005-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: l */
    private static final UUID f137323l = UUID.fromString("fd4b0007-cce1-4033-93ce-002d5875f58a");

    /* JADX INFO: renamed from: m */
    private static final UUID f137324m = UUID.fromString("11500001-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: n */
    private static final UUID f137325n = UUID.fromString("11500002-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: o */
    private static final UUID f137326o = UUID.fromString("11500003-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: p */
    private static final UUID f137327p = UUID.fromString("11500004-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: q */
    private static final UUID f137328q = UUID.fromString("11500005-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: r */
    private static final UUID f137329r = UUID.fromString("11500007-6215-11ee-8c99-0242ac120002");

    /* JADX INFO: renamed from: s */
    private static final UUID f137330s = UUID.fromString("8a580001-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: t */
    private static final UUID f137331t = UUID.fromString("8a580002-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: u */
    private static final UUID f137332u = UUID.fromString("8a580003-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: v */
    private static final UUID f137333v = UUID.fromString("8a580004-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: w */
    private static final UUID f137334w = UUID.fromString("8a580005-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: x */
    private static final UUID f137335x = UUID.fromString("8a580007-2fe8-4796-9267-b87a2b0c8234");

    /* JADX INFO: renamed from: y */
    private static final UUID f137336y = UUID.fromString("59830001-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: z */
    private static final UUID f137337z = UUID.fromString("59830002-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: A */
    private static final UUID f137308A = UUID.fromString("59830003-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: B */
    private static final UUID f137309B = UUID.fromString("59830004-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: C */
    private static final UUID f137310C = UUID.fromString("59830005-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: D */
    private static final UUID f137311D = UUID.fromString("59830007-5955-419b-bb8d-c8262926af23");

    /* JADX INFO: renamed from: A */
    public static final UUID m104093A() {
        return f137310C;
    }

    /* JADX INFO: renamed from: B */
    public static final UUID m104094B() {
        return f137309B;
    }

    /* JADX INFO: renamed from: C */
    public static final UUID m104095C() {
        return f137311D;
    }

    /* JADX INFO: renamed from: D */
    public static final UUID m104096D() {
        return f137336y;
    }

    /* JADX INFO: renamed from: a */
    public static final UUID m104097a() {
        return f137326o;
    }

    /* JADX INFO: renamed from: b */
    public static final UUID m104098b() {
        return f137325n;
    }

    /* JADX INFO: renamed from: c */
    public static final UUID m104099c() {
        return f137328q;
    }

    /* JADX INFO: renamed from: d */
    public static final UUID m104100d() {
        return f137327p;
    }

    /* JADX INFO: renamed from: e */
    public static final UUID m104101e() {
        return f137329r;
    }

    /* JADX INFO: renamed from: f */
    public static final UUID m104102f() {
        return f137324m;
    }

    /* JADX INFO: renamed from: g */
    public static final UUID m104103g() {
        return f137314c;
    }

    /* JADX INFO: renamed from: h */
    public static final UUID m104104h() {
        return f137313b;
    }

    /* JADX INFO: renamed from: i */
    public static final UUID m104105i() {
        return f137316e;
    }

    /* JADX INFO: renamed from: j */
    public static final UUID m104106j() {
        return f137315d;
    }

    /* JADX INFO: renamed from: k */
    public static final UUID m104107k() {
        return f137317f;
    }

    /* JADX INFO: renamed from: l */
    public static final UUID m104108l() {
        return f137312a;
    }

    /* JADX INFO: renamed from: m */
    public static final UUID m104109m() {
        return f137320i;
    }

    /* JADX INFO: renamed from: n */
    public static final UUID m104110n() {
        return f137319h;
    }

    /* JADX INFO: renamed from: o */
    public static final UUID m104111o() {
        return f137322k;
    }

    /* JADX INFO: renamed from: p */
    public static final UUID m104112p() {
        return f137321j;
    }

    /* JADX INFO: renamed from: q */
    public static final UUID m104113q() {
        return f137323l;
    }

    /* JADX INFO: renamed from: r */
    public static final UUID m104114r() {
        return f137318g;
    }

    /* JADX INFO: renamed from: s */
    public static final UUID m104115s() {
        return f137332u;
    }

    /* JADX INFO: renamed from: t */
    public static final UUID m104116t() {
        return f137331t;
    }

    /* JADX INFO: renamed from: u */
    public static final UUID m104117u() {
        return f137334w;
    }

    /* JADX INFO: renamed from: v */
    public static final UUID m104118v() {
        return f137333v;
    }

    /* JADX INFO: renamed from: w */
    public static final UUID m104119w() {
        return f137335x;
    }

    /* JADX INFO: renamed from: x */
    public static final UUID m104120x() {
        return f137330s;
    }

    /* JADX INFO: renamed from: y */
    public static final UUID m104121y() {
        return f137308A;
    }

    /* JADX INFO: renamed from: z */
    public static final UUID m104122z() {
        return f137337z;
    }
}
