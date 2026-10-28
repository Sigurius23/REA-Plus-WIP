package io.getstream.chat.android.p226ui.common.helper;

import c93.InterfaceC4339a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005J\u000e\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/TimeProvider;", "Lkotlin/Function0;", "", "invoke", "()Ljava/lang/Long;", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface TimeProvider extends InterfaceC4339a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/helper/TimeProvider$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/getstream/chat/android/ui/common/helper/TimeProvider;", "getDEFAULT$annotations", "getDEFAULT", "()Lio/getstream/chat/android/ui/common/helper/TimeProvider;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final TimeProvider DEFAULT = TimeProvider$Companion$DEFAULT$1.INSTANCE;

        private Companion() {
        }

        public static /* synthetic */ void getDEFAULT$annotations() {
        }

        public final TimeProvider getDEFAULT() {
            return DEFAULT;
        }
    }

    static TimeProvider getDEFAULT() {
        return INSTANCE.getDEFAULT();
    }

    @Override // c93.InterfaceC4339a
    Long invoke();

    @Override // c93.InterfaceC4339a
    /* synthetic */ Object invoke();
}
