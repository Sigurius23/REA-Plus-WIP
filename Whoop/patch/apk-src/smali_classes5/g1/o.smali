.class public final Lg1/o;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public x:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg1/o;->w:Ljava/lang/Object;

    iget p1, p0, Lg1/o;->x:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg1/o;->x:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lcom/squareup/wire/n;->j(Lc93/a;Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
