.class public final synthetic Lmq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmq0/e;


# direct methods
.method public synthetic constructor <init>(Lmq0/e;I)V
    .locals 0

    iput p2, p0, Lmq0/d;->w:I

    iput-object p1, p0, Lmq0/d;->x:Lmq0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmq0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmq0/d;->x:Lmq0/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmq0/e;->I(Lmq0/e;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmq0/d;->x:Lmq0/e;

    check-cast p1, Lmq0/j;

    invoke-static {v0, p1}, Lmq0/e;->F(Lmq0/e;Lmq0/j;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmq0/d;->x:Lmq0/e;

    check-cast p1, Liq0/t;

    invoke-static {v0, p1}, Lmq0/e;->G(Lmq0/e;Liq0/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
