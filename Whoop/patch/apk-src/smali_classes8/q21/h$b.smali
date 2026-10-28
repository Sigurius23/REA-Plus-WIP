.class public final Lq21/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq21/h;->g(Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc93/m;"
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x6b023fe0

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lq21/d$a;->a:Lq21/d$a;

    new-instance v4, Lq21/d$g;

    const-string v5, "YOUR PLAN"

    invoke-direct {v4, v5}, Lq21/d$g;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x3

    new-array v6, v5, [Lq21/d;

    aput-object v0, v6, v1

    aput-object v4, v6, v2

    aput-object v0, v6, v3

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    new-instance v6, Lq21/d$d;

    new-instance v7, Lkd1/o$a;

    sget v9, Luv0/b;->a:I

    invoke-direct {v7, v9}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v6, v7}, Lq21/d$d;-><init>(Lkd1/o;)V

    new-instance v7, Lq21/d$d;

    new-instance v9, Lkd1/o$a;

    sget v10, Luv0/b;->a:I

    invoke-direct {v9, v10}, Lkd1/o$a;-><init>(I)V

    invoke-direct {v7, v9}, Lq21/d$d;-><init>(Lkd1/o;)V

    new-array v9, v5, [Lq21/d;

    aput-object v0, v9, v1

    aput-object v6, v9, v2

    aput-object v7, v9, v3

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v6, Lq21/d$f;

    const-string v7, "Annual Cost"

    invoke-direct {v6, v7}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v7, Lq21/d$e;

    sget-object v9, Lq21/e;->h:Lq21/e$c;

    const-string v10, "ONE"

    invoke-virtual {v9, v10}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v11

    const-string v12, "$239"

    invoke-direct {v7, v12, v11}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    new-instance v11, Lq21/d$e;

    const-string v12, "$359"

    const-string v13, "LIFE"

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v14

    invoke-direct {v11, v12, v14}, Lq21/d$e;-><init>(Ljava/lang/String;Lq21/e;)V

    new-array v12, v5, [Lq21/d;

    aput-object v6, v12, v1

    aput-object v7, v12, v2

    aput-object v11, v12, v3

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lq21/d$f;

    const-string v11, "All Peak Features"

    invoke-direct {v7, v11}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v11, Lq21/d$c;

    sget-object v12, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    invoke-virtual {v9, v10}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v10

    invoke-direct {v11, v12, v10}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-instance v10, Lq21/d$c;

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v14

    invoke-direct {v10, v12, v14}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v14, v5, [Lq21/d;

    aput-object v7, v14, v1

    aput-object v11, v14, v2

    aput-object v10, v14, v3

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v10, Lq21/d$f;

    const-string v11, "AFib / Irregular Rythms"

    invoke-direct {v10, v11}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v11, Lq21/d$f;

    const-string v14, "-"

    invoke-direct {v11, v14}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v15, Lq21/d$c;

    move/from16 v16, v2

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v2

    invoke-direct {v15, v12, v2}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v2, v5, [Lq21/d;

    aput-object v10, v2, v1

    aput-object v11, v2, v16

    aput-object v15, v2, v3

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    new-instance v10, Lq21/d$f;

    const-string v11, "ECG Heart Screener"

    invoke-direct {v10, v11}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v11, Lq21/d$f;

    invoke-direct {v11, v14}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v15, Lq21/d$c;

    move/from16 v17, v3

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v3

    invoke-direct {v15, v12, v3}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v3, v5, [Lq21/d;

    aput-object v10, v3, v1

    aput-object v11, v3, v16

    aput-object v15, v3, v17

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v10, Lq21/d$f;

    const-string v11, "Relative Blood Pressure"

    invoke-direct {v10, v11}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v11, Lq21/d$f;

    invoke-direct {v11, v14}, Lq21/d$f;-><init>(Ljava/lang/String;)V

    new-instance v14, Lq21/d$c;

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v15

    invoke-direct {v14, v12, v15}, Lq21/d$c;-><init>(Lgz0/m0;Lq21/e;)V

    new-array v12, v5, [Lq21/d;

    aput-object v10, v12, v1

    aput-object v11, v12, v16

    aput-object v14, v12, v17

    invoke-static {v12}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    const/4 v11, 0x7

    new-array v11, v11, [Ljava/util/List;

    aput-object v4, v11, v1

    aput-object v0, v11, v16

    aput-object v6, v11, v17

    aput-object v7, v11, v5

    const/4 v0, 0x4

    aput-object v2, v11, v0

    const/4 v0, 0x5

    aput-object v3, v11, v0

    const/4 v0, 0x6

    aput-object v10, v11, v0

    invoke-static {v11}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    invoke-virtual {v9, v13}, Lq21/e$c;->a(Ljava/lang/String;)Lq21/e;

    move-result-object v0

    invoke-virtual {v0}, Lq21/e;->c()Li2/t;

    move-result-object v17

    new-instance v14, Lq21/i;

    const/16 v21, 0x20

    const/16 v22, 0x0

    const/4 v15, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v14 .. v22}, Lq21/i;-><init>(ILjava/util/List;Li2/t;Lny0/h;Lny0/p0;Lq21/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, v14

    invoke-static/range {v5 .. v10}, Lq21/g;->e(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    return-void

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lq21/h$b;->a(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
