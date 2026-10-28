.class public final synthetic Lc92/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc92/g;


# direct methods
.method public synthetic constructor <init>(Lc92/g;I)V
    .locals 0

    iput p2, p0, Lc92/f;->w:I

    iput-object p1, p0, Lc92/f;->x:Lc92/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lc92/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc92/f;->x:Lc92/g;

    check-cast p1, Lst0/f;

    invoke-static {v0, p1}, Lc92/g;->b(Lc92/g;Lst0/f;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc92/f;->x:Lc92/g;

    check-cast p1, Ltd1/e;

    invoke-static {v0, p1}, Lc92/g;->d(Lc92/g;Ltd1/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
