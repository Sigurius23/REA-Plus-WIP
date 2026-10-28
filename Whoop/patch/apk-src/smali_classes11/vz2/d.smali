.class public final synthetic Lvz2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lvz2/e;


# direct methods
.method public synthetic constructor <init>(Lvz2/e;I)V
    .locals 0

    iput p2, p0, Lvz2/d;->w:I

    iput-object p1, p0, Lvz2/d;->x:Lvz2/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lvz2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lvz2/d;->x:Lvz2/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lvz2/e;->c(Lvz2/e;Ljava/lang/Boolean;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lvz2/d;->x:Lvz2/e;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lvz2/e;->b(Lvz2/e;Ljava/lang/Boolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
