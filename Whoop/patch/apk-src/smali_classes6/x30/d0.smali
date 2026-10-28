.class public final synthetic Lx30/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lx30/e0;


# direct methods
.method public synthetic constructor <init>(Lx30/e0;I)V
    .locals 0

    iput p2, p0, Lx30/d0;->w:I

    iput-object p1, p0, Lx30/d0;->x:Lx30/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lx30/d0;->w:I

    check-cast p1, Ljava/lang/String;

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lx30/d0;->x:Lx30/e0;

    iget-object v0, v0, Lx30/e0;->a:Ld0/o2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_0
    const-string v0, "number"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lx30/d0;->x:Lx30/e0;

    iget-object p1, p1, Lx30/e0;->a:Ld0/o2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lq3/f0;->w:Lg40/h2;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
