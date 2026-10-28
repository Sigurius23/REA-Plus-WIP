.class public final Ld20/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ld20/c;

.field public G:I

.field public w:Ld20/c;

.field public x:Lq30/a0;

.field public y:Lyy/f;

.field public z:I


# direct methods
.method public constructor <init>(Ld20/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ld20/b;->F:Ld20/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ld20/b;->E:Ljava/lang/Object;

    iget p1, p0, Ld20/b;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ld20/b;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Ld20/b;->F:Ld20/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ld20/c;->b(Lq30/a0;Lyy/f;ILjava/lang/Throwable;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
