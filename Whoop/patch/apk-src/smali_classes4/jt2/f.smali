.class public final Ljt2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Ljt2/l;",
        "Ljt2/p;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J#\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Ljt2/f;",
        "Lod1/g;",
        "Ljt2/l;",
        "Ljt2/p;",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lls2/b;",
        "analyticsHelper",
        "",
        "category",
        "<init>",
        "(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;Ljava/lang/String;)V",
        "planName",
        "Lec3/l;",
        "k",
        "(Ljava/lang/String;)Lec3/l;",
        "Ljt2/l$g;",
        "domainAction",
        "l",
        "(Ljt2/l$g;)Lec3/l;",
        "Ljt2/l$b;",
        "j",
        "(Ljt2/l$b;)Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/weeklyplan/api/WeeklyPlanApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lls2/b;",
        "d",
        "Ljava/lang/String;",
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

.field private final b:Ltr2/n;

.field private final c:Lls2/b;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/api/WeeklyPlanApi;Ltr2/n;Lls2/b;Ljava/lang/String;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljt2/f;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    iput-object p2, p0, Ljt2/f;->b:Ltr2/n;

    iput-object p3, p0, Ljt2/f;->c:Lls2/b;

    iput-object p4, p0, Ljt2/f;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic c(Ljt2/f;Ljt2/l$b;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ljt2/f;->j(Ljt2/l$b;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ljt2/f;)Lls2/b;
    .locals 0

    iget-object p0, p0, Ljt2/f;->c:Lls2/b;

    return-object p0
.end method

.method public static final synthetic e(Ljt2/f;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;
    .locals 0

    iget-object p0, p0, Ljt2/f;->a:Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    return-object p0
.end method

.method public static final synthetic f(Ljt2/f;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ljt2/f;->k(Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Ljt2/f;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ljt2/f;->d:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic h(Ljt2/f;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ljt2/f;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic i(Ljt2/f;Ljt2/l$g;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Ljt2/f;->l(Ljt2/l$g;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method private final j(Ljt2/l$b;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/l$b;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ljt2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljt2/f$a;-><init>(Ljt2/f;Ljt2/l$b;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final k(Ljava/lang/String;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ljt2/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljt2/f$b;-><init>(Ljt2/f;Ljava/lang/String;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final l(Ljt2/l$g;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/l$g;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Ljt2/f$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Ljt2/f$e;-><init>(Ljt2/f;Ljt2/l$g;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
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

    new-instance v0, Ljt2/f$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ljt2/f$c;-><init>(Lq83/d;Ljt2/f;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method
