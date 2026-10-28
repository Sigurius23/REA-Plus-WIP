package yw2;

import androidx.health.platform.client.proto.C1533u;
import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import org.joda.time.DateTime;
import p000.AbstractC11266d;
import p007a6.InterfaceC0422g;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: yw2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u001bB\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u000bJ\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0017\u0010\u000bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u000bJ\u0018\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006!"}, m65681d2 = {"Lyw2/a;", "", "La6/g;", "Lf6/f;", "dataStore", "Ltr2/n;", "logger", "<init>", "(La6/g;Ltr2/n;)V", "", "e", "(Lq83/d;)Ljava/lang/Object;", "stopAtMillis", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(JLq83/d;)Ljava/lang/Object;", "Ll83/a0;", "f", "d", "Lorg/joda/time/DateTime;", "now", "j", "(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;", "c", "g", "i", "b", "a", "La6/g;", "Ltr2/n;", "Ljava/lang/Long;", "bthrStoppingTimestamp", "lastSavedHrTimestampMillis", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39829a {

    /* JADX INFO: renamed from: f */
    public static final int f171647f = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g dataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Long bthrStoppingTimestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Long lastSavedHrTimestampMillis;

    /* JADX INFO: renamed from: yw2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {135}, m100432m = "clearLastHrReadingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171652w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171653x;

        /* JADX INFO: renamed from: z */
        int f171655z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171653x = obj;
            this.f171655z |= Integer.MIN_VALUE;
            return C39829a.this.m127772b(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore$clearLastHrReadingTimestamp$2", m100430f = "BtHrTimestampStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171656w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171657x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f171658y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C14132d c14132d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171658y = c14132d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(this.f171658y, interfaceC30057d);
            cVar.f171657x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171657x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171656w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(this.f171658y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw2.a$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {91}, m100432m = "getLastHrReadingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171659w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171660x;

        /* JADX INFO: renamed from: z */
        int f171662z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171660x = obj;
            this.f171662z |= Integer.MIN_VALUE;
            return C39829a.this.m127773c(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {49}, m100432m = "isBtHrTimestampsSaved", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171663w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171664x;

        /* JADX INFO: renamed from: z */
        int f171666z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171664x = obj;
            this.f171666z |= Integer.MIN_VALUE;
            return C39829a.this.m127774d(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {147}, m100432m = "readLastSavedHrTimestampMillisFromDataStore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171667w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171668x;

        /* JADX INFO: renamed from: z */
        int f171670z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171668x = obj;
            this.f171670z |= Integer.MIN_VALUE;
            return C39829a.this.m127771e(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {37}, m100432m = "resetBtHrStoppingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f171671w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171672x;

        /* JADX INFO: renamed from: z */
        int f171674z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171672x = obj;
            this.f171674z |= Integer.MIN_VALUE;
            return C39829a.this.m127775f(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$h */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore$resetBtHrStoppingTimestamp$2", m100430f = "BtHrTimestampStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171675w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171676x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f171677y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C14132d c14132d, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171677y = c14132d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f171677y, interfaceC30057d);
            hVar.f171676x = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171676x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171675w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40229f(this.f171677y);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw2.a$i */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {108}, m100432m = "restoreLastHrReadingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f171678w;

        /* JADX INFO: renamed from: y */
        int f171680y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171678w = obj;
            this.f171680y |= Integer.MIN_VALUE;
            return C39829a.this.m127776g(this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$j */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "saveBtHrStoppingTimestamp", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171681E;

        /* JADX INFO: renamed from: w */
        long f171682w;

        /* JADX INFO: renamed from: x */
        Object f171683x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171684y;

        public j(InterfaceC30057d<? super j> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171684y = obj;
            this.f171681E |= Integer.MIN_VALUE;
            return C39829a.this.m127777h(0L, this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$k */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore$saveBtHrStoppingTimestamp$2", m100430f = "BtHrTimestampStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "it", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171686w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171687x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f171688y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f171689z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(C14132d c14132d, long j7, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171688y = c14132d;
            this.f171689z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(this.f171688y, this.f171689z, interfaceC30057d);
            kVar.f171687x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171687x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171686w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(this.f171688y, new Long(this.f171689z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw2.a$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {115, 123}, m100432m = "saveLastHrReadingTimestampIfNeeded", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class l extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171690E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f171691F;

        /* JADX INFO: renamed from: H */
        int f171693H;

        /* JADX INFO: renamed from: w */
        Object f171694w;

        /* JADX INFO: renamed from: x */
        Object f171695x;

        /* JADX INFO: renamed from: y */
        Object f171696y;

        /* JADX INFO: renamed from: z */
        long f171697z;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171691F = obj;
            this.f171693H |= Integer.MIN_VALUE;
            return C39829a.this.m127778i(null, this);
        }
    }

    /* JADX INFO: renamed from: yw2.a$m */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore$saveLastHrReadingTimestampIfNeeded$2", m100430f = "BtHrTimestampStore.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "preferences", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class m extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f171698w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f171699x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C14132d f171700y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ long f171701z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C14132d c14132d, long j7, InterfaceC30057d<? super m> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f171700y = c14132d;
            this.f171701z = j7;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            m mVar = new m(this.f171700y, this.f171701z, interfaceC30057d);
            mVar.f171699x = obj;
            return mVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((m) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f171699x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f171698w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            c14129a.m40230g(this.f171700y, new Long(this.f171701z));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: yw2.a$n */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.BtHrTimestampStore", m100430f = "BtHrTimestampStore.kt", m100431l = {72}, m100432m = "shouldStopCollection", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class n extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f171702E;

        /* JADX INFO: renamed from: w */
        Object f171703w;

        /* JADX INFO: renamed from: x */
        Object f171704x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f171705y;

        public n(InterfaceC30057d<? super n> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f171705y = obj;
            this.f171702E |= Integer.MIN_VALUE;
            return C39829a.this.m127779j(null, this);
        }
    }

    public C39829a(InterfaceC0422g dataStore, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(dataStore, "dataStore");
        AbstractC22676k.m65750j(logger, "logger");
        this.dataStore = dataStore;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m127771e(InterfaceC30057d<? super Long> interfaceC30057d) {
        f fVar;
        C14132d c14132d;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f171670z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f171670z = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f171668x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f171670z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_last_hr_reading_timestamp");
                InterfaceC13058l data = this.dataStore.getData();
                fVar.f171667w = c14132dM44429I;
                fVar.f171670z = 1;
                Object objM36575A = AbstractC13091v.m36575A(data, fVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
                c14132d = c14132dM44429I;
                obj = objM36575A;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c14132d = (C14132d) fVar.f171667w;
                AbstractC34132o.m107864I(obj);
            }
            Long l7 = (Long) ((AbstractC14134f) obj).mo40227b(c14132d);
            if (l7 == null) {
                return null;
            }
            this.lastSavedHrTimestampMillis = new Long(l7.longValue());
            return l7;
        } catch (Exception unused) {
            AbstractC3006f0.m8721o(fVar.getContext());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m127772b(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f171655z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f171655z = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object obj = bVar.f171653x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f171655z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_last_hr_reading_timestamp");
                InterfaceC0422g interfaceC0422g = this.dataStore;
                c cVar = new c(c14132dM44429I, null);
                bVar.f171652w = null;
                bVar.f171655z = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, cVar, bVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.lastSavedHrTimestampMillis = null;
            this.logger.mo85228t("Cleared last HR reading timestamp", new AbstractC30556a.a[0]);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to clear last HR reading timestamp: ", e5.getMessage()), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m127773c(InterfaceC30057d<? super DateTime> interfaceC30057d) {
        d dVar;
        C14132d c14132d;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f171662z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f171662z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object obj = dVar.f171660x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f171662z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_last_hr_reading_timestamp");
                InterfaceC13058l data = this.dataStore.getData();
                dVar.f171659w = c14132dM44429I;
                dVar.f171662z = 1;
                Object objM36575A = AbstractC13091v.m36575A(data, dVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
                c14132d = c14132dM44429I;
                obj = objM36575A;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c14132d = (C14132d) dVar.f171659w;
                AbstractC34132o.m107864I(obj);
            }
            Long l7 = (Long) ((AbstractC14134f) obj).mo40227b(c14132d);
            if (l7 == null) {
                this.logger.mo85228t("No last HR reading timestamp saved", new AbstractC30556a.a[0]);
                return null;
            }
            long jLongValue = l7.longValue();
            this.lastSavedHrTimestampMillis = new Long(jLongValue);
            DateTime dateTime = new DateTime(jLongValue);
            this.logger.mo85228t("Read last HR reading timestamp: " + dateTime.getMillis(), new AbstractC30556a.a[0]);
            return dateTime;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(dVar.getContext());
            this.logger.mo85226q(AbstractC11266d.m30461o("No last HR reading timestamp found in data store: ", e5.getMessage()), new AbstractC30556a.a[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: d */
    public final Object m127774d(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        e eVar;
        C14132d c14132d;
        String str;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f171666z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f171666z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f171664x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f171666z;
        boolean z4 = true;
        boolean z13 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_bthr_stopping_timestamp");
                InterfaceC13058l data = this.dataStore.getData();
                eVar.f171663w = c14132dM44429I;
                eVar.f171666z = 1;
                Object objM36575A = AbstractC13091v.m36575A(data, eVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
                c14132d = c14132dM44429I;
                obj = objM36575A;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c14132d = (C14132d) eVar.f171663w;
                AbstractC34132o.m107864I(obj);
            }
            Long l7 = (Long) ((AbstractC14134f) obj).mo40227b(c14132d);
            if (l7 == null) {
                z4 = false;
            }
            InterfaceC34116n interfaceC34116n = this.logger;
            if (l7 != null) {
                str = " (value=" + l7.longValue() + ")";
                if (str == null) {
                    str = "";
                }
            } else {
                str = "";
            }
            interfaceC34116n.mo85228t("BTHR stopping timestamp saved: " + z4 + str, new AbstractC30556a.a[0]);
            z13 = z4;
        } catch (Exception unused) {
            AbstractC3006f0.m8721o(eVar.getContext());
            this.logger.mo85216g("No bthr timestamp", new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z13);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m127775f(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f171674z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f171674z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f171672x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f171674z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_bthr_stopping_timestamp");
                InterfaceC0422g interfaceC0422g = this.dataStore;
                h hVar = new h(c14132dM44429I, null);
                gVar.f171671w = null;
                gVar.f171674z = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, hVar, gVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.bthrStoppingTimestamp = null;
            this.logger.mo85228t("Reset BTHR stopping timestamp", new AbstractC30556a.a[0]);
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(gVar.getContext());
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to reset BtHr Stopping Timestamp: ", e5.getMessage()), new AbstractC30556a.a[0]);
        }
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m127776g(InterfaceC30057d<? super DateTime> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f171680y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f171680y = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object objM127773c = iVar.f171678w;
        Object obj = EnumC31071a.f128113w;
        int i14 = iVar.f171680y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM127773c);
            iVar.f171680y = 1;
            objM127773c = m127773c(iVar);
            if (objM127773c == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM127773c);
        }
        DateTime dateTime = (DateTime) objM127773c;
        if (dateTime == null) {
            return null;
        }
        this.logger.mo85216g("Restored last HR reading timestamp: " + dateTime, new AbstractC30556a.a[0]);
        return dateTime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: h */
    public final Object m127777h(long j7, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        j jVar;
        if (interfaceC30057d instanceof j) {
            jVar = (j) interfaceC30057d;
            int i13 = jVar.f171681E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                jVar.f171681E = i13 - Integer.MIN_VALUE;
            } else {
                jVar = new j(interfaceC30057d);
            }
        } else {
            jVar = new j(interfaceC30057d);
        }
        Object obj = jVar.f171684y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = jVar.f171681E;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_bthr_stopping_timestamp");
                InterfaceC0422g interfaceC0422g = this.dataStore;
                k kVar = new k(c14132dM44429I, j7, null);
                jVar.f171683x = null;
                jVar.f171682w = j7;
                jVar.f171681E = 1;
                if (AbstractC17269i.m48861G(interfaceC0422g, kVar, jVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = jVar.f171682w;
                AbstractC34132o.m107864I(obj);
            }
            this.bthrStoppingTimestamp = new Long(j7);
            this.logger.mo85228t("Saved BTHR stopping timestamp: " + j7, new AbstractC30556a.a[0]);
            z4 = true;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(jVar.getContext());
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to save BTHR timestamp in data store: ", e5.getMessage()), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c A[Catch: Exception -> 0x003a, TRY_ENTER, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0036, B:36:0x009d, B:32:0x007c), top: B:41:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127778i(org.joda.time.DateTime r12, q83.InterfaceC30057d<? super l83.C23454a0> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof yw2.C39829a.l
            if (r0 == 0) goto L13
            r0 = r13
            yw2.a$l r0 = (yw2.C39829a.l) r0
            int r1 = r0.f171693H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171693H = r1
            goto L18
        L13:
            yw2.a$l r0 = new yw2.a$l
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f171691F
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f171693H
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L44
            if (r2 != r4) goto L3c
            long r1 = r0.f171697z
            java.lang.Object r12 = r0.f171696y
            f6.d r12 = (p138f6.C14132d) r12
            java.lang.Object r12 = r0.f171695x
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r12 = r0.f171694w
            org.joda.time.DateTime r12 = (org.joda.time.DateTime) r12
            p505ts.AbstractC34132o.m107864I(r13)     // Catch: java.lang.Exception -> L3a
            goto L9d
        L3a:
            r12 = move-exception
            goto La5
        L3c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L44:
            long r7 = r0.f171697z
            java.lang.Object r12 = r0.f171694w
            org.joda.time.DateTime r12 = (org.joda.time.DateTime) r12
            p505ts.AbstractC34132o.m107864I(r13)
            goto L66
        L4e:
            p505ts.AbstractC34132o.m107864I(r13)
            long r7 = r12.getMillis()
            java.lang.Long r12 = r11.lastSavedHrTimestampMillis
            if (r12 != 0) goto L69
            r0.f171694w = r6
            r0.f171697z = r7
            r0.f171693H = r5
            java.lang.Object r13 = r11.m127771e(r0)
            if (r13 != r1) goto L66
            goto L9b
        L66:
            r12 = r13
            java.lang.Long r12 = (java.lang.Long) r12
        L69:
            if (r12 == 0) goto L7a
            long r12 = r12.longValue()
            long r12 = r7 - r12
            r9 = 60000(0xea60, double:2.9644E-319)
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 < 0) goto L79
            goto L7a
        L79:
            r5 = r3
        L7a:
            if (r5 == 0) goto Lbd
            java.lang.String r12 = "dwl_last_hr_reading_timestamp"
            f6.d r12 = ge3.AbstractC15751g.m44429I(r12)     // Catch: java.lang.Exception -> L3a
            a6.g r13 = r11.dataStore     // Catch: java.lang.Exception -> L3a
            yw2.a$m r2 = new yw2.a$m     // Catch: java.lang.Exception -> L3a
            r2.<init>(r12, r7, r6)     // Catch: java.lang.Exception -> L3a
            r0.f171694w = r6     // Catch: java.lang.Exception -> L3a
            r0.f171695x = r6     // Catch: java.lang.Exception -> L3a
            r0.f171696y = r6     // Catch: java.lang.Exception -> L3a
            r0.f171697z = r7     // Catch: java.lang.Exception -> L3a
            r0.f171690E = r5     // Catch: java.lang.Exception -> L3a
            r0.f171693H = r4     // Catch: java.lang.Exception -> L3a
            java.lang.Object r12 = hg3.AbstractC17269i.m48861G(r13, r2, r0)     // Catch: java.lang.Exception -> L3a
            if (r12 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r1 = r7
        L9d:
            java.lang.Long r12 = new java.lang.Long     // Catch: java.lang.Exception -> L3a
            r12.<init>(r1)     // Catch: java.lang.Exception -> L3a
            r11.lastSavedHrTimestampMillis = r12     // Catch: java.lang.Exception -> L3a
            goto Lbd
        La5:
            q83.j r13 = r0.getContext()
            bc3.AbstractC3006f0.m8721o(r13)
            tr2.n r13 = r11.logger
            java.lang.String r12 = r12.getMessage()
            java.lang.String r0 = "Failed to save last HR reading timestamp to data store: "
            java.lang.String r12 = p000.AbstractC11266d.m30461o(r0, r12)
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r3]
            r13.mo85222m(r12, r0)
        Lbd:
            l83.a0 r12 = l83.C23454a0.f92919a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yw2.C39829a.m127778i(org.joda.time.DateTime, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m127779j(DateTime dateTime, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        n nVar;
        DateTime dateTime2;
        C14132d c14132d;
        if (interfaceC30057d instanceof n) {
            nVar = (n) interfaceC30057d;
            int i13 = nVar.f171702E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                nVar.f171702E = i13 - Integer.MIN_VALUE;
            } else {
                nVar = new n(interfaceC30057d);
            }
        } else {
            nVar = new n(interfaceC30057d);
        }
        Object obj = nVar.f171705y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = nVar.f171702E;
        boolean z4 = false;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                Long l7 = this.bthrStoppingTimestamp;
                if (l7 != null) {
                    long jLongValue = l7.longValue();
                    boolean zIsAfter = dateTime.isAfter(jLongValue);
                    if (zIsAfter) {
                        this.logger.mo85228t(AbstractC11266d.m30457k(jLongValue, ", cached=true)", AbstractC39383f.m125596b(dateTime.getMillis(), "BTHR should stop collection (now=", ", stopAt=")), new AbstractC30556a.a[0]);
                    }
                    return Boolean.valueOf(zIsAfter);
                }
                C14132d c14132dM44429I = AbstractC15751g.m44429I("dwl_bthr_stopping_timestamp");
                InterfaceC13058l data = this.dataStore.getData();
                nVar.f171703w = dateTime;
                nVar.f171704x = c14132dM44429I;
                nVar.f171702E = 1;
                Object objM36575A = AbstractC13091v.m36575A(data, nVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
                dateTime2 = dateTime;
                c14132d = c14132dM44429I;
                obj = objM36575A;
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c14132d = (C14132d) nVar.f171704x;
                dateTime2 = (DateTime) nVar.f171703w;
                AbstractC34132o.m107864I(obj);
            }
            Long l12 = (Long) ((AbstractC14134f) obj).mo40227b(c14132d);
            this.bthrStoppingTimestamp = l12;
            boolean zIsAfter2 = l12 != null ? dateTime2.isAfter(l12.longValue()) : false;
            if (zIsAfter2) {
                this.logger.mo85228t("BTHR should stop collection (now=" + dateTime2.getMillis() + ", stopAt=" + l12 + ", cached=false)", new AbstractC30556a.a[0]);
            }
            z4 = zIsAfter2;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(nVar.getContext());
            this.logger.mo85222m(AbstractC11266d.m30461o("Failed to read BTHR timestamp from data store: ", e5.getMessage()), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(z4);
    }
}
