package com.iterable.iterableapi;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.iterable.iterableapi.o0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class EnumC5358o0 {

    /* JADX INFO: renamed from: w */
    public static final C5350m0 f21791w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC5358o0[] f21792x;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5358o0 EF0;

    static {
        EnumC5358o0 enumC5358o0 = new EnumC5358o0() { // from class: com.iterable.iterableapi.l0
            @Override // java.lang.Enum
            public final String toString() {
                return "inbox-swipe";
            }
        };
        C5350m0 c5350m0 = new C5350m0();
        f21791w = c5350m0;
        f21792x = new EnumC5358o0[]{enumC5358o0, c5350m0, new EnumC5358o0() { // from class: com.iterable.iterableapi.n0
            @Override // java.lang.Enum
            public final String toString() {
                return "other";
            }
        }};
    }

    public static EnumC5358o0 valueOf(String str) {
        return (EnumC5358o0) Enum.valueOf(EnumC5358o0.class, str);
    }

    public static EnumC5358o0[] values() {
        return (EnumC5358o0[]) f21792x.clone();
    }
}
