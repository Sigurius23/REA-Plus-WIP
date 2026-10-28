package bz;

import ge3.AbstractC15751g;
import t83.C33617b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bz.g[], still in use, count: 1, list:
  (r0v1 bz.g[]) from 0x0036: INVOKE (r0v1 bz.g[]) STATIC call: ge3.g.u(java.lang.Enum[]):t83.b A[MD:(java.lang.Enum[]):t83.b (m), WRAPPED]
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
/* JADX INFO: renamed from: bz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC3708g {
    /* JADX INFO: Fake field, exist only in values array */
    ReactNative("com.facebook.react.bridge.NativeModule", "react-native"),
    /* JADX INFO: Fake field, exist only in values array */
    Flutter("io.flutter.embedding.engine.FlutterEngine", "flutter"),
    /* JADX INFO: Fake field, exist only in values array */
    Cordova("org.apache.cordova.CordovaActivity", "cordova"),
    /* JADX INFO: Fake field, exist only in values array */
    Unity("com.unity3d.player.UnityPlayerActivity", "unity");


    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ C33617b f15159z;

    /* JADX INFO: renamed from: w */
    public final String f15160w;

    /* JADX INFO: renamed from: x */
    public final String f15161x;

    static {
        f15159z = AbstractC15751g.m44468u(enumC3708gArr);
    }

    public EnumC3708g(String str, String str2) {
        super(str, i);
        this.f15160w = str;
        this.f15161x = str2;
    }

    public static EnumC3708g valueOf(String str) {
        return (EnumC3708g) Enum.valueOf(EnumC3708g.class, str);
    }

    public static EnumC3708g[] values() {
        return (EnumC3708g[]) f15158y.clone();
    }
}
