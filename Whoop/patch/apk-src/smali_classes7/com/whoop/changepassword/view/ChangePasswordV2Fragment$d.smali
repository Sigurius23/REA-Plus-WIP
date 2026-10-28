.class public final Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;-><init>()V
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
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n"
    }
    d2 = {
        "Landroidx/lifecycle/w1;",
        "T",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation


# instance fields
.field final synthetic w:Landroid/content/ComponentCallbacks;

.field final synthetic x:Lvf3/a;

.field final synthetic y:Lc93/a;

.field final synthetic z:Lc93/a;


# direct methods
.method public constructor <init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->w:Landroid/content/ComponentCallbacks;

    iput-object p2, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->x:Lvf3/a;

    iput-object p3, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->y:Lc93/a;

    iput-object p4, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->z:Lc93/a;

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
            "Lzn0/b;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->w:Landroid/content/ComponentCallbacks;

    iget-object v1, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->x:Lvf3/a;

    iget-object v2, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->y:Lc93/a;

    iget-object v3, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->z:Lc93/a;

    .line 3
    const-class v4, Lzn0/b;

    .line 4
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    .line 5
    invoke-static {v0, v1, v4, v2, v3}, Lts/o;->B(Landroid/content/ComponentCallbacks;Lvf3/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;->invoke()Landroidx/lifecycle/w1;

    move-result-object v0

    return-object v0
.end method
