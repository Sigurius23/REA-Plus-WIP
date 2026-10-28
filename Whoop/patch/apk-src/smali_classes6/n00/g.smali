.class public final Ln00/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ln00/k;

.field public F:I

.field public w:Ln00/k;

.field public x:Lwz/m1;

.field public y:Z

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln00/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln00/g;->E:Ln00/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln00/g;->z:Ljava/lang/Object;

    iget p1, p0, Ln00/g;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln00/g;->F:I

    iget-object p1, p0, Ln00/g;->E:Ln00/k;

    invoke-static {p1, p0}, Ln00/k;->j(Ln00/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
