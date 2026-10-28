.class public final Ldc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0008\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0006\u001a\u0004\u0008\t\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0006\u001a\u0004\u0008\u000c\u0010\u0007\u00a8\u0006\u000e"
    }
    d2 = {
        "Ldc1/b;",
        "",
        "<init>",
        "()V",
        "Li2/x;",
        "b",
        "J",
        "()J",
        "STRESS_LOW",
        "c",
        "STRESS_MEDIUM",
        "d",
        "a",
        "STRESS_HIGH",
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
.field public static final a:Ldc1/b;

.field private static final b:J

.field private static final c:J

.field private static final d:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldc1/b;

    invoke-direct {v0}, Ldc1/b;-><init>()V

    sput-object v0, Ldc1/b;->a:Ldc1/b;

    const-wide v0, 0xff2c4457L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Ldc1/b;->b:J

    const-wide v0, 0xff0d5943L

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Ldc1/b;->c:J

    const-wide v0, 0xff5a431eL

    invoke-static {v0, v1}, Li2/w0;->e(J)J

    move-result-wide v0

    sput-wide v0, Ldc1/b;->d:J

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    sget-wide v0, Ldc1/b;->d:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    sget-wide v0, Ldc1/b;->b:J

    return-wide v0
.end method

.method public final c()J
    .locals 2

    sget-wide v0, Ldc1/b;->c:J

    return-wide v0
.end method
