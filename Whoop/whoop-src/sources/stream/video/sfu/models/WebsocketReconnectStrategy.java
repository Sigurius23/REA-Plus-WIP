package stream.video.sfu.models;

import com.squareup.wire.AbstractC5572c;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.EnumC5593x;
import com.squareup.wire.InterfaceC5594y;
import ge3.AbstractC15751g;
import j93.InterfaceC21461d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 stream.video.sfu.models.WebsocketReconnectStrategy, still in use, count: 1, list:
  (r0v0 stream.video.sfu.models.WebsocketReconnectStrategy A[DONT_INLINE]) from 0x0052: CONSTRUCTOR 
  (r1v9 j93.d A[DONT_INLINE])
  (r3v4 com.squareup.wire.x A[DONT_INLINE])
  (r0v0 stream.video.sfu.models.WebsocketReconnectStrategy A[DONT_INLINE])
 A[MD:(j93.d, com.squareup.wire.x, stream.video.sfu.models.WebsocketReconnectStrategy):void (m), WRAPPED] call: stream.video.sfu.models.WebsocketReconnectStrategy$Companion$ADAPTER$1.<init>(j93.d, com.squareup.wire.x, stream.video.sfu.models.WebsocketReconnectStrategy):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m65681d2 = {"Lstream/video/sfu/models/WebsocketReconnectStrategy;", "", "Lcom/squareup/wire/y;", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED", "WEBSOCKET_RECONNECT_STRATEGY_DISCONNECT", "WEBSOCKET_RECONNECT_STRATEGY_FAST", "WEBSOCKET_RECONNECT_STRATEGY_REJOIN", "WEBSOCKET_RECONNECT_STRATEGY_MIGRATE", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final class WebsocketReconnectStrategy implements InterfaceC5594y {
    WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED(0),
    WEBSOCKET_RECONNECT_STRATEGY_DISCONNECT(1),
    WEBSOCKET_RECONNECT_STRATEGY_FAST(2),
    WEBSOCKET_RECONNECT_STRATEGY_REJOIN(3),
    WEBSOCKET_RECONNECT_STRATEGY_MIGRATE(4);

    public static final AbstractC5586q ADAPTER;
    private final int value;
    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lstream/video/sfu/models/WebsocketReconnectStrategy$Companion;", "", "<init>", "()V", "", "value", "Lstream/video/sfu/models/WebsocketReconnectStrategy;", "fromValue", "(I)Lstream/video/sfu/models/WebsocketReconnectStrategy;", "Lcom/squareup/wire/q;", "ADAPTER", "Lcom/squareup/wire/q;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WebsocketReconnectStrategy fromValue(int value) {
            if (value == 0) {
                return WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_UNSPECIFIED;
            }
            if (value == 1) {
                return WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_DISCONNECT;
            }
            if (value == 2) {
                return WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_FAST;
            }
            if (value == 3) {
                return WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_REJOIN;
            }
            if (value != 4) {
                return null;
            }
            return WebsocketReconnectStrategy.WEBSOCKET_RECONNECT_STRATEGY_MIGRATE;
        }

        private Companion() {
        }
    }

    static {
        final InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(WebsocketReconnectStrategy.class);
        final EnumC5593x enumC5593x = EnumC5593x.PROTO_3;
        ADAPTER = new AbstractC5572c(orCreateKotlinClass, enumC5593x, websocketReconnectStrategy) { // from class: stream.video.sfu.models.WebsocketReconnectStrategy$Companion$ADAPTER$1
            @Override // com.squareup.wire.AbstractC5572c
            public WebsocketReconnectStrategy fromValue(int value) {
                return WebsocketReconnectStrategy.INSTANCE.fromValue(value);
            }
        };
    }

    private WebsocketReconnectStrategy(int i13) {
        super(str, i);
        this.value = i13;
    }

    public static final WebsocketReconnectStrategy fromValue(int i13) {
        return INSTANCE.fromValue(i13);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }

    public static WebsocketReconnectStrategy valueOf(String str) {
        return (WebsocketReconnectStrategy) Enum.valueOf(WebsocketReconnectStrategy.class, str);
    }

    public static WebsocketReconnectStrategy[] values() {
        return (WebsocketReconnectStrategy[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.InterfaceC5594y
    public int getValue() {
        return this.value;
    }
}
