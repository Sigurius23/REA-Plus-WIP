.class public final Ln10/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lh20/u2;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ln10/r;

.field public H:I

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Landroid/os/Parcelable;

.field public z:Ln10/h;


# direct methods
.method public constructor <init>(Ln10/r;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln10/q;->G:Ln10/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ln10/q;->F:Ljava/lang/Object;

    iget p1, p0, Ln10/q;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln10/q;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Ln10/q;->G:Ln10/r;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ln10/r;->a(Lv00/a0;Ljava/lang/String;Ljava/lang/String;Ly00/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
