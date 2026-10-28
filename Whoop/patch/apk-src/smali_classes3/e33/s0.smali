.class public final Le33/s0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Le33/v0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Le33/v0;

.field public z:I


# direct methods
.method public constructor <init>(Le33/v0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Le33/s0;->y:Le33/v0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Le33/s0;->x:Ljava/lang/Object;

    iget p1, p0, Le33/s0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Le33/s0;->z:I

    iget-object p1, p0, Le33/s0;->y:Le33/v0;

    invoke-virtual {p1, p0}, Le33/v0;->p(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
