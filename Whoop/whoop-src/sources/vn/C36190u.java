package vn;

import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import no.nordicsemi.android.dfu.DfuBaseService;
import p199ho.AbstractC17528i;
import p199ho.AbstractC17530k;
import p309lo.C24566x;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33650s;
import p588wm.C37364f;
import p588wm.C37370l;
import p588wm.InterfaceC37367i;
import p588wm.InterfaceC37368j;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;

/* JADX INFO: renamed from: vn.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C36190u implements InterfaceC37367i {

    /* JADX INFO: renamed from: g */
    public static final Pattern f154921g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f154922h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a */
    public final String f154923a;

    /* JADX INFO: renamed from: b */
    public final C24566x f154924b;

    /* JADX INFO: renamed from: d */
    public InterfaceC37369k f154926d;

    /* JADX INFO: renamed from: f */
    public int f154928f;

    /* JADX INFO: renamed from: c */
    public final C13117a f154925c = new C13117a();

    /* JADX INFO: renamed from: e */
    public byte[] f154927e = new byte[DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED];

    public C36190u(String str, C24566x c24566x) {
        this.f154923a = str;
        this.f154924b = c24566x;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC37377s m115144a(long j7) {
        InterfaceC37377s interfaceC37377sMo3102o = this.f154926d.mo3102o(0, 3);
        C31518b0 c31518b0 = new C31518b0();
        c31518b0.f130047k = "text/vtt";
        c31518b0.f130039c = this.f154923a;
        c31518b0.f130051o = j7;
        interfaceC37377sMo3102o.mo102730a(new C31521c0(c31518b0));
        this.f154926d.mo3098l();
        return interfaceC37377sMo3102o;
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: b */
    public final void mo3071b(long j7, long j13) {
        throw new IllegalStateException();
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: g */
    public final boolean mo3073g(InterfaceC37368j interfaceC37368j) {
        C37364f c37364f = (C37364f) interfaceC37368j;
        c37364f.mo3092c(this.f154927e, 0, 6, false);
        byte[] bArr = this.f154927e;
        C13117a c13117a = this.f154925c;
        c13117a.m36687I(6, bArr);
        Pattern pattern = AbstractC17530k.f67808a;
        String strM36700j = c13117a.m36700j();
        if (strM36700j != null && strM36700j.startsWith("WEBVTT")) {
            return true;
        }
        c37364f.mo3092c(this.f154927e, 6, 3, false);
        c13117a.m36687I(9, this.f154927e);
        String strM36700j2 = c13117a.m36700j();
        return strM36700j2 != null && strM36700j2.startsWith("WEBVTT");
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: h */
    public final void mo3074h(InterfaceC37369k interfaceC37369k) {
        this.f154926d = interfaceC37369k;
        interfaceC37369k.mo3111x(new C37370l(-9223372036854775807L));
    }

    @Override // p588wm.InterfaceC37367i
    /* JADX INFO: renamed from: i */
    public final int mo3075i(InterfaceC37368j interfaceC37368j, C33650s c33650s) throws ParserException, EOFException, InterruptedIOException {
        String strM36700j;
        this.f154926d.getClass();
        int i13 = (int) ((C37364f) interfaceC37368j).f159851y;
        int i14 = this.f154928f;
        byte[] bArr = this.f154927e;
        int i15 = -1;
        if (i14 == bArr.length) {
            this.f154927e = Arrays.copyOf(bArr, ((i13 != -1 ? i13 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f154927e;
        int i16 = this.f154928f;
        int i17 = ((C37364f) interfaceC37368j).read(bArr2, i16, bArr2.length - i16);
        if (i17 != -1) {
            int i18 = this.f154928f + i17;
            this.f154928f = i18;
            if (i13 == -1 || i18 != i13) {
                return 0;
            }
        }
        C13117a c13117a = new C13117a(this.f154927e, 1, (byte) 0);
        AbstractC17530k.m49777c(c13117a);
        String strM36700j2 = c13117a.m36700j();
        long j7 = 0;
        long jM49776b = 0;
        while (true) {
            int i19 = i15;
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM36700j2)) {
                while (true) {
                    String strM36700j3 = c13117a.m36700j();
                    if (strM36700j3 == null) {
                        break;
                    }
                    if (AbstractC17530k.f67808a.matcher(strM36700j3).matches()) {
                        do {
                            strM36700j = c13117a.m36700j();
                            if (strM36700j == null) {
                                break;
                            }
                        } while (!strM36700j.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC17528i.f67802a.matcher(strM36700j3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m115144a(0L);
                    return i19;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM49776b2 = AbstractC17530k.m49776b(strGroup);
                long jM71660b = this.f154924b.m71660b(((((j7 + jM49776b2) - jM49776b) * 90000) / 1000000) % 8589934592L);
                InterfaceC37377s interfaceC37377sM115144a = m115144a(jM71660b - jM49776b2);
                byte[] bArr3 = this.f154927e;
                int i24 = this.f154928f;
                C13117a c13117a2 = this.f154925c;
                c13117a2.m36687I(i24, bArr3);
                interfaceC37377sM115144a.mo102732c(this.f154928f, c13117a2);
                interfaceC37377sM115144a.mo102733d(jM71660b, 1, this.f154928f, 0, null);
                return i19;
            }
            if (strM36700j2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f154921g.matcher(strM36700j2);
                if (!matcher3.find()) {
                    throw ParserException.m15562a(null, strM36700j2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM36700j2) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher4 = f154922h.matcher(strM36700j2);
                if (!matcher4.find()) {
                    throw ParserException.m15562a(null, strM36700j2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM36700j2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM49776b = AbstractC17530k.m49776b(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                j7 = (Long.parseLong(strGroup3) * 1000000) / 90000;
            }
            strM36700j2 = c13117a.m36700j();
            i15 = i19;
        }
    }

    @Override // p588wm.InterfaceC37367i
    public final void release() {
    }
}
