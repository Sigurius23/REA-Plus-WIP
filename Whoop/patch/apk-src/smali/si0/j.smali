.class public final Lsi0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lsi0/j;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/archv2/model/template/NavigationTemplate;",
        "template",
        "Lti0/f;",
        "a",
        "(Lcom/whoop/archv2/model/template/NavigationTemplate;)Lti0/f;",
        "arch-v2_release"
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
.method public final a(Lcom/whoop/archv2/model/template/NavigationTemplate;)Lti0/f;
    .locals 7

    const-string v0, "template"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lti0/f;

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/NavigationTemplate;->getNavigationBar()Lcom/whoop/design/models/items/NavigationBarModel;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lsi0/i;->b(Lcom/whoop/design/models/items/NavigationBarModel;ZZLjb1/a;ILjava/lang/Object;)Lri0/f;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/NavigationTemplate;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lti0/f;-><init>(Lri0/f;Lcom/whoop/navigation/e;)V

    return-object v0
.end method
