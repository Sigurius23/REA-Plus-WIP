.class public final Luf/y;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Luf/u;

.field public final synthetic F:Lc93/m;

.field public G:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lrg/h;

.field public final synthetic z:Luf/s;


# direct methods
.method public constructor <init>(Lrg/h;Lq83/d;Luf/s;Luf/u;Lc93/m;)V
    .locals 0

    iput-object p1, p0, Luf/y;->y:Lrg/h;

    iput-object p3, p0, Luf/y;->z:Luf/s;

    iput-object p4, p0, Luf/y;->E:Luf/u;

    iput-object p5, p0, Luf/y;->F:Lc93/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    new-instance v0, Luf/y;

    iget-object v4, p0, Luf/y;->E:Luf/u;

    iget-object v5, p0, Luf/y;->F:Lc93/m;

    iget-object v1, p0, Luf/y;->y:Lrg/h;

    iget-object v3, p0, Luf/y;->z:Luf/s;

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Luf/y;-><init>(Lrg/h;Lq83/d;Luf/s;Luf/u;Lc93/m;)V

    iput-object p1, v0, Luf/y;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Luf/y;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Luf/y;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Luf/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Luf/y;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Luf/y;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Luf/y;->G:I

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v4, p0, Luf/y;->x:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Luf/y;->G:I

    iput v3, p0, Luf/y;->w:I

    iget-object p1, p0, Luf/y;->z:Luf/s;

    iget-object v3, p0, Luf/y;->E:Luf/u;

    invoke-virtual {p1, v3, p0}, Luf/s;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iput-object v4, p0, Luf/y;->x:Ljava/lang/Object;

    iput v1, p0, Luf/y;->G:I

    iput v2, p0, Luf/y;->w:I

    iget-object v1, p0, Luf/y;->F:Lc93/m;

    invoke-interface {v1, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    return-object p1
.end method
