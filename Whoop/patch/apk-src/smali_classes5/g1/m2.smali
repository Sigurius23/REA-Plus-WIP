.class public final Lg1/m2;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:J

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lg1/o2;

.field public z:I


# direct methods
.method public constructor <init>(Lg1/o2;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg1/m2;->y:Lg1/o2;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lg1/m2;->x:Ljava/lang/Object;

    iget p1, p0, Lg1/m2;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg1/m2;->z:I

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    iget-object v0, p0, Lg1/m2;->y:Lg1/o2;

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lg1/o2;->V(JJLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
