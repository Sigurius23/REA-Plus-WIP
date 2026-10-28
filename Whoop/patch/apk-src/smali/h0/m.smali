.class public final Lh0/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lh0/p;

.field public y:I


# direct methods
.method public constructor <init>(Lh0/p;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lh0/m;->x:Lh0/p;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/m;->w:Ljava/lang/Object;

    iget p1, p0, Lh0/m;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/m;->y:I

    iget-object p1, p0, Lh0/m;->x:Lh0/p;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, v0, p0}, Lh0/p;->a(Ljava/lang/Object;Lf0/z0;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
