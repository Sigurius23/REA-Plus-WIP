package io.getstream.chat.android.p226ui.viewmodel.channels;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import com.mapbox.maps.MapboxMap;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.api.event.ChatEventHandlerFactory;
import io.getstream.chat.android.client.api.state.ChatClientExtensions;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.FilterObject;
import io.getstream.chat.android.models.querysort.QuerySorter;
import io.getstream.chat.android.p226ui.ChatUI;
import j93.InterfaceC21461d;
import java.util.Map;
import p298l8.AbstractC23420c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001&B=\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB[\b\u0017\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0013Bw\b\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u001aJ'\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%¨\u0006'"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory;", "Landroidx/lifecycle/a2;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "mode", "", MapboxMap.QFE_LIMIT, "messageLimit", "memberLimit", "", "isDraftMessagesEnabled", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "<init>", "(Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V", "Lio/getstream/chat/android/models/FilterObject;", "filter", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "sort", "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V", "", "predefinedFilterName", "", "", "filterValues", "sortValues", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;ZLio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V", "Landroidx/lifecycle/w1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/w1;", "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModel$QueryMode;", "I", "Ljava/lang/Integer;", "Z", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "Builder", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelListViewModelFactory implements InterfaceC1563a2 {
    private final ChatEventHandlerFactory chatEventHandlerFactory;
    private final boolean isDraftMessagesEnabled;
    private final int limit;
    private final Integer memberLimit;
    private final Integer messageLimit;
    private final ChannelListViewModel.QueryMode mode;

    @Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010'R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010)R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010*R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010+¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "", "<init>", "()V", "Lio/getstream/chat/android/models/FilterObject;", "filter", "(Lio/getstream/chat/android/models/FilterObject;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "Lio/getstream/chat/android/models/Channel;", "sort", "(Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "", "name", "predefinedFilter", "(Ljava/lang/String;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "", "values", "filterValues", "(Ljava/util/Map;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "sortValues", "", MapboxMap.QFE_LIMIT, "(I)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "messageLimit", "(Ljava/lang/Integer;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "memberLimit", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "chatEventHandlerFactory", "(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "", "isDraftMessagesEnabled", "(Z)Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListViewModelFactory$Builder;", "Landroidx/lifecycle/a2;", "build", "()Landroidx/lifecycle/a2;", "Lio/getstream/chat/android/models/FilterObject;", "Lio/getstream/chat/android/models/querysort/QuerySorter;", "predefinedFilterName", "Ljava/lang/String;", "Ljava/util/Map;", "I", "Ljava/lang/Integer;", "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;", "Z", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private FilterObject filter;
        private Map<String, ? extends Object> filterValues;
        private Integer memberLimit;
        private Integer messageLimit;
        private String predefinedFilterName;
        private Map<String, ? extends Object> sortValues;
        private QuerySorter<Channel> sort = ChannelListViewModel.DEFAULT_SORT;
        private int limit = 30;
        private ChatEventHandlerFactory chatEventHandlerFactory = new ChatEventHandlerFactory(null, 1, null);
        private boolean isDraftMessagesEnabled = ChatUI.getDraftMessagesEnabled();

        public final InterfaceC1563a2 build() {
            String str = this.predefinedFilterName;
            if (str == null) {
                return new ChannelListViewModelFactory(this.filter, this.sort, this.limit, this.messageLimit, this.memberLimit, this.isDraftMessagesEnabled, this.chatEventHandlerFactory);
            }
            if (this.filter != null) {
                throw new IllegalStateException("ChannelListViewModelFactory.Builder: filter() and predefinedFilter() are mutually exclusive.");
            }
            return new ChannelListViewModelFactory(str, this.filterValues, this.sortValues, this.limit, this.messageLimit, this.memberLimit, this.isDraftMessagesEnabled, this.chatEventHandlerFactory);
        }

        public final Builder chatEventHandlerFactory(ChatEventHandlerFactory chatEventHandlerFactory) {
            AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
            this.chatEventHandlerFactory = chatEventHandlerFactory;
            return this;
        }

        public final Builder filter(FilterObject filter) {
            AbstractC22676k.m65750j(filter, "filter");
            this.filter = filter;
            return this;
        }

        public final Builder filterValues(Map<String, ? extends Object> values) {
            AbstractC22676k.m65750j(values, "values");
            this.filterValues = values;
            return this;
        }

        public final Builder isDraftMessagesEnabled(boolean isDraftMessagesEnabled) {
            this.isDraftMessagesEnabled = isDraftMessagesEnabled;
            return this;
        }

        public final Builder limit(int limit) {
            this.limit = limit;
            return this;
        }

        public final Builder memberLimit(Integer memberLimit) {
            this.memberLimit = memberLimit;
            return this;
        }

        public final Builder messageLimit(Integer messageLimit) {
            this.messageLimit = messageLimit;
            return this;
        }

        public final Builder predefinedFilter(String name) {
            AbstractC22676k.m65750j(name, "name");
            this.predefinedFilterName = name;
            return this;
        }

        public final Builder sort(QuerySorter<Channel> sort) {
            AbstractC22676k.m65750j(sort, "sort");
            this.sort = sort;
            return this;
        }

        public final Builder sortValues(Map<String, ? extends Object> values) {
            AbstractC22676k.m65750j(values, "values");
            this.sortValues = values;
            return this;
        }
    }

    public ChannelListViewModelFactory() {
        this(null, null, 0, null, null, false, null, 127, null);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(InterfaceC21461d interfaceC21461d, AbstractC23420c abstractC23420c) {
        return (T) super.create(interfaceC21461d, abstractC23420c);
    }

    public ChannelListViewModelFactory(FilterObject filterObject) {
        this(filterObject, null, 0, null, null, false, null, 126, null);
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> cls, AbstractC23420c abstractC23420c) {
        return (T) super.create(cls, abstractC23420c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort) {
        this(filterObject, sort, 0, null, null, false, null, 124, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final <T extends AbstractC1637w1> T create(Class<T> modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        if (modelClass.equals(ChannelListViewModel.class)) {
            ChannelListViewModel.QueryMode queryMode = this.mode;
            int i13 = this.limit;
            Integer num = this.messageLimit;
            Integer num2 = this.memberLimit;
            boolean z4 = this.isDraftMessagesEnabled;
            ChatEventHandlerFactory chatEventHandlerFactory = this.chatEventHandlerFactory;
            ChatClient.Companion companion = ChatClient.INSTANCE;
            return new ChannelListViewModel(queryMode, i13, num, num2, z4, chatEventHandlerFactory, companion.instance(), ChatClientExtensions.getGlobalStateFlow(companion.instance()));
        }
        throw new IllegalArgumentException("ChannelListViewModelFactory can only create instances of ChannelListViewModel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort, int i13) {
        this(filterObject, sort, i13, null, null, false, null, 120, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort, int i13, Integer num) {
        this(filterObject, sort, i13, num, null, false, null, 112, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort, int i13, Integer num, Integer num2) {
        this(filterObject, sort, i13, num, num2, false, null, 96, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort, int i13, Integer num, Integer num2, boolean z4) {
        this(filterObject, sort, i13, num, num2, z4, null, 64, null);
        AbstractC22676k.m65750j(sort, "sort");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName) {
        this(predefinedFilterName, null, null, 0, null, null, false, null, 254, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map) {
        this(predefinedFilterName, map, null, 0, null, null, false, null, 252, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this(predefinedFilterName, map, map2, 0, null, null, false, null, 248, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13) {
        this(predefinedFilterName, map, map2, i13, null, null, false, null, 240, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13, Integer num) {
        this(predefinedFilterName, map, map2, i13, num, null, false, null, 224, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13, Integer num, Integer num2) {
        this(predefinedFilterName, map, map2, i13, num, num2, false, null, 192, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13, Integer num, Integer num2, boolean z4) {
        this(predefinedFilterName, map, map2, i13, num, num2, z4, null, 128, null);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
    }

    private ChannelListViewModelFactory(ChannelListViewModel.QueryMode queryMode, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory) {
        this.mode = queryMode;
        this.limit = i13;
        this.messageLimit = num;
        this.memberLimit = num2;
        this.isDraftMessagesEnabled = z4;
        this.chatEventHandlerFactory = chatEventHandlerFactory;
    }

    public /* synthetic */ ChannelListViewModelFactory(FilterObject filterObject, QuerySorter querySorter, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : filterObject, (QuerySorter<Channel>) ((i14 & 2) != 0 ? ChannelListViewModel.DEFAULT_SORT : querySorter), (i14 & 4) != 0 ? 30 : i13, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? ChatUI.getDraftMessagesEnabled() : z4, (i14 & 64) != 0 ? new ChatEventHandlerFactory(null, 1, null) : chatEventHandlerFactory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(FilterObject filterObject, QuerySorter<Channel> sort, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory) {
        this(new ChannelListViewModel.QueryMode.Standard(filterObject, sort), i13, num, num2, z4, chatEventHandlerFactory);
        AbstractC22676k.m65750j(sort, "sort");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
    }

    public /* synthetic */ ChannelListViewModelFactory(String str, Map map, Map map2, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i14 & 2) != 0 ? null : map, (i14 & 4) != 0 ? null : map2, (i14 & 8) != 0 ? 30 : i13, (i14 & 16) != 0 ? null : num, (i14 & 32) != 0 ? null : num2, (i14 & 64) != 0 ? ChatUI.getDraftMessagesEnabled() : z4, (i14 & 128) != 0 ? new ChatEventHandlerFactory(null, 1, null) : chatEventHandlerFactory);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChannelListViewModelFactory(String predefinedFilterName, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, int i13, Integer num, Integer num2, boolean z4, ChatEventHandlerFactory chatEventHandlerFactory) {
        this(new ChannelListViewModel.QueryMode.Predefined(predefinedFilterName, map, map2), i13, num, num2, z4, chatEventHandlerFactory);
        AbstractC22676k.m65750j(predefinedFilterName, "predefinedFilterName");
        AbstractC22676k.m65750j(chatEventHandlerFactory, "chatEventHandlerFactory");
    }
}
