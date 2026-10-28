.class public final Lsv/c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lsv/d;


# direct methods
.method public synthetic constructor <init>(Lsv/d;I)V
    .locals 0

    iput p2, p0, Lsv/c;->w:I

    iput-object p1, p0, Lsv/c;->x:Lsv/d;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lsv/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsv/c;->x:Lsv/d;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v1

    iget-object v2, v0, Lsv/d;->x:Landroid/animation/ValueAnimator;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsv/c;->x:Lsv/d;

    iget-object v0, v0, Lsv/d;->x:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsv/c;->x:Lsv/d;

    invoke-virtual {v0}, Landroid/animation/Animator;->start()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
