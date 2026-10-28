package vr2;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.recyclerview.widget.AbstractC1707m0;
import androidx.room.AbstractC1772c1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bt0.C3617a;
import bt0.C3618b;
import c93.InterfaceC4351m;
import com.google.gson.GsonBuilder;
import com.whoop.consolePackets.data.api.ConsolePacketsApi;
import com.whoop.data.repositories.AppLogsPurgeDays;
import com.whoop.data.repositories.MaxAppLogLinesToUpload;
import com.whoop.data.repositories.SQLDatabaseVacuumCadenceMillis;
import com.whoop.domain.exception.LogUploadException;
import com.whoop.service.network.model.UserSessionDto;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21461d;
import j93.InterfaceC21493z;
import java.time.Clock;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import js0.AbstractC21909c;
import js0.C21908b;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import oh3.AbstractC27946d;
import or2.C28169i0;
import or2.C28185n1;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p031b9.AbstractC2875y;
import p138f6.AbstractC14134f;
import p138f6.C14132d;
import p218ic.AbstractC18386u;
import p218ic.C18382s;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.time.DurationKt;
import pg3.C29218v0;
import q83.C30064k;
import q83.InterfaceC30057d;
import q92.C30070b;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.C34110h;
import tr2.InterfaceC34108f;
import ud3.AbstractC34799a1;
import ud3.AbstractC34846v0;
import ud3.C34818h0;
import ud3.C34842t0;
import ud3.C34844u0;
import wb3.AbstractC37056f;
import wp0.C37496a;
import yb3.AbstractC39414r;
import yb3.AbstractC39420x;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: vr2.d */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001+BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\"\u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b(\u0010&J\u0018\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100J%\u00104\u001a\b\u0012\u0004\u0012\u00020 032\u0006\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019H\u0007¢\u0006\u0004\b4\u00105J\u0011\u00107\u001a\u0004\u0018\u000106H\u0007¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010HR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010IR\u0014\u0010K\u001a\u00020\u00198\u0002X\u0082D¢\u0006\u0006\n\u0004\b>\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010RR\u0016\u0010V\u001a\u00020T8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010UR\u001c\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010WR\u0016\u0010Z\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010YR\u0014\u0010\\\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0017R\u0014\u0010^\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b]\u0010\u001eR\u0014\u0010b\u001a\u00020_8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b`\u0010a¨\u0006c"}, m65681d2 = {"Lvr2/d;", "Lvr2/c;", "Ltr2/f;", "logEventsDao", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "consolePacketsApi", "Lvr2/e;", "uniqueDeviceId", "Lrr2/c;", "crashReporter", "Ljs0/c;", "configurationRepository", "Lor2/n1;", "storageSpace", "Ljava/time/Clock;", "clock", "La6/g;", "Lf6/f;", "dataStorePreferences", "<init>", "(Ltr2/f;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Lvr2/e;Lrr2/c;Ljs0/c;Lor2/n1;Ljava/time/Clock;La6/g;)V", "", "r", "()Z", "", "", "k", "()Ljava/util/Map;", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "()I", "", "Ltr2/h;", "logsDtoList", "l", "(Ljava/util/List;)Ljava/lang/String;", "Ll83/a0;", "s", "(Lq83/d;)Ljava/lang/Object;", "u", "t", "forceUpload", "Lic/u;", "a", "(ZLq83/d;)Ljava/lang/Object;", "Lud3/v0;", "body", "g", "(Lud3/v0;)Z", "from", "to", "", "n", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lbt0/b;", "j", "()Lbt0/b;", "Ltr2/f;", "getLogEventsDao", "()Ltr2/f;", "b", "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "i", "()Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;", "c", "Lvr2/e;", "d", "Lrr2/c;", "e", "Ljs0/c;", "f", "Lor2/n1;", "Ljava/time/Clock;", "La6/g;", "Ljava/lang/String;", "tag", "Loh3/d;", "Lq92/b;", "m", "()Loh3/d;", "log", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isUploading", "Lorg/joda/time/DateTime;", "Lorg/joda/time/DateTime;", "currentTimeStamp", "Ljava/util/List;", "logsDto", "Lic/u;", "resultStatus", "p", "runningLowStorage", "o", "maxUploadLogLines", "", "q", "()J", "vacuumCadence", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36311d implements InterfaceC36310c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34108f logEventsDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ConsolePacketsApi consolePacketsApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C36312e uniqueDeviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21909c configurationRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C28185n1 storageSpace;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC0422g dataStorePreferences;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C30070b log;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final AtomicBoolean isUploading;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private DateTime currentTimeStamp;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private List<C34110h> logsDto;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private AbstractC18386u resultStatus;

    /* JADX INFO: renamed from: p */
    static final /* synthetic */ InterfaceC21493z[] f155658p = {AbstractC22671h0.f89337a.property1(new C22693x(C36311d.class, "log", "getLog()Ltimber/log/Timber$Tree;", 0))};

    /* JADX INFO: renamed from: q */
    public static final int f155659q = 8;

    /* JADX INFO: renamed from: r */
    private static final C14132d f155660r = AbstractC15751g.m44429I("last_vacuum_timestamp");

    /* JADX INFO: renamed from: vr2.d$b */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.logService.LogEventUploaderImpl$doUpload$1", m100430f = "LogEventUploaderImpl.kt", m100431l = {170}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155675w;

        /* JADX INFO: renamed from: x */
        int f155676x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ AbstractC34846v0 f155678z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155678z = abstractC34846v0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36311d.this.new b(this.f155678z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r3v7, types: [int] */
        /* JADX WARN: Type inference failed for: r3v8 */
        /* JADX WARN: Type inference failed for: r3v9 */
        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ?? r10;
            ?? r14;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155676x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    ConsolePacketsApi consolePacketsApi = C36311d.this.getConsolePacketsApi();
                    AbstractC34846v0 abstractC34846v0 = this.f155678z;
                    Map<String, String> mapM116105k = C36311d.this.m116105k();
                    this.f155675w = 0;
                    this.f155676x = 1;
                    obj = consolePacketsApi.uploadLogs(abstractC34846v0, mapM116105k, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } catch (Exception e5) {
                    e = e5;
                    r10 = 0;
                    C36311d.this.m116107m().mo84368b(AbstractC11266d.m30461o("Encountered exception while synchronously uploading logs: ", e.getMessage()), new Object[0]);
                    r14 = r10;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r10 = this.f155675w;
                try {
                    AbstractC34132o.m107864I(obj);
                } catch (Exception e13) {
                    e = e13;
                    C36311d.this.m116107m().mo84368b(AbstractC11266d.m30461o("Encountered exception while synchronously uploading logs: ", e.getMessage()), new Object[0]);
                    r14 = r10;
                }
            }
            C29218v0 c29218v0 = (C29218v0) obj;
            r10 = c29218v0.f118269a.f146788Q;
            r14 = r10;
            if (r10 == 0) {
                C36311d.this.m116107m().mo84368b("Uploading of logs failed due to HTTP status code: " + c29218v0.f118269a.f146792z, new Object[0]);
                try {
                    AbstractC34799a1 abstractC34799a1 = c29218v0.f118271c;
                    AbstractC22676k.m65747g(abstractC34799a1);
                    String strM109860m = abstractC34799a1.m109860m();
                    C36311d.this.m116107m().mo84368b("ErrorBody: " + new GsonBuilder().setPrettyPrinting().create().toJson(strM109860m), new Object[0]);
                    r14 = r10;
                } catch (Exception e14) {
                    C36311d.this.m116107m().mo84368b("Could not read the errorBody of the response: " + e14.getMessage(), new Object[0]);
                    r14 = r10;
                }
            }
            return Boolean.valueOf(r14 != 0);
        }
    }

    /* JADX INFO: renamed from: vr2.d$c */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.logService.LogEventUploaderImpl", m100430f = "LogEventUploaderImpl.kt", m100431l = {227}, m100432m = "removeOlderRecords", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f155680F;

        /* JADX INFO: renamed from: w */
        Object f155681w;

        /* JADX INFO: renamed from: x */
        Object f155682x;

        /* JADX INFO: renamed from: y */
        int f155683y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f155684z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155684z = obj;
            this.f155680F |= Integer.MIN_VALUE;
            return C36311d.this.m116112s(this);
        }
    }

    /* JADX INFO: renamed from: vr2.d$d */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.logService.LogEventUploaderImpl", m100430f = "LogEventUploaderImpl.kt", m100431l = {260}, m100432m = "shouldRunVacuum", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f155685w;

        /* JADX INFO: renamed from: y */
        int f155687y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155685w = obj;
            this.f155687y |= Integer.MIN_VALUE;
            return C36311d.this.m116113t(this);
        }
    }

    /* JADX INFO: renamed from: vr2.d$e */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.logService.LogEventUploaderImpl", m100430f = "LogEventUploaderImpl.kt", m100431l = {83}, m100432m = "uploadLogs", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f155688E;

        /* JADX INFO: renamed from: w */
        boolean f155689w;

        /* JADX INFO: renamed from: x */
        boolean f155690x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f155691y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155691y = obj;
            this.f155688E |= Integer.MIN_VALUE;
            return C36311d.this.mo116098a(false, this);
        }
    }

    /* JADX INFO: renamed from: vr2.d$f */
    @InterfaceC32271e(m100429c = "com.whoop.util.log.logService.LogEventUploaderImpl", m100430f = "LogEventUploaderImpl.kt", m100431l = {245, AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION}, m100432m = "vacuumDatabase", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f155693w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f155694x;

        /* JADX INFO: renamed from: z */
        int f155696z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f155694x = obj;
            this.f155696z |= Integer.MIN_VALUE;
            return C36311d.this.m116114u(this);
        }
    }

    public C36311d(InterfaceC34108f logEventsDao, ConsolePacketsApi consolePacketsApi, C36312e uniqueDeviceId, InterfaceC31766c crashReporter, AbstractC21909c configurationRepository, C28185n1 storageSpace, Clock clock, InterfaceC0422g dataStorePreferences) {
        AbstractC22676k.m65750j(logEventsDao, "logEventsDao");
        AbstractC22676k.m65750j(consolePacketsApi, "consolePacketsApi");
        AbstractC22676k.m65750j(uniqueDeviceId, "uniqueDeviceId");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(configurationRepository, "configurationRepository");
        AbstractC22676k.m65750j(storageSpace, "storageSpace");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(dataStorePreferences, "dataStorePreferences");
        this.logEventsDao = logEventsDao;
        this.consolePacketsApi = consolePacketsApi;
        this.uniqueDeviceId = uniqueDeviceId;
        this.crashReporter = crashReporter;
        this.configurationRepository = configurationRepository;
        this.storageSpace = storageSpace;
        this.clock = clock;
        this.dataStorePreferences = dataStorePreferences;
        this.tag = "LogEventUploader";
        this.log = new C30070b("LogEventUploader");
        this.isUploading = new AtomicBoolean(false);
        this.logsDto = new ArrayList();
        this.resultStatus = new C18382s();
    }

    /* JADX INFO: renamed from: h */
    private final int m116104h() {
        double dCount = this.logEventsDao.count();
        m116107m().mo84367a("Number of rows remaining to upload: " + dCount, new Object[0]);
        if (dCount <= m116108o()) {
            return 1;
        }
        return (int) Math.ceil(dCount / ((double) m116108o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final Map<String, String> m116105k() {
        return AbstractC25247g0.m73990Y(new C23465k("Content-Type", "application/json"), new C23465k("Content-Encoding", "gzip"));
    }

    @SuppressLint({"HardwareIds"})
    /* JADX INFO: renamed from: l */
    private final String m116106l(List<C34110h> logsDtoList) {
        String strM53370k = AbstractC18489d0.m53370k(Build.BRAND, " ", Build.MODEL);
        String str = Build.VERSION.RELEASE;
        String deviceId = this.uniqueDeviceId.getDeviceId();
        m116107m().mo84367a(AbstractC11266d.m30461o("Unique device id: ", deviceId), new Object[0]);
        String utcDateTime = logsDtoList.get(0).getUtcDateTime();
        DateTimeZone dateTimeZone = DateTimeZone.UTC;
        long millis = new DateTime(utcDateTime, dateTimeZone).getMillis();
        List<C34110h> list = this.logsDto;
        long millis2 = new DateTime(list.get(AbstractC37056f.m118951C(list)).getUtcDateTime(), dateTimeZone).getMillis();
        List<C34110h> list2 = logsDtoList;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C34110h) it.next()).getBody());
        }
        String strValueOf = String.valueOf(millis);
        String strValueOf2 = String.valueOf(millis2);
        AbstractC22676k.m65747g(str);
        return C28169i0.m85278i(new C36308a(strValueOf, strValueOf2, strM53370k, str, UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE, deviceId, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final AbstractC27946d m116107m() {
        return this.log.getValue(this, f155658p[0]);
    }

    /* JADX INFO: renamed from: o */
    private final int m116108o() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        MaxAppLogLinesToUpload maxAppLogLinesToUpload = MaxAppLogLinesToUpload.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = maxAppLogLinesToUpload.getName();
        Object defaultValue = maxAppLogLinesToUpload.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return ((Integer) defaultValue).intValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
    }

    /* JADX INFO: renamed from: p */
    private final boolean m116109p() {
        long jM85308a = this.storageSpace.m85308a();
        m116107m().mo84367a(AbstractC31061c.m95636l(jM85308a, "Free internal storage: ", " mb"), new Object[0]);
        return jM85308a <= 15;
    }

    /* JADX INFO: renamed from: q */
    private final long m116110q() {
        AbstractC21909c abstractC21909c = this.configurationRepository;
        SQLDatabaseVacuumCadenceMillis sQLDatabaseVacuumCadenceMillis = SQLDatabaseVacuumCadenceMillis.INSTANCE;
        C21908b configurations = abstractC21909c.getConfigurations();
        String name = sQLDatabaseVacuumCadenceMillis.getName();
        Object defaultValue = sQLDatabaseVacuumCadenceMillis.getDefaultValue();
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Long.class);
        Object objM125868N0 = null;
        if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
            String str = (String) configurations.get(name);
            if (str != null) {
                objM125868N0 = AbstractC39421y.m125932Q(str);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
            String str2 = (String) configurations.get(name);
            if (str2 != null) {
                objM125868N0 = AbstractC39421y.m125933R(str2);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
            String str3 = (String) configurations.get(name);
            if (str3 != null) {
                objM125868N0 = AbstractC39420x.m125915y(str3);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
            String str4 = (String) configurations.get(name);
            if (str4 != null) {
                objM125868N0 = AbstractC39420x.m125914x(str4);
            }
        } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
            String str5 = (String) configurations.get(name);
            if (str5 != null) {
                objM125868N0 = AbstractC39414r.m125868N0(str5);
            }
        } else {
            objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
        }
        if (objM125868N0 != null) {
            defaultValue = objM125868N0;
        }
        if (defaultValue != null) {
            return ((Long) defaultValue).longValue();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    /* JADX INFO: renamed from: r */
    private final boolean m116111r() {
        this.isUploading.set(true);
        this.logsDto.clear();
        C3618b c3618bM116117j = m116117j();
        if (c3618bM116117j == null) {
            m116107m().mo84367a("Day boundaries were null! Returning false!", new Object[0]);
            this.isUploading.set(false);
            return false;
        }
        String string = c3618bM116117j.m10979a().toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        String string2 = c3618bM116117j.m10980b().toString();
        AbstractC22676k.m65749i(string2, "toString(...)");
        m116107m().mo84367a("Start UTC date time: ".concat(string), new Object[0]);
        m116107m().mo84367a("End UTC date time: ".concat(string2), new Object[0]);
        this.logsDto = AbstractC25265s.m74097F1(m116118n(string, string2));
        m116107m().mo84367a(AbstractC2875y.m8295h(this.logsDto.size(), "Number of rows pulled "), new Object[0]);
        if (this.logsDto.isEmpty()) {
            m116107m().mo84368b("Got empty set of log rows. Cancelling upload!", new Object[0]);
            this.isUploading.set(false);
            return false;
        }
        String strM116106l = m116106l(this.logsDto);
        C34844u0 c34844u0 = AbstractC34846v0.Companion;
        C39412p c39412p = C34818h0.f146589e;
        C34818h0 c34818h0M5373J = AbstractC1772c1.m5373J("application/json");
        c34844u0.getClass();
        C34842t0 c34842t0M109925b = C34844u0.m109925b(strM116106l, c34818h0M5373J);
        AbstractC27946d abstractC27946dM116107m = m116107m();
        double d3 = c34842t0M109925b.f146750b;
        double d14 = DurationKt.NANOS_IN_MILLIS;
        abstractC27946dM116107m.mo84367a("Before gzip size: " + (d3 / d14) + " mb", new Object[0]);
        AbstractC34846v0 abstractC34846v0M120179a = C37496a.f160377a.m120179a(c34842t0M109925b);
        double dContentLength = ((double) abstractC34846v0M120179a.contentLength()) / d14;
        m116107m().mo84367a("After gzip size: " + dContentLength + " mb", new Object[0]);
        if (dContentLength >= 5.0d) {
            InterfaceC31766c.m98634e(this.crashReporter, new LogUploadException("Size of the payload exceeded the 5mb threshold!", null, 2, null), null, 2, null);
        }
        boolean zM116115g = m116115g(abstractC34846v0M120179a);
        if (zM116115g) {
            m116107m().mo84367a("Uploading of logs was successful.", new Object[0]);
            List<C34110h> list = this.logsDto;
            String utcDateTime = list.get(AbstractC37056f.m118951C(list)).getUtcDateTime();
            if (utcDateTime != null) {
                string2 = utcDateTime;
            }
            m116107m().mo84367a(AbstractC31061c.m95640p("Deleting logs from ", string, " to ", string2), new Object[0]);
            m116107m().mo84367a(AbstractC2875y.m8295h(this.logEventsDao.mo107811e(m116108o(), string, string2), "No of rows deleted: "), new Object[0]);
        } else {
            m116107m().mo84368b("Uploading of logs was unsuccessful", new Object[0]);
        }
        this.isUploading.set(false);
        this.logsDto.clear();
        return zM116115g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m116112s(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        c cVar;
        Object objM125868N0;
        int i13;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i14 = cVar.f155680F;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f155680F = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f155684z;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = cVar.f155680F;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            DateTime dateTime = this.currentTimeStamp;
            if (dateTime == null) {
                AbstractC22676k.m65757q("currentTimeStamp");
                throw null;
            }
            AbstractC21909c abstractC21909c = this.configurationRepository;
            AppLogsPurgeDays appLogsPurgeDays = AppLogsPurgeDays.INSTANCE;
            C21908b configurations = abstractC21909c.getConfigurations();
            String name = appLogsPurgeDays.getName();
            Object defaultValue = appLogsPurgeDays.getDefaultValue();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            InterfaceC21461d orCreateKotlinClass = c22673i0.getOrCreateKotlinClass(Integer.class);
            if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Integer.TYPE))) {
                String str = (String) configurations.get(name);
                if (str != null) {
                    objM125868N0 = AbstractC39421y.m125932Q(str);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Long.TYPE))) {
                String str2 = (String) configurations.get(name);
                if (str2 != null) {
                    objM125868N0 = AbstractC39421y.m125933R(str2);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Float.TYPE))) {
                String str3 = (String) configurations.get(name);
                if (str3 != null) {
                    objM125868N0 = AbstractC39420x.m125915y(str3);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Double.TYPE))) {
                String str4 = (String) configurations.get(name);
                if (str4 != null) {
                    objM125868N0 = AbstractC39420x.m125914x(str4);
                } else {
                    objM125868N0 = null;
                }
            } else if (AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(Boolean.TYPE))) {
                String str5 = (String) configurations.get(name);
                if (str5 != null) {
                    objM125868N0 = AbstractC39414r.m125868N0(str5);
                } else {
                    objM125868N0 = null;
                }
            } else {
                objM125868N0 = AbstractC22676k.m65745e(orCreateKotlinClass, c22673i0.getOrCreateKotlinClass(String.class)) ? configurations.get(name) : defaultValue;
            }
            if (objM125868N0 != null) {
                defaultValue = objM125868N0;
            }
            if (defaultValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            DateTime dateTimeMinusDays = dateTime.minusDays(((Integer) defaultValue).intValue());
            List<C34110h> listMo107809c = this.logEventsDao.mo107809c(1);
            if (listMo107809c.size() > 0) {
                String utcDateTime = listMo107809c.get(0).getUtcDateTime();
                m116107m().mo84367a("Deleting older log lines from " + utcDateTime + " to " + dateTimeMinusDays, new Object[0]);
            }
            InterfaceC34108f interfaceC34108f = this.logEventsDao;
            String string = dateTimeMinusDays.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            int iMo107813g = interfaceC34108f.mo107813g(string);
            cVar.f155681w = null;
            cVar.f155682x = null;
            cVar.f155683y = iMo107813g;
            cVar.f155680F = 1;
            if (m116114u(cVar) == obj2) {
                return obj2;
            }
            i13 = iMo107813g;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i13 = cVar.f155683y;
            AbstractC34132o.m107864I(obj);
        }
        m116107m().mo84367a(AbstractC2875y.m8295h(i13, "No of older log lines deleted: "), new Object[0]);
        m116107m().mo84367a(AbstractC2875y.m8295h(this.logEventsDao.count(), "Number of rows remaining to upload after delete: "), new Object[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m116113t(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f155687y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f155687y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM36575A = dVar.f155685w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f155687y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            InterfaceC13058l data = this.dataStorePreferences.getData();
            dVar.f155687y = 1;
            objM36575A = AbstractC13091v.m36575A(data, dVar);
            if (objM36575A == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36575A);
        }
        Long l7 = (Long) ((AbstractC14134f) objM36575A).mo40227b(f155660r);
        return Boolean.valueOf(Instant.now(this.clock).toEpochMilli() - (l7 != null ? l7.longValue() : 0L) >= m116110q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
    
        if (kh2.AbstractC22486a.m64987c(r0, r3, r5, r1) == r2) goto L26;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m116114u(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "VACUUM completed with result: "
            boolean r1 = r10 instanceof vr2.C36311d.f
            if (r1 == 0) goto L15
            r1 = r10
            vr2.d$f r1 = (vr2.C36311d.f) r1
            int r2 = r1.f155696z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f155696z = r2
            goto L1a
        L15:
            vr2.d$f r1 = new vr2.d$f
            r1.<init>(r10)
        L1a:
            java.lang.Object r10 = r1.f155694x
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r1.f155696z
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L38
            if (r3 != r4) goto L30
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: android.database.sqlite.SQLiteException -> L2e
            goto Lb9
        L2e:
            r10 = move-exception
            goto L90
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L38:
            p505ts.AbstractC34132o.m107864I(r10)
            goto L48
        L3c:
            p505ts.AbstractC34132o.m107864I(r10)
            r1.f155696z = r5
            java.lang.Object r10 = r9.m116113t(r1)
            if (r10 != r2) goto L48
            goto L8f
        L48:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La4
            tr2.f r10 = r9.logEventsDao     // Catch: android.database.sqlite.SQLiteException -> L2e
            p0.n0 r3 = new p0.n0     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.String r5 = "VACUUM"
            r3.<init>(r5)     // Catch: android.database.sqlite.SQLiteException -> L2e
            int r10 = r10.mo107807a(r3)     // Catch: android.database.sqlite.SQLiteException -> L2e
            oh3.d r3 = r9.m116107m()     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L2e
            r5.<init>(r0)     // Catch: android.database.sqlite.SQLiteException -> L2e
            r5.append(r10)     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.String r0 = r5.toString()     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch: android.database.sqlite.SQLiteException -> L2e
            r3.mo84367a(r0, r5)     // Catch: android.database.sqlite.SQLiteException -> L2e
            a6.g r0 = r9.dataStorePreferences     // Catch: android.database.sqlite.SQLiteException -> L2e
            f6.d r3 = vr2.C36311d.f155660r     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.time.Clock r5 = r9.clock     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.time.Instant r5 = java.time.Instant.now(r5)     // Catch: android.database.sqlite.SQLiteException -> L2e
            long r7 = r5.toEpochMilli()     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.Long r5 = new java.lang.Long     // Catch: android.database.sqlite.SQLiteException -> L2e
            r5.<init>(r7)     // Catch: android.database.sqlite.SQLiteException -> L2e
            r1.f155693w = r10     // Catch: android.database.sqlite.SQLiteException -> L2e
            r1.f155696z = r4     // Catch: android.database.sqlite.SQLiteException -> L2e
            java.lang.Object r10 = kh2.AbstractC22486a.m64987c(r0, r3, r5, r1)     // Catch: android.database.sqlite.SQLiteException -> L2e
            if (r10 != r2) goto Lb9
        L8f:
            return r2
        L90:
            oh3.d r0 = r9.m116107m()
            java.lang.String r10 = r10.getMessage()
            java.lang.String r1 = "VACUUM failed with exception: "
            java.lang.String r10 = p000.AbstractC11266d.m30461o(r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r0.mo84368b(r10, r1)
            goto Lb9
        La4:
            oh3.d r10 = r9.m116107m()
            long r0 = r9.m116110q()
            java.lang.String r2 = "Skipping VACUUM as it was already run within the last "
            java.lang.String r3 = " millis"
            java.lang.String r0 = r80.AbstractC31061c.m95636l(r0, r2, r3)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r10.mo84367a(r0, r1)
        Lb9:
            l83.a0 r10 = l83.C23454a0.f92919a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: vr2.C36311d.m116114u(q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // vr2.InterfaceC36310c
    /* JADX INFO: renamed from: a */
    public Object mo116098a(boolean z4, InterfaceC30057d<? super AbstractC18386u> interfaceC30057d) {
        e eVar;
        boolean zM116109p;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f155688E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f155688E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f155691y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f155688E;
        int i15 = 1;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            m116107m().mo84367a("Starting the upload log process!", new Object[0]);
            this.currentTimeStamp = new DateTime(DateTimeZone.UTC);
            eVar.f155689w = z4;
            eVar.f155690x = z4;
            eVar.f155688E = 1;
            if (m116112s(eVar) == obj2) {
                return obj2;
            }
            zM116109p = z4;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z13 = eVar.f155690x;
            boolean z14 = eVar.f155689w;
            AbstractC34132o.m107864I(obj);
            zM116109p = z13;
            z4 = z14;
        }
        if (!z4) {
            zM116109p = m116109p();
        }
        if (!zM116109p) {
            this.resultStatus = m116111r() ? AbstractC18386u.m52885b() : new C18382s();
            m116107m().mo84367a("Returning " + this.resultStatus, new Object[0]);
            return this.resultStatus;
        }
        int iM116104h = m116104h();
        m116107m().mo84367a(AbstractC2875y.m8296i(iM116104h, "Will run the loop for ", " times"), new Object[0]);
        this.resultStatus = AbstractC18386u.m52885b();
        if (1 <= iM116104h) {
            while (m116111r()) {
                if (i15 != iM116104h) {
                    i15++;
                }
            }
            m116107m().mo84368b(AbstractC2875y.m8296i(i15, "There was a problem uploading logs during forceUpload! Failed at ", " attempt. But will still return a success event"), new Object[0]);
        }
        return this.resultStatus;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m116115g(AbstractC34846v0 body) {
        AbstractC22676k.m65750j(body, "body");
        return ((Boolean) AbstractC3006f0.m8699E(C30064k.f122676w, new b(body, null))).booleanValue();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ConsolePacketsApi getConsolePacketsApi() {
        return this.consolePacketsApi;
    }

    /* JADX INFO: renamed from: j */
    public final C3618b m116117j() {
        List<C34110h> listMo107809c = this.logEventsDao.mo107809c(1);
        if (listMo107809c.size() > 0) {
            return C3617a.f14712a.m10978a(new DateTime(listMo107809c.get(0).getLocalDateTime()));
        }
        m116107m().mo84368b("Table is empty. Retry Later!", new Object[0]);
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final List<C34110h> m116118n(String from, String to3) {
        AbstractC22676k.m65750j(from, "from");
        AbstractC22676k.m65750j(to3, "to");
        return this.logEventsDao.mo107808b(m116108o(), from, to3);
    }
}
