package m83;

import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: m83.m0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C25259m0 extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f99143E;

    /* JADX INFO: renamed from: F */
    public int f99144F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f99145G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f99146H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f99147I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ Iterator f99148J;

    /* JADX INFO: renamed from: x */
    public Object f99149x;

    /* JADX INFO: renamed from: y */
    public Iterator f99150y;

    /* JADX INFO: renamed from: z */
    public int f99151z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25259m0(int i13, int i14, Iterator it, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f99146H = i13;
        this.f99147I = i14;
        this.f99148J = it;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C25259m0 c25259m0 = new C25259m0(this.f99146H, this.f99147I, this.f99148J, interfaceC30057d);
        c25259m0.f99145G = obj;
        return c25259m0;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C25259m0) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0084 A[SYNTHETIC] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13;
        int i14;
        int i15;
        Iterator it;
        C25257l0 c25257l0;
        ArrayList arrayList;
        int i16;
        Iterator it3;
        int i17;
        Object next;
        int i18;
        Object[] objArr;
        int i19;
        C25257l0 c25257l1;
        Object next2;
        boolean z4;
        int i24;
        Object[] array;
        C38175j c38175j = (C38175j) this.f99145G;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i25 = this.f99144F;
        int i26 = this.f99147I;
        boolean z13 = true;
        int i27 = this.f99146H;
        if (i25 == 0) {
            AbstractC34132o.m107864I(obj);
            int i28 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            if (i27 <= 1024) {
                i28 = i27;
            }
            i13 = i26 - i27;
            Iterator it4 = this.f99148J;
            if (i13 >= 0) {
                arrayList = new ArrayList(i28);
                i16 = i28;
                it3 = it4;
                i17 = 0;
                while (it3.hasNext()) {
                    next = it3.next();
                    if (i17 > 0) {
                        i17--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i27) {
                            this.f99145G = c38175j;
                            this.f99149x = arrayList;
                            this.f99150y = it3;
                            this.f99151z = i16;
                            this.f99143E = i13;
                            this.f99144F = 1;
                            c38175j.m122271b(arrayList, this);
                            EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                            return enumC31071a;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f99145G = null;
                    this.f99149x = null;
                    this.f99150y = null;
                    this.f99151z = i16;
                    this.f99143E = i13;
                    this.f99144F = 2;
                    c38175j.m122271b(arrayList, this);
                    EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
            } else {
                C25257l0 c25257l2 = new C25257l0(0, new Object[i28]);
                i14 = i28;
                i15 = i13;
                it = it4;
                c25257l0 = c25257l2;
                while (true) {
                    i18 = c25257l0.f99136x;
                    objArr = c25257l0.f99135w;
                    if (it.hasNext()) {
                        i19 = i14;
                        c25257l1 = c25257l0;
                        break;
                    }
                    next2 = it.next();
                    z4 = z13;
                    if (c25257l0.mo73980a() != i18) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i29 = c25257l0.f99137y;
                    int i34 = c25257l0.f99138z;
                    objArr[(i29 + i34) % i18] = next2;
                    c25257l0.f99138z = i34 + 1;
                    if (c25257l0.mo73980a() != i18) {
                        if (c25257l0.f99138z < i27) {
                            ArrayList arrayList2 = new ArrayList(c25257l0);
                            this.f99145G = c38175j;
                            this.f99149x = c25257l0;
                            this.f99150y = it;
                            this.f99151z = i14;
                            this.f99143E = i15;
                            this.f99144F = 3;
                            c38175j.m122271b(arrayList2, this);
                            EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                            return enumC31071a;
                        }
                        i24 = i18 + (i18 >> 1) + 1;
                        if (i24 > i27) {
                            i24 = i27;
                        }
                        if (c25257l0.f99137y == 0) {
                            array = Arrays.copyOf(objArr, i24);
                            AbstractC22676k.m65749i(array, "copyOf(...)");
                        } else {
                            array = c25257l0.toArray(new Object[i24]);
                        }
                        c25257l0 = new C25257l0(c25257l0.f99138z, array);
                    }
                    z13 = z4;
                }
                if (c25257l1.f99138z > i26) {
                    ArrayList arrayList3 = new ArrayList(c25257l1);
                    this.f99145G = c38175j;
                    this.f99149x = c25257l1;
                    this.f99150y = null;
                    this.f99151z = i19;
                    this.f99143E = i15;
                    this.f99144F = 4;
                    c38175j.m122271b(arrayList3, this);
                    EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
                if (!c25257l1.isEmpty()) {
                    this.f99145G = null;
                    this.f99149x = null;
                    this.f99150y = null;
                    this.f99151z = i19;
                    this.f99143E = i15;
                    this.f99144F = 5;
                    c38175j.m122271b(c25257l1, this);
                    EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
            }
        } else if (i25 != 1) {
            if (i25 != 2) {
                if (i25 == 3) {
                    i15 = this.f99143E;
                    i14 = this.f99151z;
                    it = this.f99150y;
                    c25257l0 = (C25257l0) this.f99149x;
                    AbstractC34132o.m107864I(obj);
                    c25257l0.m74014c(i26);
                    while (true) {
                        i18 = c25257l0.f99136x;
                        objArr = c25257l0.f99135w;
                        if (it.hasNext()) {
                            i19 = i14;
                            c25257l1 = c25257l0;
                            break;
                        }
                        next2 = it.next();
                        z4 = z13;
                        if (c25257l0.mo73980a() != i18) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i210 = c25257l0.f99137y;
                        int i35 = c25257l0.f99138z;
                        objArr[(i210 + i35) % i18] = next2;
                        c25257l0.f99138z = i35 + 1;
                        if (c25257l0.mo73980a() != i18) {
                            if (c25257l0.f99138z < i27) {
                                ArrayList arrayList4 = new ArrayList(c25257l0);
                                this.f99145G = c38175j;
                                this.f99149x = c25257l0;
                                this.f99150y = it;
                                this.f99151z = i14;
                                this.f99143E = i15;
                                this.f99144F = 3;
                                c38175j.m122271b(arrayList4, this);
                                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                                return enumC31071a;
                            }
                            i24 = i18 + (i18 >> 1) + 1;
                            if (i24 > i27) {
                                i24 = i27;
                            }
                            if (c25257l0.f99137y == 0) {
                                array = Arrays.copyOf(objArr, i24);
                                AbstractC22676k.m65749i(array, "copyOf(...)");
                            } else {
                                array = c25257l0.toArray(new Object[i24]);
                            }
                            c25257l0 = new C25257l0(c25257l0.f99138z, array);
                        }
                        z13 = z4;
                    }
                } else if (i25 == 4) {
                    i15 = this.f99143E;
                    i19 = this.f99151z;
                    c25257l1 = (C25257l0) this.f99149x;
                    AbstractC34132o.m107864I(obj);
                    c25257l1.m74014c(i26);
                } else {
                    if (i25 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                if (c25257l1.f99138z > i26) {
                    ArrayList arrayList5 = new ArrayList(c25257l1);
                    this.f99145G = c38175j;
                    this.f99149x = c25257l1;
                    this.f99150y = null;
                    this.f99151z = i19;
                    this.f99143E = i15;
                    this.f99144F = 4;
                    c38175j.m122271b(arrayList5, this);
                    EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
                if (!c25257l1.isEmpty()) {
                    this.f99145G = null;
                    this.f99149x = null;
                    this.f99150y = null;
                    this.f99151z = i19;
                    this.f99143E = i15;
                    this.f99144F = 5;
                    c38175j.m122271b(c25257l1, this);
                    EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
            }
            AbstractC34132o.m107864I(obj);
        } else {
            i17 = this.f99143E;
            i16 = this.f99151z;
            it3 = this.f99150y;
            AbstractC34132o.m107864I(obj);
            arrayList = new ArrayList(i27);
            i13 = i17;
            while (it3.hasNext()) {
                next = it3.next();
                if (i17 > 0) {
                    i17--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i27) {
                        this.f99145G = c38175j;
                        this.f99149x = arrayList;
                        this.f99150y = it3;
                        this.f99151z = i16;
                        this.f99143E = i13;
                        this.f99144F = 1;
                        c38175j.m122271b(arrayList, this);
                        EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                        return enumC31071a;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f99145G = null;
                this.f99149x = null;
                this.f99150y = null;
                this.f99151z = i16;
                this.f99143E = i13;
                this.f99144F = 2;
                c38175j.m122271b(arrayList, this);
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                return enumC31071a;
            }
        }
        return C23454a0.f92919a;
    }
}
