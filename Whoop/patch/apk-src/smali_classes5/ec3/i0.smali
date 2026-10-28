.class public final Lec3/i0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lec3/j0;

.field public y:I


# direct methods
.method public constructor <init>(Lec3/j0;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lec3/i0;->x:Lec3/j0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lec3/i0;->w:Ljava/lang/Object;

    iget p1, p0, Lec3/i0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lec3/i0;->y:I

    iget-object p1, p0, Lec3/i0;->x:Lec3/j0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lec3/j0;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
