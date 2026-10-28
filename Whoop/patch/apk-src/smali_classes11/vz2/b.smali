.class public final synthetic Lvz2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvz2/e;


# direct methods
.method public synthetic constructor <init>(Lvz2/e;I)V
    .locals 0

    iput p2, p0, Lvz2/b;->w:I

    iput-object p1, p0, Lvz2/b;->x:Lvz2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lvz2/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvz2/b;->x:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->e(Lvz2/e;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lvz2/b;->x:Lvz2/e;

    invoke-static {v0}, Lvz2/e;->a(Lvz2/e;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
