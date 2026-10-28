package p390p1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p002a0.C0020f0;
import p002a0.C0047q0;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32274h;
import xb3.C38175j;

/* JADX INFO: renamed from: p1.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C28627j extends AbstractC32274h implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public int f115805E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f115806F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C28631k f115807G;

    /* JADX INFO: renamed from: x */
    public int f115808x;

    /* JADX INFO: renamed from: y */
    public int f115809y;

    /* JADX INFO: renamed from: z */
    public int f115810z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28627j(C28631k c28631k, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f115807G = c28631k;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        C28627j c28627j = new C28627j(this.f115807G, interfaceC30057d);
        c28627j.f115806F = obj;
        return c28627j;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return ((C28627j) create((C38175j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C38175j c38175j;
        int i13;
        int i14;
        int i15;
        String strM8295h;
        int i16;
        int i17;
        String str;
        C28631k c28631k = this.f115807G;
        C0047q0 c0047q0 = c28631k.f115814w;
        C0020f0 c0020f0 = c28631k.f115816y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i18 = this.f115805E;
        if (i18 == 0) {
            AbstractC34132o.m107864I(obj);
            c38175j = (C38175j) this.f115806F;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        } else {
            if (i18 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = this.f115810z;
            i14 = this.f115809y;
            i15 = this.f115808x;
            c38175j = (C38175j) this.f115806F;
            AbstractC34132o.m107864I(obj);
        }
        if (i15 >= Math.min(c28631k.f115817z, c0020f0.f47b)) {
            return C23454a0.f92919a;
        }
        int i19 = i15 + 1;
        int iM28c = c0020f0.m28c(i15);
        switch (iM28c) {
            case 0:
                strM8295h = "up";
                break;
            case 1:
                String strM73375h = AbstractC25012a.m73375h(c0047q0.m102e(i14), "down ");
                i14++;
                strM8295h = strM73375h;
                break;
            case 2:
                strM8295h = "remove " + c0020f0.m28c(i19) + ' ' + c0020f0.m28c(i15 + 2);
                i19 = i15 + 3;
                break;
            case 3:
                strM8295h = "move " + c0020f0.m28c(i19) + ' ' + c0020f0.m28c(i15 + 2) + ' ' + c0020f0.m28c(i15 + 3);
                i19 = i15 + 4;
                break;
            case 4:
                strM8295h = "clear";
                break;
            case 5:
                i16 = i15 + 2;
                int iM28c2 = c0020f0.m28c(i19);
                i17 = i14 + 1;
                str = "insertBottomUp " + iM28c2 + ' ' + c0047q0.m102e(i14);
                int i24 = i16;
                strM8295h = str;
                i19 = i24;
                i14 = i17;
                break;
            case 6:
                i16 = i15 + 2;
                int iM28c3 = c0020f0.m28c(i19);
                i17 = i14 + 1;
                str = "insertTopDown " + iM28c3 + ' ' + c0047q0.m102e(i14);
                int i25 = i16;
                strM8295h = str;
                i19 = i25;
                i14 = i17;
                break;
            case 7:
                int i26 = i14 + 1;
                Object objM102e = c0047q0.m102e(i14);
                AbstractC22676k.m65748h(objM102e, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                AbstractC22681m0.m65774e(2, objM102e);
                i14 += 2;
                strM8295h = "apply " + ((InterfaceC4351m) objM102e) + ' ' + c0047q0.m102e(i26);
                break;
            case 8:
                strM8295h = "reuse " + c28631k.f115815x.m102e(i13);
                i13++;
                break;
            default:
                strM8295h = AbstractC2875y.m8295h(iM28c, "unknown op: ");
                break;
        }
        this.f115806F = c38175j;
        this.f115808x = i19;
        this.f115809y = i14;
        this.f115810z = i13;
        this.f115805E = 1;
        c38175j.m122271b(i15 + ": " + strM8295h, this);
        return enumC31071a;
    }
}
