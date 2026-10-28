package io.getstream.chat.android.p226ui.helper;

import android.content.Context;
import android.graphics.drawable.Drawable;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import io.getstream.chat.android.p226ui.utils.extensions.DrawableKt;
import java.util.List;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import p479s4.AbstractC32122c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0015\u0016\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/SupportedReactions;", "", "context", "Landroid/content/Context;", "reactions", "", "", "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;", "<init>", "(Landroid/content/Context;Ljava/util/Map;)V", "getReactions", "()Ljava/util/Map;", "types", "", "getTypes", "()Ljava/util/List;", "isReactionTypeSupported", "", "type", "isReactionTypeSupported$stream_chat_android_ui_components_release", "getReactionDrawable", "ReactionDrawable", "DefaultReactionTypes", "DefaultReactionDrawables", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SupportedReactions {
    private final Map<String, ReactionDrawable> reactions;
    private final List<String> types;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionDrawables;", "", "<init>", "()V", "loveDrawable", "Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;", "context", "Landroid/content/Context;", "thumbsUpDrawable", "thumbsDownDrawable", "lolDrawable", "wutDrawable", "createTintedReactionDrawable", "drawableResId", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultReactionDrawables {
        public static final DefaultReactionDrawables INSTANCE = new DefaultReactionDrawables();

        private DefaultReactionDrawables() {
        }

        private final ReactionDrawable createTintedReactionDrawable(Context context, int drawableResId) {
            Drawable drawableCompat = ContextKt.getDrawableCompat(context, drawableResId);
            AbstractC22676k.m65747g(drawableCompat);
            Drawable drawableApplyTint = DrawableKt.applyTint(drawableCompat, Integer.valueOf(AbstractC32122c.getColor(context, C19469R.color.stream_ui_grey)));
            Drawable drawable = AbstractC32122c.getDrawable(context, drawableResId);
            AbstractC22676k.m65747g(drawable);
            return new ReactionDrawable(drawableApplyTint, DrawableKt.applyTint(drawable, Integer.valueOf(AbstractC32122c.getColor(context, C19469R.color.stream_ui_accent_blue))));
        }

        public final ReactionDrawable lolDrawable(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createTintedReactionDrawable(context, C19469R.drawable.stream_ui_ic_reaction_lol);
        }

        public final ReactionDrawable loveDrawable(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createTintedReactionDrawable(context, C19469R.drawable.stream_ui_ic_reaction_love);
        }

        public final ReactionDrawable thumbsDownDrawable(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createTintedReactionDrawable(context, C19469R.drawable.stream_ui_ic_reaction_thumbs_down);
        }

        public final ReactionDrawable thumbsUpDrawable(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createTintedReactionDrawable(context, C19469R.drawable.stream_ui_ic_reaction_thumbs_up);
        }

        public final ReactionDrawable wutDrawable(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return createTintedReactionDrawable(context, C19469R.drawable.stream_ui_ic_reaction_wut);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/SupportedReactions$DefaultReactionTypes;", "", "<init>", "()V", "LOVE", "", "THUMBS_UP", "THUMBS_DOWN", "LOL", "WUT", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultReactionTypes {
        public static final DefaultReactionTypes INSTANCE = new DefaultReactionTypes();
        public static final String LOL = "haha";
        public static final String LOVE = "love";
        public static final String THUMBS_DOWN = "sad";
        public static final String THUMBS_UP = "like";
        public static final String WUT = "wow";

        private DefaultReactionTypes() {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/SupportedReactions$ReactionDrawable;", "", "inactiveDrawable", "Landroid/graphics/drawable/Drawable;", "activeDrawable", "<init>", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V", "getDrawable", "isActive", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class ReactionDrawable {
        private final Drawable activeDrawable;
        private final Drawable inactiveDrawable;

        public ReactionDrawable(Drawable inactiveDrawable, Drawable activeDrawable) {
            AbstractC22676k.m65750j(inactiveDrawable, "inactiveDrawable");
            AbstractC22676k.m65750j(activeDrawable, "activeDrawable");
            this.inactiveDrawable = inactiveDrawable;
            this.activeDrawable = activeDrawable;
        }

        public final Drawable getDrawable(boolean isActive) {
            return isActive ? this.activeDrawable : this.inactiveDrawable;
        }
    }

    public SupportedReactions(Context context, Map<String, ReactionDrawable> reactions) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(reactions, "reactions");
        this.reactions = reactions;
        this.types = AbstractC25265s.m74093D1(reactions.keySet());
    }

    public final ReactionDrawable getReactionDrawable(String type) {
        AbstractC22676k.m65750j(type, "type");
        return this.reactions.get(type);
    }

    public final Map<String, ReactionDrawable> getReactions() {
        return this.reactions;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    /* JADX INFO: renamed from: isReactionTypeSupported$stream_chat_android_ui_components_release */
    public final boolean m55661x42c3070e(String type) {
        AbstractC22676k.m65750j(type, "type");
        return this.reactions.keySet().contains(type);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SupportedReactions(Context context, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            DefaultReactionDrawables defaultReactionDrawables = DefaultReactionDrawables.INSTANCE;
            map = AbstractC25247g0.m73990Y(new C23465k("love", defaultReactionDrawables.loveDrawable(context)), new C23465k("like", defaultReactionDrawables.thumbsUpDrawable(context)), new C23465k("sad", defaultReactionDrawables.thumbsDownDrawable(context)), new C23465k("haha", defaultReactionDrawables.lolDrawable(context)), new C23465k("wow", defaultReactionDrawables.wutDrawable(context)));
        }
        this(context, map);
    }
}
