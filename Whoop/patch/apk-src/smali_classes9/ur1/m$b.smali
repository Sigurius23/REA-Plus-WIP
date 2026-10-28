.class final Lur1/m$b;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lur1/m;->t(Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;
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
        0x197
    }
    m = "getTalkTextWidget"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lur1/m;

.field F:I

.field w:Ljava/lang/Object;

.field x:Z

.field y:Z

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lur1/m;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lur1/m;",
            "Lq83/d<",
            "-",
            "Lur1/m$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lur1/m$b;->E:Lur1/m;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lur1/m$b;->z:Ljava/lang/Object;

    iget p1, p0, Lur1/m$b;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lur1/m$b;->F:I

    iget-object p1, p0, Lur1/m$b;->E:Lur1/m;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v1, p0}, Lur1/m;->i(Lur1/m;Ljava/lang/String;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
