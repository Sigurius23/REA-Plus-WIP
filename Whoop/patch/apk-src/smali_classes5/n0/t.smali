.class public final Ln0/t;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lf0/z0;

.field public x:Ls83/i;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ln0/u;


# direct methods
.method public constructor <init>(Ln0/u;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ln0/t;->z:Ln0/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln0/t;->y:Ljava/lang/Object;

    iget p1, p0, Ln0/t;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln0/t;->E:I

    iget-object p1, p0, Ln0/t;->z:Ln0/u;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Ln0/u;->a(Lf0/z0;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
