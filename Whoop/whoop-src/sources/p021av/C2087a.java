package p021av;

import com.mapbox.bindgen.Expected;
import com.mapbox.maps.CustomGeometrySourceOptions;
import com.mapbox.maps.CustomRasterSourceOptions;
import com.mapbox.maps.MapboxStyleManager;
import java.io.Serializable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: av.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2087a extends AbstractC2091e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8253e = 0;

    /* JADX INFO: renamed from: f */
    public final Serializable f8254f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2087a(String id4, CustomGeometrySourceOptions customGeometrySourceOptions) {
        super(id4);
        AbstractC22676k.m65750j(id4, "id");
        this.f8254f = customGeometrySourceOptions;
    }

    @Override // p021av.AbstractC2091e
    /* JADX INFO: renamed from: a */
    public final Expected mo6601a(MapboxStyleManager style) {
        switch (this.f8253e) {
            case 0:
                AbstractC22676k.m65750j(style, "style");
                return style.addStyleCustomGeometrySource(this.f8259a, (CustomGeometrySourceOptions) this.f8254f);
            default:
                AbstractC22676k.m65750j(style, "style");
                return style.addStyleCustomRasterSource(this.f8259a, (CustomRasterSourceOptions) this.f8254f);
        }
    }

    @Override // p021av.AbstractC2091e
    /* JADX INFO: renamed from: e */
    public final String mo6602e() {
        switch (this.f8253e) {
            case 0:
                return "custom-geometry";
            default:
                return "custom-raster";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2087a(String id4, CustomRasterSourceOptions customRasterSourceOptions) {
        super(id4);
        AbstractC22676k.m65750j(id4, "id");
        this.f8254f = customRasterSourceOptions;
    }
}
