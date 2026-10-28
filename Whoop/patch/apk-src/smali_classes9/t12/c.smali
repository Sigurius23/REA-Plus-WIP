.class public final Lt12/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt12/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lt12/a;",
        "Lt12/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\u000f\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000c2\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lt12/c;",
        "Lod1/g;",
        "Lt12/a;",
        "Lt12/b;",
        "Lnm0/e;",
        "cachedApiSource",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Ltr2/n;)V",
        "La12/a;",
        "parsed",
        "Lec3/l;",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "f",
        "(La12/a;)Lec3/l;",
        "g",
        "(Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lnm0/e;",
        "b",
        "Ltr2/n;",
        "onboarding-personalization_release"
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
.field private final a:Lnm0/e;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lnm0/e;Ltr2/n;)V
    .locals 1

    const-string v0, "cachedApiSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt12/c;->a:Lnm0/e;

    iput-object p2, p0, Lt12/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic c(Lt12/c;La12/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lt12/c;->f(La12/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lt12/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lt12/c;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic e(Lt12/c;Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;
    .locals 0

    invoke-direct {p0, p1}, Lt12/c;->g(Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final f(La12/a;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La12/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/onboardingpersonalization/dayzero/header/domain/GetDayZeroHeaderWidgetsRequest;

    invoke-virtual {p1}, La12/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, La12/a;->b()Ljava/util/Map;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/whoop/onboardingpersonalization/dayzero/header/domain/GetDayZeroHeaderWidgetsRequest;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    new-instance v1, La6/u;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x3

    const/4 v2, 0x0

    invoke-static {v1, v2, v2, v0, v2}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object v0

    iget-object v1, p0, Lt12/c;->a:Lnm0/e;

    new-instance v3, Lt12/c$b;

    invoke-direct {v3, v2, v1}, Lt12/c$b;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {v0, v3}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object v0

    new-instance v1, Lt12/c$c;

    invoke-direct {v1, v0, p0, p1}, Lt12/c$c;-><init>(Lec3/l;Lt12/c;La12/a;)V

    return-object v1
.end method

.method private final g(Lcom/whoop/design/models/DesignSystemModel;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/onboardingpersonalization/dayzero/header/models/DayZeroHeaderWidgetsModel;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/onboardingpersonalization/dayzero/header/models/DayZeroHeaderWidgetsModel;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    iget-object v2, p0, Lt12/c;->b:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v3, "Header response was not a DAY_ZERO_HEADER_WIDGETS envelope but "

    const-string v4, ", holding previous header"

    invoke-static {v3, p1, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    const-string v4, "DayZeroHeaderWidgets"

    invoke-interface {v2, v4, p1, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/onboardingpersonalization/dayzero/header/models/DayZeroHeaderWidgetsModel;->getItems()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
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

    new-instance v0, Lt12/c$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lt12/c$d;-><init>(Lq83/d;Lt12/c;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lt12/c$a;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lt12/c$a;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lt12/c$f;

    invoke-direct {v2, v1}, Lt12/c$f;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    new-instance p1, Lt12/c$e;

    invoke-direct {p1, v1}, Lt12/c$e;-><init>(Lec3/l;)V

    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
