.class public final Lio/ktor/utils/io/r;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:J

.field public F:I

.field public G:I

.field public synthetic H:Ljava/lang/Object;

.field public I:I

.field public w:Lio/ktor/utils/io/q;

.field public x:Lio/ktor/utils/io/s;

.field public y:Lw63/a;

.field public z:J


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/r;->H:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/r;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/r;->I:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, p1, v0, v1, p0}, Lse/a;->x(Lio/ktor/utils/io/q;Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
