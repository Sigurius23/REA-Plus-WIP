.class final Lvk2/a$a;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk2/a;->b(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.trackactivity.service.LiveTrackSessionServiceConnector"
    f = "LiveTrackSessionServiceConnector.kt"
    l = {
        0x48
    }
    m = "attach"
    v = 0x2
.end annotation


# instance fields
.field E:Z

.field F:Z

.field G:J

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lvk2/a;

.field J:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvk2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk2/a;",
            "Lq83/d<",
            "-",
            "Lvk2/a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk2/a$a;->I:Lvk2/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lvk2/a$a;->H:Ljava/lang/Object;

    iget p1, p0, Lvk2/a$a;->J:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lvk2/a$a;->J:I

    iget-object v0, p0, Lvk2/a$a;->I:Lvk2/a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, p0

    invoke-virtual/range {v0 .. v9}, Lvk2/a;->b(Lec3/l;ZJLjava/lang/String;Ljava/util/List;ZLec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
