.class public final Ll1/v3;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Ll1/w3;

.field public final synthetic F:F

.field public final synthetic G:Ld0/c0;

.field public w:I

.field public synthetic x:Lm1/f;

.field public synthetic y:Lm1/b0;

.field public synthetic z:Ll1/x3;


# direct methods
.method public constructor <init>(Ll1/w3;FLd0/c0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ll1/v3;->E:Ll1/w3;

    iput p2, p0, Ll1/v3;->F:F

    iput-object p3, p0, Ll1/v3;->G:Ld0/c0;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    check-cast p1, Lm1/f;

    check-cast p2, Lm1/b0;

    check-cast p3, Ll1/x3;

    check-cast p4, Lq83/d;

    new-instance v0, Ll1/v3;

    iget v1, p0, Ll1/v3;->F:F

    iget-object v2, p0, Ll1/v3;->G:Ld0/c0;

    iget-object v3, p0, Ll1/v3;->E:Ll1/w3;

    invoke-direct {v0, v3, v1, v2, p4}, Ll1/v3;-><init>(Ll1/w3;FLd0/c0;Lq83/d;)V

    iput-object p1, v0, Ll1/v3;->x:Lm1/f;

    iput-object p2, v0, Ll1/v3;->y:Lm1/b0;

    iput-object p3, v0, Ll1/v3;->z:Ll1/x3;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ll1/v3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll1/v3;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll1/v3;->x:Lm1/f;

    iget-object v1, p0, Ll1/v3;->y:Lm1/b0;

    iget-object v3, p0, Ll1/v3;->z:Ll1/x3;

    invoke-virtual {v1, v3}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v3, p0, Ll1/v3;->E:Ll1/w3;

    iget-object v4, v3, Ll1/w3;->e:Lm1/g;

    iget-object v4, v4, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v4}, Lp1/g1;->x()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_2

    const/4 v3, 0x0

    :goto_0
    move v4, v3

    goto :goto_1

    :cond_2
    iget-object v3, v3, Ll1/w3;->e:Lm1/g;

    iget-object v3, v3, Lm1/g;->j:Lp1/g1;

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v3

    goto :goto_0

    :goto_1
    iput v4, v1, Lkotlin/jvm/internal/d0;->w:F

    new-instance v8, Ll1/u3;

    const/4 v3, 0x0

    invoke-direct {v8, p1, v1, v3}, Ll1/u3;-><init>(Lm1/f;Lkotlin/jvm/internal/d0;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Ll1/v3;->x:Lm1/f;

    iput-object p1, p0, Ll1/v3;->y:Lm1/b0;

    iput v2, p0, Ll1/v3;->w:I

    iget v6, p0, Ll1/v3;->F:F

    iget-object v7, p0, Ll1/v3;->G:Ld0/c0;

    move-object v9, p0

    invoke-static/range {v4 .. v9}, Ld0/f;->c(FFFLd0/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
