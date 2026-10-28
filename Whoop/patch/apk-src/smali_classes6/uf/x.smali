.class public final Luf/x;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ldg/a;

.field public x:Ljava/util/Iterator;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luf/x;->z:Ljava/lang/Object;

    iget p1, p0, Luf/x;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luf/x;->E:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ls/s;->e(Ldg/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
