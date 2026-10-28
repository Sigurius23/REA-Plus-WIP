.class public final Li0/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:F

.field public x:Ld0/m;

.field public y:Lkotlin/jvm/internal/d0;

.field public synthetic z:Ljava/lang/Object;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Li0/i;->z:Ljava/lang/Object;

    iget p1, p0, Li0/i;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Li0/i;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Li0/k;->a(Lh0/k2;FLd0/m;Ld0/x;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
