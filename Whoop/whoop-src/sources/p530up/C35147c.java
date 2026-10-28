package p530up;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;
import java.util.ArrayList;
import p127ev.C13668i;
import ro.C31624i;

/* JADX INFO: renamed from: up.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C35147c extends FrameLayout {

    /* JADX INFO: renamed from: w */
    public final C13668i f149132w;

    public C35147c(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        C13668i c13668i = new C13668i();
        c13668i.f48457d = new C31624i(c13668i, 15);
        c13668i.f48462i = new ArrayList();
        c13668i.f48458e = this;
        c13668i.f48459f = context;
        c13668i.f48461h = googleMapOptions;
        this.f149132w = c13668i;
        setClickable(true);
    }
}
