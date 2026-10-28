package com.whoop.archv2.model.template;

import cj0.C4744f;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m65681d2 = {"Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "DEFAULT", "AI_CHAT", "DARK", "AMERICA_250", "WHOOP_BACKGROUND", "TREND_NEGATIVE", "PROGRAM_HOME", "MENSTRUAL", "FOLLICULAR", "OVULATORY", "LUTEAL", "HORMONAL_BIRTH_CONTROL", "NO_PHASE", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum TemplateBackgroundTheme {
    DEFAULT,
    AI_CHAT,
    DARK,
    AMERICA_250,
    WHOOP_BACKGROUND,
    TREND_NEGATIVE,
    PROGRAM_HOME,
    MENSTRUAL,
    FOLLICULAR,
    OVULATORY,
    LUTEAL,
    HORMONAL_BIRTH_CONTROL,
    NO_PHASE;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(4));

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.TemplateBackgroundTheme$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/TemplateBackgroundTheme$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/TemplateBackgroundTheme;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC37138c m18112a() {
            return (InterfaceC37138c) TemplateBackgroundTheme.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return m18112a();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.archv2.model.template.TemplateBackgroundTheme", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
