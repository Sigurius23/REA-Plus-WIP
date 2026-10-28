.class public final Landroidx/fragment/app/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Landroidx/fragment/app/b0;->w:I

    iput-object p1, p0, Landroidx/fragment/app/b0;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Landroidx/fragment/app/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/b0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/o1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/fragment/app/o1;->z(Z)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/b0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->startPostponedEnterTransition()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
