package bd3;

import ad3.AbstractC0757c;
import ad3.C0766i;
import ad3.C0771n;
import ad3.EnumC0753a;
import ad3.InterfaceC0773p;
import cd3.AbstractC4454f;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;
import wc3.InterfaceC37145j;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.AbstractC40538a;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: bd3.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3123g0 extends AbstractC40538a implements InterfaceC0773p {

    /* JADX INFO: renamed from: a */
    public final C3130k f12254a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0757c f12255b;

    /* JADX INFO: renamed from: c */
    public final EnumC3133l0 f12256c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0773p[] f12257d;

    /* JADX INFO: renamed from: e */
    public final AbstractC4454f f12258e;

    /* JADX INFO: renamed from: f */
    public final C0766i f12259f;

    /* JADX INFO: renamed from: g */
    public boolean f12260g;

    /* JADX INFO: renamed from: h */
    public String f12261h;

    /* JADX INFO: renamed from: i */
    public String f12262i;

    public C3123g0(C3130k composer, AbstractC0757c abstractC0757c, EnumC3133l0 enumC3133l0, InterfaceC0773p[] interfaceC0773pArr) {
        AbstractC22676k.m65750j(composer, "composer");
        this.f12254a = composer;
        this.f12255b = abstractC0757c;
        this.f12256c = enumC3133l0;
        this.f12257d = interfaceC0773pArr;
        this.f12258e = abstractC0757c.f2764b;
        this.f12259f = abstractC0757c.f2763a;
        int iOrdinal = enumC3133l0.ordinal();
        if (interfaceC0773pArr != null) {
            InterfaceC0773p interfaceC0773p = interfaceC0773pArr[iOrdinal];
            if (interfaceC0773p == null && interfaceC0773p == this) {
                return;
            }
            interfaceC0773pArr[iOrdinal] = this;
        }
    }

    @Override // ad3.InterfaceC0773p
    /* JADX INFO: renamed from: a */
    public final AbstractC0757c mo1852a() {
        return this.f12255b;
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        InterfaceC0773p interfaceC0773p;
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC0757c abstractC0757c = this.f12255b;
        EnumC3133l0 enumC3133l0M9025u = AbstractC3138q.m9025u(abstractC0757c, descriptor);
        char c3 = enumC3133l0M9025u.f12287w;
        C3130k c3130k = this.f12254a;
        c3130k.m8996g(c3);
        c3130k.mo8990a();
        String str = this.f12261h;
        if (str != null) {
            String serialName = this.f12262i;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            c3130k.mo8991b();
            encodeString(str);
            c3130k.m8996g(':');
            c3130k.mo9003n();
            encodeString(serialName);
            this.f12261h = null;
            this.f12262i = null;
        }
        if (this.f12256c == enumC3133l0M9025u) {
            return this;
        }
        InterfaceC0773p[] interfaceC0773pArr = this.f12257d;
        return (interfaceC0773pArr == null || (interfaceC0773p = interfaceC0773pArr[enumC3133l0M9025u.ordinal()]) == null) ? new C3123g0(c3130k, abstractC0757c, enumC3133l0M9025u, interfaceC0773pArr) : interfaceC0773p;
    }

    @Override // ad3.InterfaceC0773p
    /* JADX INFO: renamed from: c */
    public final void mo1853c(JsonElement element) {
        AbstractC22676k.m65750j(element, "element");
        if (this.f12261h == null || (element instanceof JsonObject)) {
            encodeSerializableValue(C0771n.f2806a, element);
        } else {
            AbstractC3138q.m9027w(this.f12262i, element);
            throw null;
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeBoolean(boolean z4) {
        if (this.f12260g) {
            encodeString(String.valueOf(z4));
        } else {
            ((C3143v) this.f12254a.f12277c).m9047p(String.valueOf(z4));
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeByte(byte b) {
        if (this.f12260g) {
            encodeString(String.valueOf((int) b));
        } else {
            this.f12254a.mo8995f(b);
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeChar(char c3) {
        encodeString(String.valueOf(c3));
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeDouble(double d3) {
        boolean z4 = this.f12260g;
        C3130k c3130k = this.f12254a;
        if (z4) {
            encodeString(String.valueOf(d3));
        } else {
            ((C3143v) c3130k.f12277c).m9047p(String.valueOf(d3));
        }
        if (this.f12259f.f2798j || Math.abs(d3) <= Double.MAX_VALUE) {
            return;
        }
        throw AbstractC3138q.m9005a(((C3143v) c3130k.f12277c).toString(), Double.valueOf(d3));
    }

    @Override // zc3.AbstractC40538a
    public final boolean encodeElement(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        int iOrdinal = this.f12256c.ordinal();
        C3130k c3130k = this.f12254a;
        if (iOrdinal == 1) {
            if (!c3130k.f12276b) {
                c3130k.m8996g(DateTimeRange.lowerUpperDelimiter);
            }
            c3130k.mo8991b();
            return true;
        }
        boolean z4 = false;
        if (iOrdinal == 2) {
            if (c3130k.f12276b) {
                this.f12260g = true;
                c3130k.mo8991b();
                return true;
            }
            if (i13 % 2 == 0) {
                c3130k.m8996g(DateTimeRange.lowerUpperDelimiter);
                c3130k.mo8991b();
                z4 = true;
            } else {
                c3130k.m8996g(':');
                c3130k.mo9003n();
            }
            this.f12260g = z4;
            return true;
        }
        if (iOrdinal != 3) {
            if (!c3130k.f12276b) {
                c3130k.m8996g(DateTimeRange.lowerUpperDelimiter);
            }
            c3130k.mo8991b();
            encodeString(AbstractC3138q.m9017m(descriptor, this.f12255b, i13));
            c3130k.m8996g(':');
            c3130k.mo9003n();
            return true;
        }
        if (i13 == 0) {
            this.f12260g = true;
        }
        if (i13 == 1) {
            c3130k.m8996g(DateTimeRange.lowerUpperDelimiter);
            c3130k.mo9003n();
            this.f12260g = false;
        }
        return true;
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeEnum(InterfaceC39443g enumDescriptor, int i13) {
        AbstractC22676k.m65750j(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(i13));
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeFloat(float f13) {
        boolean z4 = this.f12260g;
        C3130k c3130k = this.f12254a;
        if (z4) {
            encodeString(String.valueOf(f13));
        } else {
            ((C3143v) c3130k.f12277c).m9047p(String.valueOf(f13));
        }
        if (this.f12259f.f2798j || Math.abs(f13) <= Float.MAX_VALUE) {
            return;
        }
        throw AbstractC3138q.m9005a(((C3143v) c3130k.f12277c).toString(), Float.valueOf(f13));
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        boolean zM8985b = AbstractC3125h0.m8985b(descriptor);
        EnumC3133l0 enumC3133l0 = this.f12256c;
        AbstractC0757c abstractC0757c = this.f12255b;
        C3130k c3132l = this.f12254a;
        if (zM8985b) {
            if (!(c3132l instanceof C3134m)) {
                c3132l = new C3134m((C3143v) c3132l.f12277c, this.f12260g);
            }
            return new C3123g0(c3132l, abstractC0757c, enumC3133l0, null);
        }
        if (AbstractC3125h0.m8984a(descriptor)) {
            if (!(c3132l instanceof C3132l)) {
                c3132l = new C3132l((C3143v) c3132l.f12277c, this.f12260g);
            }
            return new C3123g0(c3132l, abstractC0757c, enumC3133l0, null);
        }
        if (this.f12261h == null) {
            return super.encodeInline(descriptor);
        }
        this.f12262i = descriptor.getSerialName();
        return this;
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeInt(int i13) {
        if (this.f12260g) {
            encodeString(String.valueOf(i13));
        } else {
            this.f12254a.mo8997h(i13);
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeLong(long j7) {
        if (this.f12260g) {
            encodeString(String.valueOf(j7));
        } else {
            this.f12254a.mo8998i(j7);
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeNull() {
        this.f12254a.m8999j("null");
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40540c
    public final void encodeNullableSerializableElement(InterfaceC39443g descriptor, int i13, InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC22676k.m65750j(serializer, "serializer");
        if (obj != null || this.f12259f.f2794f) {
            super.encodeNullableSerializableElement(descriptor, i13, serializer, obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeSerializableValue(InterfaceC37145j serializer, Object obj) {
        String strM9014j;
        AbstractC22676k.m65750j(serializer, "serializer");
        AbstractC0757c abstractC0757c = this.f12255b;
        C0766i c0766i = abstractC0757c.f2763a;
        boolean z4 = serializer instanceof AbstractPolymorphicSerializer;
        if (!z4) {
            int iOrdinal = c0766i.f2802n.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    AbstractC39447k kind = serializer.getDescriptor().getKind();
                    strM9014j = (AbstractC22676k.m65745e(kind, C39448l.f169713a) || AbstractC22676k.m65745e(kind, C39448l.f169716d)) ? AbstractC3138q.m9014j(abstractC0757c, serializer.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (c0766i.f2802n != EnumC0753a.f2754w) {
        }
        if (z4) {
            AbstractPolymorphicSerializer abstractPolymorphicSerializer = (AbstractPolymorphicSerializer) serializer;
            if (obj == null) {
                throw new IllegalArgumentException(("Value for serializer " + abstractPolymorphicSerializer.getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            InterfaceC37145j interfaceC37145jM113832l = AbstractC35854l.m113832l(abstractPolymorphicSerializer, this, obj);
            if (strM9014j != null) {
                AbstractC3138q.m9009e(serializer, interfaceC37145jM113832l, strM9014j);
                AbstractC3138q.m9013i(interfaceC37145jM113832l.getDescriptor().getKind());
            }
            serializer = interfaceC37145jM113832l;
        }
        if (strM9014j != null) {
            String serialName = serializer.getDescriptor().getSerialName();
            this.f12261h = strM9014j;
            this.f12262i = serialName;
        }
        serializer.serialize(this, obj);
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeShort(short s13) {
        if (this.f12260g) {
            encodeString(String.valueOf((int) s13));
        } else {
            this.f12254a.mo9000k(s13);
        }
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40542e
    public final void encodeString(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f12254a.mo9001l(value);
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40540c
    public final void endStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C3130k c3130k = this.f12254a;
        c3130k.mo9004o();
        c3130k.mo8992c();
        c3130k.m8996g(this.f12256c.f12288x);
    }

    @Override // zc3.InterfaceC40542e
    public final AbstractC4454f getSerializersModule() {
        return this.f12258e;
    }

    @Override // zc3.AbstractC40538a, zc3.InterfaceC40540c
    public final boolean shouldEncodeElementDefault(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        return this.f12259f.f2789a;
    }
}
