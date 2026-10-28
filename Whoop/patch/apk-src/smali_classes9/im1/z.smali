.class public final synthetic Lim1/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;I)V
    .locals 0

    iput p2, p0, Lim1/z;->w:I

    iput-object p1, p0, Lim1/z;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lim1/z;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/z;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lem1/t;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->A(Lcom/whoop/home/view/HomeFragment;Lem1/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lim1/z;->x:Lcom/whoop/home/view/HomeFragment;

    check-cast p1, Lem1/t;

    invoke-static {v0, p1}, Lcom/whoop/home/view/HomeFragment;->s0(Lcom/whoop/home/view/HomeFragment;Lem1/t;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
