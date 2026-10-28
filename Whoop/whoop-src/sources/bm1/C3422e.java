package bm1;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.whoop.design.json.AbstractC6730d;
import com.whoop.home.domain.models.StreakMetadata;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ts0.C34137b;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: bm1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lbm1/e;", "", "La6/g;", "Lf6/f;", "dataStore", "Lcom/google/gson/Gson;", "gson", "Ltr2/n;", "logger", "<init>", "(La6/g;Lcom/google/gson/Gson;Ltr2/n;)V", "Lcom/whoop/home/domain/models/StreakMetadata;", "b", "(Lq83/d;)Ljava/lang/Object;", "metadata", "Ll83/a0;", "c", "(Lcom/whoop/home/domain/models/StreakMetadata;Lq83/d;)Ljava/lang/Object;", "a", "La6/g;", "Lcom/google/gson/Gson;", "Ltr2/n;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3422e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Gson gson;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: bm1.e$a */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomePreviousStreakDataStoreHandler", m100430f = "StreaksHomePreviousStreakDataStoreHandler.kt", m100431l = {32}, m100432m = "getPreviousStreakData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f13388w;

        /* JADX INFO: renamed from: y */
        int f13390y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f13388w = obj;
            this.f13390y |= Integer.MIN_VALUE;
            return C3422e.this.m9891b(this);
        }
    }

    /* JADX INFO: renamed from: bm1.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomePreviousStreakDataStoreHandler", m100430f = "StreaksHomePreviousStreakDataStoreHandler.kt", m100431l = {55}, m100432m = "updatePreviousStreakData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f13391w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13392x;

        /* JADX INFO: renamed from: z */
        int f13394z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f13392x = obj;
            this.f13394z |= Integer.MIN_VALUE;
            return C3422e.this.m9892c(null, this);
        }
    }

    /* JADX INFO: renamed from: bm1.e$c */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.streaks.StreaksHomePreviousStreakDataStoreHandler$updatePreviousStreakData$2", m100430f = "StreaksHomePreviousStreakDataStoreHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f13395w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f13396x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ StreakMetadata f13398z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StreakMetadata streakMetadata, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f13398z = streakMetadata;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C3422e.this.new c(this.f13398z, interfaceC30057d);
            cVar.f13396x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f13396x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f13395w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C34137b.f143077a.m107904a(), C3422e.this.gson.toJson(new C3418a(this.f13398z.getStreakValue(), this.f13398z.getStreakState(), this.f13398z.getLottieUrl(), this.f13398z.getImageUrl(), this.f13398z.getNavigation(), this.f13398z.getAnimationAccentColor())));
            return C23454a0.f92919a;
        }
    }

    public C3422e(InterfaceC0422g dataStore, Gson gson, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(gson, "gson");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.gson = gson;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m9891b(InterfaceC30057d<? super StreakMetadata> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f13390y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f13390y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object objM36577C = aVar.f13388w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar.f13390y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36577C);
                InterfaceC13058l data = this.dataStore.getData();
                aVar.f13390y = 1;
                objM36577C = AbstractC13091v.m36577C(data, aVar);
                if (objM36577C == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36577C);
            }
            AbstractC14134f abstractC14134f = (AbstractC14134f) objM36577C;
            String str = abstractC14134f != null ? (String) abstractC14134f.mo40227b(C34137b.f143077a.m107904a()) : null;
            if (str != null && !AbstractC39414r.m125890i0(str)) {
                C3418a c3418a = (C3418a) this.gson.fromJson(str, C3418a.class);
                return new StreakMetadata(c3418a.getStreakValue(), c3418a.getStreakState(), c3418a.getLottieUrl(), c3418a.getImageUrl(), c3418a.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String(), c3418a.getAnimationAccentColor());
            }
            return null;
        } catch (Exception unused) {
            AbstractC3006f0.m8721o(aVar.getContext());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m9892c(StreakMetadata streakMetadata, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f13394z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f13394z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f13392x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f13394z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.dataStore;
                c cVar = new c(streakMetadata, null);
                bVar.f13391w = null;
                bVar.f13394z = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
        } catch (Exception e5) {
            this.logger.mo85230v("Failed to update previous streak data in DataStore", e5, new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C3422e(InterfaceC0422g interfaceC0422g, Gson gson, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            gson = AbstractC6730d.m20388f(new GsonBuilder(), null, null, 3, null).create();
            AbstractC22676k.m65749i(gson, "create(...)");
        }
        this(interfaceC0422g, gson, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("StreaksHomePreviousStreakDataStoreHandler") : interfaceC34116n);
    }
}
