package aa2;

import com.whoop.domain.model.Gender;
import java.util.Locale;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: aa2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Laa2/b;", "", "<init>", "()V", "Lcom/whoop/domain/model/Gender;", "gender", "", "a", "(Lcom/whoop/domain/model/Gender;)Ljava/lang/String;", "b", "(Ljava/lang/String;)Lcom/whoop/domain/model/Gender;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0593b {
    /* JADX INFO: renamed from: a */
    public final String m1549a(Gender gender) {
        AbstractC22676k.m65750j(gender, "gender");
        String upperCase = gender.getValue().toUpperCase(Locale.ROOT);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: renamed from: b */
    public final Gender m1550b(String gender) {
        AbstractC22676k.m65750j(gender, "gender");
        Gender gender2 = Gender.MALE;
        String value = gender2.getValue();
        Locale locale = Locale.ROOT;
        String upperCase = value.toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
        if (gender.equals(upperCase)) {
            return gender2;
        }
        Gender gender3 = Gender.FEMALE;
        String upperCase2 = gender3.getValue().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase2, "toUpperCase(...)");
        if (gender.equals(upperCase2)) {
            return gender3;
        }
        Gender gender4 = Gender.NON_BINARY;
        String upperCase3 = gender4.getValue().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase3, "toUpperCase(...)");
        if (gender.equals(upperCase3)) {
            return gender4;
        }
        Gender gender5 = Gender.PREFER_NOT_TO_SAY;
        String upperCase4 = gender5.getValue().toUpperCase(locale);
        AbstractC22676k.m65749i(upperCase4, "toUpperCase(...)");
        if (gender.equals(upperCase4)) {
            return gender5;
        }
        throw new IllegalArgumentException(AbstractC11895b.m31996o("Can't convert ", gender, " to a Gender value"));
    }
}
