.class public final Lyh0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyh0/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J!\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00062\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lyh0/c;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lec3/l;",
        "Lyh0/a;",
        "upstream",
        "Lyh0/b;",
        "c",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "amoeba_release"
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
.field public static final b:Lyh0/c$a;

.field public static final c:I

.field private static final d:F


# instance fields
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyh0/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyh0/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lyh0/c;->b:Lyh0/c$a;

    const/16 v0, 0x8

    sput v0, Lyh0/c;->c:I

    const v0, 0x420a6666    # 34.6f

    sput v0, Lyh0/c;->d:F

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyh0/c;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static final synthetic a()F
    .locals 1

    sget v0, Lyh0/c;->d:F

    return v0
.end method

.method public static final synthetic b(Lyh0/c;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lyh0/c;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method


# virtual methods
.method public final c(Lec3/l;)Lec3/l;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyh0/b$b;->a:Lyh0/b$b;

    new-instance v1, Lyh0/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lyh0/c$b;-><init>(Lyh0/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
