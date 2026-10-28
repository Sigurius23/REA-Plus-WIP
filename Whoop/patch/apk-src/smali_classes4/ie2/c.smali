.class public final Lie2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0014\u0010\r\u001a\u00020\u000c*\u00020\u000cH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ$\u0010\u0012\u001a\u00020\u000c*\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00142\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lie2/c;",
        "",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "api",
        "Lfi0/a;",
        "analytics",
        "Lxm0/b;",
        "cacheUpdater",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V",
        "Lie2/b;",
        "e",
        "(Lie2/b;Lq83/d;)Ljava/lang/Object;",
        "",
        "isDetectionOn",
        "isNotificationOn",
        "g",
        "(Lie2/b;ZZLq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lie2/a;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/shepherd/domain/ShepherdApi;",
        "b",
        "Lfi0/a;",
        "c",
        "Lxm0/b;",
        "d",
        "Ltr2/n;",
        "shepherd_release"
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
.field private final a:Lcom/whoop/shepherd/domain/ShepherdApi;

.field private final b:Lfi0/a;

.field private final c:Lxm0/b;

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/shepherd/domain/ShepherdApi;Lfi0/a;Lxm0/b;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheUpdater"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lie2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    iput-object p2, p0, Lie2/c;->b:Lfi0/a;

    iput-object p3, p0, Lie2/c;->c:Lxm0/b;

    iput-object p4, p0, Lie2/c;->d:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lie2/c;Lie2/b;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lie2/c;->e(Lie2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lie2/c;)Lfi0/a;
    .locals 0

    iget-object p0, p0, Lie2/c;->b:Lfi0/a;

    return-object p0
.end method

.method public static final synthetic c(Lie2/c;)Lcom/whoop/shepherd/domain/ShepherdApi;
    .locals 0

    iget-object p0, p0, Lie2/c;->a:Lcom/whoop/shepherd/domain/ShepherdApi;

    return-object p0
.end method

.method public static final synthetic d(Lie2/c;Lie2/b;ZZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lie2/c;->g(Lie2/b;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lie2/b;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie2/b;",
            "Lq83/d<",
            "-",
            "Lie2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lie2/c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lie2/c$a;

    iget v1, v0, Lie2/c$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lie2/c$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lie2/c$a;

    invoke-direct {v0, p0, p2}, Lie2/c$a;-><init>(Lie2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lie2/c$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lie2/c$a;->z:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lie2/c$a;->w:Ljava/lang/Object;

    check-cast p1, Lie2/b;

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

    iget-object v2, p0, Lie2/c;->d:Ltr2/n;

    new-instance v5, Lie2/c$b;

    invoke-direct {v5, p0, v9}, Lie2/c$b;-><init>(Lie2/c;Lq83/d;)V

    iput-object p1, v6, Lie2/c$a;->w:Ljava/lang/Object;

    iput p2, v6, Lie2/c$a;->z:I

    const/4 v3, 0x0

    const-string v4, "Failed to fetch arrhythmia settings BFF"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of v0, p2, Lu02/a$b;

    if-eqz v0, :cond_4

    sget-object p2, Lie2/d$b;->a:Lie2/d$b;

    const/4 v0, 0x2

    invoke-static {p1, p2, v9, v0, v9}, Lie2/b;->b(Lie2/b;Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILjava/lang/Object;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v0, p2, Lu02/a$c;

    if-eqz v0, :cond_5

    sget-object v0, Lie2/d$c;->a:Lie2/d$c;

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    invoke-virtual {p1, v0, p2}, Lie2/b;->a(Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lie2/b;ZZLq83/d;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lie2/b;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Lie2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lie2/c$d;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lie2/c$d;

    iget v1, v0, Lie2/c$d;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lie2/c$d;->H:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lie2/c$d;

    invoke-direct {v0, p0, p4}, Lie2/c$d;-><init>(Lie2/c;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p4, v6, Lie2/c$d;->F:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lie2/c$d;->H:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x2

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v10, :cond_1

    iget-object p1, v6, Lie2/c$d;->x:Ljava/lang/Object;

    check-cast p1, Lu02/a;

    iget-object p2, v6, Lie2/c$d;->w:Ljava/lang/Object;

    check-cast p2, Lie2/b;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, v6, Lie2/c$d;->z:Z

    iget-boolean p2, v6, Lie2/c$d;->y:Z

    iget-object p1, v6, Lie2/c$d;->w:Ljava/lang/Object;

    check-cast p1, Lie2/b;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p4, v2

    iget-object v2, p0, Lie2/c;->d:Ltr2/n;

    new-instance v5, Lie2/c$e;

    invoke-direct {v5, p2, p3, p0, v9}, Lie2/c$e;-><init>(ZZLie2/c;Lq83/d;)V

    iput-object p1, v6, Lie2/c$d;->w:Ljava/lang/Object;

    iput-boolean p2, v6, Lie2/c$d;->y:Z

    iput-boolean p3, v6, Lie2/c$d;->z:Z

    iput p4, v6, Lie2/c$d;->H:I

    const/4 v3, 0x0

    const-string v4, "Failed to upload arrhythmia settings"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_2
    check-cast p4, Lu02/a;

    instance-of v1, p4, Lu02/a$b;

    if-eqz v1, :cond_5

    new-instance p4, Lie2/d$a;

    invoke-direct {p4, p2, p3}, Lie2/d$a;-><init>(ZZ)V

    invoke-static {p1, p4, v9, v10, v9}, Lie2/b;->b(Lie2/b;Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILjava/lang/Object;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_5
    instance-of v1, p4, Lu02/a$c;

    if-eqz v1, :cond_7

    iget-object v1, p0, Lie2/c;->c:Lxm0/b;

    iput-object p1, v6, Lie2/c$d;->w:Ljava/lang/Object;

    iput-object p4, v6, Lie2/c$d;->x:Ljava/lang/Object;

    iput-boolean p2, v6, Lie2/c$d;->y:Z

    iput-boolean p3, v6, Lie2/c$d;->z:Z

    const/4 p2, 0x0

    iput p2, v6, Lie2/c$d;->E:I

    iput v10, v6, Lie2/c$d;->H:I

    const-string p2, "shepherdrefreshscope"

    invoke-virtual {v1, p2, v6}, Lxm0/b;->a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    :goto_3
    return-object v0

    :cond_6
    move-object p2, p1

    move-object p1, p4

    :goto_4
    sget-object p3, Lie2/d$f;->a:Lie2/d$f;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;

    invoke-virtual {p2, p3, p1}, Lie2/b;->a(Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)Lie2/b;

    move-result-object p1

    return-object p1

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
    .locals 4
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

    new-instance v0, Lie2/b;

    sget-object v1, Lie2/d$d;->a:Lie2/d$d;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2, v3}, Lie2/b;-><init>(Lie2/d;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lie2/c$c;

    invoke-direct {v1, p0, v3}, Lie2/c$c;-><init>(Lie2/c;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
