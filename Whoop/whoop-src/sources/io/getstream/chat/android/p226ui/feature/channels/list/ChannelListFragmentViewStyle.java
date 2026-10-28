package io.getstream.chat.android.p226ui.feature.channels.list;

import android.content.Context;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.helper.TransformStyle;
import io.getstream.chat.android.p226ui.helper.ViewStyle;
import io.getstream.chat.android.p226ui.utils.extensions.ContextKt;
import nh3.AbstractC26725a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "Lio/getstream/chat/android/ui/helper/ViewStyle;", "searchInputMarginStart", "", "searchInputMarginTop", "searchInputMarginEnd", "searchInputMarginBottom", "<init>", "(IIII)V", "getSearchInputMarginStart", "()I", "getSearchInputMarginTop", "getSearchInputMarginEnd", "getSearchInputMarginBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelListFragmentViewStyle implements ViewStyle {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final int searchInputMarginBottom;
    private final int searchInputMarginEnd;
    private final int searchInputMarginStart;
    private final int searchInputMarginTop;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0002¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle$Companion;", "", "<init>", "()V", "invoke", "Lio/getstream/chat/android/ui/feature/channels/list/ChannelListFragmentViewStyle;", "context", "Landroid/content/Context;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final ChannelListFragmentViewStyle invoke(Context context) {
            AbstractC22676k.m65750j(context, "context");
            return TransformStyle.getChannelListFragmentStyleTransformer().transform(new ChannelListFragmentViewStyle(ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_search_margin_start), ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_search_margin_top), ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_search_margin_end), ContextKt.getDimension(context, C19469R.dimen.stream_ui_channel_list_search_margin_bottom)));
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ChannelListFragmentViewStyle(int i13, int i14, int i15, int i16) {
        this.searchInputMarginStart = i13;
        this.searchInputMarginTop = i14;
        this.searchInputMarginEnd = i15;
        this.searchInputMarginBottom = i16;
    }

    public static ChannelListFragmentViewStyle copy$default(ChannelListFragmentViewStyle channelListFragmentViewStyle, int i13, int i14, int i15, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i13 = channelListFragmentViewStyle.searchInputMarginStart;
        }
        if ((i17 & 2) != 0) {
            i14 = channelListFragmentViewStyle.searchInputMarginTop;
        }
        if ((i17 & 4) != 0) {
            i15 = channelListFragmentViewStyle.searchInputMarginEnd;
        }
        if ((i17 & 8) != 0) {
            i16 = channelListFragmentViewStyle.searchInputMarginBottom;
        }
        channelListFragmentViewStyle.getClass();
        return new ChannelListFragmentViewStyle(i13, i14, i15, i16);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSearchInputMarginStart() {
        return this.searchInputMarginStart;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSearchInputMarginTop() {
        return this.searchInputMarginTop;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSearchInputMarginEnd() {
        return this.searchInputMarginEnd;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSearchInputMarginBottom() {
        return this.searchInputMarginBottom;
    }

    public final ChannelListFragmentViewStyle copy(int searchInputMarginStart, int searchInputMarginTop, int searchInputMarginEnd, int searchInputMarginBottom) {
        return new ChannelListFragmentViewStyle(searchInputMarginStart, searchInputMarginTop, searchInputMarginEnd, searchInputMarginBottom);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelListFragmentViewStyle)) {
            return false;
        }
        ChannelListFragmentViewStyle channelListFragmentViewStyle = (ChannelListFragmentViewStyle) other;
        return this.searchInputMarginStart == channelListFragmentViewStyle.searchInputMarginStart && this.searchInputMarginTop == channelListFragmentViewStyle.searchInputMarginTop && this.searchInputMarginEnd == channelListFragmentViewStyle.searchInputMarginEnd && this.searchInputMarginBottom == channelListFragmentViewStyle.searchInputMarginBottom;
    }

    public final int getSearchInputMarginBottom() {
        return this.searchInputMarginBottom;
    }

    public final int getSearchInputMarginEnd() {
        return this.searchInputMarginEnd;
    }

    public final int getSearchInputMarginStart() {
        return this.searchInputMarginStart;
    }

    public final int getSearchInputMarginTop() {
        return this.searchInputMarginTop;
    }

    public final int hashCode() {
        return Integer.hashCode(this.searchInputMarginBottom) + AbstractC11266d.m30448b(this.searchInputMarginEnd, AbstractC11266d.m30448b(this.searchInputMarginTop, Integer.hashCode(this.searchInputMarginStart) * 31, 31), 31);
    }

    public final String toString() {
        int i13 = this.searchInputMarginStart;
        int i14 = this.searchInputMarginTop;
        return AbstractC26725a.m79505i(AbstractC11266d.m30465s(i13, i14, "ChannelListFragmentViewStyle(searchInputMarginStart=", ", searchInputMarginTop=", ", searchInputMarginEnd="), this.searchInputMarginEnd, ", searchInputMarginBottom=", this.searchInputMarginBottom, ")");
    }
}
