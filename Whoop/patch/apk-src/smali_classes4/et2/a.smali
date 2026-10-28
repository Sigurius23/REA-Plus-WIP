.class public final Let2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lct2/a;",
        "Lct2/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Let2/a;",
        "Lod1/g;",
        "Lct2/a;",
        "Lct2/b;",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "api",
        "Lnm0/e;",
        "cachedApiSource",
        "Lct2/c;",
        "refreshHook",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lct2/c;Ltr2/n;)V",
        "Ljava/time/LocalDate;",
        "date",
        "Lec3/l;",
        "d",
        "(Ljava/time/LocalDate;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "b",
        "Lnm0/e;",
        "c",
        "Lct2/c;",
        "Ltr2/n;",
        "weekly-plan_release"
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
.field private final a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

.field private final b:Lnm0/e;

.field private final c:Lct2/c;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Lnm0/e;Lct2/c;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedApiSource"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "refreshHook"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Let2/a;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    iput-object p2, p0, Let2/a;->b:Lnm0/e;

    iput-object p3, p0, Let2/a;->c:Lct2/c;

    iput-object p4, p0, Let2/a;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Let2/a;Ljava/time/LocalDate;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Let2/a;->d(Ljava/time/LocalDate;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/time/LocalDate;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/time/LocalDate;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/weeklyplan/api/WeeklyPlanHomeTileGetRequest;

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/api/WeeklyPlanHomeTileGetRequest;-><init>(Ljava/lang/String;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Let2/a;->b:Lnm0/e;

    new-instance v3, Let2/a$a;

    invoke-direct {v3, v2, v1}, Let2/a$a;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Let2/a$b;

    invoke-direct {v1, v0, p1}, Let2/a$b;-><init>(Lec3/l;Ljava/time/LocalDate;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
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

    iget-object v0, p0, Let2/a;->c:Lct2/c;

    invoke-virtual {v0}, Lct2/c;->a()Lec3/t1;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lec3/l;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p1, v1}, Lor2/e0;->a(Lec3/l;[Lec3/l;)Lec3/l;

    move-result-object p1

    new-instance v0, Let2/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Let2/a$c;-><init>(Lq83/d;Let2/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
