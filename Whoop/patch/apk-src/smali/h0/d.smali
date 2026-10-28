.class public final Lh0/d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lh0/p;

.field public final synthetic F:Ld0/l;

.field public w:I

.field public synthetic x:Lh0/a;

.field public synthetic y:Lh0/h1;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/p;Ld0/l;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/d;->E:Lh0/p;

    iput-object p2, p0, Lh0/d;->F:Ld0/l;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lh0/a;

    check-cast p2, Lh0/h1;

    check-cast p4, Lq83/d;

    new-instance v0, Lh0/d;

    iget-object v1, p0, Lh0/d;->E:Lh0/p;

    iget-object v2, p0, Lh0/d;->F:Ld0/l;

    invoke-direct {v0, v1, v2, p4}, Lh0/d;-><init>(Lh0/p;Ld0/l;Lq83/d;)V

    iput-object p1, v0, Lh0/d;->x:Lh0/a;

    iput-object p2, v0, Lh0/d;->y:Lh0/h1;

    iput-object p3, v0, Lh0/d;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lh0/d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/d;->x:Lh0/a;

    iget-object v1, p0, Lh0/d;->y:Lh0/h1;

    iget-object v3, p0, Lh0/d;->z:Ljava/lang/Object;

    iget-object v4, p0, Lh0/d;->E:Lh0/p;

    iget-object v5, v4, Lh0/p;->g:Lp1/g1;

    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v8

    const/4 v5, 0x0

    iput-object v5, p0, Lh0/d;->x:Lh0/a;

    iput-object v5, p0, Lh0/d;->y:Lh0/h1;

    iput v2, p0, Lh0/d;->w:I

    check-cast v1, Lh0/x;

    invoke-virtual {v1, v3}, Lh0/x;->e(Ljava/lang/Object;)F

    move-result v7

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v4, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    iget-object v2, v4, Lh0/p;->f:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    :goto_0
    iput v2, v1, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_4

    iget v6, v1, Lkotlin/jvm/internal/d0;->w:F

    cmpg-float v2, v6, v7

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    new-instance v10, Lbp0/q;

    const/4 v2, 0x1

    invoke-direct {v10, v2, p1, v1}, Lbp0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object v9, p0, Lh0/d;->F:Ld0/l;

    move-object v11, p0

    invoke-static/range {v6 .. v11}, Ld0/f;->c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lr83/a;->w:Lr83/a;

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
