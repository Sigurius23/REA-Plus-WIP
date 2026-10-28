package f70;

import ad3.AbstractC0757c;
import c93.InterfaceC4351m;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import e80.InterfaceC12814a;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import java.io.IOException;
import java.util.Locale;
import kotlinx.serialization.SerializationException;
import l83.C23454a0;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.q */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001 B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0086@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$¨\u0006%"}, m65681d2 = {"Lf70/q;", "", "La6/g;", "Lf6/f;", "dataStore", "Lad3/c;", "json", "Liy1/c;", "metricWriter", "Ltr2/n;", "logger", "<init>", "(La6/g;Lad3/c;Liy1/c;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "action", "", "d", "(Lcom/whoop/navigation/e;)Ljava/lang/String;", "jsonString", "c", "(Ljava/lang/String;)Lcom/whoop/navigation/e;", "operation", "result", "destination", "Ll83/a0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lcom/whoop/navigation/e;Lq83/d;)Ljava/lang/Object;", "g", "(Lq83/d;)Ljava/lang/Object;", "b", "a", "La6/g;", "Lad3/c;", "Liy1/c;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14200q {

    /* JADX INFO: renamed from: f */
    public static final int f51594f = 8;

    /* JADX INFO: renamed from: g */
    private static final C14132d f51595g = AbstractC15751g.m44441U("app_destination");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.q$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationCache", m100430f = "AppDestinationCache.kt", m100431l = {64}, m100432m = "clear", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51600w;

        /* JADX INFO: renamed from: y */
        int f51602y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51600w = obj;
            this.f51602y |= Integer.MIN_VALUE;
            return C14200q.this.m40539b(this);
        }
    }

    /* JADX INFO: renamed from: f70.q$c */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationCache$clear$2", m100430f = "AppDestinationCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51603w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51604x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f51604x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f51604x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f51603w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(C14200q.f51595g);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f70.q$d */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationCache", m100430f = "AppDestinationCache.kt", m100431l = {42}, m100432m = "read", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51605w;

        /* JADX INFO: renamed from: y */
        int f51607y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51605w = obj;
            this.f51607y |= Integer.MIN_VALUE;
            return C14200q.this.m40540g(this);
        }
    }

    /* JADX INFO: renamed from: f70.q$e */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationCache", m100430f = "AppDestinationCache.kt", m100431l = {32}, m100432m = "write", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51608E;

        /* JADX INFO: renamed from: w */
        Object f51609w;

        /* JADX INFO: renamed from: x */
        Object f51610x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51611y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51611y = obj;
            this.f51608E |= Integer.MIN_VALUE;
            return C14200q.this.m40541h(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.q$f */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationCache$write$2", m100430f = "AppDestinationCache.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f51613w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51614x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51615y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f51615y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f51615y, interfaceC30057d);
            fVar.f51614x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f51614x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f51613w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(C14200q.f51595g, this.f51615y);
            return C23454a0.f92919a;
        }
    }

    public C14200q(InterfaceC0422g dataStore, AbstractC0757c json, InterfaceC21030c metricWriter, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.json = json;
        this.metricWriter = metricWriter;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final C9598e m40535c(String jsonString) {
        try {
            return (C9598e) this.json.m1831b(new C9602a(null, null, 3, null), jsonString);
        } catch (SerializationException e5) {
            this.logger.mo85230v("[AppDestinationCache] Failed to deserialize cached NavigationAction", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private final String m40536d(C9598e action) {
        try {
            return this.json.m1833d(new C9602a(null, null, 3, null), action);
        } catch (SerializationException e5) {
            this.logger.mo85230v("[AppDestinationCache] Failed to serialize NavigationAction", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m40537e(String operation, String result, String destination) {
        this.metricWriter.mo58701b(new InterfaceC12814a.a(operation, result, destination, null, null, null, 56, null).mo35878b());
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m40538f(C14200q c14200q, String str, String str2, String str3, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        c14200q.m40537e(str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m40539b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        C14200q c14200q;
        IOException iOException;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f51602y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f51602y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f51600w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f51602y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                InterfaceC0422g interfaceC0422g = this.dataStore;
                c cVar = new c(null);
                bVar.f51602y = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } catch (IOException e5) {
                e = e5;
                c14200q = this;
                iOException = e;
                c14200q.logger.mo85230v("[AppDestinationCache] Failed to clear cache", iOException, new AbstractC30556a.a[0]);
                m40538f(c14200q, "clear", "failure", null, 4, null);
                return C23454a0.f92919a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                AbstractC34132o.m107864I(obj);
            } catch (IOException e13) {
                iOException = e13;
                c14200q = this;
                c14200q.logger.mo85230v("[AppDestinationCache] Failed to clear cache", iOException, new AbstractC30556a.a[0]);
                m40538f(c14200q, "clear", "failure", null, 4, null);
            }
        }
        c14200q = this;
        try {
            m40538f(c14200q, "clear", "success", null, 4, null);
        } catch (IOException e14) {
            e = e14;
            iOException = e;
            c14200q.logger.mo85230v("[AppDestinationCache] Failed to clear cache", iOException, new AbstractC30556a.a[0]);
            m40538f(c14200q, "clear", "failure", null, 4, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m40540g(InterfaceC30057d<? super C9598e> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f51607y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f51607y = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM36575A = dVar.f51605w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f51607y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.dataStore.getData();
                dVar.f51607y = 1;
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
            String str = (String) ((AbstractC14134f) objM36575A).mo40227b(f51595g);
            if (str == null) {
                m40538f(this, "read", "miss", null, 4, null);
                return null;
            }
            C9598e c9598eM40535c = m40535c(str);
            if (c9598eM40535c == null) {
                m40538f(this, "read", "failure", null, 4, null);
                return null;
            }
            String name = c9598eM40535c.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
            Locale locale = Locale.US;
            m40537e("read", "success", AbstractC31061c.m95641q(locale, "US", name, locale, "toLowerCase(...)"));
            return c9598eM40535c;
        } catch (IOException e5) {
            this.logger.mo85230v("[AppDestinationCache] Failed to read cache", e5, new AbstractC30556a.a[0]);
            m40538f(this, "read", "failure", null, 4, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m40541h(C9598e c9598e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        C9598e c9598e2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f51608E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f51608E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f51611y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f51608E;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                String strM40536d = m40536d(c9598e);
                if (strM40536d == null) {
                    m40538f(this, "write", "failure", null, 4, null);
                    return c23454a0;
                }
                InterfaceC0422g interfaceC0422g = this.dataStore;
                f fVar = new f(strM40536d, null);
                eVar.f51609w = c9598e;
                eVar.f51610x = null;
                eVar.f51608E = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, fVar, eVar) == enumC31071a) {
                    return enumC31071a;
                }
                c9598e2 = c9598e;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C9598e c9598e3 = (C9598e) eVar.f51609w;
                AbstractC34132o.m107864I(obj);
                c9598e2 = c9598e3;
            }
            String name = c9598e2.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
            Locale US = Locale.US;
            AbstractC22676k.m65749i(US, "US");
            String lowerCase = name.toLowerCase(US);
            AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
            m40537e("write", "success", lowerCase);
        } catch (IOException e5) {
            this.logger.mo85230v("[AppDestinationCache] Failed to write cache", e5, new AbstractC30556a.a[0]);
            m40538f(this, "write", "failure", null, 4, null);
        }
        return c23454a0;
    }

    public /* synthetic */ C14200q(InterfaceC0422g interfaceC0422g, AbstractC0757c abstractC0757c, InterfaceC21030c interfaceC21030c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0422g, abstractC0757c, interfaceC21030c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AppDestinationCache") : interfaceC34116n);
    }
}
