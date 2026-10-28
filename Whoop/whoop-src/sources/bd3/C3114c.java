package bd3;

import ad3.C0776s;
import cd3.AbstractC4454f;
import l83.C23472r;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;
import zc3.AbstractC40538a;

/* JADX INFO: renamed from: bd3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3114c extends AbstractC40538a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12228a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3141t f12229b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f12230c;

    /* JADX INFO: renamed from: d */
    public final Object f12231d;

    public C3114c(C3141t c3141t, String str) {
        this.f12229b = c3141t;
        this.f12230c = str;
        this.f12231d = c3141t.f12300a.f2764b;
    }

    /* JADX INFO: renamed from: b */
    public void m8977b(String s13) {
        AbstractC22676k.m65750j(s13, "s");
        this.f12229b.mo9031d(this.f12230c, new C0776s(s13, false, null));
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeByte(byte b) {
        switch (this.f12228a) {
            case 1:
                m8977b(C23472r.m68039a(b));
                break;
            default:
                super.encodeByte(b);
                break;
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeInt(int i13) {
        switch (this.f12228a) {
            case 1:
                m8977b(Integer.toUnsignedString(i13));
                break;
            default:
                super.encodeInt(i13);
                break;
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeLong(long j7) {
        switch (this.f12228a) {
            case 1:
                m8977b(Long.toUnsignedString(j7));
                break;
            default:
                super.encodeLong(j7);
                break;
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeShort(short s13) {
        switch (this.f12228a) {
            case 1:
                m8977b(String.valueOf(s13 & 65535));
                break;
            default:
                super.encodeShort(s13);
                break;
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public void encodeString(String value) {
        switch (this.f12228a) {
            case 0:
                AbstractC22676k.m65750j(value, "value");
                this.f12229b.mo9031d(this.f12230c, new C0776s(value, false, (InterfaceC39443g) this.f12231d));
                break;
            default:
                super.encodeString(value);
                break;
        }
    }

    @Override // zc3.InterfaceC40542e
    public final AbstractC4454f getSerializersModule() {
        switch (this.f12228a) {
            case 0:
                return this.f12229b.f12300a.f2764b;
            default:
                return (AbstractC4454f) this.f12231d;
        }
    }

    public C3114c(C3141t c3141t, String str, InterfaceC39443g interfaceC39443g) {
        this.f12229b = c3141t;
        this.f12230c = str;
        this.f12231d = interfaceC39443g;
    }
}
