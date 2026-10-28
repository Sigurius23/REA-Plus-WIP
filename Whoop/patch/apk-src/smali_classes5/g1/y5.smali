.class public final Lg1/y5;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Lc93/a;

.field public w:I

.field public final synthetic x:Lg1/n5;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public constructor <init>(Lg1/n5;FFFLc93/a;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lg1/y5;->x:Lg1/n5;

    iput p2, p0, Lg1/y5;->y:F

    iput p3, p0, Lg1/y5;->z:F

    iput p4, p0, Lg1/y5;->E:F

    iput-object p5, p0, Lg1/y5;->F:Lc93/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    new-instance v0, Lg1/y5;

    iget v4, p0, Lg1/y5;->E:F

    iget-object v5, p0, Lg1/y5;->F:Lc93/a;

    iget-object v1, p0, Lg1/y5;->x:Lg1/n5;

    iget v2, p0, Lg1/y5;->y:F

    iget v3, p0, Lg1/y5;->z:F

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lg1/y5;-><init>(Lg1/n5;FFFLc93/a;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/y5;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/y5;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/y5;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/y5;->w:I

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

    iput v3, p0, Lg1/y5;->w:I

    sget p1, Lg1/g6;->a:F

    new-instance p1, Lg1/b6;

    const/4 v1, 0x0

    iget v3, p0, Lg1/y5;->y:F

    iget v4, p0, Lg1/y5;->z:F

    iget v5, p0, Lg1/y5;->E:F

    invoke-direct {p1, v3, v4, v5, v1}, Lg1/b6;-><init>(FFFLq83/d;)V

    sget-object v1, Lf0/z0;->w:Lf0/z0;

    iget-object v3, p0, Lg1/y5;->x:Lg1/n5;

    invoke-virtual {v3, v1, p1, p0}, Lg1/n5;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

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
    iget-object p1, p0, Lg1/y5;->F:Lc93/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    return-object v2
.end method
