.class public final Lc81/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/u;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u001b\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0086\u0001\u0010\u0015\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000e2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000e2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010 \u001a\u0004\u0008!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010\u0018R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008*\u0010$\u001a\u0004\u0008+\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008,\u0010\'\u001a\u0004\u0008-\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008(\u0010$\u001a\u0004\u0008.\u0010\u0018R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008%\u0010/\u001a\u0004\u0008&\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u00101\u001a\u0004\u0008,\u00102R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008+\u00101\u001a\u0004\u00083\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008!\u00104\u001a\u0004\u00085\u00106\u00a8\u00067"
    }
    d2 = {
        "Lc81/g;",
        "Lm91/u;",
        "",
        "Lc81/e;",
        "ticks",
        "",
        "leftLabelDisplay",
        "Lgz0/m0;",
        "leftIcon",
        "rightLabelDisplay",
        "rightIcon",
        "titleDisplay",
        "Li93/h;",
        "gradientProgression",
        "",
        "ignoreAnimation",
        "ignoreCurrent",
        "Lhy0/c2;",
        "trend",
        "<init>",
        "(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)V",
        "a",
        "(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)Lc81/g;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "j",
        "()Ljava/util/List;",
        "b",
        "Ljava/lang/String;",
        "g",
        "c",
        "Lgz0/m0;",
        "f",
        "()Lgz0/m0;",
        "d",
        "i",
        "e",
        "h",
        "k",
        "Li93/h;",
        "()Li93/h;",
        "Z",
        "()Z",
        "getIgnoreCurrent",
        "Lhy0/c2;",
        "l",
        "()Lhy0/c2;",
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc81/e;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/String;

.field private final c:Lgz0/m0;

.field private final d:Ljava/lang/String;

.field private final e:Lgz0/m0;

.field private final f:Ljava/lang/String;

.field private final g:Li93/h;

.field private final h:Z

.field private final i:Z

.field private final j:Lhy0/c2;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc81/e;",
            ">;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Li93/h;",
            "ZZ",
            "Lhy0/c2;",
            ")V"
        }
    .end annotation

    const-string v0, "ticks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gradientProgression"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc81/g;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, Lc81/g;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lc81/g;->c:Lgz0/m0;

    .line 5
    iput-object p4, p0, Lc81/g;->d:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lc81/g;->e:Lgz0/m0;

    .line 7
    iput-object p6, p0, Lc81/g;->f:Ljava/lang/String;

    .line 8
    iput-object p7, p0, Lc81/g;->g:Li93/h;

    .line 9
    iput-boolean p8, p0, Lc81/g;->h:Z

    .line 10
    iput-boolean p9, p0, Lc81/g;->i:Z

    .line 11
    iput-object p10, p0, Lc81/g;->j:Lhy0/c2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    move v10, v1

    goto :goto_0

    :cond_0
    move/from16 v10, p8

    :goto_0
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move v11, v1

    goto :goto_1

    :cond_1
    move/from16 v11, p9

    :goto_1
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move-object v12, v0

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    goto :goto_3

    :cond_2
    move-object/from16 v12, p10

    goto :goto_2

    .line 12
    :goto_3
    invoke-direct/range {v2 .. v12}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)V

    return-void
.end method

.method public static synthetic b(Lc81/g;Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;ILjava/lang/Object;)Lc81/g;
    .locals 0

    and-int/lit8 p12, p11, 0x1

    if-eqz p12, :cond_0

    iget-object p1, p0, Lc81/g;->a:Ljava/util/List;

    :cond_0
    and-int/lit8 p12, p11, 0x2

    if-eqz p12, :cond_1

    iget-object p2, p0, Lc81/g;->b:Ljava/lang/String;

    :cond_1
    and-int/lit8 p12, p11, 0x4

    if-eqz p12, :cond_2

    iget-object p3, p0, Lc81/g;->c:Lgz0/m0;

    :cond_2
    and-int/lit8 p12, p11, 0x8

    if-eqz p12, :cond_3

    iget-object p4, p0, Lc81/g;->d:Ljava/lang/String;

    :cond_3
    and-int/lit8 p12, p11, 0x10

    if-eqz p12, :cond_4

    iget-object p5, p0, Lc81/g;->e:Lgz0/m0;

    :cond_4
    and-int/lit8 p12, p11, 0x20

    if-eqz p12, :cond_5

    iget-object p6, p0, Lc81/g;->f:Ljava/lang/String;

    :cond_5
    and-int/lit8 p12, p11, 0x40

    if-eqz p12, :cond_6

    iget-object p7, p0, Lc81/g;->g:Li93/h;

    :cond_6
    and-int/lit16 p12, p11, 0x80

    if-eqz p12, :cond_7

    iget-boolean p8, p0, Lc81/g;->h:Z

    :cond_7
    and-int/lit16 p12, p11, 0x100

    if-eqz p12, :cond_8

    iget-boolean p9, p0, Lc81/g;->i:Z

    :cond_8
    and-int/lit16 p11, p11, 0x200

    if-eqz p11, :cond_9

    iget-object p10, p0, Lc81/g;->j:Lhy0/c2;

    :cond_9
    move p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p12}, Lc81/g;->a(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)Lc81/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)Lc81/g;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc81/e;",
            ">;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Lgz0/m0;",
            "Ljava/lang/String;",
            "Li93/h;",
            "ZZ",
            "Lhy0/c2;",
            ")",
            "Lc81/g;"
        }
    .end annotation

    const-string v0, "ticks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gradientProgression"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lc81/g;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    invoke-direct/range {v1 .. v11}, Lc81/g;-><init>(Ljava/util/List;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Li93/h;ZZLhy0/c2;)V

    return-object v1
.end method

.method public final c()Li93/h;
    .locals 1

    iget-object v0, p0, Lc81/g;->g:Li93/h;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Lc81/g;->h:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lc81/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lc81/g;

    iget-object v1, p0, Lc81/g;->a:Ljava/util/List;

    iget-object v3, p1, Lc81/g;->a:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lc81/g;->b:Ljava/lang/String;

    iget-object v3, p1, Lc81/g;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lc81/g;->c:Lgz0/m0;

    iget-object v3, p1, Lc81/g;->c:Lgz0/m0;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lc81/g;->d:Ljava/lang/String;

    iget-object v3, p1, Lc81/g;->d:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lc81/g;->e:Lgz0/m0;

    iget-object v3, p1, Lc81/g;->e:Lgz0/m0;

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lc81/g;->f:Ljava/lang/String;

    iget-object v3, p1, Lc81/g;->f:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lc81/g;->g:Li93/h;

    iget-object v3, p1, Lc81/g;->g:Li93/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lc81/g;->h:Z

    iget-boolean v3, p1, Lc81/g;->h:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lc81/g;->i:Z

    iget-boolean v3, p1, Lc81/g;->i:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lc81/g;->j:Lhy0/c2;

    iget-object p1, p1, Lc81/g;->j:Lhy0/c2;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    return v2

    :cond_b
    return v0
.end method

.method public final f()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lc81/g;->c:Lgz0/m0;

    return-object v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc81/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final h()Lgz0/m0;
    .locals 1

    iget-object v0, p0, Lc81/g;->e:Lgz0/m0;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lc81/g;->a:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->b:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->c:Lgz0/m0;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->d:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->e:Lgz0/m0;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->f:Ljava/lang/String;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lc81/g;->g:Li93/h;

    invoke-virtual {v2}, Li93/h;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lc81/g;->h:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lc81/g;->i:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lc81/g;->j:Lhy0/c2;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lhy0/c2;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    return v0
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc81/g;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc81/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc81/g;->a:Ljava/util/List;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc81/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Lhy0/c2;
    .locals 1

    iget-object v0, p0, Lc81/g;->j:Lhy0/c2;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lc81/g;->a:Ljava/util/List;

    iget-object v1, p0, Lc81/g;->b:Ljava/lang/String;

    iget-object v2, p0, Lc81/g;->c:Lgz0/m0;

    iget-object v3, p0, Lc81/g;->d:Ljava/lang/String;

    iget-object v4, p0, Lc81/g;->e:Lgz0/m0;

    iget-object v5, p0, Lc81/g;->f:Ljava/lang/String;

    iget-object v6, p0, Lc81/g;->g:Li93/h;

    iget-boolean v7, p0, Lc81/g;->h:Z

    iget-boolean v8, p0, Lc81/g;->i:Z

    iget-object v9, p0, Lc81/g;->j:Lhy0/c2;

    const-string v10, ", leftLabelDisplay="

    const-string v11, ", leftIcon="

    const-string v12, "PaceOfAgingMeterViewState(ticks="

    invoke-static {v12, v10, v1, v11, v0}, Lnh3/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightLabelDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rightIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", titleDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", gradientProgression="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", ignoreAnimation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", ignoreCurrent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", trend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
