package x30;

import p294l3.C23254g;
import p412q3.C29869e0;
import p412q3.InterfaceC29873g0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: x30.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37878c0 implements InterfaceC29873g0 {
    @Override // p412q3.InterfaceC29873g0
    /* JADX INFO: renamed from: a */
    public final C29869e0 mo43546a(C23254g text) {
        AbstractC22676k.m65750j(text, "text");
        String str = text.f92135x;
        int length = str.length();
        String str2 = "";
        for (int i13 = 0; i13 < length; i13++) {
            str2 = str2 + str.charAt(i13);
            if (i13 % 4 == 3 && i13 < 19) {
                str2 = str2 + ' ';
            }
        }
        return new C29869e0(new C23254g(6, str2, null), new C37886f(4));
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C37878c0);
    }

    public final int hashCode() {
        return Character.hashCode(' ');
    }

    public final String toString() {
        return "NineteenPanLength(separator= )";
    }
}
