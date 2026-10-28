.class public final Lc41/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001e\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u009c\u0001\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u000b2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\"\u001a\u0004\u0008&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\"\u001a\u0004\u0008(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\"\u001a\u0004\u0008*\u0010$R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010,\u001a\u0004\u0008-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010/\u001a\u0004\u0008\'\u0010\u001aR\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u00100\u001a\u0004\u00081\u00102R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010/\u001a\u0004\u00087\u0010\u001aR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u0010/\u001a\u0004\u0008+\u0010\u001aR\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00109\u001a\u0004\u00088\u0010:R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u00100\u001a\u0004\u0008;\u00102R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010/\u001a\u0004\u00083\u0010\u001a\u00a8\u0006<"
    }
    d2 = {
        "Lc41/r;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "scoreDisplay",
        "startTimeText",
        "endTimeText",
        "Lkd1/o;",
        "icon",
        "",
        "activityV2Id",
        "",
        "isGpsEnabled",
        "Lcom/whoop/service/network/model/cycles/Period;",
        "during",
        "startTimeIso",
        "endTimeIso",
        "Lcom/whoop/design/models/ActivityTileSelectionState;",
        "selectableState",
        "isSelected",
        "internalName",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)Lc41/r;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "m",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "i",
        "c",
        "l",
        "d",
        "f",
        "e",
        "Lkd1/o;",
        "g",
        "()Lkd1/o;",
        "Ljava/lang/String;",
        "Z",
        "n",
        "()Z",
        "h",
        "Lcom/whoop/service/network/model/cycles/Period;",
        "getDuring",
        "()Lcom/whoop/service/network/model/cycles/Period;",
        "k",
        "j",
        "Lcom/whoop/design/models/ActivityTileSelectionState;",
        "()Lcom/whoop/design/models/ActivityTileSelectionState;",
        "o",
        "design_release"
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
.field public static final n:I = 0x8


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lkd1/o;

.field private final f:Ljava/lang/String;

.field private final g:Z

.field private final h:Lcom/whoop/service/network/model/cycles/Period;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;

.field private final k:Lcom/whoop/design/models/ActivityTileSelectionState;

.field private final l:Z

.field private final m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTimeText"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTimeText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityV2Id"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectableState"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lc41/r;->e:Lkd1/o;

    .line 7
    iput-object p6, p0, Lc41/r;->f:Ljava/lang/String;

    .line 8
    iput-boolean p7, p0, Lc41/r;->g:Z

    .line 9
    iput-object p8, p0, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    .line 10
    iput-object p9, p0, Lc41/r;->i:Ljava/lang/String;

    .line 11
    iput-object p10, p0, Lc41/r;->j:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    .line 13
    iput-boolean p12, p0, Lc41/r;->l:Z

    .line 14
    iput-object p13, p0, Lc41/r;->m:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 15
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 16
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    .line 17
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    .line 18
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    const/4 v6, 0x0

    if-eqz v5, :cond_4

    move-object v5, v6

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    .line 19
    const-string v7, ""

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    const/4 v9, 0x0

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    move-object v10, v6

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    move-object v11, v6

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    move-object v12, v6

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    .line 20
    sget-object v13, Lcom/whoop/design/models/ActivityTileSelectionState;->NOT_SELECTABLE:Lcom/whoop/design/models/ActivityTileSelectionState;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    goto :goto_b

    :cond_b
    move/from16 v9, p12

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    move-object/from16 p14, v6

    :goto_c
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move/from16 p8, v8

    move/from16 p13, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    goto :goto_d

    :cond_c
    move-object/from16 p14, p13

    goto :goto_c

    .line 21
    :goto_d
    invoke-direct/range {p1 .. p14}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lc41/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILjava/lang/Object;)Lc41/r;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lc41/r;->e:Lkd1/o;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lc41/r;->f:Ljava/lang/String;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lc41/r;->g:Z

    goto :goto_5

    :cond_6
    move/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lc41/r;->i:Ljava/lang/String;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lc41/r;->j:Ljava/lang/String;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-boolean v11, p0, Lc41/r;->l:Z

    goto :goto_a

    :cond_b
    move/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lc41/r;->m:Ljava/lang/String;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lc41/r;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)Lc41/r;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)Lc41/r;
    .locals 15

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scoreDisplay"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startTimeText"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endTimeText"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activityV2Id"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectableState"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc41/r;

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v13, p12

    move-object/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lc41/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;)V

    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc41/r;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc41/r;->j:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc41/r;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc41/r;

    iget-object v1, p0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lc41/r;->e:Lkd1/o;

    iget-object v3, p1, Lc41/r;->e:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lc41/r;->f:Ljava/lang/String;

    iget-object v3, p1, Lc41/r;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lc41/r;->g:Z

    iget-boolean v3, p1, Lc41/r;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    iget-object v3, p1, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lc41/r;->i:Ljava/lang/String;

    iget-object v3, p1, Lc41/r;->i:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lc41/r;->j:Ljava/lang/String;

    iget-object v3, p1, Lc41/r;->j:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    iget-object v3, p1, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lc41/r;->l:Z

    iget-boolean v3, p1, Lc41/r;->l:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lc41/r;->m:Ljava/lang/String;

    iget-object p1, p1, Lc41/r;->m:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final f()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final g()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lc41/r;->e:Lkd1/o;

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc41/r;->m:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lc41/r;->e:Lkd1/o;

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

    iget-object v2, p0, Lc41/r;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lc41/r;->g:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/service/network/model/cycles/Period;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc41/r;->i:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc41/r;->j:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lc41/r;->l:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lc41/r;->m:Ljava/lang/String;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final j()Lcom/whoop/design/models/ActivityTileSelectionState;
    .locals 1

    iget-object v0, p0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc41/r;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final m()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lc41/r;->g:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lc41/r;->l:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lc41/r;->a:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lc41/r;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lc41/r;->c:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lc41/r;->d:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lc41/r;->e:Lkd1/o;

    iget-object v6, v0, Lc41/r;->f:Ljava/lang/String;

    iget-boolean v7, v0, Lc41/r;->g:Z

    iget-object v8, v0, Lc41/r;->h:Lcom/whoop/service/network/model/cycles/Period;

    iget-object v9, v0, Lc41/r;->i:Ljava/lang/String;

    iget-object v10, v0, Lc41/r;->j:Ljava/lang/String;

    iget-object v11, v0, Lc41/r;->k:Lcom/whoop/design/models/ActivityTileSelectionState;

    iget-boolean v12, v0, Lc41/r;->l:Z

    iget-object v13, v0, Lc41/r;->m:Ljava/lang/String;

    const-string v14, ", scoreDisplay="

    const-string v15, ", startTimeText="

    const-string v0, "ActivityTileSelectionItemState(title="

    invoke-static {v0, v1, v14, v2, v15}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTimeText="

    const-string v2, ", icon="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activityV2Id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isGpsEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", during="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", startTimeIso="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", endTimeIso="

    const-string v2, ", selectableState="

    invoke-static {v0, v9, v1, v10, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", internalName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v13, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
