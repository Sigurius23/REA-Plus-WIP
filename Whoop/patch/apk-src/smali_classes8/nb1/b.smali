.class public final Lnb1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0011\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00158\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0012\u001a\u0004\u0008\u000b\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0006X\u0086D\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0005\u0010\u0013\u00a8\u0006\u001a"
    }
    d2 = {
        "Lnb1/b;",
        "",
        "<init>",
        "()V",
        "Li2/x;",
        "b",
        "J",
        "getTransparent-0d7_KjU",
        "()J",
        "transparent",
        "Li2/t;",
        "c",
        "Li2/t;",
        "a",
        "()Li2/t;",
        "centerShadowBrush",
        "Ly3/f;",
        "d",
        "F",
        "()F",
        "radius",
        "",
        "e",
        "particleSpeedFactor",
        "f",
        "particleSizeFactor",
        "design-models_release"
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
.field public static final a:Lnb1/b;

.field private static final b:J

.field private static final c:Li2/t;

.field private static final d:F

.field private static final e:F

.field private static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lnb1/b;

    invoke-direct {v0}, Lnb1/b;-><init>()V

    sput-object v0, Lnb1/b;->a:Lnb1/b;

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-static {v1, v1, v1, v1, v0}, Li2/w0;->f(FFFFI)J

    move-result-wide v2

    sput-wide v2, Lnb1/b;->b:J

    sget-object v4, Li2/t;->b:Li2/s;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    new-instance v1, Li2/x;

    invoke-direct {v1, v2, v3}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    new-instance v1, Li2/x;

    invoke-direct {v1, v2, v3}, Li2/x;-><init>(J)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v2}, [Ll83/k;

    move-result-object v5

    const/4 v8, 0x0

    const/16 v9, 0xe

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Li2/s;->h(Li2/s;[Ll83/k;JFI)Li2/u0;

    move-result-object v0

    sput-object v0, Lnb1/b;->c:Li2/t;

    const/16 v0, 0x1c

    int-to-float v0, v0

    sput v0, Lnb1/b;->d:F

    const v0, 0x3e3851ec    # 0.18f

    sput v0, Lnb1/b;->e:F

    const v0, 0x3e19999a    # 0.15f

    sput v0, Lnb1/b;->f:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Li2/t;
    .locals 1

    sget-object v0, Lnb1/b;->c:Li2/t;

    return-object v0
.end method

.method public final b()F
    .locals 1

    sget v0, Lnb1/b;->f:F

    return v0
.end method

.method public final c()F
    .locals 1

    sget v0, Lnb1/b;->e:F

    return v0
.end method

.method public final d()F
    .locals 1

    sget v0, Lnb1/b;->d:F

    return v0
.end method
