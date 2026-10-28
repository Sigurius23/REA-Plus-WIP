.class public final Lcom/whoop/community/presentation/teams/d$b;
.super Lvq0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/presentation/teams/d;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/community/presentation/teams/d$b",
        "Lvq0/e;",
        "Landroid/text/Editable;",
        "editable",
        "Ll83/a0;",
        "afterTextChanged",
        "(Landroid/text/Editable;)V",
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
.field final synthetic w:Lcom/whoop/community/presentation/teams/d;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/d;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/d$b;->w:Lcom/whoop/community/presentation/teams/d;

    invoke-direct {p0}, Lvq0/e;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/d$b;->w:Lcom/whoop/community/presentation/teams/d;

    invoke-virtual {v0}, Lrq0/o;->L()Lrq0/y;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "toUpperCase(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, ""

    const/4 v2, 0x0

    const-string v3, "\n"

    invoke-static {p1, v3, v1, v2}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lrq0/y;->Z(Ljava/lang/String;)V

    return-void
.end method
