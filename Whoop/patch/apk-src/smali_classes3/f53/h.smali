.class public final Lf53/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lf53/j;

.field public x:Ln23/c;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lf53/j;


# direct methods
.method public constructor <init>(Lf53/j;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lf53/h;->z:Lf53/j;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lf53/h;->y:Ljava/lang/Object;

    iget p1, p0, Lf53/h;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf53/h;->E:I

    iget-object p1, p0, Lf53/h;->z:Lf53/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lf53/j;->h(Ln23/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
