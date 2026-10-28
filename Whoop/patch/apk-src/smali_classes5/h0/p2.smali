.class public final Lh0/p2;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lh0/c3;

.field public x:Lkotlin/jvm/internal/d0;

.field public synthetic y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Ls83/c;)V
    .locals 0

    invoke-direct {p0, p1}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lh0/p2;->y:Ljava/lang/Object;

    iget p1, p0, Lh0/p2;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lh0/p2;->z:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1, p0}, Landroidx/compose/foundation/gestures/b;->a(Lh0/c3;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
