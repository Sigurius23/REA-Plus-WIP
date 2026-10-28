package com.squareup.wire;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.C25272z;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C5578i extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final C5577h f22099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5578i(AbstractC5586q keyAdapter, AbstractC5586q valueAdapter) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.class), null, valueAdapter.getSyntax(), C25272z.f99163w);
        AbstractC22676k.m65750j(keyAdapter, "keyAdapter");
        AbstractC22676k.m65750j(valueAdapter, "valueAdapter");
        this.f22099a = new C5577h(keyAdapter, valueAdapter);
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        AbstractC22676k.m65750j(reader, "reader");
        C5577h c5577h = this.f22099a;
        Object identity = c5577h.f22097a.getIdentity();
        AbstractC5586q abstractC5586q = c5577h.f22098b;
        Object identity2 = abstractC5586q.getIdentity();
        long jM16807d = reader.m16807d();
        while (true) {
            int iM16810g = reader.m16810g();
            if (iM16810g == -1) {
                break;
            }
            if (iM16810g == 1) {
                identity = c5577h.f22097a.decode(reader);
            } else if (iM16810g == 2) {
                identity2 = abstractC5586q.decode(reader);
            }
        }
        reader.m16808e(jM16807d);
        if (identity == null) {
            throw new IllegalStateException("Map entry with null key");
        }
        if (identity2 != null) {
            return AbstractC25247g0.m73989X(new C23465k(identity, identity2));
        }
        throw new IllegalStateException("Map entry with null value");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) {
        Map value = (Map) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        Map map = (Map) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (map == null) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f22099a.encodeWithTag(writer, i13, (Map.Entry) it.next());
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        Map value = (Map) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSizeWithTag(int i13, Object obj) {
        Map map = (Map) obj;
        int iEncodedSizeWithTag = 0;
        if (map == null) {
            return 0;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            iEncodedSizeWithTag += this.f22099a.encodedSizeWithTag(i13, (Map.Entry) it.next());
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        Map value = (Map) obj;
        AbstractC22676k.m65750j(value, "value");
        return C25272z.f99163w;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) {
        Map value = (Map) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        Map map = (Map) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (map == null) {
            return;
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        AbstractC25260n.m74034J0(entryArr);
        for (Map.Entry entry : entryArr) {
            this.f22099a.encodeWithTag(writer, i13, entry);
        }
    }
}
