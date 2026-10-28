.class public final Lo60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lo60/a;",
        "",
        "Lm60/a;",
        "analyticsHelper",
        "<init>",
        "(Lm60/a;)V",
        "event",
        "Lcom/whoop/achievements/celebration/b$c;",
        "a",
        "(Ljava/lang/Object;)Lcom/whoop/achievements/celebration/b$c;",
        "Lcom/whoop/achievements/celebration/b;",
        "actionEvent",
        "b",
        "(Lcom/whoop/achievements/celebration/b;)Lcom/whoop/achievements/celebration/b;",
        "Lm60/a;",
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
.field private final a:Lm60/a;


# direct methods
.method public constructor <init>(Lm60/a;)V
    .locals 1

    const-string v0, "analyticsHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo60/a;->a:Lm60/a;

    return-void
.end method

.method private final a(Ljava/lang/Object;)Lcom/whoop/achievements/celebration/b$c;
    .locals 2

    instance-of v0, p1, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p1}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lo60/a;->a(Ljava/lang/Object;)Lcom/whoop/achievements/celebration/b$c;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_3

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/whoop/achievements/celebration/b$c$c;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/achievements/celebration/b$c$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_2
    sget-object p1, Lcom/whoop/achievements/celebration/b$c$a;->a:Lcom/whoop/achievements/celebration/b$c$a;

    return-object p1

    :cond_3
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_5

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Lcom/whoop/achievements/celebration/b$c$c;

    invoke-direct {v0, p1}, Lcom/whoop/achievements/celebration/b$c$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_4
    sget-object p1, Lcom/whoop/achievements/celebration/b$c$a;->a:Lcom/whoop/achievements/celebration/b$c$a;

    return-object p1

    :cond_5
    return-object v1
.end method


# virtual methods
.method public final b(Lcom/whoop/achievements/celebration/b;)Lcom/whoop/achievements/celebration/b;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/achievements/celebration/b$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo60/a;->a:Lm60/a;

    move-object v1, p1

    check-cast v1, Lcom/whoop/achievements/celebration/b$a;

    invoke-virtual {v0, v1}, Lm60/a;->c(Lcom/whoop/achievements/celebration/b$a;)V

    :cond_0
    instance-of v0, p1, Lcom/whoop/achievements/celebration/b$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/achievements/celebration/b$b;

    invoke-virtual {p1}, Lcom/whoop/achievements/celebration/b$b;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lo60/a;->a(Ljava/lang/Object;)Lcom/whoop/achievements/celebration/b$c;

    move-result-object p1

    :cond_1
    return-object p1
.end method
