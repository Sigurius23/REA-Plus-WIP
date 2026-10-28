package io.getstream.chat.android.p226ui.viewmodel.channels;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1627t0;
import androidx.lifecycle.C1630u0;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.C3031l1;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bc3.InterfaceC3061u;
import c93.InterfaceC4351m;
import ch.C4588i;
import com.mapbox.maps.MapboxMap;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import fc3.C14380k;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.client.api.models.QueryChannelsRequest;
import io.getstream.chat.android.client.api.state.ChannelsStateData;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.client.api.state.Event;
import io.getstream.chat.android.client.api.state.QueryChannelsState;
import io.getstream.chat.android.client.channel.ChannelClient;
import io.getstream.chat.android.client.errors.ChatErrorKt;
import io.getstream.chat.android.client.setup.state.ClientState;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelMute;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.Filters;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.querysort.QuerySortByField;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.common.utils.extensions.FiltersKt;
import io.getstream.chat.android.p226ui.utils.extensions.ChannelKt;
import io.getstream.chat.android.p226ui.utils.extensions.LiveDataKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import n23.AbstractC26202e;
import o23.AbstractC27476f;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p337n8.C26444a;
import p505ts.AbstractC34132o;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 z2\u00020\u0001:\u0006{|}~\u007fzBS\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012Bs\b\u0016\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0018B\u008f\u0001\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u001fJ\u0015\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0016¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\"H\u0002¢\u0006\u0004\b0\u0010*J\u000f\u00101\u001a\u00020\"H\u0002¢\u0006\u0004\b1\u0010*J%\u00108\u001a\u0002072\u0006\u00103\u001a\u0002022\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\"H\u0002¢\u0006\u0004\b:\u0010*J\u0011\u0010<\u001a\u0004\u0018\u00010;H\u0002¢\u0006\u0004\b<\u0010=J#\u0010A\u001a\u00020\"2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>H\u0002¢\u0006\u0004\bA\u0010BJ1\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0016042\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\u0016042\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0002¢\u0006\u0004\bD\u0010EJG\u0010K\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010J\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\u0006\u0010H\u001a\u00028\u00002\u0006\u0010I\u001a\u00028\u0001H\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010OR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010OR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010PR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010RR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u0018\u0010U\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u0002070W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u0002070Z8\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R)\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020_0\u001b0Z8\u0006¢\u0006\f\n\u0004\b`\u0010\\\u001a\u0004\ba\u0010^R)\u0010c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020b0\u001b0Z8\u0006¢\u0006\f\n\u0004\bc\u0010\\\u001a\u0004\bd\u0010^R \u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010fR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020?0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010YR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020?0Z8\u0006¢\u0006\f\n\u0004\bh\u0010\\\u001a\u0004\bi\u0010^R \u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0k0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR#\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0k0Z8\u0006¢\u0006\f\n\u0004\bo\u0010\\\u001a\u0004\bp\u0010^R\u001b\u0010v\u001a\u00020q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u001c\u0010w\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010nR\u001e\u0010y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010x0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010f¨\u0006\u0080\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel;", "Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "mode", "", MapboxMap.QFE_LIMIT, "messageLimit", "memberLimit", "", "isDraftMessagesEnabled", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "Lec3/l;", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "<init>", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "sort", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V", "", "predefinedFilterName", "", "", "filterValues", "sortValues", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;", "action", "Ll83/a0;", "onAction", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;)V", "channel", "leaveChannel", "(Lio/getstream/chat/android/models/Channel;)V", "deleteChannel", "markAllRead", "()V", "filterObject", "setFilters", "(Lio/getstream/chat/android/models/FilterObject;)V", "buildDefaultFilter", "()Lec3/l;", "initData", "init", "Lio/getstream/chat/android/client/api/state/ChannelsStateData;", "channelState", "", "Lio/getstream/chat/android/models/ChannelMute;", "channelMutes", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;", "handleChannelStateNews", "(Lio/getstream/chat/android/client/api/state/ChannelsStateData;Ljava/util/List;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;", "requestMoreChannels", "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "buildQueryChannelsRequest", "()Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;", "Lkotlin/Function1;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;", "reducer", "setPaginationState", "(Lkotlin/jvm/functions/Function1;)V", "channels", "parseMutedChannels", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "K", "V", "changeKey", "changeValue", "", "clone", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "I", "Ljava/lang/Integer;", "Z", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "Lio/getstream/chat/android/client/ChatClient;", "Lec3/l;", "Lbc3/k1;", "queryJob", "Lbc3/k1;", "Landroidx/lifecycle/t0;", "stateMerger", "Landroidx/lifecycle/t0;", "Landroidx/lifecycle/p0;", "state", "Landroidx/lifecycle/p0;", "getState", "()Landroidx/lifecycle/p0;", "Lio/getstream/chat/android/models/TypingEvent;", "typingEvents", "getTypingEvents", "Lio/getstream/chat/android/models/DraftMessage;", "draftMessages", "getDraftMessages", "Lec3/f2;", "Lec3/f2;", "paginationStateMerger", "paginationState", "getPaginationState", "Landroidx/lifecycle/u0;", "Lio/getstream/chat/android/client/api/state/Event;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "_errorEvents", "Landroidx/lifecycle/u0;", "errorEvents", "getErrorEvents", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "filterLiveData", "Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "queryChannelsState", "Companion", "State", "PaginationState", "Action", "ErrorEvent", "QueryMode", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListViewModel extends AbstractC1637w1 {
    public static final int DEFAULT_CHANNEL_LIMIT = 30;
    private final C1630u0 _errorEvents;
    private final InterfaceC13037f2 channelMutes;
    private final ChatClient chatClient;
    private final ChatEventHandlerFactory chatEventHandlerFactory;
    private final AbstractC1615p0 draftMessages;
    private final AbstractC1615p0 errorEvents;
    private final C1630u0 filterLiveData;
    private final InterfaceC13058l globalState;
    private final boolean isDraftMessagesEnabled;
    private final int limit;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Integer memberLimit;
    private final Integer messageLimit;
    private final QueryMode mode;
    private final AbstractC1615p0 paginationState;
    private final C1627t0 paginationStateMerger;
    private InterfaceC13037f2 queryChannelsState;
    private InterfaceC3027k1 queryJob;
    private final AbstractC1615p0 state;
    private final C1627t0 stateMerger;
    private final AbstractC1615p0 typingEvents;
    public static final QuerySorter<Channel> DEFAULT_SORT = QuerySortByField.INSTANCE.descByName("last_updated");
    private static final State INITIAL_STATE = new State(true, C25271y.f99162w);

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$1", m100430f = "ChannelListViewModel.kt", m100431l = {AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199091 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C199091(InterfaceC30057d<? super C199091> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelListViewModel.this.new C199091(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C199091) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lBuildDefaultFilter = ChannelListViewModel.this.buildDefaultFilter();
                this.label = 1;
                obj = AbstractC13091v.m36575A(interfaceC13058lBuildDefaultFilter, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            ChannelListViewModel.this.filterLiveData.setValue((FilterObject) obj);
            return C23454a0.f92919a;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;", "", "<init>", "()V", "ReachedEndOfList", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class Action {

        @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action$ReachedEndOfList;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$Action;", "<init>", "()V", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final class ReachedEndOfList extends Action {
            public static final ReachedEndOfList INSTANCE = new ReachedEndOfList();

            private ReachedEndOfList() {
            }

            public final String toString() {
                return "ReachedEndOfList";
            }
        }

        private Action() {
        }

        public Action(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\u000b\f¨\u0006\r"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "Ln23/e;", "getStreamError", "()Ln23/e;", "LeaveChannelError", "DeleteChannelError", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static abstract class ErrorEvent {
        private final AbstractC26202e streamError;

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$DeleteChannelError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class DeleteChannelError extends ErrorEvent {
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DeleteChannelError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ DeleteChannelError copy$default(DeleteChannelError deleteChannelError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = deleteChannelError.streamError;
                }
                return deleteChannelError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final DeleteChannelError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new DeleteChannelError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DeleteChannelError) && AbstractC22676k.m65745e(this.streamError, ((DeleteChannelError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("DeleteChannelError(streamError=", this.streamError, ")");
            }
        }

        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent;", "Ln23/e;", "streamError", "<init>", "(Ln23/e;)V", "component1", "()Ln23/e;", "copy", "(Ln23/e;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$ErrorEvent$LeaveChannelError;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ln23/e;", "getStreamError", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class LeaveChannelError extends ErrorEvent {
            private final AbstractC26202e streamError;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LeaveChannelError(AbstractC26202e streamError) {
                super(streamError, null);
                AbstractC22676k.m65750j(streamError, "streamError");
                this.streamError = streamError;
            }

            public static /* synthetic */ LeaveChannelError copy$default(LeaveChannelError leaveChannelError, AbstractC26202e abstractC26202e, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    abstractC26202e = leaveChannelError.streamError;
                }
                return leaveChannelError.copy(abstractC26202e);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final LeaveChannelError copy(AbstractC26202e streamError) {
                AbstractC22676k.m65750j(streamError, "streamError");
                return new LeaveChannelError(streamError);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LeaveChannelError) && AbstractC22676k.m65745e(this.streamError, ((LeaveChannelError) other).streamError);
            }

            @Override // io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel.ErrorEvent
            public final AbstractC26202e getStreamError() {
                return this.streamError;
            }

            public final int hashCode() {
                return this.streamError.hashCode();
            }

            public final String toString() {
                return AbstractC17176i.m48503e("LeaveChannelError(streamError=", this.streamError, ")");
            }
        }

        public /* synthetic */ ErrorEvent(AbstractC26202e abstractC26202e, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC26202e);
        }

        public AbstractC26202e getStreamError() {
            return this.streamError;
        }

        private ErrorEvent(AbstractC26202e abstractC26202e) {
            this.streamError = abstractC26202e;
        }
    }

    @Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$PaginationState;", "", "loadingMore", "", "endOfChannels", "<init>", "(ZZ)V", "getLoadingMore", "()Z", "getEndOfChannels", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class PaginationState {
        private final boolean endOfChannels;
        private final boolean loadingMore;

        /* JADX WARN: Illegal instructions before constructor call */
        public PaginationState() {
            boolean z4 = false;
            this(z4, z4, 3, null);
        }

        public static PaginationState copy$default(PaginationState paginationState, boolean z4, boolean z13, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = paginationState.loadingMore;
            }
            if ((i13 & 2) != 0) {
                z13 = paginationState.endOfChannels;
            }
            paginationState.getClass();
            return new PaginationState(z4, z13);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getLoadingMore() {
            return this.loadingMore;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getEndOfChannels() {
            return this.endOfChannels;
        }

        public final PaginationState copy(boolean loadingMore, boolean endOfChannels) {
            return new PaginationState(loadingMore, endOfChannels);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaginationState)) {
                return false;
            }
            PaginationState paginationState = (PaginationState) other;
            return this.loadingMore == paginationState.loadingMore && this.endOfChannels == paginationState.endOfChannels;
        }

        public final boolean getEndOfChannels() {
            return this.endOfChannels;
        }

        public final boolean getLoadingMore() {
            return this.loadingMore;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.endOfChannels) + (Boolean.hashCode(this.loadingMore) * 31);
        }

        public final String toString() {
            return AbstractC30802r.m94762k("PaginationState(loadingMore=", ", endOfChannels=", ")", this.loadingMore, this.endOfChannels);
        }

        public PaginationState(boolean z4, boolean z13) {
            this.loadingMore = z4;
            this.endOfChannels = z13;
        }

        public /* synthetic */ PaginationState(boolean z4, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "", "Standard", "Predefined", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public interface QueryMode {

        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003JC\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Predefined;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "name", "", "filterValues", "", "", "sortValues", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getFilterValues", "()Ljava/util/Map;", "getSortValues", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Predefined implements QueryMode {
            private final Map<String, Object> filterValues;
            private final String name;
            private final Map<String, Object> sortValues;

            public Predefined(String name, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
                AbstractC22676k.m65750j(name, "name");
                this.name = name;
                this.filterValues = map;
                this.sortValues = map2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Predefined copy$default(Predefined predefined, String str, Map map, Map map2, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = predefined.name;
                }
                if ((i13 & 2) != 0) {
                    map = predefined.filterValues;
                }
                if ((i13 & 4) != 0) {
                    map2 = predefined.sortValues;
                }
                return predefined.copy(str, map, map2);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final Map<String, Object> component2() {
                return this.filterValues;
            }

            public final Map<String, Object> component3() {
                return this.sortValues;
            }

            public final Predefined copy(String name, Map<String, ? extends Object> filterValues, Map<String, ? extends Object> sortValues) {
                AbstractC22676k.m65750j(name, "name");
                return new Predefined(name, filterValues, sortValues);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Predefined)) {
                    return false;
                }
                Predefined predefined = (Predefined) other;
                return AbstractC22676k.m65745e(this.name, predefined.name) && AbstractC22676k.m65745e(this.filterValues, predefined.filterValues) && AbstractC22676k.m65745e(this.sortValues, predefined.sortValues);
            }

            public final Map<String, Object> getFilterValues() {
                return this.filterValues;
            }

            public final String getName() {
                return this.name;
            }

            public final Map<String, Object> getSortValues() {
                return this.sortValues;
            }

            public final int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                Map<String, Object> map = this.filterValues;
                int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, Object> map2 = this.sortValues;
                return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
            }

            public final String toString() {
                String str = this.name;
                Map<String, Object> map = this.filterValues;
                return AbstractC13673n.m38565l(AbstractC36095b.m114686n("Predefined(name=", str, ", filterValues=", ", sortValues=", map), this.sortValues, ")");
            }
        }

        @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode$Standard;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "initialFilter", "Lio/getstream/chat/android/models/FilterObject;", "initialSort", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "<init>", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V", "getInitialFilter", "()Lio/getstream/chat/android/models/FilterObject;", "getInitialSort", "()Lio/getstream/chat/android/models/querysort/QuerySorter;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
        public static final /* data */ class Standard implements QueryMode {
            private final FilterObject initialFilter;
            private final QuerySorter<Channel> initialSort;

            public Standard(FilterObject filterObject, QuerySorter<Channel> initialSort) {
                AbstractC22676k.m65750j(initialSort, "initialSort");
                this.initialFilter = filterObject;
                this.initialSort = initialSort;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Standard copy$default(Standard standard, FilterObject filterObject, QuerySorter querySorter, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    filterObject = standard.initialFilter;
                }
                if ((i13 & 2) != 0) {
                    querySorter = standard.initialSort;
                }
                return standard.copy(filterObject, querySorter);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final FilterObject getInitialFilter() {
                return this.initialFilter;
            }

            public final QuerySorter<Channel> component2() {
                return this.initialSort;
            }

            public final Standard copy(FilterObject initialFilter, QuerySorter<Channel> initialSort) {
                AbstractC22676k.m65750j(initialSort, "initialSort");
                return new Standard(initialFilter, initialSort);
            }

            public final boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Standard)) {
                    return false;
                }
                Standard standard = (Standard) other;
                return AbstractC22676k.m65745e(this.initialFilter, standard.initialFilter) && AbstractC22676k.m65745e(this.initialSort, standard.initialSort);
            }

            public final FilterObject getInitialFilter() {
                return this.initialFilter;
            }

            public final QuerySorter<Channel> getInitialSort() {
                return this.initialSort;
            }

            public final int hashCode() {
                FilterObject filterObject = this.initialFilter;
                return this.initialSort.hashCode() + ((filterObject == null ? 0 : filterObject.hashCode()) * 31);
            }

            public final String toString() {
                return "Standard(initialFilter=" + this.initialFilter + ", initialSort=" + this.initialSort + ")";
            }
        }
    }

    @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$State;", "", "isLoading", "", "channels", "", "Lio/getstream/chat/android/models/Channel;", "<init>", "(ZLjava/util/List;)V", "()Z", "getChannels", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class State {
        private final List<Channel> channels;
        private final boolean isLoading;

        public State(boolean z4, List<Channel> channels) {
            AbstractC22676k.m65750j(channels, "channels");
            this.isLoading = z4;
            this.channels = channels;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, boolean z4, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = state.isLoading;
            }
            if ((i13 & 2) != 0) {
                list = state.channels;
            }
            return state.copy(z4, list);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final List<Channel> component2() {
            return this.channels;
        }

        public final State copy(boolean isLoading, List<Channel> channels) {
            AbstractC22676k.m65750j(channels, "channels");
            return new State(isLoading, channels);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.isLoading == state.isLoading && AbstractC22676k.m65745e(this.channels, state.channels);
        }

        public final List<Channel> getChannels() {
            return this.channels;
        }

        public final int hashCode() {
            return this.channels.hashCode() + (Boolean.hashCode(this.isLoading) * 31);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String toString() {
            return "State(isLoading=" + this.isLoading + ", channels=" + this.channels + ")";
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$init$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$init$1", m100430f = "ChannelListViewModel.kt", m100431l = {300}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199111 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ InterfaceC3061u $queryJob;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$init$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$init$1$1", m100430f = "ChannelListViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lio/getstream/chat/android/client/api/state/QueryChannelsState;", "queryChannelsState", "Ll83/a0;", "<anonymous>", "(Lio/getstream/chat/android/client/api/state/QueryChannelsState;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements InterfaceC4351m {
            final /* synthetic */ InterfaceC2994c0 $$this$launch;
            final /* synthetic */ InterfaceC3061u $queryJob;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ChannelListViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC2994c0 interfaceC2994c0, ChannelListViewModel channelListViewModel, InterfaceC3061u interfaceC3061u, InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.$$this$launch = interfaceC2994c0;
                this.this$0 = channelListViewModel;
                this.$queryJob = interfaceC3061u;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$0(ChannelListViewModel channelListViewModel, ChannelsStateData channelsStateData) {
                channelListViewModel.stateMerger.setValue(channelListViewModel.handleChannelStateNews(channelsStateData, (List) channelListViewModel.channelMutes.getValue()));
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$1(ChannelListViewModel channelListViewModel, List list) {
                List<Channel> channels;
                State state = (State) channelListViewModel.stateMerger.getValue();
                if (state == null || (channels = state.getChannels()) == null || !(!channels.isEmpty())) {
                    channelListViewModel.stateMerger.setValue(state != null ? State.copy$default(state, false, null, 3, null) : null);
                } else {
                    channelListViewModel.stateMerger.setValue(State.copy$default(state, false, channelListViewModel.parseMutedChannels(state.getChannels(), list), 1, null));
                }
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$3(ChannelListViewModel channelListViewModel, boolean z4) {
                channelListViewModel.setPaginationState(new C19916d(z4, 0));
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PaginationState invokeSuspend$lambda$3$lambda$2(boolean z4, PaginationState paginationState) {
                return PaginationState.copy$default(paginationState, z4, false, 2, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final C23454a0 invokeSuspend$lambda$5(ChannelListViewModel channelListViewModel, boolean z4) {
                channelListViewModel.setPaginationState(new C19916d(z4, 1));
                return C23454a0.f92919a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final PaginationState invokeSuspend$lambda$5$lambda$4(boolean z4, PaginationState paginationState) {
                return PaginationState.copy$default(paginationState, false, z4, 1, null);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$launch, this.this$0, this.$queryJob, interfaceC30057d);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(QueryChannelsState queryChannelsState, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(queryChannelsState, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                anonymousClass1.invokeSuspend(c23454a0);
                return c23454a0;
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                QueryChannelsState queryChannelsState = (QueryChannelsState) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                boolean zM8729w = AbstractC3006f0.m8729w(this.$$this$launch);
                C23454a0 c23454a0 = C23454a0.f92919a;
                if (!zM8729w) {
                    return c23454a0;
                }
                LiveDataKt.addFlow(this.this$0.stateMerger, this.$queryJob, queryChannelsState.getChannelsStateData(), new ChannelListViewModel$sam$androidx_lifecycle_Observer$0(new C19915c(this.this$0, 0)));
                LiveDataKt.addFlow(this.this$0.stateMerger, this.$queryJob, this.this$0.channelMutes, new ChannelListViewModel$sam$androidx_lifecycle_Observer$0(new C19915c(this.this$0, 1)));
                LiveDataKt.addFlow(this.this$0.paginationStateMerger, this.$queryJob, queryChannelsState.getLoadingMore(), new ChannelListViewModel$sam$androidx_lifecycle_Observer$0(new C19915c(this.this$0, 2)));
                LiveDataKt.addFlow(this.this$0.paginationStateMerger, this.$queryJob, queryChannelsState.getEndOfChannels(), new ChannelListViewModel$sam$androidx_lifecycle_Observer$0(new C19915c(this.this$0, 3)));
                return c23454a0;
            }

            @Override // c93.InterfaceC4351m
            public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((QueryChannelsState) obj, (InterfaceC30057d<? super C23454a0>) obj2);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C199111(InterfaceC3061u interfaceC3061u, InterfaceC30057d<? super C199111> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$queryJob = interfaceC3061u;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C199111 c199111 = ChannelListViewModel.this.new C199111(this.$queryJob, interfaceC30057d);
            c199111.L$0 = obj;
            return c199111;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C199111) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C4588i c4588i = new C4588i(ChannelListViewModel.this.queryChannelsState, 2);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC2994c0, ChannelListViewModel.this, this.$queryJob, null);
                this.L$0 = null;
                this.label = 1;
                if (AbstractC13091v.m36604n(c4588i, anonymousClass1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$requestMoreChannels$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$requestMoreChannels$1", m100430f = "ChannelListViewModel.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C199121 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ QueryChannelsRequest $nextPageRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C199121(QueryChannelsRequest queryChannelsRequest, InterfaceC30057d<? super C199121> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$nextPageRequest = queryChannelsRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C23454a0 invokeSuspend$lambda$1(ChannelListViewModel channelListViewModel, AbstractC26202e abstractC26202e) {
            C2345k logger = channelListViewModel.getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            EnumC2341g enumC2341g = EnumC2341g.ERROR;
            String str = logger.f9273a;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "Could not load more channels. Error: " + abstractC26202e.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(abstractC26202e), null);
            }
            return C23454a0.f92919a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return ChannelListViewModel.this.new C199121(this.$nextPageRequest, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C199121 c199121 = (C199121) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c199121.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AbstractC27476f.m82906d(ChannelListViewModel.this.chatClient.queryChannels(this.$nextPageRequest), new C19915c(ChannelListViewModel.this, 4));
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    public ChannelListViewModel(QueryMode mode, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, ChatClient chatClient, InterfaceC13058l globalState) {
        FilterObject initialFilter;
        AbstractC22676k.m65750j(mode, "mode");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(globalState, "globalState");
        this.mode = mode;
        this.limit = i13;
        this.messageLimit = num;
        this.memberLimit = num2;
        this.isDraftMessagesEnabled = z4;
        this.chatEventHandlerFactory = chatEventHandlerFactory;
        this.chatClient = chatClient;
        this.globalState = globalState;
        C1627t0 c1627t0 = new C1627t0();
        this.stateMerger = c1627t0;
        this.state = AbstractC1640x1.m5042a(c1627t0);
        C14380k c14380kM36590P = AbstractC13091v.m36590P(globalState, new ChannelListViewModel$special$$inlined$flatMapLatest$1(3, null));
        C26444a c26444aM5043b = AbstractC1640x1.m5043b(this);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C25272z c25272z = C25272z.f99163w;
        this.typingEvents = AbstractC1613o1.m5012b(AbstractC13091v.m36587M(c14380kM36590P, c26444aM5043b, c13021b2, c25272z), null, 3);
        this.draftMessages = z4 ? AbstractC1613o1.m5012b(AbstractC13091v.m36587M(AbstractC13091v.m36590P(globalState, new ChannelListViewModel$special$$inlined$flatMapLatest$2(3, null)), AbstractC1640x1.m5043b(this), c13021b2, c25272z), null, 3) : new C1630u0(c25272z);
        this.channelMutes = AbstractC13091v.m36587M(AbstractC13091v.m36590P(globalState, new ChannelListViewModel$special$$inlined$flatMapLatest$3(3, null)), AbstractC1640x1.m5043b(this), c13021b2, C25271y.f99162w);
        C1627t0 c1627t1 = new C1627t0();
        this.paginationStateMerger = c1627t1;
        this.paginationState = AbstractC1640x1.m5042a(c1627t1);
        C1630u0 c1630u0 = new C1630u0();
        this._errorEvents = c1630u0;
        this.errorEvents = c1630u0;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:ChannelList-VM");
        boolean z13 = mode instanceof QueryMode.Standard;
        if (z13) {
            initialFilter = ((QueryMode.Standard) mode).getInitialFilter();
        } else {
            if (!(mode instanceof QueryMode.Predefined)) {
                throw new NoWhenBranchMatchedException();
            }
            initialFilter = null;
        }
        C1630u0 c1630u1 = new C1630u0(initialFilter);
        this.filterLiveData = c1630u1;
        this.queryChannelsState = AbstractC13091v.m36593c(null);
        if (z13) {
            if (((QueryMode.Standard) mode).getInitialFilter() == null) {
                AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C199091(null), 3);
            }
            c1627t0.m5035b(c1630u1, new ChannelListViewModel$sam$androidx_lifecycle_Observer$0(new C19915c(this, 5)));
        } else {
            if (!(mode instanceof QueryMode.Predefined)) {
                throw new NoWhenBranchMatchedException();
            }
            initData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 _init_$lambda$3(ChannelListViewModel channelListViewModel, FilterObject filterObject) {
        if (filterObject != null) {
            channelListViewModel.initData();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC13058l buildDefaultFilter() {
        final InterfaceC13037f2 user = this.chatClient.getClientState().getUser();
        final Filters filters = Filters.INSTANCE;
        return new C4588i(new InterfaceC13058l() { // from class: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$buildDefaultFilter$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$buildDefaultFilter$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C199102<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;
                final /* synthetic */ Filters receiver$inlined;

                /* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$buildDefaultFilter$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel$buildDefaultFilter$$inlined$map$1$2", m100430f = "ChannelListViewModel.kt", m100431l = {50}, m100432m = "emit")
                @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
                public static final class AnonymousClass1 extends AbstractC32269c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                        super(interfaceC30057d);
                    }

                    @Override // s83.AbstractC32267a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C199102.this.emit(null, this);
                    }
                }

                public C199102(InterfaceC13062m interfaceC13062m, Filters filters) {
                    this.$this_unsafeFlow = interfaceC13062m;
                    this.receiver$inlined = filters;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // ec3.InterfaceC13062m
                public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC30057d instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                        int i13 = anonymousClass1.label;
                        if ((i13 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i13 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i14 = anonymousClass1.label;
                    if (i14 == 0) {
                        AbstractC34132o.m107864I(obj2);
                        InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                        FilterObject filterObjectDefaultChannelListFilter = FiltersKt.defaultChannelListFilter(this.receiver$inlined, (User) obj);
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(filterObjectDefaultChannelListFilter, anonymousClass1) == enumC31071a) {
                            return enumC31071a;
                        }
                    } else {
                        if (i14 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj2);
                    }
                    return C23454a0.f92919a;
                }
            }

            @Override // ec3.InterfaceC13058l
            public final Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                Object objCollect = user.collect(new C199102(interfaceC13062m, filters), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, 2);
    }

    private final QueryChannelsRequest buildQueryChannelsRequest() {
        QueryMode queryMode = this.mode;
        if (!(queryMode instanceof QueryMode.Standard)) {
            if (!(queryMode instanceof QueryMode.Predefined)) {
                throw new NoWhenBranchMatchedException();
            }
            return new QueryChannelsRequest(((QueryMode.Predefined) queryMode).getName(), this.limit, ((QueryMode.Predefined) this.mode).getFilterValues(), ((QueryMode.Predefined) this.mode).getSortValues(), 0, this.messageLimit, this.memberLimit, 16, (DefaultConstructorMarker) null);
        }
        FilterObject filterObject = (FilterObject) this.filterLiveData.getValue();
        if (filterObject == null) {
            return null;
        }
        return new QueryChannelsRequest(filterObject, 0, this.limit, ((QueryMode.Standard) this.mode).getInitialSort(), this.messageLimit, this.memberLimit, null, null, null, 450, null);
    }

    private final <K, V> Map<K, V> clone(Map<K, ? extends V> map, K k5, V v13) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(k5, v13);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deleteChannel$lambda$11(ChannelListViewModel channelListViewModel, Channel channel, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = channelListViewModel.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String id4 = channel.getId();
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not delete channel with id: ", id4, ". Error: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        channelListViewModel._errorEvents.postValue(new Event(new ErrorEvent.DeleteChannelError(error)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State handleChannelStateNews(ChannelsStateData channelState, List<ChannelMute> channelMutes) {
        boolean z4 = channelState instanceof ChannelsStateData.NoQueryActive;
        C25271y c25271y = C25271y.f99162w;
        if (z4 || (channelState instanceof ChannelsStateData.Loading)) {
            return new State(true, c25271y);
        }
        if (channelState instanceof ChannelsStateData.OfflineNoResults) {
            return new State(false, c25271y);
        }
        if (channelState instanceof ChannelsStateData.Result) {
            return new State(false, parseMutedChannels(((ChannelsStateData.Result) channelState).getChannels(), channelMutes));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void init() {
        QueryChannelsRequest queryChannelsRequestBuildQueryChannelsRequest = buildQueryChannelsRequest();
        if (queryChannelsRequestBuildQueryChannelsRequest == null) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[init] rejected (filter not yet initialized)", null);
                return;
            }
            return;
        }
        this.queryChannelsState = ChatClientExtensions.queryChannelsAsState(this.chatClient, queryChannelsRequestBuildQueryChannelsRequest, this.chatEventHandlerFactory, AbstractC1640x1.m5043b(this));
        InterfaceC3027k1 interfaceC3027k1 = this.queryJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
        C3031l1 c3031l1 = new C3031l1(AbstractC3006f0.m8725s(AbstractC1640x1.m5043b(this).f105042w));
        this.queryJob = c3031l1;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), c3031l1, null, new C199111(c3031l1, null), 2);
    }

    private final void initData() {
        this.stateMerger.setValue(INITIAL_STATE);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 leaveChannel$lambda$9$lambda$8(ChannelListViewModel channelListViewModel, Channel channel, AbstractC26202e error) {
        AbstractC22676k.m65750j(error, "error");
        C2345k logger = channelListViewModel.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            String id4 = channel.getId();
            String strMo77807a = error.mo77807a();
            Throwable thExtractCause = ChatErrorKt.extractCause(error);
            StringBuilder sbM32001t = AbstractC11895b.m32001t("Could not leave channel with id: ", id4, ". Error: ", strMo77807a, ". Cause: ");
            sbM32001t.append(thExtractCause);
            interfaceC2344j.log(enumC2341g, str, sbM32001t.toString(), null);
        }
        channelListViewModel._errorEvents.postValue(new Event(new ErrorEvent.LeaveChannelError(error)));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 markAllRead$lambda$13(ChannelListViewModel channelListViewModel, AbstractC26202e streamError) {
        AbstractC22676k.m65750j(streamError, "streamError");
        C2345k logger = channelListViewModel.getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "Could not mark all messages as read. Error: " + streamError.mo77807a() + ". Cause: " + ChatErrorKt.extractCause(streamError), null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Channel> parseMutedChannels(List<Channel> channels, List<ChannelMute> channelMutes) {
        List<ChannelMute> list = channelMutes;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Channel channel = ((ChannelMute) it.next()).getChannel();
            String id4 = channel != null ? channel.getId() : null;
            if (id4 == null) {
                id4 = "";
            }
            arrayList.add(id4);
        }
        Set setM74103I1 = AbstractC25265s.m74103I1(arrayList);
        List<Channel> list2 = channels;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (Channel channelCopy$default : list2) {
            if (ChannelKt.isMuted(channelCopy$default) != setM74103I1.contains(channelCopy$default.getId())) {
                channelCopy$default = Channel.copy$default(channelCopy$default, null, null, null, null, 0, false, null, null, null, null, 0, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, clone(channelCopy$default.getExtraData(), ChannelKt.EXTRA_DATA_MUTED, Boolean.valueOf(!ChannelKt.isMuted(channelCopy$default))), -1, 3, null);
            }
            arrayList2.add(channelCopy$default);
        }
        return arrayList2;
    }

    private final void requestMoreChannels() {
        QueryChannelsState queryChannelsState;
        QueryChannelsRequest queryChannelsRequest;
        if (((this.mode instanceof QueryMode.Standard) && this.filterLiveData.getValue() == null) || (queryChannelsState = (QueryChannelsState) this.queryChannelsState.getValue()) == null || (queryChannelsRequest = (QueryChannelsRequest) queryChannelsState.getNextPageRequest().getValue()) == null) {
            return;
        }
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new C199121(queryChannelsRequest, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPaginationState(Function1 reducer) {
        C1627t0 c1627t0 = this.paginationStateMerger;
        PaginationState paginationState = (PaginationState) c1627t0.getValue();
        if (paginationState == null) {
            boolean z4 = false;
            paginationState = new PaginationState(z4, z4, 3, null);
        }
        c1627t0.setValue(reducer.invoke(paginationState));
    }

    public final void deleteChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        AbstractC27476f.m82906d(this.chatClient.channel(channel.getCid()).delete(), new C19914b(this, channel, 0));
    }

    public final AbstractC1615p0 getDraftMessages() {
        return this.draftMessages;
    }

    public final AbstractC1615p0 getErrorEvents() {
        return this.errorEvents;
    }

    public final AbstractC1615p0 getPaginationState() {
        return this.paginationState;
    }

    public final AbstractC1615p0 getState() {
        return this.state;
    }

    public final AbstractC1615p0 getTypingEvents() {
        return this.typingEvents;
    }

    public final void leaveChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        User user = (User) ((C13045h2) this.chatClient.getClientState().getUser()).getValue();
        if (user != null) {
            AbstractC27476f.m82906d(ChannelClient.removeMembers$default(this.chatClient.channel(channel.getType(), channel.getId()), AbstractC37056f.m118958J(user.getId()), null, null, 6, null), new C19914b(this, channel, 1));
        }
    }

    public final void markAllRead() {
        AbstractC27476f.m82906d(this.chatClient.markAllRead(), new C19915c(this, 6));
    }

    public final void onAction(Action action) {
        AbstractC22676k.m65750j(action, "action");
        if (!(action instanceof Action.ReachedEndOfList)) {
            throw new NoWhenBranchMatchedException();
        }
        requestMoreChannels();
    }

    public final void setFilters(FilterObject filterObject) {
        AbstractC22676k.m65750j(filterObject, "filterObject");
        if (this.mode instanceof QueryMode.Predefined) {
            C2345k logger = getLogger();
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, AbstractC11895b.m31996o("[setFilters] ignored — view model uses predefined filter '", ((QueryMode.Predefined) this.mode).getName(), "'"), null);
                return;
            }
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
        String str2 = logger2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            logger2.f9274b.log(enumC2341g2, str2, "[setFilters] filterObject: " + filterObject, null);
        }
        this.filterLiveData.setValue(filterObject);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ChannelListViewModel(FilterObject filterObject, QuerySorter querySorter, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, ChatClient chatClient, InterfaceC13058l interfaceC13058l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        ClientState clientState = null;
        Object[] objArr = 0;
        filterObject = (i14 & 1) != 0 ? null : filterObject;
        querySorter = (i14 & 2) != 0 ? DEFAULT_SORT : querySorter;
        i13 = (i14 & 4) != 0 ? 30 : i13;
        num = (i14 & 8) != 0 ? null : num;
        num2 = (i14 & 16) != 0 ? null : num2;
        chatEventHandlerFactory = (i14 & 64) != 0 ? new ChatEventHandlerFactory(clientState, 1, objArr == true ? 1 : 0) : chatEventHandlerFactory;
        chatClient = (i14 & 128) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(filterObject, querySorter, i13, num, num2, z4, chatEventHandlerFactory, chatClient, (i14 & 256) != 0 ? ChatClientExtensions.getGlobalStateFlow(chatClient) : interfaceC13058l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModel(FilterObject filterObject, QuerySorter<Channel> sort, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, ChatClient chatClient, InterfaceC13058l globalState) {
        this(new QueryMode.Standard(filterObject, sort), i13, num, num2, z4, chatEventHandlerFactory, chatClient, globalState);
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(globalState, "globalState");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ChannelListViewModel(String str, Map map, Map map2, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, ChatClient chatClient, InterfaceC13058l interfaceC13058l, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        ClientState clientState = null;
        Object[] objArr = 0;
        map = (i14 & 2) != 0 ? null : map;
        map2 = (i14 & 4) != 0 ? null : map2;
        i13 = (i14 & 8) != 0 ? 30 : i13;
        num = (i14 & 16) != 0 ? null : num;
        num2 = (i14 & 32) != 0 ? null : num2;
        chatEventHandlerFactory = (i14 & 128) != 0 ? new ChatEventHandlerFactory(clientState, 1, objArr == true ? 1 : 0) : chatEventHandlerFactory;
        chatClient = (i14 & 256) != 0 ? ChatClient.INSTANCE.instance() : chatClient;
        this(str, map, map2, i13, num, num2, z4, chatEventHandlerFactory, chatClient, (i14 & 512) != 0 ? ChatClientExtensions.getGlobalStateFlow(chatClient) : interfaceC13058l);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModel(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, ChatClient chatClient, InterfaceC13058l globalState) {
        this(new QueryMode.Predefined(predefinedFilterName, map, map2), i13, num, num2, z4, chatEventHandlerFactory, chatClient, globalState);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(globalState, "globalState");
    }
}
