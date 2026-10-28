.class public final synthetic Lc92/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lc92/g;


# direct methods
.method public synthetic constructor <init>(Lc92/g;I)V
    .locals 0

    iput p2, p0, Lc92/c;->w:I

    iput-object p1, p0, Lc92/c;->x:Lc92/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lc92/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lc92/c;->x:Lc92/g;

    invoke-static {v0}, Lc92/g;->e(Lc92/g;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lc92/c;->x:Lc92/g;

    invoke-static {v0}, Lc92/g;->f(Lc92/g;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
