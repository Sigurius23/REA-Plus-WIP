package p021av;

import com.mapbox.maps.TileCacheBudget;

/* JADX INFO: renamed from: av.f */
/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC2092f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f8263a;

    static {
        int[] iArr = new int[TileCacheBudget.Type.values().length];
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_MEGABYTES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TileCacheBudget.Type.TILE_CACHE_BUDGET_IN_TILES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f8263a = iArr;
    }
}
