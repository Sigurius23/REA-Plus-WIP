.class public abstract Lh51/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0003\u001a\u0004\u0008\t\u0010\u0005\"\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0003\u001a\u0004\u0008\u000b\u0010\u0005\u00a8\u0006\r"
    }
    d2 = {
        "",
        "Lm91/u;",
        "a",
        "Ljava/util/List;",
        "c",
        "()Ljava/util/List;",
        "tileCarouselItems",
        "Lh51/f;",
        "b",
        "getTileCarouselStates",
        "tileCarouselStates",
        "getShoppingTileItems",
        "shoppingTileItems",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh51/f;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Ld41/h;

    sget-object v3, Ld41/g;->SMALL:Ld41/g;

    new-instance v5, Lkd1/o$a;

    sget v1, Luv0/b;->a:I

    invoke-direct {v5, v1}, Lkd1/o$a;-><init>(I)V

    const-string v1, "PODCAST NO. 26: UNDERSTANDING TRAIN, WITH KRISTIN HOLMES AND EMILY CAPODILUPO"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v10, "A cat was the Mayor of an Alaskan town for 20 years"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v11, "Aug 19, 2022"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v12, "TAG"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v4, Ld41/j$d;

    invoke-direct/range {v4 .. v9}, Ld41/j$d;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v6, 0x14

    const/4 v7, 0x0

    const-string v1, "first"

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Ld41/h;-><init>(Ljava/lang/Object;Ld41/g;Ld11/a;Ld41/j;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Ld41/h;

    new-instance v15, Lkd1/o$a;

    sget v3, Luv0/b;->a:I

    invoke-direct {v15, v3}, Lkd1/o$a;-><init>(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-static {v9}, Lm4/a;->b(Lx81/d;)I

    move-result v3

    const-string v4, "Cat Facts Two"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    new-instance v5, Ld41/j$c;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v17

    const/16 v23, 0x105

    const/16 v24, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v22, 0x0

    move-object v13, v5

    invoke-direct/range {v13 .. v24}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v7, 0x14

    const/4 v8, 0x0

    move-object v3, v2

    const-string v2, "second"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ld41/h;-><init>(Ljava/lang/Object;Ld41/g;Ld11/a;Ld41/j;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v1

    move-object v2, v3

    new-instance v1, Ld41/h;

    new-instance v3, Lkd1/o$a;

    sget v4, Luv0/b;->a:I

    invoke-direct {v3, v4}, Lkd1/o$a;-><init>(I)V

    invoke-static {v9}, Lm4/a;->b(Lx81/d;)I

    move-result v4

    const-string v5, "Cat Facts Three"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    new-instance v5, Ld41/j$c;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v18

    const/16 v24, 0x105

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v3

    move-object v14, v5

    invoke-direct/range {v14 .. v25}, Ld41/j$c;-><init>(Ljava/lang/String;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ld41/i;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v2

    const-string v2, "third"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v8}, Ld41/h;-><init>(Ljava/lang/Object;Ld41/g;Ld11/a;Ld41/j;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v13, v1}, [Ld41/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    sput-object v19, Lh51/e;->a:Ljava/util/List;

    new-instance v10, Lh51/f;

    const-string v0, "LEARN MORE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const-string v1, "VIEW ALL"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v2, Ly71/g;

    invoke-static {v9}, Lih0/d0;->E(Lx81/d;)I

    move-result v3

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    const/16 v24, 0x1e8d

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v10 .. v25}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v10

    new-instance v10, Lh51/f;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v0, Lh00/l0;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lh00/l0;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    const/16 v24, 0x1ef9

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v10 .. v25}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v10

    new-instance v10, Lh51/f;

    const-string v2, "HOW IT WORKS"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget-object v2, Lh51/e$a;->w:Lh51/e$a;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v13

    const-string v2, "HIDE"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v3, Ly71/g;

    invoke-static {v9}, Lyb0/f;->a(Lx81/d;)I

    move-result v4

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    sget-object v2, Lh51/e$b;->w:Lh51/e$b;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v20

    new-instance v2, Lh00/l0;

    const/16 v4, 0x14

    invoke-direct {v2, v4}, Lh00/l0;-><init>(I)V

    invoke-static {v2}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v21

    const/16 v24, 0x1889

    const/16 v17, 0x1

    move-object/from16 v16, v3

    invoke-direct/range {v10 .. v25}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v10

    new-instance v10, Lh51/f;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    const/16 v24, 0x1e7d

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v10 .. v25}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v0, v2, v10}, [Lh51/f;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lh51/e;->b:Ljava/util/List;

    const-string v0, "SportFlex Band | Force | Carbonite Black Limited Edition"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v13, Lkd1/o$a;

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->c()Lgz0/k;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k;->h()I

    move-result v0

    invoke-direct {v13, v0}, Lkd1/o$a;-><init>(I)V

    const-string v0, "$36"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    const-string v0, "$59"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v15, Lh41/e$f;

    const-string v1, "Sale"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v15, v1}, Lh41/e$f;-><init>(Lcom/whoop/design/util/TextResource;)V

    new-instance v10, Lh41/c;

    const/16 v19, 0x83

    const/4 v12, 0x0

    invoke-direct/range {v10 .. v20}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "SportFlex Band | Blur"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v14, Lkd1/o$a;

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->c()Lgz0/k;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k;->h()I

    move-result v1

    invoke-direct {v14, v1}, Lkd1/o$a;-><init>(I)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v1, Lh41/e$e;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v2}, Lh41/e$e;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lh41/c;

    const/16 v20, 0xa3

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v1

    invoke-direct/range {v11 .. v21}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "SportFlex Band | Pace"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    new-instance v15, Lkd1/o$a;

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->c()Lgz0/k;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k;->h()I

    move-result v1

    invoke-direct {v15, v1}, Lkd1/o$a;-><init>(I)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    new-instance v0, Lh41/e$d;

    invoke-direct {v0, v2, v3, v2}, Lh41/e$d;-><init>(Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lh41/c;

    const/16 v21, 0xa3

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v12 .. v22}, Lh41/c;-><init>(Ljava/lang/Object;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lh41/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v10, v11, v12}, [Lh41/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lh51/e;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lh51/e;->e(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lh51/e;->d(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    sget-object v0, Lh51/e;->a:Ljava/util/List;

    return-object v0
.end method

.method private static final d(Ly81/i;)Li2/t;
    .locals 1

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lgb1/b0;->O0()Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ly81/i;)Li2/t;
    .locals 4

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->k()J

    move-result-wide v1

    new-instance p0, Li2/x;

    invoke-direct {p0, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, p0}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/4 v1, 0x0

    const/16 v2, 0xe

    invoke-static {v0, p0, v1, v1, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object p0

    return-object p0
.end method
