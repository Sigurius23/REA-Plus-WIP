.class final Lis0/z$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis0/z;->v(Lf0/r1;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lkotlin/jvm/internal/e0;

.field final synthetic x:Lf0/r1;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/e0;Lf0/r1;)V
    .locals 0

    iput-object p1, p0, Lis0/z$f;->w:Lkotlin/jvm/internal/e0;

    iput-object p2, p0, Lis0/z$f;->x:Lf0/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ILq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lis0/z$f$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lis0/z$f$a;

    iget v1, v0, Lis0/z$f$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lis0/z$f$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lis0/z$f$a;

    invoke-direct {v0, p0, p2}, Lis0/z$f$a;-><init>(Lis0/z$f;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lis0/z$f$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lis0/z$f$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lis0/z$f$a;->w:I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lis0/z$f;->w:Lkotlin/jvm/internal/e0;

    iget p2, p2, Lkotlin/jvm/internal/e0;->w:I

    if-le p1, p2, :cond_3

    iget-object p2, p0, Lis0/z$f;->x:Lf0/r1;

    iget-object p2, p2, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {p2}, Lp1/h1;->x()I

    move-result p2

    iget-object v2, p0, Lis0/z$f;->w:Lkotlin/jvm/internal/e0;

    iget v2, v2, Lkotlin/jvm/internal/e0;->w:I

    if-lt p2, v2, :cond_3

    iget-object p2, p0, Lis0/z$f;->x:Lf0/r1;

    iput p1, v0, Lis0/z$f$a;->w:I

    iput v3, v0, Lis0/z$f$a;->z:I

    invoke-virtual {p2, p1, v0}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p2, p0, Lis0/z$f;->w:Lkotlin/jvm/internal/e0;

    iput p1, p2, Lkotlin/jvm/internal/e0;->w:I

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1, p2}, Lis0/z$f;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
