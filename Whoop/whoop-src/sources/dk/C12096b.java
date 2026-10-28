package dk;

import a33.C0352d;
import android.content.Context;
import android.content.SharedPreferences;
import fk.InterfaceC14544a;
import java.io.File;
import java.util.ArrayList;
import l83.C23454a0;
import p000.AbstractC11266d;
import p037bu.C3632c;
import p173gj.C15903d;
import p173gj.C15906g;
import p223ik.InterfaceC18598b;
import p249jc.C21565a;
import p389p0.C28539n0;
import p428qk.C30439b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: dk.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12096b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40272a;

    /* JADX INFO: renamed from: b */
    public final C15903d f40273b;

    /* JADX INFO: renamed from: c */
    public final C12100f f40274c;

    /* JADX INFO: renamed from: d */
    public final C28539n0 f40275d;

    /* JADX INFO: renamed from: e */
    public final C12100f f40276e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f40277f;

    public C12096b(C15903d c15903d, C15906g configuration, int i13) {
        this.f40272a = i13;
        switch (i13) {
            case 1:
                AbstractC22676k.m65750j(configuration, "configuration");
                this.f40273b = c15903d;
                ArrayList arrayList = new ArrayList();
                this.f40277f = arrayList;
                StringBuilder sb4 = new StringBuilder("amplitude-android-");
                String str = configuration.f60156e;
                sb4.append(str);
                this.f40274c = m33422a(configuration, "amplitude-disk-queue", sb4.toString());
                this.f40276e = m33422a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str);
                File storageDirectory = configuration.f60153b.getDir("amplitude-kotlin-" + str, 0);
                String str2 = configuration.f60156e;
                String str3 = configuration.f60152a;
                C21565a c21565a = configuration.f60165n;
                InterfaceC14544a interfaceC14544aM11156E = configuration.f60158g.m11156E(c15903d);
                String strM30461o = AbstractC11266d.m30461o("amplitude-identity-", str);
                AbstractC22676k.m65749i(storageDirectory, "storageDirectory");
                C30439b c30439b = new C30439b(str2, str3, c21565a, storageDirectory, strM30461o, interfaceC14544aM11156E);
                arrayList.add(storageDirectory);
                this.f40275d = new C28539n0(c30439b);
                break;
            default:
                AbstractC22676k.m65750j(configuration, "configuration");
                this.f40273b = c15903d;
                ArrayList arrayList2 = new ArrayList();
                this.f40277f = arrayList2;
                StringBuilder sb5 = new StringBuilder("amplitude-android-");
                String str4 = configuration.f60152a;
                sb5.append(str4);
                this.f40274c = m33422a(configuration, "amplitude-disk-queue", sb5.toString());
                this.f40276e = m33422a(configuration, "amplitude-identify-intercept-disk-queue", "amplitude-identify-intercept-" + str4);
                Context context = configuration.f60153b;
                StringBuilder sb6 = new StringBuilder("amplitude-kotlin-");
                String str5 = configuration.f60156e;
                sb6.append(str5);
                File storageDirectory2 = context.getDir(sb6.toString(), 0);
                String str6 = configuration.f60156e;
                String str7 = configuration.f60152a;
                C21565a c21565a2 = configuration.f60165n;
                InterfaceC14544a interfaceC14544aM11156E2 = configuration.f60158g.m11156E(c15903d);
                String strM30461o2 = AbstractC11266d.m30461o("amplitude-identity-", str5);
                AbstractC22676k.m65749i(storageDirectory2, "storageDirectory");
                C30439b c30439b2 = new C30439b(str6, str7, c21565a2, storageDirectory2, strM30461o2, interfaceC14544aM11156E2);
                arrayList2.add(storageDirectory2);
                this.f40275d = new C28539n0(c30439b2);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final C12100f m33422a(C15906g c15906g, String str, String str2) {
        switch (this.f40272a) {
            case 0:
                File storageDirectory = c15906g.f60153b.getDir(str, 0);
                AbstractC22676k.m65749i(storageDirectory, "storageDirectory");
                this.f40277f.add(storageDirectory);
                SharedPreferences sharedPreferences = c15906g.f60153b.getSharedPreferences(str2, 0);
                String str3 = c15906g.f60152a;
                C3632c c3632c = c15906g.f60158g;
                C15903d c15903d = this.f40273b;
                InterfaceC14544a interfaceC14544aM11156E = c3632c.m11156E(c15903d);
                AbstractC22676k.m65749i(sharedPreferences, "sharedPreferences");
                return new C12100f(str3, interfaceC14544aM11156E, sharedPreferences, storageDirectory, c15903d.f60141n);
            default:
                File storageDirectory2 = c15906g.f60153b.getDir(str, 0);
                AbstractC22676k.m65749i(storageDirectory2, "storageDirectory");
                this.f40277f.add(storageDirectory2);
                SharedPreferences sharedPreferences2 = c15906g.f60153b.getSharedPreferences(str2, 0);
                String str4 = c15906g.f60156e;
                C3632c c3632c2 = c15906g.f60158g;
                C15903d c15903d2 = this.f40273b;
                InterfaceC14544a interfaceC14544aM11156E2 = c3632c2.m11156E(c15903d2);
                AbstractC22676k.m65749i(sharedPreferences2, "sharedPreferences");
                return new C12100f(str4, interfaceC14544aM11156E2, sharedPreferences2, storageDirectory2, c15903d2.f60141n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: b */
    public final Object m33423b(AbstractC32269c abstractC32269c) {
        C12095a c12095a;
        C12096b c12096b;
        String[] list;
        C12097c c12097c;
        C12096b c12096b2;
        C12100f c12100f;
        C0352d c0352d;
        switch (this.f40272a) {
            case 0:
                C15903d c15903d = this.f40273b;
                InterfaceC14544a interfaceC14544a = c15903d.f60138k;
                if (abstractC32269c instanceof C12095a) {
                    c12095a = (C12095a) abstractC32269c;
                    int i13 = c12095a.f40271z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c12095a.f40271z = i13 - Integer.MIN_VALUE;
                    } else {
                        c12095a = new C12095a(this, abstractC32269c);
                    }
                } else {
                    c12095a = new C12095a(this, abstractC32269c);
                }
                Object obj = c12095a.f40269x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c12095a.f40271z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        c12096b = c12095a.f40268w;
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i14 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c12096b = c12095a.f40268w;
                        AbstractC34132o.m107864I(obj);
                    }
                    for (File file : c12096b.f40277f) {
                        list = file.list();
                        if (list == null && list.length == 0) {
                            file.delete();
                        }
                    }
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                new C0352d(this.f40275d, c15903d.m44884e(), interfaceC14544a).m940l();
                InterfaceC18598b interfaceC18598bM44885f = c15903d.m44885f();
                C12100f c12100f2 = interfaceC18598bM44885f instanceof C12100f ? (C12100f) interfaceC18598bM44885f : null;
                if (c12100f2 != null) {
                    C0352d c0352d2 = new C0352d(this.f40274c, c12100f2, interfaceC14544a);
                    c12095a.f40268w = this;
                    c12095a.f40271z = 1;
                    if (c0352d2.m939k(c12095a) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                c12096b = this;
                InterfaceC18598b interfaceC18598bM44883d = c12096b.f40273b.m44883d();
                C12100f c12100f3 = interfaceC18598bM44883d instanceof C12100f ? (C12100f) interfaceC18598bM44883d : null;
                if (c12100f3 != null) {
                    C0352d c0352d3 = new C0352d(c12096b.f40276e, c12100f3, c12096b.f40273b.f60138k);
                    c12095a.f40268w = c12096b;
                    c12095a.f40271z = 2;
                    if (c0352d3.m939k(c12095a) == enumC31071a) {
                        return enumC31071a;
                    }
                }
                while (r10.hasNext()) {
                    list = file.list();
                    if (list == null) {
                    }
                }
                return C23454a0.f92919a;
            default:
                C15903d c15903d2 = this.f40273b;
                InterfaceC14544a interfaceC14544a2 = c15903d2.f60138k;
                if (abstractC32269c instanceof C12097c) {
                    c12097c = (C12097c) abstractC32269c;
                    int i15 = c12097c.f40281z;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c12097c.f40281z = i15 - Integer.MIN_VALUE;
                    } else {
                        c12097c = new C12097c(this, abstractC32269c);
                    }
                } else {
                    c12097c = new C12097c(this, abstractC32269c);
                }
                Object obj2 = c12097c.f40279x;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c12097c.f40281z;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    new C0352d(this.f40275d, c15903d2.m44884e(), interfaceC14544a2).m940l();
                    if (AbstractC22676k.m65745e(c15903d2.f60128a.f60156e, "$default_instance")) {
                        InterfaceC18598b interfaceC18598bM44885f2 = c15903d2.m44885f();
                        C12100f c12100f4 = interfaceC18598bM44885f2 instanceof C12100f ? (C12100f) interfaceC18598bM44885f2 : null;
                        if (c12100f4 != null) {
                            C0352d c0352d4 = new C0352d(this.f40274c, c12100f4, interfaceC14544a2);
                            c12097c.f40278w = this;
                            c12097c.f40281z = 1;
                            if (c0352d4.m939k(c12097c) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        }
                        c12096b2 = this;
                        InterfaceC18598b interfaceC18598bM44883d2 = c12096b2.f40273b.m44883d();
                        if (interfaceC18598bM44883d2 instanceof C12100f) {
                        }
                        if (c12100f != null) {
                            c0352d = new C0352d(c12096b2.f40276e, c12100f, c12096b2.f40273b.f60138k);
                            c12097c.f40278w = c12096b2;
                            c12097c.f40281z = 2;
                            if (c0352d.m939k(c12097c) == enumC31071a2) {
                                return enumC31071a2;
                            }
                        }
                    } else {
                        c12096b2 = this;
                    }
                } else if (i16 == 1) {
                    c12096b2 = c12097c.f40278w;
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC18598b interfaceC18598bM44883d3 = c12096b2.f40273b.m44883d();
                    c12100f = interfaceC18598bM44883d3 instanceof C12100f ? (C12100f) interfaceC18598bM44883d3 : null;
                    if (c12100f != null) {
                        c0352d = new C0352d(c12096b2.f40276e, c12100f, c12096b2.f40273b.f60138k);
                        c12097c.f40278w = c12096b2;
                        c12097c.f40281z = 2;
                        if (c0352d.m939k(c12097c) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c12096b2 = c12097c.f40278w;
                    AbstractC34132o.m107864I(obj2);
                }
                for (File file2 : c12096b2.f40277f) {
                    String[] list2 = file2.list();
                    if (list2 != null && list2.length == 0) {
                        file2.delete();
                    }
                }
                return C23454a0.f92919a;
        }
    }
}
