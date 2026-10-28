.class final Lcom/whoop/settings/notification/c$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/notification/c;->l(ZZLq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/settings/notification/b;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/settings/notification/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.notification.SettingsNotificationInteractor$updateShepherdNotification$2"
    f = "SettingsNotificationInteractor.kt"
    l = {
        0x63,
        0x66
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/settings/notification/c;

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Z

.field final synthetic z:Z


# direct methods
.method public constructor <init>(ZZLcom/whoop/settings/notification/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lcom/whoop/settings/notification/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/notification/c$g;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/whoop/settings/notification/c$g;->y:Z

    iput-boolean p2, p0, Lcom/whoop/settings/notification/c$g;->z:Z

    iput-object p3, p0, Lcom/whoop/settings/notification/c$g;->E:Lcom/whoop/settings/notification/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/settings/notification/c$g;

    iget-boolean v0, p0, Lcom/whoop/settings/notification/c$g;->y:Z

    iget-boolean v1, p0, Lcom/whoop/settings/notification/c$g;->z:Z

    iget-object v2, p0, Lcom/whoop/settings/notification/c$g;->E:Lcom/whoop/settings/notification/c;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/settings/notification/c$g;-><init>(ZZLcom/whoop/settings/notification/c;Lq83/d;)V

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
            "Lcom/whoop/settings/notification/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/notification/c$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/notification/c$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/notification/c$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/notification/c$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/notification/c$g;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/settings/notification/c$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/settings/notification/c$g;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    new-instance p1, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;

    iget-boolean v1, p0, Lcom/whoop/settings/notification/c$g;->y:Z

    iget-boolean v5, p0, Lcom/whoop/settings/notification/c$g;->z:Z

    invoke-direct {p1, v1, v5}, Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;-><init>(ZZ)V

    iget-object v1, p0, Lcom/whoop/settings/notification/c$g;->E:Lcom/whoop/settings/notification/c;

    invoke-static {v1}, Lcom/whoop/settings/notification/c;->e(Lcom/whoop/settings/notification/c;)Lcom/whoop/shepherd/domain/ShepherdApi;

    move-result-object v1

    iput-object v4, p0, Lcom/whoop/settings/notification/c$g;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/settings/notification/c$g;->x:I

    invoke-interface {v1, p1, p0}, Lcom/whoop/shepherd/domain/ShepherdApi;->updateShepherdToggleSettings(Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsUpdateRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/settings/notification/c$g;->E:Lcom/whoop/settings/notification/c;

    invoke-static {p1}, Lcom/whoop/settings/notification/c;->c(Lcom/whoop/settings/notification/c;)Lic2/b;

    move-result-object p1

    const-string v1, "Arrhythmia Notification"

    iget-boolean v3, p0, Lcom/whoop/settings/notification/c$g;->z:Z

    invoke-virtual {p1, v1, v3}, Lic2/b;->e(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/whoop/settings/notification/c$g;->E:Lcom/whoop/settings/notification/c;

    iput-object v4, p0, Lcom/whoop/settings/notification/c$g;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/settings/notification/c$g;->x:I

    invoke-static {p1, p0}, Lcom/whoop/settings/notification/c;->f(Lcom/whoop/settings/notification/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/settings/notification/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Lcom/whoop/settings/notification/b$a;

    sget-object v0, Lm83/y;->w:Lm83/y;

    invoke-direct {p1, v0, v4}, Lcom/whoop/settings/notification/b$a;-><init>(Ljava/util/List;Lcom/whoop/shepherd/feature/togglesettings/domain/models/ShepherdToggleSettingsResponse;)V

    return-object p1
.end method
