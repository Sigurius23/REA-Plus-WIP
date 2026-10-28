package oa3;

import db3.EnumC11891c;
import p319m4.AbstractC25012a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oa3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C27770m {

    /* JADX INFO: renamed from: a */
    public static final C27770m f111970a = new C27770m();

    /* JADX INFO: renamed from: a */
    public static AbstractC27769l m83875a(String representation) {
        EnumC11891c enumC11891c;
        AbstractC22676k.m65750j(representation, "representation");
        char cCharAt = representation.charAt(0);
        EnumC11891c[] enumC11891cArrValues = EnumC11891c.values();
        int length = enumC11891cArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                enumC11891c = null;
                break;
            }
            enumC11891c = enumC11891cArrValues[i13];
            if (enumC11891c.m31931c().charAt(0) == cCharAt) {
                break;
            }
            i13++;
        }
        if (enumC11891c != null) {
            return new C27768k(enumC11891c);
        }
        if (cCharAt == 'V') {
            return new C27768k(null);
        }
        if (cCharAt == '[') {
            String strSubstring = representation.substring(1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            return new C27766i(m83875a(strSubstring));
        }
        if (cCharAt == 'L') {
            AbstractC39414r.m125881Z(representation, ';');
        }
        String strSubstring2 = representation.substring(1, representation.length() - 1);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        return new C27767j(strSubstring2);
    }

    /* JADX INFO: renamed from: b */
    public static C27767j m83876b(String internalName) {
        AbstractC22676k.m65750j(internalName, "internalName");
        return new C27767j(internalName);
    }

    /* JADX INFO: renamed from: c */
    public static String m83877c(AbstractC27769l type) {
        String strM31931c;
        AbstractC22676k.m65750j(type, "type");
        if (type instanceof C27766i) {
            return "[" + m83877c(((C27766i) type).f111959i);
        }
        if (type instanceof C27768k) {
            EnumC11891c enumC11891c = ((C27768k) type).f111961i;
            return (enumC11891c == null || (strM31931c = enumC11891c.m31931c()) == null) ? "V" : strM31931c;
        }
        if (type instanceof C27767j) {
            return AbstractC25012a.m73377j(new StringBuilder("L"), ((C27767j) type).f111960i, ';');
        }
        throw new NoWhenBranchMatchedException();
    }
}
