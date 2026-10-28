.class public final Lp20/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkr/j;


# direct methods
.method public synthetic constructor <init>(Lkr/j;I)V
    .locals 0

    iput p2, p0, Lp20/b;->w:I

    iput-object p1, p0, Lp20/b;->x:Lkr/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lp20/b;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lp20/c;

    iget-object v1, p0, Lp20/b;->x:Lkr/j;

    iget-object v1, v1, Lkr/j;->b:Ljava/lang/Object;

    check-cast v1, Lkr/j;

    invoke-direct {v0, v1}, Lp20/c;-><init>(Lkr/j;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lp20/d;

    iget-object v1, p0, Lp20/b;->x:Lkr/j;

    iget-object v1, v1, Lkr/j;->b:Ljava/lang/Object;

    check-cast v1, Lkr/j;

    invoke-direct {v0, v1}, Lp20/d;-><init>(Lkr/j;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
