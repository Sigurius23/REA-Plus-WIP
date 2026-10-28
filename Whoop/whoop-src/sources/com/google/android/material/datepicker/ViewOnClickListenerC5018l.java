package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p019ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import p087db.C11876t0;
import p314m.C24842h;
import p408q.AbstractC29658b;
import p516u8.C34611p0;
import p516u8.C34613q0;
import p516u8.C34621u0;
import p690zr.AbstractC41023g0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.l */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC5018l implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f20917w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f20918x;

    public /* synthetic */ ViewOnClickListenerC5018l(Object obj, int i13) {
        this.f20917w = i13;
        this.f20918x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f20917w) {
            case 0:
                C5019m c5019m = (C5019m) this.f20918x;
                int i13 = c5019m.f20919E;
                if (i13 == 2) {
                    c5019m.m15737z(1);
                } else if (i13 == 1) {
                    c5019m.m15737z(2);
                }
                break;
            case 1:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f20918x;
                HashMap map = trackSelectionView.f6501G;
                boolean z4 = true;
                if (view == trackSelectionView.f6509y) {
                    trackSelectionView.f6506L = true;
                    map.clear();
                } else if (view == trackSelectionView.f6510z) {
                    trackSelectionView.f6506L = false;
                    map.clear();
                } else {
                    trackSelectionView.f6506L = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C11876t0 c11876t0 = (C11876t0) tag;
                    C34621u0 c34621u0 = c11876t0.f38756a;
                    C34611p0 c34611p0 = c34621u0.f145858b;
                    int i14 = c11876t0.f38757b;
                    C34613q0 c34613q0 = (C34613q0) map.get(c34611p0);
                    if (c34613q0 == null) {
                        if (!trackSelectionView.f6503I && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c34611p0, new C34613q0(c34611p0, AbstractC41023g0.m133256r(Integer.valueOf(i14))));
                    } else {
                        ArrayList arrayList = new ArrayList(c34613q0.f145804b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z13 = trackSelectionView.f6502H && c34621u0.f145859c;
                        if (!z13 && (!trackSelectionView.f6503I || trackSelectionView.f6500F.size() <= 1)) {
                            z4 = false;
                        }
                        if (zIsChecked && z4) {
                            arrayList.remove(Integer.valueOf(i14));
                            if (arrayList.isEmpty()) {
                                map.remove(c34611p0);
                            } else {
                                map.put(c34611p0, new C34613q0(c34611p0, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z13) {
                                arrayList.add(Integer.valueOf(i14));
                                map.put(c34611p0, new C34613q0(c34611p0, arrayList));
                            } else {
                                map.put(c34611p0, new C34613q0(c34611p0, AbstractC41023g0.m133256r(Integer.valueOf(i14))));
                            }
                        }
                    }
                }
                trackSelectionView.m5092a();
                break;
            case 2:
                C24842h c24842h = (C24842h) this.f20918x;
                if (view == c24842h.f97305i && (message3 = c24842h.f97307k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c24842h.f97308l || (message2 = c24842h.f97310n) == null) {
                    messageObtain = (view != c24842h.f97311o || (message = c24842h.f97313q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c24842h.f97295E.obtainMessage(1, c24842h.f97298b).sendToTarget();
                break;
            case 3:
                ((AbstractC29658b) this.f20918x).mo72857c();
                break;
            default:
                ((Toolbar) this.f20918x).m3312e();
                break;
        }
    }
}
