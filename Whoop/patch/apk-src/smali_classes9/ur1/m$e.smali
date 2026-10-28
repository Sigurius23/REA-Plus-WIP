.class final Lur1/m$e;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/m;->v(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lyr1/b;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.journal.interactors.v2.JournalFetchInteractor"
    f = "JournalFetchInteractor.kt"
    l = {
        0xce,
        0xcf,
        0xd1,
        0xdb
    }
    m = "handleFetch"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:J

.field K:Z

.field L:Z

.field M:I

.field synthetic N:Ljava/lang/Object;

.field final synthetic O:Lur1/m;

.field P:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lur1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur1/m;",
            "Lq83/d<",
            "-",
            "Lur1/m$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/m$e;->O:Lur1/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iput-object p1, p0, Lur1/m$e;->N:Ljava/lang/Object;

    iget p1, p0, Lur1/m$e;->P:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lur1/m$e;->P:I

    iget-object v0, p0, Lur1/m$e;->O:Lur1/m;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-static/range {v0 .. v8}, Lur1/m;->j(Lur1/m;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Lyr1/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
