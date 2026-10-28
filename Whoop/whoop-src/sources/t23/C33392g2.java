package t23;

import androidx.room.AbstractC1772c1;
import c43.AbstractC4192h;
import c43.C4193i;
import c43.C4194j;
import c43.C4195k;
import c43.C4196l;
import c43.EnumC4208x;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import ec3.C13105z1;
import hc3.C17171d;
import j43.C21317a;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jg3.C21676c;
import jg3.C21682i;
import jg3.C21689p;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25271y;
import p000.AbstractC11266d;
import p320m5.C25067k;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29934u0;
import q83.AbstractC30060g;
import stream.video.sfu.models.ConnectionQuality;
import stream.video.sfu.models.Participant;
import stream.video.sfu.models.ParticipantSource;
import stream.video.sfu.models.TrackType;
import wb3.AbstractC37056f;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: t23.g2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33392g2 {

    /* JADX INFO: renamed from: A */
    public final C13045h2 f139409A;

    /* JADX INFO: renamed from: B */
    public final C13045h2 f139410B;

    /* JADX INFO: renamed from: C */
    public final C13045h2 f139411C;

    /* JADX INFO: renamed from: D */
    public final C13045h2 f139412D;

    /* JADX INFO: renamed from: E */
    public final C13045h2 f139413E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f139414F;

    /* JADX INFO: renamed from: G */
    public final C13045h2 f139415G;

    /* JADX INFO: renamed from: H */
    public final C13045h2 f139416H;

    /* JADX INFO: renamed from: I */
    public final C13045h2 f139417I;

    /* JADX INFO: renamed from: J */
    public final C13045h2 f139418J;

    /* JADX INFO: renamed from: K */
    public final C13081r1 f139419K;

    /* JADX INFO: renamed from: L */
    public final C13045h2 f139420L;

    /* JADX INFO: renamed from: M */
    public final C13045h2 f139421M;

    /* JADX INFO: renamed from: a */
    public String f139422a;

    /* JADX INFO: renamed from: b */
    public final C17171d f139423b;

    /* JADX INFO: renamed from: c */
    public final C29934u0 f139424c;

    /* JADX INFO: renamed from: d */
    public final String f139425d;

    /* JADX INFO: renamed from: e */
    public final ParticipantSource f139426e;

    /* JADX INFO: renamed from: f */
    public String f139427f;

    /* JADX INFO: renamed from: g */
    public final C23470p f139428g;

    /* JADX INFO: renamed from: h */
    public final C23470p f139429h;

    /* JADX INFO: renamed from: i */
    public final C13045h2 f139430i;

    /* JADX INFO: renamed from: j */
    public final C13045h2 f139431j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f139432k;

    /* JADX INFO: renamed from: l */
    public final C13045h2 f139433l;

    /* JADX INFO: renamed from: m */
    public final C13045h2 f139434m;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f139435n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f139436o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f139437p;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f139438q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f139439r;

    /* JADX INFO: renamed from: s */
    public final C13045h2 f139440s;

    /* JADX INFO: renamed from: t */
    public final C13045h2 f139441t;

    /* JADX INFO: renamed from: u */
    public final C13045h2 f139442u;

    /* JADX INFO: renamed from: v */
    public final C13045h2 f139443v;

    /* JADX INFO: renamed from: w */
    public final C13045h2 f139444w;

    /* JADX INFO: renamed from: x */
    public final C13045h2 f139445x;

    /* JADX INFO: renamed from: y */
    public final C13045h2 f139446y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f139447z;

    public C33392g2(String sessionId, C17171d c17171d, C29934u0 callActions, String initialUserId, ParticipantSource source) {
        AbstractC22676k.m65750j(sessionId, "sessionId");
        AbstractC22676k.m65750j(callActions, "callActions");
        AbstractC22676k.m65750j(initialUserId, "initialUserId");
        AbstractC22676k.m65750j(source, "source");
        this.f139422a = sessionId;
        this.f139423b = c17171d;
        this.f139424c = callActions;
        this.f139425d = initialUserId;
        this.f139426e = source;
        this.f139427f = "";
        this.f139428g = AbstractC1772c1.m5382S(this, "ParticipantState");
        this.f139429h = AbstractC30060g.m92088H(new C25067k(this, 8));
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f139430i = c13045h2M36593c;
        this.f139431j = AbstractC13091v.m36593c(EnumC4208x.f17070y);
        Boolean bool = Boolean.FALSE;
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(bool);
        this.f139432k = c13045h2M36593c2;
        this.f139433l = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(bool);
        this.f139434m = c13045h2M36593c3;
        this.f139435n = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(bool);
        this.f139436o = c13045h2M36593c4;
        this.f139437p = c13045h2M36593c4;
        C13045h2 c13045h2M36593c5 = AbstractC13091v.m36593c(null);
        this.f139438q = c13045h2M36593c5;
        C13045h2 c13045h2M36593c6 = AbstractC13091v.m36593c(bool);
        this.f139439r = c13045h2M36593c6;
        this.f139440s = c13045h2M36593c6;
        C13045h2 c13045h2M36593c7 = AbstractC13091v.m36593c(null);
        this.f139441t = c13045h2M36593c7;
        C13045h2 c13045h2M36593c8 = AbstractC13091v.m36593c("");
        this.f139442u = c13045h2M36593c8;
        this.f139443v = c13045h2M36593c8;
        this.f139444w = AbstractC13091v.m36593c("");
        C13045h2 c13045h2M36593c9 = AbstractC13091v.m36593c(initialUserId);
        this.f139445x = c13045h2M36593c9;
        this.f139446y = c13045h2M36593c9;
        AbstractC37926s0.m121484x(c13045h2M36593c8, new C21317a(this, 11));
        this.f139447z = AbstractC13091v.m36593c(null);
        Float fValueOf = Float.valueOf(0.0f);
        C13045h2 c13045h2M36593c10 = AbstractC13091v.m36593c(fValueOf);
        this.f139409A = c13045h2M36593c10;
        this.f139410B = c13045h2M36593c10;
        this.f139411C = AbstractC13091v.m36593c(AbstractC37056f.m118959K(fValueOf, fValueOf, fValueOf, fValueOf, fValueOf));
        this.f139412D = AbstractC13091v.m36593c(new C4196l());
        C13045h2 c13045h2M36593c11 = AbstractC13091v.m36593c(bool);
        this.f139413E = c13045h2M36593c11;
        this.f139414F = c13045h2M36593c11;
        C13045h2 c13045h2M36593c12 = AbstractC13091v.m36593c(bool);
        this.f139415G = c13045h2M36593c12;
        this.f139416H = c13045h2M36593c12;
        AbstractC13091v.m36593c(null);
        C25271y c25271y = C25271y.f99162w;
        C13045h2 c13045h2M36593c13 = AbstractC13091v.m36593c(c25271y);
        this.f139417I = c13045h2M36593c13;
        this.f139418J = c13045h2M36593c13;
        this.f139419K = AbstractC13091v.m36587M(AbstractC13091v.m36606p(c13045h2M36593c, c13045h2M36593c2, c13045h2M36593c3, new C33387f2(this, null)), c17171d, C13105z1.f45289b, null);
        AbstractC37926s0.m121475m(c13045h2M36593c5, c13045h2M36593c4, new C33382e2(this, 0));
        AbstractC37926s0.m121475m(c13045h2M36593c7, c13045h2M36593c6, new C33382e2(this, 1));
        C13045h2 c13045h2M36593c14 = AbstractC13091v.m36593c(c25271y);
        this.f139420L = c13045h2M36593c14;
        this.f139421M = c13045h2M36593c14;
    }

    /* JADX INFO: renamed from: a */
    public final void m105850a(float f13) {
        C13045h2 c13045h2 = this.f139411C;
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1((Collection) c13045h2.getValue());
        arrayListM74097F1.remove(0);
        arrayListM74097F1.add(Float.valueOf(f13));
        if (((Number) arrayListM74097F1.get(0)).floatValue() == 0.0f && ((Number) arrayListM74097F1.get(2)).floatValue() == 0.0f) {
            arrayListM74097F1.set(0, Float.valueOf(f13));
            arrayListM74097F1.set(2, Float.valueOf(f13));
        }
        List listM74093D1 = AbstractC25265s.m74093D1(arrayListM74097F1);
        c13045h2.getClass();
        c13045h2.m36571k(null, listM74093D1);
        Float fValueOf = Float.valueOf(f13);
        C13045h2 c13045h3 = this.f139409A;
        c13045h3.getClass();
        c13045h3.m36571k(null, fValueOf);
    }

    /* JADX INFO: renamed from: b */
    public final void m105851b(Participant participant) {
        Object c4196l;
        AbstractC22676k.m65750j(participant, "participant");
        this.f139422a = participant.getSession_id();
        Instant joined_at = participant.getJoined_at();
        C21682i c21682iM61053q0 = C21682i.m61053q0(C21676c.m60990o0(0, joined_at != null ? joined_at.toEpochMilli() : C21682i.m61052p0().toEpochSecond()), C21689p.f83278F);
        C13045h2 c13045h2 = this.f139447z;
        c13045h2.getClass();
        c13045h2.m36571k(null, c21682iM61053q0);
        this.f139427f = participant.getTrack_lookup_prefix();
        ConnectionQuality connectionQuality = participant.getConnection_quality();
        AbstractC22676k.m65750j(connectionQuality, "connectionQuality");
        int i13 = AbstractC4192h.f17048a[connectionQuality.ordinal()];
        if (i13 == 1) {
            c4196l = new C4196l();
        } else if (i13 == 2) {
            c4196l = new C4195k();
        } else if (i13 == 3) {
            c4196l = new C4194j();
        } else {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            c4196l = new C4193i();
        }
        C13045h2 c13045h3 = this.f139412D;
        c13045h3.getClass();
        c13045h3.m36571k(null, c4196l);
        Boolean boolValueOf = Boolean.valueOf(participant.getIs_speaking());
        C13045h2 c13045h4 = this.f139415G;
        c13045h4.getClass();
        c13045h4.m36571k(null, boolValueOf);
        m105850a(participant.getAudio_level());
        Boolean boolValueOf2 = Boolean.valueOf(participant.getPublished_tracks().contains(TrackType.TRACK_TYPE_AUDIO));
        C13045h2 c13045h5 = this.f139436o;
        c13045h5.getClass();
        c13045h5.m36571k(null, boolValueOf2);
        Boolean boolValueOf3 = Boolean.valueOf(participant.getPublished_tracks().contains(TrackType.TRACK_TYPE_VIDEO));
        C13045h2 c13045h6 = this.f139432k;
        c13045h6.getClass();
        c13045h6.m36571k(null, boolValueOf3);
        Boolean boolValueOf4 = Boolean.valueOf(participant.getPublished_tracks().contains(TrackType.TRACK_TYPE_SCREEN_SHARE));
        C13045h2 c13045h7 = this.f139439r;
        c13045h7.getClass();
        c13045h7.m36571k(null, boolValueOf4);
        this.f139420L.m36570j(participant.getRoles());
        this.f139442u.m36570j(participant.getName());
        this.f139444w.m36570j(participant.getImage());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33392g2)) {
            return false;
        }
        C33392g2 c33392g2 = (C33392g2) obj;
        return AbstractC22676k.m65745e(this.f139422a, c33392g2.f139422a) && AbstractC22676k.m65745e(this.f139423b, c33392g2.f139423b) && AbstractC22676k.m65745e(this.f139424c, c33392g2.f139424c) && AbstractC22676k.m65745e(this.f139425d, c33392g2.f139425d) && this.f139426e == c33392g2.f139426e && AbstractC22676k.m65745e(this.f139427f, c33392g2.f139427f);
    }

    public final int hashCode() {
        return this.f139427f.hashCode() + ((this.f139426e.hashCode() + AbstractC11266d.m30450d((this.f139424c.hashCode() + ((this.f139423b.hashCode() + (this.f139422a.hashCode() * 31)) * 31)) * 31, 31, this.f139425d)) * 31);
    }

    public final String toString() {
        return "ParticipantState(sessionId=" + this.f139422a + ", scope=" + this.f139423b + ", callActions=" + this.f139424c + ", initialUserId=" + this.f139425d + ", source=" + this.f139426e + ", trackLookupPrefix=" + this.f139427f + ")";
    }
}
