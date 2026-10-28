.class public final Lz6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/i;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lz6/f;

.field public c:I

.field public d:Ln6/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lz6/a;->a:Ljava/lang/String;

    const v0, 0x7fffffff

    iput v0, p0, Lz6/a;->c:I

    sget-object v0, Ln6/m;->a:Ln6/m;

    iput-object v0, p0, Lz6/a;->d:Ln6/o;

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 2

    new-instance v0, Lz6/a;

    invoke-direct {v0}, Lz6/a;-><init>()V

    iget-object v1, p0, Lz6/a;->d:Ln6/o;

    iput-object v1, v0, Lz6/a;->d:Ln6/o;

    iget-object v1, p0, Lz6/a;->a:Ljava/lang/String;

    iput-object v1, v0, Lz6/a;->a:Ljava/lang/String;

    iget-object v1, p0, Lz6/a;->b:Lz6/f;

    iput-object v1, v0, Lz6/a;->b:Lz6/f;

    iget v1, p0, Lz6/a;->c:I

    iput v1, v0, Lz6/a;->c:I

    return-object v0
.end method

.method public final b(Ln6/o;)V
    .locals 0

    iput-object p1, p0, Lz6/a;->d:Ln6/o;

    return-void
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Lz6/a;->d:Ln6/o;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmittableText("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lz6/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz6/a;->b:Lz6/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", modifier="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz6/a;->d:Ln6/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", maxLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lz6/a;->c:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
