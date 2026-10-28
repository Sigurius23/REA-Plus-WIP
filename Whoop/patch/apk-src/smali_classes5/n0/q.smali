.class public interface abstract Ln0/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ln0/q;ILkotlin/jvm/functions/Function1;Lc93/n;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    sget-object p4, Ln0/p;->w:Ln0/p;

    check-cast p0, Ln0/f;

    invoke-virtual {p0, p1, p2, p4, p3}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    return-void
.end method

.method public static synthetic b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V
    .locals 1

    and-int/lit8 p3, p3, 0x1

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    move-object p1, v0

    :cond_0
    check-cast p0, Ln0/f;

    invoke-virtual {p0, p1, v0, p2}, Ln0/f;->q(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method
