.class public final Lb4/u;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb4/v;


# direct methods
.method public synthetic constructor <init>(Lb4/v;I)V
    .locals 0

    iput p2, p0, Lb4/u;->w:I

    iput-object p1, p0, Lb4/u;->x:Lb4/v;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lb4/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb4/u;->x:Lb4/v;

    iget-object v1, v0, Lb4/v;->c0:Landroid/view/View;

    invoke-virtual {v0}, Lb4/v;->getUpdateBlock()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb4/u;->x:Lb4/v;

    iget-object v1, v0, Lb4/v;->c0:Landroid/view/View;

    invoke-virtual {v0}, Lb4/v;->getResetBlock()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lb4/u;->x:Lb4/v;

    iget-object v1, v0, Lb4/v;->c0:Landroid/view/View;

    invoke-virtual {v0}, Lb4/v;->getReleaseBlock()Lkotlin/jvm/functions/Function1;

    move-result-object v2

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Lb4/v;->n(Lb4/v;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iget-object v1, p0, Lb4/u;->x:Lb4/v;

    iget-object v1, v1, Lb4/v;->c0:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
