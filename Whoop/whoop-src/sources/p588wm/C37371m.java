package p588wm;

import in.C18715c;
import in.InterfaceC18714b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p309lo.AbstractC24567y;
import p345nn.C26854e;
import p345nn.C26859j;

/* JADX INFO: renamed from: wm.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C37371m {

    /* JADX INFO: renamed from: c */
    public static final Pattern f159860c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f159861a = -1;

    /* JADX INFO: renamed from: b */
    public int f159862b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m119653a(String str) {
        Matcher matcher = f159860c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i13 = AbstractC24567y.f95875a;
            int i14 = Integer.parseInt(strGroup, 16);
            int i15 = Integer.parseInt(matcher.group(2), 16);
            if (i14 <= 0 && i15 <= 0) {
                return false;
            }
            this.f159861a = i14;
            this.f159862b = i15;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m119654b(C18715c c18715c) {
        int i13 = 0;
        while (true) {
            InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
            if (i13 >= interfaceC18714bArr.length) {
                return;
            }
            InterfaceC18714b interfaceC18714b = interfaceC18714bArr[i13];
            if (interfaceC18714b instanceof C26854e) {
                C26854e c26854e = (C26854e) interfaceC18714b;
                if ("iTunSMPB".equals(c26854e.f107169y) && m119653a(c26854e.f107170z)) {
                    return;
                }
            } else if (interfaceC18714b instanceof C26859j) {
                C26859j c26859j = (C26859j) interfaceC18714b;
                if ("com.apple.iTunes".equals(c26859j.f107178x) && "iTunSMPB".equals(c26859j.f107179y) && m119653a(c26859j.f107180z)) {
                    return;
                }
            } else {
                continue;
            }
            i13++;
        }
    }
}
