package io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a8\u0010\n\u001a\u00020\u0000*\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004H\u0080@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lio/getstream/chat/android/models/Reaction;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "toEntity", "(Lio/getstream/chat/android/models/Reaction;)Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;", "Lkotlin/Function2;", "", "Lq83/d;", "Lio/getstream/chat/android/models/User;", "", "getUser", "toModel", "(Lio/getstream/chat/android/client/internal/offline/repository/domain/reaction/internal/ReactionEntity;Lc93/m;Lq83/d;)Ljava/lang/Object;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionMapperKt {

    /* JADX INFO: renamed from: io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt$toModel$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.internal.offline.repository.domain.reaction.internal.ReactionMapperKt", m100430f = "ReactionMapper.kt", m100431l = {42}, m100432m = "toModel")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C192311 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C192311(InterfaceC30057d<? super C192311> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ReactionMapperKt.toModel(null, null, this);
        }
    }

    public static final ReactionEntity toEntity(Reaction reaction) {
        AbstractC22676k.m65750j(reaction, "<this>");
        return new ReactionEntity(reaction.getMessageId(), reaction.fetchUserId(), reaction.getType(), reaction.getScore(), reaction.getCreatedAt(), reaction.getCreatedLocallyAt(), reaction.getUpdatedAt(), reaction.getDeletedAt(), reaction.getEnforceUnique(), reaction.getSkipPush(), reaction.getEmojiCode(), reaction.getExtraData(), reaction.getSyncStatus());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object toModel(ReactionEntity reactionEntity, InterfaceC4351m interfaceC4351m, InterfaceC30057d<? super Reaction> interfaceC30057d) {
        C192311 c192311;
        int score;
        String str;
        String str2;
        ReactionEntity reactionEntity2;
        if (interfaceC30057d instanceof C192311) {
            c192311 = (C192311) interfaceC30057d;
            int i13 = c192311.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c192311.label = i13 - Integer.MIN_VALUE;
            } else {
                c192311 = new C192311(interfaceC30057d);
            }
        } else {
            c192311 = new C192311(interfaceC30057d);
        }
        Object obj = c192311.result;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c192311.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String messageId = reactionEntity.getMessageId();
            String type = reactionEntity.getType();
            score = reactionEntity.getScore();
            Object userId = reactionEntity.getUserId();
            c192311.L$0 = reactionEntity;
            c192311.L$1 = null;
            c192311.L$2 = messageId;
            c192311.L$3 = type;
            c192311.I$0 = score;
            c192311.label = 1;
            Object objInvoke = interfaceC4351m.invoke(userId, c192311);
            if (objInvoke == obj2) {
                return obj2;
            }
            str = type;
            str2 = messageId;
            obj = objInvoke;
            reactionEntity2 = reactionEntity;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = c192311.I$0;
            String str3 = (String) c192311.L$3;
            String str4 = (String) c192311.L$2;
            reactionEntity2 = (ReactionEntity) c192311.L$0;
            AbstractC34132o.m107864I(obj);
            str = str3;
            str2 = str4;
            score = i15;
        }
        User user = (User) obj;
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(reactionEntity2.getExtraData());
        return new Reaction(str2, str, score, user, reactionEntity2.getUserId(), reactionEntity2.getCreatedAt(), reactionEntity2.getCreatedLocallyAt(), reactionEntity2.getUpdatedAt(), reactionEntity2.getDeletedAt(), reactionEntity2.getSyncStatus(), linkedHashMapM74003l0, reactionEntity2.getEnforceUnique(), reactionEntity2.getSkipPush(), reactionEntity2.getEmojiCode());
    }
}
