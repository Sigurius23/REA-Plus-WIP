.class public final Lo92/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo92/j0;",
        "",
        "Lhf1/b;",
        "experimentsChecker",
        "Lci2/b;",
        "whoopStrapProvider",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lhf1/b;Lci2/b;Lbc3/c0;)V",
        "",
        "defaultTitle",
        "Landroid/content/Context;",
        "context",
        "Lo92/k0;",
        "a",
        "(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;",
        "Lhf1/b;",
        "Lec3/f2;",
        "Ljk0/a;",
        "b",
        "Lec3/f2;",
        "strapBodyStatusFlow",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lhf1/b;

.field private final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhf1/b;Lci2/b;Lbc3/c0;)V
    .locals 1

    const-string v0, "experimentsChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo92/j0;->a:Lhf1/b;

    invoke-interface {p2}, Lci2/b;->b()Lec3/t1;

    move-result-object p1

    new-instance p2, Lch/i;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lo92/j0$b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lo92/j0$b;-><init>(Lq83/d;)V

    invoke-static {p2, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    sget-object v0, Ljk0/a;->UNKNOWN:Ljk0/a;

    invoke-static {p1, p3, p2, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lo92/j0;->b:Lec3/f2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lo92/k0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p3

    instance-of v1, v0, Lo92/j0$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lo92/j0$a;

    iget v2, v1, Lo92/j0$a;->G:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lo92/j0$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v1, Lo92/j0$a;

    invoke-direct {v1, p0, v0}, Lo92/j0$a;-><init>(Lo92/j0;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lo92/j0$a;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lo92/j0$a;->G:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v1, Lo92/j0$a;->z:I

    iget-object v3, v1, Lo92/j0$a;->y:Ljava/lang/Object;

    check-cast v3, Ljk0/a;

    iget-object v4, v1, Lo92/j0$a;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v1, v1, Lo92/j0$a;->w:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lo92/j0;->b:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljk0/a;

    sget-object v0, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    if-ne v3, v0, :cond_3

    move v0, v4

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iget-object v5, p0, Lo92/j0;->a:Lhf1/b;

    new-instance v6, Llf1/k;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Llf1/k;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    iput-object p1, v1, Lo92/j0$a;->w:Ljava/lang/Object;

    move-object v8, p2

    iput-object v8, v1, Lo92/j0$a;->x:Ljava/lang/Object;

    iput-object v3, v1, Lo92/j0$a;->y:Ljava/lang/Object;

    iput v0, v1, Lo92/j0$a;->z:I

    iput v4, v1, Lo92/j0$a;->G:I

    invoke-interface {v5, v7, v4, v1}, Lhf1/b;->e(Lhf1/a;ZLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_4

    return-object v2

    :cond_4
    move v2, v0

    move-object v0, v1

    move-object v4, v8

    move-object v1, p1

    :goto_2
    check-cast v0, Ljava/lang/String;

    const-string v5, "test_variant"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eqz v2, :cond_5

    sget v1, Lhi0/j;->m1:I

    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v2, Lo92/k0;

    invoke-direct {v2, v1, v0, v3}, Lo92/k0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljk0/a;)V

    return-object v2
.end method
