package ix1;

import ge3.AbstractC15751g;
import p114eb.AbstractC12958g1;
import p114eb.C12940a1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Payload' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: ix1.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, m65681d2 = {"Lix1/c;", "", "", "key", "Leb/g1;", "navType", "", "isRequired", "<init>", "(Ljava/lang/String;ILjava/lang/String;Leb/g1;Z)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "Leb/g1;", "getNavType", "()Leb/g1;", "Z", "()Z", "Payload", "Path", "Card", "IsIndependentCheckout", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class EnumC21020c {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ EnumC21020c[] $VALUES;
    public static final EnumC21020c Card;
    public static final EnumC21020c IsIndependentCheckout;
    public static final EnumC21020c Path;
    public static final EnumC21020c Payload;
    private final boolean isRequired;
    private final String key;
    private final AbstractC12958g1 navType;

    private static final /* synthetic */ EnumC21020c[] $values() {
        return new EnumC21020c[]{Payload, Path, Card, IsIndependentCheckout};
    }

    static {
        C12940a1 c12940a1 = AbstractC12958g1.f44770o;
        Payload = new EnumC21020c("Payload", 0, "payload", c12940a1, true);
        Path = new EnumC21020c("Path", 1, "path", c12940a1, true);
        Card = new EnumC21020c("Card", 2, "card", c12940a1, false);
        IsIndependentCheckout = new EnumC21020c("IsIndependentCheckout", 3, "is_independent_checkout", AbstractC12958g1.f44767l, true);
        EnumC21020c[] enumC21020cArr$values = $values();
        $VALUES = enumC21020cArr$values;
        $ENTRIES = AbstractC15751g.m44468u(enumC21020cArr$values);
    }

    private EnumC21020c(String str, int i13, String str2, AbstractC12958g1 abstractC12958g1, boolean z4) {
        super(str, i13);
        this.key = str2;
        this.navType = abstractC12958g1;
        this.isRequired = z4;
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static EnumC21020c valueOf(String str) {
        return (EnumC21020c) Enum.valueOf(EnumC21020c.class, str);
    }

    public static EnumC21020c[] values() {
        return (EnumC21020c[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final AbstractC12958g1 getNavType() {
        return this.navType;
    }

    /* JADX INFO: renamed from: isRequired, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public /* synthetic */ EnumC21020c(String str, int i13, String str2, AbstractC12958g1 abstractC12958g1, boolean z4, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, str2, abstractC12958g1, (i14 & 4) != 0 ? false : z4);
    }
}
