package t23;

import stream.video.sfu.models.WebsocketReconnectStrategy;

/* JADX INFO: renamed from: t23.j */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC33404j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f139479a;

    static {
        int[] iArr = new int[WebsocketReconnectStrategy.values().length];
        try {
            iArr[WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_FAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_MIGRATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_DISCONNECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f139479a = iArr;
    }
}
