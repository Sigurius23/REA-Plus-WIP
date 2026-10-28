package io.getstream.chat.android.client.parser2.direct;

import c93.InterfaceC4339a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api2.model.requests.CreatePollRequest;
import io.getstream.chat.android.models.Answer;
import io.getstream.chat.android.models.Option;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.models.Vote;
import io.getstream.chat.android.models.VotingVisibility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jh3.AbstractC21702c;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p441qx.AbstractC30704c0;
import p441qx.EnumC30741w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0017\u0018\u00010\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J!\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,¨\u0006."}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/PollAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/chat/android/models/Poll;", "Lio/getstream/chat/android/models/User;", "userAdapter", "Lio/getstream/chat/android/models/Option;", "optionAdapter", "Ljava/util/Date;", "dateAdapter", "Lkotlin/Function0;", "", "currentUserIdProvider", "<init>", "(Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lc93/a;)V", "Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;", "Lio/getstream/chat/android/models/Vote;", "toVote", "(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Vote;", "Lio/getstream/chat/android/models/Answer;", "toAnswer", "(Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;)Lio/getstream/chat/android/models/Answer;", "Lcom/squareup/moshi/JsonReader;", "reader", "", "parseParsedVotesList", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/List;", "parseParsedVote", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;", "", "parseParsedVotesMap", "(Lcom/squareup/moshi/JsonReader;)Ljava/util/Map;", "value", "Lio/getstream/chat/android/models/VotingVisibility;", "toVotingVisibility", "(Ljava/lang/String;)Lio/getstream/chat/android/models/VotingVisibility;", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/chat/android/models/Poll;", "Lqx/c0;", "p0", "p1", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/chat/android/models/Poll;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lc93/a;", "ParsedVoteDto", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PollAdapter extends JsonAdapter<Poll> {
    private final InterfaceC4339a currentUserIdProvider;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Option> optionAdapter;
    private final JsonAdapter<User> userAdapter;

    @Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/client/parser2/direct/PollAdapter$ParsedVoteDto;", "", "id", "", "pollId", "optionId", "createdAt", "Ljava/util/Date;", "updatedAt", UserState.Sources.USER, "Lio/getstream/chat/android/models/User;", "isAnswer", "", "answerText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPollId", "getOptionId", "getCreatedAt", "()Ljava/util/Date;", "getUpdatedAt", "getUser", "()Lio/getstream/chat/android/models/User;", "()Z", "getAnswerText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* data */ class ParsedVoteDto {
        private final String answerText;
        private final Date createdAt;
        private final String id;
        private final boolean isAnswer;
        private final String optionId;
        private final String pollId;
        private final Date updatedAt;
        private final User user;

        public ParsedVoteDto(String id4, String pollId, String optionId, Date createdAt, Date updatedAt, User user, boolean z4, String str) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(optionId, "optionId");
            AbstractC22676k.m65750j(createdAt, "createdAt");
            AbstractC22676k.m65750j(updatedAt, "updatedAt");
            this.id = id4;
            this.pollId = pollId;
            this.optionId = optionId;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.user = user;
            this.isAnswer = z4;
            this.answerText = str;
        }

        public static /* synthetic */ ParsedVoteDto copy$default(ParsedVoteDto parsedVoteDto, String str, String str2, String str3, Date date, Date date2, User user, boolean z4, String str4, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = parsedVoteDto.id;
            }
            if ((i13 & 2) != 0) {
                str2 = parsedVoteDto.pollId;
            }
            if ((i13 & 4) != 0) {
                str3 = parsedVoteDto.optionId;
            }
            if ((i13 & 8) != 0) {
                date = parsedVoteDto.createdAt;
            }
            if ((i13 & 16) != 0) {
                date2 = parsedVoteDto.updatedAt;
            }
            if ((i13 & 32) != 0) {
                user = parsedVoteDto.user;
            }
            if ((i13 & 64) != 0) {
                z4 = parsedVoteDto.isAnswer;
            }
            if ((i13 & 128) != 0) {
                str4 = parsedVoteDto.answerText;
            }
            boolean z13 = z4;
            String str5 = str4;
            Date date3 = date2;
            User user2 = user;
            return parsedVoteDto.copy(str, str2, str3, date, date3, user2, z13, str5);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPollId() {
            return this.pollId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Date getCreatedAt() {
            return this.createdAt;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Date getUpdatedAt() {
            return this.updatedAt;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final User getUser() {
            return this.user;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final boolean getIsAnswer() {
            return this.isAnswer;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getAnswerText() {
            return this.answerText;
        }

        public final ParsedVoteDto copy(String id4, String pollId, String optionId, Date createdAt, Date updatedAt, User user, boolean isAnswer, String answerText) {
            AbstractC22676k.m65750j(id4, "id");
            AbstractC22676k.m65750j(pollId, "pollId");
            AbstractC22676k.m65750j(optionId, "optionId");
            AbstractC22676k.m65750j(createdAt, "createdAt");
            AbstractC22676k.m65750j(updatedAt, "updatedAt");
            return new ParsedVoteDto(id4, pollId, optionId, createdAt, updatedAt, user, isAnswer, answerText);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ParsedVoteDto)) {
                return false;
            }
            ParsedVoteDto parsedVoteDto = (ParsedVoteDto) other;
            return AbstractC22676k.m65745e(this.id, parsedVoteDto.id) && AbstractC22676k.m65745e(this.pollId, parsedVoteDto.pollId) && AbstractC22676k.m65745e(this.optionId, parsedVoteDto.optionId) && AbstractC22676k.m65745e(this.createdAt, parsedVoteDto.createdAt) && AbstractC22676k.m65745e(this.updatedAt, parsedVoteDto.updatedAt) && AbstractC22676k.m65745e(this.user, parsedVoteDto.user) && this.isAnswer == parsedVoteDto.isAnswer && AbstractC22676k.m65745e(this.answerText, parsedVoteDto.answerText);
        }

        public final String getAnswerText() {
            return this.answerText;
        }

        public final Date getCreatedAt() {
            return this.createdAt;
        }

        public final String getId() {
            return this.id;
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final String getPollId() {
            return this.pollId;
        }

        public final Date getUpdatedAt() {
            return this.updatedAt;
        }

        public final User getUser() {
            return this.user;
        }

        public final int hashCode() {
            int iM124373c = AbstractC38963t7.m124373c(this.updatedAt, AbstractC38963t7.m124373c(this.createdAt, AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.pollId), 31, this.optionId), 31), 31);
            User user = this.user;
            int iM8289b = AbstractC2875y.m8289b((iM124373c + (user == null ? 0 : user.hashCode())) * 31, 31, this.isAnswer);
            String str = this.answerText;
            return iM8289b + (str != null ? str.hashCode() : 0);
        }

        public final boolean isAnswer() {
            return this.isAnswer;
        }

        public final String toString() {
            String str = this.id;
            String str2 = this.pollId;
            String str3 = this.optionId;
            Date date = this.createdAt;
            Date date2 = this.updatedAt;
            User user = this.user;
            boolean z4 = this.isAnswer;
            String str4 = this.answerText;
            StringBuilder sbM32001t = AbstractC11895b.m32001t("ParsedVoteDto(id=", str, ", pollId=", str2, ", optionId=");
            AbstractC13673n.m38579z(sbM32001t, str3, ", createdAt=", date, ", updatedAt=");
            sbM32001t.append(date2);
            sbM32001t.append(", user=");
            sbM32001t.append(user);
            sbM32001t.append(", isAnswer=");
            return AbstractC21702c.m61139j(sbM32001t, z4, ", answerText=", str4, ")");
        }
    }

    public PollAdapter(JsonAdapter<User> userAdapter, JsonAdapter<Option> optionAdapter, JsonAdapter<Date> dateAdapter, InterfaceC4339a currentUserIdProvider) {
        AbstractC22676k.m65750j(userAdapter, "userAdapter");
        AbstractC22676k.m65750j(optionAdapter, "optionAdapter");
        AbstractC22676k.m65750j(dateAdapter, "dateAdapter");
        AbstractC22676k.m65750j(currentUserIdProvider, "currentUserIdProvider");
        this.userAdapter = userAdapter;
        this.optionAdapter = optionAdapter;
        this.dateAdapter = dateAdapter;
        this.currentUserIdProvider = currentUserIdProvider;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0032  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x005a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0043 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0036. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:8:0x001c for B:13:0x0036 already processed. Defaulting to fallback option. */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:63:0x007a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final io.getstream.chat.android.client.parser2.direct.PollAdapter.ParsedVoteDto parseParsedVote(com.squareup.moshi.JsonReader r18) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.getstream.chat.android.client.parser2.direct.PollAdapter.parseParsedVote(com.squareup.moshi.JsonReader):io.getstream.chat.android.client.parser2.direct.PollAdapter$ParsedVoteDto");
    }

    private final List<ParsedVoteDto> parseParsedVotesList(JsonReader reader) {
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126549w) {
            reader.skipValue();
            return null;
        }
        reader.beginArray();
        ArrayList arrayList = new ArrayList();
        while (reader.hasNext()) {
            ParsedVoteDto parsedVote = parseParsedVote(reader);
            if (parsedVote != null) {
                arrayList.add(parsedVote);
            }
        }
        reader.endArray();
        return arrayList;
    }

    private final Map<String, List<ParsedVoteDto>> parseParsedVotesMap(JsonReader reader) {
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        if (reader.mo16731k() != EnumC30741w.f126551y) {
            reader.skipValue();
            return null;
        }
        reader.beginObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            List<ParsedVoteDto> parsedVotesList = parseParsedVotesList(reader);
            if (parsedVotesList != null) {
                linkedHashMap.put(strNextName, parsedVotesList);
            }
        }
        reader.endObject();
        return linkedHashMap;
    }

    private final Answer toAnswer(ParsedVoteDto parsedVoteDto) {
        String id4 = parsedVoteDto.getId();
        String pollId = parsedVoteDto.getPollId();
        String answerText = parsedVoteDto.getAnswerText();
        if (answerText == null) {
            answerText = "";
        }
        return new Answer(id4, pollId, answerText, parsedVoteDto.getCreatedAt(), parsedVoteDto.getUpdatedAt(), parsedVoteDto.getUser());
    }

    private final Vote toVote(ParsedVoteDto parsedVoteDto) {
        return new Vote(parsedVoteDto.getId(), parsedVoteDto.getPollId(), parsedVoteDto.getOptionId(), parsedVoteDto.getCreatedAt(), parsedVoteDto.getUpdatedAt(), parsedVoteDto.getUser());
    }

    private final VotingVisibility toVotingVisibility(String value) {
        if (value == null || value.equals(CreatePollRequest.VOTING_VISIBILITY_PUBLIC)) {
            return VotingVisibility.PUBLIC;
        }
        if (value.equals(CreatePollRequest.VOTING_VISIBILITY_ANONYMOUS)) {
            return VotingVisibility.ANONYMOUS;
        }
        throw new IllegalArgumentException("Unknown voting visibility: ".concat(value));
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final /* bridge */ /* synthetic */ void toJson(AbstractC30704c0 abstractC30704c0, Object obj) {
        toJson(abstractC30704c0, (Poll) obj);
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // com.squareup.moshi.JsonAdapter
    public final Poll fromJson(JsonReader reader) {
        C25271y c25271y;
        ?? arrayList;
        ?? arrayList2;
        Collection<List<ParsedVoteDto>> collectionValues;
        User user;
        AbstractC22676k.m65750j(reader, "reader");
        Map<String, Object> mapAccumulateExtraData = null;
        if (reader.mo16731k() == EnumC30741w.f126546I) {
            reader.mo16730i();
            return null;
        }
        reader.beginObject();
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = null;
        Boolean boolValueOf3 = null;
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        List list = null;
        Integer numValueOf = null;
        List<ParsedVoteDto> parsedVotesList = null;
        Date date = null;
        Date date2 = null;
        Integer numValueOf2 = null;
        List<ParsedVoteDto> parsedVotesList2 = null;
        Map<String, List<ParsedVoteDto>> parsedVotesMap = null;
        Integer nullableInt = null;
        Map<String, Integer> intMap = null;
        Boolean nullableBoolean = null;
        User user2 = null;
        String nullableString = null;
        while (true) {
            List<ParsedVoteDto> list2 = parsedVotesList2;
            Integer num = numValueOf2;
            Date date3 = date2;
            Date date4 = date;
            List<ParsedVoteDto> list3 = parsedVotesList;
            Integer num2 = numValueOf;
            Boolean bool = boolValueOf3;
            Boolean bool2 = boolValueOf2;
            Boolean bool3 = boolValueOf;
            List list4 = list;
            String str = strNextString3;
            String str2 = strNextString2;
            if (!reader.hasNext()) {
                String str3 = strNextString;
                reader.endObject();
                JsonParsingUtils jsonParsingUtils = JsonParsingUtils.INSTANCE;
                Map<String, Object> map = mapAccumulateExtraData;
                jsonParsingUtils.requireField(str3, "id", reader);
                jsonParsingUtils.requireField(str2, "name", reader);
                jsonParsingUtils.requireField(str, "description", reader);
                jsonParsingUtils.requireField(list4, "options", reader);
                jsonParsingUtils.requireField(bool3, "enforce_unique_vote", reader);
                jsonParsingUtils.requireField(bool2, "allow_user_suggested_options", reader);
                jsonParsingUtils.requireField(bool, "allow_answers", reader);
                jsonParsingUtils.requireField(num2, "vote_count", reader);
                jsonParsingUtils.requireField(list3, "own_votes", reader);
                jsonParsingUtils.requireField(date4, "created_at", reader);
                jsonParsingUtils.requireField(date3, "updated_at", reader);
                jsonParsingUtils.requireField(num, "answers_count", reader);
                String id4 = (String) this.currentUserIdProvider.invoke();
                if (id4 == null) {
                    ParsedVoteDto parsedVoteDto = (ParsedVoteDto) AbstractC25265s.m74100H0(list3);
                    id4 = (parsedVoteDto == null || (user = parsedVoteDto.getUser()) == null) ? null : user.getId();
                }
                C25271y c25271y2 = C25271y.f99162w;
                if (parsedVotesMap == null || (collectionValues = parsedVotesMap.values()) == null) {
                    c25271y = c25271y2;
                    arrayList = c25271y;
                } else {
                    ArrayList arrayListM74164j0 = AbstractC25267u.m74164j0(collectionValues);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayListM74164j0) {
                        C25271y c25271y3 = c25271y2;
                        if (!((ParsedVoteDto) obj).isAnswer()) {
                            arrayList3.add(obj);
                        }
                        c25271y2 = c25271y3;
                    }
                    c25271y = c25271y2;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(toVote((ParsedVoteDto) it.next()));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list3) {
                    if (!((ParsedVoteDto) obj2).isAnswer()) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(AbstractC25267u.m74163i0(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(toVote((ParsedVoteDto) it3.next()));
                }
                ArrayList arrayList6 = new ArrayList();
                ?? r10 = arrayList;
                for (Object obj3 : (Iterable) arrayList) {
                    User user3 = ((Vote) obj3).getUser();
                    if (AbstractC22676k.m65745e(user3 != null ? user3.getId() : null, id4)) {
                        arrayList6.add(obj3);
                    }
                    r10 = r10;
                }
                ?? r24 = r10;
                ArrayList arrayListM74129g1 = AbstractC25265s.m74129g1(arrayList5, arrayList6);
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayListM74129g1, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj4 : arrayListM74129g1) {
                    linkedHashMap.put(((Vote) obj4).getId(), obj4);
                }
                List listM74093D1 = AbstractC25265s.m74093D1(linkedHashMap.values());
                if (list2 != null) {
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                    Iterator it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(toAnswer((ParsedVoteDto) it4.next()));
                    }
                } else {
                    arrayList2 = c25271y;
                }
                VotingVisibility votingVisibility = toVotingVisibility(nullableString);
                boolean zBooleanValue = bool3.booleanValue();
                boolean zBooleanValue2 = bool2.booleanValue();
                boolean zBooleanValue3 = bool.booleanValue();
                int iIntValue = num2.intValue();
                Map<String, Integer> mapM74001j0 = C25272z.f99163w;
                Map<String, Integer> map2 = intMap == null ? mapM74001j0 : intMap;
                boolean zBooleanValue4 = nullableBoolean != null ? nullableBoolean.booleanValue() : false;
                int iIntValue2 = num.intValue();
                if (map != null) {
                    mapM74001j0 = AbstractC25247g0.m74001j0(map);
                }
                return new Poll(str3, str2, str, list4, votingVisibility, zBooleanValue, nullableInt, zBooleanValue2, zBooleanValue3, iIntValue, map2, r24, listM74093D1, date4, date3, zBooleanValue4, iIntValue2, arrayList2, user2, mapM74001j0);
            }
            String str4 = strNextString;
            String strNextName = reader.nextName();
            if (strNextName != null) {
                switch (strNextName.hashCode()) {
                    case -1724546052:
                        if (strNextName.equals("description")) {
                            strNextString3 = reader.nextString();
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                            boolValueOf3 = bool;
                            boolValueOf2 = bool2;
                            boolValueOf = bool3;
                            list = list4;
                        }
                        strNextString2 = str2;
                        break;
                    case -1597527681:
                        if (strNextName.equals("allow_answers")) {
                            boolValueOf3 = Boolean.valueOf(reader.mo16729h());
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                        }
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -1588957910:
                        if (strNextName.equals("voting_visibility")) {
                            nullableString = JsonParsingUtils.INSTANCE.readNullableString(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -1249474914:
                        if (strNextName.equals("options")) {
                            list = JsonParsingUtils.INSTANCE.parseList(reader, this.optionAdapter);
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                            boolValueOf3 = bool;
                            boolValueOf2 = bool2;
                            boolValueOf = bool3;
                        }
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -893481439:
                        if (strNextName.equals("is_closed")) {
                            nullableBoolean = JsonParsingUtils.INSTANCE.readNullableBoolean(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -792587625:
                        if (strNextName.equals("max_votes_allowed")) {
                            nullableInt = JsonParsingUtils.INSTANCE.readNullableInt(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -295464393:
                        if (strNextName.equals("updated_at")) {
                            date2 = (Date) this.dateAdapter.fromJson(reader);
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                        }
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case -149626672:
                        if (strNextName.equals("own_votes")) {
                            parsedVotesList = parseParsedVotesList(reader);
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                        }
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 3355:
                        if (strNextName.equals("id")) {
                            strNextString = reader.nextString();
                        }
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 3373707:
                        if (strNextName.equals("name")) {
                            strNextString2 = reader.nextString();
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                            boolValueOf3 = bool;
                            boolValueOf2 = bool2;
                            boolValueOf = bool3;
                            list = list4;
                            strNextString3 = str;
                        }
                        break;
                    case 453394647:
                        if (strNextName.equals("vote_counts_by_option")) {
                            intMap = JsonParsingUtils.INSTANCE.parseIntMap(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 704477117:
                        if (strNextName.equals("latest_answers")) {
                            parsedVotesList2 = parseParsedVotesList(reader);
                            strNextString = str4;
                        }
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 826357700:
                        if (strNextName.equals("allow_user_suggested_options")) {
                            boolValueOf2 = Boolean.valueOf(reader.mo16729h());
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                            boolValueOf3 = bool;
                        }
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1263567045:
                        if (strNextName.equals("answers_count")) {
                            numValueOf2 = Integer.valueOf(reader.nextInt());
                            strNextString = str4;
                            parsedVotesList2 = list2;
                        }
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1369680106:
                        if (strNextName.equals("created_at")) {
                            date = (Date) this.dateAdapter.fromJson(reader);
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                        }
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1369680142:
                        if (strNextName.equals("created_by")) {
                            user2 = (User) this.userAdapter.fromJson(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1803343291:
                        if (strNextName.equals("enforce_unique_vote")) {
                            boolValueOf = Boolean.valueOf(reader.mo16729h());
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                            numValueOf = num2;
                            boolValueOf3 = bool;
                            boolValueOf2 = bool2;
                        }
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1898647215:
                        if (strNextName.equals("latest_votes_by_option")) {
                            parsedVotesMap = parseParsedVotesMap(reader);
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 1951892972:
                        if (strNextName.equals("created_by_id")) {
                            reader.skipValue();
                        }
                        strNextString = str4;
                        parsedVotesList2 = list2;
                        numValueOf2 = num;
                        date2 = date3;
                        date = date4;
                        parsedVotesList = list3;
                        numValueOf = num2;
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    case 2082975610:
                        if (strNextName.equals("vote_count")) {
                            numValueOf = Integer.valueOf(reader.nextInt());
                            strNextString = str4;
                            parsedVotesList2 = list2;
                            numValueOf2 = num;
                            date2 = date3;
                            date = date4;
                            parsedVotesList = list3;
                        }
                        boolValueOf3 = bool;
                        boolValueOf2 = bool2;
                        boolValueOf = bool3;
                        list = list4;
                        strNextString3 = str;
                        strNextString2 = str2;
                        break;
                    default:
                        break;
                }
            }
            JsonParsingUtils jsonParsingUtils2 = JsonParsingUtils.INSTANCE;
            AbstractC22676k.m65747g(strNextName);
            mapAccumulateExtraData = jsonParsingUtils2.accumulateExtraData(strNextName, reader, mapAccumulateExtraData);
            strNextString = str4;
            parsedVotesList2 = list2;
            numValueOf2 = num;
            date2 = date3;
            date = date4;
            parsedVotesList = list3;
            numValueOf = num2;
            boolValueOf3 = bool;
            boolValueOf2 = bool2;
            boolValueOf = bool3;
            list = list4;
            strNextString3 = str;
            strNextString2 = str2;
        }
    }

    public final void toJson(AbstractC30704c0 p13, Poll p14) {
        AbstractC22676k.m65750j(p13, "p0");
        throw new IllegalStateException("Serialization not supported for direct-to-domain path");
    }
}
