package p505ts;

import com.google.crypto.tink.internal.TinkBugException;
import p389p0.C28539n0;
import p474s.C31983m2;

/* JADX INFO: renamed from: ts.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34129l {

    /* JADX INFO: renamed from: a */
    public static final C34125h f143068a;

    /* JADX INFO: renamed from: b */
    public static final C34128k f143069b;

    /* JADX INFO: renamed from: c */
    public static final C34128k f143070c;

    /* JADX INFO: renamed from: d */
    public static final C34121d f143071d;

    static {
        try {
            C31983m2 c31983m2M107854b = C34125h.m107854b();
            c31983m2M107854b.m99493t(32);
            c31983m2M107854b.f132769x = C34124g.f143046e;
            f143068a = c31983m2M107854b.m99480c();
            try {
                C28539n0 c28539n0M107855b = C34128k.m107855b();
                c28539n0M107855b.m86840l(32);
                c28539n0M107855b.f115463y = C34124g.f143051j;
                f143069b = c28539n0M107855b.m86834d();
                try {
                    C28539n0 c28539n0M107855b2 = C34128k.m107855b();
                    c28539n0M107855b2.m86840l(64);
                    c28539n0M107855b2.f115463y = C34124g.f143053l;
                    f143070c = c28539n0M107855b2.m86834d();
                    try {
                        f143071d = C34121d.m107852b(32);
                    } catch (Exception e5) {
                        throw new TinkBugException(e5);
                    }
                } catch (Exception e13) {
                    throw new TinkBugException(e13);
                }
            } catch (Exception e14) {
                throw new TinkBugException(e14);
            }
        } catch (Exception e15) {
            throw new TinkBugException(e15);
        }
    }
}
