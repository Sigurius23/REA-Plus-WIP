package com.squareup.wire;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.OutputStream;
import java.io.Serializable;
import ne3.C26616h;
import ne3.C26624l;
import ne3.InterfaceC26618i;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.squareup.wire.l */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5581l implements Serializable {
    public static final C5580k Companion = new C5580k();
    private static final long serialVersionUID = 0;
    private final transient AbstractC5586q adapter;
    private transient int cachedSerializedSize;
    protected transient int hashCode;
    private final transient C26624l unknownFields;

    public AbstractC5581l(AbstractC5586q adapter, C26624l c26624l) {
        AbstractC22676k.m65750j(adapter, "adapter");
        this.adapter = adapter;
        this.unknownFields = c26624l;
    }

    public final AbstractC5586q adapter() {
        return this.adapter;
    }

    public final void encode(InterfaceC26618i sink) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        this.adapter.encode(sink, this);
    }

    public final C26624l encodeByteString() {
        return this.adapter.encodeByteString(this);
    }

    public final int getCachedSerializedSize$wire_runtime() {
        return this.cachedSerializedSize;
    }

    public abstract AbstractC5579j newBuilder();

    public final void setCachedSerializedSize$wire_runtime(int i13) {
        this.cachedSerializedSize = i13;
    }

    public final C26624l unknownFields() {
        C26624l c26624l = this.unknownFields;
        return c26624l == null ? C26624l.f105881E : c26624l;
    }

    public final AbstractC5581l withoutUnknownFields() {
        AbstractC5579j abstractC5579jNewBuilder = newBuilder();
        abstractC5579jNewBuilder.getClass();
        abstractC5579jNewBuilder.f22100a = C26624l.f105881E;
        C26616h c26616h = abstractC5579jNewBuilder.f22101b;
        if (c26616h != null) {
            c26616h.m79200b();
            abstractC5579jNewBuilder.f22101b = null;
        }
        abstractC5579jNewBuilder.f22102c = null;
        return abstractC5579jNewBuilder.mo16740a();
    }

    public final Object writeReplace() throws ObjectStreamException {
        byte[] bytes = encode();
        AbstractC22676k.m65750j(bytes, "bytes");
        return new C5582m();
    }

    public final byte[] encode() {
        return this.adapter.encode(this);
    }

    public final void encode(OutputStream stream2) throws IOException {
        AbstractC22676k.m65750j(stream2, "stream");
        this.adapter.encode(stream2, this);
    }
}
