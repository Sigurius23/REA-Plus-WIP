package p578wb;

import hg3.AbstractC17269i;
import java.io.IOException;
import java.util.Locale;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p518ub.InterfaceC34728a;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: wb.a */
/* JADX INFO: loaded from: classes.dex */
public final class C37024a implements InterfaceC33687a {

    /* JADX INFO: renamed from: w */
    public final InterfaceC34728a f158399w;

    public C37024a(InterfaceC34728a db4) {
        AbstractC22676k.m65750j(db4, "db");
        this.f158399w = db4;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f158399w.close();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p500tb.InterfaceC33687a
    /* JADX INFO: renamed from: g1 */
    public final InterfaceC33689c mo68212g1(String sql) {
        String strSubstring;
        EnumC37026c enumC37026c;
        int i13;
        AbstractC22676k.m65750j(sql, "sql");
        InterfaceC34728a interfaceC34728a = this.f158399w;
        C37025b c37025b = null;
        if (!interfaceC34728a.isOpen()) {
            AbstractC17269i.m48901l0(21, "connection is closed");
            throw null;
        }
        String upperCase = AbstractC39414r.m125869O0(sql).toString().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i14 = -1;
        if (length >= 0) {
            int iM125887f0 = 0;
            loop0: while (iM125887f0 < length) {
                char cCharAt = upperCase.charAt(iM125887f0);
                if (AbstractC22676k.m65751k(cCharAt, 32) > 0) {
                    if (cCharAt != '-') {
                        if (cCharAt == '/') {
                            int iM125887f1 = iM125887f0 + 1;
                            if (upperCase.charAt(iM125887f1) == '*') {
                                do {
                                    iM125887f1 = AbstractC39414r.m125887f0(upperCase, '*', iM125887f1 + 1, false, 4);
                                    if (iM125887f1 < 0) {
                                        break loop0;
                                    }
                                    i13 = iM125887f1 + 1;
                                    if (i13 >= length) {
                                        break;
                                    }
                                } while (upperCase.charAt(i13) != '/');
                                iM125887f0 = iM125887f1 + 2;
                            }
                        }
                        i14 = iM125887f0;
                        break;
                    }
                    if (upperCase.charAt(iM125887f0 + 1) != '-') {
                        i14 = iM125887f0;
                        break;
                    }
                    iM125887f0 = AbstractC39414r.m125887f0(upperCase, '\n', iM125887f0 + 2, false, 4);
                    if (iM125887f0 < 0) {
                        break;
                    }
                }
                iM125887f0++;
            }
        }
        if (i14 < 0 || i14 > upperCase.length()) {
            strSubstring = null;
        } else {
            strSubstring = upperCase.substring(i14, Math.min(i14 + 3, upperCase.length()));
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        }
        if (strSubstring == null) {
            return new C37027d(interfaceC34728a, sql);
        }
        switch (strSubstring.hashCode()) {
            case 65636:
                if (!strSubstring.equals("BEG")) {
                    enumC37026c = null;
                } else if (!AbstractC39414r.m125876U(upperCase, "EXCLUSIVE", false)) {
                    enumC37026c = !AbstractC39414r.m125876U(upperCase, "IMMEDIATE", false) ? EnumC37026c.f158401E : EnumC37026c.f158406z;
                } else {
                    enumC37026c = EnumC37026c.f158405y;
                }
                break;
            case 66913:
                if (!strSubstring.equals("COM")) {
                    enumC37026c = null;
                } else {
                    enumC37026c = EnumC37026c.f158403w;
                }
                break;
            case 68795:
                if (!strSubstring.equals("END")) {
                    enumC37026c = null;
                } else {
                    enumC37026c = EnumC37026c.f158403w;
                }
                break;
            case 81327:
                enumC37026c = (!strSubstring.equals("ROL") || AbstractC39414r.m125876U(upperCase, " TO ", false)) ? null : EnumC37026c.f158404x;
                break;
            default:
                enumC37026c = null;
                break;
        }
        if (enumC37026c != null) {
            return new C37027d(interfaceC34728a, sql, enumC37026c);
        }
        if (strSubstring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            if (AbstractC39414r.m125876U(AbstractC39414r.m125859E0(lowerCase, "journal_mode", ""), "=", false)) {
                c37025b = C37025b.f158400a;
            }
        }
        if (c37025b != null) {
            return new C37027d(interfaceC34728a, sql, new C37028e(interfaceC34728a, sql));
        }
        int iHashCode = strSubstring.hashCode();
        return (iHashCode == 79487 ? !strSubstring.equals("PRA") : iHashCode == 81978 ? !strSubstring.equals("SEL") : !(iHashCode == 85954 && strSubstring.equals("WIT"))) ? new C37027d(interfaceC34728a, sql) : new C37028e(interfaceC34728a, sql);
    }

    @Override // p500tb.InterfaceC33687a
    /* JADX INFO: renamed from: v */
    public final boolean mo68216v() {
        return this.f158399w.mo109672v();
    }
}
