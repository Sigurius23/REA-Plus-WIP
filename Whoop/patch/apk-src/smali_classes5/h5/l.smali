.class public final synthetic Lh5/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, Lh5/l;->w:I

    iput-object p1, p0, Lh5/l;->x:Ljava/lang/Object;

    iput-object p2, p0, Lh5/l;->y:Ljava/lang/Object;

    iput-object p3, p0, Lh5/l;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 5

    iget v0, p0, Lh5/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh5/l;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/v;

    iget-object v1, p0, Lh5/l;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lh5/l;->z:Ljava/lang/Object;

    check-cast v2, Lp1/t2;

    invoke-static {v0, v1, v2, p1, p2}, Lkd1/e;->a(Landroidx/lifecycle/v;Lbc3/c0;Lp1/t2;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void

    :pswitch_0
    iget-object p1, p0, Lh5/l;->x:Ljava/lang/Object;

    check-cast p1, Lh5/n;

    iget-object v0, p0, Lh5/l;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/w;

    iget-object v1, p0, Lh5/l;->z:Ljava/lang/Object;

    check-cast v1, Lh5/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p1, Lh5/n;->a:Ljava/lang/Runnable;

    iget-object v3, p1, Lh5/n;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    sget-object v4, Landroidx/lifecycle/v;->Companion:Landroidx/lifecycle/t;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Landroidx/lifecycle/t;->b(Landroidx/lifecycle/w;)Landroidx/lifecycle/v;

    move-result-object v4

    if-ne p2, v4, :cond_0

    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    sget-object v4, Landroidx/lifecycle/v;->ON_DESTROY:Landroidx/lifecycle/v;

    if-ne p2, v4, :cond_1

    invoke-virtual {p1, v1}, Lh5/n;->b(Lh5/o;)V

    goto :goto_0

    :cond_1
    invoke-static {v0}, Landroidx/lifecycle/t;->a(Landroidx/lifecycle/w;)Landroidx/lifecycle/v;

    move-result-object p1

    if-ne p2, p1, :cond_2

    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_2
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
