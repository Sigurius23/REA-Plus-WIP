.class public final Ln20/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ln20/a;->w:I

    iput-object p1, p0, Ln20/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ln20/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lty/c;

    iget-object v1, p0, Ln20/a;->x:Ljava/lang/Object;

    check-cast v1, Lq/f;

    iget-object v1, v1, Lq/f;->y:Ljava/lang/Object;

    check-cast v1, Lq/f;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lty/c;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ln20/c;

    iget-object v1, p0, Ln20/a;->x:Ljava/lang/Object;

    check-cast v1, Ln20/b;

    iget-object v1, v1, Ln20/b;->a:Ln20/b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln20/c;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Ln20/d;

    iget-object v1, p0, Ln20/a;->x:Ljava/lang/Object;

    check-cast v1, Ln20/b;

    iget-object v1, v1, Ln20/b;->a:Ln20/b;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln20/d;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
