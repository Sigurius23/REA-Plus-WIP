.class public final Lyi/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyi/b;


# instance fields
.field public final a:I

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lyi/g;->a:I

    iput-boolean p3, p0, Lyi/g;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Lqi/w;Lqi/i;Lzi/b;)Lsi/c;
    .locals 0

    iget-object p1, p1, Lqi/w;->L:Lad3/z;

    iget-object p1, p1, Lad3/z;->x:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashSet;

    sget-object p2, Lqi/x;->w:Lqi/x;

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Animation contains merge paths but they are disabled."

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Lsi/l;

    invoke-direct {p1, p0}, Lsi/l;-><init>(Lyi/g;)V

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MergePaths{mode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lyi/g;->a:I

    invoke-static {v1}, Ly00/t7;->A(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
