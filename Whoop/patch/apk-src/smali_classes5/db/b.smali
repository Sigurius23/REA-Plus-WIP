.class public final Ldb/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public x:Z

.field public final synthetic y:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/FrameLayout;I)V
    .locals 0

    iput p2, p0, Ldb/b;->w:I

    iput-object p1, p0, Ldb/b;->y:Landroid/widget/FrameLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Ldb/b;->w:I

    iget-object v1, p0, Ldb/b;->y:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    iput-boolean v2, p0, Ldb/b;->x:Z

    check-cast v1, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;

    sget v0, Lcom/google/android/exoplayer2/ui/AspectRatioFrameLayout;->z:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_0
    iput-boolean v2, p0, Ldb/b;->x:Z

    check-cast v1, Landroidx/media3/ui/AspectRatioFrameLayout;

    sget v0, Landroidx/media3/ui/AspectRatioFrameLayout;->z:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
