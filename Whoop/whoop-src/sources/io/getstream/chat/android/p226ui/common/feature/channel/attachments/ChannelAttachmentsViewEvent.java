package io.getstream.chat.android.p226ui.common.feature.channel.attachments;

import hc3.AbstractC17176i;
import n23.AbstractC26202e;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;", "", "LoadMoreError", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent$LoadMoreError;", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelAttachmentsViewEvent {

    @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent$LoadMoreError;", "Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent;", "Ln23/e;", "error", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/common/feature/channel/attachments/ChannelAttachmentsViewEvent$LoadMoreError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getError", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class LoadMoreError implements ChannelAttachmentsViewEvent {
        public static final int $stable = 8;
        private final AbstractC26202e error;

        public LoadMoreError(AbstractC26202e error) {
            AbstractC22676k.m65750j(error, "error");
            this.error = error;
        }

        public static /* synthetic */ LoadMoreError copy$default(LoadMoreError loadMoreError, AbstractC26202e abstractC26202e, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC26202e = loadMoreError.error;
            }
            return loadMoreError.copy(abstractC26202e);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final AbstractC26202e getError() {
            return this.error;
        }

        public final LoadMoreError copy(AbstractC26202e error) {
            AbstractC22676k.m65750j(error, "error");
            return new LoadMoreError(error);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadMoreError) && AbstractC22676k.m65745e(this.error, ((LoadMoreError) other).error);
        }

        public final AbstractC26202e getError() {
            return this.error;
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return AbstractC17176i.m48503e("LoadMoreError(error=", this.error, ")");
        }
    }
}
