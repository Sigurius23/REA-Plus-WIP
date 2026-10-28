package p420qc;

import androidx.profileinstaller.ProfileVerifier;
import androidx.work.OverwritingInputMerger;
import e93.AbstractC12889b;
import ge3.AbstractC15751g;
import io.getstream.chat.android.client.ChatClient;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p218ic.C18354e;
import p218ic.C18358g;
import p218ic.C18389w;
import p218ic.EnumC18346a;
import p218ic.EnumC18363i0;
import p218ic.EnumC18371m0;
import p319m4.AbstractC25012a;
import p380os.C28301a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: qc.q */
/* JADX INFO: loaded from: classes.dex */
public final class C30207q {

    /* JADX INFO: renamed from: A */
    public static final C28301a f123632A;

    /* JADX INFO: renamed from: z */
    public static final String f123633z;

    /* JADX INFO: renamed from: a */
    public final String f123634a;

    /* JADX INFO: renamed from: b */
    public EnumC18371m0 f123635b;

    /* JADX INFO: renamed from: c */
    public final String f123636c;

    /* JADX INFO: renamed from: d */
    public final String f123637d;

    /* JADX INFO: renamed from: e */
    public C18358g f123638e;

    /* JADX INFO: renamed from: f */
    public final C18358g f123639f;

    /* JADX INFO: renamed from: g */
    public long f123640g;

    /* JADX INFO: renamed from: h */
    public long f123641h;

    /* JADX INFO: renamed from: i */
    public long f123642i;

    /* JADX INFO: renamed from: j */
    public C18354e f123643j;

    /* JADX INFO: renamed from: k */
    public final int f123644k;

    /* JADX INFO: renamed from: l */
    public EnumC18346a f123645l;

    /* JADX INFO: renamed from: m */
    public long f123646m;

    /* JADX INFO: renamed from: n */
    public long f123647n;

    /* JADX INFO: renamed from: o */
    public final long f123648o;

    /* JADX INFO: renamed from: p */
    public final long f123649p;

    /* JADX INFO: renamed from: q */
    public boolean f123650q;

    /* JADX INFO: renamed from: r */
    public EnumC18363i0 f123651r;

    /* JADX INFO: renamed from: s */
    public final int f123652s;

    /* JADX INFO: renamed from: t */
    public final int f123653t;

    /* JADX INFO: renamed from: u */
    public long f123654u;

    /* JADX INFO: renamed from: v */
    public int f123655v;

    /* JADX INFO: renamed from: w */
    public final int f123656w;

    /* JADX INFO: renamed from: x */
    public String f123657x;

    /* JADX INFO: renamed from: y */
    public final Boolean f123658y;

    static {
        String strM52887f = C18389w.m52887f("WorkSpec");
        AbstractC22676k.m65749i(strM52887f, "tagWithPrefix(...)");
        f123633z = strM52887f;
        f123632A = new C28301a(8);
    }

    public C30207q(String id4, EnumC18371m0 state, String workerClassName, String inputMergerClassName, C18358g input, C18358g output, long j7, long j13, long j14, C18354e constraints, int i13, EnumC18346a backoffPolicy, long j15, long j16, long j17, long j18, boolean z4, EnumC18363i0 outOfQuotaPolicy, int i14, int i15, long j19, int i16, int i17, String str, Boolean bool) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(workerClassName, "workerClassName");
        AbstractC22676k.m65750j(inputMergerClassName, "inputMergerClassName");
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(output, "output");
        AbstractC22676k.m65750j(constraints, "constraints");
        AbstractC22676k.m65750j(backoffPolicy, "backoffPolicy");
        AbstractC22676k.m65750j(outOfQuotaPolicy, "outOfQuotaPolicy");
        this.f123634a = id4;
        this.f123635b = state;
        this.f123636c = workerClassName;
        this.f123637d = inputMergerClassName;
        this.f123638e = input;
        this.f123639f = output;
        this.f123640g = j7;
        this.f123641h = j13;
        this.f123642i = j14;
        this.f123643j = constraints;
        this.f123644k = i13;
        this.f123645l = backoffPolicy;
        this.f123646m = j15;
        this.f123647n = j16;
        this.f123648o = j17;
        this.f123649p = j18;
        this.f123650q = z4;
        this.f123651r = outOfQuotaPolicy;
        this.f123652s = i14;
        this.f123653t = i15;
        this.f123654u = j19;
        this.f123655v = i16;
        this.f123656w = i17;
        this.f123657x = str;
        this.f123658y = bool;
    }

    /* JADX INFO: renamed from: b */
    public static C30207q m92424b(C30207q c30207q, String str, EnumC18371m0 enumC18371m0, String str2, C18358g c18358g, int i13, long j7, int i14, int i15, long j13, int i16, int i17) {
        String id4 = (i17 & 1) != 0 ? c30207q.f123634a : str;
        EnumC18371m0 state = (i17 & 2) != 0 ? c30207q.f123635b : enumC18371m0;
        String workerClassName = (i17 & 4) != 0 ? c30207q.f123636c : str2;
        String inputMergerClassName = c30207q.f123637d;
        C18358g input = (i17 & 16) != 0 ? c30207q.f123638e : c18358g;
        C18358g output = c30207q.f123639f;
        long j14 = c30207q.f123640g;
        long j15 = c30207q.f123641h;
        long j16 = c30207q.f123642i;
        C18354e constraints = c30207q.f123643j;
        int i18 = (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? c30207q.f123644k : i13;
        EnumC18346a backoffPolicy = c30207q.f123645l;
        long j17 = c30207q.f123646m;
        long j18 = (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? c30207q.f123647n : j7;
        long j19 = c30207q.f123648o;
        long j24 = c30207q.f123649p;
        boolean z4 = c30207q.f123650q;
        EnumC18363i0 outOfQuotaPolicy = c30207q.f123651r;
        int i19 = (i17 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c30207q.f123652s : i14;
        int i24 = (i17 & 524288) != 0 ? c30207q.f123653t : i15;
        long j25 = (i17 & 1048576) != 0 ? c30207q.f123654u : j13;
        int i25 = (i17 & 2097152) != 0 ? c30207q.f123655v : i16;
        int i26 = c30207q.f123656w;
        String str3 = c30207q.f123657x;
        Boolean bool = c30207q.f123658y;
        c30207q.getClass();
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(workerClassName, "workerClassName");
        AbstractC22676k.m65750j(inputMergerClassName, "inputMergerClassName");
        AbstractC22676k.m65750j(input, "input");
        AbstractC22676k.m65750j(output, "output");
        AbstractC22676k.m65750j(constraints, "constraints");
        AbstractC22676k.m65750j(backoffPolicy, "backoffPolicy");
        AbstractC22676k.m65750j(outOfQuotaPolicy, "outOfQuotaPolicy");
        return new C30207q(id4, state, workerClassName, inputMergerClassName, input, output, j14, j15, j16, constraints, i18, backoffPolicy, j17, j18, j19, j24, z4, outOfQuotaPolicy, i19, i24, j25, i25, i26, str3, bool);
    }

    /* JADX INFO: renamed from: a */
    public final long m92425a() {
        return AbstractC15751g.m44457j(this.f123635b == EnumC18371m0.f71515w && this.f123644k > 0, this.f123644k, this.f123645l, this.f123646m, this.f123647n, this.f123652s, m92426c(), this.f123640g, this.f123642i, this.f123641h, this.f123654u);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m92426c() {
        return this.f123641h != 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m92427d(long j7) {
        String str = f123633z;
        if (j7 > 18000000) {
            C18389w.m52886d().m52892g(str, "Backoff delay duration exceeds maximum value");
        }
        if (j7 < ChatClient.RESOLVE_DEPENDENCY_TIMEOUT) {
            C18389w.m52886d().m52892g(str, "Backoff delay duration less than minimum value");
        }
        this.f123646m = AbstractC12889b.m36286p(j7, ChatClient.RESOLVE_DEPENDENCY_TIMEOUT, 18000000L);
    }

    /* JADX INFO: renamed from: e */
    public final void m92428e(long j7) {
        if (j7 < 900000) {
            C18389w.m52886d().m52892g(f123633z, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j13 = j7 < 900000 ? 900000L : j7;
        if (j7 < 900000) {
            j7 = 900000;
        }
        m92429f(j13, j7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30207q)) {
            return false;
        }
        C30207q c30207q = (C30207q) obj;
        return AbstractC22676k.m65745e(this.f123634a, c30207q.f123634a) && this.f123635b == c30207q.f123635b && AbstractC22676k.m65745e(this.f123636c, c30207q.f123636c) && AbstractC22676k.m65745e(this.f123637d, c30207q.f123637d) && AbstractC22676k.m65745e(this.f123638e, c30207q.f123638e) && AbstractC22676k.m65745e(this.f123639f, c30207q.f123639f) && this.f123640g == c30207q.f123640g && this.f123641h == c30207q.f123641h && this.f123642i == c30207q.f123642i && AbstractC22676k.m65745e(this.f123643j, c30207q.f123643j) && this.f123644k == c30207q.f123644k && this.f123645l == c30207q.f123645l && this.f123646m == c30207q.f123646m && this.f123647n == c30207q.f123647n && this.f123648o == c30207q.f123648o && this.f123649p == c30207q.f123649p && this.f123650q == c30207q.f123650q && this.f123651r == c30207q.f123651r && this.f123652s == c30207q.f123652s && this.f123653t == c30207q.f123653t && this.f123654u == c30207q.f123654u && this.f123655v == c30207q.f123655v && this.f123656w == c30207q.f123656w && AbstractC22676k.m65745e(this.f123657x, c30207q.f123657x) && AbstractC22676k.m65745e(this.f123658y, c30207q.f123658y);
    }

    /* JADX INFO: renamed from: f */
    public final void m92429f(long j7, long j13) {
        String str = f123633z;
        if (j7 < 900000) {
            C18389w.m52886d().m52892g(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f123641h = j7 >= 900000 ? j7 : 900000L;
        if (j13 < 300000) {
            C18389w.m52886d().m52892g(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j13 > this.f123641h) {
            C18389w.m52886d().m52892g(str, "Flex duration greater than interval duration; Changed to " + j7);
        }
        this.f123642i = AbstractC12889b.m36286p(j13, 300000L, this.f123641h);
    }

    public final int hashCode() {
        int iM30448b = AbstractC11266d.m30448b(this.f123656w, AbstractC11266d.m30448b(this.f123655v, AbstractC11266d.m30451e(AbstractC11266d.m30448b(this.f123653t, AbstractC11266d.m30448b(this.f123652s, (this.f123651r.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.f123645l.hashCode() + AbstractC11266d.m30448b(this.f123644k, (this.f123643j.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e((this.f123639f.hashCode() + ((this.f123638e.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.f123635b.hashCode() + (this.f123634a.hashCode() * 31)) * 31, 31, this.f123636c), 31, this.f123637d)) * 31)) * 31, this.f123640g, 31), this.f123641h, 31), this.f123642i, 31)) * 31, 31)) * 31, this.f123646m, 31), this.f123647n, 31), this.f123648o, 31), this.f123649p, 31), 31, this.f123650q)) * 31, 31), 31), this.f123654u, 31), 31), 31);
        String str = this.f123657x;
        int iHashCode = (iM30448b + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f123658y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC25012a.m73377j(new StringBuilder("{WorkSpec: "), this.f123634a, '}');
    }

    public /* synthetic */ C30207q(String str, EnumC18371m0 enumC18371m0, String str2, String str3, C18358g c18358g, C18358g c18358g2, long j7, long j13, long j14, C18354e c18354e, int i13, EnumC18346a enumC18346a, long j15, long j16, long j17, long j18, boolean z4, EnumC18363i0 enumC18363i0, int i14, long j19, int i15, int i16, String str4, Boolean bool, int i17) {
        this(str, (i17 & 2) != 0 ? EnumC18371m0.f71515w : enumC18371m0, str2, (i17 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i17 & 16) != 0 ? C18358g.f71479b : c18358g, (i17 & 32) != 0 ? C18358g.f71479b : c18358g2, (i17 & 64) != 0 ? 0L : j7, (i17 & 128) != 0 ? 0L : j13, (i17 & 256) != 0 ? 0L : j14, (i17 & 512) != 0 ? C18354e.f71464j : c18354e, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? 0 : i13, (i17 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? EnumC18346a.f71443w : enumC18346a, (i17 & 4096) != 0 ? 30000L : j15, (i17 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? -1L : j16, (i17 & DfuBaseService.ERROR_CONNECTION_MASK) == 0 ? j17 : 0L, (32768 & i17) != 0 ? -1L : j18, (65536 & i17) != 0 ? false : z4, (131072 & i17) != 0 ? EnumC18363i0.f71494w : enumC18363i0, (262144 & i17) != 0 ? 0 : i14, 0, (1048576 & i17) != 0 ? Long.MAX_VALUE : j19, (2097152 & i17) != 0 ? 0 : i15, (4194304 & i17) != 0 ? -256 : i16, (8388608 & i17) != 0 ? null : str4, (i17 & 16777216) != 0 ? Boolean.FALSE : bool);
    }
}
