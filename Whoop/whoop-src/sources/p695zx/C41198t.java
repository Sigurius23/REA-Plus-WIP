package p695zx;

import java.util.ArrayList;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p098dt.AbstractC12350b;
import p499t9.C33647p;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38783b;
import y00.C38823f;
import y00.EnumC38773a;
import y00.EnumC38863j;

/* JADX INFO: renamed from: zx.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C41198t implements InterfaceC41202x {

    /* JADX INFO: renamed from: a */
    public static final ArrayList f177745a;

    /* JADX INFO: renamed from: b */
    public static final ArrayList f177746b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f177747c;

    /* JADX INFO: renamed from: d */
    public static final ArrayList f177748d;

    /* JADX INFO: renamed from: e */
    public static final ArrayList f177749e;

    /* JADX INFO: renamed from: f */
    public static final ArrayList f177750f;

    /* JADX INFO: renamed from: g */
    public static final ArrayList f177751g;

    /* JADX INFO: renamed from: h */
    public static final ArrayList f177752h;

    /* JADX INFO: renamed from: i */
    public static final ArrayList f177753i;

    /* JADX INFO: renamed from: j */
    public static final ArrayList f177754j;

    static {
        Set<C38823f> setM34570S = AbstractC12350b.m34570S(new C38823f("4000000000000000", "4999999999999999", true));
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(setM34570S, 10));
        for (C38823f c38823f : setM34570S) {
            EnumC38773a enumC38773a = EnumC38773a.Visa;
            C33647p c33647p = EnumC38863j.f167290x;
            arrayList.add(new C38783b(c38823f, 16, enumC38773a));
        }
        f177745a = arrayList;
        Set<C38823f> setM74059b1 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("2221000000000000", "2720999999999999", true), new C38823f("5100000000000000", "5599999999999999", true)});
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(setM74059b1, 10));
        for (C38823f c38823f2 : setM74059b1) {
            EnumC38773a enumC38773a2 = EnumC38773a.Mastercard;
            C33647p c33647p2 = EnumC38863j.f167290x;
            arrayList2.add(new C38783b(c38823f2, 16, enumC38773a2));
        }
        f177746b = arrayList2;
        Set<C38823f> setM74059b2 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("340000000000000", "349999999999999", true), new C38823f("370000000000000", "379999999999999", true)});
        ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(setM74059b2, 10));
        for (C38823f c38823f3 : setM74059b2) {
            EnumC38773a enumC38773a3 = EnumC38773a.AmericanExpress;
            C33647p c33647p3 = EnumC38863j.f167290x;
            arrayList3.add(new C38783b(c38823f3, 15, enumC38773a3));
        }
        f177747c = arrayList3;
        Set<C38823f> setM74059b3 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("6000000000000000", "6099999999999999", true), new C38823f("6400000000000000", "6499999999999999", true), new C38823f("6500000000000000", "6599999999999999", true)});
        ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(setM74059b3, 10));
        for (C38823f c38823f4 : setM74059b3) {
            EnumC38773a enumC38773a4 = EnumC38773a.Discover;
            C33647p c33647p4 = EnumC38863j.f167290x;
            arrayList4.add(new C38783b(c38823f4, 16, enumC38773a4));
        }
        f177748d = arrayList4;
        Set<C38823f> setM34570S2 = AbstractC12350b.m34570S(new C38823f("3528000000000000", "3589999999999999", true));
        ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(setM34570S2, 10));
        for (C38823f c38823f5 : setM34570S2) {
            EnumC38773a enumC38773a5 = EnumC38773a.JCB;
            C33647p c33647p5 = EnumC38863j.f167290x;
            arrayList5.add(new C38783b(c38823f5, 16, enumC38773a5));
        }
        f177749e = arrayList5;
        Set<C38823f> setM74059b4 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("6200000000000000", "6216828049999999", true), new C38823f("6216828060000000", "6299999999999999", true), new C38823f("8100000000000000", "8199999999999999", true)});
        ArrayList arrayList6 = new ArrayList(AbstractC25267u.m74163i0(setM74059b4, 10));
        for (C38823f c38823f6 : setM74059b4) {
            EnumC38773a enumC38773a6 = EnumC38773a.UnionPay;
            C33647p c33647p6 = EnumC38863j.f167290x;
            arrayList6.add(new C38783b(c38823f6, 16, enumC38773a6));
        }
        f177750f = arrayList6;
        Set<C38823f> setM34570S3 = AbstractC12350b.m34570S(new C38823f("6216828050000000000", "6216828059999999999", true));
        ArrayList arrayList7 = new ArrayList(AbstractC25267u.m74163i0(setM34570S3, 10));
        for (C38823f c38823f7 : setM34570S3) {
            EnumC38773a enumC38773a7 = EnumC38773a.UnionPay;
            C33647p c33647p7 = EnumC38863j.f167290x;
            arrayList7.add(new C38783b(c38823f7, 19, enumC38773a7));
        }
        f177751g = arrayList7;
        Set<C38823f> setM74059b5 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("3000000000000000", "3059999999999999", true), new C38823f("3095000000000000", "3095999999999999", true), new C38823f("3800000000000000", "3999999999999999", true)});
        ArrayList arrayList8 = new ArrayList(AbstractC25267u.m74163i0(setM74059b5, 10));
        for (C38823f c38823f8 : setM74059b5) {
            EnumC38773a enumC38773a8 = EnumC38773a.DinersClub;
            C33647p c33647p8 = EnumC38863j.f167290x;
            arrayList8.add(new C38783b(c38823f8, 16, enumC38773a8));
        }
        f177752h = arrayList8;
        Set<C38823f> setM34570S4 = AbstractC12350b.m34570S(new C38823f("36000000000000", "36999999999999", true));
        ArrayList arrayList9 = new ArrayList(AbstractC25267u.m74163i0(setM34570S4, 10));
        for (C38823f c38823f9 : setM34570S4) {
            EnumC38773a enumC38773a9 = EnumC38773a.DinersClub;
            C33647p c33647p9 = EnumC38863j.f167290x;
            arrayList9.add(new C38783b(c38823f9, 14, enumC38773a9));
        }
        f177753i = arrayList9;
        Set<C38823f> setM74059b6 = AbstractC25260n.m74059b1(new C38823f[]{new C38823f("4000002500001001", "4000002500001001", true), new C38823f("5555552500001001", "5555552500001001", true)});
        ArrayList arrayList10 = new ArrayList(AbstractC25267u.m74163i0(setM74059b6, 10));
        for (C38823f c38823f10 : setM74059b6) {
            EnumC38773a enumC38773a10 = EnumC38773a.CartesBancaires;
            C33647p c33647p10 = EnumC38863j.f167290x;
            arrayList10.add(new C38783b(c38823f10, 16, enumC38773a10));
        }
        f177754j = AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(AbstractC25265s.m74129g1(f177745a, f177746b), f177747c), f177748d), f177749e), f177750f), f177751g), f177752h), f177753i), arrayList10);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m133837a(C41185g cardNumber) {
        AbstractC22676k.m65750j(cardNumber, "cardNumber");
        ArrayList arrayList = new ArrayList();
        for (Object obj : f177754j) {
            if (((C38783b) obj).f166932w.m124344b(cardNumber)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
