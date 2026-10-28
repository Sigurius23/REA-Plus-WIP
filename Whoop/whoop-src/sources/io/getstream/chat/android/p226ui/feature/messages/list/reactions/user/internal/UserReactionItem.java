package io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal;

import android.graphics.drawable.Drawable;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÂ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0010R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/user/internal/UserReactionItem;", "", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "reaction", "Lio/getstream/chat/android/models/Reaction;", "isMine", "", "reactionDrawable", "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;", "<init>", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Reaction;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V", "getUser", "()Lio/getstream/chat/android/models/User;", "getReaction", "()Lio/getstream/chat/android/models/Reaction;", "()Z", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class UserReactionItem {
    private final Drawable drawable;
    private final boolean isMine;
    private final Reaction reaction;
    private final SupportedReactions.ReactionDrawable reactionDrawable;
    private final User user;

    public UserReactionItem(User user, Reaction reaction, boolean z4, SupportedReactions.ReactionDrawable reactionDrawable) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(reactionDrawable, "reactionDrawable");
        this.user = user;
        this.reaction = reaction;
        this.isMine = z4;
        this.reactionDrawable = reactionDrawable;
        this.drawable = reactionDrawable.getDrawable(z4);
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final SupportedReactions.ReactionDrawable getReactionDrawable() {
        return this.reactionDrawable;
    }

    public static /* synthetic */ UserReactionItem copy$default(UserReactionItem userReactionItem, User user, Reaction reaction, boolean z4, SupportedReactions.ReactionDrawable reactionDrawable, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            user = userReactionItem.user;
        }
        if ((i13 & 2) != 0) {
            reaction = userReactionItem.reaction;
        }
        if ((i13 & 4) != 0) {
            z4 = userReactionItem.isMine;
        }
        if ((i13 & 8) != 0) {
            reactionDrawable = userReactionItem.reactionDrawable;
        }
        return userReactionItem.copy(user, reaction, z4, reactionDrawable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final User getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Reaction getReaction() {
        return this.reaction;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    public final UserReactionItem copy(User user, Reaction reaction, boolean isMine, SupportedReactions.ReactionDrawable reactionDrawable) {
        AbstractC22676k.m65750j(user, "user");
        AbstractC22676k.m65750j(reaction, "reaction");
        AbstractC22676k.m65750j(reactionDrawable, "reactionDrawable");
        return new UserReactionItem(user, reaction, isMine, reactionDrawable);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserReactionItem)) {
            return false;
        }
        UserReactionItem userReactionItem = (UserReactionItem) other;
        return AbstractC22676k.m65745e(this.user, userReactionItem.user) && AbstractC22676k.m65745e(this.reaction, userReactionItem.reaction) && this.isMine == userReactionItem.isMine && AbstractC22676k.m65745e(this.reactionDrawable, userReactionItem.reactionDrawable);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final Reaction getReaction() {
        return this.reaction;
    }

    public final User getUser() {
        return this.user;
    }

    public final int hashCode() {
        return this.reactionDrawable.hashCode() + AbstractC2875y.m8289b((this.reaction.hashCode() + (this.user.hashCode() * 31)) * 31, 31, this.isMine);
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final String toString() {
        return "UserReactionItem(user=" + this.user + ", reaction=" + this.reaction + ", isMine=" + this.isMine + ", reactionDrawable=" + this.reactionDrawable + ")";
    }
}
