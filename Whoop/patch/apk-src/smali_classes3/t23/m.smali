.class public final Lt23/m;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lt23/c0;

.field public x:Ln33/q;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lt23/c0;


# direct methods
.method public constructor <init>(Lt23/c0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/m;->z:Lt23/c0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt23/m;->y:Ljava/lang/Object;

    iget p1, p0, Lt23/m;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/m;->E:I

    iget-object p1, p0, Lt23/m;->z:Lt23/c0;

    invoke-virtual {p1, p0}, Lt23/c0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
