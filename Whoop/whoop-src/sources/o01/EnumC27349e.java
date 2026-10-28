package o01;

import com.whoop.design.models.DesignSystemEnum;
import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: o01.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00052\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m65681d2 = {"Lo01/e;", "Lcom/whoop/design/models/DesignSystemEnum;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "GENERAL", "RECOVERY_GENERAL", "SLEEP_GENERAL", "STRAIN_GENERAL", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC27349e implements DesignSystemEnum {
    GENERAL,
    RECOVERY_GENERAL,
    SLEEP_GENERAL,
    STRAIN_GENERAL;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o01.e$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lo01/e$a;", "", "<init>", "()V", "", "value", "Lo01/e;", "a", "(Ljava/lang/String;)Lo01/e;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:12:0x001f A[RETURN] */
        /* JADX INFO: renamed from: a */
        public final EnumC27349e m82522a(String value) {
            for (EnumC27349e enumC27349e : EnumC27349e.values()) {
                if (AbstractC39421y.m125921F(enumC27349e.name(), value, true)) {
                    if (enumC27349e == null) {
                        return EnumC27349e.GENERAL;
                    }
                    return enumC27349e;
                }
            }
            enumC27349e = null;
            if (enumC27349e == null) {
                return EnumC27349e.GENERAL;
            }
            return enumC27349e;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
