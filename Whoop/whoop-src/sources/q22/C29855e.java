package q22;

import com.whoop.domain.model.User;
import com.whoop.service.network.model.UserState;
import i93.C18284j;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.AbstractC21478l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import or2.AbstractC28188o1;
import org.joda.time.DateTimeFieldType;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: q22.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010 \u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b%\u0010&J/\u0010'\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010$\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*¨\u0006+"}, m65681d2 = {"Lq22/e;", "", "Lzr2/a;", "dateTimeProvider", "Lcom/whoop/domain/model/User;", UserState.Sources.USER, "<init>", "(Lzr2/a;Lcom/whoop/domain/model/User;)V", "", "cardNumber", "", "isCardInputFfEnabled", "Lq22/i;", "e", "(Ljava/lang/String;Z)Lq22/i;", "expiration", "g", "(Ljava/lang/String;)Lq22/i;", "cvv", "f", "zip", "j", "", "Lq22/f;", "fields", "a", "(Ljava/util/List;)Z", "Lq22/h;", "fieldType", "currentState", "value", "reduceValidationRequirements", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq22/h;Lq22/i;Ljava/lang/String;ZZ)Lq22/i;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "newValue", "c", "(Lq22/h;Ljava/lang/String;Z)Z", "d", "(Lq22/h;Lq22/i;Ljava/lang/String;Z)Z", "Lzr2/a;", "Lcom/whoop/domain/model/User;", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29855e {

    /* JADX INFO: renamed from: d */
    public static final int f122028d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC41070a dateTimeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final User user;

    /* JADX INFO: renamed from: q22.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f122031a;

        static {
            int[] iArr = new int[EnumC29858h.values().length];
            try {
                iArr[EnumC29858h.CARD_CVV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29858h.CARD_EXPIRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC29858h.CARD_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC29858h.CARD_ZIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f122031a = iArr;
        }
    }

    public C29855e(InterfaceC41070a dateTimeProvider, User user) {
        AbstractC22676k.m65750j(dateTimeProvider, "dateTimeProvider");
        this.dateTimeProvider = dateTimeProvider;
        this.user = user;
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC29859i m91476e(String cardNumber, boolean isCardInputFfEnabled) {
        if (cardNumber.length() < (isCardInputFfEnabled ? 15 : 13)) {
            return AbstractC29859i.a.f122035a;
        }
        int length = cardNumber.length() - 1;
        int iM60400F = AbstractC21478l0.m60400F(length, 0, -2);
        int iCharAt = 0;
        if (iM60400F <= length) {
            while (true) {
                iCharAt += cardNumber.charAt(length) - '0';
                if (length == iM60400F) {
                    break;
                }
                length -= 2;
            }
        }
        int length2 = cardNumber.length() - 2;
        int iM60400F2 = AbstractC21478l0.m60400F(length2, 0, -2);
        if (iM60400F2 <= length2) {
            while (true) {
                int iCharAt2 = (cardNumber.charAt(length2) - '0') * 2;
                if (iCharAt2 > 9) {
                    iCharAt2 -= 9;
                }
                iCharAt += iCharAt2;
                if (length2 == iM60400F2) {
                    break;
                }
                length2 -= 2;
            }
        }
        return iCharAt % 10 == 0 ? AbstractC29859i.c.f122037a : AbstractC29859i.a.f122035a;
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC29859i m91477f(String cvv) {
        return cvv.length() >= 3 ? AbstractC29859i.c.f122037a : AbstractC29859i.a.f122035a;
    }

    /* JADX INFO: renamed from: g */
    private final AbstractC29859i m91478g(String expiration) {
        int i13 = this.dateTimeProvider.mo133365d().get(DateTimeFieldType.year()) % 100;
        int i14 = this.dateTimeProvider.mo133365d().get(DateTimeFieldType.monthOfYear());
        if (expiration.length() != 4) {
            return AbstractC29859i.a.f122035a;
        }
        int i15 = Integer.parseInt(AbstractC39414r.m125857C0(expiration, new C18284j(0, 1, 1)));
        int i16 = Integer.parseInt(AbstractC39414r.m125857C0(expiration, new C18284j(2, 3, 1)));
        return ((i16 > i13 || (i14 <= i15 && i15 < 13 && i16 >= i13)) && i15 <= 12) ? AbstractC29859i.c.f122037a : AbstractC29859i.a.f122035a;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ AbstractC29859i m91479i(C29855e c29855e, EnumC29858h enumC29858h, AbstractC29859i abstractC29859i, String str, boolean z4, boolean z13, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            z4 = false;
        }
        return c29855e.m91485h(enumC29858h, abstractC29859i, str, z4, z13);
    }

    /* JADX INFO: renamed from: j */
    private final AbstractC29859i m91480j(String zip) {
        if (AbstractC39414r.m125890i0(zip)) {
            User user = this.user;
            if (!AbstractC22676k.m65745e(user != null ? user.getCountry() : null, "AE")) {
                return AbstractC29859i.a.f122035a;
            }
        }
        return AbstractC29859i.c.f122037a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m91481a(List<C29856f> fields) {
        AbstractC22676k.m65750j(fields, "fields");
        User user = this.user;
        if (!AbstractC22676k.m65745e(user != null ? user.getCountry() : null, "AE")) {
            List<C29856f> list = fields;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!(((C29856f) it.next()).getState() instanceof AbstractC29859i.c)) {
                    return false;
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((C29856f) obj).getType() != EnumC29858h.CARD_ZIP) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            if (!(((C29856f) it3.next()).getState() instanceof AbstractC29859i.c)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final String m91482b(String value) {
        AbstractC22676k.m65750j(value, "value");
        Pattern patternCompile = Pattern.compile("\\D");
        AbstractC22676k.m65749i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(value).replaceAll("");
        AbstractC22676k.m65749i(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m91483c(EnumC29858h fieldType, String newValue, boolean reduceValidationRequirements) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(newValue, "newValue");
        if (reduceValidationRequirements && AbstractC28188o1.m85314d(newValue)) {
            return true;
        }
        int i13 = b.f122031a[fieldType.ordinal()];
        if (i13 == 1) {
            return newValue.length() >= 3;
        }
        if (i13 == 2) {
            return newValue.length() == 4;
        }
        if (i13 == 3) {
            return newValue.length() == 16;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (newValue.length() <= 0) {
            User user = this.user;
            if (!AbstractC22676k.m65745e(user != null ? user.getCountry() : null, "AE")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m91484d(EnumC29858h fieldType, AbstractC29859i currentState, String newValue, boolean reduceValidationRequirements) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(newValue, "newValue");
        if (reduceValidationRequirements && AbstractC28188o1.m85314d(newValue)) {
            return true;
        }
        int i13 = b.f122031a[fieldType.ordinal()];
        if (i13 == 1) {
            boolean z4 = currentState instanceof AbstractC29859i.b;
            return (z4 && newValue.length() >= 3) || !z4;
        }
        if (i13 == 2) {
            boolean z13 = currentState instanceof AbstractC29859i.b;
            return (z13 && newValue.length() == 4) || !z13;
        }
        if (i13 == 3) {
            boolean z14 = currentState instanceof AbstractC29859i.b;
            return (z14 && newValue.length() >= 13) || !z14;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z15 = currentState instanceof AbstractC29859i.b;
        if ((!z15 || newValue.length() <= 0) && z15) {
            User user = this.user;
            if (!AbstractC22676k.m65745e(user != null ? user.getCountry() : null, "AE")) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC29859i m91485h(EnumC29858h fieldType, AbstractC29859i currentState, String value, boolean reduceValidationRequirements, boolean isCardInputFfEnabled) {
        AbstractC22676k.m65750j(fieldType, "fieldType");
        AbstractC22676k.m65750j(currentState, "currentState");
        AbstractC22676k.m65750j(value, "value");
        if (!(isCardInputFfEnabled ? m91483c(fieldType, value, reduceValidationRequirements) : m91484d(fieldType, currentState, value, reduceValidationRequirements))) {
            return AbstractC29859i.b.f122036a;
        }
        int i13 = b.f122031a[fieldType.ordinal()];
        if (i13 == 1) {
            return m91477f(value);
        }
        if (i13 == 2) {
            return m91478g(value);
        }
        if (i13 == 3) {
            return m91476e(value, isCardInputFfEnabled);
        }
        if (i13 == 4) {
            return m91480j(value);
        }
        throw new NoWhenBranchMatchedException();
    }
}
