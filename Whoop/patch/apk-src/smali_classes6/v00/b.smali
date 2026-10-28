.class public final Lv00/b;
.super Lv00/i;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "InstantDebits"

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final a(Lv00/c0;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "code"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Lv00/c0;->R:Lh20/w2;

    invoke-virtual {p2}, Lh20/w2;->b()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p1, Lv00/c0;->T:Ly00/p2;

    sget-object v0, Ly00/p2;->x:Ly00/p2;

    if-eq p2, v0, :cond_0

    invoke-static {p1}, Ls4/l;->d(Lv00/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
