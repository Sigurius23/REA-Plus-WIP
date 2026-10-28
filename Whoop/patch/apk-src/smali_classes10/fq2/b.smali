.class public final synthetic Lfq2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lbr2/b;


# direct methods
.method public synthetic constructor <init>(Lbr2/b;I)V
    .locals 0

    iput p2, p0, Lfq2/b;->w:I

    iput-object p1, p0, Lfq2/b;->x:Lbr2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfq2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfq2/b;->x:Lbr2/b;

    check-cast p1, Ly81/i;

    invoke-static {v0, p1}, Lfq2/d;->b(Lbr2/b;Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lfq2/b;->x:Lbr2/b;

    check-cast p1, Ly81/i;

    invoke-static {v0, p1}, Lfq2/d;->l(Lbr2/b;Ly81/i;)Li2/t;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
