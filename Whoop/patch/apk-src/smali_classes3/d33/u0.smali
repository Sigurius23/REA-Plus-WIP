.class public final Ld33/u0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public w:I

.field public final synthetic x:Ld33/h1;

.field public final synthetic y:Ljava/util/List;

.field public final synthetic z:Ljava/util/List;


# direct methods
.method public constructor <init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V
    .locals 0

    iput-object p1, p0, Ld33/u0;->x:Ld33/h1;

    iput-object p2, p0, Ld33/u0;->y:Ljava/util/List;

    iput-object p3, p0, Ld33/u0;->z:Ljava/util/List;

    iput-boolean p4, p0, Ld33/u0;->E:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Ld33/u0;

    iget-object v3, p0, Ld33/u0;->z:Ljava/util/List;

    iget-boolean v4, p0, Ld33/u0;->E:Z

    iget-object v1, p0, Ld33/u0;->x:Ld33/h1;

    iget-object v2, p0, Ld33/u0;->y:Ljava/util/List;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ld33/u0;-><init>(Ld33/h1;Ljava/util/List;Ljava/util/List;ZLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld33/u0;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld33/u0;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld33/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld33/u0;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld33/u0;->x:Ld33/h1;

    iget-object v1, p1, Ld33/h1;->z:Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Le33/v0;

    if-eqz v5, :cond_3

    iget-object v9, p1, Ld33/h1;->x:Lbi/p;

    iput v3, p0, Ld33/u0;->w:I

    new-instance v4, Le33/t0;

    const/4 v10, 0x0

    iget-boolean v6, p0, Ld33/u0;->E:Z

    iget-object v7, p0, Ld33/u0;->y:Ljava/util/List;

    iget-object v8, p0, Ld33/u0;->z:Ljava/util/List;

    invoke-direct/range {v4 .. v10}, Le33/t0;-><init>(Le33/v0;ZLjava/util/List;Ljava/util/List;Lbi/p;Lq83/d;)V

    invoke-static {v4, p0}, Lvd/e;->X(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    return-object v2
.end method
