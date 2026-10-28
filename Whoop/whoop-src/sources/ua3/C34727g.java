package ua3;

import j93.AbstractC21478l0;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p249jc.AbstractC21598x;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import qa3.C30115a;
import qa3.C30122c0;
import qa3.C30129e1;
import qa3.C30134g0;
import qa3.C30145k;
import qa3.C30146k0;
import qa3.C30154o;
import qa3.C30171w0;
import sa3.C32328b;
import sa3.C32334h;
import sa3.InterfaceC32332f;
import ta3.AbstractC33686l;
import ta3.C33678d;
import ta3.C33685k;
import wa3.AbstractC36986c;
import wa3.C36992f;
import wa3.C36998i;
import wa3.C37010o;
import wa3.InterfaceC37019v;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: ua3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C34727g {

    /* JADX INFO: renamed from: a */
    public static final C36998i f146269a;

    static {
        C36998i c36998i = new C36998i();
        c36998i.m118800a(AbstractC33686l.f140735a);
        c36998i.m118800a(AbstractC33686l.f140736b);
        c36998i.m118800a(AbstractC33686l.f140737c);
        c36998i.m118800a(AbstractC33686l.f140738d);
        c36998i.m118800a(AbstractC33686l.f140739e);
        c36998i.m118800a(AbstractC33686l.f140740f);
        c36998i.m118800a(AbstractC33686l.f140741g);
        c36998i.m118800a(AbstractC33686l.f140742h);
        c36998i.m118800a(AbstractC33686l.f140743i);
        c36998i.m118800a(AbstractC33686l.f140744j);
        c36998i.m118800a(AbstractC33686l.f140745k);
        c36998i.m118800a(AbstractC33686l.f140746l);
        f146269a = c36998i;
    }

    /* JADX INFO: renamed from: a */
    public static C34725e m109649a(C30154o proto, InterfaceC32332f nameResolver, C32334h typeTable) {
        String strM74110N0;
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        C37010o constructorSignature = AbstractC33686l.f140735a;
        AbstractC22676k.m65749i(constructorSignature, "constructorSignature");
        C33678d c33678d = (C33678d) AbstractC21478l0.m60453x(proto, constructorSignature);
        String string = (c33678d == null || (c33678d.f140678x & 1) != 1) ? "<init>" : nameResolver.getString(c33678d.f140679y);
        if (c33678d == null || (c33678d.f140678x & 2) != 2) {
            List list = proto.f123364E;
            AbstractC22676k.m65749i(list, "getValueParameterList(...)");
            List<C30129e1> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C30129e1 c30129e1 : list2) {
                AbstractC22676k.m65747g(c30129e1);
                String strM109653e = m109653e(AbstractC21598x.m60713y0(c30129e1, typeTable), nameResolver);
                if (strM109653e == null) {
                    return null;
                }
                arrayList.add(strM109653e);
            }
            strM74110N0 = AbstractC25265s.m74110N0(arrayList, "", "(", ")V", null, 56);
        } else {
            strM74110N0 = nameResolver.getString(c33678d.f140680z);
        }
        return new C34725e(string, strM74110N0);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 java.lang.String, still in use, count: 2, list:
          (r4v2 java.lang.String) from 0x0052: IF  (r4v2 java.lang.String) == (null java.lang.String)  -> B:23:0x0054 A[HIDDEN]
          (r4v2 java.lang.String) from 0x0055: PHI (r4 I:??) = (r4v2 java.lang.String), (r4v5 java.lang.String) binds: [B:22:0x0052, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: b */
    public static ua3.C34724d m109650b(qa3.C30146k0 r4, sa3.InterfaceC32332f r5, sa3.C32334h r6, boolean r7) {
        /*
            java.lang.String r0 = "proto"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r4, r0)
            java.lang.String r0 = "nameResolver"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r5, r0)
            java.lang.String r0 = "typeTable"
            p715kotlin.jvm.internal.AbstractC22676k.m65750j(r6, r0)
            wa3.o r0 = ta3.AbstractC33686l.f140738d
            java.lang.String r1 = "propertySignature"
            p715kotlin.jvm.internal.AbstractC22676k.m65749i(r0, r1)
            java.lang.Object r0 = j93.AbstractC21478l0.m60453x(r4, r0)
            ta3.f r0 = (ta3.C33680f) r0
            r1 = 0
            if (r0 != 0) goto L20
            goto L54
        L20:
            int r2 = r0.f140695x
            r3 = 1
            r2 = r2 & r3
            if (r2 != r3) goto L29
            ta3.b r0 = r0.f140696y
            goto L2a
        L29:
            r0 = r1
        L2a:
            if (r0 != 0) goto L2f
            if (r7 == 0) goto L2f
            goto L54
        L2f:
            if (r0 == 0) goto L39
            int r7 = r0.f140667x
            r7 = r7 & r3
            if (r7 != r3) goto L39
            int r7 = r0.f140668y
            goto L3b
        L39:
            int r7 = r4.f123305F
        L3b:
            if (r0 == 0) goto L4a
            int r2 = r0.f140667x
            r3 = 2
            r2 = r2 & r3
            if (r2 != r3) goto L4a
            int r4 = r0.f140669z
            java.lang.String r4 = r5.getString(r4)
            goto L55
        L4a:
            qa3.w0 r4 = p249jc.AbstractC21598x.m60699r0(r4, r6)
            java.lang.String r4 = m109653e(r4, r5)
            if (r4 != 0) goto L55
        L54:
            return r1
        L55:
            ua3.d r6 = new ua3.d
            java.lang.String r5 = r5.getString(r7)
            r6.<init>(r5, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ua3.C34727g.m109650b(qa3.k0, sa3.f, sa3.h, boolean):ua3.d");
    }

    /* JADX INFO: renamed from: c */
    public static C34725e m109651c(C30122c0 proto, InterfaceC32332f nameResolver, C32334h typeTable) {
        String strM73376i;
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(nameResolver, "nameResolver");
        AbstractC22676k.m65750j(typeTable, "typeTable");
        C37010o methodSignature = AbstractC33686l.f140736b;
        AbstractC22676k.m65749i(methodSignature, "methodSignature");
        C33678d c33678d = (C33678d) AbstractC21478l0.m60453x(proto, methodSignature);
        int i13 = (c33678d == null || (c33678d.f140678x & 1) != 1) ? proto.f123037F : c33678d.f140679y;
        if (c33678d == null || (c33678d.f140678x & 2) != 2) {
            List listM118960L = AbstractC37056f.m118960L(AbstractC21598x.m60689l0(proto, typeTable));
            List list = proto.f123047P;
            AbstractC22676k.m65749i(list, "getValueParameterList(...)");
            List<C30129e1> list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
            for (C30129e1 c30129e1 : list2) {
                AbstractC22676k.m65747g(c30129e1);
                arrayList.add(AbstractC21598x.m60713y0(c30129e1, typeTable));
            }
            ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(listM118960L, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
            Iterator it = arrayListM74129g1.iterator();
            while (it.hasNext()) {
                String strM109653e = m109653e((C30171w0) it.next(), nameResolver);
                if (strM109653e == null) {
                    return null;
                }
                arrayList2.add(strM109653e);
            }
            String strM109653e2 = m109653e(AbstractC21598x.m60697q0(proto, typeTable), nameResolver);
            if (strM109653e2 == null) {
                return null;
            }
            strM73376i = AbstractC25012a.m73376i(AbstractC25265s.m74110N0(arrayList2, "", "(", ")", null, 56), strM109653e2, new StringBuilder());
        } else {
            strM73376i = nameResolver.getString(c33678d.f140680z);
        }
        return new C34725e(nameResolver.getString(i13), strM73376i);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m109652d(C30146k0 proto) {
        AbstractC22676k.m65750j(proto, "proto");
        C32328b c32328bM109648a = AbstractC34723c.m109648a();
        Object objM118820k = proto.m118820k(AbstractC33686l.f140739e);
        AbstractC22676k.m65749i(objM118820k, "getExtension(...)");
        return c32328bM109648a.mo91233e(((Number) objM118820k).intValue()).booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public static String m109653e(C30171w0 c30171w0, InterfaceC32332f interfaceC32332f) {
        if (c30171w0.m92362p()) {
            return AbstractC34722b.m109647b(interfaceC32332f.mo100631b(c30171w0.f123481I));
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final C23465k m109654f(String[] strArr, String[] strings) throws InvalidProtocolBufferException {
        AbstractC22676k.m65750j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC34721a.m109645a(strArr));
        C34726f c34726fM109656h = m109656h(byteArrayInputStream, strings);
        C30115a c30115a = C30145k.f123270h0;
        c30115a.getClass();
        C36992f c36992f = new C36992f(byteArrayInputStream);
        InterfaceC37019v interfaceC37019v = (InterfaceC37019v) c30115a.mo92259a(c36992f, f146269a);
        try {
            c36992f.m118755a(0);
            AbstractC36986c.m118733b(interfaceC37019v);
            return new C23465k(c34726fM109656h, (C30145k) interfaceC37019v);
        } catch (InvalidProtocolBufferException e5) {
            e5.f89345w = interfaceC37019v;
            throw e5;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C23465k m109655g(String[] strArr, String[] strings) {
        AbstractC22676k.m65750j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC34721a.m109645a(strArr));
        C34726f c34726fM109656h = m109656h(byteArrayInputStream, strings);
        C30115a c30115a = C30122c0.f123035Z;
        c30115a.getClass();
        C36992f c36992f = new C36992f(byteArrayInputStream);
        InterfaceC37019v interfaceC37019v = (InterfaceC37019v) c30115a.mo92259a(c36992f, f146269a);
        try {
            c36992f.m118755a(0);
            AbstractC36986c.m118733b(interfaceC37019v);
            return new C23465k(c34726fM109656h, (C30122c0) interfaceC37019v);
        } catch (InvalidProtocolBufferException e5) {
            e5.f89345w = interfaceC37019v;
            throw e5;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C34726f m109656h(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        C33685k c33685k = (C33685k) C33685k.f140728H.m118734c(byteArrayInputStream, f146269a);
        AbstractC22676k.m65749i(c33685k, "parseDelimitedFrom(...)");
        return new C34726f(c33685k, strArr);
    }

    /* JADX INFO: renamed from: i */
    public static final C23465k m109657i(String[] strArr, String[] strings) {
        AbstractC22676k.m65750j(strings, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(AbstractC34721a.m109645a(strArr));
        C34726f c34726fM109656h = m109656h(byteArrayInputStream, strings);
        C30115a c30115a = C30134g0.f123152L;
        c30115a.getClass();
        C36992f c36992f = new C36992f(byteArrayInputStream);
        InterfaceC37019v interfaceC37019v = (InterfaceC37019v) c30115a.mo92259a(c36992f, f146269a);
        try {
            c36992f.m118755a(0);
            AbstractC36986c.m118733b(interfaceC37019v);
            return new C23465k(c34726fM109656h, (C30134g0) interfaceC37019v);
        } catch (InvalidProtocolBufferException e5) {
            e5.f89345w = interfaceC37019v;
            throw e5;
        }
    }
}
