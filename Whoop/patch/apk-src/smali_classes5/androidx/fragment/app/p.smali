.class public final Landroidx/fragment/app/p;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic E:Ljava/io/Serializable;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;I)V
    .locals 0

    iput p5, p0, Landroidx/fragment/app/p;->w:I

    iput-object p1, p0, Landroidx/fragment/app/p;->x:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/fragment/app/p;->y:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/fragment/app/p;->z:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/fragment/app/p;->E:Ljava/io/Serializable;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Landroidx/fragment/app/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/fragment/app/p;->x:Ljava/lang/Object;

    check-cast v0, Lc4/d0;

    iget-object v1, p0, Landroidx/fragment/app/p;->y:Ljava/lang/Object;

    check-cast v1, Lc93/a;

    iget-object v2, p0, Landroidx/fragment/app/p;->z:Ljava/lang/Object;

    check-cast v2, Lc4/a0;

    iget-object v3, p0, Landroidx/fragment/app/p;->E:Ljava/io/Serializable;

    check-cast v3, Ly3/m;

    invoke-virtual {v0, v1, v2, v3}, Lc4/d0;->d(Lc93/a;Lc4/a0;Ly3/m;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/fragment/app/p;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/q;

    iget-object v1, v0, Landroidx/fragment/app/q;->f:Landroidx/fragment/app/k2;

    iget-object v2, p0, Landroidx/fragment/app/p;->y:Ljava/lang/Object;

    check-cast v2, Landroid/view/ViewGroup;

    iget-object v3, p0, Landroidx/fragment/app/p;->z:Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Landroidx/fragment/app/k2;->i(Landroid/view/ViewGroup;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Landroidx/fragment/app/q;->q:Ljava/lang/Object;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/p;->E:Ljava/io/Serializable;

    check-cast v1, Lkotlin/jvm/internal/g0;

    new-instance v4, Landroidx/fragment/app/o;

    invoke-direct {v4, v0, v3, v2}, Landroidx/fragment/app/o;-><init>(Landroidx/fragment/app/q;Ljava/lang/Object;Landroid/view/ViewGroup;)V

    iput-object v4, v1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/fragment/app/o1;->M(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Started executing operations from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Landroidx/fragment/app/q;->d:Landroidx/fragment/app/p2;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Landroidx/fragment/app/q;->e:Landroidx/fragment/app/p2;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unable to start transition "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " for container "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
