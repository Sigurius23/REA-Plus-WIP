.class public final synthetic Lam2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    iput p2, p0, Lam2/f;->w:I

    iput-object p1, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lam2/f;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-static {p1, v0}, Lam2/o0;->b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lam2/o0;->j(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lam2/o0;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lam2/q;

    invoke-static {v0, p1}, Lam2/o0;->u(Lkotlin/jvm/functions/Function1;Lam2/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lam2/q;

    invoke-static {v0, p1}, Lam2/k;->d(Lkotlin/jvm/functions/Function1;Lam2/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lam2/f;->x:Lkotlin/jvm/functions/Function1;

    check-cast p1, Lam2/q;

    invoke-static {v0, p1}, Lam2/k;->m(Lkotlin/jvm/functions/Function1;Lam2/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
