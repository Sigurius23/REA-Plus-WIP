.class public final Lcom/whoop/recommendationtile/domain/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\"\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0098\u0001\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00062\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00062\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\"\u001a\u0004\u0008#\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010)\u001a\u0004\u0008-\u0010+R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010/\u001a\u0004\u00080\u00101R\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u0008,\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u0008.\u00107R\u0017\u0010\u000f\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u00080\u0010)\u001a\u0004\u00088\u0010+R\u0017\u0010\u0010\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010)\u001a\u0004\u00089\u0010+R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010:\u001a\u0004\u0008(\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010<\u001a\u0004\u00082\u0010=R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010\"\u001a\u0004\u00085\u0010\u001b\u00a8\u0006>"
    }
    d2 = {
        "Lcom/whoop/recommendationtile/domain/c;",
        "",
        "",
        "recommendationId",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "status",
        "",
        "isCommitting",
        "showCommitError",
        "Lm91/u;",
        "header",
        "",
        "body",
        "Lh31/g;",
        "button",
        "isExpanded",
        "isSelected",
        "Lh31/b;",
        "backgroundStyle",
        "Lcom/whoop/navigation/e;",
        "dismiss",
        "followupMessage",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "a",
        "(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/c;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "i",
        "b",
        "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "k",
        "()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
        "c",
        "Z",
        "l",
        "()Z",
        "d",
        "j",
        "e",
        "Lm91/u;",
        "h",
        "()Lm91/u;",
        "f",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "g",
        "Lh31/g;",
        "()Lh31/g;",
        "m",
        "n",
        "Lh31/b;",
        "()Lh31/b;",
        "Lcom/whoop/navigation/e;",
        "()Lcom/whoop/navigation/e;",
        "recommendation-tile-arch-mini_release"
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
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

.field private final c:Z

.field private final d:Z

.field private final e:Lm91/u;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final g:Lh31/g;

.field private final h:Z

.field private final i:Z

.field private final j:Lh31/b;

.field private final k:Lcom/whoop/navigation/e;

.field private final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
            "ZZ",
            "Lm91/u;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lh31/g;",
            "ZZ",
            "Lh31/b;",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    .line 4
    iput-boolean p3, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    .line 5
    iput-boolean p4, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    .line 6
    iput-object p5, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    .line 7
    iput-object p6, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    .line 8
    iput-object p7, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    .line 9
    iput-boolean p8, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    .line 10
    iput-boolean p9, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    .line 11
    iput-object p10, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    .line 12
    iput-object p11, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    .line 13
    iput-object p12, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 14
    const-string p1, ""

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 15
    sget-object p2, Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;->UNCOMMITTED:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    :cond_1
    and-int/lit8 v1, v0, 0x4

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    move v1, p3

    :goto_0
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    move v3, v2

    goto :goto_1

    :cond_3
    move v3, p4

    :goto_1
    and-int/lit8 v4, v0, 0x10

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    move-object v4, v5

    goto :goto_2

    :cond_4
    move-object/from16 v4, p5

    :goto_2
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    .line 16
    sget-object v6, Lm83/y;->w:Lm83/y;

    goto :goto_3

    :cond_5
    move-object/from16 v6, p6

    :goto_3
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    move-object v7, v5

    goto :goto_4

    :cond_6
    move-object/from16 v7, p7

    :goto_4
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move/from16 v8, p8

    :goto_5
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_8
    move/from16 v2, p9

    :goto_6
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    move-object v9, v5

    goto :goto_7

    :cond_9
    move-object/from16 v9, p10

    :goto_7
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    move-object v10, v5

    goto :goto_8

    :cond_a
    move-object/from16 v10, p11

    :goto_8
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p14, v5

    :goto_9
    move-object p3, p1

    move-object p4, p2

    move/from16 p5, v1

    move/from16 p11, v2

    move/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v6

    move-object/from16 p9, v7

    move/from16 p10, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object p2, p0

    goto :goto_a

    :cond_b
    move-object/from16 p14, p12

    goto :goto_9

    .line 17
    :goto_a
    invoke-direct/range {p2 .. p14}, Lcom/whoop/recommendationtile/domain/c;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/recommendationtile/domain/c;Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/recommendationtile/domain/c;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-boolean p4, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-boolean p9, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/recommendationtile/domain/c;->a(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)Lcom/whoop/recommendationtile/domain/c;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;",
            "ZZ",
            "Lm91/u;",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Lh31/g;",
            "ZZ",
            "Lh31/b;",
            "Lcom/whoop/navigation/e;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/recommendationtile/domain/c;"
        }
    .end annotation

    const-string v0, "recommendationId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/recommendationtile/domain/c;

    move-object v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/recommendationtile/domain/c;-><init>(Ljava/lang/String;Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;ZZLm91/u;Ljava/util/List;Lh31/g;ZZLh31/b;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v1
.end method

.method public final c()Lh31/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    return-object v0
.end method

.method public final e()Lh31/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/recommendationtile/domain/c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/recommendationtile/domain/c;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    iget-boolean v3, p1, Lcom/whoop/recommendationtile/domain/c;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    iget-boolean v3, p1, Lcom/whoop/recommendationtile/domain/c;->d:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    iget-boolean v3, p1, Lcom/whoop/recommendationtile/domain/c;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    iget-boolean v3, p1, Lcom/whoop/recommendationtile/domain/c;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final f()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lm91/u;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lh31/g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    return v0
.end method

.method public final k()Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    return-object v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/recommendationtile/domain/c;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/recommendationtile/domain/c;->b:Lcom/whoop/design/models/items/recommendationtile/RecommendationTileStatus;

    iget-boolean v2, p0, Lcom/whoop/recommendationtile/domain/c;->c:Z

    iget-boolean v3, p0, Lcom/whoop/recommendationtile/domain/c;->d:Z

    iget-object v4, p0, Lcom/whoop/recommendationtile/domain/c;->e:Lm91/u;

    iget-object v5, p0, Lcom/whoop/recommendationtile/domain/c;->f:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/recommendationtile/domain/c;->g:Lh31/g;

    iget-boolean v7, p0, Lcom/whoop/recommendationtile/domain/c;->h:Z

    iget-boolean v8, p0, Lcom/whoop/recommendationtile/domain/c;->i:Z

    iget-object v9, p0, Lcom/whoop/recommendationtile/domain/c;->j:Lh31/b;

    iget-object v10, p0, Lcom/whoop/recommendationtile/domain/c;->k:Lcom/whoop/navigation/e;

    iget-object v11, p0, Lcom/whoop/recommendationtile/domain/c;->l:Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "RecommendationTileDomainState(recommendationId="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", status="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isCommitting="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showCommitError="

    const-string v1, ", header="

    invoke-static {v12, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", body="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", button="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isExpanded="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundStyle="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismiss="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", followupMessage="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
