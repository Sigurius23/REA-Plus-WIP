.class public final Lwb3/g;
.super Ljava/lang/Object;

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final x:Lwb3/h;


# direct methods
.method public synthetic constructor <init>(Lwb3/h;I)V
    .locals 0

    iput p2, p0, Lwb3/g;->w:I

    iput-object p1, p0, Lwb3/g;->x:Lwb3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lwb3/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwb3/g;->x:Lwb3/h;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lwb3/g;->x:Lwb3/h;

    iget-object v1, v0, Lwb3/h;->x:Llb3/y;

    invoke-virtual {v0, v1}, Lwb3/h;->k(Llb3/y;)Lj93/e;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
