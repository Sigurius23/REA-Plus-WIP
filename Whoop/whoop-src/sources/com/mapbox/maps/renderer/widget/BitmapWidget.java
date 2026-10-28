package com.mapbox.maps.renderer.widget;

import android.graphics.Bitmap;
import com.mapbox.maps.MapboxExperimental;
import l83.C23454a0;
import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\fB%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/BitmapWidget;", "Lcom/mapbox/maps/renderer/widget/Widget;", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "originalPosition", "<init>", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "position", "", "marginX", "marginY", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;FF)V", "(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;F)V", "Ll83/a0;", "updateBitmap", "(Landroid/graphics/Bitmap;)V", "widgetPosition", "setPosition", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition;)V", "getPosition", "()Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "angleDegrees", "setRotation", "(F)V", "getRotation", "()F", "Lcom/mapbox/maps/renderer/widget/WidgetPosition;", "Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "renderer", "Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "getRenderer$maps_sdk_release", "()Lcom/mapbox/maps/renderer/widget/BitmapWidgetRenderer;", "maps-sdk_release"}, m65682k = 1, m65683mv = {1, 7, 1}, m65685xi = 48)
@MapboxExperimental
public class BitmapWidget extends Widget {
    private final WidgetPosition originalPosition;
    private final BitmapWidgetRenderer renderer;

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$1 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "Ll83/a0;", "invoke", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55561 extends AbstractC22680m implements Function1 {
        public static final C55561 INSTANCE = new C55561();

        public C55561() {
            super(1);
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((WidgetPosition.Builder) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(WidgetPosition.Builder WidgetPosition) {
            AbstractC22676k.m65750j(WidgetPosition, "$this$WidgetPosition");
            WidgetPosition.m134134setVerticalAlignment(WidgetPosition.Vertical.TOP);
            WidgetPosition.m134131setHorizontalAlignment(WidgetPosition.Horizontal.LEFT);
            WidgetPosition.m134132setOffsetX(0.0f);
            WidgetPosition.m134133setOffsetY(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2 */
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;", "Ll83/a0;", "invoke", "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;)V", "<anonymous>"}, m65682k = 3, m65683mv = {1, 7, 1})
    public static final class C55572 extends AbstractC22680m implements Function1 {
        final /* synthetic */ float $marginX;
        final /* synthetic */ float $marginY;
        final /* synthetic */ WidgetPosition $position;

        /* JADX INFO: renamed from: com.mapbox.maps.renderer.widget.BitmapWidget$2$WhenMappings */
        @Metadata(m65682k = 3, m65683mv = {1, 7, 1}, m65685xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[WidgetPosition.Horizontal.values().length];
                try {
                    iArr[WidgetPosition.Horizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WidgetPosition.Horizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WidgetPosition.Horizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[WidgetPosition.Vertical.values().length];
                try {
                    iArr2[WidgetPosition.Vertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[WidgetPosition.Vertical.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[WidgetPosition.Vertical.BOTTOM.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C55572(WidgetPosition widgetPosition, float f13, float f14) {
            super(1);
            this.$position = widgetPosition;
            this.$marginX = f13;
            this.$marginY = f14;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((WidgetPosition.Builder) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(WidgetPosition.Builder WidgetPosition) {
            float f13;
            float f14;
            AbstractC22676k.m65750j(WidgetPosition, "$this$WidgetPosition");
            WidgetPosition.m134131setHorizontalAlignment(this.$position.getHorizontalAlignment());
            WidgetPosition.m134134setVerticalAlignment(this.$position.getVerticalAlignment());
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.$position.getHorizontalAlignment().ordinal()];
            if (i13 == 1 || i13 == 2) {
                f13 = this.$marginX;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = -this.$marginX;
            }
            WidgetPosition.m134132setOffsetX(f13);
            int i14 = WhenMappings.$EnumSwitchMapping$1[this.$position.getVerticalAlignment().ordinal()];
            if (i14 == 1 || i14 == 2) {
                f14 = this.$marginY;
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f14 = -this.$marginY;
            }
            WidgetPosition.m134133setOffsetY(f14);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BitmapWidget(Bitmap bitmap) {
        this(bitmap, (WidgetPosition) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        AbstractC22676k.m65750j(bitmap, "bitmap");
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public WidgetPosition getPosition() {
        return getRenderer().getPosition();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public float getRotation() {
        return getRenderer().getRotationDegrees();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setPosition(WidgetPosition widgetPosition) {
        AbstractC22676k.m65750j(widgetPosition, "widgetPosition");
        getRenderer().setPosition(widgetPosition);
        triggerRepaint$maps_sdk_release();
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    public void setRotation(float angleDegrees) {
        getRenderer().setRotation(angleDegrees);
        triggerRepaint$maps_sdk_release();
    }

    public final void updateBitmap(Bitmap bitmap) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        getRenderer().updateBitmap(bitmap);
        triggerRepaint$maps_sdk_release();
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, (i13 & 2) != 0 ? WidgetPositionKt.WidgetPosition(C55561.INSTANCE) : widgetPosition);
    }

    @Override // com.mapbox.maps.renderer.widget.Widget
    /* JADX INFO: renamed from: getRenderer$maps_sdk_release, reason: from getter */
    public BitmapWidgetRenderer getRenderer() {
        return this.renderer;
    }

    public BitmapWidget(Bitmap bitmap, WidgetPosition originalPosition) {
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(originalPosition, "originalPosition");
        this.originalPosition = originalPosition;
        this.renderer = new BitmapWidgetRenderer(bitmap, originalPosition);
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i13 & 4) != 0 ? 0.0f : f13, (i13 & 8) != 0 ? 0.0f : f14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public BitmapWidget(Bitmap bitmap, WidgetPosition position, float f13, float f14) {
        this(bitmap, WidgetPositionKt.WidgetPosition(new C55572(position, f13, f14)));
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(position, "position");
    }

    public /* synthetic */ BitmapWidget(Bitmap bitmap, WidgetPosition widgetPosition, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 2) != 0) {
            widgetPosition = new WidgetPosition(WidgetPosition.Horizontal.LEFT, WidgetPosition.Vertical.TOP);
        }
        this(bitmap, widgetPosition, (i13 & 4) != 0 ? 0.0f : f13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC23457c
    public BitmapWidget(Bitmap bitmap, WidgetPosition position, float f13) {
        this(bitmap, position, f13, 0.0f);
        AbstractC22676k.m65750j(bitmap, "bitmap");
        AbstractC22676k.m65750j(position, "position");
    }
}
