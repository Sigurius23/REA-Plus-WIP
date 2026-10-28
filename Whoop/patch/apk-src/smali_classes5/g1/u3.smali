.class public final Lg1/u3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:J

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lg1/v3;

.field public z:I


# direct methods
.method public constructor <init>(Lg1/v3;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lg1/u3;->y:Lg1/v3;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lg1/u3;->x:Ljava/lang/Object;

    iget p1, p0, Lg1/u3;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg1/u3;->z:I

    iget-object p1, p0, Lg1/u3;->y:Lg1/v3;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, v0, v1, p0}, Lg1/v3;->p0(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
