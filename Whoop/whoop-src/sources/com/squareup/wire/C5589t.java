package com.squareup.wire;

import java.io.IOException;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.squareup.wire.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C5589t extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final AbstractC5586q f22116a;

    public C5589t(AbstractC5586q abstractC5586q) {
        super(abstractC5586q.getFieldEncoding$wire_runtime(), AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class), null, abstractC5586q.getSyntax(), C25271y.f99162w);
        this.f22116a = abstractC5586q;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        AbstractC22676k.m65750j(reader, "reader");
        return AbstractC37056f.m118958J(this.f22116a.decode(reader));
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        List list = (List) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f22116a.encodeWithTag(writer, i13, list.get(i14));
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSizeWithTag(int i13, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int iEncodedSizeWithTag = 0;
        for (int i14 = 0; i14 < size; i14++) {
            iEncodedSizeWithTag += this.f22116a.encodedSizeWithTag(i13, list.get(i14));
        }
        return iEncodedSizeWithTag;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        return C25271y.f99162w;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        List list = (List) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f22116a.encodeWithTag(writer, i13, list.get(size));
            }
        }
    }
}
