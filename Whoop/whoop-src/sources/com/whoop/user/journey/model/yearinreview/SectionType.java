package com.whoop.user.journey.model.yearinreview;

import cq2.C11062a;
import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'COMPACT' uses external variables
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
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/SectionType;", "", "Ly3/f;", "spacing", "<init>", "(Ljava/lang/String;IF)V", "F", "getSpacing-D9Ej5fM", "()F", "Companion", "COMPACT", "LARGE", "NORMAL", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final class SectionType {
    private static final /* synthetic */ InterfaceC33616a $ENTRIES;
    private static final /* synthetic */ SectionType[] $VALUES;
    private static final InterfaceC23462h $cachedSerializer$delegate;
    public static final SectionType COMPACT;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SectionType LARGE;
    public static final SectionType NORMAL;
    private final float spacing;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/SectionType$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/SectionType;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ InterfaceC37138c get$cachedSerializer() {
            return (InterfaceC37138c) SectionType.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ SectionType[] $values() {
        return new SectionType[]{COMPACT, LARGE, NORMAL};
    }

    static {
        float f13 = 4;
        COMPACT = new SectionType("COMPACT", 0, 2 * f13);
        LARGE = new SectionType("LARGE", 1, f13 * f13);
        NORMAL = new SectionType("NORMAL", 2, 3 * f13);
        SectionType[] sectionTypeArr$values = $values();
        $VALUES = sectionTypeArr$values;
        $ENTRIES = AbstractC15751g.m44468u(sectionTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(15));
    }

    private SectionType(String str, int i13, float f13) {
        super(str, i13);
        this.spacing = f13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.user.journey.model.yearinreview.SectionType", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static SectionType valueOf(String str) {
        return (SectionType) Enum.valueOf(SectionType.class, str);
    }

    public static SectionType[] values() {
        return (SectionType[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getSpacing-D9Ej5fM, reason: not valid java name and from getter */
    public final float getSpacing() {
        return this.spacing;
    }
}
