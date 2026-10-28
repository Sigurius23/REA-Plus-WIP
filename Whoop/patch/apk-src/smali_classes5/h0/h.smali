.class public final Lh0/h;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lkotlin/jvm/internal/d0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lh0/k;

.field public z:I


# direct methods
.method public constructor <init>(Lh0/k;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lh0/h;->y:Lh0/k;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lh0/h;->x:Ljava/lang/Object;

    iget p1, p0, Lh0/h;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/h;->z:I

    iget-object p1, p0, Lh0/h;->y:Lh0/k;

    const/4 v0, 0x0

    invoke-static {p1, v0, p0}, Lh0/k;->j1(Lh0/k;FLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
