.class public final Lr93/h0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lva3/e;


# direct methods
.method public synthetic constructor <init>(Lva3/e;I)V
    .locals 0

    iput p2, p0, Lr93/h0;->w:I

    iput-object p1, p0, Lr93/h0;->x:Lva3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lr93/h0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ls93/i;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lr93/h0;->x:Lva3/e;

    invoke-interface {p1, v0}, Ls93/i;->T(Lva3/e;)Ls93/b;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lva3/e;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lva3/e;->b()Lva3/e;

    move-result-object p1

    iget-object v0, p0, Lr93/h0;->x:Lva3/e;

    invoke-virtual {p1, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
