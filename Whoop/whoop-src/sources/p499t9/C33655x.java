package p499t9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p188ha.C17036e;
import p188ha.C17043l;
import p516u8.C34585c0;
import p516u8.InterfaceC34583b0;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: t9.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C33655x {

    /* JADX INFO: renamed from: c */
    public static final Pattern f140457c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f140458a = -1;

    /* JADX INFO: renamed from: b */
    public int f140459b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m106295a(String str) {
        Matcher matcher = f140457c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i13 = AbstractC38065t.f163031a;
            int i14 = Integer.parseInt(strGroup, 16);
            int i15 = Integer.parseInt(matcher.group(2), 16);
            if (i14 <= 0 && i15 <= 0) {
                return false;
            }
            this.f140458a = i14;
            this.f140459b = i15;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m106296b(C34585c0 c34585c0) {
        int i13 = 0;
        while (true) {
            InterfaceC34583b0[] interfaceC34583b0Arr = c34585c0.f145640a;
            if (i13 >= interfaceC34583b0Arr.length) {
                return;
            }
            InterfaceC34583b0 interfaceC34583b0 = interfaceC34583b0Arr[i13];
            if (interfaceC34583b0 instanceof C17036e) {
                C17036e c17036e = (C17036e) interfaceC34583b0;
                if ("iTunSMPB".equals(c17036e.f65517c) && m106295a(c17036e.f65518d)) {
                    return;
                }
            } else if (interfaceC34583b0 instanceof C17043l) {
                C17043l c17043l = (C17043l) interfaceC34583b0;
                if ("com.apple.iTunes".equals(c17043l.f65530b) && "iTunSMPB".equals(c17043l.f65531c) && m106295a(c17043l.f65532d)) {
                    return;
                }
            } else {
                continue;
            }
            i13++;
        }
    }
}
