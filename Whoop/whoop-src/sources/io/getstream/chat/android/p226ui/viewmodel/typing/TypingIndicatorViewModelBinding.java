package io.getstream.chat.android.p226ui.viewmodel.typing;

import androidx.lifecycle.InterfaceC1585g0;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import io.getstream.chat.android.p226ui.widgets.typing.TypingIndicatorView;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;", "Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;", ProfileAnalyticsKt.VIEW, "Landroidx/lifecycle/g0;", "lifecycleOwner", "Ll83/a0;", "bind", "(Lio/getstream/chat/android/ui/viewmodel/typing/TypingIndicatorViewModel;Lio/getstream/chat/android/ui/widgets/typing/TypingIndicatorView;Landroidx/lifecycle/g0;)V", "bindView", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class TypingIndicatorViewModelBinding {
    public static final void bind(TypingIndicatorViewModel typingIndicatorViewModel, TypingIndicatorView view, InterfaceC1585g0 lifecycleOwner) {
        AbstractC22676k.m65750j(typingIndicatorViewModel, "<this>");
        AbstractC22676k.m65750j(view, "view");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        typingIndicatorViewModel.getTypingUsers().observe(lifecycleOwner, new C19961x4816055d(new C19962a(view, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 bindView$lambda$0(TypingIndicatorView typingIndicatorView, List list) {
        AbstractC22676k.m65747g(list);
        typingIndicatorView.setTypingUsers(list);
        return C23454a0.f92919a;
    }
}
