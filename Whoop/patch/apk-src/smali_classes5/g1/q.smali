.class public final Lg1/q;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Ljava/lang/Object;

.field public x:Lbc3/k1;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lg1/r;


# direct methods
.method public constructor <init>(Lg1/r;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lg1/q;->z:Lg1/r;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lg1/q;->y:Ljava/lang/Object;

    iget p1, p0, Lg1/q;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lg1/q;->E:I

    iget-object p1, p0, Lg1/q;->z:Lg1/r;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lg1/r;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
