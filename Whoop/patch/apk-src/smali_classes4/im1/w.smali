.class public final synthetic Lim1/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/home/view/HomeFragment;

.field public final synthetic y:Lfm1/g;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/home/view/HomeFragment;Lfm1/g;I)V
    .locals 0

    iput p3, p0, Lim1/w;->w:I

    iput-object p1, p0, Lim1/w;->x:Lcom/whoop/home/view/HomeFragment;

    iput-object p2, p0, Lim1/w;->y:Lfm1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lim1/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lim1/w;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/w;->y:Lfm1/g;

    invoke-static {v0, v1}, Lcom/whoop/home/view/HomeFragment;->W(Lcom/whoop/home/view/HomeFragment;Lfm1/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lim1/w;->x:Lcom/whoop/home/view/HomeFragment;

    iget-object v1, p0, Lim1/w;->y:Lfm1/g;

    invoke-static {v0, v1}, Lcom/whoop/home/view/HomeFragment;->O(Lcom/whoop/home/view/HomeFragment;Lfm1/g;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
