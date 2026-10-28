.class public final Lio/ktor/utils/io/i;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Lio/ktor/utils/io/m;

.field public G:I

.field public w:Lio/ktor/utils/io/m;

.field public x:[B

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/i;->F:Lio/ktor/utils/io/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lio/ktor/utils/io/i;->E:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/i;->G:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/i;->G:I

    const/4 p1, 0x0

    const/4 v0, 0x0

    iget-object v1, p0, Lio/ktor/utils/io/i;->F:Lio/ktor/utils/io/m;

    invoke-virtual {v1, p1, v0, v0, p0}, Lio/ktor/utils/io/m;->O([BIILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
