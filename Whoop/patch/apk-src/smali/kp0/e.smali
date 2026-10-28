.class public final Lkp0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkp0/e$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lkp0/e;",
        "",
        "Landroid/content/SharedPreferences;",
        "sharedPreferences",
        "Lin2/d;",
        "dispatcherFactory",
        "Ltr2/n;",
        "log",
        "<init>",
        "(Landroid/content/SharedPreferences;Lin2/d;Ltr2/n;)V",
        "Lorg/joda/time/Instant;",
        "b",
        "(Lq83/d;)Ljava/lang/Object;",
        "instant",
        "Ll83/a0;",
        "c",
        "(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/SharedPreferences;",
        "Lin2/d;",
        "Ltr2/n;",
        "d",
        "sleep-coach_release"
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
.field public static final d:Lkp0/e$a;

.field public static final e:I


# instance fields
.field private final a:Landroid/content/SharedPreferences;

.field private final b:Lin2/d;

.field private final c:Ltr2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkp0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkp0/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lkp0/e;->d:Lkp0/e$a;

    const/16 v0, 0x8

    sput v0, Lkp0/e;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Lin2/d;Ltr2/n;)V
    .locals 1

    const-string v0, "sharedPreferences"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkp0/e;->a:Landroid/content/SharedPreferences;

    iput-object p2, p0, Lkp0/e;->b:Lin2/d;

    iput-object p3, p0, Lkp0/e;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lkp0/e;)Landroid/content/SharedPreferences;
    .locals 0

    iget-object p0, p0, Lkp0/e;->a:Landroid/content/SharedPreferences;

    return-object p0
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lorg/joda/time/Instant;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lkp0/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lkp0/e$b;

    iget v1, v0, Lkp0/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkp0/e$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkp0/e$b;

    invoke-direct {v0, p0, p1}, Lkp0/e$b;-><init>(Lkp0/e;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lkp0/e$b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkp0/e$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lkp0/e;->b:Lin2/d;

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lkp0/e$c;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lkp0/e$c;-><init>(Lkp0/e;Lq83/d;)V

    iput v3, v0, Lkp0/e$b;->y:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lorg/joda/time/Instant;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :catchall_0
    sget-object p1, Lorg/joda/time/Instant;->EPOCH:Lorg/joda/time/Instant;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final c(Lorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/Instant;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lkp0/e$d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lkp0/e$d;

    iget v1, v0, Lkp0/e$d;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lkp0/e$d;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lkp0/e$d;

    invoke-direct {v0, p0, p2}, Lkp0/e$d;-><init>(Lkp0/e;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lkp0/e$d;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lkp0/e$d;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lkp0/e$d;->w:Ljava/lang/Object;

    check-cast p1, Lorg/joda/time/Instant;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lkp0/e;->b:Lin2/d;

    invoke-interface {p2}, Lin2/d;->b()Lq83/j;

    move-result-object p2

    new-instance v2, Lkp0/e$e;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p1, v4}, Lkp0/e$e;-><init>(Lkp0/e;Lorg/joda/time/Instant;Lq83/d;)V

    iput-object v4, v0, Lkp0/e$d;->w:Ljava/lang/Object;

    iput v3, v0, Lkp0/e$d;->z:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    iget-object p2, p0, Lkp0/e;->c:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "WakeWindow"

    const-string v2, "Failed to set in high freq until"

    invoke-interface {p2, v1, v2, p1, v0}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
