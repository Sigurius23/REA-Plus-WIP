package live.hms.video.sessionstore;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.google.gson.JsonElement;
import java.util.List;
import l83.C23454a0;
import live.hms.video.error.HMSException;
import live.hms.video.sdk.HMSActionResultListener;
import live.hms.video.sdk.HMSSessionMetadataListener;
import live.hms.video.utils.GsonUtils;
import live.hms.video.utils.HMSConstantsKt;
import live.hms.video.utils.HMSCoroutineScope;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u008f\u0001\b\u0000\u0012*\u0010\u0007\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012$\u0010\n\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012(\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001b\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010\r\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\r\u0010%J!\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020#2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b'\u0010(R8\u0010\u0007\u001a&\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R2\u0010\n\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u0006,"}, m65681d2 = {"Llive/hms/video/sessionstore/HmsSessionStore;", "", "Lkotlin/Function3;", "", "Lcom/google/gson/JsonElement;", "Lq83/d;", "Llive/hms/video/sessionstore/SetSessionMetadataResult;", "changeSessionStore", "Lkotlin/Function2;", "Llive/hms/video/sessionstore/SessionMetadataResult;", "getSessionStoreData", "", "Llive/hms/video/sessionstore/SetMetadataListenerResult;", "addKeyChangeListener", "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;", "sessionStoreKeyChangeManager", "<init>", "(Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;)V", "key", "Llive/hms/video/sdk/HMSSessionMetadataListener;", "hmsSessionMetadataListener", "Ll83/a0;", "get", "(Ljava/lang/String;Llive/hms/video/sdk/HMSSessionMetadataListener;)V", "data", "Llive/hms/video/sdk/HMSActionResultListener;", "hmsActionResultListener", "set", "(Ljava/lang/Object;Ljava/lang/String;Llive/hms/video/sdk/HMSActionResultListener;)V", "updates", "Lbc3/k1;", "sendKeyChangeUpdates$lib_release", "(Ljava/util/List;)Lbc3/k1;", "sendKeyChangeUpdates", "forKeys", "Llive/hms/video/sessionstore/HMSKeyChangeListener;", "keyChangeListener", "(Ljava/util/List;Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)V", "listener", "removeKeyChangeListener", "(Llive/hms/video/sessionstore/HMSKeyChangeListener;Llive/hms/video/sdk/HMSActionResultListener;)Lbc3/k1;", "Lkotlin/jvm/functions/Function3;", "Lc93/m;", "Llive/hms/video/sessionstore/SessionStoreKeyChangeManager;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HmsSessionStore {
    private final Function3 changeSessionStore;
    private final InterfaceC4351m getSessionStoreData;
    private final SessionStoreKeyChangeManager sessionStoreKeyChangeManager;

    /* JADX INFO: renamed from: live.hms.video.sessionstore.HmsSessionStore$addKeyChangeListener$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.HmsSessionStore$addKeyChangeListener$1", m100430f = "HmsSessionStore.kt", m100431l = {77}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242781 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ List<String> $forKeys;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSKeyChangeListener $keyChangeListener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242781(List<String> list, HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242781> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$forKeys = list;
            this.$keyChangeListener = hMSKeyChangeListener;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsSessionStore.this.new C242781(this.$forKeys, this.$keyChangeListener, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242781) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SessionStoreKeyChangeManager sessionStoreKeyChangeManager = HmsSessionStore.this.sessionStoreKeyChangeManager;
                List<String> list = this.$forKeys;
                HMSKeyChangeListener hMSKeyChangeListener = this.$keyChangeListener;
                HMSActionResultListener hMSActionResultListener = this.$hmsActionResultListener;
                this.label = 1;
                if (sessionStoreKeyChangeManager.setKeyChangeListener(list, hMSKeyChangeListener, hMSActionResultListener, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.sessionstore.HmsSessionStore$get$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.HmsSessionStore$get$1", m100430f = "HmsSessionStore.kt", m100431l = {35}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242791 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSSessionMetadataListener $hmsSessionMetadataListener;
        final /* synthetic */ String $key;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242791(String str, HMSSessionMetadataListener hMSSessionMetadataListener, InterfaceC30057d<? super C242791> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$key = str;
            this.$hmsSessionMetadataListener = hMSSessionMetadataListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsSessionStore.this.new C242791(this.$key, this.$hmsSessionMetadataListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242791) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC4351m interfaceC4351m = HmsSessionStore.this.getSessionStoreData;
                    String str = this.$key;
                    this.label = 1;
                    obj = interfaceC4351m.invoke(str, this);
                    if (obj == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                JsonElement data = ((SessionMetadataResult) obj).getData();
                if (data != null && data.isJsonNull()) {
                    data = null;
                }
                this.$hmsSessionMetadataListener.onSuccess(data);
            } catch (HMSException e5) {
                this.$hmsSessionMetadataListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.sessionstore.HmsSessionStore$removeKeyChangeListener$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.HmsSessionStore$removeKeyChangeListener$1", m100430f = "HmsSessionStore.kt", m100431l = {82}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242801 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ HMSKeyChangeListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242801(HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242801> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$listener = hMSKeyChangeListener;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HmsSessionStore.this.new C242801(this.$listener, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242801) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SessionStoreKeyChangeManager sessionStoreKeyChangeManager = HmsSessionStore.this.sessionStoreKeyChangeManager;
                HMSKeyChangeListener hMSKeyChangeListener = this.$listener;
                HMSActionResultListener hMSActionResultListener = this.$hmsActionResultListener;
                this.label = 1;
                if (sessionStoreKeyChangeManager.removeKeyChangeListener(hMSKeyChangeListener, hMSActionResultListener, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: live.hms.video.sessionstore.HmsSessionStore$set$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.sessionstore.HmsSessionStore$set$1", m100430f = "HmsSessionStore.kt", m100431l = {62}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C242811 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ Object $data;
        final /* synthetic */ HMSActionResultListener $hmsActionResultListener;
        final /* synthetic */ String $key;
        Object L$0;
        int label;
        final /* synthetic */ HmsSessionStore this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C242811(Object obj, HmsSessionStore hmsSessionStore, String str, HMSActionResultListener hMSActionResultListener, InterfaceC30057d<? super C242811> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$data = obj;
            this.this$0 = hmsSessionStore;
            this.$key = str;
            this.$hmsActionResultListener = hMSActionResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new C242811(this.$data, this.this$0, this.$key, this.$hmsActionResultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C242811) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            JsonElement jsonElement;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    JsonElement jsonTree = this.$data == null ? null : GsonUtils.INSTANCE.getGson().toJsonTree(this.$data);
                    Function3 function3 = this.this$0.changeSessionStore;
                    String str = this.$key;
                    this.L$0 = jsonTree;
                    this.label = 1;
                    Object objInvoke = function3.invoke(str, jsonTree, this);
                    if (objInvoke == enumC31071a) {
                        return enumC31071a;
                    }
                    jsonElement = jsonTree;
                    obj = objInvoke;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    JsonElement jsonElement2 = (JsonElement) this.L$0;
                    AbstractC34132o.m107864I(obj);
                    jsonElement = jsonElement2;
                }
                SetSessionMetadataResult setSessionMetadataResult = (SetSessionMetadataResult) obj;
                this.this$0.sendKeyChangeUpdates$lib_release(AbstractC37056f.m118958J(new SessionMetadataResult(setSessionMetadataResult.getChangeVersion(), null, jsonElement, setSessionMetadataResult.getVersion(), this.$key, 0L)));
                this.$hmsActionResultListener.onSuccess();
            } catch (HMSException e5) {
                this.$hmsActionResultListener.onError(e5);
            }
            return C23454a0.f92919a;
        }
    }

    public HmsSessionStore(Function3 changeSessionStore, InterfaceC4351m getSessionStoreData, InterfaceC4351m addKeyChangeListener, SessionStoreKeyChangeManager sessionStoreKeyChangeManager) {
        AbstractC22676k.m65750j(changeSessionStore, "changeSessionStore");
        AbstractC22676k.m65750j(getSessionStoreData, "getSessionStoreData");
        AbstractC22676k.m65750j(addKeyChangeListener, "addKeyChangeListener");
        AbstractC22676k.m65750j(sessionStoreKeyChangeManager, "sessionStoreKeyChangeManager");
        this.changeSessionStore = changeSessionStore;
        this.getSessionStoreData = getSessionStoreData;
        this.sessionStoreKeyChangeManager = sessionStoreKeyChangeManager;
    }

    public static /* synthetic */ void get$default(HmsSessionStore hmsSessionStore, String str, HMSSessionMetadataListener hMSSessionMetadataListener, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = HMSConstantsKt.DEFAULT_SESSION_METADATA_KEY;
        }
        hmsSessionStore.get(str, hMSSessionMetadataListener);
    }

    public static /* synthetic */ InterfaceC3027k1 removeKeyChangeListener$default(HmsSessionStore hmsSessionStore, HMSKeyChangeListener hMSKeyChangeListener, HMSActionResultListener hMSActionResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            hMSActionResultListener = null;
        }
        return hmsSessionStore.removeKeyChangeListener(hMSKeyChangeListener, hMSActionResultListener);
    }

    public final void addKeyChangeListener(List<String> forKeys, HMSKeyChangeListener keyChangeListener, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(forKeys, "forKeys");
        AbstractC22676k.m65750j(keyChangeListener, "keyChangeListener");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242781(forKeys, keyChangeListener, hmsActionResultListener, null), 3);
    }

    public final void get(String key, HMSSessionMetadataListener hmsSessionMetadataListener) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(hmsSessionMetadataListener, "hmsSessionMetadataListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242791(key, hmsSessionMetadataListener, null), 3);
    }

    public final InterfaceC3027k1 removeKeyChangeListener(HMSKeyChangeListener listener, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(listener, "listener");
        return AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242801(listener, hmsActionResultListener, null), 3);
    }

    public final InterfaceC3027k1 sendKeyChangeUpdates$lib_release(List<SessionMetadataResult> updates) {
        AbstractC22676k.m65750j(updates, "updates");
        return AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HmsSessionStore$sendKeyChangeUpdates$1(this, updates, null), 3);
    }

    public final void set(Object data, String key, HMSActionResultListener hmsActionResultListener) {
        AbstractC22676k.m65750j(key, "key");
        AbstractC22676k.m65750j(hmsActionResultListener, "hmsActionResultListener");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C242811(data, this, key, hmsActionResultListener, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HmsSessionStore(Function3 function3, InterfaceC4351m interfaceC4351m, InterfaceC4351m interfaceC4351m2, SessionStoreKeyChangeManager sessionStoreKeyChangeManager, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 8) != 0) {
            sessionStoreKeyChangeManager = new SessionStoreKeyChangeManager(interfaceC4351m2, null, 2, 0 == true ? 1 : 0);
        }
        this(function3, interfaceC4351m, interfaceC4351m2, sessionStoreKeyChangeManager);
    }
}
