.class public final Lof/a;
.super Lmf/l;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:J


# direct methods
.method public constructor <init>([B)V
    .locals 2

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lof/a;->a:[B

    array-length p1, p1

    int-to-long v0, p1

    iput-wide v0, p0, Lof/a;->b:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Long;
    .locals 2

    iget-wide v0, p0, Lof/a;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d()[B
    .locals 1

    iget-object v0, p0, Lof/a;->a:[B

    return-object v0
.end method
