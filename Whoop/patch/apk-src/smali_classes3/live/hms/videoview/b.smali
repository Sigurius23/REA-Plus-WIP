.class public final synthetic Llive/hms/videoview/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;

.field public final synthetic y:Llive/hms/videoview/ZoomPanManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;I)V
    .locals 0

    iput p3, p0, Llive/hms/videoview/b;->w:I

    iput-object p1, p0, Llive/hms/videoview/b;->x:Landroid/content/Context;

    iput-object p2, p0, Llive/hms/videoview/b;->y:Llive/hms/videoview/ZoomPanManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Llive/hms/videoview/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Llive/hms/videoview/b;->x:Landroid/content/Context;

    iget-object v1, p0, Llive/hms/videoview/b;->y:Llive/hms/videoview/ZoomPanManager;

    invoke-static {v0, v1}, Llive/hms/videoview/ZoomPanManager;->b(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/PanGestureDetector;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Llive/hms/videoview/b;->x:Landroid/content/Context;

    iget-object v1, p0, Llive/hms/videoview/b;->y:Llive/hms/videoview/ZoomPanManager;

    invoke-static {v0, v1}, Llive/hms/videoview/ZoomPanManager;->c(Landroid/content/Context;Llive/hms/videoview/ZoomPanManager;)Llive/hms/video/video/utils/gesture/ZoomGestureDetector;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
