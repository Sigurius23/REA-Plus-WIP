package com.whoop.navigation.models;

import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import mq2.C25888a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.whoop.navigation.models.GenericHttpMethod, still in use, count: 1, list:
  (r0v0 com.whoop.navigation.models.GenericHttpMethod) from 0x0046: SPUT (r0v0 com.whoop.navigation.models.GenericHttpMethod) com.whoop.navigation.models.GenericHttpMethod.DEFAULT com.whoop.navigation.models.GenericHttpMethod
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericHttpMethod;", "", "<init>", "(Ljava/lang/String;I)V", "GET", "POST", "PUT", "DELETE", "PATCH", "Companion", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class GenericHttpMethod {
    GET,
    POST,
    PUT,
    DELETE,
    PATCH;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final GenericHttpMethod DEFAULT = new GenericHttpMethod();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25888a(19));

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lcom/whoop/navigation/models/GenericHttpMethod$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/models/GenericHttpMethod;", "serializer", "()Lwc3/c;", "DEFAULT", "Lcom/whoop/navigation/models/GenericHttpMethod;", "getDEFAULT", "()Lcom/whoop/navigation/models/GenericHttpMethod;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) GenericHttpMethod.$cachedSerializer$delegate.getValue();
        }

        public final GenericHttpMethod getDEFAULT() {
            return GenericHttpMethod.DEFAULT;
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    static {
    }

    private GenericHttpMethod() {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.navigation.models.GenericHttpMethod", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static GenericHttpMethod valueOf(String str) {
        return (GenericHttpMethod) Enum.valueOf(GenericHttpMethod.class, str);
    }

    public static GenericHttpMethod[] values() {
        return (GenericHttpMethod[]) $VALUES.clone();
    }
}
