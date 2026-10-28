.class public final Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
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


# instance fields
.field final synthetic $parameters:Lc93/a;

.field final synthetic $qualifier:Lvf3/a;

.field final synthetic $scope:Lxf3/c;

.field final synthetic $storeOwner:Ljf3/a;


# direct methods
.method public constructor <init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$scope:Lxf3/c;

    iput-object p2, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$qualifier:Lvf3/a;

    iput-object p3, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$parameters:Lc93/a;

    iput-object p4, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$storeOwner:Ljf3/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/w1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/whoop/profile/presentation/ProfileViewModel;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$scope:Lxf3/c;

    .line 3
    iget-object v1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$qualifier:Lvf3/a;

    .line 4
    new-instance v2, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1$1;

    iget-object v3, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$storeOwner:Ljf3/a;

    invoke-direct {v2, v3}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1$1;-><init>(Ljf3/a;)V

    .line 5
    iget-object v5, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->$parameters:Lc93/a;

    .line 6
    const-class v3, Lcom/whoop/profile/presentation/ProfileViewModel;

    .line 7
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    .line 8
    invoke-static/range {v0 .. v5}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$$inlined$viewModel$1;->invoke()Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method
