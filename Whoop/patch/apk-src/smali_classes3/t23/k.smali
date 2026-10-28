.class public final Lt23/k;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Z

.field public synthetic F:Ljava/lang/Object;

.field public final synthetic G:Lt23/c0;

.field public H:I

.field public w:Lt23/c0;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Boolean;

.field public z:Lx23/a;


# direct methods
.method public constructor <init>(Lt23/c0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/k;->G:Lt23/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lt23/k;->F:Ljava/lang/Object;

    iget p1, p0, Lt23/k;->H:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/k;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lt23/k;->G:Lt23/c0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lt23/c0;->a(ZLt23/m1;Ljava/lang/Boolean;Lx23/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
