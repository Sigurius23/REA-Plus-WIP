.class public final Lb63/d;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Ljava/util/Iterator;

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lb63/f;

.field public H:I

.field public w:Le63/d;

.field public x:Ljava/lang/Object;

.field public y:Li63/d;

.field public z:Ljava/util/List;


# direct methods
.method public constructor <init>(Lb63/f;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lb63/d;->G:Lb63/f;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lb63/d;->F:Ljava/lang/Object;

    iget p1, p0, Lb63/d;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lb63/d;->H:I

    iget-object p1, p0, Lb63/d;->G:Lb63/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lb63/f;->a(Le63/d;Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
