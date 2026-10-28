package p138f6;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC1204c0;
import androidx.datastore.preferences.protobuf.AbstractC1269z;
import androidx.datastore.preferences.protobuf.C1218h;
import androidx.datastore.preferences.protobuf.C1236n;
import androidx.datastore.preferences.protobuf.InterfaceC1201b0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import c93.InterfaceC4339a;
import e61.C12762e;
import ge3.AbstractC15751g;
import hc3.C17171d;
import io.sentry.hints.C20363j;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import m83.AbstractC25265s;
import m83.C25271y;
import p007a6.C0410c;
import p007a6.C0429i0;
import p007a6.C0441m0;
import p007a6.InterfaceC0465y0;
import p108e4.AbstractC12682p;
import p109e6.C12747b;
import p109e6.C12749d;
import p109e6.C12750e;
import p109e6.C12751f;
import p109e6.C12752g;
import p109e6.C12753h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: f6.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14131c implements InterfaceC0465y0 {

    /* JADX INFO: renamed from: a */
    public static final C14131c f50836a = new C14131c();

    /* JADX INFO: renamed from: d */
    public static C14130b m40232d(List migrations, C17171d c17171d, InterfaceC4339a interfaceC4339a, int i13) {
        if ((i13 & 2) != 0) {
            migrations = C25271y.f99162w;
        }
        if ((i13 & 4) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            c17171d = AbstractC3006f0.m8708b(ExecutorC22364d.f87316w.plus(AbstractC3006f0.m8710d()));
        }
        AbstractC22676k.m65750j(migrations, "migrations");
        return new C14130b(new C14130b(new C0429i0(new C0441m0(f50836a, new C12762e(interfaceC4339a, 3)), AbstractC37056f.m118958J(new C0410c(migrations, null, 0)), new C20363j(10), c17171d)));
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: a */
    public Object mo1122a() {
        return new C14129a(true);
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: b */
    public Object mo1123b(InputStream input) throws CorruptionException {
        byte[] bArr;
        AbstractC22676k.m65750j(input, "input");
        try {
            C12749d c12749dM35673o = C12749d.m35673o(input);
            C14129a c14129a = new C14129a(false);
            AbstractC14133e[] pairs = (AbstractC14133e[]) Arrays.copyOf(new AbstractC14133e[0], 0);
            AbstractC22676k.m65750j(pairs, "pairs");
            c14129a.m40228e();
            if (pairs.length > 0) {
                AbstractC14133e abstractC14133e = pairs[0];
                throw null;
            }
            Map mapM35674m = c12749dM35673o.m35674m();
            AbstractC22676k.m65749i(mapM35674m, "getPreferencesMap(...)");
            for (Map.Entry entry : mapM35674m.entrySet()) {
                String str = (String) entry.getKey();
                C12753h c12753h = (C12753h) entry.getValue();
                AbstractC22676k.m65747g(str);
                AbstractC22676k.m65747g(c12753h);
                int iM35693C = c12753h.m35693C();
                switch (iM35693C == 0 ? -1 : AbstractC14135g.f50838a[AbstractC12682p.m35485e(iM35693C)]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        c14129a.m40231h(AbstractC15751g.m44453f(str), Boolean.valueOf(c12753h.m35694t()));
                        break;
                    case 2:
                        c14129a.m40231h(AbstractC15751g.m44471x(str), Float.valueOf(c12753h.m35697x()));
                        break;
                    case 3:
                        c14129a.m40231h(new C14132d(str), Double.valueOf(c12753h.m35696w()));
                        break;
                    case 4:
                        c14129a.m40231h(AbstractC15751g.m44423C(str), Integer.valueOf(c12753h.m35698y()));
                        break;
                    case 5:
                        c14129a.m40231h(AbstractC15751g.m44429I(str), Long.valueOf(c12753h.m35699z()));
                        break;
                    case 6:
                        c14129a.m40231h(AbstractC15751g.m44441U(str), c12753h.m35691A());
                        break;
                    case 7:
                        C14132d c14132dM44442V = AbstractC15751g.m44442V(str);
                        InterfaceC1201b0 interfaceC1201b0M35680o = c12753h.m35692B().m35680o();
                        AbstractC22676k.m65749i(interfaceC1201b0M35680o, "getStringsList(...)");
                        c14129a.m40231h(c14132dM44442V, AbstractC25265s.m74103I1(interfaceC1201b0M35680o));
                        break;
                    case 8:
                        C14132d c14132d = new C14132d(str);
                        C1218h c1218hM35695u = c12753h.m35695u();
                        int size = c1218hM35695u.size();
                        if (size == 0) {
                            bArr = AbstractC1204c0.f5363b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            c1218hM35695u.mo3798e(size, bArr2);
                            bArr = bArr2;
                        }
                        c14129a.m40231h(c14132d, bArr);
                        break;
                    case 9:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return c14129a.m40234d();
        } catch (InvalidProtocolBufferException e5) {
            throw new CorruptionException("Unable to parse preferences proto.", e5);
        }
    }

    @Override // p007a6.InterfaceC0465y0
    /* JADX INFO: renamed from: c */
    public void mo1124c(OutputStream outputStream, Object obj) throws IOException {
        AbstractC1269z abstractC1269zM4013a;
        Map mapMo40226a = ((AbstractC14134f) obj).mo40226a();
        C12747b c12747bM35672n = C12749d.m35672n();
        for (Map.Entry entry : mapMo40226a.entrySet()) {
            C14132d c14132d = (C14132d) entry.getKey();
            Object value = entry.getValue();
            String str = c14132d.f50837a;
            if (value instanceof Boolean) {
                C12752g c12752gM35681D = C12753h.m35681D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                c12752gM35681D.m4015c();
                C12753h.m35687q((C12753h) c12752gM35681D.f5506x, zBooleanValue);
                abstractC1269zM4013a = c12752gM35681D.m4013a();
            } else if (value instanceof Float) {
                C12752g c12752gM35681D2 = C12753h.m35681D();
                float fFloatValue = ((Number) value).floatValue();
                c12752gM35681D2.m4015c();
                C12753h.m35688r((C12753h) c12752gM35681D2.f5506x, fFloatValue);
                abstractC1269zM4013a = c12752gM35681D2.m4013a();
            } else if (value instanceof Double) {
                C12752g c12752gM35681D3 = C12753h.m35681D();
                double dDoubleValue = ((Number) value).doubleValue();
                c12752gM35681D3.m4015c();
                C12753h.m35685o((C12753h) c12752gM35681D3.f5506x, dDoubleValue);
                abstractC1269zM4013a = c12752gM35681D3.m4013a();
            } else if (value instanceof Integer) {
                C12752g c12752gM35681D4 = C12753h.m35681D();
                int iIntValue = ((Number) value).intValue();
                c12752gM35681D4.m4015c();
                C12753h.m35689s((C12753h) c12752gM35681D4.f5506x, iIntValue);
                abstractC1269zM4013a = c12752gM35681D4.m4013a();
            } else if (value instanceof Long) {
                C12752g c12752gM35681D5 = C12753h.m35681D();
                long jLongValue = ((Number) value).longValue();
                c12752gM35681D5.m4015c();
                C12753h.m35682l((C12753h) c12752gM35681D5.f5506x, jLongValue);
                abstractC1269zM4013a = c12752gM35681D5.m4013a();
            } else if (value instanceof String) {
                C12752g c12752gM35681D6 = C12753h.m35681D();
                c12752gM35681D6.m4015c();
                C12753h.m35683m((C12753h) c12752gM35681D6.f5506x, (String) value);
                abstractC1269zM4013a = c12752gM35681D6.m4013a();
            } else if (value instanceof Set) {
                C12752g c12752gM35681D7 = C12753h.m35681D();
                C12750e c12750eM35679p = C12751f.m35679p();
                c12750eM35679p.m35675d((Set) value);
                c12752gM35681D7.m4015c();
                C12753h.m35684n((C12753h) c12752gM35681D7.f5506x, (C12751f) c12750eM35679p.m4013a());
                abstractC1269zM4013a = c12752gM35681D7.m4013a();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                C12752g c12752gM35681D8 = C12753h.m35681D();
                byte[] bArr = (byte[]) value;
                C1218h c1218hM3808d = C1218h.m3808d(bArr, 0, bArr.length);
                c12752gM35681D8.m4015c();
                C12753h.m35686p((C12753h) c12752gM35681D8.f5506x, c1218hM3808d);
                abstractC1269zM4013a = c12752gM35681D8.m4013a();
            }
            c12747bM35672n.getClass();
            str.getClass();
            c12747bM35672n.m4015c();
            C12749d.m35671l((C12749d) c12747bM35672n.f5506x).put(str, (C12753h) abstractC1269zM4013a);
        }
        C12749d c12749d = (C12749d) c12747bM35672n.m4013a();
        int iMo3748a = c12749d.mo3748a(null);
        Logger logger = C1236n.f5438i;
        if (iMo3748a > 4096) {
            iMo3748a = 4096;
        }
        C1236n c1236n = new C1236n(outputStream, iMo3748a);
        c12749d.mo3749b(c1236n);
        if (c1236n.f5443g > 0) {
            c1236n.m3957v0();
        }
    }
}
