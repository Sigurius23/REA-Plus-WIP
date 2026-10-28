.class public final synthetic La81/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lm91/o;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lm91/o;I)V
    .locals 0

    iput p3, p0, La81/j;->w:I

    iput-object p1, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La81/j;->y:Lm91/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La81/j;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lzi0/a;->m(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lui0/p;->e(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lui0/k;->h(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lui0/g;->c(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lcom/whoop/profile/view/ProfileScreenContentKt;->e(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, Lbj0/b;->a(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, La81/o;->j(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, La81/j;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, La81/j;->y:Lm91/o;

    invoke-static {v0, v1, p1}, La81/o;->w(Lkotlin/jvm/functions/Function1;Lm91/o;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
