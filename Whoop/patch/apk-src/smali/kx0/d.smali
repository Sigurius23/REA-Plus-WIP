.class public final Lkx0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lkx0/b;",
        "Lkx0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lkx0/d;",
        "Lod1/g;",
        "Lkx0/b;",
        "Lkx0/e;",
        "Lyh2/c;",
        "sensorHistoricalPullApi",
        "Lci2/b;",
        "whoopStrapProvider",
        "Ltr2/n;",
        "logger",
        "Lkotlin/time/Duration;",
        "timeoutDuration",
        "<init>",
        "(Lyh2/c;Lci2/b;Ltr2/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lyh2/c;",
        "b",
        "Lci2/b;",
        "c",
        "Ltr2/n;",
        "d",
        "J",
        "data-sync-service_release"
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
.field private final a:Lyh2/c;

.field private final b:Lci2/b;

.field private final c:Ltr2/n;

.field private final d:J


# direct methods
.method private constructor <init>(Lyh2/c;Lci2/b;Ltr2/n;J)V
    .locals 1

    const-string v0, "sensorHistoricalPullApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrapProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lkx0/d;->a:Lyh2/c;

    .line 4
    iput-object p2, p0, Lkx0/d;->b:Lci2/b;

    .line 5
    iput-object p3, p0, Lkx0/d;->c:Ltr2/n;

    .line 6
    iput-wide p4, p0, Lkx0/d;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Lyh2/c;Lci2/b;Ltr2/n;JLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lkx0/d;-><init>(Lyh2/c;Lci2/b;Ltr2/n;J)V

    return-void
.end method

.method public static final synthetic c(Lkx0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lkx0/d;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic d(Lkx0/d;)Lyh2/c;
    .locals 0

    iget-object p0, p0, Lkx0/d;->a:Lyh2/c;

    return-object p0
.end method

.method public static final synthetic e(Lkx0/d;)J
    .locals 2

    iget-wide v0, p0, Lkx0/d;->d:J

    return-wide v0
.end method

.method public static final synthetic f(Lkx0/d;)Lci2/b;
    .locals 0

    iget-object p0, p0, Lkx0/d;->b:Lci2/b;

    return-object p0
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lkx0/d$a;

    invoke-direct {v0, p1}, Lkx0/d$a;-><init>(Lec3/l;)V

    new-instance p1, Lkx0/d$b;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Lkx0/d$b;-><init>(Lq83/d;Lkx0/d;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
