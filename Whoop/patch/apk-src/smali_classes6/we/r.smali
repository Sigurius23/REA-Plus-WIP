.class public final Lwe/r;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Laj/c;

.field public y:I


# direct methods
.method public constructor <init>(Laj/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwe/r;->x:Laj/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwe/r;->w:Ljava/lang/Object;

    iget p1, p0, Lwe/r;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwe/r;->y:I

    iget-object p1, p0, Lwe/r;->x:Laj/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Laj/c;->u(Lmf/l;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
