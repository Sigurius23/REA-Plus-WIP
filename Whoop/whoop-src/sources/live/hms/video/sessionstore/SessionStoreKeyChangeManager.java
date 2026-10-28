package live.hms.video.sessionstore;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.C23454a0;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.utils.HMSCoroutineScope;
import m83.AbstractC25265s;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import p098dt.AbstractC12350b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\"\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B;\u0012(\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u0012\u001a\u00020\u00112\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\u00020\u00112\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0003H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR6\u0010\u0007\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, m65681d2 = {"Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;", "", "Lkotlin/Function2;", "", "", "Lq83/d;", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "addKeyChangeListener", "Lbc3/c0;", "scope", "<init>", "(Lc93/m;Lbc3/c0;)V", "forKeys", "Llive/hms/video/sessionstore/HMSKeyChangeListener;", "keyChangeListener", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "Ll83/a0;", "setKeyChangeListener", "(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "listener", "Lbc3/k1;", "removeKeyChangeListener", "(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;Lq83/d;)Ljava/lang/Object;", "Llive/hms/video/sessionstore/SessionMetadataResult;", "updates", "sendKeyChangeUpdates", "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lc93/m;", "Lbc3/c0;", "Lmc3/a;", "keyChangeMutex", "Lmc3/a;", "", "", "keyToListenersMap", "Ljava/util/Map;", "listenerToKeysMap", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SessionStoreKeyChangeManager {
    private final InterfaceC4351m addKeyChangeListener;
    private final InterfaceC25435a keyChangeMutex;
    private final Map<String, Set<HMSKeyChangeListener>> keyToListenersMap;
    private final Map<HMSKeyChangeListener, List<String>> listenerToKeysMap;
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: live.hms.video.sessionstore.SessionStoreKeyChangeManager$removeKeyChangeListener$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.SessionStoreKeyChangeManager", m100430f = "SessionStoreKeyChangeManager.kt", m100431l = {124}, m100432m = "removeKeyChangeListener")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242821 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C242821(InterfaceC30057d<? super C242821> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionStoreKeyChangeManager.this.removeKeyChangeListener(null, null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sessionstore.SessionStoreKeyChangeManager$sendKeyChangeUpdates$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.SessionStoreKeyChangeManager", m100430f = "SessionStoreKeyChangeManager.kt", m100431l = {124}, m100432m = "sendKeyChangeUpdates")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242831 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C242831(InterfaceC30057d<? super C242831> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionStoreKeyChangeManager.this.sendKeyChangeUpdates(null, this);
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sessionstore.SessionStoreKeyChangeManager$setKeyChangeListener$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.SessionStoreKeyChangeManager", m100430f = "SessionStoreKeyChangeManager.kt", m100431l = {124}, m100432m = "setKeyChangeListener")
    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class C242841 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C242841(InterfaceC30057d<? super C242841> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SessionStoreKeyChangeManager.this.setKeyChangeListener(null, null, null, this);
        }
    }

    public SessionStoreKeyChangeManager(InterfaceC4351m addKeyChangeListener, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(addKeyChangeListener, "addKeyChangeListener");
        AbstractC22676k.m65750j(scope, "scope");
        this.addKeyChangeListener = addKeyChangeListener;
        this.scope = scope;
        this.keyChangeMutex = AbstractC25438d.m74669a();
        this.keyToListenersMap = new HashMap();
        this.listenerToKeysMap = new HashMap();
    }

    public static /* synthetic */ Object removeKeyChangeListener$default(SessionStoreKeyChangeManager sessionStoreKeyChangeManager, HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            hMSActionResultListener = null;
        }
        return sessionStoreKeyChangeManager.removeKeyChangeListener(hMSKeyChangeListener, hMSActionResultListener, interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object removeKeyChangeListener(HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super InterfaceC3027k1> interfaceC30057d) {
        C242821 c242821;
        InterfaceC25435a interfaceC25435a;
        SessionStoreKeyChangeManager sessionStoreKeyChangeManager;
        if (interfaceC30057d instanceof C242821) {
            c242821 = (C242821) interfaceC30057d;
            int i13 = c242821.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242821.label = i13 - Integer.MIN_VALUE;
            } else {
                c242821 = new C242821(interfaceC30057d);
            }
        } else {
            c242821 = new C242821(interfaceC30057d);
        }
        Object obj = c242821.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242821.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.keyChangeMutex;
            c242821.L$0 = this;
            c242821.L$1 = hMSKeyChangeListener;
            c242821.L$2 = hMSActionResultListener;
            c242821.L$3 = interfaceC25435a;
            c242821.label = 1;
            if (interfaceC25435a.mo68211b(c242821) == enumC31071a) {
                return enumC31071a;
            }
            sessionStoreKeyChangeManager = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c242821.L$3;
            hMSActionResultListener = (HMSActionResultListener) c242821.L$2;
            HMSKeyChangeListener hMSKeyChangeListener2 = (HMSKeyChangeListener) c242821.L$1;
            sessionStoreKeyChangeManager = (SessionStoreKeyChangeManager) c242821.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            hMSKeyChangeListener = hMSKeyChangeListener2;
        }
        try {
            List<String> listRemove = sessionStoreKeyChangeManager.listenerToKeysMap.remove(hMSKeyChangeListener);
            if (listRemove != null) {
                for (String str : listRemove) {
                    Set<HMSKeyChangeListener> set = sessionStoreKeyChangeManager.keyToListenersMap.get(str);
                    LinkedHashSet linkedHashSetM34604y = set != null ? AbstractC12350b.m34604y(hMSKeyChangeListener, set) : null;
                    if (linkedHashSetM34604y == null || linkedHashSetM34604y.isEmpty()) {
                        sessionStoreKeyChangeManager.keyToListenersMap.remove(str);
                    } else {
                        sessionStoreKeyChangeManager.keyToListenersMap.put(str, linkedHashSetM34604y);
                    }
                }
            }
            return AbstractC3006f0.m8732z(sessionStoreKeyChangeManager.scope, null, null, new SessionStoreKeyChangeManager$removeKeyChangeListener$2$2(sessionStoreKeyChangeManager, AbstractC25265s.m74093D1(sessionStoreKeyChangeManager.keyToListenersMap.keySet()), hMSActionResultListener, null), 3);
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendKeyChangeUpdates(List<SessionMetadataResult> list, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242831 c242831;
        InterfaceC25435a interfaceC25435a;
        SessionStoreKeyChangeManager sessionStoreKeyChangeManager;
        if (interfaceC30057d instanceof C242831) {
            c242831 = (C242831) interfaceC30057d;
            int i13 = c242831.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242831.label = i13 - Integer.MIN_VALUE;
            } else {
                c242831 = new C242831(interfaceC30057d);
            }
        } else {
            c242831 = new C242831(interfaceC30057d);
        }
        Object obj = c242831.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242831.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.keyChangeMutex;
            c242831.L$0 = this;
            c242831.L$1 = list;
            c242831.L$2 = interfaceC25435a;
            c242831.label = 1;
            if (interfaceC25435a.mo68211b(c242831) == enumC31071a) {
                return enumC31071a;
            }
            sessionStoreKeyChangeManager = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c242831.L$2;
            List<SessionMetadataResult> list2 = (List) c242831.L$1;
            sessionStoreKeyChangeManager = (SessionStoreKeyChangeManager) c242831.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            list = list2;
        }
        try {
            for (SessionMetadataResult sessionMetadataResult : list) {
                Set<HMSKeyChangeListener> set = sessionStoreKeyChangeManager.keyToListenersMap.get(sessionMetadataResult.getKey());
                if (set != null) {
                    Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        AbstractC3006f0.m8732z(sessionStoreKeyChangeManager.scope, null, null, new SessionStoreKeyChangeManager$sendKeyChangeUpdates$2$1$1$1(sessionMetadataResult, (HMSKeyChangeListener) it.next(), null), 3);
                    }
                }
            }
            return C23454a0.f92919a;
        } finally {
            interfaceC25435a.mo68214i(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setKeyChangeListener(List<String> list, HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C242841 c242841;
        InterfaceC25435a interfaceC25435a;
        SessionStoreKeyChangeManager sessionStoreKeyChangeManager;
        if (interfaceC30057d instanceof C242841) {
            c242841 = (C242841) interfaceC30057d;
            int i13 = c242841.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c242841.label = i13 - Integer.MIN_VALUE;
            } else {
                c242841 = new C242841(interfaceC30057d);
            }
        } else {
            c242841 = new C242841(interfaceC30057d);
        }
        Object obj = c242841.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c242841.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = this.keyChangeMutex;
            c242841.L$0 = this;
            c242841.L$1 = list;
            c242841.L$2 = hMSKeyChangeListener;
            c242841.L$3 = hMSActionResultListener;
            c242841.L$4 = interfaceC25435a;
            c242841.label = 1;
            if (interfaceC25435a.mo68211b(c242841) == enumC31071a) {
                return enumC31071a;
            }
            sessionStoreKeyChangeManager = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC25435a interfaceC25435a2 = (InterfaceC25435a) c242841.L$4;
            hMSActionResultListener = (HMSActionResultListener) c242841.L$3;
            hMSKeyChangeListener = (HMSKeyChangeListener) c242841.L$2;
            List<String> list2 = (List) c242841.L$1;
            sessionStoreKeyChangeManager = (SessionStoreKeyChangeManager) c242841.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a2;
            list = list2;
        }
        try {
            boolean zContainsAll = sessionStoreKeyChangeManager.keyToListenersMap.keySet().containsAll(list);
            sessionStoreKeyChangeManager.listenerToKeysMap.put(hMSKeyChangeListener, list);
            for (String str : list) {
                Set<HMSKeyChangeListener> set = sessionStoreKeyChangeManager.keyToListenersMap.get(str);
                sessionStoreKeyChangeManager.keyToListenersMap.put(str, set != null ? AbstractC12350b.m34555D(hMSKeyChangeListener, set) : AbstractC12350b.m34570S(hMSKeyChangeListener));
            }
            List listM74093D1 = AbstractC25265s.m74093D1(sessionStoreKeyChangeManager.keyToListenersMap.keySet());
            if (!zContainsAll) {
                AbstractC3006f0.m8732z(sessionStoreKeyChangeManager.scope, null, null, new C24285x8c3ef601(sessionStoreKeyChangeManager, listM74093D1, hMSActionResultListener, null), 3);
            }
            interfaceC25435a.mo68214i(null);
            if (zContainsAll) {
                hMSActionResultListener.onSuccess();
            }
            return C23454a0.f92919a;
        } catch (Throwable th3) {
            interfaceC25435a.mo68214i(null);
            throw th3;
        }
    }

    public /* synthetic */ SessionStoreKeyChangeManager(InterfaceC4351m interfaceC4351m, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4351m, (i13 & 2) != 0 ? HMSCoroutineScope.INSTANCE : interfaceC2994c0);
    }
}
