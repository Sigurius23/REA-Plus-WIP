package com.mapbox.maps;

import o52.C27585w;
import p383ov.C28392n;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: com.mapbox.maps.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C5499a implements Style.OnStyleLoaded {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f22025w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f22026x;

    public /* synthetic */ C5499a(Object obj, int i13) {
        this.f22025w = i13;
        this.f22026x = obj;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        switch (this.f22025w) {
            case 0:
                MapController._init_$lambda$2$lambda$1((MapController) this.f22026x, style);
                break;
            case 1:
                MapboxMap._init_$lambda$3((MapboxMap) this.f22026x, style);
                break;
            case 2:
                C28392n c28392n = (C28392n) this.f22026x;
                AbstractC22676k.m65750j(style, "style");
                c28392n.invoke(style);
                break;
            default:
                C27585w.m83294F0((C27585w) this.f22026x, style);
                break;
        }
    }
}
