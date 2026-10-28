package io.getstream.chat.android.p226ui.utils;

import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import mr.AbstractC25903i;
import mr.AbstractC25905k;
import mr.C25908n;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"io/getstream/chat/android/ui/utils/PermissionChecker$showPermissionDeniedSnackbar$1$2", "Lmr/i;", "Lmr/n;", "sb", "Ll83/a0;", "onShown", "(Lmr/n;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PermissionChecker$showPermissionDeniedSnackbar$1$2 extends AbstractC25903i {
    @Override // mr.AbstractC25903i
    public final void onShown(C25908n sb4) {
        AbstractC25905k abstractC25905k;
        if (sb4 == null || (abstractC25905k = sb4.f102259i) == null) {
            return;
        }
        abstractC25905k.setElevation(IntKt.dpToPxPrecise(20));
    }
}
