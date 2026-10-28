.class final Lcom/whoop/ui/home/redesign/view/MainActivity$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;->k0(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.ui.home.redesign.view.MainActivity"
    f = "MainActivity.kt"
    l = {
        0x280,
        0x13b
    }
    m = "ensureAppNavigatorReady"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/ui/home/redesign/view/MainActivity;

.field F:I

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/home/redesign/view/MainActivity;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/home/redesign/view/MainActivity$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->E:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->z:Ljava/lang/Object;

    iget p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->E:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->D(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
