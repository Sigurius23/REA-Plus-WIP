.class public final Lcom/whoop/widget/network/SmallWidgetStressProvider;
.super Lh03/a;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00088VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/widget/network/SmallWidgetStressProvider;",
        "Lh03/a;",
        "<init>",
        "()V",
        "Lj03/a;",
        "j",
        "()Lj03/a;",
        "widgetType",
        "Ln03/k;",
        "k",
        "()Ln03/k;",
        "glanceAppWidget",
        "widget_release"
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

    invoke-direct {p0}, Lh03/a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic f()Lp6/g0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/widget/network/SmallWidgetStressProvider;->k()Ln03/k;

    move-result-object v0

    return-object v0
.end method

.method public j()Lj03/a;
    .locals 1

    sget-object v0, Lj03/a;->SMALL_STRESS:Lj03/a;

    return-object v0
.end method

.method public k()Ln03/k;
    .locals 3

    new-instance v0, Ln03/k;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Ln03/k;-><init>(Ly6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
