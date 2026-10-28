package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import no.nordicsemi.android.dfu.DfuBaseService;
import p029b5.AbstractC2722a;
import p031b9.AbstractC2875y;
import p479s4.AbstractC32126g;

/* JADX INFO: loaded from: classes5.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f5264k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f5265a;

    /* JADX INFO: renamed from: b */
    public Object f5266b;

    /* JADX INFO: renamed from: c */
    public byte[] f5267c;

    /* JADX INFO: renamed from: d */
    public Parcelable f5268d;

    /* JADX INFO: renamed from: e */
    public int f5269e;

    /* JADX INFO: renamed from: f */
    public int f5270f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f5271g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f5272h;

    /* JADX INFO: renamed from: i */
    public String f5273i;

    /* JADX INFO: renamed from: j */
    public String f5274j;

    public IconCompat() {
        this.f5265a = -1;
        this.f5267c = null;
        this.f5268d = null;
        this.f5269e = 0;
        this.f5270f = 0;
        this.f5271g = null;
        this.f5272h = f5264k;
        this.f5273i = null;
    }

    /* JADX INFO: renamed from: a */
    public static IconCompat m3677a(Bundle bundle) {
        int i13 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i13);
        iconCompat.f5269e = bundle.getInt("int1");
        iconCompat.f5270f = bundle.getInt("int2");
        iconCompat.f5274j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f5271g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f5272h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i13) {
            case -1:
            case 1:
            case 5:
                iconCompat.f5266b = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                AbstractC2875y.m8313z(i13, "Unknown type ", "IconCompat");
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f5266b = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f5266b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m3678b(Icon icon) {
        return AbstractC32126g.m100041f(icon);
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m3679c(Bitmap bitmap) {
        bitmap.getClass();
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f5266b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: d */
    public static IconCompat m3680d(Context context, int i13) {
        context.getClass();
        return m3681e(context.getResources(), context.getPackageName(), i13);
    }

    /* JADX INFO: renamed from: e */
    public static IconCompat m3681e(Resources resources, String str, int i13) {
        str.getClass();
        if (i13 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f5269e = i13;
        if (resources != null) {
            try {
                iconCompat.f5266b = resources.getResourceName(i13);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f5266b = str;
        }
        iconCompat.f5274j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: f */
    public final int m3682f() {
        int i13 = this.f5265a;
        if (i13 == -1) {
            return ((Icon) this.f5266b).getResId();
        }
        if (i13 == 2) {
            return this.f5269e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public final String m3683g() {
        int i13 = this.f5265a;
        if (i13 == -1) {
            return ((Icon) this.f5266b).getResPackage();
        }
        if (i13 == 2) {
            String str = this.f5274j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f5266b).split(":", -1)[0] : this.f5274j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: h */
    public final Uri m3684h() {
        int i13 = this.f5265a;
        if (i13 == -1) {
            return ((Icon) this.f5266b).getUri();
        }
        if (i13 == 4 || i13 == 6) {
            return Uri.parse((String) this.f5266b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public final Drawable m3685i(Context context) {
        Object obj;
        Resources resourcesForApplication;
        if (this.f5265a == 2 && (obj = this.f5266b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String strM3683g = m3683g();
                    if ("android".equals(strM3683g)) {
                        resourcesForApplication = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(strM3683g, DfuBaseService.ERROR_REMOTE_MASK);
                            resourcesForApplication = applicationInfo != null ? packageManager.getResourcesForApplication(applicationInfo) : null;
                        } catch (PackageManager.NameNotFoundException e5) {
                            Log.e("IconCompat", "Unable to find pkg=" + strM3683g + " for icon", e5);
                        }
                    }
                    int identifier = resourcesForApplication.getIdentifier(str4, str3, str5);
                    if (this.f5269e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + strM3683g + " " + str);
                        this.f5269e = identifier;
                    }
                }
            }
        }
        return m3687k(context).loadDrawable(context);
    }

    /* JADX INFO: renamed from: j */
    public final Icon m3686j() {
        return m3687k(null);
    }

    /* JADX INFO: renamed from: k */
    public final Icon m3687k(Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i13 = Build.VERSION.SDK_INT;
        switch (this.f5265a) {
            case -1:
                return (Icon) this.f5266b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f5266b);
                break;
            case 2:
                iconCreateWithBitmap = Icon.createWithResource(m3683g(), this.f5269e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f5266b, this.f5269e, this.f5270f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f5266b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f5266b);
                break;
            case 6:
                if (i13 >= 30) {
                    iconCreateWithBitmap = AbstractC2722a.m7674a(m3684h());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m3684h());
                    }
                    Uri uriM3684h = m3684h();
                    String scheme = uriM3684h.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriM3684h);
                        } catch (Exception e5) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriM3684h, e5);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) this.f5266b));
                        } catch (FileNotFoundException e13) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriM3684h, e13);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m3684h());
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = this.f5271g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f5272h;
        if (mode != f5264k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public final String toString() {
        String str;
        if (this.f5265a == -1) {
            return String.valueOf(this.f5266b);
        }
        StringBuilder sb4 = new StringBuilder("Icon(typ=");
        switch (this.f5265a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb4.append(str);
        switch (this.f5265a) {
            case 1:
            case 5:
                sb4.append(" size=");
                sb4.append(((Bitmap) this.f5266b).getWidth());
                sb4.append("x");
                sb4.append(((Bitmap) this.f5266b).getHeight());
                break;
            case 2:
                sb4.append(" pkg=");
                sb4.append(this.f5274j);
                sb4.append(" id=");
                sb4.append(String.format("0x%08x", Integer.valueOf(m3682f())));
                break;
            case 3:
                sb4.append(" len=");
                sb4.append(this.f5269e);
                if (this.f5270f != 0) {
                    sb4.append(" off=");
                    sb4.append(this.f5270f);
                }
                break;
            case 4:
            case 6:
                sb4.append(" uri=");
                sb4.append(this.f5266b);
                break;
        }
        if (this.f5271g != null) {
            sb4.append(" tint=");
            sb4.append(this.f5271g);
        }
        if (this.f5272h != f5264k) {
            sb4.append(" mode=");
            sb4.append(this.f5272h);
        }
        sb4.append(")");
        return sb4.toString();
    }

    public IconCompat(int i13) {
        this.f5267c = null;
        this.f5268d = null;
        this.f5269e = 0;
        this.f5270f = 0;
        this.f5271g = null;
        this.f5272h = f5264k;
        this.f5273i = null;
        this.f5265a = i13;
    }
}
