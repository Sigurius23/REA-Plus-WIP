package io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Member;
import io.getstream.chat.android.models.User;
import java.util.Date;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/Member;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "toEntity", "(Lio/getstream/chat/android/models/Member;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/member/internal/MemberEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MemberMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.channel.member.internal.MemberMapperKt", m100430f = "MemberMapper.kt", m100431l = {41}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C191451 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C191451(InterfaceC30057d<? super C191451> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MemberMapperKt.toModel(null, null, this);
        }
    }

    public static final MemberEntity toEntity(Member member) {
        AbstractC22676k.m65750j(member, "<this>");
        String userId = member.getUserId();
        Date createdAt = member.getCreatedAt();
        Date updatedAt = member.getUpdatedAt();
        Boolean boolIsInvited = member.isInvited();
        return new MemberEntity(userId, null, createdAt, updatedAt, boolIsInvited != null ? boolIsInvited.booleanValue() : false, member.getInviteAcceptedAt(), member.getInviteRejectedAt(), member.getShadowBanned(), member.getBanned(), member.getChannelRole(), member.getNotificationsMuted(), member.getStatus(), member.getBanExpires(), member.getPinnedAt(), member.getArchivedAt(), member.getExtraData(), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object toModel(MemberEntity memberEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super Member> interfaceC30057d) {
        C191451 c191451;
        MemberEntity memberEntity2;
        if (interfaceC30057d instanceof C191451) {
            c191451 = (C191451) interfaceC30057d;
            int i13 = c191451.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c191451.label = i13 - Integer.MIN_VALUE;
            } else {
                c191451 = new C191451(interfaceC30057d);
            }
        } else {
            c191451 = new C191451(interfaceC30057d);
        }
        Object objInvoke = c191451.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c191451.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            Object userId = memberEntity.getUserId();
            c191451.L$0 = memberEntity;
            c191451.L$1 = null;
            c191451.label = 1;
            objInvoke = interfaceC4351m.invoke(userId, c191451);
            if (objInvoke == obj) {
                return obj;
            }
            memberEntity2 = memberEntity;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            memberEntity2 = (MemberEntity) c191451.L$0;
            AbstractC34132o.m107864I(objInvoke);
        }
        return new Member((User) objInvoke, memberEntity2.getCreatedAt(), memberEntity2.getUpdatedAt(), Boolean.valueOf(memberEntity2.isInvited()), memberEntity2.getInviteAcceptedAt(), memberEntity2.getInviteRejectedAt(), memberEntity2.getShadowBanned(), memberEntity2.getBanned(), memberEntity2.getChannelRole(), memberEntity2.getNotificationsMuted(), memberEntity2.getStatus(), memberEntity2.getBanExpires(), memberEntity2.getPinnedAt(), memberEntity2.getArchivedAt(), memberEntity2.getExtraData());
    }
}
