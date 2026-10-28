package kb3;

import bd3.C3130k;
import dc3.C11934s;
import fa3.C14328u;
import lb3.C23768e;
import nb3.C26555l;
import p581we.C37199o;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: kb3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C22335d extends C22339h implements InterfaceC22343l {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C11934s f87170E;

    /* JADX INFO: renamed from: z */
    public volatile C37199o f87171z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22335d(C22342k c22342k, C14328u c14328u, C11934s c11934s) {
        super(c22342k, c14328u);
        this.f87170E = c11934s;
        if (c22342k == null) {
            m64217e(0);
            throw null;
        }
        this.f87171z = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m64216a(int i13) {
        String str = i13 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[i13 != 2 ? 2 : 3];
        if (i13 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i13 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i13 == 2) {
            objArr[2] = "doPostCompute";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m64217e(int i13) {
        String str = i13 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 2 ? 3 : 2];
        if (i13 == 1) {
            objArr[0] = "computable";
        } else if (i13 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i13 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i13 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 == 2) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kb3.C22339h
    /* JADX INFO: renamed from: c */
    public final void mo64218c(Object obj) {
        C37199o c37199o = new C37199o();
        c37199o.f159040w = obj;
        c37199o.f159041x = Thread.currentThread();
        this.f87171z = c37199o;
        try {
            if (obj == null) {
                m64216a(2);
                throw null;
            }
            this.f87170E.invoke(obj);
            this.f87171z = null;
        } catch (Throwable th3) {
            this.f87171z = null;
            throw th3;
        }
    }

    @Override // kb3.C22339h
    /* JADX INFO: renamed from: d */
    public final C3130k mo64215d(boolean z4) {
        return new C3130k((Object) new C23768e(AbstractC37056f.m118958J(C26555l.f105567d)), false);
    }

    @Override // kb3.C22339h, c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        Object objInvoke;
        C37199o c37199o = this.f87171z;
        if (c37199o == null || ((Thread) c37199o.f159041x) != Thread.currentThread()) {
            objInvoke = super.invoke();
        } else {
            if (((Thread) c37199o.f159041x) != Thread.currentThread()) {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
            objInvoke = c37199o.f159040w;
        }
        if (objInvoke != null) {
            return objInvoke;
        }
        m64217e(2);
        throw null;
    }
}
