.class public final Lhb3/e0;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Lhb3/h0;


# direct methods
.method public synthetic constructor <init>(Lhb3/h0;I)V
    .locals 0

    iput p2, p0, Lhb3/e0;->w:I

    iput-object p1, p0, Lhb3/e0;->x:Lhb3/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lhb3/e0;->w:I

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhb3/e0;->x:Lhb3/h0;

    iget-object v0, v0, Lhb3/h0;->a:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->b:Lsa3/f;

    invoke-static {v1, p1}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p1

    iget-boolean v1, p1, Lva3/c;->c:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->b:Lr93/b0;

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lhg3/i;->M(Lr93/b0;Lva3/c;)Lr93/h;

    move-result-object p1

    instance-of v0, p1, Lr93/w0;

    if-eqz v0, :cond_1

    check-cast p1, Lr93/w0;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    :goto_1
    return-object p1

    :pswitch_0
    iget-object v0, p0, Lhb3/e0;->x:Lhb3/h0;

    iget-object v0, v0, Lhb3/h0;->a:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->b:Lsa3/f;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    invoke-static {v1, p1}, Le93/b;->E(Lsa3/f;I)Lva3/c;

    move-result-object p1

    iget-boolean v1, p1, Lva3/c;->c:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0, p1}, Lhb3/i;->b(Lva3/c;)Lr93/e;

    move-result-object p1

    goto :goto_2

    :cond_2
    iget-object v0, v0, Lhb3/i;->b:Lr93/b0;

    invoke-static {v0, p1}, Lhg3/i;->M(Lr93/b0;Lva3/c;)Lr93/h;

    move-result-object p1

    :goto_2
    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
