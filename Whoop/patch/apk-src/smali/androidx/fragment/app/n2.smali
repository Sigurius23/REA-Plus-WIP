.class public final synthetic Landroidx/fragment/app/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/fragment/app/s;

.field public final synthetic y:Landroidx/fragment/app/p2;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/s;Landroidx/fragment/app/p2;I)V
    .locals 0

    iput p3, p0, Landroidx/fragment/app/n2;->w:I

    iput-object p1, p0, Landroidx/fragment/app/n2;->x:Landroidx/fragment/app/s;

    iput-object p2, p0, Landroidx/fragment/app/n2;->y:Landroidx/fragment/app/p2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Landroidx/fragment/app/n2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/n2;->x:Landroidx/fragment/app/s;

    iget-object v1, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/n2;->y:Landroidx/fragment/app/p2;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, Landroidx/fragment/app/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    const-string v0, "this$0"

    iget-object v1, p0, Landroidx/fragment/app/n2;->x:Landroidx/fragment/app/s;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$operation"

    iget-object v2, p0, Landroidx/fragment/app/n2;->y:Landroidx/fragment/app/p2;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroidx/fragment/app/s;->a(Landroidx/fragment/app/p2;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/fragment/app/n2;->x:Landroidx/fragment/app/s;

    iget-object v1, v0, Landroidx/fragment/app/s;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/fragment/app/n2;->y:Landroidx/fragment/app/p2;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v2, Landroidx/fragment/app/p2;->a:I

    iget-object v2, v2, Landroidx/fragment/app/p2;->c:Landroidx/fragment/app/m0;

    iget-object v2, v2, Landroidx/fragment/app/m0;->mView:Landroid/view/View;

    const-string v3, "operation.fragment.mView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Landroidx/fragment/app/s;->a:Landroid/view/ViewGroup;

    invoke-static {v1, v2, v0}, Lr;->a(ILandroid/view/View;Landroid/view/ViewGroup;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
