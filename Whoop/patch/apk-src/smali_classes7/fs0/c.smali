.class public final Lfs0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lfs0/c;",
        "",
        "<init>",
        "()V",
        "",
        "text",
        "Lds0/b$a;",
        "a",
        "(Ljava/lang/String;)Lds0/b$a;",
        "",
        "c",
        "()J",
        "Lds0/b$b;",
        "b",
        "()Lds0/b$b;",
        "J",
        "nextSubmission",
        "nextModalAction",
        "community-reactions-arch-mini_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:J

.field private b:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lds0/b$a;
    .locals 5

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lds0/b$a;

    iget-wide v1, p0, Lfs0/c;->a:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lfs0/c;->a:J

    invoke-direct {v0, v1, v2, p1}, Lds0/b$a;-><init>(JLjava/lang/String;)V

    return-object v0
.end method

.method public final b()Lds0/b$b;
    .locals 5

    new-instance v0, Lds0/b$b;

    iget-wide v1, p0, Lfs0/c;->b:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lfs0/c;->b:J

    invoke-direct {v0, v1, v2}, Lds0/b$b;-><init>(J)V

    return-object v0
.end method

.method public final c()J
    .locals 4

    iget-wide v0, p0, Lfs0/c;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lfs0/c;->a:J

    return-wide v0
.end method
