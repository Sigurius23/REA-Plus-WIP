package io.getstream.chat.android.client.internal.offline.repository.domain.message.internal;

import androidx.room.AbstractC1802k;
import androidx.room.AbstractC1848z0;
import ge3.AbstractC15751g;
import h02.C16574h;
import ht2.C17632d;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.AnswerConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.DateConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.ExtraDataConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.MapConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.OptionConverter;
import io.getstream.chat.android.client.internal.offline.repository.database.converter.internal.VoteConverter;
import j93.InterfaceC21461d;
import java.util.Date;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import m83.C25271y;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl;", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao;", "Landroidx/room/z0;", "__db", "<init>", "(Landroidx/room/z0;)V", "", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollEntity;", "polls", "Ll83/a0;", "insertPolls", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "pollId", "getPoll", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "deletePoll", "Landroidx/room/z0;", "Landroidx/room/k;", "__insertAdapterOfPollEntity", "Landroidx/room/k;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;", "__optionConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/OptionConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "__mapConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/MapConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;", "__voteConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/VoteConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "__dateConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/DateConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;", "__answerConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/AnswerConverter;", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "__extraDataConverter", "Lio/getstream/chat/android/client/internal/offline/repository/database/converter/internal/ExtraDataConverter;", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollDao_Impl implements PollDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final AnswerConverter __answerConverter;
    private final DateConverter __dateConverter;
    private final AbstractC1848z0 __db;
    private final ExtraDataConverter __extraDataConverter;
    private final AbstractC1802k __insertAdapterOfPollEntity;
    private final MapConverter __mapConverter;
    private final OptionConverter __optionConverter;
    private final VoteConverter __voteConverter;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/offline/repository/domain/message/internal/PollDao_Impl$Companion;", "", "<init>", "()V", "", "Lj93/d;", "getRequiredConverters", "()Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final List<InterfaceC21461d> getRequiredConverters() {
            return C25271y.f99162w;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public PollDao_Impl(AbstractC1848z0 __db) {
        AbstractC22676k.m65750j(__db, "__db");
        this.__optionConverter = new OptionConverter();
        this.__mapConverter = new MapConverter();
        this.__voteConverter = new VoteConverter();
        this.__dateConverter = new DateConverter();
        this.__answerConverter = new AnswerConverter();
        this.__extraDataConverter = new ExtraDataConverter();
        this.__db = __db;
        this.__insertAdapterOfPollEntity = new AbstractC1802k() { // from class: io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao_Impl.1
            @Override // androidx.room.AbstractC1802k
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `stream_chat_poll` (`id`,`name`,`description`,`options`,`votingVisibility`,`enforceUniqueVote`,`maxVotesAllowed`,`allowUserSuggestedOptions`,`allowAnswers`,`voteCount`,`voteCountsByOption`,`votes`,`ownVotes`,`createdAt`,`updatedAt`,`closed`,`answersCount`,`answers`,`createdById`,`extraData`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC1802k
            public final void bind(InterfaceC33689c statement, PollEntity entity) {
                AbstractC22676k.m65750j(statement, "statement");
                AbstractC22676k.m65750j(entity, "entity");
                statement.mo5354L(1, entity.getId());
                statement.mo5354L(2, entity.getName());
                statement.mo5354L(3, entity.getDescription());
                String strOptionListToString = PollDao_Impl.this.__optionConverter.optionListToString(entity.getOptions());
                if (strOptionListToString == null) {
                    statement.mo5359u(4);
                } else {
                    statement.mo5354L(4, strOptionListToString);
                }
                statement.mo5354L(5, entity.getVotingVisibility());
                statement.mo5356p(6, entity.getEnforceUniqueVote() ? 1L : 0L);
                Integer maxVotesAllowed = entity.getMaxVotesAllowed();
                if (maxVotesAllowed == null) {
                    statement.mo5359u(7);
                } else {
                    statement.mo5356p(7, maxVotesAllowed.intValue());
                }
                statement.mo5356p(8, entity.getAllowUserSuggestedOptions() ? 1L : 0L);
                statement.mo5356p(9, entity.getAllowAnswers() ? 1L : 0L);
                statement.mo5356p(10, entity.getVoteCount());
                String strMapToString = PollDao_Impl.this.__mapConverter.mapToString(entity.getVoteCountsByOption());
                if (strMapToString == null) {
                    statement.mo5359u(11);
                } else {
                    statement.mo5354L(11, strMapToString);
                }
                String strVoteListToString = PollDao_Impl.this.__voteConverter.voteListToString(entity.getVotes());
                if (strVoteListToString == null) {
                    statement.mo5359u(12);
                } else {
                    statement.mo5354L(12, strVoteListToString);
                }
                String strVoteListToString2 = PollDao_Impl.this.__voteConverter.voteListToString(entity.getOwnVotes());
                if (strVoteListToString2 == null) {
                    statement.mo5359u(13);
                } else {
                    statement.mo5354L(13, strVoteListToString2);
                }
                Long lDateToTimestamp = PollDao_Impl.this.__dateConverter.dateToTimestamp(entity.getCreatedAt());
                if (lDateToTimestamp == null) {
                    statement.mo5359u(14);
                } else {
                    statement.mo5356p(14, lDateToTimestamp.longValue());
                }
                Long lDateToTimestamp2 = PollDao_Impl.this.__dateConverter.dateToTimestamp(entity.getUpdatedAt());
                if (lDateToTimestamp2 == null) {
                    statement.mo5359u(15);
                } else {
                    statement.mo5356p(15, lDateToTimestamp2.longValue());
                }
                statement.mo5356p(16, entity.getClosed() ? 1L : 0L);
                statement.mo5356p(17, entity.getAnswersCount());
                String strAnswerListToString = PollDao_Impl.this.__answerConverter.answerListToString(entity.getAnswers());
                if (strAnswerListToString == null) {
                    statement.mo5359u(18);
                } else {
                    statement.mo5354L(18, strAnswerListToString);
                }
                String createdById = entity.getCreatedById();
                if (createdById == null) {
                    statement.mo5359u(19);
                } else {
                    statement.mo5354L(19, createdById);
                }
                String strMapToString2 = PollDao_Impl.this.__extraDataConverter.mapToString(entity.getExtraData());
                if (strMapToString2 == null) {
                    statement.mo5359u(20);
                } else {
                    statement.mo5354L(20, strMapToString2);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 deletePoll$lambda$2(String str, String str2, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            interfaceC33689cMo68212g1.mo5355e1();
            return C23454a0.f92919a;
        } finally {
            interfaceC33689cMo68212g1.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final PollEntity getPoll$lambda$1(String str, String str2, PollDao_Impl pollDao_Impl, InterfaceC33687a _connection) throws Exception {
        AbstractC22676k.m65750j(_connection, "_connection");
        InterfaceC33689c interfaceC33689cMo68212g1 = _connection.mo68212g1(str);
        try {
            interfaceC33689cMo68212g1.mo5354L(1, str2);
            int iM60658N = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "id");
            int iM60658N2 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "name");
            int iM60658N3 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "description");
            int iM60658N4 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "options");
            int iM60658N5 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "votingVisibility");
            int iM60658N6 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "enforceUniqueVote");
            int iM60658N7 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "maxVotesAllowed");
            int iM60658N8 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "allowUserSuggestedOptions");
            int iM60658N9 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "allowAnswers");
            int iM60658N10 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "voteCount");
            int iM60658N11 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "voteCountsByOption");
            int iM60658N12 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "votes");
            int iM60658N13 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "ownVotes");
            int iM60658N14 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdAt");
            int iM60658N15 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "updatedAt");
            int iM60658N16 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "closed");
            int iM60658N17 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "answersCount");
            int iM60658N18 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "answers");
            int iM60658N19 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "createdById");
            int iM60658N20 = AbstractC21598x.m60658N(interfaceC33689cMo68212g1, "extraData");
            PollEntity pollEntity = null;
            if (interfaceC33689cMo68212g1.mo5355e1()) {
                String strMo5353J0 = interfaceC33689cMo68212g1.mo5353J0(iM60658N);
                String strMo5353J1 = interfaceC33689cMo68212g1.mo5353J0(iM60658N2);
                String strMo5353J2 = interfaceC33689cMo68212g1.mo5353J0(iM60658N3);
                List<OptionEntity> listStringToOptionList = pollDao_Impl.__optionConverter.stringToOptionList(interfaceC33689cMo68212g1.isNull(iM60658N4) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N4));
                if (listStringToOptionList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.OptionEntity>', but it was NULL.");
                }
                String strMo5353J3 = interfaceC33689cMo68212g1.mo5353J0(iM60658N5);
                boolean z4 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N6)) != 0;
                Integer numValueOf = interfaceC33689cMo68212g1.isNull(iM60658N7) ? null : Integer.valueOf((int) interfaceC33689cMo68212g1.getLong(iM60658N7));
                boolean z13 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N8)) != 0;
                boolean z14 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N9)) != 0;
                int i13 = (int) interfaceC33689cMo68212g1.getLong(iM60658N10);
                Map<String, Integer> mapStringToMap = pollDao_Impl.__mapConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N11) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N11));
                if (mapStringToMap == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Int>', but it was NULL.");
                }
                List<VoteEntity> listStringToVoteList = pollDao_Impl.__voteConverter.stringToVoteList(interfaceC33689cMo68212g1.isNull(iM60658N12) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N12));
                if (listStringToVoteList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.VoteEntity>', but it was NULL.");
                }
                List<VoteEntity> listStringToVoteList2 = pollDao_Impl.__voteConverter.stringToVoteList(interfaceC33689cMo68212g1.isNull(iM60658N13) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N13));
                if (listStringToVoteList2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.VoteEntity>', but it was NULL.");
                }
                Date dateFromTimestamp = pollDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N14) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N14)));
                if (dateFromTimestamp == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                Date dateFromTimestamp2 = pollDao_Impl.__dateConverter.fromTimestamp(interfaceC33689cMo68212g1.isNull(iM60658N15) ? null : Long.valueOf(interfaceC33689cMo68212g1.getLong(iM60658N15)));
                if (dateFromTimestamp2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'java.util.Date', but it was NULL.");
                }
                boolean z15 = ((int) interfaceC33689cMo68212g1.getLong(iM60658N16)) != 0;
                int i14 = (int) interfaceC33689cMo68212g1.getLong(iM60658N17);
                List<AnswerEntity> listStringToAnswerList = pollDao_Impl.__answerConverter.stringToAnswerList(interfaceC33689cMo68212g1.isNull(iM60658N18) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N18));
                if (listStringToAnswerList == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.List<io.getstream.chat.android.client.`internal`.offline.repository.domain.message.`internal`.AnswerEntity>', but it was NULL.");
                }
                String strMo5353J4 = interfaceC33689cMo68212g1.isNull(iM60658N19) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N19);
                Map<String, Object> mapStringToMap2 = pollDao_Impl.__extraDataConverter.stringToMap(interfaceC33689cMo68212g1.isNull(iM60658N20) ? null : interfaceC33689cMo68212g1.mo5353J0(iM60658N20));
                if (mapStringToMap2 == null) {
                    throw new IllegalStateException("Expected NON-NULL 'kotlin.collections.Map<kotlin.String, kotlin.Any>', but it was NULL.");
                }
                pollEntity = new PollEntity(strMo5353J0, strMo5353J1, strMo5353J2, listStringToOptionList, strMo5353J3, z4, numValueOf, z13, z14, i13, mapStringToMap, listStringToVoteList, listStringToVoteList2, dateFromTimestamp, dateFromTimestamp2, z15, i14, listStringToAnswerList, strMo5353J4, mapStringToMap2);
            }
            interfaceC33689cMo68212g1.close();
            return pollEntity;
        } catch (Throwable th3) {
            interfaceC33689cMo68212g1.close();
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 insertPolls$lambda$0(PollDao_Impl pollDao_Impl, List list, InterfaceC33687a _connection) {
        AbstractC22676k.m65750j(_connection, "_connection");
        pollDao_Impl.__insertAdapterOfPollEntity.insert(_connection, (Iterable<Object>) list);
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao
    public final Object deletePoll(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C17632d(str, 7), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao
    public final Object getPoll(String str, InterfaceC30057d<? super PollEntity> interfaceC30057d) {
        return AbstractC15751g.m44434N(this.__db, true, false, new C16574h(26, str, this), interfaceC30057d);
    }

    @Override // io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.PollDao
    public final Object insertPolls(List<PollEntity> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        Object objM44434N = AbstractC15751g.m44434N(this.__db, false, true, new C16574h(25, this, list), interfaceC30057d);
        return objM44434N == EnumC31071a.f128113w ? objM44434N : C23454a0.f92919a;
    }
}
