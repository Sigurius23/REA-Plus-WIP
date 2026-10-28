package t40;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.stripe.attestation.AttestationError;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import l83.C23470p;
import mc3.AbstractC25438d;
import mc3.C25437c;
import mc3.InterfaceC25435a;
import p000.C26047n;
import p463rj.AbstractC31484o;
import p505ts.AbstractC34132o;
import q30.C29934u0;
import q83.AbstractC30060g;
import r83.EnumC31071a;
import rs.AbstractC31780b;
import s83.AbstractC32269c;
import sc0.C32355c;
import sr.C32894b;
import sr.C32903k;
import sr.C32906n;

/* JADX INFO: renamed from: t40.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C33536f {

    /* JADX INFO: renamed from: a */
    public final long f139991a;

    /* JADX INFO: renamed from: b */
    public final C26047n f139992b;

    /* JADX INFO: renamed from: c */
    public final C29934u0 f139993c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC25435a f139994d;

    /* JADX INFO: renamed from: e */
    public final C23470p f139995e;

    /* JADX INFO: renamed from: f */
    public C32903k f139996f;

    public C33536f(C26047n c26047n, C29934u0 c29934u0) {
        C25437c c25437cM74669a = AbstractC25438d.m74669a();
        this.f139991a = 577365562050L;
        this.f139992b = c26047n;
        this.f139993c = c29934u0;
        this.f139994d = c25437cM74669a;
        this.f139995e = AbstractC30060g.m92088H(new C32355c(this, 7));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0100 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:13:0x0033, B:51:0x00f6, B:53:0x0100, B:54:0x0105), top: B:77:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [t40.f] */
    /* JADX WARN: Type inference failed for: r10v6, types: [t40.f] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [t40.f] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: a */
    public final Object m105906a(AbstractC32269c abstractC32269c) {
        C33533c c33533c;
        ?? r10;
        Object objM107888l;
        ?? r14;
        Throwable thM68037a;
        InterfaceC25435a interfaceC25435a;
        C33536f c33536f;
        InterfaceC25435a interfaceC25435a2;
        Throwable th3;
        C33536f c33536f2;
        ?? r15;
        Object objM98691l;
        if (abstractC32269c instanceof C33533c) {
            c33533c = (C33533c) abstractC32269c;
            int i13 = c33533c.f139978F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33533c.f139978F = i13 - Integer.MIN_VALUE;
            } else {
                c33533c = new C33533c(this, abstractC32269c);
            }
        } else {
            c33533c = new C33533c(this, abstractC32269c);
        }
        Object obj = c33533c.f139982z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c33533c.f139978F;
        Object obj2 = C23454a0.f92919a;
        try {
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    try {
                        interfaceC25435a = this.f139994d;
                        c33533c.f139979w = this;
                        c33533c.f139980x = this;
                        c33533c.f139981y = interfaceC25435a;
                        c33533c.f139978F = 1;
                        if (interfaceC25435a.mo68211b(c33533c) != enumC31071a) {
                            c33536f = this;
                            r10 = c33536f;
                        }
                        return enumC31071a;
                    } catch (Throwable th4) {
                        th = th4;
                        r10 = this;
                        objM107888l = AbstractC34132o.m107888l(th);
                        r14 = r10;
                    }
                } else {
                    if (i14 != 1) {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = c33533c.f139981y;
                        c33536f2 = c33533c.f139980x;
                        C33536f c33536f3 = c33533c.f139979w;
                        try {
                            AbstractC34132o.m107864I(obj);
                            r15 = c33536f3;
                            objM98691l = AbstractC31780b.m98691l((Task) obj);
                            if (!(objM98691l instanceof C23467m)) {
                                c33536f2.f139996f = (C32903k) objM98691l;
                            }
                            AbstractC34132o.m107864I(objM98691l);
                            objM107888l = (C32903k) objM98691l;
                            interfaceC25435a2.mo68214i(null);
                            r14 = r15;
                            if (objM107888l instanceof C23467m) {
                                obj2 = objM107888l;
                            }
                            thM68037a = C23468n.m68037a(obj2);
                            if (thM68037a == null) {
                                return obj2;
                            }
                            try {
                                r14.f139992b.invoke("Integrity - Failed to prepare integrity token", thM68037a);
                                Object obj3 = AttestationError.f22594w;
                                throw AbstractC31484o.m96967s(thM68037a);
                            } catch (Throwable th5) {
                                return AbstractC34132o.m107888l(th5);
                            }
                        } catch (Throwable th6) {
                            th3 = th6;
                            interfaceC25435a2.mo68214i(null);
                            throw th3;
                        }
                    }
                    InterfaceC25435a interfaceC25435a3 = c33533c.f139981y;
                    c33536f = c33533c.f139980x;
                    r10 = c33533c.f139979w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        interfaceC25435a = interfaceC25435a3;
                        r10 = r10;
                    } catch (Throwable th7) {
                        th = th7;
                        objM107888l = AbstractC34132o.m107888l(th);
                        r14 = r10;
                    }
                }
                C32903k c32903k = c33536f.f139996f;
                C23470p c23470p = c33536f.f139995e;
                if (c32903k != null) {
                    Log.d("Integrity", "Integrity token already prepared - instance: " + ((C32894b) c23470p.getValue()));
                    interfaceC25435a.mo68214i(null);
                    return obj2;
                }
                Log.d("Integrity", "Preparing integrity token provider - instance: " + ((C32894b) c23470p.getValue()));
                C32894b c32894b = (C32894b) c23470p.getValue();
                long j7 = c33536f.f139991a;
                byte b = (byte) (((byte) 2) | 1);
                if (b != 3) {
                    StringBuilder sb4 = new StringBuilder();
                    if ((b & 1) == 0) {
                        sb4.append(" cloudProjectNumber");
                    }
                    if ((b & 2) == 0) {
                        sb4.append(" webViewRequestMode");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb4.toString()));
                }
                Task taskM103288a = c32894b.m103288a(new C32906n(j7));
                c33533c.f139979w = r10;
                c33533c.f139980x = c33536f;
                c33533c.f139981y = interfaceC25435a;
                c33533c.f139978F = 2;
                Object objM98683d = AbstractC31780b.m98683d(taskM103288a, c33533c);
                if (objM98683d != enumC31071a) {
                    interfaceC25435a2 = interfaceC25435a;
                    obj = objM98683d;
                    c33536f2 = c33536f;
                    r15 = r10;
                    objM98691l = AbstractC31780b.m98691l((Task) obj);
                    if (!(objM98691l instanceof C23467m)) {
                        c33536f2.f139996f = (C32903k) objM98691l;
                    }
                    AbstractC34132o.m107864I(objM98691l);
                    objM107888l = (C32903k) objM98691l;
                    interfaceC25435a2.mo68214i(null);
                    r14 = r15;
                    if (objM107888l instanceof C23467m) {
                    } else {
                        obj2 = objM107888l;
                    }
                    thM68037a = C23468n.m68037a(obj2);
                    if (thM68037a == null) {
                        return obj2;
                    }
                    r14.f139992b.invoke("Integrity - Failed to prepare integrity token", thM68037a);
                    Object obj4 = AttestationError.f22594w;
                    throw AbstractC31484o.m96967s(thM68037a);
                }
                return enumC31071a;
            } catch (Throwable th8) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th8;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        } catch (Throwable th9) {
            th = th9;
            r10 = c33533c;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2081. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: b */
    public final java.lang.Object m105907b(s83.AbstractC32269c r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t40.C33536f.m105907b(s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m105908c(AbstractC32269c abstractC32269c) {
        C33535e c33535e;
        if (abstractC32269c instanceof C33535e) {
            c33535e = (C33535e) abstractC32269c;
            int i13 = c33535e.f139990y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c33535e.f139990y = i13 - Integer.MIN_VALUE;
            } else {
                c33535e = new C33535e(this, abstractC32269c);
            }
        } else {
            c33535e = new C33535e(this, abstractC32269c);
        }
        Object obj = c33535e.f139988w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c33535e.f139990y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        c33535e.f139990y = 1;
        Object objM105907b = m105907b(c33535e);
        return objM105907b == obj2 ? obj2 : objM105907b;
    }
}
