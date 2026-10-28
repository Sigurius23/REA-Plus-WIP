package p543v4;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import p044c5.C4217i;
import p505ts.AbstractC34132o;
import p513u4.C34517e;
import p513u4.C34518f;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C35648g extends AbstractC34132o {
    /* JADX INFO: renamed from: V */
    public static Font m112854V(FontFamily fontFamily, int i13) {
        FontStyle fontStyle = new FontStyle((i13 & 1) != 0 ? 700 : 400, (i13 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM112856X = m112856X(fontStyle, font.getStyle());
        for (int i14 = 1; i14 < fontFamily.getSize(); i14++) {
            Font font2 = fontFamily.getFont(i14);
            int iM112856X2 = m112856X(fontStyle, font2.getStyle());
            if (iM112856X2 < iM112856X) {
                font = font2;
                iM112856X = iM112856X2;
            }
        }
        return font;
    }

    /* JADX INFO: renamed from: W */
    public static FontFamily m112855W(C4217i[] c4217iArr, ContentResolver contentResolver) {
        FontFamily.Builder builder = null;
        for (C4217i c4217i : c4217iArr) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c4217i.f17098a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c4217i.f17100c).setSlant(c4217i.f17101d ? 1 : 0).setTtcIndex(c4217i.f17099b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th3) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            } catch (IOException e5) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX INFO: renamed from: X */
    public static int m112856X(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: m */
    public final Typeface mo107897m(Context context, C34517e c34517e, Resources resources, int i13) {
        try {
            FontFamily.Builder builder = null;
            for (C34518f c34518f : c34517e.m109084a()) {
                try {
                    Font fontBuild = new Font.Builder(resources, c34518f.m109085a()).setWeight(c34518f.m109088d()).setSlant(c34518f.m109089e() ? 1 : 0).setTtcIndex(c34518f.m109086b()).setFontVariationSettings(c34518f.m109087c()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m112854V(fontFamilyBuild, i13).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: n */
    public final Typeface mo107898n(Context context, C4217i[] c4217iArr, int i13) {
        try {
            FontFamily fontFamilyM112855W = m112855W(c4217iArr, context.getContentResolver());
            if (fontFamilyM112855W == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM112855W).setStyle(m112854V(fontFamilyM112855W, i13).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: o */
    public final Typeface mo107899o(Context context, List list, int i13) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM112855W = m112855W((C4217i[]) list.get(0), contentResolver);
            if (fontFamilyM112855W == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM112855W);
            for (int i14 = 1; i14 < list.size(); i14++) {
                FontFamily fontFamilyM112855W2 = m112855W((C4217i[]) list.get(i14), contentResolver);
                if (fontFamilyM112855W2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM112855W2);
                }
            }
            return customFallbackBuilder.setStyle(m112854V(fontFamilyM112855W, i13).getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: p */
    public final Typeface mo107900p(Context context, Resources resources, int i13, String str, int i14) {
        try {
            Font fontBuild = new Font.Builder(resources, i13).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e5) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e5);
            return null;
        }
    }

    @Override // p505ts.AbstractC34132o
    /* JADX INFO: renamed from: s */
    public final C4217i mo107901s(C4217i[] c4217iArr, int i13) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
