.class final Lku1/a$c;
.super Ls83/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lku1/a;->d(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.labradorService.uploader.LabradorPacketsUploadManager"
    f = "LabradorPacketsUploadManager.kt"
    l = {
        0x7a,
        0x30,
        0x35,
        0x38,
        0x44,
        0x46
    }
    m = "uploadPackets"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field H:I

.field I:I

.field J:Z

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lku1/a;

.field M:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lku1/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku1/a;",
            "Lq83/d<",
            "-",
            "Lku1/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lku1/a$c;->L:Lku1/a;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lku1/a$c;->K:Ljava/lang/Object;

    iget p1, p0, Lku1/a$c;->M:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lku1/a$c;->M:I

    iget-object p1, p0, Lku1/a$c;->L:Lku1/a;

    invoke-virtual {p1, p0}, Lku1/a;->d(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
