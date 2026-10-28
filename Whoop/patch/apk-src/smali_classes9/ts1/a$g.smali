.class final Lts1/a$g;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lts1/a;->d(JZLq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labrador.data.LabradorReadingResultDbManager"
    f = "LabradorReadingResultDbManager.kt"
    l = {
        0x72,
        0x73
    }
    m = "updateReadingUploadStatusByTrailingTimeStamp"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lts1/a;

.field F:I

.field w:J

.field x:J

.field y:Z

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lts1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lts1/a;",
            "Lq83/d<",
            "-",
            "Lts1/a$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lts1/a$g;->E:Lts1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lts1/a$g;->z:Ljava/lang/Object;

    iget p1, p0, Lts1/a$g;->F:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lts1/a$g;->F:I

    iget-object p1, p0, Lts1/a$g;->E:Lts1/a;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lts1/a;->d(JZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
