.class public final Lyy/z;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lwy/a;

.field public x:Lyy/g;

.field public y:Lwy/b;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lyy/z;->z:Ljava/lang/Object;

    iget p1, p0, Lyy/z;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lyy/z;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p1, p0}, Lyy/q;->f(Lab/i0;Lwy/a;Lyy/g;Lwy/b;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
