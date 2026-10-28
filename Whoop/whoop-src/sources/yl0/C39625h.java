package yl0;

import c93.InterfaceC4351m;
import com.whoop.bot.api.CommitJournalEntryApi;
import com.whoop.bot.domain.chatminiarchwidget.CommitJournalEntryRequestBody;
import com.whoop.bot.domain.chatminiarchwidget.CommitJournalEntryResponse;
import ec3.C13060l1;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.time.Instant;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import te0.AbstractC33745d;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: yl0.h */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lyl0/h;", "Lod1/g;", "Lyl0/f;", "Lyl0/g;", "Lcom/whoop/bot/api/CommitJournalEntryApi;", "api", "Ltr2/n;", "logger", "initialState", "<init>", "(Lcom/whoop/bot/api/CommitJournalEntryApi;Ltr2/n;Lyl0/g;)V", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/bot/api/CommitJournalEntryApi;", "b", "Ltr2/n;", "c", "Lyl0/g;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39625h implements InterfaceC27844g<AbstractC39623f, C39624g> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final CommitJournalEntryApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39624g initialState;

    /* JADX INFO: renamed from: yl0.h$a */
    @Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lyl0/h$a;", "", "f", "g", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "i", "e", "d", "c", "b", "a", "Lyl0/h$a$a;", "Lyl0/h$a$b;", "Lyl0/h$a$c;", "Lyl0/h$a$d;", "Lyl0/h$a$e;", "Lyl0/h$a$f;", "Lyl0/h$a$g;", "Lyl0/h$a$h;", "Lyl0/h$a$i;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public interface a {

        /* JADX INFO: renamed from: yl0.h$a$a, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$a;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42700a implements a {

            /* JADX INFO: renamed from: a */
            public static final C42700a f170436a = new C42700a();

            private C42700a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C42700a);
            }

            public int hashCode() {
                return 1505705035;
            }

            public String toString() {
                return "ClearCommitSucceeded";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$b */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$b;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a */
            public static final b f170437a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -216143925;
            }

            public String toString() {
                return "ClearFollowup";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$c */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$c;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a */
            public static final c f170438a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -14404976;
            }

            public String toString() {
                return "CommitExecute";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$d */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$d;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class d implements a {

            /* JADX INFO: renamed from: a */
            public static final d f170439a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1641815127;
            }

            public String toString() {
                return "CommitLoading";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$e */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$e;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e implements a {

            /* JADX INFO: renamed from: a */
            public static final e f170440a = new e();

            private e() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            public int hashCode() {
                return 2080374955;
            }

            public String toString() {
                return "DismissMagnitudeSheet";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$f */
        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m65681d2 = {"Lyl0/h$a$f;", "Lyl0/h$a;", "", "answeredYes", "<init>", "(Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final Boolean answeredYes;

            public f(Boolean bool) {
                this.answeredYes = bool;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Boolean getAnsweredYes() {
                return this.answeredYes;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && AbstractC22676k.m65745e(this.answeredYes, ((f) other).answeredYes);
            }

            public int hashCode() {
                Boolean bool = this.answeredYes;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public String toString() {
                return AbstractC33745d.m106651j("SetAnswer(answeredYes=", this.answeredYes, ")");
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$g */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lyl0/h$a$g;", "Lyl0/h$a;", "", "magnitudeValue", "<init>", "(D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final double magnitudeValue;

            public g(double d3) {
                this.magnitudeValue = d3;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final double getMagnitudeValue() {
                return this.magnitudeValue;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && Double.compare(this.magnitudeValue, ((g) other).magnitudeValue) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.magnitudeValue);
            }

            public String toString() {
                return "SetMagnitude(magnitudeValue=" + this.magnitudeValue + ")";
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$h */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lyl0/h$a$h;", "Lyl0/h$a;", "", "timeValue", "<init>", "(J)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h implements a {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final long timeValue;

            public h(long j7) {
                this.timeValue = j7;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final long getTimeValue() {
                return this.timeValue;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && this.timeValue == ((h) other).timeValue;
            }

            public int hashCode() {
                return Long.hashCode(this.timeValue);
            }

            public String toString() {
                return AbstractC31061c.m95636l(this.timeValue, "SetTime(timeValue=", ")");
            }
        }

        /* JADX INFO: renamed from: yl0.h$a$i */
        @Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lyl0/h$a$i;", "Lyl0/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class i implements a {

            /* JADX INFO: renamed from: a */
            public static final i f170444a = new i();

            private i() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            public int hashCode() {
                return -1504630662;
            }

            public String toString() {
                return "ShowMagnitudeSheet";
            }
        }
    }

    /* JADX INFO: renamed from: yl0.h$b */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$$inlined$transform$1", m100430f = "JournalEntryWidgetInteractor.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"R", "Lec3/m;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f170445w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f170446x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC13058l f170447y;

        /* JADX INFO: renamed from: yl0.h$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f170448w;

            /* JADX INFO: renamed from: yl0.h$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$$inlined$transform$1$1", m100430f = "JournalEntryWidgetInteractor.kt", m100431l = {41, 44, 46, 48, 50, 52, 53, 56, 58}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42701a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f170449E;

                /* JADX INFO: renamed from: F */
                Object f170450F;

                /* JADX INFO: renamed from: G */
                Object f170451G;

                /* JADX INFO: renamed from: H */
                int f170452H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f170453w;

                /* JADX INFO: renamed from: x */
                int f170454x;

                /* JADX INFO: renamed from: z */
                Object f170456z;

                public C42701a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f170453w = obj;
                    this.f170454x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f170448w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x0125, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L57;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x015b, code lost:
            
                if (r2.emit(r8, r0) == r1) goto L57;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, q83.InterfaceC30057d<? super l83.C23454a0> r9) {
                /*
                    Method dump skipped, instruction units count: 384
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: yl0.C39625h.b.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f170447y = interfaceC13058l;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f170447y, interfaceC30057d);
            bVar.f170446x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170445w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f170446x;
                InterfaceC13058l interfaceC13058l = this.f170447y;
                a aVar = new a(interfaceC13062m);
                this.f170446x = null;
                this.f170445w = 1;
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

    /* JADX INFO: renamed from: yl0.h$c */
    @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$2", m100430f = "JournalEntryWidgetInteractor.kt", m100431l = {97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lyl0/g;", "state", "Lyl0/h$a;", "action", "<anonymous>", "(Lyl0/g;Lyl0/h$a;)Lyl0/g;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f170457w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f170458x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f170459y;

        /* JADX INFO: renamed from: yl0.h$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.bot.view.journalentrywidget.JournalEntryWidgetInteractor$interact$2$result$1", m100430f = "JournalEntryWidgetInteractor.kt", m100431l = {98}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Lcom/whoop/bot/domain/chatminiarchwidget/CommitJournalEntryResponse;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f170461w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39625h f170462x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C39624g f170463y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C39625h c39625h, C39624g c39624g, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f170462x = c39625h;
                this.f170463y = c39624g;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f170462x, this.f170463y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f170461w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                CommitJournalEntryApi commitJournalEntryApi = this.f170462x.api;
                String commitPath = this.f170463y.getCommitPath();
                Boolean answeredYes = this.f170463y.getAnsweredYes();
                Double magnitudeValue = this.f170463y.getMagnitudeValue();
                Long timeValue = this.f170463y.getTimeValue();
                CommitJournalEntryRequestBody commitJournalEntryRequestBody = new CommitJournalEntryRequestBody(answeredYes, magnitudeValue, timeValue != null ? Instant.ofEpochMilli(timeValue.longValue()).toString() : null);
                this.f170461w = 1;
                Object objCommit = commitJournalEntryApi.commit(commitPath, commitJournalEntryRequestBody, this);
                return objCommit == enumC31071a ? enumC31071a : objCommit;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super C29218v0<CommitJournalEntryResponse>> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C39624g c39624g, a aVar, InterfaceC30057d<? super C39624g> interfaceC30057d) {
            c cVar = C39625h.this.new c(interfaceC30057d);
            cVar.f170458x = c39624g;
            cVar.f170459y = aVar;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C39624g c39624g;
            Object objM108729b;
            C39624g c39624g2 = (C39624g) this.f170458x;
            a aVar = (a) this.f170459y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f170457w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                if (aVar instanceof a.f) {
                    a.f fVar = (a.f) aVar;
                    return fVar.getAnsweredYes() == null ? C39624g.m126628b(c39624g2, null, null, null, null, null, false, true, null, null, null, false, 1976, null) : C39624g.m126628b(c39624g2, fVar.getAnsweredYes(), null, null, null, null, false, false, null, null, null, false, 2046, null);
                }
                if (aVar instanceof a.g) {
                    C39618a magnitudeConfig = c39624g2.getMagnitudeConfig();
                    if (magnitudeConfig != null && !magnitudeConfig.m126595a(((a.g) aVar).getMagnitudeValue())) {
                        return C39624g.m126628b(c39624g2, null, null, null, null, null, false, false, null, null, null, false, 2015, null);
                    }
                    double magnitudeValue = ((a.g) aVar).getMagnitudeValue();
                    Boolean answeredYes = c39624g2.getAnsweredYes();
                    return C39624g.m126628b(c39624g2, Boolean.valueOf(answeredYes != null ? answeredYes.booleanValue() : true), new Double(magnitudeValue), null, null, null, false, false, null, null, null, false, 2012, null);
                }
                if (aVar instanceof a.i) {
                    return C39624g.m126628b(c39624g2, null, null, null, null, null, true, false, null, null, null, false, 2015, null);
                }
                if (aVar instanceof a.e) {
                    return C39624g.m126628b(c39624g2, null, null, null, null, null, false, false, null, null, null, false, 2015, null);
                }
                if (aVar instanceof a.h) {
                    long timeValue = ((a.h) aVar).getTimeValue();
                    Boolean answeredYes2 = c39624g2.getAnsweredYes();
                    return C39624g.m126628b(c39624g2, Boolean.valueOf(answeredYes2 != null ? answeredYes2.booleanValue() : true), null, new Long(timeValue), null, null, false, false, null, null, null, false, 2042, null);
                }
                if (aVar instanceof a.d) {
                    if (c39624g2.m126639l()) {
                        return c39624g2;
                    }
                    boolean zM65745e = AbstractC22676k.m65745e(c39624g2.getAnsweredYes(), Boolean.FALSE);
                    return C39624g.m126628b(c39624g2, null, zM65745e ? null : c39624g2.getMagnitudeValue(), zM65745e ? null : c39624g2.getTimeValue(), null, null, false, false, EnumC39622e.LOADING, null, null, false, 1913, null);
                }
                c39624g = c39624g2;
                if (!(aVar instanceof a.c)) {
                    if (aVar instanceof a.b) {
                        return C39624g.m126628b(c39624g, null, null, null, null, null, false, false, null, null, null, false, 1791, null);
                    }
                    if (aVar instanceof a.C42700a) {
                        return C39624g.m126628b(c39624g, null, null, null, null, null, false, false, null, null, null, false, 1023, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (c39624g.getButtonState() != EnumC39622e.LOADING) {
                    return c39624g;
                }
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C39625h.this.logger;
                a aVar2 = new a(C39625h.this, c39624g, null);
                this.f170458x = c39624g;
                this.f170459y = null;
                this.f170457w = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar2, this, 6, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM108729b = obj;
                c39624g = c39624g2;
            }
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                EnumC39622e enumC39622e = EnumC39622e.SUCCESS;
                CommitJournalEntryResponse commitJournalEntryResponse = (CommitJournalEntryResponse) ((C29218v0) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).f118270b;
                return C39624g.m126628b(c39624g, null, null, null, null, null, false, false, enumC39622e, commitJournalEntryResponse != null ? commitJournalEntryResponse.getFollowupMessage() : null, null, true, 639, null);
            }
            C39624g c39624g3 = c39624g;
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC34385a.b bVar = (InterfaceC34385a.b) interfaceC34385a;
            C39625h.this.logger.mo85214e("JournalEntryWidget", AbstractC31061c.m95640p("Commit failed. Path: ", c39624g3.getCommitPath(), ". ", bVar.getErrorMessage()), new AbstractC30556a.a[0]);
            return C39624g.m126628b(c39624g3, null, null, null, null, null, false, false, AbstractC39626i.m126648b(bVar), null, null, false, 1919, null);
        }
    }

    public C39625h(CommitJournalEntryApi api, InterfaceC34116n logger, C39624g initialState) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(initialState, "initialState");
        this.api = api;
        this.logger = logger;
        this.initialState = initialState;
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(this.initialState, new C13084s1(new b(upstream, null)), new c(null));
    }
}
