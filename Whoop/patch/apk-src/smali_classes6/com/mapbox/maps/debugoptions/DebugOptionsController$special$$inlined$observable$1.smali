.class public final Lcom/mapbox/maps/debugoptions/DebugOptionsController$special$$inlined$observable$1;
.super Lf93/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/debugoptions/DebugOptionsController;-><init>(Landroid/widget/FrameLayout;Lcom/mapbox/maps/MapboxMap;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf93/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "com/mapbox/maps/debugoptions/DebugOptionsController$special$$inlined$observable$1",
        "Lf93/b;",
        "Lj93/z;",
        "property",
        "oldValue",
        "newValue",
        "Ll83/a0;",
        "afterChange",
        "(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mapbox/maps/debugoptions/DebugOptionsController;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/mapbox/maps/debugoptions/DebugOptionsController;)V
    .locals 0

    iput-object p2, p0, Lcom/mapbox/maps/debugoptions/DebugOptionsController$special$$inlined$observable$1;->this$0:Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    invoke-direct {p0, p1}, Lf93/b;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterChange(Lj93/z;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj93/z;",
            "Ljava/lang/Boolean;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    const-string v0, "property"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lcom/mapbox/maps/debugoptions/DebugOptionsController$special$$inlined$observable$1;->this$0:Lcom/mapbox/maps/debugoptions/DebugOptionsController;

    invoke-static {p1}, Lcom/mapbox/maps/debugoptions/DebugOptionsController;->access$updateCameraSubscriptionIfNeeded(Lcom/mapbox/maps/debugoptions/DebugOptionsController;)V

    :cond_0
    return-void
.end method
