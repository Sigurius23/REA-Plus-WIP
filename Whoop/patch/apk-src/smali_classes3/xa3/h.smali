.class public final Lxa3/h;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lxa3/i;


# direct methods
.method public synthetic constructor <init>(Lxa3/i;I)V
    .locals 0

    iput p2, p0, Lxa3/h;->w:I

    iput-object p1, p0, Lxa3/h;->x:Lxa3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxa3/h;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Llb3/y;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v0, p0, Lxa3/h;->x:Lxa3/i;

    invoke-virtual {v0, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Llb3/u0;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/u0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "*"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    const-string v1, "getType(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lxa3/h;->x:Lxa3/i;

    invoke-virtual {v1, v0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    sget-object v2, Llb3/g1;->y:Llb3/g1;

    if-ne v1, v2, :cond_1

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
