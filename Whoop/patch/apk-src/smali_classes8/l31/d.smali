.class public abstract Ll31/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0005\u00a8\u0006\u0008"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "a",
        "Lcom/whoop/design/util/TextResource;",
        "CARDIO",
        "MUSCULAR",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lcom/whoop/design/util/TextResource;

.field private static final b:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "CARDIO"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Ll31/d;->a:Lcom/whoop/design/util/TextResource;

    const-string v0, "MUSCULAR"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sput-object v0, Ll31/d;->b:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll31/d;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move/from16 v0, p1

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    move-object/from16 v2, p0

    check-cast v2, Lp1/q;

    const v3, 0x5e6c1d28

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v2, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v7, Ly01/c;

    new-instance v8, Ll83/k;

    const/high16 v9, 0x41200000    # 10.0f

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    const/high16 v10, 0x42b40000    # 90.0f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v9, Ll31/d;->a:Lcom/whoop/design/util/TextResource;

    sget-object v14, Ll31/d;->b:Lcom/whoop/design/util/TextResource;

    const-string v10, "10%"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    const-string v10, "90%"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/16 v15, 0x60

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    invoke-direct/range {v7 .. v16}, Ly01/c;-><init>(Ll83/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x6

    invoke-static {v6, v7, v2, v8, v3}, Ly01/b;->f(Landroidx/compose/ui/Modifier;Ly01/c;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6, v6, v5, v2}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "50%"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_1

    sget-object v1, Ll31/d$a;->w:Ll31/d$a;

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    new-instance v11, Ly01/c;

    const/16 v18, 0x0

    const/16 v19, 0x40

    const/16 v20, 0x0

    move-object v13, v9

    move-object v14, v10

    invoke-direct/range {v11 .. v20}, Ly01/c;-><init>(Ll83/k;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v11, v2, v8, v3}, Ly01/b;->f(Landroidx/compose/ui/Modifier;Ly01/c;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    filled-new-array {v1, v1, v1}, [Ll83/a0;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v2, Lk71/a0;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lk71/a0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ll31/d;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
