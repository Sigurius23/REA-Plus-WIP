package mx2;

import androidx.core.app.NotificationCompat;
import c93.InterfaceC4351m;
import com.whoop.whooplabs.C10823a;
import com.whoop.whooplabs.WhoopLabsService;
import com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse;
import com.whoop.whooplabs.p070io.HrDeviceConnection;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13060l1;
import ec3.C13081r1;
import ec3.C13084s1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.List;
import kx2.C22885b;
import l83.C23454a0;
import lc0.C23821c;
import m83.C25271y;
import mx1.C26009o;
import p000.AbstractC11266d;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22656a;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: mx2.h */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002\u001d\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u0011*\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00160\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, m65681d2 = {"Lmx2/h;", "", "Lkx2/b;", "commandFactory", "Lcom/whoop/whooplabs/a;", "serviceConnector", "<init>", "(Lkx2/b;Lcom/whoop/whooplabs/a;)V", "Lmx2/c;", "action", "Lec3/l;", "Lmx2/h$b;", "l", "(Lmx2/c;)Lec3/l;", "Lmx2/b;", "m", "(Lmx2/b;)Lec3/l;", "Lmx2/h$a;", "accumulator", NotificationCompat.CATEGORY_EVENT, "p", "(Lmx2/h$a;Lmx2/h$b;Lq83/d;)Ljava/lang/Object;", "", "deviceStatus", "k", "(Lmx2/h$a;I)Lmx2/h$a;", "upstream", "n", "(Lec3/l;)Lec3/l;", "a", "Lkx2/b;", "b", "Lcom/whoop/whooplabs/a;", "Lec3/p1;", "Lcom/whoop/whooplabs/WhoopLabsService;", "c", "Lec3/p1;", "_serviceFlow", "Lec3/f2;", "d", "Lec3/f2;", "serviceFlow", "e", "Lec3/l;", "deviceFlow", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26021h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C22885b commandFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C10823a serviceConnector;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC13075p1 _serviceFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC13037f2 serviceFlow;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC13058l deviceFlow;

    /* JADX INFO: renamed from: mx2.h$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u000e\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000e\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lmx2/h$b;", "", "<init>", "()V", "e", "g", "j", "i", "n", "a", "b", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "m", "k", "l", "d", "c", "f", "Lmx2/h$b$a;", "Lmx2/h$b$b;", "Lmx2/h$b$c;", "Lmx2/h$b$d;", "Lmx2/h$b$e;", "Lmx2/h$b$f;", "Lmx2/h$b$g;", "Lmx2/h$b$h;", "Lmx2/h$b$i;", "Lmx2/h$b$j;", "Lmx2/h$b$k;", "Lmx2/h$b$l;", "Lmx2/h$b$m;", "Lmx2/h$b$n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: mx2.h$b$a */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmx2/h$b$a;", "Lmx2/h$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public static final a f102865a = new a();

            private a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$b, reason: collision with other inner class name */
        @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\n¨\u0006\u0017"}, m65681d2 = {"Lmx2/h$b$b;", "Lmx2/h$b;", "", "campaignId", "", "title", "supportText", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class C42034b extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int campaignId;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private final String supportText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42034b(int i13, String title, String supportText) {
                super(null);
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(supportText, "supportText");
                this.campaignId = i13;
                this.title = title;
                this.supportText = supportText;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getSupportText() {
                return this.supportText;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof C42034b)) {
                    return false;
                }
                C42034b c42034b = (C42034b) other;
                return this.campaignId == c42034b.campaignId && AbstractC22676k.m65745e(this.title, c42034b.title) && AbstractC22676k.m65745e(this.supportText, c42034b.supportText);
            }

            public int hashCode() {
                return this.supportText.hashCode() + AbstractC11266d.m30450d(Integer.hashCode(this.campaignId) * 31, 31, this.title);
            }

            public String toString() {
                return AbstractC25012a.m73376i(this.supportText, ")", AbstractC18489d0.m53373n(this.campaignId, "ActionSucceededWithConfig(campaignId=", ", title=", this.title, ", supportText="));
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$c */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lmx2/h$b$c;", "Lmx2/h$b;", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String text) {
                super(null);
                AbstractC22676k.m65750j(text, "text");
                this.text = text;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof c) && AbstractC22676k.m65745e(this.text, ((c) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("AdditionalTextChanged(text=", this.text, ")");
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$d */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmx2/h$b$d;", "Lmx2/h$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a */
            public static final d f102870a = new d();

            private d() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$e */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lmx2/h$b$e;", "Lmx2/h$b;", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "data", "<init>", "(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class e extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final CampaignDetailsScreenResponse data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(CampaignDetailsScreenResponse data) {
                super(null);
                AbstractC22676k.m65750j(data, "data");
                this.data = data;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CampaignDetailsScreenResponse getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof e) && AbstractC22676k.m65745e(this.data, ((e) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "CampaignDetailsLoaded(data=" + this.data + ")";
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$f */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lmx2/h$b$f;", "Lmx2/h$b;", "", NotificationCompat.CATEGORY_STATUS, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class f extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int status;

            public f(int i13) {
                super(null);
                this.status = i13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getStatus() {
                return this.status;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof f) && this.status == ((f) other).status;
            }

            public int hashCode() {
                return Integer.hashCode(this.status);
            }

            public String toString() {
                return AbstractC2875y.m8296i(this.status, "DeviceStatusUpdate(status=", ")");
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$g */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, m65681d2 = {"Lmx2/h$b$g;", "Lmx2/h$b;", "", "campaignId", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class g extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final int campaignId;

            public g(int i13) {
                super(null);
                this.campaignId = i13;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final int getCampaignId() {
                return this.campaignId;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof g) && this.campaignId == ((g) other).campaignId;
            }

            public int hashCode() {
                return Integer.hashCode(this.campaignId);
            }

            public String toString() {
                return AbstractC2875y.m8296i(this.campaignId, "ErrorLoadingCampaignDetails(campaignId=", ")");
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$h */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lmx2/h$b$h;", "Lmx2/h$b;", "Lmx2/b;", "action", "<init>", "(Lmx2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class h extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC26015b action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(InterfaceC26015b action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC26015b getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof h) && AbstractC22676k.m65745e(this.action, ((h) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "HandleSelectedAction(action=" + this.action + ")";
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$i */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmx2/h$b$i;", "Lmx2/h$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class i extends b {

            /* JADX INFO: renamed from: a */
            public static final i f102875a = new i();

            private i() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$j */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lmx2/h$b$j;", "Lmx2/h$b;", "<init>", "()V", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class j extends b {

            /* JADX INFO: renamed from: a */
            public static final j f102876a = new j();

            private j() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$k */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, m65681d2 = {"Lmx2/h$b$k;", "Lmx2/h$b;", "", "reasonKey", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class k extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String reasonKey;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String reasonKey) {
                super(null);
                AbstractC22676k.m65750j(reasonKey, "reasonKey");
                this.reasonKey = reasonKey;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getReasonKey() {
                return this.reasonKey;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof k) && AbstractC22676k.m65745e(this.reasonKey, ((k) other).reasonKey);
            }

            public int hashCode() {
                return this.reasonKey.hashCode();
            }

            public String toString() {
                return AbstractC11895b.m31996o("SelectCancelReason(reasonKey=", this.reasonKey, ")");
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$l */
        @Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lmx2/h$b$l;", "Lmx2/h$b;", "Lmx2/b;", "action", "<init>", "(Lmx2/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class l extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC26015b action;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public l(InterfaceC26015b action) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                this.action = action;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC26015b getAction() {
                return this.action;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof l) && AbstractC22676k.m65745e(this.action, ((l) other).action);
            }

            public int hashCode() {
                return this.action.hashCode();
            }

            public String toString() {
                return "ShowErrorModal(action=" + this.action + ")";
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$m */
        @Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lmx2/h$b$m;", "Lmx2/h$b;", "Lmx2/b;", "action", "Lmx2/i;", "config", "<init>", "(Lmx2/b;Lmx2/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx2/b;", "()Lmx2/b;", "b", "Lmx2/i;", "()Lmx2/i;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class m extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final InterfaceC26015b action;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final C26022i config;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(InterfaceC26015b action, C26022i config) {
                super(null);
                AbstractC22676k.m65750j(action, "action");
                AbstractC22676k.m65750j(config, "config");
                this.action = action;
                this.config = config;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC26015b getAction() {
                return this.action;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final C26022i getConfig() {
                return this.config;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof m)) {
                    return false;
                }
                m mVar = (m) other;
                return AbstractC22676k.m65745e(this.action, mVar.action) && AbstractC22676k.m65745e(this.config, mVar.config);
            }

            public int hashCode() {
                return this.config.hashCode() + (this.action.hashCode() * 31);
            }

            public String toString() {
                return "ShowFeedbackPrompt(action=" + this.action + ", config=" + this.config + ")";
            }
        }

        /* JADX INFO: renamed from: mx2.h$b$n */
        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0014"}, m65681d2 = {"Lmx2/h$b$n;", "Lmx2/h$b;", "", "title", "supportText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final /* data */ class n extends b {

            /* JADX INFO: renamed from: a, reason: from kotlin metadata */
            private final String title;

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private final String supportText;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(String title, String supportText) {
                super(null);
                AbstractC22676k.m65750j(title, "title");
                AbstractC22676k.m65750j(supportText, "supportText");
                this.title = title;
                this.supportText = supportText;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getSupportText() {
                return this.supportText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof n)) {
                    return false;
                }
                n nVar = (n) other;
                return AbstractC22676k.m65745e(this.title, nVar.title) && AbstractC22676k.m65745e(this.supportText, nVar.supportText);
            }

            public int hashCode() {
                return this.supportText.hashCode() + (this.title.hashCode() * 31);
            }

            public String toString() {
                return AbstractC2875y.m8300m("SubmittingWithConfig(title=", this.title, ", supportText=", this.supportText, ")");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: mx2.h$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$handleAction$1", m100430f = "CampaignDetailsInteractor.kt", m100431l = {46, 47, 48, 49}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmx2/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC26016c f102883E;

        /* JADX INFO: renamed from: w */
        Object f102884w;

        /* JADX INFO: renamed from: x */
        int f102885x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f102886y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC26016c abstractC26016c, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102883E = abstractC26016c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C26021h.this.new c(this.f102883E, interfaceC30057d);
            cVar.f102886y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:25:0x007e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0086  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        
            if (r0.emit(r2, r7) == r1) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
        
            if (r0.emit(r8, r7) == r1) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f102886y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r7.f102885x
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L30
                if (r2 == r6) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                java.lang.Object r0 = r7.f102884w
                ax2.b r0 = (ax2.InterfaceC2122b) r0
                p505ts.AbstractC34132o.m107864I(r8)
                goto La0
            L28:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L5d
            L2c:
                p505ts.AbstractC34132o.m107864I(r8)
                goto L40
            L30:
                p505ts.AbstractC34132o.m107864I(r8)
                mx2.h$b$i r8 = mx2.C26021h.b.i.f102875a
                r7.f102886y = r0
                r7.f102885x = r6
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto L40
                goto L9f
            L40:
                mx2.h r8 = mx2.C26021h.this
                kx2.b r8 = mx2.C26021h.m77360g(r8)
                mx2.c r2 = r7.f102883E
                mx2.c$f r2 = (mx2.AbstractC26016c.f) r2
                int r2 = r2.getCampaignId()
                ax2.a r8 = r8.m66514d(r2)
                r7.f102886y = r0
                r7.f102885x = r5
                java.lang.Object r8 = r8.mo6691a(r7)
                if (r8 != r1) goto L5d
                goto L9f
            L5d:
                ax2.b r8 = (ax2.InterfaceC2122b) r8
                boolean r2 = r8 instanceof ax2.InterfaceC2122b.b
                r5 = 0
                if (r2 == 0) goto L7e
                mx2.h$b$e r2 = new mx2.h$b$e
                ax2.b$b r8 = (ax2.InterfaceC2122b.b) r8
                java.lang.Object r8 = r8.m6692a()
                com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse r8 = (com.whoop.whooplabs.data.remote.domain.dto.bff.CampaignDetailsScreenResponse) r8
                r2.<init>(r8)
                r7.f102886y = r5
                r7.f102884w = r5
                r7.f102885x = r4
                java.lang.Object r8 = r0.emit(r2, r7)
                if (r8 != r1) goto La0
                goto L9f
            L7e:
                ax2.b$a r2 = ax2.InterfaceC2122b.a.f8494a
                boolean r8 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r8, r2)
                if (r8 == 0) goto La3
                mx2.h$b$g r8 = new mx2.h$b$g
                mx2.c r2 = r7.f102883E
                mx2.c$f r2 = (mx2.AbstractC26016c.f) r2
                int r2 = r2.getCampaignId()
                r8.<init>(r2)
                r7.f102886y = r5
                r7.f102884w = r5
                r7.f102885x = r3
                java.lang.Object r8 = r0.emit(r8, r7)
                if (r8 != r1) goto La0
            L9f:
                return r1
            La0:
                l83.a0 r8 = l83.C23454a0.f92919a
                return r8
            La3:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: mx2.C26021h.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mx2.h$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$handleAction$2", m100430f = "CampaignDetailsInteractor.kt", m100431l = {63}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmx2/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102888w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26021h.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102888w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                WhoopLabsService whoopLabsService = (WhoopLabsService) C26021h.this.serviceFlow.getValue();
                if (whoopLabsService != null) {
                    this.f102888w = 1;
                    if (whoopLabsService.m28479x(this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: mx2.h$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$handleConfirmAction$1", m100430f = "CampaignDetailsInteractor.kt", m100431l = {72, 76, 78, 80, 85, 93, 97}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lmx2/h$b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f102890E;

        /* JADX INFO: renamed from: F */
        private /* synthetic */ Object f102891F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ InterfaceC26015b f102892G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C26021h f102893H;

        /* JADX INFO: renamed from: w */
        Object f102894w;

        /* JADX INFO: renamed from: x */
        Object f102895x;

        /* JADX INFO: renamed from: y */
        Object f102896y;

        /* JADX INFO: renamed from: z */
        Object f102897z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC26015b interfaceC26015b, C26021h c26021h, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102892G = interfaceC26015b;
            this.f102893H = c26021h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f102892G, this.f102893H, interfaceC30057d);
            eVar.f102891F = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bd A[PHI: r7
          0x00bd: PHI (r7v17 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:25:0x00ba, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:37:0x0108  */
        /* JADX WARN: Code duplicated, block: B:39:0x0110  */
        /* JADX WARN: Code duplicated, block: B:44:0x012c  */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
        
            if (r0.emit(r2, r6) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
        
            if (r0.emit(r2, r6) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0105, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L41;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
        
            if (r0.emit(r7, r6) == r1) goto L41;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 326
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mx2.C26021h.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: mx2.h$f */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102898w;

        /* JADX INFO: renamed from: mx2.h$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102899w;

            /* JADX INFO: renamed from: mx2.h$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$interact$$inlined$map$1$2", m100430f = "CampaignDetailsInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42035a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102900E;

                /* JADX INFO: renamed from: F */
                Object f102901F;

                /* JADX INFO: renamed from: G */
                Object f102902G;

                /* JADX INFO: renamed from: H */
                int f102903H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102904w;

                /* JADX INFO: renamed from: x */
                int f102905x;

                /* JADX INFO: renamed from: y */
                Object f102906y;

                public C42035a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102904w = obj;
                    this.f102905x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f102899w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42035a c42035a;
                if (interfaceC30057d instanceof C42035a) {
                    c42035a = (C42035a) interfaceC30057d;
                    int i13 = c42035a.f102905x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42035a.f102905x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42035a = new C42035a(interfaceC30057d);
                    }
                } else {
                    c42035a = new C42035a(interfaceC30057d);
                }
                Object obj2 = c42035a.f102904w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42035a.f102905x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102899w;
                    b.f fVar = new b.f(((Number) obj).intValue());
                    c42035a.f102906y = null;
                    c42035a.f102900E = null;
                    c42035a.f102901F = null;
                    c42035a.f102902G = null;
                    c42035a.f102903H = 0;
                    c42035a.f102905x = 1;
                    if (interfaceC13062m.emit(fVar, c42035a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l) {
            this.f102898w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102898w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mx2.h$g */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class g extends C22656a implements InterfaceC4351m {
        public g(Object obj) {
            super(2, 4, C26021h.class, obj, "handleAction", "handleAction(Lcom/whoop/whooplabs/feature/campaigndetails/interactor/CampaignDetailsAction;)Lkotlinx/coroutines/flow/Flow;");
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC26016c abstractC26016c, InterfaceC30057d<? super InterfaceC13058l> interfaceC30057d) {
            return C26021h.m77367o((C26021h) this.receiver, abstractC26016c, interfaceC30057d);
        }
    }

    /* JADX INFO: renamed from: mx2.h$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$interact$3", m100430f = "CampaignDetailsInteractor.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lmx2/h$a;", "current", "Lmx2/h$b;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lmx2/h$a;Lmx2/h$b;)Lmx2/h$a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102908w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f102909x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102910y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(a aVar, b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
            h hVar = C26021h.this.new h(interfaceC30057d);
            hVar.f102909x = aVar;
            hVar.f102910y = bVar;
            return hVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            a aVar = (a) this.f102909x;
            b bVar = (b) this.f102910y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102908w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C26021h c26021h = C26021h.this;
            this.f102909x = null;
            this.f102910y = null;
            this.f102908w = 1;
            Object objM77368p = c26021h.m77368p(aVar, bVar, this);
            return objM77368p == enumC31071a ? enumC31071a : objM77368p;
        }
    }

    /* JADX INFO: renamed from: mx2.h$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor", m100430f = "CampaignDetailsInteractor.kt", m100431l = {110}, m100432m = "reduce", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f102912E;

        /* JADX INFO: renamed from: G */
        int f102914G;

        /* JADX INFO: renamed from: w */
        Object f102915w;

        /* JADX INFO: renamed from: x */
        Object f102916x;

        /* JADX INFO: renamed from: y */
        Object f102917y;

        /* JADX INFO: renamed from: z */
        Object f102918z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f102912E = obj;
            this.f102914G |= Integer.MIN_VALUE;
            return C26021h.this.m77368p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: mx2.h$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaigndetails.interactor.CampaignDetailsInteractor$special$$inlined$flatMapLatest$1", m100430f = "CampaignDetailsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f102919w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f102920x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f102921y;

        public j(InterfaceC30057d interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, WhoopLabsService whoopLabsService, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            j jVar = new j(interfaceC30057d);
            jVar.f102920x = interfaceC13062m;
            jVar.f102921y = whoopLabsService;
            return jVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l c0456u;
            HrDeviceConnection hrDeviceConnectionM28473o;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102919w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f102920x;
                WhoopLabsService whoopLabsService = (WhoopLabsService) this.f102921y;
                if (whoopLabsService == null || (hrDeviceConnectionM28473o = whoopLabsService.m28473o()) == null || (c0456u = hrDeviceConnectionM28473o.getConnectionStateFlow()) == null) {
                    c0456u = new C0456u(new Integer(0), 1);
                }
                this.f102920x = null;
                this.f102921y = null;
                this.f102919w = 1;
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
            return invoke((InterfaceC13062m) obj, (WhoopLabsService) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C26021h(C22885b commandFactory, C10823a serviceConnector) {
        AbstractC22676k.m65750j(commandFactory, "commandFactory");
        AbstractC22676k.m65750j(serviceConnector, "serviceConnector");
        this.commandFactory = commandFactory;
        this.serviceConnector = serviceConnector;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this._serviceFlow = c13045h2M36593c;
        C13081r1 c13081r1M36598h = AbstractC13091v.m36598h(c13045h2M36593c);
        this.serviceFlow = c13081r1M36598h;
        this.deviceFlow = AbstractC13091v.m36610t(AbstractC13091v.m36590P(c13081r1M36598h, new j(null)));
    }

    /* JADX INFO: renamed from: k */
    private final a m77364k(a aVar, int i13) {
        AbstractC26019f state = aVar.getState();
        if (!(state instanceof AbstractC26019f.a)) {
            return aVar;
        }
        if (i13 == 2) {
            return a.m77376b(aVar, AbstractC26019f.a.m77338b((AbstractC26019f.a) state, null, null, true, null, 11, null), null, null, null, 14, null);
        }
        AbstractC26019f.a aVar2 = (AbstractC26019f.a) state;
        WhoopLabsService whoopLabsService = (WhoopLabsService) this.serviceFlow.getValue();
        return a.m77376b(aVar, AbstractC26019f.a.m77338b(aVar2, null, null, false, whoopLabsService != null ? whoopLabsService.m28474p() : null, 3, null), null, null, null, 14, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m77365l(AbstractC26016c action) {
        if (action instanceof AbstractC26016c.f) {
            return new C13084s1(new c(action, null));
        }
        if (AbstractC22676k.m65745e(action, AbstractC26016c.h.f102838a)) {
            return new C0456u(b.j.f102876a, 1);
        }
        if (action instanceof AbstractC26016c.e) {
            return new C0456u(new b.h(((AbstractC26016c.e) action).getAction()), 1);
        }
        if (action instanceof AbstractC26016c.d) {
            return m77366m(((AbstractC26016c.d) action).getAction());
        }
        if (action instanceof AbstractC26016c.c) {
            return new C0456u(new b.k(((AbstractC26016c.c) action).getReason()), 1);
        }
        if (AbstractC22676k.m65745e(action, AbstractC26016c.b.f102832a)) {
            return new C0456u(b.d.f102870a, 1);
        }
        if (action instanceof AbstractC26016c.a) {
            return new C0456u(new b.c(((AbstractC26016c.a) action).getText()), 1);
        }
        if (action instanceof AbstractC26016c.i) {
            AbstractC26016c.i iVar = (AbstractC26016c.i) action;
            return m77366m(AbstractC26020g.m77351f(iVar.getAction(), iVar.getSelection(), iVar.getAdditionalText()));
        }
        if (AbstractC22676k.m65745e(action, AbstractC26016c.g.f102837a)) {
            return new C13084s1(new d(null));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    private final InterfaceC13058l m77366m(InterfaceC26015b action) {
        return new C13084s1(new e(action, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ Object m77367o(C26021h c26021h, AbstractC26016c abstractC26016c, InterfaceC30057d interfaceC30057d) {
        return c26021h.m77365l(abstractC26016c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: p */
    public final Object m77368p(a aVar, b bVar, InterfaceC30057d<? super a> interfaceC30057d) {
        i iVar;
        AbstractC26019f.a aVarM77349d;
        a aVarM77376b;
        AbstractC26019f.a aVar2;
        AbstractC26024k overlayState;
        InterfaceC13075p1 interfaceC13075p1;
        HrDeviceConnection hrDeviceConnectionM28473o;
        InterfaceC13037f2 interfaceC13037f2M28598A;
        a aVar3 = aVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f102914G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f102914G = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM28485c = iVar.f102912E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f102914G;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM28485c);
            if (!(bVar instanceof b.e)) {
                if (bVar instanceof b.g) {
                    return a.m77376b(aVar3, new AbstractC26019f.b(new InterfaceC26018e.a(((b.g) bVar).getCampaignId())), c25271y, null, null, 12, null);
                }
                if (bVar instanceof b.j) {
                    return a.m77376b(aVar3.m77382g(new C26009o(2)), null, c25271y, null, null, 13, null);
                }
                if (bVar instanceof b.h) {
                    return a.m77376b(aVar3.m77382g(new C23821c((b.h) bVar, 16)), null, c25271y, null, null, 13, null);
                }
                if (bVar instanceof b.m) {
                    b.m mVar = (b.m) bVar;
                    return a.m77376b(aVar3.m77382g(new C23821c(mVar, 17)), null, AbstractC37056f.m118958J(AbstractC26017d.b.f102843a), null, mVar.getAction(), 5, null);
                }
                if (bVar instanceof b.k) {
                    return a.m77376b(aVar3.m77382g(new C23821c((b.k) bVar, 18)), null, c25271y, null, null, 13, null);
                }
                if (bVar instanceof b.l) {
                    AbstractC26019f.a lastLoadedState = aVar3.getLastLoadedState();
                    return (lastLoadedState == null || (aVarM77376b = a.m77376b(aVar3, (aVarM77349d = AbstractC26020g.m77349d(lastLoadedState, ((b.l) bVar).getAction())), c25271y, aVarM77349d, null, 8, null)) == null) ? aVar : aVarM77376b;
                }
                if (AbstractC22676k.m65745e(bVar, b.i.f102875a)) {
                    return a.m77376b(aVar, new AbstractC26019f.b(InterfaceC26018e.b.f102845a), c25271y, null, null, 12, null);
                }
                if (AbstractC22676k.m65745e(bVar, b.a.f102865a)) {
                    return a.m77376b(aVar, null, AbstractC37056f.m118958J(AbstractC26017d.a.f102842a), null, null, 13, null);
                }
                if (AbstractC22676k.m65745e(bVar, b.d.f102870a)) {
                    return aVar.m77382g(new C26009o(3));
                }
                if (bVar instanceof b.c) {
                    return aVar.m77382g(new C23821c((b.c) bVar, 19));
                }
                if (bVar instanceof b.f) {
                    return m77364k(aVar, ((b.f) bVar).getStatus());
                }
                if (bVar instanceof b.n) {
                    b.n nVar = (b.n) bVar;
                    AbstractC26019f.b bVar2 = new AbstractC26019f.b(new InterfaceC26018e.d(nVar.getTitle(), nVar.getSupportText()));
                    AbstractC26019f.a lastLoadedState2 = aVar.getLastLoadedState();
                    return a.m77376b(aVar, bVar2, c25271y, lastLoadedState2 != null ? AbstractC26019f.a.m77338b(lastLoadedState2, null, AbstractC26024k.d.f102940a, false, null, 13, null) : null, null, 8, null);
                }
                if (!(bVar instanceof b.C42034b)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.C42034b c42034b = (b.C42034b) bVar;
                return a.m77376b(aVar, new AbstractC26019f.b(new InterfaceC26018e.c(c42034b.getCampaignId(), c42034b.getTitle(), c42034b.getSupportText())), c25271y, null, null, 12, null);
            }
            b.e eVar = (b.e) bVar;
            CampaignDetailsScreenResponse data = eVar.getData();
            AbstractC26019f.a lastLoadedState3 = aVar3.getLastLoadedState();
            if (lastLoadedState3 == null || (overlayState = lastLoadedState3.getOverlayState()) == null) {
                overlayState = AbstractC26024k.d.f102940a;
            }
            aVar2 = new AbstractC26019f.a(data, overlayState, false, null, 12, null);
            if (eVar.getData().getConnectedDeviceDisplay() == null) {
                return aVar3.m77377a(aVar2, c25271y, aVar2, aVar3.getLastAction());
            }
            interfaceC13075p1 = this._serviceFlow;
            C10823a c10823a = this.serviceConnector;
            iVar.f102915w = aVar3;
            iVar.f102916x = null;
            iVar.f102917y = aVar2;
            iVar.f102918z = interfaceC13075p1;
            iVar.f102914G = 1;
            objM28485c = c10823a.m28485c(null, iVar);
            if (objM28485c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC13075p1 interfaceC13075p2 = (InterfaceC13075p1) iVar.f102918z;
            AbstractC26019f.a aVar4 = (AbstractC26019f.a) iVar.f102917y;
            a aVar5 = (a) iVar.f102915w;
            AbstractC34132o.m107864I(objM28485c);
            aVar2 = aVar4;
            interfaceC13075p1 = interfaceC13075p2;
            aVar3 = aVar5;
        }
        ((C13045h2) interfaceC13075p1).m36570j(objM28485c);
        a aVarM77377a = aVar3.m77377a(aVar2, c25271y, aVar2, aVar3.getLastAction());
        WhoopLabsService whoopLabsService = (WhoopLabsService) ((C13045h2) this._serviceFlow).getValue();
        return m77364k(aVarM77377a, (whoopLabsService == null || (hrDeviceConnectionM28473o = whoopLabsService.m28473o()) == null || (interfaceC13037f2M28598A = hrDeviceConnectionM28473o.getConnectionStateFlow()) == null) ? 0 : ((Number) interfaceC13037f2M28598A.getValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final AbstractC26019f.a m77369q(AbstractC26019f.a it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC26020g.m77348c(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AbstractC26019f.a m77370r(b bVar, AbstractC26019f.a it) {
        AbstractC22676k.m65750j(it, "it");
        return AbstractC26020g.m77346a(it, ((b.h) bVar).getAction());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final AbstractC26019f.a m77371s(b bVar, AbstractC26019f.a it) {
        AbstractC22676k.m65750j(it, "it");
        b.m mVar = (b.m) bVar;
        return AbstractC26020g.m77347b(it, mVar.getAction(), mVar.getConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final AbstractC26019f.a m77372t(b bVar, AbstractC26019f.a state) {
        List<C26023j> listM77401c;
        AbstractC22676k.m65750j(state, "state");
        AbstractC26024k overlayState = state.getOverlayState();
        C26023j c26023j = null;
        Object obj = null;
        c26023j = null;
        AbstractC26024k.b bVar2 = overlayState instanceof AbstractC26024k.b ? (AbstractC26024k.b) overlayState : null;
        C26022i feedbackConfig = bVar2 != null ? bVar2.getFeedbackConfig() : null;
        if (feedbackConfig != null && (listM77401c = feedbackConfig.m77401c()) != null) {
            for (Object obj2 : listM77401c) {
                if (AbstractC22676k.m65745e(((C26023j) obj2).getKey(), ((b.k) bVar).getReasonKey())) {
                    obj = obj2;
                    break;
                }
            }
            c26023j = (C26023j) obj;
        }
        return (c26023j == null || !c26023j.getRequiresAdditionalInput()) ? AbstractC26020g.m77352g(state, ((b.k) bVar).getReasonKey()) : AbstractC26020g.m77350e(state, ((b.k) bVar).getReasonKey(), c26023j.getDisplayText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final AbstractC26019f.a m77373u(AbstractC26019f.a loaded) {
        AbstractC22676k.m65750j(loaded, "loaded");
        AbstractC26024k overlayState = loaded.getOverlayState();
        AbstractC26024k.c cVar = overlayState instanceof AbstractC26024k.c ? (AbstractC26024k.c) overlayState : null;
        if (cVar == null) {
            return loaded;
        }
        return AbstractC26019f.a.m77338b(loaded, null, new AbstractC26024k.b(cVar.getOriginalAction(), cVar.getFeedbackConfig(), null, 4, null), false, null, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final AbstractC26019f.a m77374v(b bVar, AbstractC26019f.a it) {
        AbstractC22676k.m65750j(it, "it");
        AbstractC26024k overlayState = it.getOverlayState();
        if (overlayState instanceof AbstractC26024k.c) {
            overlayState = AbstractC26024k.c.m77417b((AbstractC26024k.c) overlayState, null, null, null, null, ((b.c) bVar).getText(), 15, null);
        }
        return AbstractC26019f.a.m77338b(it, null, overlayState, false, null, 13, null);
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m77375n(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(new a(null, null, null, null, 15, null), AbstractC13091v.m36584J(AbstractC13091v.m36578D(new g(this), upstream), new f(this.deviceFlow)), new h(null));
    }

    /* JADX INFO: renamed from: mx2.h$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\r¢\u0006\u0004\b\u000f\u0010\u0010JB\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010)¨\u0006*"}, m65681d2 = {"Lmx2/h$a;", "", "Lmx2/f;", "state", "", "Lmx2/d;", "pendingEffects", "Lmx2/f$a;", "lastLoadedState", "Lmx2/b;", "lastAction", "<init>", "(Lmx2/f;Ljava/util/List;Lmx2/f$a;Lmx2/b;)V", "Lkotlin/Function1;", "transform", "g", "(Lkotlin/jvm/functions/Function1;)Lmx2/h$a;", "a", "(Lmx2/f;Ljava/util/List;Lmx2/f$a;Lmx2/b;)Lmx2/h$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx2/f;", "f", "()Lmx2/f;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "Lmx2/f$a;", "d", "()Lmx2/f$a;", "Lmx2/b;", "()Lmx2/b;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final AbstractC26019f state;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final List<AbstractC26017d> pendingEffects;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final AbstractC26019f.a lastLoadedState;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final InterfaceC26015b lastAction;

        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC26019f state, List<? extends AbstractC26017d> pendingEffects, AbstractC26019f.a aVar, InterfaceC26015b interfaceC26015b) {
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(pendingEffects, "pendingEffects");
            this.state = state;
            this.pendingEffects = pendingEffects;
            this.lastLoadedState = aVar;
            this.lastAction = interfaceC26015b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static /* synthetic */ a m77376b(a aVar, AbstractC26019f abstractC26019f, List list, AbstractC26019f.a aVar2, InterfaceC26015b interfaceC26015b, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                abstractC26019f = aVar.state;
            }
            if ((i13 & 2) != 0) {
                list = aVar.pendingEffects;
            }
            if ((i13 & 4) != 0) {
                aVar2 = aVar.lastLoadedState;
            }
            if ((i13 & 8) != 0) {
                interfaceC26015b = aVar.lastAction;
            }
            return aVar.m77377a(abstractC26019f, list, aVar2, interfaceC26015b);
        }

        /* JADX INFO: renamed from: a */
        public final a m77377a(AbstractC26019f state, List<? extends AbstractC26017d> pendingEffects, AbstractC26019f.a lastLoadedState, InterfaceC26015b lastAction) {
            AbstractC22676k.m65750j(state, "state");
            AbstractC22676k.m65750j(pendingEffects, "pendingEffects");
            return new a(state, pendingEffects, lastLoadedState, lastAction);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final InterfaceC26015b getLastAction() {
            return this.lastAction;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AbstractC26019f.a getLastLoadedState() {
            return this.lastLoadedState;
        }

        /* JADX INFO: renamed from: e */
        public final List<AbstractC26017d> m77380e() {
            return this.pendingEffects;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.state, aVar.state) && AbstractC22676k.m65745e(this.pendingEffects, aVar.pendingEffects) && AbstractC22676k.m65745e(this.lastLoadedState, aVar.lastLoadedState) && AbstractC22676k.m65745e(this.lastAction, aVar.lastAction);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final AbstractC26019f getState() {
            return this.state;
        }

        /* JADX INFO: renamed from: g */
        public final a m77382g(Function1 transform) {
            AbstractC22676k.m65750j(transform, "transform");
            AbstractC26019f abstractC26019f = this.state;
            if (!(abstractC26019f instanceof AbstractC26019f.a)) {
                return this;
            }
            AbstractC26019f.a aVar = (AbstractC26019f.a) transform.invoke(abstractC26019f);
            return m77376b(this, aVar, null, aVar, null, 10, null);
        }

        public int hashCode() {
            int iM31983b = AbstractC11895b.m31983b(this.state.hashCode() * 31, 31, this.pendingEffects);
            AbstractC26019f.a aVar = this.lastLoadedState;
            int iHashCode = (iM31983b + (aVar == null ? 0 : aVar.hashCode())) * 31;
            InterfaceC26015b interfaceC26015b = this.lastAction;
            return iHashCode + (interfaceC26015b != null ? interfaceC26015b.hashCode() : 0);
        }

        public String toString() {
            return "Accumulator(state=" + this.state + ", pendingEffects=" + this.pendingEffects + ", lastLoadedState=" + this.lastLoadedState + ", lastAction=" + this.lastAction + ")";
        }

        public /* synthetic */ a(AbstractC26019f abstractC26019f, List list, AbstractC26019f.a aVar, InterfaceC26015b interfaceC26015b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? new AbstractC26019f.b(InterfaceC26018e.b.f102845a) : abstractC26019f, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? null : interfaceC26015b);
        }
    }
}
