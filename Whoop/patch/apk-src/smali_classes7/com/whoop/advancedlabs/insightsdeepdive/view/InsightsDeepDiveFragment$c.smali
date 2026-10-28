.class final synthetic Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$c;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "sendViewEvent(Lcom/whoop/advancedlabs/insightsdeepdive/presentation/InsightsDeepDiveViewEvent;)V"

    const/4 v2, 0x0

    const/4 v1, 0x1

    const-class v3, Lvc0/b;

    const-string v5, "sendViewEvent"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lvc0/a;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lvc0/b;

    invoke-virtual {v0, p1}, Lvc0/b;->o(Lvc0/a;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvc0/a;

    invoke-virtual {p0, p1}, Lcom/whoop/advancedlabs/insightsdeepdive/view/InsightsDeepDiveFragment$c;->a(Lvc0/a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
