.class public abstract Lz11/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0017\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0008\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0007\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\t\u0010\u0004\"\u0017\u0010\r\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0002\u001a\u0004\u0008\u000c\u0010\u0004\"\u0017\u0010\u000f\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0002\u001a\u0004\u0008\u000b\u0010\u0004\"\u0017\u0010\u0011\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0010\u0010\u0004\"\u0017\u0010\u0013\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0002\u001a\u0004\u0008\u000e\u0010\u0004\"\u0017\u0010\u0014\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0002\u001a\u0004\u0008\u0012\u0010\u0004\"\u0017\u0010\u0015\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u0016\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\u00a8\u0006\u0017"
    }
    d2 = {
        "Ly11/r;",
        "a",
        "Ly11/r;",
        "f",
        "()Ly11/r;",
        "noImpact",
        "b",
        "h",
        "positiveImpact",
        "c",
        "negativeImpact",
        "d",
        "i",
        "positiveImpactWithYouMarker",
        "e",
        "negativeImpactWithYouMarker",
        "j",
        "positiveImpactWithYouMarkerAndSimilarMembers",
        "g",
        "negativeImpactWithYouMarkerAndSimilarMembers",
        "overlappingYouMarkerAndSimilarMember",
        "fullPositive",
        "fullNegative",
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
.field private static final a:Ly11/r;

.field private static final b:Ly11/r;

.field private static final c:Ly11/r;

.field private static final d:Ly11/r;

.field private static final e:Ly11/r;

.field private static final f:Ly11/r;

.field private static final g:Ly11/r;

.field private static final h:Ly11/r;

.field private static final i:Ly11/r;

.field private static final j:Ly11/r;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    new-instance v0, Ly11/r;

    const/16 v8, 0x6f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lz11/a;->a:Ly11/r;

    new-instance v1, Ly11/r;

    sget-object v7, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    const/16 v9, 0x63

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f000000    # 0.5f

    const v5, 0x3f4ccccd    # 0.8f

    move-object v6, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v6

    sput-object v1, Lz11/a;->b:Ly11/r;

    new-instance v8, Ly11/r;

    sget-object v14, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const/16 v16, 0x63

    const/16 v17, 0x0

    const/4 v9, 0x0

    const v11, 0x3e99999a    # 0.3f

    const/high16 v12, 0x3f000000    # 0.5f

    move-object v13, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v8 .. v17}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v13

    sput-object v8, Lz11/a;->c:Ly11/r;

    new-instance v2, Ly11/r;

    const-string v0, "You"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/16 v10, 0x43

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const v6, 0x3f19999a    # 0.6f

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lz11/a;->d:Ly11/r;

    new-instance v9, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    const/16 v17, 0x43

    const/16 v18, 0x0

    const/4 v10, 0x0

    const v12, 0x3ecccccd    # 0.4f

    const/high16 v13, 0x3f000000    # 0.5f

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v18}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lz11/a;->e:Ly11/r;

    new-instance v2, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Ly11/t;

    const v1, 0x3f19999a    # 0.6f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v3, "+4%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v19, "Similar Members"

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v9, v1, v3, v4}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/4 v10, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v6, 0x3f666666    # 0.9f

    invoke-direct/range {v2 .. v11}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lz11/a;->f:Ly11/r;

    new-instance v9, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v1, Ly11/t;

    const v2, 0x3e4ccccd    # 0.2f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const-string v3, "-4%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-direct {v1, v2, v4, v5}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v17, 0x3

    const/4 v10, 0x0

    const v12, 0x3dcccccd    # 0.1f

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v18}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lz11/a;->g:Ly11/r;

    new-instance v9, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v1, Ly11/t;

    const v2, 0x3e99999a    # 0.3f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const v12, 0x3e99999a    # 0.3f

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v18}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lz11/a;->h:Ly11/r;

    new-instance v2, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Ly11/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v3, "+100%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-direct {v9, v1, v3, v4}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/4 v10, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/high16 v5, 0x3f000000    # 0.5f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct/range {v2 .. v11}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lz11/a;->i:Ly11/r;

    new-instance v9, Ly11/r;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    new-instance v0, Ly11/t;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "-100%"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Ly11/t;-><init>(Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v9 .. v18}, Ly11/r;-><init>(FLy81/f;FFLy81/f;Lcom/whoop/design/util/TextResource;Ly11/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v9, Lz11/a;->j:Ly11/r;

    return-void
.end method

.method public static final a()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->j:Ly11/r;

    return-object v0
.end method

.method public static final b()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->i:Ly11/r;

    return-object v0
.end method

.method public static final c()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->c:Ly11/r;

    return-object v0
.end method

.method public static final d()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->e:Ly11/r;

    return-object v0
.end method

.method public static final e()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->g:Ly11/r;

    return-object v0
.end method

.method public static final f()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->a:Ly11/r;

    return-object v0
.end method

.method public static final g()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->h:Ly11/r;

    return-object v0
.end method

.method public static final h()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->b:Ly11/r;

    return-object v0
.end method

.method public static final i()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->d:Ly11/r;

    return-object v0
.end method

.method public static final j()Ly11/r;
    .locals 1

    sget-object v0, Lz11/a;->f:Ly11/r;

    return-object v0
.end method
