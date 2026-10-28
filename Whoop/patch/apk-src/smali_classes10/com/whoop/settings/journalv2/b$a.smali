.class final Lcom/whoop/settings/journalv2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/journalv2/b;->h(Lcom/whoop/settings/journalv2/a;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/settings/journalv2/d;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/settings/journalv2/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.settings.journalv2.JournalSettingsInteractor$interact$2"
    f = "JournalSettingsInteractor.kt"
    l = {
        0x1a,
        0x1c,
        0x2c,
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/settings/journalv2/a;

.field final synthetic z:Lcom/whoop/settings/journalv2/b;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/journalv2/a;Lcom/whoop/settings/journalv2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/journalv2/a;",
            "Lcom/whoop/settings/journalv2/b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/journalv2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    iput-object p2, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/settings/journalv2/b$a;

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/settings/journalv2/b$a;-><init>(Lcom/whoop/settings/journalv2/a;Lcom/whoop/settings/journalv2/b;Lq83/d;)V

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
            "Lcom/whoop/settings/journalv2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/journalv2/b$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/journalv2/b$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/journalv2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/journalv2/b$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/settings/journalv2/b$a;->x:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/settings/journalv2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v1, p1

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    instance-of v6, v0, Lcom/whoop/settings/journalv2/a$a;

    if-eqz v6, :cond_9

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/b;->b(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/data/repositories/JournalRepository;->getUserSavedJournalSettings()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/whoop/settings/journalv2/b;->g(Lcom/whoop/settings/journalv2/b;Z)V

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/b;->b(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v1

    iput-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/settings/journalv2/b$a;->x:I

    invoke-virtual {v1, p0}, Lcom/whoop/data/repositories/JournalRepository;->getShouldShowDismissConfirmationDialog(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/2addr v1, v4

    invoke-static {v0, v1}, Lcom/whoop/settings/journalv2/b;->f(Lcom/whoop/settings/journalv2/b;Z)V

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v1}, Lcom/whoop/settings/journalv2/b;->c(Lcom/whoop/settings/journalv2/b;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lcom/whoop/settings/journalv2/b$a$a;

    iget-object v2, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-direct {v4, v2, v9}, Lcom/whoop/settings/journalv2/b$a$a;-><init>(Lcom/whoop/settings/journalv2/b;Lq83/d;)V

    iput-object v9, p0, Lcom/whoop/settings/journalv2/b$a;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/settings/journalv2/b$a;->x:I

    const/4 v2, 0x0

    const-string v3, "journal preferences"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_1
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_7

    new-instance v1, Lcom/whoop/settings/journalv2/d$a;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/whoop/settings/journalv2/d$a;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_7
    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/JournalPreferencesDto;->getJournalEnabled()Z

    move-result v0

    invoke-static {v1, v0}, Lcom/whoop/settings/journalv2/b;->g(Lcom/whoop/settings/journalv2/b;Z)V

    new-instance v0, Lcom/whoop/settings/journalv2/d$b;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v1}, Lcom/whoop/settings/journalv2/b;->e(Lcom/whoop/settings/journalv2/b;)Z

    move-result v1

    iget-object v2, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v2}, Lcom/whoop/settings/journalv2/b;->d(Lcom/whoop/settings/journalv2/b;)Z

    move-result v2

    invoke-direct {v0, v1, v2, v9}, Lcom/whoop/settings/journalv2/d$b;-><init>(ZZLjava/lang/Long;)V

    return-object v0

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    instance-of v3, v0, Lcom/whoop/settings/journalv2/a$d;

    if-eqz v3, :cond_d

    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v1}, Lcom/whoop/settings/journalv2/b;->c(Lcom/whoop/settings/journalv2/b;)Ltr2/n;

    move-result-object v1

    new-instance v4, Lcom/whoop/settings/journalv2/b$a$b;

    iget-object v3, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    iget-object v6, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    invoke-direct {v4, v3, v6, v9}, Lcom/whoop/settings/journalv2/b$a$b;-><init>(Lcom/whoop/settings/journalv2/b;Lcom/whoop/settings/journalv2/a;Lq83/d;)V

    iput v2, p0, Lcom/whoop/settings/journalv2/b$a;->x:I

    const/4 v2, 0x0

    const-string v3, "journal preferences"

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_b

    new-instance v1, Lcom/whoop/settings/journalv2/d$a;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/whoop/settings/journalv2/d$a;-><init>(Ljava/lang/String;)V

    return-object v1

    :cond_b
    instance-of v0, v0, Lu02/a$c;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/b;->b(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    check-cast v1, Lcom/whoop/settings/journalv2/a$d;

    invoke-virtual {v1}, Lcom/whoop/settings/journalv2/a$d;->a()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/repositories/JournalRepository;->saveUserJournalSettings(Z)V

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    check-cast v1, Lcom/whoop/settings/journalv2/a$d;

    invoke-virtual {v1}, Lcom/whoop/settings/journalv2/a$d;->a()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/whoop/settings/journalv2/b;->g(Lcom/whoop/settings/journalv2/b;Z)V

    sget-object v0, Lcom/whoop/settings/journalv2/d$c;->a:Lcom/whoop/settings/journalv2/d$c;

    return-object v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    instance-of v2, v0, Lcom/whoop/settings/journalv2/a$b;

    if-eqz v2, :cond_e

    sget-object v0, Lcom/whoop/settings/journalv2/d$d;->a:Lcom/whoop/settings/journalv2/d$d;

    return-object v0

    :cond_e
    instance-of v0, v0, Lcom/whoop/settings/journalv2/a$c;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v0}, Lcom/whoop/settings/journalv2/b;->b(Lcom/whoop/settings/journalv2/b;)Lcom/whoop/data/repositories/JournalRepository;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    check-cast v2, Lcom/whoop/settings/journalv2/a$c;

    invoke-virtual {v2}, Lcom/whoop/settings/journalv2/a$c;->a()Z

    move-result v2

    xor-int/2addr v2, v4

    iput v1, p0, Lcom/whoop/settings/journalv2/b$a;->x:I

    invoke-virtual {v0, v2, p0}, Lcom/whoop/data/repositories/JournalRepository;->setShouldShowDismissConfirmationDialog(ZLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_f

    :goto_3
    return-object v8

    :cond_f
    :goto_4
    iget-object v0, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    check-cast v1, Lcom/whoop/settings/journalv2/a$c;

    invoke-virtual {v1}, Lcom/whoop/settings/journalv2/a$c;->a()Z

    move-result v1

    invoke-static {v0, v1}, Lcom/whoop/settings/journalv2/b;->f(Lcom/whoop/settings/journalv2/b;Z)V

    new-instance v0, Lcom/whoop/settings/journalv2/d$b;

    iget-object v1, p0, Lcom/whoop/settings/journalv2/b$a;->z:Lcom/whoop/settings/journalv2/b;

    invoke-static {v1}, Lcom/whoop/settings/journalv2/b;->e(Lcom/whoop/settings/journalv2/b;)Z

    move-result v1

    iget-object v2, p0, Lcom/whoop/settings/journalv2/b$a;->y:Lcom/whoop/settings/journalv2/a;

    check-cast v2, Lcom/whoop/settings/journalv2/a$c;

    invoke-virtual {v2}, Lcom/whoop/settings/journalv2/a$c;->a()Z

    move-result v2

    invoke-direct {v0, v1, v2, v9}, Lcom/whoop/settings/journalv2/d$b;-><init>(ZZLjava/lang/Long;)V

    return-object v0

    :cond_10
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
