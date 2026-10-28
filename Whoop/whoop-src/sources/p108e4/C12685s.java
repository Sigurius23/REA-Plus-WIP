package p108e4;

import com.whoop.data.repositories.C6656c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.HashMap;
import p242j4.C21302b;
import p242j4.C21307g;
import p242j4.InterfaceC21308h;
import p272k4.C22177a;
import p272k4.C22178b;
import p272k4.C22181e;
import p272k4.C22182f;
import p272k4.C22183g;
import p272k4.C22184h;
import p272k4.C22185i;
import p636y3.AbstractC39170b;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;

/* JADX INFO: renamed from: e4.s */
/* JADX INFO: loaded from: classes.dex */
public final class C12685s {

    /* JADX INFO: renamed from: a */
    public C6656c f43376a;

    /* JADX INFO: renamed from: b */
    public boolean f43377b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap f43378c;

    /* JADX INFO: renamed from: d */
    public final HashMap f43379d;

    /* JADX INFO: renamed from: e */
    public final HashMap f43380e;

    /* JADX INFO: renamed from: f */
    public final C21302b f43381f;

    /* JADX INFO: renamed from: g */
    public int f43382g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f43383h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f43384i;

    /* JADX INFO: renamed from: j */
    public boolean f43385j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC39171c f43386k;

    /* JADX INFO: renamed from: l */
    public long f43387l;

    public C12685s(InterfaceC39171c interfaceC39171c) {
        HashMap map = new HashMap();
        this.f43378c = map;
        this.f43379d = new HashMap();
        this.f43380e = new HashMap();
        C21302b c21302b = new C21302b(this);
        this.f43381f = c21302b;
        this.f43382g = 0;
        this.f43383h = new ArrayList();
        this.f43384i = new ArrayList();
        this.f43385j = true;
        c21302b.f81413a = 0;
        map.put(0, c21302b);
        this.f43386k = interfaceC39171c;
        this.f43387l = AbstractC39170b.m124770b(0, 0, 15);
        EnumC39181m enumC39181m = EnumC39181m.f168423w;
        this.f43376a = new C6656c(this, 3);
    }

    /* JADX INFO: renamed from: a */
    public final void m35491a(Object obj) {
        this.f43383h.add(obj);
        this.f43385j = true;
    }

    /* JADX INFO: renamed from: b */
    public final C21302b m35492b(Object obj) {
        HashMap map = this.f43378c;
        InterfaceC21308h interfaceC21308h = (InterfaceC21308h) map.get(obj);
        Object obj2 = interfaceC21308h;
        if (interfaceC21308h == null) {
            C21302b c21302b = new C21302b(this);
            map.put(obj, c21302b);
            c21302b.f81413a = obj;
            obj2 = c21302b;
        }
        if (obj2 instanceof C21302b) {
            return (C21302b) obj2;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m35493c(Float f13) {
        return Math.round(f13.floatValue());
    }

    /* JADX INFO: renamed from: d */
    public final C22183g m35494d(int i13, String str) {
        C21302b c21302bM35492b = m35492b(str);
        Object obj = c21302bM35492b.f81417c;
        if (obj == null || !(obj instanceof C22183g)) {
            C22183g c22183g = new C22183g(this);
            c22183g.f86053b = i13;
            c22183g.f86058g = str;
            c21302bM35492b.f81417c = c22183g;
            c21302bM35492b.mo59810b(c22183g.mo59809a());
        }
        return (C22183g) c21302bM35492b.f81417c;
    }

    /* JADX INFO: renamed from: e */
    public final C21307g m35495e(int i13) {
        StringBuilder sb4 = new StringBuilder("__HELPER_KEY_");
        int i14 = this.f43382g;
        this.f43382g = i14 + 1;
        String strM53371l = AbstractC18489d0.m53371l(sb4, i14, "__");
        HashMap map = this.f43379d;
        C21307g c22184h = (C21307g) map.get(strM53371l);
        if (c22184h == null) {
            switch (AbstractC12682p.m35485e(i13)) {
                case 0:
                    c22184h = new C22184h(this);
                    break;
                case 1:
                    c22184h = new C22185i(this);
                    break;
                case 2:
                    c22184h = new C22177a(this, 0);
                    break;
                case 3:
                    c22184h = new C22177a(this, 1);
                    break;
                case 4:
                    c22184h = new C22178b(this);
                    break;
                case 5:
                default:
                    c22184h = new C21307g(this, i13);
                    break;
                case 6:
                case 7:
                    c22184h = new C22181e(this, i13);
                    break;
                case 8:
                case 9:
                case 10:
                    c22184h = new C22182f(this, i13);
                    break;
            }
            c22184h.f81413a = strM53371l;
            map.put(strM53371l, c22184h);
        }
        return c22184h;
    }
}
