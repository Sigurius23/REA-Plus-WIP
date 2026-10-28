package p684zk;

import java.security.MessageDigest;
import java.util.Map;
import p586wk.C37330h;
import p586wk.InterfaceC37327e;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: zk.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C40793r implements InterfaceC37327e {

    /* JADX INFO: renamed from: b */
    public final Object f175933b;

    /* JADX INFO: renamed from: c */
    public final int f175934c;

    /* JADX INFO: renamed from: d */
    public final int f175935d;

    /* JADX INFO: renamed from: e */
    public final Class f175936e;

    /* JADX INFO: renamed from: f */
    public final Class f175937f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC37327e f175938g;

    /* JADX INFO: renamed from: h */
    public final Map f175939h;

    /* JADX INFO: renamed from: i */
    public final C37330h f175940i;

    /* JADX INFO: renamed from: j */
    public int f175941j;

    public C40793r(Object obj, InterfaceC37327e interfaceC37327e, int i13, int i14, Map map, Class cls, Class cls2, C37330h c37330h) {
        AbstractC29125c.m88539p(obj, "Argument must not be null");
        this.f175933b = obj;
        this.f175938g = interfaceC37327e;
        this.f175934c = i13;
        this.f175935d = i14;
        AbstractC29125c.m88539p(map, "Argument must not be null");
        this.f175939h = map;
        AbstractC29125c.m88539p(cls, "Resource class must not be null");
        this.f175936e = cls;
        AbstractC29125c.m88539p(cls2, "Transcode class must not be null");
        this.f175937f = cls2;
        AbstractC29125c.m88539p(c37330h, "Argument must not be null");
        this.f175940i = c37330h;
    }

    @Override // p586wk.InterfaceC37327e
    /* JADX INFO: renamed from: a */
    public final void mo33605a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p586wk.InterfaceC37327e
    public final boolean equals(Object obj) {
        if (obj instanceof C40793r) {
            C40793r c40793r = (C40793r) obj;
            if (this.f175933b.equals(c40793r.f175933b) && this.f175938g.equals(c40793r.f175938g) && this.f175935d == c40793r.f175935d && this.f175934c == c40793r.f175934c && this.f175939h.equals(c40793r.f175939h) && this.f175936e.equals(c40793r.f175936e) && this.f175937f.equals(c40793r.f175937f) && this.f175940i.equals(c40793r.f175940i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p586wk.InterfaceC37327e
    public final int hashCode() {
        if (this.f175941j == 0) {
            int iHashCode = this.f175933b.hashCode();
            this.f175941j = iHashCode;
            int iHashCode2 = ((((this.f175938g.hashCode() + (iHashCode * 31)) * 31) + this.f175934c) * 31) + this.f175935d;
            this.f175941j = iHashCode2;
            int iHashCode3 = this.f175939h.hashCode() + (iHashCode2 * 31);
            this.f175941j = iHashCode3;
            int iHashCode4 = this.f175936e.hashCode() + (iHashCode3 * 31);
            this.f175941j = iHashCode4;
            int iHashCode5 = this.f175937f.hashCode() + (iHashCode4 * 31);
            this.f175941j = iHashCode5;
            this.f175941j = this.f175940i.f159595b.hashCode() + (iHashCode5 * 31);
        }
        return this.f175941j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f175933b + ", width=" + this.f175934c + ", height=" + this.f175935d + ", resourceClass=" + this.f175936e + ", transcodeClass=" + this.f175937f + ", signature=" + this.f175938g + ", hashCode=" + this.f175941j + ", transformations=" + this.f175939h + ", options=" + this.f175940i + '}';
    }
}
