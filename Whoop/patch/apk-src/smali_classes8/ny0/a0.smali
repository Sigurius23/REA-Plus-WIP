.class public final Lny0/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0000\n\u0002\u0008\"\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J~\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00122\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003\u00a2\u0006\u0004\u0008 \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\"\u001a\u0004\u0008#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008)\u0010/R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u00080\u00101\u001a\u0004\u00080\u00102R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u00103\u001a\u0004\u00084\u00105R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u00106\u001a\u0004\u00087\u00108R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00109\u001a\u0004\u0008:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008<\u0010>R\u0017\u0010\u0014\u001a\u00020\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010=\u001a\u0004\u0008?\u0010>\u00a8\u0006@"
    }
    d2 = {
        "Lny0/a0;",
        "Lm91/u;",
        "Lcom/whoop/design/util/TextResource;",
        "text",
        "Lg1/u0;",
        "buttonColors",
        "Li2/t;",
        "brushBackground",
        "Lf0/t;",
        "border",
        "Ly3/f;",
        "borderRadius",
        "Ll0/k1;",
        "paddingValues",
        "Lb91/a;",
        "buttonTextStyle",
        "",
        "icon",
        "",
        "enabled",
        "fillMaxWidth",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)Lny0/a0;",
        "",
        "toString",
        "()Ljava/lang/String;",
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
        "Lg1/u0;",
        "g",
        "()Lg1/u0;",
        "c",
        "Li2/t;",
        "f",
        "()Li2/t;",
        "d",
        "Lf0/t;",
        "()Lf0/t;",
        "e",
        "F",
        "()F",
        "Ll0/k1;",
        "l",
        "()Ll0/k1;",
        "Lb91/a;",
        "h",
        "()Lb91/a;",
        "Ljava/lang/Integer;",
        "k",
        "()Ljava/lang/Integer;",
        "i",
        "Z",
        "()Z",
        "j",
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
.field public static final k:I = 0x8


# instance fields
.field private final a:Lcom/whoop/design/util/TextResource;

.field private final b:Lg1/u0;

.field private final c:Li2/t;

.field private final d:Lf0/t;

.field private final e:F

.field private final f:Ll0/k1;

.field private final g:Lb91/a;

.field private final h:Ljava/lang/Integer;

.field private final i:Z

.field private final j:Z


# direct methods
.method private constructor <init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paddingValues"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lny0/a0;->b:Lg1/u0;

    .line 5
    iput-object p3, p0, Lny0/a0;->c:Li2/t;

    .line 6
    iput-object p4, p0, Lny0/a0;->d:Lf0/t;

    .line 7
    iput p5, p0, Lny0/a0;->e:F

    .line 8
    iput-object p6, p0, Lny0/a0;->f:Ll0/k1;

    .line 9
    iput-object p7, p0, Lny0/a0;->g:Lb91/a;

    .line 10
    iput-object p8, p0, Lny0/a0;->h:Ljava/lang/Integer;

    .line 11
    iput-boolean p9, p0, Lny0/a0;->i:Z

    .line 12
    iput-boolean p10, p0, Lny0/a0;->j:Z

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v5, v2

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move-object v6, v2

    goto :goto_1

    :cond_1
    move-object/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v1, v1

    move v8, v1

    goto :goto_3

    :cond_3
    move/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x1

    if-eqz v1, :cond_4

    int-to-float v1, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    const/4 v9, 0x2

    int-to-float v9, v9

    mul-float/2addr v9, v4

    .line 13
    new-instance v4, Ll0/l1;

    invoke-direct {v4, v1, v9, v1, v9}, Ll0/l1;-><init>(FFFF)V

    move-object v9, v4

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v2

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v2

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move v12, v3

    goto :goto_7

    :cond_7
    move/from16 v12, p9

    :goto_7
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_8

    move v13, v3

    goto :goto_8

    :cond_8
    move/from16 v13, p10

    :goto_8
    const/4 v14, 0x0

    move-object v3, p0

    move-object/from16 v4, p1

    .line 14
    invoke-direct/range {v3 .. v14}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)V

    return-void
.end method

.method public static synthetic b(Lny0/a0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZILjava/lang/Object;)Lny0/a0;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lny0/a0;->b:Lg1/u0;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lny0/a0;->c:Li2/t;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lny0/a0;->d:Lf0/t;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget p5, p0, Lny0/a0;->e:F

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lny0/a0;->f:Ll0/k1;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lny0/a0;->g:Lb91/a;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-object p8, p0, Lny0/a0;->h:Ljava/lang/Integer;

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lny0/a0;->i:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-boolean p10, p0, Lny0/a0;->j:Z

    :cond_9
    move p11, p9

    move p12, p10

    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lny0/a0;->a(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)Lny0/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZ)Lny0/a0;
    .locals 13

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paddingValues"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lny0/a0;

    const/4 v12, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    invoke-direct/range {v1 .. v12}, Lny0/a0;-><init>(Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Ljava/lang/Integer;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c()Lf0/t;
    .locals 1

    iget-object v0, p0, Lny0/a0;->d:Lf0/t;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lny0/a0;->e:F

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    instance-of v0, p1, Lny0/a0;

    if-nez v0, :cond_1

    goto/16 :goto_0

    :cond_1
    check-cast p1, Lny0/a0;

    iget-object v0, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p1, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lny0/a0;->b:Lg1/u0;

    iget-object v1, p1, Lny0/a0;->b:Lg1/u0;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lny0/a0;->c:Li2/t;

    iget-object v1, p1, Lny0/a0;->c:Li2/t;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lny0/a0;->d:Lf0/t;

    iget-object v1, p1, Lny0/a0;->d:Lf0/t;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    iget v0, p0, Lny0/a0;->e:F

    iget v1, p1, Lny0/a0;->e:F

    invoke-static {v0, v1}, Ly3/f;->b(FF)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lny0/a0;->f:Ll0/k1;

    iget-object v1, p1, Lny0/a0;->f:Ll0/k1;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lny0/a0;->g:Lb91/a;

    iget-object v1, p1, Lny0/a0;->g:Lb91/a;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v0, p0, Lny0/a0;->h:Ljava/lang/Integer;

    iget-object v1, p1, Lny0/a0;->h:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_0

    :cond_9
    iget-boolean v0, p0, Lny0/a0;->i:Z

    iget-boolean v1, p1, Lny0/a0;->i:Z

    if-eq v0, v1, :cond_a

    goto :goto_0

    :cond_a
    iget-boolean v0, p0, Lny0/a0;->j:Z

    iget-boolean p1, p1, Lny0/a0;->j:Z

    if-eq v0, p1, :cond_b

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_b
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final f()Li2/t;
    .locals 1

    iget-object v0, p0, Lny0/a0;->c:Li2/t;

    return-object v0
.end method

.method public final g()Lg1/u0;
    .locals 1

    iget-object v0, p0, Lny0/a0;->b:Lg1/u0;

    return-object v0
.end method

.method public final h()Lb91/a;
    .locals 1

    iget-object v0, p0, Lny0/a0;->g:Lb91/a;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lny0/a0;->b:Lg1/u0;

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

    iget-object v2, p0, Lny0/a0;->c:Li2/t;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lny0/a0;->d:Lf0/t;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lf0/t;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lny0/a0;->e:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lny0/a0;->f:Ll0/k1;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lny0/a0;->g:Lb91/a;

    if-nez v0, :cond_3

    move v0, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Lb91/a;->hashCode()I

    move-result v0

    :goto_3
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lny0/a0;->h:Ljava/lang/Integer;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lny0/a0;->i:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lny0/a0;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lny0/a0;->i:Z

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-boolean v0, p0, Lny0/a0;->j:Z

    return v0
.end method

.method public final k()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lny0/a0;->h:Ljava/lang/Integer;

    return-object v0
.end method

.method public final l()Ll0/k1;
    .locals 1

    iget-object v0, p0, Lny0/a0;->f:Ll0/k1;

    return-object v0
.end method

.method public final m()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lny0/a0;->a:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lny0/a0;->b:Lg1/u0;

    iget-object v2, p0, Lny0/a0;->c:Li2/t;

    iget-object v3, p0, Lny0/a0;->d:Lf0/t;

    iget v4, p0, Lny0/a0;->e:F

    invoke-static {v4}, Ly3/f;->c(F)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lny0/a0;->f:Ll0/k1;

    iget-object v6, p0, Lny0/a0;->g:Lb91/a;

    iget-object v7, p0, Lny0/a0;->h:Ljava/lang/Integer;

    iget-boolean v8, p0, Lny0/a0;->i:Z

    iget-boolean v9, p0, Lny0/a0;->j:Z

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "PrimaryButtonV2ViewState(text="

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", buttonColors="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", brushBackground="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", border="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", borderRadius="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", paddingValues="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", buttonTextStyle="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", icon="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enabled="

    invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", fillMaxWidth="

    const-string v1, ")"

    invoke-static {v10, v8, v0, v9, v1}, Lvl/b;->j(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
