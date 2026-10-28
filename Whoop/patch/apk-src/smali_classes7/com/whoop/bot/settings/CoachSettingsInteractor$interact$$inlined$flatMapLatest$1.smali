.class public final Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.settings.CoachSettingsInteractor$interact$$inlined$flatMapLatest$1"
    f = "CoachSettingsInteractor.kt"
    l = {
        0xc1,
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field I$0:I

.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;


# direct methods
.method public constructor <init>(Lq83/d;Lcom/whoop/bot/settings/CoachSettingsInteractor;)V
    .locals 0

    iput-object p2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/bot/settings/CoachSettingsViewEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-direct {v0, p3, v1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lcom/whoop/bot/settings/CoachSettingsInteractor;)V

    iput-object p1, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lq83/d;

    iget-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lec3/m;

    iget-object v3, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lec3/m;

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent;

    sget-object v5, Lcom/whoop/bot/settings/CoachSettingsViewEvent$DismissError;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewEvent$DismissError;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    sget-object p1, Lcom/whoop/bot/settings/InternalEvent$DismissError;->INSTANCE:Lcom/whoop/bot/settings/InternalEvent$DismissError;

    new-instance v3, La6/u;

    const/4 v5, 0x1

    invoke-direct {v3, p1, v5}, La6/u;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_3
    sget-object v5, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Load;->INSTANCE:Lcom/whoop/bot/settings/CoachSettingsViewEvent$Load;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object p1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    invoke-static {p1}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->access$loadScreenDetails(Lcom/whoop/bot/settings/CoachSettingsInteractor;)Lec3/l;

    move-result-object v3

    goto :goto_1

    :cond_4
    instance-of v5, p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    if-eqz v5, :cond_7

    iget-object v5, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->this$0:Lcom/whoop/bot/settings/CoachSettingsInteractor;

    check-cast p1, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;->getKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/bot/settings/CoachSettingsViewEvent$Toggle;->getEnabled()Z

    move-result p1

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    const/4 v7, 0x0

    iput v7, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->I$0:I

    iput v3, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->label:I

    invoke-static {v5, v6, p1, p0}, Lcom/whoop/bot/settings/CoachSettingsInteractor;->access$togglesSetting(Lcom/whoop/bot/settings/CoachSettingsInteractor;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_0
    move-object v3, p1

    :goto_1
    check-cast v3, Lec3/l;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$0:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$1:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$2:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$3:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->L$4:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/bot/settings/CoachSettingsInteractor$interact$$inlined$flatMapLatest$1;->label:I

    invoke-static {v1, v3, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "found "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ": this should never happen"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
