.class public final Lo63/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lo63/b;->w:Ljava/lang/Object;

    iget p1, p0, Lo63/b;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lo63/b;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lts/o;->J(Lio/ktor/utils/io/q;Ls83/c;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
