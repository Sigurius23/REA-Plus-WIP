.class public final Lfq/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lcom/google/android/gms/common/api/Status;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/a;->a:Ljava/lang/Object;

    iput-object p2, p0, Lfq/a;->b:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Lpg3/p;

    invoke-direct {v0, p0}, Lpg3/p;-><init>(Ljava/lang/Object;)V

    const-string v1, "status"

    iget-object v2, p0, Lfq/a;->b:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "result"

    iget-object v2, p0, Lfq/a;->a:Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Lpg3/p;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lpg3/p;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
