.class public abstract Lb72/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a#\u0010\u0011\u001a\u00020\u0002*\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\r*\u0008\u0012\u0004\u0012\u00020\r0\u00162\u0006\u0010\u0017\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\"\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\"\u0017\u0010\"\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0017\u0010%\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u001f\u001a\u0004\u0008$\u0010!\"\u0017\u0010(\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001f\u001a\u0004\u0008\'\u0010!\"\u0017\u0010+\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008)\u0010\u001f\u001a\u0004\u0008*\u0010!\u00a8\u0006-\u00b2\u0006\u000e\u0010,\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lb72/e;",
        "viewState",
        "Ll83/a0;",
        "q",
        "(Lb72/e;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isSuccessState",
        "l",
        "(Lb72/e;ZLandroidx/compose/runtime/Composer;I)V",
        "Lb72/d;",
        "w",
        "(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V",
        "Lk2/e;",
        "",
        "percent",
        "Ly3/c;",
        "density",
        "p",
        "(Lk2/e;FLy3/c;)V",
        "arcAngle",
        "z",
        "(FF)F",
        "Li93/f;",
        "t",
        "y",
        "(Li93/f;F)F",
        "a",
        "Li93/f;",
        "meterArcRange",
        "Li91/a;",
        "b",
        "Li91/a;",
        "getSageMeterBorder",
        "()Li91/a;",
        "sageMeterBorder",
        "c",
        "getSageMeterOverlay",
        "sageMeterOverlay",
        "d",
        "getSageMeterBorderContinuous",
        "sageMeterBorderContinuous",
        "e",
        "getSageMeterOverlayContinuous",
        "sageMeterOverlayContinuous",
        "scale",
        "sage_release"
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
.field private static final a:Li93/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li93/f;"
        }
    .end annotation
.end field

.field private static final b:Li91/a;

.field private static final c:Li91/a;

.field private static final d:Li91/a;

.field private static final e:Li91/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Li93/e;

    const/4 v1, 0x0

    const v2, 0x3f1c71c7

    invoke-direct {v0, v1, v2}, Li93/e;-><init>(FF)V

    sput-object v0, Lb72/b;->a:Li93/f;

    new-instance v0, Lb72/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sput-object v0, Lb72/b;->b:Li91/a;

    new-instance v0, Lb72/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sput-object v0, Lb72/b;->c:Li91/a;

    new-instance v0, Lb72/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sput-object v0, Lb72/b;->d:Li91/a;

    new-instance v0, Lb72/a;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lb72/a;-><init>(I)V

    invoke-static {v0}, Li91/c;->j(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v0

    sput-object v0, Lb72/b;->e:Li91/a;

    return-void
.end method

.method private static final A(Ly81/i;)Li2/t;
    .locals 13

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Lb72/b;->a:Li93/f;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3ea8f5c3    # 0.33f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3eae147b    # 0.34f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->d()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f28f5c3    # 0.66f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->d()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f2b851f    # 0.67f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v1, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v6 .. v12}, [Ll83/k;

    move-result-object p0

    invoke-static {v0, p0}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object p0

    return-object p0
.end method

.method private static final B(Ly81/i;)Li2/t;
    .locals 13

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->d()J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->d()J

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

    invoke-virtual {p0}, Ly81/i;->j()J

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

.method private static final C(Ly81/i;)Li2/t;
    .locals 14

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Lb72/b;->a:Li93/f;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v3

    const v5, 0x3e4ccccd    # 0.2f

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3ea8f5c3    # 0.33f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v3

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3eae147b    # 0.34f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v3

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f28f5c3    # 0.66f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v3

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v10, Ll83/k;

    invoke-direct {v10, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f2b851f    # 0.67f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v3

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lb72/b;->y(Li93/f;F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v3

    invoke-static {v5, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    new-instance v6, Li2/x;

    invoke-direct {v6, v3, v4}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v1, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v2

    invoke-static {v5, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    new-instance p0, Li2/x;

    invoke-direct {p0, v2, v3}, Li2/x;-><init>(J)V

    new-instance v13, Ll83/k;

    invoke-direct {v13, v1, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v7 .. v13}, [Ll83/k;

    move-result-object p0

    invoke-static {v0, p0}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Ly81/i;)Li2/t;
    .locals 14

    const-string v0, "$this$brushBackground"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li2/t;->b:Li2/s;

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->d()J

    move-result-wide v1

    invoke-static {v3, v1, v2}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    invoke-virtual {p0}, Ly81/i;->d()J

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

    invoke-virtual {p0}, Ly81/i;->j()J

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

.method public static synthetic a(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lb72/b;->A(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lb72/b;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lb72/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb72/b;->v(Lb72/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb72/b;->n(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lb72/e;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb72/b;->o(Lb72/e;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lb72/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb72/b;->x(Lb72/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb72/b;->t(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lb72/b;->D(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lb72/b;->B(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ZLy3/c;Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb72/b;->u(ZLy3/c;Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ly81/i;)Li2/t;
    .locals 0

    invoke-static {p0}, Lb72/b;->C(Ly81/i;)Li2/t;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lb72/e;ZLandroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, 0x558c50f4

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/4 v6, 0x1

    const/16 v7, 0x12

    const/4 v15, 0x0

    if-eq v5, v7, :cond_4

    move v5, v6

    goto :goto_3

    :cond_4
    move v5, v15

    :goto_3
    and-int/2addr v3, v6

    invoke-virtual {v12, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v0}, Lb72/e;->k()Z

    move-result v3

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    const v3, 0x53c261a0

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const-string v3, "progress_modal_loading_lottie"

    invoke-static {v5, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v5, 0x4029000000000000L    # 12.5

    double-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v4, Lgy0/e;->d:I

    invoke-static {v4}, Lv41/r0$d;->b(I)I

    move-result v4

    invoke-static {v4}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_5

    new-instance v5, Lb1/h;

    const/16 v7, 0xb

    invoke-direct {v5, v7}, Lb1/h;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v8, v5

    check-cast v8, Lc93/a;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v6, :cond_6

    new-instance v5, Lb01/f;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lb01/f;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const v13, 0x1b0006

    const/16 v14, 0x19c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v14}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_7
    const v3, 0x53c742b5

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v4, v3, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lb72/e;->c()Ljava/lang/String;

    move-result-object v3

    const/high16 v30, 0xc00000

    if-eqz v3, :cond_b

    const v3, -0x1a67509e

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lb72/e;->c()Ljava/lang/String;

    move-result-object v4

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->q()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v8

    sget v3, Lb91/a;->d:I

    shl-int/2addr v3, v7

    or-int v28, v3, v30

    const v29, 0xfffa

    const/4 v5, 0x0

    move v3, v6

    move v10, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move/from16 v19, v18

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move/from16 v3, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v26

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    move/from16 v31, v7

    move v3, v15

    const v4, -0x1a652358

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v0}, Lb72/e;->i()Ljava/lang/String;

    move-result-object v4

    if-eqz v1, :cond_c

    const v5, -0x91bfb84

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->y()Lb91/a;

    move-result-object v5

    :goto_6
    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move-object/from16 v24, v5

    goto :goto_7

    :cond_c
    const v5, -0x91bf7c4

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v12, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->p()Lb91/a;

    move-result-object v5

    goto :goto_6

    :goto_7
    invoke-virtual {v0}, Lb72/e;->f()Lb72/f;

    move-result-object v5

    invoke-virtual {v5}, Lb72/f;->getColorKey()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v12, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v5, v5, 0x12

    or-int v28, v5, v30

    const v29, 0xfffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v26

    const/4 v4, 0x1

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_e

    new-instance v4, Lam0/b;

    const/4 v5, 0x3

    invoke-direct {v4, v0, v1, v2, v5}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lb72/e;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lb72/b;->l(Lb72/e;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lk2/e;FLy3/c;)V
    .locals 31

    move-object/from16 v0, p2

    const/16 v1, 0x12

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v3

    const/16 v1, 0xf3

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v0

    sub-float/2addr v0, v3

    const/high16 v1, 0x40000000    # 2.0f

    div-float v1, v3, v1

    invoke-interface/range {p0 .. p0}, Lk2/e;->B0()J

    move-result-wide v4

    invoke-interface/range {p0 .. p0}, Lk2/e;->t0()La3/p;

    move-result-object v9

    invoke-virtual {v9}, La3/p;->A()J

    move-result-wide v10

    invoke-virtual {v9}, La3/p;->w()Li2/v;

    move-result-object v2

    invoke-interface {v2}, Li2/v;->q()V

    :try_start_0
    iget-object v2, v9, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Laj/d;

    const/high16 v6, 0x43200000    # 160.0f

    invoke-virtual {v2, v6, v4, v5}, Laj/d;->v(FJ)V

    sget-object v12, Li2/t;->b:Li2/s;

    sget-wide v4, Li2/x;->f:J

    const v2, 0x3c23d70a    # 0.01f

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v6

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    invoke-static {v2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v8, v2}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v13

    const-wide/16 v16, 0x0

    const/16 v18, 0xe

    const-wide/16 v14, 0x0

    invoke-static/range {v12 .. v18}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v20

    const/high16 v2, 0x40200000    # 2.5f

    move/from16 v4, p1

    invoke-static {v4, v2}, Lb72/b;->z(FF)F

    move-result v21

    new-instance v2, Lk2/i;

    const/4 v7, 0x0

    const/16 v8, 0x1e

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lk2/i;-><init>(FFIILi2/t0;I)V

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    const/16 v0, 0x20

    shl-long/2addr v3, v0

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long v26, v3, v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    shl-long v0, v3, v0

    and-long v3, v5, v7

    or-long v24, v0, v3

    const/16 v23, 0x0

    const/16 v30, 0x140

    const/16 v29, 0x0

    const/high16 v22, 0x40200000    # 2.5f

    move-object/from16 v19, p0

    move-object/from16 v28, v2

    invoke-static/range {v19 .. v30}, Lk2/e;->X(Lk2/e;Li2/t;FFZJJLk2/i;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v9, v10, v11}, Ld;->z(La3/p;J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v9, v10, v11}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method public static final q(Lb72/e;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, 0x332e0cd4

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v13, 0x0

    if-eq v4, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v13

    :goto_2
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v6, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-virtual {v0}, Lb72/e;->k()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v0}, Lb72/e;->f()Lb72/f;

    move-result-object v3

    sget-object v4, Lb72/f;->MISSING_DATA:Lb72/f;

    if-eq v3, v4, :cond_3

    const/4 v14, 0x1

    goto :goto_3

    :cond_3
    move v14, v13

    :goto_3
    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_4

    invoke-static {v15, v6}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v4

    :cond_4
    move-object v10, v4

    check-cast v10, Lp1/c1;

    invoke-virtual {v0}, Lb72/e;->j()Z

    move-result v4

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v13, v15}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_5

    if-ne v9, v5, :cond_6

    :cond_5
    new-instance v9, Lb30/s2;

    const/4 v8, 0x1

    invoke-direct {v9, v3, v10, v8}, Lb30/s2;-><init>(Ly3/c;Lp1/c1;I)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v9}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->E:Lb2/m;

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v12, v6, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    move/from16 v17, v2

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-eqz v2, :cond_7

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v6, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 v18, v10

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v12, v6, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v18 .. v18}, Lb72/b;->r(Lp1/c1;)F

    move-result v7

    invoke-static {v7, v11}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {}, Lz71/d;->c()F

    move-result v10

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6, v4}, Lp1/q;->h(Z)Z

    move-result v10

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_a

    if-ne v12, v5, :cond_b

    :cond_a
    new-instance v12, Las1/f;

    const/4 v5, 0x1

    invoke-direct {v12, v4, v3, v5}, Las1/f;-><init>(ZLjava/lang/Object;I)V

    invoke-virtual {v6, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v12}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move v10, v4

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v6, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-nez v5, :cond_d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4, v6, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x0

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v6, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v4, v6, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v14, :cond_12

    move-object v3, v11

    goto :goto_7

    :cond_12
    const v3, 0x3e4ccccd    # 0.2f

    invoke-static {v3, v11}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    :goto_7
    if-eqz v10, :cond_13

    sget-object v4, Lb72/b;->d:Li91/a;

    goto :goto_8

    :cond_13
    sget-object v4, Lb72/b;->b:Li91/a;

    :goto_8
    if-eqz v10, :cond_14

    sget-object v5, Lb72/b;->e:Li91/a;

    goto :goto_9

    :cond_14
    sget-object v5, Lb72/b;->c:Li91/a;

    :goto_9
    sget v7, Li91/a;->a:I

    shl-int/lit8 v10, v7, 0x3

    const/4 v12, 0x6

    shl-int/2addr v7, v12

    or-int/2addr v7, v10

    move-object v10, v8

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lz71/l;->o(Landroidx/compose/ui/Modifier;Li91/a;Li91/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-static/range {v18 .. v18}, Lb72/b;->r(Lp1/c1;)F

    move-result v3

    invoke-static {v3, v11}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {}, Lz71/d;->c()F

    move-result v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v9, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_15
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    invoke-static {v5, v6, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v14, :cond_18

    invoke-virtual {v0}, Lb72/e;->e()Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_18

    const v3, -0x41b0d14d

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lb72/e;->e()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-static {v3, v4}, Lb72/b;->z(FF)F

    move-result v3

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    invoke-static/range {v3 .. v9}, Lz71/l;->t(FFLi2/t;ILandroidx/compose/runtime/Composer;II)V

    move-object v6, v7

    move-object v4, v10

    const/4 v10, 0x0

    move-object v5, v11

    const/16 v11, 0x3e

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v12, v19

    move-object/from16 v0, v20

    invoke-static/range {v3 .. v11}, Lz71/l;->w(FFFFLi2/t;ILandroidx/compose/runtime/Composer;II)V

    move-object v6, v9

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_b
    const/4 v3, 0x1

    goto :goto_c

    :cond_18
    move-object v12, v10

    move-object v0, v11

    const/4 v5, 0x0

    const v3, -0x41ad2e55

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v3, Lb2/e;->x:Lb2/m;

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_19
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v6, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_1a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    invoke-static {v5, v6, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v6, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0xa

    int-to-float v4, v4

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v4, v5, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_1c

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    invoke-static {v5, v6, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0x38

    int-to-float v3, v3

    invoke-static/range {v18 .. v18}, Lb72/b;->r(Lp1/c1;)F

    move-result v4

    invoke-static {v3, v4, v0, v6}, Ld;->w(FFLb2/t;Lp1/q;)V

    and-int/lit8 v3, v17, 0xe

    move-object/from16 v4, p0

    invoke-static {v4, v14, v6, v3}, Lb72/b;->l(Lb72/e;ZLandroidx/compose/runtime/Composer;I)V

    const/16 v3, 0x28

    int-to-float v3, v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x6

    invoke-static {v3, v5, v6, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_1f

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1f
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v6, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_20

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    :cond_20
    invoke-static {v5, v6, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v6, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lb72/e;->g()Lb72/d;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v14, v6, v5}, Lb72/b;->w(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4}, Lb72/e;->h()Lb72/d;

    move-result-object v0

    invoke-static {v0, v14, v6, v5}, Lb72/b;->w(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-static {v6, v3, v3, v3, v3}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_10

    :cond_22
    move-object v4, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_23

    new-instance v1, La41/i;

    const/4 v2, 0x7

    move/from16 v3, p2

    invoke-direct {v1, v4, v3, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final r(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final s(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final t(Ly3/c;Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 2

    const-string v0, "coordinates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2}, Ly2/y;->n()J

    move-result-wide v0

    const/16 p2, 0x20

    shr-long/2addr v0, p2

    long-to-int p2, v0

    invoke-interface {p0, p2}, Ly3/c;->e0(I)F

    move-result p0

    invoke-static {}, Lz71/d;->c()F

    move-result p2

    div-float/2addr p0, p2

    invoke-static {p1, p0}, Lb72/b;->s(Lp1/c1;F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(ZLy3/c;Lk2/c;)Ll83/a0;
    .locals 3

    const-string v0, "$this$drawWithContent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p2

    check-cast v0, La3/p0;

    iget-object v1, v0, La3/p0;->w:Lk2/b;

    iget-object v1, v1, Lk2/b;->x:La3/p;

    invoke-virtual {v1}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-static {v1}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2}, Landroid/graphics/Canvas;->saveLayer(Landroid/graphics/RectF;Landroid/graphics/Paint;)I

    invoke-virtual {v0}, La3/p0;->a()V

    if-nez p0, :cond_0

    const p0, 0x3ea8f5c3    # 0.33f

    invoke-static {p2, p0, p1}, Lb72/b;->p(Lk2/e;FLy3/c;)V

    const p0, 0x3f28f5c3    # 0.66f

    invoke-static {p2, p0, p1}, Lb72/b;->p(Lk2/e;FLy3/c;)V

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lb72/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lb72/b;->q(Lb72/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v25

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x2a891eba

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, v4, 0x13

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x12

    if-eq v5, v8, :cond_4

    move v5, v7

    goto :goto_3

    :cond_4
    move v5, v6

    :goto_3
    and-int/2addr v4, v7

    invoke-virtual {v3, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v5, v4, v3, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_5

    invoke-virtual {v3, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v3, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v3, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v5, v3, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v3, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lb72/d;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v5, v3, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->t()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v3, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->c1()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v8, v12, 0x12

    const/high16 v12, 0xc00000

    or-int v28, v8, v12

    const v29, 0xfffa

    move-object v8, v5

    const/4 v5, 0x0

    move-object v12, v8

    move v13, v9

    const-wide/16 v8, 0x0

    move v14, v7

    move-wide/from16 v33, v10

    move v11, v6

    move-wide/from16 v6, v33

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    move/from16 v22, v18

    const-wide/16 v17, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v30, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v26, v3

    move-object v3, v0

    move/from16 v1, v31

    move/from16 v0, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Lb72/d;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->D()Lb91/a;

    move-result-object v24

    if-eqz p1, :cond_8

    const v6, -0x2ec86366

    invoke-static {v4, v6, v3, v4, v0}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    :goto_5
    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    const v6, -0x2ec85f29

    invoke-static {v4, v6, v3, v4, v0}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    goto :goto_5

    :goto_6
    const/16 v27, 0x0

    const v29, 0xfffa

    move-object/from16 v26, v4

    move-object v4, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual/range {p0 .. p0}, Lb72/d;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v6

    const/4 v5, 0x0

    move-object v4, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lam0/b;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    move/from16 v5, p1

    invoke-direct {v1, v4, v5, v2, v3}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final x(Lb72/d;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lb72/b;->w(Lb72/d;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Li93/f;F)F
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li93/f;",
            "F)F"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p0}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-interface {p0}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    sub-float/2addr v1, p0

    mul-float/2addr v1, p1

    add-float/2addr v1, v0

    return v1
.end method

.method private static final z(FF)F
    .locals 1

    const/high16 v0, 0x435c0000    # 220.0f

    sub-float/2addr v0, p1

    mul-float/2addr v0, p0

    return v0
.end method
