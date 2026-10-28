package rw;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import p031b9.AbstractC2875y;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p440qw.AbstractC30673h;
import p440qw.InterfaceC30680o;
import p488sw.AbstractC33043a;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: rw.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31852b extends AbstractC28430z {

    /* JADX INFO: renamed from: d */
    public static final C31851a f132106d = new C31851a(0);

    /* JADX INFO: renamed from: e */
    public static final C31851a f132107e = new C31851a(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132108a;

    /* JADX INFO: renamed from: b */
    public final Object f132109b;

    /* JADX INFO: renamed from: c */
    public final Object f132110c;

    public /* synthetic */ C31852b(int i13, Object obj, Object obj2) {
        this.f132108a = i13;
        this.f132110c = obj;
        this.f132109b = obj2;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        Date dateM104582b;
        switch (this.f132108a) {
            case 0:
                Class cls = (Class) this.f132109b;
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                c37653a.beginArray();
                while (c37653a.hasNext()) {
                    arrayList.add(((AbstractC28430z) ((C31856f) this.f132110c).f132118c).mo86132b(c37653a));
                }
                c37653a.endArray();
                int size = arrayList.size();
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
                }
                Object objNewInstance = Array.newInstance((Class<?>) cls, size);
                for (int i13 = 0; i13 < size; i13++) {
                    Array.set(objNewInstance, i13, arrayList.get(i13));
                }
                return objNewInstance;
            case 1:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                String strNextString = c37653a.nextString();
                synchronized (((ArrayList) this.f132110c)) {
                    try {
                        for (DateFormat dateFormat : (ArrayList) this.f132110c) {
                            TimeZone timeZone = dateFormat.getTimeZone();
                            try {
                                try {
                                    dateM104582b = dateFormat.parse(strNextString);
                                    dateFormat.setTimeZone(timeZone);
                                } catch (Throwable th3) {
                                    dateFormat.setTimeZone(timeZone);
                                    throw th3;
                                }
                            } catch (ParseException unused) {
                                dateFormat.setTimeZone(timeZone);
                            }
                        }
                        try {
                            dateM104582b = AbstractC33043a.m104582b(strNextString, new ParsePosition(0));
                        } catch (ParseException e5) {
                            StringBuilder sbM53375p = AbstractC18489d0.m53375p("Failed parsing '", strNextString, "' as Date; at path ");
                            sbM53375p.append(c37653a.m121060k(true));
                            throw new JsonSyntaxException(sbM53375p.toString(), e5);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return ((AbstractC31855e) this.f132109b).mo99043a(dateM104582b);
            case 2:
                if (c37653a.m121062o0() == 9) {
                    c37653a.m121053T();
                    return null;
                }
                Collection collection = (Collection) ((InterfaceC30680o) this.f132109b).construct();
                c37653a.beginArray();
                while (c37653a.hasNext()) {
                    collection.add(((AbstractC28430z) ((C31856f) this.f132110c).f132118c).mo86132b(c37653a));
                }
                c37653a.endArray();
                return collection;
            default:
                Class cls2 = (Class) this.f132109b;
                Object objMo86132b = ((AbstractC28430z) ((C31867q) this.f132110c).f132154y).mo86132b(c37653a);
                if (objMo86132b == null || cls2.isInstance(objMo86132b)) {
                    return objMo86132b;
                }
                throw new JsonSyntaxException("Expected a " + cls2.getName() + " but was " + objMo86132b.getClass().getName() + "; at path " + c37653a.m121060k(true));
        }
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        String str;
        switch (this.f132108a) {
            case 0:
                if (obj == null) {
                    c37654b.m121076m();
                    return;
                }
                c37654b.beginArray();
                int length = Array.getLength(obj);
                for (int i13 = 0; i13 < length; i13++) {
                    ((C31856f) this.f132110c).mo86133c(c37654b, Array.get(obj, i13));
                }
                c37654b.endArray();
                return;
            case 1:
                Date date = (Date) obj;
                if (date == null) {
                    c37654b.m121076m();
                    return;
                }
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f132110c).get(0);
                synchronized (((ArrayList) this.f132110c)) {
                    str = dateFormat.format(date);
                    break;
                }
                c37654b.m121078p0(str);
                return;
            case 2:
                Collection collection = (Collection) obj;
                if (collection == null) {
                    c37654b.m121076m();
                    return;
                }
                c37654b.beginArray();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ((C31856f) this.f132110c).mo86133c(c37654b, it.next());
                }
                c37654b.endArray();
                return;
            default:
                ((AbstractC28430z) ((C31867q) this.f132110c).f132154y).mo86133c(c37654b, obj);
                return;
        }
    }

    public String toString() {
        switch (this.f132108a) {
            case 1:
                DateFormat dateFormat = (DateFormat) ((ArrayList) this.f132110c).get(0);
                if (dateFormat instanceof SimpleDateFormat) {
                    return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
                }
                return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
            default:
                return super.toString();
        }
    }

    public C31852b(C28417m c28417m, AbstractC28430z abstractC28430z, Class cls) {
        this.f132108a = 0;
        this.f132110c = new C31856f(c28417m, abstractC28430z, cls);
        this.f132109b = cls;
    }

    public C31852b(AbstractC31855e abstractC31855e, int i13, int i14) {
        String str;
        String str2;
        this.f132108a = 1;
        ArrayList arrayList = new ArrayList();
        this.f132110c = arrayList;
        Objects.requireNonNull(abstractC31855e);
        this.f132109b = abstractC31855e;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i13, i14, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i13, i14));
        }
        if (AbstractC30673h.f126217a >= 9) {
            StringBuilder sb4 = new StringBuilder();
            if (i13 == 0) {
                str = "EEEE, MMMM d, yyyy";
            } else if (i13 == 1) {
                str = "MMMM d, yyyy";
            } else if (i13 == 2) {
                str = "MMM d, yyyy";
            } else if (i13 == 3) {
                str = "M/d/yy";
            } else {
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Unknown DateFormat style: "));
            }
            sb4.append(str);
            sb4.append(" ");
            if (i14 == 0 || i14 == 1) {
                str2 = "h:mm:ss a z";
            } else if (i14 == 2) {
                str2 = "h:mm:ss a";
            } else if (i14 == 3) {
                str2 = DefaultDateFormatter.TIME_FORMAT_12H;
            } else {
                throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "Unknown DateFormat style: "));
            }
            sb4.append(str2);
            arrayList.add(new SimpleDateFormat(sb4.toString(), locale));
        }
    }
}
