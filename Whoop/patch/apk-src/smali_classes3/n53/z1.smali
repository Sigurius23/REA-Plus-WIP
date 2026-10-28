.class public final Ln53/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/m;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lec3/m;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p3, p0, Ln53/z1;->w:I

    iput-object p1, p0, Ln53/z1;->x:Lec3/m;

    iput-object p2, p0, Ln53/z1;->y:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Ln53/z1;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lq40/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lq40/e;

    iget v1, v0, Lq40/e;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lq40/e;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lq40/e;

    invoke-direct {v0, p0, p2}, Lq40/e;-><init>(Ln53/z1;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lq40/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lq40/e;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ln53/z1;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, Lq40/e;->x:I

    iget-object p2, p0, Ln53/z1;->x:Lec3/m;

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    :pswitch_0
    instance-of v0, p2, Ln53/y1;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Ln53/y1;

    iget v1, v0, Ln53/y1;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_4

    sub-int/2addr v1, v2

    iput v1, v0, Ln53/y1;->x:I

    goto :goto_3

    :cond_4
    new-instance v0, Ln53/y1;

    invoke-direct {v0, p0, p2}, Ln53/y1;-><init>(Ln53/z1;Lq83/d;)V

    :goto_3
    iget-object p2, v0, Ln53/y1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ln53/y1;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_6

    if-ne v2, v3, :cond_5

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ln53/z1;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput v3, v0, Ln53/y1;->x:I

    iget-object p2, p0, Ln53/z1;->x:Lec3/m;

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
