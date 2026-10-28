.class public final Lq20/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public w:I

.field public final synthetic x:Lpg3/p;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lpg3/p;ILjava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lq20/f;->x:Lpg3/p;

    iput p2, p0, Lq20/f;->y:I

    iput-object p3, p0, Lq20/f;->z:Ljava/lang/String;

    iput-object p4, p0, Lq20/f;->E:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Lq20/f;

    iget-object v3, p0, Lq20/f;->z:Ljava/lang/String;

    iget-object v4, p0, Lq20/f;->E:Ljava/lang/String;

    iget-object v1, p0, Lq20/f;->x:Lpg3/p;

    iget v2, p0, Lq20/f;->y:I

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lq20/f;-><init>(Lpg3/p;ILjava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lq20/f;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq20/f;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lq20/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lq20/f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lq20/f;->x:Lpg3/p;

    iget-object p1, p1, Lpg3/p;->x:Ljava/lang/Object;

    check-cast p1, Lq20/l;

    new-instance v1, Ljava/lang/Integer;

    iget v3, p0, Lq20/f;->y:I

    invoke-direct {v1, v3}, Ljava/lang/Integer;-><init>(I)V

    iput v2, p0, Lq20/f;->w:I

    invoke-virtual {p1}, Lq20/l;->a()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lq20/f;->E:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-static {p1, v3, v1, v2, p0}, Lq20/l;->b(Lq20/l;ILjava/lang/Integer;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lq20/f;->z:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-static {p1, v3, v1, v2, p0}, Lq20/l;->b(Lq20/l;ILjava/lang/Integer;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {p1, v3, v1}, Lq20/l;->c(Lq20/l;ILjava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method
