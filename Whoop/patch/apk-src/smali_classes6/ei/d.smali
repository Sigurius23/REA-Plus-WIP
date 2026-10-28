.class public final Lei/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lei/d;->w:Ljava/lang/Object;

    iget p1, p0, Lei/d;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lei/d;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lv8/b;->h(Lbi/r;Ls83/c;)Lud3/o0;

    move-result-object p1

    return-object p1
.end method
