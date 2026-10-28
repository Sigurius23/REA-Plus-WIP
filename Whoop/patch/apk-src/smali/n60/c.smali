.class public final Ln60/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ!\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00112\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Ln60/c;",
        "",
        "Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;",
        "api",
        "Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;",
        "streakCelebrationApi",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;Ltr2/n;)V",
        "",
        "achievementType",
        "Ln60/b;",
        "e",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "celebrationType",
        "f",
        "Lec3/l;",
        "Ln60/a;",
        "upstream",
        "g",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;",
        "b",
        "Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;",
        "c",
        "Ltr2/n;",
        "achievements_release"
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
.field private final a:Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;

.field private final b:Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streakCelebrationApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ln60/c;->a:Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;

    .line 3
    iput-object p2, p0, Ln60/c;->b:Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;

    .line 4
    iput-object p3, p0, Ln60/c;->c:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 5
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "AchievementCelebrationInteractor"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Ln60/c;-><init>(Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Ln60/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln60/c;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ln60/c;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Ln60/c;->f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ln60/c;)Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;
    .locals 0

    iget-object p0, p0, Ln60/c;->a:Lcom/whoop/achievements/celebration/api/AchievementCelebrationApi;

    return-object p0
.end method

.method public static final synthetic d(Ln60/c;)Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;
    .locals 0

    iget-object p0, p0, Ln60/c;->b:Lcom/whoop/achievements/celebration/api/StreakCelebrationApi;

    return-object p0
.end method

.method private final e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln60/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ln60/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln60/c$a;

    iget v1, v0, Ln60/c$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln60/c$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln60/c$a;

    invoke-direct {v0, p0, p2}, Ln60/c$a;-><init>(Ln60/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ln60/c$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln60/c$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ln60/c$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Ln60/c;->c:Ltr2/n;

    new-instance v5, Ln60/c$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ln60/c$b;-><init>(Ln60/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Ln60/c$a;->w:Ljava/lang/Object;

    iput p2, v6, Ln60/c$a;->z:I

    const-string v4, "Failed to fetch achievement celebration"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;

    if-eqz p1, :cond_4

    new-instance p2, Ln60/b$c;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;->getCelebrationOverlay()Lcom/whoop/design/models/celebration/CelebrationOverlayModel;

    move-result-object p1

    invoke-direct {p2, p1}, Ln60/b$c;-><init>(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)V

    return-object p2

    :cond_4
    sget-object p1, Ln60/b$a;->a:Ln60/b$a;

    return-object p1
.end method

.method private final f(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln60/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ln60/c$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ln60/c$c;

    iget v1, v0, Ln60/c$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln60/c$c;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Ln60/c$c;

    invoke-direct {v0, p0, p2}, Ln60/c$c;-><init>(Ln60/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Ln60/c$c;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Ln60/c$c;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Ln60/c$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Ln60/c;->c:Ltr2/n;

    new-instance v5, Ln60/c$d;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Ln60/c$d;-><init>(Ln60/c;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Ln60/c$c;->w:Ljava/lang/Object;

    iput p2, v6, Ln60/c$c;->z:I

    const-string v4, "Failed to fetch streak celebration"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    invoke-static {p2}, Lu02/b;->b(Lu02/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;

    if-eqz p1, :cond_4

    new-instance p2, Ln60/b$c;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/models/AchievementCelebrationResponse;->getCelebrationOverlay()Lcom/whoop/design/models/celebration/CelebrationOverlayModel;

    move-result-object p1

    invoke-direct {p2, p1}, Ln60/b$c;-><init>(Lcom/whoop/design/models/celebration/CelebrationOverlayModel;)V

    return-object p2

    :cond_4
    sget-object p1, Ln60/b$a;->a:Ln60/b$a;

    return-object p1
.end method


# virtual methods
.method public final g(Lec3/l;)Lec3/l;
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

    sget-object v0, Ln60/b$b;->a:Ln60/b$b;

    new-instance v1, Ln60/c$e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Ln60/c$e;-><init>(Ln60/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
