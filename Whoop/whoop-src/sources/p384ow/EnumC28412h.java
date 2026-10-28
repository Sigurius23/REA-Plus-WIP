package p384ow;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ow.h */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC28412h {

    /* JADX INFO: renamed from: w */
    public static final C28404a f114603w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC28412h[] f114604x;

    static {
        C28404a c28404a = new C28404a();
        f114603w = c28404a;
        f114604x = new EnumC28412h[]{c28404a, new EnumC28412h() { // from class: ow.b
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86131c(field.getName());
            }
        }, new EnumC28412h() { // from class: ow.c
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86131c(EnumC28412h.m86130a(field.getName(), ' '));
            }
        }, new EnumC28412h() { // from class: ow.d
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86130a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC28412h() { // from class: ow.e
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86130a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC28412h() { // from class: ow.f
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86130a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC28412h() { // from class: ow.g
            @Override // p384ow.EnumC28412h
            /* JADX INFO: renamed from: b */
            public final String mo86128b(Field field) {
                return EnumC28412h.m86130a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    /* JADX INFO: renamed from: a */
    public static String m86130a(String str, char c3) {
        StringBuilder sb4 = new StringBuilder();
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isUpperCase(cCharAt) && sb4.length() != 0) {
                sb4.append(c3);
            }
            sb4.append(cCharAt);
        }
        return sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m86131c(String str) {
        int length = str.length();
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt = str.charAt(i13);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i13 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i13) + upperCase + str.substring(i13 + 1);
            }
        }
        return str;
    }

    public static EnumC28412h valueOf(String str) {
        return (EnumC28412h) Enum.valueOf(EnumC28412h.class, str);
    }

    public static EnumC28412h[] values() {
        return (EnumC28412h[]) f114604x.clone();
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo86128b(Field field);
}
