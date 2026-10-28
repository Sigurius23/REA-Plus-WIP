package io.getstream.chat.android.p226ui.feature.messages.list.reactions.internal;

import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÂ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/reactions/internal/ReactionItem;", "", "type", "", "isMine", "", "reactionDrawable", "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;", "<init>", "(Ljava/lang/String;ZLio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;)V", "getType", "()Ljava/lang/String;", "()Z", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ReactionItem {
    private final Drawable drawable;
    private final boolean isMine;
    private final SupportedReactions.ReactionDrawable reactionDrawable;
    private final String type;

    public ReactionItem(String type, boolean z4, SupportedReactions.ReactionDrawable reactionDrawable) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(reactionDrawable, "reactionDrawable");
        this.type = type;
        this.isMine = z4;
        this.reactionDrawable = reactionDrawable;
        this.drawable = reactionDrawable.getDrawable(z4);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final SupportedReactions.ReactionDrawable getReactionDrawable() {
        return this.reactionDrawable;
    }

    public static /* synthetic */ ReactionItem copy$default(ReactionItem reactionItem, String str, boolean z4, SupportedReactions.ReactionDrawable reactionDrawable, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = reactionItem.type;
        }
        if ((i13 & 2) != 0) {
            z4 = reactionItem.isMine;
        }
        if ((i13 & 4) != 0) {
            reactionDrawable = reactionItem.reactionDrawable;
        }
        return reactionItem.copy(str, z4, reactionDrawable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    public final ReactionItem copy(String type, boolean isMine, SupportedReactions.ReactionDrawable reactionDrawable) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(reactionDrawable, "reactionDrawable");
        return new ReactionItem(type, isMine, reactionDrawable);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactionItem)) {
            return false;
        }
        ReactionItem reactionItem = (ReactionItem) other;
        return AbstractC22676k.m65745e(this.type, reactionItem.type) && this.isMine == reactionItem.isMine && AbstractC22676k.m65745e(this.reactionDrawable, reactionItem.reactionDrawable);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.reactionDrawable.hashCode() + AbstractC2875y.m8289b(this.type.hashCode() * 31, 31, this.isMine);
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final String toString() {
        String str = this.type;
        boolean z4 = this.isMine;
        SupportedReactions.ReactionDrawable reactionDrawable = this.reactionDrawable;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("ReactionItem(type=", str, ", isMine=", ", reactionDrawable=", z4);
        sbM73379l.append(reactionDrawable);
        sbM73379l.append(")");
        return sbM73379l.toString();
    }
}
