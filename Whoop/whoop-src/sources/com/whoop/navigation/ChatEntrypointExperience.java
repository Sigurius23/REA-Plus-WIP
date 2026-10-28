package com.whoop.navigation;

import ge3.AbstractC15751g;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lcom/whoop/navigation/ChatEntrypointExperience;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "STANDARD", "FAB_VOICE", "QUICK_VOICE", "QUICK_KEYBOARD", "QUICK_CAMERA_ROLL", "QUICK_FILES", "QUICK_CAMERA_FRONT", "QUICK_CAMERA_BACK", "QUICK_HISTORY", "FORM_INPUT_ONLY", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public enum ChatEntrypointExperience {
    STANDARD,
    FAB_VOICE,
    QUICK_VOICE,
    QUICK_KEYBOARD,
    QUICK_CAMERA_ROLL,
    QUICK_FILES,
    QUICK_CAMERA_FRONT,
    QUICK_CAMERA_BACK,
    QUICK_HISTORY,
    FORM_INPUT_ONLY;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18681l0(27));

    /* JADX INFO: renamed from: com.whoop.navigation.ChatEntrypointExperience$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/ChatEntrypointExperience$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/ChatEntrypointExperience;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        private final /* synthetic */ InterfaceC37138c m23037a() {
            return (InterfaceC37138c) ChatEntrypointExperience.$cachedSerializer$delegate.getValue();
        }

        public final InterfaceC37138c serializer() {
            return m23037a();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.navigation.ChatEntrypointExperience", values());
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
