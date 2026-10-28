.class public final Lx6/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public F:I

.field public w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public x:Lvd1/c;

.field public y:Ldc3/w;

.field public z:Ldc3/c;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/a;->E:Ljava/lang/Object;

    iget p1, p0, Lx6/a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/a;->F:I

    invoke-static {p0}, Ls4/d;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
