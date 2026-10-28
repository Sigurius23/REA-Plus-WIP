package io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal;

import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\ba\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0097@¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0097@¢\u0006\u0004\b\u0006\u0010\tJ\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u000f\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0007J\u001e\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0007J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u0017\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigDao;", "", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;", "channelConfigEntities", "Ll83/a0;", "insert", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "channelConfigEntity", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigEntity;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;", "channelConfigInnerEntity", "insertConfig", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/ChannelConfigInnerEntity;Lq83/d;)Ljava/lang/Object;", "channelConfigInnerEntities", "insertConfigs", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channelconfig/internal/CommandInnerEntity;", "commands", "insertCommands", "selectAll", "(Lq83/d;)Ljava/lang/Object;", "deleteCommands", "deleteConfigs", "deleteAll", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChannelConfigDao {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$deleteAll$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao", m100430f = "ChannelConfigDao.kt", m100431l = {61, 62}, m100432m = "deleteAll$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191471 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C191471(InterfaceC30057d<? super C191471> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelConfigDao.deleteAll$suspendImpl(ChannelConfigDao.this, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao", m100430f = "ChannelConfigDao.kt", m100431l = {31, 32}, m100432m = "insert$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191481 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191481(InterfaceC30057d<? super C191481> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelConfigDao.insert$suspendImpl(ChannelConfigDao.this, (List<ChannelConfigEntity>) null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao", m100430f = "ChannelConfigDao.kt", m100431l = {37, 38}, m100432m = "insert$suspendImpl")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191494 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191494(InterfaceC30057d<? super C191494> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelConfigDao.insert$suspendImpl(ChannelConfigDao.this, (ChannelConfigEntity) null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.deleteCommands(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object deleteAll$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5, q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            boolean r0 = r6 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191471
            if (r0 == 0) goto L13
            r0 = r6
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$deleteAll$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191471) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$deleteAll$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$deleteAll$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r5 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L58
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            java.lang.Object r5 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r5
            p505ts.AbstractC34132o.m107864I(r6)
            goto L4c
        L3e:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r5.deleteConfigs(r0)
            if (r6 != r1) goto L4c
            goto L57
        L4c:
            r6 = 0
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.deleteCommands(r0)
            if (r5 != r1) goto L58
        L57:
            return r1
        L58:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.deleteAll$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r6.insertCommands(r8, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r6, java.util.List<io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity> r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            boolean r0 = r8 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191481
            if (r0 == 0) goto L13
            r0 = r8
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$1 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191481) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$1 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto Lad
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.L$1
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r6
            p505ts.AbstractC34132o.m107864I(r8)
            goto L7e
        L48:
            p505ts.AbstractC34132o.m107864I(r8)
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r5 = 10
            int r5 = m83.AbstractC25267u.m74163i0(r8, r5)
            r2.<init>(r5)
            java.util.Iterator r8 = r8.iterator()
        L5d:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r8.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity) r5
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigInnerEntity r5 = r5.getChannelConfigInnerEntity()
            r2.add(r5)
            goto L5d
        L71:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r4
            java.lang.Object r8 = r6.insertConfigs(r2, r0)
            if (r8 != r1) goto L7e
            goto Lac
        L7e:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L89:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r7.next()
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity r2 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity) r2
            java.util.List r2 = r2.getCommands()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            m83.AbstractC25265s.m74141p0(r8, r2)
            goto L89
        L9f:
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r6 = r6.insertCommands(r8, r0)
            if (r6 != r1) goto Lad
        Lac:
            return r1
        Lad:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao, java.util.List, q83.d):java.lang.Object");
    }

    default Object deleteAll(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return deleteAll$suspendImpl(this, interfaceC30057d);
    }

    Object deleteCommands(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object deleteConfigs(InterfaceC30057d<? super C23454a0> interfaceC30057d);

    default Object insert(ChannelConfigEntity channelConfigEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insert$suspendImpl(this, channelConfigEntity, interfaceC30057d);
    }

    Object insertCommands(List<CommandInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertConfig(ChannelConfigInnerEntity channelConfigInnerEntity, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object insertConfigs(List<ChannelConfigInnerEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    Object selectAll(InterfaceC30057d<? super List<ChannelConfigEntity>> interfaceC30057d);

    default Object insert(List<ChannelConfigEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return insert$suspendImpl(this, list, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r5.insertCommands(r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5, io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity r6, q83.InterfaceC30057d<? super l83.C23454a0> r7) {
        /*
            boolean r0 = r7 instanceof io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191494
            if (r0 == 0) goto L13
            r0 = r7
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$4 r0 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.C191494) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$4 r0 = new io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao$insert$4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r5 = r0.L$1
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity) r5
            java.lang.Object r5 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L6d
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r5 = r0.L$1
            r6 = r5
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity r6 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity) r6
            java.lang.Object r5 = r0.L$0
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao r5 = (io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao) r5
            p505ts.AbstractC34132o.m107864I(r7)
            goto L5b
        L47:
            p505ts.AbstractC34132o.m107864I(r7)
            io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigInnerEntity r7 = r6.getChannelConfigInnerEntity()
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.insertConfig(r7, r0)
            if (r7 != r1) goto L5b
            goto L6c
        L5b:
            java.util.List r6 = r6.getCommands()
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r5 = r5.insertCommands(r6, r0)
            if (r5 != r1) goto L6d
        L6c:
            return r1
        L6d:
            l83.a0 r5 = l83.C23454a0.f92919a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao.insert$suspendImpl(io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigDao, io.getstream.chat.android.client.internal.offline.repository.domain.channelconfig.internal.ChannelConfigEntity, q83.d):java.lang.Object");
    }
}
