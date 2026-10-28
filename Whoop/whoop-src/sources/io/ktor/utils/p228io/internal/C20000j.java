package io.ktor.utils.p228io.internal;

import java.nio.ByteBuffer;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: io.ktor.utils.io.internal.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C20000j extends AbstractC20003m {

    /* JADX INFO: renamed from: c */
    public final ByteBuffer f75054c;

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f75055d;

    /* JADX INFO: renamed from: e */
    public final C19999i f75056e;

    /* JADX INFO: renamed from: f */
    public final C20001k f75057f;

    /* JADX INFO: renamed from: g */
    public final C20001k f75058g;

    /* JADX INFO: renamed from: h */
    public final C20001k f75059h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20000j(ByteBuffer backingBuffer, int i13) {
        super(backingBuffer, new C20005o(backingBuffer.capacity() - i13));
        AbstractC22676k.m65750j(backingBuffer, "backingBuffer");
        if (backingBuffer.position() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (backingBuffer.limit() != backingBuffer.capacity()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ByteBuffer byteBufferDuplicate = backingBuffer.duplicate();
        AbstractC22676k.m65749i(byteBufferDuplicate, "backingBuffer.duplicate()");
        this.f75054c = byteBufferDuplicate;
        ByteBuffer byteBufferDuplicate2 = backingBuffer.duplicate();
        AbstractC22676k.m65749i(byteBufferDuplicate2, "backingBuffer.duplicate()");
        this.f75055d = byteBufferDuplicate2;
        this.f75056e = new C19999i(this);
        this.f75057f = new C20001k(this, 0);
        this.f75058g = new C20001k(this, 2);
        this.f75059h = new C20001k(this, 1);
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo55801a() {
        return this.f75055d;
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: b */
    public final ByteBuffer mo55802b() {
        return this.f75054c;
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: c */
    public final AbstractC20003m mo55799c() {
        return this.f75057f;
    }

    @Override // io.ktor.utils.p228io.internal.AbstractC20003m
    /* JADX INFO: renamed from: d */
    public final AbstractC20003m mo55800d() {
        return this.f75058g;
    }

    public final String toString() {
        return "Initial";
    }
}
