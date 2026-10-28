.class public final Lpg3/l0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final c:Lpg3/n;

.field public final d:Z


# direct methods
.method public constructor <init>(Lpg3/n;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpg3/l0;->c:Lpg3/n;

    iput-boolean p2, p0, Lpg3/l0;->d:Z

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lpg3/l0;->c:Lpg3/n;

    invoke-interface {v0, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v0, 0x0

    iget-boolean v1, p0, Lpg3/l0;->d:Z

    invoke-virtual {p1, p2, v0, v1}, Lpg3/s0;->b(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
