.class final Lcom/whoop/home/view/HomeFragment$k;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/home/view/HomeFragment;->y2(Lem1/t;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
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

.annotation runtime Ls83/e;
    c = "com.whoop.home.view.HomeFragment"
    f = "HomeFragment.kt"
    l = {
        0x1e5
    }
    m = "requestLocationServicesToBeEnabled"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/home/view/HomeFragment;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/home/view/HomeFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/home/view/HomeFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/home/view/HomeFragment$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$k;->y:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/home/view/HomeFragment$k;->x:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/home/view/HomeFragment$k;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/home/view/HomeFragment$k;->z:I

    iget-object p1, p0, Lcom/whoop/home/view/HomeFragment$k;->y:Lcom/whoop/home/view/HomeFragment;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lcom/whoop/home/view/HomeFragment;->N0(Lcom/whoop/home/view/HomeFragment;Lem1/t;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
