package w71;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w71.i0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lw71/i0;", "", "<init>", "()V", "callback", "Lw71/k0;", "stateWrite", "a", "(Ljava/lang/Object;Lw71/k0;)Ljava/lang/Object;", "design_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36888i0 {

    /* JADX INFO: renamed from: a */
    public static final C36888i0 f157800a = new C36888i0();

    private C36888i0() {
    }

    /* JADX INFO: renamed from: a */
    public final Object m118359a(Object callback, C36892k0 stateWrite) {
        AbstractC22676k.m65750j(callback, "callback");
        if (stateWrite == null) {
            return callback;
        }
        if (callback instanceof AbstractC36877d.e) {
            return AbstractC36890j0.m118361b(stateWrite, ((AbstractC36877d.e) callback).getIsChecked());
        }
        if (callback instanceof AbstractC36877d.k) {
            return AbstractC36890j0.m118361b(stateWrite, AbstractC22676k.m65745e(((AbstractC36877d.k) callback).getBoolean(), Boolean.TRUE));
        }
        if (callback instanceof AbstractC36877d.j) {
            return AbstractC36890j0.m118361b(stateWrite, AbstractC22676k.m65745e(((AbstractC36877d.j) callback).getBoolean(), Boolean.TRUE));
        }
        if (callback instanceof AbstractC36877d.a) {
            Integer number = ((AbstractC36877d.a) callback).getNumber();
            return AbstractC36890j0.m118366g(stateWrite, null, number != null ? Double.valueOf(number.intValue()) : stateWrite.getMagnitudeInputValue(), null, 5, null);
        }
        if (callback instanceof AbstractC36877d.c) {
            Integer number2 = ((AbstractC36877d.c) callback).getNumber();
            return AbstractC36890j0.m118366g(stateWrite, null, number2 != null ? Double.valueOf(number2.intValue()) : stateWrite.getMagnitudeInputValue(), null, 5, null);
        }
        if (!(callback instanceof AbstractC36877d.i)) {
            return callback;
        }
        Long time = ((AbstractC36877d.i) callback).getTime();
        if (time == null) {
            time = stateWrite.getTimeInputValue();
        }
        return AbstractC36890j0.m118366g(stateWrite, null, null, time, 3, null);
    }
}
