.class public abstract Lz81/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a)\u0010\u0005\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u0017\u0010\u000b\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lkd1/g;",
        "Li2/z0;",
        "Lz81/e;",
        "block",
        "d",
        "(Lkotlin/jvm/functions/Function1;)Lz81/e;",
        "a",
        "Lz81/e;",
        "c",
        "()Lz81/e;",
        "Shadows",
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
.field private static final a:Lz81/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz1/k;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lz1/k;-><init>(I)V

    invoke-static {v0}, Lz81/f;->d(Lkotlin/jvm/functions/Function1;)Lz81/e;

    move-result-object v0

    sput-object v0, Lz81/f;->a:Lz81/e;

    return-void
.end method

.method public static synthetic a(Lkd1/g;)Lz81/e;
    .locals 0

    invoke-static {p0}, Lz81/f;->b(Lkd1/g;)Lz81/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lkd1/g;)Lz81/e;
    .locals 12

    const-string v0, "$this$whoopShadows"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz81/e;

    new-instance v3, Li2/z0;

    const/high16 v0, 0x40800000    # 4.0f

    const/4 v8, 0x3

    invoke-direct {v3, v0, v8}, Li2/z0;-><init>(FI)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v4, "Shadow L1"

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li2/z0;

    new-instance v3, Li2/z0;

    const/high16 v0, 0x41000000    # 8.0f

    invoke-direct {v3, v0, v8}, Li2/z0;-><init>(FI)V

    const-string v4, "Shadow L2"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/z0;

    new-instance v3, Li2/z0;

    const/high16 v4, 0x41400000    # 12.0f

    invoke-direct {v3, v4, v8}, Li2/z0;-><init>(FI)V

    const-string v4, "Shadow L3"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Li2/z0;

    new-instance v3, Li2/z0;

    const/high16 v4, 0x41800000    # 16.0f

    invoke-direct {v3, v4, v8}, Li2/z0;-><init>(FI)V

    const-string v4, "Shadow L4"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Li2/z0;

    new-instance v3, Li2/z0;

    const/high16 v4, 0x41a00000    # 20.0f

    invoke-direct {v3, v4, v8}, Li2/z0;-><init>(FI)V

    const-string v4, "Shadow L5"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Li2/z0;

    new-instance v3, Li2/z0;

    const/high16 v4, 0x41c00000    # 24.0f

    invoke-direct {v3, v4, v8}, Li2/z0;-><init>(FI)V

    const-string v4, "Shadow L6"

    invoke-static/range {v2 .. v7}, Lkd1/g;->b(Lkd1/g;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Li2/z0;

    invoke-virtual {v2}, Lkd1/g;->c()Ljava/util/List;

    move-result-object v8

    move-object v2, p0

    move-object v3, v0

    move-object v4, v9

    move-object v5, v10

    move-object v6, v11

    invoke-direct/range {v1 .. v8}, Lz81/e;-><init>(Li2/z0;Li2/z0;Li2/z0;Li2/z0;Li2/z0;Li2/z0;Ljava/util/List;)V

    return-object v1
.end method

.method public static final c()Lz81/e;
    .locals 1

    sget-object v0, Lz81/f;->a:Lz81/e;

    return-object v0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;)Lz81/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lz81/e;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkd1/g;

    invoke-direct {v0}, Lkd1/g;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz81/e;

    return-object p0
.end method
