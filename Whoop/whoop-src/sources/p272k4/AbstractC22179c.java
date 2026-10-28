package p272k4;

import java.util.HashMap;
import p108e4.C12685s;
import p242j4.C21307g;
import p242j4.EnumC21309i;

/* JADX INFO: renamed from: k4.c */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22179c extends C21307g {

    /* JADX INFO: renamed from: n0 */
    public float f86005n0;

    /* JADX INFO: renamed from: o0 */
    public final HashMap f86006o0;

    /* JADX INFO: renamed from: p0 */
    public final HashMap f86007p0;

    /* JADX INFO: renamed from: q0 */
    public final HashMap f86008q0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f86009r0;

    /* JADX INFO: renamed from: s0 */
    public HashMap f86010s0;

    /* JADX INFO: renamed from: t0 */
    public EnumC21309i f86011t0;

    public AbstractC22179c(C12685s c12685s, int i13) {
        super(c12685s, i13);
        this.f86005n0 = 0.5f;
        this.f86006o0 = new HashMap();
        this.f86007p0 = new HashMap();
        this.f86008q0 = new HashMap();
        this.f86011t0 = EnumC21309i.f81474w;
    }

    /* JADX INFO: renamed from: t */
    public final void m63486t(String str, float f13, float f14, float f15, float f16, float f17) {
        m59829q(str);
        String string = str.toString();
        if (!Float.isNaN(f13)) {
            this.f86006o0.put(string, Float.valueOf(f13));
        }
        if (!Float.isNaN(f14)) {
            this.f86007p0.put(string, Float.valueOf(f14));
        }
        if (!Float.isNaN(f15)) {
            this.f86008q0.put(string, Float.valueOf(f15));
        }
        if (!Float.isNaN(f16)) {
            if (this.f86009r0 == null) {
                this.f86009r0 = new HashMap();
            }
            this.f86009r0.put(string, Float.valueOf(f16));
        }
        if (Float.isNaN(f17)) {
            return;
        }
        if (this.f86010s0 == null) {
            this.f86010s0 = new HashMap();
        }
        this.f86010s0.put(string, Float.valueOf(f17));
    }

    /* JADX INFO: renamed from: u */
    public final void m63487u(float f13) {
        this.f86005n0 = f13;
    }

    /* JADX INFO: renamed from: v */
    public final float m63488v(String str) {
        HashMap map = this.f86010s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f86010s0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: w */
    public final float m63489w(String str) {
        HashMap map = this.f86008q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public final float m63490x(String str) {
        HashMap map = this.f86009r0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f86009r0.get(str)).floatValue();
    }

    /* JADX INFO: renamed from: y */
    public final float m63491y(String str) {
        HashMap map = this.f86007p0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: z */
    public final void m63492z(EnumC21309i enumC21309i) {
        this.f86011t0 = enumC21309i;
    }
}
