.class public Lcom/whoop/whooplive/selfie/SelfieActivity$g;
.super Lhj0/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-class v0, Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-direct {p0, p1, v0}, Lhj0/q;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object p1

    sget-object v0, Luz2/b;->OVERVIEW:Luz2/b;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    const-string v1, "selfieMode"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Lhj0/q;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public q()Lcom/whoop/service/network/model/cycles/Cycle;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "cycle"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/whoop/service/network/model/cycles/Cycle;

    invoke-static {v0, v1}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/cycles/Cycle;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r(Lcom/whoop/service/network/model/cycles/Cycle;)Lcom/whoop/whooplive/selfie/SelfieActivity$g;
    .locals 2

    invoke-virtual {p0}, Lhj0/q;->i()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "cycle"

    invoke-static {p1}, Lor2/i0;->i(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    return-object p0
.end method
