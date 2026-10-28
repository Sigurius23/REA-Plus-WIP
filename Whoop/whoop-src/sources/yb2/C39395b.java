package yb2;

import android.os.LocaleList;
import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.ArabicLanguageEnabledChecker;
import com.whoop.data.repositories.DefaultLanguageDecider;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.design.util.AbstractC8693b;
import ec3.AbstractC13091v;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import fc2.InterfaceC14369c;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import l83.C23454a0;
import m83.AbstractC25265s;
import n83.C26460c;
import or2.AbstractC28202t0;
import or2.C28162g;
import or2.InterfaceC28197r1;
import p029b5.C2728g;
import p505ts.AbstractC34132o;
import p705ea2.AbstractC12922s;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import xb2.C38165a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yb2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 !2\u00020\u0001:\u00017BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\"\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020 2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b(\u0010)J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u001aH\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b-\u0010.J\u001d\u00100\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b0\u00101J!\u00105\u001a\b\u0012\u0004\u0012\u00020\u0014022\f\u00104\u001a\b\u0012\u0004\u0012\u00020302¢\u0006\u0004\b5\u00106R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010@¨\u0006A"}, m65681d2 = {"Lyb2/b;", "", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lor2/g;", "buildConfigProvider", "Lor2/r1;", "systemResources", "Ltr2/n;", "logger", "Lxb2/a;", "appSpecificLanguageUpdater", "Lfi0/a;", "analytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;", "arabicLanguageEnabledChecker", "<init>", "(Lcom/whoop/data/repositories/LanguageRepository;Lor2/g;Lor2/r1;Ltr2/n;Lxb2/a;Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;)V", "Lyb2/a;", "prevState", "", "newLanguage", "d", "(Lyb2/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "Lyb2/c;", "languageOptions", "Lb5/g;", "c", "(Ljava/lang/String;Ljava/util/List;)Lb5/g;", "", "i", "(Ljava/lang/String;Ljava/util/List;)Z", "Ljava/util/Locale;", "l", "(Ljava/lang/String;)Ljava/util/Locale;", "e", "()Ljava/lang/String;", "j", "(Lq83/d;)Ljava/lang/Object;", "beList", "k", "(Ljava/util/List;)Ljava/util/List;", "g", "()Ljava/util/List;", "filtered", "f", "(Ljava/util/List;)Lyb2/c;", "Lec3/l;", "Lfc2/c;", "upstream", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/data/repositories/LanguageRepository;", "b", "Lor2/g;", "Lor2/r1;", "Ltr2/n;", "Lxb2/a;", "Lfi0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39395b {

    /* JADX INFO: renamed from: j */
    public static final int f169516j = 8;

    /* JADX INFO: renamed from: k */
    private static final List<C39396c> f169517k = AbstractC37056f.m118959K(new C39396c(LanguageRepositoryKt.DEFAULT_LANGUAGE, "ENGLISH", AbstractC8693b.m21277k(AbstractC12922s.f44628s), false, 8, null), new C39396c("de", "DEUTSCH", AbstractC8693b.m21277k(AbstractC12922s.f44638x), false, 8, null), new C39396c("fr", "FRANÇAIS", AbstractC8693b.m21277k(AbstractC12922s.f44636w), false, 8, null), new C39396c("es", "ESPAÑOL (LATINOAMÉRICA)", AbstractC8693b.m21277k(AbstractC12922s.f44569I0), false, 8, null), new C39396c("it", "ITALIANO", AbstractC8693b.m21277k(AbstractC12922s.f44552A), false, 8, null), new C39396c("pt", "PORTUGUÊS (PORTUGAL)", AbstractC8693b.m21277k(AbstractC12922s.f44578N), false, 8, null));

    /* JADX INFO: renamed from: l */
    private static final C39396c f169518l = new C39396c("ar", "العربية", AbstractC8693b.m21277k(AbstractC12922s.f44606h), false, 8, null);

    /* JADX INFO: renamed from: m */
    private static final C39396c f169519m = new C39396c("ru", "РУССКИЙ", AbstractC8693b.m21277k(AbstractC12922s.f44581P), false, 8, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28162g buildConfigProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28197r1 systemResources;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38165a appSpecificLanguageUpdater;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final ArabicLanguageEnabledChecker arabicLanguageEnabledChecker;

    /* JADX INFO: renamed from: yb2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.domain.LanguagePrefsInteractor", m100430f = "LanguagePrefsInteractor.kt", m100431l = {60, 62}, m100432m = "changeLanguage", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f169529F;

        /* JADX INFO: renamed from: w */
        Object f169530w;

        /* JADX INFO: renamed from: x */
        Object f169531x;

        /* JADX INFO: renamed from: y */
        Object f169532y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f169533z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f169533z = obj;
            this.f169529F |= Integer.MIN_VALUE;
            return C39395b.this.m125819d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: yb2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.domain.LanguagePrefsInteractor$interact$1", m100430f = "LanguagePrefsInteractor.kt", m100431l = {45, 46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lyb2/a;", "prevState", "Lfc2/c;", NotificationCompat.CATEGORY_EVENT, "<anonymous>", "(Lyb2/a;Lfc2/c;)Lyb2/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f169534w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f169535x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f169536y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C39394a c39394a, InterfaceC14369c interfaceC14369c, InterfaceC30057d<? super C39394a> interfaceC30057d) {
            c cVar = C39395b.this.new c(interfaceC30057d);
            cVar.f169535x = c39394a;
            cVar.f169536y = interfaceC14369c;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r7 == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
        
            if (r7 == r2) goto L21;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f169535x
                yb2.a r0 = (yb2.C39394a) r0
                java.lang.Object r1 = r6.f169536y
                fc2.c r1 = (fc2.InterfaceC14369c) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f169534w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                p505ts.AbstractC34132o.m107864I(r7)
                goto L5b
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L41
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof fc2.InterfaceC14369c.a
                r3 = 0
                if (r7 == 0) goto L44
                yb2.b r7 = yb2.C39395b.this
                fc2.c$a r1 = (fc2.InterfaceC14369c.a) r1
                java.lang.String r1 = r1.getId()
                r6.f169535x = r3
                r6.f169536y = r3
                r6.f169534w = r5
                java.lang.Object r7 = yb2.C39395b.m125816a(r7, r0, r1, r6)
                if (r7 != r2) goto L41
                goto L5a
            L41:
                yb2.a r7 = (yb2.C39394a) r7
                return r7
            L44:
                fc2.c$b r7 = fc2.InterfaceC14369c.b.f52471a
                boolean r7 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r1, r7)
                if (r7 == 0) goto L5e
                yb2.b r7 = yb2.C39395b.this
                r6.f169535x = r3
                r6.f169536y = r3
                r6.f169534w = r4
                java.lang.Object r7 = yb2.C39395b.m125817b(r7, r6)
                if (r7 != r2) goto L5b
            L5a:
                return r2
            L5b:
                yb2.a r7 = (yb2.C39394a) r7
                return r7
            L5e:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yb2.C39395b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: yb2.b$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.language.domain.LanguagePrefsInteractor", m100430f = "LanguagePrefsInteractor.kt", m100431l = {104}, m100432m = "load", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f169538w;

        /* JADX INFO: renamed from: y */
        int f169540y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f169538w = obj;
            this.f169540y |= Integer.MIN_VALUE;
            return C39395b.this.m125824j(this);
        }
    }

    public C39395b(LanguageRepository languageRepository, C28162g buildConfigProvider, InterfaceC28197r1 systemResources, InterfaceC34116n logger, C38165a appSpecificLanguageUpdater, InterfaceC14515a analytics, FeatureFlagChecker featureFlagChecker, ArabicLanguageEnabledChecker arabicLanguageEnabledChecker) {
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(buildConfigProvider, "buildConfigProvider");
        AbstractC22676k.m65750j(systemResources, "systemResources");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(appSpecificLanguageUpdater, "appSpecificLanguageUpdater");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(arabicLanguageEnabledChecker, "arabicLanguageEnabledChecker");
        this.languageRepository = languageRepository;
        this.buildConfigProvider = buildConfigProvider;
        this.systemResources = systemResources;
        this.logger = logger;
        this.appSpecificLanguageUpdater = appSpecificLanguageUpdater;
        this.analytics = analytics;
        this.featureFlagChecker = featureFlagChecker;
        this.arabicLanguageEnabledChecker = arabicLanguageEnabledChecker;
    }

    /* JADX INFO: renamed from: c */
    private final C2728g m125818c(String newLanguage, List<C39396c> languageOptions) {
        if (m125823i(newLanguage, languageOptions)) {
            C2728g c2728g = C2728g.f10738b;
            AbstractC22676k.m65749i(c2728g, "getEmptyLocaleList(...)");
            return c2728g;
        }
        List<Locale> listM85350a = AbstractC28202t0.m85350a(this.systemResources.mo85332b());
        if (listM85350a.isEmpty()) {
            listM85350a = AbstractC28202t0.m85350a(this.systemResources.mo85331a());
        }
        Locale localeM125826l = m125826l(newLanguage);
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.add(0, localeM125826l);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM85350a) {
            if (!AbstractC22676k.m65745e(((Locale) obj).getLanguage(), localeM125826l.getLanguage())) {
                arrayList.add(obj);
            }
        }
        c26460cM119000x.addAll(arrayList);
        Locale[] localeArr = (Locale[]) AbstractC37056f.m118988k(c26460cM119000x).toArray(new Locale[0]);
        Locale[] localeArr2 = (Locale[]) Arrays.copyOf(localeArr, localeArr.length);
        C2728g c2728g2 = C2728g.f10738b;
        return C2728g.m7699f(new LocaleList(localeArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m125819d(C39394a c39394a, String str, InterfaceC30057d<? super C39394a> interfaceC30057d) throws Exception {
        b bVar;
        Object obj;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f169529F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f169529F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj2 = bVar2.f169533z;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = bVar2.f169529F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (str != null && !c39394a.m125815b().isEmpty()) {
                this.logger.mo85228t("changing language to ".concat(str), new AbstractC30556a.a[0]);
                InterfaceC14515a.m41418i(this.analytics, null, "Save", str, "Settings - Language", null, null, 49, null);
                C2728g c2728gM125818c = m125818c(str, c39394a.m125815b());
                C38165a c38165a = this.appSpecificLanguageUpdater;
                boolean z4 = !m125823i(str, c39394a.m125815b());
                bVar2.f169530w = null;
                bVar2.f169531x = null;
                bVar2.f169532y = null;
                bVar2.f169529F = 1;
                if (c38165a.m122264e(c2728gM125818c, z4, bVar2) != obj3) {
                }
                obj = c39394a;
                obj = c39394a;
                return obj3;
            }
            obj = c39394a;
            obj = c39394a;
            obj = c39394a;
            return obj;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj2);
            return obj2;
        }
        AbstractC34132o.m107864I(obj2);
        obj = c39394a;
        obj = c39394a;
        bVar2.f169530w = null;
        bVar2.f169531x = null;
        bVar2.f169532y = null;
        bVar2.f169529F = 2;
        Object objM125824j = m125824j(bVar2);
        obj = objM125824j;
        if (objM125824j == obj3) {
            obj = c39394a;
            obj = c39394a;
            return obj3;
        }
        obj = c39394a;
        obj = c39394a;
        obj = c39394a;
        return obj;
    }

    /* JADX INFO: renamed from: e */
    private final String m125820e() {
        if (!this.buildConfigProvider.getDebuggable()) {
            return "";
        }
        return "headers: " + this.languageRepository.getHeader() + " \n language:" + this.languageRepository.getAllowedLanguage();
    }

    /* JADX INFO: renamed from: f */
    private final C39396c m125821f(List<C39396c> filtered) {
        for (Locale locale : AbstractC28202t0.m85350a(this.systemResources.mo85331a())) {
            for (C39396c c39396c : filtered) {
                if (AbstractC39421y.m125921F(c39396c.getLanguageId(), locale.getLanguage(), true) && DefaultLanguageDecider.INSTANCE.allowedByRegion(locale)) {
                    return c39396c;
                }
            }
        }
        for (C39396c c39396c2 : filtered) {
            if (AbstractC22676k.m65745e(c39396c2.getLanguageId(), LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                return c39396c2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: g */
    private final List<C39396c> m125822g() {
        C26460c c26460cM119000x = AbstractC37056f.m119000x();
        c26460cM119000x.addAll(f169517k);
        if (this.arabicLanguageEnabledChecker.isArabicLanguageEnabled()) {
            c26460cM119000x.add(f169518l);
        }
        if (this.featureFlagChecker.isFeatureEnabled("russian-language-enabled-android")) {
            c26460cM119000x.add(f169519m);
        }
        return AbstractC37056f.m118988k(c26460cM119000x);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m125823i(String newLanguage, List<C39396c> languageOptions) {
        return AbstractC22676k.m65745e(newLanguage, ((C39396c) AbstractC25265s.m74096F0(languageOptions)).getLanguageId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m125824j(InterfaceC30057d<? super C39394a> interfaceC30057d) throws Exception {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f169540y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f169540y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objFetchAllowedLanguagesForUi = dVar.f169538w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f169540y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objFetchAllowedLanguagesForUi);
            LanguageRepository languageRepository = this.languageRepository;
            dVar.f169540y = 1;
            objFetchAllowedLanguagesForUi = languageRepository.fetchAllowedLanguagesForUi(dVar);
            if (objFetchAllowedLanguagesForUi == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objFetchAllowedLanguagesForUi);
        }
        return new C39394a(m125825k((List) objFetchAllowedLanguagesForUi), m125820e());
    }

    /* JADX INFO: renamed from: k */
    private final List<C39396c> m125825k(List<String> beList) {
        Object next;
        List<C39396c> listM125822g = m125822g();
        String languageTag = this.languageRepository.getAllowedLanguage().toLanguageTag();
        AbstractC22676k.m65749i(languageTag, "toLanguageTag(...)");
        String str = (String) AbstractC25265s.m74096F0(AbstractC39414r.m125906y0(languageTag, new String[]{"-"}, 6));
        ArrayList arrayList = new ArrayList();
        for (String str2 : beList) {
            Iterator<T> it = listM125822g.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC39421y.m125921F(((C39396c) next).getLanguageId(), str2, true));
            C39396c c39396c = (C39396c) next;
            C39396c c39396cM125829b = c39396c != null ? C39396c.m125829b(c39396c, null, null, null, AbstractC22676k.m65745e(c39396c.getLanguageId(), str), 7, null) : null;
            if (c39396cM125829b != null) {
                arrayList.add(c39396cM125829b);
            }
        }
        ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(arrayList);
        C39396c c39396cM125821f = m125821f(arrayListM74097F1);
        arrayListM74097F1.remove(c39396cM125821f);
        arrayListM74097F1.add(0, C39396c.m125829b(c39396cM125821f, null, null, AbstractC8693b.m21277k(AbstractC12922s.f44610j), false, 11, null));
        return arrayListM74097F1;
    }

    /* JADX INFO: renamed from: l */
    private final Locale m125826l(String newLanguage) {
        if (AbstractC22676k.m65745e(newLanguage, "pt")) {
            Locale localeForLanguageTag = Locale.forLanguageTag(LanguageRepositoryKt.EURO_PORTUGUESE);
            AbstractC22676k.m65749i(localeForLanguageTag, "forLanguageTag(...)");
            return localeForLanguageTag;
        }
        Locale localeForLanguageTag2 = Locale.forLanguageTag(newLanguage);
        AbstractC22676k.m65749i(localeForLanguageTag2, "forLanguageTag(...)");
        return localeForLanguageTag2;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC13058l m125827h(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36612v(new C13060l1(new C39394a(null, null, 3, null), upstream, new c(null)), 1);
    }

    public /* synthetic */ C39395b(LanguageRepository languageRepository, C28162g c28162g, InterfaceC28197r1 interfaceC28197r1, InterfaceC34116n interfaceC34116n, C38165a c38165a, InterfaceC14515a interfaceC14515a, FeatureFlagChecker featureFlagChecker, ArabicLanguageEnabledChecker arabicLanguageEnabledChecker, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(languageRepository, c28162g, interfaceC28197r1, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("LanguagePrefsInteractor") : interfaceC34116n, c38165a, interfaceC14515a, featureFlagChecker, arabicLanguageEnabledChecker);
    }
}
