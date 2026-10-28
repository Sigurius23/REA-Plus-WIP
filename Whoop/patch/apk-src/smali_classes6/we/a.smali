.class public final Lwe/a;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:I

.field public w:Lyf/k;

.field public x:J

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lt9/u;


# direct methods
.method public constructor <init>(Lt9/u;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lwe/a;->z:Lt9/u;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lwe/a;->y:Ljava/lang/Object;

    iget p1, p0, Lwe/a;->E:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lwe/a;->E:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    iget-object v2, p0, Lwe/a;->z:Lt9/u;

    invoke-virtual {v2, p1, v0, v1, p0}, Lt9/u;->b(Lyf/k;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
