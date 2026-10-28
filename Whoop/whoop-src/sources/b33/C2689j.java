package b33;

import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32309k;

/* JADX INFO: renamed from: b33.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C2689j extends AbstractC2687h {

    /* JADX INFO: renamed from: a */
    public final String f10576a;

    /* JADX INFO: renamed from: b */
    public final String f10577b;

    /* JADX INFO: renamed from: c */
    public final String f10578c;

    /* JADX INFO: renamed from: d */
    public final EnumC2683d f10579d;

    /* JADX INFO: renamed from: e */
    public final long f10580e;

    /* JADX INFO: renamed from: f */
    public final String f10581f;

    /* JADX INFO: renamed from: g */
    public final AbstractC32309k f10582g;

    /* JADX INFO: renamed from: h */
    public final String f10583h;

    /* JADX INFO: renamed from: i */
    public final String f10584i;

    /* JADX INFO: renamed from: j */
    public final EnumC2688i f10585j;

    /* JADX INFO: renamed from: k */
    public final boolean f10586k;

    public C2689j(String callId, String callType, String str, EnumC2683d enumC2683d, long j7, String str2, AbstractC32309k abstractC32309k, String str3, String str4, EnumC2688i enumC2688i, boolean z4, int i13) {
        str3 = (i13 & 128) != 0 ? null : str3;
        str4 = (i13 & 256) != 0 ? null : str4;
        enumC2688i = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : enumC2688i;
        z4 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4;
        AbstractC22676k.m65750j(callId, "callId");
        AbstractC22676k.m65750j(callType, "callType");
        this.f10576a = callId;
        this.f10577b = callType;
        this.f10578c = str;
        this.f10579d = enumC2683d;
        this.f10580e = j7;
        this.f10581f = str2;
        this.f10582g = abstractC32309k;
        this.f10583h = str3;
        this.f10584i = str4;
        this.f10585j = enumC2688i;
        this.f10586k = z4;
    }

    @Override // b33.AbstractC2687h
    /* JADX INFO: renamed from: a */
    public final long mo7577a() {
        return this.f10580e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2689j)) {
            return false;
        }
        C2689j c2689j = (C2689j) obj;
        return AbstractC22676k.m65745e(this.f10576a, c2689j.f10576a) && AbstractC22676k.m65745e(this.f10577b, c2689j.f10577b) && this.f10578c.equals(c2689j.f10578c) && this.f10579d == c2689j.f10579d && this.f10580e == c2689j.f10580e && this.f10581f.equals(c2689j.f10581f) && this.f10582g.equals(c2689j.f10582g) && AbstractC22676k.m65745e(this.f10583h, c2689j.f10583h) && AbstractC22676k.m65745e(this.f10584i, c2689j.f10584i) && this.f10585j == c2689j.f10585j && this.f10586k == c2689j.f10586k;
    }

    public final int hashCode() {
        int iHashCode = (this.f10582g.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30451e((this.f10579d.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f10576a.hashCode() * 31, 31, this.f10577b), 31, this.f10578c)) * 31, this.f10580e, 31), 31, this.f10581f)) * 31;
        String str = this.f10583h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10584i;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        EnumC2688i enumC2688i = this.f10585j;
        return Boolean.hashCode(this.f10586k) + ((iHashCode3 + (enumC2688i != null ? enumC2688i.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PostCallFlightSession(callId=", this.f10576a, ", callType=", this.f10577b, ", stageId=");
        sbM32001t.append(this.f10578c);
        sbM32001t.append(", stage=");
        sbM32001t.append(this.f10579d);
        sbM32001t.append(", startedAtMs=");
        sbM32001t.append(this.f10580e);
        sbM32001t.append(", joinStageAttemptIdSnapshot=");
        sbM32001t.append(this.f10581f);
        sbM32001t.append(", joinReason=");
        sbM32001t.append(this.f10582g);
        sbM32001t.append(", sfuId=");
        sbM32001t.append(this.f10583h);
        sbM32001t.append(", callSessionId=");
        sbM32001t.append(this.f10584i);
        sbM32001t.append(", userSessionId=null, peerConnectionRole=");
        sbM32001t.append(this.f10585j);
        sbM32001t.append(", wasPreviouslyConnected=");
        sbM32001t.append(this.f10586k);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
