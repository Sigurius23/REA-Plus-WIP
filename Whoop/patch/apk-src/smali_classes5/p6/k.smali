.class public final Lp6/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lp6/g;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lp6/l;

.field public z:I


# direct methods
.method public constructor <init>(Lp6/l;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lp6/k;->y:Lp6/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp6/k;->x:Ljava/lang/Object;

    iget p1, p0, Lp6/k;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp6/k;->z:I

    iget-object p1, p0, Lp6/k;->y:Lp6/l;

    invoke-virtual {p1, p0}, Lp6/l;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
