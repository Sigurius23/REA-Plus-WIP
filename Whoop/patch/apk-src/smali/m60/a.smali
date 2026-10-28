.class public final Lm60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm60/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lm60/a;",
        "",
        "Lfi0/a;",
        "baseAnalytics",
        "<init>",
        "(Lfi0/a;)V",
        "Li51/o;",
        "celebrationOverlayData",
        "Ll83/a0;",
        "a",
        "(Li51/o;)V",
        "Lcom/whoop/achievements/celebration/b$b;",
        "event",
        "d",
        "(Lcom/whoop/achievements/celebration/b$b;)V",
        "clickedItem",
        "",
        "primaryButtonAction",
        "b",
        "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;",
        "Lcom/whoop/achievements/celebration/b$a;",
        "c",
        "(Lcom/whoop/achievements/celebration/b$a;)V",
        "Lfi0/a;",
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


# static fields
.field public static final b:Lm60/a$a;

.field public static final c:I


# instance fields
.field private final a:Lfi0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm60/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm60/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm60/a;->b:Lm60/a$a;

    const/16 v0, 0x8

    sput v0, Lm60/a;->c:I

    return-void
.end method

.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "baseAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm60/a;->a:Lfi0/a;

    return-void
.end method

.method private final a(Li51/o;)V
    .locals 9

    iget-object v0, p0, Lm60/a;->a:Lfi0/a;

    invoke-virtual {p1}, Li51/o;->b()Ljava/util/Map;

    move-result-object v6

    const/16 v7, 0x15

    const/4 v8, 0x0

    const/4 v1, 0x0

    const-string v2, "View"

    const/4 v3, 0x0

    const-string v4, "Gamification Pop"

    const/4 v5, 0x0

    invoke-static/range {v0 .. v8}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void
.end method

.method private final b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    instance-of v0, p1, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p1}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lm60/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lny0/h;

    const-string v1, "close"

    if-eqz v0, :cond_3

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v2, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lny0/h;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getLabel()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    return-object p1

    :cond_2
    return-object v1

    :cond_3
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    sget-object v0, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :cond_4
    :goto_0
    return-object p2

    :cond_5
    return-object v1
.end method

.method private final d(Lcom/whoop/achievements/celebration/b$b;)V
    .locals 4

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/b$b;->a()Li51/o;

    move-result-object v0

    invoke-virtual {v0}, Li51/o;->b()Ljava/util/Map;

    move-result-object v0

    const-string v1, "button_action"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "view"

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/b$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lm60/a;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lm60/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/b$b;->a()Li51/o;

    move-result-object p1

    invoke-virtual {p1}, Li51/o;->b()Ljava/util/Map;

    move-result-object p1

    const-string v2, "category"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const-string v2, "Click"

    const-string v3, "Gamification Pop"

    invoke-interface {v1, p1, v2, v0, v3}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/whoop/achievements/celebration/b$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/achievements/celebration/b$a$a;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/achievements/celebration/b$a$a;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/b$a$a;->a()Li51/o;

    move-result-object p1

    invoke-direct {p0, p1}, Lm60/a;->a(Li51/o;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/achievements/celebration/b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/achievements/celebration/b$b;

    invoke-direct {p0, p1}, Lm60/a;->d(Lcom/whoop/achievements/celebration/b$b;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
