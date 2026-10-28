.class final Lcom/whoop/whooplabs/io/HrDeviceConnection$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;-><init>(Lbc3/c0;Landroid/content/Context;Llm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroid/bluetooth/BluetoothAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "deviceState",
        "Llm0/c;",
        "btState",
        "<anonymous>",
        "(ILlm0/c;)I"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.io.HrDeviceConnection$connectionStateFlow$1"
    f = "HrDeviceConnection.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/whooplabs/io/HrDeviceConnection;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(ILlm0/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Llm0/c;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;

    iget-object v1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-direct {v0, v1, p3}, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    iput p1, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->x:I

    iput-object p2, v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Llm0/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->f(ILlm0/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->x:I

    iget-object v1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->y:Ljava/lang/Object;

    check-cast v1, Llm0/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->w:I

    if-nez v2, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Llm0/c;->OFF:Llm0/c;

    const/4 v2, 0x0

    if-ne v1, p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->s(Lcom/whoop/whooplabs/io/HrDeviceConnection;ZILjava/lang/Object;)V

    move v0, v1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object v1, p1, Lcom/whoop/whooplabs/io/HrDeviceConnection;->m:Ljava/lang/String;

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->i(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->F()Lbc3/c0;

    move-result-object p1

    new-instance v1, Lcom/whoop/whooplabs/io/HrDeviceConnection$f$a;

    iget-object v3, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$f;->z:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-direct {v1, v3, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$f$a;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {p1, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/Integer;

    invoke-direct {p1, v0}, Ljava/lang/Integer;-><init>(I)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
