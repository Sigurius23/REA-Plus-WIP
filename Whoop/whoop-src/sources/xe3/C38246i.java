package xe3;

import aa3.C0656u0;
import af3.AbstractC0822a;
import af3.C0835k;
import af3.C0839o;
import bf3.C3205d;
import cf3.AbstractC4545a;
import java.util.ArrayList;
import p188ha.C17039h;

/* JADX INFO: renamed from: xe3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C38246i extends AbstractC4545a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f163985a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0822a f163986b;

    /* JADX INFO: renamed from: c */
    public final Object f163987c;

    public C38246i() {
        this.f163985a = 1;
        this.f163986b = new C0839o();
        this.f163987c = new ArrayList();
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: a */
    public void mo14221a(C3205d c3205d) {
        switch (this.f163985a) {
            case 1:
                ((ArrayList) this.f163987c).add(c3205d.f12559a);
                break;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: e */
    public void mo14225e() {
        int i13;
        switch (this.f163985a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f163987c;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        CharSequence charSequence = (CharSequence) arrayList.get(size);
                        int length = charSequence.length();
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                char cCharAt = charSequence.charAt(i14);
                                if (cCharAt != ' ') {
                                    switch (cCharAt) {
                                        case '\t':
                                        case '\n':
                                        case 11:
                                        case '\f':
                                        case '\r':
                                            break;
                                    }
                                }
                                i14++;
                            } else {
                                i14 = -1;
                            }
                        }
                        if (i14 == -1) {
                            size--;
                        }
                    }
                }
                StringBuilder sb4 = new StringBuilder();
                for (i13 = 0; i13 < size + 1; i13++) {
                    sb4.append((CharSequence) arrayList.get(i13));
                    sb4.append('\n');
                }
                ((C0839o) this.f163986b).f3031g = sb4.toString();
                break;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: f */
    public final AbstractC0822a mo14226f() {
        switch (this.f163985a) {
            case 0:
                return (C0835k) this.f163986b;
            default:
                return (C0839o) this.f163986b;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: h */
    public void mo14228h(C38248k c38248k) {
        switch (this.f163985a) {
            case 0:
                c38248k.m122587e((C0656u0) this.f163987c, (C0835k) this.f163986b);
                break;
        }
    }

    @Override // cf3.AbstractC4545a
    /* JADX INFO: renamed from: i */
    public final C17039h mo14229i(C38244g c38244g) {
        switch (this.f163985a) {
            case 0:
                return null;
            default:
                if (c38244g.f163972h >= 4) {
                    return new C17039h(-1, c38244g.f163968d + 4, false);
                }
                if (c38244g.f163973i) {
                    return C17039h.m48099a(c38244g.f163970f);
                }
                return null;
        }
    }

    public C38246i(int i13, C0656u0 c0656u0) {
        this.f163985a = 0;
        C0835k c0835k = new C0835k();
        this.f163986b = c0835k;
        c0835k.f3027g = i13;
        this.f163987c = c0656u0;
    }
}
