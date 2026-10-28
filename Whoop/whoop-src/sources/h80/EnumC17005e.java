package h80;

import ge3.AbstractC15751g;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: h80.e */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m65681d2 = {"Lh80/e;", "", "", "source", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getSource", "()Ljava/lang/String;", "getLabel", "Companion", "a", "AutoRetrieve", "Manual", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC17005e {
    AutoRetrieve("auto_retrieve", "credential_manager"),
    Manual("user_submit", "manual");

    private final String label;
    private final String source;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h80.e$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lh80/e$a;", "", "<init>", "()V", "", "filledViaCredentialManager", "Lh80/e;", "a", "(Z)Lh80/e;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC17005e m47958a(boolean filledViaCredentialManager) {
            return filledViaCredentialManager ? EnumC17005e.AutoRetrieve : EnumC17005e.Manual;
        }

        private Companion() {
        }
    }

    EnumC17005e(String str, String str2) {
        this.source = str;
        this.label = str2;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getSource() {
        return this.source;
    }
}
