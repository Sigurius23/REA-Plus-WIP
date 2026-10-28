package jl1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.home.domain.autopop.AutoPopApi;
import com.whoop.navigation.C9598e;
import dc3.C11935t;
import dc3.InterfaceC11936u;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ge3.AbstractC15751g;
import hg3.AbstractC17269i;
import ih0.AbstractC18489d0;
import il1.AbstractC18622a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l83.C23454a0;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.C25235a0;
import m83.C25271y;
import od1.InterfaceC27844g;
import p007a6.InterfaceC0422g;
import p098dt.AbstractC12350b;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: jl1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00014B5\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010#\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020 H\u0002¢\u0006\u0004\b(\u0010)J \u0010*\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\b*\u0010$J \u0010+\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0082@¢\u0006\u0004\b+\u0010$J\u0016\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0017H\u0082@¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b/\u0010.J#\u00102\u001a\b\u0012\u0004\u0012\u00020\u0003002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u000200H\u0016¢\u0006\u0004\b2\u00103R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020 0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010H\u001a\b\u0012\u0004\u0012\u00020 0F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010@¨\u0006J"}, m65681d2 = {"Ljl1/b;", "Lod1/g;", "Lil1/a;", "Ljl1/a;", "La6/g;", "Lf6/f;", "prefsDataStore", "Lcom/whoop/home/domain/autopop/AutoPopApi;", "api", "Ltr2/n;", "logger", "Ljava/time/Clock;", "clock", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(La6/g;Lcom/whoop/home/domain/autopop/AutoPopApi;Ltr2/n;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "state", "action", "Lbc3/c0;", "sideEffects", "m", "(Ljl1/a;Lil1/a;Lbc3/c0;Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/navigation/e;", "destinations", "Ll83/a0;", "u", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "", "n", "()Z", "", HMSTrackSource.SCREEN, "identifier", "s", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "key", "l", "(Ljava/lang/String;)Z", "q", "(Ljava/lang/String;)V", "t", "r", "Ljl1/d;", "p", "(Lq83/d;)Ljava/lang/Object;", "o", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "La6/g;", "b", "Lcom/whoop/home/domain/autopop/AutoPopApi;", "c", "Ltr2/n;", "d", "Ljava/time/Clock;", "e", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "", "f", "Ljava/util/Set;", "inFlightKeys", "Ljava/time/Instant;", "g", "Ljava/time/Instant;", "lastSyncAt", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "lastSyncedKeys", "i", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21771b implements InterfaceC27844g<AbstractC18622a, C21770a> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    public static final int f83757j = 8;

    /* JADX INFO: renamed from: k */
    private static final C14132d f83758k = AbstractC15751g.m44442V("shown_autopop_destinations");

    /* JADX INFO: renamed from: l */
    private static final Duration f83759l;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC0422g prefsDataStore;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AutoPopApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Set<String> inFlightKeys;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Instant lastSyncAt;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Set<String> lastSyncedKeys;

    /* JADX INFO: renamed from: jl1.b$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Ljl1/b$a;", "", "<init>", "()V", "", HMSTrackSource.SCREEN, "identifier", "d", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljl1/d;", "e", "(Ljava/lang/String;)Ljl1/d;", "Lf6/d;", "", "KEY_SHOWN_DESTINATIONS", "Lf6/d;", "c", "()Lf6/d;", "", "MAX_KEYS_PER_SYNC", "I", "Ljava/time/Duration;", "SYNC_COOLDOWN", "Ljava/time/Duration;", "KEY_SEPARATOR", "Ljava/lang/String;", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: d */
        public final String m61568d(String screen, String identifier) {
            return AbstractC18489d0.m53370k(screen, ":", identifier);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public final C21773d m61569e(String str) {
            List listM125906y0 = AbstractC39414r.m125906y0(str, new String[]{":"}, 6);
            if (listM125906y0.size() == 2) {
                return new C21773d((String) listM125906y0.get(0), (String) listM125906y0.get(1));
            }
            return null;
        }

        /* JADX INFO: renamed from: c */
        public final C14132d m61570c() {
            return C21771b.f83758k;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: jl1.b$b */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {78, 90}, m100432m = "handleMultipleDestinationAction", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f83769F;

        /* JADX INFO: renamed from: w */
        Object f83770w;

        /* JADX INFO: renamed from: x */
        Object f83771x;

        /* JADX INFO: renamed from: y */
        Object f83772y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f83773z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83773z = obj;
            this.f83769F |= Integer.MIN_VALUE;
            return C21771b.this.m61557m(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$handleMultipleDestinationAction$2", m100430f = "AutoPopInteractor.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83774w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ List<C9598e> f83776y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<C9598e> list, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83776y = list;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21771b.this.new c(this.f83776y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83774w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21771b c21771b = C21771b.this;
                List<C9598e> list = this.f83776y;
                this.f83774w = 1;
                if (c21771b.m61565u(list, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jl1.b$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$handleMultipleDestinationAction$3", m100430f = "AutoPopInteractor.kt", m100431l = {79}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83777w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC18622a f83779y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC18622a abstractC18622a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83779y = abstractC18622a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21771b.this.new d(this.f83779y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83777w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21771b c21771b = C21771b.this;
                String str = ((AbstractC18622a.c) this.f83779y).getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
                String identifier = ((AbstractC18622a.c) this.f83779y).getIdentifier();
                this.f83777w = 1;
                if (c21771b.m61563s(str, identifier, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jl1.b$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$handleMultipleDestinationAction$4", m100430f = "AutoPopInteractor.kt", m100431l = {92}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83780w;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21771b.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83780w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21771b c21771b = C21771b.this;
                this.f83780w = 1;
                if (c21771b.m61565u(C25271y.f99162w, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jl1.b$f */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$interact$1", m100430f = "AutoPopInteractor.kt", m100431l = {59}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Ldc3/u;", "Ljl1/a;", "Ll83/a0;", "<anonymous>", "(Ldc3/u;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C21771b f83782E;

        /* JADX INFO: renamed from: w */
        Object f83783w;

        /* JADX INFO: renamed from: x */
        int f83784x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f83785y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC13058l f83786z;

        /* JADX INFO: renamed from: jl1.b$f$a */
        /* JADX INFO: loaded from: classes9.dex */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$interact$1$1", m100430f = "AutoPopInteractor.kt", m100431l = {55}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lil1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f83787w;

            /* JADX INFO: renamed from: x */
            private /* synthetic */ Object f83788x;

            public a(InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(interfaceC30057d);
                aVar.f83788x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f83788x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f83787w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AbstractC18622a.a aVar = AbstractC18622a.a.f72820a;
                    this.f83788x = null;
                    this.f83787w = 1;
                    if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

        /* JADX INFO: renamed from: jl1.b$f$b */
        /* JADX INFO: loaded from: classes9.dex */
        @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$interact$1$2", m100430f = "AutoPopInteractor.kt", m100431l = {57}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Ljl1/a;", "state", "Lil1/a;", "action", "<anonymous>", "(Ljl1/a;Lil1/a;)Ljl1/a;"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements Function3 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC11936u f83789E;

            /* JADX INFO: renamed from: w */
            int f83790w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f83791x;

            /* JADX INFO: renamed from: y */
            /* synthetic */ Object f83792y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C21771b f83793z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C21771b c21771b, InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super b> interfaceC30057d) {
                super(3, interfaceC30057d);
                this.f83793z = c21771b;
                this.f83789E = interfaceC11936u;
            }

            @Override // p715kotlin.jvm.functions.Function3
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C21770a c21770a, AbstractC18622a abstractC18622a, InterfaceC30057d<? super C21770a> interfaceC30057d) {
                b bVar = new b(this.f83793z, this.f83789E, interfaceC30057d);
                bVar.f83791x = c21770a;
                bVar.f83792y = abstractC18622a;
                return bVar.invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                C21770a c21770a = (C21770a) this.f83791x;
                AbstractC18622a abstractC18622a = (AbstractC18622a) this.f83792y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f83790w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                C21771b c21771b = this.f83793z;
                InterfaceC11936u interfaceC11936u = this.f83789E;
                this.f83791x = null;
                this.f83792y = null;
                this.f83790w = 1;
                Object objM61557m = c21771b.m61557m(c21770a, abstractC18622a, interfaceC11936u, this);
                return objM61557m == enumC31071a ? enumC31071a : objM61557m;
            }
        }

        /* JADX INFO: renamed from: jl1.b$f$c */
        /* JADX INFO: loaded from: classes9.dex */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class c<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC11936u f83794w;

            public c(InterfaceC11936u interfaceC11936u) {
                this.f83794w = interfaceC11936u;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C21770a c21770a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                Object objMo32219t = ((C11935t) this.f83794w).f39041z.mo32219t(c21770a, interfaceC30057d);
                return objMo32219t == EnumC31071a.f128113w ? objMo32219t : C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC13058l interfaceC13058l, C21771b c21771b, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83786z = interfaceC13058l;
            this.f83782E = c21771b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = new f(this.f83786z, this.f83782E, interfaceC30057d);
            fVar.f83785y = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC11936u interfaceC11936u, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC11936u, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC11936u interfaceC11936u = (InterfaceC11936u) this.f83785y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83784x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13060l1 c13060l1 = new C13060l1(new C21770a(null, null, null, 7, null), new C13015a0(new a(null), this.f83786z), new b(this.f83782E, interfaceC11936u, null));
                c cVar = new c(interfaceC11936u);
                this.f83785y = null;
                this.f83783w = null;
                this.f83784x = 1;
                if (c13060l1.collect(cVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: jl1.b$g */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {184}, m100432m = "loadStateFromDataStore", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f83795w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83796x;

        /* JADX INFO: renamed from: z */
        int f83798z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83796x = obj;
            this.f83798z |= Integer.MIN_VALUE;
            return C21771b.this.m61559o(this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$h */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {173}, m100432m = "readStoredDestinations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f83799w;

        /* JADX INFO: renamed from: y */
        int f83801y;

        public h(InterfaceC30057d<? super h> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83799w = obj;
            this.f83801y |= Integer.MIN_VALUE;
            return C21771b.this.m61560p(this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$i */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {160}, m100432m = "removeShownDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83802E;

        /* JADX INFO: renamed from: w */
        Object f83803w;

        /* JADX INFO: renamed from: x */
        Object f83804x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83805y;

        public i(InterfaceC30057d<? super i> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83805y = obj;
            this.f83802E |= Integer.MIN_VALUE;
            return C21771b.this.m61562r(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$j */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$removeShownDestination$2", m100430f = "AutoPopInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83807w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83808x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f83809y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83810z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83809y = str;
            this.f83810z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f83809y, this.f83810z, interfaceC30057d);
            jVar.f83808x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f83808x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83807w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Companion companion = C21771b.INSTANCE;
            Set set = (Set) c14129a.mo40227b(companion.m61570c());
            if (set == null) {
                set = C25235a0.f99113w;
            }
            c14129a.m40230g(companion.m61570c(), AbstractC12350b.m34604y(companion.m61568d(this.f83809y, this.f83810z), set));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jl1.b$k */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {131, 132}, m100432m = "reportShownDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f83812F;

        /* JADX INFO: renamed from: w */
        Object f83813w;

        /* JADX INFO: renamed from: x */
        Object f83814x;

        /* JADX INFO: renamed from: y */
        Object f83815y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f83816z;

        public k(InterfaceC30057d<? super k> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83816z = obj;
            this.f83812F |= Integer.MIN_VALUE;
            return C21771b.this.m61563s(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$l */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$reportShownDestination$2", m100430f = "AutoPopInteractor.kt", m100431l = {131}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f83817w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f83819y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83820z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, InterfaceC30057d<? super l> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f83819y = str;
            this.f83820z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21771b.this.new l(this.f83819y, this.f83820z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f83817w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AutoPopApi autoPopApi = C21771b.this.api;
            String str = this.f83819y;
            String str2 = this.f83820z;
            this.f83817w = 1;
            Object autoPop = autoPopApi.setAutoPop(str, str2, this);
            return autoPop == enumC31071a ? enumC31071a : autoPop;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((l) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: jl1.b$m */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {148}, m100432m = "storeShownDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class m extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f83821E;

        /* JADX INFO: renamed from: w */
        Object f83822w;

        /* JADX INFO: renamed from: x */
        Object f83823x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f83824y;

        public m(InterfaceC30057d<? super m> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83824y = obj;
            this.f83821E |= Integer.MIN_VALUE;
            return C21771b.this.m61564t(null, null, this);
        }
    }

    /* JADX INFO: renamed from: jl1.b$n */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor$storeShownDestination$2", m100430f = "AutoPopInteractor.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lf6/a;", "prefs", "Ll83/a0;", "<anonymous>", "(Lf6/a;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class n extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f83826w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f83827x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f83828y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f83829z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, String str2, InterfaceC30057d<? super n> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f83828y = str;
            this.f83829z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            n nVar = new n(this.f83828y, this.f83829z, interfaceC30057d);
            nVar.f83827x = obj;
            return nVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(C14129a c14129a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((n) create(c14129a, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C14129a c14129a = (C14129a) this.f83827x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f83826w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Companion companion = C21771b.INSTANCE;
            Set set = (Set) c14129a.mo40227b(companion.m61570c());
            if (set == null) {
                set = C25235a0.f99113w;
            }
            c14129a.m40230g(companion.m61570c(), AbstractC12350b.m34555D(companion.m61568d(this.f83828y, this.f83829z), set));
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: jl1.b$o */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.domain.autopop.AutoPopInteractor", m100430f = "AutoPopInteractor.kt", m100431l = {117, 121}, m100432m = "syncPendingDestinations", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class o extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f83830E;

        /* JADX INFO: renamed from: F */
        Object f83831F;

        /* JADX INFO: renamed from: G */
        Object f83832G;

        /* JADX INFO: renamed from: H */
        Object f83833H;

        /* JADX INFO: renamed from: I */
        Object f83834I;

        /* JADX INFO: renamed from: J */
        int f83835J;

        /* JADX INFO: renamed from: K */
        int f83836K;

        /* JADX INFO: renamed from: L */
        /* synthetic */ Object f83837L;

        /* JADX INFO: renamed from: N */
        int f83839N;

        /* JADX INFO: renamed from: w */
        Object f83840w;

        /* JADX INFO: renamed from: x */
        Object f83841x;

        /* JADX INFO: renamed from: y */
        Object f83842y;

        /* JADX INFO: renamed from: z */
        Object f83843z;

        public o(InterfaceC30057d<? super o> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f83837L = obj;
            this.f83839N |= Integer.MIN_VALUE;
            return C21771b.this.m61565u(null, this);
        }
    }

    static {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        AbstractC22676k.m65749i(durationOfSeconds, "ofSeconds(...)");
        f83759l = durationOfSeconds;
    }

    public C21771b(InterfaceC0422g prefsDataStore, AutoPopApi api, InterfaceC34116n logger, Clock clock, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(prefsDataStore, "prefsDataStore");
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.prefsDataStore = prefsDataStore;
        this.api = api;
        this.logger = logger;
        this.clock = clock;
        this.featureFlagChecker = featureFlagChecker;
        this.inFlightKeys = new LinkedHashSet();
        this.lastSyncedKeys = C25235a0.f99113w;
    }

    /* JADX INFO: renamed from: l */
    private final boolean m61556l(String key) {
        return this.inFlightKeys.add(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (m61564t(r2, r13, r0) == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017e, code lost:
    
        if (r13 == r1) goto L57;
     */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61557m(jl1.C21770a r10, il1.AbstractC18622a r11, bc3.InterfaceC2994c0 r12, q83.InterfaceC30057d<? super jl1.C21770a> r13) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl1.C21771b.m61557m(jl1.a, il1.a, bc3.c0, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: n */
    private final boolean m61558n() {
        return this.featureFlagChecker.isFeatureEnabled("autopop-retry-pending-puts-android");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m61559o(InterfaceC30057d<? super C21770a> interfaceC30057d) {
        g gVar;
        List list;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f83798z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f83798z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f83796x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = gVar.f83798z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C25271y c25271y = C25271y.f99162w;
            gVar.f83795w = c25271y;
            gVar.f83798z = 1;
            Object objM61560p = m61560p(gVar);
            if (objM61560p == obj2) {
                return obj2;
            }
            list = c25271y;
            obj = objM61560p;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) gVar.f83795w;
            AbstractC34132o.m107864I(obj);
        }
        return new C21770a(list, (List) obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m61560p(InterfaceC30057d<? super List<C21773d>> interfaceC30057d) {
        h hVar;
        if (interfaceC30057d instanceof h) {
            hVar = (h) interfaceC30057d;
            int i13 = hVar.f83801y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f83801y = i13 - Integer.MIN_VALUE;
            } else {
                hVar = new h(interfaceC30057d);
            }
        } else {
            hVar = new h(interfaceC30057d);
        }
        Object objM36575A = hVar.f83799w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = hVar.f83801y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM36575A);
                InterfaceC13058l data = this.prefsDataStore.getData();
                hVar.f83801y = 1;
                objM36575A = AbstractC13091v.m36575A(data, hVar);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM36575A);
            }
            Iterable iterable = (Set) ((AbstractC14134f) objM36575A).mo40227b(f83758k);
            if (iterable == null) {
                iterable = C25235a0.f99113w;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C21773d c21773dM61569e = INSTANCE.m61569e((String) it.next());
                if (c21773dM61569e != null) {
                    arrayList.add(c21773dM61569e);
                }
            }
            return arrayList;
        } catch (IOException e5) {
            this.logger.mo85230v("Failed to read shown destinations", e5, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8721o(hVar.getContext());
            return C25271y.f99162w;
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m61561q(String key) {
        this.inFlightKeys.remove(key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final Object m61562r(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        i iVar;
        if (interfaceC30057d instanceof i) {
            iVar = (i) interfaceC30057d;
            int i13 = iVar.f83802E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iVar.f83802E = i13 - Integer.MIN_VALUE;
            } else {
                iVar = new i(interfaceC30057d);
            }
        } else {
            iVar = new i(interfaceC30057d);
        }
        Object obj = iVar.f83805y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = iVar.f83802E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                j jVar = new j(str, str2, null);
                iVar.f83803w = str;
                iVar.f83804x = str2;
                iVar.f83802E = 1;
                Object objM48861G = AbstractC17269i.m48861G(interfaceC0422g, jVar, iVar);
                str = objM48861G;
                if (objM48861G == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) iVar.f83804x;
                String str3 = (String) iVar.f83803w;
                AbstractC34132o.m107864I(obj);
                str = str3;
            }
        } catch (IOException e5) {
            this.logger.mo85230v(AbstractC31061c.m95640p("Failed to remove shown destination: ", str, ":", str2), e5, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8721o(iVar.getContext());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x009a A[Catch: all -> 0x00ac, TryCatch #1 {all -> 0x00ac, blocks: (B:29:0x0094, B:31:0x009a, B:38:0x00af, B:42:0x00b7, B:43:0x00bc, B:26:0x0077), top: B:47:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #1 {all -> 0x00ac, blocks: (B:29:0x0094, B:31:0x009a, B:38:0x00af, B:42:0x00b7, B:43:0x00bc, B:26:0x0077), top: B:47:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7 A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #1 {all -> 0x00ac, blocks: (B:29:0x0094, B:31:0x009a, B:38:0x00af, B:42:0x00b7, B:43:0x00bc, B:26:0x0077), top: B:47:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: s */
    public final Object m61563s(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        k kVar;
        Object objM108729b;
        String strM61568d;
        String str3;
        InterfaceC34385a interfaceC34385a;
        String str4 = str;
        String str5 = str2;
        if (interfaceC30057d instanceof k) {
            kVar = (k) interfaceC30057d;
            int i13 = kVar.f83812F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                kVar.f83812F = i13 - Integer.MIN_VALUE;
            } else {
                kVar = new k(interfaceC30057d);
            }
        } else {
            kVar = new k(interfaceC30057d);
        }
        k kVar2 = kVar;
        Object obj = kVar2.f83816z;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = kVar2.f83812F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            strM61568d = INSTANCE.m61568d(str4, str5);
            if (!m61556l(strM61568d)) {
                return c23454a0;
            }
            try {
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                l lVar = new l(str4, str5, null);
                kVar2.f83813w = str4;
                kVar2.f83814x = str5;
                kVar2.f83815y = strM61568d;
                kVar2.f83812F = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, lVar, kVar2, 6, null);
                if (objM108729b != obj2) {
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    if (interfaceC34385a instanceof InterfaceC34385a.c) {
                        kVar2.f83813w = null;
                        kVar2.f83814x = null;
                        kVar2.f83815y = strM61568d;
                        kVar2.f83812F = 2;
                        if (m61562r(str4, str5, kVar2) != obj2) {
                            str3 = strM61568d;
                            strM61568d = str3;
                        }
                    } else if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return obj2;
            } catch (Throwable th3) {
                th = th3;
                str5 = strM61568d;
                m61561q(str5);
                throw th;
            }
        }
        try {
            if (i14 == 1) {
                String str6 = (String) kVar2.f83815y;
                String str7 = (String) kVar2.f83814x;
                String str8 = (String) kVar2.f83813w;
                AbstractC34132o.m107864I(obj);
                str5 = str7;
                str4 = str8;
                objM108729b = obj;
                strM61568d = str6;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                if (interfaceC34385a instanceof InterfaceC34385a.c) {
                    kVar2.f83813w = null;
                    kVar2.f83814x = null;
                    kVar2.f83815y = strM61568d;
                    kVar2.f83812F = 2;
                    if (m61562r(str4, str5, kVar2) != obj2) {
                        str3 = strM61568d;
                    }
                    return obj2;
                }
                if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) kVar2.f83815y;
                AbstractC34132o.m107864I(obj);
            }
            strM61568d = str3;
        } catch (Throwable th4) {
            th = th4;
            m61561q(str5);
            throw th;
        }
        m61561q(strM61568d);
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final Object m61564t(String str, String str2, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        m mVar;
        if (interfaceC30057d instanceof m) {
            mVar = (m) interfaceC30057d;
            int i13 = mVar.f83821E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                mVar.f83821E = i13 - Integer.MIN_VALUE;
            } else {
                mVar = new m(interfaceC30057d);
            }
        } else {
            mVar = new m(interfaceC30057d);
        }
        Object obj = mVar.f83824y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = mVar.f83821E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC0422g interfaceC0422g = this.prefsDataStore;
                n nVar = new n(str, str2, null);
                mVar.f83822w = str;
                mVar.f83823x = str2;
                mVar.f83821E = 1;
                Object objM48861G = AbstractC17269i.m48861G(interfaceC0422g, nVar, mVar);
                str = objM48861G;
                if (objM48861G == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) mVar.f83823x;
                String str3 = (String) mVar.f83822w;
                AbstractC34132o.m107864I(obj);
                str = str3;
            }
        } catch (IOException e5) {
            this.logger.mo85230v(AbstractC31061c.m95640p("Failed to store shown destination: ", str, ":", str2), e5, new AbstractC30556a.a[0]);
            AbstractC3006f0.m8721o(mVar.getContext());
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:36:0x0102->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d5, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m61565u(java.util.List<com.whoop.navigation.C9598e> r11, q83.InterfaceC30057d<? super l83.C23454a0> r12) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jl1.C21771b.m61565u(java.util.List, q83.d):java.lang.Object");
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36602l(new f(upstream, this, null));
    }
}
