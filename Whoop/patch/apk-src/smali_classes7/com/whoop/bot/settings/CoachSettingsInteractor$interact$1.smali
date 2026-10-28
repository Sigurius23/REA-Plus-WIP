.class final Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/settings/CoachSettingsInteractor;->interact(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
        "previousEvent",
        "latestEvent"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$1"
    f = "CoachSettingsInteractor.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/settings/CoachSettingsInteractor;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/settings/CoachSettingsInteractor;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/whoop/bot/settings/CoachSettingsViewEvent;Lcom/whoop/bot/settings/CoachSettingsViewEvent;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
            "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-direct {v0, v1, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;-><init>(Lcom/whoop/bot/settings/CoachSettingsInteractor;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    check-cast p2, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->invoke(Lcom/whoop/bot/settings/CoachSettingsViewEvent;Lcom/whoop/bot/settings/CoachSettingsViewEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->label:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Retry;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewEvent$Retry;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    instance-of p1, v0, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    if-eqz p1, :cond_0

    new-instance p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    check-cast v0, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    invoke-virtual {v0}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;->getEnabled()Z

    move-result v0

    invoke-direct {p1, v1, v0}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;-><init>(Ljava/lang/String;Z)V

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->access$getLogger$p(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "impossible state: got retry event but previous event wasn\'t toggle"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewEvent$None;

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
