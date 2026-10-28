.class public final synthetic Ldb/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p5, p0, Ldb/u;->w:I

    iput-object p1, p0, Ldb/u;->x:Ljava/lang/Object;

    iput-object p2, p0, Ldb/u;->y:Ljava/lang/Object;

    iput-object p3, p0, Ldb/u;->z:Ljava/lang/Object;

    iput-object p4, p0, Ldb/u;->E:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    iget v0, p0, Ldb/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ldb/u;->x:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v1, p0, Ldb/u;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;

    iget-object v2, p0, Ldb/u;->z:Ljava/lang/Object;

    check-cast v2, Lrq0/t0;

    iget-object v3, p0, Ldb/u;->E:Ljava/lang/Object;

    check-cast v3, Leq0/x1;

    invoke-static {v0, v1, v2, v3, p1}, Lrq0/t0;->X(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/whoop/community/presentation/teams/calendar/TeamCalendarView;Lrq0/t0;Leq0/x1;Landroid/view/View;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Ldb/u;->x:Ljava/lang/Object;

    check-cast v0, Lrq0/k;

    iget-object v1, p0, Ldb/u;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/domain/model/teams/TeamUser;

    iget-object v2, p0, Ldb/u;->z:Ljava/lang/Object;

    check-cast v2, Lrq0/i$b;

    iget-object v3, p0, Ldb/u;->E:Ljava/lang/Object;

    check-cast v3, Lc93/a;

    invoke-static {v0, v1, v2, v3, p1}, Lrq0/i$b;->c(Lrq0/k;Lcom/whoop/domain/model/teams/TeamUser;Lrq0/i$b;Lc93/a;Landroid/view/View;)V

    return-void

    :pswitch_1
    iget-object p1, p0, Ldb/u;->x:Ljava/lang/Object;

    check-cast p1, Ldb/v;

    iget-object v0, p0, Ldb/u;->y:Ljava/lang/Object;

    check-cast v0, Lu8/j0;

    iget-object v1, p0, Ldb/u;->z:Ljava/lang/Object;

    check-cast v1, Lu8/p0;

    iget-object v2, p0, Ldb/u;->E:Ljava/lang/Object;

    check-cast v2, Ldb/t;

    check-cast v0, La2/a;

    const/16 v3, 0x1d

    invoke-virtual {v0, v3}, La2/a;->A(I)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->k0()Lo9/j;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Lo9/i;

    invoke-direct {v4, v3}, Lo9/i;-><init>(Lo9/j;)V

    new-instance v3, Lu8/q0;

    iget v5, v2, Ldb/t;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v5}, Lzr/g0;->r(Ljava/lang/Object;)Lzr/w0;

    move-result-object v5

    invoke-direct {v3, v1, v5}, Lu8/q0;-><init>(Lu8/p0;Ljava/util/List;)V

    iget-object v1, v3, Lu8/q0;->a:Lu8/p0;

    iget v5, v1, Lu8/p0;->c:I

    invoke-virtual {v4, v5}, Lu8/s0;->a(I)V

    iget-object v5, v4, Lu8/s0;->s:Ljava/util/HashMap;

    invoke-virtual {v5, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v2, Ldb/t;->a:Lu8/u0;

    iget-object v1, v1, Lu8/u0;->b:Lu8/p0;

    iget v1, v1, Lu8/p0;->c:I

    invoke-virtual {v4, v1}, Lo9/i;->d(I)V

    new-instance v1, Lo9/j;

    invoke-direct {v1, v4}, Lo9/j;-><init>(Lo9/i;)V

    invoke-virtual {v0, v1}, Lb9/f0;->D0(Lu8/t0;)V

    iget-object v0, v2, Ldb/t;->c:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ldb/v;->e(Ljava/lang/String;)V

    iget-object p1, p1, Ldb/v;->c:Landroid/widget/FrameLayout;

    check-cast p1, Ldb/x;

    iget-object p1, p1, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
