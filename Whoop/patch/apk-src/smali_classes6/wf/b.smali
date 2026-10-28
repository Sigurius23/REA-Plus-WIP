.class public final Lwf/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lwf/a;

.field public x:Lyf/k;

.field public y:Lwf/a;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwf/b;->z:Ljava/lang/Object;

    iget p1, p0, Lwf/b;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwf/b;->E:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Ls30/b;->f(Lwf/a;ZLs83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
