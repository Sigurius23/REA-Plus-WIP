.class public final Lfo2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000b\n\u0002\u0010\u0000\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u00a8\u0001\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\u0008\u0002\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u000fH\u00c6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000f2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\"\u001a\u0004\u0008#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010\"\u001a\u0004\u0008&\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001f\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010+\u001a\u0004\u0008,\u0010-R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008.\u0010\"\u001a\u0004\u0008/\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\"\u001a\u0004\u00080\u0010$R\u0017\u0010\u000c\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u0010\u001dR\u0017\u0010\r\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00102\u001a\u0004\u00085\u0010\u001dR\u0017\u0010\u000e\u001a\u00020\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00102\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00106\u001a\u0004\u00087\u00108R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00106\u001a\u0004\u0008.\u00108R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u00109\u001a\u0004\u00081\u0010\u001bR\u0017\u0010\u0014\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00109\u001a\u0004\u0008\'\u0010\u001bR\u0017\u0010\u0015\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u00106\u001a\u0004\u0008:\u00108\u00a8\u0006;"
    }
    d2 = {
        "Lfo2/d;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "Lkd1/o;",
        "image",
        "",
        "stackedImages",
        "price",
        "strikethroughPrice",
        "",
        "quantity",
        "minQuantity",
        "maxQuantity",
        "",
        "isNotEditable",
        "hideQuantity",
        "",
        "lineItemId",
        "analyticsLabel",
        "isUpdating",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)Lfo2/d;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/design/util/TextResource;",
        "n",
        "()Lcom/whoop/design/util/TextResource;",
        "b",
        "d",
        "c",
        "Lkd1/o;",
        "f",
        "()Lkd1/o;",
        "Ljava/util/List;",
        "l",
        "()Ljava/util/List;",
        "e",
        "j",
        "m",
        "g",
        "I",
        "k",
        "h",
        "i",
        "Z",
        "o",
        "()Z",
        "Ljava/lang/String;",
        "p",
        "universal-checkout_release"
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
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lkd1/o;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkd1/o;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:Lcom/whoop/design/util/TextResource;

.field private final g:I

.field private final h:I

.field private final i:I

.field private final j:Z

.field private final k:Z

.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Z


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkd1/o;",
            "Ljava/util/List<",
            "+",
            "Lkd1/o;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "IIIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItemId"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsLabel"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    .line 3
    iput-object p2, p0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lfo2/d;->c:Lkd1/o;

    .line 5
    iput-object p4, p0, Lfo2/d;->d:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p6, p0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    .line 8
    iput p7, p0, Lfo2/d;->g:I

    .line 9
    iput p8, p0, Lfo2/d;->h:I

    .line 10
    iput p9, p0, Lfo2/d;->i:I

    .line 11
    iput-boolean p10, p0, Lfo2/d;->j:Z

    .line 12
    iput-boolean p11, p0, Lfo2/d;->k:Z

    .line 13
    iput-object p12, p0, Lfo2/d;->l:Ljava/lang/String;

    .line 14
    iput-object p13, p0, Lfo2/d;->m:Ljava/lang/String;

    .line 15
    iput-boolean p14, p0, Lfo2/d;->n:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    move-object v9, v2

    goto :goto_1

    :cond_1
    move-object/from16 v9, p6

    :goto_1
    and-int/lit16 v1, v0, 0x80

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move v11, v2

    goto :goto_2

    :cond_2
    move/from16 v11, p8

    :goto_2
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_3

    move v13, v2

    goto :goto_3

    :cond_3
    move/from16 v13, p10

    :goto_3
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_4

    move v14, v2

    goto :goto_4

    :cond_4
    move/from16 v14, p11

    :goto_4
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_5

    .line 16
    const-string v1, ""

    move-object/from16 v16, v1

    goto :goto_5

    :cond_5
    move-object/from16 v16, p13

    :goto_5
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_6

    move/from16 v17, v2

    :goto_6
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v8, p5

    move/from16 v10, p7

    move/from16 v12, p9

    move-object/from16 v15, p12

    goto :goto_7

    :cond_6
    move/from16 v17, p14

    goto :goto_6

    .line 17
    :goto_7
    invoke-direct/range {v3 .. v17}, Lfo2/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Lfo2/d;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lfo2/d;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lfo2/d;->c:Lkd1/o;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lfo2/d;->d:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget v7, p0, Lfo2/d;->g:I

    goto :goto_6

    :cond_6
    move/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget v8, p0, Lfo2/d;->h:I

    goto :goto_7

    :cond_7
    move/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget v9, p0, Lfo2/d;->i:I

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-boolean v10, p0, Lfo2/d;->j:Z

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-boolean v11, p0, Lfo2/d;->k:Z

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lfo2/d;->l:Ljava/lang/String;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lfo2/d;->m:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-boolean v0, p0, Lfo2/d;->n:Z

    move/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move/from16 p8, v7

    move/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    goto :goto_e

    :cond_d
    move/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lfo2/d;->a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)Lfo2/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)Lfo2/d;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkd1/o;",
            "Ljava/util/List<",
            "+",
            "Lkd1/o;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "IIIZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Lfo2/d;"
        }
    .end annotation

    const-string v0, "title"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "price"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lineItemId"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfo2/d;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lfo2/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIZZLjava/lang/String;Ljava/lang/String;Z)V

    return-object v1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfo2/d;->m:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lfo2/d;->k:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lfo2/d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lfo2/d;

    iget-object v1, p0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lfo2/d;->c:Lkd1/o;

    iget-object v3, p1, Lfo2/d;->c:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lfo2/d;->d:Ljava/util/List;

    iget-object v3, p1, Lfo2/d;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lfo2/d;->g:I

    iget v3, p1, Lfo2/d;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lfo2/d;->h:I

    iget v3, p1, Lfo2/d;->h:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lfo2/d;->i:I

    iget v3, p1, Lfo2/d;->i:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lfo2/d;->j:Z

    iget-boolean v3, p1, Lfo2/d;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lfo2/d;->k:Z

    iget-boolean v3, p1, Lfo2/d;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lfo2/d;->l:Ljava/lang/String;

    iget-object v3, p1, Lfo2/d;->l:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lfo2/d;->m:Ljava/lang/String;

    iget-object v3, p1, Lfo2/d;->m:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lfo2/d;->n:Z

    iget-boolean p1, p1, Lfo2/d;->n:Z

    if-eq v1, p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final f()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lfo2/d;->c:Lkd1/o;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfo2/d;->l:Ljava/lang/String;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lfo2/d;->i:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lfo2/d;->c:Lkd1/o;

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

    iget-object v2, p0, Lfo2/d;->d:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget v2, p0, Lfo2/d;->g:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lfo2/d;->h:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lfo2/d;->i:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lfo2/d;->j:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lfo2/d;->k:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lfo2/d;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lfo2/d;->m:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v1, p0, Lfo2/d;->n:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lfo2/d;->h:I

    return v0
.end method

.method public final j()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lfo2/d;->g:I

    return v0
.end method

.method public final l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkd1/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfo2/d;->d:Ljava/util/List;

    return-object v0
.end method

.method public final m()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final n()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lfo2/d;->j:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lfo2/d;->n:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lfo2/d;->a:Lcom/whoop/design/util/TextResource;

    iget-object v2, v0, Lfo2/d;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lfo2/d;->c:Lkd1/o;

    iget-object v4, v0, Lfo2/d;->d:Ljava/util/List;

    iget-object v5, v0, Lfo2/d;->e:Lcom/whoop/design/util/TextResource;

    iget-object v6, v0, Lfo2/d;->f:Lcom/whoop/design/util/TextResource;

    iget v7, v0, Lfo2/d;->g:I

    iget v8, v0, Lfo2/d;->h:I

    iget v9, v0, Lfo2/d;->i:I

    iget-boolean v10, v0, Lfo2/d;->j:Z

    iget-boolean v11, v0, Lfo2/d;->k:Z

    iget-object v12, v0, Lfo2/d;->l:Ljava/lang/String;

    iget-object v13, v0, Lfo2/d;->m:Ljava/lang/String;

    iget-boolean v14, v0, Lfo2/d;->n:Z

    const-string v15, ", subtitle="

    const-string v0, ", image="

    move-object/from16 v16, v13

    const-string v13, "CartItemViewState(title="

    invoke-static {v13, v1, v15, v2, v0}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", stackedImages="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", strikethroughPrice="

    const-string v2, ", quantity="

    invoke-static {v0, v5, v1, v6, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", minQuantity="

    const-string v2, ", maxQuantity="

    invoke-static {v0, v7, v1, v8, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", isNotEditable="

    const-string v2, ", hideQuantity="

    invoke-static {v9, v1, v2, v0, v10}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", lineItemId="

    const-string v2, ", analyticsLabel="

    invoke-static {v0, v11, v1, v12, v2}, Ly00/t7;->u(Ljava/lang/StringBuilder;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", isUpdating="

    const-string v2, ")"

    move-object/from16 v3, v16

    invoke-static {v0, v3, v1, v14, v2}, Ljh3/c;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
