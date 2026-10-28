.class public final Lb3/s2;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb3/s2;->w:Ljava/lang/Object;

    iget p1, p0, Lb3/s2;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb3/s2;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lb3/u2;->a(Ld1/k;Lb2/y;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
