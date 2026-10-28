.class public final Lj53/l;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lj53/m;

.field public F:I

.field public w:Lj53/m;

.field public x:Lj53/k;

.field public y:Lmc3/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj53/m;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lj53/l;->E:Lj53/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj53/l;->z:Ljava/lang/Object;

    iget p1, p0, Lj53/l;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj53/l;->F:I

    iget-object p1, p0, Lj53/l;->E:Lj53/m;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lj53/m;->a(Lj53/m;Lj53/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
