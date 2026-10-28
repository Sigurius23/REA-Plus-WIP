package mh2;

import android.database.sqlite.SQLiteException;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.ConnectivityFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ku0.InterfaceC22832a;
import l83.C23454a0;
import lu0.C24747c;
import oh2.C27938a;
import oh2.C27940c;
import oh2.C27941d;
import oh2.C27942e;
import oh2.InterfaceC27939b;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ph2.AbstractC29248a;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: mh2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lmh2/a;", "", "Lku0/a;", "strapMetadataDao", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lku0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "id", "Loh2/d;", "e", "(ILq83/d;)Ljava/lang/Object;", "version", "f", "(Loh2/d;Lq83/d;)Ljava/lang/Object;", "i", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(I)Loh2/d;", "historyHeartDataVersion", "j", "(Loh2/d;)I", "Loh2/a;", "g", "(I)Loh2/a;", "a", "Lku0/a;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "c", "Ltr2/n;", "logger", "Lmh2/c;", "d", "Lmh2/c;", "versionCache", "strap-metadata_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25561a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC22832a strapMetadataDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C25563c versionCache;

    /* JADX INFO: renamed from: mh2.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {103}, m100432m = "fetchDataVersion", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        int f100227w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f100228x;

        /* JADX INFO: renamed from: z */
        int f100230z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100228x = obj;
            this.f100230z |= Integer.MIN_VALUE;
            return C25561a.this.m75167e(0, this);
        }
    }

    /* JADX INFO: renamed from: mh2.a$b */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {125}, m100432m = "fetchIdFromDb", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f100231E;

        /* JADX INFO: renamed from: G */
        int f100233G;

        /* JADX INFO: renamed from: w */
        Object f100234w;

        /* JADX INFO: renamed from: x */
        Object f100235x;

        /* JADX INFO: renamed from: y */
        Object f100236y;

        /* JADX INFO: renamed from: z */
        Object f100237z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100231E = obj;
            this.f100233G |= Integer.MIN_VALUE;
            return C25561a.this.m75168f(null, this);
        }
    }

    /* JADX INFO: renamed from: mh2.a$c */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor$getVersion$1", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {53}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Loh2/d;", "<anonymous>", "(Lbc3/c0;)Loh2/d;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100238w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f100240y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i13, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100240y = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25561a.this.new c(this.f100240y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C27941d> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100238w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25561a c25561a = C25561a.this;
                int i14 = this.f100240y;
                this.f100238w = 1;
                obj = c25561a.m75167e(i14, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C27941d c27941d = (C27941d) obj;
            if (c27941d == null) {
                C25561a.this.logger.mo85222m(AbstractC2875y.m8296i(this.f100240y, "Could not find any records for the given version id - ", ", returning null!"), new AbstractC30556a.a[0]);
            }
            return c27941d;
        }
    }

    /* JADX INFO: renamed from: mh2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {171, 173}, m100432m = "insertVersion", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f100241E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f100242F;

        /* JADX INFO: renamed from: H */
        int f100244H;

        /* JADX INFO: renamed from: w */
        Object f100245w;

        /* JADX INFO: renamed from: x */
        Object f100246x;

        /* JADX INFO: renamed from: y */
        Object f100247y;

        /* JADX INFO: renamed from: z */
        Object f100248z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f100242F = obj;
            this.f100244H |= Integer.MIN_VALUE;
            return C25561a.this.m75169i(null, this);
        }
    }

    /* JADX INFO: renamed from: mh2.a$e */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor$saveAndGetVersionId$1", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100249w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27941d f100251y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C27941d c27941d, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100251y = c27941d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25561a.this.new e(this.f100251y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100249w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C25561a c25561a = C25561a.this;
            C27941d c27941d = this.f100251y;
            this.f100249w = 1;
            Object objM75168f = c25561a.m75168f(c27941d, this);
            return objM75168f == enumC31071a ? enumC31071a : objM75168f;
        }
    }

    /* JADX INFO: renamed from: mh2.a$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.strapMetadata.StrapMetadataDaoInteractor$saveAndGetVersionId$2", m100430f = "StrapMetadataDaoInteractor.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)I"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f100252w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C27941d f100254y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C27941d c27941d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f100254y = c27941d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25561a.this.new f(this.f100254y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Integer> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f100252w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C25561a c25561a = C25561a.this;
            C27941d c27941d = this.f100254y;
            this.f100252w = 1;
            Object objM75169i = c25561a.m75169i(c27941d, this);
            return objM75169i == enumC31071a ? enumC31071a : objM75169i;
        }
    }

    public C25561a(InterfaceC22832a strapMetadataDao, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(strapMetadataDao, "strapMetadataDao");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.strapMetadataDao = strapMetadataDao;
        this.featureFlagChecker = featureFlagChecker;
        this.logger = InterfaceC34116n.INSTANCE.m107848a("StrapMetadataDaoInteractor");
        this.versionCache = new C25563c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m75167e(int i13, InterfaceC30057d<? super C27941d> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i14 = aVar.f100230z;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar.f100230z = i14 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objMo66209c = aVar.f100228x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = aVar.f100230z;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(objMo66209c);
                this.logger.mo85228t("Fetching HistoryHeartDataVersion from room db", new AbstractC30556a.a[0]);
                InterfaceC22832a interfaceC22832a = this.strapMetadataDao;
                aVar.f100227w = i13;
                aVar.f100230z = 1;
                objMo66209c = interfaceC22832a.mo66209c(i13, aVar);
                if (objMo66209c == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo66209c);
            }
            return AbstractC29248a.m88851a((C24747c) objMo66209c, this.featureFlagChecker.isFeatureEnabled(ConnectivityFeatureFlagsKt.CASTLE_FW_VERSION_STRING_READ));
        } catch (SQLiteException e5) {
            this.logger.mo85230v("Caught a SQLiteException when trying to fetch HeartDataVersionDto from HeartDataVersionDao!", e5, new AbstractC30556a.a[0]);
            return null;
        } catch (Exception e13) {
            this.logger.mo85230v("Caught an exception when trying to fetch HeartDataVersionDto from HeartDataVersionDao!", e13, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: f */
    public final Object m75168f(C27941d c27941d, InterfaceC30057d<? super Integer> interfaceC30057d) {
        b bVar;
        int i13;
        Object obj;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i14 = bVar.f100233G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f100233G = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj2 = bVar.f100231E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = bVar.f100233G;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj2);
                C27940c c27940cM84345f = c27941d.m84345f();
                C27942e c27942eM84346g = c27941d.m84346g();
                InterfaceC27939b interfaceC27939bM84344e = c27941d.m84344e();
                AbstractC22676k.m65749i(interfaceC27939bM84344e, "getFirmwareVersion(...)");
                InterfaceC27939b.b bVarM75174b = AbstractC25562b.m75174b(interfaceC27939bM84344e);
                InterfaceC22832a interfaceC22832a = this.strapMetadataDao;
                int hardwareFamily = (int) c27940cM84345f.getHardwareFamily();
                int pcbaRevision = (int) c27940cM84345f.getPcbaRevision();
                int opticalRevision = (int) c27940cM84345f.getOpticalRevision();
                int major = (int) bVarM75174b.getMajor();
                int minor = (int) bVarM75174b.getMinor();
                int build = (int) bVarM75174b.getBuild();
                int unreleased = (int) bVarM75174b.getUnreleased();
                String strMo84319a = c27941d.m84344e().mo84319a();
                short sM84357c = c27942eM84346g.m84357c();
                short sM84358d = c27942eM84346g.m84358d();
                short sM84359e = c27942eM84346g.m84359e();
                try {
                    byte bM84343d = c27941d.m84343d();
                    byte bM84342c = c27941d.m84342c();
                    String strM84347h = c27941d.m84347h();
                    AbstractC22676k.m65749i(strM84347h, "getStrapId(...)");
                    try {
                        bVar.f100234w = null;
                        bVar.f100235x = null;
                        bVar.f100236y = null;
                        bVar.f100237z = null;
                        bVar.f100233G = 1;
                        b bVar2 = bVar;
                        i13 = 0;
                        obj = null;
                        try {
                            Object objMo66208b = interfaceC22832a.mo66208b(hardwareFamily, pcbaRevision, opticalRevision, major, minor, build, unreleased, strMo84319a, sM84357c, sM84358d, sM84359e, bM84343d, bM84342c, strM84347h, bVar2);
                            if (objMo66208b == enumC31071a) {
                                return enumC31071a;
                            }
                            obj2 = objMo66208b;
                        } catch (SQLiteException e5) {
                            e = e5;
                            this.logger.mo85230v("Caught a SQLiteException when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                            return obj;
                        } catch (Exception e13) {
                            e = e13;
                            this.logger.mo85230v("Caught an exception when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                            return obj;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        obj = null;
                        i13 = 0;
                        this.logger.mo85230v("Caught a SQLiteException when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                        return obj;
                    } catch (Exception e15) {
                        e = e15;
                        obj = null;
                        i13 = 0;
                        this.logger.mo85230v("Caught an exception when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                        return obj;
                    }
                } catch (SQLiteException e16) {
                    e = e16;
                    i13 = 0;
                    obj = null;
                    this.logger.mo85230v("Caught a SQLiteException when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                    return obj;
                } catch (Exception e17) {
                    e = e17;
                    i13 = 0;
                    obj = null;
                    this.logger.mo85230v("Caught an exception when trying to fetch version_id from HeartDataVersionDao!", e, new AbstractC30556a.a[i13]);
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj2);
                i13 = 0;
                obj = null;
            }
            return (Integer) obj2;
        } catch (SQLiteException e18) {
            e = e18;
            i13 = 0;
        } catch (Exception e19) {
            e = e19;
            i13 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        if (r0 == r4) goto L29;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m75169i(oh2.C27941d r29, q83.InterfaceC30057d<? super java.lang.Integer> r30) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.C25561a.m75169i(oh2.d, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: g */
    public final C27938a m75170g(int version) {
        C27941d c27941dM75171h;
        if (version == -1 || (c27941dM75171h = m75171h(version)) == null) {
            return null;
        }
        return c27941dM75171h.m84341a();
    }

    /* JADX INFO: renamed from: h */
    public final C27941d m75171h(int id4) {
        C27941d c27941dM75175a = this.versionCache.m75175a(id4);
        if (c27941dM75175a != null) {
            return c27941dM75175a;
        }
        C22365e c22365e = AbstractC3050q0.f12077a;
        return (C27941d) AbstractC3006f0.m8699E(ExecutorC22364d.f87316w, new c(id4, null));
    }

    /* JADX INFO: renamed from: j */
    public final int m75172j(C27941d historyHeartDataVersion) {
        AbstractC22676k.m65750j(historyHeartDataVersion, "historyHeartDataVersion");
        Long lM75176b = this.versionCache.m75176b(historyHeartDataVersion);
        Integer numValueOf = lM75176b != null ? Integer.valueOf((int) lM75176b.longValue()) : null;
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        Integer num = (Integer) AbstractC3006f0.m8699E(executorC22364d, new e(historyHeartDataVersion, null));
        if (num == null) {
            this.logger.mo85219j("Trying to save a new version", new AbstractC30556a.a[0]);
            num = (Integer) AbstractC3006f0.m8699E(executorC22364d, new f(historyHeartDataVersion, null));
        }
        if (num == null) {
            this.logger.mo85222m("Failed to save a new version, returning missing", new AbstractC30556a.a[0]);
            num = -1;
        } else {
            this.versionCache.m75177c(num.intValue(), historyHeartDataVersion);
        }
        return num.intValue();
    }
}
