package com.whoop.network.exception;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Lcom/whoop/network/exception/DeserializationException;", "Lcom/whoop/network/exception/DomainException;", "", "message", "<init>", "(Ljava/lang/String;)V", "y", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "a", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class DeserializationException extends DomainException {

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final String message;

    /* JADX INFO: renamed from: com.whoop.network.exception.DeserializationException$a */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lcom/whoop/network/exception/DeserializationException$a;", "Lcom/whoop/network/exception/DomainException$b;", "<init>", "()V", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C9604a implements DomainException.InterfaceC9606b {

        /* JADX INFO: renamed from: w */
        public static final C9604a f28157w = new C9604a();

        private C9604a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeserializationException(String message) {
        super(C9604a.f28157w, null, 2, null);
        AbstractC22676k.m65750j(message, "message");
        this.message = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
