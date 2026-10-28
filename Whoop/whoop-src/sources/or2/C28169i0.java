package or2;

import com.fatboyindustrial.gsonjodatime.AbstractC4968a;
import com.fatboyindustrial.gsonjodatime.DateMidnightConverter;
import com.fatboyindustrial.gsonjodatime.DateTimeConverter;
import com.fatboyindustrial.gsonjodatime.DateTimeZoneConverter;
import com.fatboyindustrial.gsonjodatime.DurationConverter;
import com.fatboyindustrial.gsonjodatime.InstantConverter;
import com.fatboyindustrial.gsonjodatime.IntervalConverter;
import com.fatboyindustrial.gsonjodatime.LocalDateConverter;
import com.fatboyindustrial.gsonjodatime.LocalDateTimeConverter;
import com.fatboyindustrial.gsonjodatime.LocalTimeConverter;
import com.fatboyindustrial.gsonjodatime.PeriodConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;
import l83.InterfaceC23457c;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: or2.i0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u0006¨\u0006\u001e"}, m65681d2 = {"Lor2/i0;", "", "<init>", "()V", "Lcom/google/gson/Gson;", "d", "()Lcom/google/gson/Gson;", "any", "", "i", "(Ljava/lang/Object;)Ljava/lang/String;", "T", "json", "Ljava/lang/Class;", "cls", "e", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "Ljava/lang/reflect/Type;", "type", "f", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "timeFormat", "", "serializeNulls", "Lcom/google/gson/GsonBuilder;", "b", "(Ljava/lang/String;Z)Lcom/google/gson/GsonBuilder;", "Ll83/h;", "g", "gson", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public final class C28169i0 {

    /* JADX INFO: renamed from: a */
    public static final C28169i0 f113888a = new C28169i0();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final InterfaceC23462h gson = AbstractC30060g.m92088H(new C25371a(12));

    private C28169i0() {
    }

    /* JADX INFO: renamed from: b */
    public static final GsonBuilder m85272b(String timeFormat, boolean serializeNulls) {
        AbstractC22676k.m65750j(timeFormat, "timeFormat");
        GsonBuilder dateFormat = new GsonBuilder().setDateFormat(timeFormat);
        if (serializeNulls) {
            dateFormat.serializeNulls();
        }
        if (dateFormat == null) {
            Type type = AbstractC4968a.f20349a;
            throw new NullPointerException("builder cannot be null");
        }
        dateFormat.registerTypeAdapter(AbstractC4968a.f20349a, new DateMidnightConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20350b, new DateTimeConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20355g, new DurationConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20351c, new LocalDateConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20352d, new LocalDateTimeConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20353e, new LocalTimeConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20354f, new IntervalConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20356h, new PeriodConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20357i, new InstantConverter());
        dateFormat.registerTypeAdapter(AbstractC4968a.f20358j, new DateTimeZoneConverter());
        return dateFormat;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ GsonBuilder m85273c(String str, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
        }
        if ((i13 & 2) != 0) {
            z4 = false;
        }
        return m85272b(str, z4);
    }

    /* JADX INFO: renamed from: d */
    public static final Gson m85274d() {
        return f113888a.m85279g();
    }

    /* JADX INFO: renamed from: e */
    public static final <T> T m85275e(String json, Class<T> cls) {
        AbstractC22676k.m65750j(cls, "cls");
        return (T) f113888a.m85279g().fromJson(json, (Class) cls);
    }

    /* JADX INFO: renamed from: f */
    public static final <T> T m85276f(String json, Type type) {
        AbstractC22676k.m65750j(type, "type");
        return (T) f113888a.m85279g().fromJson(json, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final Gson m85277h() {
        return m85273c(null, false, 3, null).create();
    }

    /* JADX INFO: renamed from: i */
    public static final String m85278i(Object any) {
        String json = f113888a.m85279g().toJson(any);
        AbstractC22676k.m65749i(json, "toJson(...)");
        return json;
    }

    /* JADX INFO: renamed from: g */
    public final Gson m85279g() {
        Object value = gson.getValue();
        AbstractC22676k.m65749i(value, "getValue(...)");
        return (Gson) value;
    }
}
