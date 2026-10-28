.class public final synthetic Lnq0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lnq0/i;


# direct methods
.method public synthetic constructor <init>(Lnq0/i;I)V
    .locals 0

    iput p2, p0, Lnq0/h;->w:I

    iput-object p1, p0, Lnq0/h;->x:Lnq0/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lnq0/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lnq0/h;->x:Lnq0/i;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v0, p1}, Lnq0/i;->w(Lnq0/i;Lcom/whoop/data/remote/commons/Resource;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lnq0/h;->x:Lnq0/i;

    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-static {v0, p1}, Lnq0/i;->A(Lnq0/i;Lcom/whoop/data/remote/commons/Resource;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
