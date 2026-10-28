.class public final Luo/p;
.super Luo/r;
.source "SourceFile"


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Intent;

.field public final synthetic y:I

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Intent;Ljava/lang/Object;II)V
    .locals 0

    iput p4, p0, Luo/p;->w:I

    iput-object p1, p0, Luo/p;->x:Landroid/content/Intent;

    iput-object p2, p0, Luo/p;->z:Ljava/lang/Object;

    iput p3, p0, Luo/p;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget v0, p0, Luo/p;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luo/p;->x:Landroid/content/Intent;

    if-eqz v0, :cond_0

    iget-object v1, p0, Luo/p;->z:Ljava/lang/Object;

    check-cast v1, Landroidx/fragment/app/m0;

    iget v2, p0, Luo/p;->y:I

    invoke-virtual {v1, v0, v2}, Landroidx/fragment/app/m0;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Luo/p;->x:Landroid/content/Intent;

    if-eqz v0, :cond_1

    iget-object v1, p0, Luo/p;->z:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget v2, p0, Luo/p;->y:I

    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
