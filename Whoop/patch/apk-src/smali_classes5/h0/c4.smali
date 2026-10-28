.class public final Lh0/c4;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lh0/d4;

.field public F:I

.field public w:Ll83/e;

.field public x:Lc93/a;

.field public y:F

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lh0/d4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh0/c4;->E:Lh0/d4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/c4;->z:Ljava/lang/Object;

    iget p1, p0, Lh0/c4;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/c4;->F:I

    iget-object p1, p0, Lh0/c4;->E:Lh0/d4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lh0/d4;->a(Lep1/g;Ld30/r;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
