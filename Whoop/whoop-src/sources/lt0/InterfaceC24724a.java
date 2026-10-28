package lt0;

import p715kotlin.Metadata;

/* JADX INFO: renamed from: lt0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0006\bf\u0018\u0000 \r2\u00020\u0001:\u0001\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Llt0/a;", "", "", "commandName", "()Ljava/lang/String;", "", "getValue", "()I", "value", "", "getByteValue", "()B", "byteValue", "k", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface InterfaceC24724a {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f96701a;

    /* JADX INFO: renamed from: lt0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Llt0/a$a;", "", "<init>", "()V", "", "value", "Llt0/e;", "b", "(B)Llt0/e;", "Llt0/l;", "a", "(B)Llt0/l;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ Companion f96701a = new Companion();

        private Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final EnumC24735l m72385a(byte value) {
            return EnumC24735l.INSTANCE.m72430a(value);
        }

        /* JADX INFO: renamed from: b */
        public final EnumC24728e m72386b(byte value) {
            return EnumC24728e.INSTANCE.m72405a(value);
        }
    }

    default String commandName() {
        return toString();
    }

    byte getByteValue();

    int getValue();
}
