.class public final synthetic Ldn0/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;II)V
    .locals 0

    iput p3, p0, Ldn0/l;->w:I

    iput-object p1, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Ldn0/l;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ldn0/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Lz21/b;->e(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Lx31/f;->h(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Lwr0/u0;->l(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget v0, p0, Ldn0/l;->y:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_3
    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Lkk1/g;->n(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Lg31/c;->a(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Ldn0/l;->x:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Ldn0/l;->y:I

    invoke-static {v1, v0}, Ldn0/p;->h(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
