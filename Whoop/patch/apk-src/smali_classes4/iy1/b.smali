.class public final Liy1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Liy1/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Liy1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\tB\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Liy1/b;",
        "Liy1/c;",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Ljy1/a;",
        "metric",
        "Ll83/a0;",
        "a",
        "(Ljy1/a;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Ljy1/a;)V",
        "Ltr2/n;",
        "metrics_release"
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
.field public static final b:Liy1/b$a;

.field private static final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Liy1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Liy1/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Liy1/b;->b:Liy1/b$a;

    const-string v0, "whoop.api.status_code"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Liy1/b;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liy1/b;->a:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string p2, "MetricWriter"

    invoke-virtual {p1, p2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    :cond_0
    invoke-direct {p0, p1}, Liy1/b;-><init>(Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public a(Ljy1/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljy1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Liy1/b;->c:Ljava/util/Set;

    invoke-virtual {p1}, Ljy1/a;->e()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Liy1/b;->a:Ltr2/n;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "insertMetricToCache "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Ljy1/a;)V
    .locals 3

    const-string v0, "metric"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Liy1/b;->c:Ljava/util/Set;

    invoke-virtual {p1}, Ljy1/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Liy1/b;->a:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "insertMetricToCacheAsync "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_0
    return-void
.end method
