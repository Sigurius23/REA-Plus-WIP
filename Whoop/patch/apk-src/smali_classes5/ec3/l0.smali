.class public final Lec3/l0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/l0;->x:Ljava/lang/Object;

    iget p1, p0, Lec3/l0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/l0;->y:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p1, p0}, Lec3/v;->d(Lec3/m;Ljava/lang/Object;Ljava/lang/Object;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
