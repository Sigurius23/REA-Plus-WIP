.class public final Loh2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\t\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u0007J\r\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0012R\u0016\u0010\u0008\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Loh2/c$a;",
        "",
        "<init>",
        "()V",
        "",
        "hardwareFamily",
        "b",
        "(J)Loh2/c$a;",
        "pcbaRevision",
        "d",
        "opticalRevision",
        "c",
        "Loh2/c;",
        "a",
        "()Loh2/c;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "J",
        "strap-metadata_release"
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

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Loh2/c;
    .locals 7

    new-instance v0, Loh2/c;

    iget-wide v1, p0, Loh2/c$a;->a:J

    iget-wide v3, p0, Loh2/c$a;->b:J

    iget-wide v5, p0, Loh2/c$a;->c:J

    invoke-direct/range {v0 .. v6}, Loh2/c;-><init>(JJJ)V

    return-object v0
.end method

.method public final b(J)Loh2/c$a;
    .locals 0

    iput-wide p1, p0, Loh2/c$a;->a:J

    return-object p0
.end method

.method public final c(J)Loh2/c$a;
    .locals 0

    iput-wide p1, p0, Loh2/c$a;->c:J

    return-object p0
.end method

.method public final d(J)Loh2/c$a;
    .locals 0

    iput-wide p1, p0, Loh2/c$a;->b:J

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-wide v0, p0, Loh2/c$a;->a:J

    iget-wide v2, p0, Loh2/c$a;->b:J

    iget-wide v4, p0, Loh2/c$a;->c:J

    const-string v6, "HardwareVersion.HardwareVersionBuilder(hardwareFamily="

    const-string v7, ", pcbaRevision="

    invoke-static {v0, v1, v6, v7}, Lyb0/f;->b(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", opticalRevision="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
