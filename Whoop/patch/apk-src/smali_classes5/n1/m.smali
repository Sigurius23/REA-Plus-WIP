.class public final Ln1/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:F

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ln1/n;

.field public z:I


# direct methods
.method public constructor <init>(Ln1/n;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln1/m;->y:Ln1/n;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln1/m;->x:Ljava/lang/Object;

    iget p1, p0, Ln1/m;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln1/m;->z:I

    iget-object p1, p0, Ln1/m;->y:Ln1/n;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ln1/n;->e1(FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
