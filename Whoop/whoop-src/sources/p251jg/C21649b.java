package p251jg;

import aws.smithy.kotlin.runtime.serde.DeserializationException;
import com.squareup.wire.AbstractC5583n;
import gm.C15990r;
import hm.C17417d;
import iz0.C21045d;
import java.util.Set;
import m83.AbstractC25260n;
import p194hg.C17248i;
import p194hg.C17249j;
import p194hg.InterfaceC17240a;
import p194hg.InterfaceC17241b;
import p194hg.InterfaceC17242c;
import p194hg.InterfaceC17246g;
import p673z7.C40137a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;

/* JADX INFO: renamed from: jg.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C21649b implements InterfaceC17240a, InterfaceC17241b, InterfaceC17246g {

    /* JADX INFO: renamed from: x */
    public static final Set f83160x = AbstractC25260n.m74059b1(new String[]{"Infinity", "-Infinity", "NaN"});

    /* JADX INFO: renamed from: w */
    public final C40137a f83161w;

    public C21649b(byte[] payload) {
        AbstractC22676k.m65750j(payload, "payload");
        this.f83161w = new C40137a(payload);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC17240a m60913a(C17248i c17248i) {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i.getClass() == C21654g.class) {
            return this;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21654g.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC17241b m60914b(C17248i c17248i) {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i.getClass() == C21655h.class) {
            return this;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21655h.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: c */
    public final void m60915c() {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i.getClass() == C21661n.class) {
            return;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21661n.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC17242c m60916d(C17249j descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C40137a c40137a = this.f83161w;
        AbstractC5583n abstractC5583nM128691k = c40137a.m128691k();
        if (!abstractC5583nM128691k.equals(C21655h.f83169c)) {
            if (abstractC5583nM128691k.equals(C21661n.f83175c)) {
                return new C17417d(this, 22);
            }
            throw new DeserializationException("Unexpected token type " + c40137a.m128691k());
        }
        AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
        if (abstractC5583nM128689i.getClass() == C21655h.class) {
            return new C15990r(c40137a, descriptor, this);
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21655h.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m60917e() {
        C40137a c40137a = this.f83161w;
        AbstractC5583n abstractC5583nM128691k = c40137a.m128691k();
        if (!abstractC5583nM128691k.equals(C21657j.f83171c)) {
            return !abstractC5583nM128691k.equals(C21658k.f83172c);
        }
        AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
        if (abstractC5583nM128689i.getClass() == C21657j.class) {
            return false;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21657j.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: f */
    public final boolean m60918f() {
        C40137a c40137a = this.f83161w;
        AbstractC5583n abstractC5583nM128691k = c40137a.m128691k();
        if (!abstractC5583nM128691k.equals(C21659l.f83173c)) {
            return (abstractC5583nM128691k.equals(C21661n.f83175c) || abstractC5583nM128691k.equals(C21658k.f83172c)) ? false : true;
        }
        AbstractC5583n abstractC5583nM128689i = c40137a.m128689i();
        if (abstractC5583nM128689i.getClass() == C21659l.class) {
            return false;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21659l.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: g */
    public final String m60919g() {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i.getClass() == C21660m.class) {
            return ((C21660m) abstractC5583nM128689i).f83174c;
        }
        StringBuilder sb4 = new StringBuilder("expected ");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        sb4.append(c22673i0.getOrCreateKotlinClass(C21660m.class));
        sb4.append("; found ");
        sb4.append(c22673i0.getOrCreateKotlinClass(abstractC5583nM128689i.getClass()));
        throw new DeserializationException(sb4.toString());
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: h */
    public final int mo45164h() {
        return ((Number) m60921j(new C21045d(25))).intValue();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m60920i() {
        return !this.f83161w.m128691k().equals(C21661n.f83175c);
    }

    /* JADX INFO: renamed from: j */
    public final Object m60921j(Function1 function1) {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i instanceof C21662o) {
            return function1.invoke(((C21662o) abstractC5583nM128689i).f83176c);
        }
        if (abstractC5583nM128689i instanceof C21663p) {
            String str = ((C21663p) abstractC5583nM128689i).f83177c;
            if (f83160x.contains(str)) {
                return function1.invoke(str);
            }
        }
        throw new DeserializationException(abstractC5583nM128689i + " cannot be deserialized as type Number");
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: o */
    public final String mo45166o() {
        AbstractC5583n abstractC5583nM128689i = this.f83161w.m128689i();
        if (abstractC5583nM128689i instanceof C21663p) {
            return ((C21663p) abstractC5583nM128689i).f83177c;
        }
        if (abstractC5583nM128689i instanceof C21662o) {
            return ((C21662o) abstractC5583nM128689i).f83176c;
        }
        if (abstractC5583nM128689i instanceof C21656i) {
            return String.valueOf(((C21656i) abstractC5583nM128689i).f83170c);
        }
        throw new DeserializationException(abstractC5583nM128689i + " cannot be deserialized as type String");
    }

    @Override // p194hg.InterfaceC17246g
    /* JADX INFO: renamed from: v */
    public final long mo45170v() {
        return ((Number) m60921j(new C21045d(26))).longValue();
    }
}
