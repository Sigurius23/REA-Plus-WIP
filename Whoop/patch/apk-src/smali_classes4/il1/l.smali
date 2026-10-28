.class public final Lil1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lil1/l$a;,
        Lil1/l$b;,
        Lil1/l$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0015\u0013\u0011B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lil1/l;",
        "",
        "Ljava/time/Clock;",
        "clock",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljs0/c;",
        "configurationRepository",
        "Lj02/r;",
        "deviceHomeDestinationSource",
        "<init>",
        "(Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lj02/r;)V",
        "Lec3/l;",
        "Lil1/u;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Ljava/time/Clock;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "c",
        "Ljs0/c;",
        "d",
        "Lj02/r;",
        "Lil1/l$c;",
        "Lil1/l$c;",
        "initial",
        "f",
        "home_release"
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
.field public static final f:Lil1/l$a;

.field public static final g:I


# instance fields
.field private final a:Ljava/time/Clock;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ljs0/c;

.field private final d:Lj02/r;

.field private final e:Lil1/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lil1/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lil1/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lil1/l;->f:Lil1/l$a;

    const/16 v0, 0x8

    sput v0, Lil1/l;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljs0/c;Lj02/r;)V
    .locals 9

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configurationRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceHomeDestinationSource"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lil1/l;->a:Ljava/time/Clock;

    iput-object p2, p0, Lil1/l;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    iput-object p3, p0, Lil1/l;->c:Ljs0/c;

    iput-object p4, p0, Lil1/l;->d:Lj02/r;

    new-instance v1, Lil1/l$c;

    invoke-static {p1}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v2

    const-string p2, "now(...)"

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/time/Clock;->millis()J

    move-result-wide v3

    const/16 v7, 0xc

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lil1/l$c;-><init>(Ljava/time/LocalDate;JLfm1/g;Lil1/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lil1/l;->e:Lil1/l$c;

    return-void
.end method

.method public static final synthetic a(Lil1/l;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lil1/l;->a:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic b(Lil1/l;)Ljs0/c;
    .locals 0

    iget-object p0, p0, Lil1/l;->c:Ljs0/c;

    return-object p0
.end method

.method public static final synthetic c(Lil1/l;)Lj02/r;
    .locals 0

    iget-object p0, p0, Lil1/l;->d:Lj02/r;

    return-object p0
.end method

.method public static final synthetic d(Lil1/l;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    iget-object p0, p0, Lil1/l;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object p0
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
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

    iget-object v0, p0, Lil1/l;->e:Lil1/l$c;

    new-instance v1, Lil1/l$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lil1/l$f;-><init>(Lil1/l;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lil1/l$e;

    invoke-direct {p1, v2}, Lil1/l$e;-><init>(Lec3/l;)V

    new-instance v0, Lil1/l$d;

    invoke-direct {v0, p1, p0}, Lil1/l$d;-><init>(Lec3/l;Lil1/l;)V

    return-object v0
.end method
