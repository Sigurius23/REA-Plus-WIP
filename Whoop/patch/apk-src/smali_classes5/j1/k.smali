.class public final Lj1/k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public w:I

.field public final synthetic x:Lj1/l;

.field public final synthetic y:F


# direct methods
.method public constructor <init>(Lj1/l;FLq83/d;)V
    .locals 0

    iput-object p1, p0, Lj1/k;->x:Lj1/l;

    iput p2, p0, Lj1/k;->y:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3

    new-instance v0, Lj1/k;

    iget-object v1, p0, Lj1/k;->x:Lj1/l;

    iget v2, p0, Lj1/k;->y:F

    invoke-direct {v0, v1, v2, p1}, Lj1/k;-><init>(Lj1/l;FLq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lj1/k;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lj1/k;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lj1/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lj1/k;->w:I

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

    iget-object p1, p0, Lj1/k;->x:Lj1/l;

    iget-object v1, p1, Lj1/l;->e:Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v3

    new-instance v6, Lhb2/f;

    const/16 v1, 0x11

    invoke-direct {v6, p1, v1}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    iput v2, p0, Lj1/k;->w:I

    iget v4, p0, Lj1/k;->y:F

    const/4 v5, 0x0

    const/16 v8, 0xc

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
