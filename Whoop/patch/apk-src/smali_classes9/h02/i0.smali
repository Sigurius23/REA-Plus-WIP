.class public final Lh02/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0012\u0010\u0013Jx\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u001f\u001a\u0004\u0008 \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010%\u001a\u0004\u0008&\u0010\'R\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010,\u001a\u0004\u0008-\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u00083\u00104\u001a\u0004\u00085\u0010\u0019R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u00081\u0010#\u001a\u0004\u0008/\u0010\u0017R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010#\u001a\u0004\u00083\u0010\u0017\u00a8\u00066"
    }
    d2 = {
        "Lh02/i0;",
        "Lm91/u;",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "level",
        "",
        "title",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "type",
        "",
        "Lh02/l0;",
        "options",
        "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "sizeChart",
        "selectedOption",
        "",
        "variantSelectorIndex",
        "packItemId",
        "packItemProductKey",
        "<init>",
        "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)V",
        "a",
        "(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)Lh02/i0;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "c",
        "()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
        "b",
        "Ljava/lang/String;",
        "j",
        "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "k",
        "()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
        "d",
        "Ljava/util/List;",
        "e",
        "()Ljava/util/List;",
        "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "i",
        "()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
        "f",
        "Lh02/l0;",
        "h",
        "()Lh02/l0;",
        "g",
        "I",
        "l",
        "native-store_release"
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
.field private final a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh02/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

.field private final f:Lh02/l0;

.field private final g:I

.field private final h:Ljava/lang/String;

.field private final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
            "Ljava/util/List<",
            "Lh02/l0;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
            "Lh02/l0;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    iput-object p2, p0, Lh02/i0;->b:Ljava/lang/String;

    iput-object p3, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    iput-object p4, p0, Lh02/i0;->d:Ljava/util/List;

    iput-object p5, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    iput-object p6, p0, Lh02/i0;->f:Lh02/l0;

    iput p7, p0, Lh02/i0;->g:I

    iput-object p8, p0, Lh02/i0;->h:Ljava/lang/String;

    iput-object p9, p0, Lh02/i0;->i:Ljava/lang/String;

    return-void
.end method

.method public static synthetic b(Lh02/i0;Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lh02/i0;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lh02/i0;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lh02/i0;->d:Ljava/util/List;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lh02/i0;->f:Lh02/l0;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget p7, p0, Lh02/i0;->g:I

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lh02/i0;->h:Ljava/lang/String;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lh02/i0;->i:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lh02/i0;->a(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)Lh02/i0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)Lh02/i0;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;",
            "Ljava/lang/String;",
            "Lcom/whoop/nativestore/pdp/domain/model/SelectorType;",
            "Ljava/util/List<",
            "Lh02/l0;",
            ">;",
            "Lcom/whoop/nativestore/pdp/domain/model/SizeChart;",
            "Lh02/l0;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lh02/i0;"
        }
    .end annotation

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh02/i0;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lh02/i0;-><init>(Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;Ljava/lang/String;Lcom/whoop/nativestore/pdp/domain/model/SelectorType;Ljava/util/List;Lcom/whoop/nativestore/pdp/domain/model/SizeChart;Lh02/l0;ILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final c()Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;
    .locals 1

    iget-object v0, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    return-object v0
.end method

.method public final e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lh02/l0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh02/i0;->d:Ljava/util/List;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lh02/i0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lh02/i0;

    iget-object v1, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    iget-object v3, p1, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lh02/i0;->b:Ljava/lang/String;

    iget-object v3, p1, Lh02/i0;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    iget-object v3, p1, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lh02/i0;->d:Ljava/util/List;

    iget-object v3, p1, Lh02/i0;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    iget-object v3, p1, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lh02/i0;->f:Lh02/l0;

    iget-object v3, p1, Lh02/i0;->f:Lh02/l0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lh02/i0;->g:I

    iget v3, p1, Lh02/i0;->g:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lh02/i0;->h:Ljava/lang/String;

    iget-object v3, p1, Lh02/i0;->h:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lh02/i0;->i:Ljava/lang/String;

    iget-object p1, p1, Lh02/i0;->i:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh02/i0;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh02/i0;->i:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lh02/l0;
    .locals 1

    iget-object v0, p0, Lh02/i0;->f:Lh02/l0;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh02/i0;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lh02/i0;->d:Ljava/util/List;

    invoke-static {v2, v1, v0}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/nativestore/pdp/domain/model/SizeChart;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lh02/i0;->f:Lh02/l0;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lh02/l0;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget v2, p0, Lh02/i0;->g:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lh02/i0;->h:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lh02/i0;->i:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Lcom/whoop/nativestore/pdp/domain/model/SizeChart;
    .locals 1

    iget-object v0, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lh02/i0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final k()Lcom/whoop/nativestore/pdp/domain/model/SelectorType;
    .locals 1

    iget-object v0, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    return-object v0
.end method

.method public final l()I
    .locals 1

    iget v0, p0, Lh02/i0;->g:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lh02/i0;->a:Lcom/whoop/nativestore/pdp/domain/model/SelectorLevel;

    iget-object v1, p0, Lh02/i0;->b:Ljava/lang/String;

    iget-object v2, p0, Lh02/i0;->c:Lcom/whoop/nativestore/pdp/domain/model/SelectorType;

    iget-object v3, p0, Lh02/i0;->d:Ljava/util/List;

    iget-object v4, p0, Lh02/i0;->e:Lcom/whoop/nativestore/pdp/domain/model/SizeChart;

    iget-object v5, p0, Lh02/i0;->f:Lh02/l0;

    iget v6, p0, Lh02/i0;->g:I

    iget-object v7, p0, Lh02/i0;->h:Ljava/lang/String;

    iget-object v8, p0, Lh02/i0;->i:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ProductVariantSelectorState(level="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", title="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", options="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sizeChart="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedOption="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", variantSelectorIndex="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", packItemId="

    const-string v1, ", packItemProductKey="

    invoke-static {v6, v0, v7, v1, v9}, Ldc/b;->B(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v0, ")"

    invoke-static {v8, v0, v9}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
