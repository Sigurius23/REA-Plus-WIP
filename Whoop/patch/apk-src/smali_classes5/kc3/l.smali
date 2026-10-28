.class public final Lkc3/l;
.super Lbc3/z;
.source "SourceFile"


# static fields
.field public static final w:Lkc3/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkc3/l;

    invoke-direct {v0}, Lbc3/z;-><init>()V

    sput-object v0, Lkc3/l;->w:Lkc3/l;

    return-void
.end method


# virtual methods
.method public final dispatch(Lq83/j;Ljava/lang/Runnable;)V
    .locals 2

    sget-object p1, Lkc3/e;->x:Lkc3/e;

    const/4 v0, 0x1

    iget-object p1, p1, Lkc3/h;->w:Lkc3/c;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lkc3/c;->h(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public final dispatchYield(Lq83/j;Ljava/lang/Runnable;)V
    .locals 1

    sget-object p1, Lkc3/e;->x:Lkc3/e;

    const/4 v0, 0x1

    iget-object p1, p1, Lkc3/h;->w:Lkc3/c;

    invoke-virtual {p1, p2, v0, v0}, Lkc3/c;->h(Ljava/lang/Runnable;ZZ)V

    return-void
.end method

.method public final limitedParallelism(ILjava/lang/String;)Lbc3/z;
    .locals 1

    invoke-static {p1}, Lhc3/b;->a(I)V

    sget v0, Lkc3/k;->d:I

    if-lt p1, v0, :cond_1

    if-eqz p2, :cond_0

    new-instance p1, Lhc3/r;

    invoke-direct {p1, p0, p2}, Lhc3/r;-><init>(Lbc3/z;Ljava/lang/String;)V

    return-object p1

    :cond_0
    return-object p0

    :cond_1
    invoke-super {p0, p1, p2}, Lbc3/z;->limitedParallelism(ILjava/lang/String;)Lbc3/z;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
