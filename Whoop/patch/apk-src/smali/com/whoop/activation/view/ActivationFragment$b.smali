.class final synthetic Lcom/whoop/activation/view/ActivationFragment$b;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lc93/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/activation/view/ActivationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/i;",
        "Lc93/r;"
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

    const-string v6, "handleProgressButtonClick(Lcom/whoop/design/item/ItemViewState;Lcom/whoop/activation/view/screens/paymentmethod/Card;Lcom/whoop/activation/view/screens/paymentmethod/Card;Lcom/whoop/design/atomic/molecule/progressbutton/ProgressButtonState;Lcom/whoop/activation/presentation/BffScreenContainerState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V"

    const/4 v2, 0x0

    const/16 v1, 0x8

    const-class v3, Lq80/j;

    const-string v5, "handleProgressButtonClick"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lp90/e;",
            "Lp90/e;",
            "Lc31/k;",
            "Lg80/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/activation/iajf/domain/SignUpSource;",
            ")V"
        }
    .end annotation

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p2"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p3"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p4"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p5"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p6"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "p7"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lq80/j;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v9}, Lq80/j;->a(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v1, p1

    check-cast v1, Lm91/u;

    move-object v2, p2

    check-cast v2, Lp90/e;

    move-object v3, p3

    check-cast v3, Lp90/e;

    move-object v4, p4

    check-cast v4, Lc31/k;

    move-object v5, p5

    check-cast v5, Lg80/g;

    move-object v6, p6

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v7, p7

    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v8, p8

    check-cast v8, Lcom/whoop/activation/iajf/domain/SignUpSource;

    move-object v0, p0

    invoke-virtual/range {v0 .. v8}, Lcom/whoop/activation/view/ActivationFragment$b;->a(Lm91/u;Lp90/e;Lp90/e;Lc31/k;Lg80/g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/activation/iajf/domain/SignUpSource;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
