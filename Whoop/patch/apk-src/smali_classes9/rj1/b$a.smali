.class public final Lrj1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003Jz\u0010\u0012\u001a\u00020\u0011\"\u0008\u0008\u0000\u0010\u0005*\u00020\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\u000b\u001a\u00020\n2:\u0010\u0010\u001a6\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000cH\u0086@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lrj1/b$a;",
        "",
        "<init>",
        "()V",
        "Lm7/r0;",
        "T",
        "",
        "records",
        "",
        "deletions",
        "Ltr2/n;",
        "logger",
        "Lkotlin/Function3;",
        "Lq83/d;",
        "Lpg3/v0;",
        "Ll83/a0;",
        "sendChunksCallback",
        "",
        "a",
        "(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;",
        "health-connect_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lrj1/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/util/List;Ltr2/n;Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lm7/r0;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ltr2/n;",
            "Lkotlin/jvm/functions/Function3;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p5

    instance-of v1, v0, Lrj1/b$a$a;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lrj1/b$a$a;

    iget v2, v1, Lrj1/b$a$a;->J:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lrj1/b$a$a;->J:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lrj1/b$a$a;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lrj1/b$a$a;-><init>(Lrj1/b$a;Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lrj1/b$a$a;->H:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lrj1/b$a$a;->J:I

    const/4 v5, 0x1

    const/16 v6, 0xa

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget v4, v1, Lrj1/b$a$a;->G:I

    iget-object v7, v1, Lrj1/b$a$a;->F:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/g0;

    iget-object v8, v1, Lrj1/b$a$a;->E:Ljava/lang/Object;

    check-cast v8, Lkotlin/jvm/internal/g0;

    iget-object v9, v1, Lrj1/b$a$a;->z:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/functions/Function3;

    iget-object v10, v1, Lrj1/b$a$a;->y:Ljava/lang/Object;

    check-cast v10, Ltr2/n;

    iget-object v11, v1, Lrj1/b$a$a;->x:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Lrj1/b$a$a;->w:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v18, v11

    move-object v11, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v10

    move-object v10, v8

    move-object/from16 v8, v18

    goto/16 :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object v0

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Iterable;

    const/4 v7, 0x0

    invoke-static {v4, v7}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v6}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    iput-object v4, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v4, Lkotlin/jvm/internal/g0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    move-object/from16 v8, p2

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8, v7}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v8, v6}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v8

    iput-object v8, v4, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object/from16 v8, p3

    move-object v9, v0

    move-object v12, v1

    move v15, v7

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object v7, v4

    move-object/from16 v4, p4

    :goto_1
    iget-object v10, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_4

    iget-object v10, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_4
    :goto_2
    sget-object v10, Lu02/a;->a:Lu02/a$a;

    new-instance v11, Lrj1/b$a$b;

    const/4 v13, 0x0

    invoke-direct {v11, v4, v9, v7, v13}, Lrj1/b$a$b;-><init>(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/internal/g0;Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object v0, v12, Lrj1/b$a$a;->w:Ljava/lang/Object;

    iput-object v1, v12, Lrj1/b$a$a;->x:Ljava/lang/Object;

    iput-object v8, v12, Lrj1/b$a$a;->y:Ljava/lang/Object;

    iput-object v4, v12, Lrj1/b$a$a;->z:Ljava/lang/Object;

    iput-object v9, v12, Lrj1/b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v12, Lrj1/b$a$a;->F:Ljava/lang/Object;

    iput v15, v12, Lrj1/b$a$a;->G:I

    iput v5, v12, Lrj1/b$a$a;->J:I

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v7

    move-object v7, v10

    const/4 v10, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x6

    move-object/from16 v17, v14

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_5

    return-object v3

    :cond_5
    move-object v9, v4

    move-object v11, v12

    move v4, v15

    move-object/from16 v10, v16

    move-object v12, v0

    move-object v0, v7

    move-object/from16 v7, v17

    :goto_3
    check-cast v0, Lu02/a;

    instance-of v0, v0, Lu02/a$b;

    if-eqz v0, :cond_6

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_6
    add-int/lit8 v15, v4, 0xa

    move-object v0, v12

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v15}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v6}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, v10, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v0, v1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v15}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v6}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v0

    iput-object v0, v7, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move-object v4, v9

    move-object v9, v10

    move-object v0, v12

    move-object v12, v11

    goto :goto_1
.end method
