.class public final Loh2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u00020\u0001B\t\u0008\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010 R\u0018\u0010\u000c\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Loh2/a$b;",
        "",
        "<init>",
        "()V",
        "Loh2/c;",
        "hardwareVersion",
        "d",
        "(Loh2/c;)Loh2/a$b;",
        "Loh2/b;",
        "firmwareVersion",
        "c",
        "(Loh2/b;)Loh2/a$b;",
        "bluetoothVersion",
        "a",
        "Loh2/e;",
        "sigProcVersion",
        "e",
        "(Loh2/e;)Loh2/a$b;",
        "",
        "strapId",
        "f",
        "(Ljava/lang/String;)Loh2/a$b;",
        "",
        "versionId",
        "g",
        "(B)Loh2/a$b;",
        "Loh2/a;",
        "b",
        "()Loh2/a;",
        "toString",
        "()Ljava/lang/String;",
        "Loh2/c;",
        "Loh2/b;",
        "Loh2/e;",
        "Ljava/lang/String;",
        "B",
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
.field private a:Loh2/c;

.field private b:Loh2/b;

.field private c:Loh2/b;

.field private d:Loh2/e;

.field private e:Ljava/lang/String;

.field private f:B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    iput-byte v0, p0, Loh2/a$b;->f:B

    return-void
.end method


# virtual methods
.method public final a(Loh2/b;)Loh2/a$b;
    .locals 0

    iput-object p1, p0, Loh2/a$b;->c:Loh2/b;

    return-object p0
.end method

.method public final b()Loh2/a;
    .locals 7

    new-instance v0, Loh2/a;

    iget-object v1, p0, Loh2/a$b;->a:Loh2/c;

    iget-object v2, p0, Loh2/a$b;->b:Loh2/b;

    iget-object v3, p0, Loh2/a$b;->c:Loh2/b;

    iget-object v4, p0, Loh2/a$b;->d:Loh2/e;

    iget-object v5, p0, Loh2/a$b;->e:Ljava/lang/String;

    iget-byte v6, p0, Loh2/a$b;->f:B

    invoke-direct/range {v0 .. v6}, Loh2/a;-><init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;Ljava/lang/String;B)V

    return-object v0
.end method

.method public final c(Loh2/b;)Loh2/a$b;
    .locals 0

    iput-object p1, p0, Loh2/a$b;->b:Loh2/b;

    return-object p0
.end method

.method public final d(Loh2/c;)Loh2/a$b;
    .locals 0

    iput-object p1, p0, Loh2/a$b;->a:Loh2/c;

    return-object p0
.end method

.method public final e(Loh2/e;)Loh2/a$b;
    .locals 0

    iput-object p1, p0, Loh2/a$b;->d:Loh2/e;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Loh2/a$b;
    .locals 0

    iput-object p1, p0, Loh2/a$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final g(B)Loh2/a$b;
    .locals 0

    iput-byte p1, p0, Loh2/a$b;->f:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Loh2/a$b;->a:Loh2/c;

    iget-object v1, p0, Loh2/a$b;->b:Loh2/b;

    iget-object v2, p0, Loh2/a$b;->c:Loh2/b;

    iget-object v3, p0, Loh2/a$b;->d:Loh2/e;

    iget-object v4, p0, Loh2/a$b;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "DataAcquisitionInfo.DataAcquisitionInfoBuilder(hardwareVersion="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", firmwareVersion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bluetoothVersion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", sigProcVersion="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", strapId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v4, v0, v5}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
