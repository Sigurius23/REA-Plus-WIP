.class public final Lp20/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lp20/f;


# direct methods
.method public synthetic constructor <init>(Lp20/f;I)V
    .locals 0

    iput p2, p0, Lp20/e;->w:I

    iput-object p1, p0, Lp20/e;->x:Lp20/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lp20/e;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln20/d;

    iget-object v1, p0, Lp20/e;->x:Lp20/f;

    iget-object v1, v1, Lp20/f;->c:Lp20/f;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln20/d;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ln20/c;

    iget-object v1, p0, Lp20/e;->x:Lp20/f;

    iget-object v1, v1, Lp20/f;->c:Lp20/f;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln20/c;-><init>(Ljava/lang/Object;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
