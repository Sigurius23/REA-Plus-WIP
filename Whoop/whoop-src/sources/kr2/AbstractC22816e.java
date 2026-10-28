package kr2;

import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: kr2.e */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\bf\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\u0002\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\u0010\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u0017\u0010\u0016\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\"\u0017\u0010\u0019\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u0017\u0010\u001c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0004\"\u0017\u0010\u001f\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u0004\"\u0017\u0010\"\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u0017\u0010%\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0004\"\u0017\u0010(\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b&\u0010\u0002\u001a\u0004\b'\u0010\u0004\"\u0017\u0010+\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b)\u0010\u0002\u001a\u0004\b*\u0010\u0004\"\u0017\u0010.\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b,\u0010\u0002\u001a\u0004\b-\u0010\u0004\"\u0017\u00100\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b/\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u0017\u00103\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b1\u0010\u0002\u001a\u0004\b2\u0010\u0004\"\u0017\u00106\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b4\u0010\u0002\u001a\u0004\b5\u0010\u0004\"\u0017\u00107\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b5\u0010\u0002\u001a\u0004\b\u0014\u0010\u0004\"\u0017\u00109\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b8\u0010\u0002\u001a\u0004\b\u000b\u0010\u0004\"\u0017\u0010;\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b:\u0010\u0002\u001a\u0004\b/\u0010\u0004\"\u0017\u0010<\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b2\u0010\u0002\u001a\u0004\b&\u0010\u0004\"\u0017\u0010>\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b=\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u0017\u0010@\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b?\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u0017\u0010A\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b \u0010\u0004\"\u0017\u0010B\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b-\u0010\u0002\u001a\u0004\b?\u0010\u0004\"\u0017\u0010C\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b=\u0010\u0004\"\u0017\u0010D\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b:\u0010\u0004\"\u0017\u0010E\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b8\u0010\u0004\"\u0017\u0010F\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u001a\u0010\u0004\"\u0017\u0010G\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0017\u0010\u0004\"\u0017\u0010H\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b\u0011\u0010\u0004\"\u0017\u0010I\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b!\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u0017\u0010J\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b4\u0010\u0004\"\u0017\u0010K\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b1\u0010\u0004\"\u0017\u0010L\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0002\u001a\u0004\b,\u0010\u0004\"\u0017\u0010M\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b)\u0010\u0004\"\u0017\u0010O\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bN\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010Q\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bP\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010S\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bR\u0010\u0002\u001a\u0004\bN\u0010\u0004\"\u0017\u0010U\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bT\u0010\u0002\u001a\u0004\bR\u0010\u0004\"\u0017\u0010W\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bV\u0010\u0002\u001a\u0004\bV\u0010\u0004\"\u0017\u0010Y\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bX\u0010\u0002\u001a\u0004\bX\u0010\u0004\"\u0017\u0010[\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\bZ\u0010\u0002\u001a\u0004\bP\u0010\u0004\"\u0017\u0010]\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\\\u0010\u0002\u001a\u0004\bT\u0010\u0004\"\u0017\u0010_\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b^\u0010\u0002\u001a\u0004\bZ\u0010\u0004\"\u0017\u0010b\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b`\u0010\u0002\u001a\u0004\ba\u0010\u0004\"\u0017\u0010c\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\ba\u0010\u0002\u001a\u0004\b^\u0010\u0004\"\u0017\u0010d\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b`\u0010\u0004\"\u0017\u0010e\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b'\u0010\u0002\u001a\u0004\b\\\u0010\u0004¨\u0006f"}, m65681d2 = {"Li2/x;", "a", "J", "I", "()J", "SLEEP", "b", "E", "RECOVERY", "c", "STRAIN", "d", "K", "STREAK_STATS", "e", "C", "PURPLE_A", "f", "D", "PURPLE_B", "g", "y", "GREEN_BRIGHT", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "B", "ORANGE_START", "i", "A", "ORANGE_END", "j", "H", "RED_START", "k", "G", "RED_MID", "l", "F", "RED_END", "m", "X", "TEAL_START", "n", "W", "TEAL_END", "o", "z", "GREEN_PURPLE_START", "p", "CARD_ONE", "q", "v", "CARD_TWO", "r", "s", "CARD_THREE", "CARD_FOUR", "t", "CARD_FIVE", "u", "CARD_SIX", "CARD_SEVEN", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "CARD_EIGHT", "x", "CARD_ONE_TEXT_START", "CARD_ONE_TEXT_END", "CARD_TWO_TEXT_START", "CARD_TWO_TEXT_END", "CARD_THREE_TEXT_START", "CARD_THREE_TEXT_END", "CARD_FOUR_TEXT_START", "CARD_FOUR_TEXT_END", "CARD_FIVE_TEXT_START", "CARD_FIVE_TEXT_END", "CARD_SIX_TEXT_START", "CARD_SIX_TEXT_END", "CARD_SEVEN_TEXT_START", "CARD_SEVEN_TEXT_END", "L", "CARD_EIGHT_TEXT_START", "M", "CARD_EIGHT_TEXT_END", "N", "STREAK_STATS_1", "O", "STREAK_STATS_14", "P", "STREAK_STATS_365", "Q", "STREAK_STATS_730", "R", "STREAK_STATS_1000", "S", "STREAK_STATS_2000", "T", "STREAK_STATS_BRONZE", "U", "V", "STREAK_STATS_SILVER", "STREAK_STATS_GOLD", "STREAK_STATS_PLATINUM", "STREAK_STATS_DIAMOND", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC22816e {

    /* JADX INFO: renamed from: a */
    private static final long f89892a = AbstractC17918w0.m51517e(4286292411L);

    /* JADX INFO: renamed from: b */
    private static final long f89893b = AbstractC17918w0.m51517e(4284985062L);

    /* JADX INFO: renamed from: c */
    private static final long f89894c = AbstractC17918w0.m51517e(4278227943L);

    /* JADX INFO: renamed from: d */
    private static final long f89895d = AbstractC17918w0.m51517e(4294463290L);

    /* JADX INFO: renamed from: e */
    private static final long f89896e = AbstractC17918w0.m51517e(4283260870L);

    /* JADX INFO: renamed from: f */
    private static final long f89897f = AbstractC17918w0.m51517e(4288439295L);

    /* JADX INFO: renamed from: g */
    private static final long f89898g = AbstractC17918w0.m51517e(4279888902L);

    /* JADX INFO: renamed from: h */
    private static final long f89899h = AbstractC17918w0.m51517e(4292973856L);

    /* JADX INFO: renamed from: i */
    private static final long f89900i = AbstractC17918w0.m51517e(4292330857L);

    /* JADX INFO: renamed from: j */
    private static final long f89901j = AbstractC17918w0.m51517e(4292290304L);

    /* JADX INFO: renamed from: k */
    private static final long f89902k = AbstractC17918w0.m51517e(4294901798L);

    /* JADX INFO: renamed from: l */
    private static final long f89903l = AbstractC17918w0.m51517e(4294943664L);

    /* JADX INFO: renamed from: m */
    private static final long f89904m = AbstractC17918w0.m51517e(4279292058L);

    /* JADX INFO: renamed from: n */
    private static final long f89905n = AbstractC17918w0.m51517e(4284011185L);

    /* JADX INFO: renamed from: o */
    private static final long f89906o = AbstractC17918w0.m51517e(4278251935L);

    /* JADX INFO: renamed from: p */
    private static final long f89907p = AbstractC17918w0.m51517e(4280604927L);

    /* JADX INFO: renamed from: q */
    private static final long f89908q = AbstractC17918w0.m51517e(4285146111L);

    /* JADX INFO: renamed from: r */
    private static final long f89909r = AbstractC17918w0.m51517e(4284386303L);

    /* JADX INFO: renamed from: s */
    private static final long f89910s = AbstractC17918w0.m51517e(4282187655L);

    /* JADX INFO: renamed from: t */
    private static final long f89911t = C17919x.m51541c(1.0f, AbstractC17918w0.m51517e(4294967106L));

    /* JADX INFO: renamed from: u */
    private static final long f89912u = AbstractC17918w0.m51517e(4289920910L);

    /* JADX INFO: renamed from: v */
    private static final long f89913v = AbstractC17918w0.m51517e(4279475711L);

    /* JADX INFO: renamed from: w */
    private static final long f89914w = AbstractC17918w0.m51517e(4292969983L);

    /* JADX INFO: renamed from: x */
    private static final long f89915x = AbstractC17918w0.m51517e(4283677907L);

    /* JADX INFO: renamed from: y */
    private static final long f89916y = AbstractC17918w0.m51517e(4279592056L);

    /* JADX INFO: renamed from: z */
    private static final long f89917z = AbstractC17918w0.m51517e(4287526626L);

    /* JADX INFO: renamed from: A */
    private static final long f89868A = AbstractC17918w0.m51517e(4285681350L);

    /* JADX INFO: renamed from: B */
    private static final long f89869B = AbstractC17918w0.m51517e(4284386303L);

    /* JADX INFO: renamed from: C */
    private static final long f89870C = AbstractC17918w0.m51517e(4282737842L);

    /* JADX INFO: renamed from: D */
    private static final long f89871D = AbstractC17918w0.m51517e(4282187655L);

    /* JADX INFO: renamed from: E */
    private static final long f89872E = AbstractC17918w0.m51517e(4281509470L);

    /* JADX INFO: renamed from: F */
    private static final long f89873F = AbstractC17918w0.m51517e(4294967106L);

    /* JADX INFO: renamed from: G */
    private static final long f89874G = AbstractC17918w0.m51517e(4288386600L);

    /* JADX INFO: renamed from: H */
    private static final long f89875H = AbstractC17918w0.m51517e(4289920910L);

    /* JADX INFO: renamed from: I */
    private static final long f89876I = AbstractC17918w0.m51517e(4284323905L);

    /* JADX INFO: renamed from: J */
    private static final long f89877J = AbstractC17918w0.m51517e(4279475711L);

    /* JADX INFO: renamed from: K */
    private static final long f89878K = AbstractC17918w0.m51517e(4278215336L);

    /* JADX INFO: renamed from: L */
    private static final long f89879L = AbstractC17918w0.m51517e(4292969983L);

    /* JADX INFO: renamed from: M */
    private static final long f89880M = AbstractC17918w0.m51517e(4288957121L);

    /* JADX INFO: renamed from: N */
    private static final long f89881N = AbstractC17918w0.m51517e(4294167649L);

    /* JADX INFO: renamed from: O */
    private static final long f89882O = AbstractC17918w0.m51517e(4293218852L);

    /* JADX INFO: renamed from: P */
    private static final long f89883P = AbstractC17918w0.m51517e(4291371854L);

    /* JADX INFO: renamed from: Q */
    private static final long f89884Q = AbstractC17918w0.m51517e(4284101822L);

    /* JADX INFO: renamed from: R */
    private static final long f89885R = AbstractC17918w0.m51517e(4286560748L);

    /* JADX INFO: renamed from: S */
    private static final long f89886S = AbstractC17918w0.m51517e(4289758530L);

    /* JADX INFO: renamed from: T */
    private static final long f89887T = AbstractC17918w0.m51517e(4290741082L);

    /* JADX INFO: renamed from: U */
    private static final long f89888U = AbstractC17918w0.m51517e(4287928992L);

    /* JADX INFO: renamed from: V */
    private static final long f89889V = AbstractC17918w0.m51517e(4290611742L);

    /* JADX INFO: renamed from: W */
    private static final long f89890W = AbstractC17918w0.m51517e(4292067251L);

    /* JADX INFO: renamed from: X */
    private static final long f89891X = AbstractC17918w0.m51517e(4279941097L);

    /* JADX INFO: renamed from: A */
    public static final long m66133A() {
        return f89900i;
    }

    /* JADX INFO: renamed from: B */
    public static final long m66134B() {
        return f89899h;
    }

    /* JADX INFO: renamed from: C */
    public static final long m66135C() {
        return f89896e;
    }

    /* JADX INFO: renamed from: D */
    public static final long m66136D() {
        return f89897f;
    }

    /* JADX INFO: renamed from: E */
    public static final long m66137E() {
        return f89893b;
    }

    /* JADX INFO: renamed from: F */
    public static final long m66138F() {
        return f89903l;
    }

    /* JADX INFO: renamed from: G */
    public static final long m66139G() {
        return f89902k;
    }

    /* JADX INFO: renamed from: H */
    public static final long m66140H() {
        return f89901j;
    }

    /* JADX INFO: renamed from: I */
    public static final long m66141I() {
        return f89892a;
    }

    /* JADX INFO: renamed from: J */
    public static final long m66142J() {
        return f89894c;
    }

    /* JADX INFO: renamed from: K */
    public static final long m66143K() {
        return f89895d;
    }

    /* JADX INFO: renamed from: L */
    public static final long m66144L() {
        return f89881N;
    }

    /* JADX INFO: renamed from: M */
    public static final long m66145M() {
        return f89885R;
    }

    /* JADX INFO: renamed from: N */
    public static final long m66146N() {
        return f89882O;
    }

    /* JADX INFO: renamed from: O */
    public static final long m66147O() {
        return f89886S;
    }

    /* JADX INFO: renamed from: P */
    public static final long m66148P() {
        return f89883P;
    }

    /* JADX INFO: renamed from: Q */
    public static final long m66149Q() {
        return f89884Q;
    }

    /* JADX INFO: renamed from: R */
    public static final long m66150R() {
        return f89887T;
    }

    /* JADX INFO: renamed from: S */
    public static final long m66151S() {
        return f89891X;
    }

    /* JADX INFO: renamed from: T */
    public static final long m66152T() {
        return f89889V;
    }

    /* JADX INFO: renamed from: U */
    public static final long m66153U() {
        return f89890W;
    }

    /* JADX INFO: renamed from: V */
    public static final long m66154V() {
        return f89888U;
    }

    /* JADX INFO: renamed from: W */
    public static final long m66155W() {
        return f89905n;
    }

    /* JADX INFO: renamed from: X */
    public static final long m66156X() {
        return f89904m;
    }

    /* JADX INFO: renamed from: a */
    public static final long m66157a() {
        return f89914w;
    }

    /* JADX INFO: renamed from: b */
    public static final long m66158b() {
        return f89880M;
    }

    /* JADX INFO: renamed from: c */
    public static final long m66159c() {
        return f89879L;
    }

    /* JADX INFO: renamed from: d */
    public static final long m66160d() {
        return f89911t;
    }

    /* JADX INFO: renamed from: e */
    public static final long m66161e() {
        return f89874G;
    }

    /* JADX INFO: renamed from: f */
    public static final long m66162f() {
        return f89873F;
    }

    /* JADX INFO: renamed from: g */
    public static final long m66163g() {
        return f89910s;
    }

    /* JADX INFO: renamed from: h */
    public static final long m66164h() {
        return f89872E;
    }

    /* JADX INFO: renamed from: i */
    public static final long m66165i() {
        return f89871D;
    }

    /* JADX INFO: renamed from: j */
    public static final long m66166j() {
        return f89907p;
    }

    /* JADX INFO: renamed from: k */
    public static final long m66167k() {
        return f89916y;
    }

    /* JADX INFO: renamed from: l */
    public static final long m66168l() {
        return f89915x;
    }

    /* JADX INFO: renamed from: m */
    public static final long m66169m() {
        return f89913v;
    }

    /* JADX INFO: renamed from: n */
    public static final long m66170n() {
        return f89878K;
    }

    /* JADX INFO: renamed from: o */
    public static final long m66171o() {
        return f89877J;
    }

    /* JADX INFO: renamed from: p */
    public static final long m66172p() {
        return f89912u;
    }

    /* JADX INFO: renamed from: q */
    public static final long m66173q() {
        return f89876I;
    }

    /* JADX INFO: renamed from: r */
    public static final long m66174r() {
        return f89875H;
    }

    /* JADX INFO: renamed from: s */
    public static final long m66175s() {
        return f89909r;
    }

    /* JADX INFO: renamed from: t */
    public static final long m66176t() {
        return f89870C;
    }

    /* JADX INFO: renamed from: u */
    public static final long m66177u() {
        return f89869B;
    }

    /* JADX INFO: renamed from: v */
    public static final long m66178v() {
        return f89908q;
    }

    /* JADX INFO: renamed from: w */
    public static final long m66179w() {
        return f89868A;
    }

    /* JADX INFO: renamed from: x */
    public static final long m66180x() {
        return f89917z;
    }

    /* JADX INFO: renamed from: y */
    public static final long m66181y() {
        return f89898g;
    }

    /* JADX INFO: renamed from: z */
    public static final long m66182z() {
        return f89906o;
    }
}
