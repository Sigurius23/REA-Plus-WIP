.class public final Lio/ktor/utils/io/f;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lio/ktor/utils/io/m;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lio/ktor/utils/io/m;

.field public z:I


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/m;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lio/ktor/utils/io/f;->y:Lio/ktor/utils/io/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lio/ktor/utils/io/f;->x:Ljava/lang/Object;

    iget p1, p0, Lio/ktor/utils/io/f;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lio/ktor/utils/io/f;->z:I

    iget-object p1, p0, Lio/ktor/utils/io/f;->y:Lio/ktor/utils/io/m;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Lio/ktor/utils/io/m;->y(ILs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
