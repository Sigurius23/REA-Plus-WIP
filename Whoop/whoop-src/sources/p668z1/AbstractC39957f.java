package p668z1;

import p474s.C31983m2;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC39957f {

    /* JADX INFO: renamed from: a */
    public C39961j f172442a;

    /* JADX INFO: renamed from: b */
    public long f172443b;

    /* JADX INFO: renamed from: c */
    public boolean f172444c;

    /* JADX INFO: renamed from: d */
    public int f172445d;

    public AbstractC39957f(long j7, C39961j c39961j) {
        int iM56015a;
        int iNumberOfTrailingZeros;
        this.f172442a = c39961j;
        this.f172443b = j7;
        C39962k c39962k = AbstractC39963l.f172460a;
        if (j7 != 0) {
            C39961j c39961jMo128146d = mo128146d();
            long j13 = c39961jMo128146d.f172457y;
            long[] jArr = c39961jMo128146d.f172458z;
            if (jArr != null) {
                j7 = jArr[0];
            } else {
                long j14 = c39961jMo128146d.f172456x;
                if (j14 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j14);
                } else {
                    long j15 = c39961jMo128146d.f172455w;
                    if (j15 != 0) {
                        j13 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j15);
                    }
                }
                j7 = ((long) iNumberOfTrailingZeros) + j13;
            }
            synchronized (AbstractC39963l.f172462c) {
                iM56015a = AbstractC39963l.f172465f.m56015a(j7);
            }
        } else {
            iM56015a = -1;
        }
        this.f172445d = iM56015a;
    }

    /* JADX INFO: renamed from: q */
    public static void m128151q(AbstractC39957f abstractC39957f) {
        AbstractC39963l.f172461b.m99492s(abstractC39957f);
    }

    /* JADX INFO: renamed from: a */
    public final void m128152a() {
        synchronized (AbstractC39963l.f172462c) {
            mo128132b();
            mo128138p();
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo128132b() {
        AbstractC39963l.f172463d = AbstractC39963l.f172463d.m128157c(mo128147g());
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo128122c();

    /* JADX INFO: renamed from: d */
    public C39961j mo128146d() {
        return this.f172442a;
    }

    /* JADX INFO: renamed from: e */
    public abstract Function1 mo128133e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo128134f();

    /* JADX INFO: renamed from: g */
    public long mo128147g() {
        return this.f172443b;
    }

    /* JADX INFO: renamed from: h */
    public int mo128135h() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public abstract Function1 mo128136i();

    /* JADX INFO: renamed from: j */
    public final AbstractC39957f m128153j() {
        C31983m2 c31983m2 = AbstractC39963l.f172461b;
        AbstractC39957f abstractC39957f = (AbstractC39957f) c31983m2.m99482f();
        c31983m2.m99492s(this);
        return abstractC39957f;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo128123k();

    /* JADX INFO: renamed from: l */
    public abstract void mo128124l();

    /* JADX INFO: renamed from: m */
    public abstract void mo128125m();

    /* JADX INFO: renamed from: n */
    public abstract void mo128137n(InterfaceC39977z interfaceC39977z);

    /* JADX INFO: renamed from: o */
    public final void m128154o() {
        int i13 = this.f172445d;
        if (i13 >= 0) {
            AbstractC39963l.m128181u(i13);
            this.f172445d = -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public void mo128138p() {
        m128154o();
    }

    /* JADX INFO: renamed from: r */
    public void mo128148r(C39961j c39961j) {
        this.f172442a = c39961j;
    }

    /* JADX INFO: renamed from: s */
    public void mo128149s(long j7) {
        this.f172443b = j7;
    }

    /* JADX INFO: renamed from: t */
    public void mo128139t(int i13) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* JADX INFO: renamed from: u */
    public abstract AbstractC39957f mo128126u(Function1 function1);
}
