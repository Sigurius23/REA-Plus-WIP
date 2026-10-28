.class public final Lh0/v3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lu2/b;

.field public x:Le10/k0;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/v3;->y:Ljava/lang/Object;

    iget p1, p0, Lh0/v3;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/v3;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Landroidx/compose/foundation/gestures/c;->c(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
