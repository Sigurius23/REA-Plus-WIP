.class public final Lo92/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lo92/c0;",
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
        "defaultBody",
        "Landroid/content/Context;",
        "context",
        "Lo92/d0;",
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

    iput-object p1, p0, Lo92/c0;->a:Lhf1/b;

    invoke-interface {p2}, Lci2/b;->b()Lec3/t1;

    move-result-object p1

    new-instance p2, Lch/i;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lo92/c0$b;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lo92/c0$b;-><init>(Lq83/d;)V

    invoke-static {p2, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    sget-object p2, Lec3/z1;->a:Lec3/b2;

    sget-object v0, Ljk0/a;->UNKNOWN:Ljk0/a;

    invoke-static {p1, p3, p2, v0}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lo92/c0;->b:Lec3/f2;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/content/Context;Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lq83/d<",
            "-",
            "Lo92/d0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lo92/c0$a;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lo92/c0$a;

    iget v3, v2, Lo92/c0$a;->G:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lo92/c0$a;->G:I

    :goto_0
    move-object v9, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lo92/c0$a;

    invoke-direct {v2, v0, v1}, Lo92/c0$a;-><init>(Lo92/c0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v9, Lo92/c0$a;->E:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v9, Lo92/c0$a;->G:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget v2, v9, Lo92/c0$a;->z:I

    iget-object v3, v9, Lo92/c0$a;->y:Ljava/lang/Object;

    check-cast v3, Ljk0/a;

    iget-object v4, v9, Lo92/c0$a;->x:Ljava/lang/Object;

    check-cast v4, Landroid/content/Context;

    iget-object v5, v9, Lo92/c0$a;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v4

    move-object v13, v5

    goto :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lo92/c0;->b:Lec3/f2;

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljk0/a;

    sget-object v3, Ljk0/a;->STRAP_OFF_BODY:Ljk0/a;

    if-ne v1, v3, :cond_3

    move v12, v4

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    move v12, v3

    :goto_2
    iget-object v3, v0, Lo92/c0;->a:Lhf1/b;

    new-instance v13, Llf1/b;

    const/16 v18, 0xf

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Llf1/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v13

    move-object/from16 v13, p1

    iput-object v13, v9, Lo92/c0$a;->w:Ljava/lang/Object;

    move-object/from16 v14, p2

    iput-object v14, v9, Lo92/c0$a;->x:Ljava/lang/Object;

    iput-object v1, v9, Lo92/c0$a;->y:Ljava/lang/Object;

    iput v12, v9, Lo92/c0$a;->z:I

    iput v4, v9, Lo92/c0$a;->G:I

    move-object v4, v5

    const-wide/16 v5, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/16 v10, 0xa

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lhf1/b;->d(Lhf1/b;Lhf1/a;JZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_4

    return-object v2

    :cond_4
    move-object v2, v3

    move-object v3, v1

    move-object v1, v2

    move v2, v12

    :goto_3
    check-cast v1, Ljava/lang/String;

    const-string v4, "test_variant"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    if-eqz v2, :cond_5

    sget v2, Lhi0/j;->e1:I

    invoke-virtual {v14, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, "getString(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    :cond_5
    new-instance v2, Lo92/d0;

    invoke-direct {v2, v13, v1, v3}, Lo92/d0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljk0/a;)V

    return-object v2
.end method
