.class public final Lpg/a;
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
    .locals 1

    invoke-virtual {p0, p1}, La2/a;->j(Log/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lb30/m;

    invoke-direct {v0, p0, p1}, Lb30/m;-><init>(Lpg/a;Log/b;)V

    return-object v0

    :cond_0
    sget-object p1, Lpg/b;->a:Log/c;

    return-object p1
.end method
