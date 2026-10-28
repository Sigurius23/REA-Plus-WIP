.class public final synthetic Landroidx/fragment/app/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/fragment/app/p2;

.field public final synthetic y:Landroidx/fragment/app/q;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/p2;Landroidx/fragment/app/q;I)V
    .locals 0

    iput p3, p0, Landroidx/fragment/app/n;->w:I

    iput-object p1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/p2;

    iput-object p2, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Landroidx/fragment/app/n;->w:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "$operation"

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/p2;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    iget-object v2, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/q;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Transition for operation "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " has completed"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "FragmentManager"

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {v1, v2}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    return-void

    :pswitch_0
    const-string v0, "$operation"

    iget-object v1, p0, Landroidx/fragment/app/n;->x:Landroidx/fragment/app/p2;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "this$0"

    iget-object v2, p0, Landroidx/fragment/app/n;->y:Landroidx/fragment/app/q;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Transition for operation "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " has completed"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "FragmentManager"

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {v1, v2}, Landroidx/fragment/app/p2;->c(Landroidx/fragment/app/o2;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
