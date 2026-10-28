.class public Lqm2/o;
.super Lhj0/t$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lhj0/t$b<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lhj0/t$b;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lhj0/t$b;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public A(Lcom/whoop/domain/model/Invitation;)V
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "invitationJson"

    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-void
.end method

.method public r(Z)Lqm2/o;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "asAccountAuth"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public s()Lqm2/o;
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "asBrowse"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public t(Lqm2/o;)Lqm2/o;
    .locals 1

    invoke-virtual {p1}, Lqm2/o;->x()Z

    move-result v0

    invoke-virtual {p0, v0}, Lqm2/o;->r(Z)Lqm2/o;

    invoke-virtual {p1}, Lqm2/o;->w()Lcom/whoop/domain/model/Invitation;

    move-result-object v0

    invoke-virtual {p0, v0}, Lqm2/o;->A(Lcom/whoop/domain/model/Invitation;)V

    invoke-virtual {p1}, Lqm2/o;->y()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lqm2/o;->s()Lqm2/o;

    :cond_0
    return-object p0
.end method

.method public u()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "completionDestination"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "bleChooseStrapDestination"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lrm2/f;->CHOOSE_STRAP:Lrm2/f;

    invoke-virtual {v0}, Lrm2/f;->getIdentifier()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w()Lcom/whoop/domain/model/Invitation;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "invitationJson"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/whoop/domain/model/Invitation;

    invoke-static {v0, v1}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/Invitation;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Z
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "asAccountAuth"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public y()Z
    .locals 3

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "asBrowse"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public z(Ljava/lang/String;)Lqm2/o;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "completionDestination"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method
