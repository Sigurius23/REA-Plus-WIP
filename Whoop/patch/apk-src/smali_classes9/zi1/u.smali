.class public final Lzi1/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Ld11/i;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lzi1/u;",
        "Lm91/f;",
        "Ld11/i;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ld11/d;",
        "a",
        "Ld11/d;",
        "ctaTileItem",
        "kennel_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:I


# instance fields
.field private final a:Ld11/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Ld11/d;->a:I

    sput v0, Lzi1/u;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ld11/d;

    invoke-direct {v0}, Ld11/d;-><init>()V

    iput-object v0, p0, Lzi1/u;->a:Ld11/d;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi1/u;->d(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzi1/u;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzi1/u;->e(Lzi1/u;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;
    .locals 1

    new-instance v0, Lxi1/a$e;

    invoke-virtual {p1}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lxi1/a$e;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lzi1/u;Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lzi1/u;->c(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Ld11/i;

    invoke-virtual/range {p0 .. p5}, Lzi1/u;->c(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ld11/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "modifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p4

    check-cast v4, Lp1/q;

    const v0, -0x7967de13

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    and-int/lit8 v1, p5, 0x40

    if-nez v1, :cond_2

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_2

    :cond_2
    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, p5, 0x180

    const/16 v5, 0x100

    if-nez v1, :cond_6

    invoke-virtual {v4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v5

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, p5, 0xc00

    if-nez v1, :cond_9

    and-int/lit16 v1, p5, 0x1000

    if-nez v1, :cond_7

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_5

    :cond_7
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_5
    if-eqz v1, :cond_8

    const/16 v1, 0x800

    goto :goto_6

    :cond_8
    const/16 v1, 0x400

    :goto_6
    or-int/2addr v0, v1

    :cond_9
    and-int/lit16 v1, v0, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v1, v7, :cond_a

    move v1, v8

    goto :goto_7

    :cond_a
    move v1, v9

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v4, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {p2}, Ld11/i;->getEvent()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lyi1/q;->a:Lyi1/q;

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    const v1, -0x1e29d53a

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Ld11/i;->E()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    and-int/lit16 v7, v0, 0x380

    if-ne v7, v5, :cond_b

    move v5, v8

    goto :goto_8

    :cond_b
    move v5, v9

    :goto_8
    and-int/lit8 v7, v0, 0x70

    if-eq v7, v2, :cond_d

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_c

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_9

    :cond_c
    move v8, v9

    :cond_d
    :goto_9
    or-int v0, v5, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_e

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_f

    :cond_e
    new-instance v2, Lc11/e;

    const/4 v0, 0x5

    invoke-direct {v2, p3, p2, v0}, Lc11/e;-><init>(Lkotlin/jvm/functions/Function1;Ld11/i;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v2, v4, v0, v9}, Lzi1/f0;->d(Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    const v1, -0x1e26ab98

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    iget-object v1, p0, Lzi1/u;->a:Ld11/d;

    and-int/lit8 v2, v0, 0xe

    sget v5, Ld11/i;->E:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v2, v5

    and-int/lit8 v5, v0, 0x70

    or-int/2addr v2, v5

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v2

    sget v2, Ld11/d;->a:I

    shl-int/lit8 v2, v2, 0x9

    or-int v5, v0, v2

    move-object v2, p2

    move-object v3, p3

    move-object v0, v1

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ld11/d;->d(Landroidx/compose/ui/Modifier;Ld11/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Ly71/j;

    const/16 v6, 0x15

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Ly71/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method
