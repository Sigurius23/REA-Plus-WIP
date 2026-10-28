package kb3;

import bd3.C3130k;
import c93.InterfaceC4339a;
import ub3.AbstractC34756j;
import ub3.C34755i;

/* JADX INFO: renamed from: kb3.h */
/* JADX INFO: loaded from: classes5.dex */
public class C22339h implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final C22342k f87175w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC4339a f87176x;

    /* JADX INFO: renamed from: y */
    public volatile Object f87177y;

    public C22339h(C22342k c22342k, InterfaceC4339a interfaceC4339a) {
        if (c22342k == null) {
            m64220a(0);
            throw null;
        }
        this.f87177y = EnumC22341j.f87178w;
        this.f87175w = c22342k;
        this.f87176x = interfaceC4339a;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m64220a(int i13) {
        String str = (i13 == 2 || i13 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "computable";
        } else if (i13 == 2 || i13 == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 2) {
            objArr[1] = "recursionDetected";
        } else if (i13 != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i13 != 2 && i13 != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: c */
    public void mo64218c(Object obj) {
    }

    /* JADX INFO: renamed from: d */
    public C3130k mo64215d(boolean z4) {
        C3130k c3130kMo64214d = this.f87175w.mo64214d(null, "in a lazy value");
        if (c3130kMo64214d != null) {
            return c3130kMo64214d;
        }
        m64220a(2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0015, B:9:0x001b, B:15:0x002a, B:17:0x0035, B:22:0x0042, B:24:0x004a, B:25:0x004d, B:29:0x005c, B:31:0x0062, B:33:0x0066, B:34:0x006d, B:35:0x0074, B:36:0x0075, B:37:0x007b, B:26:0x004f), top: B:40:0x0015, inners: #1 }] */
    @Override // c93.InterfaceC4339a
    public Object invoke() throws Throwable {
        Object objInvoke;
        C3130k c3130kMo64215d;
        EnumC22341j enumC22341j = EnumC22341j.f87180y;
        EnumC22341j enumC22341j2 = EnumC22341j.f87179x;
        Object obj = this.f87177y;
        if (!(obj instanceof EnumC22341j)) {
            AbstractC34756j.m109755e(obj);
            return obj;
        }
        this.f87175w.f87184a.lock();
        try {
            Object obj2 = this.f87177y;
            if (!(obj2 instanceof EnumC22341j)) {
                AbstractC34756j.m109755e(obj2);
                this.f87175w.f87184a.unlock();
                return obj2;
            }
            if (obj2 == enumC22341j2) {
                this.f87177y = enumC22341j;
                C3130k c3130kMo64215d2 = mo64215d(true);
                if (!c3130kMo64215d2.f12276b) {
                    objInvoke = c3130kMo64215d2.f12277c;
                } else if (obj2 == enumC22341j) {
                    c3130kMo64215d = mo64215d(false);
                    if (c3130kMo64215d.f12276b) {
                        this.f87177y = enumC22341j2;
                        try {
                            objInvoke = this.f87176x.invoke();
                            mo64218c(objInvoke);
                            this.f87177y = objInvoke;
                        } catch (Throwable th3) {
                            if (AbstractC34756j.m109754d(th3)) {
                                this.f87177y = EnumC22341j.f87178w;
                                throw th3;
                            }
                            if (this.f87177y == enumC22341j2) {
                                this.f87177y = new C34755i(th3);
                            }
                            this.f87175w.f87185b.getClass();
                            throw th3;
                        }
                    } else {
                        objInvoke = c3130kMo64215d.f12277c;
                    }
                } else {
                    this.f87177y = enumC22341j2;
                    objInvoke = this.f87176x.invoke();
                    mo64218c(objInvoke);
                    this.f87177y = objInvoke;
                }
            } else if (obj2 == enumC22341j) {
                c3130kMo64215d = mo64215d(false);
                if (c3130kMo64215d.f12276b) {
                    objInvoke = c3130kMo64215d.f12277c;
                } else {
                    this.f87177y = enumC22341j2;
                    objInvoke = this.f87176x.invoke();
                    mo64218c(objInvoke);
                    this.f87177y = objInvoke;
                }
            } else {
                this.f87177y = enumC22341j2;
                objInvoke = this.f87176x.invoke();
                mo64218c(objInvoke);
                this.f87177y = objInvoke;
            }
            this.f87175w.f87184a.unlock();
            return objInvoke;
        } catch (Throwable th4) {
            this.f87175w.f87184a.unlock();
            throw th4;
        }
    }
}
