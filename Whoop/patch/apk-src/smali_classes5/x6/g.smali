.class public final Lx6/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lx6/l;

.field public F:I

.field public w:Ljava/lang/Object;

.field public x:Ls83/i;

.field public y:Lmc3/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx6/l;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lx6/g;->E:Lx6/l;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lx6/g;->z:Ljava/lang/Object;

    iget p1, p0, Lx6/g;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lx6/g;->F:I

    iget-object p1, p0, Lx6/g;->E:Lx6/l;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lx6/l;->b(Lx6/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
