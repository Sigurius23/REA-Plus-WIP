.class public final Lh0/w0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lu2/b;

.field public x:Lkotlin/jvm/functions/Function1;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lh0/w0;->y:Ljava/lang/Object;

    iget p1, p0, Lh0/w0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/w0;->z:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p1, p0}, Lh0/z0;->j(Lu2/b;JLkotlin/jvm/functions/Function1;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
