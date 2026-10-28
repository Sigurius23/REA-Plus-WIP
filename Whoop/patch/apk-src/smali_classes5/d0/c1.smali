.class public final Ld0/c1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ld0/z1;

.field public final synthetic F:F

.field public w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ld0/f1;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V
    .locals 0

    iput-object p1, p0, Ld0/c1;->x:Ljava/lang/Object;

    iput-object p2, p0, Ld0/c1;->y:Ljava/lang/Object;

    iput-object p3, p0, Ld0/c1;->z:Ld0/f1;

    iput-object p4, p0, Ld0/c1;->E:Ld0/z1;

    iput p5, p0, Ld0/c1;->F:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Ld0/c1;

    iget-object v4, p0, Ld0/c1;->E:Ld0/z1;

    iget v5, p0, Ld0/c1;->F:F

    iget-object v1, p0, Ld0/c1;->x:Ljava/lang/Object;

    iget-object v2, p0, Ld0/c1;->y:Ljava/lang/Object;

    iget-object v3, p0, Ld0/c1;->z:Ld0/f1;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ld0/c1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ld0/c1;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ld0/c1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ld0/c1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ld0/c1;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v3, Ld0/b1;

    iget v8, p0, Ld0/c1;->F:F

    const/4 v9, 0x0

    iget-object v4, p0, Ld0/c1;->x:Ljava/lang/Object;

    iget-object v5, p0, Ld0/c1;->y:Ljava/lang/Object;

    iget-object v6, p0, Ld0/c1;->z:Ld0/f1;

    iget-object v7, p0, Ld0/c1;->E:Ld0/z1;

    invoke-direct/range {v3 .. v9}, Ld0/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ld0/f1;Ld0/z1;FLq83/d;)V

    iput v2, p0, Ld0/c1;->w:I

    invoke-static {v3, p0}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
