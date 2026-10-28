.class public final Lcom/whoop/community/presentation/teams/c$b;
.super Lfc/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/presentation/teams/c;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/community/presentation/teams/c$b",
        "Lfc/k;",
        "",
        "position",
        "Ll83/a0;",
        "c",
        "(I)V",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/community/presentation/teams/c;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/c;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/c$b;->a:Lcom/whoop/community/presentation/teams/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/c$b;->a:Lcom/whoop/community/presentation/teams/c;

    invoke-virtual {v0}, Lrq0/o;->L()Lrq0/y;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/c$b;->a:Lcom/whoop/community/presentation/teams/c;

    invoke-static {v1}, Lcom/whoop/community/presentation/teams/c;->W(Lcom/whoop/community/presentation/teams/c;)Lrq0/d;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lrq0/d;->x(I)I

    move-result p1

    invoke-virtual {v0, p1}, Lrq0/y;->V(I)V

    return-void

    :cond_0
    const-string p1, "pagerAdapter"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
