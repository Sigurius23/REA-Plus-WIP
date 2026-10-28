.class public final synthetic Ld30/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Le30/c;


# direct methods
.method public synthetic constructor <init>(Le30/c;I)V
    .locals 0

    iput p2, p0, Ld30/f;->w:I

    iput-object p1, p0, Ld30/f;->x:Le30/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Ld30/f;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x3

    const-string v3, "it"

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    iget-object v5, p0, Ld30/f;->x:Le30/c;

    packed-switch v0, :pswitch_data_0

    move-object v0, p1

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v5, Le30/c;->S:Lec3/h2;

    :cond_0
    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v4

    :pswitch_0
    check-cast p1, Lt20/u;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Le30/c;->x:Lk20/a;

    invoke-virtual {v0, p1}, Lk20/a;->t(Lt20/u;)V

    return-object v4

    :pswitch_1
    check-cast p1, Ly00/i;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Le30/c;->x:Lk20/a;

    sget-object v1, Lk20/c;->w:[Lk20/c;

    invoke-virtual {v0, p1}, Lk20/a;->j(Ly00/i;)V

    return-object v4

    :pswitch_2
    check-cast p1, Lq20/y;

    invoke-virtual {v5, p1}, Le30/c;->z(Lq20/y;)V

    return-object v4

    :pswitch_3
    check-cast p1, Lzy/c;

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Le30/c;->v(Lzy/c;)V

    return-object v4

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object v0, v5, Le30/c;->z:Landroidx/lifecycle/k1;

    const-string v1, "processing"

    invoke-virtual {v0, p1, v1}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v4

    :pswitch_5
    check-cast p1, Lr20/s;

    const-string v0, "poppedScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Le30/c;->Y:Lk20/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p1, p1, Lr20/p;

    if-eqz p1, :cond_1

    iget-object p1, v0, Lk20/d;->b:Lk20/a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lk20/k;

    invoke-direct {v0, v2}, Lk20/k;-><init>(I)V

    invoke-static {p1, v0}, Lk20/a;->i(Lk20/a;Lk20/t;)V

    :cond_1
    return-object v4

    :pswitch_6
    check-cast p1, Lh20/l;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Le30/c;->a0:Lh20/z4;

    invoke-virtual {v0, p1}, Lh20/z4;->f(Lh20/l;)V

    return-object v4

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, v5, Le30/c;->M:Lr20/d;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lq80/h;

    const/16 v3, 0x9

    invoke-direct {v0, p1, v3}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    iget-object v3, p1, Lr20/d;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v3, p1, Lr20/d;->a:Lbc3/c0;

    new-instance v5, Lr20/c;

    invoke-direct {v5, v0, p1, v1}, Lr20/c;-><init>(Lc93/a;Lr20/d;Lq83/d;)V

    invoke-static {v3, v1, v1, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_2
    iget-object p1, v5, Le30/c;->M:Lr20/d;

    invoke-virtual {p1}, Lr20/d;->b()V

    :cond_3
    :goto_0
    return-object v4

    :pswitch_8
    check-cast p1, Lh20/l;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq20/w;

    iget-object p1, p1, Lh20/l;->b:Ly00/o4;

    invoke-direct {v0, p1, v1, v1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    invoke-virtual {v5, v0}, Le30/c;->z(Lq20/y;)V

    iget-object p1, v5, Le30/c;->x:Lk20/a;

    invoke-virtual {p1, v0}, Lk20/a;->s(Lq20/y;)V

    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
