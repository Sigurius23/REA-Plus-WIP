.class public final synthetic Lu10/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:La30/w0;


# direct methods
.method public synthetic constructor <init>(La30/w0;I)V
    .locals 0

    iput p2, p0, Lu10/a;->w:I

    iput-object p1, p0, Lu10/a;->x:La30/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lu10/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    iget-object p1, p0, Lu10/a;->x:La30/w0;

    iget-object p1, p1, La30/w0;->G:Ljava/lang/Object;

    check-cast p1, Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/q;

    sget-object v0, Lu10/k;->b:Lu10/k;

    invoke-virtual {p1, v0}, Lu10/q;->a(Lu10/j;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    check-cast p1, Lh20/l;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lq20/w;

    iget-object p1, p1, Lh20/l;->b:Ly00/o4;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1, v1}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    iget-object p1, p0, Lu10/a;->x:La30/w0;

    iget-object v1, p1, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Ls10/f;

    invoke-virtual {v1, v0}, Ls10/f;->a(Lq20/y;)V

    iget-object v1, p1, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lk20/a;

    invoke-virtual {v1, v0}, Lk20/a;->s(Lq20/y;)V

    iget-object p1, p1, La30/w0;->G:Ljava/lang/Object;

    check-cast p1, Lk83/a;

    invoke-interface {p1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu10/q;

    new-instance v0, Lu10/l;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lu10/l;-><init>(Z)V

    invoke-virtual {p1, v0}, Lu10/q;->a(Lu10/j;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
