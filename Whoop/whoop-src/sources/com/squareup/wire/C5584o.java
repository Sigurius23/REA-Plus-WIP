package com.squareup.wire;

import java.io.IOException;
import java.util.List;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: com.squareup.wire.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C5584o extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final AbstractC5586q f22105a;

    public C5584o(AbstractC5586q abstractC5586q) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class), null, abstractC5586q.getSyntax(), C25271y.f99162w);
        this.f22105a = abstractC5586q;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        AbstractC22676k.m65750j(reader, "reader");
        return AbstractC37056f.m118958J(this.f22105a.decode(reader));
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        int size = value.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f22105a.encode(c5588s, value.get(i13));
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5588s writer, int i13, Object obj) throws IOException {
        List list = (List) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i13, list);
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        List value = (List) obj;
        AbstractC22676k.m65750j(value, "value");
        int size = value.size();
        int iEncodedSize = 0;
        for (int i13 = 0; i13 < size; i13++) {
            iEncodedSize += this.f22105a.encodedSize(value.get(i13));
        }
        return iEncodedSize;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSizeWithTag(int i13, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.encodedSizeWithTag(i13, list);
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
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f22105a.encode(c5591v, value.get(size));
            }
        }
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encodeWithTag(C5591v writer, int i13, Object obj) throws IOException {
        List list = (List) obj;
        AbstractC22676k.m65750j(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.encodeWithTag(writer, i13, list);
    }
}
