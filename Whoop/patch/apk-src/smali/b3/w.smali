.class public final Lb3/w;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/compose/ui/platform/AndroidComposeView;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/ui/platform/AndroidComposeView;I)V
    .locals 0

    iput p2, p0, Lb3/w;->w:I

    iput-object p1, p0, Lb3/w;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb3/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3/w;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->d(Landroidx/compose/ui/platform/AndroidComposeView;)Lb3/o;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb3/w;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->S0:Landroid/view/MotionEvent;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v1

    const/4 v2, 0x7

    if-eq v1, v2, :cond_0

    const/16 v2, 0x9

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->T0:J

    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Y0:Landroidx/databinding/s;

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb3/w;->x:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-static {v0}, Lce/w;->v(Landroidx/compose/ui/platform/AndroidComposeView;)J

    move-result-wide v0

    new-instance v2, Ly3/l;

    invoke-direct {v2, v0, v1}, Ly3/l;-><init>(J)V

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
