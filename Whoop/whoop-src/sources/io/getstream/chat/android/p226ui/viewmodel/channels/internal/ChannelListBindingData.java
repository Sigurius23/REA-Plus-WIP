package io.getstream.chat.android.p226ui.viewmodel.channels.internal;

import c13.AbstractC3855a;
import io.getstream.chat.android.models.DraftMessage;
import io.getstream.chat.android.models.TypingEvent;
import io.getstream.chat.android.p226ui.viewmodel.channels.ChannelListViewModel;
import java.util.Map;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelListBindingData;", "", "state", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;", "paginationState", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;", "typingEvents", "", "", "Lio/getstream/chat/android/models/TypingEvent;", "draftMessages", "Lio/getstream/chat/android/models/DraftMessage;", "<init>", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;Ljava/util/Map;Ljava/util/Map;)V", "getState", "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;", "getPaginationState", "()Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;", "getTypingEvents", "()Ljava/util/Map;", "getDraftMessages", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final /* data */ class ChannelListBindingData {
    private final Map<String, DraftMessage> draftMessages;
    private final ChannelListViewModel.PaginationState paginationState;
    private final ChannelListViewModel.State state;
    private final Map<String, TypingEvent> typingEvents;

    public ChannelListBindingData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChannelListBindingData copy$default(ChannelListBindingData channelListBindingData, ChannelListViewModel.State state, ChannelListViewModel.PaginationState paginationState, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            state = channelListBindingData.state;
        }
        if ((i13 & 2) != 0) {
            paginationState = channelListBindingData.paginationState;
        }
        if ((i13 & 4) != 0) {
            map = channelListBindingData.typingEvents;
        }
        if ((i13 & 8) != 0) {
            map2 = channelListBindingData.draftMessages;
        }
        return channelListBindingData.copy(state, paginationState, map, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChannelListViewModel.State getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChannelListViewModel.PaginationState getPaginationState() {
        return this.paginationState;
    }

    public final Map<String, TypingEvent> component3() {
        return this.typingEvents;
    }

    public final Map<String, DraftMessage> component4() {
        return this.draftMessages;
    }

    public final ChannelListBindingData copy(ChannelListViewModel.State state, ChannelListViewModel.PaginationState paginationState, Map<String, TypingEvent> typingEvents, Map<String, DraftMessage> draftMessages) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(paginationState, "paginationState");
        AbstractC22676k.m65750j(typingEvents, "typingEvents");
        AbstractC22676k.m65750j(draftMessages, "draftMessages");
        return new ChannelListBindingData(state, paginationState, typingEvents, draftMessages);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelListBindingData)) {
            return false;
        }
        ChannelListBindingData channelListBindingData = (ChannelListBindingData) other;
        return AbstractC22676k.m65745e(this.state, channelListBindingData.state) && AbstractC22676k.m65745e(this.paginationState, channelListBindingData.paginationState) && AbstractC22676k.m65745e(this.typingEvents, channelListBindingData.typingEvents) && AbstractC22676k.m65745e(this.draftMessages, channelListBindingData.draftMessages);
    }

    public final Map<String, DraftMessage> getDraftMessages() {
        return this.draftMessages;
    }

    public final ChannelListViewModel.PaginationState getPaginationState() {
        return this.paginationState;
    }

    public final ChannelListViewModel.State getState() {
        return this.state;
    }

    public final Map<String, TypingEvent> getTypingEvents() {
        return this.typingEvents;
    }

    public final int hashCode() {
        return this.draftMessages.hashCode() + AbstractC3855a.m11821e(this.typingEvents, (this.paginationState.hashCode() + (this.state.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        ChannelListViewModel.State state = this.state;
        ChannelListViewModel.PaginationState paginationState = this.paginationState;
        Map<String, TypingEvent> map = this.typingEvents;
        Map<String, DraftMessage> map2 = this.draftMessages;
        StringBuilder sb4 = new StringBuilder("ChannelListBindingData(state=");
        sb4.append(state);
        sb4.append(", paginationState=");
        sb4.append(paginationState);
        sb4.append(", typingEvents=");
        return AbstractC30802r.m94765n(sb4, map, ", draftMessages=", map2, ")");
    }

    public ChannelListBindingData(ChannelListViewModel.State state, ChannelListViewModel.PaginationState paginationState, Map<String, TypingEvent> typingEvents, Map<String, DraftMessage> draftMessages) {
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(paginationState, "paginationState");
        AbstractC22676k.m65750j(typingEvents, "typingEvents");
        AbstractC22676k.m65750j(draftMessages, "draftMessages");
        this.state = state;
        this.paginationState = paginationState;
        this.typingEvents = typingEvents;
        this.draftMessages = draftMessages;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChannelListBindingData(ChannelListViewModel.State state, ChannelListViewModel.PaginationState paginationState, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z4 = false;
        state = (i13 & 1) != 0 ? new ChannelListViewModel.State(false, C25271y.f99162w) : state;
        paginationState = (i13 & 2) != 0 ? new ChannelListViewModel.PaginationState(z4, z4, 3, null) : paginationState;
        int i14 = i13 & 4;
        C25272z c25272z = C25272z.f99163w;
        this(state, paginationState, i14 != 0 ? c25272z : map, (i13 & 8) != 0 ? c25272z : map2);
    }
}
