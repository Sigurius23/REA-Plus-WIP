.class public final Lio/ktor/utils/io/b;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public E:Lio/ktor/utils/io/m;

.field public F:Lio/ktor/utils/io/internal/o;

.field public G:Lio/ktor/utils/io/internal/o;

.field public H:Ljava/nio/ByteBuffer;

.field public I:Lio/ktor/utils/io/m;

.field public J:J

.field public K:J

.field public L:Z

.field public synthetic M:Ljava/lang/Object;

.field public final synthetic N:Lio/ktor/utils/io/m;

.field public O:I

.field public w:Lio/ktor/utils/io/m;

.field public x:Lio/ktor/utils/io/m;

.field public y:Lkotlin/jvm/internal/f0;

.field public z:Lio/ktor/utils/io/m;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/b;->N:Lio/ktor/utils/io/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lio/ktor/utils/io/b;->M:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/b;->O:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/b;->O:I

    const/4 p1, 0x0

    const-wide/16 v0, 0x0

    iget-object v2, p0, Lio/ktor/utils/io/b;->N:Lio/ktor/utils/io/m;

    invoke-virtual {v2, p1, v0, v1, p0}, Lio/ktor/utils/io/m;->j(Lio/ktor/utils/io/m;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
