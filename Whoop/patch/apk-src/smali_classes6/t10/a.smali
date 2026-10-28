.class public final Lt10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lt10/b;


# direct methods
.method public synthetic constructor <init>(Lt10/b;I)V
    .locals 0

    iput p2, p0, Lt10/a;->w:I

    iput-object p1, p0, Lt10/a;->x:Lt10/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lt10/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ln20/c;

    iget-object v1, p0, Lt10/a;->x:Lt10/b;

    iget-object v1, v1, Lt10/b;->a:Lt10/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln20/c;-><init>(Ljava/lang/Object;I)V

    return-object v0

    :pswitch_0
    new-instance v0, Ln20/d;

    iget-object v1, p0, Lt10/a;->x:Lt10/b;

    iget-object v1, v1, Lt10/b;->a:Lt10/b;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln20/d;-><init>(Ljava/lang/Object;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
