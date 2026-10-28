.class public final Luh0/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luh0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Luh0/a$b;",
        "",
        "<init>",
        "()V",
        "event",
        "Ltr2/n;",
        "logger",
        "Luh0/a;",
        "a",
        "(Ljava/lang/Object;Ltr2/n;)Luh0/a;",
        "ai-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Luh0/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ltr2/n;)Luh0/a;
    .locals 12

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/navigation/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/navigation/e;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lcom/whoop/navigation/e;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/whoop/navigation/e;

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_1
    if-nez v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-interface {p1}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Ignoring content item event: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    instance-of p2, p1, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    if-eqz p2, :cond_3

    move-object v3, p1

    check-cast v3, Lcom/whoop/navigation/StrengthTrainerScreenModel;

    const/16 v10, 0x2f

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lcom/whoop/navigation/StrengthTrainerScreenModel;->copy$default(Lcom/whoop/navigation/StrengthTrainerScreenModel;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/StrengthTrainerScreenModel;

    move-result-object v4

    const/4 v6, 0x5

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v2

    :cond_3
    new-instance p1, Luh0/a$a;

    invoke-direct {p1, v2}, Luh0/a$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1
.end method
