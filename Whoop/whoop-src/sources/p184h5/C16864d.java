package p184h5;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: h5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C16864d implements InterfaceC16861c, InterfaceC16867e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64789a = 0;

    /* JADX INFO: renamed from: b */
    public ClipData f64790b;

    /* JADX INFO: renamed from: c */
    public int f64791c;

    /* JADX INFO: renamed from: d */
    public int f64792d;

    /* JADX INFO: renamed from: e */
    public Uri f64793e;

    /* JADX INFO: renamed from: f */
    public Bundle f64794f;

    public /* synthetic */ C16864d() {
    }

    @Override // p184h5.InterfaceC16861c
    /* JADX INFO: renamed from: a */
    public void mo13627a(Uri uri) {
        this.f64793e = uri;
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: b */
    public ContentInfo mo13628b() {
        return null;
    }

    @Override // p184h5.InterfaceC16861c
    public C16870f build() {
        return new C16870f(new C16864d(this));
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: c */
    public ClipData mo13629c() {
        return this.f64790b;
    }

    @Override // p184h5.InterfaceC16867e
    /* JADX INFO: renamed from: d */
    public int mo13630d() {
        return this.f64792d;
    }

    @Override // p184h5.InterfaceC16861c
    /* JADX INFO: renamed from: e */
    public void mo13631e(int i13) {
        this.f64792d = i13;
    }

    @Override // p184h5.InterfaceC16867e
    public int getSource() {
        return this.f64791c;
    }

    @Override // p184h5.InterfaceC16861c
    public void setExtras(Bundle bundle) {
        this.f64794f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f64789a) {
            case 1:
                Uri uri = this.f64793e;
                StringBuilder sb4 = new StringBuilder("ContentInfoCompat{clip=");
                sb4.append(this.f64790b.getDescription());
                sb4.append(", source=");
                int i13 = this.f64791c;
                if (i13 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i13 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i13 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i13 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i13 != 4) {
                    strValueOf = i13 != 5 ? String.valueOf(i13) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb4.append(strValueOf);
                sb4.append(", flags=");
                int i14 = this.f64792d;
                sb4.append((i14 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i14));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb4.append(str);
                return AbstractC25012a.m73376i(this.f64794f != null ? ", hasExtras" : "", "}", sb4);
            default:
                return super.toString();
        }
    }

    public C16864d(C16864d c16864d) {
        ClipData clipData = c16864d.f64790b;
        clipData.getClass();
        this.f64790b = clipData;
        int i13 = c16864d.f64791c;
        if (i13 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i13 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f64791c = i13;
        int i14 = c16864d.f64792d;
        if ((i14 & 1) == i14) {
            this.f64792d = i14;
            this.f64793e = c16864d.f64793e;
            this.f64794f = c16864d.f64794f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i14) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
