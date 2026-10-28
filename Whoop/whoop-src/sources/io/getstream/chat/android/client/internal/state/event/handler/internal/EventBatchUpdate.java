package io.getstream.chat.android.client.internal.state.event.handler.internal;

import androidx.profileinstaller.ProfileVerifier;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import io.getstream.chat.android.client.api.state.C19031a;
import io.getstream.chat.android.client.api.state.GlobalState;
import io.getstream.chat.android.client.extensions.internal.ChannelKt;
import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.client.persistance.repository.RepositoryFacade;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.Thread;
import io.getstream.chat.android.models.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23462h;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import xb3.AbstractC38176k;
import xb3.C38170e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JIBy\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\n\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00010\r2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00010\u000f2\u0006\u0010(\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\r¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u00020\u00192\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00110-¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0011¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0004\u0018\u0001052\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b6\u00107J\u0015\u00109\u001a\u00020\u00192\u0006\u00108\u001a\u000205¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00192\u0006\u00108\u001a\u000205¢\u0006\u0004\b;\u0010:J\u0010\u0010<\u001a\u00020\u0019H\u0086@¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010>R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010BR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010BR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010BR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010BR\u001b\u0010H\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006K"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;", "", "", "id", "", "currentUserId", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "", "Lio/getstream/chat/android/models/Channel;", "channelMap", "Lio/getstream/chat/android/models/Message;", "messageMap", "Lio/getstream/chat/android/models/Thread;", "threadMap", "Lio/getstream/chat/android/models/User;", "userMap", "<init>", "(ILjava/lang/String;Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "Ljava/util/Date;", "receivedEventDate", "cid", "message", "Ll83/a0;", "addMessageData", "(Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)V", "channel", "addChannel", "(Lio/getstream/chat/android/models/Channel;)V", "thread", "addThread", "(Lio/getstream/chat/android/models/Thread;)V", "cId", "getCurrentChannel", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;", "messageId", "getCurrentMessage", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;", "threadId", "getCurrentThread", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Thread;", "addMessage", "(Lio/getstream/chat/android/models/Message;)V", "", "newUsers", "addUsers", "(Ljava/util/List;)V", "newUser", "addUser", "(Lio/getstream/chat/android/models/User;)V", "pollId", "Lio/getstream/chat/android/models/Poll;", "getPoll", "(Ljava/lang/String;)Lio/getstream/chat/android/models/Poll;", "poll", "addPoll", "(Lio/getstream/chat/android/models/Poll;)V", "deletePoll", "execute", "(Lq83/d;)Ljava/lang/Object;", "I", "Ljava/lang/String;", "Lio/getstream/chat/android/client/api/state/GlobalState;", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "Ljava/util/Map;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Companion", "Builder", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class EventBatchUpdate {
    private static final Companion Companion = new Companion();
    private static final String TAG = "Chat:EventBatchUpdate";
    private final Map<String, Channel> channelMap;
    private final String currentUserId;
    private final GlobalState globalState;
    private final int id;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Map<String, Message> messageMap;
    private final RepositoryFacade repos;
    private final Map<String, Thread> threadMap;
    private final Map<String, User> userMap;

    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u0010\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0006¢\u0006\u0004\b\u0013\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Builder;", "", "", "id", "<init>", "(I)V", "", "", "cIds", "Ll83/a0;", "addToFetchChannels", "(Ljava/util/List;)V", "addToRemoveChannels", "cId", "(Ljava/lang/String;)V", "ids", "addToFetchMessages", "Lio/getstream/chat/android/models/User;", "usersToAdd", "addUsers", "pollId", "addPollToFetch", "threadId", "addThreadToFetch", "Lio/getstream/chat/android/client/api/state/GlobalState;", "globalState", "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;", "repos", "currentUserId", "Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate;", "build", "(Lio/getstream/chat/android/client/api/state/GlobalState;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "I", "", "channelsToFetch", "Ljava/util/Set;", "channelsToRemove", "messagesToFetch", "users", "pollsToFetch", "threadsToFetch", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Builder {
        private final int id;
        private final Set<String> channelsToFetch = new LinkedHashSet();
        private final Set<String> channelsToRemove = new LinkedHashSet();
        private final Set<String> messagesToFetch = new LinkedHashSet();
        private final Set<User> users = new LinkedHashSet();
        private final Set<String> pollsToFetch = new LinkedHashSet();
        private final Set<String> threadsToFetch = new LinkedHashSet();

        public Builder(int i13) {
            this.id = i13;
        }

        public final void addPollToFetch(String pollId) {
            AbstractC22676k.m65750j(pollId, "pollId");
            this.pollsToFetch.add(pollId);
        }

        public final void addThreadToFetch(String threadId) {
            AbstractC22676k.m65750j(threadId, "threadId");
            this.threadsToFetch.add(threadId);
        }

        public final void addToFetchChannels(List<String> cIds) {
            AbstractC22676k.m65750j(cIds, "cIds");
            AbstractC25265s.m74141p0(this.channelsToFetch, cIds);
        }

        public final void addToFetchMessages(List<String> ids) {
            AbstractC22676k.m65750j(ids, "ids");
            AbstractC25265s.m74141p0(this.messagesToFetch, ids);
        }

        public final void addToRemoveChannels(List<String> cIds) {
            AbstractC22676k.m65750j(cIds, "cIds");
            AbstractC25265s.m74141p0(this.channelsToRemove, cIds);
        }

        public final void addUsers(List<User> usersToAdd) {
            AbstractC22676k.m65750j(usersToAdd, "usersToAdd");
            AbstractC25265s.m74141p0(this.users, usersToAdd);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:28:0x0137  */
        /* JADX WARN: Code duplicated, block: B:35:0x016f  */
        /* JADX WARN: Code duplicated, block: B:39:0x01a1  */
        /* JADX WARN: Code duplicated, block: B:41:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:45:0x01c3 A[LOOP:3: B:43:0x01bd->B:45:0x01c3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:49:0x01f8  */
        /* JADX WARN: Code duplicated, block: B:52:0x0207  */
        /* JADX WARN: Code duplicated, block: B:56:0x0217 A[LOOP:2: B:54:0x0211->B:56:0x0217, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:60:0x0242  */
        /* JADX WARN: Code duplicated, block: B:63:0x0253  */
        /* JADX WARN: Code duplicated, block: B:67:0x0263 A[LOOP:0: B:65:0x025d->B:67:0x0263, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:70:0x0280  */
        /* JADX WARN: Code duplicated, block: B:73:0x02c1  */
        /* JADX WARN: Code duplicated, block: B:74:0x02c3  */
        /* JADX WARN: Code duplicated, block: B:78:0x02d3 A[LOOP:1: B:76:0x02cd->B:78:0x02d3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code duplicated, block: B:86:0x0241 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:? A[LOOP:4: B:20:0x00f1->B:88:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0150, code lost:
        
            if (r1 == r3) goto L59;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0196, code lost:
        
            if (r1 == r3) goto L59;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0196 -> B:38:0x019a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object build(io.getstream.chat.android.client.api.state.GlobalState r20, io.getstream.chat.android.client.persistance.repository.RepositoryFacade r21, java.lang.String r22, q83.InterfaceC30057d<? super io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate> r23) {
            /*
                Method dump skipped, instruction units count: 770
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate.Builder.build(io.getstream.chat.android.client.api.state.GlobalState, io.getstream.chat.android.client.persistance.repository.RepositoryFacade, java.lang.String, q83.d):java.lang.Object");
        }

        public final void addToFetchChannels(String cId) {
            AbstractC22676k.m65750j(cId, "cId");
            this.channelsToFetch.add(cId);
        }

        public final void addToFetchMessages(String id4) {
            AbstractC22676k.m65750j(id4, "id");
            this.messagesToFetch.add(id4);
        }
    }

    @Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/event/handler/internal/EventBatchUpdate$Companion;", "", "<init>", "()V", "TAG", "", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate$execute$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate", m100430f = "EventBatchUpdate.kt", m100431l = {143, 144, 145, 146}, m100432m = "execute")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192591 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C192591(InterfaceC30057d<? super C192591> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EventBatchUpdate.this.execute(this);
        }
    }

    public /* synthetic */ EventBatchUpdate(int i13, String str, GlobalState globalState, RepositoryFacade repositoryFacade, Map map, Map map2, Map map3, Map map4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, globalState, repositoryFacade, map, map2, map3, map4);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Poll getPoll$lambda$2(Message it) {
        AbstractC22676k.m65750j(it, "it");
        return it.getPoll();
    }

    public final void addChannel(Channel channel) {
        AbstractC22676k.m65750j(channel, "channel");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            int i13 = this.id;
            Date lastMessageAt = channel.getLastMessageAt();
            Message messageLatestOrNull = MessageUtils.latestOrNull(channel.getMessages());
            interfaceC2344j.log(enumC2341g, str, "[addChannel] id: " + i13 + ", channel.lastMessageAt: " + lastMessageAt + ", channel.latestMessageId: " + (messageLatestOrNull != null ? messageLatestOrNull.getId() : null), null);
        }
        addUsers(ChannelKt.users(channel));
        this.channelMap.put(channel.getCid(), channel);
    }

    public final void addMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        addUsers(MessageKt.users(message));
        this.messageMap.put(message.getId(), message);
    }

    public final void addMessageData(Date receivedEventDate, String cid, Message message) {
        Channel channelUpdateLastMessage;
        AbstractC22676k.m65750j(receivedEventDate, "receivedEventDate");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(message, "message");
        addMessage(message);
        Channel currentChannel = getCurrentChannel(cid);
        if (currentChannel == null || (channelUpdateLastMessage = ChannelKt.updateLastMessage(currentChannel, receivedEventDate, message, this.currentUserId)) == null) {
            return;
        }
        addChannel(channelUpdateLastMessage);
    }

    public final void addPoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        Collection<Message> collectionValues = this.messageMap.values();
        ArrayList<Message> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            Poll poll2 = ((Message) obj).getPoll();
            if (AbstractC22676k.m65745e(poll2 != null ? poll2.getId() : null, poll.getId())) {
                arrayList.add(obj);
            }
        }
        for (Message message : arrayList) {
            addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
    }

    public final void addThread(Thread thread) {
        AbstractC22676k.m65750j(thread, "thread");
        this.threadMap.put(thread.getParentMessageId(), thread);
    }

    public final void addUser(User newUser) {
        AbstractC22676k.m65750j(newUser, "newUser");
        this.userMap.put(newUser.getId(), newUser);
    }

    public final void addUsers(List<User> newUsers) {
        AbstractC22676k.m65750j(newUsers, "newUsers");
        for (User user : newUsers) {
            if (!this.userMap.containsKey(user.getId())) {
                this.userMap.put(user.getId(), user);
            }
        }
    }

    public final void deletePoll(Poll poll) {
        AbstractC22676k.m65750j(poll, "poll");
        Collection<Message> collectionValues = this.messageMap.values();
        ArrayList<Message> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            Poll poll2 = ((Message) obj).getPoll();
            if (AbstractC22676k.m65745e(poll2 != null ? poll2.getId() : null, poll.getId())) {
                arrayList.add(obj);
            }
        }
        for (Message message : arrayList) {
            addMessage(message.copy(((-1) & 1) != 0 ? message.id : null, ((-1) & 2) != 0 ? message.cid : null, ((-1) & 4) != 0 ? message.text : null, ((-1) & 8) != 0 ? message.html : null, ((-1) & 16) != 0 ? message.parentId : null, ((-1) & 32) != 0 ? message.command : null, ((-1) & 64) != 0 ? message.attachments : null, ((-1) & 128) != 0 ? message.mentionedUsersIds : null, ((-1) & 256) != 0 ? message.mentionedUsers : null, ((-1) & 512) != 0 ? message.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.reactionCounts : null, ((-1) & 4096) != 0 ? message.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.syncStatus : null, ((-1) & 32768) != 0 ? message.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? message.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? message.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? message.createdAt : null, ((-1) & 524288) != 0 ? message.updatedAt : null, ((-1) & 1048576) != 0 ? message.deletedAt : null, ((-1) & 2097152) != 0 ? message.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? message.createdLocallyAt : null, ((-1) & 8388608) != 0 ? message.user : null, ((-1) & 16777216) != 0 ? message.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? message.silent : false, ((-1) & 67108864) != 0 ? message.shadowed : false, ((-1) & 134217728) != 0 ? message.i18n : null, ((-1) & 268435456) != 0 ? message.showInChannel : false, ((-1) & 536870912) != 0 ? message.channelInfo : null, ((-1) & 1073741824) != 0 ? message.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? message.replyMessageId : null, (65535 & 1) != 0 ? message.pinned : false, (65535 & 2) != 0 ? message.pinnedAt : null, (65535 & 4) != 0 ? message.pinExpires : null, (65535 & 8) != 0 ? message.pinnedBy : null, (65535 & 16) != 0 ? message.threadParticipants : null, (65535 & 32) != 0 ? message.skipPushNotification : false, (65535 & 64) != 0 ? message.skipEnrichUrl : false, (65535 & 128) != 0 ? message.moderationDetails : null, (65535 & 256) != 0 ? message.moderation : null, (65535 & 512) != 0 ? message.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? message.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? message.restrictedVisibility : null, (65535 & 4096) != 0 ? message.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? message.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? message.channelRole : null, (65535 & 32768) != 0 ? message.deletedForMe : false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        if (r13.insertThreads(r2, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object execute(q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.state.event.handler.internal.EventBatchUpdate.execute(q83.d):java.lang.Object");
    }

    public final Channel getCurrentChannel(String cId) {
        AbstractC22676k.m65750j(cId, "cId");
        return this.channelMap.get(cId);
    }

    public final Message getCurrentMessage(String messageId) {
        AbstractC22676k.m65750j(messageId, "messageId");
        return this.messageMap.get(messageId);
    }

    public final Thread getCurrentThread(String threadId) {
        AbstractC22676k.m65750j(threadId, "threadId");
        return this.threadMap.get(threadId);
    }

    public final Poll getPoll(String pollId) {
        Object next;
        AbstractC22676k.m65750j(pollId, "pollId");
        C38170e c38170e = new C38170e(AbstractC38176k.m122273B(AbstractC25265s.m74145r0(this.messageMap.values()), new C19031a(19)));
        while (c38170e.hasNext()) {
            next = c38170e.next();
            if (AbstractC22676k.m65745e(((Poll) next).getId(), pollId)) {
                return (Poll) next;
            }
        }
        next = null;
        return (Poll) next;
    }

    private EventBatchUpdate(int i13, String str, GlobalState globalState, RepositoryFacade repositoryFacade, Map<String, Channel> map, Map<String, Message> map2, Map<String, Thread> map3, Map<String, User> map4) {
        this.id = i13;
        this.currentUserId = str;
        this.globalState = globalState;
        this.repos = repositoryFacade;
        this.channelMap = map;
        this.messageMap = map2;
        this.threadMap = map3;
        this.userMap = map4;
        this.logger = AbstractC1772c1.m5382S(this, TAG);
    }
}
