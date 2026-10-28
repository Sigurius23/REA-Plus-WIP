.class final Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/renderer/widget/BitmapWidget;-><init>(Landroid/graphics/Bitmap;Lcom/mapbox/maps/renderer/widget/WidgetPosition;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;",
        "Ll83/a0;",
        "invoke",
        "(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;

    invoke-direct {v0}, Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;-><init>()V

    sput-object v0, Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;->INSTANCE:Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;

    invoke-virtual {p0, p1}, Lcom/mapbox/maps/renderer/widget/BitmapWidget$1;->invoke(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final invoke(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;)V
    .locals 1

    const-string v0, "$this$WidgetPosition"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    sget-object v0, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;->TOP:Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;->setVerticalAlignment(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Vertical;)V

    .line 3
    sget-object v0, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;->LEFT:Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;->setHorizontalAlignment(Lcom/mapbox/maps/renderer/widget/WidgetPosition$Horizontal;)V

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;->setOffsetX(F)V

    .line 5
    invoke-virtual {p1, v0}, Lcom/mapbox/maps/renderer/widget/WidgetPosition$Builder;->setOffsetY(F)V

    return-void
.end method
