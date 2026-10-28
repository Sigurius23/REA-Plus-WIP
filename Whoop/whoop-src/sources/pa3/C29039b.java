package pa3;

import java.io.Serializable;
import p031b9.AbstractC2875y;
import p533ut.C35227a;
import p715kotlin.jvm.internal.AbstractC22676k;
import sa3.C32331e;

/* JADX INFO: renamed from: pa3.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C29039b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f117522a = 1;

    /* JADX INFO: renamed from: b */
    public String f117523b;

    /* JADX INFO: renamed from: c */
    public int f117524c;

    /* JADX INFO: renamed from: d */
    public Object f117525d;

    /* JADX INFO: renamed from: e */
    public Object f117526e;

    /* JADX INFO: renamed from: f */
    public Serializable f117527f;

    /* JADX INFO: renamed from: g */
    public Serializable f117528g;

    /* JADX INFO: renamed from: h */
    public Serializable f117529h;

    public /* synthetic */ C29039b() {
    }

    /* JADX INFO: renamed from: a */
    public C35227a m88283a() {
        String strM8299l = this.f117524c == 0 ? " registrationStatus" : "";
        if (((Long) this.f117527f) == null) {
            strM8299l = strM8299l.concat(" expiresInSecs");
        }
        if (((Long) this.f117528g) == null) {
            strM8299l = AbstractC2875y.m8299l(strM8299l, " tokenCreationEpochInSecs");
        }
        if (strM8299l.isEmpty()) {
            return new C35227a(this.f117523b, this.f117524c, (String) this.f117525d, (String) this.f117526e, ((Long) this.f117527f).longValue(), ((Long) this.f117528g).longValue(), (String) this.f117529h);
        }
        throw new IllegalStateException("Missing required properties:".concat(strM8299l));
    }

    public String toString() {
        switch (this.f117522a) {
            case 0:
                return ((EnumC29038a) this.f117525d) + " version=" + ((C32331e) this.f117526e);
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29039b(EnumC29038a kind, C32331e c32331e, String[] strArr, String[] strArr2, String[] strArr3, String str, int i13) {
        AbstractC22676k.m65750j(kind, "kind");
        this.f117525d = kind;
        this.f117526e = c32331e;
        this.f117527f = strArr;
        this.f117528g = strArr2;
        this.f117529h = strArr3;
        this.f117523b = str;
        this.f117524c = i13;
    }
}
