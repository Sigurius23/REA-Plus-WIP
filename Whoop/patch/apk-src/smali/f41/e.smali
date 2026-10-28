.class public final Lf41/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u0008#\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u00a8\u0001\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00152\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0015H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\u0008\u0010\"\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u0008#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010%\u001a\u0004\u0008&\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u0010(\u001a\u0004\u0008,\u0010*R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010(\u001a\u0004\u0008-\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u0008+\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u0010.\u001a\u0004\u00088\u00100R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u00109\u001a\u0004\u0008=\u0010;R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008=\u00109\u001a\u0004\u0008>\u0010;R\u0017\u0010\u0014\u001a\u00020\u00138\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010?\u001a\u0004\u00085\u0010@R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u00083\u0010A\u001a\u0004\u0008<\u0010 R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008>\u0010B\u001a\u0004\u00081\u0010C\u00a8\u0006D"
    }
    d2 = {
        "Lf41/e;",
        "Lm91/u;",
        "",
        "id",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "avoidText",
        "Lkd1/o;",
        "icon",
        "Lhy0/c2;",
        "trend",
        "Ly81/e;",
        "activeColor",
        "imageUrl",
        "",
        "isSelected",
        "showAvoidOption",
        "isAvoidChecked",
        "Lf41/b;",
        "dayOptions",
        "",
        "selectedNumber",
        "Lf41/a;",
        "bottomSheetInfo",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V",
        "a",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)Lf41/e;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "l",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
        "e",
        "Lkd1/o;",
        "h",
        "()Lkd1/o;",
        "f",
        "Lhy0/c2;",
        "m",
        "()Lhy0/c2;",
        "g",
        "Ly81/e;",
        "()Ly81/e;",
        "i",
        "Z",
        "o",
        "()Z",
        "j",
        "k",
        "n",
        "Lf41/b;",
        "()Lf41/b;",
        "I",
        "Lf41/a;",
        "()Lf41/a;",
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
.field public static final o:I = 0x8


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Lcom/whoop/design/util/TextResource;

.field private final e:Lkd1/o;

.field private final f:Lhy0/c2;

.field private final g:Ly81/e;

.field private final h:Lkd1/o;

.field private final i:Z

.field private final j:Z

.field private final k:Z

.field private final l:Lf41/b;

.field private final m:I

.field private final n:Lf41/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeColor"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOptions"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf41/e;->a:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p3, p0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p4, p0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p5, p0, Lf41/e;->e:Lkd1/o;

    .line 7
    iput-object p6, p0, Lf41/e;->f:Lhy0/c2;

    .line 8
    iput-object p7, p0, Lf41/e;->g:Ly81/e;

    .line 9
    iput-object p8, p0, Lf41/e;->h:Lkd1/o;

    .line 10
    iput-boolean p9, p0, Lf41/e;->i:Z

    .line 11
    iput-boolean p10, p0, Lf41/e;->j:Z

    .line 12
    iput-boolean p11, p0, Lf41/e;->k:Z

    .line 13
    iput-object p12, p0, Lf41/e;->l:Lf41/b;

    .line 14
    iput p13, p0, Lf41/e;->m:I

    .line 15
    iput-object p14, p0, Lf41/e;->n:Lf41/a;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v8, v2

    goto :goto_0

    :cond_0
    move-object/from16 v8, p5

    :goto_0
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_1

    move-object v11, v2

    goto :goto_1

    :cond_1
    move-object/from16 v11, p8

    :goto_1
    and-int/lit16 v1, v0, 0x200

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    move v13, v3

    goto :goto_2

    :cond_2
    move/from16 v13, p10

    :goto_2
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_3

    move v14, v3

    goto :goto_3

    :cond_3
    move/from16 v14, p11

    :goto_3
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_4

    const/4 v1, 0x1

    move/from16 v16, v1

    goto :goto_4

    :cond_4
    move/from16 v16, p13

    :goto_4
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_5

    move-object/from16 v17, v2

    :goto_5
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v12, p9

    move-object/from16 v15, p12

    goto :goto_6

    :cond_5
    move-object/from16 v17, p14

    goto :goto_5

    .line 16
    :goto_6
    invoke-direct/range {v3 .. v17}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V

    return-void
.end method

.method public static synthetic b(Lf41/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILjava/lang/Object;)Lf41/e;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lf41/e;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lf41/e;->e:Lkd1/o;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lf41/e;->f:Lhy0/c2;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lf41/e;->g:Ly81/e;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lf41/e;->h:Lkd1/o;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-boolean v9, p0, Lf41/e;->i:Z

    goto :goto_8

    :cond_8
    move/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-boolean v10, p0, Lf41/e;->j:Z

    goto :goto_9

    :cond_9
    move/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-boolean v11, p0, Lf41/e;->k:Z

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lf41/e;->l:Lf41/b;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget v13, p0, Lf41/e;->m:I

    goto :goto_c

    :cond_c
    move/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lf41/e;->n:Lf41/a;

    move-object/from16 p15, v0

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move/from16 p10, v9

    move/from16 p11, v10

    move/from16 p12, v11

    move-object/from16 p13, v12

    move/from16 p14, v13

    goto :goto_e

    :cond_d
    move-object/from16 p15, p14

    goto :goto_d

    :goto_e
    invoke-virtual/range {p1 .. p15}, Lf41/e;->a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)Lf41/e;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)Lf41/e;
    .locals 16

    const-string v0, "id"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeColor"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayOptions"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf41/e;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v14, p13

    move-object/from16 v15, p14

    invoke-direct/range {v1 .. v15}, Lf41/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;)V

    return-object v1
.end method

.method public final c()Ly81/e;
    .locals 1

    iget-object v0, p0, Lf41/e;->g:Ly81/e;

    return-object v0
.end method

.method public final d()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lf41/e;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lf41/e;

    iget-object v1, p0, Lf41/e;->a:Ljava/lang/String;

    iget-object v3, p1, Lf41/e;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lf41/e;->e:Lkd1/o;

    iget-object v3, p1, Lf41/e;->e:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lf41/e;->f:Lhy0/c2;

    iget-object v3, p1, Lf41/e;->f:Lhy0/c2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lf41/e;->g:Ly81/e;

    iget-object v3, p1, Lf41/e;->g:Ly81/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lf41/e;->h:Lkd1/o;

    iget-object v3, p1, Lf41/e;->h:Lkd1/o;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lf41/e;->i:Z

    iget-boolean v3, p1, Lf41/e;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lf41/e;->j:Z

    iget-boolean v3, p1, Lf41/e;->j:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lf41/e;->k:Z

    iget-boolean v3, p1, Lf41/e;->k:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lf41/e;->l:Lf41/b;

    iget-object v3, p1, Lf41/e;->l:Lf41/b;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget v1, p0, Lf41/e;->m:I

    iget v3, p1, Lf41/e;->m:I

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lf41/e;->n:Lf41/a;

    iget-object p1, p1, Lf41/e;->n:Lf41/a;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final f()Lf41/a;
    .locals 1

    iget-object v0, p0, Lf41/e;->n:Lf41/a;

    return-object v0
.end method

.method public final g()Lf41/b;
    .locals 1

    iget-object v0, p0, Lf41/e;->l:Lf41/b;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf41/e;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lf41/e;->e:Lkd1/o;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lf41/e;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

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

    iget-object v2, p0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lf41/e;->e:Lkd1/o;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lf41/e;->f:Lhy0/c2;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lhy0/c2;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lf41/e;->g:Ly81/e;

    invoke-static {v2, v0, v1}, Lte0/d;->g(Ly81/e;II)I

    move-result v0

    iget-object v2, p0, Lf41/e;->h:Lkd1/o;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lf41/e;->i:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lf41/e;->j:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lf41/e;->k:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lf41/e;->l:Lf41/b;

    invoke-virtual {v2}, Lf41/b;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget v0, p0, Lf41/e;->m:I

    invoke-static {v0, v2, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lf41/e;->n:Lf41/a;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lf41/a;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Lkd1/o;
    .locals 1

    iget-object v0, p0, Lf41/e;->h:Lkd1/o;

    return-object v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Lf41/e;->m:I

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lf41/e;->j:Z

    return v0
.end method

.method public final l()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final m()Lhy0/c2;
    .locals 1

    iget-object v0, p0, Lf41/e;->f:Lhy0/c2;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lf41/e;->k:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    iget-boolean v0, p0, Lf41/e;->i:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lf41/e;->a:Ljava/lang/String;

    iget-object v2, v0, Lf41/e;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, v0, Lf41/e;->c:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lf41/e;->d:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lf41/e;->e:Lkd1/o;

    iget-object v6, v0, Lf41/e;->f:Lhy0/c2;

    iget-object v7, v0, Lf41/e;->g:Ly81/e;

    iget-object v8, v0, Lf41/e;->h:Lkd1/o;

    iget-boolean v9, v0, Lf41/e;->i:Z

    iget-boolean v10, v0, Lf41/e;->j:Z

    iget-boolean v11, v0, Lf41/e;->k:Z

    iget-object v12, v0, Lf41/e;->l:Lf41/b;

    iget v13, v0, Lf41/e;->m:I

    iget-object v14, v0, Lf41/e;->n:Lf41/a;

    const-string v15, ", title="

    const-string v0, ", subtitle="

    move-object/from16 v16, v14

    const-string v14, "GoalSettingsTileState(id="

    invoke-static {v14, v1, v15, v2, v0}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avoidText="

    const-string v2, ", icon="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", activeColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", showAvoidOption="

    const-string v2, ", isAvoidChecked="

    invoke-static {v0, v9, v1, v10, v2}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dayOptions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectedNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bottomSheetInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
