.class public final Lh53/g;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lqg3/d;

.field public y:I


# direct methods
.method public constructor <init>(Lqg3/d;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh53/g;->x:Lqg3/d;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh53/g;->w:Ljava/lang/Object;

    iget p1, p0, Lh53/g;->y:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh53/g;->y:I

    iget-object p1, p0, Lh53/g;->x:Lqg3/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lqg3/d;->y(Lh53/d;Ls83/c;)V

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
