package io.getstream.chat.android.p226ui.feature.messages.composer.content;

import android.widget.FrameLayout;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Command;
import io.getstream.chat.android.models.User;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.composer.content.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19713b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74572w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ FrameLayout f74573x;

    public /* synthetic */ C19713b(FrameLayout frameLayout, int i13) {
        this.f74572w = i13;
        this.f74573x = frameLayout;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74572w) {
            case 0:
                DefaultMessageComposerCenterContent.buildAdapter$lambda$1((DefaultMessageComposerCenterContent) this.f74573x, (Attachment) obj);
                break;
            case 1:
                DefaultMessageComposerCommandSuggestionsContent.buildAdapter$lambda$0((DefaultMessageComposerCommandSuggestionsContent) this.f74573x, (Command) obj);
                break;
            default:
                DefaultMessageComposerMentionSuggestionsContent.buildAdapter$lambda$0((DefaultMessageComposerMentionSuggestionsContent) this.f74573x, (User) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
