package u02;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: u02.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m65681d2 = {"Lu02/g;", "T", "", "<init>", "()V", "a", "Lu02/e;", "Lu02/h;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34391g<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u02.g$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Lu02/g$a;", "", "<init>", "()V", "T", "", "exception", "Lu02/e;", "a", "(Ljava/lang/Throwable;)Lu02/e;", "result", "Lu02/h;", "b", "(Ljava/lang/Object;)Lu02/h;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final <T> C34389e<T> m108756a(Throwable exception) {
            AbstractC22676k.m65750j(exception, "exception");
            return new C34389e<>(C34388d.INSTANCE.m108751a(exception));
        }

        /* JADX INFO: renamed from: b */
        public final <T> C34392h<T> m108757b(T result) {
            return new C34392h<>(result);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AbstractC34391g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC34391g() {
    }
}
