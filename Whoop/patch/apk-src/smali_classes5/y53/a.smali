.class public final Ly53/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lz53/g;

.field public x:Le63/e;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly53/a;->y:Ljava/lang/Object;

    iget p1, p0, Ly53/a;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly53/a;->z:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lv63/h;->a(Lz53/g;Le63/e;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
