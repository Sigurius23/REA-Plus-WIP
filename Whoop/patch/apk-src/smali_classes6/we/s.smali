.class public final Lwe/s;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lvf/a;

.field public x:Lwe/g;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Laj/c;


# direct methods
.method public constructor <init>(Laj/c;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwe/s;->z:Laj/c;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lwe/s;->y:Ljava/lang/Object;

    iget p1, p0, Lwe/s;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwe/s;->E:I

    iget-object p1, p0, Lwe/s;->z:Laj/c;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Laj/c;->v(Lvf/a;Lwe/g;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
