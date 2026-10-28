package io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.ChannelUserRead;
import io.getstream.chat.android.models.User;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/ChannelUserRead;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "toEntity", "(Lio/getstream/chat/android/models/ChannelUserRead;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/userread/internal/ChannelUserReadEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChannelUserReadMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.userread.internal.ChannelUserReadMapperKt", m100430f = "ChannelUserReadMapper.kt", m100431l = {35}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191461 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191461(InterfaceC30057d<? super C191461> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChannelUserReadMapperKt.toModel(null, null, this);
        }
    }

    public static final ChannelUserReadEntity toEntity(ChannelUserRead channelUserRead) {
        AbstractC22676k.m65750j(channelUserRead, "<this>");
        return new ChannelUserReadEntity(channelUserRead.getUserId(), channelUserRead.getLastReceivedEventDate(), channelUserRead.getUnreadMessages(), channelUserRead.getLastRead(), channelUserRead.getLastReadMessageId(), channelUserRead.getLastDeliveredAt(), channelUserRead.getLastDeliveredMessageId());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object toModel(ChannelUserReadEntity channelUserReadEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super ChannelUserRead> interfaceC30057d) {
        C191461 c191461;
        if (interfaceC30057d instanceof C191461) {
            c191461 = (C191461) interfaceC30057d;
            int i13 = c191461.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191461.label = i13 - Integer.MIN_VALUE;
            } else {
                c191461 = new C191461(interfaceC30057d);
            }
        } else {
            c191461 = new C191461(interfaceC30057d);
        }
        Object objInvoke = c191461.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c191461.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            Object userId = channelUserReadEntity.getUserId();
            c191461.L$0 = channelUserReadEntity;
            c191461.L$1 = null;
            c191461.label = 1;
            objInvoke = interfaceC4351m.invoke(userId, c191461);
            if (objInvoke == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channelUserReadEntity = (ChannelUserReadEntity) c191461.L$0;
            AbstractC34132o.m107864I(objInvoke);
        }
        return new ChannelUserRead((User) objInvoke, channelUserReadEntity.getLastReceivedEventDate(), channelUserReadEntity.getUnreadMessages(), channelUserReadEntity.getLastRead(), channelUserReadEntity.getLastReadMessageId(), channelUserReadEntity.getLastDeliveredAt(), channelUserReadEntity.getLastDeliveredMessageId());
    }
}
