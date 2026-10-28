.class public final Ldy/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Ldy/j;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ldy/j;

.field public z:I


# direct methods
.method public constructor <init>(Ldy/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ldy/i;->y:Ldy/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ldy/i;->x:Ljava/lang/Object;

    iget p1, p0, Ldy/i;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldy/i;->z:I

    iget-object p1, p0, Ldy/i;->y:Ldy/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ldy/j;->g(Landroidx/fragment/app/r0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
