.class public final synthetic Lh20/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lh20/w0;


# direct methods
.method public synthetic constructor <init>(Lh20/w0;I)V
    .locals 0

    iput p2, p0, Lh20/u0;->w:I

    iput-object p1, p0, Lh20/u0;->x:Lh20/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lh20/u0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lq20/m;

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-direct {v0, v1, v1, v1, v2}, Lq20/m;-><init>(Lwz/h0;Lwz/u0;Ly00/j0;I)V

    iget-object v1, p0, Lh20/u0;->x:Lh20/w0;

    invoke-virtual {v1, v0}, Le30/c;->z(Lq20/y;)V

    invoke-virtual {v1}, Lh20/w0;->A()V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    sget-object v0, Lq20/j;->x:Lq20/j;

    iget-object v1, p0, Lh20/u0;->x:Lh20/w0;

    invoke-virtual {v1, v0}, Le30/c;->z(Lq20/y;)V

    invoke-virtual {v1}, Lh20/w0;->A()V

    goto :goto_0

    :pswitch_1
    iget-object v0, p0, Lh20/u0;->x:Lh20/w0;

    iget-object v1, v0, Le30/c;->w:Lh20/x1;

    iget-object v1, v1, Lh20/x1;->T:Lh20/q3;

    iget-object v1, v1, Lh20/q3;->x:Lh20/n3;

    sget-object v2, Lv00/s0;->G:Lt83/b;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lv00/s0;

    iget-object v6, v1, Lh20/n3;->w:Ljava/util/Map;

    invoke-static {v5}, Luf/c0;->O(Lv00/s0;)Lh20/o3;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh20/m3;

    const/4 v7, -0x1

    if-nez v6, :cond_1

    move v6, v7

    goto :goto_2

    :cond_1
    sget-object v8, Lh20/v0;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v8, v6

    :goto_2
    if-eq v6, v7, :cond_3

    const/4 v7, 0x1

    if-eq v6, v7, :cond_3

    const/4 v5, 0x2

    if-eq v6, v5, :cond_5

    const/4 v4, 0x3

    if-ne v6, v4, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    iget-object v6, v0, Lh20/w0;->c0:Lh20/f0;

    iget-boolean v6, v6, Lh20/f0;->E:Z

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    iget-object v6, v1, Lh20/n3;->x:Ljava/util/Map;

    invoke-static {v5}, Luf/c0;->O(Lv00/s0;)Lh20/o3;

    move-result-object v5

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lh20/p3;->x:Lh20/p3;

    if-ne v5, v6, :cond_0

    :cond_5
    :goto_3
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
