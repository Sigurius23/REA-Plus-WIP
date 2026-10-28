.class public final Ln53/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ln53/e;

.field public y:I


# direct methods
.method public constructor <init>(Ln53/e;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Ln53/d;->x:Ln53/e;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Ln53/d;->w:Ljava/lang/Object;

    iget p1, p0, Ln53/d;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Ln53/d;->y:I

    iget-object p1, p0, Ln53/d;->x:Ln53/e;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Ln53/e;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
