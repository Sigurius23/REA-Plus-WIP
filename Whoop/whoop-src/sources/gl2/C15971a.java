package gl2;

import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Map;
import jl2.EnumC21774a;
import l83.C23465k;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.EnumC33227v1;

/* JADX INFO: renamed from: gl2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJU\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0016J-\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u0012¢\u0006\u0004\b!\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"¨\u0006#"}, m65681d2 = {"Lgl2/a;", "", "Lfi0/a;", "analytics", "<init>", "(Lfi0/a;)V", "Lsz0/v1;", "zoneValueType", "", "id", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lsz0/v1;Ljava/lang/String;)Ljava/lang/String;", "eventName", "category", "action", "label", "", "otherProperties", "Ll83/a0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "a", "()V", "i", "j", "value", "", "outOfRange", "c", "(Lsz0/v1;Ljava/lang/String;Ljava/lang/String;Z)V", "g", "(Ljava/lang/String;)V", "b", "f", "Lfi0/a;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C15971a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: gl2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f60460a;

        static {
            int[] iArr = new int[EnumC33227v1.values().length];
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC33227v1.MANUAL_ZONE_MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60460a = iArr;
        }
    }

    public C15971a(InterfaceC14515a analytics) {
        AbstractC22676k.m65750j(analytics, "analytics");
        this.analytics = analytics;
    }

    /* JADX INFO: renamed from: d */
    private final void m45110d(String eventName, String category, String action, String label, Map<String, ? extends Object> otherProperties) {
        this.analytics.mo41428k(category, action, label, eventName, otherProperties);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m45111e(C15971a c15971a, String str, String str2, String str3, String str4, Map map, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        if ((i13 & 4) != 0) {
            str3 = null;
        }
        if ((i13 & 8) != 0) {
            str4 = null;
        }
        if ((i13 & 16) != 0) {
            map = null;
        }
        c15971a.m45110d(str, str2, str3, str4, map);
    }

    /* JADX INFO: renamed from: h */
    private final String m45112h(EnumC33227v1 zoneValueType, String id4) {
        int i13 = a.f60460a[zoneValueType.ordinal()];
        EnumC21774a enumC21774a = null;
        int i14 = 0;
        if (i13 == 1) {
            EnumC21774a enumC21774a2 = EnumC21774a.ZONE_1;
            EnumC21774a[] enumC21774aArrValues = EnumC21774a.values();
            int length = enumC21774aArrValues.length;
            while (i14 < length) {
                EnumC21774a enumC21774a3 = enumC21774aArrValues[i14];
                if (AbstractC22676k.m65745e(enumC21774a3.name(), id4)) {
                    enumC21774a = enumC21774a3;
                    break;
                }
                i14++;
            }
            if (enumC21774a != null) {
                enumC21774a2 = enumC21774a;
            }
            return AbstractC15972b.m45121b(enumC21774a2);
        }
        if (i13 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        EnumC21774a enumC21774a4 = EnumC21774a.ZONE_1;
        EnumC21774a[] enumC21774aArrValues2 = EnumC21774a.values();
        int length2 = enumC21774aArrValues2.length;
        while (i14 < length2) {
            EnumC21774a enumC21774a5 = enumC21774aArrValues2[i14];
            if (AbstractC22676k.m65745e(enumC21774a5.name(), id4)) {
                enumC21774a = enumC21774a5;
                break;
            }
            i14++;
        }
        if (enumC21774a != null) {
            enumC21774a4 = enumC21774a;
        }
        return AbstractC15972b.m45120a(enumC21774a4);
    }

    /* JADX INFO: renamed from: a */
    public final void m45113a() {
        m45111e(this, "Heart Rate Settings", "max_hr", null, "error", null, 20, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m45114b(String label) {
        AbstractC22676k.m65750j(label, "label");
        m45111e(this, "Heart Rate Settings", null, "tapped_information_icon", label, null, 18, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m45115c(EnumC33227v1 zoneValueType, String id4, String value, boolean outOfRange) {
        AbstractC22676k.m65750j(zoneValueType, "zoneValueType");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(value, "value");
        m45110d("Heart Rate Settings", "hr_zones", "customize_zone", m45112h(zoneValueType, id4), AbstractC25247g0.m73990Y(new C23465k("value", value), new C23465k("out_of_range", Boolean.valueOf(outOfRange))));
    }

    /* JADX INFO: renamed from: f */
    public final void m45116f() {
        this.analytics.mo41425g("HrSettingsScreen");
    }

    /* JADX INFO: renamed from: g */
    public final void m45117g(String label) {
        AbstractC22676k.m65750j(label, "label");
        m45111e(this, "Heart Rate Settings", "hr_zones", null, label, null, 20, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m45118i() {
        m45111e(this, "Heart Rate Settings", "hr_zones", "default_off", null, null, 24, null);
    }

    /* JADX INFO: renamed from: j */
    public final void m45119j() {
        m45111e(this, "Heart Rate Settings", "hr_zones", "default_on", null, null, 24, null);
    }
}
