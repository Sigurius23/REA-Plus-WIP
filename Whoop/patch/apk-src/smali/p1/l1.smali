.class public final Lp1/l1;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lkotlin/jvm/functions/Function1;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lb3/d1;

.field public z:I


# direct methods
.method public constructor <init>(Lb3/d1;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lp1/l1;->y:Lb3/d1;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lp1/l1;->x:Ljava/lang/Object;

    iget p1, p0, Lp1/l1;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lp1/l1;->z:I

    iget-object p1, p0, Lp1/l1;->y:Lb3/d1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lb3/d1;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
