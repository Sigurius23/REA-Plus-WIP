.class public final Lp20/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp20/h;


# direct methods
.method public synthetic constructor <init>(Lp20/h;I)V
    .locals 0

    iput p2, p0, Lp20/g;->w:I

    iput-object p1, p0, Lp20/g;->x:Lp20/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp20/g;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln20/c;

    iget-object v1, p0, Lp20/g;->x:Lp20/h;

    iget-object v1, v1, Lp20/h;->a:Lp20/h;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln20/c;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ln20/d;

    iget-object v1, p0, Lp20/g;->x:Lp20/h;

    iget-object v1, v1, Lp20/h;->a:Lp20/h;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln20/d;-><init>(Ljava/lang/Object;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
