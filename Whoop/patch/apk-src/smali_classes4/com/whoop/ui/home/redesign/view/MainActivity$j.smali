.class final Lcom/whoop/ui/home/redesign/view/MainActivity$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;->O0(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
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
.field final synthetic w:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(ZLq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;

    iget v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity$j;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p2}, Lcom/whoop/ui/home/redesign/view/MainActivity;->K(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lm32/c;

    move-result-object p2

    iput-boolean p1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->w:Z

    iput v3, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j$a;->z:I

    const/4 p1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, p1, v0, v3, v2}, Lm32/c;->s(Lm32/c;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lm32/e;

    invoke-virtual {p2}, Lm32/e;->werePermissionsGranted()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lq92/h;

    move-result-object p1

    invoke-virtual {p1}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object p1, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    iget-object p2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p2}, Lcom/whoop/ui/home/redesign/view/MainActivity;->L(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lcom/whoop/ui/home/redesign/view/MainActivity$r;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {v1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lq92/h;

    move-result-object v1

    invoke-virtual {v1}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;Landroid/bluetooth/BluetoothDevice;)V

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$j;->b(ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
