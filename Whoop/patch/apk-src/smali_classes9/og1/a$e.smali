.class final Log1/a$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Log1/a;->o(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.data.repo.FirmwareRepoImpl"
    f = "FirmwareRepoImpl.kt"
    l = {
        0x25,
        0x28,
        0x2b,
        0x2c,
        0x2d
    }
    m = "downloadFwUpdate"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:I

.field H:Z

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Log1/a;

.field K:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Log1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Log1/a;",
            "Lq83/d<",
            "-",
            "Log1/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Log1/a$e;->J:Log1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iput-object p1, p0, Log1/a$e;->I:Ljava/lang/Object;

    iget p1, p0, Log1/a$e;->K:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Log1/a$e;->K:I

    iget-object v0, p0, Log1/a$e;->J:Log1/a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Log1/a;->m(Log1/a;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ltg1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
