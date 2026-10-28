.class public final synthetic Lim1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic y:Lfm1/g;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Lfm1/g;I)V
    .locals 0

    iput p3, p0, Lim1/y;->w:I

    iput-object p1, p0, Lim1/y;->x:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/y;->y:Lfm1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/y;->y:Lfm1/g;

    check-cast p1, Lb11/h;

    iget-object v1, p0, Lim1/y;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/home/view/HomeFragment;->I(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lb11/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lim1/y;->y:Lfm1/g;

    check-cast p1, Lkb1/e;

    iget-object v1, p0, Lim1/y;->x:Lcom/whoop/home/view/HomeFragment;

    invoke-static {v1, v0, p1}, Lcom/whoop/home/view/HomeFragment;->D(Lcom/whoop/home/view/HomeFragment;Lfm1/g;Lkb1/e;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
