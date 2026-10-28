.class public final Lpg/d;
.super La2/a;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lfg3/b;)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, v0}, La2/a;-><init>(Ljava/lang/Object;I)V

    return-void
.end method


# virtual methods
.method public final g(Log/b;)Log/e;
    .locals 4

    new-instance v0, Lla/b;

    iget-object v1, p0, La2/a;->x:Ljava/lang/Object;

    check-cast v1, Lfg3/b;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    const/4 v3, 0x2

    if-eq p1, v2, :cond_1

    const/4 v2, 0x3

    if-eq p1, v3, :cond_2

    const/4 v3, 0x4

    if-eq p1, v2, :cond_1

    if-ne p1, v3, :cond_0

    const/4 v2, 0x5

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move v2, v3

    :cond_2
    :goto_0
    invoke-interface {v1, v2}, Lfg3/b;->g(I)Lig3/a;

    move-result-object p1

    const-string v1, "atLevel(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x18

    invoke-direct {v0, p1, v1}, Lla/b;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
