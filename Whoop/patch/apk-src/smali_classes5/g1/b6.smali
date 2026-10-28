.class public final Lg1/b6;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:F

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public constructor <init>(FFFLq83/d;)V
    .locals 0

    iput p1, p0, Lg1/b6;->y:F

    iput p2, p0, Lg1/b6;->z:F

    iput p3, p0, Lg1/b6;->E:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    new-instance v0, Lg1/b6;

    iget v1, p0, Lg1/b6;->z:F

    iget v2, p0, Lg1/b6;->E:F

    iget v3, p0, Lg1/b6;->y:F

    invoke-direct {v0, v3, v1, v2, p2}, Lg1/b6;-><init>(FFFLq83/d;)V

    iput-object p1, v0, Lg1/b6;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lh0/g1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/b6;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/b6;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/b6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lg1/b6;->w:I

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

    iget-object p1, p0, Lg1/b6;->x:Ljava/lang/Object;

    check-cast p1, Lh0/g1;

    new-instance v1, Lkotlin/jvm/internal/d0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget v3, p0, Lg1/b6;->y:F

    iput v3, v1, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v3}, Ld0/f;->a(F)Ld0/e;

    move-result-object v4

    new-instance v5, Ljava/lang/Float;

    iget v3, p0, Lg1/b6;->z:F

    invoke-direct {v5, v3}, Ljava/lang/Float;-><init>(F)V

    sget-object v6, Lg1/g6;->g:Ld0/e2;

    new-instance v7, Ljava/lang/Float;

    iget v3, p0, Lg1/b6;->E:F

    invoke-direct {v7, v3}, Ljava/lang/Float;-><init>(F)V

    new-instance v8, Lg1/a6;

    const/4 v3, 0x0

    invoke-direct {v8, p1, v1, v3}, Lg1/a6;-><init>(Lh0/g1;Lkotlin/jvm/internal/d0;I)V

    iput v2, p0, Lg1/b6;->w:I

    move-object v9, p0

    invoke-virtual/range {v4 .. v9}, Ld0/e;->c(Ljava/lang/Object;Ld0/l;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
