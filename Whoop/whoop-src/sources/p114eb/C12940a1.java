package p114eb;

import android.os.Bundle;
import live.hms.video.factories.MediaConstraintsFactory;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35846d;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.a1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12940a1 extends AbstractC12958g1 {

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ int f44706r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12940a1(boolean z4, int i13) {
        super(z4);
        this.f44706r = i13;
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: a */
    public final Object mo36411a(Bundle bundle, String str) {
        switch (this.f44706r) {
            case 0:
                return (Boolean) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
            case 1:
                Object objM31991j = AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                AbstractC22676k.m65748h(objM31991j, "null cannot be cast to non-null type kotlin.Float");
                return (Float) objM31991j;
            case 2:
                Object objM31991j2 = AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                AbstractC22676k.m65748h(objM31991j2, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objM31991j2;
            case 3:
                Object objM31991j3 = AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                AbstractC22676k.m65748h(objM31991j3, "null cannot be cast to non-null type kotlin.Long");
                return (Long) objM31991j3;
            case 4:
                Object objM31991j4 = AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
                AbstractC22676k.m65748h(objM31991j4, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) objM31991j4;
            default:
                return (String) AbstractC11895b.m31991j(bundle, "bundle", str, "key", str);
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        switch (this.f44706r) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            case 4:
                return "reference";
            default:
                return "string";
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: d */
    public final Object mo36413d(String value) {
        boolean z4;
        int i13;
        String strSubstring;
        long j7;
        int i14;
        switch (this.f44706r) {
            case 0:
                AbstractC22676k.m65750j(value, "value");
                if (value.equals(MediaConstraintsFactory.kValueTrue)) {
                    z4 = true;
                } else {
                    if (!value.equals(MediaConstraintsFactory.kValueFalse)) {
                        throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                    }
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 1:
                AbstractC22676k.m65750j(value, "value");
                return Float.valueOf(Float.parseFloat(value));
            case 2:
                AbstractC22676k.m65750j(value, "value");
                if (AbstractC39421y.m125930O(value, "0x", false)) {
                    String strSubstring2 = value.substring(2);
                    AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    i13 = Integer.parseInt(strSubstring2, 16);
                } else {
                    i13 = Integer.parseInt(value);
                }
                return Integer.valueOf(i13);
            case 3:
                AbstractC22676k.m65750j(value, "value");
                if (AbstractC39421y.m125920E(value, "L", false)) {
                    strSubstring = value.substring(0, value.length() - 1);
                    AbstractC22676k.m65749i(strSubstring, "substring(...)");
                } else {
                    strSubstring = value;
                }
                if (AbstractC39421y.m125930O(value, "0x", false)) {
                    String strSubstring3 = strSubstring.substring(2);
                    AbstractC22676k.m65749i(strSubstring3, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    j7 = Long.parseLong(strSubstring3, 16);
                } else {
                    j7 = Long.parseLong(strSubstring);
                }
                return Long.valueOf(j7);
            case 4:
                AbstractC22676k.m65750j(value, "value");
                if (AbstractC39421y.m125930O(value, "0x", false)) {
                    String strSubstring4 = value.substring(2);
                    AbstractC22676k.m65749i(strSubstring4, "substring(...)");
                    AbstractC35846d.m113779c(16);
                    i14 = Integer.parseInt(strSubstring4, 16);
                } else {
                    i14 = Integer.parseInt(value);
                }
                return Integer.valueOf(i14);
            default:
                AbstractC22676k.m65750j(value, "value");
                if (value.equals("null")) {
                    return null;
                }
                return value;
        }
    }

    @Override // p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: e */
    public final void mo36414e(Bundle bundle, String key, Object obj) {
        switch (this.f44706r) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC22676k.m65750j(key, "key");
                bundle.putBoolean(key, zBooleanValue);
                break;
            case 1:
                float fFloatValue = ((Number) obj).floatValue();
                AbstractC22676k.m65750j(key, "key");
                bundle.putFloat(key, fFloatValue);
                break;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                AbstractC22676k.m65750j(key, "key");
                bundle.putInt(key, iIntValue);
                break;
            case 3:
                long jLongValue = ((Number) obj).longValue();
                AbstractC22676k.m65750j(key, "key");
                bundle.putLong(key, jLongValue);
                break;
            case 4:
                int iIntValue2 = ((Number) obj).intValue();
                AbstractC22676k.m65750j(key, "key");
                bundle.putInt(key, iIntValue2);
                break;
            default:
                AbstractC22676k.m65750j(key, "key");
                bundle.putString(key, (String) obj);
                break;
        }
    }
}
