.class public final Ln6/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/i;


# instance fields
.field public a:Ln6/o;

.field public b:Ln6/r;

.field public c:Ljava/lang/Float;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ln6/m;->a:Ln6/m;

    iput-object v0, p0, Ln6/j;->a:Ln6/o;

    const/4 v0, 0x1

    iput v0, p0, Ln6/j;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ln6/i;
    .locals 2

    new-instance v0, Ln6/j;

    invoke-direct {v0}, Ln6/j;-><init>()V

    iget-object v1, p0, Ln6/j;->a:Ln6/o;

    iput-object v1, v0, Ln6/j;->a:Ln6/o;

    iget-object v1, p0, Ln6/j;->b:Ln6/r;

    iput-object v1, v0, Ln6/j;->b:Ln6/r;

    iget-object v1, p0, Ln6/j;->c:Ljava/lang/Float;

    iput-object v1, v0, Ln6/j;->c:Ljava/lang/Float;

    iget v1, p0, Ln6/j;->d:I

    iput v1, v0, Ln6/j;->d:I

    return-object v0
.end method

.method public final b(Ln6/o;)V
    .locals 0

    iput-object p1, p0, Ln6/j;->a:Ln6/o;

    return-void
.end method

.method public final c()Ln6/o;
    .locals 1

    iget-object v0, p0, Ln6/j;->a:Ln6/o;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EmittableImage(modifier="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ln6/j;->a:Ln6/o;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", provider="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln6/j;->b:Ln6/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", colorFilterParams=null, alpha="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ln6/j;->c:Ljava/lang/Float;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", contentScale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln6/j;->d:I

    invoke-static {v1}, Lv6/i;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
