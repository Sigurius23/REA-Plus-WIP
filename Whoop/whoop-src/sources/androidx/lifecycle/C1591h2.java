package androidx.lifecycle;

import bc3.AbstractC3069w1;
import bd3.C3130k;
import java.util.concurrent.ConcurrentHashMap;
import kb3.C22332a;
import kb3.C22342k;
import kb3.EnumC22341j;
import kb3.InterfaceC22344m;
import l83.C23454a0;
import p390p1.C28603d;
import p390p1.C28607e;
import p602x1.C37815a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.C22665e0;
import q83.C30064k;
import ub3.AbstractC34756j;
import ub3.C34755i;

/* JADX INFO: renamed from: androidx.lifecycle.h2 */
/* JADX INFO: loaded from: classes.dex */
public class C1591h2 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f6241w;

    /* JADX INFO: renamed from: x */
    public final Object f6242x;

    /* JADX INFO: renamed from: y */
    public final Object f6243y;

    /* JADX INFO: renamed from: z */
    public final Object f6244z;

    public /* synthetic */ C1591h2(Object obj, Object obj2, Object obj3, int i13) {
        this.f6241w = i13;
        this.f6242x = obj;
        this.f6243y = obj2;
        this.f6244z = obj3;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4982a(int i13) {
        String str = (i13 == 3 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 3 || i13 == 4) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "map";
        } else if (i13 == 2) {
            objArr[0] = "compute";
        } else if (i13 == 3 || i13 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i13 == 3) {
            objArr[1] = "recursionDetected";
        } else if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i13 != 3 && i13 != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i13 != 3 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: c */
    public AssertionError m4983c(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC22341j.f87179x + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((C22342k) this.f6242x));
        C22342k.m64221e(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: d */
    public AssertionError m4984d(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((C22342k) this.f6242x));
        C22342k.m64221e(assertionError);
        return assertionError;
    }

    /* JADX INFO: renamed from: e */
    public AssertionError m4985e(Object obj, Throwable th3) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((C22342k) this.f6242x), th3);
        C22342k.m64221e(assertionError);
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007c A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:89:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0082 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:89:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:89:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0089 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:89:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x008f A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:20:0x0056, B:23:0x0061, B:25:0x0067, B:27:0x006b, B:32:0x0076, B:33:0x0079, B:35:0x007c, B:37:0x0082, B:39:0x0086, B:40:0x0089, B:41:0x008c, B:43:0x008f, B:57:0x00b3, B:61:0x00bf, B:62:0x00c3, B:63:0x00c4, B:64:0x00c6, B:69:0x00cf, B:71:0x00da, B:72:0x00de, B:73:0x00df, B:74:0x00e2, B:76:0x00e6, B:77:0x00e9, B:79:0x00eb, B:80:0x00ef, B:66:0x00c8, B:67:0x00cc, B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1, B:59:0x00b9, B:75:0x00e3), top: B:89:0x0056, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: all -> 0x00b2, TryCatch #1 {all -> 0x00b2, blocks: (B:46:0x0096, B:50:0x00a5, B:54:0x00ad, B:55:0x00b1), top: B:90:0x0096, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p715kotlin.jvm.functions.Function1
    public Object invoke(Object obj) throws Throwable {
        Object objPut;
        C3130k c3130kMo64214d;
        int i13;
        switch (this.f6241w) {
            case 0:
                C1595i2 c1595i2 = (C1595i2) this.f6244z;
                AbstractC1638x abstractC1638x = (AbstractC1638x) this.f6243y;
                AbstractC3069w1 abstractC3069w1 = (AbstractC3069w1) this.f6242x;
                C30064k c30064k = C30064k.f122676w;
                if (abstractC3069w1.isDispatchNeeded(c30064k)) {
                    abstractC3069w1.dispatch(c30064k, new RunnableC1587g2(abstractC1638x, c1595i2, 1));
                } else {
                    abstractC1638x.mo4988d(c1595i2);
                }
                return C23454a0.f92919a;
            case 1:
                C22342k c22342k = (C22342k) this.f6242x;
                C22332a c22332a = c22342k.f87185b;
                InterfaceC22344m interfaceC22344m = c22342k.f87184a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6243y;
                Object obj2 = concurrentHashMap.get(obj);
                Object obj3 = AbstractC34756j.f146414a;
                AssertionError assertionErrorM4984d = null;
                EnumC22341j enumC22341j = EnumC22341j.f87179x;
                if (obj2 != null && obj2 != enumC22341j) {
                    AbstractC34756j.m109755e(obj2);
                    if (obj2 == obj3) {
                        return null;
                    }
                    return obj2;
                }
                interfaceC22344m.lock();
                try {
                    Object objInvoke = concurrentHashMap.get(obj);
                    EnumC22341j enumC22341j2 = EnumC22341j.f87180y;
                    if (objInvoke == enumC22341j) {
                        C3130k c3130kMo64214d2 = c22342k.mo64214d(obj, "");
                        if (c3130kMo64214d2 == null) {
                            m4982a(3);
                            throw null;
                        }
                        if (c3130kMo64214d2.f12276b) {
                            objInvoke = enumC22341j2;
                            if (objInvoke != enumC22341j2) {
                                c3130kMo64214d = c22342k.mo64214d(obj, "");
                                if (c3130kMo64214d != null) {
                                    m4982a(3);
                                    throw null;
                                }
                                if (!c3130kMo64214d.f12276b) {
                                    objInvoke = c3130kMo64214d.f12277c;
                                } else {
                                    if (objInvoke != null) {
                                        concurrentHashMap.put(obj, enumC22341j);
                                        objInvoke = ((Function1) this.f6244z).invoke(obj);
                                        if (objInvoke == null) {
                                            obj3 = objInvoke;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj3);
                                        if (objPut == enumC22341j) {
                                            assertionErrorM4984d = m4984d(obj, objPut);
                                            throw assertionErrorM4984d;
                                        }
                                        interfaceC22344m.unlock();
                                        throw th;
                                    }
                                    AbstractC34756j.m109755e(objInvoke);
                                    if (objInvoke == obj3) {
                                        objInvoke = null;
                                    }
                                }
                            } else {
                                if (objInvoke != null) {
                                    concurrentHashMap.put(obj, enumC22341j);
                                    objInvoke = ((Function1) this.f6244z).invoke(obj);
                                    if (objInvoke == null) {
                                        obj3 = objInvoke;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj3);
                                    if (objPut == enumC22341j) {
                                        assertionErrorM4984d = m4984d(obj, objPut);
                                        throw assertionErrorM4984d;
                                    }
                                    interfaceC22344m.unlock();
                                    throw th;
                                }
                                AbstractC34756j.m109755e(objInvoke);
                                if (objInvoke == obj3) {
                                    objInvoke = null;
                                }
                            }
                        } else {
                            objInvoke = c3130kMo64214d2.f12277c;
                        }
                    } else if (objInvoke != enumC22341j2) {
                        c3130kMo64214d = c22342k.mo64214d(obj, "");
                        if (c3130kMo64214d != null) {
                            m4982a(3);
                            throw null;
                        }
                        if (!c3130kMo64214d.f12276b) {
                            objInvoke = c3130kMo64214d.f12277c;
                        } else {
                            if (objInvoke != null) {
                                concurrentHashMap.put(obj, enumC22341j);
                                objInvoke = ((Function1) this.f6244z).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == enumC22341j) {
                                    assertionErrorM4984d = m4984d(obj, objPut);
                                    throw assertionErrorM4984d;
                                }
                                interfaceC22344m.unlock();
                                throw th;
                            }
                            AbstractC34756j.m109755e(objInvoke);
                            if (objInvoke == obj3) {
                                objInvoke = null;
                            }
                        }
                    } else {
                        if (objInvoke != null) {
                            try {
                                concurrentHashMap.put(obj, enumC22341j);
                                objInvoke = ((Function1) this.f6244z).invoke(obj);
                                if (objInvoke == null) {
                                    obj3 = objInvoke;
                                }
                                objPut = concurrentHashMap.put(obj, obj3);
                                if (objPut == enumC22341j) {
                                    assertionErrorM4984d = m4984d(obj, objPut);
                                    throw assertionErrorM4984d;
                                }
                            } catch (Throwable th3) {
                                if (AbstractC34756j.m109754d(th3)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != enumC22341j) {
                                            throw m4983c(obj, objRemove);
                                        }
                                        throw th3;
                                    } catch (Throwable th4) {
                                        throw m4985e(obj, th4);
                                    }
                                }
                                if (th3 != assertionErrorM4984d) {
                                    Object objPut2 = concurrentHashMap.put(obj, new C34755i(th3));
                                    if (objPut2 != enumC22341j) {
                                        throw m4984d(obj, objPut2);
                                    }
                                    c22332a.getClass();
                                    throw th3;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    c22332a.getClass();
                                    throw th3;
                                } catch (Throwable th5) {
                                    throw m4985e(obj, th5);
                                }
                            }
                            interfaceC22344m.unlock();
                            throw th;
                        }
                        AbstractC34756j.m109755e(objInvoke);
                        if (objInvoke == obj3) {
                            objInvoke = null;
                        }
                    }
                    interfaceC22344m.unlock();
                    return objInvoke;
                } catch (Throwable th6) {
                    interfaceC22344m.unlock();
                    throw th6;
                }
            default:
                C28603d c28603d = (C28603d) this.f6242x;
                c28603d.f115718a = null;
                c28603d.f115719b = null;
                C37815a c37815a = ((C28607e) this.f6243y).f115730z;
                int i14 = ((C22665e0) this.f6244z).f89334w;
                do {
                    i13 = c37815a.get();
                } while (!c37815a.compareAndSet(i13, ((i13 >>> 27) & 15) == i14 ? i13 - 1 : i13));
                return C23454a0.f92919a;
        }
    }
}
