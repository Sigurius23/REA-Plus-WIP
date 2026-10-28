.class public final Lpg3/e0;
.super Lpg3/e1;
.source "SourceFile"


# instance fields
.field public final c:Ljava/lang/String;

.field public final d:Lpg3/n;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpg3/n;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lpg3/e0;->c:Ljava/lang/String;

    iput-object p2, p0, Lpg3/e0;->d:Lpg3/n;

    iput-boolean p3, p0, Lpg3/e0;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lpg3/s0;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lpg3/e0;->d:Lpg3/n;

    invoke-interface {v0, p2}, Lpg3/n;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object p1, p1, Lpg3/s0;->j:Lg40/c1;

    iget-object v0, p0, Lpg3/e0;->c:Ljava/lang/String;

    iget-boolean v1, p0, Lpg3/e0;->e:Z

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0, p2}, Lg40/c1;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-virtual {p1, v0, p2}, Lg40/c1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
