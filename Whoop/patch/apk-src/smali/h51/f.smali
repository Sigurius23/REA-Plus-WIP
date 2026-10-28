.class public final Lh51/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\'\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u009e\u0001\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00042\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\r2\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00062\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0008\u0008\u0002\u0010\u0017\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010#\u001a\u00020\r2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010%\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010-\u001a\u0004\u0008.\u0010/R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00082\u00103R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u00084\u0010)\u001a\u0004\u00084\u0010+R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u0008,\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u0017\u0010\u000f\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u00109\u001a\u0004\u0008=\u0010;R\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010?\u001a\u0004\u0008<\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008:\u0010A\u001a\u0004\u00085\u0010BR\u0017\u0010\u0014\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008C\u0010-\u001a\u0004\u0008>\u0010/R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u0010D\u001a\u0004\u00088\u0010ER\u0017\u0010\u0017\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u00109\u001a\u0004\u0008C\u0010;\u00a8\u0006F"
    }
    d2 = {
        "Lh51/f;",
        "Lm91/u;",
        "",
        "event",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Li91/a;",
        "titleColor",
        "Lb91/c;",
        "titleTypography",
        "actionButtonText",
        "Ly71/g;",
        "actionButtonIcon",
        "",
        "showActionButton",
        "showTitle",
        "",
        "items",
        "Ly81/e;",
        "backgroundColor",
        "onBoardingBarColor",
        "Lkd1/o;",
        "backgroundImage",
        "showBottomSpacer",
        "<init>",
        "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)V",
        "a",
        "(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)Lh51/f;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Object;",
        "getEvent",
        "()Ljava/lang/Object;",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "m",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "Li91/a;",
        "n",
        "()Li91/a;",
        "d",
        "Lb91/c;",
        "o",
        "()Lb91/c;",
        "e",
        "f",
        "Ly71/g;",
        "()Ly71/g;",
        "g",
        "Z",
        "j",
        "()Z",
        "h",
        "l",
        "i",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "Ly81/e;",
        "()Ly81/e;",
        "k",
        "Lkd1/o;",
        "()Lkd1/o;",
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
.field private final a:Ljava/lang/Object;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Li91/a;

.field private final d:Lb91/c;

.field private final e:Lcom/whoop/design/util/TextResource;

.field private final f:Ly71/g;

.field private final g:Z

.field private final h:Z

.field private final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation
.end field

.field private final j:Ly81/e;

.field private final k:Li91/a;

.field private final l:Lkd1/o;

.field private final m:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/whoop/design/util/TextResource;",
            "Li91/a;",
            "Lb91/c;",
            "Lcom/whoop/design/util/TextResource;",
            "Ly71/g;",
            "ZZ",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ly81/e;",
            "Li91/a;",
            "Lkd1/o;",
            "Z)V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleColor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionButtonText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundColor"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBoardingBarColor"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lh51/f;->a:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lh51/f;->c:Li91/a;

    .line 5
    iput-object p4, p0, Lh51/f;->d:Lb91/c;

    .line 6
    iput-object p5, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p6, p0, Lh51/f;->f:Ly71/g;

    .line 8
    iput-boolean p7, p0, Lh51/f;->g:Z

    .line 9
    iput-boolean p8, p0, Lh51/f;->h:Z

    .line 10
    iput-object p9, p0, Lh51/f;->i:Ljava/util/List;

    .line 11
    iput-object p10, p0, Lh51/f;->j:Ly81/e;

    .line 12
    iput-object p11, p0, Lh51/f;->k:Li91/a;

    .line 13
    iput-object p12, p0, Lh51/f;->l:Lkd1/o;

    .line 14
    iput-boolean p13, p0, Lh51/f;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 16

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 15
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    .line 16
    sget-object v1, Lh51/f$a;->w:Lh51/f$a;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    .line 17
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object/from16 v7, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v8, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    move v9, v1

    goto :goto_5

    :cond_5
    move/from16 v9, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    const/4 v4, 0x1

    if-eqz v1, :cond_6

    move v10, v4

    goto :goto_6

    :cond_6
    move/from16 v10, p8

    :goto_6
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_7

    .line 18
    sget-object v1, Lh51/f$b;->w:Lh51/f$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v1

    move-object v12, v1

    goto :goto_7

    :cond_7
    move-object/from16 v12, p10

    :goto_7
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_8

    .line 19
    sget-object v1, Lh51/f$c;->w:Lh51/f$c;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v1

    move-object v13, v1

    goto :goto_8

    :cond_8
    move-object/from16 v13, p11

    :goto_8
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_9

    move-object v14, v2

    goto :goto_9

    :cond_9
    move-object/from16 v14, p12

    :goto_9
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_a

    move v15, v4

    move-object/from16 v2, p0

    move-object/from16 v11, p9

    move-object/from16 v4, p2

    goto :goto_a

    :cond_a
    move/from16 v15, p13

    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v11, p9

    .line 20
    :goto_a
    invoke-direct/range {v2 .. v15}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)V

    return-void
.end method

.method public static synthetic b(Lh51/f;Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;ZILjava/lang/Object;)Lh51/f;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lh51/f;->a:Ljava/lang/Object;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lh51/f;->c:Li91/a;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lh51/f;->d:Lb91/c;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lh51/f;->f:Ly71/g;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-boolean v6, p0, Lh51/f;->g:Z

    goto :goto_5

    :cond_6
    move/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-boolean v7, p0, Lh51/f;->h:Z

    goto :goto_6

    :cond_7
    move/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lh51/f;->i:Ljava/util/List;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lh51/f;->j:Ly81/e;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lh51/f;->k:Li91/a;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lh51/f;->l:Lkd1/o;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-boolean v0, p0, Lh51/f;->m:Z

    move/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move/from16 p9, v6

    move/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lh51/f;->a(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)Lh51/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)Lh51/f;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lcom/whoop/design/util/TextResource;",
            "Li91/a;",
            "Lb91/c;",
            "Lcom/whoop/design/util/TextResource;",
            "Ly71/g;",
            "ZZ",
            "Ljava/util/List<",
            "+",
            "Lm91/u;",
            ">;",
            "Ly81/e;",
            "Li91/a;",
            "Lkd1/o;",
            "Z)",
            "Lh51/f;"
        }
    .end annotation

    const-string v0, "event"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleColor"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionButtonText"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundColor"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBoardingBarColor"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh51/f;

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v13, p12

    move/from16 v14, p13

    invoke-direct/range {v1 .. v14}, Lh51/f;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Li91/a;Lb91/c;Lcom/whoop/design/util/TextResource;Ly71/g;ZZLjava/util/List;Ly81/e;Li91/a;Lkd1/o;Z)V

    return-object v1
.end method

.method public final c()Ly71/g;
    .locals 1

    iget-object v0, p0, Lh51/f;->f:Ly71/g;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh51/f;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh51/f;

    iget-object v1, p0, Lh51/f;->a:Ljava/lang/Object;

    iget-object v3, p1, Lh51/f;->a:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh51/f;->c:Li91/a;

    iget-object v3, p1, Lh51/f;->c:Li91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh51/f;->d:Lb91/c;

    iget-object v3, p1, Lh51/f;->d:Lb91/c;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lh51/f;->f:Ly71/g;

    iget-object v3, p1, Lh51/f;->f:Ly71/g;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lh51/f;->g:Z

    iget-boolean v3, p1, Lh51/f;->g:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lh51/f;->h:Z

    iget-boolean v3, p1, Lh51/f;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh51/f;->i:Ljava/util/List;

    iget-object v3, p1, Lh51/f;->i:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lh51/f;->j:Ly81/e;

    iget-object v3, p1, Lh51/f;->j:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lh51/f;->k:Li91/a;

    iget-object v3, p1, Lh51/f;->k:Li91/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lh51/f;->l:Lkd1/o;

    iget-object v3, p1, Lh51/f;->l:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-boolean v1, p0, Lh51/f;->m:Z

    iget-boolean p1, p1, Lh51/f;->m:Z

    if-eq v1, p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final f()Ly81/e;
    .locals 1

    iget-object v0, p0, Lh51/f;->j:Ly81/e;

    return-object v0
.end method

.method public final g()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lh51/f;->l:Lkd1/o;

    return-object v0
.end method

.method public getEvent()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lh51/f;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh51/f;->i:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lh51/f;->a:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lh51/f;->c:Li91/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh51/f;->d:Lb91/c;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lh51/f;->f:Ly71/g;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ly71/g;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lh51/f;->g:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lh51/f;->h:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lh51/f;->i:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lh51/f;->j:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lh51/f;->k:Li91/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh51/f;->l:Lkd1/o;

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lh51/f;->m:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final i()Li91/a;
    .locals 1

    iget-object v0, p0, Lh51/f;->k:Li91/a;

    return-object v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lh51/f;->g:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lh51/f;->m:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lh51/f;->h:Z

    return v0
.end method

.method public final m()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final n()Li91/a;
    .locals 1

    iget-object v0, p0, Lh51/f;->c:Li91/a;

    return-object v0
.end method

.method public final o()Lb91/c;
    .locals 1

    iget-object v0, p0, Lh51/f;->d:Lb91/c;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lh51/f;->a:Ljava/lang/Object;

    iget-object v1, p0, Lh51/f;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lh51/f;->c:Li91/a;

    iget-object v3, p0, Lh51/f;->d:Lb91/c;

    iget-object v4, p0, Lh51/f;->e:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lh51/f;->f:Ly71/g;

    iget-boolean v6, p0, Lh51/f;->g:Z

    iget-boolean v7, p0, Lh51/f;->h:Z

    iget-object v8, p0, Lh51/f;->i:Ljava/util/List;

    iget-object v9, p0, Lh51/f;->j:Ly81/e;

    iget-object v10, p0, Lh51/f;->k:Li91/a;

    iget-object v11, p0, Lh51/f;->l:Lkd1/o;

    iget-boolean v12, p0, Lh51/f;->m:Z

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "TileCarouselState(event="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleColor="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", titleTypography="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionButtonText="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", actionButtonIcon="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showActionButton="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", showTitle="

    const-string v1, ", items="

    invoke-static {v13, v6, v0, v7, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundColor="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onBoardingBarColor="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", backgroundImage="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", showBottomSpacer="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v13, v12, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
