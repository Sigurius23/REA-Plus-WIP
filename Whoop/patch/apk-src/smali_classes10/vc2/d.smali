.class public abstract Lvc2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lvc2/c;",
        "result",
        "Lxc2/d;",
        "a",
        "(Lvc2/c;)Lxc2/d;",
        "settings_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lvc2/c;)Lxc2/d;
    .locals 7

    instance-of v0, p0, Lvc2/c$a;

    if-eqz v0, :cond_0

    new-instance v0, Lxc2/d$a;

    check-cast p0, Lvc2/c$a;

    invoke-virtual {p0}, Lvc2/c$a;->a()Lxc2/a;

    move-result-object v1

    invoke-virtual {p0}, Lvc2/c$a;->b()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lxc2/d$a;-><init>(Lxc2/a;Ljava/lang/String;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Lvc2/c$b;

    if-eqz v0, :cond_1

    new-instance v1, Lxc2/d$b;

    check-cast p0, Lvc2/c$b;

    invoke-virtual {p0}, Lvc2/c$b;->b()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lvc2/c$b;->b()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lvc2/c$b;->b()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;->getAcceptButton()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalCtaModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalCtaModel;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lvc2/c$b;->b()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalModel;->getRejectButton()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalCtaModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanModalCtaModel;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lvc2/c$b;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lxc2/d$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_1
    instance-of v0, p0, Lvc2/c$c;

    if-eqz v0, :cond_2

    sget-object p0, Lxc2/d$c;->a:Lxc2/d$c;

    return-object p0

    :cond_2
    instance-of v0, p0, Lvc2/c$d;

    if-eqz v0, :cond_3

    new-instance v0, Lxc2/d$d;

    check-cast p0, Lvc2/c$d;

    invoke-virtual {p0}, Lvc2/c$d;->a()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;->getSuccessText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lvc2/c$d;->a()Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/settings/accountheader/model/SwitchBillingPlanResponseModel;->getSuccessSubtext()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lxc2/d$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method
