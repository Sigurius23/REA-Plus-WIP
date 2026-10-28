.class public final Lna3/j;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/lang/String;

.field public final y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lna3/j;->w:I

    iput-object p1, p0, Lna3/j;->x:Ljava/lang/String;

    iput-object p2, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lna3/j;->w:I

    check-cast p1, Lna3/o;

    packed-switch v0, :pswitch_data_0

    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->a:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v0

    iget-object v1, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v0, Lna3/l;->b:Lna3/d;

    sget-object v1, Lna3/l;->c:Lna3/d;

    filled-new-array {v0, v1}, [Lna3/d;

    move-result-object v0

    iget-object v1, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Lya3/q;->w:Lya3/q;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->c:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v1

    iget-object v2, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v1, Lna3/l;->b:Lna3/d;

    filled-new-array {v1, v0}, [Lna3/d;

    move-result-object v0

    iget-object v1, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Lya3/q;->w:Lya3/q;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_1
    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->b:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v1

    iget-object v2, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v1, Lna3/l;->c:Lna3/d;

    filled-new-array {v1}, [Lna3/d;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v3, Lna3/l;->a:Lna3/d;

    filled-new-array {v0, v1, v1, v3}, [Lna3/d;

    move-result-object v0

    iget-object v1, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    filled-new-array {v3}, [Lna3/d;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_2
    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->b:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v1

    iget-object v2, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v1, Lna3/l;->c:Lna3/d;

    sget-object v3, Lna3/l;->a:Lna3/d;

    filled-new-array {v0, v0, v1, v3}, [Lna3/d;

    move-result-object v0

    iget-object v1, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v1, v0}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    filled-new-array {v3}, [Lna3/d;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_3
    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->b:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v1

    iget-object v2, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    filled-new-array {v0, v0, v0}, [Lna3/d;

    move-result-object v1

    iget-object v3, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v3, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    filled-new-array {v0}, [Lna3/d;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_4
    const-string v0, "$this$function"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lna3/l;->b:Lna3/d;

    filled-new-array {v0}, [Lna3/d;

    move-result-object v1

    iget-object v2, p0, Lna3/j;->x:Ljava/lang/String;

    invoke-virtual {p1, v2, v1}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    sget-object v1, Lna3/l;->a:Lna3/d;

    filled-new-array {v0, v0, v1, v1}, [Lna3/d;

    move-result-object v0

    iget-object v3, p0, Lna3/j;->y:Ljava/lang/String;

    invoke-virtual {p1, v3, v0}, Lna3/o;->a(Ljava/lang/String;[Lna3/d;)V

    filled-new-array {v1}, [Lna3/d;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lna3/o;->c(Ljava/lang/String;[Lna3/d;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
