.class final Lcom/whoop/settings/m$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/m;->V()V
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
    c = "com.whoop.settings.SettingsLandingViewModel$getReferralContent$1"
    f = "SettingsLandingViewModel.kt"
    l = {
        0xaa
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/settings/m;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/settings/m;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/settings/m$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

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

    new-instance p1, Lcom/whoop/settings/m$f;

    iget-object v0, p0, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-direct {p1, v0, p2}, Lcom/whoop/settings/m$f;-><init>(Lcom/whoop/settings/m;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/m$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/settings/m$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/settings/m$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/settings/m$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/settings/m$f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-static {p1}, Lcom/whoop/settings/m;->C(Lcom/whoop/settings/m;)Lcom/whoop/data/repositories/SettingsLandingRepository;

    move-result-object v3

    iput v2, p0, Lcom/whoop/settings/m$f;->w:I

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    move-object v6, p0

    invoke-static/range {v3 .. v8}, Lcom/whoop/data/repositories/SettingsLandingRepository;->getReferralContentV2$default(Lcom/whoop/data/repositories/SettingsLandingRepository;Ljava/lang/String;Ljava/lang/Integer;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lcom/whoop/domain/model/ReferralContentV2;

    if-eqz p1, :cond_3

    iget-object v0, v6, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-static {v0}, Lcom/whoop/settings/m;->B(Lcom/whoop/settings/m;)Lcom/whoop/data/local/prefs/PreferenceHelper;

    move-result-object v0

    const-string v1, "Refer_Friend_Title"

    invoke-virtual {p1}, Lcom/whoop/domain/model/ReferralContentV2;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v6, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-static {v0}, Lcom/whoop/settings/m;->B(Lcom/whoop/settings/m;)Lcom/whoop/data/local/prefs/PreferenceHelper;

    move-result-object v0

    const-string v1, "Refer_Friend_Description"

    invoke-virtual {p1}, Lcom/whoop/domain/model/ReferralContentV2;->getBody()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v6, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-static {v0}, Lcom/whoop/settings/m;->B(Lcom/whoop/settings/m;)Lcom/whoop/data/local/prefs/PreferenceHelper;

    move-result-object v0

    const-string v1, "Refer_Friend_Message"

    invoke-virtual {p1}, Lcom/whoop/domain/model/ReferralContentV2;->getShareMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/whoop/data/local/prefs/PreferenceHelper;->putStringValueIntoMainPrefs(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    iget-object p1, v6, Lcom/whoop/settings/m$f;->x:Lcom/whoop/settings/m;

    invoke-static {p1}, Lcom/whoop/settings/m;->A(Lcom/whoop/settings/m;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Failed to get the referral content."

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
