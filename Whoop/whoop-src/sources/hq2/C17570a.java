package hq2;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: hq2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0086@¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m65681d2 = {"Lhq2/a;", "", "La6/g;", "Lf6/f;", "dataStore", "<init>", "(La6/g;)V", "", "year", "", "text", "Ll83/a0;", "f", "(ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "d", "(Lq83/d;)Ljava/lang/Object;", "e", "c", "a", "La6/g;", "b", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C17570a {

    /* JADX INFO: renamed from: c */
    public static final int f68066c = 8;

    /* JADX INFO: renamed from: d */
    private static final C14132d f68067d = AbstractC15751g.m44441U("timeCapsuleText");

    /* JADX INFO: renamed from: e */
    private static final C14132d f68068e = AbstractC15751g.m44441U("timeCapsuleYear");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: hq2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.sources.data.datastore.TimeCapsuleDataStoreHandler$clearTimeCapsule$2", m100430f = "TimeCapsuleDataStoreHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f68070w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f68071x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f68071x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f68071x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f68070w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(C17570a.f68068e);
            c14129a.m40229f(C17570a.f68067d);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: hq2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.sources.data.datastore.TimeCapsuleDataStoreHandler", m100430f = "TimeCapsuleDataStoreHandler.kt", m100431l = {25}, m100432m = "getTimeCapsuleText", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f68072w;

        /* JADX INFO: renamed from: y */
        int f68074y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68072w = obj;
            this.f68074y |= Integer.MIN_VALUE;
            return C17570a.this.m50017d(this);
        }
    }

    /* JADX INFO: renamed from: hq2.a$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.sources.data.datastore.TimeCapsuleDataStoreHandler", m100430f = "TimeCapsuleDataStoreHandler.kt", m100431l = {30}, m100432m = "getTimeCapsuleYear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f68075w;

        /* JADX INFO: renamed from: y */
        int f68077y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f68075w = obj;
            this.f68077y |= Integer.MIN_VALUE;
            return C17570a.this.m50018e(this);
        }
    }

    /* JADX INFO: renamed from: hq2.a$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.user.journey.sources.data.datastore.TimeCapsuleDataStoreHandler$saveTimeCapsule$2", m100430f = "TimeCapsuleDataStoreHandler.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f68078w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f68079x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ int f68080y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f68081z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i13, String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f68080y = i13;
            this.f68081z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(this.f68080y, this.f68081z, interfaceC30057d);
            eVar.f68079x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f68079x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f68078w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C17570a.f68068e, String.valueOf(this.f68080y));
            c14129a.m40230g(C17570a.f68067d, this.f68081z);
            return C23454a0.f92919a;
        }
    }

    public C17570a(InterfaceC0422g dataStore) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        this.dataStore = dataStore;
    }

    /* JADX INFO: renamed from: c */
    public final Object m50016c(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStore, new b(null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m50017d(InterfaceC30057d<? super String> interfaceC30057d) {
        c cVar;
        String str;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f68074y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f68074y = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36577C = cVar.f68072w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f68074y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            InterfaceC13058l data = this.dataStore.getData();
            cVar.f68074y = 1;
            objM36577C = AbstractC13091v.m36577C(data, cVar);
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
        if (abstractC14134f == null || (str = (String) abstractC14134f.mo40227b(f68067d)) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m50018e(InterfaceC30057d<? super Integer> interfaceC30057d) {
        d dVar;
        String str;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f68077y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f68077y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM36577C = dVar.f68075w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f68077y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36577C);
            InterfaceC13058l data = this.dataStore.getData();
            dVar.f68077y = 1;
            objM36577C = AbstractC13091v.m36577C(data, dVar);
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
        if (abstractC14134f == null || (str = (String) abstractC14134f.mo40227b(f68068e)) == null) {
            return null;
        }
        return AbstractC39421y.m125932Q(str);
    }

    /* JADX INFO: renamed from: f */
    public final Object m50019f(int i13, String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM48861G = AbstractC17269i.m48861G(this.dataStore, new e(i13, str, null), interfaceC30057d);
        return objM48861G == EnumC31071a.f128113w ? objM48861G : C23454a0.f92919a;
    }
}
