.class public final Luf/b0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lkotlin/jvm/internal/g0;

.field public F:Lkotlin/jvm/internal/g0;

.field public synthetic G:Ljava/lang/Object;

.field public H:I

.field public w:Luf/u;

.field public x:Lyf/e;

.field public y:Lcf/e;

.field public z:Log/g;


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Luf/b0;->G:Ljava/lang/Object;

    iget p1, p0, Luf/b0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Luf/b0;->H:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Luf/c0;->z(Luf/u;Lyf/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
