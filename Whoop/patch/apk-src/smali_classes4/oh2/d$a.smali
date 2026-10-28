.class public Loh2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Loh2/c;

.field private b:Loh2/b;

.field private c:Loh2/b;

.field private d:Loh2/e;

.field private e:B

.field private f:B

.field private g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(B)Loh2/d$a;
    .locals 0

    iput-byte p1, p0, Loh2/d$a;->f:B

    return-object p0
.end method

.method public b(B)Loh2/d$a;
    .locals 0

    iput-byte p1, p0, Loh2/d$a;->e:B

    return-object p0
.end method

.method public c()Loh2/d;
    .locals 9

    new-instance v0, Loh2/d;

    iget-object v1, p0, Loh2/d$a;->a:Loh2/c;

    iget-object v2, p0, Loh2/d$a;->b:Loh2/b;

    iget-object v3, p0, Loh2/d$a;->c:Loh2/b;

    iget-object v4, p0, Loh2/d$a;->d:Loh2/e;

    iget-byte v5, p0, Loh2/d$a;->e:B

    iget-byte v6, p0, Loh2/d$a;->f:B

    iget-object v7, p0, Loh2/d$a;->g:Ljava/lang/String;

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Loh2/d;-><init>(Loh2/c;Loh2/b;Loh2/b;Loh2/e;BBLjava/lang/String;I)V

    return-object v0
.end method

.method public d(Loh2/b;)Loh2/d$a;
    .locals 0

    iput-object p1, p0, Loh2/d$a;->b:Loh2/b;

    return-object p0
.end method

.method public e(Loh2/c;)Loh2/d$a;
    .locals 0

    iput-object p1, p0, Loh2/d$a;->a:Loh2/c;

    return-object p0
.end method

.method public f(Loh2/e;)Loh2/d$a;
    .locals 0

    iput-object p1, p0, Loh2/d$a;->d:Loh2/e;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Loh2/d$a;
    .locals 0

    iput-object p1, p0, Loh2/d$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HistoryHeartDataVersion.HistoryHeartDataVersionBuilder(hardwareVersion="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Loh2/d$a;->a:Loh2/c;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", firmwareVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loh2/d$a;->b:Loh2/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bluetoothVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loh2/d$a;->c:Loh2/b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sigProcVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loh2/d$a;->d:Loh2/e;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", binaryVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Loh2/d$a;->e:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", binaryFlags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Loh2/d$a;->f:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", strapId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Loh2/d$a;->g:Ljava/lang/String;

    const-string v2, ")"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
