.class public final Ln0/f;
.super Lp0/y;
.source "SourceFile"

# interfaces
.implements Ln0/q;


# instance fields
.field public final c:Lab/h0;

.field public d:La0/f0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lab/h0;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Ln0/f;->c:Lab/h0;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final m()Lab/h0;
    .locals 1

    iget-object v0, p0, Ln0/f;->c:Lab/h0;

    return-object v0
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V
    .locals 4

    new-instance v0, Ln0/d;

    if-eqz p1, :cond_0

    new-instance v1, Lio/getstream/chat/android/client/internal/state/utils/internal/d;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/d;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance p1, Lio/getstream/chat/android/client/internal/state/utils/internal/d;

    const/4 v2, 0x1

    invoke-direct {p1, p2, v2}, Lio/getstream/chat/android/client/internal/state/utils/internal/d;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lb30/a4;

    const/4 v2, 0x3

    invoke-direct {p2, p3, v2}, Lb30/a4;-><init>(Ljava/lang/Object;I)V

    new-instance p3, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x331bf287

    invoke-direct {p3, p2, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v0, v1, p1, p3}, Ln0/d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    iget-object p1, p0, Ln0/f;->c:Lab/h0;

    invoke-virtual {p1, v2, v0}, Lab/h0;->g(ILp0/q;)V

    return-void
.end method

.method public final r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V
    .locals 1

    new-instance v0, Ln0/d;

    invoke-direct {v0, p2, p3, p4}, Ln0/d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    iget-object p2, p0, Ln0/f;->c:Lab/h0;

    invoke-virtual {p2, p1, v0}, Lab/h0;->g(ILp0/q;)V

    return-void
.end method
