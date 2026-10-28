package io.getstream.chat.android.p226ui.common.feature.messages.composer.mention;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter.DefaultUserQueryFilter;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.query.filter.QueryFilter;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0004\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/DefaultUserLookupHandler;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "localHandler", "remoteHandler", "<init>", "(Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;)V", "Lio/getstream/chat/android/client/ChatClient;", "chatClient", "", "channelCid", "Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;", "Lio/getstream/chat/android/models/User;", "localFilter", "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Lio/getstream/chat/android/ui/common/feature/messages/composer/query/filter/QueryFilter;)V", "query", "", "handleUserLookup", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/ui/common/feature/messages/composer/mention/UserLookupHandler;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class DefaultUserLookupHandler implements UserLookupHandler {
    public static final int $stable = 8;
    private final UserLookupHandler localHandler;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final UserLookupHandler remoteHandler;

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.mention.DefaultUserLookupHandler$handleUserLookup$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.mention.DefaultUserLookupHandler", m100430f = "DefaultUserLookupHandler.kt", m100431l = {57, 59}, m100432m = "handleUserLookup")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195461 extends AbstractC32269c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C195461(InterfaceC30057d<? super C195461> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultUserLookupHandler.this.handleUserLookup(null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultUserLookupHandler(ChatClient chatClient, String channelCid) {
        this(chatClient, channelCid, null, 4, null);
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelCid, "channelCid");
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0098, code lost:
    
        if (r11 == r1) goto L29;
     */
    @Override // io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.UserLookupHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleUserLookup(java.lang.String r10, q83.InterfaceC30057d<? super java.util.List<io.getstream.chat.android.models.User>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.DefaultUserLookupHandler.C195461
            if (r0 == 0) goto L13
            r0 = r11
            io.getstream.chat.android.ui.common.feature.messages.composer.mention.DefaultUserLookupHandler$handleUserLookup$1 r0 = (io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.DefaultUserLookupHandler.C195461) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.ui.common.feature.messages.composer.mention.DefaultUserLookupHandler$handleUserLookup$1 r0 = new io.getstream.chat.android.ui.common.feature.messages.composer.mention.DefaultUserLookupHandler$handleUserLookup$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L9b
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.lang.Object r10 = r0.L$0
            java.lang.String r10 = (java.lang.String) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto L6c
        L3f:
            p505ts.AbstractC34132o.m107864I(r11)
            b23.k r11 = r9.getLogger()
            b23.e r2 = r11.f9275c
            java.lang.String r6 = r11.f9273a
            b23.g r7 = b23.EnumC2341g.DEBUG
            boolean r2 = r2.isLoggable(r7, r6)
            if (r2 == 0) goto L5f
            b23.j r11 = r11.f9274b
            java.lang.String r2 = "[handleUserLookup] query: \""
            java.lang.String r8 = "\""
            java.lang.String r2 = p088dc.AbstractC11895b.m31996o(r2, r10, r8)
            r11.log(r7, r6, r2, r3)
        L5f:
            io.getstream.chat.android.ui.common.feature.messages.composer.mention.UserLookupHandler r11 = r9.localHandler
            r0.L$0 = r10
            r0.label = r5
            java.lang.Object r11 = r11.handleUserLookup(r10, r0)
            if (r11 != r1) goto L6c
            goto L9a
        L6c:
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L9d
            b23.k r11 = r9.getLogger()
            b23.e r2 = r11.f9275c
            java.lang.String r5 = r11.f9273a
            b23.g r6 = b23.EnumC2341g.VERBOSE
            boolean r2 = r2.isLoggable(r6, r5)
            if (r2 == 0) goto L8b
            b23.j r11 = r11.f9274b
            java.lang.String r2 = "[handleUserLookup] no local results"
            r11.log(r6, r5, r2, r3)
        L8b:
            io.getstream.chat.android.ui.common.feature.messages.composer.mention.UserLookupHandler r11 = r9.remoteHandler
            r0.L$0 = r3
            r2 = 0
            r0.I$0 = r2
            r0.label = r4
            java.lang.Object r11 = r11.handleUserLookup(r10, r0)
            if (r11 != r1) goto L9b
        L9a:
            return r1
        L9b:
            java.util.List r11 = (java.util.List) r11
        L9d:
            r10 = r11
            java.util.List r10 = (java.util.List) r10
            b23.k r0 = r9.getLogger()
            b23.e r1 = r0.f9275c
            java.lang.String r2 = r0.f9273a
            b23.g r4 = b23.EnumC2341g.VERBOSE
            boolean r1 = r1.isLoggable(r4, r2)
            if (r1 == 0) goto Lc1
            b23.j r0 = r0.f9274b
            int r10 = r10.size()
            java.lang.String r1 = "[handleUserLookup] found "
            java.lang.String r5 = " users"
            java.lang.String r10 = p031b9.AbstractC2875y.m8296i(r10, r1, r5)
            r0.log(r4, r2, r10, r3)
        Lc1:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.p226ui.common.feature.messages.composer.mention.DefaultUserLookupHandler.handleUserLookup(java.lang.String, q83.d):java.lang.Object");
    }

    public DefaultUserLookupHandler(UserLookupHandler localHandler, UserLookupHandler remoteHandler) {
        AbstractC22676k.m65750j(localHandler, "localHandler");
        AbstractC22676k.m65750j(remoteHandler, "remoteHandler");
        this.localHandler = localHandler;
        this.remoteHandler = remoteHandler;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:UserLookupHandler");
    }

    public /* synthetic */ DefaultUserLookupHandler(ChatClient chatClient, String str, QueryFilter queryFilter, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(chatClient, str, (i13 & 4) != 0 ? new DefaultUserQueryFilter(null, 1, null) : queryFilter);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultUserLookupHandler(ChatClient chatClient, String channelCid, QueryFilter<User> localFilter) {
        this(new LocalUserLookupHandler(chatClient, channelCid, localFilter), new RemoteUserLookupHandler(chatClient, channelCid));
        AbstractC22676k.m65750j(chatClient, "chatClient");
        AbstractC22676k.m65750j(channelCid, "channelCid");
        AbstractC22676k.m65750j(localFilter, "localFilter");
    }
}
