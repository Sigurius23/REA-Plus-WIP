package yw2;

import ak0.C0947i;
import ci2.InterfaceC4733b;
import com.whoop.whooplabs.data.domain.LabsCampaign;
import fu1.InterfaceC14782a;
import fu1.InterfaceC14783b;
import fu1.InterfaceC14784c;
import fu1.InterfaceC14785d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.concurrent.TimeUnit;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import wj0.EnumC37318b;
import xj0.C38370n;
import yj0.C39590d;
import yj0.C39592f;
import zj0.C40720e1;
import zj0.C40723f1;
import zj0.C40727h;
import zj0.InterfaceC40730i;

/* JADX INFO: renamed from: yw2.f */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001,B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0015\u0010\u0010J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0010J\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u001e\u0010\u0010J\u0010\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\"\u0010\u001dJ\u0010\u0010#\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u001fH\u0086@¢\u0006\u0004\b$\u0010\u001dJ\u0018\u0010&\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010*H\u0086@¢\u0006\u0004\b+\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00102¨\u00063"}, m65681d2 = {"Lyw2/f;", "", "Ltd1/b;", "whoopStrapProxy", "Lci2/b;", "whoopStrapProvider", "Lfu1/b;", "labradorService", "Ltr2/n;", "logger", "<init>", "(Ltd1/b;Lci2/b;Lfu1/b;Ltr2/n;)V", "Lcom/whoop/whooplabs/data/domain/LabsCampaign;", "campaign", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;", "Lak0/i;", "responsePacket", "e", "(Lak0/i;Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;", "g", "Lzj0/h;", "i", "", "Lfu1/d;", "f", "(Ljava/lang/String;)Lfu1/d;", "j", "(Lq83/d;)Ljava/lang/Object;", "n", "Ll83/a0;", "s", "m", "l", "r", "p", "labradorEntry", "k", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "q", "o", "", "d", "a", "Ltd1/b;", "b", "Lci2/b;", "c", "Lfu1/b;", "Ltr2/n;", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39834f {

    /* JADX INFO: renamed from: f */
    public static final int f171743f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrapProxy;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC14783b labradorService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: yw2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171748a;

        static {
            int[] iArr = new int[EnumC37318b.values().length];
            try {
                iArr[EnumC37318b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC37318b.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f171748a = iArr;
        }
    }

    /* JADX INFO: renamed from: yw2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {254}, m100432m = "getStrapBacklog", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171749w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171750x;

        /* JADX INFO: renamed from: z */
        int f171752z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171750x = obj;
            this.f171752z |= Integer.MIN_VALUE;
            return C39834f.this.m127802d(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {65}, m100432m = "handleCommandCollision", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171753E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f171754F;

        /* JADX INFO: renamed from: H */
        int f171756H;

        /* JADX INFO: renamed from: w */
        Object f171757w;

        /* JADX INFO: renamed from: x */
        Object f171758x;

        /* JADX INFO: renamed from: y */
        long f171759y;

        /* JADX INFO: renamed from: z */
        long f171760z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171754F = obj;
            this.f171756H |= Integer.MIN_VALUE;
            return C39834f.this.m127797e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {74, 80}, m100432m = "restartRawDataCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f171762F;

        /* JADX INFO: renamed from: w */
        Object f171763w;

        /* JADX INFO: renamed from: x */
        Object f171764x;

        /* JADX INFO: renamed from: y */
        int f171765y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f171766z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171766z = obj;
            this.f171762F |= Integer.MIN_VALUE;
            return C39834f.this.m127799g(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {36, 43}, m100432m = "sendStartCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171767E;

        /* JADX INFO: renamed from: w */
        Object f171768w;

        /* JADX INFO: renamed from: x */
        Object f171769x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171770y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171770y = obj;
            this.f171767E |= Integer.MIN_VALUE;
            return C39834f.this.m127800h(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {105}, m100432m = "sendStopCommand", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171772w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171773x;

        /* JADX INFO: renamed from: z */
        int f171775z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171773x = obj;
            this.f171775z |= Integer.MIN_VALUE;
            return C39834f.this.m127803j(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {215, 216}, m100432m = "startEcgCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f171777F;

        /* JADX INFO: renamed from: w */
        Object f171778w;

        /* JADX INFO: renamed from: x */
        Object f171779x;

        /* JADX INFO: renamed from: y */
        Object f171780y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f171781z;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171781z = obj;
            this.f171777F |= Integer.MIN_VALUE;
            return C39834f.this.m127804k(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {178}, m100432m = "startImuCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171782w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171783x;

        /* JADX INFO: renamed from: z */
        int f171785z;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171783x = obj;
            this.f171785z |= Integer.MIN_VALUE;
            return C39834f.this.m127805l(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {156}, m100432m = "startPpgCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171786w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171787x;

        /* JADX INFO: renamed from: z */
        int f171789z;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171787x = obj;
            this.f171789z |= Integer.MIN_VALUE;
            return C39834f.this.m127806m(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {110, 113}, m100432m = "startRawDataCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171790E;

        /* JADX INFO: renamed from: w */
        Object f171791w;

        /* JADX INFO: renamed from: x */
        Object f171792x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171793y;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171793y = obj;
            this.f171790E |= Integer.MIN_VALUE;
            return C39834f.this.m127807n(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {242, 243}, m100432m = "stopAndSubmitEcgDataCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171795w;

        /* JADX INFO: renamed from: y */
        int f171797y;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171795w = obj;
            this.f171797y |= Integer.MIN_VALUE;
            return C39834f.this.m127808o(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {227}, m100432m = "stopLabrador", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171798w;

        /* JADX INFO: renamed from: y */
        int f171800y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171798w = obj;
            this.f171800y |= Integer.MIN_VALUE;
            return C39834f.this.m127810q(this);
        }
    }

    /* JADX INFO: renamed from: yw2.f$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.StrapConnection", m100430f = "StrapConnection.kt", m100431l = {130, 138}, m100432m = "stopRawDataCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f171801E;

        /* JADX INFO: renamed from: G */
        int f171803G;

        /* JADX INFO: renamed from: w */
        Object f171804w;

        /* JADX INFO: renamed from: x */
        Object f171805x;

        /* JADX INFO: renamed from: y */
        Object f171806y;

        /* JADX INFO: renamed from: z */
        Object f171807z;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171801E = obj;
            this.f171803G |= Integer.MIN_VALUE;
            return C39834f.this.m127812s(this);
        }
    }

    public C39834f(InterfaceC33704b whoopStrapProxy, InterfaceC4733b whoopStrapProvider, InterfaceC14783b labradorService, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(whoopStrapProxy, "whoopStrapProxy");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(labradorService, "labradorService");
        AbstractC22676k.m65750j(logger, "logger");
        this.whoopStrapProxy = whoopStrapProxy;
        this.whoopStrapProvider = whoopStrapProvider;
        this.labradorService = labradorService;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m127797e(C0947i c0947i, LabsCampaign labsCampaign, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f171756H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f171756H = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM127799g = dVar.f171754F;
        Object obj = EnumC31071a.f128113w;
        int i14 = dVar.f171756H;
        boolean zBooleanValue = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127799g);
            if (labsCampaign == null) {
                zBooleanValue = false;
            } else if (labsCampaign.getAdditionalCollectionLength() != null) {
                long jM2382X = c0947i.m2382X();
                long millis = TimeUnit.HOURS.toMillis(labsCampaign.getAdditionalCollectionLength().intValue());
                if (millis >= jM2382X) {
                    dVar.f171757w = null;
                    dVar.f171758x = null;
                    dVar.f171759y = jM2382X;
                    dVar.f171753E = 0;
                    dVar.f171760z = millis;
                    dVar.f171756H = 1;
                    objM127799g = m127799g(labsCampaign, dVar);
                    if (objM127799g == obj) {
                        return obj;
                    }
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM127799g);
        zBooleanValue = ((Boolean) objM127799g).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: f */
    private final InterfaceC14785d m127798f(String str) {
        if (AbstractC22676k.m65745e(str, "labrador_left_data")) {
            return InterfaceC14785d.a.f54815a;
        }
        if (AbstractC22676k.m65745e(str, "labrador_right_data")) {
            return InterfaceC14785d.b.f54816a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m127799g(LabsCampaign labsCampaign, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        LabsCampaign labsCampaign2;
        EnumC37318b enumC37318b;
        EnumC37318b enumC37318b2;
        C40727h c40727h;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f171762F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f171762F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f171766z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f171762F;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85228t("FAILURE Sending StartRawDataCommandPacket; will try stop and start", new AbstractC30556a.a[0]);
            EnumC37318b enumC37318b3 = EnumC37318b.SUCCESS;
            InterfaceC33704b interfaceC33704b = this.whoopStrapProxy;
            C39592f c39592f = new C39592f();
            eVar.f171763w = labsCampaign;
            eVar.f171764x = enumC37318b3;
            eVar.f171762F = 1;
            Object objMo106498k = interfaceC33704b.mo106498k(c39592f, 1000L, eVar);
            if (objMo106498k != obj2) {
                labsCampaign2 = labsCampaign;
                enumC37318b = enumC37318b3;
                obj = objMo106498k;
            }
            return obj2;
        }
        if (i14 == 1) {
            enumC37318b = (EnumC37318b) eVar.f171764x;
            labsCampaign2 = (LabsCampaign) eVar.f171763w;
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC37318b2 = (EnumC37318b) eVar.f171764x;
            AbstractC34132o.m107864I(obj);
        }
        c40727h = (C40727h) obj;
        if (enumC37318b2 == (c40727h != null ? c40727h.m132197V() : null)) {
            this.logger.mo85228t("sent StartRawDataCommandPacket successfully", new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85228t("Error re-sending StartRawDataCommandPacket; reporting error to user", new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
        C40727h c40727h2 = (C40727h) obj;
        int i15 = enumC37318b == (c40727h2 != null ? c40727h2.m132197V() : null) ? 1 : 0;
        if (i15 != 0) {
            this.logger.mo85228t("sent StopRawDataCommandPacket successfully; sending start", new AbstractC30556a.a[0]);
            EnumC37318b enumC37318b4 = EnumC37318b.SUCCESS;
            eVar.f171763w = null;
            eVar.f171764x = enumC37318b4;
            eVar.f171765y = i15;
            eVar.f171762F = 2;
            Object objM127801i = m127801i(labsCampaign2, eVar);
            if (objM127801i != obj2) {
                obj = objM127801i;
                enumC37318b2 = enumC37318b4;
                c40727h = (C40727h) obj;
                if (enumC37318b2 == (c40727h != null ? c40727h.m132197V() : null)) {
                    this.logger.mo85228t("sent StartRawDataCommandPacket successfully", new AbstractC30556a.a[0]);
                } else {
                    this.logger.mo85228t("Error re-sending StartRawDataCommandPacket; reporting error to user", new AbstractC30556a.a[0]);
                }
                return Boolean.valueOf(z4);
            }
            return obj2;
        }
        this.logger.mo85228t("Error Sending StopRawDataCommandPacket; reporting error to user", new AbstractC30556a.a[0]);
        z4 = false;
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m127800h(LabsCampaign labsCampaign, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f171767E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f171767E = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM127801i = fVar.f171770y;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar.f171767E;
        boolean z4 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127801i);
            this.logger.mo85228t("Sending StartRawDataCommandPacket", new AbstractC30556a.a[0]);
            fVar.f171768w = labsCampaign;
            fVar.f171767E = 1;
            objM127801i = m127801i(labsCampaign, fVar);
            if (objM127801i != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127801i);
            return objM127801i;
        }
        labsCampaign = (LabsCampaign) fVar.f171768w;
        AbstractC34132o.m107864I(objM127801i);
        C0947i c0947i = objM127801i instanceof C0947i ? (C0947i) objM127801i : null;
        EnumC37318b enumC37318bM132197V = c0947i != null ? c0947i.m132197V() : null;
        int i15 = enumC37318bM132197V == null ? -1 : b.f171748a[enumC37318bM132197V.ordinal()];
        if (i15 == 1) {
            z4 = true;
        } else if (i15 == 2) {
            fVar.f171768w = null;
            fVar.f171769x = null;
            fVar.f171767E = 2;
            Object objM127797e = m127797e(c0947i, labsCampaign, fVar);
            return objM127797e == obj ? obj : objM127797e;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: i */
    private final Object m127801i(LabsCampaign labsCampaign, InterfaceC30057d<? super C40727h> interfaceC30057d) {
        C39590d c39590d;
        if ((labsCampaign != null ? labsCampaign.getAdditionalCollectionLength() : null) != null) {
            this.logger.mo85228t("DWL data command: raw_data on with timeout {" + labsCampaign.getAdditionalCollectionLength() + "} hours", new AbstractC30556a.a[0]);
            c39590d = new C39590d(labsCampaign.getAdditionalCollectionLength().intValue());
        } else {
            this.logger.mo85228t("DWL data command: raw_data on", new AbstractC30556a.a[0]);
            c39590d = new C39590d(0, 1, null);
        }
        return this.whoopStrapProxy.mo106498k(c39590d, 1000L, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Object m127802d(InterfaceC30057d<? super Long> interfaceC30057d) {
        c cVar;
        Object objMo79830i;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f171752z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f171752z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object obj = cVar2.f171750x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f171752z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
            if (interfaceC21750d == null) {
                return null;
            }
            C38370n c38370n = new C38370n(interfaceC21750d.mo24752w0());
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(2, DurationUnit.SECONDS);
            cVar2.f171749w = null;
            cVar2.f171752z = 1;
            objMo79830i = interfaceC21750d.mo79830i(c38370n, duration, true, cVar2);
            if (objMo79830i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objMo79830i = ((C23468n) obj).f92940w;
        }
        if (objMo79830i instanceof C23467m) {
            objMo79830i = null;
        }
        C40727h c40727h = (C40727h) objMo79830i;
        InterfaceC40730i interfaceC40730i = c40727h instanceof InterfaceC40730i ? (InterfaceC40730i) c40727h : null;
        if ((c40727h != 0 ? c40727h.m132197V() : null) == EnumC37318b.SUCCESS && interfaceC40730i != null) {
            if (interfaceC40730i.mo132204q() < interfaceC40730i.mo132203e()) {
                return new Long((interfaceC40730i.mo132205t() - interfaceC40730i.mo132203e()) + interfaceC40730i.mo132204q());
            }
            return new Long(interfaceC40730i.mo132204q() - interfaceC40730i.mo132203e());
        }
        this.logger.mo85222m("Failed to retrieve or parse the data range response, packet response: " + interfaceC40730i, new AbstractC30556a.a[0]);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m127803j(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        g gVar;
        EnumC37318b enumC37318b;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f171775z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f171775z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        g gVar2 = gVar;
        Object obj = gVar2.f171773x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar2.f171775z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            this.logger.mo85228t("DWL data command: raw_data off", new AbstractC30556a.a[0]);
            EnumC37318b enumC37318b2 = EnumC37318b.SUCCESS;
            InterfaceC33704b interfaceC33704b = this.whoopStrapProxy;
            C39592f c39592f = new C39592f();
            gVar2.f171772w = enumC37318b2;
            gVar2.f171775z = 1;
            Object objM106481p = InterfaceC33704b.m106481p(interfaceC33704b, c39592f, 0L, gVar2, 2, null);
            if (objM106481p == enumC31071a) {
                return enumC31071a;
            }
            enumC37318b = enumC37318b2;
            obj = objM106481p;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC37318b = (EnumC37318b) gVar2.f171772w;
            AbstractC34132o.m107864I(obj);
        }
        C40727h c40727h = (C40727h) obj;
        return Boolean.valueOf(enumC37318b == (c40727h != null ? c40727h.m132197V() : null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bc, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127804k(java.lang.String r8, q83.InterfaceC30057d<? super java.lang.Boolean> r9) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39834f.m127804k(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m127805l(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f171785z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f171785z = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objMo24711Y = iVar.f171783x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f171785z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo24711Y);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
            if (interfaceC21750d == null) {
                this.logger.mo85216g("Couldn't start IMU collection: no strap detected", new AbstractC30556a.a[0]);
            } else if (interfaceC21750d.mo24752w0().isMaverickOrGoose()) {
                iVar.f171782w = null;
                iVar.f171785z = 1;
                objMo24711Y = interfaceC21750d.mo24711Y(true, 5000L, iVar);
                if (objMo24711Y == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                this.logger.mo85216g(AbstractC11895b.m31996o("Couldn't start IMU collection, strap is unsupported (", interfaceC21750d.mo24752w0().getCodeName(), ")"), new AbstractC30556a.a[0]);
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objMo24711Y);
        C40720e1 c40720e1 = (C40720e1) objMo24711Y;
        if (c40720e1 == null || !c40720e1.m132198W()) {
            this.logger.mo85216g("Couldn't start IMU collection: " + (c40720e1 != null ? c40720e1.m132197V() : null), new AbstractC30556a.a[0]);
            z4 = false;
        } else {
            this.logger.mo85216g("IMU data collection enabled", new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m127806m(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f171789z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f171789z = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object objMo24729h0 = jVar.f171787x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f171789z;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo24729h0);
            InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
            if (interfaceC21750d == null) {
                this.logger.mo85216g("Couldn't start PPG collection: no strap detected", new AbstractC30556a.a[0]);
            } else if (interfaceC21750d.mo24752w0().isMaverickOrGoose()) {
                jVar.f171786w = null;
                jVar.f171789z = 1;
                objMo24729h0 = interfaceC21750d.mo24729h0(true, 5000L, jVar);
                if (objMo24729h0 == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                this.logger.mo85216g(AbstractC11895b.m31996o("Couldn't start PPG collection, strap is unsupported (", interfaceC21750d.mo24752w0().getCodeName(), ")"), new AbstractC30556a.a[0]);
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objMo24729h0);
        C40723f1 c40723f1 = (C40723f1) objMo24729h0;
        if (c40723f1 == null || !c40723f1.m132198W()) {
            this.logger.mo85216g("Couldn't start PPG collection: " + (c40723f1 != null ? c40723f1.m132197V() : null), new AbstractC30556a.a[0]);
            z4 = false;
        } else {
            this.logger.mo85216g("PPG data collection enabled", new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
    
        if (r11 == r1) goto L38;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127807n(com.whoop.whooplabs.data.domain.LabsCampaign r10, q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yw2.C39834f.k
            if (r0 == 0) goto L13
            r0 = r11
            yw2.f$k r0 = (yw2.C39834f.k) r0
            int r1 = r0.f171790E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171790E = r1
            goto L18
        L13:
            yw2.f$k r0 = new yw2.f$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f171793y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f171790E
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r10 = r0.f171792x
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r10 = r0.f171791w
            com.whoop.whooplabs.data.domain.LabsCampaign r10 = (com.whoop.whooplabs.data.domain.LabsCampaign) r10
            p505ts.AbstractC34132o.m107864I(r11)
            goto Laf
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3c:
            java.lang.Object r10 = r0.f171792x
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r2 = r0.f171791w
            com.whoop.whooplabs.data.domain.LabsCampaign r2 = (com.whoop.whooplabs.data.domain.LabsCampaign) r2
            p505ts.AbstractC34132o.m107864I(r11)
            goto L75
        L48:
            p505ts.AbstractC34132o.m107864I(r11)
            td1.b r11 = r9.whoopStrapProxy
            com.whoop.domain.model.WhoopStrapInfo r11 = r11.mo106493f()
            if (r11 == 0) goto L64
            oh2.c r11 = r11.getHardwareVersion()
            if (r11 == 0) goto L64
            long r6 = r11.getHardwareFamily()
            int r11 = (int) r6
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r11)
            goto L65
        L64:
            r2 = r5
        L65:
            r0.f171791w = r10
            r0.f171792x = r2
            r0.f171790E = r4
            java.lang.Object r11 = r9.m127812s(r0)
            if (r11 != r1) goto L72
            goto Lae
        L72:
            r8 = r2
            r2 = r10
            r10 = r8
        L75:
            if (r10 != 0) goto L78
            goto L7f
        L78:
            int r11 = r10.intValue()
            r4 = 6
            if (r11 == r4) goto La2
        L7f:
            if (r10 != 0) goto L82
            goto L8b
        L82:
            int r11 = r10.intValue()
            r4 = 13
            if (r11 != r4) goto L8b
            goto La2
        L8b:
            tr2.n r11 = r9.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Strap not connected or Strap version not supported: "
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r0 = 0
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r0]
            r11.mo85226q(r10, r1)
            goto Lb5
        La2:
            r0.f171791w = r5
            r0.f171792x = r5
            r0.f171790E = r3
            java.lang.Object r11 = r9.m127800h(r2, r0)
            if (r11 != r1) goto Laf
        Lae:
            return r1
        Laf:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r0 = r11.booleanValue()
        Lb5:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39834f.m127807n(com.whoop.whooplabs.data.domain.LabsCampaign, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (ec3.AbstractC13091v.m36575A(r7, r0) == r1) goto L26;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127808o(q83.InterfaceC30057d<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof yw2.C39834f.l
            if (r0 == 0) goto L13
            r0 = r7
            yw2.f$l r0 = (yw2.C39834f.l) r0
            int r1 = r0.f171797y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171797y = r1
            goto L18
        L13:
            yw2.f$l r0 = new yw2.f$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f171795w
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f171797y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L2b
            goto L5d
        L2b:
            r7 = move-exception
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            p505ts.AbstractC34132o.m107864I(r7)     // Catch: java.lang.Exception -> L2b
            l83.n r7 = (l83.C23468n) r7     // Catch: java.lang.Exception -> L2b
            r7.getClass()     // Catch: java.lang.Exception -> L2b
            goto L4e
        L3e:
            p505ts.AbstractC34132o.m107864I(r7)
            fu1.b r7 = r6.labradorService     // Catch: java.lang.Exception -> L2b
            fu1.c$c r2 = fu1.InterfaceC14784c.c.f54814a     // Catch: java.lang.Exception -> L2b
            r0.f171797y = r5     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r7.mo42417b(r2, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L4e
            goto L5c
        L4e:
            fu1.b r7 = r6.labradorService     // Catch: java.lang.Exception -> L2b
            ec3.l r7 = r7.mo42419d()     // Catch: java.lang.Exception -> L2b
            r0.f171797y = r4     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = ec3.AbstractC13091v.m36575A(r7, r0)     // Catch: java.lang.Exception -> L2b
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            tr2.n r7 = r6.logger     // Catch: java.lang.Exception -> L2b
            java.lang.String r0 = "DWL data command: Labrador off"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]     // Catch: java.lang.Exception -> L2b
            r7.mo85228t(r0, r1)     // Catch: java.lang.Exception -> L2b
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L2b
            return r7
        L69:
            tr2.n r0 = r6.logger
            java.lang.String r7 = r7.getMessage()
            java.lang.String r1 = "Couldn't upload ecg data collection: "
            java.lang.String r7 = p000.AbstractC11266d.m30461o(r1, r7)
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r3]
            r0.mo85222m(r7, r1)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39834f.m127808o(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: p */
    public final Object m127809p(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo24711Y;
        this.logger.mo85216g("Stopping IMU collection", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (objMo24711Y = interfaceC21750d.mo24711Y(false, 5000L, interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objMo24711Y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m127810q(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        m mVar;
        Object objMo42417b;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f171800y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f171800y = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object obj = mVar.f171798w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f171800y;
        boolean z4 = true;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC14783b interfaceC14783b = this.labradorService;
            InterfaceC14784c.c cVar = InterfaceC14784c.c.f54814a;
            mVar.f171800y = 1;
            objMo42417b = interfaceC14783b.mo42417b(cVar, mVar);
            if (objMo42417b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objMo42417b = ((C23468n) obj).f92940w;
        }
        if (objMo42417b instanceof C23467m) {
            objMo42417b = null;
        }
        if (AbstractC22676k.m65745e((InterfaceC14782a) objMo42417b, InterfaceC14782a.a.f54811a)) {
            this.logger.mo85216g("Labrador stopped", new AbstractC30556a.a[0]);
        } else {
            this.logger.mo85222m("Couldn't stop labrador", new AbstractC30556a.a[0]);
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }

    /* JADX INFO: renamed from: r */
    public final Object m127811r(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo24729h0;
        this.logger.mo85216g("Stopping PPG collection", new AbstractC30556a.a[0]);
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        return (interfaceC21750d == null || (objMo24729h0 = interfaceC21750d.mo24729h0(false, 5000L, interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objMo24729h0;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r12 == r1) goto L49;
     */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127812s(q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39834f.m127812s(q83.d):java.lang.Object");
    }
}
