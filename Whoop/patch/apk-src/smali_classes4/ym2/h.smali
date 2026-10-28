.class public final Lym2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym2/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8V@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0010\u0010\u0012\"\u0004\u0008\u000c\u0010\u0013R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0012\u00a8\u0006\u001a"
    }
    d2 = {
        "Lym2/h;",
        "Lym2/g;",
        "Lor2/t1;",
        "systemSettingsChecker",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lor2/t1;Ltr2/n;)V",
        "Ll83/a0;",
        "a",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lor2/t1;",
        "b",
        "Ltr2/n;",
        "",
        "value",
        "c",
        "Z",
        "()Z",
        "(Z)V",
        "splashShown",
        "Lec3/o1;",
        "d",
        "Lec3/o1;",
        "splashShownFlow",
        "animatorsDisabledInDeveloperOptions",
        "feature_release"
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
.field private final a:Lor2/t1;

.field private final b:Ltr2/n;

.field private c:Z

.field private final d:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lor2/t1;Ltr2/n;)V
    .locals 2

    const-string v0, "systemSettingsChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lym2/h;->a:Lor2/t1;

    .line 3
    iput-object p2, p0, Lym2/h;->b:Ltr2/n;

    .line 4
    sget-object p1, Ldc3/a;->x:Ldc3/a;

    const/4 p2, 0x2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object p1

    iput-object p1, p0, Lym2/h;->d:Lec3/o1;

    return-void
.end method

.method public synthetic constructor <init>(Lor2/t1;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "WhoopSplashState"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Lym2/h;-><init>(Lor2/t1;Ltr2/n;)V

    return-void
.end method

.method private final d()Z
    .locals 3

    iget-object v0, p0, Lym2/h;->a:Lor2/t1;

    const-string v1, "animator_duration_scale"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-interface {v0, v1, v2}, Lor2/t1;->getFloat(Ljava/lang/String;F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lym2/h;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lym2/h;->d:Lec3/o1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lym2/h;->d:Lec3/o1;

    new-instance v1, Lch/i;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    invoke-static {v1, p1}, Lec3/v;->m(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_2

    return-object p1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public b(Z)V
    .locals 3

    iget-object v0, p0, Lym2/h;->b:Ltr2/n;

    const-string v1, "Setting splash shown = "

    invoke-static {v1, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-boolean p1, p0, Lym2/h;->c:Z

    iget-object v0, p0, Lym2/h;->d:Lec3/o1;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public c()Z
    .locals 4

    iget-object v0, p0, Lym2/h;->b:Ltr2/n;

    iget-object v1, p0, Lym2/h;->d:Lec3/o1;

    invoke-interface {v1}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Getting splashShownState: "

    invoke-static {v1, v2}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lym2/h;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lym2/h;->d:Lec3/o1;

    invoke-interface {v0}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    :goto_1
    const/4 v0, 0x1

    return v0
.end method
