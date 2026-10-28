package live.hms.video.interactivity;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import live.hms.video.error.ErrorFactory;
import live.hms.video.sdk.SDKStore;
import live.hms.video.sdk.models.HMSNotifications;
import live.hms.video.sdk.models.HMSPeer;
import live.hms.video.whiteboard.HMSWhiteboard;
import live.hms.video.whiteboard.HMSWhiteboardUpdate;
import live.hms.video.whiteboard.HMSWhiteboardUpdateListener;
import live.hms.video.whiteboard.State;
import live.hms.video.whiteboard.network.HMSGetWhiteBoardResponse;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.interactivity.HmsInteractivityCenter$handleWhiteBoardStateNotification$1", m100430f = "HmsInteractivityCenter.kt", m100431l = {597}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class HmsInteractivityCenter$handleWhiteBoardStateNotification$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ boolean $isOpen;
    final /* synthetic */ boolean $isOwner;
    final /* synthetic */ HMSNotifications.WhiteboardInfo $params;
    int label;
    final /* synthetic */ HmsInteractivityCenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HmsInteractivityCenter$handleWhiteBoardStateNotification$1(HMSNotifications.WhiteboardInfo whiteboardInfo, HmsInteractivityCenter hmsInteractivityCenter, boolean z4, boolean z13, InterfaceC30057d<? super HmsInteractivityCenter$handleWhiteBoardStateNotification$1> interfaceC30057d) {
        super(2, interfaceC30057d);
        this.$params = whiteboardInfo;
        this.this$0 = hmsInteractivityCenter;
        this.$isOpen = z4;
        this.$isOwner = z13;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new HmsInteractivityCenter$handleWhiteBoardStateNotification$1(this.$params, this.this$0, this.$isOpen, this.$isOwner, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((HmsInteractivityCenter$handleWhiteBoardStateNotification$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM107888l;
        String message;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i13 = this.label;
        try {
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HmsInteractivityCenter hmsInteractivityCenter = this.this$0;
                HMSNotifications.WhiteboardInfo whiteboardInfo = this.$params;
                InterfaceC4351m interfaceC4351m = hmsInteractivityCenter.getWhiteBoard;
                String id4 = whiteboardInfo.getId();
                if (id4 == null) {
                    id4 = "";
                }
                this.label = 1;
                obj = interfaceC4351m.invoke(id4, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            objM107888l = (HMSGetWhiteBoardResponse) obj;
        } catch (Throwable th3) {
            objM107888l = AbstractC34132o.m107888l(th3);
        }
        boolean z4 = objM107888l instanceof C23467m;
        if (z4) {
            ErrorFactory.GenericErrors genericErrors = ErrorFactory.GenericErrors.INSTANCE;
            ErrorFactory.Action action = ErrorFactory.Action.WHITEBOARD;
            Throwable thM68037a = C23468n.m68037a(objM107888l);
            if (thM68037a == null || (message = thM68037a.getMessage()) == null) {
                message = "unable to get white board notification";
            }
            ErrorFactory.GenericErrors.Unknown$default(genericErrors, action, message, C23468n.m68037a(objM107888l), null, 8, null);
        } else {
            String id5 = this.$params.getId();
            String str = id5 == null ? "" : id5;
            String title = this.$params.getTitle();
            SDKStore sDKStore = this.this$0.sdkStore;
            String owner = this.$params.getOwner();
            if (owner == null) {
                owner = "";
            }
            HMSPeer peerByCustomerUserId = sDKStore.getPeerByCustomerUserId(owner);
            HmsInteractivityCenter hmsInteractivityCenter2 = this.this$0;
            HMSGetWhiteBoardResponse hMSGetWhiteBoardResponse = (HMSGetWhiteBoardResponse) (z4 ? null : objM107888l);
            String addr = hMSGetWhiteBoardResponse != null ? hMSGetWhiteBoardResponse.getAddr() : null;
            if (addr == null) {
                addr = "";
            }
            if (z4) {
                objM107888l = null;
            }
            HMSGetWhiteBoardResponse hMSGetWhiteBoardResponse2 = (HMSGetWhiteBoardResponse) objM107888l;
            String token = hMSGetWhiteBoardResponse2 != null ? hMSGetWhiteBoardResponse2.getToken() : null;
            HMSWhiteboard hMSWhiteboard = new HMSWhiteboard(str, title, peerByCustomerUserId, this.$isOwner, hmsInteractivityCenter2.formatWhiteBoardUrl(addr, token != null ? token : ""), (this.this$0.getLocalWhiteBoardstart() || this.$isOpen) ? State.Started : State.Stopped);
            if (this.this$0.getLocalWhiteBoardstart()) {
                this.this$0.setLocalWhiteBoardstart$lib_release(false);
            }
            State state = hMSWhiteboard.getState();
            State state2 = State.Started;
            if (state != state2 || this.this$0.getCurrentWhiteBoardState() == state2) {
                State state3 = hMSWhiteboard.getState();
                State state4 = State.Stopped;
                if (state3 == state4 && this.this$0.getCurrentWhiteBoardState() != state4) {
                    HMSWhiteboardUpdateListener hMSWhiteboardUpdateListener = this.this$0.whiteBoardUpdateListener;
                    if (hMSWhiteboardUpdateListener != null) {
                        hMSWhiteboardUpdateListener.onUpdate(new HMSWhiteboardUpdate.Stop(hMSWhiteboard));
                    }
                    this.this$0.setCurrentWhiteBoardState(state4);
                }
            } else {
                HMSWhiteboardUpdateListener hMSWhiteboardUpdateListener2 = this.this$0.whiteBoardUpdateListener;
                if (hMSWhiteboardUpdateListener2 != null) {
                    hMSWhiteboardUpdateListener2.onUpdate(new HMSWhiteboardUpdate.Start(hMSWhiteboard));
                }
                this.this$0.setCurrentWhiteBoardState(state2);
            }
            this.this$0.currentWhiteBoard = hMSWhiteboard;
        }
        return C23454a0.f92919a;
    }
}
