package com.squareup.wire;

import java.io.IOException;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C5577h extends AbstractC5586q {

    /* JADX INFO: renamed from: a */
    public final AbstractC5586q f22097a;

    /* JADX INFO: renamed from: b */
    public final AbstractC5586q f22098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5577h(AbstractC5586q keyAdapter, AbstractC5586q valueAdapter) {
        super(EnumC5573d.LENGTH_DELIMITED, AbstractC22671h0.f89337a.getOrCreateKotlinClass(Map.Entry.class), null, valueAdapter.getSyntax());
        AbstractC22676k.m65750j(keyAdapter, "keyAdapter");
        AbstractC22676k.m65750j(valueAdapter, "valueAdapter");
        this.f22097a = keyAdapter;
        this.f22098b = valueAdapter;
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object decode(C5587r reader) {
        AbstractC22676k.m65750j(reader, "reader");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5588s c5588s, Object obj) throws IOException {
        Map.Entry value = (Map.Entry) obj;
        AbstractC22676k.m65750j(value, "value");
        this.f22097a.encodeWithTag(c5588s, 1, value.getKey());
        this.f22098b.encodeWithTag(c5588s, 2, value.getValue());
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final int encodedSize(Object obj) {
        Map.Entry value = (Map.Entry) obj;
        AbstractC22676k.m65750j(value, "value");
        return this.f22098b.encodedSizeWithTag(2, value.getValue()) + this.f22097a.encodedSizeWithTag(1, value.getKey());
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final Object redact(Object obj) {
        Map.Entry value = (Map.Entry) obj;
        AbstractC22676k.m65750j(value, "value");
        throw new UnsupportedOperationException();
    }

    @Override // com.squareup.wire.AbstractC5586q
    public final void encode(C5591v c5591v, Object obj) throws IOException {
        Map.Entry value = (Map.Entry) obj;
        AbstractC22676k.m65750j(value, "value");
        this.f22098b.encodeWithTag(c5591v, 2, value.getValue());
        this.f22097a.encodeWithTag(c5591v, 1, value.getKey());
    }
}
