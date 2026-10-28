package oc0;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: oc0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m65681d2 = {"Loc0/a;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "SKIP_CONSENT", "SAVE_CONSENT", "DISMISS", "UNKNOWN", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC27816a {
    SKIP_CONSENT,
    SAVE_CONSENT,
    DISMISS,
    UNKNOWN;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: oc0.a$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Loc0/a$a;", "", "<init>", "()V", "", "value", "Loc0/a;", "a", "(Ljava/lang/String;)Loc0/a;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:11:0x0023 A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC27816a m83893a(String value) {
            AbstractC22676k.m65750j(value, "value");
            EnumC27816a enumC27816a = EnumC27816a.UNKNOWN;
            for (EnumC27816a enumC27816a2 : EnumC27816a.values()) {
                if (AbstractC22676k.m65745e(enumC27816a2.name(), value)) {
                    if (enumC27816a2 == null) {
                        return enumC27816a;
                    }
                    return enumC27816a2;
                }
            }
            enumC27816a2 = null;
            if (enumC27816a2 == null) {
                return enumC27816a;
            }
            return enumC27816a2;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
