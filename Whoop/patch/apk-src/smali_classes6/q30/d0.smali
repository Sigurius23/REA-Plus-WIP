.class public final Lq30/d0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lq30/n;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lev/i;

.field public H:I

.field public w:Lev/i;

.field public x:Lq30/i0;

.field public y:Lev/i;

.field public z:Lq30/v0;


# direct methods
.method public constructor <init>(Lev/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lq30/d0;->G:Lev/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lq30/d0;->F:Ljava/lang/Object;

    iget p1, p0, Lq30/d0;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lq30/d0;->H:I

    iget-object p1, p0, Lq30/d0;->G:Lev/i;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lev/i;->m(Lq30/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
