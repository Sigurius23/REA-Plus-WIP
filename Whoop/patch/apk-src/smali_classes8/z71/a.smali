.class public abstract Lz71/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\r\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\r\u0010\u0003\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\"\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Li91/a;",
        "d",
        "()Li91/a;",
        "f",
        "Li2/t;",
        "a",
        "Li2/t;",
        "c",
        "()Li2/t;",
        "meterHighlightBodyGradient",
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
.field private static final a:Li2/t;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Li2/t;->b:Li2/s;

    sget-wide v1, Li2/x;->m:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    sget-wide v1, Li2/x;->f:J

    const v6, 0x3ecccccd    # 0.4f

    invoke-static {v6, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v3, v4, v5, v6}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/4 v4, 0x0

    const/16 v5, 0xe

    const-wide/16 v2, 0x0

    invoke-static/range {v0 .. v5}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    sput-object v0, Lz71/a;->a:Li2/t;

    return-void
.end method

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lz71/a;->e(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lz71/a;->g(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Li2/t;
    .locals 1

    sget-object v0, Lz71/a;->a:Li2/t;

    return-object v0
.end method

.method public static final d()Li91/a;
    .locals 2

    new-instance v0, Lyz1/g;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lyz1/g;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Ly81/i;)Li2/t;
    .locals 13

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v7, Li2/x;

    invoke-direct {v7, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v8, Li2/x;

    invoke-direct {v8, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    new-instance v9, Li2/x;

    invoke-direct {v9, v1, v2}, Li2/x;-><init>(J)V

    sget-wide v1, Li2/x;->m:J

    new-instance v10, Li2/x;

    invoke-direct {v10, v1, v2}, Li2/x;-><init>(J)V

    new-instance v11, Li2/x;

    invoke-direct {v11, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    new-instance v12, Li2/x;

    invoke-direct {v12, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array/range {v3 .. v12}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Li2/s;->i(Li2/s;Ljava/util/List;)Li2/d1;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Li91/a;
    .locals 2

    new-instance v0, Lyz1/g;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lyz1/g;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Ly81/i;)Li2/t;
    .locals 14

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v7, Li2/x;

    invoke-direct {v7, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v8, Li2/x;

    invoke-direct {v8, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v9, Li2/x;

    invoke-direct {v9, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v10, Li2/x;

    invoke-direct {v10, v1, v2}, Li2/x;-><init>(J)V

    sget-wide v1, Li2/x;->m:J

    new-instance v11, Li2/x;

    invoke-direct {v11, v1, v2}, Li2/x;-><init>(J)V

    new-instance v12, Li2/x;

    invoke-direct {v12, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->X()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v13, Li2/x;

    invoke-direct {v13, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array/range {v4 .. v13}, [Li2/x;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {v0, p0}, Li2/s;->i(Li2/s;Ljava/util/List;)Li2/d1;

    move-result-object p0

    return-object p0
.end method
