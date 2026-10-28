.class public Loh2/e$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loh2/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:S

.field private b:S

.field private c:S


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Loh2/e;
    .locals 4

    new-instance v0, Loh2/e;

    iget-short v1, p0, Loh2/e$a;->a:S

    iget-short v2, p0, Loh2/e$a;->b:S

    iget-short v3, p0, Loh2/e$a;->c:S

    invoke-direct {v0, v1, v2, v3}, Loh2/e;-><init>(SSS)V

    return-object v0
.end method

.method public b(S)Loh2/e$a;
    .locals 0

    iput-short p1, p0, Loh2/e$a;->a:S

    return-object p0
.end method

.method public c(S)Loh2/e$a;
    .locals 0

    iput-short p1, p0, Loh2/e$a;->b:S

    return-object p0
.end method

.method public d(S)Loh2/e$a;
    .locals 0

    iput-short p1, p0, Loh2/e$a;->c:S

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SigProcVersion.SigProcVersionBuilder(major="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short v1, p0, Loh2/e$a;->a:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Loh2/e$a;->b:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", patch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Loh2/e$a;->c:S

    const-string v2, ")"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
