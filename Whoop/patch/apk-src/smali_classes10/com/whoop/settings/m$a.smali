.class final Lcom/whoop/settings/m$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/m;-><init>(Lrv1/a;Lcom/whoop/data/local/prefs/PreferenceHelper;Lz82/b;Lcom/whoop/data/repositories/SettingsLandingRepository;Lsb0/f;Lpz1/e;Lxf2/a;Lhf1/b;Lyk0/a;Lsr2/y;Liw2/c;Lz92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwe1/a;Lea2/d0;Ljava/time/Clock;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.SettingsLandingViewModel$1"
    f = "SettingsLandingViewModel.kt"
    l = {
        0x69,
        0x6a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Z

.field x:I

.field final synthetic y:Lcom/whoop/settings/m;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/m;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/m$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/settings/m$a;

    iget-object v0, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/m$a;-><init>(Lcom/whoop/settings/m;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/m$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/m$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/m$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/m$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/m$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-boolean v0, p0, Lcom/whoop/settings/m$a;->w:Z

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    iput v3, p0, Lcom/whoop/settings/m$a;->x:I

    invoke-virtual {p1, p0}, Lcom/whoop/settings/m;->d0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    invoke-static {v1}, Lcom/whoop/settings/m;->D(Lcom/whoop/settings/m;)Liw2/c;

    move-result-object v1

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lkc3/d;->w:Lkc3/d;

    iput-boolean p1, p0, Lcom/whoop/settings/m$a;->w:Z

    iput v2, p0, Lcom/whoop/settings/m$a;->x:I

    invoke-virtual {v1, v3, p0}, Liw2/c;->c(Lq83/j;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    move v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Liw2/d;

    instance-of v1, p1, Liw2/d$b;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    check-cast p1, Liw2/d$b;

    goto :goto_3

    :cond_5
    sget-object v1, Liw2/d$a;->a:Liw2/d$a;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    move-object p1, v2

    :goto_3
    iget-object v1, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    invoke-static {v1}, Lcom/whoop/settings/m;->F(Lcom/whoop/settings/m;)Lec3/p1;

    move-result-object v1

    invoke-static {}, Lgc2/a;->getEntries()Lt83/a;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    new-instance v5, Ljava/util/LinkedHashMap;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-static {v6}, Lm83/g0;->W(I)I

    move-result v6

    const/16 v7, 0x10

    if-ge v6, v7, :cond_6

    move v6, v7

    :cond_6
    invoke-direct {v5, v6}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lgc2/a;

    invoke-static {v4, v7, v0, p1}, Lcom/whoop/settings/m;->y(Lcom/whoop/settings/m;Lgc2/a;ZLiw2/d$b;)Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_7
    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v2, v5}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/whoop/settings/m$a;->y:Lcom/whoop/settings/m;

    invoke-static {v0}, Lcom/whoop/settings/m;->G(Lcom/whoop/settings/m;)Lec3/p1;

    move-result-object v0

    if-eqz p1, :cond_8

    new-instance v2, Lea2/j0;

    invoke-virtual {p1}, Liw2/d$b;->a()Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Liw2/d$b;->a()Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;->getBody()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Liw2/d$b;->a()Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;->getIcon()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Liw2/d$b;->a()Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whattoexpect/domain/models/WhatToExpectEntryPointResponse;->getCtaLocation()Lcom/whoop/whattoexpect/domain/models/CtaLocation;

    move-result-object p1

    invoke-direct {v2, v1, v3, v4, p1}, Lea2/j0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/whattoexpect/domain/models/CtaLocation;)V

    :cond_8
    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v2}, Lec3/h2;->j(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
