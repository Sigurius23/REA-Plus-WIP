.class public final Ly43/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Ly43/b;

.field public F:I

.field public w:Ly43/b;

.field public x:Ljava/lang/Object;

.field public y:Lmc3/c;

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ly43/b;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ly43/a;->E:Ly43/b;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ly43/a;->z:Ljava/lang/Object;

    iget p1, p0, Ly43/a;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ly43/a;->F:I

    iget-object p1, p0, Ly43/a;->E:Ly43/b;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ly43/b;->a(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
