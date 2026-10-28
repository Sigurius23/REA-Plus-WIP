.class public final Lx03/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lx03/i;

.field public x:Lkotlin/jvm/internal/d0;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lx03/i;


# direct methods
.method public constructor <init>(Lx03/i;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lx03/h;->z:Lx03/i;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lx03/h;->y:Ljava/lang/Object;

    iget p1, p0, Lx03/h;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx03/h;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lx03/h;->z:Lx03/i;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lx03/i;->f(Lh0/k2;Lx03/c;IFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
