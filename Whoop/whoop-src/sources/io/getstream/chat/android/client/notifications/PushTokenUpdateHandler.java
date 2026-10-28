package io.getstream.chat.android.client.notifications;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import com.whoop.service.network.model.UserState;
import io.getstream.chat.android.client.api.ChatApi;
import io.getstream.chat.android.models.Device;
import io.getstream.chat.android.models.User;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import o23.InterfaceC27474d;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\b0\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006$"}, m65681d2 = {"Lio/getstream/chat/android/client/notifications/PushTokenUpdateHandler;", "", "Lio/getstream/chat/android/client/api/ChatApi;", "api", "<init>", "(Lio/getstream/chat/android/client/api/ChatApi;)V", "Lio/getstream/chat/android/models/User;", UserState.Sources.USER, "Lio/getstream/chat/android/models/Device;", "device", "", "isDeviceRegistered", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;)Z", "Ll83/a0;", "addDevice", "(Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/models/Device;Lq83/d;)Ljava/lang/Object;", "deleteDevice", "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;", "Lio/getstream/chat/android/client/api/ChatApi;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "Lmc3/a;", "addDeviceLock", "Lmc3/a;", "", "", "registeredDeviceInSession", "Ljava/util/Map;", "getRegisteredDeviceInSession$stream_chat_android_client_release", "()Ljava/util/Map;", "getRegisteredDeviceInSession$stream_chat_android_client_release$annotations", "()V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PushTokenUpdateHandler {
    private final InterfaceC25435a addDeviceLock;
    private final ChatApi api;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final Map<String, Device> registeredDeviceInSession;

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.PushTokenUpdateHandler$addDevice$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.PushTokenUpdateHandler", m100430f = "PushTokenUpdateHandler.kt", m100431l = {249, 140}, m100432m = "addDevice")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193881 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C193881(InterfaceC30057d<? super C193881> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushTokenUpdateHandler.this.addDevice(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.notifications.PushTokenUpdateHandler$deleteDevice$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.notifications.PushTokenUpdateHandler", m100430f = "PushTokenUpdateHandler.kt", m100431l = {191}, m100432m = "deleteDevice")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C193891 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C193891(InterfaceC30057d<? super C193891> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PushTokenUpdateHandler.this.deleteDevice(null, this);
        }
    }

    public PushTokenUpdateHandler(ChatApi api) {
        AbstractC22676k.m65750j(api, "api");
        this.api = api;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:Notifications-UH");
        this.addDeviceLock = AbstractC25438d.m74669a();
        this.registeredDeviceInSession = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    /* JADX INFO: renamed from: getRegisteredDeviceInSession$stream_chat_android_client_release$annotations */
    public static /* synthetic */ void m54872x1f97e84c() {
    }

    private final boolean isDeviceRegistered(User user, Device device) {
        return user.getDevices().contains(device) || AbstractC22676k.m65745e(this.registeredDeviceInSession.get(user.getId()), device);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0118 A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0138 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0158 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0160 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0164 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0178 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a0 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x01aa A[Catch: all -> 0x0048, TRY_ENTER, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0043, B:44:0x0110, B:47:0x0118, B:49:0x0138, B:52:0x015c, B:54:0x0160, B:56:0x0164, B:58:0x0178, B:59:0x01a0, B:60:0x01a5, B:50:0x0158, B:63:0x01aa, B:64:0x01af), top: B:67:0x0043 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0138, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x0178, please report this as an issue */
    public final Object addDevice(User user, Device device, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C193881 c193881;
        InterfaceC25435a interfaceC25435a;
        Device device2;
        User user2;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        User user3;
        Device device3;
        AbstractC26205h abstractC26205h;
        AbstractC26202e abstractC26202e;
        C2345k logger;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        C2345k logger2;
        InterfaceC2339e interfaceC2339e2;
        String str2;
        EnumC2341g enumC2341g2;
        if (interfaceC30057d instanceof C193881) {
            c193881 = (C193881) interfaceC30057d;
            int i14 = c193881.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c193881.label = i14 - Integer.MIN_VALUE;
            } else {
                c193881 = new C193881(interfaceC30057d);
            }
        } else {
            c193881 = new C193881(interfaceC30057d);
        }
        Object obj = c193881.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c193881.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        try {
            if (i15 == 0) {
                AbstractC34132o.m107864I(obj);
                if (user == null) {
                    C2345k logger3 = getLogger();
                    InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
                    String str3 = logger3.f9273a;
                    EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
                    if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                        logger3.f9274b.log(enumC2341g3, str3, AbstractC11266d.m30461o("[addDevice] User is null, cannot add device ", device.getToken()), null);
                    }
                    return c23454a0;
                }
                interfaceC25435a = this.addDeviceLock;
                c193881.L$0 = user;
                device2 = device;
                c193881.L$1 = device2;
                c193881.L$2 = interfaceC25435a;
                c193881.I$0 = 0;
                c193881.label = 1;
                if (interfaceC25435a.mo68211b(c193881) != enumC31071a) {
                    user2 = user;
                    i13 = 0;
                }
                return enumC31071a;
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC25435a2 = (InterfaceC25435a) c193881.L$2;
                device3 = (Device) c193881.L$1;
                user3 = (User) c193881.L$0;
                try {
                    AbstractC34132o.m107864I(obj);
                    abstractC26205h = (AbstractC26205h) obj;
                    if (abstractC26205h instanceof C26204g) {
                        this.registeredDeviceInSession.put(user3.getId(), device3);
                        logger2 = getLogger();
                        interfaceC2339e2 = logger2.f9275c;
                        str2 = logger2.f9273a;
                        enumC2341g2 = EnumC2341g.DEBUG;
                        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                            logger2.f9274b.log(enumC2341g2, str2, "[addDevice] Successfully added device " + device3.getToken() + " for " + user3.getId(), null);
                        }
                    } else if (!(abstractC26205h instanceof C26203f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(abstractC26205h instanceof C26204g)) {
                        if (abstractC26205h instanceof C26203f) {
                            throw new NoWhenBranchMatchedException();
                        }
                        abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                        logger = getLogger();
                        interfaceC2339e = logger.f9275c;
                        str = logger.f9273a;
                        enumC2341g = EnumC2341g.ERROR;
                        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                            logger.f9274b.log(enumC2341g, str, "[addDevice] Failed to add device " + device3.getToken() + " for " + user3.getId() + ", " + abstractC26202e, null);
                        }
                    }
                    interfaceC25435a2.mo68214i(null);
                    return c23454a0;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC25435a2.mo68214i(null);
                    throw th;
                }
            }
            i13 = c193881.I$0;
            InterfaceC25435a interfaceC25435a3 = (InterfaceC25435a) c193881.L$2;
            Device device4 = (Device) c193881.L$1;
            user2 = (User) c193881.L$0;
            AbstractC34132o.m107864I(obj);
            interfaceC25435a = interfaceC25435a3;
            device2 = device4;
            boolean zIsDeviceRegistered = isDeviceRegistered(user2, device2);
            if (zIsDeviceRegistered) {
                this.registeredDeviceInSession.put(user2.getId(), device2);
                C2345k logger4 = getLogger();
                InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
                String str4 = logger4.f9273a;
                EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
                if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                    logger4.f9274b.log(enumC2341g4, str4, "[addDevice] Device " + device2.getToken() + " is already registered for " + user2.getId() + ", skipping.", null);
                }
                interfaceC25435a.mo68214i(null);
                return c23454a0;
            }
            InterfaceC27474d interfaceC27474dAddDevice = this.api.addDevice(device2);
            c193881.L$0 = user2;
            c193881.L$1 = device2;
            c193881.L$2 = interfaceC25435a;
            c193881.I$0 = i13;
            c193881.I$1 = 0;
            c193881.Z$0 = zIsDeviceRegistered;
            c193881.label = 2;
            Object objAwait = interfaceC27474dAddDevice.await(c193881);
            if (objAwait != enumC31071a) {
                interfaceC25435a2 = interfaceC25435a;
                user3 = user2;
                obj = objAwait;
                device3 = device2;
                abstractC26205h = (AbstractC26205h) obj;
                if (abstractC26205h instanceof C26204g) {
                    this.registeredDeviceInSession.put(user3.getId(), device3);
                    logger2 = getLogger();
                    interfaceC2339e2 = logger2.f9275c;
                    str2 = logger2.f9273a;
                    enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        logger2.f9274b.log(enumC2341g2, str2, "[addDevice] Successfully added device " + device3.getToken() + " for " + user3.getId(), null);
                    }
                } else if (!(abstractC26205h instanceof C26203f)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!(abstractC26205h instanceof C26204g)) {
                    if (abstractC26205h instanceof C26203f) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC26202e = ((C26203f) abstractC26205h).f103918a;
                    logger = getLogger();
                    interfaceC2339e = logger.f9275c;
                    str = logger.f9273a;
                    enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, "[addDevice] Failed to add device " + device3.getToken() + " for " + user3.getId() + ", " + abstractC26202e, null);
                    }
                }
                interfaceC25435a2.mo68214i(null);
                return c23454a0;
            }
            return enumC31071a;
        } catch (Throwable th4) {
            th = th4;
            interfaceC25435a2 = interfaceC25435a;
            interfaceC25435a2.mo68214i(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object deleteDevice(User user, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C193891 c193891;
        Device device;
        Object objAwait;
        if (interfaceC30057d instanceof C193891) {
            c193891 = (C193891) interfaceC30057d;
            int i13 = c193891.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c193891.label = i13 - Integer.MIN_VALUE;
            } else {
                c193891 = new C193891(interfaceC30057d);
            }
        } else {
            c193891 = new C193891(interfaceC30057d);
        }
        Object obj = c193891.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c193891.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (user == null) {
                C2345k logger = getLogger();
                InterfaceC2339e interfaceC2339e = logger.f9275c;
                String str = logger.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.DEBUG;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    logger.f9274b.log(enumC2341g, str, "[deleteDevice] User is null, cannot delete device.", null);
                    return c23454a0;
                }
            } else {
                device = this.registeredDeviceInSession.get(user.getId());
                if (device == null) {
                    C2345k logger2 = getLogger();
                    InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
                    String str2 = logger2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        logger2.f9274b.log(enumC2341g2, str2, AbstractC11895b.m31996o("[deleteDevice] No device tracked in session for user ", user.getId(), ", skipping deletion."), null);
                        return c23454a0;
                    }
                } else {
                    InterfaceC27474d interfaceC27474dDeleteDevice = this.api.deleteDevice(device.getToken());
                    c193891.L$0 = user;
                    c193891.L$1 = device;
                    c193891.label = 1;
                    objAwait = interfaceC27474dDeleteDevice.await(c193891);
                    if (objAwait == enumC31071a) {
                        return enumC31071a;
                    }
                }
            }
            return c23454a0;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Device device2 = (Device) c193891.L$1;
        User user2 = (User) c193891.L$0;
        AbstractC34132o.m107864I(obj);
        device = device2;
        user = user2;
        objAwait = obj;
        AbstractC26205h abstractC26205h = (AbstractC26205h) objAwait;
        boolean z4 = abstractC26205h instanceof C26204g;
        if (z4) {
            this.registeredDeviceInSession.remove(user.getId());
            C2345k logger3 = getLogger();
            InterfaceC2339e interfaceC2339e3 = logger3.f9275c;
            String str3 = logger3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.DEBUG;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                logger3.f9274b.log(enumC2341g3, str3, AbstractC31061c.m95640p("[deleteDevice] Successfully deleted device ", device.getToken(), " for ", user.getId()), null);
            }
        } else if (!(abstractC26205h instanceof C26203f)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z4) {
            if (!(abstractC26205h instanceof C26203f)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC26202e abstractC26202e = ((C26203f) abstractC26205h).f103918a;
            C2345k logger4 = getLogger();
            InterfaceC2339e interfaceC2339e4 = logger4.f9275c;
            String str4 = logger4.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                InterfaceC2344j interfaceC2344j = logger4.f9274b;
                StringBuilder sbM32001t = AbstractC11895b.m32001t("[deleteDevice] Failed to delete device ", device.getToken(), " for ", user.getId(), ", ");
                sbM32001t.append(abstractC26202e);
                interfaceC2344j.log(enumC2341g4, str4, sbM32001t.toString(), null);
                return c23454a0;
            }
        }
        return c23454a0;
    }

    public final Map<String, Device> getRegisteredDeviceInSession$stream_chat_android_client_release() {
        return this.registeredDeviceInSession;
    }
}
