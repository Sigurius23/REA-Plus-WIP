.class public abstract Lj02/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/navigation/DismissEventModel;",
        "Lj02/s;",
        "a",
        "(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;",
        "navigation_release"
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
.method public static final a(Lcom/whoop/navigation/DismissEventModel;)Lj02/s;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj02/s;

    invoke-virtual {p0}, Lcom/whoop/navigation/DismissEventModel;->getType()Lj02/v;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/navigation/DismissEventModel;->getPopUpTo()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/navigation/DismissEventModel;->getPopBackCount()Ljava/lang/Integer;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lj02/s;-><init>(Lj02/v;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;)V

    return-object v0
.end method
