package p243j5;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import hm.C17417d;
import hn.C17508p;
import p047c9.C4322m;
import p184h5.AbstractC16901p0;
import p184h5.C16864d;
import p184h5.InterfaceC16861c;
import p244j6.C21357b;
import q30.C29934u0;
import s40.InterfaceC32146e1;

/* JADX INFO: renamed from: j5.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C21328b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f81546a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f81547b;

    public C21328b(C21357b c21357b, InterfaceC32146e1 interfaceC32146e1) {
        super(c21357b, true);
        this.f81547b = interfaceC32146e1;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i13, Bundle bundle) {
        Bundle bundle2;
        InterfaceC16861c c4322m;
        switch (this.f81546a) {
            case 0:
                C17508p c17508p = (C17508p) this.f81547b;
                C17417d c17417d = inputContentInfo == null ? null : new C17417d(new C17417d(inputContentInfo, 17), 18);
                AppCompatEditText appCompatEditText = (AppCompatEditText) c17508p.f67738x;
                if ((i13 & 1) != 0) {
                    try {
                        ((InputContentInfo) ((C17417d) c17417d.f67507x).f67507x).requestPermission();
                        InputContentInfo inputContentInfo2 = (InputContentInfo) ((C17417d) c17417d.f67507x).f67507x;
                        bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                        bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
                    } catch (Exception e5) {
                        Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e5);
                    }
                } else {
                    bundle2 = bundle;
                }
                InputContentInfo inputContentInfo3 = (InputContentInfo) ((C17417d) c17417d.f67507x).f67507x;
                ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
                if (Build.VERSION.SDK_INT >= 31) {
                    c4322m = new C4322m(clipData, 2);
                } else {
                    C16864d c16864d = new C16864d();
                    c16864d.f64790b = clipData;
                    c16864d.f64791c = 2;
                    c4322m = c16864d;
                }
                c4322m.mo13627a(inputContentInfo3.getLinkUri());
                c4322m.setExtras(bundle2);
                if (AbstractC16901p0.m47579j(appCompatEditText, c4322m.build()) == null) {
                    return true;
                }
                return super.commitContent(inputContentInfo, i13, bundle);
            default:
                return super.commitContent(inputContentInfo, i13, bundle);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i13, int i14) {
        InterfaceC32146e1 interfaceC32146e1;
        switch (this.f81546a) {
            case 1:
                CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
                if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (interfaceC32146e1 = (InterfaceC32146e1) this.f81547b) != null) {
                    ((C29934u0) interfaceC32146e1).m91529E();
                }
                break;
        }
        return super.deleteSurroundingText(i13, i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21328b(InputConnection inputConnection, C17508p c17508p) {
        super(inputConnection, false);
        this.f81547b = c17508p;
    }
}
