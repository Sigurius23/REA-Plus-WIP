package io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal;

import androidx.profileinstaller.ProfileVerifier;
import bc3.InterfaceC2994c0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import io.getstream.chat.android.client.api.state.ThreadState;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.Poll;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25271y;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\"\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\fJ\u0017\u0010\u0014\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0012J\u001b\u0010\u0018\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\"R*\u0010%\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0$\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010&R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R \u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R \u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010&R)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0$0,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00160,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b1\u00100R \u00102\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100R \u00104\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u00100R \u00106\u001a\b\u0012\u0004\u0012\u00020\b0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00100R\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u00100R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u00100R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0013\u0010B\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;", "Lio/getstream/chat/android/client/api/state/ThreadState;", "", "parentId", "Lbc3/c0;", "scope", "<init>", "(Ljava/lang/String;Lbc3/c0;)V", "", "isLoading", "Ll83/a0;", "setLoading", "(Z)V", "isEnd", "setEndOfOlderMessages", "Lio/getstream/chat/android/models/Message;", "message", "setOldestInThread", "(Lio/getstream/chat/android/models/Message;)V", "setEndOfNewerMessages", "setNewestInThread", "deleteMessage", "", "messages", "upsertMessages", "(Ljava/util/List;)V", "Lio/getstream/chat/android/models/Poll;", "poll", "updateParentMessagePoll", "(Lio/getstream/chat/android/models/Poll;)V", "destroy", "()V", "Ljava/lang/String;", "getParentId", "()Ljava/lang/String;", "Lec3/p1;", "", "_messages", "Lec3/p1;", "_loading", "_endOfOlderMessages", "_endOfNewerMessages", "_oldestInThread", "_newestInThread", "Lec3/f2;", "rawMessage", "Lec3/f2;", "getRawMessage", "()Lec3/f2;", "getMessages", "loading", "getLoading", "endOfOlderMessages", "getEndOfOlderMessages", "endOfNewerMessages", "getEndOfNewerMessages", "oldestInThread", "getOldestInThread", "newestInThread", "getNewestInThread", "", "getDeletedMessagesIds", "()Ljava/util/Set;", "deletedMessagesIds", "getParentMessage", "()Lio/getstream/chat/android/models/Message;", "parentMessage", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ThreadMutableState implements ThreadState {
    private InterfaceC13075p1 _endOfNewerMessages;
    private InterfaceC13075p1 _endOfOlderMessages;
    private InterfaceC13075p1 _loading;
    private InterfaceC13075p1 _messages;
    private InterfaceC13075p1 _newestInThread;
    private InterfaceC13075p1 _oldestInThread;
    private final InterfaceC13037f2 endOfNewerMessages;
    private final InterfaceC13037f2 endOfOlderMessages;
    private final InterfaceC13037f2 loading;
    private final InterfaceC13037f2 messages;
    private final InterfaceC13037f2 newestInThread;
    private final InterfaceC13037f2 oldestInThread;
    private final String parentId;
    private final InterfaceC13037f2 rawMessage;

    public ThreadMutableState(String parentId, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(parentId, "parentId");
        AbstractC22676k.m65750j(scope, "scope");
        this.parentId = parentId;
        this._messages = AbstractC13091v.m36593c(C25272z.f99163w);
        Boolean bool = Boolean.FALSE;
        this._loading = AbstractC13091v.m36593c(bool);
        this._endOfOlderMessages = AbstractC13091v.m36593c(bool);
        this._endOfNewerMessages = AbstractC13091v.m36593c(bool);
        this._oldestInThread = AbstractC13091v.m36593c(null);
        this._newestInThread = AbstractC13091v.m36593c(null);
        final InterfaceC13075p1 interfaceC13075p1 = this._messages;
        AbstractC22676k.m65747g(interfaceC13075p1);
        this.rawMessage = interfaceC13075p1;
        final InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$1

            /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$1$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C193402<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$1$2", m100430f = "ThreadMutableState.kt", m100431l = {50}, m100432m = "emit")
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
                        return C193402.this.emit(null, this);
                    }
                }

                public C193402(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
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
                        Collection collectionValues = ((Map) obj).values();
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(collectionValues, anonymousClass1) == enumC31071a) {
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
                Object objCollect = interfaceC13075p1.collect(new C193402(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        };
        this.messages = AbstractC13091v.m36587M(new InterfaceC13058l() { // from class: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$2

            /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$2$2 */
            @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
            public static final class C193412<T> implements InterfaceC13062m {
                final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.state.plugin.state.channel.thread.internal.ThreadMutableState$special$$inlined$map$2$2", m100430f = "ThreadMutableState.kt", m100431l = {50}, m100432m = "emit")
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
                        return C193412.this.emit(null, this);
                    }
                }

                public C193412(InterfaceC13062m interfaceC13062m) {
                    this.$this_unsafeFlow = interfaceC13062m;
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
                        List listM74152u1 = AbstractC25265s.m74152u1((Collection) obj, new ThreadMutableState$messages$lambda$4$$inlined$sortedBy$1());
                        anonymousClass1.L$0 = null;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        if (interfaceC13062m.emit(listM74152u1, anonymousClass1) == enumC31071a) {
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
                Object objCollect = interfaceC13058l.collect(new C193412(interfaceC13062m), interfaceC30057d);
                return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
            }
        }, scope, C13105z1.f45288a, C25271y.f99162w);
        InterfaceC13075p1 interfaceC13075p2 = this._loading;
        AbstractC22676k.m65747g(interfaceC13075p2);
        this.loading = interfaceC13075p2;
        InterfaceC13075p1 interfaceC13075p3 = this._endOfOlderMessages;
        AbstractC22676k.m65747g(interfaceC13075p3);
        this.endOfOlderMessages = interfaceC13075p3;
        InterfaceC13075p1 interfaceC13075p4 = this._endOfNewerMessages;
        AbstractC22676k.m65747g(interfaceC13075p4);
        this.endOfNewerMessages = interfaceC13075p4;
        InterfaceC13075p1 interfaceC13075p5 = this._oldestInThread;
        AbstractC22676k.m65747g(interfaceC13075p5);
        this.oldestInThread = interfaceC13075p5;
        InterfaceC13075p1 interfaceC13075p6 = this._newestInThread;
        AbstractC22676k.m65747g(interfaceC13075p6);
        this.newestInThread = interfaceC13075p6;
    }

    private final Set<String> getDeletedMessagesIds() {
        Map map;
        Collection<Message> collectionValues;
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 == null || (map = (Map) ((C13045h2) interfaceC13075p1).getValue()) == null || (collectionValues = map.values()) == null) {
            return C25235a0.f99113w;
        }
        ArrayList arrayList = new ArrayList();
        for (Message message : collectionValues) {
            if (!MessageUtils.isDeleted(message)) {
                message = null;
            }
            String id4 = message != null ? message.getId() : null;
            if (id4 != null) {
                arrayList.add(id4);
            }
        }
        return AbstractC25265s.m74103I1(arrayList);
    }

    public final void deleteMessage(Message message) {
        AbstractC22676k.m65750j(message, "message");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            c13045h2.m36571k(null, AbstractC25247g0.m73991Z(message.getId(), (Map) c13045h2.getValue()));
        }
    }

    public final void destroy() {
        this._messages = null;
        this._loading = null;
        this._endOfOlderMessages = null;
        this._oldestInThread = null;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getEndOfNewerMessages() {
        return this.endOfNewerMessages;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getEndOfOlderMessages() {
        return this.endOfOlderMessages;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getLoading() {
        return this.loading;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getMessages() {
        return this.messages;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getNewestInThread() {
        return this.newestInThread;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final InterfaceC13037f2 getOldestInThread() {
        return this.oldestInThread;
    }

    @Override // io.getstream.chat.android.client.api.state.ThreadState
    public final String getParentId() {
        return this.parentId;
    }

    public final Message getParentMessage() {
        Map map;
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 == null || (map = (Map) ((C13045h2) interfaceC13075p1).getValue()) == null) {
            return null;
        }
        return (Message) map.get(this.parentId);
    }

    public final InterfaceC13037f2 getRawMessage() {
        return this.rawMessage;
    }

    public final void setEndOfNewerMessages(boolean isEnd) {
        InterfaceC13075p1 interfaceC13075p1 = this._endOfNewerMessages;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isEnd));
        }
    }

    public final void setEndOfOlderMessages(boolean isEnd) {
        InterfaceC13075p1 interfaceC13075p1 = this._endOfOlderMessages;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isEnd));
        }
    }

    public final void setLoading(boolean isLoading) {
        InterfaceC13075p1 interfaceC13075p1 = this._loading;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36571k(null, Boolean.valueOf(isLoading));
        }
    }

    public final void setNewestInThread(Message message) {
        InterfaceC13075p1 interfaceC13075p1 = this._newestInThread;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(message);
        }
    }

    public final void setOldestInThread(Message message) {
        InterfaceC13075p1 interfaceC13075p1 = this._oldestInThread;
        if (interfaceC13075p1 != null) {
            ((C13045h2) interfaceC13075p1).m36570j(message);
        }
    }

    public final void updateParentMessagePoll(Poll poll) {
        Poll poll2;
        Message parentMessage = getParentMessage();
        if (parentMessage == null || (poll2 = parentMessage.getPoll()) == null) {
            return;
        }
        if (poll == null || AbstractC22676k.m65745e(poll.getId(), poll2.getId())) {
            upsertMessages(AbstractC37056f.m118958J(parentMessage.copy(((-1) & 1) != 0 ? parentMessage.id : null, ((-1) & 2) != 0 ? parentMessage.cid : null, ((-1) & 4) != 0 ? parentMessage.text : null, ((-1) & 8) != 0 ? parentMessage.html : null, ((-1) & 16) != 0 ? parentMessage.parentId : null, ((-1) & 32) != 0 ? parentMessage.command : null, ((-1) & 64) != 0 ? parentMessage.attachments : null, ((-1) & 128) != 0 ? parentMessage.mentionedUsersIds : null, ((-1) & 256) != 0 ? parentMessage.mentionedUsers : null, ((-1) & 512) != 0 ? parentMessage.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? parentMessage.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? parentMessage.reactionCounts : null, ((-1) & 4096) != 0 ? parentMessage.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? parentMessage.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? parentMessage.syncStatus : null, ((-1) & 32768) != 0 ? parentMessage.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? parentMessage.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? parentMessage.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? parentMessage.createdAt : null, ((-1) & 524288) != 0 ? parentMessage.updatedAt : null, ((-1) & 1048576) != 0 ? parentMessage.deletedAt : null, ((-1) & 2097152) != 0 ? parentMessage.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? parentMessage.createdLocallyAt : null, ((-1) & 8388608) != 0 ? parentMessage.user : null, ((-1) & 16777216) != 0 ? parentMessage.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? parentMessage.silent : false, ((-1) & 67108864) != 0 ? parentMessage.shadowed : false, ((-1) & 134217728) != 0 ? parentMessage.i18n : null, ((-1) & 268435456) != 0 ? parentMessage.showInChannel : false, ((-1) & 536870912) != 0 ? parentMessage.channelInfo : null, ((-1) & 1073741824) != 0 ? parentMessage.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? parentMessage.replyMessageId : null, (65535 & 1) != 0 ? parentMessage.pinned : false, (65535 & 2) != 0 ? parentMessage.pinnedAt : null, (65535 & 4) != 0 ? parentMessage.pinExpires : null, (65535 & 8) != 0 ? parentMessage.pinnedBy : null, (65535 & 16) != 0 ? parentMessage.threadParticipants : null, (65535 & 32) != 0 ? parentMessage.skipPushNotification : false, (65535 & 64) != 0 ? parentMessage.skipEnrichUrl : false, (65535 & 128) != 0 ? parentMessage.moderationDetails : null, (65535 & 256) != 0 ? parentMessage.moderation : null, (65535 & 512) != 0 ? parentMessage.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? parentMessage.poll : poll, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? parentMessage.restrictedVisibility : null, (65535 & 4096) != 0 ? parentMessage.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? parentMessage.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? parentMessage.channelRole : null, (65535 & 32768) != 0 ? parentMessage.deletedForMe : false)));
        }
    }

    public final void upsertMessages(List<Message> messages) {
        AbstractC22676k.m65750j(messages, "messages");
        InterfaceC13075p1 interfaceC13075p1 = this._messages;
        if (interfaceC13075p1 != null) {
            C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
            Map map = (Map) c13045h2.getValue();
            List<Message> list = messages;
            int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(list, 10));
            if (iM73988W < 16) {
                iM73988W = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
            for (Object obj : list) {
                linkedHashMap.put(((Message) obj).getId(), obj);
            }
            c13045h2.m36571k(null, AbstractC25247g0.m73995d0(map, AbstractC25247g0.m73992a0(linkedHashMap, getDeletedMessagesIds())));
        }
    }
}
