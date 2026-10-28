package be;

import a33.C0351c;
import ag.C0855e;
import ag.EnumC0856f;
import aws.sdk.kotlin.runtime.config.imds.EC2MetadataError;
import bd3.C3130k;
import gm.C15990r;
import io.sentry.android.replay.video.C20245d;
import java.io.Serializable;
import m63.C25126d;
import p025b1.C2217h;
import p091dg.C12002a;
import p116ef.C13140a;
import p326mf.AbstractC25492l;
import p326mf.C25483c;
import p326mf.C25500t;
import p326mf.C25501u;
import p326mf.EnumC25498r;
import p368og.InterfaceC27910g;
import p459rf.C31341l;
import p470rv.AbstractC31834n;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p550vd.AbstractC35903f;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import ug.C34912a;
import ug.C34913b;
import vg.C35956c;
import wf.C37236a;
import x30.AbstractC37926s0;
import x43.AbstractC37978j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: be.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C3164q implements InterfaceC34888o {

    /* JADX INFO: renamed from: E */
    public final C35956c f12379E;

    /* JADX INFO: renamed from: w */
    public final C25501u f12380w;

    /* JADX INFO: renamed from: x */
    public final C3158k f12381x;

    /* JADX INFO: renamed from: y */
    public final long f12382y;

    /* JADX INFO: renamed from: z */
    public final C34912a f12383z;

    public C3164q(C25501u c25501u, C3158k c3158k, long j7, C34912a clock) {
        AbstractC22676k.m65750j(clock, "clock");
        this.f12380w = c25501u;
        this.f12381x = c3158k;
        this.f12382y = j7;
        this.f12383z = clock;
        Duration.Companion companion = Duration.INSTANCE;
        this.f12379E = new C35956c(DurationKt.toDuration(120, DurationUnit.SECONDS), clock);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012a A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:41:0x011e, B:43:0x012a, B:45:0x0134, B:60:0x0190, B:61:0x0197, B:62:0x0198, B:66:0x01a5, B:67:0x01aa), top: B:75:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0134 A[Catch: all -> 0x018d, TRY_LEAVE, TryCatch #1 {all -> 0x018d, blocks: (B:41:0x011e, B:43:0x012a, B:45:0x0134, B:60:0x0190, B:61:0x0197, B:62:0x0198, B:66:0x01a5, B:67:0x01aa), top: B:75:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x014e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155 A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:21:0x0055, B:49:0x0151, B:51:0x0155, B:56:0x0183, B:57:0x018c), top: B:74:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0182 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0183 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #0 {all -> 0x005a, blocks: (B:21:0x0055, B:49:0x0151, B:51:0x0155, B:56:0x0183, B:57:0x018c), top: B:74:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0190 A[Catch: all -> 0x018d, TRY_ENTER, TryCatch #1 {all -> 0x018d, blocks: (B:41:0x011e, B:43:0x012a, B:45:0x0134, B:60:0x0190, B:61:0x0197, B:62:0x0198, B:66:0x01a5, B:67:0x01aa), top: B:75:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0198 A[Catch: all -> 0x018d, TryCatch #1 {all -> 0x018d, blocks: (B:41:0x011e, B:43:0x012a, B:45:0x0134, B:60:0x0190, B:61:0x0197, B:62:0x0198, B:66:0x01a5, B:67:0x01aa), top: B:75:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public static final Object m9059a(C3164q c3164q, C34912a c34912a, C34894u c34894u, AbstractC32269c abstractC32269c) {
        C3162o c3162o;
        C35937b c35937b;
        C34912a c34912a2;
        InterfaceC27910g interfaceC27910g;
        InterfaceC27910g interfaceC27910g2;
        C31341l c31341l;
        C31341l c31341l2;
        C37236a c37236a;
        C25500t c25500t;
        C25500t c25500t2;
        String str;
        String str2;
        long j7;
        Serializable serializableM121450B;
        C34912a c34912a3;
        byte[] bArr;
        C3161n c3161n;
        if (abstractC32269c instanceof C3162o) {
            c3162o = (C3162o) abstractC32269c;
            int i13 = c3162o.f12370I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3162o.f12370I = i13 - Integer.MIN_VALUE;
            } else {
                c3162o = new C3162o(c3164q, abstractC32269c);
            }
        } else {
            c3162o = new C3162o(c3164q, abstractC32269c);
        }
        Object objM74907b = c3162o.f12368G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3162o.f12370I;
        int i15 = 1;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM74907b);
            InterfaceC30063j context = c3162o.getContext();
            String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C3164q.class).getQualifiedName();
            if (qualifiedName == null) {
                throw new IllegalArgumentException("logger<T> cannot be used on an anonymous object");
            }
            C15990r c15990rM113984B = AbstractC35903f.m113984B(context, qualifiedName);
            c15990rM113984B.mo394s(null, new C2217h(27));
            c35937b = new C35937b();
            c35937b.f153015w = EnumC25498r.f99842y;
            String strValueOf = String.valueOf(Duration.m134276getInWholeSecondsimpl(c3164q.f12382y));
            C25483c c25483c = c35937b.f153017y;
            c25483c.m386f(strValueOf, "x-aws-ec2-metadata-token-ttl-seconds");
            String str3 = (String) ((C35937b) c34894u.f146959b).f153017y.m397v("User-Agent");
            if (str3 != null) {
                c25483c.m386f(str3, "User-Agent");
            }
            C3130k c3130k = c35937b.f153016x.f18357z;
            c3130k.getClass();
            c3130k.m8994e("/latest/api/token");
            C3158k c3158k = c3164q.f12381x;
            c34912a2 = c34912a;
            c3162o.f12371w = c34912a2;
            c3162o.f12372x = c15990rM113984B;
            c3162o.f12373y = c35937b;
            c3162o.f12370I = 1;
            Object objM99483g = c3158k.f12361x.m99483g(c3162o);
            if (objM99483g != enumC31071a) {
                interfaceC27910g = c15990rM113984B;
                objM74907b = objM99483g;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            c35937b = c3162o.f12373y;
            interfaceC27910g = c3162o.f12372x;
            c34912a2 = c3162o.f12371w;
            AbstractC34132o.m107864I(objM74907b);
        } else if (i14 == 2) {
            interfaceC27910g2 = c3162o.f12372x;
            C34912a c34912a4 = c3162o.f12371w;
            AbstractC34132o.m107864I(objM74907b);
            c34912a2 = c34912a4;
            c31341l = (C31341l) objM74907b;
            interfaceC27910g2.mo394s(null, new C3152e(c31341l, i15));
            try {
                c37236a = c31341l.f128964x;
                c25500t = c37236a.f159235a;
                c25500t2 = C25500t.f99849c;
                if (c25500t.equals(c25500t2)) {
                    if (c25500t.equals(C25500t.f99851e)) {
                        str = "Request forbidden: IMDS is disabled or the caller has insufficient permissions.";
                    } else {
                        str = "Failed to retrieve IMDS token";
                    }
                    throw new EC2MetadataError(c25500t, str);
                }
                str2 = (String) c37236a.f159236b.get("x-aws-ec2-metadata-token-ttl-seconds");
                if (str2 != null) {
                    throw new EC2MetadataError(c25500t2, "No TTL provided in IMDS response");
                }
                j7 = Long.parseLong(str2);
                AbstractC25492l abstractC25492l = c37236a.f159237c;
                c3162o.f12371w = c34912a2;
                c3162o.f12372x = null;
                c3162o.f12373y = null;
                c3162o.f12374z = c31341l;
                c3162o.f12367F = j7;
                c3162o.f12370I = 3;
                serializableM121450B = AbstractC37926s0.m121450B(abstractC25492l, c3162o);
                if (serializableM121450B != enumC31071a) {
                    c31341l2 = c31341l;
                    objM74907b = serializableM121450B;
                    c34912a3 = c34912a2;
                    bArr = (byte[]) objM74907b;
                    if (bArr == null) {
                        throw new EC2MetadataError(C25500t.f99849c, "No token provided in IMDS response");
                    }
                    c34912a3.getClass();
                    C33647p c33647p = C34913b.f147015x;
                    C34913b c34913bM106274t = C33647p.m106274t();
                    Duration.Companion companion = Duration.INSTANCE;
                    c3161n = new C3161n(bArr, c34913bM106274t.m110115d(DurationKt.toDuration(j7, DurationUnit.SECONDS)));
                    c3162o.f12371w = null;
                    c3162o.f12372x = null;
                    c3162o.f12373y = null;
                    c3162o.f12374z = null;
                    c3162o.f12366E = c3161n;
                    c3162o.f12370I = 4;
                    if (AbstractC37978j.m121656q(c31341l2, c3162o) == enumC31071a) {
                        return c3161n;
                    }
                }
                return enumC31071a;
            } catch (Throwable th3) {
                th = th3;
                c31341l2 = c31341l;
                c3162o.f12371w = null;
                c3162o.f12372x = null;
                c3162o.f12373y = null;
                c3162o.f12374z = null;
                c3162o.f12366E = th;
                c3162o.f12370I = 5;
                if (AbstractC37978j.m121656q(c31341l2, c3162o) == enumC31071a) {
                    throw th;
                }
            }
        } else {
            if (i14 != 3) {
                if (i14 == 4) {
                    C3161n c3161n2 = (C3161n) c3162o.f12366E;
                    AbstractC34132o.m107864I(objM74907b);
                    return c3161n2;
                }
                if (i14 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th4 = (Throwable) c3162o.f12366E;
                AbstractC34132o.m107864I(objM74907b);
                throw th4;
            }
            j7 = c3162o.f12367F;
            c31341l2 = c3162o.f12374z;
            c34912a3 = c3162o.f12371w;
            try {
                AbstractC34132o.m107864I(objM74907b);
                bArr = (byte[]) objM74907b;
                if (bArr == null) {
                    throw new EC2MetadataError(C25500t.f99849c, "No token provided in IMDS response");
                }
                c34912a3.getClass();
                C33647p c33647p2 = C34913b.f147015x;
                C34913b c34913bM106274t2 = C33647p.m106274t();
                Duration.Companion companion2 = Duration.INSTANCE;
                c3161n = new C3161n(bArr, c34913bM106274t2.m110115d(DurationKt.toDuration(j7, DurationUnit.SECONDS)));
                c3162o.f12371w = null;
                c3162o.f12372x = null;
                c3162o.f12373y = null;
                c3162o.f12374z = null;
                c3162o.f12366E = c3161n;
                c3162o.f12370I = 4;
                if (AbstractC37978j.m121656q(c31341l2, c3162o) == enumC31071a) {
                    return enumC31071a;
                }
                return c3161n;
            } catch (Throwable th5) {
                th = th5;
                c3162o.f12371w = null;
                c3162o.f12372x = null;
                c3162o.f12373y = null;
                c3162o.f12374z = null;
                c3162o.f12366E = th;
                c3162o.f12370I = 5;
                if (AbstractC37978j.m121656q(c31341l2, c3162o) == enumC31071a) {
                    throw th;
                }
            }
        }
        AbstractC31834n.m98902k(new C34894u(new C12002a(), c35937b), (C13140a) objM74907b);
        C25501u c25501u = c3164q.f12380w;
        c3162o.f12371w = c34912a2;
        c3162o.f12372x = interfaceC27910g;
        c3162o.f12373y = null;
        c3162o.f12370I = 2;
        objM74907b = c25501u.m74907b(new C12002a(), c35937b.m114177b(), c3162o);
        if (objM74907b != enumC31071a) {
            interfaceC27910g2 = interfaceC27910g;
            c31341l = (C31341l) objM74907b;
            interfaceC27910g2.mo394s(null, new C3152e(c31341l, i15));
            c37236a = c31341l.f128964x;
            c25500t = c37236a.f159235a;
            c25500t2 = C25500t.f99849c;
            if (c25500t.equals(c25500t2)) {
                if (c25500t.equals(C25500t.f99851e)) {
                    str = "Request forbidden: IMDS is disabled or the caller has insufficient permissions.";
                } else {
                    str = "Failed to retrieve IMDS token";
                }
                throw new EC2MetadataError(c25500t, str);
            }
            str2 = (String) c37236a.f159236b.get("x-aws-ec2-metadata-token-ttl-seconds");
            if (str2 != null) {
                throw new EC2MetadataError(c25500t2, "No TTL provided in IMDS response");
            }
            j7 = Long.parseLong(str2);
            AbstractC25492l abstractC25492l2 = c37236a.f159237c;
            c3162o.f12371w = c34912a2;
            c3162o.f12372x = null;
            c3162o.f12373y = null;
            c3162o.f12374z = c31341l;
            c3162o.f12367F = j7;
            c3162o.f12370I = 3;
            serializableM121450B = AbstractC37926s0.m121450B(abstractC25492l2, c3162o);
            if (serializableM121450B != enumC31071a) {
                c31341l2 = c31341l;
                objM74907b = serializableM121450B;
                c34912a3 = c34912a2;
                bArr = (byte[]) objM74907b;
                if (bArr == null) {
                    throw new EC2MetadataError(C25500t.f99849c, "No token provided in IMDS response");
                }
                c34912a3.getClass();
                C33647p c33647p3 = C34913b.f147015x;
                C34913b c34913bM106274t3 = C33647p.m106274t();
                Duration.Companion companion3 = Duration.INSTANCE;
                c3161n = new C3161n(bArr, c34913bM106274t3.m110115d(DurationKt.toDuration(j7, DurationUnit.SECONDS)));
                c3162o.f12371w = null;
                c3162o.f12372x = null;
                c3162o.f12373y = null;
                c3162o.f12374z = null;
                c3162o.f12366E = c3161n;
                c3162o.f12370I = 4;
                if (AbstractC37978j.m121656q(c31341l2, c3162o) == enumC31071a) {
                    return c3161n;
                }
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object mo9062d(C34894u c34894u, InterfaceC30057d interfaceC30057d) throws Throwable {
        C3163p c3163p;
        if (interfaceC30057d instanceof C3163p) {
            c3163p = (C3163p) interfaceC30057d;
            int i13 = c3163p.f12378z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3163p.f12378z = i13 - Integer.MIN_VALUE;
            } else {
                c3163p = new C3163p(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c3163p = new C3163p(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM114203b = c3163p.f12376x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c3163p.f12378z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM114203b);
            C0351c c0351c = new C0351c(this, c34894u, null, 3);
            c3163p.f12375w = c34894u;
            c3163p.f12378z = 1;
            objM114203b = this.f12379E.m114203b(c0351c, c3163p);
            if (objM114203b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c34894u = c3163p.f12375w;
            AbstractC34132o.m107864I(objM114203b);
        }
        ((C35937b) c34894u.f146959b).f153017y.m386f(AbstractC39421y.m125916A(((C3161n) objM114203b).f12364a), "x-aws-ec2-metadata-token");
        return c34894u;
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: c */
    public final void mo9061c(C25126d c25126d) {
        C0855e c0855e = (C0855e) ((C20245d) c25126d.f98484x).f76047c;
        EnumC0856f enumC0856f = EnumC0856f.f3061w;
        c0855e.getClass();
        c0855e.m2064c(new C0855e(this, 0), EnumC0856f.f3062x);
    }
}
