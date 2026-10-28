.class public final Ln20/n;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ln20/p;

.field public G:I

.field public w:Ln20/p;

.field public x:Ljava/lang/Object;

.field public y:Ljo2/d;

.field public z:Ln20/m;


# direct methods
.method public constructor <init>(Ln20/p;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ln20/n;->F:Ln20/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ln20/n;->E:Ljava/lang/Object;

    iget p1, p0, Ln20/n;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln20/n;->G:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Ln20/n;->F:Ln20/p;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Ln20/p;->a(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
