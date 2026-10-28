package ah0;

import ge3.AbstractC15751g;
import java.util.Locale;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: renamed from: ah0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m65681d2 = {"Lah0/b;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "GREY_OUT_ALL", "COLLAPSE_TO_SELECTED", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC0881b {
    GREY_OUT_ALL,
    COLLAPSE_TO_SELECTED;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ah0.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lah0/b$a;", "", "<init>", "()V", "", "value", "Lah0/b;", "a", "(Ljava/lang/String;)Lah0/b;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC0881b m2114a(String value) {
            String upperCase;
            if (value != null) {
                upperCase = value.toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            return AbstractC22676k.m65745e(upperCase, "COLLAPSE_TO_SELECTED") ? EnumC0881b.COLLAPSE_TO_SELECTED : EnumC0881b.GREY_OUT_ALL;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
