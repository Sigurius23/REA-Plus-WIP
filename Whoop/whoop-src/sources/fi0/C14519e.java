package fi0;

import android.content.SharedPreferences;
import androidx.core.app.NotificationChannelCompat;
import androidx.core.app.NotificationChannelGroupCompat;
import androidx.core.app.NotificationManagerCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: fi0.e */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0086@¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lfi0/e;", "", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lq83/j;", "ioDispatcher", "Landroidx/core/app/NotificationManagerCompat;", "notificationManager", "<init>", "(Landroid/content/SharedPreferences;Lq83/j;Landroidx/core/app/NotificationManagerCompat;)V", "Lfi0/d;", "c", "()Lfi0/d;", "b", "d", "(Lq83/d;)Ljava/lang/Object;", "e", "a", "Landroid/content/SharedPreferences;", "Lq83/j;", "Landroidx/core/app/NotificationManagerCompat;", "analytics_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14519e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC30063j ioDispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final NotificationManagerCompat notificationManager;

    /* JADX INFO: renamed from: fi0.e$b */
    @InterfaceC32271e(m100429c = "com.whoop.analytics.PushNotificationPermissionStatusDecider", m100430f = "PushNotificationPermissionStatusDecider.kt", m100431l = {16, 20}, m100432m = "getIfUpdated", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f53037F;

        /* JADX INFO: renamed from: w */
        Object f53038w;

        /* JADX INFO: renamed from: x */
        Object f53039x;

        /* JADX INFO: renamed from: y */
        Object f53040y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f53041z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53041z = obj;
            this.f53037F |= Integer.MIN_VALUE;
            return C14519e.this.m41434d(this);
        }
    }

    /* JADX INFO: renamed from: fi0.e$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.analytics.PushNotificationPermissionStatusDecider$getIfUpdated$2", m100430f = "PushNotificationPermissionStatusDecider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53042w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC14518d f53044y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC14518d enumC14518d, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53044y = enumC14518d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14519e.this.new c(this.f53044y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53042w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SharedPreferences sharedPreferences = C14519e.this.sharedPreferences;
            EnumC14518d enumC14518d = this.f53044y;
            SharedPreferences.Editor editor = sharedPreferences.edit();
            AbstractC22676k.m65749i(editor, "editor");
            editor.putString("key-last-known", enumC14518d.getLabel());
            editor.apply();
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: fi0.e$d */
    @InterfaceC32271e(m100429c = "com.whoop.analytics.PushNotificationPermissionStatusDecider$getIfUpdated$lastKnown$1", m100430f = "PushNotificationPermissionStatusDecider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53045w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14519e.this.new d(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53045w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C14519e.this.sharedPreferences.getString("key-last-known", "");
        }
    }

    /* JADX INFO: renamed from: fi0.e$e */
    @InterfaceC32271e(m100429c = "com.whoop.analytics.PushNotificationPermissionStatusDecider", m100430f = "PushNotificationPermissionStatusDecider.kt", m100431l = {28}, m100432m = "updateAndGet", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f53047w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f53048x;

        /* JADX INFO: renamed from: z */
        int f53050z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f53048x = obj;
            this.f53050z |= Integer.MIN_VALUE;
            return C14519e.this.m41435e(this);
        }
    }

    /* JADX INFO: renamed from: fi0.e$f */
    @InterfaceC32271e(m100429c = "com.whoop.analytics.PushNotificationPermissionStatusDecider$updateAndGet$2", m100430f = "PushNotificationPermissionStatusDecider.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f53051w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ EnumC14518d f53053y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumC14518d enumC14518d, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f53053y = enumC14518d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14519e.this.new f(this.f53053y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f53051w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            SharedPreferences sharedPreferences = C14519e.this.sharedPreferences;
            EnumC14518d enumC14518d = this.f53053y;
            SharedPreferences.Editor editor = sharedPreferences.edit();
            AbstractC22676k.m65749i(editor, "editor");
            editor.putString("key-last-known", enumC14518d.getLabel());
            editor.apply();
            return C23454a0.f92919a;
        }
    }

    public C14519e(SharedPreferences sharedPreferences, InterfaceC30063j ioDispatcher, NotificationManagerCompat notificationManager) {
        AbstractC22676k.m65750j(sharedPreferences, "sharedPreferences");
        AbstractC22676k.m65750j(ioDispatcher, "ioDispatcher");
        AbstractC22676k.m65750j(notificationManager, "notificationManager");
        this.sharedPreferences = sharedPreferences;
        this.ioDispatcher = ioDispatcher;
        this.notificationManager = notificationManager;
    }

    /* JADX INFO: renamed from: b */
    private final EnumC14518d m41432b() {
        List<NotificationChannelCompat> notificationChannelsCompat = this.notificationManager.getNotificationChannelsCompat();
        AbstractC22676k.m65749i(notificationChannelsCompat, "getNotificationChannelsCompat(...)");
        int size = notificationChannelsCompat.size();
        List<NotificationChannelCompat> list = notificationChannelsCompat;
        int i13 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((NotificationChannelCompat) it.next()).getImportance() == 0 && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        if (size == 0) {
            return EnumC14518d.UNKNOWN;
        }
        if (i13 == 0) {
            return EnumC14518d.ALLOWED;
        }
        if (size == i13) {
            return EnumC14518d.DISABLED;
        }
        if (size > i13) {
            return EnumC14518d.PARTIAL;
        }
        throw new IllegalStateException("impossible state");
    }

    /* JADX INFO: renamed from: c */
    private final EnumC14518d m41433c() {
        if (!this.notificationManager.areNotificationsEnabled()) {
            return EnumC14518d.DISABLED;
        }
        List<NotificationChannelGroupCompat> notificationChannelGroupsCompat = this.notificationManager.getNotificationChannelGroupsCompat();
        AbstractC22676k.m65749i(notificationChannelGroupsCompat, "getNotificationChannelGroupsCompat(...)");
        int size = notificationChannelGroupsCompat.size();
        List<NotificationChannelGroupCompat> list = notificationChannelGroupsCompat;
        int i13 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((NotificationChannelGroupCompat) it.next()).isBlocked() && (i13 = i13 + 1) < 0) {
                    AbstractC37056f.m118976c0();
                    throw null;
                }
            }
        }
        if (size != 0 && i13 != 0) {
            if (size == i13) {
                return EnumC14518d.DISABLED;
            }
            if (size > i13) {
                return EnumC14518d.PARTIAL;
            }
            throw new IllegalStateException("impossible state");
        }
        return m41432b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m41434d(InterfaceC30057d<? super EnumC14518d> interfaceC30057d) {
        b bVar;
        EnumC14518d enumC14518d;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f53037F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f53037F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM8705K = bVar.f53041z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f53037F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            InterfaceC30063j interfaceC30063j = this.ioDispatcher;
            d dVar = new d(null);
            bVar.f53037F = 1;
            objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, dVar, bVar);
            if (objM8705K != enumC31071a) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EnumC14518d enumC14518d2 = (EnumC14518d) bVar.f53040y;
            AbstractC34132o.m107864I(objM8705K);
            return enumC14518d2;
        }
        AbstractC34132o.m107864I(objM8705K);
        String str = (String) objM8705K;
        EnumC14518d[] enumC14518dArrValues = EnumC14518d.values();
        int length = enumC14518dArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                enumC14518d = null;
                break;
            }
            enumC14518d = enumC14518dArrValues[i15];
            if (AbstractC22676k.m65745e(enumC14518d.getLabel(), str)) {
                break;
            }
            i15++;
        }
        EnumC14518d enumC14518dM41433c = m41433c();
        if (enumC14518d == enumC14518dM41433c) {
            return null;
        }
        InterfaceC30063j interfaceC30063j2 = this.ioDispatcher;
        c cVar = new c(enumC14518dM41433c, null);
        bVar.f53038w = null;
        bVar.f53039x = null;
        bVar.f53040y = enumC14518dM41433c;
        bVar.f53037F = 2;
        return AbstractC3006f0.m8705K(interfaceC30063j2, cVar, bVar) == enumC31071a ? enumC31071a : enumC14518dM41433c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m41435e(InterfaceC30057d<? super EnumC14518d> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f53050z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f53050z = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f53048x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f53050z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            EnumC14518d enumC14518d = (EnumC14518d) eVar.f53047w;
            AbstractC34132o.m107864I(obj);
            return enumC14518d;
        }
        AbstractC34132o.m107864I(obj);
        EnumC14518d enumC14518dM41433c = m41433c();
        InterfaceC30063j interfaceC30063j = this.ioDispatcher;
        f fVar = new f(enumC14518dM41433c, null);
        eVar.f53047w = enumC14518dM41433c;
        eVar.f53050z = 1;
        return AbstractC3006f0.m8705K(interfaceC30063j, fVar, eVar) == enumC31071a ? enumC31071a : enumC14518dM41433c;
    }
}
