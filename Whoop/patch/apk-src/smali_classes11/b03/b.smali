.class public final synthetic Lb03/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lld1/c;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lld1/c;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb03/b;->w:I

    iput-object p1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lb03/b;->y:Lld1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 2
    iput p3, p0, Lb03/b;->w:I

    iput-object p1, p0, Lb03/b;->y:Lld1/c;

    iput-object p2, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lb03/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lzl0/j;->c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lwr0/g;->i(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lw01/g;->e(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lv01/l;->m(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lu11/i;->a(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lnr0/f;->b(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Ln31/h;->c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb03/b;->y:Lld1/c;

    invoke-static {v0, v1, p1}, Li31/h;->f(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    iget-object v0, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb03/b;->y:Lld1/c;

    invoke-static {v0, v1, p1}, Lh31/s;->a(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lb03/b;->y:Lld1/c;

    invoke-static {v0, v1, p1}, Ldn0/p;->s(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_9
    iget-object v0, p0, Lb03/b;->y:Lld1/c;

    iget-object v1, p0, Lb03/b;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v0, p1}, Lb03/d;->c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
