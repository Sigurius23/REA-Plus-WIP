.class public final Lh3/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lh3/c;

.field public G:I

.field public w:Ljava/lang/Object;

.field public x:Ly3/k;

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lh3/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh3/a;->F:Lh3/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh3/a;->E:Ljava/lang/Object;

    iget p1, p0, Lh3/a;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh3/a;->G:I

    iget-object p1, p0, Lh3/a;->F:Lh3/c;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lh3/c;->a(Lh3/c;Landroid/view/ScrollCaptureSession;Ly3/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
