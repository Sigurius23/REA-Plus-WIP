.class public final Lf0/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:J

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lf0/k;

.field public z:I


# direct methods
.method public constructor <init>(Lf0/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lf0/i;->y:Lf0/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lf0/i;->x:Ljava/lang/Object;

    iget p1, p0, Lf0/i;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lf0/i;->z:I

    const-wide/16 v0, 0x0

    const/4 p1, 0x0

    iget-object v2, p0, Lf0/i;->y:Lf0/k;

    invoke-virtual {v2, v0, v1, p1, p0}, Lf0/k;->b(JLc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
