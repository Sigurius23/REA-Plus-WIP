.class public final synthetic Lb9/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/f;
.implements Lh5/u;
.implements Llo/h;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lb9/t;->w:I

    iput p1, p0, Lb9/t;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lc9/a;ILu8/i0;Lu8/i0;)V
    .locals 0

    .line 2
    const/4 p1, 0x2

    iput p1, p0, Lb9/t;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lb9/t;->x:I

    return-void
.end method


# virtual methods
.method public invoke(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, Lb9/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lb9/t;->x:I

    check-cast p1, Lrm/z0;

    invoke-interface {p1, v0}, Lrm/z0;->onRepeatModeChanged(I)V

    return-void

    :pswitch_0
    check-cast p1, Lc9/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lc9/l;

    iget v0, p0, Lb9/t;->x:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput-boolean v1, p1, Lc9/l;->v:Z

    :cond_0
    iput v0, p1, Lc9/l;->l:I

    return-void

    :pswitch_1
    iget v0, p0, Lb9/t;->x:I

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0}, Lu8/h0;->onAudioSessionIdChanged(I)V

    return-void

    :pswitch_2
    iget v0, p0, Lb9/t;->x:I

    check-cast p1, Lu8/h0;

    invoke-interface {p1, v0}, Lu8/h0;->onRepeatModeChanged(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

    iget v0, p0, Lb9/t;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lb9/t;->x:I

    invoke-static {v0, p1, p2}, Lcom/whoop/community/CommunityLandingHostFragment;->E(ILandroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget v0, p0, Lb9/t;->x:I

    invoke-static {v0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->a(ILandroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
