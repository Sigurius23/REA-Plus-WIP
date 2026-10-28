.class public final Lkc2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lkc2/j;",
        "",
        "<init>",
        "()V",
        "Lkc2/d;",
        "result",
        "Lkc2/i;",
        "a",
        "(Lkc2/d;)Lkc2/i;",
        "settings_release"
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lkc2/d;)Lkc2/i;
    .locals 7

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkc2/d$a;->a:Lkc2/d$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p1, Lkc2/d$b;

    if-eqz v0, :cond_4

    new-instance v0, Lkc2/i;

    sget v2, Lea2/s;->R:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    check-cast p1, Lkc2/d$b;

    invoke-virtual {p1}, Lkc2/d$b;->a()Lcom/whoop/settings/referafriend/model/ReferAFriendModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/settings/referafriend/model/ReferAFriendModel;->getRafMenuItem()Lcom/whoop/settings/referafriend/model/RafMenuItem;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/settings/referafriend/model/RafMenuItem;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v1

    :goto_0
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lkc2/d$b;->a()Lcom/whoop/settings/referafriend/model/ReferAFriendModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/settings/referafriend/model/ReferAFriendModel;->getShareSheetContent()Lcom/whoop/settings/referafriend/model/ShareSheetContent;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/settings/referafriend/model/ShareSheetContent;->getMessageText()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkc2/a;

    invoke-virtual {p1}, Lkc2/d$b;->a()Lcom/whoop/settings/referafriend/model/ReferAFriendModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/settings/referafriend/model/ReferAFriendModel;->getRafHubContent()Lcom/whoop/settings/referafriend/model/RafHubContent;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/settings/referafriend/model/RafHubContent;->getTitle()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_2
    move-object v6, v1

    :goto_1
    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {p1}, Lkc2/d$b;->a()Lcom/whoop/settings/referafriend/model/ReferAFriendModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/referafriend/model/ReferAFriendModel;->getRafHubContent()Lcom/whoop/settings/referafriend/model/RafHubContent;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/settings/referafriend/model/RafHubContent;->getBody()Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v5, v6, p1}, Lkc2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-direct {v0, v2, v3, v4, v5}, Lkc2/i;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkc2/a;)V

    return-object v0

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
