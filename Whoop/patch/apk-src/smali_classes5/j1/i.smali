.class public final Lj1/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lj1/j;

.field public y:I


# direct methods
.method public constructor <init>(Lj1/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lj1/i;->x:Lj1/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lj1/i;->w:Ljava/lang/Object;

    iget p1, p0, Lj1/i;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj1/i;->y:I

    iget-object p1, p0, Lj1/i;->x:Lj1/j;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lj1/j;->p0(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
