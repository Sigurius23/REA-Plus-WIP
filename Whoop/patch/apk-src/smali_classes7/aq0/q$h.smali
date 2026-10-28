.class final Laq0/q$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laq0/q;->w1(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.chat.ChatFragment$initChat$11$1"
    f = "ChatFragment.kt"
    l = {
        0x1ad
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Laq0/q;

.field final synthetic y:Lio/getstream/chat/android/models/Message;


# direct methods
.method public constructor <init>(Laq0/q;Lio/getstream/chat/android/models/Message;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Laq0/q;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Laq0/q$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Laq0/q$h;->x:Laq0/q;

    iput-object p2, p0, Laq0/q$h;->y:Lio/getstream/chat/android/models/Message;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Laq0/q$h;

    iget-object v0, p0, Laq0/q$h;->x:Laq0/q;

    iget-object v1, p0, Laq0/q$h;->y:Lio/getstream/chat/android/models/Message;

    invoke-direct {p1, v0, v1, p2}, Laq0/q$h;-><init>(Laq0/q;Lio/getstream/chat/android/models/Message;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Laq0/q$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Laq0/q$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Laq0/q$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Laq0/q$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Laq0/q$h;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->L0(Laq0/q;)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object p1

    iget-object v1, p0, Laq0/q$h;->y:Lio/getstream/chat/android/models/Message;

    invoke-virtual {p1, v1}, Liq0/m;->e1(Lio/getstream/chat/android/models/Message;)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object p1

    iput v2, p0, Laq0/q$h;->w:I

    invoke-virtual {p1, p0}, Liq0/m;->E0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Laq0/q$h;->y:Lio/getstream/chat/android/models/Message;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iget-object v0, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->H0(Laq0/q;)Leq0/n0;

    move-result-object v0

    iget-object v0, v0, Leq0/n0;->b:Leq0/y2;

    iget-object v0, v0, Leq0/y2;->k:Landroid/widget/TextView;

    const-string v1, "messageActionDelete"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    const/4 v3, 0x0

    if-eqz p1, :cond_3

    move v4, v3

    goto :goto_1

    :cond_3
    move v4, v1

    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->H0(Laq0/q;)Leq0/n0;

    move-result-object v0

    iget-object v0, v0, Leq0/n0;->b:Leq0/y2;

    iget-object v0, v0, Leq0/y2;->l:Landroid/widget/TextView;

    const-string v4, "messageActionEdit"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_4

    move v4, v3

    goto :goto_2

    :cond_4
    move v4, v1

    :goto_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->H0(Laq0/q;)Leq0/n0;

    move-result-object v0

    iget-object v0, v0, Leq0/n0;->b:Leq0/y2;

    iget-object v0, v0, Leq0/y2;->p:Landroid/widget/TextView;

    const-string v4, "messageActionReport"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_5

    move p1, v3

    goto :goto_3

    :cond_5
    move p1, v1

    :goto_3
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->H0(Laq0/q;)Leq0/n0;

    move-result-object p1

    iget-object p1, p1, Leq0/n0;->b:Leq0/y2;

    iget-object p1, p1, Leq0/y2;->o:Landroid/widget/TextView;

    const-string v0, "messageActionReply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laq0/q$h;->y:Lio/getstream/chat/android/models/Message;

    invoke-static {v0}, Ldq0/c;->c(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_6

    move v1, v3

    :cond_6
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->I0(Laq0/q;)Lz82/e;

    move-result-object p1

    iget-object v0, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {v0}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object v0

    invoke-virtual {v0}, Liq0/m;->C0()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {v1}, Laq0/q;->F0(Laq0/q;)Liq0/m;

    move-result-object v1

    invoke-virtual {v1}, Liq0/m;->x0()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-static {v1}, Ldq0/c;->c(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    :cond_7
    const-string v1, "Open"

    invoke-virtual {p1, v0, v1, v3}, Lz82/e;->P0(Ljava/lang/String;Ljava/lang/String;Z)V

    iget-object p1, p0, Laq0/q$h;->x:Laq0/q;

    invoke-static {p1}, Laq0/q;->J0(Laq0/q;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {p1, v0, v2}, Laq0/q;->P0(Laq0/q;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    const-string p1, "messageActionBottomSheetBehavior"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
