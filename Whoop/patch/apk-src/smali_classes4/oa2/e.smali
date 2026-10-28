.class public final Loa2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Loa2/e;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;",
        "Loa2/b;",
        "c",
        "(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;",
        "Lja2/a;",
        "result",
        "Loa2/d;",
        "a",
        "(Lja2/a;)Loa2/d;",
        "Lla2/c;",
        "Loa2/a;",
        "b",
        "(Lla2/c;)Loa2/a;",
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

.method private final c(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;
    .locals 3

    new-instance v0, Loa2/b;

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;->getTracking()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Loa2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lja2/a;)Loa2/d;
    .locals 2

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Loa2/d;

    invoke-virtual {p1}, Lja2/a;->a()Lla2/c;

    move-result-object v1

    invoke-virtual {p0, v1}, Loa2/e;->b(Lla2/c;)Loa2/a;

    move-result-object v1

    invoke-virtual {p1}, Lja2/a;->b()Lvc2/c;

    move-result-object p1

    invoke-static {p1}, Lvc2/d;->a(Lvc2/c;)Lxc2/d;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Loa2/d;-><init>(Loa2/a;Lxc2/d;)V

    return-object v0
.end method

.method public final b(Lla2/c;)Loa2/a;
    .locals 9

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lla2/c$a;->a:Lla2/c$a;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    instance-of v0, p1, Lla2/c$b;

    if-eqz v0, :cond_5

    check-cast p1, Lla2/c$b;

    invoke-virtual {p1}, Lla2/c$b;->a()Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v1

    :goto_1
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0}, Lkd1/p;->k(I)Lkd1/o;

    move-result-object v0

    move-object v3, v0

    goto :goto_2

    :cond_3
    move-object v3, v1

    :goto_2
    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getJoinCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    move-result-object v0

    invoke-direct {p0, v0}, Loa2/e;->c(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;

    move-result-object v6

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getSwitchCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-direct {p0, v0}, Loa2/e;->c(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;

    move-result-object v1

    :cond_4
    move-object v7, v1

    invoke-virtual {p1}, Lcom/whoop/settings/accountheader/model/MyAccountHeaderModel;->getCancelCta()Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;

    move-result-object p1

    invoke-direct {p0, p1}, Loa2/e;->c(Lcom/whoop/settings/accountheader/model/MyAccountHeaderCtaModel;)Loa2/b;

    move-result-object v8

    new-instance v2, Loa2/a;

    invoke-direct/range {v2 .. v8}, Loa2/a;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Loa2/b;Loa2/b;Loa2/b;)V

    return-object v2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
