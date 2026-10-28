.class public final Lt23/y3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public final synthetic E:Lt23/b4;

.field public F:I

.field public w:Lt23/b4;

.field public x:Ln23/h;

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt23/b4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/y3;->E:Lt23/b4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt23/y3;->z:Ljava/lang/Object;

    iget p1, p0, Lt23/y3;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/y3;->F:I

    iget-object p1, p0, Lt23/y3;->E:Lt23/b4;

    invoke-virtual {p1, p0}, Lt23/b4;->w(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
