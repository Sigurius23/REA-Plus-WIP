.class public final Ln20/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv03/d;


# instance fields
.field public final synthetic w:I

.field public final x:Le10/s0;

.field public final y:Lv03/h;


# direct methods
.method public synthetic constructor <init>(Le10/s0;Lv03/h;I)V
    .locals 0

    iput p3, p0, Ln20/s;->w:I

    iput-object p1, p0, Ln20/s;->x:Le10/s0;

    iput-object p2, p0, Ln20/s;->y:Lv03/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ln20/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ln20/s;->x:Le10/s0;

    invoke-virtual {v0}, Le10/s0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le10/n0;

    iget-object v1, p0, Ln20/s;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-string v2, "coroutineScope"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Le10/n0;->a(Lbc3/c0;)Le10/r0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ln20/s;->x:Le10/s0;

    invoke-virtual {v0}, Le10/s0;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le10/n0;

    iget-object v1, p0, Ln20/s;->y:Lv03/h;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln20/u;

    const-string v2, "viewModel"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Le10/n0;->a(Lbc3/c0;)Le10/r0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
