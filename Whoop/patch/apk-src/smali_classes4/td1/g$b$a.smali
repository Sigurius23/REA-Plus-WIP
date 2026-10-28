.class public final Ltd1/g$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltd1/g$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field final synthetic w:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field

.field final synthetic x:Lq92/h;


# direct methods
.method public constructor <init>(Lec3/m;Lq92/h;)V
    .locals 0

    iput-object p2, p0, Ltd1/g$b$a;->x:Lq92/h;

    iput-object p1, p0, Ltd1/g$b$a;->w:Lec3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Ltd1/g$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ltd1/g$b$a$a;

    iget v1, v0, Ltd1/g$b$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ltd1/g$b$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Ltd1/g$b$a$a;

    invoke-direct {v0, p0, p2}, Ltd1/g$b$a$a;-><init>(Ltd1/g$b$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Ltd1/g$b$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ltd1/g$b$a$a;->x:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v6, :cond_2

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_1
    iget-object p1, v0, Ltd1/g$b$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Ltd1/g$b$a$a;->F:Ljava/lang/Object;

    check-cast p1, Ltd1/e;

    iget-object p1, v0, Ltd1/g$b$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lq83/d;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Ltd1/g$b$a;->w:Lec3/m;

    check-cast p1, Ltd1/e;

    sget-object v2, Ltd1/e;->NONE:Ltd1/e;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-ne p1, v2, :cond_4

    iget-object v2, p0, Ltd1/g$b$a;->x:Lq92/h;

    invoke-virtual {v2}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    if-nez v2, :cond_4

    sget-object v2, Lq92/a;->w:Lq92/a;

    invoke-virtual {v2}, Lq92/a;->k()Lst0/f;

    move-result-object v2

    sget-object v9, Lst0/n;->a:Lst0/n;

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object p1, Ltd1/f;->PAIR_DEVICE:Ltd1/f;

    iput-object v7, v0, Ltd1/g$b$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$b$a$a;->H:I

    iput v6, v0, Ltd1/g$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_4
    sget-object v2, Ltd1/e;->READY:Ltd1/e;

    if-eq p1, v2, :cond_5

    sget-object v6, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    if-eq p1, v6, :cond_5

    iget-object v6, p0, Ltd1/g$b$a;->x:Lq92/h;

    invoke-virtual {v6}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v6

    if-eqz v6, :cond_5

    sget-object v6, Lq92/a;->w:Lq92/a;

    invoke-virtual {v6}, Lq92/a;->k()Lst0/f;

    move-result-object v6

    sget-object v9, Lst0/n;->a:Lst0/n;

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    sget-object p1, Ltd1/f;->CONNECTING:Ltd1/f;

    iput-object v7, v0, Ltd1/g$b$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$b$a$a;->H:I

    iput v5, v0, Ltd1/g$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_5
    if-ne p1, v2, :cond_6

    sget-object p1, Ltd1/f;->CONNECTED:Ltd1/f;

    iput-object v7, v0, Ltd1/g$b$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$b$a$a;->H:I

    iput v4, v0, Ltd1/g$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_2

    :cond_6
    sget-object v2, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    if-ne p1, v2, :cond_7

    sget-object p1, Ltd1/f;->CONNECTION_FAILED:Ltd1/f;

    iput-object v7, v0, Ltd1/g$b$a$a;->z:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->E:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->F:Ljava/lang/Object;

    iput-object v7, v0, Ltd1/g$b$a$a;->G:Ljava/lang/Object;

    iput v8, v0, Ltd1/g$b$a$a;->H:I

    iput v3, v0, Ltd1/g$b$a$a;->x:I

    invoke-interface {p2, p1, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
