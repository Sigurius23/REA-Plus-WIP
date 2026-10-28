.class public final Lec3/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public F:I

.field public w:Lec3/m;

.field public x:Ldc3/w;

.field public y:Ldc3/c;

.field public z:Z


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/q;->E:Ljava/lang/Object;

    iget p1, p0, Lec3/q;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/q;->F:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    invoke-static {p1, p1, v0, p0}, Lec3/v;->x(Lec3/m;Ldc3/w;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
