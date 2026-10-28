.class public final Lqx0/i;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lqx0/i;",
        "Landroidx/lifecycle/w1;",
        "Lhf1/b;",
        "experimentsChecker",
        "<init>",
        "(Lhf1/b;)V",
        "",
        "experimentName",
        "",
        "q",
        "(Ljava/lang/String;)Z",
        "Ll83/a0;",
        "o",
        "()V",
        "r",
        "w",
        "Lhf1/b;",
        "Lec3/p1;",
        "Lqx0/h;",
        "x",
        "Lec3/p1;",
        "_uiState",
        "Lec3/f2;",
        "y",
        "Lec3/f2;",
        "p",
        "()Lec3/f2;",
        "uiState",
        "",
        "Lhf1/a;",
        "z",
        "Ljava/util/List;",
        "experiments",
        "debug-tools_release"
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
.field private final w:Lhf1/b;

.field private final x:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final y:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lhf1/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhf1/b;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "experimentsChecker"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v1, v0, Lqx0/i;->w:Lhf1/b;

    sget-object v1, Lqx0/h$b;->a:Lqx0/h$b;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, v0, Lqx0/i;->x:Lec3/p1;

    invoke-static {v1}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v1

    iput-object v1, v0, Lqx0/i;->y:Lec3/f2;

    new-instance v2, Llf1/c;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Llf1/c;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Llf1/h;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Llf1/h;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Llf1/d;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Llf1/d;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Llf1/e;

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Llf1/e;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Llf1/j;

    const/16 v11, 0xf

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Llf1/j;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Llf1/k;

    const/16 v12, 0xf

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Llf1/k;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Llf1/b;

    const/16 v13, 0xf

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Llf1/b;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Llf1/o;

    const/16 v14, 0xf

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Llf1/o;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v10, Llf1/p;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Llf1/p;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Llf1/l;

    const/16 v16, 0xf

    const/16 v17, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Llf1/l;-><init>(Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v1, 0xa

    new-array v1, v1, [Lhf1/a;

    const/4 v12, 0x0

    aput-object v2, v1, v12

    const/4 v2, 0x1

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v4, v1, v2

    const/4 v2, 0x3

    aput-object v5, v1, v2

    const/4 v2, 0x4

    aput-object v6, v1, v2

    const/4 v2, 0x5

    aput-object v7, v1, v2

    const/4 v2, 0x6

    aput-object v8, v1, v2

    const/4 v2, 0x7

    aput-object v9, v1, v2

    const/16 v2, 0x8

    aput-object v10, v1, v2

    const/16 v2, 0x9

    aput-object v11, v1, v2

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lqx0/i;->z:Ljava/util/List;

    return-void
.end method

.method public static final synthetic g(Lqx0/i;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lqx0/i;->z:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic j(Lqx0/i;)Lhf1/b;
    .locals 0

    iget-object p0, p0, Lqx0/i;->w:Lhf1/b;

    return-object p0
.end method

.method public static final synthetic l(Lqx0/i;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lqx0/i;->x:Lec3/p1;

    return-object p0
.end method

.method public static final synthetic n(Lqx0/i;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lqx0/i;->q(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private final q(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "exercise-details-v2-experiment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const-string v0, "simpler-strength"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final o()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lqx0/i$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqx0/i$a;-><init>(Lqx0/i;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final p()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lqx0/i;->y:Lec3/f2;

    return-object v0
.end method

.method public final r()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v0

    new-instance v1, Lqx0/i$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqx0/i$b;-><init>(Lqx0/i;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
