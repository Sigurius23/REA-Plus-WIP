package iy2;

import c13.AbstractC3855a;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.whooplabs.data.remote.domain.dto.bff.ScreeningSubmissionResponse;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ex2.C13731b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import nz2.AbstractC27308b;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import vy2.C36604b;
import vy2.C36605c;
import vy2.C36607e;
import vy2.EnumC36608f;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: iy2.c */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002.0B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJM\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b*\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016*\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J?\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b*\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b#\u0010$JO\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b*\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J!\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u000b¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, m65681d2 = {"Liy2/c;", "", "Lex2/b;", "labsCampaignRepository", "Ltr2/n;", "logger", "<init>", "(Lex2/b;Ltr2/n;)V", "", "campaignId", "sessionId", "Lec3/l;", "Liy2/c$b;", "o", "(ILjava/lang/Integer;)Lec3/l;", "Liy2/c$a;", "internalState", "Liy2/b;", "p", "(Liy2/c$a;Lq83/d;)Ljava/lang/Object;", "Lvy2/e;", "question", "", "", "existingAnswers", "l", "(Lvy2/e;ILjava/lang/Integer;Ljava/util/Set;)Liy2/b;", "", "", "questionId", "newAnswer", "r", "(Ljava/util/Map;ILjava/util/List;)Ljava/util/Map;", "k", "(Ljava/util/Map;I)Ljava/util/Set;", "j", "(Ljava/util/Map;I)Ljava/util/Map;", "optionKey", "", "isSelected", "q", "(Ljava/util/Map;ILjava/lang/String;Z)Ljava/util/Map;", "Liy2/a;", "upstream", "n", "(Lec3/l;)Lec3/l;", "a", "Lex2/b;", "b", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21036c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13731b labsCampaignRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: iy2.c$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, m65681d2 = {"Liy2/c$b;", "", "<init>", "()V", "d", "c", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "a", "e", "f", "b", "g", "j", "i", "Liy2/c$b$a;", "Liy2/c$b$b;", "Liy2/c$b$c;", "Liy2/c$b$d;", "Liy2/c$b$e;", "Liy2/c$b$f;", "Liy2/c$b$g;", "Liy2/c$b$h;", "Liy2/c$b$i;", "Liy2/c$b$j;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: iy2.c$b$a */
        @Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Liy2/c$b$a;", "Liy2/c$b;", "", "campaignId", "Lvy2/b;", "campaignScreeningInfo", "<init>", "(ILvy2/b;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lvy2/b;", "()Lvy2/b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class a extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int campaignId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C36604b campaignScreeningInfo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i13, C36604b campaignScreeningInfo) {
                super(null);
                AbstractC22676k.m65750j(campaignScreeningInfo, "campaignScreeningInfo");
                this.campaignId = i13;
                this.campaignScreeningInfo = campaignScreeningInfo;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C36604b getCampaignScreeningInfo() {
                return this.campaignScreeningInfo;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return this.campaignId == aVar.campaignId && AbstractC22676k.m65745e(this.campaignScreeningInfo, aVar.campaignScreeningInfo);
            }

            public int hashCode() {
                return this.campaignScreeningInfo.hashCode() + (Integer.hashCode(this.campaignId) * 31);
            }

            public String toString() {
                return "CampaignScreeningLoaded(campaignId=" + this.campaignId + ", campaignScreeningInfo=" + this.campaignScreeningInfo + ")";
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Liy2/c$b$b;", "Liy2/c$b;", "", "questionId", "", "optionKey", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "Z", "()Z", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C41810b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int questionId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String optionKey;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final boolean isSelected;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41810b(int i13, String optionKey, boolean z4) {
                super(null);
                AbstractC22676k.m65750j(optionKey, "optionKey");
                this.questionId = i13;
                this.optionKey = optionKey;
                this.isSelected = z4;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOptionKey() {
                return this.optionKey;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getQuestionId() {
                return this.questionId;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C41810b)) {
                    return false;
                }
                C41810b c41810b = (C41810b) other;
                return this.questionId == c41810b.questionId && AbstractC22676k.m65745e(this.optionKey, c41810b.optionKey) && this.isSelected == c41810b.isSelected;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + AbstractC11266d.m30450d(Integer.hashCode(this.questionId) * 31, 31, this.optionKey);
            }

            public String toString() {
                int i13 = this.questionId;
                String str = this.optionKey;
                return AbstractC18489d0.m53372m(AbstractC18489d0.m53373n(i13, "CheckOptionToggled(questionId=", ", optionKey=", str, ", isSelected="), this.isSelected, ")");
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$c */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Liy2/c$b$c;", "Liy2/c$b;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int campaignId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final Integer sessionId;

            public c(int i13, Integer num) {
                super(null);
                this.campaignId = i13;
                this.sessionId = num;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getSessionId() {
                return this.sessionId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return this.campaignId == cVar.campaignId && AbstractC22676k.m65745e(this.sessionId, cVar.sessionId);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.campaignId) * 31;
                Integer num = this.sessionId;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "ErrorLoadingCampaignScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$d */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liy2/c$b$d;", "Liy2/c$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a */
            public static final d f79708a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$e */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liy2/c$b$e;", "Liy2/c$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class e extends b {

            /* JADX INFO: renamed from: a */
            public static final e f79709a = new e();

            private e() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$f */
        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\t¨\u0006\u0015"}, m65681d2 = {"Liy2/c$b$f;", "Liy2/c$b;", "", "questionId", "", "optionKey", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int questionId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String optionKey;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(int i13, String optionKey) {
                super(null);
                AbstractC22676k.m65750j(optionKey, "optionKey");
                this.questionId = i13;
                this.optionKey = optionKey;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOptionKey() {
                return this.optionKey;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getQuestionId() {
                return this.questionId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof f)) {
                    return false;
                }
                f fVar = (f) other;
                return this.questionId == fVar.questionId && AbstractC22676k.m65745e(this.optionKey, fVar.optionKey);
            }

            public int hashCode() {
                return this.optionKey.hashCode() + (Integer.hashCode(this.questionId) * 31);
            }

            public String toString() {
                return AbstractC30007c.m91838h(this.questionId, "RadioOptionSelected(questionId=", ", optionKey=", this.optionKey, ")");
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$g */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liy2/c$b$g;", "Liy2/c$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class g extends b {

            /* JADX INFO: renamed from: a */
            public static final g f79712a = new g();

            private g() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$h */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Liy2/c$b$h;", "Liy2/c$b;", "", "campaignId", "sessionId", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int campaignId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final Integer sessionId;

            public h(int i13, Integer num) {
                super(null);
                this.campaignId = i13;
                this.sessionId = num;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Integer getSessionId() {
                return this.sessionId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof h)) {
                    return false;
                }
                h hVar = (h) other;
                return this.campaignId == hVar.campaignId && AbstractC22676k.m65745e(this.sessionId, hVar.sessionId);
            }

            public int hashCode() {
                int iHashCode = Integer.hashCode(this.campaignId) * 31;
                Integer num = this.sessionId;
                return iHashCode + (num == null ? 0 : num.hashCode());
            }

            public String toString() {
                return "SkipScreening(campaignId=" + this.campaignId + ", sessionId=" + this.sessionId + ")";
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$i */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Liy2/c$b$i;", "Liy2/c$b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "screeningSubmissionResponse", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/ScreeningSubmissionResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i extends b {

            /* JADX INFO: renamed from: b */
            public static final int f79715b = C9598e.f28134d;

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final ScreeningSubmissionResponse screeningSubmissionResponse;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(ScreeningSubmissionResponse screeningSubmissionResponse) {
                super(null);
                AbstractC22676k.m65750j(screeningSubmissionResponse, "screeningSubmissionResponse");
                this.screeningSubmissionResponse = screeningSubmissionResponse;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ScreeningSubmissionResponse getScreeningSubmissionResponse() {
                return this.screeningSubmissionResponse;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof i) && AbstractC22676k.m65745e(this.screeningSubmissionResponse, ((i) other).screeningSubmissionResponse);
            }

            public int hashCode() {
                return this.screeningSubmissionResponse.hashCode();
            }

            public String toString() {
                return "SubmittedSuccessFully(screeningSubmissionResponse=" + this.screeningSubmissionResponse + ")";
            }
        }

        /* JADX INFO: renamed from: iy2.c$b$j */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Liy2/c$b$j;", "Liy2/c$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class j extends b {

            /* JADX INFO: renamed from: a */
            public static final j f79717a = new j();

            private j() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: iy2.c$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f79718a;

        static {
            int[] iArr = new int[EnumC36608f.values().length];
            try {
                iArr[EnumC36608f.RADIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36608f.CHECKMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f79718a = iArr;
        }
    }

    /* JADX INFO: renamed from: iy2.c$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$interact$$inlined$flatMapLatest$1", m100430f = "CampaignScreeningInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79719w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79720x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79721y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21036c f79722z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC30057d interfaceC30057d, C21036c c21036c) {
            super(3, interfaceC30057d);
            this.f79722z = c21036c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC21034a abstractC21034a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            d dVar = new d(interfaceC30057d, this.f79722z);
            dVar.f79720x = interfaceC13062m;
            dVar.f79721y = abstractC21034a;
            return dVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            C0456u c0456u2;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79719w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f79720x;
                AbstractC21034a abstractC21034a = (AbstractC21034a) this.f79721y;
                if (abstractC21034a instanceof AbstractC21034a.a) {
                    AbstractC21034a.a aVar = (AbstractC21034a.a) abstractC21034a;
                    c0456u = this.f79722z.m58753o(aVar.getCampaignId(), aVar.getSessionId());
                } else {
                    if (AbstractC22676k.m65745e(abstractC21034a, AbstractC21034a.b.f79660a)) {
                        c0456u2 = new C0456u(b.e.f79709a, 1);
                    } else if (abstractC21034a instanceof AbstractC21034a.d) {
                        AbstractC21034a.d dVar = (AbstractC21034a.d) abstractC21034a;
                        c0456u = new C0456u(new b.f(dVar.getQuestionId(), dVar.getOptionKey()), 1);
                    } else if (abstractC21034a instanceof AbstractC21034a.f) {
                        AbstractC21034a.f fVar = (AbstractC21034a.f) abstractC21034a;
                        c0456u = new C0456u(new b.C41810b(fVar.getQuestionId(), fVar.getOptionKey(), fVar.getIsSelected()), 1);
                    } else if (AbstractC22676k.m65745e(abstractC21034a, AbstractC21034a.c.f79661a)) {
                        c0456u2 = new C0456u(b.g.f79712a, 1);
                    } else {
                        if (!(abstractC21034a instanceof AbstractC21034a.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c0456u = new C0456u(new b.i(((AbstractC21034a.e) abstractC21034a).getScreeningSubmissionResponse()), 1);
                    }
                    c0456u = c0456u2;
                }
                this.f79720x = null;
                this.f79721y = null;
                this.f79719w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c0456u, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC21034a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: iy2.c$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$interact$$inlined$transform$1", m100430f = "CampaignScreeningInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f79723w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f79724x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f79725y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C21036c f79726z;

        /* JADX INFO: renamed from: iy2.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f79727w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21036c f79728x;

            /* JADX INFO: renamed from: iy2.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$interact$$inlined$transform$1$1", m100430f = "CampaignScreeningInteractor.kt", m100431l = {41, 42, 42, 46}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41811a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f79729E;

                /* JADX INFO: renamed from: F */
                Object f79730F;

                /* JADX INFO: renamed from: G */
                Object f79731G;

                /* JADX INFO: renamed from: H */
                Object f79732H;

                /* JADX INFO: renamed from: I */
                int f79733I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f79734w;

                /* JADX INFO: renamed from: x */
                int f79735x;

                /* JADX INFO: renamed from: z */
                Object f79737z;

                public C41811a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f79734w = obj;
                    this.f79735x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21036c c21036c) {
                this.f79728x = c21036c;
                this.f79727w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[PHI: r2 r10 r11
              0x00b0: PHI (r2v7 ec3.m) = (r2v6 ec3.m), (r2v11 ec3.m) binds: [B:27:0x00ad, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
              0x00b0: PHI (r10v6 int) = (r10v5 int), (r10v10 int) binds: [B:27:0x00ad, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]
              0x00b0: PHI (r11v5 java.lang.Object) = (r11v4 java.lang.Object), (r11v1 java.lang.Object) binds: [B:27:0x00ad, B:18:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
            
                if (r11.emit(r10, r0) == r1) goto L34;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r10, q83.InterfaceC30057d<? super l83.C23454a0> r11) {
                /*
                    Method dump skipped, instruction units count: 223
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: iy2.C21036c.e.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d, C21036c c21036c) {
            super(2, interfaceC30057d);
            this.f79725y = interfaceC13058l;
            this.f79726z = c21036c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f79725y, interfaceC30057d, this.f79726z);
            eVar.f79724x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f79723w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f79724x;
                InterfaceC13058l interfaceC13058l = this.f79725y;
                a aVar = new a(interfaceC13062m, this.f79726z);
                this.f79724x = null;
                this.f79723w = 1;
                if (interfaceC13058l.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: iy2.c$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$interact$2", m100430f = "CampaignScreeningInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Liy2/c$a;", "internalState", "Liy2/c$b;", "action", "<anonymous>", "(Liy2/c$a;Liy2/c$b;)Liy2/c$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f79738w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79739x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f79740y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
            f fVar = C21036c.this.new f(interfaceC30057d);
            fVar.f79739x = aVar;
            fVar.f79740y = bVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f79739x;
            b bVar = (b) this.f79740y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f79738w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (AbstractC22676k.m65745e(bVar, b.d.f79708a)) {
                return a.m58758b(aVar, AbstractC21035b.d.f79674a, null, null, null, null, null, 0, 126, null);
            }
            if (bVar instanceof b.c) {
                b.c cVar = (b.c) bVar;
                return a.m58758b(aVar, new AbstractC21035b.b(cVar.getCampaignId(), cVar.getSessionId()), null, null, null, null, null, 0, 126, null);
            }
            if (bVar instanceof b.h) {
                b.h hVar = (b.h) bVar;
                return a.m58758b(aVar, new AbstractC21035b.f(hVar.getCampaignId(), hVar.getSessionId()), null, null, null, null, null, 0, 126, null);
            }
            if (bVar instanceof b.a) {
                b.a aVar2 = (b.a) bVar;
                C36607e c36607e = (C36607e) AbstractC25265s.m74096F0(aVar2.getCampaignScreeningInfo().m117581b());
                int campaignId = aVar2.getCampaignId();
                int sessionId = aVar2.getCampaignScreeningInfo().getSessionId();
                List<C36607e> listM117581b = aVar2.getCampaignScreeningInfo().m117581b();
                Map mapM58749j = C21036c.this.m58749j(aVar.m58766i(), c36607e.getId());
                return a.m58758b(aVar, C21036c.m58752m(C21036c.this, c36607e, aVar2.getCampaignId(), new Integer(aVar2.getCampaignScreeningInfo().getSessionId()), null, 8, null), new Integer(campaignId), new Integer(sessionId), listM117581b, mapM58749j, aVar2.getCampaignScreeningInfo().getConfig(), 0, 64, null);
            }
            if (AbstractC22676k.m65745e(bVar, b.e.f79709a)) {
                if (aVar.getCurrentQuestion() + 1 == aVar.m58765h().size()) {
                    C36605c config = aVar.getConfig();
                    AbstractC22676k.m65747g(config);
                    return a.m58758b(aVar, new AbstractC21035b.i(config), null, null, null, null, null, 0, 126, null);
                }
                C36607e c36607e2 = aVar.m58765h().get(aVar.getCurrentQuestion() + 1);
                Map mapM58749j2 = C21036c.this.m58749j(aVar.m58766i(), c36607e2.getId());
                Set setM58750k = C21036c.this.m58750k(mapM58749j2, c36607e2.getId());
                C21036c c21036c = C21036c.this;
                Integer campaignId2 = aVar.getCampaignId();
                AbstractC22676k.m65747g(campaignId2);
                return a.m58758b(aVar, c21036c.m58751l(c36607e2, campaignId2.intValue(), aVar.getSessionId(), setM58750k), null, null, null, mapM58749j2, null, aVar.getCurrentQuestion() + 1, 46, null);
            }
            if (AbstractC22676k.m65745e(bVar, b.j.f79717a) || AbstractC22676k.m65745e(bVar, b.g.f79712a)) {
                C36605c config2 = aVar.getConfig();
                AbstractC22676k.m65747g(config2);
                return a.m58758b(aVar, new AbstractC21035b.i(config2), null, null, null, null, null, 0, 126, null);
            }
            if (bVar instanceof b.i) {
                Integer campaignId3 = aVar.getCampaignId();
                AbstractC22676k.m65747g(campaignId3);
                int iIntValue = campaignId3.intValue();
                Integer sessionId2 = aVar.getSessionId();
                AbstractC22676k.m65747g(sessionId2);
                b.i iVar = (b.i) bVar;
                return a.m58758b(aVar, new AbstractC21035b.g(iIntValue, sessionId2.intValue(), iVar.getScreeningSubmissionResponse().getIcon(), iVar.getScreeningSubmissionResponse().getIconColor(), iVar.getScreeningSubmissionResponse().getContent(), iVar.getScreeningSubmissionResponse().getCta(), iVar.getScreeningSubmissionResponse().getBackgroundUrl(), iVar.getScreeningSubmissionResponse().getNavigation()), null, null, null, null, null, 0, 126, null);
            }
            if (bVar instanceof b.f) {
                b.f fVar = (b.f) bVar;
                return a.m58758b(aVar, new AbstractC21035b.e(aVar.m58763f(), fVar.getOptionKey()), null, null, null, C21036c.this.m58756r(aVar.m58766i(), fVar.getQuestionId(), AbstractC37056f.m118958J(fVar.getOptionKey())), null, 0, 110, null);
            }
            if (!(bVar instanceof b.C41810b)) {
                throw new NoWhenBranchMatchedException();
            }
            b.C41810b c41810b = (b.C41810b) bVar;
            Map mapM58755q = C21036c.this.m58755q(aVar.m58766i(), c41810b.getQuestionId(), c41810b.getOptionKey(), c41810b.getIsSelected());
            return a.m58758b(aVar, new AbstractC21035b.a(aVar.m58763f(), C21036c.this.m58750k(mapM58755q, c41810b.getQuestionId())), null, null, null, mapM58755q, null, 0, 110, null);
        }
    }

    /* JADX INFO: renamed from: iy2.c$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor$loadCampaignScreening$1", m100430f = "CampaignScreeningInteractor.kt", m100431l = {158, 160, 165, 169, 174}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Liy2/c$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ int f79742E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ Integer f79743F;

        /* JADX INFO: renamed from: w */
        Object f79744w;

        /* JADX INFO: renamed from: x */
        int f79745x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f79746y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(int i13, Integer num, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f79742E = i13;
            this.f79743F = num;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            g gVar = C21036c.this.new g(this.f79742E, this.f79743F, interfaceC30057d);
            gVar.f79746y = obj;
            return gVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
        
            if (r13 == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
        
            if (r13 == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00ef, code lost:
        
            if (r0.emit(r13, r12) == r1) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0128, code lost:
        
            if (r0.emit(r2, r12) == r1) goto L39;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: iy2.C21036c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: iy2.c$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.interactor.CampaignScreeningInteractor", m100430f = "CampaignScreeningInteractor.kt", m100431l = {181}, m100432m = "submitScreening", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f79748w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f79749x;

        /* JADX INFO: renamed from: z */
        int f79751z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f79749x = obj;
            this.f79751z |= Integer.MIN_VALUE;
            return C21036c.this.m58754p(null, this);
        }
    }

    public C21036c(C13731b labsCampaignRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labsCampaignRepository, "labsCampaignRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.labsCampaignRepository = labsCampaignRepository;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final Map<Integer, List<String>> m58749j(Map<Integer, ? extends List<String>> map, int i13) {
        return !map.containsKey(Integer.valueOf(i13)) ? m58756r(map, i13, C25271y.f99162w) : map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Set<String> m58750k(Map<Integer, ? extends List<String>> map, int i13) {
        List<String> list = map.get(Integer.valueOf(i13));
        return list != null ? AbstractC25265s.m74101H1(list) : new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final AbstractC21035b m58751l(C36607e question, int campaignId, Integer sessionId, Set<String> existingAnswers) {
        int i13 = c.f79718a[question.getType().ordinal()];
        if (i13 == 1) {
            return new AbstractC21035b.e(question, (String) AbstractC25265s.m74098G0(existingAnswers));
        }
        if (i13 == 2) {
            return new AbstractC21035b.a(question, existingAnswers);
        }
        this.logger.mo85222m("Cannot parse question, unknown type", new AbstractC30556a.a[0]);
        return new AbstractC21035b.b(campaignId, sessionId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ AbstractC21035b m58752m(C21036c c21036c, C36607e c36607e, int i13, Integer num, Set set, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            set = new LinkedHashSet();
        }
        return c21036c.m58751l(c36607e, i13, num, set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m58753o(int campaignId, Integer sessionId) {
        return new C13084s1(new g(campaignId, sessionId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m58754p(a aVar, InterfaceC30057d<? super AbstractC21035b> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f79751z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f79751z = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM38980r = hVar.f79749x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f79751z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM38980r);
            this.logger.mo85216g("Submitting screening for " + aVar.getSessionId() + ", " + aVar.m58766i(), new AbstractC30556a.a[0]);
            C13731b c13731b = this.labsCampaignRepository;
            Integer sessionId = aVar.getSessionId();
            AbstractC22676k.m65747g(sessionId);
            int iIntValue = sessionId.intValue();
            Map<Integer, List<String>> mapM58766i = aVar.m58766i();
            hVar.f79748w = aVar;
            hVar.f79751z = 1;
            objM38980r = c13731b.m38980r(iIntValue, mapM58766i, hVar);
            if (objM38980r == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (a) hVar.f79748w;
            AbstractC34132o.m107864I(objM38980r);
        }
        ScreeningSubmissionResponse screeningSubmissionResponse = (ScreeningSubmissionResponse) objM38980r;
        if (screeningSubmissionResponse == null) {
            C36605c config = aVar.getConfig();
            AbstractC22676k.m65747g(config);
            return new AbstractC21035b.c(config);
        }
        C36605c config2 = aVar.getConfig();
        AbstractC22676k.m65747g(config2);
        return new AbstractC21035b.h(config2, screeningSubmissionResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final Map<Integer, List<String>> m58755q(Map<Integer, ? extends List<String>> map, int i13, String str, boolean z4) {
        Set<String> setM58750k = m58750k(map, i13);
        if (z4) {
            setM58750k.add(str);
        } else {
            setM58750k.remove(str);
        }
        return m58756r(map, i13, AbstractC25265s.m74093D1(setM58750k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final Map<Integer, List<String>> m58756r(Map<Integer, ? extends List<String>> map, int i13, List<String> list) {
        return AbstractC25247g0.m73996e0(map, new C23465k(Integer.valueOf(i13), list));
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m58757n(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36610t(new C13084s1(new e(new C13060l1(new a(AbstractC21035b.d.f79674a, null, null, null, null, null, 0, 126, null), AbstractC13091v.m36590P(upstream, new d(null, this)), new f(null)), null, this)));
    }

    public /* synthetic */ C21036c(C13731b c13731b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c13731b, (i13 & 2) != 0 ? AbstractC27308b.m82458a("CampaignScreeningInteractor") : interfaceC34116n);
    }

    /* JADX INFO: renamed from: iy2.c$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013Jt\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b%\u0010$R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010.\u001a\u0004\b&\u0010/R\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b*\u0010\u0019¨\u00061"}, m65681d2 = {"Liy2/c$a;", "", "Liy2/b;", "domainState", "", "campaignId", "sessionId", "", "Lvy2/e;", "questions", "", "", "responses", "Lvy2/c;", "config", "currentQuestion", "<init>", "(Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;I)V", "f", "()Lvy2/e;", "a", "(Liy2/b;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lvy2/c;I)Liy2/c$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy2/b;", "g", "()Liy2/b;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "j", "d", "Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()Ljava/util/List;", "e", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "Lvy2/c;", "()Lvy2/c;", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC21035b domainState;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final Integer campaignId;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final Integer sessionId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final List<C36607e> questions;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final Map<Integer, List<String>> responses;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final C36605c config;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final int currentQuestion;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC21035b domainState, Integer num, Integer num2, List<C36607e> questions, Map<Integer, ? extends List<String>> responses, C36605c c36605c, int i13) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(questions, "questions");
            AbstractC22676k.m65750j(responses, "responses");
            this.domainState = domainState;
            this.campaignId = num;
            this.sessionId = num2;
            this.questions = questions;
            this.responses = responses;
            this.config = c36605c;
            this.currentQuestion = i13;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m58758b(a aVar, AbstractC21035b abstractC21035b, Integer num, Integer num2, List list, Map map, C36605c c36605c, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                abstractC21035b = aVar.domainState;
            }
            if ((i14 & 2) != 0) {
                num = aVar.campaignId;
            }
            if ((i14 & 4) != 0) {
                num2 = aVar.sessionId;
            }
            if ((i14 & 8) != 0) {
                list = aVar.questions;
            }
            if ((i14 & 16) != 0) {
                map = aVar.responses;
            }
            if ((i14 & 32) != 0) {
                c36605c = aVar.config;
            }
            if ((i14 & 64) != 0) {
                i13 = aVar.currentQuestion;
            }
            C36605c c36605c2 = c36605c;
            int i15 = i13;
            Map map2 = map;
            Integer num3 = num2;
            return aVar.m58759a(abstractC21035b, num, num3, list, map2, c36605c2, i15);
        }

        /* JADX INFO: renamed from: a */
        public final a m58759a(AbstractC21035b domainState, Integer campaignId, Integer sessionId, List<C36607e> questions, Map<Integer, ? extends List<String>> responses, C36605c config, int currentQuestion) {
            AbstractC22676k.m65750j(domainState, "domainState");
            AbstractC22676k.m65750j(questions, "questions");
            AbstractC22676k.m65750j(responses, "responses");
            return new a(domainState, campaignId, sessionId, questions, responses, config, currentQuestion);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getCampaignId() {
            return this.campaignId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final C36605c getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getCurrentQuestion() {
            return this.currentQuestion;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.domainState, aVar.domainState) && AbstractC22676k.m65745e(this.campaignId, aVar.campaignId) && AbstractC22676k.m65745e(this.sessionId, aVar.sessionId) && AbstractC22676k.m65745e(this.questions, aVar.questions) && AbstractC22676k.m65745e(this.responses, aVar.responses) && AbstractC22676k.m65745e(this.config, aVar.config) && this.currentQuestion == aVar.currentQuestion;
        }

        /* JADX INFO: renamed from: f */
        public final C36607e m58763f() {
            return this.questions.get(this.currentQuestion);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final AbstractC21035b getDomainState() {
            return this.domainState;
        }

        /* JADX INFO: renamed from: h */
        public final List<C36607e> m58765h() {
            return this.questions;
        }

        public int hashCode() {
            int iHashCode = this.domainState.hashCode() * 31;
            Integer num = this.campaignId;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.sessionId;
            int iM11821e = AbstractC3855a.m11821e(this.responses, AbstractC11895b.m31983b((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.questions), 31);
            C36605c c36605c = this.config;
            return Integer.hashCode(this.currentQuestion) + ((iM11821e + (c36605c != null ? c36605c.hashCode() : 0)) * 31);
        }

        /* JADX INFO: renamed from: i */
        public final Map<Integer, List<String>> m58766i() {
            return this.responses;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getSessionId() {
            return this.sessionId;
        }

        public String toString() {
            AbstractC21035b abstractC21035b = this.domainState;
            Integer num = this.campaignId;
            Integer num2 = this.sessionId;
            List<C36607e> list = this.questions;
            Map<Integer, List<String>> map = this.responses;
            C36605c c36605c = this.config;
            int i13 = this.currentQuestion;
            StringBuilder sb4 = new StringBuilder("Accumulator(domainState=");
            sb4.append(abstractC21035b);
            sb4.append(", campaignId=");
            sb4.append(num);
            sb4.append(", sessionId=");
            sb4.append(num2);
            sb4.append(", questions=");
            sb4.append(list);
            sb4.append(", responses=");
            sb4.append(map);
            sb4.append(", config=");
            sb4.append(c36605c);
            sb4.append(", currentQuestion=");
            return AbstractC18489d0.m53371l(sb4, i13, ")");
        }

        public /* synthetic */ a(AbstractC21035b abstractC21035b, Integer num, Integer num2, List list, Map map, C36605c c36605c, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC21035b, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? C25271y.f99162w : list, (i14 & 16) != 0 ? C25272z.f99163w : map, (i14 & 32) != 0 ? null : c36605c, (i14 & 64) != 0 ? 0 : i13);
        }
    }
}
