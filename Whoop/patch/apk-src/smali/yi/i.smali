.class public final Lyi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lxi/f;

.field public final c:Lxi/f;

.field public final d:Lxi/b;

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lxi/f;Lxi/a;Lxi/b;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyi/i;->a:Ljava/lang/String;

    iput-object p2, p0, Lyi/i;->b:Lxi/f;

    iput-object p3, p0, Lyi/i;->c:Lxi/f;

    iput-object p4, p0, Lyi/i;->d:Lxi/b;

    iput-boolean p5, p0, Lyi/i;->e:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    new-instance p2, Lsi/o;

    invoke-direct {p2, p1, p3, p0}, Lsi/o;-><init>(Lqi/w;Lzi/b;Lyi/i;)V

    return-object p2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RectangleShape{position="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lyi/i;->b:Lxi/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lyi/i;->c:Lxi/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
