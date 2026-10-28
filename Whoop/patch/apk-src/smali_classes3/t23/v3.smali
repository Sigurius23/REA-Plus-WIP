.class public final Lt23/v3;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lt23/b4;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lt23/b4;

.field public z:I


# direct methods
.method public constructor <init>(Lt23/b4;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lt23/v3;->y:Lt23/b4;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Lt23/v3;->x:Ljava/lang/Object;

    iget p1, p0, Lt23/v3;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lt23/v3;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v0, p0, Lt23/v3;->y:Lt23/b4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-virtual/range {v0 .. v5}, Lt23/b4;->u(Ljava/util/Map;Ljava/util/List;IZLs83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
