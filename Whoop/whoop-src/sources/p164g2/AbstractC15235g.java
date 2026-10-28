package p164g2;

import androidx.compose.p018ui.node.NodeCoordinator;
import e93.AbstractC12889b;
import i93.C18284j;
import m83.AbstractC25260n;
import no.nordicsemi.android.dfu.DfuBaseService;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0233o;
import p005a3.C0223l1;
import p005a3.C0224l2;
import p005a3.C0230n0;
import p014aj.C0929d;
import p021av.C2088b;
import p026b2.AbstractC2316v;
import p028b4.C2696g;
import p181h2.C16618c;
import p389p0.C28532k;
import p389p0.C28536m;
import p389p0.C28538n;
import p446r1.C30849c;
import p603x2.AbstractC37831a;
import p635y2.AbstractC39093g;
import p635y2.AbstractC39125q1;
import p636y3.EnumC39181m;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;

/* JADX INFO: renamed from: g2.g */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15235g {

    /* JADX INFO: renamed from: a */
    public static final int[] f57232a = new int[2];

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: A */
    public static final EnumC15230b m43301A(C15252x c15252x, int i13) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C15252x c15252xM43327q = m43327q(c15252x);
                if (c15252xM43327q == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                EnumC15230b enumC15230bM43301A = m43301A(c15252xM43327q, i13);
                EnumC15230b enumC15230b = EnumC15230b.f57224w;
                if (enumC15230bM43301A == enumC15230b) {
                    enumC15230bM43301A = null;
                }
                if (enumC15230bM43301A != null) {
                    return enumC15230bM43301A;
                }
                if (c15252x.f57276P) {
                    return enumC15230b;
                }
                c15252x.f57276P = true;
                try {
                    C15243o c15243oM43357Y0 = c15252x.m43357Y0();
                    C15228a c15228a = new C15228a(i13);
                    InterfaceC15239k focusOwner = AbstractC0201g.m517q(c15252x).getFocusOwner();
                    C15252x c15252x2 = ((C15240l) focusOwner).f57246h;
                    c15243oM43357Y0.f57262k.invoke(c15228a);
                    C15252x c15252x3 = ((C15240l) focusOwner).f57246h;
                    if (c15228a.f57223b) {
                        C15247s c15247s = C15247s.f57265b;
                        return EnumC15230b.f57225x;
                    }
                    if (c15252x2 == c15252x3 || c15252x3 == null) {
                        return enumC15230b;
                    }
                    return C15247s.f57267d == C15247s.f57266c ? EnumC15230b.f57225x : EnumC15230b.f57226y;
                } finally {
                    c15252x.f57276P = false;
                }
            }
            if (iOrdinal == 2) {
                return EnumC15230b.f57225x;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return EnumC15230b.f57224w;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: B */
    public static final EnumC15230b m43302B(C15252x c15252x, int i13) {
        if (!c15252x.f57277Q) {
            c15252x.f57277Q = true;
            try {
                C15243o c15243oM43357Y0 = c15252x.m43357Y0();
                C15228a c15228a = new C15228a(i13);
                InterfaceC15239k focusOwner = AbstractC0201g.m517q(c15252x).getFocusOwner();
                C15252x c15252x2 = ((C15240l) focusOwner).f57246h;
                c15243oM43357Y0.f57261j.invoke(c15228a);
                C15252x c15252x3 = ((C15240l) focusOwner).f57246h;
                if (c15228a.f57223b) {
                    C15247s c15247s = C15247s.f57265b;
                    return EnumC15230b.f57225x;
                }
                if (c15252x2 != c15252x3 && c15252x3 != null) {
                    return C15247s.f57267d == C15247s.f57266c ? EnumC15230b.f57225x : EnumC15230b.f57226y;
                }
            } finally {
                c15252x.f57277Q = false;
            }
        }
        return EnumC15230b.f57224w;
    }

    /* JADX INFO: renamed from: C */
    public static final EnumC15230b m43303C(C15252x c15252x, int i13) {
        AbstractC2316v abstractC2316vM504d;
        C0223l1 c0223l1;
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C15252x c15252xM43327q = m43327q(c15252x);
                if (c15252xM43327q != null) {
                    return m43301A(c15252xM43327q, i13);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!c15252x.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                AbstractC2316v abstractC2316v = c15252x.f9142w.f9132E;
                C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
                loop0: while (true) {
                    if (c0230n0M516p == null) {
                        abstractC2316vM504d = null;
                        break;
                    }
                    if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        while (abstractC2316v != null) {
                            if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC2316vM504d = abstractC2316v;
                                C30849c c30849c = null;
                                while (abstractC2316vM504d != null) {
                                    if (abstractC2316vM504d instanceof C15252x) {
                                        break loop0;
                                    }
                                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                        int i14 = 0;
                                        for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                            if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    abstractC2316vM504d = abstractC2316v2;
                                                } else {
                                                    if (c30849c == null) {
                                                        c30849c = new C30849c(new AbstractC2316v[16]);
                                                    }
                                                    if (abstractC2316vM504d != null) {
                                                        c30849c.m94885b(abstractC2316vM504d);
                                                        abstractC2316vM504d = null;
                                                    }
                                                    c30849c.m94885b(abstractC2316v2);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                }
                            }
                            abstractC2316v = abstractC2316v.f9132E;
                        }
                    }
                    c0230n0M516p = c0230n0M516p.m588G();
                    abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
                }
                C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                if (c15252x2 == null) {
                    return EnumC15230b.f57224w;
                }
                int iOrdinal2 = c15252x2.m43358Z0().ordinal();
                if (iOrdinal2 == 0) {
                    return m43302B(c15252x2, i13);
                }
                if (iOrdinal2 == 1) {
                    return m43303C(c15252x2, i13);
                }
                if (iOrdinal2 == 2) {
                    return EnumC15230b.f57225x;
                }
                if (iOrdinal2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                EnumC15230b enumC15230bM43303C = m43303C(c15252x2, i13);
                EnumC15230b enumC15230b = enumC15230bM43303C != EnumC15230b.f57224w ? enumC15230bM43303C : null;
                return enumC15230b == null ? m43302B(c15252x2, i13) : enumC15230b;
            }
        }
        return EnumC15230b.f57224w;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fc A[ADDED_TO_REGION, LOOP:9: B:143:0x01fc->B:150:0x020e, LOOP_START, PHI: r12
      0x01fc: PHI (r12v3 int) = (r12v2 int), (r12v4 int) binds: [B:142:0x01fa, B:150:0x020e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x0209  */
    /* JADX WARN: Code duplicated, block: B:149:0x020c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0216  */
    /* JADX WARN: Code duplicated, block: B:154:0x021b  */
    /* JADX WARN: Code duplicated, block: B:158:0x0227 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:194:0x019e A[SYNTHETIC] */
    /* JADX INFO: renamed from: D */
    public static final boolean m43304D(C15252x c15252x) {
        C30849c c30849c;
        int i13;
        C15252x c15252x2;
        EnumC15251w enumC15251w;
        C0223l1 c0223l1;
        char c3;
        C0223l1 c0223l2;
        C15240l c15240l = (C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner();
        C15252x c15252x3 = c15240l.f57246h;
        EnumC15251w enumC15251wM43358Z0 = c15252x.m43358Z0();
        if (c15252x3 == c15252x) {
            c15252x.m43356X0(enumC15251wM43358Z0, enumC15251wM43358Z0);
            return true;
        }
        int i14 = 0;
        if (c15252x3 == null && !((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57239a.m3576H()) {
            return false;
        }
        char c7 = 16;
        if (c15252x3 != null) {
            c30849c = new C30849c(new C15252x[16]);
            if (!c15252x3.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v = c15252x3.f9142w.f9132E;
            C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x3);
            while (c0230n0M516p != null) {
                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    while (abstractC2316v != null) {
                        if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            AbstractC2316v abstractC2316vM504d = abstractC2316v;
                            C30849c c30849c2 = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    c30849c.m94885b((C15252x) abstractC2316vM504d);
                                } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i15 = 0;
                                    for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                        if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                abstractC2316vM504d = abstractC2316v2;
                                            } else {
                                                if (c30849c2 == null) {
                                                    c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c2.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c2.m94885b(abstractC2316v2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                            }
                        }
                        abstractC2316v = abstractC2316v.f9132E;
                    }
                }
                c0230n0M516p = c0230n0M516p.m588G();
                abstractC2316v = (c0230n0M516p == null || (c0223l2 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l2.f742f;
            }
        } else {
            c30849c = null;
        }
        Object[] objArr = new C15252x[16];
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v3 = c15252x.f9142w.f9132E;
        C0230n0 c0230n0M516p2 = AbstractC0201g.m516p(c15252x);
        int i16 = 1;
        int i17 = 0;
        while (c0230n0M516p2 != null) {
            if ((((AbstractC2316v) c0230n0M516p2.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                while (abstractC2316v3 != null) {
                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        AbstractC2316v abstractC2316vM504d2 = abstractC2316v3;
                        C30849c c30849c3 = null;
                        while (abstractC2316vM504d2 != null) {
                            if (abstractC2316vM504d2 instanceof C15252x) {
                                C15252x c15252x4 = (C15252x) abstractC2316vM504d2;
                                Boolean boolValueOf = c30849c != null ? Boolean.valueOf(c30849c.m94893k(c15252x4)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    int i18 = i17 + 1;
                                    if (objArr.length < i18) {
                                        int length = objArr.length;
                                        Object[] objArr2 = new Object[Math.max(i18, length * 2)];
                                        System.arraycopy(objArr, i14, objArr2, i14, length);
                                        objArr = objArr2;
                                    }
                                    objArr[i17] = c15252x4;
                                    i17 = i18;
                                }
                                if (c15252x4 == c15252x3) {
                                    i16 = i14;
                                }
                            } else {
                                if ((abstractC2316vM504d2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d2 instanceof AbstractC0233o)) {
                                    int i19 = i14;
                                    for (AbstractC2316v abstractC2316v4 = ((AbstractC0233o) abstractC2316vM504d2).f804P; abstractC2316v4 != null; abstractC2316v4 = abstractC2316v4.f9133F) {
                                        if ((abstractC2316v4.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i19++;
                                            if (i19 == 1) {
                                                abstractC2316vM504d2 = abstractC2316v4;
                                            } else {
                                                if (c30849c3 == null) {
                                                    c30849c3 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d2 != null) {
                                                    c30849c3.m94885b(abstractC2316vM504d2);
                                                    abstractC2316vM504d2 = null;
                                                }
                                                c30849c3.m94885b(abstractC2316v4);
                                            }
                                        }
                                    }
                                    c3 = 16;
                                    if (i19 == 1) {
                                        c7 = 16;
                                    }
                                    i14 = 0;
                                }
                                abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c3);
                                c7 = c3;
                                i14 = 0;
                            }
                            c3 = 16;
                            abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c3);
                            c7 = c3;
                            i14 = 0;
                        }
                    }
                    abstractC2316v3 = abstractC2316v3.f9132E;
                    c7 = c7;
                    i14 = 0;
                }
            }
            char c14 = c7;
            c0230n0M516p2 = c0230n0M516p2.m588G();
            abstractC2316v3 = (c0230n0M516p2 == null || (c0223l1 = c0230n0M516p2.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
            c7 = c14;
            i14 = 0;
        }
        if (i16 == 0 || c15252x3 == null || m43315e(c15252x3, false)) {
            AbstractC0201g.m512l(c15252x, new C2088b(c15252x, 19));
            int iOrdinal = c15252x.m43358Z0().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).m43346i(c15252x);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).m43346i(c15252x);
                }
            }
            if (c30849c != null) {
                int i24 = c30849c.f127229y - 1;
                Object[] objArr3 = c30849c.f127227w;
                if (i24 < objArr3.length) {
                    while (i24 >= 0) {
                        C15252x c15252x5 = (C15252x) objArr3[i24];
                        if (c15240l.f57246h == c15252x) {
                            c15252x5.m43356X0(EnumC15251w.f57272x, EnumC15251w.f57274z);
                            i24--;
                        }
                    }
                    i13 = i17 - 1;
                    if (i13 < objArr.length) {
                        while (i13 >= 0) {
                            c15252x2 = (C15252x) objArr[i13];
                            if (c15240l.f57246h == c15252x) {
                                if (c15252x2 == c15252x3) {
                                    enumC15251w = EnumC15251w.f57271w;
                                } else {
                                    enumC15251w = EnumC15251w.f57274z;
                                }
                                c15252x2.m43356X0(enumC15251w, EnumC15251w.f57272x);
                                i13--;
                            }
                        }
                        if (c15240l.f57246h == c15252x) {
                            c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                            if (c15240l.f57246h != c15252x) {
                                return true;
                            }
                        }
                    } else if (c15240l.f57246h == c15252x) {
                        c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                        if (c15240l.f57246h != c15252x) {
                            return true;
                        }
                    }
                } else {
                    i13 = i17 - 1;
                    if (i13 < objArr.length) {
                        while (i13 >= 0) {
                            c15252x2 = (C15252x) objArr[i13];
                            if (c15240l.f57246h == c15252x) {
                                if (c15252x2 == c15252x3) {
                                    enumC15251w = EnumC15251w.f57271w;
                                } else {
                                    enumC15251w = EnumC15251w.f57274z;
                                }
                                c15252x2.m43356X0(enumC15251w, EnumC15251w.f57272x);
                                i13--;
                            }
                        }
                        if (c15240l.f57246h == c15252x) {
                            c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                            if (c15240l.f57246h != c15252x) {
                                return true;
                            }
                        }
                    } else if (c15240l.f57246h == c15252x) {
                        c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                        if (c15240l.f57246h != c15252x) {
                            return true;
                        }
                    }
                }
            } else {
                i13 = i17 - 1;
                if (i13 < objArr.length) {
                    while (i13 >= 0) {
                        c15252x2 = (C15252x) objArr[i13];
                        if (c15240l.f57246h == c15252x) {
                            if (c15252x2 == c15252x3) {
                                enumC15251w = EnumC15251w.f57271w;
                            } else {
                                enumC15251w = EnumC15251w.f57274z;
                            }
                            c15252x2.m43356X0(enumC15251w, EnumC15251w.f57272x);
                            i13--;
                        }
                    }
                    if (c15240l.f57246h == c15252x) {
                        c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                        if (c15240l.f57246h != c15252x) {
                            return true;
                        }
                    }
                } else if (c15240l.f57246h == c15252x) {
                    c15252x.m43356X0(enumC15251wM43358Z0, EnumC15251w.f57271w);
                    if (c15240l.f57246h != c15252x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static final boolean m43305E(C15252x c15252x, C2696g c2696g) {
        Object[] objArr = new C15252x[16];
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitChildren called on an unattached node");
        }
        C30849c c30849c = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v = c15252x.f9142w;
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        if (abstractC2316v2 == null) {
            AbstractC0201g.m501a(c30849c, abstractC2316v);
        } else {
            c30849c.m94885b(abstractC2316v2);
        }
        int i13 = 0;
        while (true) {
            int i14 = c30849c.f127229y;
            if (i14 == 0) {
                break;
            }
            AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c.m94894l(i14 - 1);
            if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                AbstractC0201g.m501a(c30849c, abstractC2316vM504d);
            } else {
                while (abstractC2316vM504d != null) {
                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        C30849c c30849c2 = null;
                        while (abstractC2316vM504d != null) {
                            if (abstractC2316vM504d instanceof C15252x) {
                                C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                int i15 = i13 + 1;
                                if (objArr.length < i15) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i15, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i13] = c15252x2;
                                i13 = i15;
                            } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                int i16 = 0;
                                for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            abstractC2316vM504d = abstractC2316v3;
                                        } else {
                                            if (c30849c2 == null) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d != null) {
                                                c30849c2.m94885b(abstractC2316vM504d);
                                                abstractC2316vM504d = null;
                                            }
                                            c30849c2.m94885b(abstractC2316v3);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                        }
                        break;
                    }
                    abstractC2316vM504d = abstractC2316vM504d.f9133F;
                }
            }
        }
        AbstractC25260n.m74040P0(objArr, C15253y.f57279w, 0, i13);
        int i17 = i13 - 1;
        if (i17 < objArr.length) {
            while (i17 >= 0) {
                C15252x c15252x3 = (C15252x) objArr[i17];
                if (m43336z(c15252x3) && m43311a(c15252x3, c2696g)) {
                    return true;
                }
                i17--;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m43306F(C15252x c15252x, C2696g c2696g) {
        Object[] objArr = new C15252x[16];
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitChildren called on an unattached node");
        }
        C30849c c30849c = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v = c15252x.f9142w;
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        if (abstractC2316v2 == null) {
            AbstractC0201g.m501a(c30849c, abstractC2316v);
        } else {
            c30849c.m94885b(abstractC2316v2);
        }
        int i13 = 0;
        while (true) {
            int i14 = c30849c.f127229y;
            if (i14 == 0) {
                break;
            }
            AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c.m94894l(i14 - 1);
            if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                AbstractC0201g.m501a(c30849c, abstractC2316vM504d);
            } else {
                while (abstractC2316vM504d != null) {
                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        C30849c c30849c2 = null;
                        while (abstractC2316vM504d != null) {
                            if (abstractC2316vM504d instanceof C15252x) {
                                C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                int i15 = i13 + 1;
                                if (objArr.length < i15) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i15, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i13] = c15252x2;
                                i13 = i15;
                            } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                int i16 = 0;
                                for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            abstractC2316vM504d = abstractC2316v3;
                                        } else {
                                            if (c30849c2 == null) {
                                                c30849c2 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d != null) {
                                                c30849c2.m94885b(abstractC2316vM504d);
                                                abstractC2316vM504d = null;
                                            }
                                            c30849c2.m94885b(abstractC2316v3);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                        }
                        break;
                    }
                    abstractC2316vM504d = abstractC2316vM504d.f9133F;
                }
            }
        }
        AbstractC25260n.m74040P0(objArr, C15253y.f57279w, 0, i13);
        for (int i17 = 0; i17 < i13; i17++) {
            C15252x c15252x3 = (C15252x) objArr[i17];
            if (m43336z(c15252x3) && m43323m(c15252x3, c2696g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b7 A[PHI: r0
      0x00b7: PHI (r0v11 int) = (r0v6 int), (r0v7 int), (r0v8 int), (r0v9 int) binds: [B:54:0x00b5, B:57:0x00ba, B:60:0x00be, B:63:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: G */
    public static final Object m43307G(C15252x c15252x, int i13, Function1 function1) {
        int i14;
        int i15;
        Object objInvoke;
        AbstractC2316v abstractC2316vM504d;
        C28538n c28538n;
        C0223l1 c0223l1;
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitAncestors called on an unattached node");
        }
        AbstractC2316v abstractC2316v = c15252x.f9142w.f9132E;
        C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252x);
        loop0: while (true) {
            i14 = 0;
            i15 = 1;
            objInvoke = null;
            if (c0230n0M516p == null) {
                abstractC2316vM504d = null;
                break;
            }
            if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                while (abstractC2316v != null) {
                    if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        abstractC2316vM504d = abstractC2316v;
                        C30849c c30849c = null;
                        while (abstractC2316vM504d != null) {
                            if (abstractC2316vM504d instanceof C15252x) {
                                break loop0;
                            }
                            if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                int i16 = 0;
                                for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                    if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i16++;
                                        if (i16 == 1) {
                                            abstractC2316vM504d = abstractC2316v2;
                                        } else {
                                            if (c30849c == null) {
                                                c30849c = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d != null) {
                                                c30849c.m94885b(abstractC2316vM504d);
                                                abstractC2316vM504d = null;
                                            }
                                            c30849c.m94885b(abstractC2316v2);
                                        }
                                    }
                                }
                                if (i16 == 1) {
                                }
                            }
                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                        }
                    }
                    abstractC2316v = abstractC2316v.f9132E;
                }
            }
            c0230n0M516p = c0230n0M516p.m588G();
            abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
        }
        C15252x c15252x2 = (C15252x) abstractC2316vM504d;
        if ((c15252x2 != null && AbstractC22676k.m65745e((C28538n) c15252x2.mo464a(AbstractC39093g.m124620a()), (C28538n) c15252x.mo464a(AbstractC39093g.m124620a()))) || (c28538n = (C28538n) c15252x.mo464a(AbstractC39093g.m124620a())) == null) {
            return null;
        }
        int i17 = 5;
        if (i13 == 5) {
            i15 = i17;
        } else {
            i17 = 6;
            if (i13 == 6) {
                i15 = i17;
            } else {
                i17 = 3;
                if (i13 == 3) {
                    i15 = i17;
                } else {
                    i17 = 4;
                    if (i13 == 4) {
                        i15 = i17;
                    } else if (i13 == 1) {
                        i15 = 2;
                    } else if (i13 != 2) {
                        throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                    }
                }
            }
        }
        if (c28538n.f115458O.getItemCount() <= 0 || !c28538n.f115458O.mo77524b() || !c28538n.f9141N) {
            return function1.invoke(C28538n.f115457R);
        }
        int iMo77526d = c28538n.m86833Y0(i15) ? c28538n.f115458O.mo77526d() : c28538n.f115458O.mo77525c();
        C22669g0 c22669g0 = new C22669g0();
        C0929d c0929d = c28538n.f115459P;
        c0929d.getClass();
        C28532k c28532k = new C28532k(iMo77526d, iMo77526d);
        ((C30849c) c0929d.f3422w).m94885b(c28532k);
        c22669g0.f89336w = c28532k;
        int iMo77523a = c28538n.f115458O.mo77523a() * 2;
        int itemCount = c28538n.f115458O.getItemCount();
        if (iMo77523a > itemCount) {
            iMo77523a = itemCount;
        }
        while (objInvoke == null && c28538n.m86832X0((C28532k) c22669g0.f89336w, i15) && i14 < iMo77523a) {
            C28532k c28532k2 = (C28532k) c22669g0.f89336w;
            int i18 = c28532k2.f115445a;
            int i19 = c28532k2.f115446b;
            if (c28538n.m86833Y0(i15)) {
                i19++;
            } else {
                i18--;
            }
            C0929d c0929d2 = c28538n.f115459P;
            c0929d2.getClass();
            C28532k c28532k3 = new C28532k(i18, i19);
            ((C30849c) c0929d2.f3422w).m94885b(c28532k3);
            ((C30849c) c28538n.f115459P.f3422w).m94893k((C28532k) c22669g0.f89336w);
            c22669g0.f89336w = c28532k3;
            i14++;
            AbstractC0201g.m516p(c28538n).m630m();
            objInvoke = function1.invoke(new C28536m(c28538n, c22669g0, i15));
        }
        ((C30849c) c28538n.f115459P.f3422w).m94893k((C28532k) c22669g0.f89336w);
        AbstractC0201g.m516p(c28538n).m630m();
        return objInvoke;
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m43308H(int i13, C2696g c2696g, C15252x c15252x, C16618c c16618c) {
        C15252x c15252xM43319i;
        C30849c c30849c = new C30849c(new C15252x[16]);
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitChildren called on an unattached node");
        }
        C30849c c30849c2 = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v = c15252x.f9142w;
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        if (abstractC2316v2 == null) {
            AbstractC0201g.m501a(c30849c2, abstractC2316v);
        } else {
            c30849c2.m94885b(abstractC2316v2);
        }
        while (true) {
            int i14 = c30849c2.f127229y;
            if (i14 == 0) {
                break;
            }
            AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c2.m94894l(i14 - 1);
            if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                AbstractC0201g.m501a(c30849c2, abstractC2316vM504d);
            } else {
                while (abstractC2316vM504d != null) {
                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        C30849c c30849c3 = null;
                        while (abstractC2316vM504d != null) {
                            if (abstractC2316vM504d instanceof C15252x) {
                                C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                if (c15252x2.f9141N) {
                                    c30849c.m94885b(c15252x2);
                                }
                            } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                int i15 = 0;
                                for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            abstractC2316vM504d = abstractC2316v3;
                                        } else {
                                            if (c30849c3 == null) {
                                                c30849c3 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d != null) {
                                                c30849c3.m94885b(abstractC2316vM504d);
                                                abstractC2316vM504d = null;
                                            }
                                            c30849c3.m94885b(abstractC2316v3);
                                        }
                                    }
                                }
                                if (i15 == 1) {
                                }
                            }
                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c3);
                        }
                        break;
                    }
                    abstractC2316vM504d = abstractC2316vM504d.f9133F;
                }
            }
        }
        while (c30849c.f127229y != 0 && (c15252xM43319i = m43319i(c30849c, c16618c, i13)) != null) {
            if (c15252xM43319i.m43357Y0().f57252a) {
                return ((Boolean) c2696g.invoke(c15252xM43319i)).booleanValue();
            }
            if (m43325o(i13, c2696g, c15252xM43319i, c16618c)) {
                return true;
            }
            c30849c.m94893k(c15252xM43319i);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
      0x013a: PHI (r13v15 b2.v) = (r13v9 b2.v), (r13v16 b2.v) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    /* JADX INFO: renamed from: I */
    public static final boolean m43309I(C15252x c15252x, C15252x c15252x2, int i13, C2696g c2696g) {
        AbstractC2316v abstractC2316v;
        AbstractC2316v abstractC2316v2;
        C0230n0 c0230n0M516p;
        C0223l1 c0223l1;
        AbstractC2316v abstractC2316vM504d;
        C30849c c30849c;
        if (c15252x.m43358Z0() != EnumC15251w.f57272x) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new C15252x[16];
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitChildren called on an unattached node");
        }
        C30849c c30849c2 = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v3 = c15252x.f9142w;
        AbstractC2316v abstractC2316v4 = abstractC2316v3.f9133F;
        if (abstractC2316v4 == null) {
            AbstractC0201g.m501a(c30849c2, abstractC2316v3);
        } else {
            c30849c2.m94885b(abstractC2316v4);
        }
        int i14 = 0;
        while (true) {
            int i15 = c30849c2.f127229y;
            abstractC2316v = null;
            if (i15 == 0) {
                break;
            }
            AbstractC2316v abstractC2316vM504d2 = (AbstractC2316v) c30849c2.m94894l(i15 - 1);
            if ((abstractC2316vM504d2.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                AbstractC0201g.m501a(c30849c2, abstractC2316vM504d2);
            } else {
                while (abstractC2316vM504d2 != null) {
                    if ((abstractC2316vM504d2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        C30849c c30849c3 = null;
                        while (abstractC2316vM504d2 != null) {
                            if (abstractC2316vM504d2 instanceof C15252x) {
                                C15252x c15252x3 = (C15252x) abstractC2316vM504d2;
                                int i16 = i14 + 1;
                                if (objArr.length < i16) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i16, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i14] = c15252x3;
                                i14 = i16;
                            } else if ((abstractC2316vM504d2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d2 instanceof AbstractC0233o)) {
                                int i17 = 0;
                                for (AbstractC2316v abstractC2316v5 = ((AbstractC0233o) abstractC2316vM504d2).f804P; abstractC2316v5 != null; abstractC2316v5 = abstractC2316v5.f9133F) {
                                    if ((abstractC2316v5.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i17++;
                                        if (i17 == 1) {
                                            abstractC2316vM504d2 = abstractC2316v5;
                                        } else {
                                            if (c30849c3 == null) {
                                                c30849c3 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d2 != null) {
                                                c30849c3.m94885b(abstractC2316vM504d2);
                                                abstractC2316vM504d2 = null;
                                            }
                                            c30849c3.m94885b(abstractC2316v5);
                                        }
                                    }
                                }
                                if (i17 == 1) {
                                }
                            }
                            abstractC2316vM504d2 = AbstractC0201g.m504d(c30849c3);
                        }
                        break;
                    }
                    abstractC2316vM504d2 = abstractC2316vM504d2.f9133F;
                }
            }
        }
        AbstractC25260n.m74040P0(objArr, C15253y.f57279w, 0, i14);
        if (i13 != 1) {
            if (i13 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            C18284j c18284jM36278i0 = AbstractC12889b.m36278i0(0, i14);
            int i18 = c18284jM36278i0.f71133w;
            int i19 = c18284jM36278i0.f71134x;
            if (i18 <= i19) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        C15252x c15252x4 = (C15252x) objArr[i19];
                        if (m43336z(c15252x4) && m43311a(c15252x4, c2696g)) {
                            return true;
                        }
                    }
                    if (AbstractC22676k.m65745e(objArr[i19], c15252x2)) {
                        z4 = true;
                    }
                    if (i19 == i18) {
                        break;
                    }
                    i19--;
                }
            }
            if (i13 != 1) {
                if (!c15252x.f9142w.f9141N) {
                    AbstractC37831a.m121374b("visitAncestors called on an unattached node");
                }
                abstractC2316v2 = c15252x.f9142w.f9132E;
                c0230n0M516p = AbstractC0201g.m516p(c15252x);
                loop5: while (c0230n0M516p != null) {
                    if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        while (abstractC2316v2 != null) {
                            if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                abstractC2316vM504d = abstractC2316v2;
                                c30849c = null;
                                while (abstractC2316vM504d != null) {
                                    if (abstractC2316vM504d instanceof C15252x) {
                                        abstractC2316v = abstractC2316vM504d;
                                        break loop5;
                                    }
                                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                                    }
                                    abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                                }
                            }
                            abstractC2316v2 = abstractC2316v2.f9132E;
                        }
                    }
                    c0230n0M516p = c0230n0M516p.m588G();
                    if (c0230n0M516p != null) {
                    }
                }
                if (abstractC2316v != null) {
                    return ((Boolean) c2696g.invoke(c15252x)).booleanValue();
                }
            }
            return false;
        }
        C18284j c18284jM36278i1 = AbstractC12889b.m36278i0(0, i14);
        int i24 = c18284jM36278i1.f71133w;
        int i25 = c18284jM36278i1.f71134x;
        if (i24 <= i25) {
            boolean z13 = false;
            while (true) {
                if (z13) {
                    C15252x c15252x5 = (C15252x) objArr[i24];
                    if (m43336z(c15252x5) && m43323m(c15252x5, c2696g)) {
                        return true;
                    }
                }
                if (AbstractC22676k.m65745e(objArr[i24], c15252x2)) {
                    z13 = true;
                }
                if (i24 == i25) {
                    break;
                }
                i24++;
            }
        }
        if (i13 != 1 && c15252x.m43357Y0().f57252a) {
            if (!c15252x.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            abstractC2316v2 = c15252x.f9142w.f9132E;
            c0230n0M516p = AbstractC0201g.m516p(c15252x);
            loop5: while (c0230n0M516p != null) {
                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    while (abstractC2316v2 != null) {
                        if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            abstractC2316vM504d = abstractC2316v2;
                            c30849c = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    abstractC2316v = abstractC2316vM504d;
                                    break loop5;
                                }
                                if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i26 = 0;
                                    for (AbstractC2316v abstractC2316v6 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v6 != null; abstractC2316v6 = abstractC2316v6.f9133F) {
                                        if ((abstractC2316v6.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i26++;
                                            if (i26 == 1) {
                                                abstractC2316vM504d = abstractC2316v6;
                                            } else {
                                                if (c30849c == null) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c.m94885b(abstractC2316v6);
                                            }
                                        }
                                    }
                                    if (i26 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                        abstractC2316v2 = abstractC2316v2.f9132E;
                    }
                }
                c0230n0M516p = c0230n0M516p.m588G();
                abstractC2316v2 = (c0230n0M516p != null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
            }
            if (abstractC2316v != null) {
                return ((Boolean) c2696g.invoke(c15252x)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static final Boolean m43310J(int i13, C2696g c2696g, C15252x c15252x, C16618c c16618c) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C15252x c15252xM43327q = m43327q(c15252x);
                if (c15252xM43327q == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c15252xM43327q.m43358Z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolM43310J = m43310J(i13, c2696g, c15252xM43327q, c16618c);
                        if (!AbstractC22676k.m65745e(boolM43310J, Boolean.FALSE)) {
                            return boolM43310J;
                        }
                        if (c16618c == null) {
                            if (c15252xM43327q.m43358Z0() != EnumC15251w.f57272x) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            C15252x c15252xM43318h = m43318h(c15252xM43327q);
                            if (c15252xM43318h == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c16618c = m43321k(c15252xM43318h);
                        }
                        return Boolean.valueOf(m43325o(i13, c2696g, c15252x, c16618c));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c16618c == null) {
                    c16618c = m43321k(c15252xM43327q);
                }
                return Boolean.valueOf(m43325o(i13, c2696g, c15252x, c16618c));
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (c15252x.m43357Y0().f57252a) {
                    return (Boolean) c2696g.invoke(c15252x);
                }
                return c16618c == null ? Boolean.valueOf(m43320j(c15252x, i13, c2696g)) : Boolean.valueOf(m43308H(i13, c2696g, c15252x, c16618c));
            }
        }
        return Boolean.valueOf(m43320j(c15252x, i13, c2696g));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007c A[RETURN] */
    /* JADX INFO: renamed from: a */
    public static final boolean m43311a(C15252x c15252x, C2696g c2696g) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C15252x c15252xM43327q = m43327q(c15252x);
                if (c15252xM43327q == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = c15252xM43327q.m43358Z0().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (m43311a(c15252xM43327q, c2696g) || m43326p(c15252x, c15252xM43327q, 2, c2696g) || (c15252xM43327q.m43357Y0().f57252a && ((Boolean) c2696g.invoke(c15252xM43327q)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return m43326p(c15252x, c15252xM43327q, 2, c2696g);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!m43305E(c15252x, c2696g)) {
                    if (!(c15252x.m43357Y0().f57252a ? ((Boolean) c2696g.invoke(c15252x)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return m43305E(c15252x, c2696g);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m43312b(C16618c c16618c, C16618c c16618c2, C16618c c16618c3, int i13) {
        float f13;
        float f14;
        boolean zM43313c = m43313c(i13, c16618c3, c16618c);
        float f15 = c16618c3.f63940b;
        float f16 = c16618c3.f63942d;
        float f17 = c16618c3.f63939a;
        float f18 = c16618c3.f63941c;
        float f19 = c16618c.f63942d;
        float f24 = c16618c.f63940b;
        float f25 = c16618c.f63941c;
        float f26 = c16618c.f63939a;
        if (zM43313c || !m43313c(i13, c16618c2, c16618c)) {
            return false;
        }
        if (i13 == 3) {
            if (f26 < f18) {
                return true;
            }
        } else if (i13 == 4) {
            if (f25 > f17) {
                return true;
            }
        } else if (i13 == 5) {
            if (f24 < f16) {
                return true;
            }
        } else {
            if (i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f19 > f15) {
                return true;
            }
        }
        if (i13 == 3 || i13 == 4) {
            return true;
        }
        if (i13 == 3) {
            f13 = f26 - c16618c2.f63941c;
        } else if (i13 == 4) {
            f13 = c16618c2.f63939a - f25;
        } else if (i13 == 5) {
            f13 = f24 - c16618c2.f63942d;
        } else {
            if (i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f13 = c16618c2.f63940b - f19;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (i13 == 3) {
            f14 = f26 - f17;
        } else if (i13 == 4) {
            f14 = f18 - f25;
        } else if (i13 == 5) {
            f14 = f24 - f15;
        } else {
            if (i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f14 = f16 - f19;
        }
        if (f14 < 1.0f) {
            f14 = 1.0f;
        }
        return f13 < f14;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m43313c(int i13, C16618c c16618c, C16618c c16618c2) {
        if (i13 == 3 || i13 == 4) {
            return c16618c.f63942d > c16618c2.f63940b && c16618c.f63940b < c16618c2.f63942d;
        }
        if (i13 == 5 || i13 == 6) {
            return c16618c.f63941c > c16618c2.f63939a && c16618c.f63939a < c16618c2.f63941c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m43314d(C15252x c15252x) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal == 0) {
            C15240l c15240l = (C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner();
            if (c15240l.f57246h == null) {
                AbstractC37831a.m121373a("Cannot capture focus when the active focus target node is unset");
            }
            c15240l.f57247i = true;
            c15252x.m43356X0(EnumC15251w.f57271w, EnumC15251w.f57273y);
            return true;
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m43315e(C15252x c15252x, boolean z4) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal == 0) {
            ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).m43346i(null);
            c15252x.m43356X0(EnumC15251w.f57271w, EnumC15251w.f57274z);
            return true;
        }
        if (iOrdinal == 1) {
            C15252x c15252xM43327q = m43327q(c15252x);
            if (!(c15252xM43327q != null ? m43315e(c15252xM43327q, z4) : true)) {
                return false;
            }
            c15252x.m43356X0(EnumC15251w.f57272x, EnumC15251w.f57274z);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (z4) {
            ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).m43346i(null);
            c15252x.m43356X0(EnumC15251w.f57273y, EnumC15251w.f57274z);
        }
        return z4;
    }

    /* JADX INFO: renamed from: f */
    public static final void m43316f(C15252x c15252x, C30849c c30849c) {
        if (!c15252x.f9142w.f9141N) {
            AbstractC37831a.m121374b("visitChildren called on an unattached node");
        }
        C30849c c30849c2 = new C30849c(new AbstractC2316v[16]);
        AbstractC2316v abstractC2316v = c15252x.f9142w;
        AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
        if (abstractC2316v2 == null) {
            AbstractC0201g.m501a(c30849c2, abstractC2316v);
        } else {
            c30849c2.m94885b(abstractC2316v2);
        }
        while (true) {
            int i13 = c30849c2.f127229y;
            if (i13 == 0) {
                return;
            }
            AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c2.m94894l(i13 - 1);
            if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                AbstractC0201g.m501a(c30849c2, abstractC2316vM504d);
            } else {
                while (abstractC2316vM504d != null) {
                    if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                        C30849c c30849c3 = null;
                        while (abstractC2316vM504d != null) {
                            if (abstractC2316vM504d instanceof C15252x) {
                                C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                if (c15252x2.f9141N && !AbstractC0201g.m516p(c15252x2).f793o0) {
                                    if (c15252x2.m43357Y0().f57252a) {
                                        c30849c.m94885b(c15252x2);
                                    } else {
                                        m43316f(c15252x2, c30849c);
                                    }
                                }
                            } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                int i14 = 0;
                                for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                    if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            abstractC2316vM504d = abstractC2316v3;
                                        } else {
                                            if (c30849c3 == null) {
                                                c30849c3 = new C30849c(new AbstractC2316v[16]);
                                            }
                                            if (abstractC2316vM504d != null) {
                                                c30849c3.m94885b(abstractC2316vM504d);
                                                abstractC2316vM504d = null;
                                            }
                                            c30849c3.m94885b(abstractC2316v3);
                                        }
                                    }
                                }
                                if (i14 == 1) {
                                }
                            }
                            abstractC2316vM504d = AbstractC0201g.m504d(c30849c3);
                        }
                        break;
                    }
                    abstractC2316vM504d = abstractC2316vM504d.f9133F;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.m] */
    /* JADX INFO: renamed from: g */
    public static final C15247s m43317g(C15252x c15252x, int i13, EnumC39181m enumC39181m) {
        C15247s c15247s;
        C15243o c15243oM43357Y0 = c15252x.m43357Y0();
        C15247s c15247s2 = c15243oM43357Y0.f57259h;
        C15247s c15247s3 = c15243oM43357Y0.f57260i;
        if (i13 == 1) {
            return c15243oM43357Y0.f57253b;
        }
        if (i13 == 2) {
            return c15243oM43357Y0.f57254c;
        }
        if (i13 == 5) {
            return c15243oM43357Y0.f57255d;
        }
        if (i13 == 6) {
            return c15243oM43357Y0.f57256e;
        }
        if (i13 == 3) {
            int iOrdinal = enumC39181m.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c15247s2 = c15247s3;
            }
            c15247s = c15247s2 != C15247s.f57265b ? c15247s2 : null;
            return c15247s == null ? c15243oM43357Y0.f57257f : c15247s;
        }
        if (i13 == 4) {
            int iOrdinal2 = enumC39181m.ordinal();
            if (iOrdinal2 == 0) {
                c15247s2 = c15247s3;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            c15247s = c15247s2 != C15247s.f57265b ? c15247s2 : null;
            return c15247s == null ? c15243oM43357Y0.f57258g : c15247s;
        }
        if (i13 != 7 && i13 != 8) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        C15228a c15228a = new C15228a(i13);
        C15240l c15240l = (C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner();
        C15252x c15252x2 = c15240l.f57246h;
        if (i13 == 7) {
            c15243oM43357Y0.f57261j.invoke(c15228a);
        } else {
            c15243oM43357Y0.f57262k.invoke(c15228a);
        }
        if (c15228a.f57223b) {
            return C15247s.f57266c;
        }
        return c15252x2 != c15240l.f57246h ? C15247s.f57267d : C15247s.f57265b;
    }

    /* JADX INFO: renamed from: h */
    public static final C15252x m43318h(C15252x c15252x) {
        C15252x c15252x2 = ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57246h;
        if (c15252x2 == null || !c15252x2.f9141N) {
            return null;
        }
        return c15252x2;
    }

    /* JADX INFO: renamed from: i */
    public static final C15252x m43319i(C30849c c30849c, C16618c c16618c, int i13) {
        C16618c c16618cM47205k;
        if (i13 == 3) {
            c16618cM47205k = c16618c.m47205k((c16618c.f63941c - c16618c.f63939a) + 1, 0.0f);
        } else if (i13 == 4) {
            c16618cM47205k = c16618c.m47205k(-((c16618c.f63941c - c16618c.f63939a) + 1), 0.0f);
        } else if (i13 == 5) {
            c16618cM47205k = c16618c.m47205k(0.0f, (c16618c.f63942d - c16618c.f63940b) + 1);
        } else {
            if (i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            c16618cM47205k = c16618c.m47205k(0.0f, -((c16618c.f63942d - c16618c.f63940b) + 1));
        }
        Object[] objArr = c30849c.f127227w;
        int i14 = c30849c.f127229y;
        C15252x c15252x = null;
        for (int i15 = 0; i15 < i14; i15++) {
            C15252x c15252x2 = (C15252x) objArr[i15];
            if (m43336z(c15252x2)) {
                C16618c c16618cM43321k = m43321k(c15252x2);
                if (m43333w(c16618cM43321k, c16618cM47205k, c16618c, i13)) {
                    c15252x = c15252x2;
                    c16618cM47205k = c16618cM43321k;
                }
            }
        }
        return c15252x;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m43320j(C15252x c15252x, int i13, Function1 function1) {
        C16618c c16618c;
        C30849c c30849c = new C30849c(new C15252x[16]);
        m43316f(c15252x, c30849c);
        int i14 = c30849c.f127229y;
        if (i14 <= 1) {
            C15252x c15252x2 = (C15252x) (i14 == 0 ? null : c30849c.f127227w[0]);
            if (c15252x2 != null) {
                return ((Boolean) function1.invoke(c15252x2)).booleanValue();
            }
        } else {
            if (i13 == 7) {
                i13 = 4;
            }
            if (i13 == 4 || i13 == 6) {
                C16618c c16618cM43321k = m43321k(c15252x);
                float f13 = c16618cM43321k.f63939a;
                float f14 = c16618cM43321k.f63940b;
                c16618c = new C16618c(f13, f14, f13, f14);
            } else {
                if (i13 != 3 && i13 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                C16618c c16618cM43321k2 = m43321k(c15252x);
                float f15 = c16618cM43321k2.f63941c;
                float f16 = c16618cM43321k2.f63942d;
                c16618c = new C16618c(f15, f16, f15, f16);
            }
            C15252x c15252xM43319i = m43319i(c30849c, c16618c, i13);
            if (c15252xM43319i != null) {
                return ((Boolean) function1.invoke(c15252xM43319i)).booleanValue();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static final C16618c m43321k(C15252x c15252x) {
        NodeCoordinator nodeCoordinator = c15252x.f9135H;
        return nodeCoordinator != null ? AbstractC39125q1.m124662h(nodeCoordinator).mo3547r(nodeCoordinator, false) : C16618c.f63938e;
    }

    /* JADX INFO: renamed from: l */
    public static final Boolean m43322l(C15252x c15252x, int i13, EnumC39181m enumC39181m, C16618c c16618c, C2696g c2696g) {
        boolean zM43311a;
        C0223l1 c0223l1;
        if (i13 == 1 || i13 == 2) {
            if (i13 == 1) {
                zM43311a = m43323m(c15252x, c2696g);
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("This function should only be used for 1-D focus search");
                }
                zM43311a = m43311a(c15252x, c2696g);
            }
            return Boolean.valueOf(zM43311a);
        }
        int i14 = 3;
        if (i13 == 3 || i13 == 4 || i13 == 5 || i13 == 6) {
            return m43310J(i13, c2696g, c15252x, c16618c);
        }
        Object obj = null;
        if (i13 == 7) {
            int iOrdinal = enumC39181m.ordinal();
            if (iOrdinal == 0) {
                i14 = 4;
            } else if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            C15252x c15252xM43318h = m43318h(c15252x);
            if (c15252xM43318h != null) {
                return m43310J(i14, c2696g, c15252xM43318h, c16618c);
            }
            return null;
        }
        if (i13 != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) C15232d.m43299c(i13))).toString());
        }
        C15252x c15252xM43318h2 = m43318h(c15252x);
        boolean zBooleanValue = false;
        if (c15252xM43318h2 != null) {
            if (!c15252xM43318h2.f9142w.f9141N) {
                AbstractC37831a.m121374b("visitAncestors called on an unattached node");
            }
            AbstractC2316v abstractC2316v = c15252xM43318h2.f9142w.f9132E;
            C0230n0 c0230n0M516p = AbstractC0201g.m516p(c15252xM43318h2);
            loop0: while (c0230n0M516p != null) {
                if ((((AbstractC2316v) c0230n0M516p.f783e0.f743g).f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                    while (abstractC2316v != null) {
                        if ((abstractC2316v.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            AbstractC2316v abstractC2316vM504d = abstractC2316v;
                            C30849c c30849c = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                    if (c15252x2.m43357Y0().f57252a) {
                                        obj = c15252x2;
                                        break loop0;
                                    }
                                } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i15 = 0;
                                    for (AbstractC2316v abstractC2316v2 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v2 != null; abstractC2316v2 = abstractC2316v2.f9133F) {
                                        if ((abstractC2316v2.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i15++;
                                            if (i15 == 1) {
                                                abstractC2316vM504d = abstractC2316v2;
                                            } else {
                                                if (c30849c == null) {
                                                    c30849c = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c.m94885b(abstractC2316v2);
                                            }
                                        }
                                    }
                                    if (i15 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c);
                            }
                        }
                        abstractC2316v = abstractC2316v.f9132E;
                    }
                }
                c0230n0M516p = c0230n0M516p.m588G();
                abstractC2316v = (c0230n0M516p == null || (c0223l1 = c0230n0M516p.f783e0) == null) ? null : (C0224l2) c0223l1.f742f;
            }
        }
        if (obj != null && !obj.equals(c15252x)) {
            zBooleanValue = ((Boolean) c2696g.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m43323m(C15252x c15252x, C2696g c2696g) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                C15252x c15252xM43327q = m43327q(c15252x);
                if (c15252xM43327q != null) {
                    return m43323m(c15252xM43327q, c2696g) || m43326p(c15252x, c15252xM43327q, 1, c2696g);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return c15252x.m43357Y0().f57252a ? ((Boolean) c2696g.invoke(c15252x)).booleanValue() : m43306F(c15252x, c2696g);
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return m43306F(c15252x, c2696g);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m43324n(C15252x c15252x) {
        int iOrdinal = c15252x.m43358Z0().ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57247i = false;
                c15252x.m43356X0(EnumC15251w.f57273y, EnumC15251w.f57271w);
                return true;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m43325o(int i13, C2696g c2696g, C15252x c15252x, C16618c c16618c) {
        if (m43308H(i13, c2696g, c15252x, c16618c)) {
            return true;
        }
        Boolean bool = (Boolean) m43307G(c15252x, i13, new C15254z(((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57246h, c15252x, c16618c, i13, c2696g, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m43326p(C15252x c15252x, C15252x c15252x2, int i13, C2696g c2696g) {
        if (m43309I(c15252x, c15252x2, i13, c2696g)) {
            return true;
        }
        Boolean bool = (Boolean) m43307G(c15252x, i13, new C15254z(((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57246h, c15252x, c15252x2, i13, c2696g, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static final C15252x m43327q(C15252x c15252x) {
        boolean z4 = c15252x.f9142w.f9141N;
        if (z4) {
            if (!z4) {
                AbstractC37831a.m121374b("visitChildren called on an unattached node");
            }
            C30849c c30849c = new C30849c(new AbstractC2316v[16]);
            AbstractC2316v abstractC2316v = c15252x.f9142w;
            AbstractC2316v abstractC2316v2 = abstractC2316v.f9133F;
            if (abstractC2316v2 == null) {
                AbstractC0201g.m501a(c30849c, abstractC2316v);
            } else {
                c30849c.m94885b(abstractC2316v2);
            }
            while (true) {
                int i13 = c30849c.f127229y;
                if (i13 == 0) {
                    break;
                }
                AbstractC2316v abstractC2316vM504d = (AbstractC2316v) c30849c.m94894l(i13 - 1);
                if ((abstractC2316vM504d.f9145z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
                    AbstractC0201g.m501a(c30849c, abstractC2316vM504d);
                } else {
                    while (abstractC2316vM504d != null) {
                        if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                            C30849c c30849c2 = null;
                            while (abstractC2316vM504d != null) {
                                if (abstractC2316vM504d instanceof C15252x) {
                                    C15252x c15252x2 = (C15252x) abstractC2316vM504d;
                                    if (c15252x2.f9142w.f9141N) {
                                        int iOrdinal = c15252x2.m43358Z0().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return c15252x2;
                                        }
                                        if (iOrdinal != 3) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    }
                                } else if ((abstractC2316vM504d.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 && (abstractC2316vM504d instanceof AbstractC0233o)) {
                                    int i14 = 0;
                                    for (AbstractC2316v abstractC2316v3 = ((AbstractC0233o) abstractC2316vM504d).f804P; abstractC2316v3 != null; abstractC2316v3 = abstractC2316v3.f9133F) {
                                        if ((abstractC2316v3.f9144y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                abstractC2316vM504d = abstractC2316v3;
                                            } else {
                                                if (c30849c2 == null) {
                                                    c30849c2 = new C30849c(new AbstractC2316v[16]);
                                                }
                                                if (abstractC2316vM504d != null) {
                                                    c30849c2.m94885b(abstractC2316vM504d);
                                                    abstractC2316vM504d = null;
                                                }
                                                c30849c2.m94885b(abstractC2316v3);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                abstractC2316vM504d = AbstractC0201g.m504d(c30849c2);
                            }
                            break;
                        }
                        abstractC2316vM504d = abstractC2316vM504d.f9133F;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static C15247s m43328r() {
        return C15247s.f57266c;
    }

    /* JADX INFO: renamed from: s */
    public static C15247s m43329s() {
        return C15247s.f57265b;
    }

    /* JADX INFO: renamed from: t */
    public static C15247s m43330t() {
        return C15247s.f57267d;
    }

    /* JADX INFO: renamed from: u */
    public static final void m43331u(C15252x c15252x) {
        C15236h c15236h = ((C15240l) AbstractC0201g.m517q(c15252x).getFocusOwner()).f57242d;
        if (c15236h.f57235c.m136a(c15252x)) {
            c15236h.m43337a();
        }
    }

    /* JADX INFO: renamed from: v */
    public static final boolean m43332v(int i13) {
        return i13 == 1 || i13 == 2;
    }

    /* JADX INFO: renamed from: w */
    public static final boolean m43333w(C16618c c16618c, C16618c c16618c2, C16618c c16618c3, int i13) {
        if (!m43334x(i13, c16618c, c16618c3)) {
            return false;
        }
        if (m43334x(i13, c16618c2, c16618c3) && !m43312b(c16618c3, c16618c, c16618c2, i13)) {
            return !m43312b(c16618c3, c16618c2, c16618c, i13) && m43335y(i13, c16618c3, c16618c) < m43335y(i13, c16618c3, c16618c2);
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m43334x(int i13, C16618c c16618c, C16618c c16618c2) {
        float f13 = c16618c.f63940b;
        float f14 = c16618c.f63942d;
        float f15 = c16618c.f63939a;
        float f16 = c16618c.f63941c;
        if (i13 == 3) {
            float f17 = c16618c2.f63941c;
            float f18 = c16618c2.f63939a;
            return (f17 > f16 || f18 >= f16) && f18 > f15;
        }
        if (i13 == 4) {
            float f19 = c16618c2.f63939a;
            float f24 = c16618c2.f63941c;
            return (f19 < f15 || f24 <= f15) && f24 < f16;
        }
        if (i13 == 5) {
            float f25 = c16618c2.f63942d;
            float f26 = c16618c2.f63940b;
            return (f25 > f14 || f26 >= f14) && f26 > f13;
        }
        if (i13 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f27 = c16618c2.f63940b;
        float f28 = c16618c2.f63942d;
        return (f27 < f13 || f28 <= f13) && f28 < f14;
    }

    /* JADX INFO: renamed from: y */
    public static final long m43335y(int i13, C16618c c16618c, C16618c c16618c2) {
        float f13;
        float f14;
        float f15 = c16618c2.f63940b;
        float f16 = c16618c2.f63942d;
        float f17 = c16618c2.f63939a;
        float f18 = c16618c2.f63941c;
        if (i13 == 3) {
            f13 = c16618c.f63939a - f18;
        } else if (i13 == 4) {
            f13 = f17 - c16618c.f63941c;
        } else if (i13 == 5) {
            f13 = c16618c.f63940b - f16;
        } else {
            if (i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f13 = f15 - c16618c.f63942d;
        }
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        long j7 = (long) f13;
        if (i13 == 3 || i13 == 4) {
            float f19 = c16618c.f63940b;
            float f24 = 2;
            f14 = (((c16618c.f63942d - f19) / f24) + f19) - (((f16 - f15) / f24) + f15);
        } else {
            if (i13 != 5 && i13 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f25 = c16618c.f63939a;
            float f26 = 2;
            f14 = (((c16618c.f63941c - f25) / f26) + f25) - (((f18 - f17) / f26) + f17);
        }
        long j13 = (long) f14;
        return (j13 * j13) + (((long) 13) * j7 * j7);
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m43336z(C15252x c15252x) {
        C0230n0 c0230n0;
        NodeCoordinator nodeCoordinator;
        C0230n0 c0230n1;
        NodeCoordinator nodeCoordinator2 = c15252x.f9135H;
        return (nodeCoordinator2 == null || (c0230n0 = nodeCoordinator2.f4858O) == null || !c0230n0.m606Y() || (nodeCoordinator = c15252x.f9135H) == null || (c0230n1 = nodeCoordinator.f4858O) == null || !c0230n1.m605X()) ? false : true;
    }
}
