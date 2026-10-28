package com.mapbox.maps.viewannotation;

import com.mapbox.geojson.Geometry;
import com.mapbox.maps.AnnotatedFeature;
import com.mapbox.maps.AnnotatedLayerFeature;
import com.mapbox.maps.ViewAnnotationAnchorConfig;
import com.mapbox.maps.ViewAnnotationOptions;
import java.util.ArrayList;
import java.util.Arrays;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\n\u001a\u00020\u0001*\u00020\u00012*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00000\u0007\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m65681d2 = {"Lkotlin/Function1;", "Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "Ll83/a0;", "block", "Lcom/mapbox/maps/ViewAnnotationOptions;", "viewAnnotationOptions", "(Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions;", "", "Lcom/mapbox/maps/ViewAnnotationAnchorConfig$Builder;", "blocks", "annotationAnchors", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;[Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "annotationAnchor", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "", "layerId", "Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;", "annotatedLayerFeature", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "Lcom/mapbox/geojson/Geometry;", "geometry", "(Lcom/mapbox/maps/ViewAnnotationOptions$Builder;Lcom/mapbox/geojson/Geometry;)Lcom/mapbox/maps/ViewAnnotationOptions$Builder;", "maps-sdk_release"}, m65682k = 2, m65683mv = {1, 7, 1}, m65685xi = 48)
public final class ViewAnnotationOptionsKtxKt {

    /* JADX INFO: renamed from: com.mapbox.maps.viewannotation.ViewAnnotationOptionsKtxKt$annotatedLayerFeature$1 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;", "Ll83/a0;", "invoke", "(Lcom/mapbox/maps/AnnotatedLayerFeature$Builder;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55651 extends AbstractC22680m implements Function1 {
        public static final C55651 INSTANCE = new C55651();

        public C55651() {
            super(1);
        }

        public final void invoke(AnnotatedLayerFeature.Builder builder) {
            AbstractC22676k.m65750j(builder, "$this$null");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AnnotatedLayerFeature.Builder) obj);
            return C23454a0.f92919a;
        }
    }

    public static final ViewAnnotationOptions.Builder annotatedLayerFeature(ViewAnnotationOptions.Builder builder, String layerId, Function1 block) {
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(block, "block");
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(layerId);
        block.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        AbstractC22676k.m65749i(builderAnnotatedFeature, "annotatedFeature(\n    An…(block).build()\n    )\n  )");
        return builderAnnotatedFeature;
    }

    public static /* synthetic */ ViewAnnotationOptions.Builder annotatedLayerFeature$default(ViewAnnotationOptions.Builder builder, String layerId, Function1 block, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            block = C55651.INSTANCE;
        }
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(layerId, "layerId");
        AbstractC22676k.m65750j(block, "block");
        AnnotatedLayerFeature.Builder builderLayerId = new AnnotatedLayerFeature.Builder().layerId(layerId);
        block.invoke(builderLayerId);
        ViewAnnotationOptions.Builder builderAnnotatedFeature = builder.annotatedFeature(AnnotatedFeature.valueOf(builderLayerId.build()));
        AbstractC22676k.m65749i(builderAnnotatedFeature, "annotatedFeature(\n    An…(block).build()\n    )\n  )");
        return builderAnnotatedFeature;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchor(ViewAnnotationOptions.Builder builder, Function1 block) {
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(block, "block");
        ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
        block.invoke(builder2);
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(AbstractC37056f.m118958J(builder2.build()));
        AbstractC22676k.m65749i(builderVariableAnchors, "variableAnchors(listOf(V…().apply(block).build()))");
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder annotationAnchors(ViewAnnotationOptions.Builder builder, Function1... blocks) {
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(blocks, "blocks");
        ArrayList arrayList = new ArrayList(blocks.length);
        for (Function1 function1 : blocks) {
            ViewAnnotationAnchorConfig.Builder builder2 = new ViewAnnotationAnchorConfig.Builder();
            function1.invoke(builder2);
            arrayList.add(builder2.build());
        }
        Object[] array = arrayList.toArray(new ViewAnnotationAnchorConfig[0]);
        AbstractC22676k.m65748h(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        ViewAnnotationAnchorConfig[] viewAnnotationAnchorConfigArr = (ViewAnnotationAnchorConfig[]) array;
        ViewAnnotationOptions.Builder builderVariableAnchors = builder.variableAnchors(AbstractC37056f.m118959K(Arrays.copyOf(viewAnnotationAnchorConfigArr, viewAnnotationAnchorConfigArr.length)));
        AbstractC22676k.m65749i(builderVariableAnchors, "variableAnchors(\n    lis…d() }.toTypedArray())\n  )");
        return builderVariableAnchors;
    }

    public static final ViewAnnotationOptions.Builder geometry(ViewAnnotationOptions.Builder builder, Geometry geometry) {
        AbstractC22676k.m65750j(builder, "<this>");
        AbstractC22676k.m65750j(geometry, "geometry");
        ViewAnnotationOptions.Builder geometry2 = builder.annotatedFeature(AnnotatedFeature.valueOf(geometry));
        AbstractC22676k.m65749i(geometry2, "geometry");
        return geometry2;
    }

    public static final ViewAnnotationOptions viewAnnotationOptions(Function1 block) {
        AbstractC22676k.m65750j(block, "block");
        ViewAnnotationOptions.Builder builder = new ViewAnnotationOptions.Builder();
        block.invoke(builder);
        ViewAnnotationOptions viewAnnotationOptionsBuild = builder.build();
        AbstractC22676k.m65749i(viewAnnotationOptionsBuild, "Builder().apply(block).build()");
        return viewAnnotationOptionsBuild;
    }
}
