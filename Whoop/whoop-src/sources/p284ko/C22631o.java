package p284ko;

import androidx.profileinstaller.ProfileVerifier;
import java.util.Arrays;
import p309lo.AbstractC24567y;
import p398p9.C28977a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: ko.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C22631o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f89026a;

    /* JADX INFO: renamed from: b */
    public final boolean f89027b;

    /* JADX INFO: renamed from: c */
    public final int f89028c;

    /* JADX INFO: renamed from: d */
    public int f89029d;

    /* JADX INFO: renamed from: e */
    public int f89030e;

    /* JADX INFO: renamed from: f */
    public int f89031f;

    /* JADX INFO: renamed from: g */
    public Object[] f89032g;

    public C22631o(int i13) {
        this.f89026a = i13;
        switch (i13) {
            case 1:
                this.f89027b = true;
                this.f89028c = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                this.f89031f = 0;
                this.f89032g = new C28977a[100];
                break;
            default:
                this.f89027b = true;
                this.f89028c = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                this.f89031f = 0;
                this.f89032g = new C22606a[100];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m65566a(int i13) {
        int i14 = this.f89026a;
        synchronized (this) {
            switch (i14) {
                case 0:
                    boolean z4 = i13 < this.f89029d;
                    this.f89029d = i13;
                    if (z4) {
                        m65567b();
                        break;
                    }
                    return;
                default:
                    boolean z13 = i13 < this.f89029d;
                    this.f89029d = i13;
                    if (z13) {
                        m65567b();
                        break;
                    }
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m65567b() {
        int i13 = this.f89026a;
        synchronized (this) {
            switch (i13) {
                case 0:
                    int iMax = Math.max(0, AbstractC24567y.m71675f(this.f89029d, this.f89028c) - this.f89030e);
                    int i14 = this.f89031f;
                    if (iMax >= i14) {
                        return;
                    }
                    Arrays.fill((C22606a[]) this.f89032g, iMax, i14, (Object) null);
                    this.f89031f = iMax;
                    return;
                default:
                    int iMax2 = Math.max(0, AbstractC38065t.m121912e(this.f89029d, this.f89028c) - this.f89030e);
                    int i15 = this.f89031f;
                    if (iMax2 >= i15) {
                        return;
                    }
                    Arrays.fill((C28977a[]) this.f89032g, iMax2, i15, (Object) null);
                    this.f89031f = iMax2;
                    return;
            }
        }
    }
}
