.class final Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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
    c = "com.whoop.achievements.celebration.AchievementCelebrationDialogFragment$onCreateView$1$1$1"
    f = "AchievementCelebrationDialogFragment.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

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

    new-instance p1, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;

    iget-object v0, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;-><init>(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->w:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-static {p1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->J(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-static {p1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->I(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;)Lcom/whoop/achievements/celebration/c;

    move-result-object p1

    new-instance v0, Lcom/whoop/achievements/celebration/b$d$b;

    iget-object v1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-static {v1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->H(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/achievements/celebration/b$d$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/whoop/achievements/celebration/c;->n(Lcom/whoop/achievements/celebration/b$d;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-static {p1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->I(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;)Lcom/whoop/achievements/celebration/c;

    move-result-object p1

    new-instance v0, Lcom/whoop/achievements/celebration/b$d$a;

    iget-object v1, p0, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment$b;->x:Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;

    invoke-static {v1}, Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;->G(Lcom/whoop/achievements/celebration/AchievementCelebrationDialogFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/achievements/celebration/b$d$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/whoop/achievements/celebration/c;->n(Lcom/whoop/achievements/celebration/b$d;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
