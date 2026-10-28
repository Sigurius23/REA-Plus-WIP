package com.whoop.network.exception;

import ge3.AbstractC15751g;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0016\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0003\u000e\u000f\u000bB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/network/exception/DomainException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/whoop/network/exception/DomainException$b;", "reason", "", "cause", "<init>", "(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/network/exception/DomainException$b;", "a", "()Lcom/whoop/network/exception/DomainException$b;", "x", "c", "b", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public class DomainException extends RuntimeException {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC9606b reason;

    /* JADX INFO: renamed from: com.whoop.network.exception.DomainException$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lcom/whoop/network/exception/DomainException$a;", "", "<init>", "()V", "", "cause", "Lcom/whoop/network/exception/DomainException;", "a", "(Ljava/lang/Throwable;)Lcom/whoop/network/exception/DomainException;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DomainException m23148a(Throwable cause) {
            return new DomainException(EnumC9607c.UNKNOWN, cause);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.whoop.network.exception.DomainException$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/network/exception/DomainException$b;", "", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface InterfaceC9606b {
    }

    /* JADX INFO: renamed from: com.whoop.network.exception.DomainException$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/network/exception/DomainException$c;", "Lcom/whoop/network/exception/DomainException$b;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "NETWORK_ERROR", "HTTP_ERROR", "MEMBERSHIP_ERROR", "AUTHORIZATION_ERROR", "NOT_FOUND", "BAD_REQUEST", "INTERNAL_ERROR", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public enum EnumC9607c implements InterfaceC9606b {
        UNKNOWN,
        NETWORK_ERROR,
        HTTP_ERROR,
        MEMBERSHIP_ERROR,
        AUTHORIZATION_ERROR,
        NOT_FOUND,
        BAD_REQUEST,
        INTERNAL_ERROR;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DomainException(InterfaceC9606b reason, Throwable th3) {
        super(th3);
        AbstractC22676k.m65750j(reason, "reason");
        this.reason = reason;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final InterfaceC9606b getReason() {
        return this.reason;
    }

    public /* synthetic */ DomainException(InterfaceC9606b interfaceC9606b, Throwable th3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC9606b, (i13 & 2) != 0 ? null : th3);
    }
}
