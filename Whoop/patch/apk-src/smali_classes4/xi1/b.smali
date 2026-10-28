.class public final Lxi1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxi1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0001\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lxi1/b;",
        "",
        "Lj02/o0;",
        "navigator",
        "Lo02/d;",
        "baseNavReducer",
        "Lfi0/a;",
        "analytics",
        "Leb/a0;",
        "navController",
        "<init>",
        "(Lj02/o0;Lo02/d;Lfi0/a;Leb/a0;)V",
        "Lxi1/a;",
        "event",
        "Ll83/a0;",
        "c",
        "(Lxi1/a;)V",
        "a",
        "Lj02/o0;",
        "b",
        "Lfi0/a;",
        "Leb/a0;",
        "d",
        "Lo02/d;",
        "navigationReducer",
        "kennel_release"
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
.field private final a:Lj02/o0;

.field private final b:Lfi0/a;

.field private final c:Leb/a0;

.field private final d:Lo02/d;


# direct methods
.method public constructor <init>(Lj02/o0;Lo02/d;Lfi0/a;Leb/a0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "baseNavReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi1/b;->a:Lj02/o0;

    iput-object p3, p0, Lxi1/b;->b:Lfi0/a;

    iput-object p4, p0, Lxi1/b;->c:Leb/a0;

    new-instance p1, Lxa0/a;

    const/16 p3, 0x14

    invoke-direct {p1, p3}, Lxa0/a;-><init>(I)V

    invoke-static {p2, p1}, Lo02/f;->a(Lo02/d;Lkotlin/jvm/functions/Function1;)Lo02/d;

    move-result-object p1

    iput-object p1, p0, Lxi1/b;->d:Lo02/d;

    return-void
.end method

.method public static synthetic a(Lo02/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxi1/b;->b(Lo02/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lo02/e;)Ll83/a0;
    .locals 3

    const-string v0, "$this$buildNavigationReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj02/m0$o4;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lxi1/b$b;

    invoke-direct {v2}, Lxi1/b$b;-><init>()V

    invoke-virtual {p0, v1, v2}, Lo02/e;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v1, Lj02/m0$i2;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lxi1/b$c;

    invoke-direct {v1}, Lxi1/b$c;-><init>()V

    invoke-virtual {p0, v0, v1}, Lo02/e;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final c(Lxi1/a;)V
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lxi1/a$c;->a:Lxi1/a$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lxi1/b;->c:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lxi1/a$b;

    if-eqz v0, :cond_4

    check-cast p1, Lxi1/a$b;

    invoke-virtual {p1}, Lxi1/a$b;->a()Lcom/whoop/design/models/items/ArticleTileModelEvent;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getType()Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/models/items/ArticleTileCarouselModelKt;->isVideo(Lcom/whoop/design/models/items/ArticleTileTypeDtoEnum;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    new-instance v1, Lj02/m0$g3;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj02/m0$g3;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    new-instance v1, Lj02/m0$f3;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getTag()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0x18

    const/4 v8, 0x0

    const-string v4, "Heart Health Tab"

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lj02/m0$f3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    new-instance v1, Lj02/m0$w1;

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Cta;->getCta()Lcom/whoop/design/models/items/ArticleTileModelEventEnum;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const-string v3, "Heart Health Tab"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj02/m0$w1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    :cond_3
    return-void

    :cond_4
    sget-object v0, Lxi1/a$a;->a:Lxi1/a$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lxi1/b;->a:Lj02/o0;

    new-instance v0, Lj02/m0$g1;

    const-string v1, "https://www.whoop.com/thelocker/"

    invoke-direct {v0, v1}, Lj02/m0$g1;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_5
    instance-of v0, p1, Lxi1/a$h;

    const-string v1, "Open"

    const-string v2, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen"

    const-string v3, "ANF"

    if-eqz v0, :cond_6

    iget-object v0, p0, Lxi1/b;->b:Lfi0/a;

    const-string v4, "Possible Afib"

    invoke-interface {v0, v3, v1, v4, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    iget-object v1, p0, Lxi1/b;->d:Lo02/d;

    check-cast p1, Lxi1/a$h;

    invoke-virtual {p1}, Lxi1/a$h;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_6
    instance-of v0, p1, Lxi1/a$i;

    if-eqz v0, :cond_8

    check-cast p1, Lxi1/a$i;

    invoke-virtual {p1}, Lxi1/a$i;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v4, Lcom/whoop/navigation/AppScreen$l5;->w:Lcom/whoop/navigation/AppScreen$l5;

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lxi1/b;->b:Lfi0/a;

    const-string v4, "History"

    invoke-interface {v0, v3, v1, v4, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    iget-object v1, p0, Lxi1/b;->d:Lo02/d;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_8
    instance-of v0, p1, Lxi1/a$g;

    if-eqz v0, :cond_b

    check-cast p1, Lxi1/a$g;

    invoke-virtual {p1}, Lxi1/a$g;->b()Lvi1/a;

    move-result-object v0

    sget-object v4, Lxi1/b$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_a

    const/4 v1, 0x2

    if-ne v0, v1, :cond_9

    iget-object v3, p0, Lxi1/b;->b:Lfi0/a;

    const/16 v10, 0x34

    const/4 v11, 0x0

    const-string v4, "onboarding"

    const-string v5, "setup_ecg"

    const/4 v6, 0x0

    const-string v7, "ECG"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    goto :goto_0

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_a
    iget-object v0, p0, Lxi1/b;->b:Lfi0/a;

    const-string v4, "Afib onboarding"

    invoke-interface {v0, v3, v1, v4, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    iget-object v1, p0, Lxi1/b;->d:Lo02/d;

    invoke-virtual {p1}, Lxi1/a$g;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_b
    instance-of v0, p1, Lxi1/a$d;

    if-eqz v0, :cond_c

    iget-object v3, p0, Lxi1/b;->b:Lfi0/a;

    const/16 v10, 0x34

    const/4 v11, 0x0

    const-string v4, "ecg_past_results"

    const-string v5, "view_past_reading"

    const/4 v6, 0x0

    const-string v7, "ECG"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    iget-object v1, p0, Lxi1/b;->d:Lo02/d;

    check-cast p1, Lxi1/a$d;

    invoke-virtual {p1}, Lxi1/a$d;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_c
    instance-of v0, p1, Lxi1/a$e;

    if-eqz v0, :cond_d

    iget-object v0, p0, Lxi1/b;->b:Lfi0/a;

    const-string v1, "take_a_new_ecg_reading"

    const-string v3, "ECG"

    const-string v4, "ecg_reading"

    const-string v5, "click"

    invoke-interface {v0, v4, v5, v1, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    iget-object v1, p0, Lxi1/b;->d:Lo02/d;

    check-cast p1, Lxi1/a$e;

    invoke-virtual {p1}, Lxi1/a$e;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v1, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_d
    instance-of v0, p1, Lxi1/a$f;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lxi1/b;->d:Lo02/d;

    check-cast p1, Lxi1/a$f;

    invoke-virtual {p1}, Lxi1/a$f;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    invoke-interface {v0, p1}, Lo02/d;->a(Lcom/whoop/navigation/NavigationScreenModel;)Lj02/c;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj02/m0;

    sget-object v0, Lj02/m0$l2;->b:Lj02/m0$l2;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v1, p0, Lxi1/b;->b:Lfi0/a;

    const/16 v8, 0x34

    const/4 v9, 0x0

    const-string v2, "ecg_all_results"

    const-string v3, "click"

    const/4 v4, 0x0

    const-string v5, "ECG"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_e
    iget-object v0, p0, Lxi1/b;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_f
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
