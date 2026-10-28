package uc3;

import f93.C14289a;
import p077d0.C11387o2;
import p087db.C11856j0;
import p715kotlin.jvm.internal.AbstractC22676k;
import rc3.C31236a;
import sc3.C32404r;

/* JADX INFO: renamed from: uc3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C34763a extends AbstractC34765c {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f146428c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f146429d;

    public C34763a(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.f146429d = str;
    }

    @Override // uc3.AbstractC34765c
    /* JADX INFO: renamed from: a */
    public final InterfaceC34767e mo109776a(int i13, int i14, Object obj, String str) {
        switch (this.f146428c) {
            case 0:
                String string = str.subSequence(i13, i14).toString();
                String str2 = (String) this.f146429d;
                if (AbstractC22676k.m65745e(string, str2)) {
                    return null;
                }
                return new C11856j0(str2, 12);
            default:
                int i15 = i14 - i13;
                if (i15 < 1) {
                    return new C11387o2(1, 8);
                }
                if (i15 > 9) {
                    return new C11387o2(9, 9);
                }
                C32404r c32404r = (C32404r) this.f146429d;
                int iCharAt = 0;
                while (i13 < i14) {
                    iCharAt = (iCharAt * 10) + (str.charAt(i13) - '0');
                    i13++;
                }
                Object objM100983b = c32404r.m100983b(obj, new C31236a(iCharAt, i15));
                if (objM100983b == null) {
                    return null;
                }
                return new C14289a(objM100983b, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34763a(C32404r setter, String name) {
        super(null, name);
        AbstractC22676k.m65750j(setter, "setter");
        AbstractC22676k.m65750j(name, "name");
        this.f146429d = setter;
    }
}
