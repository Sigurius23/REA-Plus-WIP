.class public final Lu10/c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lu10/d;


# direct methods
.method public synthetic constructor <init>(Lu10/d;Lq83/d;I)V
    .locals 0

    iput p3, p0, Lu10/c;->w:I

    iput-object p1, p0, Lu10/c;->z:Lu10/d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget v0, p0, Lu10/c;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lu10/c;

    iget-object v1, p0, Lu10/c;->z:Lu10/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p2, v2}, Lu10/c;-><init>(Lu10/d;Lq83/d;I)V

    iput-object p1, v0, Lu10/c;->y:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lu10/c;

    iget-object v1, p0, Lu10/c;->z:Lu10/d;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lu10/c;-><init>(Lu10/d;Lq83/d;I)V

    iput-object p1, v0, Lu10/c;->y:Ljava/lang/Object;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lu10/c;->w:I

    check-cast p1, Ly00/o4;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lu10/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu10/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu10/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lu10/c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lu10/c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lu10/c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lu10/c;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lu10/c;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lu10/c;->y:Ljava/lang/Object;

    check-cast p1, Ly00/o4;

    iget-object v1, p0, Lu10/c;->z:Lu10/d;

    iget-object v1, v1, Lu10/d;->a:Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh20/z4;

    iput v2, p0, Lu10/c;->x:I

    invoke-virtual {v1, p1, p0}, Lh20/z4;->d(Ly00/o4;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_1
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lu10/c;->z:Lu10/d;

    iget-object v1, v0, Lu10/d;->d:Ls10/f;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lu10/c;->x:I

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    if-ne v3, v4, :cond_3

    iget-object v0, p0, Lu10/c;->y:Ljava/lang/Object;

    check-cast v0, Ly00/o4;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lu10/c;->y:Ljava/lang/Object;

    check-cast p1, Ly00/o4;

    iget-object v0, v0, Lu10/d;->a:Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh20/z4;

    iput-object p1, p0, Lu10/c;->y:Ljava/lang/Object;

    iput v4, p0, Lu10/c;->x:I

    invoke-virtual {v0, p1, p0}, Lh20/z4;->b(Ly00/o4;Ls83/c;)Ljava/io/Serializable;

    move-result-object v0

    if-ne v0, v2, :cond_5

    goto :goto_5

    :cond_5
    move-object v5, v0

    move-object v0, p1

    move-object p1, v5

    :goto_2
    move-object v2, p1

    check-cast v2, Ljava/lang/Throwable;

    if-nez v2, :cond_8

    iget-object p1, v1, Ls10/f;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq20/y;

    iget-object v0, v0, Ly00/o4;->w:Ljava/lang/String;

    instance-of v3, p1, Lq20/w;

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    check-cast p1, Lq20/w;

    goto :goto_3

    :cond_6
    move-object p1, v4

    :goto_3
    if-eqz p1, :cond_7

    iget-object p1, p1, Lq20/w;->x:Ly00/o4;

    if-eqz p1, :cond_7

    iget-object p1, p1, Ly00/o4;->w:Ljava/lang/String;

    goto :goto_4

    :cond_7
    move-object p1, v4

    :goto_4
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v1, v4}, Ls10/f;->a(Lq20/y;)V

    :cond_8
    :goto_5
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
