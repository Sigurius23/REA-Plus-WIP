package uc3;

import f93.C14289a;
import i93.C18284j;
import p077d0.C11387o2;
import sc3.C32404r;

/* JADX INFO: renamed from: uc3.q */
/* JADX INFO: loaded from: classes3.dex */
public final class C34779q extends AbstractC34765c {

    /* JADX INFO: renamed from: c */
    public final Integer f146450c;

    /* JADX INFO: renamed from: d */
    public final Integer f146451d;

    /* JADX INFO: renamed from: e */
    public final C32404r f146452e;

    /* JADX INFO: renamed from: f */
    public final boolean f146453f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C34779q(Integer num, Integer num2, C32404r c32404r, String str, boolean z4) {
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, str);
        this.f146450c = num;
        this.f146451d = num2;
        this.f146452e = c32404r;
        this.f146453f = z4;
        if (num3 == null || new C18284j(1, 9, 1).m52655e(num3.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + str + ": " + num3).toString());
    }

    @Override // uc3.AbstractC34765c
    /* JADX INFO: renamed from: a */
    public final InterfaceC34767e mo109776a(int i13, int i14, Object obj, String str) {
        Integer numValueOf;
        Integer num = this.f146451d;
        if (num != null && i14 - i13 > num.intValue()) {
            return new C11387o2(num.intValue(), 9);
        }
        Integer num2 = this.f146450c;
        if (num2 != null && i14 - i13 < num2.intValue()) {
            return new C11387o2(num2.intValue(), 8);
        }
        int iCharAt = 0;
        while (true) {
            if (i13 >= i14) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i13) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i13++;
        }
        if (numValueOf == null) {
            return C34766d.f146432w;
        }
        boolean z4 = this.f146453f;
        int iIntValue = numValueOf.intValue();
        if (z4) {
            iIntValue = -iIntValue;
        }
        Object objM100983b = this.f146452e.m100983b(obj, Integer.valueOf(iIntValue));
        if (objM100983b == null) {
            return null;
        }
        return new C14289a(objM100983b, 5);
    }
}
