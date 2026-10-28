.class public final Lpg3/z;
.super Lud3/a1;
.source "SourceFile"


# instance fields
.field public E:Ljava/io/IOException;

.field public final y:Lud3/a1;

.field public final z:Lne3/j0;


# direct methods
.method public constructor <init>(Lud3/a1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/z;->y:Lud3/a1;

    new-instance v0, Ldh/b;

    invoke-virtual {p1}, Lud3/a1;->d1()Lne3/j;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Ldh/b;-><init>(Lpg3/z;Lne3/j;)V

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object p1

    iput-object p1, p0, Lpg3/z;->z:Lne3/j0;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-object v0, p0, Lpg3/z;->y:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->close()V

    return-void
.end method

.method public final d1()Lne3/j;
    .locals 1

    iget-object v0, p0, Lpg3/z;->z:Lne3/j0;

    return-object v0
.end method

.method public final i()J
    .locals 2

    iget-object v0, p0, Lpg3/z;->y:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->i()J

    move-result-wide v0

    return-wide v0
.end method

.method public final k()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lpg3/z;->y:Lud3/a1;

    invoke-virtual {v0}, Lud3/a1;->k()Lud3/h0;

    move-result-object v0

    return-object v0
.end method
