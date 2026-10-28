package p137f5;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.health.platform.client.proto.C1533u;
import com.iterable.iterableapi.C5327g1;
import java.util.Locale;

/* JADX INFO: renamed from: f5.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C14083b {

    /* JADX INFO: renamed from: b */
    public static final String f50607b;

    /* JADX INFO: renamed from: c */
    public static final String f50608c;

    /* JADX INFO: renamed from: d */
    public static final C14083b f50609d;

    /* JADX INFO: renamed from: e */
    public static final C14083b f50610e;

    /* JADX INFO: renamed from: a */
    public final boolean f50611a;

    static {
        C5327g1 c5327g1 = AbstractC14087f.f50619c;
        f50607b = Character.toString((char) 8206);
        f50608c = Character.toString((char) 8207);
        f50609d = new C14083b(false);
        f50610e = new C14083b(true);
    }

    public C14083b(boolean z4) {
        C5327g1 c5327g1 = AbstractC14087f.f50617a;
        this.f50611a = z4;
    }

    /* JADX INFO: renamed from: a */
    public static int m40114a(CharSequence charSequence) {
        byte directionality;
        C14082a c14082a = new C14082a(charSequence);
        c14082a.f50605c = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = c14082a.f50605c;
            if (i16 < c14082a.f50604b && i13 == 0) {
                CharSequence charSequence2 = c14082a.f50603a;
                char cCharAt = charSequence2.charAt(i16);
                c14082a.f50606d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c14082a.f50605c);
                    c14082a.f50605c = Character.charCount(iCodePointAt) + c14082a.f50605c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c14082a.f50605c++;
                    char c3 = c14082a.f50606d;
                    directionality = c3 < 1792 ? C14082a.f50602e[c3] : Character.getDirectionality(c3);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i15 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i15++;
                                i14 = -1;
                                continue;
                            case 16:
                            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                i15++;
                                i14 = 1;
                                continue;
                            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                i15--;
                                i14 = 0;
                                continue;
                        }
                    }
                } else if (i15 == 0) {
                    return -1;
                }
                i13 = i15;
            }
        }
        if (i13 != 0) {
            if (i14 == 0) {
                while (c14082a.f50605c > 0) {
                    switch (c14082a.m40113a()) {
                        case 14:
                        case 15:
                            if (i13 == i15) {
                                return -1;
                            }
                            i15--;
                            break;
                        case 16:
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            if (i13 == i15) {
                                return 1;
                            }
                            i15--;
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            i15++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i14;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m40115b(CharSequence charSequence) {
        C14082a c14082a = new C14082a(charSequence);
        c14082a.f50605c = c14082a.f50604b;
        int i13 = 0;
        while (true) {
            int i14 = i13;
            while (c14082a.f50605c > 0) {
                byte bM40113a = c14082a.m40113a();
                if (bM40113a == 0) {
                    if (i13 == 0) {
                        return -1;
                    }
                    if (i14 == 0) {
                    }
                } else if (bM40113a == 1 || bM40113a == 2) {
                    if (i13 == 0) {
                        return 1;
                    }
                    if (i14 == 0) {
                    }
                } else if (bM40113a != 9) {
                    switch (bM40113a) {
                        case 14:
                        case 15:
                            if (i14 == i13) {
                                return -1;
                            }
                            i13--;
                            break;
                        case 16:
                        case C1533u.MAX_FIELD_NUMBER /* 17 */:
                            if (i14 == i13) {
                                return 1;
                            }
                            i13--;
                            break;
                        case C1533u.AVG_FIELD_NUMBER /* 18 */:
                            i13++;
                            break;
                        default:
                            if (i14 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C14083b m40116c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? f50610e : f50609d;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m40117d(CharSequence charSequence) {
        String str;
        C5327g1 c5327g1 = AbstractC14087f.f50619c;
        if (charSequence == null) {
            return null;
        }
        boolean zM16444f = c5327g1.m16444f(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zM16444f2 = (zM16444f ? AbstractC14087f.f50618b : AbstractC14087f.f50617a).m16444f(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = f50608c;
        String str4 = f50607b;
        boolean z4 = this.f50611a;
        if (z4 || !(zM16444f2 || m40114a(charSequence) == 1)) {
            str = (!z4 || (zM16444f2 && m40114a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zM16444f != z4) {
            spannableStringBuilder.append(zM16444f ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zM16444f3 = (zM16444f ? AbstractC14087f.f50618b : AbstractC14087f.f50617a).m16444f(charSequence.length(), charSequence);
        if (!z4 && (zM16444f3 || m40115b(charSequence) == 1)) {
            str2 = str4;
        } else if (z4 && (!zM16444f3 || m40115b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
