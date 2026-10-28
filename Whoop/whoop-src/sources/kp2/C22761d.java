package kp2;

import java.util.Locale;
import p042c2.EnumC3869n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kp2.d */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lkp2/d;", "", "<init>", "()V", "", "fieldId", "Lc2/n;", "a", "(Ljava/lang/String;)Lc2/n;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22761d {

    /* JADX INFO: renamed from: a */
    public static final C22761d f89610a = new C22761d();

    private C22761d() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final EnumC3869n m65928a(String fieldId) {
        AbstractC22676k.m65750j(fieldId, "fieldId");
        String upperCase = fieldId.toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        switch (upperCase.hashCode()) {
            case -204858576:
                if (upperCase.equals("PROVINCE")) {
                    return EnumC3869n.f15815O;
                }
                return null;
            case 2068843:
                if (upperCase.equals("CITY")) {
                    return EnumC3869n.f15816P;
                }
                return null;
            case 72439485:
                if (upperCase.equals("LINE1")) {
                    return EnumC3869n.f15817Q;
                }
                return null;
            case 72439486:
                if (upperCase.equals("LINE2")) {
                    return EnumC3869n.f15818R;
                }
                return null;
            case 76105038:
                if (upperCase.equals("PHONE")) {
                    return EnumC3869n.f15827a0;
                }
                return null;
            case 129250529:
                if (upperCase.equals("POSTAL_CODE")) {
                    return EnumC3869n.f15807G;
                }
                return null;
            case 353659610:
                if (upperCase.equals("FIRST_NAME")) {
                    return EnumC3869n.f15821U;
                }
                return null;
            case 534302356:
                if (upperCase.equals("LAST_NAME")) {
                    return EnumC3869n.f15822V;
                }
                return null;
            case 1675813750:
                if (upperCase.equals("COUNTRY")) {
                    return EnumC3869n.f15814N;
                }
                return null;
            default:
                return null;
        }
    }
}
