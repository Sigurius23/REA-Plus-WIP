.class public final Lp00/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lp00/o;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lp00/o;

.field public z:I


# direct methods
.method public constructor <init>(Lp00/o;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp00/m;->y:Lp00/o;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp00/m;->x:Ljava/lang/Object;

    iget p1, p0, Lp00/m;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp00/m;->z:I

    iget-object p1, p0, Lp00/m;->y:Lp00/o;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lp00/o;->n(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
