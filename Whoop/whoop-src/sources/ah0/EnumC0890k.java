package ah0;

import ge3.AbstractC15751g;
import java.util.Iterator;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ah0.k */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lah0/k;", "", "<init>", "(Ljava/lang/String;I)V", "", "isMultiSelect", "()Z", "isFreeText", "Companion", "a", "SINGLE_SELECT", "MULTI_SELECT", "FREE_TEXT", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public enum EnumC0890k {
    SINGLE_SELECT,
    MULTI_SELECT,
    FREE_TEXT;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ah0.k$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lah0/k$a;", "", "<init>", "()V", "", "value", "Lah0/k;", "a", "(Ljava/lang/String;)Lah0/k;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC0890k m2184a(String value) {
            Object next;
            AbstractC22676k.m65750j(value, "value");
            Iterator<E> it = EnumC0890k.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC39421y.m125921F(((EnumC0890k) next).name(), value, true));
            EnumC0890k enumC0890k = (EnumC0890k) next;
            return enumC0890k == null ? EnumC0890k.SINGLE_SELECT : enumC0890k;
        }

        private Companion() {
        }
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public final boolean isFreeText() {
        return this == FREE_TEXT;
    }

    public final boolean isMultiSelect() {
        return this == MULTI_SELECT;
    }
}
