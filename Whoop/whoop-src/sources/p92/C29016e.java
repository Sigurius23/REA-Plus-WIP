package p92;

import com.whoop.data.repositories.RestingHeartRate;
import com.whoop.domain.model.StrainRecoveryMapping;
import lm2.InterfaceC24516b;

/* JADX INFO: renamed from: p92.e */
/* JADX INFO: loaded from: classes10.dex */
public class C29016e {

    /* JADX INFO: renamed from: a */
    private final long f117402a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC24516b f117403b;

    /* JADX INFO: renamed from: c */
    private final double f117404c;

    /* JADX INFO: renamed from: d */
    private final StrainRecoveryMapping f117405d;

    /* JADX INFO: renamed from: e */
    private boolean f117406e;

    /* JADX INFO: renamed from: f */
    private final RestingHeartRate f117407f;

    public C29016e(long j7, InterfaceC24516b interfaceC24516b, StrainRecoveryMapping strainRecoveryMapping, double d3, boolean z4, RestingHeartRate restingHeartRate) {
        this.f117402a = j7;
        this.f117403b = interfaceC24516b;
        this.f117404c = d3;
        this.f117405d = strainRecoveryMapping;
        this.f117406e = z4;
        this.f117407f = restingHeartRate;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC24516b m88168a() {
        return this.f117403b;
    }

    /* JADX INFO: renamed from: b */
    public RestingHeartRate m88169b() {
        return this.f117407f;
    }

    /* JADX INFO: renamed from: c */
    public long m88170c() {
        return this.f117402a;
    }

    /* JADX INFO: renamed from: d */
    public double m88171d() {
        return this.f117404c;
    }

    /* JADX INFO: renamed from: e */
    public StrainRecoveryMapping m88172e() {
        return this.f117405d;
    }

    /* JADX INFO: renamed from: f */
    public boolean m88173f() {
        return this.f117406e;
    }

    /* JADX INFO: renamed from: g */
    public void m88174g(boolean z4) {
        this.f117406e = z4;
    }
}
