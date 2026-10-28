package p087db;

import android.content.res.Resources;
import android.text.TextUtils;
import com.whoop.android.R;
import java.util.Locale;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C11849g implements InterfaceC11874s0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38673a;

    /* JADX INFO: renamed from: b */
    public final Resources f38674b;

    public C11849g(Resources resources, int i13) {
        this.f38673a = i13;
        switch (i13) {
            case 1:
                resources.getClass();
                this.f38674b = resources;
                break;
            default:
                resources.getClass();
                this.f38674b = resources;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX INFO: renamed from: a */
    public String m31804a(C31521c0 c31521c0) {
        String displayName;
        String str = c31521c0.f130100y;
        String str2 = c31521c0.f130099x;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            int i13 = AbstractC24567y.f95875a;
            Locale localeForLanguageTag = i13 >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
            Locale locale = i13 >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    String strValueOf = String.valueOf(displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale));
                    String strValueOf2 = String.valueOf(displayName.substring(iOffsetByCodePoints));
                    displayName = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM31809f = m31809f(displayName, m31806c(c31521c0));
        if (!TextUtils.isEmpty(strM31809f)) {
            return strM31809f;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX INFO: renamed from: b */
    public String m31805b(C34610p c34610p) {
        String displayName;
        String str = c34610p.f145773d;
        String str2 = c34610p.f145771b;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            displayName = "";
        } else {
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            Locale locale = AbstractC38065t.f163031a >= 24 ? Locale.getDefault(Locale.Category.DISPLAY) : Locale.getDefault();
            displayName = localeForLanguageTag.getDisplayName(locale);
            if (TextUtils.isEmpty(displayName)) {
                displayName = "";
            } else {
                try {
                    int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
                    displayName = displayName.substring(0, iOffsetByCodePoints).toUpperCase(locale) + displayName.substring(iOffsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
            }
        }
        String strM31809f = m31809f(displayName, m31807d(c34610p));
        if (!TextUtils.isEmpty(strM31809f)) {
            return strM31809f;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public String m31806c(C31521c0 c31521c0) {
        int i13 = c31521c0.f130070E;
        int i14 = i13 & 2;
        Resources resources = this.f38674b;
        String string = i14 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i13 & 4) != 0) {
            string = m31809f(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i13 & 8) != 0) {
            string = m31809f(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i13 & 1088) != 0 ? m31809f(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX INFO: renamed from: d */
    public String m31807d(C34610p c34610p) {
        int i13 = c34610p.f145775f;
        int i14 = c34610p.f145775f;
        int i15 = i13 & 2;
        Resources resources = this.f38674b;
        String string = i15 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i14 & 4) != 0) {
            string = m31809f(string, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i14 & 8) != 0) {
            string = m31809f(string, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i14 & 1088) != 0 ? m31809f(string, resources.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: e */
    public String m31808e(C34610p c34610p) {
        String strM31805b;
        String string;
        String str = c34610p.f145783n;
        int i13 = c34610p.f145779j;
        int i14 = c34610p.f145759D;
        int i15 = c34610p.f145791v;
        int i16 = c34610p.f145790u;
        String str2 = c34610p.f145780k;
        int iM109376i = AbstractC34587d0.m109376i(str);
        if (iM109376i == -1) {
            if (AbstractC34587d0.m109377j(str2) != null) {
                iM109376i = 2;
            } else if (AbstractC34587d0.m109370c(str2) != null) {
                iM109376i = 1;
            } else if (i16 != -1 || i15 != -1) {
                iM109376i = 2;
            } else if (i14 == -1 && c34610p.f145760E == -1) {
                iM109376i = -1;
            } else {
                iM109376i = 1;
            }
        }
        Resources resources = this.f38674b;
        if (iM109376i == 2) {
            strM31805b = m31809f(m31807d(c34610p), (i16 == -1 || i15 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i16), Integer.valueOf(i15)), i13 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f)) : "");
        } else if (iM109376i == 1) {
            String strM31805b2 = m31805b(c34610p);
            if (i14 == -1 || i14 < 1) {
                string = "";
            } else if (i14 == 1) {
                string = resources.getString(R.string.exo_track_mono);
            } else if (i14 == 2) {
                string = resources.getString(R.string.exo_track_stereo);
            } else if (i14 == 6 || i14 == 7) {
                string = resources.getString(R.string.exo_track_surround_5_point_1);
            } else {
                string = i14 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
            }
            strM31805b = m31809f(strM31805b2, string, i13 != -1 ? resources.getString(R.string.exo_track_bitrate, Float.valueOf(i13 / 1000000.0f)) : "");
        } else {
            strM31805b = m31805b(c34610p);
        }
        if (strM31805b.length() != 0) {
            return strM31805b;
        }
        String str3 = c34610p.f145773d;
        return (str3 == null || str3.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str3);
    }

    /* JADX INFO: renamed from: f */
    public final String m31809f(String... strArr) {
        switch (this.f38673a) {
            case 0:
                String string = "";
                for (String str : strArr) {
                    if (str.length() > 0) {
                        string = TextUtils.isEmpty(string) ? str : this.f38674b.getString(R.string.exo_item_list, string, str);
                    }
                }
                return string;
            default:
                String string2 = "";
                for (String str2 : strArr) {
                    if (str2.length() > 0) {
                        string2 = TextUtils.isEmpty(string2) ? str2 : this.f38674b.getString(R.string.exo_item_list, string2, str2);
                    }
                }
                return string2;
        }
    }
}
