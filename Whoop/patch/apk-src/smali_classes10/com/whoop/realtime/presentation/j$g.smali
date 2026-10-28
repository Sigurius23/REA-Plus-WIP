.class public final Lcom/whoop/realtime/presentation/j$g;
.super Lhc/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/j;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
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
        "com/whoop/realtime/presentation/j$g",
        "Lhc/h;",
        "",
        "position",
        "Ll83/a0;",
        "onPageSelected",
        "(I)V",
        "realtime-activity_release"
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
.field final synthetic a:Lcom/whoop/realtime/presentation/j;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/j;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/j$g;->a:Lcom/whoop/realtime/presentation/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/j$g;->a:Lcom/whoop/realtime/presentation/j;

    invoke-static {v0}, Lcom/whoop/realtime/presentation/j;->V(Lcom/whoop/realtime/presentation/j;)Lcom/whoop/realtime/presentation/k;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/k;->X(I)V

    return-void
.end method
