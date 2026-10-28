.class public final Ldc3/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ldc3/h;

.field public y:I


# direct methods
.method public constructor <init>(Ldc3/h;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Ldc3/g;->x:Ldc3/h;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Ldc3/g;->w:Ljava/lang/Object;

    iget p1, p0, Ldc3/g;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ldc3/g;->y:I

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    iget-object v0, p0, Ldc3/g;->x:Ldc3/h;

    const/4 v1, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Ldc3/h;->D(Ldc3/p;IJLs83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ldc3/o;

    invoke-direct {v0, p1}, Ldc3/o;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
