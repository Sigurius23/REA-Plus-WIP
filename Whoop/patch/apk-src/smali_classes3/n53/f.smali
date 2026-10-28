.class public final Ln53/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public F:J

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lz7/a;

.field public I:I

.field public w:Lz7/a;

.field public x:F

.field public y:F

.field public z:I


# direct methods
.method public constructor <init>(Lz7/a;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln53/f;->H:Lz7/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln53/f;->G:Ljava/lang/Object;

    iget p1, p0, Ln53/f;->I:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln53/f;->I:I

    iget-object p1, p0, Ln53/f;->H:Lz7/a;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lz7/a;->a(Lz7/a;FFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
