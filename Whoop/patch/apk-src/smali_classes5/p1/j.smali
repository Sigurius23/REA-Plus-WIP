.class public final Lp1/j;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:I

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lp1/k;

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lp1/k;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp1/j;->G:Lp1/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2

    new-instance v0, Lp1/j;

    iget-object v1, p0, Lp1/j;->G:Lp1/k;

    invoke-direct {v0, v1, p2}, Lp1/j;-><init>(Lp1/k;Lq83/d;)V

    iput-object p1, v0, Lp1/j;->F:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp1/j;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp1/j;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp1/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lp1/j;->G:Lp1/k;

    iget-object v1, v0, Lp1/k;->w:La0/q0;

    iget-object v2, v0, Lp1/k;->y:La0/f0;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lp1/j;->E:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    iget v4, p0, Lp1/j;->z:I

    iget v6, p0, Lp1/j;->y:I

    iget v7, p0, Lp1/j;->x:I

    iget-object v8, p0, Lp1/j;->F:Ljava/lang/Object;

    check-cast v8, Lxb3/j;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp1/j;->F:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lxb3/j;

    const/4 v4, 0x0

    move v6, v4

    move v7, v6

    :goto_0
    iget p1, v0, Lp1/k;->z:I

    iget v9, v2, La0/f0;->b:I

    invoke-static {p1, v9}, Ljava/lang/Math;->min(II)I

    move-result p1

    if-ge v7, p1, :cond_2

    add-int/lit8 p1, v7, 0x1

    invoke-virtual {v2, v7}, La0/f0;->c(I)I

    move-result v9

    const/16 v10, 0x20

    packed-switch v9, :pswitch_data_0

    const-string v0, "unknown op: "

    invoke-static {v9, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "reuse "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lp1/k;->x:La0/q0;

    add-int/lit8 v2, v4, 0x1

    invoke-virtual {v0, v4}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move v4, v2

    goto/16 :goto_2

    :pswitch_1
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v1, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v2

    const-string v9, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v9, 0x2

    invoke-static {v9, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    check-cast v2, Lc93/m;

    add-int/lit8 v6, v6, 0x2

    invoke-virtual {v1, v0}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v9, "apply "

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_2

    :pswitch_2
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v2, p1}, La0/f0;->c(I)I

    move-result p1

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v1, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "insertTopDown "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    move v6, v0

    move-object v0, p1

    move p1, v6

    move v6, v2

    goto/16 :goto_2

    :pswitch_3
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v2, p1}, La0/f0;->c(I)I

    move-result p1

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v1, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "insertBottomUp "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :pswitch_4
    const-string v0, "clear"

    goto :goto_2

    :pswitch_5
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v2, p1}, La0/f0;->c(I)I

    move-result p1

    add-int/lit8 v1, v7, 0x3

    invoke-virtual {v2, v0}, La0/f0;->c(I)I

    move-result v0

    add-int/lit8 v9, v7, 0x4

    invoke-virtual {v2, v1}, La0/f0;->c(I)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v11, "move "

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move p1, v9

    goto :goto_2

    :pswitch_6
    add-int/lit8 v0, v7, 0x2

    invoke-virtual {v2, p1}, La0/f0;->c(I)I

    move-result p1

    add-int/lit8 v1, v7, 0x3

    invoke-virtual {v2, v0}, La0/f0;->c(I)I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v9, "remove "

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move p1, v1

    goto :goto_2

    :pswitch_7
    add-int/lit8 v0, v6, 0x1

    invoke-virtual {v1, v6}, La0/q0;->e(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "down "

    invoke-static {v1, v2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move v6, v0

    move-object v0, v1

    goto :goto_2

    :pswitch_8
    const-string v0, "up"

    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ": "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v8, p0, Lp1/j;->F:Ljava/lang/Object;

    iput p1, p0, Lp1/j;->x:I

    iput v6, p0, Lp1/j;->y:I

    iput v4, p0, Lp1/j;->z:I

    iput v5, p0, Lp1/j;->E:I

    invoke-virtual {v8, v0, p0}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    return-object v3

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

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
