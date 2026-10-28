package p292l1;

import i93.C18284j;
import java.util.Arrays;
import java.util.Locale;
import p316m1.C24916n;
import p316m1.C24922t;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l1.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C23198x {

    /* JADX INFO: renamed from: a */
    public final C18284j f91790a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC23142n3 f91791b;

    /* JADX INFO: renamed from: c */
    public final C24922t f91792c;

    /* JADX INFO: renamed from: d */
    public final C23085e0 f91793d;

    /* JADX INFO: renamed from: e */
    public final String f91794e;

    /* JADX INFO: renamed from: f */
    public final String f91795f;

    /* JADX INFO: renamed from: g */
    public final String f91796g;

    public C23198x(C18284j c18284j, InterfaceC23142n3 interfaceC23142n3, C24922t c24922t, C23085e0 c23085e0, String str, String str2, String str3) {
        this.f91790a = c18284j;
        this.f91791b = interfaceC23142n3;
        this.f91792c = c24922t;
        this.f91793d = c23085e0;
        this.f91794e = str;
        this.f91795f = str2;
        this.f91796g = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m67156a(C24916n c24916n, Locale locale) {
        if (c24916n == null) {
            String upperCase = this.f91792c.f97605a.toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.f91794e, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        }
        int i13 = c24916n.f97589w;
        long j7 = c24916n.f97592z;
        C18284j c18284j = this.f91790a;
        if (!c18284j.m52655e(i13)) {
            Object[] objArrCopyOf2 = Arrays.copyOf(new Object[]{AbstractC23114j.m67093a(c18284j.f71133w, locale), AbstractC23114j.m67093a(c18284j.f71134x, locale)}, 2);
            return String.format(this.f91795f, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length));
        }
        InterfaceC23142n3 interfaceC23142n3 = this.f91791b;
        if (interfaceC23142n3.isSelectableYear(i13) && interfaceC23142n3.isSelectableDate(j7)) {
            return "";
        }
        Object[] objArrCopyOf3 = Arrays.copyOf(new Object[]{this.f91793d.m67055a(Long.valueOf(j7), locale, false)}, 1);
        return String.format(this.f91796g, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length));
    }
}
