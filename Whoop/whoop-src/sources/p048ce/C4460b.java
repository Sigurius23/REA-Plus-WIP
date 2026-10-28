package p048ce;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import gm.C15990r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l83.C23454a0;
import m83.AbstractC25247g0;
import m83.C25272z;
import n83.C26463f;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import vg.C35971r;
import vg.InterfaceC35967n;
import x43.AbstractC37978j;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ce.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C4460b extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f17971E;

    /* JADX INFO: renamed from: F */
    public int f17972F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C15990r f17973G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC35967n f17974H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C4467h f17975I;

    /* JADX INFO: renamed from: w */
    public Object[] f17976w;

    /* JADX INFO: renamed from: x */
    public Object[] f17977x;

    /* JADX INFO: renamed from: y */
    public C15990r f17978y;

    /* JADX INFO: renamed from: z */
    public EnumC4481v f17979z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4460b(C15990r c15990r, InterfaceC35967n interfaceC35967n, C4467h c4467h, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f17973G = c15990r;
        this.f17974H = interfaceC35967n;
        this.f17975I = c4467h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C4460b(this.f17973G, this.f17974H, this.f17975I, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C4460b) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3 A[SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Map[] maps;
        Object objM114209d;
        C15990r c15990r;
        EnumC4481v enumC4481v;
        Map[] mapArr;
        int i13;
        Object objM114209d2;
        EnumC4481v enumC4481v2;
        Map[] mapArr2;
        C26463f c26463f;
        EnumC4471l[] enumC4471lArrValues;
        int length;
        int i14;
        EnumC4471l enumC4471l;
        ArrayList arrayList;
        int length2;
        int i15;
        C26463f c26463f2;
        Iterator it;
        C4470k c4470k;
        Map map;
        Map map2;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i16 = this.f17972F;
        InterfaceC35967n interfaceC35967n = this.f17974H;
        C15990r c15990r2 = this.f17973G;
        int i17 = 0;
        C4467h source = this.f17975I;
        int i18 = 1;
        if (i16 == 0) {
            AbstractC34132o.m107864I(obj);
            maps = new Map[2];
            EnumC4481v enumC4481v3 = EnumC4481v.CONFIGURATION;
            String str = source.f17989b;
            this.f17976w = maps;
            this.f17977x = maps;
            this.f17978y = c15990r2;
            this.f17979z = enumC4481v3;
            this.f17971E = 0;
            this.f17972F = 1;
            objM114209d = ((C35971r) interfaceC35967n).m114209d(str, this);
            if (objM114209d != enumC31071a) {
                c15990r = c15990r2;
                enumC4481v = enumC4481v3;
                mapArr = maps;
                i13 = 0;
            }
            return enumC31071a;
        }
        if (i16 == 1) {
            int i19 = this.f17971E;
            EnumC4481v enumC4481v4 = this.f17979z;
            C15990r c15990r3 = this.f17978y;
            Map[] mapArr3 = (Map[]) this.f17977x;
            Map[] mapArr4 = (Map[]) this.f17976w;
            AbstractC34132o.m107864I(obj);
            mapArr = mapArr3;
            maps = mapArr4;
            c15990r = c15990r3;
            enumC4481v = enumC4481v4;
            i13 = i19;
            objM114209d = obj;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = this.f17971E;
            enumC4481v2 = this.f17979z;
            c15990r2 = this.f17978y;
            mapArr2 = (Map[]) this.f17977x;
            Map[] mapArr5 = (Map[]) this.f17976w;
            AbstractC34132o.m107864I(obj);
            maps = mapArr5;
            objM114209d2 = obj;
        }
        byte[] bArr = (byte[]) objM114209d2;
        mapArr2[i18] = AbstractC37978j.m121633Q(c15990r2, enumC4481v2, bArr != null ? AbstractC39421y.m125916A(bArr) : null);
        AbstractC22676k.m65750j(maps, "maps");
        c26463f = new C26463f();
        enumC4471lArrValues = EnumC4471l.values();
        length = enumC4471lArrValues.length;
        i14 = 0;
        while (i14 < length) {
            enumC4471l = enumC4471lArrValues[i14];
            arrayList = new ArrayList();
            length2 = maps.length;
            for (i15 = i17; i15 < length2; i15++) {
                map2 = (Map) maps[i15].get(enumC4471l);
                if (map2 != null) {
                    arrayList.add(map2);
                }
            }
            c26463f2 = new C26463f();
            it = arrayList.iterator();
            while (it.hasNext()) {
                for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                    c4470k = (C4470k) c26463f2.get(entry.getKey());
                    if (c4470k != null || (map = c4470k.f17995b) == null) {
                        map = C25272z.f99163w;
                    }
                    String str2 = (String) entry.getKey();
                    c26463f2.put(str2, new C4470k(str2, AbstractC25247g0.m73995d0(map, ((C4470k) entry.getValue()).f17995b), ((C4470k) entry.getValue()).f17996c));
                }
            }
            c26463f.put(enumC4471l, c26463f2.m78380b());
            i14++;
            i17 = 0;
        }
        C26463f c26463fM78380b = c26463f.m78380b();
        AbstractC22676k.m65750j(source, "source");
        return new C4469j(c26463fM78380b, source);
        byte[] bArr2 = (byte[]) objM114209d;
        mapArr[i13] = AbstractC37978j.m121633Q(c15990r, enumC4481v, bArr2 != null ? AbstractC39421y.m125916A(bArr2) : null);
        EnumC4481v enumC4481v5 = EnumC4481v.CREDENTIAL;
        String str3 = source.f17990c;
        this.f17976w = maps;
        this.f17977x = maps;
        this.f17978y = c15990r2;
        this.f17979z = enumC4481v5;
        this.f17971E = 1;
        this.f17972F = 2;
        objM114209d2 = ((C35971r) interfaceC35967n).m114209d(str3, this);
        if (objM114209d2 != enumC31071a) {
            enumC4481v2 = enumC4481v5;
            mapArr2 = maps;
            byte[] bArr3 = (byte[]) objM114209d2;
            mapArr2[i18] = AbstractC37978j.m121633Q(c15990r2, enumC4481v2, bArr3 != null ? AbstractC39421y.m125916A(bArr3) : null);
            AbstractC22676k.m65750j(maps, "maps");
            c26463f = new C26463f();
            enumC4471lArrValues = EnumC4471l.values();
            length = enumC4471lArrValues.length;
            i14 = 0;
            while (i14 < length) {
                enumC4471l = enumC4471lArrValues[i14];
                arrayList = new ArrayList();
                length2 = maps.length;
                while (i15 < length2) {
                    map2 = (Map) maps[i15].get(enumC4471l);
                    if (map2 != null) {
                        arrayList.add(map2);
                    }
                }
                c26463f2 = new C26463f();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    while (r10.hasNext()) {
                        c4470k = (C4470k) c26463f2.get(entry.getKey());
                        if (c4470k != null) {
                            map = C25272z.f99163w;
                        } else {
                            map = C25272z.f99163w;
                        }
                        String str4 = (String) entry.getKey();
                        c26463f2.put(str4, new C4470k(str4, AbstractC25247g0.m73995d0(map, ((C4470k) entry.getValue()).f17995b), ((C4470k) entry.getValue()).f17996c));
                    }
                }
                c26463f.put(enumC4471l, c26463f2.m78380b());
                i14++;
                i17 = 0;
            }
            C26463f c26463fM78380b2 = c26463f.m78380b();
            AbstractC22676k.m65750j(source, "source");
            return new C4469j(c26463fM78380b2, source);
        }
        return enumC31071a;
    }
}
