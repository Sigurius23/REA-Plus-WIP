.class public final Lz53/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lz53/g;

.field public G:I

.field public w:Lz53/g;

.field public x:Lq83/j;

.field public y:Le63/e;

.field public z:Lq63/b;


# direct methods
.method public constructor <init>(Lz53/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lz53/e;->F:Lz53/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lz53/e;->E:Ljava/lang/Object;

    iget p1, p0, Lz53/e;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lz53/e;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lz53/e;->F:Lz53/g;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lz53/g;->h(Lud3/l0;Lud3/o0;Lq83/j;Le63/e;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
