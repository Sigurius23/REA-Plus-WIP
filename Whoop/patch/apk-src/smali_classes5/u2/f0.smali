.class public final Lu2/f0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lu2/g0;

.field public y:I


# direct methods
.method public constructor <init>(Lu2/g0;Ls83/a;)V
    .locals 0

    iput-object p1, p0, Lu2/f0;->x:Lu2/g0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lu2/f0;->w:Ljava/lang/Object;

    iget p1, p0, Lu2/f0;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu2/f0;->y:I

    const-wide/16 v0, 0x0

    const/4 p1, 0x0

    iget-object v2, p0, Lu2/f0;->x:Lu2/g0;

    invoke-virtual {v2, v0, v1, p1, p0}, Lu2/g0;->o(JLh0/g3;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
