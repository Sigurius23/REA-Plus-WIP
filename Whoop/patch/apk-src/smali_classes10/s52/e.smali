.class public final synthetic Ls52/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Ls52/e;->w:I

    iput-object p2, p0, Ls52/e;->x:Ljava/lang/Object;

    iput-object p3, p0, Ls52/e;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Ls52/e;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls52/e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/debug/WhoopStrapTestFragment;

    iget-object v1, p0, Ls52/e;->y:Ljava/lang/Object;

    check-cast v1, Ly82/b;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/whoop/ui/debug/WhoopStrapTestFragment;->E(Lcom/whoop/ui/debug/WhoopStrapTestFragment;Ly82/b;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ls52/e;->x:Ljava/lang/Object;

    check-cast v0, Lix/a;

    iget-object v1, p0, Ls52/e;->y:Ljava/lang/Object;

    check-cast v1, Lgx/a;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Ls52/f;->b(Lix/a;Lgx/a;Ljava/lang/Throwable;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Ls52/e;->x:Ljava/lang/Object;

    check-cast v0, Lix/a;

    iget-object v1, p0, Ls52/e;->y:Ljava/lang/Object;

    check-cast v1, Lgx/a;

    check-cast p1, Lod1/k;

    invoke-static {v0, v1, p1}, Ls52/f;->a(Lix/a;Lgx/a;Lod1/k;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
