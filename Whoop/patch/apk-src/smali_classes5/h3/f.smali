.class public final Lh3/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lh3/g;

.field public y:I


# direct methods
.method public constructor <init>(Lh3/g;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh3/f;->x:Lh3/g;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh3/f;->w:Ljava/lang/Object;

    iget p1, p0, Lh3/f;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh3/f;->y:I

    iget-object p1, p0, Lh3/f;->x:Lh3/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lh3/g;->b(FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
