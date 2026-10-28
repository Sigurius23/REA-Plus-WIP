.class public final Lb4/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lb4/l;


# direct methods
.method public synthetic constructor <init>(Lb4/l;I)V
    .locals 0

    iput p2, p0, Lb4/k;->w:I

    iput-object p1, p0, Lb4/k;->x:Lb4/l;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lb4/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb4/k;->x:Lb4/l;

    iget-boolean v1, v0, Lb4/l;->E:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb4/l;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-ne v1, v0, :cond_0

    invoke-static {v0}, Lb4/l;->j(Lb4/l;)La3/c2;

    move-result-object v1

    sget-object v2, Lb4/c;->x:Lb4/c;

    invoke-virtual {v0}, Lb4/l;->getUpdate()Lc93/a;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, La3/c2;->a(La3/b2;Lkotlin/jvm/functions/Function1;Lc93/a;)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lb4/k;->x:Lb4/l;

    invoke-virtual {v0}, Lb4/l;->getLayoutNode()La3/n0;

    move-result-object v0

    invoke-virtual {v0}, La3/n0;->P()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
