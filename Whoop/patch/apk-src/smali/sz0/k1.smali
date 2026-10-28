.class public final Lsz0/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\r2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010!\u001a\u0004\u0008\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\'\u0010$\u001a\u0004\u0008\'\u0010&R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0017\u0010\t\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010)\u001a\u0004\u0008-\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010.\u001a\u0004\u0008,\u00100R\u0017\u0010\u000e\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00082\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u00103\u001a\u0004\u00084\u0010\u001bR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u00103\u001a\u0004\u00081\u0010\u001bR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\u00a8\u00068"
    }
    d2 = {
        "Lsz0/k1;",
        "Lm91/u;",
        "",
        "id",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subTitle",
        "Ly81/f;",
        "titleColor",
        "subtitleColor",
        "Lb91/c;",
        "titleStyle",
        "subTitleStyle",
        "Lw3/k;",
        "textAlign",
        "",
        "titleMaxLines",
        "subtitleMaxLines",
        "Lny0/p0;",
        "trailingIcon",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "a",
        "(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)Lsz0/k1;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getId",
        "b",
        "Lcom/whoop/design/util/TextResource;",
        "i",
        "()Lcom/whoop/design/util/TextResource;",
        "c",
        "d",
        "Ly81/f;",
        "j",
        "()Ly81/f;",
        "e",
        "f",
        "Lb91/c;",
        "l",
        "()Lb91/c;",
        "g",
        "h",
        "I",
        "k",
        "Lny0/p0;",
        "m",
        "()Lny0/p0;",
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
.field public static final l:I = 0x8


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/whoop/design/util/TextResource;

.field private final c:Lcom/whoop/design/util/TextResource;

.field private final d:Ly81/f;

.field private final e:Ly81/f;

.field private final f:Lb91/c;

.field private final g:Lb91/c;

.field private final h:I

.field private final i:I

.field private final j:I

.field private final k:Lny0/p0;


# direct methods
.method private constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleColor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleColor"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleStyle"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitleStyle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lsz0/k1;->a:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    .line 5
    iput-object p3, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    .line 6
    iput-object p4, p0, Lsz0/k1;->d:Ly81/f;

    .line 7
    iput-object p5, p0, Lsz0/k1;->e:Ly81/f;

    .line 8
    iput-object p6, p0, Lsz0/k1;->f:Lb91/c;

    .line 9
    iput-object p7, p0, Lsz0/k1;->g:Lb91/c;

    .line 10
    iput p8, p0, Lsz0/k1;->h:I

    .line 11
    iput p9, p0, Lsz0/k1;->i:I

    .line 12
    iput p10, p0, Lsz0/k1;->j:I

    .line 13
    iput-object p11, p0, Lsz0/k1;->k:Lny0/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 14
    sget-object v1, Ly81/f;->BRAND_WHITE:Ly81/f;

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object/from16 v6, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    .line 15
    sget-object v1, Ly81/f;->WHITE_70:Ly81/f;

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_2

    const/4 v1, 0x5

    move v10, v1

    goto :goto_2

    :cond_2
    move/from16 v10, p8

    :goto_2
    and-int/lit16 v1, v0, 0x100

    const v2, 0x7fffffff

    if-eqz v1, :cond_3

    move v11, v2

    goto :goto_3

    :cond_3
    move/from16 v11, p9

    :goto_3
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_4

    move v12, v2

    goto :goto_4

    :cond_4
    move/from16 v12, p10

    :goto_4
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move-object v13, v0

    goto :goto_5

    :cond_5
    move-object/from16 v13, p11

    :goto_5
    const/4 v14, 0x0

    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    .line 16
    invoke-direct/range {v2 .. v14}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p11}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)V

    return-void
.end method

.method public static synthetic b(Lsz0/k1;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;ILjava/lang/Object;)Lsz0/k1;
    .locals 0

    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lsz0/k1;->a:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lsz0/k1;->d:Ly81/f;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lsz0/k1;->e:Ly81/f;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lsz0/k1;->f:Lb91/c;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lsz0/k1;->g:Lb91/c;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget p8, p0, Lsz0/k1;->h:I

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget p9, p0, Lsz0/k1;->i:I

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget p10, p0, Lsz0/k1;->j:I

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lsz0/k1;->k:Lny0/p0;

    :cond_a
    move p12, p10

    move-object p13, p11

    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lsz0/k1;->a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)Lsz0/k1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;)Lsz0/k1;
    .locals 14

    const-string v0, "title"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitle"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleColor"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitleColor"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "titleStyle"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subTitleStyle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lsz0/k1;

    const/4 v13, 0x0

    move-object v2, p1

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v13}, Lsz0/k1;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;Lb91/c;Lb91/c;IIILny0/p0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final c()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final e()Lb91/c;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->g:Lb91/c;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lsz0/k1;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lsz0/k1;

    iget-object v1, p0, Lsz0/k1;->a:Ljava/lang/String;

    iget-object v3, p1, Lsz0/k1;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lsz0/k1;->d:Ly81/f;

    iget-object v3, p1, Lsz0/k1;->d:Ly81/f;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lsz0/k1;->e:Ly81/f;

    iget-object v3, p1, Lsz0/k1;->e:Ly81/f;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lsz0/k1;->f:Lb91/c;

    iget-object v3, p1, Lsz0/k1;->f:Lb91/c;

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lsz0/k1;->g:Lb91/c;

    iget-object v3, p1, Lsz0/k1;->g:Lb91/c;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lsz0/k1;->h:I

    iget v3, p1, Lsz0/k1;->h:I

    if-ne v1, v3, :cond_c

    iget v1, p0, Lsz0/k1;->i:I

    iget v3, p1, Lsz0/k1;->i:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget v1, p0, Lsz0/k1;->j:I

    iget v3, p1, Lsz0/k1;->j:I

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lsz0/k1;->k:Lny0/p0;

    iget-object p1, p1, Lsz0/k1;->k:Lny0/p0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0

    :cond_c
    return v2
.end method

.method public final f()Ly81/f;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->e:Ly81/f;

    return-object v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lsz0/k1;->j:I

    return v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, Lsz0/k1;->h:I

    return v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lsz0/k1;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v3, v2}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v3, p0, Lsz0/k1;->d:Ly81/f;

    invoke-static {v3, v0, v2}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v3, p0, Lsz0/k1;->e:Ly81/f;

    invoke-static {v3, v0, v2}, Ljh3/c;->c(Ly81/f;II)I

    move-result v0

    iget-object v3, p0, Lsz0/k1;->f:Lb91/c;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    add-int/2addr v3, v0

    mul-int/2addr v3, v2

    iget-object v0, p0, Lsz0/k1;->g:Lb91/c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget v3, p0, Lsz0/k1;->h:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lsz0/k1;->i:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget v3, p0, Lsz0/k1;->j:I

    invoke-static {v3, v0, v2}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lsz0/k1;->k:Lny0/p0;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lny0/p0;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final i()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final j()Ly81/f;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->d:Ly81/f;

    return-object v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Lsz0/k1;->i:I

    return v0
.end method

.method public final l()Lb91/c;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->f:Lb91/c;

    return-object v0
.end method

.method public final m()Lny0/p0;
    .locals 1

    iget-object v0, p0, Lsz0/k1;->k:Lny0/p0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lsz0/k1;->a:Ljava/lang/String;

    iget-object v1, p0, Lsz0/k1;->b:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lsz0/k1;->c:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lsz0/k1;->d:Ly81/f;

    iget-object v4, p0, Lsz0/k1;->e:Ly81/f;

    iget-object v5, p0, Lsz0/k1;->f:Lb91/c;

    iget-object v6, p0, Lsz0/k1;->g:Lb91/c;

    iget v7, p0, Lsz0/k1;->h:I

    invoke-static {v7}, Lw3/k;->a(I)Ljava/lang/String;

    move-result-object v7

    iget v8, p0, Lsz0/k1;->i:I

    iget v9, p0, Lsz0/k1;->j:I

    iget-object v10, p0, Lsz0/k1;->k:Lny0/p0;

    const-string v11, ", title="

    const-string v12, ", subTitle="

    const-string v13, "TitleSubtitleState(id="

    invoke-static {v13, v0, v11, v1, v12}, Lq63/c;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subTitleStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", titleMaxLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", subtitleMaxLines="

    const-string v2, ", trailingIcon="

    invoke-static {v0, v8, v1, v9, v2}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
