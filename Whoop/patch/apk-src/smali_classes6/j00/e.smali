.class public final Lj00/e;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lj00/h;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lj00/h;

.field public z:I


# direct methods
.method public constructor <init>(Lj00/h;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lj00/e;->y:Lj00/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj00/e;->x:Ljava/lang/Object;

    iget p1, p0, Lj00/e;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj00/e;->z:I

    iget-object p1, p0, Lj00/e;->y:Lj00/h;

    invoke-static {p1, p0}, Lj00/h;->j(Lj00/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
